package com.example.rungps.intervals;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkoutPlan.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/intervals/Cue;", "", "Speak", "Beep", "Pattern", "Lcom/example/rungps/intervals/Cue$Beep;", "Lcom/example/rungps/intervals/Cue$Speak;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Cue {

    /* compiled from: WorkoutPlan.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/intervals/Cue$Speak;", "Lcom/example/rungps/intervals/Cue;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Speak implements Cue {
        public static final int $stable = 0;
        private final String text;

        public static /* synthetic */ Speak copy$default(Speak speak, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = speak.text;
            }
            return speak.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Speak copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Speak(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Speak) && Intrinsics.areEqual(this.text, ((Speak) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Speak(text=" + this.text + ")";
        }

        public Speak(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: WorkoutPlan.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/intervals/Cue$Beep;", "Lcom/example/rungps/intervals/Cue;", "pattern", "Lcom/example/rungps/intervals/Cue$Pattern;", "<init>", "(Lcom/example/rungps/intervals/Cue$Pattern;)V", "getPattern", "()Lcom/example/rungps/intervals/Cue$Pattern;", "component1", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Beep implements Cue {
        public static final int $stable = 0;
        private final Pattern pattern;

        /* JADX WARN: Multi-variable type inference failed */
        public Beep() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Beep copy$default(Beep beep, Pattern pattern, int i, Object obj) {
            if ((i & 1) != 0) {
                pattern = beep.pattern;
            }
            return beep.copy(pattern);
        }

        /* renamed from: component1, reason: from getter */
        public final Pattern getPattern() {
            return this.pattern;
        }

        public final Beep copy(Pattern pattern) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            return new Beep(pattern);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Beep) && this.pattern == ((Beep) other).pattern;
        }

        public int hashCode() {
            return this.pattern.hashCode();
        }

        public String toString() {
            return "Beep(pattern=" + this.pattern + ")";
        }

        public Beep(Pattern pattern) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.pattern = pattern;
        }

        public /* synthetic */ Beep(Pattern pattern, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Pattern.Short : pattern);
        }

        public final Pattern getPattern() {
            return this.pattern;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WorkoutPlan.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/example/rungps/intervals/Cue$Pattern;", "", "<init>", "(Ljava/lang/String;I)V", "Short", "Long", "IntervalEndOne", "IntervalEndTwo", "IntervalEndThree", "IntervalStartThree", "IntervalStartTwo", "IntervalStartOne", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pattern {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Pattern[] $VALUES;
        public static final Pattern Short = new Pattern("Short", 0);
        public static final Pattern Long = new Pattern("Long", 1);
        public static final Pattern IntervalEndOne = new Pattern("IntervalEndOne", 2);
        public static final Pattern IntervalEndTwo = new Pattern("IntervalEndTwo", 3);
        public static final Pattern IntervalEndThree = new Pattern("IntervalEndThree", 4);
        public static final Pattern IntervalStartThree = new Pattern("IntervalStartThree", 5);
        public static final Pattern IntervalStartTwo = new Pattern("IntervalStartTwo", 6);
        public static final Pattern IntervalStartOne = new Pattern("IntervalStartOne", 7);

        private static final /* synthetic */ Pattern[] $values() {
            return new Pattern[]{Short, Long, IntervalEndOne, IntervalEndTwo, IntervalEndThree, IntervalStartThree, IntervalStartTwo, IntervalStartOne};
        }

        public static EnumEntries<Pattern> getEntries() {
            return $ENTRIES;
        }

        private Pattern(String str, int i) {
        }

        static {
            Pattern[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Pattern valueOf(String str) {
            return (Pattern) Enum.valueOf(Pattern.class, str);
        }

        public static Pattern[] values() {
            return (Pattern[]) $VALUES.clone();
        }
    }
}
