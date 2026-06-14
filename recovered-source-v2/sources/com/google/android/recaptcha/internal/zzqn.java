package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzqn extends zzks implements zzly {
    private static final zzqn zzb;
    private int zzd;
    private String zze = "";
    private zzkz zzf = zzz();

    static {
        zzqn zzqnVar = new zzqn();
        zzb = zzqnVar;
        zzks.zzF(zzqn.class, zzqnVar);
    }

    private zzqn() {
    }

    public static zzqm zzf() {
        return (zzqm) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzqn zzqnVar, String str) {
        str.getClass();
        zzqnVar.zzd |= 1;
        zzqnVar.zze = str;
    }

    static /* synthetic */ void zzj(zzqn zzqnVar, zzql zzqlVar) {
        zzqlVar.getClass();
        zzkz zzkzVar = zzqnVar.zzf;
        if (!zzkzVar.zzc()) {
            zzqnVar.zzf = zzks.zzA(zzkzVar);
        }
        zzqnVar.zzf.add(zzqlVar);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zzd", "zzf", zzql.class, "zze"});
        }
        if (i2 == 3) {
            return new zzqn();
        }
        zzqi zzqiVar = null;
        if (i2 == 4) {
            return new zzqm(zzqiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
