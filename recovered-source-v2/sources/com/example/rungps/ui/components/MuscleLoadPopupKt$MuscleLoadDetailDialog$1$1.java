package com.example.rungps.ui.components;

import androidx.compose.runtime.MutableState;
import androidx.health.connect.client.records.ExerciseSegment;
import com.example.rungps.data.Repository;
import com.example.rungps.recovery.RegionRecentLoad;
import kotlin.Metadata;
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

/* compiled from: MuscleLoadPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.components.MuscleLoadPopupKt$MuscleLoadDetailDialog$1$1", f = "MuscleLoadPopup.kt", i = {}, l = {ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MuscleLoadPopupKt$MuscleLoadDetailDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $days;
    final /* synthetic */ MutableState<RegionRecentLoad> $recent$delegate;
    final /* synthetic */ String $region;
    final /* synthetic */ Repository $repo;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MuscleLoadPopupKt$MuscleLoadDetailDialog$1$1(Repository repository, String str, int i, MutableState<RegionRecentLoad> mutableState, Continuation<? super MuscleLoadPopupKt$MuscleLoadDetailDialog$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$region = str;
        this.$days = i;
        this.$recent$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MuscleLoadPopupKt$MuscleLoadDetailDialog$1$1(this.$repo, this.$region, this.$days, this.$recent$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MuscleLoadPopupKt$MuscleLoadDetailDialog$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: MuscleLoadPopup.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/recovery/RegionRecentLoad;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.components.MuscleLoadPopupKt$MuscleLoadDetailDialog$1$1$1", f = "MuscleLoadPopup.kt", i = {}, l = {ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.components.MuscleLoadPopupKt$MuscleLoadDetailDialog$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RegionRecentLoad>, Object> {
        final /* synthetic */ int $days;
        final /* synthetic */ String $region;
        final /* synthetic */ Repository $repo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Repository repository, String str, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$repo = repository;
            this.$region = str;
            this.$days = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$repo, this.$region, this.$days, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RegionRecentLoad> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$repo.regionRecentLoad(this.$region, this.$days, this);
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<RegionRecentLoad> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<RegionRecentLoad> mutableState2 = this.$recent$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$repo, this.$region, this.$days, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = withContext;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((RegionRecentLoad) obj);
        return Unit.INSTANCE;
    }
}
