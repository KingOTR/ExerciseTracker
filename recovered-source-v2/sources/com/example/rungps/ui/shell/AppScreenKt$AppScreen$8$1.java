package com.example.rungps.ui.shell;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.BuildConfig;
import com.example.rungps.sleep.SleepCalendarPermissions;
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
@DebugMetadata(c = "com.example.rungps.ui.shell.AppScreenKt$AppScreen$8$1", f = "AppScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $showCalendarNudge$delegate;
    final /* synthetic */ MutableState<Boolean> $showOnboarding$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppScreenKt$AppScreen$8$1(Context context, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super AppScreenKt$AppScreen$8$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$showOnboarding$delegate = mutableState;
        this.$showCalendarNudge$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppScreenKt$AppScreen$8$1(this.$ctx, this.$showOnboarding$delegate, this.$showCalendarNudge$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppScreenKt$AppScreen$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean AppScreen$lambda$34;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AppScreen$lambda$34 = AppScreenKt.AppScreen$lambda$34(this.$showOnboarding$delegate);
            if (AppScreen$lambda$34) {
                return Unit.INSTANCE;
            }
            if (SleepCalendarPermissions.INSTANCE.shouldRequestCalendarOnLaunch(this.$ctx, BuildConfig.VERSION_CODE)) {
                AppScreenKt.AppScreen$lambda$48(this.$showCalendarNudge$delegate, true);
                SleepCalendarPermissions.INSTANCE.markCalendarLaunchNudge(this.$ctx, BuildConfig.VERSION_CODE);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
