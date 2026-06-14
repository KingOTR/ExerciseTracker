package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzcg extends SuspendLambda implements Function2 {
    final /* synthetic */ WebView zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ zzbv zzc;
    final /* synthetic */ zzdc zzd;
    final /* synthetic */ zzdq zze;
    final /* synthetic */ zzbo zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcg(WebView webView, Application application, zzbv zzbvVar, zzdc zzdcVar, zzbo zzboVar, zzdq zzdqVar, Continuation continuation) {
        super(2, continuation);
        this.zza = webView;
        this.zzb = application;
        this.zzc = zzbvVar;
        this.zzd = zzdcVar;
        this.zzf = zzboVar;
        this.zze = zzdqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzcg(this.zza, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcg) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        WebView webView = this.zza;
        return new zzgv(webView == null ? new WebView(this.zzb) : webView, this.zzb, this.zzc, this.zzd, this.zzf, this.zze);
    }
}
