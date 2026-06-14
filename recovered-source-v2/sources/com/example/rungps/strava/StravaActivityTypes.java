package com.example.rungps.strava;

import com.caverock.androidsvg.SVGParser;
import com.example.rungps.data.UserProfileStore;
import com.example.rungps.tracking.ActivityTypes;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: StravaActivityTypes.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/strava/StravaActivityTypes;", "", "<init>", "()V", "runTypes", "", "", "bikeTypes", "isRunType", "", SVGParser.XML_STYLESHEET_ATTR_TYPE, "isBikeType", "isTrainingType", "isStravaRun", "sportType", "isStravaBike", "classify", "Lcom/example/rungps/strava/StravaActivityTypes$Kind;", "gpxUploadActivityType", "isBike", "createActivitySportType", "Kind", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaActivityTypes {
    public static final StravaActivityTypes INSTANCE = new StravaActivityTypes();
    private static final Set<String> runTypes = SetsKt.setOf((Object[]) new String[]{"run", "running", "trailrun", "trail_run", "trailrunning", "virtualrun", "virtual_run", "indoorrun", "indoor_run", "treadmill", "track", "jog", "roadrun", "road_run", "parkrun", "park_run"});
    private static final Set<String> bikeTypes = SetsKt.setOf((Object[]) new String[]{"ride", "virtualride", "ebikeride", "mountainbikeride", "gravelride", "emountainbikeride", "handcycle"});
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StravaActivityTypes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/strava/StravaActivityTypes$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "RUN", ActivityTypes.BIKE, UserProfileStore.SEX_OTHER, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Kind {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind RUN = new Kind("RUN", 0);
        public static final Kind BIKE = new Kind(ActivityTypes.BIKE, 1);
        public static final Kind OTHER = new Kind(UserProfileStore.SEX_OTHER, 2);

        private static final /* synthetic */ Kind[] $values() {
            return new Kind[]{RUN, BIKE, OTHER};
        }

        public static EnumEntries<Kind> getEntries() {
            return $ENTRIES;
        }

        static {
            Kind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Kind(String str, int i) {
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    private StravaActivityTypes() {
    }

    public final boolean isRunType(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Set<String> set = runTypes;
        String lowerCase = StringsKt.trim((CharSequence) type).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return set.contains(lowerCase);
    }

    public final boolean isBikeType(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Set<String> set = bikeTypes;
        String lowerCase = StringsKt.trim((CharSequence) type).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return set.contains(lowerCase);
    }

    public final boolean isTrainingType(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return isRunType(type) || isBikeType(type);
    }

    public static /* synthetic */ boolean isStravaRun$default(StravaActivityTypes stravaActivityTypes, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return stravaActivityTypes.isStravaRun(str, str2);
    }

    public final boolean isStravaRun(String type, String sportType) {
        Intrinsics.checkNotNullParameter(type, "type");
        return classify(type, sportType) == Kind.RUN;
    }

    public static /* synthetic */ boolean isStravaBike$default(StravaActivityTypes stravaActivityTypes, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return stravaActivityTypes.isStravaBike(str, str2);
    }

    public final boolean isStravaBike(String type, String sportType) {
        Intrinsics.checkNotNullParameter(type, "type");
        return classify(type, sportType) == Kind.BIKE;
    }

    public static /* synthetic */ Kind classify$default(StravaActivityTypes stravaActivityTypes, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return stravaActivityTypes.classify(str, str2);
    }

    public final Kind classify(String type, String sportType) {
        Intrinsics.checkNotNullParameter(type, "type");
        String obj = sportType != null ? StringsKt.trim((CharSequence) sportType).toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (obj.length() > 0) {
            if (isBikeType(obj)) {
                return Kind.BIKE;
            }
            if (isRunType(obj)) {
                return Kind.RUN;
            }
        }
        return isBikeType(type) ? Kind.BIKE : isRunType(type) ? Kind.RUN : Kind.OTHER;
    }

    public final String gpxUploadActivityType(boolean isBike) {
        return isBike ? "ride" : "run";
    }

    public final String createActivitySportType(boolean isBike) {
        return isBike ? "Ride" : "Run";
    }
}
