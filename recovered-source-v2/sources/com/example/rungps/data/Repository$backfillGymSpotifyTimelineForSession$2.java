package com.example.rungps.data;

import com.example.rungps.data.repo.SpotifyRepository;
import com.example.rungps.gym.GymSpotifyTimelineBackfill;
import com.example.rungps.spotify.SpotifyRecentlyPlayed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$backfillGymSpotifyTimelineForSession$2", f = "Repository.kt", i = {1, 1, 2, 2, 2, 3, 3, 3}, l = {1372, 1374, 1380, 1381, 1392}, m = "invokeSuspend", n = {"session", "end", "session", "plays", "end", "session", "plays", "end"}, s = {"L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class Repository$backfillGymSpotifyTimelineForSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $sessionId;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$backfillGymSpotifyTimelineForSession$2(Repository repository, long j, Continuation<? super Repository$backfillGymSpotifyTimelineForSession$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$sessionId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$backfillGymSpotifyTimelineForSession$2(this.this$0, this.$sessionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Repository$backfillGymSpotifyTimelineForSession$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SpotifyRepository spotifyRepository;
        GymSessionEntity gymSessionEntity;
        long longValue;
        SpotifyRepository spotifyRepository2;
        Object enrichGymSpotifyTimelineRows;
        long j;
        GymSessionEntity gymSessionEntity2;
        List<SpotifyRecentlyPlayed.PlayedMoment> list;
        SpotifyTimelineDao spotifyTimelineDao;
        long j2;
        GymSessionEntity gymSessionEntity3;
        Iterator<SpotifyTimelineEntity> it;
        SpotifyTimelineDao spotifyTimelineDao2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            spotifyRepository = this.this$0.spotifyRepo;
            if (!spotifyRepository.isConnected()) {
                return Unit.INSTANCE;
            }
            this.label = 1;
            obj = this.this$0.gymSessionById(this.$sessionId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        SpotifyTimelineEntity next = it.next();
                        spotifyTimelineDao2 = this.this$0.spotifyTimelineDao;
                        this.L$0 = it;
                        this.L$1 = null;
                        this.label = 5;
                        if (spotifyTimelineDao2.insert(next, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                j2 = this.J$0;
                list = (List) this.L$1;
                gymSessionEntity3 = (GymSessionEntity) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((Number) obj).intValue() <= 0) {
                    return Unit.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    long startedAtMs = gymSessionEntity3.getStartedAtMs();
                    long playedAtMs = ((SpotifyRecentlyPlayed.PlayedMoment) obj2).getPlayedAtMs();
                    if (startedAtMs <= playedAtMs && playedAtMs <= j2) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return Unit.INSTANCE;
                }
                List<SpotifyTimelineEntity> list2 = GymSpotifyTimelineBackfill.INSTANCE.matchSessions(CollectionsKt.listOf(gymSessionEntity3), list, MapsKt.mapOf(TuplesKt.to(Boxing.boxLong(this.$sessionId), Boxing.boxInt(0))), true).get(Boxing.boxLong(this.$sessionId));
                if (list2 == null) {
                    list2 = CollectionsKt.emptyList();
                }
                it = list2.iterator();
                while (it.hasNext()) {
                }
                return Unit.INSTANCE;
            }
            j = this.J$0;
            list = (List) this.L$1;
            gymSessionEntity2 = (GymSessionEntity) this.L$0;
            ResultKt.throwOnFailure(obj);
            spotifyTimelineDao = this.this$0.spotifyTimelineDao;
            this.L$0 = gymSessionEntity2;
            this.L$1 = list;
            this.J$0 = j;
            this.label = 4;
            obj = spotifyTimelineDao.countForGymSession(this.$sessionId, this);
            if (obj != coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = j;
            gymSessionEntity3 = gymSessionEntity2;
            if (((Number) obj).intValue() <= 0) {
            }
        } else {
            longValue = this.J$0;
            gymSessionEntity = (GymSessionEntity) this.L$0;
            ResultKt.throwOnFailure(obj);
            List<SpotifyRecentlyPlayed.PlayedMoment> fetchSince = SpotifyRecentlyPlayed.INSTANCE.fetchSince((String) obj, gymSessionEntity.getStartedAtMs() - 300000, 200);
            this.L$0 = gymSessionEntity;
            this.L$1 = fetchSince;
            this.J$0 = longValue;
            this.label = 3;
            enrichGymSpotifyTimelineRows = this.this$0.enrichGymSpotifyTimelineRows(gymSessionEntity, fetchSince, this);
            if (enrichGymSpotifyTimelineRows != coroutine_suspended) {
                return coroutine_suspended;
            }
            j = longValue;
            gymSessionEntity2 = gymSessionEntity;
            list = fetchSince;
            spotifyTimelineDao = this.this$0.spotifyTimelineDao;
            this.L$0 = gymSessionEntity2;
            this.L$1 = list;
            this.J$0 = j;
            this.label = 4;
            obj = spotifyTimelineDao.countForGymSession(this.$sessionId, this);
            if (obj != coroutine_suspended) {
            }
        }
        gymSessionEntity = (GymSessionEntity) obj;
        if (gymSessionEntity == null) {
            return Unit.INSTANCE;
        }
        Long endedAtMs = gymSessionEntity.getEndedAtMs();
        if (endedAtMs != null) {
            longValue = endedAtMs.longValue();
            spotifyRepository2 = this.this$0.spotifyRepo;
            this.L$0 = gymSessionEntity;
            this.J$0 = longValue;
            this.label = 2;
            obj = spotifyRepository2.obtainAccessToken(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            List<SpotifyRecentlyPlayed.PlayedMoment> fetchSince2 = SpotifyRecentlyPlayed.INSTANCE.fetchSince((String) obj, gymSessionEntity.getStartedAtMs() - 300000, 200);
            this.L$0 = gymSessionEntity;
            this.L$1 = fetchSince2;
            this.J$0 = longValue;
            this.label = 3;
            enrichGymSpotifyTimelineRows = this.this$0.enrichGymSpotifyTimelineRows(gymSessionEntity, fetchSince2, this);
            if (enrichGymSpotifyTimelineRows != coroutine_suspended) {
            }
        } else {
            return Unit.INSTANCE;
        }
    }
}
