package com.samsung.android.sdk.health.data;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 extends TypeAdapter {
    public final DateTimeFormatter a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object mo7884read(JsonReader in) {
        Intrinsics.checkNotNullParameter(in, "in");
        if (in.peek() != JsonToken.NULL) {
            return LocalDateTime.parse(in.nextString(), this.a);
        }
        in.nextNull();
        return null;
    }

    public e1() {
        DateTimeFormatter ISO_LOCAL_DATE_TIME = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Intrinsics.checkNotNullExpressionValue(ISO_LOCAL_DATE_TIME, "ISO_LOCAL_DATE_TIME");
        this.a = ISO_LOCAL_DATE_TIME;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter out, Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        Intrinsics.checkNotNullParameter(out, "out");
        if (localDateTime == null) {
            out.nullValue();
        } else {
            out.value(localDateTime.format(this.a));
        }
    }
}
