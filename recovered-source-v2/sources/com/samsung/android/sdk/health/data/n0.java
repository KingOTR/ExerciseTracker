package com.samsung.android.sdk.health.data;

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
public final class n0 extends Lambda implements Function1 {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(s0 s0Var, Set set, c cVar) {
        super(1);
        this.a = s0Var;
        this.b = set;
        this.c = cVar;
    }

    public final void a(IHealthDataStore storeInterface) {
        Intrinsics.checkNotNullParameter(storeInterface, "storeInterface");
        storeInterface.getGrantedPermissions(this.a.a, new ArrayList(this.b), com.samsung.android.sdk.health.data.internal.m.a(this.c, new Function() { // from class: com.samsung.android.sdk.health.data.n0$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return n0.a((List) obj);
            }
        }));
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
