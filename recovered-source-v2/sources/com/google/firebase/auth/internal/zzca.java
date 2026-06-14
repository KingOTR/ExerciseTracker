package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.caverock.androidsvg.SVGParser;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorGenerator;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
public final class zzca {
    private Context zza;
    private String zzb;
    private SharedPreferences zzc;
    private Logger zzd;

    public final FirebaseUser zza() {
        String string = this.zzc.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has(SVGParser.XML_STYLESHEET_ATTR_TYPE) && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString(SVGParser.XML_STYLESHEET_ATTR_TYPE))) {
                return zza(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final zzagl zza(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        String string = this.zzc.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()), null);
        if (string != null) {
            return zzagl.zzb(string);
        }
        return null;
    }

    private final zzad zza(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        MultiFactorInfo zza;
        zzaf zza2;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String str = ExifInterface.GPS_MEASUREMENT_2D;
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                str = string3;
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(zzz.zza(jSONArray3.getString(i)));
            }
            zzad zzadVar = new zzad(FirebaseApp.getInstance(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzadVar.zza(zzagl.zzb(string));
            }
            if (!z) {
                zzadVar.zzb();
            }
            zzadVar.zza(str);
            if (jSONObject.has("userMetadata") && (zza2 = zzaf.zza(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzadVar.zza(zza2);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i2));
                    String optString = jSONObject2.optString(MultiFactorInfo.FACTOR_ID_KEY);
                    if ("phone".equals(optString)) {
                        zza = PhoneMultiFactorInfo.zza(jSONObject2);
                    } else {
                        zza = Objects.equals(optString, TotpMultiFactorGenerator.FACTOR_ID) ? TotpMultiFactorInfo.zza(jSONObject2) : null;
                    }
                    arrayList2.add(zza);
                }
                zzadVar.zzc(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList3.add(com.google.firebase.auth.zzan.zza(new JSONObject(jSONArray.getString(i3))));
                }
                zzadVar.zzb(arrayList3);
            }
            return zzadVar;
        } catch (zzzh | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e) {
            this.zzd.wtf(e);
            return null;
        }
    }

    private final String zzc(FirebaseUser firebaseUser) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (!zzad.class.isAssignableFrom(firebaseUser.getClass())) {
            return null;
        }
        zzad zzadVar = (zzad) firebaseUser;
        try {
            jSONObject.put("cachedTokenState", zzadVar.zze());
            jSONObject.put("applicationName", zzadVar.zza().getName());
            jSONObject.put(SVGParser.XML_STYLESHEET_ATTR_TYPE, "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (zzadVar.zzj() != null) {
                JSONArray jSONArray = new JSONArray();
                List<zzz> zzj = zzadVar.zzj();
                int size = zzj.size();
                if (zzj.size() > 30) {
                    this.zzd.w("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(zzj.size()));
                    size = 30;
                }
                int i = 0;
                boolean z2 = false;
                while (true) {
                    z = true;
                    if (i >= size) {
                        break;
                    }
                    zzz zzzVar = zzj.get(i);
                    if (zzzVar.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                        z2 = true;
                    }
                    if (i == size - 1 && !z2) {
                        break;
                    }
                    jSONArray.put(zzzVar.zzb());
                    i++;
                }
                if (!z2) {
                    for (int i2 = size - 1; i2 < zzj.size() && i2 >= 0; i2++) {
                        zzz zzzVar2 = zzj.get(i2);
                        if (zzzVar2.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                            jSONArray.put(zzzVar2.zzb());
                            break;
                        }
                        if (i2 == zzj.size() - 1) {
                            jSONArray.put(zzzVar2.zzb());
                        }
                    }
                    z = z2;
                    if (!z) {
                        this.zzd.w("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(zzj.size()), Integer.valueOf(size));
                        if (zzj.size() < 5) {
                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                            Iterator<zzz> it = zzj.iterator();
                            while (it.hasNext()) {
                                sb.append(String.format("Provider - %s\n", it.next().getProviderId()));
                            }
                            this.zzd.w(sb.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", zzadVar.isAnonymous());
            jSONObject.put("version", ExifInterface.GPS_MEASUREMENT_2D);
            if (zzadVar.getMetadata() != null) {
                jSONObject.put("userMetadata", ((zzaf) zzadVar.getMetadata()).zza());
            }
            List<MultiFactorInfo> enrolledFactors = ((zzah) zzadVar.getMultiFactor()).getEnrolledFactors();
            if (enrolledFactors != null && !enrolledFactors.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i3 = 0; i3 < enrolledFactors.size(); i3++) {
                    jSONArray2.put(enrolledFactors.get(i3).toJson());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List<com.google.firebase.auth.zzan> zzf = zzadVar.zzf();
            if (zzf != null && !zzf.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i4 = 0; i4 < zzf.size(); i4++) {
                    jSONArray3.put(com.google.firebase.auth.zzan.zza(zzf.get(i4)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            this.zzd.wtf("Failed to turn object into JSON", e, new Object[0]);
            throw new zzzh(e);
        }
    }

    public zzca(Context context, String str) {
        Preconditions.checkNotNull(context);
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zza = context.getApplicationContext();
        this.zzc = this.zza.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.zzb), 0);
        this.zzd = new Logger("StorageHelpers", new String[0]);
    }

    public final void zza(String str) {
        this.zzc.edit().remove(str).apply();
    }

    public final void zzb(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        String zzc = zzc(firebaseUser);
        if (TextUtils.isEmpty(zzc)) {
            return;
        }
        this.zzc.edit().putString("com.google.firebase.auth.FIREBASE_USER", zzc).apply();
    }

    public final void zza(FirebaseUser firebaseUser, zzagl zzaglVar) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzaglVar);
        this.zzc.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()), zzaglVar.zzf()).apply();
    }
}
