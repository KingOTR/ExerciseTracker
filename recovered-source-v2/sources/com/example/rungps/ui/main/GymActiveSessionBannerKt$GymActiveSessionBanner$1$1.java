package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SpotifyTimelineEntity;
import com.example.rungps.media.SessionMediaSnapshot;
import com.google.api.Endpoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymActiveSessionBanner.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.GymActiveSessionBannerKt$GymActiveSessionBanner$1$1", f = "GymActiveSessionBanner.kt", i = {0, 0, 1, 1, 2, 2}, l = {Endpoint.TARGET_FIELD_NUMBER, 103, 105}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "sid", "$this$LaunchedEffect", "sid", "$this$LaunchedEffect", "sid"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes3.dex */
final class GymActiveSessionBannerKt$GymActiveSessionBanner$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<SessionMediaSnapshot> $liveMedia$delegate;
    final /* synthetic */ MutableState<List<SpotifyTimelineEntity>> $mediaTimeline$delegate;
    final /* synthetic */ long $openSessionId;
    final /* synthetic */ Repository $repo;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymActiveSessionBannerKt$GymActiveSessionBanner$1$1(long j, Context context, Repository repository, MutableState<SessionMediaSnapshot> mutableState, MutableState<List<SpotifyTimelineEntity>> mutableState2, Continuation<? super GymActiveSessionBannerKt$GymActiveSessionBanner$1$1> continuation) {
        super(2, continuation);
        this.$openSessionId = j;
        this.$ctx = context;
        this.$repo = repository;
        this.$liveMedia$delegate = mutableState;
        this.$mediaTimeline$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymActiveSessionBannerKt$GymActiveSessionBanner$1$1 gymActiveSessionBannerKt$GymActiveSessionBanner$1$1 = new GymActiveSessionBannerKt$GymActiveSessionBanner$1$1(this.$openSessionId, this.$ctx, this.$repo, this.$liveMedia$delegate, this.$mediaTimeline$delegate, continuation);
        gymActiveSessionBannerKt$GymActiveSessionBanner$1$1.L$0 = obj;
        return gymActiveSessionBannerKt$GymActiveSessionBanner$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymActiveSessionBannerKt$GymActiveSessionBanner$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00bd -> B:7:0x004e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L44
            if (r1 == r4) goto L34
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            long r6 = r11.J$0
            java.lang.Object r1 = r11.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.throwOnFailure(r12)
            r8 = r1
            goto L4e
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L25:
            long r6 = r11.J$0
            java.lang.Object r1 = r11.L$1
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            java.lang.Object r8 = r11.L$0
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            kotlin.ResultKt.throwOnFailure(r12)
            goto La7
        L34:
            long r6 = r11.J$0
            java.lang.Object r1 = r11.L$1
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            java.lang.Object r8 = r11.L$0
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L42
            goto L67
        L42:
            r12 = move-exception
            goto L6e
        L44:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
            long r6 = r11.$openSessionId
            r8 = r12
        L4e:
            androidx.compose.runtime.MutableState<com.example.rungps.media.SessionMediaSnapshot> r1 = r11.$liveMedia$delegate
            android.content.Context r12 = r11.$ctx
            com.example.rungps.data.Repository r9 = r11.$repo
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L42
            com.example.rungps.media.SessionMediaReader r10 = com.example.rungps.media.SessionMediaReader.INSTANCE     // Catch: java.lang.Throwable -> L42
            r11.L$0 = r8     // Catch: java.lang.Throwable -> L42
            r11.L$1 = r1     // Catch: java.lang.Throwable -> L42
            r11.J$0 = r6     // Catch: java.lang.Throwable -> L42
            r11.label = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r12 = r10.read(r12, r9, r11)     // Catch: java.lang.Throwable -> L42
            if (r12 != r0) goto L67
            return r0
        L67:
            com.example.rungps.media.SessionMediaSnapshot r12 = (com.example.rungps.media.SessionMediaSnapshot) r12     // Catch: java.lang.Throwable -> L42
            java.lang.Object r12 = kotlin.Result.m7905constructorimpl(r12)     // Catch: java.lang.Throwable -> L42
            goto L78
        L6e:
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
            java.lang.Object r12 = kotlin.Result.m7905constructorimpl(r12)
        L78:
            boolean r9 = kotlin.Result.m7911isFailureimpl(r12)
            if (r9 == 0) goto L7f
            r12 = r5
        L7f:
            com.example.rungps.media.SessionMediaSnapshot r12 = (com.example.rungps.media.SessionMediaSnapshot) r12
            com.example.rungps.ui.main.GymActiveSessionBannerKt.access$GymActiveSessionBanner$lambda$5(r1, r12)
            androidx.compose.runtime.MutableState<java.util.List<com.example.rungps.data.SpotifyTimelineEntity>> r1 = r11.$mediaTimeline$delegate
            kotlinx.coroutines.CoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r12 = (kotlin.coroutines.CoroutineContext) r12
            com.example.rungps.ui.main.GymActiveSessionBannerKt$GymActiveSessionBanner$1$1$2 r9 = new com.example.rungps.ui.main.GymActiveSessionBannerKt$GymActiveSessionBanner$1$1$2
            com.example.rungps.data.Repository r10 = r11.$repo
            r9.<init>(r10, r6, r5)
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            r10 = r11
            kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
            r11.L$0 = r8
            r11.L$1 = r1
            r11.J$0 = r6
            r11.label = r3
            java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r9, r10)
            if (r12 != r0) goto La7
            return r0
        La7:
            java.util.List r12 = (java.util.List) r12
            com.example.rungps.ui.main.GymActiveSessionBannerKt.access$GymActiveSessionBanner$lambda$2(r1, r12)
            r12 = r11
            kotlin.coroutines.Continuation r12 = (kotlin.coroutines.Continuation) r12
            r11.L$0 = r8
            r11.L$1 = r5
            r11.J$0 = r6
            r11.label = r2
            r9 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r9, r12)
            if (r12 != r0) goto L4e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.rungps.ui.main.GymActiveSessionBannerKt$GymActiveSessionBanner$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: GymActiveSessionBanner.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/data/SpotifyTimelineEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.GymActiveSessionBannerKt$GymActiveSessionBanner$1$1$2", f = "GymActiveSessionBanner.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.main.GymActiveSessionBannerKt$GymActiveSessionBanner$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SpotifyTimelineEntity>>, Object> {
        final /* synthetic */ Repository $repo;
        final /* synthetic */ long $sid;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Repository repository, long j, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$sid = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$repo, this.$sid, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SpotifyTimelineEntity>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SpotifyTimelineEntity>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SpotifyTimelineEntity>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.gymMediaTimelineForDisplay(this.$sid, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }
}
