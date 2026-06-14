package com.samsung.android.sdk.health.data;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface o {
    int read() default 1010004;

    int write() default 1010004;
}
