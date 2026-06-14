package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.auth.PhoneAuthCredential;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaew {
    private static final Logger zza = new Logger("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzaez> zzd = new HashMap<>();

    final zzade zza(zzade zzadeVar, String str) {
        return new zzaex(this, zzadeVar, str);
    }

    static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    final String zzb() {
        try {
            String packageName = this.zzb.getPackageName();
            String zza2 = zza(packageName, Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners()[0].toCharsString());
            if (zza2 != null) {
                return zza2;
            }
            zza.e("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    private static String zza(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(StandardCharsets.UTF_8));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.d("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            zza.e("NoSuchAlgorithm: " + e.getMessage(), new Object[0]);
            return null;
        }
    }

    static /* synthetic */ void zza(zzaew zzaewVar, String str) {
        zzaez zzaezVar = zzaewVar.zzd.get(str);
        if (zzaezVar == null || zzag.zzc(zzaezVar.zzd) || zzag.zzc(zzaezVar.zze) || zzaezVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(PhoneAuthCredential.zza(zzaezVar.zzd, zzaezVar.zze));
        }
        zzaezVar.zzh = true;
    }

    zzaew(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null || zzaezVar.zzh || zzag.zzc(zzaezVar.zzd)) {
            return;
        }
        zza.w("Timed out waiting for SMS.", new Object[0]);
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(zzaezVar.zzd);
        }
        zzaezVar.zzi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zzb(String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null) {
            return;
        }
        if (!zzaezVar.zzi) {
            zze(str);
        }
        zzc(str);
    }

    final void zzb(zzade zzadeVar, String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null) {
            return;
        }
        zzaezVar.zzb.add(zzadeVar);
        if (zzaezVar.zzg) {
            zzadeVar.zzb(zzaezVar.zzd);
        }
        if (zzaezVar.zzh) {
            zzadeVar.zza(PhoneAuthCredential.zza(zzaezVar.zzd, zzaezVar.zze));
        }
        if (zzaezVar.zzi) {
            zzadeVar.zza(zzaezVar.zzd);
        }
    }

    final void zzc(String str) {
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar == null) {
            return;
        }
        if (zzaezVar.zzf != null && !zzaezVar.zzf.isDone()) {
            zzaezVar.zzf.cancel(false);
        }
        zzaezVar.zzb.clear();
        this.zzd.remove(str);
    }

    final void zza(final String str, zzade zzadeVar, long j, boolean z) {
        this.zzd.put(str, new zzaez(j, z));
        zzb(zzadeVar, str);
        zzaez zzaezVar = this.zzd.get(str);
        if (zzaezVar.zza <= 0) {
            zza.w("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaezVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzaev
            @Override // java.lang.Runnable
            public final void run() {
                zzaew.this.zzb(str);
            }
        }, zzaezVar.zza, TimeUnit.SECONDS);
        if (!zzaezVar.zzc) {
            zza.w("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafa zzafaVar = new zzafa(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
        zzc.zza(this.zzb.getApplicationContext(), zzafaVar, intentFilter);
        SmsRetriever.getClient(this.zzb).startSmsRetriever().addOnFailureListener(new zzaey(this));
    }

    final boolean zzd(String str) {
        return this.zzd.get(str) != null;
    }
}
