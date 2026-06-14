package com.example.rungps.sleep;

import androidx.health.platform.client.SdkConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.GroupingKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: SleepEventMarkersEncoder.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u0010\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0002\u0010\u0013\u001a\u00020\nJ/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0017J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u001e\u0010\u001a\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u001e\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bH\u0002J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\"2\u0006\u0010#\u001a\u00020\n2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002¨\u0006%"}, d2 = {"Lcom/example/rungps/sleep/SleepEventMarkersEncoder;", "", "<init>", "()V", "encodeFromSamples", "", "samples", "", "Lcom/example/rungps/sleep/SleepTrackSample;", "hypnogramMinutes", "", "snoreThreshold", "", "decode", "Lcom/example/rungps/sleep/SleepMinuteEvent;", "compact", "synthesize", "stages", "Lcom/example/rungps/sleep/SleepStageLabel;", "snoreEvents", "resolve", "eventMarkersCompact", "hypnogramCompact", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljava/util/List;", "padToHypnogram", "events", "synthesizeSnoreOnly", "charForSlice", "", "slice", "isTalkBucket", "", "s", "distributeEvents", "", "count", "slots", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepEventMarkersEncoder {
    public static final int $stable = 0;
    public static final SleepEventMarkersEncoder INSTANCE = new SleepEventMarkersEncoder();

    private SleepEventMarkersEncoder() {
    }

    public static /* synthetic */ String encodeFromSamples$default(SleepEventMarkersEncoder sleepEventMarkersEncoder, List list, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 0.35f;
        }
        return sleepEventMarkersEncoder.encodeFromSamples(list, i, f);
    }

    public final String encodeFromSamples(List<SleepTrackSample> samples, int hypnogramMinutes, float snoreThreshold) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (samples.isEmpty() || hypnogramMinutes <= 0) {
            return "";
        }
        int coerceAtMost = RangesKt.coerceAtMost(hypnogramMinutes, 900);
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt(samples.size() / RangesKt.coerceAtLeast(coerceAtMost, 1)), 1, 12);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coerceAtMost; i++) {
            sb.append(INSTANCE.charForSlice(CollectionsKt.take(CollectionsKt.drop(samples, i * coerceIn), coerceIn), snoreThreshold));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final List<SleepMinuteEvent> decode(String compact) {
        String str = compact;
        if (str == null || StringsKt.isBlank(str)) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            int i3 = i2 + 1;
            arrayList.add(new SleepMinuteEvent(i2, charAt == 's', charAt == 't', charAt == 'm', charAt == 'p', charAt == 'c', charAt == 'e'));
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    public static /* synthetic */ String synthesize$default(SleepEventMarkersEncoder sleepEventMarkersEncoder, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return sleepEventMarkersEncoder.synthesize(list, i);
    }

    public final String synthesize(List<? extends SleepStageLabel> stages, int snoreEvents) {
        char c;
        Intrinsics.checkNotNullParameter(stages, "stages");
        if (stages.isEmpty()) {
            return "";
        }
        List<? extends SleepStageLabel> list = stages;
        List arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Integer valueOf = ((SleepStageLabel) obj) == SleepStageLabel.AWAKE ? Integer.valueOf(i2) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
            i2 = i3;
        }
        List list2 = arrayList;
        if (list2.isEmpty()) {
            list2 = CollectionsKt.toList(CollectionsKt.getIndices(stages));
        }
        Set<Integer> distributeEvents = distributeEvents(snoreEvents, list2);
        StringBuilder sb = new StringBuilder();
        for (Object obj2 : list) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SleepStageLabel sleepStageLabel = (SleepStageLabel) obj2;
            if (distributeEvents.contains(Integer.valueOf(i))) {
                c = 's';
            } else {
                c = sleepStageLabel == SleepStageLabel.AWAKE ? 't' : '.';
            }
            sb.append(c);
            i = i4;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final List<SleepMinuteEvent> resolve(String eventMarkersCompact, String hypnogramCompact, Integer snoreEvents) {
        List<SleepStageLabel> decode = SleepHypnogramEncoder.INSTANCE.decode(hypnogramCompact);
        if (decode.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<SleepMinuteEvent> decode2 = decode(eventMarkersCompact);
        if (!decode2.isEmpty()) {
            return padToHypnogram(decode2, decode.size());
        }
        int intValue = snoreEvents != null ? snoreEvents.intValue() : 0;
        if (intValue > 0) {
            return padToHypnogram(decode(synthesizeSnoreOnly(decode, intValue)), decode.size());
        }
        int size = decode.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new SleepMinuteEvent(i, false, false, false, false, false, false, SdkConfig.SDK_VERSION, null));
        }
        return arrayList;
    }

    private final List<SleepMinuteEvent> padToHypnogram(List<SleepMinuteEvent> events, int hypnogramMinutes) {
        if (hypnogramMinutes <= 0) {
            return events;
        }
        int i = 0;
        if (events.size() >= hypnogramMinutes) {
            List take = CollectionsKt.take(events, hypnogramMinutes);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
            Iterator it = take.iterator();
            while (true) {
                int i2 = i;
                if (it.hasNext()) {
                    Object next = it.next();
                    i = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(SleepMinuteEvent.copy$default((SleepMinuteEvent) next, i2, false, false, false, false, false, false, WebSocketProtocol.PAYLOAD_SHORT, null));
                } else {
                    return arrayList;
                }
            }
        } else {
            List<SleepMinuteEvent> list = events;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(SleepMinuteEvent.copy$default((SleepMinuteEvent) obj, i3, false, false, false, false, false, false, WebSocketProtocol.PAYLOAD_SHORT, null));
                i3 = i4;
            }
            List<SleepMinuteEvent> mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
            while (mutableList.size() < hypnogramMinutes) {
                mutableList.add(new SleepMinuteEvent(mutableList.size(), false, false, false, false, false, false, SdkConfig.SDK_VERSION, null));
            }
            return mutableList;
        }
    }

    private final String synthesizeSnoreOnly(List<? extends SleepStageLabel> stages, int snoreEvents) {
        if (stages.isEmpty() || snoreEvents <= 0) {
            return StringsKt.repeat(".", stages.size());
        }
        List<? extends SleepStageLabel> list = stages;
        List arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Integer valueOf = ((SleepStageLabel) obj) == SleepStageLabel.AWAKE ? Integer.valueOf(i2) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
            i2 = i3;
        }
        List list2 = arrayList;
        if (list2.isEmpty()) {
            list2 = CollectionsKt.toList(CollectionsKt.getIndices(stages));
        }
        Set<Integer> distributeEvents = distributeEvents(snoreEvents, list2);
        StringBuilder sb = new StringBuilder();
        for (Object obj2 : list) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            sb.append(distributeEvents.contains(Integer.valueOf(i)) ? 's' : '.');
            i = i4;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        if (r4.equals("snore") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        if (r4.equals("noise") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        if (r4.equals("cough") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
    
        if (r4.equals("talk") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
    
        if (r4.equals("pet") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        if (r4.equals("fan") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
    
        if (r4.equals("traffic") == false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final char charForSlice(List<SleepTrackSample> slice, float snoreThreshold) {
        Object next;
        if (slice.isEmpty()) {
            return '.';
        }
        List<SleepTrackSample> list = slice;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String eventTag = ((SleepTrackSample) it.next()).getEventTag();
            if (eventTag != null) {
                arrayList.add(eventTag);
            }
        }
        final ArrayList arrayList2 = arrayList;
        Iterator it2 = GroupingKt.eachCount(new Grouping<String, String>() { // from class: com.example.rungps.sleep.SleepEventMarkersEncoder$charForSlice$$inlined$groupingBy$1
            @Override // kotlin.collections.Grouping
            public Iterator<String> sourceIterator() {
                return arrayList2.iterator();
            }

            @Override // kotlin.collections.Grouping
            public String keyOf(String element) {
                return element;
            }
        }).entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        String str = entry != null ? (String) entry.getKey() : null;
        if (str != null) {
            switch (str.hashCode()) {
                case -1067310595:
                    break;
                case 101139:
                    break;
                case 110879:
                    break;
                case 3552428:
                    break;
                case 94851114:
                    break;
                case 104998682:
                    break;
                case 109592231:
                    break;
            }
        }
        boolean z = list instanceof Collection;
        if (!z || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (Intrinsics.areEqual((Object) ((SleepTrackSample) it3.next()).getBreathPause(), (Object) true)) {
                    return 'p';
                }
            }
        }
        if (!z || !list.isEmpty()) {
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                if (Intrinsics.areEqual(((SleepTrackSample) it4.next()).getEventTag(), "cough")) {
                    return 'c';
                }
            }
        }
        if (!z || !list.isEmpty()) {
            for (SleepTrackSample sleepTrackSample : list) {
                if (sleepTrackSample.getNoiseTag() == null && !CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"fan", "traffic", "pet"}), sleepTrackSample.getEventTag())) {
                }
                return 'e';
            }
        }
        if (!z || !list.isEmpty()) {
            for (SleepTrackSample sleepTrackSample2 : list) {
                if (sleepTrackSample2.getSnoreLikelihood() < snoreThreshold && !Intrinsics.areEqual(sleepTrackSample2.getEventTag(), "snore")) {
                }
                return 's';
            }
        }
        if (!z || !list.isEmpty()) {
            for (SleepTrackSample sleepTrackSample3 : list) {
                if (!Intrinsics.areEqual(sleepTrackSample3.getEventTag(), "talk") && !INSTANCE.isTalkBucket(sleepTrackSample3)) {
                }
                return 't';
            }
        }
        if (!z || !list.isEmpty()) {
            for (SleepTrackSample sleepTrackSample4 : list) {
                if (sleepTrackSample4.getMovement() < 2.4f && !Intrinsics.areEqual(sleepTrackSample4.getEventTag(), "noise")) {
                }
                return 'm';
            }
        }
        return '.';
    }

    private final boolean isTalkBucket(SleepTrackSample s) {
        return s.getBreathRateBpm() > 0.0f && (s.getAudioLevel() >= 1.85f || (s.getAudioLevel() >= 1.55f && s.getQuietFraction() <= 0.14f));
    }

    private final Set<Integer> distributeEvents(int count, List<Integer> slots) {
        if (count <= 0 || slots.isEmpty()) {
            return SetsKt.emptySet();
        }
        float coerceAtLeast = RangesKt.coerceAtLeast(slots.size() / count, 1.0f);
        IntRange until = RangesKt.until(0, count);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(slots.get(RangesKt.coerceIn((int) (((IntIterator) it).nextInt() * coerceAtLeast), 0, CollectionsKt.getLastIndex(slots))).intValue()));
        }
        return CollectionsKt.toSet(arrayList);
    }
}
