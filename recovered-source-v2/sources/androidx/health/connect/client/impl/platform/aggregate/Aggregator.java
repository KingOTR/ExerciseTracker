package androidx.health.connect.client.impl.platform.aggregate;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.firestore.model.Values;
import kotlin.Metadata;

/* compiled from: Aggregator.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\r\u0010\u0004\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H¦\u0002¢\u0006\u0002\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/health/connect/client/impl/platform/aggregate/Aggregator;", ExifInterface.GPS_DIRECTION_TRUE, "R", "", "getResult", "()Ljava/lang/Object;", "plusAssign", "", Values.VECTOR_MAP_VECTORS_KEY, "(Ljava/lang/Object;)V", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Aggregator<T, R> {
    R getResult();

    void plusAssign(T value);
}
