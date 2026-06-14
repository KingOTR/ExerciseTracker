package com.example.rungps.tracking;

import com.caverock.androidsvg.SVGParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityTypes.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/rungps/tracking/ActivityTypes;", "", "<init>", "()V", "RUN", "", ActivityTypes.BIKE, "isBike", "", SVGParser.XML_STYLESHEET_ATTR_TYPE, "label", "labelPlural", "recoveryKind", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityTypes {
    public static final int $stable = 0;
    public static final String BIKE = "BIKE";
    public static final ActivityTypes INSTANCE = new ActivityTypes();
    public static final String RUN = "RUN";

    private ActivityTypes() {
    }

    public final boolean isBike(String type) {
        return Intrinsics.areEqual(type, BIKE);
    }

    public final String label(String type) {
        return isBike(type) ? "Ride" : "Run";
    }

    public final String labelPlural(String type) {
        return isBike(type) ? "Rides" : "Runs";
    }

    public final String recoveryKind(String type) {
        return isBike(type) ? BIKE : "RUN";
    }
}
