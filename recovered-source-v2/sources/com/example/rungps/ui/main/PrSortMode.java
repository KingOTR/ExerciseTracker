package com.example.rungps.ui.main;

import androidx.health.connect.client.records.CervicalMucusRecord;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GymProgressTabBody.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0082\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/ui/main/PrSortMode;", "", "id", "", "shortLabel", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getShortLabel", "ALPHA", "MOST_RECENT", "HEAVIEST", "LIGHTEST", "MOST_REPS", "LEAST_REPS", "OLDEST", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PrSortMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PrSortMode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String id;
    private final String shortLabel;
    public static final PrSortMode ALPHA = new PrSortMode("ALPHA", 0, "alpha", "A→Z");
    public static final PrSortMode MOST_RECENT = new PrSortMode("MOST_RECENT", 1, "recent", "Most recent");
    public static final PrSortMode HEAVIEST = new PrSortMode("HEAVIEST", 2, CervicalMucusRecord.Sensation.HEAVY, "Heaviest");
    public static final PrSortMode LIGHTEST = new PrSortMode("LIGHTEST", 3, CervicalMucusRecord.Sensation.LIGHT, "Lightest");
    public static final PrSortMode MOST_REPS = new PrSortMode("MOST_REPS", 4, "most_reps", "Most reps");
    public static final PrSortMode LEAST_REPS = new PrSortMode("LEAST_REPS", 5, "least_reps", "Least reps");
    public static final PrSortMode OLDEST = new PrSortMode("OLDEST", 6, "oldest", "Oldest");

    private static final /* synthetic */ PrSortMode[] $values() {
        return new PrSortMode[]{ALPHA, MOST_RECENT, HEAVIEST, LIGHTEST, MOST_REPS, LEAST_REPS, OLDEST};
    }

    public static EnumEntries<PrSortMode> getEntries() {
        return $ENTRIES;
    }

    private PrSortMode(String str, int i, String str2, String str3) {
        this.id = str2;
        this.shortLabel = str3;
    }

    public final String getId() {
        return this.id;
    }

    public final String getShortLabel() {
        return this.shortLabel;
    }

    static {
        PrSortMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: GymProgressTabBody.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/example/rungps/ui/main/PrSortMode$Companion;", "", "<init>", "()V", "byId", "Lcom/example/rungps/ui/main/PrSortMode;", "id", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PrSortMode byId(String id) {
            Object obj;
            Intrinsics.checkNotNullParameter(id, "id");
            Iterator<E> it = PrSortMode.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((PrSortMode) obj).getId(), id)) {
                    break;
                }
            }
            PrSortMode prSortMode = (PrSortMode) obj;
            return prSortMode == null ? PrSortMode.HEAVIEST : prSortMode;
        }
    }

    public static PrSortMode valueOf(String str) {
        return (PrSortMode) Enum.valueOf(PrSortMode.class, str);
    }

    public static PrSortMode[] values() {
        return (PrSortMode[]) $VALUES.clone();
    }
}
