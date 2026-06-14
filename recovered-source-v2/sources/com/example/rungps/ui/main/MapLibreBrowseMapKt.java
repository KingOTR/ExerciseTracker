package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.health.platform.client.SdkConfig;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.camera.CameraUpdateFactory;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.OnMapReadyCallback;
import org.maplibre.android.maps.Style;
import org.maplibre.android.style.layers.LineLayer;
import org.maplibre.android.style.layers.PropertyFactory;
import org.maplibre.android.style.sources.GeoJsonSource;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.Point;

/* compiled from: MapLibreBrowseMap.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a*\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002"}, d2 = {"BROWSE_STYLE", "", "SRC_ROUTE", "LAYER_ROUTE", "MapLibreBrowseMap", "", "routeLatLon", "", "Lkotlin/Pair;", "", "centerLat", "centerLon", "modifier", "Landroidx/compose/ui/Modifier;", "onMapReady", "Lkotlin/Function1;", "Lorg/maplibre/android/maps/MapView;", "(Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "updateBrowseRoute", "style", "Lorg/maplibre/android/maps/Style;", "app_sideload", "mapView"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapLibreBrowseMapKt {
    private static final String BROWSE_STYLE = "https://demotiles.maplibre.org/style.json";
    private static final String LAYER_ROUTE = "browse-route-layer";
    private static final String SRC_ROUTE = "browse-route";

    /* compiled from: MapLibreBrowseMap.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapLibreBrowseMap$lambda$17(List list, Double d, Double d2, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        MapLibreBrowseMap(list, d, d2, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MapLibreBrowseMap(final List<Pair<Double, Double>> routeLatLon, final Double d, final Double d2, Modifier modifier, Function1<? super MapView, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super MapView, Unit> function12;
        Function1<? super MapView, Unit> function13;
        Object rememberedValue;
        boolean changedInstance;
        Object rememberedValue2;
        boolean changedInstance2;
        Object rememberedValue3;
        boolean changedInstance3;
        Object rememberedValue4;
        final Modifier modifier3;
        final Function1<? super MapView, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(routeLatLon, "routeLatLon");
        Composer startRestartGroup = composer.startRestartGroup(490790061);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(routeLatLon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(d) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(d2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    function13 = i4 != 0 ? null : function12;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(490790061, i3, -1, "com.example.rungps.ui.main.MapLibreBrowseMap (MapLibreBrowseMap.kt:43)");
                    }
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localLifecycleOwner);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Lifecycle lifecycle = ((LifecycleOwner) consume2).getLifecycle();
                    startRestartGroup.startReplaceGroup(364678952);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final MutableState mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(364681989);
                    changedInstance = startRestartGroup.changedInstance(lifecycle);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                DisposableEffectResult MapLibreBrowseMap$lambda$6$lambda$5;
                                MapLibreBrowseMap$lambda$6$lambda$5 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$6$lambda$5(Lifecycle.this, mutableState, (DisposableEffectScope) obj);
                                return MapLibreBrowseMap$lambda$6$lambda$5;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(364704906);
                    changedInstance2 = startRestartGroup.changedInstance(routeLatLon) | ((i3 & SdkConfig.SDK_VERSION) == 32) | ((i3 & 896) == 256) | ((i3 & 57344) == 16384);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final Function1<? super MapView, Unit> function15 = function13;
                        Object obj = new Function1() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                MapView MapLibreBrowseMap$lambda$11$lambda$10;
                                MapLibreBrowseMap$lambda$11$lambda$10 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$11$lambda$10(Function1.this, routeLatLon, d, d2, mutableState, (Context) obj2);
                                return MapLibreBrowseMap$lambda$11$lambda$10;
                            }
                        };
                        startRestartGroup.updateRememberedValue(obj);
                        rememberedValue3 = obj;
                    }
                    Function1 function16 = (Function1) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(364745146);
                    changedInstance3 = startRestartGroup.changedInstance(routeLatLon);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit MapLibreBrowseMap$lambda$16$lambda$15;
                                MapLibreBrowseMap$lambda$16$lambda$15 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$16$lambda$15(routeLatLon, (MapView) obj2);
                                return MapLibreBrowseMap$lambda$16$lambda$15;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    AndroidView_androidKt.AndroidView(function16, fillMaxSize$default, (Function1) rememberedValue4, startRestartGroup, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function14 = function13;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function14 = function12;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit MapLibreBrowseMap$lambda$17;
                            MapLibreBrowseMap$lambda$17 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$17(routeLatLon, d, d2, modifier3, function14, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            return MapLibreBrowseMap$lambda$17;
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i3 & 9363) == 9362) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner2 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localLifecycleOwner2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Lifecycle lifecycle2 = ((LifecycleOwner) consume22).getLifecycle();
            startRestartGroup.startReplaceGroup(364678952);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState2 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(364681989);
            changedInstance = startRestartGroup.changedInstance(lifecycle2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    DisposableEffectResult MapLibreBrowseMap$lambda$6$lambda$5;
                    MapLibreBrowseMap$lambda$6$lambda$5 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$6$lambda$5(Lifecycle.this, mutableState2, (DisposableEffectScope) obj2);
                    return MapLibreBrowseMap$lambda$6$lambda$5;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(364704906);
            changedInstance2 = startRestartGroup.changedInstance(routeLatLon) | ((i3 & SdkConfig.SDK_VERSION) == 32) | ((i3 & 896) == 256) | ((i3 & 57344) == 16384);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            final Function1 function152 = function13;
            Object obj2 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj22) {
                    MapView MapLibreBrowseMap$lambda$11$lambda$10;
                    MapLibreBrowseMap$lambda$11$lambda$10 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$11$lambda$10(Function1.this, routeLatLon, d, d2, mutableState2, (Context) obj22);
                    return MapLibreBrowseMap$lambda$11$lambda$10;
                }
            };
            startRestartGroup.updateRememberedValue(obj2);
            rememberedValue3 = obj2;
            Function1 function162 = (Function1) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(364745146);
            changedInstance3 = startRestartGroup.changedInstance(routeLatLon);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj22) {
                    Unit MapLibreBrowseMap$lambda$16$lambda$15;
                    MapLibreBrowseMap$lambda$16$lambda$15 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$16$lambda$15(routeLatLon, (MapView) obj22);
                    return MapLibreBrowseMap$lambda$16$lambda$15;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier4;
            AndroidView_androidKt.AndroidView(function162, fillMaxSize$default2, (Function1) rememberedValue4, startRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            function14 = function13;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function12 = function1;
        if ((i3 & 9363) == 9362) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localContext22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner22 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localLifecycleOwner22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Lifecycle lifecycle22 = ((LifecycleOwner) consume222).getLifecycle();
        startRestartGroup.startReplaceGroup(364678952);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState22 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(364681989);
        changedInstance = startRestartGroup.changedInstance(lifecycle22);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                DisposableEffectResult MapLibreBrowseMap$lambda$6$lambda$5;
                MapLibreBrowseMap$lambda$6$lambda$5 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$6$lambda$5(Lifecycle.this, mutableState22, (DisposableEffectScope) obj22);
                return MapLibreBrowseMap$lambda$6$lambda$5;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(lifecycle22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(364704906);
        changedInstance2 = startRestartGroup.changedInstance(routeLatLon) | ((i3 & SdkConfig.SDK_VERSION) == 32) | ((i3 & 896) == 256) | ((i3 & 57344) == 16384);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        final Function1 function1522 = function13;
        Object obj22 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj222) {
                MapView MapLibreBrowseMap$lambda$11$lambda$10;
                MapLibreBrowseMap$lambda$11$lambda$10 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$11$lambda$10(Function1.this, routeLatLon, d, d2, mutableState22, (Context) obj222);
                return MapLibreBrowseMap$lambda$11$lambda$10;
            }
        };
        startRestartGroup.updateRememberedValue(obj22);
        rememberedValue3 = obj22;
        Function1 function1622 = (Function1) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(364745146);
        changedInstance3 = startRestartGroup.changedInstance(routeLatLon);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj222) {
                Unit MapLibreBrowseMap$lambda$16$lambda$15;
                MapLibreBrowseMap$lambda$16$lambda$15 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$16$lambda$15(routeLatLon, (MapView) obj222);
                return MapLibreBrowseMap$lambda$16$lambda$15;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        Modifier modifier522 = modifier4;
        AndroidView_androidKt.AndroidView(function1622, fillMaxSize$default22, (Function1) rememberedValue4, startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier522;
        function14 = function13;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapView MapLibreBrowseMap$lambda$1(MutableState<MapView> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MapLibreBrowseMap$lambda$6$lambda$5(final Lifecycle lifecycle, final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$6$lambda$5$lambda$3(MutableState.this, lifecycleOwner, event);
            }
        };
        lifecycle.addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$MapLibreBrowseMap$lambda$6$lambda$5$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MapView MapLibreBrowseMap$lambda$1;
                Lifecycle.this.removeObserver(lifecycleEventObserver);
                MapLibreBrowseMap$lambda$1 = MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$1(mutableState);
                if (MapLibreBrowseMap$lambda$1 != null) {
                    MapLibreBrowseMap$lambda$1.onDestroy();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapLibreBrowseMap$lambda$6$lambda$5$lambda$3(MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        MapView MapLibreBrowseMap$lambda$1;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            MapView MapLibreBrowseMap$lambda$12 = MapLibreBrowseMap$lambda$1(mutableState);
            if (MapLibreBrowseMap$lambda$12 != null) {
                MapLibreBrowseMap$lambda$12.onStart();
                return;
            }
            return;
        }
        if (i == 2) {
            MapView MapLibreBrowseMap$lambda$13 = MapLibreBrowseMap$lambda$1(mutableState);
            if (MapLibreBrowseMap$lambda$13 != null) {
                MapLibreBrowseMap$lambda$13.onResume();
                return;
            }
            return;
        }
        if (i == 3) {
            MapView MapLibreBrowseMap$lambda$14 = MapLibreBrowseMap$lambda$1(mutableState);
            if (MapLibreBrowseMap$lambda$14 != null) {
                MapLibreBrowseMap$lambda$14.onPause();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 5 && (MapLibreBrowseMap$lambda$1 = MapLibreBrowseMap$lambda$1(mutableState)) != null) {
                MapLibreBrowseMap$lambda$1.onDestroy();
                return;
            }
            return;
        }
        MapView MapLibreBrowseMap$lambda$15 = MapLibreBrowseMap$lambda$1(mutableState);
        if (MapLibreBrowseMap$lambda$15 != null) {
            MapLibreBrowseMap$lambda$15.onStop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapView MapLibreBrowseMap$lambda$11$lambda$10(Function1 function1, final List list, final Double d, final Double d2, MutableState mutableState, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        MapView mapView = new MapView(ctx);
        mapView.onCreate(null);
        mapView.getMapAsync(new OnMapReadyCallback() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda0
            @Override // org.maplibre.android.maps.OnMapReadyCallback
            public final void onMapReady(MapLibreMap mapLibreMap) {
                MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$11$lambda$10$lambda$9$lambda$8(list, d, d2, mapLibreMap);
            }
        });
        mutableState.setValue(mapView);
        if (function1 != null) {
            function1.invoke(mapView);
        }
        return mapView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapLibreBrowseMap$lambda$11$lambda$10$lambda$9$lambda$8(final List list, final Double d, final Double d2, final MapLibreMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        map.setStyle(new Style.Builder().fromUri(BROWSE_STYLE), new Style.OnStyleLoaded() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda8
            @Override // org.maplibre.android.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7(list, d, d2, map, style);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MapLibreBrowseMap$lambda$11$lambda$10$lambda$9$lambda$8$lambda$7(List list, Double d, Double d2, MapLibreMap mapLibreMap, Style style) {
        double d3;
        double doubleValue;
        Intrinsics.checkNotNullParameter(style, "style");
        style.addSource(new GeoJsonSource(SRC_ROUTE));
        style.addLayer(new LineLayer(LAYER_ROUTE, SRC_ROUTE).withProperties(PropertyFactory.lineColor("#2563EB"), PropertyFactory.lineWidth(Float.valueOf(5.0f)), PropertyFactory.lineCap("round")));
        updateBrowseRoute(style, list);
        if (d == null) {
            Pair pair = (Pair) CollectionsKt.firstOrNull(list);
            d = pair != null ? (Double) pair.getFirst() : null;
            if (d == null) {
                d3 = 51.5d;
                if (d2 == null) {
                    doubleValue = d2.doubleValue();
                } else {
                    Pair pair2 = (Pair) CollectionsKt.firstOrNull(list);
                    Double d4 = pair2 != null ? (Double) pair2.getSecond() : null;
                    doubleValue = d4 != null ? d4.doubleValue() : -0.12d;
                }
                mapLibreMap.setCameraPosition(new CameraPosition.Builder().target(new LatLng(d3, doubleValue)).zoom(list.size() <= 1 ? 14.0d : 12.0d).build());
            }
        }
        d3 = d.doubleValue();
        if (d2 == null) {
        }
        mapLibreMap.setCameraPosition(new CameraPosition.Builder().target(new LatLng(d3, doubleValue)).zoom(list.size() <= 1 ? 14.0d : 12.0d).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapLibreBrowseMap$lambda$16$lambda$15(final List list, MapView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.getMapAsync(new OnMapReadyCallback() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda6
            @Override // org.maplibre.android.maps.OnMapReadyCallback
            public final void onMapReady(MapLibreMap mapLibreMap) {
                MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$16$lambda$15$lambda$14(list, mapLibreMap);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapLibreBrowseMap$lambda$16$lambda$15$lambda$14(final List list, final MapLibreMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        map.getStyle(new Style.OnStyleLoaded() { // from class: com.example.rungps.ui.main.MapLibreBrowseMapKt$$ExternalSyntheticLambda7
            @Override // org.maplibre.android.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                MapLibreBrowseMapKt.MapLibreBrowseMap$lambda$16$lambda$15$lambda$14$lambda$13(list, map, style);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapLibreBrowseMap$lambda$16$lambda$15$lambda$14$lambda$13(List list, MapLibreMap mapLibreMap, Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        updateBrowseRoute(style, list);
        if (list.size() > 1) {
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                builder.include(new LatLng(((Number) pair.component1()).doubleValue(), ((Number) pair.component2()).doubleValue()));
            }
            mapLibreMap.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 48));
        }
    }

    private static final void updateBrowseRoute(Style style, List<Pair<Double, Double>> list) {
        GeoJsonSource geoJsonSource = (GeoJsonSource) style.getSourceAs(SRC_ROUTE);
        if (geoJsonSource == null) {
            return;
        }
        if (list.size() < 2) {
            geoJsonSource.setGeoJson(FeatureCollection.fromFeatures(new Feature[0]));
            return;
        }
        List<Pair<Double, Double>> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(Point.fromLngLat(((Number) pair.component2()).doubleValue(), ((Number) pair.component1()).doubleValue()));
        }
        geoJsonSource.setGeoJson(Feature.fromGeometry(LineString.fromLngLats(arrayList)));
    }
}
