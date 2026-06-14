package com.example.rungps.sleep;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SleepStageLabel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/example/rungps/sleep/SleepStageLabel;", "", "<init>", "(Ljava/lang/String;I)V", "AWAKE", "LIGHT", "DEEP", "REM", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepStageLabel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SleepStageLabel[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SleepStageLabel AWAKE = new SleepStageLabel("AWAKE", 0);
    public static final SleepStageLabel LIGHT = new SleepStageLabel("LIGHT", 1);
    public static final SleepStageLabel DEEP = new SleepStageLabel("DEEP", 2);
    public static final SleepStageLabel REM = new SleepStageLabel("REM", 3);

    private static final /* synthetic */ SleepStageLabel[] $values() {
        return new SleepStageLabel[]{AWAKE, LIGHT, DEEP, REM};
    }

    public static EnumEntries<SleepStageLabel> getEntries() {
        return $ENTRIES;
    }

    private SleepStageLabel(String str, int i) {
    }

    static {
        SleepStageLabel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: SleepStageLabel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/example/rungps/sleep/SleepStageLabel$Companion;", "", "<init>", "()V", "fromIndex", "Lcom/example/rungps/sleep/SleepStageLabel;", "i", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SleepStageLabel fromIndex(int i) {
            EnumEntries<SleepStageLabel> entries = SleepStageLabel.getEntries();
            return (SleepStageLabel) ((i < 0 || i >= entries.size()) ? SleepStageLabel.LIGHT : entries.get(i));
        }
    }

    public static SleepStageLabel valueOf(String str) {
        return (SleepStageLabel) Enum.valueOf(SleepStageLabel.class, str);
    }

    public static SleepStageLabel[] values() {
        return (SleepStageLabel[]) $VALUES.clone();
    }
}
