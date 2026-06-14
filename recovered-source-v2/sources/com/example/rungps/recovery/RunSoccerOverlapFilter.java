package com.example.rungps.recovery;

import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SoccerSessionEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: RunSoccerOverlapFilter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u0002¨\u0006\r"}, d2 = {"Lcom/example/rungps/recovery/RunSoccerOverlapFilter;", "", "<init>", "()V", "filter", "", "Lcom/example/rungps/data/RunEntity;", "runs", "soccer", "Lcom/example/rungps/data/SoccerSessionEntity;", "overlapsSoccer", "", "run", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunSoccerOverlapFilter {
    public static final int $stable = 0;
    public static final RunSoccerOverlapFilter INSTANCE = new RunSoccerOverlapFilter();

    private RunSoccerOverlapFilter() {
    }

    public final List<RunEntity> filter(List<RunEntity> runs, List<SoccerSessionEntity> soccer) {
        Intrinsics.checkNotNullParameter(runs, "runs");
        Intrinsics.checkNotNullParameter(soccer, "soccer");
        List<SoccerSessionEntity> dedupe = SoccerSessionDedup.INSTANCE.dedupe(soccer);
        if (dedupe.isEmpty()) {
            return runs;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : runs) {
            if (!INSTANCE.overlapsSoccer((RunEntity) obj, dedupe)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean overlapsSoccer(RunEntity run, List<SoccerSessionEntity> soccer) {
        String str;
        String str2;
        boolean z;
        Long endedAtMs = run.getEndedAtMs();
        if (endedAtMs != null) {
            long longValue = endedAtMs.longValue();
            String planType = run.getPlanType();
            if (planType != null) {
                str = planType.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String timeSession = run.getTimeSession();
            if (timeSession != null) {
                str2 = timeSession.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            } else {
                str2 = null;
            }
            String str3 = str2 != null ? str2 : "";
            if (!Intrinsics.areEqual(str, "watch")) {
                String str4 = str3;
                if (!StringsKt.contains$default((CharSequence) str4, (CharSequence) "da fit", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str4, (CharSequence) "dafit", false, 2, (Object) null) && run.getTotalDistanceM() >= 100.0d) {
                    z = false;
                    for (SoccerSessionEntity soccerSessionEntity : soccer) {
                        Long watchImportId = run.getWatchImportId();
                        Long watchSessionId = soccerSessionEntity.getWatchSessionId();
                        if (watchImportId != null && watchSessionId != null && watchImportId.longValue() > 0 && Intrinsics.areEqual(watchImportId, watchSessionId)) {
                            return true;
                        }
                        if (z || run.getTotalDistanceM() < 200.0d) {
                            long startTimeMs = soccerSessionEntity.getStartTimeMs() + (RangesKt.coerceAtLeast(soccerSessionEntity.getWarmupMin() + soccerSessionEntity.getPlayMin(), 0) * 60000);
                            if (Math.abs(run.getStartedAtMs() - soccerSessionEntity.getStartTimeMs()) < 300000) {
                                return true;
                            }
                            if (run.getStartedAtMs() <= startTimeMs + 60000 && soccerSessionEntity.getStartTimeMs() <= 60000 + longValue) {
                                return true;
                            }
                        }
                    }
                }
            }
            z = true;
            while (r15.hasNext()) {
            }
        }
        return false;
    }
}
