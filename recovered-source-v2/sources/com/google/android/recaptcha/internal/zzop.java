package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzop extends zzks implements zzly {
    private static final zzop zzb;
    private int zzd;
    private Object zzf;
    private int zzg;
    private long zzl;
    private zzka zzm;
    private int zzn;
    private zzod zzo;
    private zzpb zzp;
    private zzmz zzr;
    private zzka zzs;
    private int zzu;
    private int zze = 0;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private zzkx zzt = zzw();

    static {
        zzop zzopVar = new zzop();
        zzb = zzopVar;
        zzks.zzF(zzop.class, zzopVar);
    }

    private zzop() {
    }

    public static zzop zzJ(byte[] bArr) throws zzlc {
        return (zzop) zzks.zzv(zzb, bArr);
    }

    static /* synthetic */ void zzO(zzop zzopVar, zzod zzodVar) {
        zzopVar.zzo = zzodVar;
        zzopVar.zzd |= 2;
    }

    static /* synthetic */ void zzP(zzop zzopVar, zzpb zzpbVar) {
        zzpbVar.getClass();
        zzopVar.zzp = zzpbVar;
        zzopVar.zzd |= 4;
    }

    static /* synthetic */ void zzR(zzop zzopVar, int i) {
        zzkx zzkxVar = zzopVar.zzt;
        if (!zzkxVar.zzc()) {
            zzopVar.zzt = zzks.zzx(zzkxVar);
        }
        zzopVar.zzt.zzh(0);
    }

    static /* synthetic */ void zzS(zzop zzopVar, int i) {
        zzopVar.zzd |= 32;
        zzopVar.zzu = i;
    }

    static /* synthetic */ void zzT(zzop zzopVar, String str) {
        str.getClass();
        zzopVar.zzh = str;
    }

    static /* synthetic */ void zzU(zzop zzopVar, String str) {
        str.getClass();
        zzopVar.zzi = str;
    }

    public static zzoo zzi() {
        return (zzoo) zzb.zzp();
    }

    public static zzop zzk() {
        return zzb;
    }

    public final String zzK() {
        return this.zzi;
    }

    public final String zzL() {
        return this.zzj;
    }

    public final boolean zzV() {
        return (this.zzd & 2) != 0;
    }

    public final int zzW() {
        int i;
        switch (this.zzg) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case 20:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            case 22:
                i = 24;
                break;
            case 23:
                i = 25;
                break;
            case 24:
                i = 26;
                break;
            case 25:
                i = 27;
                break;
            case 26:
                i = 28;
                break;
            case 27:
                i = 29;
                break;
            case 28:
                i = 30;
                break;
            case 29:
                i = 31;
                break;
            case 30:
                i = 32;
                break;
            case 31:
                i = 33;
                break;
            case 32:
                i = 34;
                break;
            case 33:
                i = 35;
                break;
            case 34:
                i = 36;
                break;
            case 35:
                i = 37;
                break;
            case 36:
                i = 38;
                break;
            case 37:
                i = 39;
                break;
            case 38:
                i = 40;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzX() {
        int i = this.zzn;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    @Deprecated
    public final long zzf() {
        return this.zzl;
    }

    public final zzod zzg() {
        zzod zzodVar = this.zzo;
        return zzodVar == null ? zzod.zzj() : zzodVar;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0010\u0001\u0001\u0001\u0012\u0010\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005", new Object[]{"zzf", "zze", "zzd", "zzg", "zzi", "zzl", "zzn", "zzo", "zzp", "zzq", "zzj", "zzk", "zzm", "zzr", "zzs", "zzh", zznw.class, "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new zzop();
        }
        zzon zzonVar = null;
        if (i2 == 4) {
            return new zzoo(zzonVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
