package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.internal.annotation.ApiVersion;
import com.samsung.android.sdk.health.data.permission.AccessType;
import com.samsung.android.sdk.health.data.permission.Permission;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

/* loaded from: classes5.dex */
public abstract class e2 {
    public static int a(Set permissions) {
        int write;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Iterator it = permissions.iterator();
        int i = DurationKt.NANOS_IN_MILLIS;
        while (it.hasNext()) {
            Permission permission = (Permission) it.next();
            o oVar = (o) permission.getDataType().getClass().getAnnotation(o.class);
            Integer num = null;
            if (permission.getAccessType() == AccessType.READ) {
                if (oVar != null) {
                    write = oVar.read();
                    num = Integer.valueOf(write);
                    Intrinsics.checkNotNull(num);
                    i = Math.max(i, num.intValue());
                } else {
                    Intrinsics.checkNotNull(num);
                    i = Math.max(i, num.intValue());
                }
            } else if (oVar != null) {
                write = oVar.write();
                num = Integer.valueOf(write);
                Intrinsics.checkNotNull(num);
                i = Math.max(i, num.intValue());
            } else {
                Intrinsics.checkNotNull(num);
                i = Math.max(i, num.intValue());
            }
        }
        return i;
    }

    public static int a() {
        Method method;
        Method method2;
        ApiVersion apiVersion;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        Class<?> cls = Class.forName(stackTraceElement.getClassName());
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "clazz.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = declaredMethods[i2];
            if (Intrinsics.areEqual(method2.getName(), stackTraceElement.getMethodName())) {
                break;
            }
            i2++;
        }
        if (method2 == null) {
            Method[] methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "clazz.methods");
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (Intrinsics.areEqual(method3.getName(), stackTraceElement.getMethodName())) {
                    method = method3;
                    break;
                }
                i++;
            }
        } else {
            method = method2;
        }
        return (method == null || (apiVersion = (ApiVersion) method.getAnnotation(ApiVersion.class)) == null) ? BuildConfig.SDK_VERSION_CODE : apiVersion.minRequired();
    }
}
