package com.example.rungps.media;

import android.graphics.Bitmap;
import android.media.session.MediaController;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DeviceNowPlaying.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012¨\u0006-"}, d2 = {"Lcom/example/rungps/media/DeviceNowPlaying;", "", "packageName", "", "title", "showOrAlbum", "artist", "isPlaying", "", "isPodcast", "art", "Landroid/graphics/Bitmap;", "artUri", "controller", "Landroid/media/session/MediaController;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLandroid/graphics/Bitmap;Ljava/lang/String;Landroid/media/session/MediaController;)V", "getPackageName", "()Ljava/lang/String;", "getTitle", "getShowOrAlbum", "getArtist", "()Z", "getArt", "()Landroid/graphics/Bitmap;", "getArtUri", "getController", "()Landroid/media/session/MediaController;", "displaySubtitle", "getDisplaySubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeviceNowPlaying {
    public static final int $stable = 8;
    private final Bitmap art;
    private final String artUri;
    private final String artist;
    private final MediaController controller;
    private final boolean isPlaying;
    private final boolean isPodcast;
    private final String packageName;
    private final String showOrAlbum;
    private final String title;

    /* renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getShowOrAlbum() {
        return this.showOrAlbum;
    }

    /* renamed from: component4, reason: from getter */
    public final String getArtist() {
        return this.artist;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsPodcast() {
        return this.isPodcast;
    }

    /* renamed from: component7, reason: from getter */
    public final Bitmap getArt() {
        return this.art;
    }

    /* renamed from: component8, reason: from getter */
    public final String getArtUri() {
        return this.artUri;
    }

    /* renamed from: component9, reason: from getter */
    public final MediaController getController() {
        return this.controller;
    }

    public final DeviceNowPlaying copy(String packageName, String title, String showOrAlbum, String artist, boolean isPlaying, boolean isPodcast, Bitmap art, String artUri, MediaController controller) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new DeviceNowPlaying(packageName, title, showOrAlbum, artist, isPlaying, isPodcast, art, artUri, controller);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceNowPlaying)) {
            return false;
        }
        DeviceNowPlaying deviceNowPlaying = (DeviceNowPlaying) other;
        return Intrinsics.areEqual(this.packageName, deviceNowPlaying.packageName) && Intrinsics.areEqual(this.title, deviceNowPlaying.title) && Intrinsics.areEqual(this.showOrAlbum, deviceNowPlaying.showOrAlbum) && Intrinsics.areEqual(this.artist, deviceNowPlaying.artist) && this.isPlaying == deviceNowPlaying.isPlaying && this.isPodcast == deviceNowPlaying.isPodcast && Intrinsics.areEqual(this.art, deviceNowPlaying.art) && Intrinsics.areEqual(this.artUri, deviceNowPlaying.artUri) && Intrinsics.areEqual(this.controller, deviceNowPlaying.controller);
    }

    public int hashCode() {
        int hashCode = this.packageName.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.showOrAlbum;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.artist;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isPlaying)) * 31) + Boolean.hashCode(this.isPodcast)) * 31;
        Bitmap bitmap = this.art;
        int hashCode5 = (hashCode4 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        String str4 = this.artUri;
        return ((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.controller.hashCode();
    }

    public String toString() {
        return "DeviceNowPlaying(packageName=" + this.packageName + ", title=" + this.title + ", showOrAlbum=" + this.showOrAlbum + ", artist=" + this.artist + ", isPlaying=" + this.isPlaying + ", isPodcast=" + this.isPodcast + ", art=" + this.art + ", artUri=" + this.artUri + ", controller=" + this.controller + ")";
    }

    public DeviceNowPlaying(String packageName, String str, String str2, String str3, boolean z, boolean z2, Bitmap bitmap, String str4, MediaController controller) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.packageName = packageName;
        this.title = str;
        this.showOrAlbum = str2;
        this.artist = str3;
        this.isPlaying = z;
        this.isPodcast = z2;
        this.art = bitmap;
        this.artUri = str4;
        this.controller = controller;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getShowOrAlbum() {
        return this.showOrAlbum;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final boolean isPodcast() {
        return this.isPodcast;
    }

    public final Bitmap getArt() {
        return this.art;
    }

    public final String getArtUri() {
        return this.artUri;
    }

    public final MediaController getController() {
        return this.controller;
    }

    public final String getDisplaySubtitle() {
        String str;
        if (this.isPodcast && (str = this.showOrAlbum) != null && !StringsKt.isBlank(str) && !StringsKt.equals(this.showOrAlbum, this.title, true)) {
            return this.showOrAlbum;
        }
        String str2 = this.artist;
        if (str2 == null || StringsKt.isBlank(str2) || StringsKt.equals(this.artist, this.title, true)) {
            return null;
        }
        return this.artist;
    }
}
