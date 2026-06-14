package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public class zzamw {
    public static final zzamw zza;
    public static final zzamw zzb;
    public static final zzamw zzc;
    public static final zzamw zzd;
    public static final zzamw zze;
    public static final zzamw zzf;
    public static final zzamw zzg;
    public static final zzamw zzh;
    public static final zzamw zzi;
    public static final zzamw zzj;
    public static final zzamw zzk;
    public static final zzamw zzl;
    public static final zzamw zzm;
    public static final zzamw zzn;
    public static final zzamw zzo;
    public static final zzamw zzp;
    public static final zzamw zzq;
    public static final zzamw zzr;
    private static final /* synthetic */ zzamw[] zzs;
    private final zzand zzt;
    private final int zzu;

    public final int zza() {
        return this.zzu;
    }

    public final zzand zzb() {
        return this.zzt;
    }

    static {
        zzamw zzamwVar = new zzamw("DOUBLE", 0, zzand.DOUBLE, 1);
        zza = zzamwVar;
        zzamw zzamwVar2 = new zzamw("FLOAT", 1, zzand.FLOAT, 5);
        zzb = zzamwVar2;
        zzamw zzamwVar3 = new zzamw("INT64", 2, zzand.LONG, 0);
        zzc = zzamwVar3;
        zzamw zzamwVar4 = new zzamw("UINT64", 3, zzand.LONG, 0);
        zzd = zzamwVar4;
        zzamw zzamwVar5 = new zzamw("INT32", 4, zzand.INT, 0);
        zze = zzamwVar5;
        zzamw zzamwVar6 = new zzamw("FIXED64", 5, zzand.LONG, 1);
        zzf = zzamwVar6;
        zzamw zzamwVar7 = new zzamw("FIXED32", 6, zzand.INT, 5);
        zzg = zzamwVar7;
        zzamw zzamwVar8 = new zzamw("BOOL", 7, zzand.BOOLEAN, 0);
        zzh = zzamwVar8;
        int i = 2;
        zzanc zzancVar = null;
        zzamz zzamzVar = new zzamz("STRING", zzand.STRING);
        zzi = zzamzVar;
        zzamy zzamyVar = new zzamy("GROUP", zzand.MESSAGE);
        zzj = zzamyVar;
        zzanb zzanbVar = new zzanb("MESSAGE", zzand.MESSAGE);
        zzk = zzanbVar;
        zzana zzanaVar = new zzana("BYTES", zzand.BYTE_STRING);
        zzl = zzanaVar;
        zzamw zzamwVar9 = new zzamw("UINT32", 12, zzand.INT, 0);
        zzm = zzamwVar9;
        zzamw zzamwVar10 = new zzamw("ENUM", 13, zzand.ENUM, 0);
        zzn = zzamwVar10;
        zzamw zzamwVar11 = new zzamw("SFIXED32", 14, zzand.INT, 5);
        zzo = zzamwVar11;
        zzamw zzamwVar12 = new zzamw("SFIXED64", 15, zzand.LONG, 1);
        zzp = zzamwVar12;
        zzamw zzamwVar13 = new zzamw("SINT32", 16, zzand.INT, 0);
        zzq = zzamwVar13;
        zzamw zzamwVar14 = new zzamw("SINT64", 17, zzand.LONG, 0);
        zzr = zzamwVar14;
        zzs = new zzamw[]{zzamwVar, zzamwVar2, zzamwVar3, zzamwVar4, zzamwVar5, zzamwVar6, zzamwVar7, zzamwVar8, zzamzVar, zzamyVar, zzanbVar, zzanaVar, zzamwVar9, zzamwVar10, zzamwVar11, zzamwVar12, zzamwVar13, zzamwVar14};
    }

    private zzamw(String str, int i, zzand zzandVar, int i2) {
        this.zzt = zzandVar;
        this.zzu = i2;
    }

    public static zzamw[] values() {
        return (zzamw[]) zzs.clone();
    }
}
