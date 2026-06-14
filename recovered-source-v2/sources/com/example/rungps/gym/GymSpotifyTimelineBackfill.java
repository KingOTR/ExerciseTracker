package com.example.rungps.gym;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.SpotifyTimelineEntity;
import com.example.rungps.spotify.SpotifyRecentlyPlayed;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymSpotifyTimelineBackfill.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0012\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0002¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/gym/GymSpotifyTimelineBackfill;", "", "<init>", "()V", "matchSessions", "", "", "", "Lcom/example/rungps/data/SpotifyTimelineEntity;", "sessions", "Lcom/example/rungps/data/GymSessionEntity;", "plays", "Lcom/example/rungps/spotify/SpotifyRecentlyPlayed$PlayedMoment;", "existingCountBySessionId", "", "onlySessionsWithoutMusic", "", "dedupeToTimeline", "sessionId", "Result", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSpotifyTimelineBackfill {
    public static final int $stable = 0;
    public static final GymSpotifyTimelineBackfill INSTANCE = new GymSpotifyTimelineBackfill();

    private GymSpotifyTimelineBackfill() {
    }

    /* compiled from: GymSpotifyTimelineBackfill.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/gym/GymSpotifyTimelineBackfill$Result;", "", "sessionsScanned", "", "sessionsFilled", "rowsInserted", "skippedAlreadyHadMusic", "<init>", "(IIII)V", "getSessionsScanned", "()I", "getSessionsFilled", "getRowsInserted", "getSkippedAlreadyHadMusic", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {
        public static final int $stable = 0;
        private final int rowsInserted;
        private final int sessionsFilled;
        private final int sessionsScanned;
        private final int skippedAlreadyHadMusic;

        public static /* synthetic */ Result copy$default(Result result, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = result.sessionsScanned;
            }
            if ((i5 & 2) != 0) {
                i2 = result.sessionsFilled;
            }
            if ((i5 & 4) != 0) {
                i3 = result.rowsInserted;
            }
            if ((i5 & 8) != 0) {
                i4 = result.skippedAlreadyHadMusic;
            }
            return result.copy(i, i2, i3, i4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSessionsScanned() {
            return this.sessionsScanned;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSessionsFilled() {
            return this.sessionsFilled;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRowsInserted() {
            return this.rowsInserted;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSkippedAlreadyHadMusic() {
            return this.skippedAlreadyHadMusic;
        }

        public final Result copy(int sessionsScanned, int sessionsFilled, int rowsInserted, int skippedAlreadyHadMusic) {
            return new Result(sessionsScanned, sessionsFilled, rowsInserted, skippedAlreadyHadMusic);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.sessionsScanned == result.sessionsScanned && this.sessionsFilled == result.sessionsFilled && this.rowsInserted == result.rowsInserted && this.skippedAlreadyHadMusic == result.skippedAlreadyHadMusic;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.sessionsScanned) * 31) + Integer.hashCode(this.sessionsFilled)) * 31) + Integer.hashCode(this.rowsInserted)) * 31) + Integer.hashCode(this.skippedAlreadyHadMusic);
        }

        public String toString() {
            return "Result(sessionsScanned=" + this.sessionsScanned + ", sessionsFilled=" + this.sessionsFilled + ", rowsInserted=" + this.rowsInserted + ", skippedAlreadyHadMusic=" + this.skippedAlreadyHadMusic + ")";
        }

        public Result(int i, int i2, int i3, int i4) {
            this.sessionsScanned = i;
            this.sessionsFilled = i2;
            this.rowsInserted = i3;
            this.skippedAlreadyHadMusic = i4;
        }

        public final int getSessionsScanned() {
            return this.sessionsScanned;
        }

        public final int getSessionsFilled() {
            return this.sessionsFilled;
        }

        public final int getRowsInserted() {
            return this.rowsInserted;
        }

        public final int getSkippedAlreadyHadMusic() {
            return this.skippedAlreadyHadMusic;
        }
    }

    public final Map<Long, List<SpotifyTimelineEntity>> matchSessions(List<GymSessionEntity> sessions, List<SpotifyRecentlyPlayed.PlayedMoment> plays, Map<Long, Integer> existingCountBySessionId, boolean onlySessionsWithoutMusic) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(plays, "plays");
        Intrinsics.checkNotNullParameter(existingCountBySessionId, "existingCountBySessionId");
        if (sessions.isEmpty() || plays.isEmpty()) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (GymSessionEntity gymSessionEntity : sessions) {
            Long endedAtMs = gymSessionEntity.getEndedAtMs();
            if (endedAtMs != null) {
                long longValue = endedAtMs.longValue();
                if (onlySessionsWithoutMusic) {
                    Integer num = existingCountBySessionId.get(Long.valueOf(gymSessionEntity.getId()));
                    if ((num != null ? num.intValue() : 0) > 0) {
                    }
                }
                long startedAtMs = gymSessionEntity.getStartedAtMs();
                ArrayList arrayList = new ArrayList();
                for (Object obj : plays) {
                    long playedAtMs = ((SpotifyRecentlyPlayed.PlayedMoment) obj).getPlayedAtMs();
                    if (startedAtMs <= playedAtMs && playedAtMs <= longValue) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    List<SpotifyTimelineEntity> dedupeToTimeline = dedupeToTimeline(gymSessionEntity.getId(), arrayList2);
                    if (!dedupeToTimeline.isEmpty()) {
                        linkedHashMap.put(Long.valueOf(gymSessionEntity.getId()), dedupeToTimeline);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private final List<SpotifyTimelineEntity> dedupeToTimeline(long sessionId, List<SpotifyRecentlyPlayed.PlayedMoment> plays) {
        List<SpotifyRecentlyPlayed.PlayedMoment> sortedWith = CollectionsKt.sortedWith(plays, new Comparator() { // from class: com.example.rungps.gym.GymSpotifyTimelineBackfill$dedupeToTimeline$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SpotifyRecentlyPlayed.PlayedMoment) t).getPlayedAtMs()), Long.valueOf(((SpotifyRecentlyPlayed.PlayedMoment) t2).getPlayedAtMs()));
            }
        });
        ArrayList arrayList = new ArrayList();
        String str = null;
        for (SpotifyRecentlyPlayed.PlayedMoment playedMoment : sortedWith) {
            String[] strArr = new String[3];
            String itemId = playedMoment.getItemId();
            if (itemId == null) {
                itemId = "";
            }
            strArr[0] = itemId;
            String title = playedMoment.getTitle();
            if (title == null) {
                title = "";
            }
            strArr[1] = title;
            String subtitle = playedMoment.getSubtitle();
            strArr[2] = subtitle != null ? subtitle : "";
            String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) strArr), AmbientSessionTagger.CHIP_SEP, null, null, 0, null, null, 62, null);
            if (!Intrinsics.areEqual(joinToString$default, str)) {
                arrayList.add(new SpotifyTimelineEntity(0L, playedMoment.getPlayedAtMs(), null, Long.valueOf(sessionId), true, playedMoment.getItemType(), playedMoment.getItemId(), playedMoment.getTitle(), playedMoment.getSubtitle(), playedMoment.getProgressMs(), playedMoment.getArtUrl(), 5, null));
                str = joinToString$default;
            }
        }
        return arrayList;
    }
}
