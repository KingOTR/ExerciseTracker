package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzcy {
    private zzcy() {
        throw null;
    }

    public /* synthetic */ zzcy(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        return Integer.parseInt(StringsKt.substringBefore$default(StringsKt.replace$default("18.5.1", ".", "", false, 4, (Object) null), "-", (String) null, 2, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(String.valueOf(StringsKt.substringAfter("18.5.1", "-", "")));
    }
}
