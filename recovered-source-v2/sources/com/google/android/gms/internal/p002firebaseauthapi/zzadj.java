package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.common.net.HttpHeaders;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.zzaq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadj extends AsyncTask<Void, Void, zzadi> {
    private static final Logger zza = new Logger("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzadl> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final FirebaseApp zzg;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzadi doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzadl zzadlVar = this.zzd.get();
            HttpURLConnection zza2 = zzadlVar.zza(url);
            zza2.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzadu(zzadlVar.zza(), this.zzg, zzads.zza().zzb()).zza(zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.e(String.format("Error getting project config. Failed with %s %s", zza3, Integer.valueOf(responseCode)), new Object[0]);
                return zzadi.zzb(zza3);
            }
            zzagk zzagkVar = new zzagk();
            zzagkVar.zza(new String(zza(zza2.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzagkVar.zza().contains(this.zzf) ? zzadi.zzb("UNAUTHORIZED_DOMAIN") : zzadi.zza(this.zzf);
            }
            for (String str : zzagkVar.zza()) {
                if (zza(str)) {
                    return zzadi.zza(str);
                }
            }
            return null;
        } catch (zzabg e) {
            zza.e("ConversionException encountered: " + e.getMessage(), new Object[0]);
            return null;
        } catch (IOException e2) {
            zza.e("IOException occurred: " + e2.getMessage(), new Object[0]);
            return null;
        } catch (NullPointerException e3) {
            zza.e("Null pointer encountered: " + e3.getMessage(), new Object[0]);
            return null;
        }
    }

    private static String zza(HttpURLConnection httpURLConnection) throws zzabg {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzadr.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e) {
            zza.w("Error parsing error message from response body in getErrorMessageFromBody. " + String.valueOf(e), new Object[0]);
            return null;
        }
    }

    public zzadj(String str, String str2, Intent intent, FirebaseApp firebaseApp, zzadl zzadlVar) {
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzg = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(intent);
        String checkNotEmpty = Preconditions.checkNotEmpty(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zzadlVar.zza(checkNotEmpty)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter(DatabaseFileArchive.COLUMN_KEY, checkNotEmpty).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) Preconditions.checkNotNull(str2));
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzadlVar);
        this.zze = zzadlVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(zzadi zzadiVar) {
        onPostExecute((zzadi) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzadi zzadiVar) {
        String str;
        String str2;
        Uri.Builder builder;
        zzadl zzadlVar = this.zzd.get();
        if (zzadiVar != null) {
            str = zzadiVar.zza();
            str2 = zzadiVar.zzb();
        } else {
            str = null;
            str2 = null;
        }
        if (zzadlVar == null) {
            zza.e("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str) && (builder = this.zze) != null) {
            builder.authority(str);
            zzadlVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).zzc());
        } else {
            zzadlVar.zza(this.zzb, zzaq.zza(str2));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e) {
            zza.e("Error parsing URL for auth domain check: " + str + ". " + e.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }
}
