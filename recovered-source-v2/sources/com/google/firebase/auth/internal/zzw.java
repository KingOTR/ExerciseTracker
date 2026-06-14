package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzagv;
import com.google.firebase.auth.ActionCodeInfo;
import com.google.firebase.auth.ActionCodeResult;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
public final class zzw implements ActionCodeResult {
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final ActionCodeInfo zzd;

    @Override // com.google.firebase.auth.ActionCodeResult
    public final int getOperation() {
        return this.zza;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final ActionCodeInfo getInfo() {
        return this.zzd;
    }

    @Override // com.google.firebase.auth.ActionCodeResult
    public final String getData(int i) {
        if (this.zza == 4) {
            return null;
        }
        if (i == 0) {
            return this.zzb;
        }
        if (i != 1) {
            return null;
        }
        return this.zzc;
    }

    public zzw(zzagv zzagvVar) {
        int i;
        this.zzb = zzagvVar.zzg() ? zzagvVar.zzc() : zzagvVar.zzb();
        this.zzc = zzagvVar.zzb();
        ActionCodeInfo actionCodeInfo = null;
        if (!zzagvVar.zzh()) {
            this.zza = 3;
            this.zzd = null;
            return;
        }
        String zzd = zzagvVar.zzd();
        zzd.hashCode();
        i = 5;
        switch (zzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i = 6;
                break;
            case "PASSWORD_RESET":
                i = 0;
                break;
            case "VERIFY_EMAIL":
                i = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i = 4;
                break;
            case "RECOVER_EMAIL":
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        this.zza = i;
        if (i == 4 || i == 3) {
            this.zzd = null;
            return;
        }
        if (zzagvVar.zzf()) {
            actionCodeInfo = new zzt(zzagvVar.zzb(), zzbi.zza(zzagvVar.zza()));
        } else if (zzagvVar.zzg()) {
            actionCodeInfo = new zzr(zzagvVar.zzc(), zzagvVar.zzb());
        } else if (zzagvVar.zze()) {
            actionCodeInfo = new zzu(zzagvVar.zzb());
        }
        this.zzd = actionCodeInfo;
    }
}
