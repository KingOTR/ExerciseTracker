package com.google.android.recaptcha.internal;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzdc {
    private final String zza;
    private String zzb;
    private String zzc;
    private final Context zzd;
    private final zzdg zze;
    private String zzf;
    private Integer zzg;

    private zzdc(zzdc zzdcVar) {
        this(zzdcVar.zza, zzdcVar.zzb, zzdcVar.zzc, zzdcVar.zzd, zzdcVar.zze);
        this.zzf = zzdcVar.zzf;
        this.zzg = zzdcVar.zzg;
    }

    private zzdc(String str, String str2, String str3, Context context, zzdg zzdgVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = context;
        this.zze = zzdgVar;
    }

    public /* synthetic */ zzdc(String str, String str2, String str3, Context context, zzdg zzdgVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, context, zzdgVar);
    }

    public final zzdc zza() {
        return new zzdc(this);
    }

    public final zzdc zzb(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public final zzdc zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(zzre zzreVar) {
        this.zze.zza(zzreVar);
    }

    public final zzdf zzf(int i) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzf;
        zzbw zzbwVar = new zzbw();
        Context context = this.zzd;
        Integer num = this.zzg;
        return new zzdf(i, this.zza, str, str2, str3, null, this.zze, zzbwVar, context, num);
    }
}
