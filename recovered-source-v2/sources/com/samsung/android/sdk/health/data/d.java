package com.samsung.android.sdk.health.data;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements ParameterizedType {
    public final Type a;
    public final Type b;
    public final Type[] c;

    public d(Type[] typeArguments) {
        Intrinsics.checkNotNullParameter(List.class, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (List.class.getEnclosingClass() != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (Type type : typeArguments) {
            a(type);
            b(type);
        }
        this.a = null;
        this.b = List.class;
        this.c = (Type[]) typeArguments.clone();
    }

    public static void a(Type type) {
        if (type == null) {
            throw new NullPointerException("typeArgument == null");
        }
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        Type type = this.a;
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        Type ownerType = parameterizedType.getOwnerType();
        Intrinsics.checkNotNull(ownerType);
        return (type == ownerType || (type != null && Intrinsics.areEqual(type, ownerType))) && Intrinsics.areEqual(this.b, parameterizedType.getRawType()) && Arrays.equals((Type[]) this.c.clone(), parameterizedType.getActualTypeArguments());
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
        Type type = this.a;
        return (type != null ? type.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        String obj;
        String obj2;
        String obj3;
        Type[] typeArr = this.c;
        if (typeArr.length == 0) {
            Type type = this.b;
            if (!(type instanceof Class)) {
                return type.toString();
            }
            String name = ((Class) type).getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        Type type2 = this.b;
        if (type2 instanceof Class) {
            obj = ((Class) type2).getName();
            Intrinsics.checkNotNullExpressionValue(obj, "type.name");
        } else {
            obj = type2.toString();
        }
        sb.append(obj);
        StringBuilder append = sb.append("<");
        Type type3 = this.c[0];
        if (type3 instanceof Class) {
            obj2 = ((Class) type3).getName();
            Intrinsics.checkNotNullExpressionValue(obj2, "type.name");
        } else {
            obj2 = type3.toString();
        }
        append.append(obj2);
        int length = this.c.length;
        for (int i = 1; i < length; i++) {
            StringBuilder append2 = sb.append(", ");
            Type type4 = this.c[i];
            if (type4 instanceof Class) {
                obj3 = ((Class) type4).getName();
                Intrinsics.checkNotNullExpressionValue(obj3, "type.name");
            } else {
                obj3 = type4.toString();
            }
            append2.append(obj3);
        }
        String sb2 = sb.append(">").toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "result.append(\">\").toString()");
        return sb2;
    }
}
