package com.samsung.android.sdk.health.data;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lcom/samsung/android/sdk/health/data/HealthDataService;", "", "Landroid/content/Context;", "context", "Lcom/samsung/android/sdk/health/data/HealthDataStore;", "getStore", "(Landroid/content/Context;)Lcom/samsung/android/sdk/health/data/HealthDataStore;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)Lcom/samsung/android/sdk/health/data/HealthDataStore;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class HealthDataService {
    public static final HealthDataService INSTANCE = new HealthDataService();

    private HealthDataService() {
    }

    @JvmStatic
    public static final HealthDataStore getStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return INSTANCE.getStore(context, CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(new CoroutineName("healthstore"))));
    }

    public static /* synthetic */ HealthDataStore getStore$default(HealthDataService healthDataService, Context context, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 2) != 0) {
            coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(new CoroutineName("healthstore")));
        }
        return healthDataService.getStore(context, coroutineScope);
    }

    public final HealthDataStore getStore(Context context, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        z1.a(context);
        String clientPackageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(clientPackageName, "clientPackageName");
        Intrinsics.checkNotNullParameter(context, "context");
        if (s1.h == null) {
            synchronized (s1.class) {
                if (s1.h == null) {
                    s1.h = new s1(context);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        s1 s1Var = s1.h;
        Intrinsics.checkNotNull(s1Var);
        Intrinsics.checkNotNull(coroutineScope);
        return new s0(clientPackageName, s1Var, coroutineScope);
    }
}
