package com.example.rungps.export;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import com.example.rungps.AppBranding;
import com.example.rungps.analytics.TrainingWeekPlanner;
import com.example.rungps.training.DailyTrainingCoach;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: WeekShareCardRenderer.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/example/rungps/export/WeekShareCardRenderer;", "", "<init>", "()V", "render", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "week", "Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;", "coach", "Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WeekShareCardRenderer {
    public static final int $stable = 0;
    public static final WeekShareCardRenderer INSTANCE = new WeekShareCardRenderer();

    private WeekShareCardRenderer() {
    }

    public final Bitmap render(Context context, TrainingWeekPlanner.TrainingWeekView week, DailyTrainingCoach.DailyCoachBrief coach) {
        float f;
        Bitmap bitmap;
        Double valueOf;
        Paint paint;
        RectF rectF;
        Double valueOf2;
        RectF rectF2;
        Paint paint2;
        Paint paint3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(week, "week");
        Bitmap createBitmap = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint4 = new Paint(1);
        float f2 = 1080;
        float f3 = 1920;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, f2, f3, new int[]{Color.parseColor("#0B1220"), Color.parseColor("#0F1A33"), Color.parseColor("#0B1220")}, new float[]{0.0f, 0.55f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, f2, f3, paint4);
        RectF rectF3 = new RectF(64.0f, 64.0f, f2 - 64.0f, f3 - 64.0f);
        Paint paint5 = new Paint(1);
        paint5.setColor(Color.parseColor("#121826"));
        Paint paint6 = new Paint(1);
        paint6.setColor(Color.parseColor("#22304A"));
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(3.0f);
        canvas.drawRoundRect(rectF3, 38.0f, 38.0f, paint5);
        canvas.drawRoundRect(rectF3, 38.0f, 38.0f, paint6);
        Paint paint7 = new Paint(1);
        paint7.setColor(-1);
        paint7.setTextSize(62.0f);
        paint7.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        Paint paint8 = new Paint(1);
        paint8.setColor(Color.parseColor("#B3C0D9"));
        paint8.setTextSize(34.0f);
        Paint paint9 = new Paint(1);
        paint9.setColor(Color.parseColor("#EAF0FF"));
        paint9.setTextSize(34.0f);
        Paint paint10 = new Paint(1);
        paint10.setColor(Color.parseColor("#7DD3FC"));
        paint10.setTextSize(44.0f);
        paint10.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        Paint paint11 = new Paint(1);
        paint11.setColor(Color.parseColor("#1E2A44"));
        Paint paint12 = new Paint(1);
        paint12.setColor(Color.parseColor("#34D399"));
        Paint paint13 = new Paint(1);
        paint13.setColor(Color.parseColor("#A78BFA"));
        float f4 = rectF3.left + 54.0f;
        float f5 = rectF3.right - 54.0f;
        float f6 = rectF3.top + 90.0f;
        canvas.drawText("Training week", f4, f6, paint7);
        float f7 = f6 + 60.0f;
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.getDefault());
        canvas.drawText(week.getWeekStart().format(ofPattern) + " – " + week.getWeekEnd().format(ofPattern), f4, f7, paint8);
        float f8 = f7 + 86.0f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f km · %.0f kg gym", Arrays.copyOf(new Object[]{Double.valueOf(week.getTotalRunKm()), Double.valueOf(week.getTotalGymKg())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        canvas.drawText(format, f4, f8, paint10);
        Double avgSleepHours = week.getAvgSleepHours();
        if (avgSleepHours != null) {
            double doubleValue = avgSleepHours.doubleValue();
            f8 += 56.0f;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.US, "%.1f h sleep/night avg", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            canvas.drawText(format2, f4, f8, paint8);
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        Iterator it = week.getDays().iterator();
        if (it.hasNext()) {
            f = f5;
            double runKm = ((TrainingWeekPlanner.WeekDay) it.next()).getRunKm();
            while (it.hasNext()) {
                runKm = Math.max(runKm, ((TrainingWeekPlanner.WeekDay) it.next()).getRunKm());
                createBitmap = createBitmap;
                it = it;
            }
            bitmap = createBitmap;
            valueOf = Double.valueOf(runKm);
        } else {
            bitmap = createBitmap;
            f = f5;
            valueOf = null;
        }
        double coerceAtLeast = valueOf != null ? RangesKt.coerceAtLeast(valueOf.doubleValue(), 0.01d) : 1.0d;
        Iterator it2 = week.getDays().iterator();
        if (it2.hasNext()) {
            RectF rectF4 = rectF3;
            paint = paint10;
            double gymTonnageKg = ((TrainingWeekPlanner.WeekDay) it2.next()).getGymTonnageKg();
            while (it2.hasNext()) {
                gymTonnageKg = Math.max(gymTonnageKg, ((TrainingWeekPlanner.WeekDay) it2.next()).getGymTonnageKg());
                it2 = it2;
                rectF4 = rectF4;
            }
            rectF = rectF4;
            valueOf2 = Double.valueOf(gymTonnageKg);
        } else {
            rectF = rectF3;
            paint = paint10;
            valueOf2 = null;
        }
        double coerceAtLeast2 = valueOf2 != null ? RangesKt.coerceAtLeast(valueOf2.doubleValue(), 1.0d) : 1.0d;
        float f9 = f - f4;
        float size = (f9 / week.getDays().size()) * 0.35f;
        float size2 = f9 / week.getDays().size();
        float f10 = f8 + 56.0f;
        Paint paint14 = paint9;
        float f11 = f10 + 260.0f;
        float f12 = f11 + 54.0f;
        int i = 0;
        for (Object obj : week.getDays()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TrainingWeekPlanner.WeekDay weekDay = (TrainingWeekPlanner.WeekDay) obj;
            float f13 = (i * size2) + f4 + (size2 / 2.0f);
            double d = coerceAtLeast;
            float f14 = size2;
            double d2 = 260.0f;
            Paint paint15 = paint12;
            Paint paint16 = paint13;
            float runKm2 = (float) (0.85f * (weekDay.getRunKm() / coerceAtLeast) * d2);
            float gymTonnageKg2 = (float) ((weekDay.getGymTonnageKg() / coerceAtLeast2) * d2 * 0.55f);
            float f15 = size / 2.0f;
            float f16 = f13 - f15;
            float f17 = f15 + f13;
            double d3 = coerceAtLeast2;
            canvas.drawRoundRect(new RectF(f16, f10, f17, f11), 8.0f, 8.0f, paint11);
            if (gymTonnageKg2 > 4.0f) {
                RectF rectF5 = new RectF(f16, f11 - gymTonnageKg2, f17, f11);
                paint2 = paint16;
                canvas.drawRoundRect(rectF5, 8.0f, 8.0f, paint2);
            } else {
                paint2 = paint16;
            }
            if (runKm2 > 4.0f) {
                float f18 = size / 4.0f;
                RectF rectF6 = new RectF(f13 - f18, f11 - runKm2, f18 + f13, f11);
                paint3 = paint15;
                canvas.drawRoundRect(rectF6, 6.0f, 6.0f, paint3);
            } else {
                paint3 = paint15;
            }
            String take = StringsKt.take(weekDay.getDayLabel(), 3);
            canvas.drawText(take, f13 - (paint8.measureText(take) / 2.0f), 42.0f + f11, paint8);
            paint13 = paint2;
            paint12 = paint3;
            size2 = f14;
            i = i2;
            coerceAtLeast2 = d3;
            coerceAtLeast = d;
        }
        canvas.drawText("km (green) · gym kg (purple)", f4, f10 - 14.0f, paint8);
        if (coach != null) {
            float f19 = f12 + 24.0f;
            canvas.drawText(coach.getHeadline(), f4, f19, paint);
            float f20 = f19 + 54.0f;
            String str = (String) SequencesKt.firstOrNull(StringsKt.lineSequence(coach.getDetail()));
            String obj2 = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
            if (obj2 == null) {
                obj2 = "";
            }
            String str2 = StringsKt.take(obj2, 100) + (coach.getDetail().length() > 100 ? "…" : "");
            if (!StringsKt.isBlank(str2)) {
                canvas.drawText(str2, f4, f20, paint8);
                f20 += 54.0f;
            }
            f12 = f20;
            Unit unit3 = Unit.INSTANCE;
            Unit unit4 = Unit.INSTANCE;
        }
        Iterator<TrainingWeekPlanner.WeekDay> it3 = week.getDays().iterator();
        float f21 = f12 + 28.0f;
        while (true) {
            if (!it3.hasNext()) {
                rectF2 = rectF;
                break;
            }
            TrainingWeekPlanner.WeekDay next = it3.next();
            StringBuilder sb = new StringBuilder();
            sb.append(StringsKt.padEnd$default(next.getDayLabel(), 4, (char) 0, 2, (Object) null));
            sb.append(" ");
            if (next.getRunKm() > 0.01d) {
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String format3 = String.format(Locale.US, "%.1f km ", Arrays.copyOf(new Object[]{Double.valueOf(next.getRunKm())}, 1));
                Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                sb.append(format3);
            }
            if (next.getGymTonnageKg() > 0.0d) {
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                String format4 = String.format(Locale.US, "%.0f kg ", Arrays.copyOf(new Object[]{Double.valueOf(next.getGymTonnageKg())}, 1));
                Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
                sb.append(format4);
            }
            if (!next.getEvents().isEmpty()) {
                List<TrainingWeekPlanner.WeekEvent> events = next.getEvents();
                if (!(events instanceof Collection) || !events.isEmpty()) {
                    Iterator<T> it4 = events.iterator();
                    while (it4.hasNext()) {
                        if (((TrainingWeekPlanner.WeekEvent) it4.next()).getKind() != TrainingWeekPlanner.EventKind.REST_HINT) {
                            sb.append(StringsKt.take(((TrainingWeekPlanner.WeekEvent) CollectionsKt.first((List) next.getEvents())).getTitle(), 28));
                            break;
                        }
                    }
                }
            }
            sb.append("rest");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            Paint paint17 = paint14;
            canvas.drawText(sb2, f4, f21, paint17);
            f21 += 56.0f;
            rectF2 = rectF;
            if (f21 > rectF2.bottom - 140.0f) {
                break;
            }
            paint14 = paint17;
            rectF = rectF2;
        }
        canvas.drawText(AppBranding.DISPLAY_NAME, f4, rectF2.bottom - 54.0f, paint8);
        return bitmap;
    }
}
