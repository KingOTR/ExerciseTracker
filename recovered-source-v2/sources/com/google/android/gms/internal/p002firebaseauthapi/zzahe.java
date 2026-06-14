package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public class zzahe implements zzadt<zzahe> {
    private static final String zza = "zzahe";
    private String zzb;
    private zzagu zzc;
    private String zzd;
    private String zze;
    private long zzf;

    public final long zza() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahe zza(String str) throws zzabg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("email", null));
            Strings.emptyToNull(jSONObject.optString("passwordHash", null));
            Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            Strings.emptyToNull(jSONObject.optString("displayName", null));
            Strings.emptyToNull(jSONObject.optString("photoUrl", null));
            this.zzc = zzagu.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzd = Strings.emptyToNull(jSONObject.optString("idToken", null));
            this.zze = Strings.emptyToNull(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzaid.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    public final List<zzagr> zze() {
        zzagu zzaguVar = this.zzc;
        if (zzaguVar != null) {
            return zzaguVar.zza();
        }
        return null;
    }
}
