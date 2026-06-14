package com.example.rungps.ui.settings;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
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

/* compiled from: AppSettingsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.settings.AppSettingsScreenKt$AppSettingsScreen$2$8$1$1", f = "AppSettingsScreen.kt", i = {}, l = {213}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppSettingsScreenKt$AppSettingsScreen$2$8$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $busy$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Repository $repo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSettingsScreenKt$AppSettingsScreen$2$8$1$1(Context context, Repository repository, MutableState<Boolean> mutableState, Continuation<? super AppSettingsScreenKt$AppSettingsScreen$2$8$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$repo = repository;
        this.$busy$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppSettingsScreenKt$AppSettingsScreen$2$8$1$1(this.$ctx, this.$repo, this.$busy$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppSettingsScreenKt$AppSettingsScreen$2$8$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new AppSettingsScreenKt$AppSettingsScreen$2$8$1$1$n$1(this.$repo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        int intValue = ((Number) obj).intValue();
        AppSettingsScreenKt.AppSettingsScreen$lambda$13(this.$busy$delegate, false);
        Toast.makeText(this.$ctx, "Restored " + intValue + " run(s) from cloud", 1).show();
        return Unit.INSTANCE;
    }
}
