package com.google.firebase.auth.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.example.rungps.tracking.TrackingService;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.MultiFactor;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
public class zzad extends FirebaseUser {
    public static final Parcelable.Creator<zzad> CREATOR = new zzag();
    private zzagl zza;
    private zzz zzb;
    private String zzc;
    private String zzd;
    private List<zzz> zze;
    private List<String> zzf;
    private String zzg;
    private Boolean zzh;
    private zzaf zzi;
    private boolean zzj;
    private com.google.firebase.auth.zze zzk;
    private zzbl zzl;
    private List<com.google.firebase.auth.zzan> zzm;

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public Uri getPhotoUrl() {
        return this.zzb.getPhotoUrl();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final FirebaseApp zza() {
        return FirebaseApp.getInstance(this.zzc);
    }

    public final com.google.firebase.auth.zze zzh() {
        return this.zzk;
    }

    public static FirebaseUser zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser) {
        zzad zzadVar = new zzad(firebaseApp, firebaseUser.getProviderData());
        if (firebaseUser instanceof zzad) {
            zzad zzadVar2 = (zzad) firebaseUser;
            zzadVar.zzg = zzadVar2.zzg;
            zzadVar.zzd = zzadVar2.zzd;
            zzadVar.zzi = (zzaf) zzadVar2.getMetadata();
        } else {
            zzadVar.zzi = null;
        }
        if (firebaseUser.zzc() != null) {
            zzadVar.zza(firebaseUser.zzc());
        }
        if (!firebaseUser.isAnonymous()) {
            zzadVar.zzb();
        }
        return zzadVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final /* synthetic */ FirebaseUser zzb() {
        this.zzh = false;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final synchronized FirebaseUser zza(List<? extends UserInfo> list) {
        Preconditions.checkNotNull(list);
        this.zze = new ArrayList(list.size());
        this.zzf = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            UserInfo userInfo = list.get(i);
            if (userInfo.getProviderId().equals(FirebaseAuthProvider.PROVIDER_ID)) {
                this.zzb = (zzz) userInfo;
            } else {
                this.zzf.add(userInfo.getProviderId());
            }
            this.zze.add((zzz) userInfo);
        }
        if (this.zzb == null) {
            this.zzb = this.zze.get(0);
        }
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public FirebaseUserMetadata getMetadata() {
        return this.zzi;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public /* synthetic */ MultiFactor getMultiFactor() {
        return new zzah(this);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final zzagl zzc() {
        return this.zza;
    }

    public final zzad zza(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zzd() {
        return zzc().zzc();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public String getDisplayName() {
        return this.zzb.getDisplayName();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public String getEmail() {
        return this.zzb.getEmail();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public String getPhoneNumber() {
        return this.zzb.getPhoneNumber();
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public String getProviderId() {
        return this.zzb.getProviderId();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final String zze() {
        return this.zza.zzf();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public String getTenantId() {
        Map map;
        zzagl zzaglVar = this.zza;
        if (zzaglVar == null || zzaglVar.zzc() == null || (map = (Map) zzbg.zza(this.zza.zzc()).getClaims().get(FirebaseAuthProvider.PROVIDER_ID)) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    @Override // com.google.firebase.auth.FirebaseUser, com.google.firebase.auth.UserInfo
    public String getUid() {
        return this.zzb.getUid();
    }

    public final List<MultiFactorInfo> zzi() {
        zzbl zzblVar = this.zzl;
        if (zzblVar != null) {
            return zzblVar.zza();
        }
        return new ArrayList();
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List<com.google.firebase.auth.zzan> zzf() {
        return this.zzm;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public List<? extends UserInfo> getProviderData() {
        return this.zze;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final List<String> zzg() {
        return this.zzf;
    }

    public final List<zzz> zzj() {
        return this.zze;
    }

    public zzad(FirebaseApp firebaseApp, List<? extends UserInfo> list) {
        Preconditions.checkNotNull(firebaseApp);
        this.zzc = firebaseApp.getName();
        this.zzd = "com.google.firebase.auth.internal.DefaultFirebaseUser";
        this.zzg = ExifInterface.GPS_MEASUREMENT_2D;
        zza(list);
    }

    zzad(zzagl zzaglVar, zzz zzzVar, String str, String str2, List<zzz> list, List<String> list2, String str3, Boolean bool, zzaf zzafVar, boolean z, com.google.firebase.auth.zze zzeVar, zzbl zzblVar, List<com.google.firebase.auth.zzan> list3) {
        this.zza = zzaglVar;
        this.zzb = zzzVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = list;
        this.zzf = list2;
        this.zzg = str3;
        this.zzh = bool;
        this.zzi = zzafVar;
        this.zzj = z;
        this.zzk = zzeVar;
        this.zzl = zzblVar;
        this.zzm = list3;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zza(zzagl zzaglVar) {
        this.zza = (zzagl) Preconditions.checkNotNull(zzaglVar);
    }

    public final void zza(com.google.firebase.auth.zze zzeVar) {
        this.zzk = zzeVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zzb(List<com.google.firebase.auth.zzan> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.zzm = list;
    }

    public final void zza(boolean z) {
        this.zzj = z;
    }

    public final void zza(zzaf zzafVar) {
        this.zzi = zzafVar;
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public final void zzc(List<MultiFactorInfo> list) {
        this.zzl = zzbl.zza(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, zzc(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.zze, false);
        SafeParcelWriter.writeStringList(parcel, 6, zzg(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, Boolean.valueOf(isAnonymous()), false);
        SafeParcelWriter.writeParcelable(parcel, 9, getMetadata(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzl, i, false);
        SafeParcelWriter.writeTypedList(parcel, 13, zzf(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.FirebaseUser
    public boolean isAnonymous() {
        GetTokenResult zza;
        Boolean bool = this.zzh;
        if (bool == null || bool.booleanValue()) {
            zzagl zzaglVar = this.zza;
            String str = "";
            if (zzaglVar != null && (zza = zzbg.zza(zzaglVar.zzc())) != null) {
                str = zza.getSignInProvider();
            }
            boolean z = true;
            if (getProviderData().size() > 1 || (str != null && str.equals(TrackingService.PLAN_CUSTOM))) {
                z = false;
            }
            this.zzh = Boolean.valueOf(z);
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.firebase.auth.UserInfo
    public boolean isEmailVerified() {
        return this.zzb.isEmailVerified();
    }

    public final boolean zzk() {
        return this.zzj;
    }
}
