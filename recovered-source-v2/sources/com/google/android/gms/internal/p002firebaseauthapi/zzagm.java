package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public class zzagm implements zzadt<zzagm> {
    private static final String zza = "zzagm";
    private String zzb;
    private zzal<zzagt> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagm zza(String str) throws zzabg {
        zzal<zzagt> zza2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzao zzg = zzal.zzg();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        zzg.zza(jSONObject2 == null ? zzagt.zza(null, null) : zzagt.zza(Strings.emptyToNull(jSONObject2.optString(DatabaseFileArchive.COLUMN_PROVIDER)), Strings.emptyToNull(jSONObject2.optString("enforcementState"))));
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzal.zza(new ArrayList());
                this.zzc = zza2;
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzaid.zza(e, zza, str);
        }
    }

    public final String zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzal<zzagt> zzalVar = this.zzc;
        if (zzalVar != null && !zzalVar.isEmpty()) {
            zzal<zzagt> zzalVar2 = this.zzc;
            int size = zzalVar2.size();
            int i = 0;
            while (i < size) {
                zzagt zzagtVar = zzalVar2.get(i);
                i++;
                zzagt zzagtVar2 = zzagtVar;
                String zza2 = zzagtVar2.zza();
                String zzb = zzagtVar2.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    return zzagtVar2.zza();
                }
            }
        }
        return null;
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzc(String str) {
        String zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        return zzb.equals("ENFORCE") || zzb.equals("AUDIT");
    }
}
