package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzahn extends zzahh {
    private static final String zza = "zzahn";
    private String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private int zzf;
    private long zzg;

    public final int zzb() {
        return this.zzf;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahh, com.google.android.gms.internal.p002firebaseauthapi.zzadt
    public final /* synthetic */ zzahh zza(String str) throws zzabg {
        return (zzahn) zza(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahh
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzahn zza(String str) throws zzabg {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("totpSessionInfo");
            if (optJSONObject != null) {
                this.zzc = zzag.zza(optJSONObject.optString("sharedSecretKey"));
                this.zzd = optJSONObject.optInt("verificationCodeLength");
                this.zze = zzag.zza(optJSONObject.optString("hashingAlgorithm"));
                this.zzf = optJSONObject.optInt("periodSec");
                this.zzb = zzag.zza(optJSONObject.optString("sessionInfo"));
                String optString = optJSONObject.optString("finalizeEnrollmentTime");
                try {
                    this.zzg = zzane.zza(zzane.zza(optString));
                } catch (ParseException unused) {
                    Log.e(zza, "Failed to parse timestamp: " + optString);
                }
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzaid.zza(e, zza, str);
        }
    }

    public final String zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahh
    public final String zza() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzc;
    }
}
