package com.example.rungps.media;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.webkit.ProxyConfig;
import com.example.rungps.data.Repository;
import com.example.rungps.gym.AmbientSessionTagger;
import com.example.rungps.sleep.SleepAlarmPreferences;
import com.example.rungps.spotify.SpotifyAlbum;
import com.example.rungps.spotify.SpotifyArtist;
import com.example.rungps.spotify.SpotifyItem;
import com.example.rungps.spotify.SpotifyNowPlaying;
import com.example.rungps.spotify.SpotifyShow;
import com.example.rungps.spotify.SpotifyWebApiKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SessionMediaReader.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/media/SessionMediaReader;", "", "<init>", "()V", "read", "Lcom/example/rungps/media/SessionMediaSnapshot;", "context", "Landroid/content/Context;", "repo", "Lcom/example/rungps/data/Repository;", "(Landroid/content/Context;Lcom/example/rungps/data/Repository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "merge", "device", SleepAlarmPreferences.SOUND_SPOTIFY, "finalizeArt", "snap", "(Landroid/content/Context;Lcom/example/rungps/media/SessionMediaSnapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fromSpotify", "np", "Lcom/example/rungps/spotify/SpotifyNowPlaying;", "fromDevice", "dev", "Lcom/example/rungps/media/DeviceNowPlaying;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SessionMediaReader {
    public static final int $stable = 0;
    public static final SessionMediaReader INSTANCE = new SessionMediaReader();

    private SessionMediaReader() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object read(Context context, Repository repository, Continuation<? super SessionMediaSnapshot> continuation) {
        SessionMediaReader$read$1 sessionMediaReader$read$1;
        int i;
        SessionMediaSnapshot fromDevice;
        SessionMediaReader sessionMediaReader;
        SessionMediaSnapshot sessionMediaSnapshot;
        Context context2;
        DeviceNowPlaying deviceNowPlaying;
        Throwable th;
        DeviceNowPlaying deviceNowPlaying2;
        Object m7905constructorimpl;
        SessionMediaSnapshot sessionMediaSnapshot2;
        boolean z;
        boolean z2;
        SpotifyNowPlaying spotifyNowPlaying;
        if (continuation instanceof SessionMediaReader$read$1) {
            sessionMediaReader$read$1 = (SessionMediaReader$read$1) continuation;
            if ((sessionMediaReader$read$1.label & Integer.MIN_VALUE) != 0) {
                sessionMediaReader$read$1.label -= Integer.MIN_VALUE;
                Object obj = sessionMediaReader$read$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionMediaReader$read$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DeviceNowPlaying read = DeviceNowPlayingReader.INSTANCE.hasNotificationListenerAccess(context) ? DeviceNowPlayingReader.INSTANCE.read(context) : null;
                    fromDevice = read != null ? INSTANCE.fromDevice(read) : null;
                    if (repository.isSpotifyConnected()) {
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            SessionMediaReader sessionMediaReader2 = this;
                            sessionMediaReader$read$1.L$0 = this;
                            sessionMediaReader$read$1.L$1 = context;
                            sessionMediaReader$read$1.L$2 = read;
                            sessionMediaReader$read$1.L$3 = fromDevice;
                            sessionMediaReader$read$1.label = 1;
                            Object spotifyNowPlaying2 = repository.spotifyNowPlaying(sessionMediaReader$read$1);
                            if (spotifyNowPlaying2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            SessionMediaSnapshot sessionMediaSnapshot3 = fromDevice;
                            sessionMediaReader = this;
                            sessionMediaSnapshot = sessionMediaSnapshot3;
                            context2 = context;
                            deviceNowPlaying = read;
                            obj = spotifyNowPlaying2;
                        } catch (Throwable th2) {
                            SessionMediaSnapshot sessionMediaSnapshot4 = fromDevice;
                            sessionMediaReader = this;
                            sessionMediaSnapshot = sessionMediaSnapshot4;
                            context2 = context;
                            deviceNowPlaying = read;
                            th = th2;
                            Result.Companion companion2 = Result.INSTANCE;
                            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                            SessionMediaReader sessionMediaReader3 = sessionMediaReader;
                            fromDevice = sessionMediaSnapshot;
                            this = sessionMediaReader3;
                            Context context3 = context2;
                            deviceNowPlaying2 = deviceNowPlaying;
                            context = context3;
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            }
                            spotifyNowPlaying = (SpotifyNowPlaying) m7905constructorimpl;
                            if (spotifyNowPlaying != null) {
                            }
                            sessionMediaSnapshot2 = null;
                            z = false;
                            if (fromDevice == null) {
                            }
                            if (sessionMediaSnapshot2 != null) {
                            }
                            if (!z2) {
                            }
                            if (!z2) {
                            }
                            if (sessionMediaSnapshot2 != null) {
                            }
                        }
                    } else {
                        deviceNowPlaying2 = read;
                        sessionMediaSnapshot2 = null;
                        z = false;
                        z2 = fromDevice == null && deviceNowPlaying2 != null && (deviceNowPlaying2.isPlaying() || fromDevice.isPodcast());
                        if (sessionMediaSnapshot2 != null && (sessionMediaSnapshot2.isPlaying() || sessionMediaSnapshot2.isPodcast())) {
                            z = true;
                        }
                        if (!z2 && z && deviceNowPlaying2 != null) {
                            StringsKt.contains((CharSequence) deviceNowPlaying2.getPackageName(), (CharSequence) SleepAlarmPreferences.SOUND_SPOTIFY, true);
                            sessionMediaSnapshot2 = this.merge(fromDevice, sessionMediaSnapshot2);
                        } else if (!z2) {
                            sessionMediaSnapshot2 = fromDevice;
                        } else if (!z) {
                            sessionMediaSnapshot2 = null;
                        }
                        if (sessionMediaSnapshot2 != null) {
                            return null;
                        }
                        sessionMediaReader$read$1.L$0 = null;
                        sessionMediaReader$read$1.L$1 = null;
                        sessionMediaReader$read$1.L$2 = null;
                        sessionMediaReader$read$1.L$3 = null;
                        sessionMediaReader$read$1.label = 2;
                        obj = this.finalizeArt(context, sessionMediaSnapshot2, sessionMediaReader$read$1);
                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionMediaSnapshot = (SessionMediaSnapshot) sessionMediaReader$read$1.L$3;
                    deviceNowPlaying = (DeviceNowPlaying) sessionMediaReader$read$1.L$2;
                    context2 = (Context) sessionMediaReader$read$1.L$1;
                    sessionMediaReader = (SessionMediaReader) sessionMediaReader$read$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion22 = Result.INSTANCE;
                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        SessionMediaReader sessionMediaReader32 = sessionMediaReader;
                        fromDevice = sessionMediaSnapshot;
                        this = sessionMediaReader32;
                        Context context32 = context2;
                        deviceNowPlaying2 = deviceNowPlaying;
                        context = context32;
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        spotifyNowPlaying = (SpotifyNowPlaying) m7905constructorimpl;
                        if (spotifyNowPlaying != null) {
                        }
                        sessionMediaSnapshot2 = null;
                        z = false;
                        if (fromDevice == null) {
                        }
                        if (sessionMediaSnapshot2 != null) {
                        }
                        if (!z2) {
                        }
                        if (!z2) {
                        }
                        if (sessionMediaSnapshot2 != null) {
                        }
                    }
                }
                m7905constructorimpl = Result.m7905constructorimpl((SpotifyNowPlaying) obj);
                SessionMediaReader sessionMediaReader322 = sessionMediaReader;
                fromDevice = sessionMediaSnapshot;
                this = sessionMediaReader322;
                Context context322 = context2;
                deviceNowPlaying2 = deviceNowPlaying;
                context = context322;
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    m7905constructorimpl = null;
                }
                spotifyNowPlaying = (SpotifyNowPlaying) m7905constructorimpl;
                if (spotifyNowPlaying != null) {
                    sessionMediaSnapshot2 = INSTANCE.fromSpotify(spotifyNowPlaying);
                    z = false;
                    if (fromDevice == null) {
                    }
                    if (sessionMediaSnapshot2 != null) {
                        z = true;
                    }
                    if (!z2) {
                    }
                    if (!z2) {
                    }
                    if (sessionMediaSnapshot2 != null) {
                    }
                }
                sessionMediaSnapshot2 = null;
                z = false;
                if (fromDevice == null) {
                }
                if (sessionMediaSnapshot2 != null) {
                }
                if (!z2) {
                }
                if (!z2) {
                }
                if (sessionMediaSnapshot2 != null) {
                }
            }
        }
        sessionMediaReader$read$1 = new SessionMediaReader$read$1(this, continuation);
        Object obj2 = sessionMediaReader$read$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionMediaReader$read$1.label;
        if (i != 0) {
        }
        m7905constructorimpl = Result.m7905constructorimpl((SpotifyNowPlaying) obj2);
        SessionMediaReader sessionMediaReader3222 = sessionMediaReader;
        fromDevice = sessionMediaSnapshot;
        this = sessionMediaReader3222;
        Context context3222 = context2;
        deviceNowPlaying2 = deviceNowPlaying;
        context = context3222;
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
        }
        spotifyNowPlaying = (SpotifyNowPlaying) m7905constructorimpl;
        if (spotifyNowPlaying != null) {
        }
        sessionMediaSnapshot2 = null;
        z = false;
        if (fromDevice == null) {
        }
        if (sessionMediaSnapshot2 != null) {
        }
        if (!z2) {
        }
        if (!z2) {
        }
        if (sessionMediaSnapshot2 != null) {
        }
    }

    private final SessionMediaSnapshot merge(SessionMediaSnapshot device, SessionMediaSnapshot spotify) {
        String title;
        String subtitle;
        String subtitle2;
        if (device == null) {
            return spotify;
        }
        if (spotify == null) {
            return device;
        }
        boolean z = Intrinsics.areEqual(spotify.getItemType(), "episode") || Intrinsics.areEqual(device.getItemType(), "episode");
        if (!z || StringsKt.isBlank(spotify.getTitle())) {
            title = !StringsKt.isBlank(device.getTitle()) ? device.getTitle() : spotify.getTitle();
        } else {
            title = spotify.getTitle();
        }
        String str = title;
        if (!z || (subtitle2 = spotify.getSubtitle()) == null || StringsKt.isBlank(subtitle2)) {
            String subtitle3 = device.getSubtitle();
            subtitle = (subtitle3 == null || StringsKt.isBlank(subtitle3)) ? spotify.getSubtitle() : device.getSubtitle();
        } else {
            subtitle = spotify.getSubtitle();
        }
        String str2 = subtitle;
        boolean z2 = device.isPlaying() || spotify.isPlaying();
        String itemType = spotify.getItemType();
        if (itemType == null) {
            itemType = device.getItemType();
        }
        String str3 = itemType;
        String itemId = spotify.getItemId();
        if (itemId == null) {
            itemId = device.getItemId();
        }
        String str4 = itemId;
        Long progressMs = spotify.getProgressMs();
        if (progressMs == null) {
            progressMs = device.getProgressMs();
        }
        Long l = progressMs;
        String source = Intrinsics.areEqual(spotify.getSource(), SleepAlarmPreferences.SOUND_SPOTIFY) ? SleepAlarmPreferences.SOUND_SPOTIFY : device.getSource();
        String artUrl = spotify.getArtUrl();
        if (artUrl == null) {
            artUrl = device.getArtUrl();
        }
        return new SessionMediaSnapshot(str, str2, z2, str3, str4, l, source, artUrl, device.getDeviceArt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object finalizeArt(Context context, SessionMediaSnapshot sessionMediaSnapshot, Continuation<? super SessionMediaSnapshot> continuation) {
        SessionMediaReader$finalizeArt$1 sessionMediaReader$finalizeArt$1;
        int i;
        SessionMediaSnapshot sessionMediaSnapshot2;
        String str;
        String artUrl;
        SessionMediaSnapshot copy;
        if (continuation instanceof SessionMediaReader$finalizeArt$1) {
            sessionMediaReader$finalizeArt$1 = (SessionMediaReader$finalizeArt$1) continuation;
            if ((sessionMediaReader$finalizeArt$1.label & Integer.MIN_VALUE) != 0) {
                sessionMediaReader$finalizeArt$1.label -= Integer.MIN_VALUE;
                Object obj = sessionMediaReader$finalizeArt$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sessionMediaReader$finalizeArt$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String valueOf = String.valueOf(sessionMediaSnapshot.timelineKey().hashCode());
                    if (sessionMediaSnapshot.getDeviceArt() != null) {
                        MediaArtCache mediaArtCache = MediaArtCache.INSTANCE;
                        Bitmap deviceArt = sessionMediaSnapshot.getDeviceArt();
                        sessionMediaReader$finalizeArt$1.L$0 = sessionMediaSnapshot;
                        sessionMediaReader$finalizeArt$1.label = 1;
                        obj = mediaArtCache.persistBitmap(context, valueOf, deviceArt, sessionMediaReader$finalizeArt$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        artUrl = (String) obj;
                    } else {
                        String artUrl2 = sessionMediaSnapshot.getArtUrl();
                        if (artUrl2 == null || StringsKt.isBlank(artUrl2) || !StringsKt.startsWith$default(sessionMediaSnapshot.getArtUrl(), "content://", false, 2, (Object) null)) {
                            String artUrl3 = sessionMediaSnapshot.getArtUrl();
                            if (artUrl3 != null && !StringsKt.isBlank(artUrl3) && !StringsKt.startsWith$default(sessionMediaSnapshot.getArtUrl(), DomExceptionUtils.SEPARATOR, false, 2, (Object) null)) {
                                MediaArtCache mediaArtCache2 = MediaArtCache.INSTANCE;
                                String artUrl4 = sessionMediaSnapshot.getArtUrl();
                                sessionMediaReader$finalizeArt$1.L$0 = sessionMediaSnapshot;
                                sessionMediaReader$finalizeArt$1.label = 2;
                                obj = mediaArtCache2.ensureLocalPath(context, artUrl4, valueOf, sessionMediaReader$finalizeArt$1);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                artUrl = (String) obj;
                            } else {
                                String artUrl5 = sessionMediaSnapshot.getArtUrl();
                                if (artUrl5 == null || StringsKt.isBlank(artUrl5)) {
                                    sessionMediaSnapshot2 = sessionMediaSnapshot;
                                    str = null;
                                    copy = sessionMediaSnapshot2.copy((r20 & 1) != 0 ? sessionMediaSnapshot2.title : null, (r20 & 2) != 0 ? sessionMediaSnapshot2.subtitle : null, (r20 & 4) != 0 ? sessionMediaSnapshot2.isPlaying : false, (r20 & 8) != 0 ? sessionMediaSnapshot2.itemType : null, (r20 & 16) != 0 ? sessionMediaSnapshot2.itemId : null, (r20 & 32) != 0 ? sessionMediaSnapshot2.progressMs : null, (r20 & 64) != 0 ? sessionMediaSnapshot2.source : null, (r20 & 128) != 0 ? sessionMediaSnapshot2.artUrl : str, (r20 & 256) != 0 ? sessionMediaSnapshot2.deviceArt : null);
                                    return copy;
                                }
                                artUrl = sessionMediaSnapshot.getArtUrl();
                            }
                        } else {
                            artUrl = sessionMediaSnapshot.getArtUrl();
                        }
                    }
                } else if (i == 1) {
                    sessionMediaSnapshot = (SessionMediaSnapshot) sessionMediaReader$finalizeArt$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    artUrl = (String) obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionMediaSnapshot = (SessionMediaSnapshot) sessionMediaReader$finalizeArt$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    artUrl = (String) obj;
                }
                str = artUrl;
                sessionMediaSnapshot2 = sessionMediaSnapshot;
                copy = sessionMediaSnapshot2.copy((r20 & 1) != 0 ? sessionMediaSnapshot2.title : null, (r20 & 2) != 0 ? sessionMediaSnapshot2.subtitle : null, (r20 & 4) != 0 ? sessionMediaSnapshot2.isPlaying : false, (r20 & 8) != 0 ? sessionMediaSnapshot2.itemType : null, (r20 & 16) != 0 ? sessionMediaSnapshot2.itemId : null, (r20 & 32) != 0 ? sessionMediaSnapshot2.progressMs : null, (r20 & 64) != 0 ? sessionMediaSnapshot2.source : null, (r20 & 128) != 0 ? sessionMediaSnapshot2.artUrl : str, (r20 & 256) != 0 ? sessionMediaSnapshot2.deviceArt : null);
                return copy;
            }
        }
        sessionMediaReader$finalizeArt$1 = new SessionMediaReader$finalizeArt$1(this, continuation);
        Object obj2 = sessionMediaReader$finalizeArt$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sessionMediaReader$finalizeArt$1.label;
        if (i != 0) {
        }
        str = artUrl;
        sessionMediaSnapshot2 = sessionMediaSnapshot;
        copy = sessionMediaSnapshot2.copy((r20 & 1) != 0 ? sessionMediaSnapshot2.title : null, (r20 & 2) != 0 ? sessionMediaSnapshot2.subtitle : null, (r20 & 4) != 0 ? sessionMediaSnapshot2.isPlaying : false, (r20 & 8) != 0 ? sessionMediaSnapshot2.itemType : null, (r20 & 16) != 0 ? sessionMediaSnapshot2.itemId : null, (r20 & 32) != 0 ? sessionMediaSnapshot2.progressMs : null, (r20 & 64) != 0 ? sessionMediaSnapshot2.source : null, (r20 & 128) != 0 ? sessionMediaSnapshot2.artUrl : str, (r20 & 256) != 0 ? sessionMediaSnapshot2.deviceArt : null);
        return copy;
    }

    private final SessionMediaSnapshot fromSpotify(SpotifyNowPlaying np) {
        String str;
        String str2;
        String str3;
        String str4;
        List<SpotifyArtist> artists;
        SpotifyArtist spotifyArtist;
        String name;
        String bestCoverUrl;
        String str5;
        String str6;
        String str7;
        String name2;
        SpotifyItem item = np.getItem();
        SessionMediaSnapshot sessionMediaSnapshot = null;
        sessionMediaSnapshot = null;
        if (item == null) {
            return null;
        }
        SpotifyShow show = item.getShow();
        if (show == null || (name2 = show.getName()) == null || (str = StringsKt.trim((CharSequence) name2).toString()) == null || StringsKt.isBlank(str)) {
            str = null;
        }
        String name3 = item.getName();
        if (name3 == null || (str2 = StringsKt.trim((CharSequence) name3).toString()) == null || StringsKt.isBlank(str2)) {
            str2 = null;
        }
        String str8 = "episode";
        boolean z = Intrinsics.areEqual(np.getType(), "episode") || str != null;
        if ((!z || (str7 = str2) == null || StringsKt.isBlank(str7)) && ((str3 = str2) == null || StringsKt.isBlank(str3))) {
            String str9 = str;
            if (str9 != null && !StringsKt.isBlank(str9)) {
                str4 = str;
            }
            return sessionMediaSnapshot;
        }
        str4 = str2;
        String str10 = ((!z || (str6 = str) == null || StringsKt.isBlank(str6) || StringsKt.equals(str, str4, true)) && ((artists = item.getArtists()) == null || artists.isEmpty() || (spotifyArtist = (SpotifyArtist) CollectionsKt.firstOrNull((List) item.getArtists())) == null || (name = spotifyArtist.getName()) == null || (str = StringsKt.trim((CharSequence) name).toString()) == null || StringsKt.isBlank(str))) ? null : str;
        if (z) {
            String bestCoverUrl2 = SpotifyWebApiKt.bestCoverUrl(item.getImages());
            if (bestCoverUrl2 == null) {
                SpotifyShow show2 = item.getShow();
                bestCoverUrl2 = SpotifyWebApiKt.bestCoverUrl(show2 != null ? show2.getImages() : null);
                if (bestCoverUrl2 == null) {
                    SpotifyAlbum album = item.getAlbum();
                    bestCoverUrl = SpotifyWebApiKt.bestCoverUrl(album != null ? album.getImages() : null);
                }
            }
            str5 = bestCoverUrl2;
            boolean isPlaying = np.isPlaying();
            if (!z && (str8 = np.getType()) == null) {
                str8 = "track";
            }
            sessionMediaSnapshot = new SessionMediaSnapshot(str4, str10, isPlaying, str8, item.getId(), np.getProgressMs(), SleepAlarmPreferences.SOUND_SPOTIFY, str5, null, 256, null);
            return sessionMediaSnapshot;
        }
        SpotifyAlbum album2 = item.getAlbum();
        bestCoverUrl = SpotifyWebApiKt.bestCoverUrl(album2 != null ? album2.getImages() : null);
        if (bestCoverUrl == null) {
            bestCoverUrl = SpotifyWebApiKt.bestCoverUrl(item.getImages());
        }
        str5 = bestCoverUrl;
        boolean isPlaying2 = np.isPlaying();
        if (!z) {
            str8 = "track";
        }
        sessionMediaSnapshot = new SessionMediaSnapshot(str4, str10, isPlaying2, str8, item.getId(), np.getProgressMs(), SleepAlarmPreferences.SOUND_SPOTIFY, str5, null, 256, null);
        return sessionMediaSnapshot;
    }

    private final SessionMediaSnapshot fromDevice(DeviceNowPlaying dev) {
        String obj;
        String title = dev.getTitle();
        if (title != null && (obj = StringsKt.trim((CharSequence) title).toString()) != null) {
            String str = !StringsKt.isBlank(obj) ? obj : null;
            if (str != null) {
                String displaySubtitle = dev.getDisplaySubtitle();
                String artUri = dev.getArtUri();
                return new SessionMediaSnapshot(str, displaySubtitle, dev.isPlaying(), dev.isPodcast() ? "episode" : "device", "device:" + dev.getPackageName() + ":" + str + AmbientSessionTagger.CHIP_SEP + (displaySubtitle == null ? "" : displaySubtitle), null, "device", (artUri == null || !(StringsKt.startsWith(artUri, ProxyConfig.MATCH_HTTP, true) || StringsKt.startsWith$default(artUri, "content://", false, 2, (Object) null))) ? null : artUri, dev.getArt());
            }
        }
        return null;
    }
}
