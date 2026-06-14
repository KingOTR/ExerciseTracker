package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$addSpotifyTimelineForRun$2", f = "Repository.kt", i = {}, l = {279}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Repository$addSpotifyTimelineForRun$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ String $artUrl;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ String $itemId;
    final /* synthetic */ String $itemType;
    final /* synthetic */ Long $progressMs;
    final /* synthetic */ long $runId;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ long $timeMs;
    final /* synthetic */ String $title;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$addSpotifyTimelineForRun$2(Repository repository, long j, long j2, boolean z, String str, String str2, String str3, String str4, Long l, String str5, Continuation<? super Repository$addSpotifyTimelineForRun$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$timeMs = j;
        this.$runId = j2;
        this.$isPlaying = z;
        this.$itemType = str;
        this.$itemId = str2;
        this.$title = str3;
        this.$subtitle = str4;
        this.$progressMs = l;
        this.$artUrl = str5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$addSpotifyTimelineForRun$2(this.this$0, this.$timeMs, this.$runId, this.$isPlaying, this.$itemType, this.$itemId, this.$title, this.$subtitle, this.$progressMs, this.$artUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((Repository$addSpotifyTimelineForRun$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SpotifyTimelineDao spotifyTimelineDao;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        spotifyTimelineDao = this.this$0.spotifyTimelineDao;
        this.label = 1;
        Object insert = spotifyTimelineDao.insert(new SpotifyTimelineEntity(0L, this.$timeMs, Boxing.boxLong(this.$runId), null, this.$isPlaying, this.$itemType, this.$itemId, this.$title, this.$subtitle, this.$progressMs, this.$artUrl, 9, null), this);
        return insert == coroutine_suspended ? coroutine_suspended : insert;
    }
}
