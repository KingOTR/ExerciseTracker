package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzbj extends Exception {
    public static final /* synthetic */ int zza = 0;
    private static final Map zzb = MapsKt.mapOf(TuplesKt.to(zzrc.JS_NETWORK_ERROR, new zzbj(zzbh.zzc, zzbg.zzd, null)), TuplesKt.to(zzrc.JS_INTERNAL_ERROR, new zzbj(zzbh.zzb, zzbg.zzc, null)), TuplesKt.to(zzrc.JS_INVALID_SITE_KEY, new zzbj(zzbh.zzd, zzbg.zze, null)), TuplesKt.to(zzrc.JS_INVALID_SITE_KEY_TYPE, new zzbj(zzbh.zze, zzbg.zzf, null)), TuplesKt.to(zzrc.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzbj(zzbh.zzf, zzbg.zzg, null)), TuplesKt.to(zzrc.JS_INVALID_ACTION, new zzbj(zzbh.zzg, zzbg.zzh, null)), TuplesKt.to(zzrc.JS_PROGRAM_ERROR, new zzbj(zzbh.zzb, zzbg.zzj, null)));
    private final zzbh zzc;
    private final zzbg zzd;
    private final String zze;
    private final Map zzf = MapsKt.mapOf(TuplesKt.to(zzbh.zzc, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null)), TuplesKt.to(zzbh.zzh, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null)), TuplesKt.to(zzbh.zzd, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), TuplesKt.to(zzbh.zze, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), TuplesKt.to(zzbh.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), TuplesKt.to(zzbh.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), TuplesKt.to(zzbh.zzb, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)), TuplesKt.to(zzbh.zzj, new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null)));

    public zzbj(zzbh zzbhVar, zzbg zzbgVar, String str) {
        this.zzc = zzbhVar;
        this.zzd = zzbgVar;
        this.zze = str;
    }

    public final zzbg zza() {
        return this.zzd;
    }

    public final zzbh zzb() {
        return this.zzc;
    }

    public final RecaptchaException zzc() {
        if (Intrinsics.areEqual(this.zzd, zzbg.zzI)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        if (Intrinsics.areEqual(this.zzd, zzbg.zzap)) {
            return new RecaptchaException(RecaptchaErrorCode.NO_NETWORK_FOUND, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final String zzd() {
        return this.zze;
    }
}
