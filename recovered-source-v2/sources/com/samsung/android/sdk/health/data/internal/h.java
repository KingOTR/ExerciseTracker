package com.samsung.android.sdk.health.data.internal;

import com.samsung.android.sdk.health.data.IHealthDataStore;
import com.samsung.android.sdk.health.data.request.InsertDataRequest;
import com.samsung.android.sdk.health.data.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class h extends Lambda implements Function1 {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ InsertDataRequest b;
    public final /* synthetic */ com.samsung.android.sdk.health.data.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s0 s0Var, InsertDataRequest insertDataRequest, com.samsung.android.sdk.health.data.b bVar) {
        super(1);
        this.a = s0Var;
        this.b = insertDataRequest;
        this.c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CompletableCallback completableCallback;
        IHealthDataStore storeInterface = (IHealthDataStore) obj;
        Intrinsics.checkNotNullParameter(storeInterface, "storeInterface");
        String str = this.a.a;
        InsertDataRequest insertDataRequest = this.b;
        com.samsung.android.sdk.health.data.b bVar = this.c;
        synchronized (c.class) {
            c cVar = c.d;
            cVar.a.put(Long.valueOf(cVar.b), bVar);
            long j = cVar.b;
            cVar.b = 1 + j;
            completableCallback = new CompletableCallback(j, cVar.c);
        }
        storeInterface.insertData(str, insertDataRequest, completableCallback);
        return Unit.INSTANCE;
    }
}
