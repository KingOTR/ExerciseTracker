package com.example.rungps.strava;

import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.export.GpxExporter;
import com.example.rungps.export.HrSample;
import com.example.rungps.export.TrackPoint;
import com.example.rungps.tracking.TrackingService;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: StravaGpxUpload.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\tJ4\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J4\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019J2\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/example/rungps/strava/StravaGpxUpload;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "uploadGpx", "Lcom/example/rungps/strava/StravaGpxUpload$GpxUploadResult;", "accessToken", "", "gpx", HintConstants.AUTOFILL_HINT_NAME, "description", TrackingService.EXTRA_ACTIVITY_TYPE, "awaitActivityId", "", "uploadId", "maxWaitMs", "pollMs", "(Ljava/lang/String;JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkUploadStatus", "Lcom/example/rungps/strava/StravaUploadStatusResponse;", "buildGpx", "startedAtMs", "points", "", "Lcom/example/rungps/export/TrackPoint;", "hrSamples", "Lcom/example/rungps/export/HrSample;", "buildMultipart", "", "boundary", "desc", "GpxUploadResult", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaGpxUpload {
    public static final StravaGpxUpload INSTANCE = new StravaGpxUpload();
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.example.rungps.strava.StravaGpxUpload$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit json$lambda$0;
            json$lambda$0 = StravaGpxUpload.json$lambda$0((JsonBuilder) obj);
            return json$lambda$0;
        }
    }, 1, null);
    public static final int $stable = 8;

    private StravaGpxUpload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    /* compiled from: StravaGpxUpload.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/strava/StravaGpxUpload$GpxUploadResult;", "", "activityId", "", "uploadId", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getActivityId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUploadId", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/example/rungps/strava/StravaGpxUpload$GpxUploadResult;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GpxUploadResult {
        public static final int $stable = 0;
        private final Long activityId;
        private final Long uploadId;

        public static /* synthetic */ GpxUploadResult copy$default(GpxUploadResult gpxUploadResult, Long l, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = gpxUploadResult.activityId;
            }
            if ((i & 2) != 0) {
                l2 = gpxUploadResult.uploadId;
            }
            return gpxUploadResult.copy(l, l2);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getActivityId() {
            return this.activityId;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getUploadId() {
            return this.uploadId;
        }

        public final GpxUploadResult copy(Long activityId, Long uploadId) {
            return new GpxUploadResult(activityId, uploadId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GpxUploadResult)) {
                return false;
            }
            GpxUploadResult gpxUploadResult = (GpxUploadResult) other;
            return Intrinsics.areEqual(this.activityId, gpxUploadResult.activityId) && Intrinsics.areEqual(this.uploadId, gpxUploadResult.uploadId);
        }

        public int hashCode() {
            Long l = this.activityId;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.uploadId;
            return hashCode + (l2 != null ? l2.hashCode() : 0);
        }

        public String toString() {
            return "GpxUploadResult(activityId=" + this.activityId + ", uploadId=" + this.uploadId + ")";
        }

        public GpxUploadResult(Long l, Long l2) {
            this.activityId = l;
            this.uploadId = l2;
        }

        public final Long getActivityId() {
            return this.activityId;
        }

        public final Long getUploadId() {
            return this.uploadId;
        }
    }

    public static /* synthetic */ GpxUploadResult uploadGpx$default(StravaGpxUpload stravaGpxUpload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        String str6 = str4;
        if ((i & 16) != 0) {
            str5 = "run";
        }
        return stravaGpxUpload.uploadGpx(str, str2, str3, str6, str5);
    }

    public final GpxUploadResult uploadGpx(String accessToken, String gpx, String name, String description, String activityType) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(gpx, "gpx");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        String str = "----ExerciseTracker" + System.currentTimeMillis();
        URLConnection openConnection = new URL("https://www.strava.com/api/v3/uploads").openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=" + str);
        byte[] buildMultipart = buildMultipart(str, gpx, name, description, activityType);
        BufferedReader outputStream = httpURLConnection.getOutputStream();
        try {
            outputStream.write(buildMultipart);
            Unit unit = Unit.INSTANCE;
            String str2 = null;
            CloseableKt.closeFinally(outputStream, null);
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
                outputStream = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String readText = TextStreamsKt.readText(outputStream);
                    CloseableKt.closeFinally(outputStream, null);
                    str2 = readText;
                } finally {
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            if (200 > responseCode || responseCode >= 300) {
                throw new IllegalStateException(("Strava upload HTTP " + responseCode + ": " + str2).toString());
            }
            StravaUploadResponse stravaUploadResponse = (StravaUploadResponse) json.decodeFromString(StravaUploadResponse.INSTANCE.serializer(), str2);
            return new GpxUploadResult(stravaUploadResponse.getActivityId(), stravaUploadResponse.getId());
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitActivityId(String str, long j, long j2, long j3, Continuation<? super Long> continuation) {
        StravaGpxUpload$awaitActivityId$1 stravaGpxUpload$awaitActivityId$1;
        StravaGpxUpload stravaGpxUpload;
        int i;
        String str2;
        long j4;
        long currentTimeMillis;
        long j5;
        String str3;
        String obj;
        if (continuation instanceof StravaGpxUpload$awaitActivityId$1) {
            stravaGpxUpload$awaitActivityId$1 = (StravaGpxUpload$awaitActivityId$1) continuation;
            if ((stravaGpxUpload$awaitActivityId$1.label & Integer.MIN_VALUE) != 0) {
                stravaGpxUpload$awaitActivityId$1.label -= Integer.MIN_VALUE;
                stravaGpxUpload = this;
                Object obj2 = stravaGpxUpload$awaitActivityId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stravaGpxUpload$awaitActivityId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    str2 = str;
                    j4 = j3;
                    currentTimeMillis = System.currentTimeMillis() + j2;
                    j5 = j;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j6 = stravaGpxUpload$awaitActivityId$1.J$2;
                    j4 = stravaGpxUpload$awaitActivityId$1.J$1;
                    long j7 = stravaGpxUpload$awaitActivityId$1.J$0;
                    String str4 = (String) stravaGpxUpload$awaitActivityId$1.L$1;
                    StravaGpxUpload stravaGpxUpload2 = (StravaGpxUpload) stravaGpxUpload$awaitActivityId$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    str2 = str4;
                    stravaGpxUpload = stravaGpxUpload2;
                    j5 = j7;
                    currentTimeMillis = j6;
                }
                while (System.currentTimeMillis() < currentTimeMillis) {
                    StravaUploadStatusResponse checkUploadStatus = stravaGpxUpload.checkUploadStatus(str2, j5);
                    Long activityId = checkUploadStatus.getActivityId();
                    if (activityId != null) {
                        if (activityId.longValue() <= 0) {
                            activityId = null;
                        }
                        if (activityId != null) {
                            return Boxing.boxLong(activityId.longValue());
                        }
                    }
                    String error = checkUploadStatus.getError();
                    String obj3 = error != null ? StringsKt.trim((CharSequence) error).toString() : null;
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    if (obj3.length() > 0) {
                        return null;
                    }
                    String status = checkUploadStatus.getStatus();
                    if (status == null || (obj = StringsKt.trim((CharSequence) status).toString()) == null) {
                        str3 = null;
                    } else {
                        str3 = obj.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(str3, "toLowerCase(...)");
                    }
                    if (Intrinsics.areEqual(str3, "your activity is ready.")) {
                        return checkUploadStatus.getActivityId();
                    }
                    if (Intrinsics.areEqual(str3, "there was an error processing your activity.")) {
                        return null;
                    }
                    stravaGpxUpload$awaitActivityId$1.L$0 = stravaGpxUpload;
                    stravaGpxUpload$awaitActivityId$1.L$1 = str2;
                    stravaGpxUpload$awaitActivityId$1.J$0 = j5;
                    stravaGpxUpload$awaitActivityId$1.J$1 = j4;
                    stravaGpxUpload$awaitActivityId$1.J$2 = currentTimeMillis;
                    stravaGpxUpload$awaitActivityId$1.label = 1;
                    if (DelayKt.delay(j4, stravaGpxUpload$awaitActivityId$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return null;
            }
        }
        stravaGpxUpload = this;
        stravaGpxUpload$awaitActivityId$1 = new StravaGpxUpload$awaitActivityId$1(stravaGpxUpload, continuation);
        Object obj22 = stravaGpxUpload$awaitActivityId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stravaGpxUpload$awaitActivityId$1.label;
        if (i != 0) {
        }
        while (System.currentTimeMillis() < currentTimeMillis) {
        }
        return null;
    }

    private final StravaUploadStatusResponse checkUploadStatus(String accessToken, long uploadId) {
        URLConnection openConnection = new URL("https://www.strava.com/api/v3/uploads/" + uploadId).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        int responseCode = httpURLConnection.getResponseCode();
        InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
        String str = null;
        if (errorStream != null) {
            Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                str = readText;
            } finally {
            }
        }
        if (str == null) {
            str = "";
        }
        if (200 > responseCode || responseCode >= 300) {
            throw new IllegalStateException(("Strava upload status HTTP " + responseCode + ": " + str).toString());
        }
        return (StravaUploadStatusResponse) json.decodeFromString(StravaUploadStatusResponse.INSTANCE.serializer(), str);
    }

    public static /* synthetic */ String buildGpx$default(StravaGpxUpload stravaGpxUpload, String str, long j, List list, List list2, int i, Object obj) {
        if ((i & 8) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        return stravaGpxUpload.buildGpx(str, j, list, list2);
    }

    public final String buildGpx(String name, long startedAtMs, List<TrackPoint> points, List<HrSample> hrSamples) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(hrSamples, "hrSamples");
        return GpxExporter.INSTANCE.toGpx(name, startedAtMs, points, hrSamples);
    }

    private final byte[] buildMultipart(String boundary, String gpx, String name, String desc, String activityType) {
        StringBuilder sb = new StringBuilder();
        String lowerCase = StringsKt.trim((CharSequence) activityType).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = Intrinsics.areEqual(lowerCase, "ride") ? "ride" : "run";
        String str2 = Intrinsics.areEqual(str, "ride") ? "ride.gpx" : "run.gpx";
        buildMultipart$field(sb, boundary, "data_type", "gpx");
        buildMultipart$field(sb, boundary, "activity_type", str);
        buildMultipart$field(sb, boundary, HintConstants.AUTOFILL_HINT_NAME, name);
        String str3 = desc;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            buildMultipart$field(sb, boundary, "description", desc);
        }
        sb.append("--").append(boundary).append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + str2 + "\"\r\n");
        sb.append("Content-Type: application/gpx+xml\r\n\r\n");
        sb.append(gpx).append("\r\n");
        sb.append("--").append(boundary).append("--\r\n");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        byte[] bytes = sb2.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    private static final void buildMultipart$field(StringBuilder sb, String str, String str2, String str3) {
        sb.append("--").append(str).append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"").append(str2).append("\"\r\n\r\n");
        sb.append(str3).append("\r\n");
    }
}
