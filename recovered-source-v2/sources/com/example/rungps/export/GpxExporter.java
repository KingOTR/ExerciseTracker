package com.example.rungps.export;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GpxExporter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ \u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u0002J(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/export/GpxExporter;", "", "<init>", "()V", "iso8601", "Ljava/text/SimpleDateFormat;", "toGpx", "", "activityName", "startedAtMs", "", "points", "", "Lcom/example/rungps/export/TrackPoint;", "hrSamples", "Lcom/example/rungps/export/HrSample;", "nearestHr", "timeMs", "samples", "mergeHrIntoPoints", "escapeXml", "s", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GpxExporter {
    public static final int $stable;
    public static final GpxExporter INSTANCE = new GpxExporter();
    private static final SimpleDateFormat iso8601;

    private GpxExporter() {
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        iso8601 = simpleDateFormat;
        $stable = 8;
    }

    public static /* synthetic */ String toGpx$default(GpxExporter gpxExporter, String str, long j, List list, List list2, int i, Object obj) {
        if ((i & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return gpxExporter.toGpx(str, j, list, list2);
    }

    public final String toGpx(String activityName, long startedAtMs, List<TrackPoint> points, List<HrSample> hrSamples) {
        String str;
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(hrSamples, "hrSamples");
        String escapeXml = escapeXml(activityName);
        String format = iso8601.format(new Date(startedAtMs));
        StringBuilder sb = new StringBuilder();
        Iterator<TrackPoint> it = points.iterator();
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                break;
            }
            TrackPoint next = it.next();
            Integer hrBpm = next.getHrBpm();
            if (hrBpm == null) {
                HrSample nearestHr = INSTANCE.nearestHr(next.getTimeMs(), hrSamples);
                if (nearestHr != null) {
                    num = Integer.valueOf(nearestHr.getBpm());
                }
            } else {
                num = hrBpm;
            }
            sb.append("      <trkpt lat=\"" + next.getLat() + "\" lon=\"" + next.getLon() + "\">").append('\n');
            Double eleM = next.getEleM();
            if (eleM != null) {
                sb.append("        <ele>").append(eleM.doubleValue()).append("</ele>\n");
            }
            sb.append("        <time>").append(iso8601.format(new Date(next.getTimeMs()))).append("</time>\n");
            if (num != null) {
                sb.append("        <extensions><gpxtpx:TrackPointExtension xmlns:gpxtpx=\"http://www.garmin.com/xmlschemas/TrackPointExtension/v1\"><gpxtpx:hr>" + num + "</gpxtpx:hr></gpxtpx:TrackPointExtension></extensions>").append('\n');
            }
            sb.append("      </trkpt>\n");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        List<TrackPoint> list = points;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((TrackPoint) it2.next()).getHrBpm() != null) {
                    break;
                }
            }
        }
        if (hrSamples.isEmpty()) {
            str = "";
            return StringsKt.trimMargin$default("\n            |<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n            |<gpx version=\"1.1\" creator=\"Exercise Tracker\" xmlns=\"http://www.topografix.com/GPX/1/1\"" + str + ">\n            |  <metadata>\n            |    <name>" + escapeXml + "</name>\n            |    <time>" + format + "</time>\n            |  </metadata>\n            |  <trk>\n            |    <name>" + escapeXml + "</name>\n            |    <trkseg>\n            |" + sb2 + "    </trkseg>\n            |  </trk>\n            |</gpx>\n            |\n        ", null, 1, null);
        }
        str = " xmlns:gpxtpx=\"http://www.garmin.com/xmlschemas/TrackPointExtension/v1\"";
        return StringsKt.trimMargin$default("\n            |<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n            |<gpx version=\"1.1\" creator=\"Exercise Tracker\" xmlns=\"http://www.topografix.com/GPX/1/1\"" + str + ">\n            |  <metadata>\n            |    <name>" + escapeXml + "</name>\n            |    <time>" + format + "</time>\n            |  </metadata>\n            |  <trk>\n            |    <name>" + escapeXml + "</name>\n            |    <trkseg>\n            |" + sb2 + "    </trkseg>\n            |  </trk>\n            |</gpx>\n            |\n        ", null, 1, null);
    }

    private final HrSample nearestHr(long timeMs, List<HrSample> samples) {
        Object next;
        if (samples.isEmpty()) {
            return null;
        }
        Iterator<T> it = samples.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long abs = Math.abs(((HrSample) next).getTimeMs() - timeMs);
                do {
                    Object next2 = it.next();
                    long abs2 = Math.abs(((HrSample) next2).getTimeMs() - timeMs);
                    if (abs > abs2) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        HrSample hrSample = (HrSample) next;
        if (hrSample == null || Math.abs(hrSample.getTimeMs() - timeMs) > 30000) {
            return null;
        }
        return hrSample;
    }

    public final List<TrackPoint> mergeHrIntoPoints(List<TrackPoint> points, List<HrSample> hrSamples) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(hrSamples, "hrSamples");
        if (hrSamples.isEmpty()) {
            return points;
        }
        List<TrackPoint> list = points;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (TrackPoint trackPoint : list) {
            Integer hrBpm = trackPoint.getHrBpm();
            if (hrBpm == null) {
                HrSample nearestHr = INSTANCE.nearestHr(trackPoint.getTimeMs(), hrSamples);
                hrBpm = nearestHr != null ? Integer.valueOf(nearestHr.getBpm()) : null;
            }
            Integer num = hrBpm;
            if (num != null) {
                trackPoint = trackPoint.copy((r18 & 1) != 0 ? trackPoint.lat : 0.0d, (r18 & 2) != 0 ? trackPoint.lon : 0.0d, (r18 & 4) != 0 ? trackPoint.timeMs : 0L, (r18 & 8) != 0 ? trackPoint.eleM : null, (r18 & 16) != 0 ? trackPoint.hrBpm : num);
            }
            arrayList.add(trackPoint);
        }
        return arrayList;
    }

    private final String escapeXml(String s) {
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(s, "&", "&amp;", false, 4, (Object) null), "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null), "\"", "&quot;", false, 4, (Object) null), "'", "&apos;", false, 4, (Object) null);
    }
}
