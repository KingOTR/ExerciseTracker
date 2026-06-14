package com.google.android.recaptcha.internal;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import kotlin.io.FilesKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzbx {
    public static final byte[] zza(File file) throws IOException, GeneralSecurityException {
        return FilesKt.readBytes(file);
    }

    public static final void zzb(File file, byte[] bArr) throws IOException, GeneralSecurityException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        FilesKt.writeBytes(file, bArr);
    }
}
