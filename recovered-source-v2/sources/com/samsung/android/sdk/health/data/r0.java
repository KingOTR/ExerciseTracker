package com.samsung.android.sdk.health.data;

import android.app.Activity;
import android.content.Intent;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class r0 extends Lambda implements Function1 {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ c c;
    public final /* synthetic */ Activity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, Set set, c cVar, Activity activity) {
        super(1);
        this.a = s0Var;
        this.b = set;
        this.c = cVar;
        this.d = activity;
    }

    public final void a(IHealthDataStore storeInterface) {
        Intrinsics.checkNotNullParameter(storeInterface, "storeInterface");
        Intent requestPermissions = storeInterface.requestPermissions(this.a.a, new ArrayList(this.b), com.samsung.android.sdk.health.data.internal.m.a(this.c, new Function() { // from class: com.samsung.android.sdk.health.data.r0$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return r0.a((List) obj);
            }
        }));
        if (requestPermissions != null) {
            try {
                z1.a(this.d);
                this.d.startActivity(requestPermissions);
            } catch (Exception unused) {
                this.c.a((Throwable) new InvalidRequestException(1001, "Invalid instance of Activity"));
            }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((IHealthDataStore) obj);
        return Unit.INSTANCE;
    }

    public static final Set a(List c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return new HashSet(c);
    }
}
