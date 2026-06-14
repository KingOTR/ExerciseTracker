package com.example.rungps.data;

import android.content.Context;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.example.rungps.data.repo.SpotifyRepository;
import com.example.rungps.spotify.SpotifyRecentlyPlayed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/data/SpotifyTimelineEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$gymMediaTimelineForDisplay$2", f = "Repository.kt", i = {0, 1, 2, 2, 3, 6}, l = {237, 239, 241, 243, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 254}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "$this$withContext", "rows", "session", "destination$iv$iv"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class Repository$gymMediaTimelineForDisplay$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SpotifyTimelineEntity>>, Object> {
    final /* synthetic */ long $sessionId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$gymMediaTimelineForDisplay$2(Repository repository, long j, Continuation<? super Repository$gymMediaTimelineForDisplay$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$sessionId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Repository$gymMediaTimelineForDisplay$2 repository$gymMediaTimelineForDisplay$2 = new Repository$gymMediaTimelineForDisplay$2(this.this$0, this.$sessionId, continuation);
        repository$gymMediaTimelineForDisplay$2.L$0 = obj;
        return repository$gymMediaTimelineForDisplay$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SpotifyTimelineEntity>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<SpotifyTimelineEntity>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SpotifyTimelineEntity>> continuation) {
        return ((Repository$gymMediaTimelineForDisplay$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r1v33, types: [kotlinx.coroutines.CoroutineScope] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0190 -> B:8:0x0191). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r1;
        SpotifyTimelineDao spotifyTimelineDao;
        CoroutineScope coroutineScope;
        List list;
        List list2;
        GymSessionEntity gymSessionEntity;
        SpotifyRepository spotifyRepository;
        GymSessionEntity gymSessionEntity2;
        Throwable th;
        SpotifyRepository spotifyRepository2;
        Object obtainAccessToken;
        Object m7905constructorimpl;
        String str;
        Object enrichGymSpotifyTimelineRows;
        SpotifyTimelineDao spotifyTimelineDao2;
        Repository repository;
        Collection arrayList;
        Iterator it;
        Collection collection;
        SpotifyRepository spotifyRepository3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
            r1 = i;
        }
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                ?? r12 = (CoroutineScope) this.L$0;
                spotifyRepository3 = this.this$0.spotifyRepo;
                r1 = r12;
                if (spotifyRepository3.isConnected()) {
                    Repository repository2 = this.this$0;
                    long j = this.$sessionId;
                    Result.Companion companion2 = Result.INSTANCE;
                    this.L$0 = r12;
                    this.label = 1;
                    i = r12;
                    if (repository2.backfillGymSpotifyTimelineForSession(j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    r1 = i;
                }
                spotifyTimelineDao = this.this$0.spotifyTimelineDao;
                this.L$0 = r1;
                this.label = 2;
                obj = spotifyTimelineDao.forGymSession(this.$sessionId, this);
                coroutineScope = r1;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = (List) obj;
                if (list.isEmpty()) {
                    return list;
                }
                this.L$0 = coroutineScope;
                this.L$1 = list;
                this.label = 3;
                Object gymSessionById = this.this$0.gymSessionById(this.$sessionId, this);
                if (gymSessionById == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                obj = gymSessionById;
                gymSessionEntity = (GymSessionEntity) obj;
                if (gymSessionEntity != null) {
                    return list2;
                }
                spotifyRepository = this.this$0.spotifyRepo;
                if (spotifyRepository.isConnected()) {
                    Repository repository3 = this.this$0;
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        spotifyRepository2 = repository3.spotifyRepo;
                        this.L$0 = gymSessionEntity;
                        this.L$1 = null;
                        this.label = 4;
                        obtainAccessToken = spotifyRepository2.obtainAccessToken(this);
                    } catch (Throwable th3) {
                        gymSessionEntity2 = gymSessionEntity;
                        th = th3;
                        Result.Companion companion4 = Result.INSTANCE;
                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        str = (String) m7905constructorimpl;
                        if (str != null) {
                        }
                        spotifyTimelineDao2 = this.this$0.spotifyTimelineDao;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 6;
                        obj = spotifyTimelineDao2.forGymSession(this.$sessionId, this);
                        if (obj == coroutine_suspended) {
                        }
                        List list3 = (List) obj;
                        repository = this.this$0;
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        it = list3.iterator();
                        if (!it.hasNext()) {
                        }
                    }
                    if (obtainAccessToken == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gymSessionEntity2 = gymSessionEntity;
                    obj = obtainAccessToken;
                    m7905constructorimpl = Result.m7905constructorimpl((String) obj);
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        m7905constructorimpl = null;
                    }
                    str = (String) m7905constructorimpl;
                    if (str != null) {
                        List<SpotifyRecentlyPlayed.PlayedMoment> fetchSince = SpotifyRecentlyPlayed.INSTANCE.fetchSince(str, gymSessionEntity2.getStartedAtMs() - 300000, 200);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 5;
                        enrichGymSpotifyTimelineRows = this.this$0.enrichGymSpotifyTimelineRows(gymSessionEntity2, fetchSince, this);
                        if (enrichGymSpotifyTimelineRows == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                spotifyTimelineDao2 = this.this$0.spotifyTimelineDao;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                obj = spotifyTimelineDao2.forGymSession(this.$sessionId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                List list32 = (List) obj;
                repository = this.this$0;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
                it = list32.iterator();
                if (!it.hasNext()) {
                    SpotifyTimelineEntity spotifyTimelineEntity = (SpotifyTimelineEntity) it.next();
                    Context appContext = repository.getAppContext();
                    Intrinsics.checkNotNullExpressionValue(appContext, "<get-appContext>(...)");
                    this.L$0 = repository;
                    this.L$1 = arrayList;
                    this.L$2 = it;
                    this.L$3 = arrayList;
                    this.label = 7;
                    obj = repository.withCachedArt(spotifyTimelineEntity, appContext, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    collection = arrayList;
                    arrayList.add((SpotifyTimelineEntity) obj);
                    arrayList = collection;
                    if (!it.hasNext()) {
                        return (List) arrayList;
                    }
                }
            case 1:
                ?? r13 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = r13;
                Result.m7905constructorimpl(Unit.INSTANCE);
                r1 = i;
                spotifyTimelineDao = this.this$0.spotifyTimelineDao;
                this.L$0 = r1;
                this.label = 2;
                obj = spotifyTimelineDao.forGymSession(this.$sessionId, this);
                coroutineScope = r1;
                if (obj == coroutine_suspended) {
                }
                list = (List) obj;
                if (list.isEmpty()) {
                }
                break;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                list = (List) obj;
                if (list.isEmpty()) {
                }
                break;
            case 3:
                list2 = (List) this.L$1;
                ResultKt.throwOnFailure(obj);
                gymSessionEntity = (GymSessionEntity) obj;
                if (gymSessionEntity != null) {
                }
                break;
            case 4:
                gymSessionEntity2 = (GymSessionEntity) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    m7905constructorimpl = Result.m7905constructorimpl((String) obj);
                } catch (Throwable th4) {
                    th = th4;
                    Result.Companion companion42 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    }
                    str = (String) m7905constructorimpl;
                    if (str != null) {
                    }
                    spotifyTimelineDao2 = this.this$0.spotifyTimelineDao;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 6;
                    obj = spotifyTimelineDao2.forGymSession(this.$sessionId, this);
                    if (obj == coroutine_suspended) {
                    }
                    List list322 = (List) obj;
                    repository = this.this$0;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list322, 10));
                    it = list322.iterator();
                    if (!it.hasNext()) {
                    }
                }
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                str = (String) m7905constructorimpl;
                if (str != null) {
                }
                spotifyTimelineDao2 = this.this$0.spotifyTimelineDao;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                obj = spotifyTimelineDao2.forGymSession(this.$sessionId, this);
                if (obj == coroutine_suspended) {
                }
                List list3222 = (List) obj;
                repository = this.this$0;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3222, 10));
                it = list3222.iterator();
                if (!it.hasNext()) {
                }
                break;
            case 5:
                ResultKt.throwOnFailure(obj);
                spotifyTimelineDao2 = this.this$0.spotifyTimelineDao;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                obj = spotifyTimelineDao2.forGymSession(this.$sessionId, this);
                if (obj == coroutine_suspended) {
                }
                List list32222 = (List) obj;
                repository = this.this$0;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32222, 10));
                it = list32222.iterator();
                if (!it.hasNext()) {
                }
                break;
            case 6:
                ResultKt.throwOnFailure(obj);
                List list322222 = (List) obj;
                repository = this.this$0;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list322222, 10));
                it = list322222.iterator();
                if (!it.hasNext()) {
                }
                break;
            case 7:
                arrayList = (Collection) this.L$3;
                it = (Iterator) this.L$2;
                collection = (Collection) this.L$1;
                repository = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                arrayList.add((SpotifyTimelineEntity) obj);
                arrayList = collection;
                if (!it.hasNext()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
