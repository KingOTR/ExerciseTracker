package com.samsung.android.sdk.health.data;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ Object mo7884read(JsonReader jsonReader) {
        return read(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter out, Object obj) {
        Instant instant = (Instant) obj;
        Intrinsics.checkNotNullParameter(out, "out");
        if (instant == null) {
            out.nullValue();
        } else {
            out.value(instant.toString());
        }
    }

    public static Instant read(JsonReader in) {
        Intrinsics.checkNotNullParameter(in, "in");
        try {
            return Instant.parse(in.nextString());
        } catch (DateTimeParseException e) {
            throw new JsonParseException("Failed to parse Instant", e);
        }
    }
}
