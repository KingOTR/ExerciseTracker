package com.example.rungps.spotify;

import com.example.rungps.spotify.SpotifyRecentlyPlayed;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* compiled from: SpotifyRecentlyPlayed.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toPlayedMoment", "Lcom/example/rungps/spotify/SpotifyRecentlyPlayed$PlayedMoment;", "Lcom/example/rungps/spotify/SpotifyRecentlyPlayedItem;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifyRecentlyPlayedKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SpotifyRecentlyPlayed.PlayedMoment toPlayedMoment(SpotifyRecentlyPlayedItem spotifyRecentlyPlayedItem) {
        Object m7905constructorimpl;
        SpotifyArtist spotifyArtist;
        String str;
        String str2;
        String name;
        String playedAt = spotifyRecentlyPlayedItem.getPlayedAt();
        if (playedAt != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(Long.valueOf(Instant.parse(playedAt).toEpochMilli()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                m7905constructorimpl = null;
            }
            Long l = (Long) m7905constructorimpl;
            if (l != null) {
                long longValue = l.longValue();
                SpotifyEpisode episode = spotifyRecentlyPlayedItem.getEpisode();
                if (episode != null) {
                    String name2 = episode.getName();
                    if (name2 == null || (str = StringsKt.trim((CharSequence) name2).toString()) == null || StringsKt.isBlank(str)) {
                        str = null;
                    }
                    SpotifyShow show = episode.getShow();
                    if (show == null || (name = show.getName()) == null || (str2 = StringsKt.trim((CharSequence) name).toString()) == null || StringsKt.isBlank(str2)) {
                        str2 = null;
                    }
                    String id = episode.getId();
                    String str3 = str == null ? str2 : str;
                    String str4 = (str == null || str2 == null || StringsKt.equals(str2, str, true)) ? null : str2;
                    String bestCoverUrl = SpotifyWebApiKt.bestCoverUrl(episode.getImages());
                    if (bestCoverUrl == null) {
                        SpotifyShow show2 = episode.getShow();
                        bestCoverUrl = SpotifyWebApiKt.bestCoverUrl(show2 != null ? show2.getImages() : null);
                    }
                    return new SpotifyRecentlyPlayed.PlayedMoment(longValue, "episode", id, str3, str4, null, bestCoverUrl);
                }
                SpotifyItem track = spotifyRecentlyPlayedItem.getTrack();
                if (track == null) {
                    return null;
                }
                String id2 = track.getId();
                String name3 = track.getName();
                List<SpotifyArtist> artists = track.getArtists();
                String name4 = (artists == null || (spotifyArtist = (SpotifyArtist) CollectionsKt.firstOrNull((List) artists)) == null) ? null : spotifyArtist.getName();
                SpotifyAlbum album = track.getAlbum();
                return new SpotifyRecentlyPlayed.PlayedMoment(longValue, "track", id2, name3, name4, null, SpotifyWebApiKt.bestCoverUrl(album != null ? album.getImages() : null));
            }
        }
        return null;
    }
}
