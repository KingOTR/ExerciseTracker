package androidx.health.connect.client.impl.converters.time;

import androidx.health.connect.client.time.TimeRangeFilter;
import androidx.health.platform.client.proto.TimeProto;
import java.time.Instant;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimeRangeFilterConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toProto", "Landroidx/health/platform/client/proto/TimeProto$TimeSpec;", "Landroidx/health/connect/client/time/TimeRangeFilter;", "connect-client_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimeRangeFilterConverterKt {
    public static final TimeProto.TimeSpec toProto(TimeRangeFilter timeRangeFilter) {
        Intrinsics.checkNotNullParameter(timeRangeFilter, "<this>");
        TimeProto.TimeSpec.Builder newBuilder = TimeProto.TimeSpec.newBuilder();
        Instant startTime = timeRangeFilter.getStartTime();
        if (startTime != null) {
            newBuilder.setStartTimeEpochMs(startTime.toEpochMilli());
        }
        Instant endTime = timeRangeFilter.getEndTime();
        if (endTime != null) {
            newBuilder.setEndTimeEpochMs(endTime.toEpochMilli());
        }
        LocalDateTime localStartTime = timeRangeFilter.getLocalStartTime();
        if (localStartTime != null) {
            newBuilder.setStartLocalDateTime(localStartTime.toString());
        }
        LocalDateTime localEndTime = timeRangeFilter.getLocalEndTime();
        if (localEndTime != null) {
            newBuilder.setEndLocalDateTime(localEndTime.toString());
        }
        TimeProto.TimeSpec build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n        .ap…       }\n        .build()");
        return build;
    }
}
