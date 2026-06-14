package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public enum zzkj {
    DOUBLE(0, 1, zzld.DOUBLE),
    FLOAT(1, 1, zzld.FLOAT),
    INT64(2, 1, zzld.LONG),
    UINT64(3, 1, zzld.LONG),
    INT32(4, 1, zzld.INT),
    FIXED64(5, 1, zzld.LONG),
    FIXED32(6, 1, zzld.INT),
    BOOL(7, 1, zzld.BOOLEAN),
    STRING(8, 1, zzld.STRING),
    MESSAGE(9, 1, zzld.MESSAGE),
    BYTES(10, 1, zzld.BYTE_STRING),
    UINT32(11, 1, zzld.INT),
    ENUM(12, 1, zzld.ENUM),
    SFIXED32(13, 1, zzld.INT),
    SFIXED64(14, 1, zzld.LONG),
    SINT32(15, 1, zzld.INT),
    SINT64(16, 1, zzld.LONG),
    GROUP(17, 1, zzld.MESSAGE),
    DOUBLE_LIST(18, 2, zzld.DOUBLE),
    FLOAT_LIST(19, 2, zzld.FLOAT),
    INT64_LIST(20, 2, zzld.LONG),
    UINT64_LIST(21, 2, zzld.LONG),
    INT32_LIST(22, 2, zzld.INT),
    FIXED64_LIST(23, 2, zzld.LONG),
    FIXED32_LIST(24, 2, zzld.INT),
    BOOL_LIST(25, 2, zzld.BOOLEAN),
    STRING_LIST(26, 2, zzld.STRING),
    MESSAGE_LIST(27, 2, zzld.MESSAGE),
    BYTES_LIST(28, 2, zzld.BYTE_STRING),
    UINT32_LIST(29, 2, zzld.INT),
    ENUM_LIST(30, 2, zzld.ENUM),
    SFIXED32_LIST(31, 2, zzld.INT),
    SFIXED64_LIST(32, 2, zzld.LONG),
    SINT32_LIST(33, 2, zzld.INT),
    SINT64_LIST(34, 2, zzld.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzld.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzld.FLOAT),
    INT64_LIST_PACKED(37, 3, zzld.LONG),
    UINT64_LIST_PACKED(38, 3, zzld.LONG),
    INT32_LIST_PACKED(39, 3, zzld.INT),
    FIXED64_LIST_PACKED(40, 3, zzld.LONG),
    FIXED32_LIST_PACKED(41, 3, zzld.INT),
    BOOL_LIST_PACKED(42, 3, zzld.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzld.INT),
    ENUM_LIST_PACKED(44, 3, zzld.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzld.INT),
    SFIXED64_LIST_PACKED(46, 3, zzld.LONG),
    SINT32_LIST_PACKED(47, 3, zzld.INT),
    SINT64_LIST_PACKED(48, 3, zzld.LONG),
    GROUP_LIST(49, 2, zzld.MESSAGE),
    MAP(50, 4, zzld.VOID);

    private static final zzkj[] zzZ;
    private final int zzab;

    static {
        zzkj[] values = values();
        zzZ = new zzkj[values.length];
        for (zzkj zzkjVar : values) {
            zzZ[zzkjVar.zzab] = zzkjVar;
        }
    }

    zzkj(int i, int i2, zzld zzldVar) {
        this.zzab = i;
        int i3 = i2 - 1;
        if (i3 == 1) {
            zzldVar.zza();
        } else if (i3 == 3) {
            zzldVar.zza();
        }
        if (i2 == 1) {
            zzld zzldVar2 = zzld.VOID;
            zzldVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzab;
    }
}
