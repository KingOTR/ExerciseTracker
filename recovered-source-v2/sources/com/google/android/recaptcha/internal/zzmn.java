package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzmn extends zzmu {
    zzmn(int i) {
        super(i, null);
    }

    @Override // com.google.android.recaptcha.internal.zzmu
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzb(); i++) {
                ((zzkh) zzg(i).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzkh) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
