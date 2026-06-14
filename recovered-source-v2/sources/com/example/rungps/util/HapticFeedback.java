package com.example.rungps.util;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import androidx.compose.material3.MenuKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HapticFeedback.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/util/HapticFeedback;", "", "<init>", "()V", "pulse", "", "context", "Landroid/content/Context;", "pattern", "Lcom/example/rungps/util/HapticFeedback$Pattern;", "Pattern", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HapticFeedback {
    public static final int $stable = 0;
    public static final HapticFeedback INSTANCE = new HapticFeedback();

    /* compiled from: HapticFeedback.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pattern.values().length];
            try {
                iArr[Pattern.Nfc.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pattern.Pr.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pattern.RestDone.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Pattern.Undo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Pattern.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HapticFeedback.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/example/rungps/util/HapticFeedback$Pattern;", "", "<init>", "(Ljava/lang/String;I)V", "Nfc", "Pr", "RestDone", "Undo", "Error", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pattern {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Pattern[] $VALUES;
        public static final Pattern Nfc = new Pattern("Nfc", 0);
        public static final Pattern Pr = new Pattern("Pr", 1);
        public static final Pattern RestDone = new Pattern("RestDone", 2);
        public static final Pattern Undo = new Pattern("Undo", 3);
        public static final Pattern Error = new Pattern("Error", 4);

        private static final /* synthetic */ Pattern[] $values() {
            return new Pattern[]{Nfc, Pr, RestDone, Undo, Error};
        }

        public static EnumEntries<Pattern> getEntries() {
            return $ENTRIES;
        }

        static {
            Pattern[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Pattern(String str, int i) {
        }

        public static Pattern valueOf(String str) {
            return (Pattern) Enum.valueOf(Pattern.class, str);
        }

        public static Pattern[] values() {
            return (Pattern[]) $VALUES.clone();
        }
    }

    private HapticFeedback() {
    }

    public final void pulse(Context context, Pattern pattern) {
        Vibrator vibrator;
        VibrationEffect createOneShot;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        if (Build.VERSION.SDK_INT >= 31) {
            VibratorManager vibratorManager = (VibratorManager) context.getSystemService(VibratorManager.class);
            if (vibratorManager == null) {
                return;
            } else {
                vibrator = vibratorManager.getDefaultVibrator();
            }
        } else {
            vibrator = (Vibrator) context.getSystemService(Vibrator.class);
            if (vibrator == null) {
                return;
            }
        }
        Intrinsics.checkNotNull(vibrator);
        int i = WhenMappings.$EnumSwitchMapping$0[pattern.ordinal()];
        if (i == 1) {
            createOneShot = VibrationEffect.createOneShot(35L, -1);
        } else if (i == 2) {
            createOneShot = VibrationEffect.createWaveform(new long[]{0, 60, 40, 100}, new int[]{0, 180, 0, 255}, -1);
        } else if (i == 3) {
            createOneShot = VibrationEffect.createWaveform(new long[]{0, 50, 30, 80}, new int[]{0, 200, 0, 220}, -1);
        } else if (i == 4) {
            createOneShot = VibrationEffect.createOneShot(25L, MenuKt.InTransitionDuration);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            createOneShot = VibrationEffect.createWaveform(new long[]{0, 80, 50, 80}, new int[]{0, 255, 0, 255}, -1);
        }
        vibrator.vibrate(createOneShot);
    }
}
