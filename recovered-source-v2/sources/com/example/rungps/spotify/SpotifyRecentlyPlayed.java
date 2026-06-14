package com.example.rungps.spotify;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: SpotifyRecentlyPlayed.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/spotify/SpotifyRecentlyPlayed;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "fetchSince", "", "Lcom/example/rungps/spotify/SpotifyRecentlyPlayed$PlayedMoment;", "accessToken", "", "notBeforeMs", "", "maxItems", "", "fetchPage", "limit", "beforeMs", "(Ljava/lang/String;ILjava/lang/Long;)Ljava/util/List;", "PlayedMoment", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifyRecentlyPlayed {
    public static final SpotifyRecentlyPlayed INSTANCE = new SpotifyRecentlyPlayed();
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.example.rungps.spotify.SpotifyRecentlyPlayed$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit json$lambda$0;
            json$lambda$0 = SpotifyRecentlyPlayed.json$lambda$0((JsonBuilder) obj);
            return json$lambda$0;
        }
    }, 1, null);
    public static final int $stable = 8;

    private SpotifyRecentlyPlayed() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    /* compiled from: SpotifyRecentlyPlayed.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006'"}, d2 = {"Lcom/example/rungps/spotify/SpotifyRecentlyPlayed$PlayedMoment;", "", "playedAtMs", "", "itemType", "", "itemId", "title", "subtitle", "progressMs", "artUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getPlayedAtMs", "()J", "getItemType", "()Ljava/lang/String;", "getItemId", "getTitle", "getSubtitle", "getProgressMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getArtUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/example/rungps/spotify/SpotifyRecentlyPlayed$PlayedMoment;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlayedMoment {
        public static final int $stable = 0;
        private final String artUrl;
        private final String itemId;
        private final String itemType;
        private final long playedAtMs;
        private final Long progressMs;
        private final String subtitle;
        private final String title;

        /* renamed from: component1, reason: from getter */
        public final long getPlayedAtMs() {
            return this.playedAtMs;
        }

        /* renamed from: component2, reason: from getter */
        public final String getItemType() {
            return this.itemType;
        }

        /* renamed from: component3, reason: from getter */
        public final String getItemId() {
            return this.itemId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component6, reason: from getter */
        public final Long getProgressMs() {
            return this.progressMs;
        }

        /* renamed from: component7, reason: from getter */
        public final String getArtUrl() {
            return this.artUrl;
        }

        public final PlayedMoment copy(long playedAtMs, String itemType, String itemId, String title, String subtitle, Long progressMs, String artUrl) {
            return new PlayedMoment(playedAtMs, itemType, itemId, title, subtitle, progressMs, artUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlayedMoment)) {
                return false;
            }
            PlayedMoment playedMoment = (PlayedMoment) other;
            return this.playedAtMs == playedMoment.playedAtMs && Intrinsics.areEqual(this.itemType, playedMoment.itemType) && Intrinsics.areEqual(this.itemId, playedMoment.itemId) && Intrinsics.areEqual(this.title, playedMoment.title) && Intrinsics.areEqual(this.subtitle, playedMoment.subtitle) && Intrinsics.areEqual(this.progressMs, playedMoment.progressMs) && Intrinsics.areEqual(this.artUrl, playedMoment.artUrl);
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.playedAtMs) * 31;
            String str = this.itemType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.itemId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.subtitle;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Long l = this.progressMs;
            int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
            String str5 = this.artUrl;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "PlayedMoment(playedAtMs=" + this.playedAtMs + ", itemType=" + this.itemType + ", itemId=" + this.itemId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", progressMs=" + this.progressMs + ", artUrl=" + this.artUrl + ")";
        }

        public PlayedMoment(long j, String str, String str2, String str3, String str4, Long l, String str5) {
            this.playedAtMs = j;
            this.itemType = str;
            this.itemId = str2;
            this.title = str3;
            this.subtitle = str4;
            this.progressMs = l;
            this.artUrl = str5;
        }

        public /* synthetic */ PlayedMoment(long j, String str, String str2, String str3, String str4, Long l, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, str2, str3, str4, l, (i & 64) != 0 ? null : str5);
        }

        public final long getPlayedAtMs() {
            return this.playedAtMs;
        }

        public final String getItemType() {
            return this.itemType;
        }

        public final String getItemId() {
            return this.itemId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final Long getProgressMs() {
            return this.progressMs;
        }

        public final String getArtUrl() {
            return this.artUrl;
        }
    }

    public static /* synthetic */ List fetchSince$default(SpotifyRecentlyPlayed spotifyRecentlyPlayed, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1000;
        }
        return spotifyRecentlyPlayed.fetchSince(str, j, i);
    }

    public final List<PlayedMoment> fetchSince(String accessToken, long notBeforeMs, int maxItems) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        ArrayList arrayList = new ArrayList(RangesKt.coerceAtMost(maxItems, 1000));
        Long l = null;
        int i = 0;
        while (arrayList.size() < maxItems && i < 25) {
            i++;
            List<PlayedMoment> fetchPage = fetchPage(accessToken, RangesKt.coerceAtMost(50, maxItems - arrayList.size()), l);
            if (fetchPage.isEmpty()) {
                break;
            }
            for (PlayedMoment playedMoment : fetchPage) {
                if (playedMoment.getPlayedAtMs() < notBeforeMs) {
                    return arrayList;
                }
                arrayList.add(playedMoment);
                if (arrayList.size() >= maxItems) {
                    return arrayList;
                }
            }
            Long valueOf = Long.valueOf(((PlayedMoment) CollectionsKt.last((List) fetchPage)).getPlayedAtMs());
            if (fetchPage.size() < 50) {
                break;
            }
            l = valueOf;
        }
        return arrayList;
    }

    private final List<PlayedMoment> fetchPage(String accessToken, int limit, Long beforeMs) {
        PlayedMoment playedMoment;
        StringBuilder sb = new StringBuilder();
        sb.append("https://api.spotify.com/v1/me/player/recently-played?limit=" + limit);
        if (beforeMs != null) {
            sb.append("&before=" + beforeMs);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        URLConnection openConnection = new URL(sb2).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
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
            throw new IllegalStateException(("Spotify recently-played HTTP " + responseCode + ": " + str).toString());
        }
        List<SpotifyRecentlyPlayedItem> items = ((SpotifyRecentlyPlayedResponse) json.decodeFromString(SpotifyRecentlyPlayedResponse.INSTANCE.serializer(), str)).getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            playedMoment = SpotifyRecentlyPlayedKt.toPlayedMoment((SpotifyRecentlyPlayedItem) it.next());
            if (playedMoment != null) {
                arrayList.add(playedMoment);
            }
        }
        return arrayList;
    }
}
