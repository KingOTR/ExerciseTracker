package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzam();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public static com.google.android.gms.internal.p002firebaseauthapi.zzal<zzan> zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return com.google.android.gms.internal.p002firebaseauthapi.zzal.zza(new ArrayList());
        }
        com.google.android.gms.internal.p002firebaseauthapi.zzao zzg = com.google.android.gms.internal.p002firebaseauthapi.zzal.zzg();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            zzg.zza(new zzan(jSONObject.getString("credentialId"), jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME), jSONObject.getString("displayName")));
        }
        return zzg.zza();
    }

    public static final zzan zza(JSONObject jSONObject) throws JSONException {
        return new zzan(jSONObject.getString("credentialId"), jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME), jSONObject.getString("displayName"));
    }

    public static final JSONObject zza(zzan zzanVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", zzanVar.zza);
        jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, zzanVar.zzb);
        jSONObject.put("displayName", zzanVar.zzc);
        return jSONObject;
    }

    zzan(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
