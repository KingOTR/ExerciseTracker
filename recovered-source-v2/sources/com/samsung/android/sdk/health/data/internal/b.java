package com.samsung.android.sdk.health.data.internal;

import android.util.Log;
import com.samsung.android.sdk.health.data.v0;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class b extends v0 {
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // com.samsung.android.sdk.health.data.w0
    public final void a(long j) {
        if (this.b.a.containsKey(Long.valueOf(j))) {
            com.samsung.android.sdk.health.data.b bVar = (com.samsung.android.sdk.health.data.b) Objects.requireNonNull((com.samsung.android.sdk.health.data.b) this.b.a.get(Long.valueOf(j)));
            Log.d("[SHD]CompletableCallbackDistributor", bVar.e + " complete callback");
            bVar.a();
            this.b.a.remove(Long.valueOf(j));
        }
    }

    @Override // com.samsung.android.sdk.health.data.w0
    public final void a(long j, ErrorStatus errorStatus) {
        if (this.b.a.containsKey(Long.valueOf(j))) {
            com.samsung.android.sdk.health.data.b bVar = (com.samsung.android.sdk.health.data.b) Objects.requireNonNull((com.samsung.android.sdk.health.data.b) this.b.a.get(Long.valueOf(j)));
            Log.e("[SHD]CompletableCallbackDistributor", bVar.e + " error callback (" + errorStatus.getErrorCode() + ")");
            bVar.a(errorStatus.a());
            this.b.a.remove(Long.valueOf(j));
        }
    }
}
