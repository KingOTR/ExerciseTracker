package com.example.rungps.strava;

import androidx.browser.trusted.sharing.ShareTarget;
import com.caverock.androidsvg.SVGParser;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: StravaActivitiesApi.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J/\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000eJ&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eJC\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0002\u0010\u001eJ(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\fH\u0002J\u001a\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\fJ\u001a\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\fJ#\u0010&\u001a\u0004\u0018\u00010\u00102\b\u0010'\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\tJ\u0017\u0010,\u001a\u0004\u0018\u00010\u00102\u0006\u0010-\u001a\u00020\fH\u0002¢\u0006\u0002\u0010.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/example/rungps/strava/StravaActivitiesApi;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "listSerializer", "Lkotlinx/serialization/KSerializer;", "", "Lcom/example/rungps/strava/StravaActivityJson;", "fetchAllRunActivities", "accessToken", "", "maxPages", "", "afterEpochSec", "", "(Ljava/lang/String;ILjava/lang/Long;)Ljava/util/List;", "fetchAllRideActivities", "fetchTrainingActivities", "fetchAllTrainingActivities", "fetchTrainingActivitiesSince", "sinceMs", "maxPagesRecent", "maxPagesAfter", "fetchRecentTrainingActivities", "fetchAthleteActivities", "include", "Lkotlin/Function1;", "", "(Ljava/lang/String;ILjava/lang/Long;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "fetchActivitiesPage", "page", "extraQuery", "isTrainingActivityType", SVGParser.XML_STYLESHEET_ATTR_TYPE, "sportType", "isBikeType", "parseStartMs", "startDate", "startDateLocal", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "effectiveMovingSec", "activity", "parseIsoMs", "raw", "(Ljava/lang/String;)Ljava/lang/Long;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaActivitiesApi {
    public static final StravaActivitiesApi INSTANCE = new StravaActivitiesApi();
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.example.rungps.strava.StravaActivitiesApi$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit json$lambda$0;
            json$lambda$0 = StravaActivitiesApi.json$lambda$0((JsonBuilder) obj);
            return json$lambda$0;
        }
    }, 1, null);
    private static final KSerializer<List<StravaActivityJson>> listSerializer = BuiltinSerializersKt.ListSerializer(StravaActivityJson.INSTANCE.serializer());
    public static final int $stable = 8;

    private StravaActivitiesApi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ List fetchAllRunActivities$default(StravaActivitiesApi stravaActivitiesApi, String str, int i, Long l, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 25;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        return stravaActivitiesApi.fetchAllRunActivities(str, i, l);
    }

    public final List<StravaActivityJson> fetchAllRunActivities(String accessToken, int maxPages, Long afterEpochSec) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return fetchAthleteActivities(accessToken, maxPages, afterEpochSec, new Function1() { // from class: com.example.rungps.strava.StravaActivitiesApi$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean fetchAllRunActivities$lambda$1;
                fetchAllRunActivities$lambda$1 = StravaActivitiesApi.fetchAllRunActivities$lambda$1((StravaActivityJson) obj);
                return Boolean.valueOf(fetchAllRunActivities$lambda$1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchAllRunActivities$lambda$1(StravaActivityJson it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StravaActivityTypes.INSTANCE.isStravaRun(it.getType(), it.getSportType());
    }

    public static /* synthetic */ List fetchAllRideActivities$default(StravaActivitiesApi stravaActivitiesApi, String str, int i, Long l, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 25;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        return stravaActivitiesApi.fetchAllRideActivities(str, i, l);
    }

    public final List<StravaActivityJson> fetchAllRideActivities(String accessToken, int maxPages, Long afterEpochSec) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return fetchAthleteActivities(accessToken, maxPages, afterEpochSec, new Function1() { // from class: com.example.rungps.strava.StravaActivitiesApi$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean fetchAllRideActivities$lambda$2;
                fetchAllRideActivities$lambda$2 = StravaActivitiesApi.fetchAllRideActivities$lambda$2((StravaActivityJson) obj);
                return Boolean.valueOf(fetchAllRideActivities$lambda$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchAllRideActivities$lambda$2(StravaActivityJson it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StravaActivityTypes.INSTANCE.isStravaBike(it.getType(), it.getSportType());
    }

    public static /* synthetic */ List fetchTrainingActivities$default(StravaActivitiesApi stravaActivitiesApi, String str, int i, Long l, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        return stravaActivitiesApi.fetchTrainingActivities(str, i, l);
    }

    public final List<StravaActivityJson> fetchTrainingActivities(String accessToken, int maxPages, Long afterEpochSec) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return fetchAthleteActivities(accessToken, maxPages, afterEpochSec, new Function1() { // from class: com.example.rungps.strava.StravaActivitiesApi$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean fetchTrainingActivities$lambda$3;
                fetchTrainingActivities$lambda$3 = StravaActivitiesApi.fetchTrainingActivities$lambda$3((StravaActivityJson) obj);
                return Boolean.valueOf(fetchTrainingActivities$lambda$3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchTrainingActivities$lambda$3(StravaActivityJson it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StravaActivityTypes.INSTANCE.isStravaRun(it.getType(), it.getSportType()) || StravaActivityTypes.INSTANCE.isStravaBike(it.getType(), it.getSportType());
    }

    public static /* synthetic */ List fetchAllTrainingActivities$default(StravaActivitiesApi stravaActivitiesApi, String str, int i, Long l, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        return stravaActivitiesApi.fetchAllTrainingActivities(str, i, l);
    }

    public final List<StravaActivityJson> fetchAllTrainingActivities(String accessToken, int maxPages, Long afterEpochSec) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return fetchTrainingActivities(accessToken, maxPages, afterEpochSec);
    }

    public static /* synthetic */ List fetchTrainingActivitiesSince$default(StravaActivitiesApi stravaActivitiesApi, String str, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = 20;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 25;
        }
        return stravaActivitiesApi.fetchTrainingActivitiesSince(str, j, i4, i2);
    }

    public final List<StravaActivityJson> fetchTrainingActivitiesSince(String accessToken, long sinceMs, int maxPagesRecent, int maxPagesAfter) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        LinkedHashMap linkedHashMap = new LinkedHashMap(128);
        for (StravaActivityJson stravaActivityJson : fetchRecentTrainingActivities(accessToken, sinceMs, maxPagesRecent)) {
            linkedHashMap.put(Long.valueOf(stravaActivityJson.getId()), stravaActivityJson);
        }
        for (StravaActivityJson stravaActivityJson2 : fetchTrainingActivities(accessToken, maxPagesAfter, Long.valueOf(RangesKt.coerceAtLeast(sinceMs / 1000, 0L)))) {
            Long parseStartMs = parseStartMs(stravaActivityJson2.getStartDate(), stravaActivityJson2.getStartDateLocal());
            if (parseStartMs != null && parseStartMs.longValue() >= sinceMs && isTrainingActivityType(stravaActivityJson2.getType(), stravaActivityJson2.getSportType())) {
                linkedHashMap.putIfAbsent(Long.valueOf(stravaActivityJson2.getId()), stravaActivityJson2);
            }
        }
        Collection values = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return CollectionsKt.toList(values);
    }

    public static /* synthetic */ List fetchRecentTrainingActivities$default(StravaActivitiesApi stravaActivitiesApi, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 20;
        }
        return stravaActivitiesApi.fetchRecentTrainingActivities(str, j, i);
    }

    public final List<StravaActivityJson> fetchRecentTrainingActivities(String accessToken, long sinceMs, int maxPages) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        ArrayList arrayList = new ArrayList(128);
        for (int i = 1; i <= maxPages; i++) {
            List<StravaActivityJson> fetchActivitiesPage$default = fetchActivitiesPage$default(this, accessToken, i, null, 4, null);
            if (fetchActivitiesPage$default.isEmpty()) {
                break;
            }
            boolean z = false;
            boolean z2 = false;
            for (StravaActivityJson stravaActivityJson : fetchActivitiesPage$default) {
                Long parseStartMs = parseStartMs(stravaActivityJson.getStartDate(), stravaActivityJson.getStartDateLocal());
                if (parseStartMs != null) {
                    if (parseStartMs.longValue() < sinceMs) {
                        z = true;
                    } else {
                        if (isTrainingActivityType(stravaActivityJson.getType(), stravaActivityJson.getSportType())) {
                            arrayList.add(stravaActivityJson);
                        }
                        z2 = true;
                    }
                }
            }
            if (fetchActivitiesPage$default.size() < 200 || (z && !z2)) {
                break;
            }
        }
        return arrayList;
    }

    static /* synthetic */ List fetchAthleteActivities$default(StravaActivitiesApi stravaActivitiesApi, String str, int i, Long l, Function1 function1, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            l = null;
        }
        return stravaActivitiesApi.fetchAthleteActivities(str, i, l, function1);
    }

    private final List<StravaActivityJson> fetchAthleteActivities(String accessToken, int maxPages, Long afterEpochSec, Function1<? super StravaActivityJson, Boolean> include) {
        String str = null;
        if (afterEpochSec != null) {
            if (afterEpochSec.longValue() <= 0) {
                afterEpochSec = null;
            }
            if (afterEpochSec != null) {
                str = "&after=" + afterEpochSec.longValue();
            }
        }
        if (str == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList(512);
        for (int i = 1; i <= maxPages; i++) {
            List<StravaActivityJson> fetchActivitiesPage = fetchActivitiesPage(accessToken, i, str);
            if (fetchActivitiesPage.isEmpty()) {
                break;
            }
            for (StravaActivityJson stravaActivityJson : fetchActivitiesPage) {
                if (include.invoke(stravaActivityJson).booleanValue()) {
                    arrayList.add(stravaActivityJson);
                }
            }
            if (fetchActivitiesPage.size() < 200) {
                break;
            }
        }
        return arrayList;
    }

    static /* synthetic */ List fetchActivitiesPage$default(StravaActivitiesApi stravaActivitiesApi, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return stravaActivitiesApi.fetchActivitiesPage(str, i, str2);
    }

    private final List<StravaActivityJson> fetchActivitiesPage(String accessToken, int page, String extraQuery) {
        URLConnection openConnection = new URL("https://www.strava.com/api/v3/athlete/activities?per_page=200&page=" + page + extraQuery).openConnection();
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
            throw new IllegalStateException(("Strava activities HTTP " + responseCode + ": " + str).toString());
        }
        return (List) json.decodeFromString(listSerializer, str);
    }

    public static /* synthetic */ boolean isTrainingActivityType$default(StravaActivitiesApi stravaActivitiesApi, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return stravaActivitiesApi.isTrainingActivityType(str, str2);
    }

    public final boolean isTrainingActivityType(String type, String sportType) {
        Intrinsics.checkNotNullParameter(type, "type");
        return StravaActivityTypes.INSTANCE.isStravaRun(type, sportType) || StravaActivityTypes.INSTANCE.isStravaBike(type, sportType);
    }

    public static /* synthetic */ boolean isBikeType$default(StravaActivitiesApi stravaActivitiesApi, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return stravaActivitiesApi.isBikeType(str, str2);
    }

    public final boolean isBikeType(String type, String sportType) {
        Intrinsics.checkNotNullParameter(type, "type");
        return StravaActivityTypes.INSTANCE.isStravaBike(type, sportType);
    }

    public static /* synthetic */ Long parseStartMs$default(StravaActivitiesApi stravaActivitiesApi, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return stravaActivitiesApi.parseStartMs(str, str2);
    }

    public final Long parseStartMs(String startDate, String startDateLocal) {
        Long parseIsoMs;
        for (String str : CollectionsKt.listOf((Object[]) new String[]{startDate, startDateLocal})) {
            String str2 = str;
            if (str2 != null && !StringsKt.isBlank(str2) && (parseIsoMs = parseIsoMs(str)) != null) {
                return Long.valueOf(parseIsoMs.longValue());
            }
        }
        return null;
    }

    public final int effectiveMovingSec(StravaActivityJson activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Integer valueOf = Integer.valueOf(activity.getMovingTime());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        Integer valueOf2 = Integer.valueOf(activity.getElapsedTime());
        Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final Long parseIsoMs(String raw) {
        Object m7905constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            StravaActivitiesApi stravaActivitiesApi = this;
            m7905constructorimpl = Result.m7905constructorimpl(Long.valueOf(Instant.parse(StringsKt.trim((CharSequence) raw).toString()).toEpochMilli()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        return (Long) m7905constructorimpl;
    }
}
