package com.example.rungps.analytics;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.ExercisePr;
import com.example.rungps.data.GymSetEntity;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: ProgressiveOverload.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/analytics/ProgressiveOverload;", "", "<init>", "()V", "hint", "Lcom/example/rungps/analytics/ProgressiveOverload$Hint;", "pr", "Lcom/example/rungps/data/ExercisePr;", "lastBest", "Lcom/example/rungps/data/GymSetEntity;", TextFieldImplKt.PlaceholderId, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressiveOverload {
    public static final int $stable = 0;
    public static final ProgressiveOverload INSTANCE = new ProgressiveOverload();

    private ProgressiveOverload() {
    }

    /* compiled from: ProgressiveOverload.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/analytics/ProgressiveOverload$Hint;", "", "headline", "", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHeadline", "()Ljava/lang/String;", "getDetail", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Hint {
        public static final int $stable = 0;
        private final String detail;
        private final String headline;

        public static /* synthetic */ Hint copy$default(Hint hint, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hint.headline;
            }
            if ((i & 2) != 0) {
                str2 = hint.detail;
            }
            return hint.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        public final Hint copy(String headline, String detail) {
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new Hint(headline, detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hint)) {
                return false;
            }
            Hint hint = (Hint) other;
            return Intrinsics.areEqual(this.headline, hint.headline) && Intrinsics.areEqual(this.detail, hint.detail);
        }

        public int hashCode() {
            return (this.headline.hashCode() * 31) + this.detail.hashCode();
        }

        public String toString() {
            return "Hint(headline=" + this.headline + ", detail=" + this.detail + ")";
        }

        public Hint(String headline, String detail) {
            Intrinsics.checkNotNullParameter(headline, "headline");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.headline = headline;
            this.detail = detail;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getDetail() {
            return this.detail;
        }
    }

    public final Hint hint(ExercisePr pr, GymSetEntity lastBest) {
        Integer reps;
        String str;
        if (pr == null) {
            return null;
        }
        int intValue = ((lastBest == null || (reps = lastBest.getReps()) == null) && (reps = pr.getReps()) == null) ? 0 : reps.intValue();
        double weightKg = lastBest != null ? lastBest.getWeightKg() : pr.getWeightKg();
        if (intValue >= 10) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(weightKg + 2.5d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            str = "Try " + format + " kg (+2.5 kg)";
        } else if (6 <= intValue && intValue < 10) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(weightKg)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            str = "Try " + format2 + " kg × " + (intValue + 1) + " (+1 rep)";
        } else if (1 <= intValue && intValue < 6) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String format3 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(weightKg)}, 1));
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            str = "Build reps: " + format3 + " kg × 6";
        } else {
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            String format4 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(weightKg)}, 1));
            Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
            str = "Target " + format4 + " kg × 6–10";
        }
        StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Double valueOf = Double.valueOf(pr.getWeightKg());
        Integer reps2 = pr.getReps();
        String format5 = String.format(locale, "Best %.1f kg × %d · e1RM %.1f", Arrays.copyOf(new Object[]{valueOf, Integer.valueOf(reps2 != null ? reps2.intValue() : 1), Double.valueOf(pr.getE1rm())}, 3));
        Intrinsics.checkNotNullExpressionValue(format5, "format(...)");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (lastBest != null && lastBest.getReps() != null) {
            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
            String format6 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(lastBest.getWeightKg())}, 1));
            Intrinsics.checkNotNullExpressionValue(format6, "format(...)");
            sb.append(" · Last: " + format6 + " kg × " + lastBest.getReps());
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return new Hint(format5, sb2);
    }
}
