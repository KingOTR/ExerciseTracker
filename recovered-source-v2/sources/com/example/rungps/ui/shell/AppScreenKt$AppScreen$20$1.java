package com.example.rungps.ui.shell;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.tracking.TrackingUiState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.shell.AppScreenKt$AppScreen$20$1", f = "AppScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$20$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ State<TrackingUiState> $live$delegate;
    final /* synthetic */ MutableState<Boolean> $prevAutoPaused$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppScreenKt$AppScreen$20$1(Context context, State<TrackingUiState> state, MutableState<Boolean> mutableState, Continuation<? super AppScreenKt$AppScreen$20$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$live$delegate = state;
        this.$prevAutoPaused$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppScreenKt$AppScreen$20$1(this.$ctx, this.$live$delegate, this.$prevAutoPaused$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppScreenKt$AppScreen$20$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TrackingUiState AppScreen$lambda$2;
        TrackingUiState AppScreen$lambda$22;
        boolean AppScreen$lambda$73;
        TrackingUiState AppScreen$lambda$23;
        TrackingUiState AppScreen$lambda$24;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AppScreen$lambda$2 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
            if (!AppScreen$lambda$2.isRecording()) {
                AppScreenKt.AppScreen$lambda$74(this.$prevAutoPaused$delegate, false);
                return Unit.INSTANCE;
            }
            AppScreen$lambda$22 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
            boolean isAutoPaused = AppScreen$lambda$22.isAutoPaused();
            AppScreen$lambda$73 = AppScreenKt.AppScreen$lambda$73(this.$prevAutoPaused$delegate);
            if (isAutoPaused != AppScreen$lambda$73) {
                Context context = this.$ctx;
                AppScreen$lambda$23 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
                Toast.makeText(context, AppScreen$lambda$23.isAutoPaused() ? "Auto-paused" : "Auto-resumed", 0).show();
                MutableState<Boolean> mutableState = this.$prevAutoPaused$delegate;
                AppScreen$lambda$24 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
                AppScreenKt.AppScreen$lambda$74(mutableState, AppScreen$lambda$24.isAutoPaused());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
