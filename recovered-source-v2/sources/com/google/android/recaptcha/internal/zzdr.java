package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzdr {
    public static final void zza(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.connect();
        } catch (SocketTimeoutException e) {
            throw new zzbj(zzbh.zzc, zzbg.zzad, e.getMessage());
        } catch (IOException e2) {
            throw new zzbj(zzbh.zzc, zzbg.zzae, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbj(zzbh.zzc, zzbg.zzak, e3.getMessage());
        }
    }

    public static final InputStream zzc(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (UnknownServiceException e) {
            throw new zzbj(zzbh.zzc, zzbg.zzag, e.getMessage());
        } catch (IOException e2) {
            throw new zzbj(zzbh.zzc, zzbg.zzaf, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbj(zzbh.zzc, zzbg.zzal, e3.getMessage());
        }
    }

    public static final OutputStream zzd(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getOutputStream();
        } catch (UnknownServiceException e) {
            throw new zzbj(zzbh.zzc, zzbg.zzag, e.getMessage());
        } catch (IOException e2) {
            throw new zzbj(zzbh.zzc, zzbg.zzaf, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbj(zzbh.zzc, zzbg.zzal, e3.getMessage());
        }
    }

    public static final zzbj zzb(int i) {
        return i != 403 ? i != 404 ? i != 503 ? new zzbj(zzbh.zzb, zzbg.zzK, null) : new zzbj(zzbh.zzi, zzbg.zzJ, null) : new zzbj(zzbh.zzc, zzbg.zzi, null) : new zzbj(zzbh.zzi, zzbg.zzJ, null);
    }
}
