package com.example.rungps.sleep;

import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SleepSoundKinds.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/rungps/sleep/SleepSoundKinds;", "", "<init>", "()V", "DISTURBANCES", "", "", "ENVIRONMENT", "isDisturbance", "", "kind", "isEnvironment", "label", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepSoundKinds {
    public static final SleepSoundKinds INSTANCE = new SleepSoundKinds();
    private static final Set<String> DISTURBANCES = SetsKt.setOf((Object[]) new String[]{"snore", "talk", "cough", "noise", "fan", "traffic", "pet"});
    private static final Set<String> ENVIRONMENT = SetsKt.setOf((Object[]) new String[]{"fan", "traffic", "pet", "noise"});
    public static final int $stable = 8;

    private SleepSoundKinds() {
    }

    public final boolean isDisturbance(String kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Set<String> set = DISTURBANCES;
        String lowerCase = StringsKt.trim((CharSequence) kind).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return set.contains(lowerCase);
    }

    public final boolean isEnvironment(String kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Set<String> set = ENVIRONMENT;
        String lowerCase = StringsKt.trim((CharSequence) kind).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return set.contains(lowerCase);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final String label(String kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        String lowerCase = StringsKt.trim((CharSequence) kind).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case -1067310595:
                if (!lowerCase.equals("traffic")) {
                }
                break;
            case 101139:
                if (!lowerCase.equals("fan")) {
                }
                break;
            case 110879:
                if (!lowerCase.equals("pet")) {
                }
                break;
            case 3552428:
                if (!lowerCase.equals("talk")) {
                }
                break;
            case 94851114:
                if (!lowerCase.equals("cough")) {
                }
                break;
            case 104998682:
                if (!lowerCase.equals("noise")) {
                }
                break;
            case 109592231:
                if (!lowerCase.equals("snore")) {
                }
                break;
        }
        return kind;
    }
}
