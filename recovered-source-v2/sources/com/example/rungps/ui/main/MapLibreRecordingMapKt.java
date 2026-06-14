package com.example.rungps.ui.main;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.health.platform.client.SdkConfig;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.example.rungps.data.Repository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.camera.CameraUpdateFactory;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.location.LocationComponentActivationOptions;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.OnMapReadyCallback;
import org.maplibre.android.maps.Style;
import org.maplibre.android.maps.UiSettings;
import org.maplibre.android.style.layers.LineLayer;
import org.maplibre.android.style.layers.Property;
import org.maplibre.android.style.layers.PropertyFactory;
import org.maplibre.android.style.sources.GeoJsonSource;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.Point;

/* compiled from: MapLibreRecordingMap.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a3\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a.\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0002\u001a%\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0002\u0010 \u001a \u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006#²\u0006\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u008a\u008e\u0002²\u0006\u0010\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u008a\u008e\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\f\u0010'\u001a\u0004\u0018\u00010(X\u008a\u008e\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010*X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u008e\u0002"}, d2 = {"MAP_STYLE", "", "SRC_PLANNED", "SRC_TRAVELLED", "LAYER_PLANNED", "LAYER_TRAVELLED", "MapLibreRecordingMap", "", "routeId", "", "liveLat", "", "liveLon", "modifier", "Landroidx/compose/ui/Modifier;", "(JLjava/lang/Double;Ljava/lang/Double;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ensureRouteLayers", "style", "Lorg/maplibre/android/maps/Style;", "updateLineSource", "sourceId", "points", "", "Lorg/maplibre/android/geometry/LatLng;", "minPoints", "", "distanceM", "a", "b", "offRouteDistanceM", "current", Property.SYMBOL_PLACEMENT_LINE, "(Lorg/maplibre/android/geometry/LatLng;Ljava/util/List;)Ljava/lang/Double;", "pointToSegmentM", "p", "app_sideload", "routePts", "trail", "offRouteM", "mapViewRef", "Lorg/maplibre/android/maps/MapView;", "mapRef", "Lorg/maplibre/android/maps/MapLibreMap;", "styleReady", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapLibreRecordingMapKt {
    private static final String LAYER_PLANNED = "planned-route-layer";
    private static final String LAYER_TRAVELLED = "travelled-route-layer";
    private static final String MAP_STYLE = "https://demotiles.maplibre.org/style.json";
    private static final String SRC_PLANNED = "planned-route";
    private static final String SRC_TRAVELLED = "travelled-route";

    /* compiled from: MapLibreRecordingMap.kt */
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
    public static final Unit MapLibreRecordingMap$lambda$35(long j, Double d, Double d2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MapLibreRecordingMap(j, d, d2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MapLibreRecordingMap(final long j, final Double d, final Double d2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LifecycleOwner lifecycleOwner;
        boolean changed;
        Object rememberedValue;
        Modifier modifier3;
        boolean z;
        Object rememberedValue2;
        MutableState mutableState;
        Object rememberedValue3;
        MutableState mutableState2;
        Object rememberedValue4;
        Object rememberedValue5;
        MutableState mutableState3;
        Object rememberedValue6;
        MutableState mutableState4;
        Object rememberedValue7;
        MutableState mutableState5;
        Long valueOf;
        boolean changedInstance;
        Long l;
        MapLibreRecordingMapKt$MapLibreRecordingMap$1$1 mapLibreRecordingMapKt$MapLibreRecordingMap$1$1;
        boolean changed2;
        MapLibreRecordingMapKt$MapLibreRecordingMap$2$1 rememberedValue8;
        MutableState mutableState6;
        MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        final LifecycleOwner lifecycleOwner2;
        Modifier modifier4;
        MutableState mutableState10;
        boolean changed3;
        Object rememberedValue9;
        MutableState mutableState11;
        final MutableState mutableState12;
        Continuation continuation;
        MapLibreRecordingMapKt$MapLibreRecordingMap$4$1 rememberedValue10;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean changed4;
        Object rememberedValue11;
        final MutableState mutableState13;
        final MutableState mutableState14;
        Double MapLibreRecordingMap$lambda$8;
        Composer composer2;
        final MutableState mutableState15;
        boolean changedInstance2;
        Object rememberedValue12;
        final Modifier modifier5;
        long secondaryContainer;
        long onSecondaryContainer;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1640173410);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(j) ? 4 : 2) | i;
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
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier6 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1640173410, i3, -1, "com.example.rungps.ui.main.MapLibreRecordingMap (MapLibreRecordingMap.kt:65)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localLifecycleOwner);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                lifecycleOwner = (LifecycleOwner) consume2;
                startRestartGroup.startReplaceGroup(-1878978523);
                changed = startRestartGroup.changed(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = Repository.INSTANCE.get(context);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                Repository repository = (Repository) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1878976641);
                int i5 = i3 & 14;
                modifier3 = modifier6;
                z = i5 != 4;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1878974067);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                mutableState2 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1878971926);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState16 = (MutableState) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1878969845);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                mutableState3 = (MutableState) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1878967857);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                mutableState4 = (MutableState) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1878965630);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                mutableState5 = (MutableState) rememberedValue7;
                startRestartGroup.endReplaceGroup();
                valueOf = Long.valueOf(j);
                startRestartGroup.startReplaceGroup(-1878963479);
                changedInstance = (i5 != 4) | startRestartGroup.changedInstance(repository) | startRestartGroup.changed(mutableState);
                Object rememberedValue13 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    l = valueOf;
                    mapLibreRecordingMapKt$MapLibreRecordingMap$1$1 = new MapLibreRecordingMapKt$MapLibreRecordingMap$1$1(repository, j, mutableState, null);
                    startRestartGroup.updateRememberedValue(mapLibreRecordingMapKt$MapLibreRecordingMap$1$1);
                } else {
                    mapLibreRecordingMapKt$MapLibreRecordingMap$1$1 = rememberedValue13;
                    l = valueOf;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(l, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) mapLibreRecordingMapKt$MapLibreRecordingMap$1$1, startRestartGroup, i5);
                Object[] objArr = {d, d2, MapLibreRecordingMap$lambda$2(mutableState), Boolean.valueOf(MapLibreRecordingMap$lambda$17(mutableState5)), MapLibreRecordingMap$lambda$14(mutableState4)};
                startRestartGroup.startReplaceGroup(-1878956259);
                changed2 = ((i3 & SdkConfig.SDK_VERSION) != 32) | ((i3 & 896) != 256) | startRestartGroup.changed(mutableState);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    mutableState6 = mutableState5;
                    mutableState7 = mutableState4;
                    mutableState8 = mutableState2;
                    mutableState9 = mutableState3;
                    lifecycleOwner2 = lifecycleOwner;
                    modifier4 = modifier3;
                    mutableState10 = mutableState;
                    rememberedValue8 = new MapLibreRecordingMapKt$MapLibreRecordingMap$2$1(d, d2, mutableState16, mutableState, mutableState8, mutableState7, mutableState6, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                } else {
                    modifier4 = modifier3;
                    mutableState7 = mutableState4;
                    mutableState6 = mutableState5;
                    lifecycleOwner2 = lifecycleOwner;
                    mutableState10 = mutableState;
                    mutableState9 = mutableState3;
                    mutableState8 = mutableState2;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, startRestartGroup, 0);
                List<LatLng> MapLibreRecordingMap$lambda$2 = MapLibreRecordingMap$lambda$2(mutableState10);
                Boolean valueOf2 = Boolean.valueOf(MapLibreRecordingMap$lambda$17(mutableState6));
                MapLibreMap MapLibreRecordingMap$lambda$14 = MapLibreRecordingMap$lambda$14(mutableState7);
                startRestartGroup.startReplaceGroup(-1878930512);
                final MutableState mutableState17 = mutableState10;
                changed3 = startRestartGroup.changed(mutableState17);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    mutableState11 = mutableState8;
                    mutableState12 = mutableState7;
                    continuation = null;
                    rememberedValue9 = (Function2) new MapLibreRecordingMapKt$MapLibreRecordingMap$3$1(mutableState12, mutableState17, mutableState11, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                } else {
                    mutableState11 = mutableState8;
                    mutableState12 = mutableState7;
                    continuation = null;
                }
                startRestartGroup.endReplaceGroup();
                Continuation continuation2 = continuation;
                EffectsKt.LaunchedEffect(MapLibreRecordingMap$lambda$2, valueOf2, MapLibreRecordingMap$lambda$14, (Function2) rememberedValue9, startRestartGroup, 0);
                List<LatLng> MapLibreRecordingMap$lambda$5 = MapLibreRecordingMap$lambda$5(mutableState11);
                Boolean valueOf3 = Boolean.valueOf(MapLibreRecordingMap$lambda$17(mutableState6));
                MapLibreMap MapLibreRecordingMap$lambda$142 = MapLibreRecordingMap$lambda$14(mutableState12);
                startRestartGroup.startReplaceGroup(-1878916395);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new MapLibreRecordingMapKt$MapLibreRecordingMap$4$1(mutableState12, mutableState11, continuation2);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(MapLibreRecordingMap$lambda$5, valueOf3, MapLibreRecordingMap$lambda$142, (Function2) rememberedValue10, startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, continuation2);
                startRestartGroup.startReplaceGroup(-830852438);
                changed4 = startRestartGroup.changed(mutableState17);
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (!changed4 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    mutableState13 = mutableState6;
                    mutableState14 = mutableState9;
                    rememberedValue11 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreRecordingMapKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            MapView MapLibreRecordingMap$lambda$30$lambda$29$lambda$28;
                            MapLibreRecordingMap$lambda$30$lambda$29$lambda$28 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$30$lambda$29$lambda$28(MutableState.this, mutableState12, mutableState13, mutableState17, (Context) obj);
                            return MapLibreRecordingMap$lambda$30$lambda$29$lambda$28;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                } else {
                    mutableState13 = mutableState6;
                    mutableState14 = mutableState9;
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState18 = mutableState13;
                AndroidView_androidKt.AndroidView((Function1) rememberedValue11, fillMaxSize$default, null, startRestartGroup, 48, 4);
                MapLibreRecordingMap$lambda$8 = MapLibreRecordingMap$lambda$8(mutableState16);
                startRestartGroup.startReplaceGroup(-830782278);
                if (MapLibreRecordingMap$lambda$8 != null || MapLibreRecordingMap$lambda$8.doubleValue() <= 15.0d) {
                    composer2 = startRestartGroup;
                    mutableState15 = mutableState12;
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.US, "%.0f m off", Arrays.copyOf(new Object[]{MapLibreRecordingMap$lambda$8}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    Modifier clip = ClipKt.clip(PaddingKt.m684padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m6303constructorimpl(12)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(8)));
                    if (MapLibreRecordingMap$lambda$8.doubleValue() > 25.0d) {
                        startRestartGroup.startReplaceGroup(-830770899);
                        secondaryContainer = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getErrorContainer();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-830768655);
                        secondaryContainer = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSecondaryContainer();
                        startRestartGroup.endReplaceGroup();
                    }
                    Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(BackgroundKt.m239backgroundbw27NRU$default(clip, secondaryContainer, null, 2, null), Dp.m6303constructorimpl(10), Dp.m6303constructorimpl(6));
                    TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelLarge();
                    if (MapLibreRecordingMap$lambda$8.doubleValue() > 25.0d) {
                        startRestartGroup.startReplaceGroup(-830761105);
                        onSecondaryContainer = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnErrorContainer();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-830759053);
                        onSecondaryContainer = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSecondaryContainer();
                        startRestartGroup.endReplaceGroup();
                    }
                    composer2 = startRestartGroup;
                    mutableState15 = mutableState12;
                    TextKt.m2376Text4IGK_g(format, m685paddingVpY3zN4, onSecondaryContainer, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelLarge, composer2, 0, 0, 65528);
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.startReplaceGroup(-1878807665);
                changedInstance2 = composer2.changedInstance(lifecycleOwner2);
                rememberedValue12 = composer2.rememberedValue();
                if (!changedInstance2 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreRecordingMapKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DisposableEffectResult MapLibreRecordingMap$lambda$34$lambda$33;
                            MapLibreRecordingMap$lambda$34$lambda$33 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$34$lambda$33(LifecycleOwner.this, mutableState14, mutableState15, mutableState18, (DisposableEffectScope) obj);
                            return MapLibreRecordingMap$lambda$34$lambda$33;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue12);
                }
                composer2.endReplaceGroup();
                EffectsKt.DisposableEffect(lifecycleOwner2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue12, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.MapLibreRecordingMapKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MapLibreRecordingMap$lambda$35;
                        MapLibreRecordingMap$lambda$35 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$35(j, d, d2, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return MapLibreRecordingMap$lambda$35;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2 = (Context) consume3;
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner2 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localLifecycleOwner2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        lifecycleOwner = (LifecycleOwner) consume22;
        startRestartGroup.startReplaceGroup(-1878978523);
        changed = startRestartGroup.changed(context2);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = Repository.INSTANCE.get(context2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        Repository repository2 = (Repository) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1878976641);
        int i52 = i3 & 14;
        modifier3 = modifier6;
        if (i52 != 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1878974067);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1878971926);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState162 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1878969845);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState3 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1878967857);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState4 = (MutableState) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1878965630);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState5 = (MutableState) rememberedValue7;
        startRestartGroup.endReplaceGroup();
        valueOf = Long.valueOf(j);
        startRestartGroup.startReplaceGroup(-1878963479);
        changedInstance = (i52 != 4) | startRestartGroup.changedInstance(repository2) | startRestartGroup.changed(mutableState);
        Object rememberedValue132 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        l = valueOf;
        mapLibreRecordingMapKt$MapLibreRecordingMap$1$1 = new MapLibreRecordingMapKt$MapLibreRecordingMap$1$1(repository2, j, mutableState, null);
        startRestartGroup.updateRememberedValue(mapLibreRecordingMapKt$MapLibreRecordingMap$1$1);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(l, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) mapLibreRecordingMapKt$MapLibreRecordingMap$1$1, startRestartGroup, i52);
        Object[] objArr2 = {d, d2, MapLibreRecordingMap$lambda$2(mutableState), Boolean.valueOf(MapLibreRecordingMap$lambda$17(mutableState5)), MapLibreRecordingMap$lambda$14(mutableState4)};
        startRestartGroup.startReplaceGroup(-1878956259);
        changed2 = ((i3 & SdkConfig.SDK_VERSION) != 32) | ((i3 & 896) != 256) | startRestartGroup.changed(mutableState);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        mutableState6 = mutableState5;
        mutableState7 = mutableState4;
        mutableState8 = mutableState2;
        mutableState9 = mutableState3;
        lifecycleOwner2 = lifecycleOwner;
        modifier4 = modifier3;
        mutableState10 = mutableState;
        rememberedValue8 = new MapLibreRecordingMapKt$MapLibreRecordingMap$2$1(d, d2, mutableState162, mutableState, mutableState8, mutableState7, mutableState6, null);
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, startRestartGroup, 0);
        List<LatLng> MapLibreRecordingMap$lambda$22 = MapLibreRecordingMap$lambda$2(mutableState10);
        Boolean valueOf22 = Boolean.valueOf(MapLibreRecordingMap$lambda$17(mutableState6));
        MapLibreMap MapLibreRecordingMap$lambda$143 = MapLibreRecordingMap$lambda$14(mutableState7);
        startRestartGroup.startReplaceGroup(-1878930512);
        final MutableState mutableState172 = mutableState10;
        changed3 = startRestartGroup.changed(mutableState172);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (changed3) {
        }
        mutableState11 = mutableState8;
        mutableState12 = mutableState7;
        continuation = null;
        rememberedValue9 = (Function2) new MapLibreRecordingMapKt$MapLibreRecordingMap$3$1(mutableState12, mutableState172, mutableState11, null);
        startRestartGroup.updateRememberedValue(rememberedValue9);
        startRestartGroup.endReplaceGroup();
        Continuation continuation22 = continuation;
        EffectsKt.LaunchedEffect(MapLibreRecordingMap$lambda$22, valueOf22, MapLibreRecordingMap$lambda$143, (Function2) rememberedValue9, startRestartGroup, 0);
        List<LatLng> MapLibreRecordingMap$lambda$52 = MapLibreRecordingMap$lambda$5(mutableState11);
        Boolean valueOf32 = Boolean.valueOf(MapLibreRecordingMap$lambda$17(mutableState6));
        MapLibreMap MapLibreRecordingMap$lambda$1422 = MapLibreRecordingMap$lambda$14(mutableState12);
        startRestartGroup.startReplaceGroup(-1878916395);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(MapLibreRecordingMap$lambda$52, valueOf32, MapLibreRecordingMap$lambda$1422, (Function2) rememberedValue10, startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, continuation22);
        startRestartGroup.startReplaceGroup(-830852438);
        changed4 = startRestartGroup.changed(mutableState172);
        rememberedValue11 = startRestartGroup.rememberedValue();
        if (changed4) {
        }
        mutableState13 = mutableState6;
        mutableState14 = mutableState9;
        rememberedValue11 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreRecordingMapKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                MapView MapLibreRecordingMap$lambda$30$lambda$29$lambda$28;
                MapLibreRecordingMap$lambda$30$lambda$29$lambda$28 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$30$lambda$29$lambda$28(MutableState.this, mutableState12, mutableState13, mutableState172, (Context) obj);
                return MapLibreRecordingMap$lambda$30$lambda$29$lambda$28;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue11);
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState182 = mutableState13;
        AndroidView_androidKt.AndroidView((Function1) rememberedValue11, fillMaxSize$default2, null, startRestartGroup, 48, 4);
        MapLibreRecordingMap$lambda$8 = MapLibreRecordingMap$lambda$8(mutableState162);
        startRestartGroup.startReplaceGroup(-830782278);
        if (MapLibreRecordingMap$lambda$8 != null) {
        }
        composer2 = startRestartGroup;
        mutableState15 = mutableState12;
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.startReplaceGroup(-1878807665);
        changedInstance2 = composer2.changedInstance(lifecycleOwner2);
        rememberedValue12 = composer2.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue12 = new Function1() { // from class: com.example.rungps.ui.main.MapLibreRecordingMapKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult MapLibreRecordingMap$lambda$34$lambda$33;
                MapLibreRecordingMap$lambda$34$lambda$33 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$34$lambda$33(LifecycleOwner.this, mutableState14, mutableState15, mutableState182, (DisposableEffectScope) obj);
                return MapLibreRecordingMap$lambda$34$lambda$33;
            }
        };
        composer2.updateRememberedValue(rememberedValue12);
        composer2.endReplaceGroup();
        EffectsKt.DisposableEffect(lifecycleOwner2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue12, composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier5 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<LatLng> MapLibreRecordingMap$lambda$2(MutableState<List<LatLng>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<LatLng> MapLibreRecordingMap$lambda$5(MutableState<List<LatLng>> mutableState) {
        return mutableState.getValue();
    }

    private static final Double MapLibreRecordingMap$lambda$8(MutableState<Double> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapView MapLibreRecordingMap$lambda$11(MutableState<MapView> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapLibreMap MapLibreRecordingMap$lambda$14(MutableState<MapLibreMap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapLibreRecordingMap$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapLibreRecordingMap$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapView MapLibreRecordingMap$lambda$30$lambda$29$lambda$28(MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        MapView mapView = new MapView(context);
        mutableState.setValue(mapView);
        mapView.onCreate(null);
        mapView.getMapAsync(new OnMapReadyCallback() { // from class: com.example.rungps.ui.main.MapLibreRecordingMapKt$$ExternalSyntheticLambda0
            @Override // org.maplibre.android.maps.OnMapReadyCallback
            public final void onMapReady(MapLibreMap mapLibreMap) {
                MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$30$lambda$29$lambda$28$lambda$27$lambda$26(MutableState.this, context, mutableState3, mutableState4, mapLibreMap);
            }
        });
        return mapView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapLibreRecordingMap$lambda$30$lambda$29$lambda$28$lambda$27$lambda$26(MutableState mutableState, final Context context, final MutableState mutableState2, final MutableState mutableState3, final MapLibreMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        mutableState.setValue(map);
        UiSettings uiSettings = map.getUiSettings();
        uiSettings.setAttributionEnabled(true);
        uiSettings.setCompassEnabled(false);
        uiSettings.setRotateGesturesEnabled(true);
        uiSettings.setTiltGesturesEnabled(true);
        map.setPadding(0, 48, 0, 320);
        map.setStyle(new Style.Builder().fromUri(MAP_STYLE), new Style.OnStyleLoaded() { // from class: com.example.rungps.ui.main.MapLibreRecordingMapKt$$ExternalSyntheticLambda1
            @Override // org.maplibre.android.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$30$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25(MapLibreMap.this, context, mutableState2, mutableState3, style);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapLibreRecordingMap$lambda$30$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25(MapLibreMap mapLibreMap, Context context, MutableState mutableState, MutableState mutableState2, Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
        ensureRouteLayers(style);
        MapLibreRecordingMap$lambda$18(mutableState, true);
        mapLibreMap.getLocationComponent().activateLocationComponent(LocationComponentActivationOptions.builder(context, style).useDefaultLocationEngine(false).build());
        mapLibreMap.getLocationComponent().setLocationComponentEnabled(true);
        mapLibreMap.getLocationComponent().setCameraMode(34);
        mapLibreMap.getLocationComponent().setRenderMode(8);
        mapLibreMap.animateCamera(CameraUpdateFactory.tiltTo(52.0d));
        updateLineSource(style, SRC_PLANNED, MapLibreRecordingMap$lambda$2(mutableState2), 2);
        if (MapLibreRecordingMap$lambda$2(mutableState2).size() >= 2) {
            mapLibreMap.animateCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds.Builder().includes(MapLibreRecordingMap$lambda$2(mutableState2)).build(), 100));
        } else {
            mapLibreMap.setCameraPosition(new CameraPosition.Builder().zoom(16.0d).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MapLibreRecordingMap$lambda$34$lambda$33(final LifecycleOwner lifecycleOwner, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.example.rungps.ui.main.MapLibreRecordingMapKt$$ExternalSyntheticLambda2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$34$lambda$33$lambda$31(MutableState.this, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.MapLibreRecordingMapKt$MapLibreRecordingMap$lambda$34$lambda$33$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MapView MapLibreRecordingMap$lambda$11;
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
                MapLibreRecordingMap$lambda$11 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$11(mutableState);
                if (MapLibreRecordingMap$lambda$11 != null) {
                    MapLibreRecordingMap$lambda$11.onDestroy();
                }
                mutableState.setValue(null);
                mutableState2.setValue(null);
                MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$18(mutableState3, false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapLibreRecordingMap$lambda$34$lambda$33$lambda$31(MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        MapView MapLibreRecordingMap$lambda$11;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            MapView MapLibreRecordingMap$lambda$112 = MapLibreRecordingMap$lambda$11(mutableState);
            if (MapLibreRecordingMap$lambda$112 != null) {
                MapLibreRecordingMap$lambda$112.onStart();
                return;
            }
            return;
        }
        if (i == 2) {
            MapView MapLibreRecordingMap$lambda$113 = MapLibreRecordingMap$lambda$11(mutableState);
            if (MapLibreRecordingMap$lambda$113 != null) {
                MapLibreRecordingMap$lambda$113.onResume();
                return;
            }
            return;
        }
        if (i == 3) {
            MapView MapLibreRecordingMap$lambda$114 = MapLibreRecordingMap$lambda$11(mutableState);
            if (MapLibreRecordingMap$lambda$114 != null) {
                MapLibreRecordingMap$lambda$114.onPause();
                return;
            }
            return;
        }
        if (i != 4) {
            if (i == 5 && (MapLibreRecordingMap$lambda$11 = MapLibreRecordingMap$lambda$11(mutableState)) != null) {
                MapLibreRecordingMap$lambda$11.onDestroy();
                return;
            }
            return;
        }
        MapView MapLibreRecordingMap$lambda$115 = MapLibreRecordingMap$lambda$11(mutableState);
        if (MapLibreRecordingMap$lambda$115 != null) {
            MapLibreRecordingMap$lambda$115.onStop();
        }
    }

    private static final void ensureRouteLayers(Style style) {
        if (style.getSource(SRC_PLANNED) == null) {
            style.addSource(new GeoJsonSource(SRC_PLANNED));
            style.addLayer(new LineLayer(LAYER_PLANNED, SRC_PLANNED).withProperties(PropertyFactory.lineColor(Color.parseColor("#1565C0")), PropertyFactory.lineWidth(Float.valueOf(7.5f)), PropertyFactory.lineOpacity(Float.valueOf(0.95f)), PropertyFactory.lineCap("round"), PropertyFactory.lineJoin("round")));
        }
        if (style.getSource(SRC_TRAVELLED) == null) {
            style.addSource(new GeoJsonSource(SRC_TRAVELLED));
            style.addLayer(new LineLayer(LAYER_TRAVELLED, SRC_TRAVELLED).withProperties(PropertyFactory.lineColor(Color.parseColor("#E53935")), PropertyFactory.lineWidth(Float.valueOf(5.5f)), PropertyFactory.lineOpacity(Float.valueOf(0.9f)), PropertyFactory.lineCap("round"), PropertyFactory.lineJoin("round")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateLineSource(Style style, String str, List<LatLng> list, int i) {
        if (list.size() < i) {
            GeoJsonSource geoJsonSource = (GeoJsonSource) style.getSourceAs(str);
            if (geoJsonSource != null) {
                geoJsonSource.setGeoJson(FeatureCollection.fromFeatures(new Feature[0]));
                return;
            }
            return;
        }
        List<LatLng> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (LatLng latLng : list2) {
            arrayList.add(Point.fromLngLat(latLng.getLongitude(), latLng.getLatitude()));
        }
        Feature fromGeometry = Feature.fromGeometry(LineString.fromLngLats(arrayList));
        GeoJsonSource geoJsonSource2 = (GeoJsonSource) style.getSourceAs(str);
        if (geoJsonSource2 != null) {
            geoJsonSource2.setGeoJson(FeatureCollection.fromFeature(fromGeometry));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double distanceM(LatLng latLng, LatLng latLng2) {
        Location location = new Location("a");
        location.setLatitude(latLng.getLatitude());
        location.setLongitude(latLng.getLongitude());
        Location location2 = new Location("b");
        location2.setLatitude(latLng2.getLatitude());
        location2.setLongitude(latLng2.getLongitude());
        return location.distanceTo(location2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double offRouteDistanceM(LatLng latLng, List<LatLng> list) {
        if (list.size() < 2) {
            return null;
        }
        int size = list.size();
        double d = Double.POSITIVE_INFINITY;
        for (int i = 1; i < size; i++) {
            double pointToSegmentM = pointToSegmentM(latLng, list.get(i - 1), list.get(i));
            if (pointToSegmentM < d) {
                d = pointToSegmentM;
            }
        }
        Double valueOf = Double.valueOf(d);
        double doubleValue = valueOf.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            return null;
        }
        return valueOf;
    }

    private static final double pointToSegmentM(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        double longitude = latLng2.getLongitude();
        double latitude = latLng2.getLatitude();
        double longitude2 = latLng3.getLongitude();
        double d = longitude2 - longitude;
        double latitude2 = latLng3.getLatitude() - latitude;
        double d2 = (d * d) + (latitude2 * latitude2);
        double coerceIn = d2 > 0.0d ? RangesKt.coerceIn((((latLng.getLongitude() - longitude) * d) + ((latLng.getLatitude() - latitude) * latitude2)) / d2, 0.0d, 1.0d) : 0.0d;
        return distanceM(latLng, new LatLng(latitude + (latitude2 * coerceIn), longitude + (d * coerceIn)));
    }
}
