package com.samsung.android.sdk.health.data.internal;

import android.util.Log;
import com.samsung.android.sdk.health.data.c2;
import com.samsung.android.sdk.health.data.z0;
import java.util.Objects;
import java.util.function.Function;

/* loaded from: classes5.dex */
public final class k extends z0 {
    public final /* synthetic */ m b;

    public k(m mVar) {
        this.b = mVar;
    }

    @Override // com.samsung.android.sdk.health.data.a1
    public final void a(long j, c2 c2Var) {
        Object apply;
        if (this.b.a.containsKey(Long.valueOf(j))) {
            com.samsung.android.sdk.health.data.c cVar = ((l) Objects.requireNonNull((l) this.b.a.get(Long.valueOf(j)))).a;
            Log.d("[SHD]SingleCallbackDistributor", cVar.e + " success callback");
            Function function = ((l) Objects.requireNonNull((l) this.b.a.get(Long.valueOf(j)))).b;
            if (function == null) {
                apply = c2Var.a;
            } else {
                apply = function.apply(c2Var.a);
            }
            cVar.a(apply);
            this.b.a.remove(Long.valueOf(j));
        }
    }

    @Override // com.samsung.android.sdk.health.data.a1
    public final void a(long j, ErrorStatus errorStatus) {
        if (this.b.a.containsKey(Long.valueOf(j))) {
            com.samsung.android.sdk.health.data.c cVar = ((l) Objects.requireNonNull((l) this.b.a.get(Long.valueOf(j)))).a;
            Log.e("[SHD]SingleCallbackDistributor", cVar.e + " error callback (" + errorStatus.getErrorCode() + ")");
            cVar.a((Throwable) errorStatus.a());
            this.b.a.remove(Long.valueOf(j));
        }
    }
}
