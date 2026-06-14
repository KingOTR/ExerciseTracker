package com.example.rungps.ui.main;

import com.caverock.androidsvg.SVGParser;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GymProgressTabBody.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/ui/main/PrRegionFilter;", "", "id", "", "label", "regex", "Lkotlin/text/Regex;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/text/Regex;)V", "getId", "()Ljava/lang/String;", "getLabel", "getRegex", "()Lkotlin/text/Regex;", "ALL", "UPPER", "LOWER", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PrRegionFilter {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PrRegionFilter[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String id;
    private final String label;
    private final Regex regex;
    public static final PrRegionFilter ALL = new PrRegionFilter("ALL", 0, SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "All", new Regex(".*"));
    public static final PrRegionFilter UPPER = new PrRegionFilter("UPPER", 1, "upper", "Upper", new Regex("(?i).*(bench|press|row|pull|lat|curl|tricep|shoulder|fly|delt).*"));
    public static final PrRegionFilter LOWER = new PrRegionFilter("LOWER", 2, "lower", "Lower", new Regex("(?i).*(squat|deadlift|leg|ham|string|calf|glute|hip|lunge).*"));

    private static final /* synthetic */ PrRegionFilter[] $values() {
        return new PrRegionFilter[]{ALL, UPPER, LOWER};
    }

    public static EnumEntries<PrRegionFilter> getEntries() {
        return $ENTRIES;
    }

    private PrRegionFilter(String str, int i, String str2, String str3, Regex regex) {
        this.id = str2;
        this.label = str3;
        this.regex = regex;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Regex getRegex() {
        return this.regex;
    }

    static {
        PrRegionFilter[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: GymProgressTabBody.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/example/rungps/ui/main/PrRegionFilter$Companion;", "", "<init>", "()V", "byId", "Lcom/example/rungps/ui/main/PrRegionFilter;", "id", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PrRegionFilter byId(String id) {
            Object obj;
            Intrinsics.checkNotNullParameter(id, "id");
            Iterator<E> it = PrRegionFilter.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((PrRegionFilter) obj).getId(), id)) {
                    break;
                }
            }
            PrRegionFilter prRegionFilter = (PrRegionFilter) obj;
            return prRegionFilter == null ? PrRegionFilter.ALL : prRegionFilter;
        }
    }

    public static PrRegionFilter valueOf(String str) {
        return (PrRegionFilter) Enum.valueOf(PrRegionFilter.class, str);
    }

    public static PrRegionFilter[] values() {
        return (PrRegionFilter[]) $VALUES.clone();
    }
}
