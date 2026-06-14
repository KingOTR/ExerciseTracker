package com.example.rungps.routing;

import android.location.Location;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.osmdroid.util.GeoPoint;

/* compiled from: OsrmWalkingRouter.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011J2\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\b\b\u0002\u0010\u001a\u001a\u00020\u0005J(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\rJ$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010 \u001a\u00020\nH\u0002J,\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0005H\u0002J\u0016\u0010$\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0002J*\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0&2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0086@¢\u0006\u0004\b'\u0010(J*\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0&2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0086@¢\u0006\u0004\b+\u0010(J4\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0&2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\b\b\u0002\u0010-\u001a\u00020.H\u0086@¢\u0006\u0004\b/\u00100J2\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0&2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010-\u001a\u00020.H\u0082@¢\u0006\u0004\b3\u00100J*\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0&2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0082@¢\u0006\u0004\b5\u0010(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u000f\u001a*\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u0010j\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/example/rungps/routing/OsrmWalkingRouter;", "", "<init>", "()V", "MAX_INPUT_COORDS", "", "MAX_STITCH_ANCHORS", "MAX_SNAP_BUTTON_ANCHORS", "MAX_VIA_PER_SEGMENT", "VIA_STEP_M", "", "VIA_MIN_SEGMENT_M", "bases", "", "", "cache", "Ljava/util/LinkedHashMap;", "Lorg/osmdroid/util/GeoPoint;", "Lkotlin/collections/LinkedHashMap;", "distM", "a", "b", "viaPointsOnChord", "anchorsForSnap", "waypoints", "polyline", "maxAnchors", "anchorsForSnapButton", "subsampleUniformByIndex", "points", "max", "dedupeShortLegs", "minLegM", "simplifyPoints", "minStepM", "maxPoints", "cacheKey", "footRouteGeometry", "Lkotlin/Result;", "footRouteGeometry-gIAlu-s", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapWalkingRoute", "anchors", "snapWalkingRoute-gIAlu-s", "footRouteStitched", "addViaOnLongLegs", "", "footRouteStitched-0E7RQCE", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stitchLegsParallel", "chain", "stitchLegsParallel-0E7RQCE", "requestFootGeometry", "requestFootGeometry-gIAlu-s", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OsrmWalkingRouter {
    private static final int MAX_INPUT_COORDS = 85;
    private static final int MAX_SNAP_BUTTON_ANCHORS = 28;
    private static final int MAX_STITCH_ANCHORS = 80;
    private static final int MAX_VIA_PER_SEGMENT = 28;
    private static final double VIA_MIN_SEGMENT_M = 80.0d;
    private static final double VIA_STEP_M = 28.0d;
    public static final OsrmWalkingRouter INSTANCE = new OsrmWalkingRouter();
    private static final List<String> bases = CollectionsKt.listOf((Object[]) new String[]{"https://router.project-osrm.org", "https://routing.openstreetmap.de/routed-foot"});
    private static final LinkedHashMap<String, List<GeoPoint>> cache = new LinkedHashMap<>(96, 0.75f, true);
    public static final int $stable = 8;

    private OsrmWalkingRouter() {
    }

    private final double distM(GeoPoint a, GeoPoint b) {
        Location location = new Location("a");
        location.setLatitude(a.getLatitude());
        location.setLongitude(a.getLongitude());
        Location location2 = new Location("b");
        location2.setLatitude(b.getLatitude());
        location2.setLongitude(b.getLongitude());
        return location.distanceTo(location2);
    }

    public final List<GeoPoint> viaPointsOnChord(GeoPoint a, GeoPoint b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        double distM = distM(a, b);
        if (distM < VIA_MIN_SEGMENT_M) {
            return CollectionsKt.emptyList();
        }
        int i = (int) (distM / VIA_STEP_M);
        int i2 = 1;
        int coerceIn = RangesKt.coerceIn(i - 1, 1, 28);
        List createListBuilder = CollectionsKt.createListBuilder(coerceIn);
        if (1 <= coerceIn) {
            while (true) {
                double d = i2 / (coerceIn + 1);
                createListBuilder.add(new GeoPoint(a.getLatitude() + ((b.getLatitude() - a.getLatitude()) * d), a.getLongitude() + ((b.getLongitude() - a.getLongitude()) * d)));
                if (i2 == coerceIn) {
                    break;
                }
                i2++;
            }
        }
        return CollectionsKt.build(createListBuilder);
    }

    public static /* synthetic */ List anchorsForSnap$default(OsrmWalkingRouter osrmWalkingRouter, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 80;
        }
        return osrmWalkingRouter.anchorsForSnap(list, list2, i);
    }

    public final List<GeoPoint> anchorsForSnap(List<? extends GeoPoint> waypoints, List<? extends GeoPoint> polyline, int maxAnchors) {
        Intrinsics.checkNotNullParameter(waypoints, "waypoints");
        Intrinsics.checkNotNullParameter(polyline, "polyline");
        if (waypoints.size() < 2) {
            if (polyline.size() < 2) {
                return CollectionsKt.emptyList();
            }
            waypoints = polyline;
        }
        return dedupeShortLegs(subsampleUniformByIndex(waypoints, maxAnchors), 3.0d);
    }

    public final List<GeoPoint> anchorsForSnapButton(List<? extends GeoPoint> waypoints, List<? extends GeoPoint> polyline) {
        Intrinsics.checkNotNullParameter(waypoints, "waypoints");
        Intrinsics.checkNotNullParameter(polyline, "polyline");
        if (waypoints.size() < 2) {
            if (polyline.size() < 2) {
                return CollectionsKt.emptyList();
            }
            waypoints = subsampleUniformByIndex(polyline, 28);
        }
        return dedupeShortLegs(subsampleUniformByIndex(waypoints, 28), 8.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<GeoPoint> subsampleUniformByIndex(List<? extends GeoPoint> points, int max) {
        if (points.size() <= max) {
            return points;
        }
        ArrayList arrayList = new ArrayList(max);
        int lastIndex = CollectionsKt.getLastIndex(points);
        for (int i = 0; i < max; i++) {
            arrayList.add(points.get((i * lastIndex) / (max - 1)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<GeoPoint> dedupeShortLegs(List<? extends GeoPoint> points, double minLegM) {
        if (points.size() < 2) {
            return points;
        }
        ArrayList arrayList = new ArrayList(points.size());
        arrayList.add(CollectionsKt.first((List) points));
        int size = points.size();
        for (int i = 1; i < size; i++) {
            GeoPoint geoPoint = (GeoPoint) points.get(i);
            if (distM((GeoPoint) CollectionsKt.last((List) arrayList), geoPoint) >= minLegM) {
                arrayList.add(geoPoint);
            }
        }
        GeoPoint geoPoint2 = (GeoPoint) CollectionsKt.last((List) points);
        ArrayList arrayList2 = arrayList;
        if ((((GeoPoint) CollectionsKt.last((List) arrayList2)).getLatitude() != geoPoint2.getLatitude() || ((GeoPoint) CollectionsKt.last((List) arrayList2)).getLongitude() != geoPoint2.getLongitude()) && distM((GeoPoint) CollectionsKt.last((List) arrayList2), geoPoint2) >= 1.0d) {
            arrayList.add(geoPoint2);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<GeoPoint> simplifyPoints(List<? extends GeoPoint> points, double minStepM, int maxPoints) {
        if (points.size() <= 2) {
            return points;
        }
        ArrayList arrayList = new ArrayList(RangesKt.coerceAtMost(points.size(), maxPoints));
        arrayList.add(CollectionsKt.first((List) points));
        GeoPoint geoPoint = (GeoPoint) CollectionsKt.first((List) points);
        int lastIndex = CollectionsKt.getLastIndex(points);
        for (int i = 1; i < lastIndex; i++) {
            GeoPoint geoPoint2 = (GeoPoint) points.get(i);
            if (distM(geoPoint, geoPoint2) >= minStepM) {
                arrayList.add(geoPoint2);
                if (arrayList.size() >= maxPoints - 1) {
                    break;
                }
                geoPoint = geoPoint2;
            }
        }
        arrayList.add(CollectionsKt.last((List) points));
        return arrayList;
    }

    private final String cacheKey(List<? extends GeoPoint> points) {
        StringBuilder sb = new StringBuilder(points.size() * 24);
        int i = 0;
        for (Object obj : points) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            GeoPoint geoPoint = (GeoPoint) obj;
            if (i > 0) {
                sb.append(';');
            }
            sb.append(geoPoint.getLongitude()).append(AbstractJsonLexerKt.COMMA).append(geoPoint.getLatitude());
            i = i2;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: footRouteGeometry-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6907footRouteGeometrygIAlus(List<? extends GeoPoint> list, Continuation<? super Result<? extends List<? extends GeoPoint>>> continuation) {
        OsrmWalkingRouter$footRouteGeometry$1 osrmWalkingRouter$footRouteGeometry$1;
        int i;
        if (continuation instanceof OsrmWalkingRouter$footRouteGeometry$1) {
            osrmWalkingRouter$footRouteGeometry$1 = (OsrmWalkingRouter$footRouteGeometry$1) continuation;
            if ((osrmWalkingRouter$footRouteGeometry$1.label & Integer.MIN_VALUE) != 0) {
                osrmWalkingRouter$footRouteGeometry$1.label -= Integer.MIN_VALUE;
                Object obj = osrmWalkingRouter$footRouteGeometry$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = osrmWalkingRouter$footRouteGeometry$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                if (list.size() < 2) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m7905constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Add at least 2 points")));
                }
                List<GeoPoint> subsampleUniformByIndex = subsampleUniformByIndex(dedupeShortLegs(list, 2.0d), MAX_INPUT_COORDS);
                osrmWalkingRouter$footRouteGeometry$1.label = 1;
                Object m6905requestFootGeometrygIAlus = m6905requestFootGeometrygIAlus(subsampleUniformByIndex, osrmWalkingRouter$footRouteGeometry$1);
                return m6905requestFootGeometrygIAlus == coroutine_suspended ? coroutine_suspended : m6905requestFootGeometrygIAlus;
            }
        }
        osrmWalkingRouter$footRouteGeometry$1 = new OsrmWalkingRouter$footRouteGeometry$1(this, continuation);
        Object obj2 = osrmWalkingRouter$footRouteGeometry$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = osrmWalkingRouter$footRouteGeometry$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: snapWalkingRoute-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6909snapWalkingRoutegIAlus(List<? extends GeoPoint> list, Continuation<? super Result<? extends List<? extends GeoPoint>>> continuation) {
        OsrmWalkingRouter$snapWalkingRoute$1 osrmWalkingRouter$snapWalkingRoute$1;
        Object coroutine_suspended;
        int i;
        List<GeoPoint> dedupeShortLegs;
        Object m6907footRouteGeometrygIAlus;
        if (continuation instanceof OsrmWalkingRouter$snapWalkingRoute$1) {
            osrmWalkingRouter$snapWalkingRoute$1 = (OsrmWalkingRouter$snapWalkingRoute$1) continuation;
            if ((osrmWalkingRouter$snapWalkingRoute$1.label & Integer.MIN_VALUE) != 0) {
                osrmWalkingRouter$snapWalkingRoute$1.label -= Integer.MIN_VALUE;
                Object obj = osrmWalkingRouter$snapWalkingRoute$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = osrmWalkingRouter$snapWalkingRoute$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (list.size() < 2) {
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m7905constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Add at least 2 points")));
                    }
                    dedupeShortLegs = dedupeShortLegs(subsampleUniformByIndex(list, 80), 3.0d);
                    if (dedupeShortLegs.size() < 2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Not enough distinct anchors")));
                    }
                    if (dedupeShortLegs.size() <= MAX_INPUT_COORDS) {
                        osrmWalkingRouter$snapWalkingRoute$1.L$0 = this;
                        osrmWalkingRouter$snapWalkingRoute$1.L$1 = dedupeShortLegs;
                        osrmWalkingRouter$snapWalkingRoute$1.label = 1;
                        m6907footRouteGeometrygIAlus = m6907footRouteGeometrygIAlus(dedupeShortLegs, osrmWalkingRouter$snapWalkingRoute$1);
                        if (m6907footRouteGeometrygIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    osrmWalkingRouter$snapWalkingRoute$1.L$0 = null;
                    osrmWalkingRouter$snapWalkingRoute$1.L$1 = null;
                    osrmWalkingRouter$snapWalkingRoute$1.label = 2;
                    Object m6908footRouteStitched0E7RQCE = this.m6908footRouteStitched0E7RQCE(dedupeShortLegs, false, osrmWalkingRouter$snapWalkingRoute$1);
                    return m6908footRouteStitched0E7RQCE == coroutine_suspended ? coroutine_suspended : m6908footRouteStitched0E7RQCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                List<GeoPoint> list2 = (List) osrmWalkingRouter$snapWalkingRoute$1.L$1;
                OsrmWalkingRouter osrmWalkingRouter = (OsrmWalkingRouter) osrmWalkingRouter$snapWalkingRoute$1.L$0;
                ResultKt.throwOnFailure(obj);
                m6907footRouteGeometrygIAlus = ((Result) obj).getValue();
                dedupeShortLegs = list2;
                this = osrmWalkingRouter;
                if (Result.m7912isSuccessimpl(m6907footRouteGeometrygIAlus)) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m7905constructorimpl((List) m6907footRouteGeometrygIAlus);
                }
                osrmWalkingRouter$snapWalkingRoute$1.L$0 = null;
                osrmWalkingRouter$snapWalkingRoute$1.L$1 = null;
                osrmWalkingRouter$snapWalkingRoute$1.label = 2;
                Object m6908footRouteStitched0E7RQCE2 = this.m6908footRouteStitched0E7RQCE(dedupeShortLegs, false, osrmWalkingRouter$snapWalkingRoute$1);
                if (m6908footRouteStitched0E7RQCE2 == coroutine_suspended) {
                }
            }
        }
        osrmWalkingRouter$snapWalkingRoute$1 = new OsrmWalkingRouter$snapWalkingRoute$1(this, continuation);
        Object obj2 = osrmWalkingRouter$snapWalkingRoute$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = osrmWalkingRouter$snapWalkingRoute$1.label;
        if (i != 0) {
        }
        if (Result.m7912isSuccessimpl(m6907footRouteGeometrygIAlus)) {
        }
        osrmWalkingRouter$snapWalkingRoute$1.L$0 = null;
        osrmWalkingRouter$snapWalkingRoute$1.L$1 = null;
        osrmWalkingRouter$snapWalkingRoute$1.label = 2;
        Object m6908footRouteStitched0E7RQCE22 = this.m6908footRouteStitched0E7RQCE(dedupeShortLegs, false, osrmWalkingRouter$snapWalkingRoute$1);
        if (m6908footRouteStitched0E7RQCE22 == coroutine_suspended) {
        }
    }

    /* renamed from: footRouteStitched-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m6904footRouteStitched0E7RQCE$default(OsrmWalkingRouter osrmWalkingRouter, List list, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return osrmWalkingRouter.m6908footRouteStitched0E7RQCE(list, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: footRouteStitched-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6908footRouteStitched0E7RQCE(List<? extends GeoPoint> list, boolean z, Continuation<? super Result<? extends List<? extends GeoPoint>>> continuation) {
        OsrmWalkingRouter$footRouteStitched$1 osrmWalkingRouter$footRouteStitched$1;
        int i;
        if (continuation instanceof OsrmWalkingRouter$footRouteStitched$1) {
            osrmWalkingRouter$footRouteStitched$1 = (OsrmWalkingRouter$footRouteStitched$1) continuation;
            if ((osrmWalkingRouter$footRouteStitched$1.label & Integer.MIN_VALUE) != 0) {
                osrmWalkingRouter$footRouteStitched$1.label -= Integer.MIN_VALUE;
                Object obj = osrmWalkingRouter$footRouteStitched$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = osrmWalkingRouter$footRouteStitched$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                if (list.size() < 2) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m7905constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Add at least 2 points")));
                }
                List<GeoPoint> dedupeShortLegs = dedupeShortLegs(subsampleUniformByIndex(list, 80), 3.0d);
                if (dedupeShortLegs.size() < 2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Not enough distinct anchors")));
                }
                osrmWalkingRouter$footRouteStitched$1.label = 1;
                Object m6906stitchLegsParallel0E7RQCE = m6906stitchLegsParallel0E7RQCE(dedupeShortLegs, z, osrmWalkingRouter$footRouteStitched$1);
                return m6906stitchLegsParallel0E7RQCE == coroutine_suspended ? coroutine_suspended : m6906stitchLegsParallel0E7RQCE;
            }
        }
        osrmWalkingRouter$footRouteStitched$1 = new OsrmWalkingRouter$footRouteStitched$1(this, continuation);
        Object obj2 = osrmWalkingRouter$footRouteStitched$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = osrmWalkingRouter$footRouteStitched$1.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: stitchLegsParallel-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6906stitchLegsParallel0E7RQCE(List<? extends GeoPoint> list, boolean z, Continuation<? super Result<? extends List<? extends GeoPoint>>> continuation) {
        OsrmWalkingRouter$stitchLegsParallel$1 osrmWalkingRouter$stitchLegsParallel$1;
        int i;
        if (continuation instanceof OsrmWalkingRouter$stitchLegsParallel$1) {
            osrmWalkingRouter$stitchLegsParallel$1 = (OsrmWalkingRouter$stitchLegsParallel$1) continuation;
            if ((osrmWalkingRouter$stitchLegsParallel$1.label & Integer.MIN_VALUE) != 0) {
                osrmWalkingRouter$stitchLegsParallel$1.label -= Integer.MIN_VALUE;
                Object obj = osrmWalkingRouter$stitchLegsParallel$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = osrmWalkingRouter$stitchLegsParallel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OsrmWalkingRouter$stitchLegsParallel$2 osrmWalkingRouter$stitchLegsParallel$2 = new OsrmWalkingRouter$stitchLegsParallel$2(list, z, null);
                    osrmWalkingRouter$stitchLegsParallel$1.label = 1;
                    obj = CoroutineScopeKt.coroutineScope(osrmWalkingRouter$stitchLegsParallel$2, osrmWalkingRouter$stitchLegsParallel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        osrmWalkingRouter$stitchLegsParallel$1 = new OsrmWalkingRouter$stitchLegsParallel$1(this, continuation);
        Object obj2 = osrmWalkingRouter$stitchLegsParallel$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = osrmWalkingRouter$stitchLegsParallel$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: requestFootGeometry-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6905requestFootGeometrygIAlus(List<? extends GeoPoint> list, Continuation<? super Result<? extends List<? extends GeoPoint>>> continuation) {
        OsrmWalkingRouter$requestFootGeometry$1 osrmWalkingRouter$requestFootGeometry$1;
        int i;
        if (continuation instanceof OsrmWalkingRouter$requestFootGeometry$1) {
            osrmWalkingRouter$requestFootGeometry$1 = (OsrmWalkingRouter$requestFootGeometry$1) continuation;
            if ((osrmWalkingRouter$requestFootGeometry$1.label & Integer.MIN_VALUE) != 0) {
                osrmWalkingRouter$requestFootGeometry$1.label -= Integer.MIN_VALUE;
                Object obj = osrmWalkingRouter$requestFootGeometry$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = osrmWalkingRouter$requestFootGeometry$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    OsrmWalkingRouter$requestFootGeometry$2 osrmWalkingRouter$requestFootGeometry$2 = new OsrmWalkingRouter$requestFootGeometry$2(list, null);
                    osrmWalkingRouter$requestFootGeometry$1.label = 1;
                    obj = BuildersKt.withContext(io2, osrmWalkingRouter$requestFootGeometry$2, osrmWalkingRouter$requestFootGeometry$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        osrmWalkingRouter$requestFootGeometry$1 = new OsrmWalkingRouter$requestFootGeometry$1(this, continuation);
        Object obj2 = osrmWalkingRouter$requestFootGeometry$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = osrmWalkingRouter$requestFootGeometry$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
