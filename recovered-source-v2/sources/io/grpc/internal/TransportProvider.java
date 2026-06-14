package io.grpc.internal;

import javax.annotation.Nullable;

/* loaded from: classes5.dex */
interface TransportProvider {
    @Nullable
    ClientTransport obtainActiveTransport();
}
