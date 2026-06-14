package com.example.rungps.sleep;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SleepTravelEta.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\nJ$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0006J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0006H\u0086@¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011J(\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u001bJ/\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010!R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/example/rungps/sleep/SleepTravelEta;", "", "<init>", "()V", "osrmBases", "", "", "resolveBufferMin", "Lcom/example/rungps/sleep/SleepTravelEta$TravelResult;", "context", "Landroid/content/Context;", "destinationAddress", "fallbackMin", "", "(Landroid/content/Context;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "originLatLon", "Lkotlin/Pair;", "", "geocode", "address", "geocodeAndCacheHome", "", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reverseGeocode", "lat", "lon", "saveHomeFromGps", "(Landroid/content/Context;DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drivingDurationMinutes", "fromLat", "fromLon", "toLat", "toLon", "(DDDD)Ljava/lang/Integer;", "TravelResult", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepTravelEta {
    public static final SleepTravelEta INSTANCE = new SleepTravelEta();
    private static final List<String> osrmBases = CollectionsKt.listOf((Object[]) new String[]{"https://router.project-osrm.org", "https://routing.openstreetmap.de/routed-car"});
    public static final int $stable = 8;

    private SleepTravelEta() {
    }

    /* compiled from: SleepTravelEta.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/sleep/SleepTravelEta$TravelResult;", "", "bufferMin", "", "detail", "", "<init>", "(ILjava/lang/String;)V", "getBufferMin", "()I", "getDetail", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TravelResult {
        public static final int $stable = 0;
        private final int bufferMin;
        private final String detail;

        public static /* synthetic */ TravelResult copy$default(TravelResult travelResult, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = travelResult.bufferMin;
            }
            if ((i2 & 2) != 0) {
                str = travelResult.detail;
            }
            return travelResult.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getBufferMin() {
            return this.bufferMin;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        public final TravelResult copy(int bufferMin, String detail) {
            return new TravelResult(bufferMin, detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TravelResult)) {
                return false;
            }
            TravelResult travelResult = (TravelResult) other;
            return this.bufferMin == travelResult.bufferMin && Intrinsics.areEqual(this.detail, travelResult.detail);
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.bufferMin) * 31;
            String str = this.detail;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "TravelResult(bufferMin=" + this.bufferMin + ", detail=" + this.detail + ")";
        }

        public TravelResult(int i, String str) {
            this.bufferMin = i;
            this.detail = str;
        }

        public final int getBufferMin() {
            return this.bufferMin;
        }

        public final String getDetail() {
            return this.detail;
        }
    }

    public final Object resolveBufferMin(Context context, String str, int i, Continuation<? super TravelResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SleepTravelEta$resolveBufferMin$2(context, str, i, null), continuation);
    }

    public final Pair<Double, Double> originLatLon(Context context) {
        Pair<Double, Double> geocode;
        Intrinsics.checkNotNullParameter(context, "context");
        Double homeLat = SleepAlarmPreferences.INSTANCE.homeLat(context);
        Double homeLon = SleepAlarmPreferences.INSTANCE.homeLon(context);
        if (homeLat != null && homeLon != null) {
            return TuplesKt.to(homeLat, homeLon);
        }
        String homeAddress = SleepAlarmPreferences.INSTANCE.homeAddress(context);
        if (homeAddress == null || (geocode = geocode(context, homeAddress)) == null) {
            return null;
        }
        SleepAlarmPreferences.INSTANCE.setHomeLatLon(context, geocode.component1().doubleValue(), geocode.component2().doubleValue());
        return geocode;
    }

    public final Pair<Double, Double> geocode(Context context, String address) {
        Object m7905constructorimpl;
        Address address2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(address, "address");
        if (StringsKt.isBlank(address) || !Geocoder.isPresent()) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepTravelEta sleepTravelEta = this;
            List<Address> fromLocationName = new Geocoder(context, Locale.getDefault()).getFromLocationName(StringsKt.trim((CharSequence) address).toString(), 1);
            m7905constructorimpl = Result.m7905constructorimpl((fromLocationName == null || (address2 = (Address) CollectionsKt.firstOrNull((List) fromLocationName)) == null) ? null : TuplesKt.to(Double.valueOf(address2.getLatitude()), Double.valueOf(address2.getLongitude())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return (Pair) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
    }

    public final Object geocodeAndCacheHome(Context context, String str, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new SleepTravelEta$geocodeAndCacheHome$2(context, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String reverseGeocode(Context context, double lat, double lon) {
        Object m7905constructorimpl;
        List<Address> fromLocation;
        String str;
        Address address;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Geocoder.isPresent()) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepTravelEta sleepTravelEta = this;
            fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(lat, lon, 1);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (fromLocation != null && (address = (Address) CollectionsKt.firstOrNull((List) fromLocation)) != null) {
            String[] strArr = new String[6];
            String featureName = address.getFeatureName();
            if (featureName == null || StringsKt.isBlank(featureName)) {
                featureName = null;
            }
            strArr[0] = featureName;
            String subThoroughfare = address.getSubThoroughfare();
            if (subThoroughfare == null || StringsKt.isBlank(subThoroughfare)) {
                subThoroughfare = null;
            }
            strArr[1] = subThoroughfare;
            String thoroughfare = address.getThoroughfare();
            if (thoroughfare == null || StringsKt.isBlank(thoroughfare)) {
                thoroughfare = null;
            }
            strArr[2] = thoroughfare;
            String locality = address.getLocality();
            if (locality == null || StringsKt.isBlank(locality)) {
                locality = null;
            }
            strArr[3] = locality;
            String adminArea = address.getAdminArea();
            if (adminArea == null || StringsKt.isBlank(adminArea)) {
                adminArea = null;
            }
            strArr[4] = adminArea;
            String postalCode = address.getPostalCode();
            if (postalCode == null || StringsKt.isBlank(postalCode)) {
                postalCode = null;
            }
            strArr[5] = postalCode;
            str = CollectionsKt.joinToString$default(CollectionsKt.distinct(CollectionsKt.listOfNotNull((Object[]) strArr)), ", ", null, null, 0, null, null, 62, null);
            if (str != null && !StringsKt.isBlank(str)) {
                m7905constructorimpl = Result.m7905constructorimpl(str);
                return (String) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
            }
        }
        str = null;
        m7905constructorimpl = Result.m7905constructorimpl(str);
        return (String) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
    }

    public final Object saveHomeFromGps(Context context, double d, double d2, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SleepTravelEta$saveHomeFromGps$2(context, d, d2, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2 A[Catch: all -> 0x0138, TryCatch #2 {all -> 0x0138, blocks: (B:6:0x003c, B:9:0x0095, B:10:0x00a2, B:12:0x00b2, B:13:0x00bd, B:16:0x00c8, B:19:0x00cf, B:21:0x00e2, B:24:0x00eb, B:27:0x00f3, B:30:0x0101, B:33:0x012a, B:47:0x0112, B:55:0x0134, B:56:0x0137, B:57:0x00b5, B:58:0x009a, B:15:0x00bf, B:51:0x0132), top: B:5:0x003c, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5 A[Catch: all -> 0x0138, TryCatch #2 {all -> 0x0138, blocks: (B:6:0x003c, B:9:0x0095, B:10:0x00a2, B:12:0x00b2, B:13:0x00bd, B:16:0x00c8, B:19:0x00cf, B:21:0x00e2, B:24:0x00eb, B:27:0x00f3, B:30:0x0101, B:33:0x012a, B:47:0x0112, B:55:0x0134, B:56:0x0137, B:57:0x00b5, B:58:0x009a, B:15:0x00bf, B:51:0x0132), top: B:5:0x003c, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer drivingDurationMinutes(double fromLat, double fromLon, double toLat, double toLon) {
        Object m7905constructorimpl;
        Throwable m7908exceptionOrNullimpl;
        HttpURLConnection httpURLConnection;
        int responseCode;
        InputStream errorStream;
        InputStream inputStream;
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        String str = fromLon + "," + fromLat + ";" + toLon + "," + toLat;
        Iterator<String> it = osrmBases.iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            String next = it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                SleepTravelEta sleepTravelEta = this;
                URLConnection openConnection = new URL(next + "/route/v1/driving/" + str + "?overview=false&alternatives=false").openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setConnectTimeout(SleepAudioConstants.SAMPLE_RATE_V1);
                httpURLConnection.setReadTimeout(SleepAudioConstants.SAMPLE_RATE_V1);
                httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
                httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, "ExerciseTracker/1 (osrm-drive-eta)");
                responseCode = httpURLConnection.getResponseCode();
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            try {
                if ((200 > responseCode || responseCode >= 300) && (errorStream = httpURLConnection.getErrorStream()) != null) {
                    inputStream = errorStream;
                    Intrinsics.checkNotNull(inputStream);
                    Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                    BufferedReader bufferedReader = !(inputStreamReader instanceof BufferedReader) ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    String readText = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    if (200 <= responseCode || responseCode >= 300) {
                        new IllegalStateException("OSRM " + responseCode);
                    } else {
                        JSONObject jSONObject = new JSONObject(readText);
                        if (!Intrinsics.areEqual(jSONObject.optString("code"), "NoRoute") && (optJSONArray = jSONObject.optJSONArray("routes")) != null && (optJSONObject = optJSONArray.optJSONObject(0)) != null) {
                            double optDouble = optJSONObject.optDouble("duration", -1.0d);
                            if (optDouble > 0.0d) {
                                return Integer.valueOf(RangesKt.coerceAtLeast(MathKt.roundToInt(optDouble / 60.0d), 1));
                            }
                        }
                    }
                    m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                    m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                    if (m7908exceptionOrNullimpl != null) {
                        if ((m7908exceptionOrNullimpl instanceof Exception ? (Exception) m7908exceptionOrNullimpl : null) == null) {
                            new Exception(m7908exceptionOrNullimpl);
                        }
                    }
                }
                String readText2 = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                if (200 <= responseCode) {
                }
                new IllegalStateException("OSRM " + responseCode);
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                if (m7908exceptionOrNullimpl != null) {
                }
            } finally {
            }
            inputStream = httpURLConnection.getInputStream();
            Intrinsics.checkNotNull(inputStream);
            Reader inputStreamReader2 = new InputStreamReader(inputStream, Charsets.UTF_8);
            BufferedReader bufferedReader2 = !(inputStreamReader2 instanceof BufferedReader) ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
        }
    }
}
