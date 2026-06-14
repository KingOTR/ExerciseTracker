package com.google.android.recaptcha.internal;

import android.content.Context;
import com.example.rungps.nfc.GymNfcConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzdk implements zzdg {
    private static Timer zza;
    private final Context zzb;
    private final zzdl zzc;
    private final CoroutineScope zzd;
    private final zzda zze;

    public zzdk(Context context, zzdl zzdlVar, CoroutineScope coroutineScope) {
        zzda zzdaVar;
        this.zzb = context;
        this.zzc = zzdlVar;
        this.zzd = coroutineScope;
        zzcy zzcyVar = zzda.zza;
        zzda zzdaVar2 = null;
        try {
            zzdaVar = zzda.zzd;
            zzdaVar = zzdaVar == null ? new zzda(context, null) : zzdaVar;
            zzda.zzd = zzdaVar;
            zzdaVar2 = zzdaVar;
        } catch (Exception unused) {
        }
        this.zze = zzdaVar2;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        zzda zzdaVar;
        zzre zzk;
        int zzL;
        int i;
        zzda zzdaVar2 = this.zze;
        if (zzdaVar2 != null) {
            for (List<zzdb> list : CollectionsKt.windowed(zzdaVar2.zzd(), 20, 20, true)) {
                zzor zzi = zzos.zzi();
                ArrayList arrayList = new ArrayList();
                for (zzdb zzdbVar : list) {
                    try {
                        zzk = zzre.zzk(zzhz.zzg().zzj(zzdbVar.zzc()));
                        zzL = zzk.zzL();
                        i = zzL - 1;
                    } catch (Exception unused) {
                        zzda zzdaVar3 = this.zze;
                        if (zzdaVar3 != null) {
                            zzdaVar3.zzf(zzdbVar);
                        }
                    }
                    if (zzL == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        zzi.zzp(zzk.zzf());
                    } else if (i == 1) {
                        zzi.zzq(zzk.zzg());
                    }
                    arrayList.add(zzdbVar);
                }
                if (zzi.zzd() + zzi.zze() != 0) {
                    if (this.zzc.zza(((zzos) zzi.zzj()).zzd()) && (zzdaVar = this.zze) != null) {
                        zzdaVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzdh(this), GymNfcConfig.DEFAULT_SAVER_POLL_MS, GymNfcConfig.DEFAULT_SAVER_POLL_MS);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzdg
    public final void zza(zzre zzreVar) {
        BuildersKt__Builders_commonKt.launch$default(this.zzd, null, null, new zzdj(this, zzreVar, null), 3, null);
        zzh();
    }
}
