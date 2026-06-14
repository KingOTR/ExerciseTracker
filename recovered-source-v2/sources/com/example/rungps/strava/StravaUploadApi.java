package com.example.rungps.strava;

import androidx.autofill.HintConstants;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: StravaUploadApi.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bJ\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/strava/StravaUploadApi;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "localFmt", "Ljava/time/format/DateTimeFormatter;", "createRunActivity", "", "accessToken", "", HintConstants.AUTOFILL_HINT_NAME, "startTimeMs", "elapsedSec", "", "distanceM", "", "description", "sportType", "escapeJson", "s", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaUploadApi {
    public static final int $stable;
    public static final StravaUploadApi INSTANCE = new StravaUploadApi();
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.example.rungps.strava.StravaUploadApi$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit json$lambda$0;
            json$lambda$0 = StravaUploadApi.json$lambda$0((JsonBuilder) obj);
            return json$lambda$0;
        }
    }, 1, null);
    private static final DateTimeFormatter localFmt;

    private StravaUploadApi() {
    }

    static {
        DateTimeFormatter withZone = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(withZone, "withZone(...)");
        localFmt = withZone;
        $stable = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final long createRunActivity(String accessToken, String name, long startTimeMs, int elapsedSec, double distanceM, String description, String sportType) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sportType, "sportType");
        URLConnection openConnection = new URL("https://www.strava.com/api/v3/activities").openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        String format = localFmt.format(Instant.ofEpochMilli(startTimeMs));
        StringBuilder sb = new StringBuilder("{\"name\":\"");
        StravaUploadApi stravaUploadApi = INSTANCE;
        sb.append(stravaUploadApi.escapeJson(name)).append("\",\"type\":\"");
        sb.append(stravaUploadApi.escapeJson(sportType)).append("\",\"sport_type\":\"");
        sb.append(stravaUploadApi.escapeJson(sportType)).append("\",\"start_date_local\":\"");
        sb.append(format).append("\",\"elapsed_time\":");
        sb.append(RangesKt.coerceAtLeast(elapsedSec, 1)).append(",\"distance\":");
        sb.append(RangesKt.coerceAtLeast(distanceM, 0.0d));
        String str = description;
        if (str != null && !StringsKt.isBlank(str)) {
            sb.append(",\"description\":\"").append(stravaUploadApi.escapeJson(description)).append("\"");
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        BufferedReader outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), Charsets.UTF_8);
        try {
            outputStreamWriter.write(sb2);
            Unit unit = Unit.INSTANCE;
            String str2 = null;
            CloseableKt.closeFinally(outputStreamWriter, null);
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
                outputStreamWriter = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String readText = TextStreamsKt.readText(outputStreamWriter);
                    CloseableKt.closeFinally(outputStreamWriter, null);
                    str2 = readText;
                } finally {
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            if (200 > responseCode || responseCode >= 300) {
                throw new IllegalStateException(("Strava create activity HTTP " + responseCode + ": " + str2).toString());
            }
            return ((StravaCreatedActivity) json.decodeFromString(StravaCreatedActivity.INSTANCE.serializer(), str2)).getId();
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    private final String escapeJson(String s) {
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(s, "\\", "\\\\", false, 4, (Object) null), "\"", "\\\"", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null);
    }
}
