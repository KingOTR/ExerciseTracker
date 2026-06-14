package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
public final class zzbm {
    private static long zza = 3600000;
    private static final com.google.android.gms.internal.p002firebaseauthapi.zzal<String> zzb = com.google.android.gms.internal.p002firebaseauthapi.zzal.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");
    private static final zzbm zzc = new zzbm();
    private Task<AuthResult> zzd;
    private Task<String> zze;
    private long zzf = 0;

    public final Task<AuthResult> zza() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zzf < zza) {
            return this.zzd;
        }
        return null;
    }

    public final Task<String> zzb() {
        if (DefaultClock.getInstance().currentTimeMillis() - this.zzf < zza) {
            return this.zze;
        }
        return null;
    }

    public static zzbm zzc() {
        return zzc;
    }

    private zzbm() {
    }

    private static void zza(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        com.google.android.gms.internal.p002firebaseauthapi.zzal<String> zzalVar = zzb;
        int size = zzalVar.size();
        int i = 0;
        while (i < size) {
            String str = zzalVar.get(i);
            i++;
            edit.remove(str);
        }
        edit.commit();
    }

    public final void zza(Context context) {
        Preconditions.checkNotNull(context);
        zza(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.zzd = null;
        this.zzf = 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(firebaseAuth);
        char c = 0;
        SharedPreferences sharedPreferences = firebaseAuth.getApp().getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        if (firebaseAuth.getApp().getName().equals(sharedPreferences.getString("firebaseAppName", ""))) {
            if (sharedPreferences.contains("verifyAssertionRequest")) {
                zzahr zzahrVar = (zzahr) SafeParcelableSerializer.deserializeFromString(sharedPreferences.getString("verifyAssertionRequest", ""), zzahr.CREATOR);
                String string = sharedPreferences.getString("operation", "");
                String string2 = sharedPreferences.getString("tenantId", null);
                String string3 = sharedPreferences.getString("firebaseUserUid", "");
                this.zzf = sharedPreferences.getLong("timestamp", 0L);
                if (string2 != null) {
                    firebaseAuth.setTenantId(string2);
                    zzahrVar.zzb(string2);
                }
                string.hashCode();
                switch (string.hashCode()) {
                    case -98509410:
                        break;
                    case 175006864:
                        if (string.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1450464913:
                        if (string.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        if (firebaseAuth.getCurrentUser().getUid().equals(string3)) {
                            this.zzd = firebaseAuth.zzc(firebaseAuth.getCurrentUser(), com.google.firebase.auth.zze.zza(zzahrVar));
                            break;
                        } else {
                            this.zzd = null;
                            break;
                        }
                    case 1:
                        if (firebaseAuth.getCurrentUser().getUid().equals(string3)) {
                            this.zzd = firebaseAuth.zza(firebaseAuth.getCurrentUser(), com.google.firebase.auth.zze.zza(zzahrVar));
                            break;
                        } else {
                            this.zzd = null;
                            break;
                        }
                    case 2:
                        this.zzd = firebaseAuth.signInWithCredential(com.google.firebase.auth.zze.zza(zzahrVar));
                        break;
                    default:
                        this.zzd = null;
                        break;
                }
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("recaptchaToken")) {
                String string4 = sharedPreferences.getString("recaptchaToken", "");
                String string5 = sharedPreferences.getString("operation", "");
                this.zzf = sharedPreferences.getLong("timestamp", 0L);
                string5.hashCode();
                if (string5.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    this.zze = Tasks.forResult(string4);
                } else {
                    this.zze = null;
                }
                zza(sharedPreferences);
                return;
            }
            if (sharedPreferences.contains("statusCode")) {
                Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                this.zzf = sharedPreferences.getLong("timestamp", 0L);
                zza(sharedPreferences);
                this.zzd = Tasks.forException(zzadg.zza(status));
            }
        }
    }

    public static void zza(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.getStatusCode());
        edit.putString("statusMessage", status.getStatusMessage());
        edit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        edit.commit();
    }

    public static void zza(Context context, FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        Preconditions.checkNotNull(firebaseUser);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.getApp().getName());
        edit.putString("firebaseUserUid", firebaseUser.getUid());
        edit.commit();
    }

    public static void zza(Context context, zzahr zzahrVar, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("verifyAssertionRequest", SafeParcelableSerializer.serializeToString(zzahrVar));
        edit.putString("operation", str);
        edit.putString("tenantId", str2);
        edit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    public static void zza(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("recaptchaToken", str);
        edit.putString("operation", str2);
        edit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }
}
