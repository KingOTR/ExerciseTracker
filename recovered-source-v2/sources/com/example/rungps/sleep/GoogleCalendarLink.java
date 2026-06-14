package com.example.rungps.sleep;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.example.rungps.gym.AmbientSessionTagger;
import com.example.rungps.sleep.SleepCalendarHelper;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GoogleCalendarLink.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fJ,\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ,\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ\"\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002JB\u0010\"\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00050#0!2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0002J\u001a\u0010(\u001a\u0004\u0018\u00010\u00052\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u000e\u0010*\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/example/rungps/sleep/GoogleCalendarLink;", "", "<init>", "()V", "PREFS", "", "KEY_LINKED", "KEY_EMAIL", "CALENDAR_SCOPE", "signInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "context", "Landroid/content/Context;", "isLinked", "", "linkedEmail", "lastAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "markLinked", "", "account", "disconnect", "tomorrowMorningCommitment", "Lcom/example/rungps/sleep/SleepCalendarHelper$MorningCommitment;", "travelBufferMin", "", "zone", "Ljava/time/ZoneId;", "(Landroid/content/Context;ILjava/time/ZoneId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tomorrowCommitment", "fetchTomorrowEvents", "accessToken", "listCalendarIds", "", "fetchCalendarEvents", "Lkotlin/Triple;", "", "calendarId", "timeMin", "timeMax", "httpGet", ImagesContract.URL, "formatLinkedStatus", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogleCalendarLink {
    public static final int $stable = 0;
    private static final String CALENDAR_SCOPE = "https://www.googleapis.com/auth/calendar.readonly";
    public static final GoogleCalendarLink INSTANCE = new GoogleCalendarLink();
    private static final String KEY_EMAIL = "email";
    private static final String KEY_LINKED = "linked";
    private static final String PREFS = "google_calendar_link";

    private GoogleCalendarLink() {
    }

    public final GoogleSignInClient signInClient(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        GoogleSignInClient client = GoogleSignIn.getClient(context, new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestScopes(new Scope(CALENDAR_SCOPE), new Scope[0]).build());
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    public final boolean isLinked(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getBoolean(KEY_LINKED, false) && lastAccount(context) != null;
    }

    public final String linkedEmail(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getString("email", null);
    }

    public final GoogleSignInAccount lastAccount(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(context);
        if (lastSignedInAccount == null || !GoogleSignIn.hasPermissions(lastSignedInAccount, new Scope(CALENDAR_SCOPE))) {
            return null;
        }
        return lastSignedInAccount;
    }

    public final void markLinked(Context context, GoogleSignInAccount account) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(account, "account");
        context.getSharedPreferences(PREFS, 0).edit().putBoolean(KEY_LINKED, true).putString("email", account.getEmail()).apply();
    }

    public final void disconnect(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().clear().apply();
        try {
            Result.Companion companion = Result.INSTANCE;
            GoogleCalendarLink googleCalendarLink = this;
            Result.m7905constructorimpl(signInClient(context).signOut());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static /* synthetic */ Object tomorrowMorningCommitment$default(GoogleCalendarLink googleCalendarLink, Context context, int i, ZoneId zoneId, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 30;
        }
        if ((i2 & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return googleCalendarLink.tomorrowMorningCommitment(context, i, zoneId, continuation);
    }

    public final Object tomorrowMorningCommitment(Context context, int i, ZoneId zoneId, Continuation<? super SleepCalendarHelper.MorningCommitment> continuation) {
        return tomorrowCommitment(context, i, zoneId, continuation);
    }

    public static /* synthetic */ Object tomorrowCommitment$default(GoogleCalendarLink googleCalendarLink, Context context, int i, ZoneId zoneId, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 30;
        }
        if ((i2 & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return googleCalendarLink.tomorrowCommitment(context, i, zoneId, continuation);
    }

    public final Object tomorrowCommitment(Context context, int i, ZoneId zoneId, Continuation<? super SleepCalendarHelper.MorningCommitment> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GoogleCalendarLink$tomorrowCommitment$2(context, i, zoneId, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.time.ZonedDateTime] */
    public final SleepCalendarHelper.MorningCommitment fetchTomorrowEvents(String accessToken, int travelBufferMin, ZoneId zone) {
        SleepCalendarHelper.MorningCommitment morningCommitment;
        LocalDate plusDays = LocalDate.now(zone).plusDays(1L);
        String instant = plusDays.atStartOfDay(zone).toInstant().toString();
        Intrinsics.checkNotNullExpressionValue(instant, "toString(...)");
        String instant2 = plusDays.plusDays(1L).atStartOfDay(zone).toInstant().toString();
        Intrinsics.checkNotNullExpressionValue(instant2, "toString(...)");
        long epochMilli = plusDays.atTime(5, 0).atZone(zone).toInstant().toEpochMilli();
        long epochMilli2 = plusDays.atTime(14, 0).atZone(zone).toInstant().toEpochMilli();
        List<String> listCalendarIds = listCalendarIds(accessToken);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> it = listCalendarIds.iterator();
        while (it.hasNext()) {
            for (Triple<String, Long, String> triple : fetchCalendarEvents(accessToken, it.next(), instant, instant2)) {
                String component1 = triple.component1();
                long longValue = triple.component2().longValue();
                linkedHashMap.putIfAbsent(longValue + AmbientSessionTagger.CHIP_SEP + component1, new Triple(component1, Long.valueOf(longValue), triple.component3()));
                it = it;
                instant2 = instant2;
            }
        }
        SleepCalendarHelper.MorningCommitment morningCommitment2 = null;
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("h:mm a");
        Collection values = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        List<Triple> sortedWith = CollectionsKt.sortedWith(values, new Comparator() { // from class: com.example.rungps.sleep.GoogleCalendarLink$fetchTomorrowEvents$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Long) ((Triple) t).getSecond(), (Long) ((Triple) t2).getSecond());
            }
        });
        loop2: while (true) {
            morningCommitment = morningCommitment2;
            for (Triple triple2 : sortedWith) {
                String str = (String) triple2.component1();
                long longValue2 = ((Number) triple2.component2()).longValue();
                String str2 = (String) triple2.component3();
                if (epochMilli <= longValue2 && longValue2 <= epochMilli2) {
                    morningCommitment2 = new SleepCalendarHelper.MorningCommitment(str, longValue2, str2, str2 != null ? travelBufferMin : RangesKt.coerceAtLeast(travelBufferMin / 2, 15), null, null, 48, null);
                    if (morningCommitment == null || longValue2 < morningCommitment.getStartMs()) {
                    }
                }
            }
            break loop2;
        }
        List<Triple> take = CollectionsKt.take(sortedWith, 8);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
        for (Triple triple3 : take) {
            String str3 = (String) triple3.component1();
            long longValue3 = ((Number) triple3.component2()).longValue();
            String str4 = (String) triple3.component3();
            String format = Instant.ofEpochMilli(longValue3).atZone(zone).format(ofPattern);
            arrayList.add((str4 != null ? new StringBuilder().append(format).append(" · ").append(str3).append(" (").append(str4).append(")") : new StringBuilder().append(format).append(" · ").append(str3)).toString());
        }
        ArrayList arrayList2 = arrayList;
        Object first = CollectionsKt.first((List<? extends Object>) sortedWith);
        Intrinsics.checkNotNullExpressionValue(first, "first(...)");
        Triple triple4 = (Triple) first;
        String str5 = sortedWith.size() == 1 ? (String) triple4.getFirst() : "Tomorrow · " + sortedWith.size() + " events";
        long longValue4 = ((Number) triple4.getSecond()).longValue();
        String str6 = (String) triple4.getThird();
        ArrayList arrayList3 = arrayList2;
        SleepCalendarHelper.MorningCommitment morningCommitment3 = new SleepCalendarHelper.MorningCommitment(str5, longValue4, str6, 15, CollectionsKt.joinToString$default(arrayList3, " · ", null, null, 0, null, null, 62, null), arrayList2);
        if (morningCommitment != null) {
            return SleepCalendarHelper.MorningCommitment.copy$default(morningCommitment, sortedWith.size() == 1 ? morningCommitment.getTitle() : "Tomorrow · " + sortedWith.size() + " events", 0L, null, 0, CollectionsKt.joinToString$default(arrayList3, " · ", null, null, 0, null, null, 62, null), arrayList2, 14, null);
        }
        return morningCommitment3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<String> listCalendarIds(String accessToken) {
        Object m7905constructorimpl;
        ArrayList arrayList = new ArrayList(16);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (int i = 0; i < 5; i++) {
            StringBuilder sb = new StringBuilder("https://www.googleapis.com/calendar/v3/users/me/calendarList?maxResults=250");
            if (objectRef.element != 0) {
                sb.append("&pageToken=").append(URLEncoder.encode((String) objectRef.element, "UTF-8"));
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            String httpGet = INSTANCE.httpGet(sb2, accessToken);
            if (httpGet != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(new JSONObject(httpGet));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    m7905constructorimpl = null;
                }
                JSONObject jSONObject = (JSONObject) m7905constructorimpl;
                if (jSONObject != null) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("items");
                    if (optJSONArray == null) {
                        optJSONArray = new JSONArray();
                    }
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        if (jSONObject2.optBoolean("selected", true) && !jSONObject2.optBoolean("hidden", false)) {
                            String optString = jSONObject2.optString("id");
                            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                            String obj = StringsKt.trim((CharSequence) optString).toString();
                            if (obj.length() <= 0) {
                                obj = null;
                            }
                            if (obj != null) {
                                arrayList.add(obj);
                            }
                        }
                    }
                    String optString2 = jSONObject.optString("nextPageToken");
                    Intrinsics.checkNotNull(optString2);
                    objectRef.element = Boolean.valueOf(StringsKt.isBlank(optString2) ^ true).booleanValue() ? optString2 : 0;
                    if (objectRef.element == 0) {
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2.isEmpty()) {
                            arrayList2 = CollectionsKt.listOf("primary");
                        }
                        return arrayList2;
                    }
                } else {
                    continue;
                }
            }
        }
        ArrayList arrayList3 = arrayList;
        if (arrayList3.isEmpty()) {
            arrayList3 = CollectionsKt.listOf("primary");
        }
        return arrayList3;
    }

    private final List<Triple<String, Long, String>> fetchCalendarEvents(String accessToken, String calendarId, String timeMin, String timeMax) {
        Object m7905constructorimpl;
        Object m7905constructorimpl2;
        String encode = URLEncoder.encode(calendarId, "UTF-8");
        StringBuilder sb = new StringBuilder("https://www.googleapis.com/calendar/v3/calendars/");
        sb.append(encode);
        sb.append("/events?singleEvents=true&orderBy=startTime&maxResults=250&timeMin=");
        sb.append(URLEncoder.encode(timeMin, "UTF-8"));
        sb.append("&timeMax=").append(URLEncoder.encode(timeMax, "UTF-8"));
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        String httpGet = httpGet(sb2, accessToken);
        if (httpGet == null) {
            return CollectionsKt.emptyList();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            GoogleCalendarLink googleCalendarLink = this;
            m7905constructorimpl = Result.m7905constructorimpl(new JSONObject(httpGet).optJSONArray("items"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        JSONArray jSONArray = (JSONArray) m7905constructorimpl;
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        ArrayList arrayList = new ArrayList(32);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            JSONObject optJSONObject = jSONObject.optJSONObject("start");
            if (optJSONObject != null && optJSONObject.has("dateTime")) {
                String string = jSONObject.getJSONObject("start").getString("dateTime");
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    GoogleCalendarLink googleCalendarLink2 = this;
                    m7905constructorimpl2 = Result.m7905constructorimpl(Long.valueOf(Instant.parse(string).toEpochMilli()));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                    m7905constructorimpl2 = null;
                }
                Long l = (Long) m7905constructorimpl2;
                if (l != null) {
                    long longValue = l.longValue();
                    String optString = jSONObject.optString("summary", "Event");
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    String obj = StringsKt.trim((CharSequence) optString).toString();
                    String str = StringsKt.isBlank(obj) ? "Event" : obj;
                    String optString2 = jSONObject.optString("location", "");
                    Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                    String obj2 = StringsKt.trim((CharSequence) optString2).toString();
                    if (obj2.length() <= 0) {
                        obj2 = null;
                    }
                    arrayList.add(new Triple(str, Long.valueOf(longValue), obj2));
                }
            }
        }
        return arrayList;
    }

    private final String httpGet(String url, String accessToken) {
        URLConnection openConnection = new URL(url).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        httpURLConnection.setConnectTimeout(12000);
        httpURLConnection.setReadTimeout(SleepSonarProbe.CHIRP_MIN_HZ);
        int responseCode = httpURLConnection.getResponseCode();
        if (200 > responseCode || responseCode >= 300) {
            return null;
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
        return TextStreamsKt.readText(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
    }

    public final String formatLinkedStatus(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String linkedEmail = linkedEmail(context);
        return linkedEmail != null ? "Google Calendar linked · " + linkedEmail : "Google Calendar linked";
    }
}
