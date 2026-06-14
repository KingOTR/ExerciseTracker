package com.samsung.android.sdk.health.data;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.samsung.android.sdk.health.data.request.DataType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object mo7884read(JsonReader in) {
        Intrinsics.checkNotNullParameter(in, "in");
        String nextString = in.nextString();
        Intrinsics.checkNotNullExpressionValue(nextString, "`in`.nextString()");
        DataType b = t.b(nextString);
        Intrinsics.checkNotNullExpressionValue(b, "getDataTypeByName(name)");
        return b;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter out, Object obj) {
        DataType value = (DataType) obj;
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(value, "value");
        out.value(value.getName());
    }
}
