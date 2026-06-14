package com.example.rungps.data;

import com.example.rungps.data.repo.SpotifyRepository;
import com.example.rungps.gym.GymSpotifyTimelineBackfill;
import com.example.rungps.spotify.SpotifyRecentlyPlayed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/gym/GymSpotifyTimelineBackfill$Result;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$backfillGymSpotifyTimeline$2", f = "Repository.kt", i = {1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, l = {1324, 1326, 1343, 1346, 1357}, m = "invokeSuspend", n = {"access", "cutoff", "sessions", "plays", "sessions", "plays", "destination$iv$iv", "enriched", "sessions", "matched", "skipped", "rows"}, s = {"L$0", "J$0", "L$0", "L$1", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class Repository$backfillGymSpotifyTimeline$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GymSpotifyTimelineBackfill.Result>, Object> {
    final /* synthetic */ boolean $enrichExistingRows;
    final /* synthetic */ int $lookbackDays;
    final /* synthetic */ boolean $onlySessionsWithoutMusic;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$backfillGymSpotifyTimeline$2(Repository repository, int i, boolean z, boolean z2, Continuation<? super Repository$backfillGymSpotifyTimeline$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$lookbackDays = i;
        this.$enrichExistingRows = z;
        this.$onlySessionsWithoutMusic = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$backfillGymSpotifyTimeline$2(this.this$0, this.$lookbackDays, this.$enrichExistingRows, this.$onlySessionsWithoutMusic, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GymSpotifyTimelineBackfill.Result> continuation) {
        return ((Repository$backfillGymSpotifyTimeline$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0113  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.example.rungps.gym.GymSpotifyTimelineBackfill] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0288 -> B:9:0x0289). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0242 -> B:10:0x0257). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01e8 -> B:26:0x01e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x017b -> B:46:0x017e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SpotifyRepository spotifyRepository;
        SpotifyRepository spotifyRepository2;
        Object obtainAccessToken;
        String str;
        long currentTimeMillis;
        Object finishedSessions;
        ArrayList arrayList;
        List fetchSince$default;
        int i;
        ArrayList arrayList2;
        int i2;
        List list;
        Iterator it;
        Iterator it2;
        List list2;
        int i3;
        Repository repository;
        List list3;
        Map map;
        int i4;
        Map<Long, List<SpotifyTimelineEntity>> matchSessions;
        Iterator<Map.Entry<Long, List<SpotifyTimelineEntity>>> it3;
        SpotifyTimelineDao spotifyTimelineDao;
        SpotifyTimelineDao spotifyTimelineDao2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.label;
        int i6 = 1;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            spotifyRepository = this.this$0.spotifyRepo;
            if (spotifyRepository.isConnected()) {
                spotifyRepository2 = this.this$0.spotifyRepo;
                this.label = 1;
                obtainAccessToken = spotifyRepository2.obtainAccessToken(this);
                if (obtainAccessToken == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new IllegalStateException("Connect Spotify first (History tab → Spotify).");
            }
        } else if (i5 == 1) {
            ResultKt.throwOnFailure(obj);
            obtainAccessToken = obj;
        } else if (i5 == 2) {
            currentTimeMillis = this.J$0;
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            finishedSessions = obj;
            long j = currentTimeMillis;
            String str2 = str;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : (Iterable) finishedSessions) {
                Long endedAtMs = ((GymSessionEntity) obj2).getEndedAtMs();
                if ((endedAtMs != null ? endedAtMs.longValue() : 0L) >= j) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = arrayList3;
            if (!arrayList.isEmpty()) {
                return new GymSpotifyTimelineBackfill.Result(0, 0, 0, 0);
            }
            Iterator it4 = arrayList.iterator();
            if (!it4.hasNext()) {
                throw new NoSuchElementException();
            }
            long startedAtMs = ((GymSessionEntity) it4.next()).getStartedAtMs();
            while (it4.hasNext()) {
                long startedAtMs2 = ((GymSessionEntity) it4.next()).getStartedAtMs();
                if (startedAtMs > startedAtMs2) {
                    startedAtMs = startedAtMs2;
                }
            }
            fetchSince$default = SpotifyRecentlyPlayed.fetchSince$default(SpotifyRecentlyPlayed.INSTANCE, str2, startedAtMs - 300000, 0, 4, null);
            if (this.$enrichExistingRows) {
                Iterator it5 = arrayList.iterator();
                arrayList2 = arrayList;
                i2 = 0;
                list = fetchSince$default;
                it = it5;
                if (it.hasNext()) {
                }
            } else {
                i = 0;
                ArrayList arrayList4 = arrayList;
                Repository repository2 = this.this$0;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList4, 10)), 16));
                it2 = arrayList4.iterator();
                list2 = arrayList;
                i3 = i;
                repository = repository2;
                list3 = fetchSince$default;
                map = linkedHashMap;
                if (!it2.hasNext()) {
                }
            }
        } else if (i5 == 3) {
            i2 = this.I$0;
            it = (Iterator) this.L$2;
            list = (List) this.L$1;
            ?? r10 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            Object enrichGymSpotifyTimelineRows = obj;
            ArrayList arrayList5 = r10;
            i2 += ((Number) enrichGymSpotifyTimelineRows).intValue();
            arrayList2 = arrayList5;
            if (it.hasNext()) {
                GymSessionEntity gymSessionEntity = (GymSessionEntity) it.next();
                this.L$0 = arrayList2;
                this.L$1 = list;
                this.L$2 = it;
                this.I$0 = i2;
                this.label = 3;
                enrichGymSpotifyTimelineRows = this.this$0.enrichGymSpotifyTimelineRows(gymSessionEntity, list, this);
                arrayList5 = arrayList2;
                if (enrichGymSpotifyTimelineRows == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2 += ((Number) enrichGymSpotifyTimelineRows).intValue();
                arrayList2 = arrayList5;
                if (it.hasNext()) {
                    i = i2;
                    fetchSince$default = list;
                    arrayList = arrayList2;
                    ArrayList arrayList42 = arrayList;
                    Repository repository22 = this.this$0;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList42, 10)), 16));
                    it2 = arrayList42.iterator();
                    list2 = arrayList;
                    i3 = i;
                    repository = repository22;
                    list3 = fetchSince$default;
                    map = linkedHashMap2;
                    if (!it2.hasNext()) {
                    }
                }
            }
        } else if (i5 == 4) {
            i3 = this.I$0;
            Long l = (Long) this.L$6;
            map = (Map) this.L$5;
            it2 = (Iterator) this.L$4;
            Map map2 = (Map) this.L$3;
            repository = (Repository) this.L$2;
            list3 = (List) this.L$1;
            list2 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            Map map3 = map2;
            Long boxLong = l;
            Object countForGymSession = obj;
            Pair pair = TuplesKt.to(boxLong, countForGymSession);
            map.put(pair.getFirst(), pair.getSecond());
            map = map3;
            if (!it2.hasNext()) {
                GymSessionEntity gymSessionEntity2 = (GymSessionEntity) it2.next();
                boxLong = Boxing.boxLong(gymSessionEntity2.getId());
                spotifyTimelineDao = repository.spotifyTimelineDao;
                long id = gymSessionEntity2.getId();
                this.L$0 = list2;
                this.L$1 = list3;
                this.L$2 = repository;
                this.L$3 = map;
                this.L$4 = it2;
                this.L$5 = map;
                this.L$6 = boxLong;
                this.I$0 = i3;
                this.label = 4;
                countForGymSession = spotifyTimelineDao.countForGymSession(id, this);
                if (countForGymSession == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map3 = map;
                Pair pair2 = TuplesKt.to(boxLong, countForGymSession);
                map.put(pair2.getFirst(), pair2.getSecond());
                map = map3;
                if (!it2.hasNext()) {
                    if (!this.$onlySessionsWithoutMusic || map.isEmpty()) {
                        i4 = 0;
                    } else {
                        Iterator it6 = map.entrySet().iterator();
                        i4 = 0;
                        while (it6.hasNext()) {
                            if (((Number) ((Map.Entry) it6.next()).getValue()).intValue() > 0) {
                                i4++;
                            }
                        }
                    }
                    matchSessions = GymSpotifyTimelineBackfill.INSTANCE.matchSessions(list2, list3, map, this.$onlySessionsWithoutMusic);
                    it3 = matchSessions.entrySet().iterator();
                    if (!it3.hasNext()) {
                    }
                }
            }
        } else {
            if (i5 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.I$1;
            int i7 = this.I$0;
            Iterator<SpotifyTimelineEntity> it7 = (Iterator) this.L$3;
            Iterator<Map.Entry<Long, List<SpotifyTimelineEntity>>> it8 = (Iterator) this.L$2;
            Map<Long, List<SpotifyTimelineEntity>> map4 = (Map) this.L$1;
            List list4 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            list2 = list4;
            i4 = i7;
            matchSessions = map4;
            i3 += i6;
            if (it7.hasNext()) {
                SpotifyTimelineEntity next = it7.next();
                spotifyTimelineDao2 = this.this$0.spotifyTimelineDao;
                this.L$0 = list2;
                this.L$1 = matchSessions;
                this.L$2 = it8;
                this.L$3 = it7;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = i4;
                this.I$1 = i3;
                this.label = 5;
                if (spotifyTimelineDao2.insert(next, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i6 = 1;
                i3 += i6;
                if (it7.hasNext()) {
                    it3 = it8;
                    if (!it3.hasNext()) {
                        it8 = it3;
                        it7 = it3.next().getValue().iterator();
                        if (it7.hasNext()) {
                        }
                    } else {
                        return new GymSpotifyTimelineBackfill.Result(list2.size(), matchSessions.size(), i3, i4);
                    }
                }
            }
        }
        str = (String) obtainAccessToken;
        currentTimeMillis = System.currentTimeMillis() - (this.$lookbackDays * 86400000);
        this.L$0 = str;
        this.J$0 = currentTimeMillis;
        this.label = 2;
        finishedSessions = this.this$0.getGymDao().finishedSessions(this);
        if (finishedSessions == coroutine_suspended) {
            return coroutine_suspended;
        }
        long j2 = currentTimeMillis;
        String str22 = str;
        ArrayList arrayList32 = new ArrayList();
        while (r6.hasNext()) {
        }
        arrayList = arrayList32;
        if (!arrayList.isEmpty()) {
        }
    }
}
