package com.example.rungps.media;

import android.graphics.Bitmap;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.gym.AmbientSessionTagger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.maplibre.android.style.layers.Property;

/* compiled from: SessionMediaReader.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001e\u001a\u00020\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jt\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014¨\u00060"}, d2 = {"Lcom/example/rungps/media/SessionMediaSnapshot;", "", "title", "", "subtitle", "isPlaying", "", "itemType", "itemId", "progressMs", "", Property.SYMBOL_Z_ORDER_SOURCE, "artUrl", "deviceArt", "Landroid/graphics/Bitmap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Z", "getItemType", "getItemId", "getProgressMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSource", "getArtUrl", "getDeviceArt", "()Landroid/graphics/Bitmap;", "timelineKey", "isPodcast", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/example/rungps/media/SessionMediaSnapshot;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SessionMediaSnapshot {
    public static final int $stable = 8;
    private final String artUrl;
    private final Bitmap deviceArt;
    private final boolean isPlaying;
    private final String itemId;
    private final String itemType;
    private final Long progressMs;
    private final String source;
    private final String subtitle;
    private final String title;

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* renamed from: component4, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getProgressMs() {
        return this.progressMs;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final String getArtUrl() {
        return this.artUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final Bitmap getDeviceArt() {
        return this.deviceArt;
    }

    public final SessionMediaSnapshot copy(String title, String subtitle, boolean isPlaying, String itemType, String itemId, Long progressMs, String source, String artUrl, Bitmap deviceArt) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(source, "source");
        return new SessionMediaSnapshot(title, subtitle, isPlaying, itemType, itemId, progressMs, source, artUrl, deviceArt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionMediaSnapshot)) {
            return false;
        }
        SessionMediaSnapshot sessionMediaSnapshot = (SessionMediaSnapshot) other;
        return Intrinsics.areEqual(this.title, sessionMediaSnapshot.title) && Intrinsics.areEqual(this.subtitle, sessionMediaSnapshot.subtitle) && this.isPlaying == sessionMediaSnapshot.isPlaying && Intrinsics.areEqual(this.itemType, sessionMediaSnapshot.itemType) && Intrinsics.areEqual(this.itemId, sessionMediaSnapshot.itemId) && Intrinsics.areEqual(this.progressMs, sessionMediaSnapshot.progressMs) && Intrinsics.areEqual(this.source, sessionMediaSnapshot.source) && Intrinsics.areEqual(this.artUrl, sessionMediaSnapshot.artUrl) && Intrinsics.areEqual(this.deviceArt, sessionMediaSnapshot.deviceArt);
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isPlaying)) * 31;
        String str2 = this.itemType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.itemId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.progressMs;
        int hashCode5 = (((hashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.source.hashCode()) * 31;
        String str4 = this.artUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Bitmap bitmap = this.deviceArt;
        return hashCode6 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public String toString() {
        return "SessionMediaSnapshot(title=" + this.title + ", subtitle=" + this.subtitle + ", isPlaying=" + this.isPlaying + ", itemType=" + this.itemType + ", itemId=" + this.itemId + ", progressMs=" + this.progressMs + ", source=" + this.source + ", artUrl=" + this.artUrl + ", deviceArt=" + this.deviceArt + ")";
    }

    public SessionMediaSnapshot(String title, String str, boolean z, String str2, String str3, Long l, String source, String str4, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(source, "source");
        this.title = title;
        this.subtitle = str;
        this.isPlaying = z;
        this.itemType = str2;
        this.itemId = str3;
        this.progressMs = l;
        this.source = source;
        this.artUrl = str4;
        this.deviceArt = bitmap;
    }

    public /* synthetic */ SessionMediaSnapshot(String str, String str2, boolean z, String str3, String str4, Long l, String str5, String str6, Bitmap bitmap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, str3, str4, l, str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : bitmap);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Long getProgressMs() {
        return this.progressMs;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getArtUrl() {
        return this.artUrl;
    }

    public final Bitmap getDeviceArt() {
        return this.deviceArt;
    }

    public final String timelineKey() {
        String[] strArr = new String[4];
        String str = this.itemType;
        String str2 = AbstractJsonLexerKt.NULL;
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        strArr[0] = str;
        String str3 = this.itemId;
        if (str3 == null) {
            str3 = AbstractJsonLexerKt.NULL;
        }
        strArr[1] = str3;
        strArr[2] = this.title;
        String str4 = this.subtitle;
        if (str4 != null) {
            str2 = str4;
        }
        strArr[3] = str2;
        return CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) strArr), AmbientSessionTagger.CHIP_SEP, null, null, 0, null, null, 62, null);
    }

    public final boolean isPodcast() {
        String str;
        if (Intrinsics.areEqual(this.itemType, "episode")) {
            return true;
        }
        return (!Intrinsics.areEqual(this.source, "device") || (str = this.subtitle) == null || StringsKt.isBlank(str) || StringsKt.equals(this.subtitle, this.title, true)) ? false : true;
    }
}
