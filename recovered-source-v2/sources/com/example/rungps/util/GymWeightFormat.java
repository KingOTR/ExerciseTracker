package com.example.rungps.util;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: GymWeightFormat.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rJ\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/util/GymWeightFormat;", "", "<init>", "()V", "sanitizeInput", "", "raw", "parse", "", "(Ljava/lang/String;)Ljava/lang/Double;", "formatDisplay", "w", "showZero", "", "format", "fieldValue", "storedKg", "draft", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymWeightFormat {
    public static final int $stable = 0;
    public static final GymWeightFormat INSTANCE = new GymWeightFormat();

    private GymWeightFormat() {
    }

    public final String sanitizeInput(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        String replace$default = StringsKt.replace$default(raw, AbstractJsonLexerKt.COMMA, '.', false, 4, (Object) null);
        StringBuilder sb = new StringBuilder();
        int length = replace$default.length();
        for (int i = 0; i < length; i++) {
            char charAt = replace$default.charAt(i);
            if (Character.isDigit(charAt) || charAt == '.') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        String str = sb2;
        if (str.length() == 0) {
            return "";
        }
        List split$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        if (split$default.size() == 1) {
            return StringsKt.take((String) split$default.get(0), 4);
        }
        return StringsKt.take((String) split$default.get(0), 4) + "." + StringsKt.take((String) split$default.get(1), 2);
    }

    public final Double parse(String raw) {
        Double doubleOrNull;
        Intrinsics.checkNotNullParameter(raw, "raw");
        String sanitizeInput = sanitizeInput(raw);
        if (sanitizeInput.length() == 0 || Intrinsics.areEqual(sanitizeInput, ".") || (doubleOrNull = StringsKt.toDoubleOrNull(sanitizeInput)) == null) {
            return null;
        }
        double doubleValue = doubleOrNull.doubleValue();
        if (0.0d > doubleValue || doubleValue > 9999.99d) {
            return null;
        }
        return doubleOrNull;
    }

    public static /* synthetic */ String formatDisplay$default(GymWeightFormat gymWeightFormat, double d, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return gymWeightFormat.formatDisplay(d, z);
    }

    public final String formatDisplay(double w, boolean showZero) {
        if (w <= 0.0d) {
            return showZero ? "0" : "";
        }
        int roundToInt = MathKt.roundToInt(w * 100.0d);
        int i = roundToInt / 100;
        int i2 = roundToInt % 100;
        if (i2 == 0) {
            return String.valueOf(i);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d.%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return StringsKt.trimEnd(StringsKt.trimEnd(format, '0'), '.');
    }

    public static /* synthetic */ String format$default(GymWeightFormat gymWeightFormat, double d, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return gymWeightFormat.format(d, z);
    }

    public final String format(double w, boolean showZero) {
        return formatDisplay(w, showZero);
    }

    public final String fieldValue(double storedKg, String draft) {
        String obj = draft != null ? StringsKt.trim((CharSequence) draft).toString() : null;
        if (obj == null) {
            obj = "";
        }
        return obj.length() > 0 ? obj : formatDisplay$default(this, storedKg, false, 2, null);
    }
}
