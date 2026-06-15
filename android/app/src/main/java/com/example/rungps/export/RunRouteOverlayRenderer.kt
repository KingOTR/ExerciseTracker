package com.example.rungps.export

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ImageDecoder
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.graphics.Shader
import android.net.Uri
import java.io.ByteArrayOutputStream
import java.io.InputStream
import java.util.Locale
import kotlin.math.max
import kotlin.math.min
import kotlin.math.roundToInt

object RunRouteOverlayRenderer {
    private const val MAX_DECODE_SIDE = 16384
    private val routeColor = Color.parseColor("#00E676")
    private val routeOutline = Color.argb(200, 0, 0, 0)
    private val barFill = Color.argb(210, 18, 22, 28)

    data class RunStats(
        val distanceKm: Double,
        val durationMs: Long,
    ) {
        val paceSecPerKm: Double?
            get() = if (distanceKm >= 0.01) (durationMs / 1000.0) / distanceKm else null
    }

    fun decodeSampledBitmap(context: Context, uri: Uri, maxSide: Int = MAX_DECODE_SIDE): Bitmap? {
        return runCatching {
            val source = ImageDecoder.createSource(context.contentResolver, uri)
            val decoded = ImageDecoder.decodeBitmap(source) { decoder, info, _ ->
                decoder.allocator = ImageDecoder.ALLOCATOR_SOFTWARE
                val w = info.size.width
                val h = info.size.height
                val maxDim = max(w, h)
                if (maxDim > maxSide) {
                    val scale = maxSide.toFloat() / maxDim
                    decoder.setTargetSize(
                        max(1, (w * scale).roundToInt()),
                        max(1, (h * scale).roundToInt()),
                    )
                }
                info.colorSpace?.let { decoder.setTargetColorSpace(it) }
            }
            ensureMutableArgb8888(decoded)
        }.getOrNull() ?: decodeLegacyBitmap(context, uri, maxSide)
    }

    private fun ensureMutableArgb8888(bitmap: Bitmap): Bitmap {
        if (bitmap.isMutable && bitmap.config == Bitmap.Config.ARGB_8888) return bitmap
        val copy = bitmap.copy(Bitmap.Config.ARGB_8888, true) ?: return bitmap
        if (copy !== bitmap) bitmap.recycle()
        return copy
    }

    private fun decodeLegacyBitmap(context: Context, uri: Uri, maxSide: Int): Bitmap? {
        val bytes = context.contentResolver.openInputStream(uri)?.use { it.readBytes() } ?: return null
        if (bytes.isEmpty()) return null
        val bounds = BitmapFactory.Options().apply { inJustDecodeBounds = true }
        BitmapFactory.decodeByteArray(bytes, 0, bytes.size, bounds)
        if (bounds.outWidth <= 0 || bounds.outHeight <= 0) return null
        var sample = 1
        while (max(bounds.outWidth, bounds.outHeight) / sample > maxSide) sample *= 2
        val opts = BitmapFactory.Options().apply {
            inSampleSize = sample
            inPreferredConfig = Bitmap.Config.ARGB_8888
            inScaled = false
            inPremultiplied = false
        }
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.size, opts)?.let { ensureMutableArgb8888(it) }
    }

    fun renderDarkBase(width: Int = 1080, height: Int = 1920): Bitmap {
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.shader = LinearGradient(
            0f, 0f, 0f, height.toFloat(),
            intArrayOf(Color.parseColor("#1a237e"), Color.parseColor("#0d1b2a")),
            floatArrayOf(0f, 1f),
            Shader.TileMode.CLAMP,
        )
        canvas.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paint)
        return bitmap
    }

    fun render(base: Bitmap, latLon: List<Pair<Double, Double>>, stats: RunStats): Bitmap {
        val width = base.width
        val height = base.height
        val out = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(out)
        val paint = Paint(Paint.FILTER_BITMAP_FLAG).apply {
            isFilterBitmap = false
            isDither = false
        }
        canvas.drawBitmap(base, 0f, 0f, paint)
        val w = width.toFloat()
        val h = height.toFloat()
        val portrait = h >= w
        drawBottomScrim(canvas, w, h)
        if (latLon.size >= 2) {
            drawRouteLayer(canvas, decimate(latLon, 600), width, height, portrait)
        }
        drawStatsOverlay(canvas, stats, w, h, portrait)
        return out
    }

    fun toPngBytes(bitmap: Bitmap): ByteArray {
        val out = ByteArrayOutputStream()
        check(bitmap.compress(Bitmap.CompressFormat.PNG, 100, out))
        return out.toByteArray()
    }

    private fun drawBottomScrim(canvas: Canvas, w: Float, h: Float) {
        val top = h - (0.22f * h)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.shader = LinearGradient(
            0f, top, 0f, h,
            intArrayOf(0, Color.argb(100, 0, 0, 0)),
            floatArrayOf(0f, 1f),
            Shader.TileMode.CLAMP,
        )
        canvas.drawRect(0f, top, w, h, paint)
    }

    private fun drawRouteLayer(
        dest: Canvas,
        latLon: List<Pair<Double, Double>>,
        w: Int,
        h: Int,
        portrait: Boolean,
    ) {
        val sw = w * 2
        val sh = h * 2
        val hiRes = Bitmap.createBitmap(sw, sh, Bitmap.Config.ARGB_8888)
        drawRoute(Canvas(hiRes), latLon, sw.toFloat(), sh.toFloat(), portrait)
        val scaled = Bitmap.createScaledBitmap(hiRes, w, h, true)
        hiRes.recycle()
        dest.drawBitmap(scaled, 0f, 0f, Paint(Paint.FILTER_BITMAP_FLAG).apply { isFilterBitmap = true })
        scaled.recycle()
    }

    private fun routeBounds(w: Float, h: Float): RectF {
        val pad = 0.04f * w
        return RectF(pad, 0.06f * h, w - pad, h - (0.13f * h) - (h * 0.03f))
    }

    private fun drawRoute(
        canvas: Canvas,
        latLon: List<Pair<Double, Double>>,
        w: Float,
        h: Float,
        portrait: Boolean,
    ) {
        val bounds = routeBounds(w, h)
        val bw = bounds.width()
        val bh = bounds.height()
        val minLat = latLon.minOf { it.first }
        val maxLat = latLon.maxOf { it.first }
        val minLon = latLon.minOf { it.second }
        val maxLon = latLon.maxOf { it.second }
        val latSpan = max(maxLat - minLat, 1e-5)
        val lonSpan = max(maxLon - minLon, 1e-5)
        val aspect = lonSpan / latSpan
        var drawW = bw * 0.98f
        var drawH = 0.98f * bh
        if (aspect > bw / bh) drawH = drawW / aspect.toFloat() else drawW = drawH * aspect.toFloat()
        val left = bounds.left + (bw - drawW) / 2f
        val top = bounds.top + (bh - drawH) / 2f
        val screenPts = latLon.map { (lat, lon) ->
            val x = left + ((lon - minLon) / lonSpan * drawW).toFloat()
            val y = top + (((maxLat - lat) / latSpan) * drawH).toFloat()
            x to y
        }
        val path = buildSmoothPath(screenPts)
        val stroke = min(32f, max(5f, min(w, h) * 0.014f * 2))
        val outline = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            style = Paint.Style.STROKE
            strokeWidth = stroke + 3f
            color = routeOutline
            strokeCap = Paint.Cap.ROUND
            strokeJoin = Paint.Join.ROUND
        }
        val line = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            style = Paint.Style.STROKE
            strokeWidth = stroke
            color = routeColor
            strokeCap = Paint.Cap.ROUND
            strokeJoin = Paint.Join.ROUND
        }
        canvas.drawPath(path, outline)
        canvas.drawPath(path, line)
        drawEndpoint(canvas, screenPts.first(), stroke, true)
        drawEndpoint(canvas, screenPts.last(), stroke, false)
    }

    private fun drawEndpoint(canvas: Canvas, pt: Pair<Float, Float>, stroke: Float, isStart: Boolean) {
        val (x, y) = pt
        val r = 0.55f * stroke
        canvas.drawCircle(x, y, r + 2f, Paint(Paint.ANTI_ALIAS_FLAG).apply { color = Color.argb(140, 0, 0, 0) })
        canvas.drawCircle(x, y, r, Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = Color.parseColor(if (isStart) "#43A047" else "#E53935")
        })
        canvas.drawCircle(x, y, r, Paint(Paint.ANTI_ALIAS_FLAG).apply {
            style = Paint.Style.STROKE
            strokeWidth = max(2f, stroke * 0.2f)
            color = Color.WHITE
        })
    }

    private fun buildSmoothPath(points: List<Pair<Float, Float>>): Path {
        val path = Path()
        if (points.isEmpty()) return path
        if (points.size == 1) {
            path.moveTo(points[0].first, points[0].second)
            return path
        }
        path.moveTo(points[0].first, points[0].second)
        if (points.size == 2) {
            path.lineTo(points[1].first, points[1].second)
            return path
        }
        for (i in 1 until points.size) {
            val prev = points[i - 1]
            val cur = points[i]
            val midX = (prev.first + cur.first) * 0.5f
            val midY = (prev.second + cur.second) * 0.5f
            if (i == 1) path.lineTo(midX, midY) else path.quadTo(prev.first, prev.second, midX, midY)
        }
        val last = points.last()
        path.lineTo(last.first, last.second)
        return path
    }

    private fun drawStatsOverlay(canvas: Canvas, stats: RunStats, w: Float, h: Float, portrait: Boolean) {
        val barH = if (portrait) h * 0.11f else h * 0.14f
        val barW = if (portrait) w * 0.92f else w * 0.55f
        val left = (w - barW) / 2f
        val top = h - barH - (h * 0.04f)
        val rect = RectF(left, top, left + barW, top + barH)
        drawStatBar(canvas, rect)
        val colW = barW / 3f
        val labels = listOf("Distance", "Time", "Pace")
        val values = listOf(
            if (stats.distanceKm < 0.1) "—" else "%.1f km".format(Locale.US, stats.distanceKm),
            formatDuration(stats.durationMs),
            stats.paceSecPerKm?.let { formatPace(it) } ?: "—",
        )
        val valuePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = Color.WHITE
            textSize = barH * 0.28f
            isFakeBoldText = true
        }
        val labelPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = Color.argb(180, 255, 255, 255)
            textSize = barH * 0.16f
        }
        values.forEachIndexed { i, value ->
            val cx = left + colW * i + colW / 2f
            canvas.drawText(value, cx - valuePaint.measureText(value) / 2f, top + barH * 0.52f, valuePaint)
            val label = labels[i]
            canvas.drawText(label, cx - labelPaint.measureText(label) / 2f, top + barH * 0.78f, labelPaint)
        }
    }

    private fun drawStatBar(canvas: Canvas, rect: RectF) {
        val radius = rect.height().coerceIn(14f, 28f) * 0.28f
        canvas.drawRoundRect(rect, radius, radius, Paint(Paint.ANTI_ALIAS_FLAG).apply { color = barFill })
        canvas.drawRoundRect(
            rect, radius, radius,
            Paint(Paint.ANTI_ALIAS_FLAG).apply {
                style = Paint.Style.STROKE
                strokeWidth = 1f
                color = Color.argb(40, 255, 255, 255)
            },
        )
    }

    private fun decimate(latLon: List<Pair<Double, Double>>, maxPoints: Int): List<Pair<Double, Double>> {
        if (latLon.size <= maxPoints) return latLon
        val step = latLon.size.toFloat() / maxPoints
        val out = ArrayList<Pair<Double, Double>>(maxPoints + 2)
        out.add(latLon.first())
        var f = step
        while (f < latLon.size - 1) {
            out.add(latLon[f.toInt().coerceIn(0, latLon.lastIndex)])
            f += step
        }
        out.add(latLon.last())
        return out
    }

    private fun formatDuration(ms: Long): String {
        val total = max(ms / 1000, 0)
        val h = total / 3600
        val m = (total % 3600) / 60
        val s = total % 60
        return if (h > 0) "%d:%02d:%02d".format(Locale.US, h, m, s)
        else "%d:%02d".format(Locale.US, m, s)
    }

    private fun formatPace(secondsPerKm: Double): String {
        val sec = max(secondsPerKm, 0.0).roundToInt()
        return "%d:%02d /km".format(Locale.US, sec / 60, sec % 60)
    }
}
