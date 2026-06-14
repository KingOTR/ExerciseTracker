package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaea implements zzadf {
    final /* synthetic */ zzady zza;

    zzaea(zzady zzadyVar) {
        this.zza = zzadyVar;
    }

    private final void zza(zzaeg zzaegVar) {
        this.zza.zzi.execute(new zzaed(this, zzaegVar));
    }

    private final void zza(Status status, AuthCredential authCredential, String str, String str2) {
        zzady.zza(this.zza, status);
        this.zza.zzn = authCredential;
        this.zza.zzo = str;
        this.zza.zzp = str2;
        if (this.zza.zzf != null) {
            this.zza.zzf.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(String str) throws RemoteException {
        Preconditions.checkState(this.zza.zza == 8, "Unexpected response type " + this.zza.zza);
        this.zza.zzu = true;
        zza(new zzaeb(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzb(String str) throws RemoteException {
        Preconditions.checkState(this.zza.zza == 8, "Unexpected response type " + this.zza.zza);
        zza(new zzadz(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzafl zzaflVar) throws RemoteException {
        Preconditions.checkState(this.zza.zza == 3, "Unexpected response type " + this.zza.zza);
        this.zza.zzl = zzaflVar;
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza() throws RemoteException {
        Preconditions.checkState(this.zza.zza == 5, "Unexpected response type " + this.zza.zza);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzzi zzziVar) {
        zza(zzziVar.zza(), zzziVar.zzb(), zzziVar.zzc(), zzziVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzzl zzzlVar) {
        this.zza.zzq = zzzlVar;
        this.zza.zza(zzaq.zza("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        Preconditions.checkState(this.zza.zza == 2, "Unexpected response type " + this.zza.zza);
        zza(status, phoneAuthCredential, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(Status status) throws RemoteException {
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null) {
            if (statusMessage.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (statusMessage.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (statusMessage.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (statusMessage.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (statusMessage.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (statusMessage.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (statusMessage.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (statusMessage.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (statusMessage.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (statusMessage.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        if (this.zza.zza == 8) {
            this.zza.zzu = true;
            zza(new zzaee(this, status));
        } else {
            zzady.zza(this.zza, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagh zzaghVar) throws RemoteException {
        this.zza.zzs = zzaghVar;
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagm zzagmVar) throws RemoteException {
        this.zza.zzr = zzagmVar;
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagl zzaglVar, zzage zzageVar) throws RemoteException {
        Preconditions.checkState(this.zza.zza == 2, "Unexpected response type: " + this.zza.zza);
        this.zza.zzj = zzaglVar;
        this.zza.zzk = zzageVar;
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagv zzagvVar) throws RemoteException {
        Preconditions.checkState(this.zza.zza == 4, "Unexpected response type " + this.zza.zza);
        this.zza.zzm = zzagvVar;
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzaha zzahaVar) throws RemoteException {
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzb() throws RemoteException {
        Preconditions.checkState(this.zza.zza == 6, "Unexpected response type " + this.zza.zza);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzc(String str) throws RemoteException {
        Preconditions.checkState(this.zza.zza == 7, "Unexpected response type " + this.zza.zza);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zzc() throws RemoteException {
        Preconditions.checkState(this.zza.zza == 9, "Unexpected response type " + this.zza.zza);
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzahh zzahhVar) throws RemoteException {
        this.zza.zzt = zzahhVar;
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(zzagl zzaglVar) throws RemoteException {
        Preconditions.checkState(this.zza.zza == 1, "Unexpected response type: " + this.zza.zza);
        this.zza.zzj = zzaglVar;
        zzady.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadf
    public final void zza(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        Preconditions.checkState(this.zza.zza == 8, "Unexpected response type " + this.zza.zza);
        this.zza.zzu = true;
        zza(new zzaec(this, phoneAuthCredential));
    }
}
