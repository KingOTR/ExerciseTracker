package com.example.rungps;

import android.content.Context;
import androidx.health.connect.client.PermissionController;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.ui.onboarding.OnboardingPermissions;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.MainActivity$refreshOnboardingPermissionLines$1", f = "MainActivity.kt", i = {}, l = {376, 378}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MainActivity$refreshOnboardingPermissionLines$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$refreshOnboardingPermissionLines$1(MainActivity mainActivity, Continuation<? super MainActivity$refreshOnboardingPermissionLines$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainActivity$refreshOnboardingPermissionLines$1 mainActivity$refreshOnboardingPermissionLines$1 = new MainActivity$refreshOnboardingPermissionLines$1(this.this$0, continuation);
        mainActivity$refreshOnboardingPermissionLines$1.L$0 = obj;
        return mainActivity$refreshOnboardingPermissionLines$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$refreshOnboardingPermissionLines$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Set<String> set;
        String healthConnectStatusLine;
        Set set2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context applicationContext = this.this$0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            HealthConnectManager healthConnectManager = new HealthConnectManager(applicationContext);
            Result.Companion companion2 = Result.INSTANCE;
            PermissionController permissionController = healthConnectManager.permissionController();
            if (permissionController == null) {
                set2 = null;
                m7905constructorimpl = Result.m7905constructorimpl(set2);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    m7905constructorimpl = null;
                }
                set = (Set) m7905constructorimpl;
                if (set == null) {
                    set = SetsKt.emptySet();
                }
                OnboardingPermissions onboardingPermissions = OnboardingPermissions.INSTANCE;
                Context applicationContext2 = this.this$0.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                healthConnectStatusLine = onboardingPermissions.healthConnectStatusLine(applicationContext2, set);
                this.label = 2;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, healthConnectStatusLine, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            this.label = 1;
            obj = permissionController.getGrantedPermissions(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        set2 = (Set) obj;
        m7905constructorimpl = Result.m7905constructorimpl(set2);
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
        }
        set = (Set) m7905constructorimpl;
        if (set == null) {
        }
        OnboardingPermissions onboardingPermissions2 = OnboardingPermissions.INSTANCE;
        Context applicationContext22 = this.this$0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext22, "getApplicationContext(...)");
        healthConnectStatusLine = onboardingPermissions2.healthConnectStatusLine(applicationContext22, set);
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, healthConnectStatusLine, null), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.MainActivity$refreshOnboardingPermissionLines$1$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.MainActivity$refreshOnboardingPermissionLines$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $line;
        int label;
        final /* synthetic */ MainActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainActivity mainActivity, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mainActivity;
            this.$line = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$line, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.setOnboardingHealthStatusLine(this.$line);
            return Unit.INSTANCE;
        }
    }
}
