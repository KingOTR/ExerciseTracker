package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzch;
import com.google.android.gms.internal.fido.zzcl;
import com.google.android.gms.internal.fido.zzcz;
import com.google.android.gms.internal.fido.zzdl;
import com.google.android.gms.internal.fido.zzdo;
import com.google.android.gms.internal.fido.zzdq;
import com.google.android.gms.internal.fido.zzdr;
import com.google.common.primitives.SignedBytes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-fido@@20.1.0 */
/* loaded from: classes3.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();
    private final byte[] zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final String[] zzd;

    AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr3);
        this.zzd = (String[]) Preconditions.checkNotNull(strArr);
    }

    public static AuthenticatorAttestationResponse deserializeFromBytes(byte[] bArr) {
        return (AuthenticatorAttestationResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.zza, authenticatorAttestationResponse.zza) && Arrays.equals(this.zzb, authenticatorAttestationResponse.zzb) && Arrays.equals(this.zzc, authenticatorAttestationResponse.zzc);
    }

    public byte[] getAttestationObject() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        return this.zzb;
    }

    @Deprecated
    public byte[] getKeyHandle() {
        return this.zza;
    }

    public String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString() {
        com.google.android.gms.internal.fido.zzam zza = com.google.android.gms.internal.fido.zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.zza;
        zza.zzb(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.zzb;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.zzc;
        zza.zzb("attestationObject", zzf3.zzg(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.zzd));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAttestationObject(), false);
        SafeParcelWriter.writeStringArray(parcel, 5, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01e8 A[Catch: JSONException -> 0x023b, TRY_LEAVE, TryCatch #4 {JSONException -> 0x023b, blocks: (B:3:0x0002, B:5:0x000b, B:6:0x0014, B:8:0x0018, B:9:0x0021, B:10:0x0028, B:12:0x002d, B:14:0x003b, B:16:0x0048, B:17:0x0041, B:20:0x004b, B:22:0x0053, B:25:0x005b, B:27:0x006d, B:28:0x0075, B:30:0x0079, B:32:0x008b, B:34:0x00a9, B:35:0x00c1, B:40:0x00e7, B:46:0x01d4, B:48:0x01e8, B:51:0x0106, B:53:0x0118, B:58:0x012c, B:61:0x014e, B:63:0x0164, B:65:0x016a, B:66:0x0181, B:67:0x0186, B:68:0x0187, B:69:0x018c, B:74:0x0197, B:76:0x01a7, B:78:0x01b5, B:79:0x01c8, B:80:0x01cd, B:81:0x01ce, B:82:0x01d3, B:83:0x01f2, B:84:0x01f7, B:86:0x01f9, B:87:0x0200, B:88:0x0201, B:89:0x0206, B:92:0x0208, B:93:0x020f, B:94:0x0210, B:95:0x0217, B:97:0x0219, B:98:0x0220, B:99:0x0221, B:100:0x0228, B:102:0x022a, B:103:0x0231, B:105:0x0233, B:106:0x023a), top: B:2:0x0002, inners: #0, #1, #2, #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject zza() {
        byte[] zza;
        try {
            JSONObject jSONObject = new JSONObject();
            byte[] bArr = this.zzb;
            if (bArr != null) {
                jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(bArr));
            }
            byte[] bArr2 = this.zzc;
            if (bArr2 != null) {
                jSONObject.put("attestationObject", Base64Utils.encodeUrlSafeNoPadding(bArr2));
            }
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                String[] strArr = this.zzd;
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, this.zzd[i]);
                }
                i++;
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    zzdr zzdrVar = (zzdr) zzdr.zzj(this.zzc).zzh().zzc().get(zzdr.zzi("authData"));
                    if (zzdrVar == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    zzcz zzc = zzdrVar.zze().zzc();
                    ByteBuffer zzi = zzc.zzi();
                    try {
                        zzi.position(zzi.position() + 32);
                        if ((zzi.get() & SignedBytes.MAX_POWER_OF_TWO) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        zzi.position(zzi.position() + 4);
                        zzi.position(zzi.position() + 16);
                        zzi.position(zzi.position() + zzi.getShort());
                        try {
                            zzdo zzh = zzdr.zzk(zzc.zzg(zzi.position(), zzc.zzd()).zzh()).zzh();
                            zzdr zzdrVar2 = (zzdr) zzh.zzc().get(zzdr.zzg(3L));
                            zzdr zzdrVar3 = (zzdr) zzh.zzc().get(zzdr.zzg(1L));
                            if (zzdrVar2 == null || zzdrVar3 == null) {
                                throw new IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long zzc2 = zzdrVar2.zzf().zzc();
                                long zzc3 = zzdrVar3.zzf().zzc();
                                if (zzc3 != 1) {
                                    if (zzc3 == 2) {
                                        zzc3 = 2;
                                    }
                                    zza = null;
                                    jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                    jSONObject.put("publicKeyAlgorithm", zzc2);
                                    if (zza != null) {
                                        jSONObject.put("publicKey", Base64Utils.encodeUrlSafeNoPadding(zza));
                                    }
                                    return jSONObject;
                                }
                                zzdr zzdrVar4 = (zzdr) zzh.zzc().get(zzdr.zzg(-1L));
                                if (zzdrVar4 == null) {
                                    throw new IllegalArgumentException("COSE key missing required fields");
                                }
                                long zzc4 = zzdrVar4.zzf().zzc();
                                if (zzc3 == 2 && zzc4 == 1) {
                                    zzdr zzdrVar5 = (zzdr) zzh.zzc().get(zzdr.zzg(-2L));
                                    zzdr zzdrVar6 = (zzdr) zzh.zzc().get(zzdr.zzg(-3L));
                                    if (zzdrVar5 == null || zzdrVar6 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    zzcz zzc5 = zzdrVar5.zze().zzc();
                                    zzcz zzc6 = zzdrVar6.zze().zzc();
                                    if (zzc5.zzd() != 32 || zzc6.zzd() != 32) {
                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                    }
                                    zza = zzcl.zza(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzc5.zzm(), zzc6.zzm());
                                } else {
                                    if (zzc3 == 1 && zzc4 == 6) {
                                        zzdr zzdrVar7 = (zzdr) zzh.zzc().get(zzdr.zzg(-2L));
                                        if (zzdrVar7 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzcz zzc7 = zzdrVar7.zze().zzc();
                                        if (zzc7.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        zza = zzcl.zza(Base64.decode("MCowBQYDK2VwAyEA", 0), zzc7.zzm());
                                    }
                                    zza = null;
                                }
                                jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                jSONObject.put("publicKeyAlgorithm", zzc2);
                                if (zza != null) {
                                }
                                return jSONObject;
                            } catch (zzdq e) {
                                throw new IllegalArgumentException("COSE key ill-formed", e);
                            }
                        } catch (zzdl | zzdq e2) {
                            throw new IllegalArgumentException("failed to parse COSE key", e2);
                        }
                    } catch (IllegalArgumentException e3) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e3);
                    }
                } catch (zzdq e4) {
                    throw new IllegalArgumentException("authData value has wrong type", e4);
                }
            } catch (zzdl | zzdq e5) {
                throw new IllegalArgumentException("failed to parse attestation object", e5);
            }
        } catch (JSONException e6) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e6);
        }
    }
}
