package com.samsung.android.sdk.health.data;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object mo7884read(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.peek() != JsonToken.NULL) {
            return Duration.ofNanos(reader.nextLong());
        }
        reader.nextNull();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter out, Object obj) {
        Duration duration = (Duration) obj;
        Intrinsics.checkNotNullParameter(out, "out");
        if (duration == null) {
            out.nullValue();
        } else {
            out.value(duration.toNanos());
        }
    }
}
