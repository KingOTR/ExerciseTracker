package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SpotifyTimelineEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymSessionMediaTimelineSection$2$1", f = "GymTabContent.kt", i = {}, l = {1681}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymSessionMediaTimelineSection$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $enrichedOnce$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ State<List<SpotifyTimelineEntity>> $rows$delegate;
    final /* synthetic */ long $sessionId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymTabContentKt$GymSessionMediaTimelineSection$2$1(MutableState<Boolean> mutableState, State<? extends List<SpotifyTimelineEntity>> state, Repository repository, long j, Continuation<? super GymTabContentKt$GymSessionMediaTimelineSection$2$1> continuation) {
        super(2, continuation);
        this.$enrichedOnce$delegate = mutableState;
        this.$rows$delegate = state;
        this.$repo = repository;
        this.$sessionId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymSessionMediaTimelineSection$2$1(this.$enrichedOnce$delegate, this.$rows$delegate, this.$repo, this.$sessionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymSessionMediaTimelineSection$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean GymSessionMediaTimelineSection$lambda$165;
        List GymSessionMediaTimelineSection$lambda$163;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GymSessionMediaTimelineSection$lambda$165 = GymTabContentKt.GymSessionMediaTimelineSection$lambda$165(this.$enrichedOnce$delegate);
            if (!GymSessionMediaTimelineSection$lambda$165) {
                GymSessionMediaTimelineSection$lambda$163 = GymTabContentKt.GymSessionMediaTimelineSection$lambda$163(this.$rows$delegate);
                if (!GymSessionMediaTimelineSection$lambda$163.isEmpty()) {
                    GymTabContentKt.GymSessionMediaTimelineSection$lambda$166(this.$enrichedOnce$delegate, true);
                    this.label = 1;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$sessionId, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymSessionMediaTimelineSection$2$1$1", f = "GymTabContent.kt", i = {}, l = {1681}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymSessionMediaTimelineSection$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Repository $repo;
        final /* synthetic */ long $sessionId;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, long j, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$sessionId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$repo, this.$sessionId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Repository repository = this.$repo;
                    long j = this.$sessionId;
                    Result.Companion companion = Result.INSTANCE;
                    this.label = 1;
                    obj = repository.gymMediaTimelineForDisplay(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Result.m7905constructorimpl((List) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }
}
