package com.example.rungps.data;

import androidx.autofill.HintConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ExerciseNameNormalizer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/example/rungps/data/ExerciseNameNormalizer;", "", "<init>", "()V", "canonicalKey", "", HintConstants.AUTOFILL_HINT_NAME, "matches", "", "a", "b", "pickDisplayName", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseNameNormalizer {
    public static final int $stable = 0;
    public static final ExerciseNameNormalizer INSTANCE = new ExerciseNameNormalizer();

    private ExerciseNameNormalizer() {
    }

    public final String canonicalKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String obj = StringsKt.trim((CharSequence) name).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() == 0) {
            return lowerCase;
        }
        if (StringsKt.endsWith$default(lowerCase, "ies", false, 2, (Object) null) && lowerCase.length() > 4) {
            lowerCase = StringsKt.dropLast(lowerCase, 3) + "y";
        } else if (!StringsKt.endsWith$default(lowerCase, "ches", false, 2, (Object) null) && !StringsKt.endsWith$default(lowerCase, "shes", false, 2, (Object) null) && !StringsKt.endsWith$default(lowerCase, "sses", false, 2, (Object) null)) {
            if (StringsKt.endsWith$default(lowerCase, "es", false, 2, (Object) null) && lowerCase.length() > 3) {
                lowerCase = StringsKt.dropLast(lowerCase, 2);
            } else if (StringsKt.endsWith$default(lowerCase, "s", false, 2, (Object) null) && !StringsKt.endsWith$default(lowerCase, "ss", false, 2, (Object) null) && lowerCase.length() > 2) {
                lowerCase = StringsKt.dropLast(lowerCase, 1);
            }
        }
        return new Regex("\\s+").replace(lowerCase, " ");
    }

    public final boolean matches(String a, String b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return Intrinsics.areEqual(canonicalKey(a), canonicalKey(b));
    }

    public final String pickDisplayName(String a, String b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        String str = b;
        String str2 = a;
        return (StringsKt.trim((CharSequence) str).toString().length() > StringsKt.trim((CharSequence) str2).toString().length() ? StringsKt.trim((CharSequence) str) : StringsKt.trim((CharSequence) str2)).toString();
    }
}
