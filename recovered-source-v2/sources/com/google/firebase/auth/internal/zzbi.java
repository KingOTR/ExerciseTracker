package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzahp;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
public final class zzbi {
    public static MultiFactorInfo zza(zzags zzagsVar) {
        if (zzagsVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzagsVar.zze())) {
            return new PhoneMultiFactorInfo(zzagsVar.zzd(), zzagsVar.zzc(), zzagsVar.zza(), Preconditions.checkNotEmpty(zzagsVar.zze()));
        }
        if (zzagsVar.zzb() != null) {
            return new TotpMultiFactorInfo(zzagsVar.zzd(), zzagsVar.zzc(), zzagsVar.zza(), (zzahp) Preconditions.checkNotNull(zzagsVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List<MultiFactorInfo> zza(List<zzags> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<zzags> it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo zza = zza(it.next());
            if (zza != null) {
                arrayList.add(zza);
            }
        }
        return arrayList;
    }
}
