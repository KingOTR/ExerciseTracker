package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.zzan;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzage {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzagu zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private zze zzk;
    private List<zzags> zzl;
    private zzal<zzan> zzm;

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzal<zzan> zzd() {
        return this.zzm;
    }

    public final zze zze() {
        return this.zzk;
    }

    public final zzage zza(zze zzeVar) {
        this.zzk = zzeVar;
        return this;
    }

    public final zzage zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzage zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzage zza(boolean z) {
        this.zzj = z;
        return this;
    }

    public final zzage zza(zzal<zzan> zzalVar) {
        Preconditions.checkNotNull(zzalVar);
        this.zzm = zzalVar;
        return this;
    }

    public final zzage zzc(String str) {
        this.zze = str;
        return this;
    }

    public final zzage zza(List<zzagr> list) {
        Preconditions.checkNotNull(list);
        zzagu zzaguVar = new zzagu();
        this.zzf = zzaguVar;
        zzaguVar.zza().addAll(list);
        return this;
    }

    public final zzagu zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzags> zzk() {
        return this.zzl;
    }

    public final List<zzagr> zzl() {
        return this.zzf.zza();
    }

    public zzage() {
        this.zzf = new zzagu();
        this.zzm = zzal.zzh();
    }

    public zzage(String str, String str2, boolean z, String str3, String str4, zzagu zzaguVar, String str5, String str6, long j, long j2, boolean z2, zze zzeVar, List<zzags> list, zzal<zzan> zzalVar) {
        zzagu zzaguVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = str3;
        this.zze = str4;
        if (zzaguVar == null) {
            zzaguVar2 = new zzagu();
        } else {
            List<zzagr> zza = zzaguVar.zza();
            zzagu zzaguVar3 = new zzagu();
            if (zza != null) {
                zzaguVar3.zza().addAll(zza);
            }
            zzaguVar2 = zzaguVar3;
        }
        this.zzf = zzaguVar2;
        this.zzg = str6;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzalVar;
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }
}
