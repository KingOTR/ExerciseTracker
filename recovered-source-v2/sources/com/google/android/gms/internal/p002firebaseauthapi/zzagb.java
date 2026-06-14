package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.autofill.HintConstants;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zzan;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public class zzagb implements zzadt<zzagb> {
    private static final String zza = "zzagb";
    private zzagd zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagb zza(String str) throws zzabg {
        zzagd zzagdVar;
        int i;
        zzage zzageVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z = false;
                    int i2 = 0;
                    while (i2 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        if (jSONObject2 == null) {
                            zzageVar = new zzage();
                            i = i2;
                        } else {
                            i = i2;
                            zzageVar = new zzage(Strings.emptyToNull(jSONObject2.optString("localId", null)), Strings.emptyToNull(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z), Strings.emptyToNull(jSONObject2.optString("displayName", null)), Strings.emptyToNull(jSONObject2.optString("photoUrl", null)), zzagu.zza(jSONObject2.optJSONArray("providerUserInfo")), Strings.emptyToNull(jSONObject2.optString("rawPassword", null)), Strings.emptyToNull(jSONObject2.optString(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzags.zza(jSONObject2.optJSONArray("mfaInfo")), zzan.zza(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzageVar);
                        i2 = i + 1;
                        z = false;
                    }
                    zzagdVar = new zzagd(arrayList);
                }
                zzagdVar = new zzagd(new ArrayList());
            } else {
                zzagdVar = new zzagd();
            }
            this.zzb = zzagdVar;
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzaid.zza(e, zza, str);
        }
    }

    public final List<zzage> zza() {
        return this.zzb.zza();
    }
}
