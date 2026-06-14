package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaia implements zzadq {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    public static zzaia zza(String str, String str2, boolean z) {
        zzaia zzaiaVar = new zzaia();
        zzaiaVar.zzb = Preconditions.checkNotEmpty(str);
        zzaiaVar.zzc = Preconditions.checkNotEmpty(str2);
        zzaiaVar.zzf = z;
        return zzaiaVar;
    }

    public static zzaia zzb(String str, String str2, boolean z) {
        zzaia zzaiaVar = new zzaia();
        zzaiaVar.zza = Preconditions.checkNotEmpty(str);
        zzaiaVar.zzd = Preconditions.checkNotEmpty(str2);
        zzaiaVar.zzf = z;
        return zzaiaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    private zzaia() {
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
