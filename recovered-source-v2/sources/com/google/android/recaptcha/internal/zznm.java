package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public enum zznm {
    DOUBLE(zznn.DOUBLE, 1),
    FLOAT(zznn.FLOAT, 5),
    INT64(zznn.LONG, 0),
    UINT64(zznn.LONG, 0),
    INT32(zznn.INT, 0),
    FIXED64(zznn.LONG, 1),
    FIXED32(zznn.INT, 5),
    BOOL(zznn.BOOLEAN, 0),
    STRING(zznn.STRING, 2),
    GROUP(zznn.MESSAGE, 3),
    MESSAGE(zznn.MESSAGE, 2),
    BYTES(zznn.BYTE_STRING, 2),
    UINT32(zznn.INT, 0),
    ENUM(zznn.ENUM, 0),
    SFIXED32(zznn.INT, 5),
    SFIXED64(zznn.LONG, 1),
    SINT32(zznn.INT, 0),
    SINT64(zznn.LONG, 0);

    private final zznn zzt;

    zznm(zznn zznnVar, int i) {
        this.zzt = zznnVar;
    }

    public final zznn zza() {
        return this.zzt;
    }
}
