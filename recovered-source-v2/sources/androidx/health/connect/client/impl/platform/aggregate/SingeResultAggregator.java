package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.records.metadata.DataOrigin;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;

/* compiled from: Aggregator.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/SingeResultAggregator;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/impl/platform/aggregate/Aggregator;", "Landroidx/health/connect/client/aggregate/AggregationResult;", "()V", "dataOrigins", "", "Landroidx/health/connect/client/records/metadata/DataOrigin;", "getDataOrigins", "()Ljava/util/Set;", "doubleValues", "", "", "", "getDoubleValues", "()Ljava/util/Map;", "getResult", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SingeResultAggregator<T> implements Aggregator<T, AggregationResult> {
    public abstract Set<DataOrigin> getDataOrigins();

    public abstract Map<String, Double> getDoubleValues();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.health.connect.client.impl.platform.aggregate.Aggregator
    public AggregationResult getResult() {
        if (getDataOrigins().isEmpty()) {
            return HealthConnectClientAggregationExtensionsKt.emptyAggregationResult();
        }
        return new AggregationResult(MapsKt.emptyMap(), getDoubleValues(), getDataOrigins());
    }
}
