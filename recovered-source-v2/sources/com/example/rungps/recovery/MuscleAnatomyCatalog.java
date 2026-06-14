package com.example.rungps.recovery;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: MuscleAnatomyCatalog.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/example/rungps/recovery/MuscleAnatomyCatalog;", "", "<init>", "()V", "catalog", "", "", "Lcom/example/rungps/recovery/MuscleAnatomyCatalog$RegionInfo;", "infoFor", "region", "scientificNamesLine", "RegionInfo", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MuscleAnatomyCatalog {
    public static final MuscleAnatomyCatalog INSTANCE = new MuscleAnatomyCatalog();
    private static final Map<String, RegionInfo> catalog = MapsKt.mapOf(TuplesKt.to(MuscleHeatmapRegions.QUADS, new RegionInfo(MuscleHeatmapRegions.QUADS, "Quadriceps", CollectionsKt.listOf((Object[]) new String[]{"Rectus femoris", "Vastus lateralis", "Vastus medialis", "Vastus intermedius"}))), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS, new RegionInfo(MuscleHeatmapRegions.HAMSTRINGS, "Hamstrings", CollectionsKt.listOf((Object[]) new String[]{"Biceps femoris", "Semitendinosus", "Semimembranosus"}))), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_MEDIAL, new RegionInfo(MuscleHeatmapRegions.HAMSTRINGS_MEDIAL, "Hamstrings (medial)", CollectionsKt.listOf((Object[]) new String[]{"Semitendinosus", "Semimembranosus"}))), TuplesKt.to(MuscleHeatmapRegions.HAMSTRINGS_LATERAL, new RegionInfo(MuscleHeatmapRegions.HAMSTRINGS_LATERAL, "Hamstrings (lateral)", CollectionsKt.listOf("Biceps femoris"))), TuplesKt.to(MuscleHeatmapRegions.GLUTES, new RegionInfo(MuscleHeatmapRegions.GLUTES, "Glutes", CollectionsKt.listOf((Object[]) new String[]{"Gluteus maximus", "Gluteus medius", "Gluteus minimus"}))), TuplesKt.to(MuscleHeatmapRegions.ABDUCTORS, new RegionInfo(MuscleHeatmapRegions.ABDUCTORS, "Hip abductors", CollectionsKt.listOf((Object[]) new String[]{"Gluteus medius", "Gluteus minimus", "Tensor fasciae latae"}))), TuplesKt.to(MuscleHeatmapRegions.ADDUCTORS, new RegionInfo(MuscleHeatmapRegions.ADDUCTORS, "Hip adductors", CollectionsKt.listOf((Object[]) new String[]{"Adductor longus", "Adductor brevis", "Adductor magnus", "Gracilis"}))), TuplesKt.to(MuscleHeatmapRegions.HIP_FLEXORS, new RegionInfo(MuscleHeatmapRegions.HIP_FLEXORS, "Hip flexors", CollectionsKt.listOf((Object[]) new String[]{"Iliopsoas", "Rectus femoris (hip flexion)", "Sartorius", "Tensor fasciae latae"}))), TuplesKt.to(MuscleHeatmapRegions.CALVES, new RegionInfo(MuscleHeatmapRegions.CALVES, "Calves", CollectionsKt.listOf((Object[]) new String[]{"Gastrocnemius (medial head)", "Gastrocnemius (lateral head)", "Soleus", "Tibialis anterior"}))), TuplesKt.to(MuscleHeatmapRegions.GASTROC, new RegionInfo(MuscleHeatmapRegions.GASTROC, "Gastrocnemius", CollectionsKt.listOf((Object[]) new String[]{"Gastrocnemius (medial head)", "Gastrocnemius (lateral head)"}))), TuplesKt.to(MuscleHeatmapRegions.SOLEUS, new RegionInfo(MuscleHeatmapRegions.SOLEUS, "Soleus", CollectionsKt.listOf("Soleus"))), TuplesKt.to(MuscleHeatmapRegions.TIBIALIS, new RegionInfo(MuscleHeatmapRegions.TIBIALIS, "Tibialis anterior", CollectionsKt.listOf("Tibialis anterior"))), TuplesKt.to(MuscleHeatmapRegions.CHEST, new RegionInfo(MuscleHeatmapRegions.CHEST, "Chest", CollectionsKt.listOf((Object[]) new String[]{"Pectoralis major", "Pectoralis minor", "Serratus anterior"}))), TuplesKt.to(MuscleHeatmapRegions.SHOULDERS, new RegionInfo(MuscleHeatmapRegions.SHOULDERS, "Shoulders", CollectionsKt.listOf((Object[]) new String[]{"Anterior deltoid", "Lateral deltoid", "Posterior deltoid", "Supraspinatus"}))), TuplesKt.to(MuscleHeatmapRegions.BICEPS, new RegionInfo(MuscleHeatmapRegions.BICEPS, "Biceps", CollectionsKt.listOf((Object[]) new String[]{"Biceps brachii (long head)", "Biceps brachii (short head)", "Brachialis"}))), TuplesKt.to(MuscleHeatmapRegions.TRICEPS, new RegionInfo(MuscleHeatmapRegions.TRICEPS, "Triceps", CollectionsKt.listOf((Object[]) new String[]{"Triceps brachii (long head)", "Triceps brachii (lateral head)", "Triceps brachii (medial head)"}))), TuplesKt.to(MuscleHeatmapRegions.FOREARMS, new RegionInfo(MuscleHeatmapRegions.FOREARMS, "Forearms", CollectionsKt.listOf((Object[]) new String[]{"Flexor carpi radialis", "Extensor digitorum", "Brachioradialis", "Flexor digitorum superficialis"}))), TuplesKt.to(MuscleHeatmapRegions.FOREARM_FLEXORS, new RegionInfo(MuscleHeatmapRegions.FOREARM_FLEXORS, "Forearm flexors", CollectionsKt.listOf((Object[]) new String[]{"Flexor carpi radialis", "Flexor digitorum superficialis", "Flexor digitorum profundus"}))), TuplesKt.to(MuscleHeatmapRegions.FOREARM_EXTENSORS, new RegionInfo(MuscleHeatmapRegions.FOREARM_EXTENSORS, "Forearm extensors", CollectionsKt.listOf((Object[]) new String[]{"Extensor digitorum", "Extensor carpi radialis", "Extensor carpi ulnaris"}))), TuplesKt.to(MuscleHeatmapRegions.LATS, new RegionInfo(MuscleHeatmapRegions.LATS, "Lats", CollectionsKt.listOf((Object[]) new String[]{"Latissimus dorsi", "Teres major"}))), TuplesKt.to(MuscleHeatmapRegions.LOWER_BACK, new RegionInfo(MuscleHeatmapRegions.LOWER_BACK, "Lower back", CollectionsKt.listOf((Object[]) new String[]{"Erector spinae", "Quadratus lumborum", "Multifidus"}))), TuplesKt.to(MuscleHeatmapRegions.TRAPS, new RegionInfo(MuscleHeatmapRegions.TRAPS, "Traps", CollectionsKt.listOf((Object[]) new String[]{"Trapezius (upper fibers)", "Trapezius (middle fibers)", "Trapezius (lower fibers)", "Levator scapulae"}))), TuplesKt.to(MuscleHeatmapRegions.TRAPS_UPPER, new RegionInfo(MuscleHeatmapRegions.TRAPS_UPPER, "Traps (upper)", CollectionsKt.listOf((Object[]) new String[]{"Trapezius (upper fibers)", "Levator scapulae"}))), TuplesKt.to(MuscleHeatmapRegions.TRAPS_MID, new RegionInfo(MuscleHeatmapRegions.TRAPS_MID, "Traps (mid)", CollectionsKt.listOf((Object[]) new String[]{"Trapezius (middle fibers)", "Rhomboids"}))), TuplesKt.to(MuscleHeatmapRegions.TRAPS_LOWER, new RegionInfo(MuscleHeatmapRegions.TRAPS_LOWER, "Traps (lower)", CollectionsKt.listOf("Trapezius (lower fibers)"))), TuplesKt.to(MuscleHeatmapRegions.CORE, new RegionInfo(MuscleHeatmapRegions.CORE, "Core", CollectionsKt.listOf((Object[]) new String[]{"Rectus abdominis", "External oblique", "Internal oblique", "Transversus abdominis"}))), TuplesKt.to(MuscleHeatmapRegions.BACK, new RegionInfo(MuscleHeatmapRegions.BACK, "Back", CollectionsKt.listOf((Object[]) new String[]{"Rhomboid major", "Rhomboid minor", "Infraspinatus", "Teres minor", "Middle trapezius"}))), TuplesKt.to(MuscleHeatmapRegions.ARMS, new RegionInfo(MuscleHeatmapRegions.ARMS, "Arms", CollectionsKt.listOf((Object[]) new String[]{"Biceps brachii", "Triceps brachii", "Brachialis", "Brachioradialis"}))), TuplesKt.to(MuscleHeatmapRegions.LEGS, new RegionInfo(MuscleHeatmapRegions.LEGS, "Legs", CollectionsKt.listOf((Object[]) new String[]{"Rectus femoris", "Vastus lateralis", "Biceps femoris", "Gluteus maximus", "Gastrocnemius"}))));
    public static final int $stable = 8;

    private MuscleAnatomyCatalog() {
    }

    /* compiled from: MuscleAnatomyCatalog.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/recovery/MuscleAnatomyCatalog$RegionInfo;", "", "regionKey", "", "displayName", "scientificNames", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getRegionKey", "()Ljava/lang/String;", "getDisplayName", "getScientificNames", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegionInfo {
        public static final int $stable = 8;
        private final String displayName;
        private final String regionKey;
        private final List<String> scientificNames;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RegionInfo copy$default(RegionInfo regionInfo, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = regionInfo.regionKey;
            }
            if ((i & 2) != 0) {
                str2 = regionInfo.displayName;
            }
            if ((i & 4) != 0) {
                list = regionInfo.scientificNames;
            }
            return regionInfo.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRegionKey() {
            return this.regionKey;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        public final List<String> component3() {
            return this.scientificNames;
        }

        public final RegionInfo copy(String regionKey, String displayName, List<String> scientificNames) {
            Intrinsics.checkNotNullParameter(regionKey, "regionKey");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(scientificNames, "scientificNames");
            return new RegionInfo(regionKey, displayName, scientificNames);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RegionInfo)) {
                return false;
            }
            RegionInfo regionInfo = (RegionInfo) other;
            return Intrinsics.areEqual(this.regionKey, regionInfo.regionKey) && Intrinsics.areEqual(this.displayName, regionInfo.displayName) && Intrinsics.areEqual(this.scientificNames, regionInfo.scientificNames);
        }

        public int hashCode() {
            return (((this.regionKey.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.scientificNames.hashCode();
        }

        public String toString() {
            return "RegionInfo(regionKey=" + this.regionKey + ", displayName=" + this.displayName + ", scientificNames=" + this.scientificNames + ")";
        }

        public RegionInfo(String regionKey, String displayName, List<String> scientificNames) {
            Intrinsics.checkNotNullParameter(regionKey, "regionKey");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(scientificNames, "scientificNames");
            this.regionKey = regionKey;
            this.displayName = displayName;
            this.scientificNames = scientificNames;
        }

        public final String getRegionKey() {
            return this.regionKey;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final List<String> getScientificNames() {
            return this.scientificNames;
        }
    }

    public final RegionInfo infoFor(String region) {
        Object obj;
        String valueOf;
        RegionInfo regionInfo;
        Intrinsics.checkNotNullParameter(region, "region");
        String str = region;
        String obj2 = StringsKt.trim((CharSequence) str).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj2.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Map<String, RegionInfo> map = catalog;
        RegionInfo regionInfo2 = map.get(lowerCase);
        if (regionInfo2 != null) {
            return regionInfo2;
        }
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.equals((String) ((Map.Entry) obj).getKey(), region, true)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && (regionInfo = (RegionInfo) entry.getValue()) != null) {
            return regionInfo;
        }
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = region.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                valueOf = CharsKt.titlecase(charAt, locale);
            } else {
                valueOf = String.valueOf(charAt);
            }
            StringBuilder append = sb.append((Object) valueOf);
            String substring = region.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            region = append.append(substring).toString();
        }
        return new RegionInfo(lowerCase, region, CollectionsKt.emptyList());
    }

    public final String scientificNamesLine(String region) {
        Intrinsics.checkNotNullParameter(region, "region");
        return CollectionsKt.joinToString$default(infoFor(region).getScientificNames(), " · ", null, null, 0, null, null, 62, null);
    }
}
