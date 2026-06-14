package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.AssetHelper;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzgp extends WebViewClient {
    final /* synthetic */ zzgv zza;

    zzgp(zzgv zzgvVar) {
        this.zza = zzgvVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzgz zzgzVar;
        zzgzVar = this.zza.zzj;
        long zza = zzgzVar.zza(TimeUnit.MICROSECONDS);
        int i = zzbq.zza;
        zzbq.zza(zzbr.zzg.zza(), zza);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Use onReceivedError(WebView,request,error) instead")
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Map map;
        super.onReceivedError(webView, i, str, str2);
        zzbh zzbhVar = zzbh.zzc;
        map = this.zza.zzh;
        zzbg zzbgVar = (zzbg) map.get(Integer.valueOf(i));
        if (zzbgVar == null) {
            zzbgVar = zzbg.zzM;
        }
        zzbj zzbjVar = new zzbj(zzbhVar, zzbgVar, null);
        this.zza.zzu().hashCode();
        zzbjVar.getMessage();
        this.zza.zzu().completeExceptionally(zzbjVar);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Use shouldInterceptRequest(WebView,WebResourceRequest) instead")
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        int i = zzdt.zza;
        Intrinsics.checkNotNull(parse);
        if (!zzdt.zzc(parse) || zzdt.zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzQ, null);
        this.zza.zzu().hashCode();
        parse.toString();
        this.zza.zzu().completeExceptionally(zzbjVar);
        return new WebResourceResponse(AssetHelper.DEFAULT_MIME_TYPE, "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
