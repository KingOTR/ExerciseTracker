package com.example.rungps.ui.shell;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.tracking.TrackingUiState;
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

/* compiled from: AppScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.shell.AppScreenKt$AppScreen$21$1", f = "AppScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$21$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Long> $lastOpenedFinishedId$delegate;
    final /* synthetic */ State<TrackingUiState> $live$delegate;
    final /* synthetic */ MutableState<Long> $selectedRunId$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppScreenKt$AppScreen$21$1(State<TrackingUiState> state, MutableState<Long> mutableState, MutableState<Long> mutableState2, Continuation<? super AppScreenKt$AppScreen$21$1> continuation) {
        super(2, continuation);
        this.$live$delegate = state;
        this.$lastOpenedFinishedId$delegate = mutableState;
        this.$selectedRunId$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppScreenKt$AppScreen$21$1(this.$live$delegate, this.$lastOpenedFinishedId$delegate, this.$selectedRunId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppScreenKt$AppScreen$21$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TrackingUiState AppScreen$lambda$2;
        Long AppScreen$lambda$95;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AppScreen$lambda$2 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
            Long lastFinishedRunId = AppScreen$lambda$2.getLastFinishedRunId();
            if (lastFinishedRunId != null) {
                long longValue = lastFinishedRunId.longValue();
                AppScreen$lambda$95 = AppScreenKt.AppScreen$lambda$95(this.$lastOpenedFinishedId$delegate);
                if (AppScreen$lambda$95 != null && AppScreen$lambda$95.longValue() == longValue) {
                    return Unit.INSTANCE;
                }
                this.$selectedRunId$delegate.setValue(Boxing.boxLong(longValue));
                this.$lastOpenedFinishedId$delegate.setValue(Boxing.boxLong(longValue));
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
