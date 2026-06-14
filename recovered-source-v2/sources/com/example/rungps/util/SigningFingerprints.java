package com.example.rungps.util;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SigningFingerprints.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002¨\u0006\u000e"}, d2 = {"Lcom/example/rungps/util/SigningFingerprints;", "", "<init>", "()V", "currentApp", "Lcom/example/rungps/util/SigningFingerprints$Fingerprints;", "context", "Landroid/content/Context;", "digestHex", "", "bytes", "", "algo", "Fingerprints", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SigningFingerprints {
    public static final int $stable = 0;
    public static final SigningFingerprints INSTANCE = new SigningFingerprints();

    private SigningFingerprints() {
    }

    /* compiled from: SigningFingerprints.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/util/SigningFingerprints$Fingerprints;", "", "sha1", "", "sha256", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSha1", "()Ljava/lang/String;", "getSha256", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Fingerprints {
        public static final int $stable = 0;
        private final String sha1;
        private final String sha256;

        public static /* synthetic */ Fingerprints copy$default(Fingerprints fingerprints, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fingerprints.sha1;
            }
            if ((i & 2) != 0) {
                str2 = fingerprints.sha256;
            }
            return fingerprints.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSha1() {
            return this.sha1;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSha256() {
            return this.sha256;
        }

        public final Fingerprints copy(String sha1, String sha256) {
            return new Fingerprints(sha1, sha256);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fingerprints)) {
                return false;
            }
            Fingerprints fingerprints = (Fingerprints) other;
            return Intrinsics.areEqual(this.sha1, fingerprints.sha1) && Intrinsics.areEqual(this.sha256, fingerprints.sha256);
        }

        public int hashCode() {
            String str = this.sha1;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sha256;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Fingerprints(sha1=" + this.sha1 + ", sha256=" + this.sha256 + ")";
        }

        public Fingerprints(String str, String str2) {
            this.sha1 = str;
            this.sha256 = str2;
        }

        public final String getSha1() {
            return this.sha1;
        }

        public final String getSha256() {
            return this.sha256;
        }
    }

    public final Fingerprints currentApp(Context context) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo;
        if (signingInfo == null) {
            return new Fingerprints(null, null);
        }
        Signature[] apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
        Intrinsics.checkNotNull(apkContentsSigners);
        Signature signature = (Signature) ArraysKt.firstOrNull(apkContentsSigners);
        byte[] byteArray = signature != null ? signature.toByteArray() : null;
        if (byteArray == null) {
            return new Fingerprints(null, null);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SigningFingerprints signingFingerprints = this;
            Certificate generateCertificate = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(byteArray));
            Intrinsics.checkNotNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            m7905constructorimpl = Result.m7905constructorimpl((X509Certificate) generateCertificate);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        X509Certificate x509Certificate = (X509Certificate) m7905constructorimpl;
        if (x509Certificate == null) {
            return new Fingerprints(null, null);
        }
        byte[] encoded = x509Certificate.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
        String digestHex = digestHex(encoded, "SHA-1");
        byte[] encoded2 = x509Certificate.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded2, "getEncoded(...)");
        return new Fingerprints(digestHex, digestHex(encoded2, "SHA-256"));
    }

    private final String digestHex(byte[] bytes, String algo) {
        Object m7905constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            SigningFingerprints signingFingerprints = this;
            byte[] digest = MessageDigest.getInstance(algo).digest(bytes);
            Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
            m7905constructorimpl = Result.m7905constructorimpl(ArraysKt.joinToString$default(digest, (CharSequence) ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.example.rungps.util.SigningFingerprints$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence digestHex$lambda$2$lambda$1;
                    digestHex$lambda$2$lambda$1 = SigningFingerprints.digestHex$lambda$2$lambda$1(((Byte) obj).byteValue());
                    return digestHex$lambda$2$lambda$1;
                }
            }, 30, (Object) null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        return (String) m7905constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence digestHex$lambda$2$lambda$1(byte b) {
        String format = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
