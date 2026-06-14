package io.grpc.stub;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import org.maplibre.android.style.layers.Property;

@Deprecated
/* loaded from: classes5.dex */
public final class StreamObservers {
    public static <V> void copyWithFlowControl(final Iterator<V> it, final CallStreamObserver<V> callStreamObserver) {
        Preconditions.checkNotNull(it, Property.SYMBOL_Z_ORDER_SOURCE);
        Preconditions.checkNotNull(callStreamObserver, "target");
        callStreamObserver.setOnReadyHandler(new Runnable() { // from class: io.grpc.stub.StreamObservers.1FlowControllingOnReadyHandler
            private boolean completed;

            @Override // java.lang.Runnable
            public void run() {
                if (this.completed) {
                    return;
                }
                while (CallStreamObserver.this.isReady() && it.hasNext()) {
                    CallStreamObserver.this.onNext(it.next());
                }
                if (it.hasNext()) {
                    return;
                }
                this.completed = true;
                CallStreamObserver.this.onCompleted();
            }
        });
    }

    public static <V> void copyWithFlowControl(Iterable<V> iterable, CallStreamObserver<V> callStreamObserver) {
        Preconditions.checkNotNull(iterable, Property.SYMBOL_Z_ORDER_SOURCE);
        copyWithFlowControl(iterable.iterator(), callStreamObserver);
    }
}
