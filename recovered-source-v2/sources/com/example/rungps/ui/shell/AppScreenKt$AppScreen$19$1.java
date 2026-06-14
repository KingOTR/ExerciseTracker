package com.example.rungps.ui.shell;

import android.content.Context;
import androidx.compose.runtime.State;
import androidx.navigation.NavHostController;
import com.example.rungps.ble.BleClient;
import com.example.rungps.tracking.RecordingHrBridge;
import com.example.rungps.tracking.TrackingUiState;
import com.example.rungps.ui.navigation.MainTab;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.shell.AppScreenKt$AppScreen$19$1", f = "AppScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$19$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BleClient $ble;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ State<TrackingUiState> $live$delegate;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ String $tab;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppScreenKt$AppScreen$19$1(BleClient bleClient, String str, State<TrackingUiState> state, Context context, NavHostController navHostController, Continuation<? super AppScreenKt$AppScreen$19$1> continuation) {
        super(2, continuation);
        this.$ble = bleClient;
        this.$tab = str;
        this.$live$delegate = state;
        this.$ctx = context;
        this.$navController = navHostController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppScreenKt$AppScreen$19$1(this.$ble, this.$tab, this.$live$delegate, this.$ctx, this.$navController, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppScreenKt$AppScreen$19$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TrackingUiState AppScreen$lambda$2;
        TrackingUiState AppScreen$lambda$22;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BleClient bleClient = this.$ble;
        AppScreen$lambda$2 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
        bleClient.setRecordingHrPoll(AppScreen$lambda$2.isRecording());
        AppScreen$lambda$22 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
        if (!AppScreen$lambda$22.isRecording()) {
            RecordingHrBridge.INSTANCE.onRunStopped();
        } else if (!Intrinsics.areEqual(this.$tab, MainTab.Run.getRoute())) {
            AppScreenKt.AppScreen$goTab(this.$ctx, this.$navController, MainTab.Run.getRoute());
        }
        return Unit.INSTANCE;
    }
}
