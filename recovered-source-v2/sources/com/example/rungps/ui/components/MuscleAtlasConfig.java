package com.example.rungps.ui.components;

import android.content.Context;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.caverock.androidsvg.SVGParser;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MuscleAtlasConfig.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017*\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010*\u00020\u0018H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/ui/components/MuscleAtlasConfig;", "", "<init>", "()V", "cached", "Lcom/example/rungps/ui/components/MuscleAtlasConfig$Atlas;", "load", "context", "Landroid/content/Context;", "parse", "jsonText", "", "isTrainable", "", "id", "nonTrainable", "", "regionForMuscleId", "atlas", "sha256Hex", "bytes", "", "toStringList", "", "Lorg/json/JSONArray;", "toStringSet", "Atlas", "RegionRule", "GoldenTest", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MuscleAtlasConfig {
    private static Atlas cached;
    public static final MuscleAtlasConfig INSTANCE = new MuscleAtlasConfig();
    public static final int $stable = 8;

    private MuscleAtlasConfig() {
    }

    /* compiled from: MuscleAtlasConfig.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003JY\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lcom/example/rungps/ui/components/MuscleAtlasConfig$Atlas;", "", "nonTrainableIds", "", "", "muscleIds", "", "heatmapMuscleIds", "regionRules", "Lcom/example/rungps/ui/components/MuscleAtlasConfig$RegionRule;", "goldenTests", "Lcom/example/rungps/ui/components/MuscleAtlasConfig$GoldenTest;", "<init>", "(Ljava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getNonTrainableIds", "()Ljava/util/Set;", "getMuscleIds", "()Ljava/util/List;", "getHeatmapMuscleIds", "getRegionRules", "getGoldenTests", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Atlas {
        public static final int $stable = 8;
        private final List<GoldenTest> goldenTests;
        private final List<String> heatmapMuscleIds;
        private final List<String> muscleIds;
        private final Set<String> nonTrainableIds;
        private final List<RegionRule> regionRules;

        public static /* synthetic */ Atlas copy$default(Atlas atlas, Set set, List list, List list2, List list3, List list4, int i, Object obj) {
            if ((i & 1) != 0) {
                set = atlas.nonTrainableIds;
            }
            if ((i & 2) != 0) {
                list = atlas.muscleIds;
            }
            List list5 = list;
            if ((i & 4) != 0) {
                list2 = atlas.heatmapMuscleIds;
            }
            List list6 = list2;
            if ((i & 8) != 0) {
                list3 = atlas.regionRules;
            }
            List list7 = list3;
            if ((i & 16) != 0) {
                list4 = atlas.goldenTests;
            }
            return atlas.copy(set, list5, list6, list7, list4);
        }

        public final Set<String> component1() {
            return this.nonTrainableIds;
        }

        public final List<String> component2() {
            return this.muscleIds;
        }

        public final List<String> component3() {
            return this.heatmapMuscleIds;
        }

        public final List<RegionRule> component4() {
            return this.regionRules;
        }

        public final List<GoldenTest> component5() {
            return this.goldenTests;
        }

        public final Atlas copy(Set<String> nonTrainableIds, List<String> muscleIds, List<String> heatmapMuscleIds, List<RegionRule> regionRules, List<GoldenTest> goldenTests) {
            Intrinsics.checkNotNullParameter(nonTrainableIds, "nonTrainableIds");
            Intrinsics.checkNotNullParameter(muscleIds, "muscleIds");
            Intrinsics.checkNotNullParameter(heatmapMuscleIds, "heatmapMuscleIds");
            Intrinsics.checkNotNullParameter(regionRules, "regionRules");
            Intrinsics.checkNotNullParameter(goldenTests, "goldenTests");
            return new Atlas(nonTrainableIds, muscleIds, heatmapMuscleIds, regionRules, goldenTests);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Atlas)) {
                return false;
            }
            Atlas atlas = (Atlas) other;
            return Intrinsics.areEqual(this.nonTrainableIds, atlas.nonTrainableIds) && Intrinsics.areEqual(this.muscleIds, atlas.muscleIds) && Intrinsics.areEqual(this.heatmapMuscleIds, atlas.heatmapMuscleIds) && Intrinsics.areEqual(this.regionRules, atlas.regionRules) && Intrinsics.areEqual(this.goldenTests, atlas.goldenTests);
        }

        public int hashCode() {
            return (((((((this.nonTrainableIds.hashCode() * 31) + this.muscleIds.hashCode()) * 31) + this.heatmapMuscleIds.hashCode()) * 31) + this.regionRules.hashCode()) * 31) + this.goldenTests.hashCode();
        }

        public String toString() {
            return "Atlas(nonTrainableIds=" + this.nonTrainableIds + ", muscleIds=" + this.muscleIds + ", heatmapMuscleIds=" + this.heatmapMuscleIds + ", regionRules=" + this.regionRules + ", goldenTests=" + this.goldenTests + ")";
        }

        public Atlas(Set<String> nonTrainableIds, List<String> muscleIds, List<String> heatmapMuscleIds, List<RegionRule> regionRules, List<GoldenTest> goldenTests) {
            Intrinsics.checkNotNullParameter(nonTrainableIds, "nonTrainableIds");
            Intrinsics.checkNotNullParameter(muscleIds, "muscleIds");
            Intrinsics.checkNotNullParameter(heatmapMuscleIds, "heatmapMuscleIds");
            Intrinsics.checkNotNullParameter(regionRules, "regionRules");
            Intrinsics.checkNotNullParameter(goldenTests, "goldenTests");
            this.nonTrainableIds = nonTrainableIds;
            this.muscleIds = muscleIds;
            this.heatmapMuscleIds = heatmapMuscleIds;
            this.regionRules = regionRules;
            this.goldenTests = goldenTests;
        }

        public final Set<String> getNonTrainableIds() {
            return this.nonTrainableIds;
        }

        public final List<String> getMuscleIds() {
            return this.muscleIds;
        }

        public final List<String> getHeatmapMuscleIds() {
            return this.heatmapMuscleIds;
        }

        public final List<RegionRule> getRegionRules() {
            return this.regionRules;
        }

        public final List<GoldenTest> getGoldenTests() {
            return this.goldenTests;
        }
    }

    /* compiled from: MuscleAtlasConfig.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/ui/components/MuscleAtlasConfig$RegionRule;", "", SVGParser.XML_STYLESHEET_ATTR_TYPE, "", "needle", "region", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getNeedle", "getRegion", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegionRule {
        public static final int $stable = 0;
        private final String needle;
        private final String region;
        private final String type;

        public static /* synthetic */ RegionRule copy$default(RegionRule regionRule, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = regionRule.type;
            }
            if ((i & 2) != 0) {
                str2 = regionRule.needle;
            }
            if ((i & 4) != 0) {
                str3 = regionRule.region;
            }
            return regionRule.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNeedle() {
            return this.needle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        public final RegionRule copy(String type, String needle, String region) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(needle, "needle");
            Intrinsics.checkNotNullParameter(region, "region");
            return new RegionRule(type, needle, region);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RegionRule)) {
                return false;
            }
            RegionRule regionRule = (RegionRule) other;
            return Intrinsics.areEqual(this.type, regionRule.type) && Intrinsics.areEqual(this.needle, regionRule.needle) && Intrinsics.areEqual(this.region, regionRule.region);
        }

        public int hashCode() {
            return (((this.type.hashCode() * 31) + this.needle.hashCode()) * 31) + this.region.hashCode();
        }

        public String toString() {
            return "RegionRule(type=" + this.type + ", needle=" + this.needle + ", region=" + this.region + ")";
        }

        public RegionRule(String type, String needle, String region) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(needle, "needle");
            Intrinsics.checkNotNullParameter(region, "region");
            this.type = type;
            this.needle = needle;
            this.region = region;
        }

        public final String getType() {
            return this.type;
        }

        public final String getNeedle() {
            return this.needle;
        }

        public final String getRegion() {
            return this.region;
        }
    }

    /* compiled from: MuscleAtlasConfig.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/ui/components/MuscleAtlasConfig$GoldenTest;", "", "muscleId", "", "region", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMuscleId", "()Ljava/lang/String;", "getRegion", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GoldenTest {
        public static final int $stable = 0;
        private final String muscleId;
        private final String region;

        public static /* synthetic */ GoldenTest copy$default(GoldenTest goldenTest, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = goldenTest.muscleId;
            }
            if ((i & 2) != 0) {
                str2 = goldenTest.region;
            }
            return goldenTest.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMuscleId() {
            return this.muscleId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        public final GoldenTest copy(String muscleId, String region) {
            Intrinsics.checkNotNullParameter(muscleId, "muscleId");
            Intrinsics.checkNotNullParameter(region, "region");
            return new GoldenTest(muscleId, region);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GoldenTest)) {
                return false;
            }
            GoldenTest goldenTest = (GoldenTest) other;
            return Intrinsics.areEqual(this.muscleId, goldenTest.muscleId) && Intrinsics.areEqual(this.region, goldenTest.region);
        }

        public int hashCode() {
            return (this.muscleId.hashCode() * 31) + this.region.hashCode();
        }

        public String toString() {
            return "GoldenTest(muscleId=" + this.muscleId + ", region=" + this.region + ")";
        }

        public GoldenTest(String muscleId, String region) {
            Intrinsics.checkNotNullParameter(muscleId, "muscleId");
            Intrinsics.checkNotNullParameter(region, "region");
            this.muscleId = muscleId;
            this.region = region;
        }

        public final String getMuscleId() {
            return this.muscleId;
        }

        public final String getRegion() {
            return this.region;
        }
    }

    public final Atlas load(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Atlas atlas = cached;
        if (atlas != null) {
            return atlas;
        }
        InputStream open = context.getAssets().open("muscle-atlas.json");
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String readText = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            Atlas parse = parse(readText);
            cached = parse;
            return parse;
        } finally {
        }
    }

    public final Atlas parse(String jsonText) {
        List emptyList;
        Intrinsics.checkNotNullParameter(jsonText, "jsonText");
        JSONObject jSONObject = new JSONObject(jsonText);
        JSONArray jSONArray = jSONObject.getJSONArray("nonTrainableIds");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
        Set<String> stringSet = toStringSet(jSONArray);
        JSONArray jSONArray2 = jSONObject.getJSONArray("muscleIds");
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "getJSONArray(...)");
        List<String> stringList = toStringList(jSONArray2);
        JSONArray jSONArray3 = jSONObject.getJSONArray("regionRules");
        int length = jSONArray3.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray3.getJSONObject(i);
            String string = jSONObject2.getString(SVGParser.XML_STYLESHEET_ATTR_TYPE);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String optString = jSONObject2.optString("needle", "");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            String optString2 = jSONObject2.optString("region", "");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            arrayList.add(new RegionRule(string, optString, optString2));
        }
        ArrayList arrayList2 = arrayList;
        JSONArray optJSONArray = jSONObject.optJSONArray("goldenTests");
        if (optJSONArray != null) {
            int length2 = optJSONArray.length();
            ArrayList arrayList3 = new ArrayList(length2);
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                String string2 = jSONObject3.getString("muscleId");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = jSONObject3.getString("region");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                arrayList3.add(new GoldenTest(string2, string3));
            }
            emptyList = arrayList3;
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : stringList) {
            if (INSTANCE.isTrainable((String) obj, stringSet)) {
                arrayList4.add(obj);
            }
        }
        return new Atlas(stringSet, stringList, arrayList4, arrayList2, emptyList);
    }

    public final boolean isTrainable(String id, Set<String> nonTrainable) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(nonTrainable, "nonTrainable");
        String obj = StringsKt.trim((CharSequence) id).toString();
        String str = obj;
        return (str.length() == 0 || nonTrainable.contains(obj) || StringsKt.contains$default((CharSequence) str, (CharSequence) "hand", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "foot", false, 2, (Object) null) || StringsKt.startsWith$default(obj, "knee", false, 2, (Object) null)) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String regionForMuscleId(String id, Atlas atlas) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(atlas, "atlas");
        if (!isTrainable(id, atlas.getNonTrainableIds())) {
            return "";
        }
        for (RegionRule regionRule : atlas.getRegionRules()) {
            String type = regionRule.getType();
            switch (type.hashCode()) {
                case -1555538761:
                    if (type.equals("startsWith") && StringsKt.startsWith$default(id, regionRule.getNeedle(), false, 2, (Object) null)) {
                        return regionRule.getRegion();
                    }
                    break;
                case -1295482945:
                    if (type.equals("equals") && Intrinsics.areEqual(id, regionRule.getNeedle())) {
                        return regionRule.getRegion();
                    }
                    break;
                case -567445985:
                    if (type.equals("contains") && StringsKt.contains$default((CharSequence) id, (CharSequence) regionRule.getNeedle(), false, 2, (Object) null)) {
                        return regionRule.getRegion();
                    }
                    break;
                case 1544803905:
                    if (type.equals("default")) {
                        return regionRule.getRegion();
                    }
                    break;
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence sha256Hex$lambda$8(byte b) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final String sha256Hex(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        byte[] digest = MessageDigest.getInstance("SHA-256").digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        return ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.example.rungps.ui.components.MuscleAtlasConfig$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence sha256Hex$lambda$8;
                sha256Hex$lambda$8 = MuscleAtlasConfig.sha256Hex$lambda$8(((Byte) obj).byteValue());
                return sha256Hex$lambda$8;
            }
        }, 30, (Object) null);
    }

    private final List<String> toStringList(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    private final Set<String> toStringSet(JSONArray jSONArray) {
        return CollectionsKt.toSet(toStringList(jSONArray));
    }
}
