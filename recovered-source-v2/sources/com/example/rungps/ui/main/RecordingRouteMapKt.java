package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.Repository;
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
import okhttp3.internal.ws.WebSocketProtocol;
import org.maplibre.android.style.layers.Property;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.compass.InternalCompassOrientationProvider;

/* compiled from: RecordingRouteMap.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0002\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¨\u0006\u0019²\u0006\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013X\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\u0010\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013X\u008a\u008e\u0002"}, d2 = {"RecordingRouteMap", "", "routeId", "", "routeName", "", "liveLat", "", "liveLon", "distanceM", "modifier", "Landroidx/compose/ui/Modifier;", "compact", "", "(JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;DLandroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "offRouteDistanceM", "current", "Lorg/osmdroid/util/GeoPoint;", Property.SYMBOL_PLACEMENT_LINE, "", "(Lorg/osmdroid/util/GeoPoint;Ljava/util/List;)Ljava/lang/Double;", "pointToSegmentM", "p", "a", "b", "app_sideload", "routePts", "offRouteM", "trail"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecordingRouteMapKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MapView RecordingRouteMap$lambda$25$lambda$22$lambda$21(MapView mapView, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return mapView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapView RecordingRouteMap$lambda$33$lambda$32$lambda$29$lambda$28(MapView mapView, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return mapView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingRouteMap$lambda$34(long j, String str, Double d, Double d2, double d3, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        RecordingRouteMap(j, str, d, d2, d3, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecordingRouteMap(final long j, final String str, final Double d, final Double d2, final double d3, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z2;
        Context context;
        boolean changed;
        Object rememberedValue;
        int i6;
        boolean z3;
        int i7;
        Object mutableStateOf$default;
        MutableState mutableState;
        Object rememberedValue2;
        int i8;
        Object rememberedValue3;
        MutableState mutableState2;
        Long valueOf;
        boolean changed2;
        Object rememberedValue4;
        int i9;
        Long l;
        int i10;
        MutableState mutableState3;
        Context context2;
        int i11;
        MutableState mutableState4;
        boolean z4;
        boolean changed3;
        Object rememberedValue5;
        boolean z5;
        boolean z6;
        Object rememberedValue6;
        final MapView mapView;
        boolean changed4;
        Object rememberedValue7;
        boolean changedInstance;
        Object rememberedValue8;
        boolean changedInstance2;
        MutableState mutableState5;
        Object obj;
        boolean changedInstance3;
        Object rememberedValue9;
        boolean changedInstance4;
        Object rememberedValue10;
        boolean changedInstance5;
        Object rememberedValue11;
        boolean z7;
        Modifier modifier3;
        Composer composer2;
        long secondaryContainer;
        long onSecondaryContainer;
        long secondaryContainer2;
        long onSecondaryContainer2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-150548610);
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
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(d) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(d2) ? 2048 : 1024;
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(d3) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                }
            }
            if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 != 0) {
                    z2 = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-150548610, i3, -1, "com.example.rungps.ui.main.RecordingRouteMap (RecordingRouteMap.kt:96)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                context = (Context) consume;
                startRestartGroup.startReplaceGroup(448959920);
                changed = startRestartGroup.changed(context);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = Repository.INSTANCE.get(context);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                Repository repository = (Repository) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(448961836);
                i6 = i3 & 14;
                z3 = i6 != 4;
                Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (!z3 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    i7 = 2;
                    mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default);
                } else {
                    mutableStateOf$default = rememberedValue12;
                    i7 = 2;
                }
                mutableState = (MutableState) mutableStateOf$default;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(448964629);
                rememberedValue2 = startRestartGroup.rememberedValue();
                i8 = i3;
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i7, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState6 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(448966586);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                mutableState2 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                valueOf = Long.valueOf(j);
                startRestartGroup.startReplaceGroup(448969208);
                Modifier modifier5 = modifier4;
                changed2 = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(repository) | (i6 != 4);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    i9 = i6;
                    l = valueOf;
                    i10 = i8;
                    mutableState3 = mutableState2;
                    context2 = context;
                    i11 = 2048;
                    mutableState4 = mutableState;
                    z4 = true;
                    rememberedValue4 = (Function2) new RecordingRouteMapKt$RecordingRouteMap$1$1(repository, j, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    i9 = i6;
                    l = valueOf;
                    mutableState3 = mutableState2;
                    context2 = context;
                    mutableState4 = mutableState;
                    i10 = i8;
                    i11 = 2048;
                    z4 = true;
                }
                startRestartGroup.endReplaceGroup();
                int i12 = i9;
                EffectsKt.LaunchedEffect(l, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, i12);
                List<GeoPoint> RecordingRouteMap$lambda$2 = RecordingRouteMap$lambda$2(mutableState4);
                startRestartGroup.startReplaceGroup(448975695);
                int i13 = i10;
                int i14 = i13 & 896;
                int i15 = i13 & 7168;
                MutableState mutableState7 = mutableState4;
                changed3 = (i14 != 256 ? z4 : false) | (i15 != i11 ? z4 : false) | startRestartGroup.changed(mutableState7);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = (Function2) new RecordingRouteMapKt$RecordingRouteMap$2$1(d, d2, mutableState7, mutableState6, mutableState3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                z5 = z2;
                EffectsKt.LaunchedEffect(d, d2, RecordingRouteMap$lambda$2, (Function2) rememberedValue5, startRestartGroup, (i13 >> 6) & WebSocketProtocol.PAYLOAD_SHORT);
                startRestartGroup.startReplaceGroup(448991325);
                boolean z8 = i12 != 4;
                int i16 = 3670016 & i13;
                z6 = (i16 != 1048576) | z8;
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!z6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = MapOsMapKitKt.createOsMapKit(context2);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                OsMapKit osMapKit = (OsMapKit) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                mapView = osMapKit.getMapView();
                startRestartGroup.startReplaceGroup(448994536);
                changed4 = startRestartGroup.changed(mapView);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changed4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new InternalCompassOrientationProvider(context2);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                InternalCompassOrientationProvider internalCompassOrientationProvider = (InternalCompassOrientationProvider) rememberedValue7;
                startRestartGroup.endReplaceGroup();
                List<GeoPoint> RecordingRouteMap$lambda$22 = RecordingRouteMap$lambda$2(mutableState7);
                startRestartGroup.startReplaceGroup(448997798);
                changedInstance = (i16 != 1048576) | startRestartGroup.changedInstance(osMapKit) | startRestartGroup.changed(mutableState7) | startRestartGroup.changedInstance(mapView);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = (Function2) new RecordingRouteMapKt$RecordingRouteMap$3$1(osMapKit, z5, mapView, mutableState7, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(RecordingRouteMap$lambda$22, osMapKit, (Function2) rememberedValue8, startRestartGroup, 0);
                List<GeoPoint> RecordingRouteMap$lambda$8 = RecordingRouteMap$lambda$8(mutableState3);
                startRestartGroup.startReplaceGroup(449003800);
                changedInstance2 = startRestartGroup.changedInstance(osMapKit) | startRestartGroup.changedInstance(mapView);
                Object rememberedValue13 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    mutableState5 = mutableState3;
                    obj = (Function2) new RecordingRouteMapKt$RecordingRouteMap$4$1(osMapKit, mapView, mutableState5, null);
                    startRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue13;
                    mutableState5 = mutableState3;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(RecordingRouteMap$lambda$8, osMapKit, (Function2) obj, startRestartGroup, 0);
                Boolean valueOf2 = Boolean.valueOf(z5);
                startRestartGroup.startReplaceGroup(449007444);
                changedInstance3 = startRestartGroup.changedInstance(mapView) | (i16 != 1048576);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = (Function2) new RecordingRouteMapKt$RecordingRouteMap$5$1(mapView, z5, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf2, osMapKit, (Function2) rememberedValue9, startRestartGroup, (i13 >> 18) & 14);
                Object[] objArr = {mapView, internalCompassOrientationProvider, RecordingRouteMap$lambda$8(mutableState5), d, d2, Boolean.valueOf(z5)};
                startRestartGroup.startReplaceGroup(449012938);
                changedInstance4 = (i16 != 1048576) | (i14 != 256) | startRestartGroup.changedInstance(internalCompassOrientationProvider) | startRestartGroup.changedInstance(mapView) | (i15 != 2048);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (!changedInstance4 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = (Function2) new RecordingRouteMapKt$RecordingRouteMap$6$1(internalCompassOrientationProvider, mapView, d, d2, z5, mutableState5, null);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue10, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(449040904);
                changedInstance5 = startRestartGroup.changedInstance(mapView);
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (!changedInstance5 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new Function1() { // from class: com.example.rungps.ui.main.RecordingRouteMapKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            DisposableEffectResult RecordingRouteMap$lambda$20$lambda$19;
                            RecordingRouteMap$lambda$20$lambda$19 = RecordingRouteMapKt.RecordingRouteMap$lambda$20$lambda$19(MapView.this, (DisposableEffectScope) obj2);
                            return RecordingRouteMap$lambda$20$lambda$19;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(mapView, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue11, startRestartGroup, 0);
                double d4 = d3 / 1000.0d;
                double d5 = d4 - ((int) d4);
                double d6 = d5 >= 0.001d ? 1000.0d * (1.0d - d5) : 1000.0d;
                Double RecordingRouteMap$lambda$5 = RecordingRouteMap$lambda$5(mutableState6);
                if (!z5) {
                    startRestartGroup.startReplaceGroup(1035712036);
                    Modifier clipToBounds = ClipKt.clipToBounds(modifier5);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, clipToBounds);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(334632565);
                    boolean changedInstance6 = startRestartGroup.changedInstance(mapView);
                    Object rememberedValue14 = startRestartGroup.rememberedValue();
                    if (changedInstance6 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue14 = new Function1() { // from class: com.example.rungps.ui.main.RecordingRouteMapKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                MapView RecordingRouteMap$lambda$25$lambda$22$lambda$21;
                                RecordingRouteMap$lambda$25$lambda$22$lambda$21 = RecordingRouteMapKt.RecordingRouteMap$lambda$25$lambda$22$lambda$21(MapView.this, (Context) obj2);
                                return RecordingRouteMap$lambda$25$lambda$22$lambda$21;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                    }
                    Function1 function1 = (Function1) rememberedValue14;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(334633821);
                    Object rememberedValue15 = startRestartGroup.rememberedValue();
                    if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue15 = new Function1() { // from class: com.example.rungps.ui.main.RecordingRouteMapKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit RecordingRouteMap$lambda$25$lambda$24$lambda$23;
                                RecordingRouteMap$lambda$25$lambda$24$lambda$23 = RecordingRouteMapKt.RecordingRouteMap$lambda$25$lambda$24$lambda$23((MapView) obj2);
                                return RecordingRouteMap$lambda$25$lambda$24$lambda$23;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue15);
                    }
                    startRestartGroup.endReplaceGroup();
                    AndroidView_androidKt.AndroidView(function1, fillMaxSize$default, (Function1) rememberedValue15, startRestartGroup, 432, 0);
                    startRestartGroup.startReplaceGroup(334636245);
                    if (RecordingRouteMap$lambda$5 != null && RecordingRouteMap$lambda$5.doubleValue() > 18.0d) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format(Locale.US, "%.0f m off", Arrays.copyOf(new Object[]{RecordingRouteMap$lambda$5}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        Modifier clip = ClipKt.clip(PaddingKt.m684padding3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m6303constructorimpl(12)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(8)));
                        if (RecordingRouteMap$lambda$5.doubleValue() > 25.0d) {
                            startRestartGroup.startReplaceGroup(334648824);
                            secondaryContainer2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getErrorContainer();
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(334651228);
                            secondaryContainer2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSecondaryContainer();
                            startRestartGroup.endReplaceGroup();
                        }
                        Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(BackgroundKt.m239backgroundbw27NRU$default(clip, secondaryContainer2, null, 2, null), Dp.m6303constructorimpl(10), Dp.m6303constructorimpl(6));
                        TextStyle labelLarge = MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelLarge();
                        if (RecordingRouteMap$lambda$5.doubleValue() > 25.0d) {
                            startRestartGroup.startReplaceGroup(334659418);
                            onSecondaryContainer2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnErrorContainer();
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(334661630);
                            onSecondaryContainer2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSecondaryContainer();
                            startRestartGroup.endReplaceGroup();
                        }
                        TextKt.m2376Text4IGK_g(format, m685paddingVpY3zN4, onSecondaryContainer2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelLarge, startRestartGroup, 0, 0, 65528);
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    modifier3 = modifier5;
                    z7 = z5;
                } else {
                    startRestartGroup.startReplaceGroup(1036876706);
                    z7 = z5;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    modifier3 = modifier5;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    float f = 8;
                    Modifier m688paddingqDBjuR0$default = PaddingKt.m688paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6303constructorimpl(f), 7, null);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m688paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3336constructorimpl3 = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor4);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3336constructorimpl4 = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    composer2 = startRestartGroup;
                    TextKt.m2376Text4IGK_g(str == null ? "Route #" + j : str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), composer2, 0, 0, 65534);
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format(Locale.US, "%.2f km · %.0f m", Arrays.copyOf(new Object[]{Double.valueOf(d4), Double.valueOf(d6)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    TextKt.m2376Text4IGK_g(format2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.startReplaceGroup(-1503937181);
                    if (RecordingRouteMap$lambda$5 != null) {
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        String format3 = String.format(Locale.US, "%.0f m off", Arrays.copyOf(new Object[]{RecordingRouteMap$lambda$5}, 1));
                        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                        Modifier clip2 = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(f)));
                        if (RecordingRouteMap$lambda$5.doubleValue() > 25.0d) {
                            composer2.startReplaceGroup(-1503927145);
                            secondaryContainer = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getErrorContainer();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1503924613);
                            secondaryContainer = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondaryContainer();
                            composer2.endReplaceGroup();
                        }
                        Modifier m685paddingVpY3zN42 = PaddingKt.m685paddingVpY3zN4(BackgroundKt.m239backgroundbw27NRU$default(clip2, secondaryContainer, null, 2, null), Dp.m6303constructorimpl(10), Dp.m6303constructorimpl(6));
                        TextStyle labelLarge2 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge();
                        if (RecordingRouteMap$lambda$5.doubleValue() > 25.0d) {
                            composer2.startReplaceGroup(-1503915911);
                            onSecondaryContainer = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnErrorContainer();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1503913571);
                            onSecondaryContainer = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSecondaryContainer();
                            composer2.endReplaceGroup();
                        }
                        TextKt.m2376Text4IGK_g(format3, m685paddingVpY3zN42, onSecondaryContainer, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelLarge2, composer2, 0, 0, 65528);
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier clipToBounds2 = ClipKt.clipToBounds(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(280)));
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, clipToBounds2);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer2);
                    Updater.m3343setimpl(m3336constructorimpl5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m3343setimpl(m3336constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    composer2.startReplaceGroup(-1503901420);
                    boolean changedInstance7 = composer2.changedInstance(mapView);
                    Object rememberedValue16 = composer2.rememberedValue();
                    if (changedInstance7 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue16 = new Function1() { // from class: com.example.rungps.ui.main.RecordingRouteMapKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                MapView RecordingRouteMap$lambda$33$lambda$32$lambda$29$lambda$28;
                                RecordingRouteMap$lambda$33$lambda$32$lambda$29$lambda$28 = RecordingRouteMapKt.RecordingRouteMap$lambda$33$lambda$32$lambda$29$lambda$28(MapView.this, (Context) obj2);
                                return RecordingRouteMap$lambda$33$lambda$32$lambda$29$lambda$28;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue16);
                    }
                    Function1 function12 = (Function1) rememberedValue16;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1503900036);
                    Object rememberedValue17 = composer2.rememberedValue();
                    if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue17 = new Function1() { // from class: com.example.rungps.ui.main.RecordingRouteMapKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit RecordingRouteMap$lambda$33$lambda$32$lambda$31$lambda$30;
                                RecordingRouteMap$lambda$33$lambda$32$lambda$31$lambda$30 = RecordingRouteMapKt.RecordingRouteMap$lambda$33$lambda$32$lambda$31$lambda$30((MapView) obj2);
                                return RecordingRouteMap$lambda$33$lambda$32$lambda$31$lambda$30;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue17);
                    }
                    composer2.endReplaceGroup();
                    AndroidView_androidKt.AndroidView(function12, fillMaxSize$default2, (Function1) rememberedValue17, composer2, 432, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z7 = z2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier6 = modifier3;
                final boolean z9 = z7;
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RecordingRouteMapKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit RecordingRouteMap$lambda$34;
                        RecordingRouteMap$lambda$34 = RecordingRouteMapKt.RecordingRouteMap$lambda$34(j, str, d, d2, d3, modifier6, z9, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return RecordingRouteMap$lambda$34;
                    }
                });
                return;
            }
            return;
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        context = (Context) consume2;
        startRestartGroup.startReplaceGroup(448959920);
        changed = startRestartGroup.changed(context);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = Repository.INSTANCE.get(context);
        startRestartGroup.updateRememberedValue(rememberedValue);
        Repository repository2 = (Repository) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(448961836);
        i6 = i3 & 14;
        if (i6 != 4) {
        }
        Object rememberedValue122 = startRestartGroup.rememberedValue();
        if (z3) {
        }
        i7 = 2;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default);
        mutableState = (MutableState) mutableStateOf$default;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(448964629);
        rememberedValue2 = startRestartGroup.rememberedValue();
        i8 = i3;
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState62 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(448966586);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 != Composer.INSTANCE.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        valueOf = Long.valueOf(j);
        startRestartGroup.startReplaceGroup(448969208);
        Modifier modifier52 = modifier4;
        changed2 = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(repository2) | (i6 != 4);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        i9 = i6;
        l = valueOf;
        i10 = i8;
        mutableState3 = mutableState2;
        context2 = context;
        i11 = 2048;
        mutableState4 = mutableState;
        z4 = true;
        rememberedValue4 = (Function2) new RecordingRouteMapKt$RecordingRouteMap$1$1(repository2, j, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        int i122 = i9;
        EffectsKt.LaunchedEffect(l, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, i122);
        List<GeoPoint> RecordingRouteMap$lambda$23 = RecordingRouteMap$lambda$2(mutableState4);
        startRestartGroup.startReplaceGroup(448975695);
        int i132 = i10;
        int i142 = i132 & 896;
        int i152 = i132 & 7168;
        MutableState mutableState72 = mutableState4;
        changed3 = (i142 != 256 ? z4 : false) | (i152 != i11 ? z4 : false) | startRestartGroup.changed(mutableState72);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue5 = (Function2) new RecordingRouteMapKt$RecordingRouteMap$2$1(d, d2, mutableState72, mutableState62, mutableState3, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        z5 = z2;
        EffectsKt.LaunchedEffect(d, d2, RecordingRouteMap$lambda$23, (Function2) rememberedValue5, startRestartGroup, (i132 >> 6) & WebSocketProtocol.PAYLOAD_SHORT);
        startRestartGroup.startReplaceGroup(448991325);
        if (i122 != 4) {
        }
        int i162 = 3670016 & i132;
        z6 = (i162 != 1048576) | z8;
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!z6) {
        }
        rememberedValue6 = MapOsMapKitKt.createOsMapKit(context2);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        OsMapKit osMapKit2 = (OsMapKit) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        mapView = osMapKit2.getMapView();
        startRestartGroup.startReplaceGroup(448994536);
        changed4 = startRestartGroup.changed(mapView);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue7 = new InternalCompassOrientationProvider(context2);
        startRestartGroup.updateRememberedValue(rememberedValue7);
        InternalCompassOrientationProvider internalCompassOrientationProvider2 = (InternalCompassOrientationProvider) rememberedValue7;
        startRestartGroup.endReplaceGroup();
        List<GeoPoint> RecordingRouteMap$lambda$222 = RecordingRouteMap$lambda$2(mutableState72);
        startRestartGroup.startReplaceGroup(448997798);
        changedInstance = (i162 != 1048576) | startRestartGroup.changedInstance(osMapKit2) | startRestartGroup.changed(mutableState72) | startRestartGroup.changedInstance(mapView);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue8 = (Function2) new RecordingRouteMapKt$RecordingRouteMap$3$1(osMapKit2, z5, mapView, mutableState72, null);
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(RecordingRouteMap$lambda$222, osMapKit2, (Function2) rememberedValue8, startRestartGroup, 0);
        List<GeoPoint> RecordingRouteMap$lambda$82 = RecordingRouteMap$lambda$8(mutableState3);
        startRestartGroup.startReplaceGroup(449003800);
        changedInstance2 = startRestartGroup.changedInstance(osMapKit2) | startRestartGroup.changedInstance(mapView);
        Object rememberedValue132 = startRestartGroup.rememberedValue();
        if (changedInstance2) {
        }
        mutableState5 = mutableState3;
        obj = (Function2) new RecordingRouteMapKt$RecordingRouteMap$4$1(osMapKit2, mapView, mutableState5, null);
        startRestartGroup.updateRememberedValue(obj);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(RecordingRouteMap$lambda$82, osMapKit2, (Function2) obj, startRestartGroup, 0);
        Boolean valueOf22 = Boolean.valueOf(z5);
        startRestartGroup.startReplaceGroup(449007444);
        changedInstance3 = startRestartGroup.changedInstance(mapView) | (i162 != 1048576);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue9 = (Function2) new RecordingRouteMapKt$RecordingRouteMap$5$1(mapView, z5, null);
        startRestartGroup.updateRememberedValue(rememberedValue9);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf22, osMapKit2, (Function2) rememberedValue9, startRestartGroup, (i132 >> 18) & 14);
        Object[] objArr2 = {mapView, internalCompassOrientationProvider2, RecordingRouteMap$lambda$8(mutableState5), d, d2, Boolean.valueOf(z5)};
        startRestartGroup.startReplaceGroup(449012938);
        changedInstance4 = (i162 != 1048576) | (i142 != 256) | startRestartGroup.changedInstance(internalCompassOrientationProvider2) | startRestartGroup.changedInstance(mapView) | (i152 != 2048);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (!changedInstance4) {
        }
        rememberedValue10 = (Function2) new RecordingRouteMapKt$RecordingRouteMap$6$1(internalCompassOrientationProvider2, mapView, d, d2, z5, mutableState5, null);
        startRestartGroup.updateRememberedValue(rememberedValue10);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(objArr2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue10, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(449040904);
        changedInstance5 = startRestartGroup.changedInstance(mapView);
        rememberedValue11 = startRestartGroup.rememberedValue();
        if (!changedInstance5) {
        }
        rememberedValue11 = new Function1() { // from class: com.example.rungps.ui.main.RecordingRouteMapKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                DisposableEffectResult RecordingRouteMap$lambda$20$lambda$19;
                RecordingRouteMap$lambda$20$lambda$19 = RecordingRouteMapKt.RecordingRouteMap$lambda$20$lambda$19(MapView.this, (DisposableEffectScope) obj2);
                return RecordingRouteMap$lambda$20$lambda$19;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue11);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(mapView, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue11, startRestartGroup, 0);
        double d42 = d3 / 1000.0d;
        double d52 = d42 - ((int) d42);
        if (d52 >= 0.001d) {
        }
        Double RecordingRouteMap$lambda$52 = RecordingRouteMap$lambda$5(mutableState62);
        if (!z5) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GeoPoint> RecordingRouteMap$lambda$2(MutableState<List<GeoPoint>> mutableState) {
        return mutableState.getValue();
    }

    private static final Double RecordingRouteMap$lambda$5(MutableState<Double> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GeoPoint> RecordingRouteMap$lambda$8(MutableState<List<GeoPoint>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult RecordingRouteMap$lambda$20$lambda$19(final MapView mapView, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        mapView.onResume();
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.RecordingRouteMapKt$RecordingRouteMap$lambda$20$lambda$19$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MapView.this.onPause();
                MapView.this.onDetach();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingRouteMap$lambda$25$lambda$24$lambda$23(MapView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.invalidate();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingRouteMap$lambda$33$lambda$32$lambda$31$lambda$30(MapView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.invalidate();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double offRouteDistanceM(GeoPoint geoPoint, List<? extends GeoPoint> list) {
        if (list.size() < 2) {
            return null;
        }
        int size = list.size();
        double d = Double.POSITIVE_INFINITY;
        for (int i = 1; i < size; i++) {
            double pointToSegmentM = pointToSegmentM(geoPoint, list.get(i - 1), list.get(i));
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

    private static final double pointToSegmentM(GeoPoint geoPoint, GeoPoint geoPoint2, GeoPoint geoPoint3) {
        double longitude = geoPoint2.getLongitude();
        double latitude = geoPoint2.getLatitude();
        double longitude2 = geoPoint3.getLongitude();
        double d = longitude2 - longitude;
        double latitude2 = geoPoint3.getLatitude() - latitude;
        double d2 = (d * d) + (latitude2 * latitude2);
        double coerceIn = d2 > 0.0d ? RangesKt.coerceIn((((geoPoint.getLongitude() - longitude) * d) + ((geoPoint.getLatitude() - latitude) * latitude2)) / d2, 0.0d, 1.0d) : 0.0d;
        return MapOsMapKitKt.geoDistanceM(new GeoPoint(latitude + (latitude2 * coerceIn), longitude + (d * coerceIn)), geoPoint);
    }
}
