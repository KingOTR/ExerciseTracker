package com.example.rungps.gear;

import com.caverock.androidsvg.SVGParser;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.tracking.TrackingService;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GearTypes.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0005J\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u001e\u001a\u00020\u0005J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 2\u0006\u0010!\u001a\u00020\u001aJ\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006#"}, d2 = {"Lcom/example/rungps/gear/GearTypes;", "", "<init>", "()V", GearTypes.RUNNING_SHOES, "", GearTypes.BIKE_ROAD, GearTypes.BIKE_GRAVEL, GearTypes.BIKE_MTB, GearTypes.HELMET, "WATCH", GearTypes.COMPONENT_CHAIN, GearTypes.COMPONENT_TIRE, GearTypes.COMPONENT_BRAKE_PAD, GearTypes.COMPONENT_CASSETTE, "BIKE_TYPES", "", "getBIKE_TYPES", "()Ljava/util/Set;", "SHOE_TYPES", "getSHOE_TYPES", "COMPONENT_TYPES", "getCOMPONENT_TYPES", "label", SVGParser.XML_STYLESHEET_ATTR_TYPE, "isBike", "", "isShoe", "isComponent", "forActivityType", TrackingService.EXTRA_ACTIVITY_TYPE, "selectableTypes", "", "forRun", "componentTypesForBike", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearTypes {
    public static final String HELMET = "HELMET";
    public static final String WATCH = "WATCH";
    public static final GearTypes INSTANCE = new GearTypes();
    public static final String BIKE_ROAD = "BIKE_ROAD";
    public static final String BIKE_GRAVEL = "BIKE_GRAVEL";
    public static final String BIKE_MTB = "BIKE_MTB";
    private static final Set<String> BIKE_TYPES = SetsKt.setOf((Object[]) new String[]{BIKE_ROAD, BIKE_GRAVEL, BIKE_MTB});
    public static final String RUNNING_SHOES = "RUNNING_SHOES";
    private static final Set<String> SHOE_TYPES = SetsKt.setOf(RUNNING_SHOES);
    public static final String COMPONENT_CHAIN = "COMPONENT_CHAIN";
    public static final String COMPONENT_TIRE = "COMPONENT_TIRE";
    public static final String COMPONENT_BRAKE_PAD = "COMPONENT_BRAKE_PAD";
    public static final String COMPONENT_CASSETTE = "COMPONENT_CASSETTE";
    private static final Set<String> COMPONENT_TYPES = SetsKt.setOf((Object[]) new String[]{COMPONENT_CHAIN, COMPONENT_TIRE, COMPONENT_BRAKE_PAD, COMPONENT_CASSETTE});
    public static final int $stable = 8;

    private GearTypes() {
    }

    public final Set<String> getBIKE_TYPES() {
        return BIKE_TYPES;
    }

    public final Set<String> getSHOE_TYPES() {
        return SHOE_TYPES;
    }

    public final Set<String> getCOMPONENT_TYPES() {
        return COMPONENT_TYPES;
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
    public final String label(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        switch (type.hashCode()) {
            case -1696635611:
                if (!type.equals(BIKE_GRAVEL)) {
                }
                break;
            case -780838518:
                if (!type.equals(COMPONENT_TIRE)) {
                }
                break;
            case -747808578:
                if (!type.equals(BIKE_ROAD)) {
                }
                break;
            case 13409320:
                if (!type.equals(RUNNING_SHOES)) {
                }
                break;
            case 82365615:
                if (!type.equals("WATCH")) {
                }
                break;
            case 1548063935:
                if (!type.equals(COMPONENT_CHAIN)) {
                }
                break;
            case 1602072669:
                if (!type.equals(COMPONENT_BRAKE_PAD)) {
                }
                break;
            case 1638440477:
                if (!type.equals(BIKE_MTB)) {
                }
                break;
            case 1915647168:
                if (!type.equals(COMPONENT_CASSETTE)) {
                }
                break;
            case 2127362157:
                if (!type.equals(HELMET)) {
                }
                break;
        }
        return type;
    }

    public final boolean isBike(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return BIKE_TYPES.contains(type);
    }

    public final boolean isShoe(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SHOE_TYPES.contains(type);
    }

    public final boolean isComponent(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return COMPONENT_TYPES.contains(type);
    }

    public final Set<String> forActivityType(String activityType) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        return ActivityTypes.INSTANCE.isBike(activityType) ? BIKE_TYPES : SHOE_TYPES;
    }

    public final List<String> selectableTypes(boolean forRun) {
        return forRun ? CollectionsKt.listOf(RUNNING_SHOES) : CollectionsKt.listOf((Object[]) new String[]{BIKE_ROAD, BIKE_GRAVEL, BIKE_MTB});
    }

    public final List<String> componentTypesForBike() {
        return CollectionsKt.toList(COMPONENT_TYPES);
    }
}
