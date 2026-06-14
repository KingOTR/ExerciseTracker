package com.example.rungps.sleep;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepHypnogram.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/sleep/SleepHypnogramEncoder;", "", "<init>", "()V", "CHARS", "", "encode", "labels", "", "Lcom/example/rungps/sleep/SleepStageLabel;", "bucketsPerMinute", "", "encodeForInBed", "inBedMin", "decode", "compact", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepHypnogramEncoder {
    public static final int $stable = 0;
    private static final String CHARS = "0123";
    public static final SleepHypnogramEncoder INSTANCE = new SleepHypnogramEncoder();

    private SleepHypnogramEncoder() {
    }

    public static /* synthetic */ String encode$default(SleepHypnogramEncoder sleepHypnogramEncoder, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 6;
        }
        return sleepHypnogramEncoder.encode(list, i);
    }

    public final String encode(List<? extends SleepStageLabel> labels, int bucketsPerMinute) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        if (labels.isEmpty()) {
            return "";
        }
        int coerceIn = RangesKt.coerceIn(bucketsPerMinute, 1, 12);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < labels.size(); i += coerceIn) {
            sb.append(CHARS.charAt(RangesKt.coerceIn(labels.get(i).ordinal(), 0, 3)));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return StringsKt.take(sb2, 900);
    }

    public final String encodeForInBed(List<? extends SleepStageLabel> labels, int inBedMin) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        return encode(labels, labels.size() > RangesKt.coerceAtLeast(inBedMin, 1) * 2 ? 6 : 1);
    }

    public final List<SleepStageLabel> decode(String compact) {
        SleepStageLabel sleepStageLabel;
        String str = compact;
        if (str == null || StringsKt.isBlank(str)) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '0') {
                sleepStageLabel = SleepStageLabel.AWAKE;
            } else if (charAt == '2') {
                sleepStageLabel = SleepStageLabel.DEEP;
            } else if (charAt == '3') {
                sleepStageLabel = SleepStageLabel.REM;
            } else {
                sleepStageLabel = SleepStageLabel.LIGHT;
            }
            arrayList.add(sleepStageLabel);
        }
        return arrayList;
    }
}
