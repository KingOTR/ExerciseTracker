package com.samsung.android.sdk.health.data;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class d2 {
    public static Annotation a(String str, String str2, String str3, Class cls) {
        Intrinsics.checkNotNullParameter(str, str2);
        return t.b(str3).getClass().getAnnotation(cls);
    }
}
