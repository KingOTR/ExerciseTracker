package com.example.rungps.tracking;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: TrackingState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u001a\u0010\u000e\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/tracking/TrackingState;", "", "<init>", "()V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/rungps/tracking/TrackingUiState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "update", "", "newState", "patch", "transform", "Lkotlin/Function1;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackingState {
    public static final int $stable;
    public static final TrackingState INSTANCE = new TrackingState();
    private static final MutableStateFlow<TrackingUiState> _state;
    private static final StateFlow<TrackingUiState> state;

    private TrackingState() {
    }

    static {
        MutableStateFlow<TrackingUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new TrackingUiState(false, null, 0L, 0.0d, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435455, null));
        _state = MutableStateFlow;
        state = FlowKt.asStateFlow(MutableStateFlow);
        $stable = 8;
    }

    public final StateFlow<TrackingUiState> getState() {
        return state;
    }

    public final void update(TrackingUiState newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        _state.setValue(newState);
    }

    public final void patch(Function1<? super TrackingUiState, TrackingUiState> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        MutableStateFlow<TrackingUiState> mutableStateFlow = _state;
        mutableStateFlow.setValue(transform.invoke(mutableStateFlow.getValue()));
    }
}
