package com.example.rungps.media;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.provider.Settings;
import android.support.v4.media.MediaMetadataCompat;
import androidx.core.content.ContextCompat;
import com.example.rungps.sleep.SleepAlarmPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DeviceNowPlaying.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0002J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0002¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/media/DeviceNowPlayingReader;", "", "<init>", "()V", "hasNotificationListenerAccess", "", "context", "Landroid/content/Context;", "read", "Lcom/example/rungps/media/DeviceNowPlaying;", "parseController", "controller", "Landroid/media/session/MediaController;", "primaryTitle", "", "Landroid/media/MediaMetadata;", "podcastOrAlbumName", "artistLine", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceNowPlayingReader {
    public static final int $stable = 0;
    public static final DeviceNowPlayingReader INSTANCE = new DeviceNowPlayingReader();

    private DeviceNowPlayingReader() {
    }

    public final boolean hasNotificationListenerAccess(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (string == null) {
            return false;
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return StringsKt.contains((CharSequence) string, (CharSequence) packageName, true);
    }

    private final DeviceNowPlaying parseController(MediaController controller) {
        String primaryTitle;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        String str6;
        String str7;
        String str8;
        String obj;
        String obj2;
        String str9;
        MediaMetadata metadata = controller.getMetadata();
        if (metadata == null || (primaryTitle = primaryTitle(metadata)) == null) {
            return null;
        }
        String podcastOrAlbumName = podcastOrAlbumName(metadata);
        String artistLine = artistLine(metadata);
        String string = metadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
        if (string == null || (str = StringsKt.trim((CharSequence) string).toString()) == null || StringsKt.isBlank(str)) {
            str = null;
        }
        PlaybackState playbackState = controller.getPlaybackState();
        boolean z2 = playbackState != null && playbackState.getState() == 3;
        String packageName = controller.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String lowerCase = packageName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str10 = lowerCase;
        boolean contains$default = StringsKt.contains$default((CharSequence) str10, (CharSequence) SleepAlarmPreferences.SOUND_SPOTIFY, false, 2, (Object) null);
        String str11 = (!contains$default || (str9 = artistLine) == null || StringsKt.isBlank(str9) || StringsKt.equals(artistLine, primaryTitle, true)) ? null : artistLine;
        String string2 = metadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        if (string2 == null || (str2 = StringsKt.trim((CharSequence) string2).toString()) == null || StringsKt.isBlank(str2)) {
            str2 = null;
        }
        String str12 = podcastOrAlbumName;
        if (str12 != null && !StringsKt.isBlank(str12) && !StringsKt.equals(podcastOrAlbumName, primaryTitle, true)) {
            str2 = podcastOrAlbumName;
        } else if (str11 != null) {
            str2 = str11;
        } else if (!contains$default || (str3 = str2) == null || StringsKt.isBlank(str3) || StringsKt.equals(str2, primaryTitle, true)) {
            String str13 = str;
            str2 = (str13 == null || StringsKt.isBlank(str13) || StringsKt.equals(str, primaryTitle, true) || str.length() >= primaryTitle.length()) ? null : str;
        }
        String str14 = str2;
        if ((str14 == null || StringsKt.isBlank(str14) || StringsKt.equals(str2, primaryTitle, true)) && ((!contains$default || str11 == null) && ((!contains$default || str12 == null || StringsKt.isBlank(str12) || StringsKt.equals(podcastOrAlbumName, primaryTitle, true)) && (!contains$default || (str5 = str) == null || StringsKt.isBlank(str5) || StringsKt.equals(str, primaryTitle, true) || str.length() > 120)))) {
            str4 = null;
            z = StringsKt.contains$default((CharSequence) str10, (CharSequence) "podcast", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str10, (CharSequence) "castbox", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str10, (CharSequence) "pocketcasts", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str10, (CharSequence) "antennapod", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str10, (CharSequence) "player.fm", false, 2, (Object) null);
        } else {
            z = true;
            str4 = null;
        }
        if (z && str12 != null && !StringsKt.isBlank(str12) && !StringsKt.equals(podcastOrAlbumName, primaryTitle, true)) {
            str6 = podcastOrAlbumName;
        } else if (!z || (str8 = artistLine) == null || StringsKt.isBlank(str8) || StringsKt.equals(artistLine, primaryTitle, true) || !(str12 == null || StringsKt.isBlank(str12))) {
            if (z && (str7 = str) != null && !StringsKt.isBlank(str7) && !StringsKt.equals(str, primaryTitle, true)) {
                if (str.length() > (str2 != null ? str2.length() : 0)) {
                    str6 = str;
                }
            }
            str6 = str2;
        } else {
            str6 = artistLine;
        }
        Bitmap bitmap = metadata.getBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
        if (bitmap == null && (bitmap = metadata.getBitmap(MediaMetadataCompat.METADATA_KEY_ART)) == null) {
            bitmap = metadata.getBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON);
        }
        String string3 = metadata.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI);
        if (string3 != null && (obj2 = StringsKt.trim((CharSequence) string3).toString()) != null) {
            if (StringsKt.isBlank(obj2)) {
                obj2 = str4;
            }
            if (obj2 != null) {
                str4 = obj2;
                String packageName2 = controller.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName2, "getPackageName(...)");
                return new DeviceNowPlaying(packageName2, primaryTitle, str6, artistLine, z2, z, bitmap, str4, controller);
            }
        }
        String string4 = metadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI);
        if (string4 != null && (obj = StringsKt.trim((CharSequence) string4).toString()) != null && !StringsKt.isBlank(obj)) {
            str4 = obj;
        }
        String packageName22 = controller.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName22, "getPackageName(...)");
        return new DeviceNowPlaying(packageName22, primaryTitle, str6, artistLine, z2, z, bitmap, str4, controller);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r2 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String primaryTitle(MediaMetadata mediaMetadata) {
        String obj;
        String string = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
        if (string != null && (obj = StringsKt.trim((CharSequence) string).toString()) != null) {
            if (StringsKt.isBlank(obj)) {
                obj = null;
            }
        }
        String string2 = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE);
        if (string2 == null || (obj = StringsKt.trim((CharSequence) string2).toString()) == null || StringsKt.isBlank(obj)) {
            return null;
        }
        return obj;
    }

    private final String podcastOrAlbumName(MediaMetadata mediaMetadata) {
        String obj;
        String obj2;
        String string = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_ALBUM);
        if (string != null && (obj2 = StringsKt.trim((CharSequence) string).toString()) != null) {
            if (StringsKt.isBlank(obj2)) {
                obj2 = null;
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        String string2 = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_COMPILATION);
        if (string2 == null || (obj = StringsKt.trim((CharSequence) string2).toString()) == null || StringsKt.isBlank(obj)) {
            return null;
        }
        return obj;
    }

    private final String artistLine(MediaMetadata mediaMetadata) {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        String string = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_ARTIST);
        if (string != null && (obj4 = StringsKt.trim((CharSequence) string).toString()) != null) {
            if (StringsKt.isBlank(obj4)) {
                obj4 = null;
            }
            if (obj4 != null) {
                return obj4;
            }
        }
        String string2 = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST);
        if (string2 != null && (obj3 = StringsKt.trim((CharSequence) string2).toString()) != null) {
            if (StringsKt.isBlank(obj3)) {
                obj3 = null;
            }
            if (obj3 != null) {
                return obj3;
            }
        }
        String string3 = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_AUTHOR);
        if (string3 != null && (obj2 = StringsKt.trim((CharSequence) string3).toString()) != null) {
            if (StringsKt.isBlank(obj2)) {
                obj2 = null;
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        String string4 = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_WRITER);
        if (string4 != null && (obj = StringsKt.trim((CharSequence) string4).toString()) != null) {
            if (StringsKt.isBlank(obj)) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final DeviceNowPlaying read(Context context) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        MediaSessionManager mediaSessionManager = (MediaSessionManager) ContextCompat.getSystemService(context, MediaSessionManager.class);
        Object obj = null;
        if (mediaSessionManager == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, (Class<?>) MediaSessionListenerService.class);
        try {
            Result.Companion companion = Result.INSTANCE;
            DeviceNowPlayingReader deviceNowPlayingReader = this;
            m7905constructorimpl = Result.m7905constructorimpl(mediaSessionManager.getActiveSessions(componentName));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        List<MediaController> list = (List) m7905constructorimpl;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (MediaController mediaController : list) {
            DeviceNowPlayingReader deviceNowPlayingReader2 = INSTANCE;
            Intrinsics.checkNotNull(mediaController);
            DeviceNowPlaying parseController = deviceNowPlayingReader2.parseController(mediaController);
            if (parseController != null) {
                arrayList.add(parseController);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return null;
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((DeviceNowPlaying) next).isPlaying()) {
                obj = next;
                break;
            }
        }
        DeviceNowPlaying deviceNowPlaying = (DeviceNowPlaying) obj;
        return deviceNowPlaying == null ? (DeviceNowPlaying) CollectionsKt.firstOrNull((List) arrayList2) : deviceNowPlaying;
    }
}
