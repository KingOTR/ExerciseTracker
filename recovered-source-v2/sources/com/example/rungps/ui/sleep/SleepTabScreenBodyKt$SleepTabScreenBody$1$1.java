package com.example.rungps.ui.sleep;

import androidx.compose.runtime.MutableState;
import androidx.health.connect.client.PermissionController;
import com.example.rungps.health.HealthConnectManager;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HealthConnectManager $hc;
    final /* synthetic */ MutableState<Boolean> $hcHasSleepPerms$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$1$1(HealthConnectManager healthConnectManager, MutableState<Boolean> mutableState, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$1$1> continuation) {
        super(2, continuation);
        this.$hc = healthConnectManager;
        this.$hcHasSleepPerms$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepTabScreenBodyKt$SleepTabScreenBody$1$1 sleepTabScreenBodyKt$SleepTabScreenBody$1$1 = new SleepTabScreenBodyKt$SleepTabScreenBody$1$1(this.$hc, this.$hcHasSleepPerms$delegate, continuation);
        sleepTabScreenBodyKt$SleepTabScreenBody$1$1.L$0 = obj;
        return sleepTabScreenBodyKt$SleepTabScreenBody$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState<Boolean> mutableState;
        PermissionController permissionController;
        HealthConnectManager healthConnectManager;
        boolean z;
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<Boolean> mutableState2 = this.$hcHasSleepPerms$delegate;
            HealthConnectManager healthConnectManager2 = this.$hc;
            try {
                Result.Companion companion = Result.INSTANCE;
                permissionController = healthConnectManager2.permissionController();
            } catch (Throwable th) {
                th = th;
                mutableState = mutableState2;
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                Boolean boxBoolean = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                SleepTabScreenBodyKt.SleepTabScreenBody$lambda$5(mutableState, ((Boolean) m7905constructorimpl).booleanValue());
                return Unit.INSTANCE;
            }
            if (permissionController == null) {
                mutableState = mutableState2;
                z = false;
                m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(z));
                Boolean boxBoolean2 = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    m7905constructorimpl = boxBoolean2;
                }
                SleepTabScreenBodyKt.SleepTabScreenBody$lambda$5(mutableState, ((Boolean) m7905constructorimpl).booleanValue());
                return Unit.INSTANCE;
            }
            this.L$0 = healthConnectManager2;
            this.L$1 = mutableState2;
            this.label = 1;
            Object grantedPermissions = permissionController.getGrantedPermissions(this);
            if (grantedPermissions == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableState = mutableState2;
            obj = grantedPermissions;
            healthConnectManager = healthConnectManager2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$1;
            healthConnectManager = (HealthConnectManager) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                Boolean boxBoolean22 = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                SleepTabScreenBodyKt.SleepTabScreenBody$lambda$5(mutableState, ((Boolean) m7905constructorimpl).booleanValue());
                return Unit.INSTANCE;
            }
        }
        z = ((Set) obj).containsAll(healthConnectManager.getSleepReadPermissions());
        m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(z));
        Boolean boxBoolean222 = Boxing.boxBoolean(false);
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
        }
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$5(mutableState, ((Boolean) m7905constructorimpl).booleanValue());
        return Unit.INSTANCE;
    }
}
