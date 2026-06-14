package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.GroupingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepAudioQualityClassifier.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0019\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u001c\u0010\u001b\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/sleep/SleepAudioQualityClassifier;", "", "<init>", "()V", "GATE_SNR_DB", "", "RELIABLE_RATIO", "CLIP_THRESHOLD", "", "assessBucket", "Lcom/example/rungps/sleep/SleepAudioQualityClassifier$BucketQuality;", "pcm16le", "", "rms", "baselineRms", "eventTag", "", "noiseTag", "summarize", "Lcom/example/rungps/sleep/SleepAudioQualityClassifier$NightSummary;", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "detectClipping", "", "estimateSnrDb", "environmentalTagFromEvent", "fanLikelihood", "rmsSeries", "BucketQuality", "NightSummary", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAudioQualityClassifier {
    public static final int $stable = 0;
    private static final int CLIP_THRESHOLD = 30000;
    private static final float GATE_SNR_DB = 8.0f;
    public static final SleepAudioQualityClassifier INSTANCE = new SleepAudioQualityClassifier();
    private static final float RELIABLE_RATIO = 0.7f;

    private SleepAudioQualityClassifier() {
    }

    /* compiled from: SleepAudioQualityClassifier.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/sleep/SleepAudioQualityClassifier$BucketQuality;", "", "passesGate", "", "snrDb", "", "clipped", "noiseTag", "", "<init>", "(ZFZLjava/lang/String;)V", "getPassesGate", "()Z", "getSnrDb", "()F", "getClipped", "getNoiseTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BucketQuality {
        public static final int $stable = 0;
        private final boolean clipped;
        private final String noiseTag;
        private final boolean passesGate;
        private final float snrDb;

        public static /* synthetic */ BucketQuality copy$default(BucketQuality bucketQuality, boolean z, float f, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bucketQuality.passesGate;
            }
            if ((i & 2) != 0) {
                f = bucketQuality.snrDb;
            }
            if ((i & 4) != 0) {
                z2 = bucketQuality.clipped;
            }
            if ((i & 8) != 0) {
                str = bucketQuality.noiseTag;
            }
            return bucketQuality.copy(z, f, z2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getPassesGate() {
            return this.passesGate;
        }

        /* renamed from: component2, reason: from getter */
        public final float getSnrDb() {
            return this.snrDb;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getClipped() {
            return this.clipped;
        }

        /* renamed from: component4, reason: from getter */
        public final String getNoiseTag() {
            return this.noiseTag;
        }

        public final BucketQuality copy(boolean passesGate, float snrDb, boolean clipped, String noiseTag) {
            return new BucketQuality(passesGate, snrDb, clipped, noiseTag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BucketQuality)) {
                return false;
            }
            BucketQuality bucketQuality = (BucketQuality) other;
            return this.passesGate == bucketQuality.passesGate && Float.compare(this.snrDb, bucketQuality.snrDb) == 0 && this.clipped == bucketQuality.clipped && Intrinsics.areEqual(this.noiseTag, bucketQuality.noiseTag);
        }

        public int hashCode() {
            int hashCode = ((((Boolean.hashCode(this.passesGate) * 31) + Float.hashCode(this.snrDb)) * 31) + Boolean.hashCode(this.clipped)) * 31;
            String str = this.noiseTag;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "BucketQuality(passesGate=" + this.passesGate + ", snrDb=" + this.snrDb + ", clipped=" + this.clipped + ", noiseTag=" + this.noiseTag + ")";
        }

        public BucketQuality(boolean z, float f, boolean z2, String str) {
            this.passesGate = z;
            this.snrDb = f;
            this.clipped = z2;
            this.noiseTag = str;
        }

        public final boolean getPassesGate() {
            return this.passesGate;
        }

        public final float getSnrDb() {
            return this.snrDb;
        }

        public final boolean getClipped() {
            return this.clipped;
        }

        public final String getNoiseTag() {
            return this.noiseTag;
        }
    }

    /* compiled from: SleepAudioQualityClassifier.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/sleep/SleepAudioQualityClassifier$NightSummary;", "", "passRatio", "", "reliable", "", "dominantNoise", "", "<init>", "(FZLjava/lang/String;)V", "getPassRatio", "()F", "getReliable", "()Z", "getDominantNoise", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NightSummary {
        public static final int $stable = 0;
        private final String dominantNoise;
        private final float passRatio;
        private final boolean reliable;

        public static /* synthetic */ NightSummary copy$default(NightSummary nightSummary, float f, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                f = nightSummary.passRatio;
            }
            if ((i & 2) != 0) {
                z = nightSummary.reliable;
            }
            if ((i & 4) != 0) {
                str = nightSummary.dominantNoise;
            }
            return nightSummary.copy(f, z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final float getPassRatio() {
            return this.passRatio;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getReliable() {
            return this.reliable;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDominantNoise() {
            return this.dominantNoise;
        }

        public final NightSummary copy(float passRatio, boolean reliable, String dominantNoise) {
            return new NightSummary(passRatio, reliable, dominantNoise);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NightSummary)) {
                return false;
            }
            NightSummary nightSummary = (NightSummary) other;
            return Float.compare(this.passRatio, nightSummary.passRatio) == 0 && this.reliable == nightSummary.reliable && Intrinsics.areEqual(this.dominantNoise, nightSummary.dominantNoise);
        }

        public int hashCode() {
            int hashCode = ((Float.hashCode(this.passRatio) * 31) + Boolean.hashCode(this.reliable)) * 31;
            String str = this.dominantNoise;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "NightSummary(passRatio=" + this.passRatio + ", reliable=" + this.reliable + ", dominantNoise=" + this.dominantNoise + ")";
        }

        public NightSummary(float f, boolean z, String str) {
            this.passRatio = f;
            this.reliable = z;
            this.dominantNoise = str;
        }

        public final float getPassRatio() {
            return this.passRatio;
        }

        public final boolean getReliable() {
            return this.reliable;
        }

        public final String getDominantNoise() {
            return this.dominantNoise;
        }
    }

    public final BucketQuality assessBucket(byte[] pcm16le, float rms, float baselineRms, String eventTag, String noiseTag) {
        Intrinsics.checkNotNullParameter(pcm16le, "pcm16le");
        boolean detectClipping = detectClipping(pcm16le);
        float estimateSnrDb = estimateSnrDb(rms, baselineRms);
        if (noiseTag == null) {
            noiseTag = environmentalTagFromEvent(eventTag);
        }
        return new BucketQuality((detectClipping || estimateSnrDb < 8.0f || Intrinsics.areEqual(noiseTag, "fan")) ? false : true, estimateSnrDb, detectClipping, noiseTag);
    }

    public final NightSummary summarize(List<SleepTrackSample> samples) {
        int i;
        Object next;
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (samples.isEmpty()) {
            return new NightSummary(0.0f, false, null);
        }
        List<SleepTrackSample> list = samples;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (Intrinsics.areEqual((Object) ((SleepTrackSample) it.next()).getAudioQualityOk(), (Object) true) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        float size = i / samples.size();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            String noiseTag = ((SleepTrackSample) it2.next()).getNoiseTag();
            if (noiseTag != null) {
                arrayList.add(noiseTag);
            }
        }
        final ArrayList arrayList2 = arrayList;
        Iterator it3 = GroupingKt.eachCount(new Grouping<String, String>() { // from class: com.example.rungps.sleep.SleepAudioQualityClassifier$summarize$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public Iterator<String> sourceIterator() {
                return arrayList2.iterator();
            }

            @Override // kotlin.collections.Grouping
            public String keyOf(String element) {
                return element;
            }
        }).entrySet().iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                int intValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it3.next();
                    int intValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        return new NightSummary(size, size >= RELIABLE_RATIO, entry != null ? (String) entry.getKey() : null);
    }

    public final boolean detectClipping(byte[] pcm16le) {
        Intrinsics.checkNotNullParameter(pcm16le, "pcm16le");
        if (pcm16le.length < 4) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i + 1;
            if (i4 >= pcm16le.length) {
                break;
            }
            int i5 = (pcm16le[i4] << 8) | (pcm16le[i] & 255);
            if (i5 > 32767) {
                i5 -= 65536;
            }
            if (Math.abs(i5) >= CLIP_THRESHOLD) {
                i3++;
            }
            i2++;
            i += 2;
        }
        return i2 > 0 && ((float) i3) / ((float) i2) > 0.02f;
    }

    public final float estimateSnrDb(float rms, float baselineRms) {
        return RangesKt.coerceIn(((float) Math.log10(RangesKt.coerceAtLeast(rms, 1.0f) / RangesKt.coerceAtLeast(baselineRms, 1.0f))) * 20.0f, -10.0f, 40.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final String environmentalTagFromEvent(String eventTag) {
        if (eventTag != null) {
            switch (eventTag.hashCode()) {
                case -1067310595:
                    if (eventTag.equals("traffic")) {
                        return eventTag;
                    }
                    break;
                case 101139:
                    if (eventTag.equals("fan")) {
                        return eventTag;
                    }
                    break;
                case 110879:
                    if (eventTag.equals("pet")) {
                        return eventTag;
                    }
                    break;
                case 104998682:
                    if (eventTag.equals("noise")) {
                        return eventTag;
                    }
                    break;
            }
        }
        return null;
    }

    public final float fanLikelihood(List<Float> rmsSeries, float baselineRms) {
        Intrinsics.checkNotNullParameter(rmsSeries, "rmsSeries");
        if (rmsSeries.size() < 6) {
            return 0.0f;
        }
        float coerceAtLeast = RangesKt.coerceAtLeast(baselineRms, 50.0f);
        List<Float> list = rmsSeries;
        float averageOfFloat = (float) CollectionsKt.averageOfFloat(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue() - averageOfFloat;
            arrayList.add(Float.valueOf(floatValue * floatValue));
        }
        return RangesKt.coerceIn(((averageOfFloat > 0.0f ? 1.0f - RangesKt.coerceIn(((float) Math.sqrt(CollectionsKt.averageOfFloat(arrayList))) / averageOfFloat, 0.0f, 1.0f) : 0.0f) * 0.6f) + ((RangesKt.coerceIn(averageOfFloat / coerceAtLeast, 0.0f, 3.0f) / 3.0f) * 0.4f), 0.0f, 1.0f);
    }
}
