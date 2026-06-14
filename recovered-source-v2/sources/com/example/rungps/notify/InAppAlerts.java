package com.example.rungps.notify;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InAppAlerts.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u000eR/\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/notify/InAppAlerts;", "", "<init>", "()V", "<set-?>", "Lcom/example/rungps/notify/PrAlert;", "pendingPr", "getPendingPr", "()Lcom/example/rungps/notify/PrAlert;", "setPendingPr", "(Lcom/example/rungps/notify/PrAlert;)V", "pendingPr$delegate", "Landroidx/compose/runtime/MutableState;", "showPr", "", "alert", "clearPr", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppAlerts {
    public static final int $stable = 0;
    public static final InAppAlerts INSTANCE = new InAppAlerts();

    /* renamed from: pendingPr$delegate, reason: from kotlin metadata */
    private static final MutableState pendingPr = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    private InAppAlerts() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PrAlert getPendingPr() {
        return (PrAlert) pendingPr.getValue();
    }

    public final void setPendingPr(PrAlert prAlert) {
        pendingPr.setValue(prAlert);
    }

    public final void showPr(PrAlert alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        setPendingPr(alert);
    }

    public final void clearPr() {
        setPendingPr(null);
    }
}
