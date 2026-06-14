package com.samsung.android.sdk.health.data;

import android.content.pm.Signature;
import android.util.Log;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public abstract class g0 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(Signature signature) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
            try {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(byteArrayInputStream)).getEncoded());
                StringBuffer stringBuffer = new StringBuffer();
                int length = digest.length;
                for (int i = 0; i < length; i++) {
                    byte b = digest[i];
                    int i2 = (b & 240) >> 4;
                    int i3 = b & Ascii.SI;
                    char[] cArr = a;
                    stringBuffer.append(cArr[i2]);
                    stringBuffer.append(cArr[i3]);
                    if (i < length - 1) {
                        stringBuffer.append(AbstractJsonLexerKt.COLON);
                    }
                }
                String stringBuffer2 = stringBuffer.toString();
                byteArrayInputStream.close();
                return stringBuffer2;
            } finally {
            }
        } catch (IOException e) {
            Log.e("[SHD]FingerPrintUtil", "getFingerPrint exception ", e);
            return null;
        }
    }
}
