package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import com.example.rungps.routing.OsrmWalkingRouter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.osmdroid.util.GeoPoint;

/* compiled from: MapTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1", f = "MapTabContent.kt", i = {0, 1, 1, 1, 1, 2, 3}, l = {451, 466, 486, 491}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "w", "prev", "cur", "$this$launch", "snapped"}, s = {"L$0", "L$0", "L$2", "L$3", "L$4", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GeoPoint $a;
    final /* synthetic */ GeoPoint $b;
    final /* synthetic */ MutableState<List<GeoPoint>> $planned;
    final /* synthetic */ MutableState<List<GeoPoint>> $plannedWaypoints;
    final /* synthetic */ MutableState<Boolean> $snapInProgress$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1(GeoPoint geoPoint, GeoPoint geoPoint2, MutableState<List<GeoPoint>> mutableState, MutableState<Boolean> mutableState2, MutableState<List<GeoPoint>> mutableState3, Continuation<? super MapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1> continuation) {
        super(2, continuation);
        this.$a = geoPoint;
        this.$b = geoPoint2;
        this.$planned = mutableState;
        this.$snapInProgress$delegate = mutableState2;
        this.$plannedWaypoints = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1 mapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1 = new MapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1(this.$a, this.$b, this.$planned, this.$snapInProgress$delegate, this.$plannedWaypoints, continuation);
        mapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1.L$0 = obj;
        return mapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b A[Catch: all -> 0x0076, TryCatch #2 {all -> 0x0076, blocks: (B:98:0x006f, B:100:0x013e, B:102:0x0125, B:104:0x012b, B:108:0x0149, B:126:0x008a, B:128:0x00a0, B:131:0x00c8, B:132:0x010d, B:134:0x0117, B:137:0x0121), top: B:2:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0171 A[Catch: all -> 0x0375, TRY_LEAVE, TryCatch #1 {all -> 0x0375, blocks: (B:21:0x02f4, B:24:0x0300, B:26:0x0308, B:29:0x030c, B:31:0x031c, B:33:0x0336, B:38:0x0348, B:42:0x0342, B:146:0x02ea, B:51:0x0035, B:53:0x028b, B:56:0x0292, B:58:0x0297, B:93:0x024b, B:139:0x0242, B:109:0x015c, B:112:0x0169, B:114:0x0171, B:115:0x017a, B:144:0x0152, B:125:0x0086, B:68:0x0057, B:69:0x01e4, B:72:0x01eb, B:74:0x01ef, B:76:0x01f6, B:78:0x0200, B:82:0x0210, B:87:0x0216, B:91:0x0223, B:92:0x023c, B:116:0x017c, B:118:0x018c, B:98:0x006f, B:100:0x013e, B:102:0x0125, B:104:0x012b, B:108:0x0149, B:126:0x008a, B:128:0x00a0, B:131:0x00c8, B:132:0x010d, B:134:0x0117, B:137:0x0121, B:9:0x001e, B:11:0x02d7, B:13:0x02bd, B:15:0x02c3, B:20:0x02e1, B:61:0x029e, B:63:0x02af, B:66:0x02b9), top: B:2:0x000c, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017a A[Catch: all -> 0x0375, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0375, blocks: (B:21:0x02f4, B:24:0x0300, B:26:0x0308, B:29:0x030c, B:31:0x031c, B:33:0x0336, B:38:0x0348, B:42:0x0342, B:146:0x02ea, B:51:0x0035, B:53:0x028b, B:56:0x0292, B:58:0x0297, B:93:0x024b, B:139:0x0242, B:109:0x015c, B:112:0x0169, B:114:0x0171, B:115:0x017a, B:144:0x0152, B:125:0x0086, B:68:0x0057, B:69:0x01e4, B:72:0x01eb, B:74:0x01ef, B:76:0x01f6, B:78:0x0200, B:82:0x0210, B:87:0x0216, B:91:0x0223, B:92:0x023c, B:116:0x017c, B:118:0x018c, B:98:0x006f, B:100:0x013e, B:102:0x0125, B:104:0x012b, B:108:0x0149, B:126:0x008a, B:128:0x00a0, B:131:0x00c8, B:132:0x010d, B:134:0x0117, B:137:0x0121, B:9:0x001e, B:11:0x02d7, B:13:0x02bd, B:15:0x02c3, B:20:0x02e1, B:61:0x029e, B:63:0x02af, B:66:0x02b9), top: B:2:0x000c, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02c3 A[Catch: all -> 0x0026, TryCatch #3 {all -> 0x0026, blocks: (B:9:0x001e, B:11:0x02d7, B:13:0x02bd, B:15:0x02c3, B:20:0x02e1, B:61:0x029e, B:63:0x02af, B:66:0x02b9), top: B:2:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0308 A[Catch: all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:21:0x02f4, B:24:0x0300, B:26:0x0308, B:29:0x030c, B:31:0x031c, B:33:0x0336, B:38:0x0348, B:42:0x0342, B:146:0x02ea, B:51:0x0035, B:53:0x028b, B:56:0x0292, B:58:0x0297, B:93:0x024b, B:139:0x0242, B:109:0x015c, B:112:0x0169, B:114:0x0171, B:115:0x017a, B:144:0x0152, B:125:0x0086, B:68:0x0057, B:69:0x01e4, B:72:0x01eb, B:74:0x01ef, B:76:0x01f6, B:78:0x0200, B:82:0x0210, B:87:0x0216, B:91:0x0223, B:92:0x023c, B:116:0x017c, B:118:0x018c, B:98:0x006f, B:100:0x013e, B:102:0x0125, B:104:0x012b, B:108:0x0149, B:126:0x008a, B:128:0x00a0, B:131:0x00c8, B:132:0x010d, B:134:0x0117, B:137:0x0121, B:9:0x001e, B:11:0x02d7, B:13:0x02bd, B:15:0x02c3, B:20:0x02e1, B:61:0x029e, B:63:0x02af, B:66:0x02b9), top: B:2:0x000c, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x030c A[Catch: all -> 0x0375, TryCatch #1 {all -> 0x0375, blocks: (B:21:0x02f4, B:24:0x0300, B:26:0x0308, B:29:0x030c, B:31:0x031c, B:33:0x0336, B:38:0x0348, B:42:0x0342, B:146:0x02ea, B:51:0x0035, B:53:0x028b, B:56:0x0292, B:58:0x0297, B:93:0x024b, B:139:0x0242, B:109:0x015c, B:112:0x0169, B:114:0x0171, B:115:0x017a, B:144:0x0152, B:125:0x0086, B:68:0x0057, B:69:0x01e4, B:72:0x01eb, B:74:0x01ef, B:76:0x01f6, B:78:0x0200, B:82:0x0210, B:87:0x0216, B:91:0x0223, B:92:0x023c, B:116:0x017c, B:118:0x018c, B:98:0x006f, B:100:0x013e, B:102:0x0125, B:104:0x012b, B:108:0x0149, B:126:0x008a, B:128:0x00a0, B:131:0x00c8, B:132:0x010d, B:134:0x0117, B:137:0x0121, B:9:0x001e, B:11:0x02d7, B:13:0x02bd, B:15:0x02c3, B:20:0x02e1, B:61:0x029e, B:63:0x02af, B:66:0x02b9), top: B:2:0x000c, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0297 A[Catch: all -> 0x0375, TRY_LEAVE, TryCatch #1 {all -> 0x0375, blocks: (B:21:0x02f4, B:24:0x0300, B:26:0x0308, B:29:0x030c, B:31:0x031c, B:33:0x0336, B:38:0x0348, B:42:0x0342, B:146:0x02ea, B:51:0x0035, B:53:0x028b, B:56:0x0292, B:58:0x0297, B:93:0x024b, B:139:0x0242, B:109:0x015c, B:112:0x0169, B:114:0x0171, B:115:0x017a, B:144:0x0152, B:125:0x0086, B:68:0x0057, B:69:0x01e4, B:72:0x01eb, B:74:0x01ef, B:76:0x01f6, B:78:0x0200, B:82:0x0210, B:87:0x0216, B:91:0x0223, B:92:0x023c, B:116:0x017c, B:118:0x018c, B:98:0x006f, B:100:0x013e, B:102:0x0125, B:104:0x012b, B:108:0x0149, B:126:0x008a, B:128:0x00a0, B:131:0x00c8, B:132:0x010d, B:134:0x0117, B:137:0x0121, B:9:0x001e, B:11:0x02d7, B:13:0x02bd, B:15:0x02c3, B:20:0x02e1, B:61:0x029e, B:63:0x02af, B:66:0x02b9), top: B:2:0x000c, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0200 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:68:0x0057, B:69:0x01e4, B:72:0x01eb, B:74:0x01ef, B:76:0x01f6, B:78:0x0200, B:82:0x0210, B:87:0x0216, B:91:0x0223, B:92:0x023c, B:116:0x017c, B:118:0x018c), top: B:2:0x000c, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028a A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x02d4 -> B:11:0x02d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x013b -> B:93:0x013e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Object m7905constructorimpl2;
        CoroutineScope coroutineScope;
        MutableState<List<GeoPoint>> mutableState;
        List<GeoPoint> value;
        GeoPoint geoPoint;
        Object m6907footRouteGeometrygIAlus;
        GeoPoint geoPoint2;
        Unit unit;
        Object obj2;
        Object m6907footRouteGeometrygIAlus2;
        List list;
        int size;
        int i;
        int i2;
        double distanceM;
        List list2;
        List<GeoPoint> sampleAlong;
        Iterator it;
        Iterable iterable;
        int i3;
        double distanceM2;
        double distanceM3;
        List list3;
        List list4;
        CoroutineScope coroutineScope2;
        double distanceM4;
        Iterator it2;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        ?? r5 = 3;
        boolean z2 = true;
        try {
            try {
                try {
                    try {
                    } catch (Throwable th) {
                        Result.Companion companion = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th));
                    }
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th2));
                }
            } catch (Throwable th3) {
                Result.Companion companion3 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th3));
                iterable = r5;
            }
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope2 = (CoroutineScope) this.L$0;
                MapTabContentKt.MapTabContent$lambda$73(this.$snapInProgress$delegate, true);
                GeoPoint geoPoint3 = this.$a;
                GeoPoint geoPoint4 = this.$b;
                Result.Companion companion4 = Result.INSTANCE;
                distanceM4 = MapTabContentKt.distanceM(geoPoint3, geoPoint4);
                List createListBuilder = CollectionsKt.createListBuilder();
                createListBuilder.add(geoPoint3);
                createListBuilder.add(geoPoint4);
                if (distanceM4 > 80.0d) {
                    createListBuilder.add(new GeoPoint((geoPoint3.getLatitude() + geoPoint4.getLatitude()) / 2.0d, (geoPoint3.getLongitude() + geoPoint4.getLongitude()) / 2.0d));
                }
                if (distanceM4 > 200.0d) {
                    createListBuilder.add(new GeoPoint((geoPoint3.getLatitude() * 0.75d) + (geoPoint4.getLatitude() * 0.25d), (geoPoint3.getLongitude() * 0.75d) + (geoPoint4.getLongitude() * 0.25d)));
                    createListBuilder.add(new GeoPoint((geoPoint3.getLatitude() * 0.25d) + (geoPoint4.getLatitude() * 0.75d), (geoPoint3.getLongitude() * 0.25d) + (geoPoint4.getLongitude() * 0.75d)));
                }
                List build = CollectionsKt.build(createListBuilder);
                if ((build instanceof Collection) && build.isEmpty()) {
                    z = false;
                    m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxBoolean(z));
                    coroutineScope = coroutineScope2;
                    Boolean boxBoolean = Boxing.boxBoolean(false);
                    if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                    }
                    if (!((Boolean) m7905constructorimpl2).booleanValue()) {
                    }
                } else {
                    it2 = build.iterator();
                    if (it2.hasNext()) {
                    }
                    z = false;
                    m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxBoolean(z));
                    coroutineScope = coroutineScope2;
                    Boolean boxBoolean2 = Boxing.boxBoolean(false);
                    if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                    }
                    if (!((Boolean) m7905constructorimpl2).booleanValue()) {
                    }
                }
            } else if (i4 == 1) {
                it2 = (Iterator) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                Object isLikelyParkOrBeach = obj;
                if (((Boolean) isLikelyParkOrBeach).booleanValue()) {
                    z = true;
                    m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxBoolean(z));
                    coroutineScope = coroutineScope2;
                    Boolean boxBoolean22 = Boxing.boxBoolean(false);
                    if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                        m7905constructorimpl2 = boxBoolean22;
                    }
                    if (!((Boolean) m7905constructorimpl2).booleanValue()) {
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                    mutableState = this.$plannedWaypoints;
                    Result.Companion companion5 = Result.INSTANCE;
                    value = mutableState.getValue();
                    if (value.size() >= 3) {
                        GeoPoint geoPoint5 = value.get(CollectionsKt.getLastIndex(value) - 3);
                        geoPoint = value.get(CollectionsKt.getLastIndex(value) - 2);
                        GeoPoint geoPoint6 = value.get(CollectionsKt.getLastIndex(value) - 1);
                        List<GeoPoint> viaPointsOnChord = OsrmWalkingRouter.INSTANCE.viaPointsOnChord(geoPoint5, geoPoint6);
                        OsrmWalkingRouter osrmWalkingRouter = OsrmWalkingRouter.INSTANCE;
                        List<? extends GeoPoint> plus = CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(geoPoint5), (Iterable) viaPointsOnChord), (Iterable) CollectionsKt.listOf(geoPoint6));
                        this.L$0 = coroutineScope;
                        this.L$1 = mutableState;
                        this.L$2 = value;
                        this.L$3 = geoPoint;
                        this.L$4 = geoPoint6;
                        this.label = 2;
                        m6907footRouteGeometrygIAlus = osrmWalkingRouter.m6907footRouteGeometrygIAlus(plus, this);
                        if (m6907footRouteGeometrygIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        geoPoint2 = geoPoint6;
                        if (Result.m7911isFailureimpl(m6907footRouteGeometrygIAlus)) {
                        }
                        list = (List) m6907footRouteGeometrygIAlus;
                        if (list != null) {
                            size = list.size();
                            double d = Double.POSITIVE_INFINITY;
                            i2 = -1;
                            while (i < size) {
                            }
                            if (2 <= i2) {
                                mutableState.setValue(CollectionsKt.plus((Collection<? extends GeoPoint>) CollectionsKt.plus((Collection<? extends GeoPoint>) CollectionsKt.dropLast(value, 2), (GeoPoint) list.get(i2)), geoPoint2));
                            }
                        }
                    }
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    List<GeoPoint> viaPointsOnChord2 = OsrmWalkingRouter.INSTANCE.viaPointsOnChord(this.$a, this.$b);
                    this.L$0 = coroutineScope;
                    obj2 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    m6907footRouteGeometrygIAlus2 = OsrmWalkingRouter.INSTANCE.m6907footRouteGeometrygIAlus(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(this.$a), (Iterable) viaPointsOnChord2), (Iterable) CollectionsKt.listOf(this.$b)), this);
                    if (m6907footRouteGeometrygIAlus2 == coroutine_suspended) {
                    }
                    if (Result.m7911isFailureimpl(m6907footRouteGeometrygIAlus2)) {
                    }
                    list2 = (List) m6907footRouteGeometrygIAlus2;
                    if (list2 != null) {
                    }
                    MapTabContentKt.MapTabContent$lambda$73(this.$snapInProgress$delegate, false);
                    return Unit.INSTANCE;
                }
                if (it2.hasNext()) {
                    GeoPoint geoPoint7 = (GeoPoint) it2.next();
                    this.L$0 = coroutineScope2;
                    this.L$1 = it2;
                    this.label = 1;
                    isLikelyParkOrBeach = MapOsMapKitKt.isLikelyParkOrBeach(geoPoint7, this);
                    if (isLikelyParkOrBeach == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) isLikelyParkOrBeach).booleanValue()) {
                    }
                    if (it2.hasNext()) {
                    }
                }
                z = false;
                m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxBoolean(z));
                coroutineScope = coroutineScope2;
                Boolean boxBoolean222 = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                }
                if (!((Boolean) m7905constructorimpl2).booleanValue()) {
                }
            } else {
                if (i4 == 2) {
                    geoPoint2 = (GeoPoint) this.L$4;
                    geoPoint = (GeoPoint) this.L$3;
                    value = (List) this.L$2;
                    mutableState = (MutableState) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    m6907footRouteGeometrygIAlus = ((Result) obj).getValue();
                    if (Result.m7911isFailureimpl(m6907footRouteGeometrygIAlus)) {
                        m6907footRouteGeometrygIAlus = null;
                    }
                    list = (List) m6907footRouteGeometrygIAlus;
                    if (list != null && list.size() >= 2) {
                        size = list.size();
                        double d2 = Double.POSITIVE_INFINITY;
                        i2 = -1;
                        for (i = 0; i < size; i++) {
                            distanceM = MapTabContentKt.distanceM((GeoPoint) list.get(i), geoPoint);
                            if (distanceM < d2) {
                                i2 = i;
                                d2 = distanceM;
                            }
                        }
                        if (2 <= i2 && i2 < CollectionsKt.getLastIndex(list) - 2 && d2 <= 20.0d) {
                            mutableState.setValue(CollectionsKt.plus((Collection<? extends GeoPoint>) CollectionsKt.plus((Collection<? extends GeoPoint>) CollectionsKt.dropLast(value, 2), (GeoPoint) list.get(i2)), geoPoint2));
                        }
                    }
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    List<GeoPoint> viaPointsOnChord22 = OsrmWalkingRouter.INSTANCE.viaPointsOnChord(this.$a, this.$b);
                    this.L$0 = coroutineScope;
                    obj2 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    m6907footRouteGeometrygIAlus2 = OsrmWalkingRouter.INSTANCE.m6907footRouteGeometrygIAlus(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(this.$a), (Iterable) viaPointsOnChord22), (Iterable) CollectionsKt.listOf(this.$b)), this);
                    if (m6907footRouteGeometrygIAlus2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (Result.m7911isFailureimpl(m6907footRouteGeometrygIAlus2)) {
                    }
                    list2 = (List) m6907footRouteGeometrygIAlus2;
                    if (list2 != null) {
                        Result.Companion companion6 = Result.INSTANCE;
                        sampleAlong = MapOsMapKitKt.sampleAlong(list2, 45.0d);
                        if (!(sampleAlong instanceof Collection)) {
                        }
                        it = sampleAlong.iterator();
                        list4 = list2;
                        list3 = list4;
                        if (it.hasNext()) {
                        }
                        z2 = false;
                        r5 = list3;
                        m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(z2));
                        iterable = r5;
                        Boolean boxBoolean3 = Boxing.boxBoolean(false);
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        if (((Boolean) m7905constructorimpl).booleanValue()) {
                        }
                    }
                    MapTabContentKt.MapTabContent$lambda$73(this.$snapInProgress$delegate, false);
                    return Unit.INSTANCE;
                }
                if (i4 == 3) {
                    ResultKt.throwOnFailure(obj);
                    m6907footRouteGeometrygIAlus2 = ((Result) obj).getValue();
                    obj2 = null;
                    if (Result.m7911isFailureimpl(m6907footRouteGeometrygIAlus2)) {
                        m6907footRouteGeometrygIAlus2 = obj2;
                    }
                    list2 = (List) m6907footRouteGeometrygIAlus2;
                    if (list2 != null && list2.size() >= 2) {
                        Result.Companion companion62 = Result.INSTANCE;
                        sampleAlong = MapOsMapKitKt.sampleAlong(list2, 45.0d);
                        if (!(sampleAlong instanceof Collection) && sampleAlong.isEmpty()) {
                            list3 = list2;
                            z2 = false;
                            r5 = list3;
                            m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(z2));
                            iterable = r5;
                            Boolean boxBoolean32 = Boxing.boxBoolean(false);
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            }
                            if (((Boolean) m7905constructorimpl).booleanValue()) {
                            }
                        } else {
                            it = sampleAlong.iterator();
                            list4 = list2;
                            list3 = list4;
                            if (it.hasNext()) {
                            }
                            z2 = false;
                            r5 = list3;
                            m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(z2));
                            iterable = r5;
                            Boolean boxBoolean322 = Boxing.boxBoolean(false);
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            }
                            if (((Boolean) m7905constructorimpl).booleanValue()) {
                            }
                        }
                    }
                    MapTabContentKt.MapTabContent$lambda$73(this.$snapInProgress$delegate, false);
                    return Unit.INSTANCE;
                }
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                List list5 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                Object isLikelyParkOrBeach2 = obj;
                List list6 = list5;
                list4 = list6;
                if (((Boolean) isLikelyParkOrBeach2).booleanValue()) {
                    r5 = list6;
                    m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(z2));
                    iterable = r5;
                    Boolean boxBoolean3222 = Boxing.boxBoolean(false);
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        m7905constructorimpl = boxBoolean3222;
                    }
                    if (((Boolean) m7905constructorimpl).booleanValue()) {
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                    List<GeoPoint> value2 = this.$planned.getValue();
                    int size2 = value2.size() - 2;
                    while (true) {
                        if (size2 < 0) {
                            i3 = -1;
                            break;
                        }
                        GeoPoint geoPoint8 = value2.get(size2);
                        GeoPoint geoPoint9 = value2.get(size2 + 1);
                        distanceM2 = MapTabContentKt.distanceM(geoPoint8, this.$a);
                        if (distanceM2 <= 6.0d) {
                            distanceM3 = MapTabContentKt.distanceM(geoPoint9, this.$b);
                            if (distanceM3 <= 6.0d) {
                                i3 = size2;
                                break;
                            }
                        }
                        size2--;
                    }
                    if (i3 >= 0) {
                        this.$planned.setValue(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.take(value2, i3), iterable), (Iterable) CollectionsKt.drop(value2, i3 + 2)));
                    }
                    MapTabContentKt.MapTabContent$lambda$73(this.$snapInProgress$delegate, false);
                    return Unit.INSTANCE;
                }
                list3 = list4;
                if (it.hasNext()) {
                    GeoPoint geoPoint10 = (GeoPoint) it.next();
                    this.L$0 = list4;
                    this.L$1 = it;
                    this.label = 4;
                    isLikelyParkOrBeach2 = MapOsMapKitKt.isLikelyParkOrBeach(geoPoint10, this);
                    list6 = list4;
                    if (isLikelyParkOrBeach2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list4 = list6;
                    if (((Boolean) isLikelyParkOrBeach2).booleanValue()) {
                    }
                    list3 = list4;
                    if (it.hasNext()) {
                    }
                }
                z2 = false;
                r5 = list3;
                m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(z2));
                iterable = r5;
                Boolean boxBoolean32222 = Boxing.boxBoolean(false);
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                if (((Boolean) m7905constructorimpl).booleanValue()) {
                }
            }
        } finally {
            MapTabContentKt.MapTabContent$lambda$73(this.$snapInProgress$delegate, false);
        }
    }
}
