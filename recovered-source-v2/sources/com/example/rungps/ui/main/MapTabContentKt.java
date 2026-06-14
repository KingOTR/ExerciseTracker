package com.example.rungps.ui.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.routing.OsrmWalkingRouter;
import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;
import org.osmdroid.events.MapEventsReceiver;
import org.osmdroid.mapsforge.MapsForgeTileProvider;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.MapEventsOverlay;
import org.osmdroid.views.overlay.compass.CompassOverlay;
import org.osmdroid.views.overlay.compass.InternalCompassOrientationProvider;

/* compiled from: MapTabContent.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\rX\u008a\u008e\u0002²\u0006\f\u0010(\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002²\u0006\f\u0010)\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\rX\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u0004\u0018\u000100X\u008a\u008e\u0002²\u0006\f\u00101\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002"}, d2 = {"MapTabContent", "", "liveLat", "", "liveLon", "elapsedMs", "", "distanceM", "steps", "isRecording", "", "followRouteId", "followRouteName", "", "onSelectFollowRoute", "Lkotlin/Function2;", "routes", "", "Lcom/example/rungps/data/RouteEntity;", "vm", "Lcom/example/rungps/feature/run/RunsViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/Double;Ljava/lang/Double;JDJZLjava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/util/List;Lcom/example/rungps/feature/run/RunsViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "a", "Lorg/osmdroid/util/GeoPoint;", "b", "app_sideload", "showMapTools", "plannedPts", "walkingSnapReady", "mapUriString", "headingUp", "showSaveRoute", "routeName", "usingOffline", "planMode", "offlineStatus", "offlineLoaded", "offlineDownloadUrl", "offlineDownloadId", "offlineDownloadDest", "offlineDownloading", "pendingGpsCenter", "locatingFromMyLocationBtn", "snapInProgress", "paceText", "mapsForgeProvider", "Lorg/osmdroid/mapsforge/MapsForgeTileProvider;", "deleteRouteId"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapTabContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapTabContent$lambda$114(Double d, Double d2, long j, double d3, long j2, boolean z, Long l, String str, Function2 function2, List list, RunsViewModel runsViewModel, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        MapTabContent(d, d2, j, d3, j2, z, l, str, function2, list, runsViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0bdc  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x049c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MapTabContent(final Double d, final Double d2, final long j, final double d3, final long j2, final boolean z, final Long l, final String str, final Function2<? super Long, ? super String, Unit> onSelectFollowRoute, final List<RouteEntity> routes, final RunsViewModel vm, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        Object rememberedValue;
        Object rememberedValue2;
        int i8;
        final MutableState mutableState;
        Object rememberedValue3;
        final MutableState mutableState2;
        Object rememberedValue4;
        Object rememberedValue5;
        boolean changed;
        Object rememberedValue6;
        Object rememberedValue7;
        Modifier modifier3;
        Object rememberedValue8;
        Object rememberedValue9;
        final MutableState mutableState3;
        Object rememberedValue10;
        Object rememberedValue11;
        boolean changedInstance;
        Object rememberedValue12;
        boolean changed2;
        Object rememberedValue13;
        Object rememberedValue14;
        Object rememberedValue15;
        Object rememberedValue16;
        Object rememberedValue17;
        Object rememberedValue18;
        Object rememberedValue19;
        Object rememberedValue20;
        Object rememberedValue21;
        Object rememberedValue22;
        Object rememberedValue23;
        int i9;
        Object rememberedValue24;
        boolean changedInstance2;
        Object rememberedValue25;
        Modifier modifier4;
        final MutableState mutableState4;
        boolean changedInstance3;
        Object rememberedValue26;
        boolean changedInstance4;
        Object rememberedValue27;
        final MutableState mutableState5;
        boolean changed3;
        MutableState mutableState6;
        Object rememberedValue28;
        boolean changed4;
        Object rememberedValue29;
        boolean changedInstance5;
        Object rememberedValue30;
        MutableState mutableState7;
        boolean changedInstance6;
        Object rememberedValue31;
        final MutableState mutableState8;
        Object rememberedValue32;
        final MutableState mutableState9;
        boolean changed5;
        Object rememberedValue33;
        boolean changed6;
        Object rememberedValue34;
        Object rememberedValue35;
        boolean changed7;
        Object rememberedValue36;
        boolean changedInstance7;
        Object rememberedValue37;
        boolean changed8;
        Object rememberedValue38;
        boolean changed9;
        Object rememberedValue39;
        boolean changedInstance8;
        Object rememberedValue40;
        Composer composer2;
        final Modifier modifier5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onSelectFollowRoute, "onSelectFollowRoute");
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(vm, "vm");
        Composer startRestartGroup = composer.startRestartGroup(1327089398);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (startRestartGroup.changed(d) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(d2) ? 32 : 16;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(l) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changed(str) ? 8388608 : 4194304;
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changedInstance(onSelectFollowRoute) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((i3 & 512) == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changedInstance(routes) ? 536870912 : 268435456;
            }
            i5 = i4;
            if ((i3 & 1024) == 0) {
                i6 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i6 = i2 | (startRestartGroup.changedInstance(vm) ? 4 : 2);
            } else {
                i6 = i2;
            }
            i7 = i3 & 2048;
            if (i7 == 0) {
                i6 |= 48;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 48) == 0) {
                    i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
                }
            }
            if ((i5 & 306774035) == 306774034 || (i6 & 19) != 18 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1327089398, i5, i6, "com.example.rungps.ui.main.MapTabContent (MapTabContent.kt:71)");
                }
                Object[] objArr = new Object[0];
                startRestartGroup.startReplaceGroup(-2117482592);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$1$lambda$0;
                            MapTabContent$lambda$1$lambda$0 = MapTabContentKt.MapTabContent$lambda$1$lambda$0();
                            return MapTabContent$lambda$1$lambda$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState10 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(-2117475914);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
                    i8 = 2;
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                } else {
                    i8 = 2;
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-2117473802);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, i8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                mutableState2 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-2117469640);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean MapTabContent$lambda$8$lambda$7;
                            MapTabContent$lambda$8$lambda$7 = MapTabContentKt.MapTabContent$lambda$8$lambda$7(MutableState.this, mutableState2);
                            return Boolean.valueOf(MapTabContent$lambda$8$lambda$7);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                State state = (State) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context = (Context) consume;
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume2;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                    startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    rememberedValue5 = compositionScopedCoroutineScopeCanceller;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue5).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(-2117460916);
                changed = startRestartGroup.changed(context);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = Repository.INSTANCE.get(context);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                Repository repository = (Repository) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                Object[] objArr2 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117458360);
                rememberedValue7 = startRestartGroup.rememberedValue();
                modifier3 = companion;
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$12$lambda$11;
                            MapTabContent$lambda$12$lambda$11 = MapTabContentKt.MapTabContent$lambda$12$lambda$11();
                            return MapTabContent$lambda$12$lambda$11;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState11 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue7, startRestartGroup, 3072, 6);
                Object[] objArr3 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117456064);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$16$lambda$15;
                            MapTabContent$lambda$16$lambda$15 = MapTabContentKt.MapTabContent$lambda$16$lambda$15();
                            return MapTabContent$lambda$16$lambda$15;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState12 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue8, startRestartGroup, 3072, 6);
                Object[] objArr4 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117453888);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$20$lambda$19;
                            MapTabContent$lambda$20$lambda$19 = MapTabContentKt.MapTabContent$lambda$20$lambda$19();
                            return MapTabContent$lambda$20$lambda$19;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                startRestartGroup.endReplaceGroup();
                mutableState3 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) rememberedValue9, startRestartGroup, 3072, 6);
                Object[] objArr5 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117451843);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$24$lambda$23;
                            MapTabContent$lambda$24$lambda$23 = MapTabContentKt.MapTabContent$lambda$24$lambda$23();
                            return MapTabContent$lambda$24$lambda$23;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState13 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) rememberedValue10, startRestartGroup, 3072, 6);
                Object[] objArr6 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117449792);
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$28$lambda$27;
                            MapTabContent$lambda$28$lambda$27 = MapTabContentKt.MapTabContent$lambda$28$lambda$27();
                            return MapTabContent$lambda$28$lambda$27;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState14 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr6, (Saver) null, (String) null, (Function0) rememberedValue11, startRestartGroup, 3072, 6);
                ActivityResultContracts.OpenDocument openDocument = new ActivityResultContracts.OpenDocument();
                startRestartGroup.startReplaceGroup(-2117444329);
                changedInstance = startRestartGroup.changedInstance(context) | startRestartGroup.changed(mutableState11) | startRestartGroup.changed(mutableState14);
                rememberedValue12 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit MapTabContent$lambda$32$lambda$31;
                            MapTabContent$lambda$32$lambda$31 = MapTabContentKt.MapTabContent$lambda$32$lambda$31(context, mutableState11, mutableState14, (Uri) obj);
                            return MapTabContent$lambda$32$lambda$31;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                startRestartGroup.endReplaceGroup();
                ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(openDocument, (Function1) rememberedValue12, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-2117424436);
                changed2 = startRestartGroup.changed(context);
                rememberedValue13 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = MapOsMapKitKt.createOsMapKit(context);
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                }
                final OsMapKit osMapKit = (OsMapKit) rememberedValue13;
                startRestartGroup.endReplaceGroup();
                final MapView mapView = osMapKit.getMapView();
                Object[] objArr7 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117385984);
                rememberedValue14 = startRestartGroup.rememberedValue();
                if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue14 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$36$lambda$35;
                            MapTabContent$lambda$36$lambda$35 = MapTabContentKt.MapTabContent$lambda$36$lambda$35();
                            return MapTabContent$lambda$36$lambda$35;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState15 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr7, (Saver) null, (String) null, (Function0) rememberedValue14, startRestartGroup, 3072, 6);
                Object[] objArr8 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117383801);
                rememberedValue15 = startRestartGroup.rememberedValue();
                if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$40$lambda$39;
                            MapTabContent$lambda$40$lambda$39 = MapTabContentKt.MapTabContent$lambda$40$lambda$39();
                            return MapTabContent$lambda$40$lambda$39;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue15);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState16 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr8, (Saver) null, (String) null, (Function0) rememberedValue15, startRestartGroup, 3072, 6);
                Object[] objArr9 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117381408);
                rememberedValue16 = startRestartGroup.rememberedValue();
                if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$44$lambda$43;
                            MapTabContent$lambda$44$lambda$43 = MapTabContentKt.MapTabContent$lambda$44$lambda$43();
                            return MapTabContent$lambda$44$lambda$43;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue16);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState17 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr9, (Saver) null, (String) null, (Function0) rememberedValue16, startRestartGroup, 3072, 6);
                Object[] objArr10 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117379075);
                rememberedValue17 = startRestartGroup.rememberedValue();
                if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue17 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$48$lambda$47;
                            MapTabContent$lambda$48$lambda$47 = MapTabContentKt.MapTabContent$lambda$48$lambda$47();
                            return MapTabContent$lambda$48$lambda$47;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue17);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState18 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr10, (Saver) null, (String) null, (Function0) rememberedValue17, startRestartGroup, 3072, 6);
                Object[] objArr11 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117376858);
                rememberedValue18 = startRestartGroup.rememberedValue();
                if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue18 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$52$lambda$51;
                            MapTabContent$lambda$52$lambda$51 = MapTabContentKt.MapTabContent$lambda$52$lambda$51();
                            return MapTabContent$lambda$52$lambda$51;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue18);
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState19 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr11, (Saver) null, (String) null, (Function0) rememberedValue18, startRestartGroup, 3072, 6);
                Object[] objArr12 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117374296);
                rememberedValue19 = startRestartGroup.rememberedValue();
                if (rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue19 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$56$lambda$55;
                            MapTabContent$lambda$56$lambda$55 = MapTabContentKt.MapTabContent$lambda$56$lambda$55();
                            return MapTabContent$lambda$56$lambda$55;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue19);
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState20 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr12, (Saver) null, (String) null, (Function0) rememberedValue19, startRestartGroup, 3072, 6);
                Object[] objArr13 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117371712);
                rememberedValue20 = startRestartGroup.rememberedValue();
                if (rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue20 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$60$lambda$59;
                            MapTabContent$lambda$60$lambda$59 = MapTabContentKt.MapTabContent$lambda$60$lambda$59();
                            return MapTabContent$lambda$60$lambda$59;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue20);
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState21 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr13, (Saver) null, (String) null, (Function0) rememberedValue20, startRestartGroup, 3072, 6);
                Object[] objArr14 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117369441);
                rememberedValue21 = startRestartGroup.rememberedValue();
                if (rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue21 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$64$lambda$63;
                            MapTabContent$lambda$64$lambda$63 = MapTabContentKt.MapTabContent$lambda$64$lambda$63();
                            return MapTabContent$lambda$64$lambda$63;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue21);
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState22 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr14, (Saver) null, (String) null, (Function0) rememberedValue21, startRestartGroup, 3072, 6);
                Object[] objArr15 = new Object[0];
                startRestartGroup.startReplaceGroup(-2117366912);
                rememberedValue22 = startRestartGroup.rememberedValue();
                if (rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue22 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$68$lambda$67;
                            MapTabContent$lambda$68$lambda$67 = MapTabContentKt.MapTabContent$lambda$68$lambda$67();
                            return MapTabContent$lambda$68$lambda$67;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue22);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState23 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr15, (Saver) null, (String) null, (Function0) rememberedValue22, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(-2117365239);
                rememberedValue23 = startRestartGroup.rememberedValue();
                if (rememberedValue23 != Composer.INSTANCE.getEmpty()) {
                    i9 = 0;
                    rememberedValue23 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue23);
                } else {
                    i9 = 0;
                }
                final MutableState mutableState24 = (MutableState) rememberedValue23;
                startRestartGroup.endReplaceGroup();
                Object[] objArr16 = new Object[i9];
                startRestartGroup.startReplaceGroup(-2117362943);
                rememberedValue24 = startRestartGroup.rememberedValue();
                if (rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue24 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState MapTabContent$lambda$75$lambda$74;
                            MapTabContent$lambda$75$lambda$74 = MapTabContentKt.MapTabContent$lambda$75$lambda$74();
                            return MapTabContent$lambda$75$lambda$74;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue24);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState25 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr16, (Saver) null, (String) null, (Function0) rememberedValue24, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(-2117357742);
                changedInstance2 = ((i5 & 3670016) != 1048576) | startRestartGroup.changedInstance(repository);
                rememberedValue25 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                    modifier4 = modifier3;
                    mutableState4 = mutableState;
                    rememberedValue25 = (Function2) new MapTabContentKt$MapTabContent$1$1(l, mutableState, mutableState2, repository, null);
                    startRestartGroup.updateRememberedValue(rememberedValue25);
                } else {
                    modifier4 = modifier3;
                    mutableState4 = mutableState;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(l, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue25, startRestartGroup, (i5 >> 18) & 14);
                ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
                startRestartGroup.startReplaceGroup(-2117343936);
                changedInstance3 = startRestartGroup.changedInstance(osMapKit) | startRestartGroup.changed(mutableState22) | startRestartGroup.changedInstance(context);
                rememberedValue26 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue26 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit MapTabContent$lambda$81$lambda$80;
                            MapTabContent$lambda$81$lambda$80 = MapTabContentKt.MapTabContent$lambda$81$lambda$80(context, osMapKit, mutableState22, ((Boolean) obj).booleanValue());
                            return MapTabContent$lambda$81$lambda$80;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue26);
                }
                startRestartGroup.endReplaceGroup();
                ManagedActivityResultLauncher rememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) rememberedValue26, startRestartGroup, 0);
                ActivityResultContracts.OpenDocument openDocument2 = new ActivityResultContracts.OpenDocument();
                startRestartGroup.startReplaceGroup(-2117330361);
                changedInstance4 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(context);
                rememberedValue27 = startRestartGroup.rememberedValue();
                if (!changedInstance4 || rememberedValue27 == Composer.INSTANCE.getEmpty()) {
                    mutableState5 = mutableState2;
                    rememberedValue27 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit MapTabContent$lambda$83$lambda$82;
                            MapTabContent$lambda$83$lambda$82 = MapTabContentKt.MapTabContent$lambda$83$lambda$82(CoroutineScope.this, mutableState4, mutableState5, context, (Uri) obj);
                            return MapTabContent$lambda$83$lambda$82;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue27);
                } else {
                    mutableState5 = mutableState2;
                }
                startRestartGroup.endReplaceGroup();
                ManagedActivityResultLauncher rememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(openDocument2, (Function1) rememberedValue27, startRestartGroup, 0);
                SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(MapTabContent$lambda$17(mutableState12)), startRestartGroup, 0);
                ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                Boolean valueOf = Boolean.valueOf(MapTabContent$lambda$65(mutableState22));
                Boolean valueOf2 = Boolean.valueOf(MapTabContent$lambda$69(mutableState23));
                startRestartGroup.startReplaceGroup(-2117303723);
                changed3 = startRestartGroup.changed(mutableState22) | startRestartGroup.changedInstance(context) | startRestartGroup.changed(mutableState23) | startRestartGroup.changedInstance(osMapKit);
                mutableState6 = mutableState5;
                rememberedValue28 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue28 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue28 = (Function2) new MapTabContentKt$MapTabContent$2$1(context, mutableState22, mutableState23, osMapKit, null);
                    startRestartGroup.updateRememberedValue(rememberedValue28);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf, valueOf2, osMapKit, (Function2) rememberedValue28, startRestartGroup, 0);
                Boolean valueOf3 = Boolean.valueOf(MapTabContent$lambda$17(mutableState12));
                startRestartGroup.startReplaceGroup(-2117262505);
                changed4 = startRestartGroup.changed(density) | startRestartGroup.changed(mutableState12) | startRestartGroup.changedInstance(osMapKit);
                rememberedValue29 = startRestartGroup.rememberedValue();
                if (!changed4 || rememberedValue29 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue29 = (Function2) new MapTabContentKt$MapTabContent$3$1(density, osMapKit, mutableState12, null);
                    startRestartGroup.updateRememberedValue(rememberedValue29);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue29, startRestartGroup, 0);
                List<GeoPoint> MapTabContent$lambda$6 = MapTabContent$lambda$6(mutableState6);
                startRestartGroup.startReplaceGroup(-2117252919);
                changedInstance5 = startRestartGroup.changedInstance(osMapKit);
                rememberedValue30 = startRestartGroup.rememberedValue();
                if (!changedInstance5 || rememberedValue30 == Composer.INSTANCE.getEmpty()) {
                    mutableState7 = mutableState6;
                    rememberedValue30 = (Function2) new MapTabContentKt$MapTabContent$4$1(osMapKit, mutableState7, null);
                    startRestartGroup.updateRememberedValue(rememberedValue30);
                } else {
                    mutableState7 = mutableState6;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(MapTabContent$lambda$6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue30, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-2117248194);
                changedInstance6 = ((i5 & 14) != 4) | ((i5 & SdkConfig.SDK_VERSION) != 32) | startRestartGroup.changedInstance(osMapKit);
                rememberedValue31 = startRestartGroup.rememberedValue();
                if (!changedInstance6 || rememberedValue31 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue31 = (Function2) new MapTabContentKt$MapTabContent$5$1(d, d2, osMapKit, null);
                    startRestartGroup.updateRememberedValue(rememberedValue31);
                }
                startRestartGroup.endReplaceGroup();
                mutableState8 = mutableState7;
                EffectsKt.LaunchedEffect(d, d2, osMapKit, (Function2) rememberedValue31, startRestartGroup, i5 & WebSocketProtocol.PAYLOAD_SHORT);
                startRestartGroup.startReplaceGroup(-2117235072);
                rememberedValue32 = startRestartGroup.rememberedValue();
                if (rememberedValue32 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue32 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue32);
                }
                mutableState9 = (MutableState) rememberedValue32;
                startRestartGroup.endReplaceGroup();
                Long MapTabContent$lambda$53 = MapTabContent$lambda$53(mutableState19);
                startRestartGroup.startReplaceGroup(-2117228726);
                changed5 = startRestartGroup.changed(mutableState19) | startRestartGroup.changed(mutableState21) | startRestartGroup.changed(mutableState20) | startRestartGroup.changed(mutableState11) | startRestartGroup.changed(mutableState14) | startRestartGroup.changedInstance(context);
                rememberedValue33 = startRestartGroup.rememberedValue();
                if (!changed5 || rememberedValue33 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue33 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DisposableEffectResult MapTabContent$lambda$95$lambda$94;
                            MapTabContent$lambda$95$lambda$94 = MapTabContentKt.MapTabContent$lambda$95$lambda$94(context, mutableState19, mutableState21, mutableState20, mutableState11, mutableState14, (DisposableEffectScope) obj);
                            return MapTabContent$lambda$95$lambda$94;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue33);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(context, MapTabContent$lambda$53, (Function1) rememberedValue33, startRestartGroup, 0);
                Boolean valueOf4 = Boolean.valueOf(MapTabContent$lambda$29(mutableState14));
                String MapTabContent$lambda$13 = MapTabContent$lambda$13(mutableState11);
                startRestartGroup.startReplaceGroup(-2117192795);
                changed6 = startRestartGroup.changed(mutableState14) | startRestartGroup.changed(mutableState11) | startRestartGroup.changed(mutableState17) | startRestartGroup.changed(mutableState16) | startRestartGroup.changedInstance(mapView) | startRestartGroup.changedInstance(context);
                rememberedValue34 = startRestartGroup.rememberedValue();
                if (!changed6 || rememberedValue34 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue34 = (Function2) new MapTabContentKt$MapTabContent$7$1(context, mapView, mutableState14, mutableState11, mutableState17, mutableState16, mutableState9, null);
                    startRestartGroup.updateRememberedValue(rememberedValue34);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf4, MapTabContent$lambda$13, (Function2) rememberedValue34, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-2117113351);
                rememberedValue35 = startRestartGroup.rememberedValue();
                if (rememberedValue35 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue35 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DisposableEffectResult MapTabContent$lambda$99$lambda$98;
                            MapTabContent$lambda$99$lambda$98 = MapTabContentKt.MapTabContent$lambda$99$lambda$98(MutableState.this, (DisposableEffectScope) obj);
                            return MapTabContent$lambda$99$lambda$98;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue35);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(mapView, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue35, startRestartGroup, 48);
                startRestartGroup.startReplaceGroup(-2117104572);
                changed7 = startRestartGroup.changed(mapView);
                rememberedValue36 = startRestartGroup.rememberedValue();
                if (!changed7 || rememberedValue36 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue36 = new InternalCompassOrientationProvider(context);
                    startRestartGroup.updateRememberedValue(rememberedValue36);
                }
                final InternalCompassOrientationProvider internalCompassOrientationProvider = (InternalCompassOrientationProvider) rememberedValue36;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-2117101426);
                changedInstance7 = startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(internalCompassOrientationProvider) | startRestartGroup.changedInstance(mapView);
                rememberedValue37 = startRestartGroup.rememberedValue();
                if (!changedInstance7 || rememberedValue37 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue37 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DisposableEffectResult MapTabContent$lambda$104$lambda$103;
                            MapTabContent$lambda$104$lambda$103 = MapTabContentKt.MapTabContent$lambda$104$lambda$103(context, internalCompassOrientationProvider, mapView, (DisposableEffectScope) obj);
                            return MapTabContent$lambda$104$lambda$103;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue37);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(mapView, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue37, startRestartGroup, 0);
                Boolean valueOf5 = Boolean.valueOf(MapTabContent$lambda$17(mutableState12));
                startRestartGroup.startReplaceGroup(-2117091345);
                changed8 = startRestartGroup.changed(mutableState12) | startRestartGroup.changedInstance(mapView) | startRestartGroup.changedInstance(internalCompassOrientationProvider);
                rememberedValue38 = startRestartGroup.rememberedValue();
                if (!changed8 || rememberedValue38 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue38 = (Function2) new MapTabContentKt$MapTabContent$10$1(mapView, internalCompassOrientationProvider, mutableState12, null);
                    startRestartGroup.updateRememberedValue(rememberedValue38);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf5, mapView, internalCompassOrientationProvider, (Function2) rememberedValue38, startRestartGroup, 0);
                Boolean valueOf6 = Boolean.valueOf(MapTabContent$lambda$37(mutableState15));
                startRestartGroup.startReplaceGroup(-2117065260);
                changed9 = startRestartGroup.changed(mutableState15) | startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(mapView);
                rememberedValue39 = startRestartGroup.rememberedValue();
                if (!changed9 || rememberedValue39 == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState26 = mutableState4;
                    rememberedValue39 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DisposableEffectResult MapTabContent$lambda$108$lambda$107;
                            MapTabContent$lambda$108$lambda$107 = MapTabContentKt.MapTabContent$lambda$108$lambda$107(MapView.this, mutableState8, mutableState26, coroutineScope, mutableState15, mutableState24, (DisposableEffectScope) obj);
                            return MapTabContent$lambda$108$lambda$107;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue39);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(valueOf6, mapView, (Function1) rememberedValue39, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-2116841500);
                changedInstance8 = startRestartGroup.changedInstance(mapView);
                rememberedValue40 = startRestartGroup.rememberedValue();
                if (!changedInstance8 || rememberedValue40 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue40 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DisposableEffectResult MapTabContent$lambda$111$lambda$110;
                            MapTabContent$lambda$111$lambda$110 = MapTabContentKt.MapTabContent$lambda$111$lambda$110(MapView.this, (DisposableEffectScope) obj);
                            return MapTabContent$lambda$111$lambda$110;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue40);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(mapView, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue40, startRestartGroup, 0);
                Modifier modifier6 = modifier4;
                CardKt.Card(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null), 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1817327548, true, new MapTabContentKt$MapTabContent$13(rememberScrollState, z, l, osMapKit, mutableState15, context, rememberLauncherForActivityResult2, mutableState23, mutableState22, routes, onSelectFollowRoute, mutableState12, str, mutableState10, mutableState8, mutableState18, d, d2, mutableState25, mutableState13, mutableState3, rememberLauncherForActivityResult, rememberLauncherForActivityResult3, mutableState14, mutableState11, mutableState20, mutableState21, mutableState16, mutableState19, mapView, mutableState24, coroutineScope, mutableState8, mutableState4, state, vm), startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                if (MapTabContent$lambda$21(mutableState3)) {
                    composer2 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceGroup(-2116194496);
                    boolean changed10 = startRestartGroup.changed(mutableState3);
                    Object rememberedValue41 = startRestartGroup.rememberedValue();
                    if (changed10 || rememberedValue41 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue41 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit MapTabContent$lambda$113$lambda$112;
                                MapTabContent$lambda$113$lambda$112 = MapTabContentKt.MapTabContent$lambda$113$lambda$112(MutableState.this);
                                return MapTabContent$lambda$113$lambda$112;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue41);
                    }
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue41, ComposableLambdaKt.rememberComposableLambda(354099075, true, new MapTabContentKt$MapTabContent$15(mutableState3, mutableState13, vm, mutableState8), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-1726484603, true, new MapTabContentKt$MapTabContent$16(mutableState3), startRestartGroup, 54), null, ComposableSingletons$MapTabContentKt.INSTANCE.m7226getLambda22$app_sideload(), ComposableLambdaKt.rememberComposableLambda(-552392824, true, new MapTabContentKt$MapTabContent$17(mutableState13), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1772592, 0, 16276);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MapTabContent$lambda$114;
                        MapTabContent$lambda$114 = MapTabContentKt.MapTabContent$lambda$114(d, d2, j, d3, j2, z, l, str, onSelectFollowRoute, routes, vm, modifier5, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return MapTabContent$lambda$114;
                    }
                });
                return;
            }
            return;
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i5 = i4;
        if ((i3 & 1024) == 0) {
        }
        i7 = i3 & 2048;
        if (i7 == 0) {
        }
        if ((i5 & 306774035) == 306774034) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Object[] objArr17 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117482592);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        MutableState mutableState102 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr17, (Saver) null, (String) null, (Function0) rememberedValue, startRestartGroup, 3072, 6);
        startRestartGroup.startReplaceGroup(-2117475914);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 != Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-2117473802);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-2117469640);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        State state2 = (State) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context2 = (Context) consume3;
        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localDensity2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density2 = (Density) consume22;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue5).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(-2117460916);
        changed = startRestartGroup.changed(context2);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue6 = Repository.INSTANCE.get(context2);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        Repository repository2 = (Repository) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        Object[] objArr22 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117458360);
        rememberedValue7 = startRestartGroup.rememberedValue();
        modifier3 = companion;
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState112 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) rememberedValue7, startRestartGroup, 3072, 6);
        Object[] objArr32 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117456064);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        MutableState mutableState122 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr32, (Saver) null, (String) null, (Function0) rememberedValue8, startRestartGroup, 3072, 6);
        Object[] objArr42 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117453888);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        mutableState3 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr42, (Saver) null, (String) null, (Function0) rememberedValue9, startRestartGroup, 3072, 6);
        Object[] objArr52 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117451843);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        MutableState mutableState132 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr52, (Saver) null, (String) null, (Function0) rememberedValue10, startRestartGroup, 3072, 6);
        Object[] objArr62 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117449792);
        rememberedValue11 = startRestartGroup.rememberedValue();
        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState142 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr62, (Saver) null, (String) null, (Function0) rememberedValue11, startRestartGroup, 3072, 6);
        ActivityResultContracts.OpenDocument openDocument3 = new ActivityResultContracts.OpenDocument();
        startRestartGroup.startReplaceGroup(-2117444329);
        changedInstance = startRestartGroup.changedInstance(context2) | startRestartGroup.changed(mutableState112) | startRestartGroup.changed(mutableState142);
        rememberedValue12 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue12 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MapTabContent$lambda$32$lambda$31;
                MapTabContent$lambda$32$lambda$31 = MapTabContentKt.MapTabContent$lambda$32$lambda$31(context2, mutableState112, mutableState142, (Uri) obj);
                return MapTabContent$lambda$32$lambda$31;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue12);
        startRestartGroup.endReplaceGroup();
        ManagedActivityResultLauncher rememberLauncherForActivityResult4 = ActivityResultRegistryKt.rememberLauncherForActivityResult(openDocument3, (Function1) rememberedValue12, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-2117424436);
        changed2 = startRestartGroup.changed(context2);
        rememberedValue13 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue13 = MapOsMapKitKt.createOsMapKit(context2);
        startRestartGroup.updateRememberedValue(rememberedValue13);
        final OsMapKit osMapKit2 = (OsMapKit) rememberedValue13;
        startRestartGroup.endReplaceGroup();
        final MapView mapView2 = osMapKit2.getMapView();
        Object[] objArr72 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117385984);
        rememberedValue14 = startRestartGroup.rememberedValue();
        if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState152 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr72, (Saver) null, (String) null, (Function0) rememberedValue14, startRestartGroup, 3072, 6);
        Object[] objArr82 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117383801);
        rememberedValue15 = startRestartGroup.rememberedValue();
        if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        MutableState mutableState162 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr82, (Saver) null, (String) null, (Function0) rememberedValue15, startRestartGroup, 3072, 6);
        Object[] objArr92 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117381408);
        rememberedValue16 = startRestartGroup.rememberedValue();
        if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        MutableState mutableState172 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr92, (Saver) null, (String) null, (Function0) rememberedValue16, startRestartGroup, 3072, 6);
        Object[] objArr102 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117379075);
        rememberedValue17 = startRestartGroup.rememberedValue();
        if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        MutableState mutableState182 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr102, (Saver) null, (String) null, (Function0) rememberedValue17, startRestartGroup, 3072, 6);
        Object[] objArr112 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117376858);
        rememberedValue18 = startRestartGroup.rememberedValue();
        if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState192 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr112, (Saver) null, (String) null, (Function0) rememberedValue18, startRestartGroup, 3072, 6);
        Object[] objArr122 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117374296);
        rememberedValue19 = startRestartGroup.rememberedValue();
        if (rememberedValue19 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState202 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr122, (Saver) null, (String) null, (Function0) rememberedValue19, startRestartGroup, 3072, 6);
        Object[] objArr132 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117371712);
        rememberedValue20 = startRestartGroup.rememberedValue();
        if (rememberedValue20 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState212 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr132, (Saver) null, (String) null, (Function0) rememberedValue20, startRestartGroup, 3072, 6);
        Object[] objArr142 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117369441);
        rememberedValue21 = startRestartGroup.rememberedValue();
        if (rememberedValue21 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState222 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr142, (Saver) null, (String) null, (Function0) rememberedValue21, startRestartGroup, 3072, 6);
        Object[] objArr152 = new Object[0];
        startRestartGroup.startReplaceGroup(-2117366912);
        rememberedValue22 = startRestartGroup.rememberedValue();
        if (rememberedValue22 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        MutableState mutableState232 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr152, (Saver) null, (String) null, (Function0) rememberedValue22, startRestartGroup, 3072, 6);
        startRestartGroup.startReplaceGroup(-2117365239);
        rememberedValue23 = startRestartGroup.rememberedValue();
        if (rememberedValue23 != Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState242 = (MutableState) rememberedValue23;
        startRestartGroup.endReplaceGroup();
        Object[] objArr162 = new Object[i9];
        startRestartGroup.startReplaceGroup(-2117362943);
        rememberedValue24 = startRestartGroup.rememberedValue();
        if (rememberedValue24 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        MutableState mutableState252 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr162, (Saver) null, (String) null, (Function0) rememberedValue24, startRestartGroup, 3072, 6);
        startRestartGroup.startReplaceGroup(-2117357742);
        changedInstance2 = ((i5 & 3670016) != 1048576) | startRestartGroup.changedInstance(repository2);
        rememberedValue25 = startRestartGroup.rememberedValue();
        if (changedInstance2) {
        }
        modifier4 = modifier3;
        mutableState4 = mutableState;
        rememberedValue25 = (Function2) new MapTabContentKt$MapTabContent$1$1(l, mutableState, mutableState2, repository2, null);
        startRestartGroup.updateRememberedValue(rememberedValue25);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(l, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue25, startRestartGroup, (i5 >> 18) & 14);
        ActivityResultContracts.RequestPermission requestPermission2 = new ActivityResultContracts.RequestPermission();
        startRestartGroup.startReplaceGroup(-2117343936);
        changedInstance3 = startRestartGroup.changedInstance(osMapKit2) | startRestartGroup.changed(mutableState222) | startRestartGroup.changedInstance(context2);
        rememberedValue26 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue26 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MapTabContent$lambda$81$lambda$80;
                MapTabContent$lambda$81$lambda$80 = MapTabContentKt.MapTabContent$lambda$81$lambda$80(context2, osMapKit2, mutableState222, ((Boolean) obj).booleanValue());
                return MapTabContent$lambda$81$lambda$80;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue26);
        startRestartGroup.endReplaceGroup();
        ManagedActivityResultLauncher rememberLauncherForActivityResult22 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission2, (Function1) rememberedValue26, startRestartGroup, 0);
        ActivityResultContracts.OpenDocument openDocument22 = new ActivityResultContracts.OpenDocument();
        startRestartGroup.startReplaceGroup(-2117330361);
        changedInstance4 = startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(context2);
        rememberedValue27 = startRestartGroup.rememberedValue();
        if (changedInstance4) {
        }
        mutableState5 = mutableState2;
        rememberedValue27 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit MapTabContent$lambda$83$lambda$82;
                MapTabContent$lambda$83$lambda$82 = MapTabContentKt.MapTabContent$lambda$83$lambda$82(CoroutineScope.this, mutableState4, mutableState5, context2, (Uri) obj);
                return MapTabContent$lambda$83$lambda$82;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue27);
        startRestartGroup.endReplaceGroup();
        ManagedActivityResultLauncher rememberLauncherForActivityResult32 = ActivityResultRegistryKt.rememberLauncherForActivityResult(openDocument22, (Function1) rememberedValue27, startRestartGroup, 0);
        SnapshotStateKt.rememberUpdatedState(Boolean.valueOf(MapTabContent$lambda$17(mutableState122)), startRestartGroup, 0);
        ScrollState rememberScrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
        Boolean valueOf7 = Boolean.valueOf(MapTabContent$lambda$65(mutableState222));
        Boolean valueOf22 = Boolean.valueOf(MapTabContent$lambda$69(mutableState232));
        startRestartGroup.startReplaceGroup(-2117303723);
        changed3 = startRestartGroup.changed(mutableState222) | startRestartGroup.changedInstance(context2) | startRestartGroup.changed(mutableState232) | startRestartGroup.changedInstance(osMapKit2);
        mutableState6 = mutableState5;
        rememberedValue28 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue28 = (Function2) new MapTabContentKt$MapTabContent$2$1(context2, mutableState222, mutableState232, osMapKit2, null);
        startRestartGroup.updateRememberedValue(rememberedValue28);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf7, valueOf22, osMapKit2, (Function2) rememberedValue28, startRestartGroup, 0);
        Boolean valueOf32 = Boolean.valueOf(MapTabContent$lambda$17(mutableState122));
        startRestartGroup.startReplaceGroup(-2117262505);
        changed4 = startRestartGroup.changed(density2) | startRestartGroup.changed(mutableState122) | startRestartGroup.changedInstance(osMapKit2);
        rememberedValue29 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue29 = (Function2) new MapTabContentKt$MapTabContent$3$1(density2, osMapKit2, mutableState122, null);
        startRestartGroup.updateRememberedValue(rememberedValue29);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue29, startRestartGroup, 0);
        List<GeoPoint> MapTabContent$lambda$62 = MapTabContent$lambda$6(mutableState6);
        startRestartGroup.startReplaceGroup(-2117252919);
        changedInstance5 = startRestartGroup.changedInstance(osMapKit2);
        rememberedValue30 = startRestartGroup.rememberedValue();
        if (changedInstance5) {
        }
        mutableState7 = mutableState6;
        rememberedValue30 = (Function2) new MapTabContentKt$MapTabContent$4$1(osMapKit2, mutableState7, null);
        startRestartGroup.updateRememberedValue(rememberedValue30);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(MapTabContent$lambda$62, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue30, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-2117248194);
        changedInstance6 = ((i5 & 14) != 4) | ((i5 & SdkConfig.SDK_VERSION) != 32) | startRestartGroup.changedInstance(osMapKit2);
        rememberedValue31 = startRestartGroup.rememberedValue();
        if (!changedInstance6) {
        }
        rememberedValue31 = (Function2) new MapTabContentKt$MapTabContent$5$1(d, d2, osMapKit2, null);
        startRestartGroup.updateRememberedValue(rememberedValue31);
        startRestartGroup.endReplaceGroup();
        mutableState8 = mutableState7;
        EffectsKt.LaunchedEffect(d, d2, osMapKit2, (Function2) rememberedValue31, startRestartGroup, i5 & WebSocketProtocol.PAYLOAD_SHORT);
        startRestartGroup.startReplaceGroup(-2117235072);
        rememberedValue32 = startRestartGroup.rememberedValue();
        if (rememberedValue32 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState9 = (MutableState) rememberedValue32;
        startRestartGroup.endReplaceGroup();
        Long MapTabContent$lambda$532 = MapTabContent$lambda$53(mutableState192);
        startRestartGroup.startReplaceGroup(-2117228726);
        changed5 = startRestartGroup.changed(mutableState192) | startRestartGroup.changed(mutableState212) | startRestartGroup.changed(mutableState202) | startRestartGroup.changed(mutableState112) | startRestartGroup.changed(mutableState142) | startRestartGroup.changedInstance(context2);
        rememberedValue33 = startRestartGroup.rememberedValue();
        if (!changed5) {
        }
        rememberedValue33 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult MapTabContent$lambda$95$lambda$94;
                MapTabContent$lambda$95$lambda$94 = MapTabContentKt.MapTabContent$lambda$95$lambda$94(context2, mutableState192, mutableState212, mutableState202, mutableState112, mutableState142, (DisposableEffectScope) obj);
                return MapTabContent$lambda$95$lambda$94;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue33);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(context2, MapTabContent$lambda$532, (Function1) rememberedValue33, startRestartGroup, 0);
        Boolean valueOf42 = Boolean.valueOf(MapTabContent$lambda$29(mutableState142));
        String MapTabContent$lambda$132 = MapTabContent$lambda$13(mutableState112);
        startRestartGroup.startReplaceGroup(-2117192795);
        changed6 = startRestartGroup.changed(mutableState142) | startRestartGroup.changed(mutableState112) | startRestartGroup.changed(mutableState172) | startRestartGroup.changed(mutableState162) | startRestartGroup.changedInstance(mapView2) | startRestartGroup.changedInstance(context2);
        rememberedValue34 = startRestartGroup.rememberedValue();
        if (!changed6) {
        }
        rememberedValue34 = (Function2) new MapTabContentKt$MapTabContent$7$1(context2, mapView2, mutableState142, mutableState112, mutableState172, mutableState162, mutableState9, null);
        startRestartGroup.updateRememberedValue(rememberedValue34);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf42, MapTabContent$lambda$132, (Function2) rememberedValue34, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-2117113351);
        rememberedValue35 = startRestartGroup.rememberedValue();
        if (rememberedValue35 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(mapView2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue35, startRestartGroup, 48);
        startRestartGroup.startReplaceGroup(-2117104572);
        changed7 = startRestartGroup.changed(mapView2);
        rememberedValue36 = startRestartGroup.rememberedValue();
        if (!changed7) {
        }
        rememberedValue36 = new InternalCompassOrientationProvider(context2);
        startRestartGroup.updateRememberedValue(rememberedValue36);
        final InternalCompassOrientationProvider internalCompassOrientationProvider2 = (InternalCompassOrientationProvider) rememberedValue36;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-2117101426);
        changedInstance7 = startRestartGroup.changedInstance(context2) | startRestartGroup.changedInstance(internalCompassOrientationProvider2) | startRestartGroup.changedInstance(mapView2);
        rememberedValue37 = startRestartGroup.rememberedValue();
        if (!changedInstance7) {
        }
        rememberedValue37 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult MapTabContent$lambda$104$lambda$103;
                MapTabContent$lambda$104$lambda$103 = MapTabContentKt.MapTabContent$lambda$104$lambda$103(context2, internalCompassOrientationProvider2, mapView2, (DisposableEffectScope) obj);
                return MapTabContent$lambda$104$lambda$103;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue37);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(mapView2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue37, startRestartGroup, 0);
        Boolean valueOf52 = Boolean.valueOf(MapTabContent$lambda$17(mutableState122));
        startRestartGroup.startReplaceGroup(-2117091345);
        changed8 = startRestartGroup.changed(mutableState122) | startRestartGroup.changedInstance(mapView2) | startRestartGroup.changedInstance(internalCompassOrientationProvider2);
        rememberedValue38 = startRestartGroup.rememberedValue();
        if (!changed8) {
        }
        rememberedValue38 = (Function2) new MapTabContentKt$MapTabContent$10$1(mapView2, internalCompassOrientationProvider2, mutableState122, null);
        startRestartGroup.updateRememberedValue(rememberedValue38);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf52, mapView2, internalCompassOrientationProvider2, (Function2) rememberedValue38, startRestartGroup, 0);
        Boolean valueOf62 = Boolean.valueOf(MapTabContent$lambda$37(mutableState152));
        startRestartGroup.startReplaceGroup(-2117065260);
        changed9 = startRestartGroup.changed(mutableState152) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(mapView2);
        rememberedValue39 = startRestartGroup.rememberedValue();
        if (!changed9) {
        }
        final MutableState mutableState262 = mutableState4;
        rememberedValue39 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult MapTabContent$lambda$108$lambda$107;
                MapTabContent$lambda$108$lambda$107 = MapTabContentKt.MapTabContent$lambda$108$lambda$107(MapView.this, mutableState8, mutableState262, coroutineScope2, mutableState152, mutableState242, (DisposableEffectScope) obj);
                return MapTabContent$lambda$108$lambda$107;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue39);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(valueOf62, mapView2, (Function1) rememberedValue39, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-2116841500);
        changedInstance8 = startRestartGroup.changedInstance(mapView2);
        rememberedValue40 = startRestartGroup.rememberedValue();
        if (!changedInstance8) {
        }
        rememberedValue40 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult MapTabContent$lambda$111$lambda$110;
                MapTabContent$lambda$111$lambda$110 = MapTabContentKt.MapTabContent$lambda$111$lambda$110(MapView.this, (DisposableEffectScope) obj);
                return MapTabContent$lambda$111$lambda$110;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue40);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(mapView2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue40, startRestartGroup, 0);
        Modifier modifier62 = modifier4;
        CardKt.Card(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(modifier62, 0.0f, 1, null), 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1817327548, true, new MapTabContentKt$MapTabContent$13(rememberScrollState2, z, l, osMapKit2, mutableState152, context2, rememberLauncherForActivityResult22, mutableState232, mutableState222, routes, onSelectFollowRoute, mutableState122, str, mutableState102, mutableState8, mutableState182, d, d2, mutableState252, mutableState132, mutableState3, rememberLauncherForActivityResult4, rememberLauncherForActivityResult32, mutableState142, mutableState112, mutableState202, mutableState212, mutableState162, mutableState192, mapView2, mutableState242, coroutineScope2, mutableState8, mutableState4, state2, vm), startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        if (MapTabContent$lambda$21(mutableState3)) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier5 = modifier62;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$1$lambda$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapTabContent$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapTabContent$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GeoPoint> MapTabContent$lambda$6(MutableState<List<GeoPoint>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapTabContent$lambda$8$lambda$7(MutableState mutableState, MutableState mutableState2) {
        return OsrmWalkingRouter.anchorsForSnap$default(OsrmWalkingRouter.INSTANCE, (List) mutableState.getValue(), (List) mutableState2.getValue(), 0, 4, null).size() >= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$12$lambda$11() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MapTabContent$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$16$lambda$15() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapTabContent$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapTabContent$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$20$lambda$19() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean MapTabContent$lambda$21(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapTabContent$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$24$lambda$23() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MapTabContent$lambda$25(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$28$lambda$27() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapTabContent$lambda$29(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapTabContent$lambda$30(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapTabContent$lambda$32$lambda$31(Context context, MutableState mutableState, MutableState mutableState2, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        try {
            context.getContentResolver().takePersistableUriPermission(uri, 1);
        } catch (Exception unused) {
        }
        try {
            mutableState.setValue(uri.toString());
            MapTabContent$lambda$30(mutableState2, true);
            Toast.makeText(context, "Offline map selected (copying on load).", 0).show();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            Toast.makeText(context, "Import failed: " + message, 1).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double MapTabContent$offRouteMeters(GeoPoint geoPoint, List<? extends GeoPoint> list) {
        if (list.size() < 2) {
            return null;
        }
        int size = list.size();
        double d = Double.POSITIVE_INFINITY;
        for (int i = 1; i < size; i++) {
            double MapTabContent$offRouteMeters$distPointToSegmentM = MapTabContent$offRouteMeters$distPointToSegmentM(geoPoint, list.get(i - 1), list.get(i));
            if (MapTabContent$offRouteMeters$distPointToSegmentM < d) {
                d = MapTabContent$offRouteMeters$distPointToSegmentM;
            }
        }
        Double valueOf = Double.valueOf(d);
        double doubleValue = valueOf.doubleValue();
        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
            return null;
        }
        return valueOf;
    }

    private static final double MapTabContent$offRouteMeters$distPointToSegmentM(GeoPoint geoPoint, GeoPoint geoPoint2, GeoPoint geoPoint3) {
        double longitude = geoPoint2.getLongitude();
        double latitude = geoPoint2.getLatitude();
        double longitude2 = geoPoint3.getLongitude();
        double d = longitude2 - longitude;
        double latitude2 = geoPoint3.getLatitude() - latitude;
        double d2 = (d * d) + (latitude2 * latitude2);
        double coerceIn = d2 > 0.0d ? RangesKt.coerceIn((((geoPoint.getLongitude() - longitude) * d) + ((geoPoint.getLatitude() - latitude) * latitude2)) / d2, 0.0d, 1.0d) : 0.0d;
        return distanceM(new GeoPoint(latitude + (latitude2 * coerceIn), longitude + (d * coerceIn)), geoPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$36$lambda$35() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapTabContent$lambda$37(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapTabContent$lambda$38(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$40$lambda$39() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("not loaded", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$44$lambda$43() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapTabContent$lambda$46(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$48$lambda$47() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MapTabContent$lambda$49(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$52$lambda$51() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long MapTabContent$lambda$53(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$56$lambda$55() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MapTabContent$lambda$57(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$60$lambda$59() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapTabContent$lambda$61(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapTabContent$lambda$62(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$64$lambda$63() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapTabContent$lambda$65(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapTabContent$lambda$66(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$68$lambda$67() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapTabContent$lambda$69(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapTabContent$lambda$70(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapTabContent$lambda$72(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapTabContent$lambda$73(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState MapTabContent$lambda$75$lambda$74() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("6:00", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String MapTabContent$lambda$76(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapTabContent$lambda$81$lambda$80(Context context, OsMapKit osMapKit, MutableState mutableState, boolean z) {
        if (z) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Result.m7905constructorimpl(Boolean.valueOf(osMapKit.getLocationOverlay().enableMyLocation()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            MapTabContent$lambda$66(mutableState, true);
        } else {
            Toast.makeText(context, "Location permission is required for My location.", 1).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapTabContent$lambda$83$lambda$82(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Context context, Uri uri) {
        if (uri != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MapTabContentKt$MapTabContent$pickGpxRouteLauncher$1$1$1(mutableState, mutableState2, context, uri, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapsForgeTileProvider MapTabContent$lambda$89(MutableState<MapsForgeTileProvider> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.example.rungps.ui.main.MapTabContentKt$MapTabContent$6$1$r$1] */
    public static final DisposableEffectResult MapTabContent$lambda$95$lambda$94(final Context context, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, final MutableState mutableState5, final DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Long MapTabContent$lambda$53 = MapTabContent$lambda$53(mutableState);
        if (MapTabContent$lambda$53 != null) {
            final ?? r0 = new BroadcastReceiver() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$6$1$r$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    String MapTabContent$lambda$57;
                    if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.DOWNLOAD_COMPLETE")) {
                        long longExtra = intent.getLongExtra("extra_download_id", -1L);
                        Long l = MapTabContent$lambda$53;
                        if (l != null && longExtra == l.longValue()) {
                            MapTabContentKt.MapTabContent$lambda$62(mutableState2, false);
                            MapTabContent$lambda$57 = MapTabContentKt.MapTabContent$lambda$57(mutableState3);
                            if (MapTabContent$lambda$57 != null) {
                                mutableState4.setValue(Uri.fromFile(new File(MapTabContent$lambda$57)).toString());
                                MapTabContentKt.MapTabContent$lambda$30(mutableState5, true);
                                Toast.makeText(context, "Offline map downloaded.", 0).show();
                            }
                            mutableState.setValue(null);
                        }
                    }
                }
            };
            context.registerReceiver((BroadcastReceiver) r0, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
            return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$lambda$95$lambda$94$$inlined$onDispose$2
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        context.unregisterReceiver(r0);
                        Result.m7905constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th));
                    }
                }
            };
        }
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$lambda$95$lambda$94$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MapTabContent$lambda$104$lambda$103(Context context, InternalCompassOrientationProvider internalCompassOrientationProvider, final MapView mapView, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final CompassOverlay compassOverlay = new CompassOverlay(context, internalCompassOrientationProvider, mapView);
        compassOverlay.enableCompass();
        mapView.getOverlays().add(compassOverlay);
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$lambda$104$lambda$103$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                CompassOverlay.this.disableCompass();
                mapView.getOverlays().remove(CompassOverlay.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MapTabContent$lambda$108$lambda$107(final MapView mapView, final MutableState mutableState, final MutableState mutableState2, final CoroutineScope coroutineScope, final MutableState mutableState3, final MutableState mutableState4, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final MapEventsOverlay mapEventsOverlay = new MapEventsOverlay(new MapEventsReceiver() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$11$1$receiver$1
            @Override // org.osmdroid.events.MapEventsReceiver
            public boolean longPressHelper(GeoPoint p) {
                Intrinsics.checkNotNullParameter(p, "p");
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // org.osmdroid.events.MapEventsReceiver
            public boolean singleTapConfirmedHelper(GeoPoint p) {
                boolean MapTabContent$lambda$37;
                boolean MapTabContent$lambda$72;
                double distanceM;
                Intrinsics.checkNotNullParameter(p, "p");
                MapTabContent$lambda$37 = MapTabContentKt.MapTabContent$lambda$37(mutableState3);
                if (!MapTabContent$lambda$37) {
                    return false;
                }
                List<GeoPoint> value = mutableState.getValue();
                mutableState2.getValue();
                if (value.size() >= 6) {
                    int size = value.size();
                    int i = -1;
                    double d = Double.POSITIVE_INFINITY;
                    for (int i2 = 0; i2 < size; i2++) {
                        distanceM = MapTabContentKt.distanceM(value.get(i2), p);
                        if (distanceM < d) {
                            i = i2;
                            d = distanceM;
                        }
                    }
                    if (i >= 0 && d <= 18.0d && i < CollectionsKt.getLastIndex(value) - 3) {
                        List<GeoPoint> take = CollectionsKt.take(value, i + 1);
                        mutableState.setValue(take);
                        MutableState<List<GeoPoint>> mutableState5 = mutableState2;
                        if (take.size() > 2) {
                            take = CollectionsKt.listOf((Object[]) new GeoPoint[]{CollectionsKt.first((List) take), CollectionsKt.last((List) take)});
                        }
                        mutableState5.setValue(take);
                    }
                }
                List<GeoPoint> value2 = mutableState.getValue();
                List<GeoPoint> value3 = mutableState2.getValue();
                if (!value2.isEmpty()) {
                    MapTabContent$lambda$72 = MapTabContentKt.MapTabContent$lambda$72(mutableState4);
                    if (MapTabContent$lambda$72) {
                        mutableState2.setValue(CollectionsKt.plus((Collection<? extends GeoPoint>) value3, p));
                        mutableState.setValue(CollectionsKt.plus((Collection<? extends GeoPoint>) value2, p));
                        return true;
                    }
                    GeoPoint geoPoint = (GeoPoint) CollectionsKt.last((List) value2);
                    mutableState2.setValue(CollectionsKt.plus((Collection<? extends GeoPoint>) value3, p));
                    mutableState.setValue(CollectionsKt.plus((Collection<? extends GeoPoint>) value2, p));
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MapTabContentKt$MapTabContent$11$1$receiver$1$singleTapConfirmedHelper$1(geoPoint, p, mutableState, mutableState4, mutableState2, null), 3, null);
                    return true;
                }
                mutableState2.setValue(CollectionsKt.plus((Collection<? extends GeoPoint>) value3, p));
                mutableState.setValue(CollectionsKt.plus((Collection<? extends GeoPoint>) value2, p));
                return true;
            }
        });
        mapView.getOverlays().add(mapEventsOverlay);
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$lambda$108$lambda$107$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MapView.this.getOverlays().remove(mapEventsOverlay);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MapTabContent$lambda$111$lambda$110(final MapView mapView, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        mapView.onResume();
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$lambda$111$lambda$110$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MapView.this.onPause();
                MapView.this.onDetach();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MapTabContent$lambda$113$lambda$112(MutableState mutableState) {
        MapTabContent$lambda$22(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double distanceM(GeoPoint geoPoint, GeoPoint geoPoint2) {
        return MapOsMapKitKt.geoDistanceM(geoPoint, geoPoint2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MapTabContent$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MapTabContent$lambda$99$lambda$98(final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$lambda$99$lambda$98$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MapsForgeTileProvider MapTabContent$lambda$89;
                MapTabContent$lambda$89 = MapTabContentKt.MapTabContent$lambda$89(MutableState.this);
                if (MapTabContent$lambda$89 != null) {
                    MapTabContent$lambda$89.detach();
                }
                MutableState.this.setValue(null);
            }
        };
    }
}
