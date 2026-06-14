package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public class zzkn extends zzkm implements zzly {
    protected zzkn(zzko zzkoVar) {
        super(zzkoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkm, com.google.android.recaptcha.internal.zzlw
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzko zzk() {
        if (!((zzko) this.zza).zzI()) {
            return (zzko) this.zza;
        }
        ((zzko) this.zza).zzb.zzg();
        return (zzko) super.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzkm
    protected final void zzn() {
        super.zzn();
        if (((zzko) this.zza).zzb != zzki.zzd()) {
            zzko zzkoVar = (zzko) this.zza;
            zzkoVar.zzb = zzkoVar.zzb.clone();
        }
    }
}
