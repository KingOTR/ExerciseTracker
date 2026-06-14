package com.example.rungps.ui.main;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.routing.OsrmWalkingRouter;
import com.example.rungps.ui.icons.EtIcons;
import com.google.logging.type.LogSeverity;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

/* compiled from: MapTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$13 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ ScrollState $controlsScroll;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Long $followRouteId;
    final /* synthetic */ String $followRouteName;
    final /* synthetic */ MutableState<Boolean> $headingUp$delegate;
    final /* synthetic */ boolean $isRecording;
    final /* synthetic */ OsMapKit $kit;
    final /* synthetic */ Double $liveLat;
    final /* synthetic */ Double $liveLon;
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $locPermLauncher;
    final /* synthetic */ MutableState<Boolean> $locatingFromMyLocationBtn$delegate;
    final /* synthetic */ MutableState<String> $mapUriString$delegate;
    final /* synthetic */ MapView $mapView;
    final /* synthetic */ MutableState<String> $offlineDownloadDest$delegate;
    final /* synthetic */ MutableState<Long> $offlineDownloadId$delegate;
    final /* synthetic */ MutableState<String> $offlineDownloadUrl$delegate;
    final /* synthetic */ MutableState<Boolean> $offlineDownloading$delegate;
    final /* synthetic */ MutableState<String> $offlineStatus$delegate;
    final /* synthetic */ Function2<Long, String, Unit> $onSelectFollowRoute;
    final /* synthetic */ MutableState<String> $paceText$delegate;
    final /* synthetic */ MutableState<Boolean> $pendingGpsCenter$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<String[], Uri> $pickGpxRouteLauncher;
    final /* synthetic */ ManagedActivityResultLauncher<String[], Uri> $pickMapLauncher;
    final /* synthetic */ MutableState<Boolean> $planMode$delegate;
    final /* synthetic */ MutableState<List<GeoPoint>> $planned;
    final /* synthetic */ MutableState<List<GeoPoint>> $plannedPts$delegate;
    final /* synthetic */ MutableState<List<GeoPoint>> $plannedWaypoints;
    final /* synthetic */ MutableState<String> $routeName$delegate;
    final /* synthetic */ List<RouteEntity> $routes;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $showMapTools$delegate;
    final /* synthetic */ MutableState<Boolean> $showSaveRoute$delegate;
    final /* synthetic */ MutableState<Boolean> $snapInProgress$delegate;
    final /* synthetic */ MutableState<Boolean> $usingOffline$delegate;
    final /* synthetic */ RunsViewModel $vm;
    final /* synthetic */ State<Boolean> $walkingSnapReady$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    MapTabContentKt$MapTabContent$13(ScrollState scrollState, boolean z, Long l, OsMapKit osMapKit, MutableState<Boolean> mutableState, Context context, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, List<RouteEntity> list, Function2<? super Long, ? super String, Unit> function2, MutableState<Boolean> mutableState4, String str, MutableState<Boolean> mutableState5, MutableState<List<GeoPoint>> mutableState6, MutableState<String> mutableState7, Double d, Double d2, MutableState<String> mutableState8, MutableState<String> mutableState9, MutableState<Boolean> mutableState10, ManagedActivityResultLauncher<String[], Uri> managedActivityResultLauncher2, ManagedActivityResultLauncher<String[], Uri> managedActivityResultLauncher3, MutableState<Boolean> mutableState11, MutableState<String> mutableState12, MutableState<String> mutableState13, MutableState<Boolean> mutableState14, MutableState<String> mutableState15, MutableState<Long> mutableState16, MapView mapView, MutableState<Boolean> mutableState17, CoroutineScope coroutineScope, MutableState<List<GeoPoint>> mutableState18, MutableState<List<GeoPoint>> mutableState19, State<Boolean> state, RunsViewModel runsViewModel) {
        this.$controlsScroll = scrollState;
        this.$isRecording = z;
        this.$followRouteId = l;
        this.$kit = osMapKit;
        this.$planMode$delegate = mutableState;
        this.$ctx = context;
        this.$locPermLauncher = managedActivityResultLauncher;
        this.$locatingFromMyLocationBtn$delegate = mutableState2;
        this.$pendingGpsCenter$delegate = mutableState3;
        this.$routes = list;
        this.$onSelectFollowRoute = function2;
        this.$headingUp$delegate = mutableState4;
        this.$followRouteName = str;
        this.$showMapTools$delegate = mutableState5;
        this.$plannedPts$delegate = mutableState6;
        this.$offlineDownloadUrl$delegate = mutableState7;
        this.$liveLat = d;
        this.$liveLon = d2;
        this.$paceText$delegate = mutableState8;
        this.$routeName$delegate = mutableState9;
        this.$showSaveRoute$delegate = mutableState10;
        this.$pickMapLauncher = managedActivityResultLauncher2;
        this.$pickGpxRouteLauncher = managedActivityResultLauncher3;
        this.$usingOffline$delegate = mutableState11;
        this.$mapUriString$delegate = mutableState12;
        this.$offlineDownloadDest$delegate = mutableState13;
        this.$offlineDownloading$delegate = mutableState14;
        this.$offlineStatus$delegate = mutableState15;
        this.$offlineDownloadId$delegate = mutableState16;
        this.$mapView = mapView;
        this.$snapInProgress$delegate = mutableState17;
        this.$scope = coroutineScope;
        this.$planned = mutableState18;
        this.$plannedWaypoints = mutableState19;
        this.$walkingSnapReady$delegate = state;
        this.$vm = runsViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0cc0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0d97  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0e96  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x101d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1029  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x10a3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1103  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x1124  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1181  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x11da  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x15e2  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x15c4  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x10b0  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x102d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0da7  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0cc2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(ColumnScope Card, Composer composer, int i) {
        List MapTabContent$lambda$6;
        String str;
        MutableState<Boolean> mutableState;
        ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher;
        Context context;
        boolean MapTabContent$lambda$2;
        String MapTabContent$lambda$13;
        String MapTabContent$lambda$49;
        String MapTabContent$lambda$492;
        boolean z;
        final Context context2;
        boolean changed;
        Object rememberedValue;
        String str2;
        Long MapTabContent$lambda$53;
        boolean changedInstance;
        Object rememberedValue2;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean changedInstance2;
        Object rememberedValue3;
        boolean changedInstance3;
        Object rememberedValue4;
        boolean changedInstance4;
        Object rememberedValue5;
        int currentCompositeKeyHash2;
        Composer m3336constructorimpl2;
        List MapTabContent$lambda$62;
        Object rememberedValue6;
        final MutableState<List<GeoPoint>> mutableState2;
        final MutableState<List<GeoPoint>> mutableState3;
        boolean MapTabContent$lambda$9;
        boolean z2;
        boolean changedInstance5;
        Object rememberedValue7;
        boolean z3;
        boolean MapTabContent$lambda$92;
        Composer composer2;
        List MapTabContent$lambda$63;
        List MapTabContent$lambda$64;
        String MapTabContent$lambda$76;
        String MapTabContent$lambda$762;
        List MapTabContent$lambda$65;
        Double MapTabContent$offRouteMeters;
        long onSurfaceVariant;
        Object obj;
        MutableState mutableState4;
        boolean MapTabContent$lambda$72;
        final MutableState mutableState5;
        Object obj2;
        String str3;
        List MapTabContent$lambda$66;
        boolean MapTabContent$lambda$722;
        boolean MapTabContent$lambda$723;
        boolean MapTabContent$lambda$61;
        List MapTabContent$lambda$67;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1817327548, i, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous> (MapTabContent.kt:540)");
            }
            Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(12));
            float f = 8;
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            ScrollState scrollState = this.$controlsScroll;
            boolean z4 = this.$isRecording;
            final Long l = this.$followRouteId;
            final OsMapKit osMapKit = this.$kit;
            final MutableState<Boolean> mutableState6 = this.$planMode$delegate;
            final Context context3 = this.$ctx;
            final ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher2 = this.$locPermLauncher;
            final MutableState<Boolean> mutableState7 = this.$locatingFromMyLocationBtn$delegate;
            final MutableState<Boolean> mutableState8 = this.$pendingGpsCenter$delegate;
            final List<RouteEntity> list = this.$routes;
            final Function2<Long, String, Unit> function2 = this.$onSelectFollowRoute;
            final MutableState<Boolean> mutableState9 = this.$headingUp$delegate;
            final String str4 = this.$followRouteName;
            final MutableState<Boolean> mutableState10 = this.$showMapTools$delegate;
            final MutableState<List<GeoPoint>> mutableState11 = this.$plannedPts$delegate;
            final MutableState<String> mutableState12 = this.$offlineDownloadUrl$delegate;
            Double d = this.$liveLat;
            Double d2 = this.$liveLon;
            final MutableState<String> mutableState13 = this.$paceText$delegate;
            final MutableState<String> mutableState14 = this.$routeName$delegate;
            final MutableState<Boolean> mutableState15 = this.$showSaveRoute$delegate;
            final ManagedActivityResultLauncher<String[], Uri> managedActivityResultLauncher3 = this.$pickMapLauncher;
            final ManagedActivityResultLauncher<String[], Uri> managedActivityResultLauncher4 = this.$pickGpxRouteLauncher;
            final MutableState<Boolean> mutableState16 = this.$usingOffline$delegate;
            MutableState<String> mutableState17 = this.$mapUriString$delegate;
            final MutableState<String> mutableState18 = this.$offlineDownloadDest$delegate;
            final MutableState<Boolean> mutableState19 = this.$offlineDownloading$delegate;
            final MutableState<String> mutableState20 = this.$offlineStatus$delegate;
            final MutableState<Long> mutableState21 = this.$offlineDownloadId$delegate;
            final MapView mapView = this.$mapView;
            final MutableState<Boolean> mutableState22 = this.$snapInProgress$delegate;
            final CoroutineScope coroutineScope = this.$scope;
            MutableState<List<GeoPoint>> mutableState23 = this.$planned;
            MutableState<List<GeoPoint>> mutableState24 = this.$plannedWaypoints;
            State<Boolean> state = this.$walkingSnapReady$delegate;
            RunsViewModel runsViewModel = this.$vm;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m684padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            Modifier clipToBounds = ClipKt.clipToBounds(SizeKt.m717heightInVpY3zN4$default(ColumnScopeInstance.INSTANCE.weight(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, true), Dp.m6303constructorimpl(260), 0.0f, 2, null));
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, clipToBounds);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl4, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier clipToBounds2 = ClipKt.clipToBounds(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
            composer.startReplaceGroup(1952861811);
            boolean changedInstance6 = composer.changedInstance(osMapKit);
            Object rememberedValue8 = composer.rememberedValue();
            if (changedInstance6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        MapView invoke$lambda$81$lambda$4$lambda$1$lambda$0;
                        invoke$lambda$81$lambda$4$lambda$1$lambda$0 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$4$lambda$1$lambda$0(OsMapKit.this, (Context) obj3);
                        return invoke$lambda$81$lambda$4$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            Function1 function1 = (Function1) rememberedValue8;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1952863340);
            Object rememberedValue9 = composer.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit invoke$lambda$81$lambda$4$lambda$3$lambda$2;
                        invoke$lambda$81$lambda$4$lambda$3$lambda$2 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$4$lambda$3$lambda$2((MapView) obj3);
                        return invoke$lambda$81$lambda$4$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue9);
            }
            composer.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function1, clipToBounds2, (Function1) rememberedValue9, composer, 432, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, horizontalScroll$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl5, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash3);
            }
            Updater.m3343setimpl(m3336constructorimpl5, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(1952878428);
            boolean changed2 = composer.changed(mutableState6);
            Object rememberedValue10 = composer.rememberedValue();
            if (changed2 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$13$lambda$6$lambda$5;
                        invoke$lambda$81$lambda$13$lambda$6$lambda$5 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$13$lambda$6$lambda$5(MutableState.this);
                        return invoke$lambda$81$lambda$13$lambda$6$lambda$5;
                    }
                };
                composer.updateRememberedValue(rememberedValue10);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue10, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1163867912, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$2$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope OutlinedButton, Composer composer3, int i2) {
                    boolean MapTabContent$lambda$37;
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i2 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1163867912, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:566)");
                    }
                    MapTabContent$lambda$37 = MapTabContentKt.MapTabContent$lambda$37(mutableState6);
                    TextKt.m2376Text4IGK_g(MapTabContent$lambda$37 ? "Plan: ON" : "Plan: OFF", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 805306368, 510);
            composer.startReplaceGroup(1952883827);
            boolean changedInstance7 = composer.changedInstance(context3) | composer.changedInstance(managedActivityResultLauncher2) | composer.changed(mutableState7) | composer.changed(mutableState8);
            Object rememberedValue11 = composer.rememberedValue();
            if (changedInstance7 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$13$lambda$8$lambda$7;
                        invoke$lambda$81$lambda$13$lambda$8$lambda$7 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$13$lambda$8$lambda$7(context3, managedActivityResultLauncher2, mutableState7, mutableState8);
                        return invoke$lambda$81$lambda$13$lambda$8$lambda$7;
                    }
                };
                composer.updateRememberedValue(rememberedValue11);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue11, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7212getLambda1$app_sideload(), composer, 805306368, 510);
            List<RouteEntity> list2 = list;
            boolean z5 = !list2.isEmpty();
            composer.startReplaceGroup(1952902947);
            boolean changedInstance8 = composer.changedInstance(list) | composer.changed(function2) | composer.changedInstance(context3);
            Object rememberedValue12 = composer.rememberedValue();
            if (changedInstance8 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$13$lambda$10$lambda$9;
                        invoke$lambda$81$lambda$13$lambda$10$lambda$9 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$13$lambda$10$lambda$9(list, function2, context3);
                        return invoke$lambda$81$lambda$13$lambda$10$lambda$9;
                    }
                };
                composer.updateRememberedValue(rememberedValue12);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue12, null, z5, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-567646976, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$2$5
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope OutlinedButton, Composer composer3, int i2) {
                    String str5;
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i2 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-567646976, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:588)");
                    }
                    if (l == null) {
                        str5 = "Follow route";
                    } else {
                        String str6 = str4;
                        if (str6 == null || (str5 = StringsKt.take(str6, 12)) == null) {
                            str5 = "Route";
                        }
                    }
                    TextKt.m2376Text4IGK_g(str5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 805306368, 506);
            composer.startReplaceGroup(1952919038);
            boolean changed3 = composer.changed(mutableState9);
            Object rememberedValue13 = composer.rememberedValue();
            if (changed3 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$13$lambda$12$lambda$11;
                        invoke$lambda$81$lambda$13$lambda$12$lambda$11 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$13$lambda$12$lambda$11(MutableState.this);
                        return invoke$lambda$81$lambda$13$lambda$12$lambda$11;
                    }
                };
                composer.updateRememberedValue(rememberedValue13);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue13, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1098226719, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$2$7
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope OutlinedButton, Composer composer3, int i2) {
                    boolean MapTabContent$lambda$17;
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i2 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1098226719, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:591)");
                    }
                    MapTabContent$lambda$17 = MapTabContentKt.MapTabContent$lambda$17(mutableState9);
                    TextKt.m2376Text4IGK_g(MapTabContent$lambda$17 ? "Heading" : "North", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 805306368, 510);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer m3336constructorimpl6 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl6, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl6, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl6.getInserting() || !Intrinsics.areEqual(m3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                m3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                m3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash4);
            }
            Updater.m3343setimpl(m3336constructorimpl6, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(1952931172);
            boolean changed4 = composer.changed(mutableState10);
            Object rememberedValue14 = composer.rememberedValue();
            if (changed4 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$16$lambda$15$lambda$14;
                        invoke$lambda$81$lambda$16$lambda$15$lambda$14 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$16$lambda$15$lambda$14(MutableState.this);
                        return invoke$lambda$81$lambda$16$lambda$15$lambda$14;
                    }
                };
                composer.updateRememberedValue(rememberedValue14);
            }
            composer.endReplaceGroup();
            ButtonKt.TextButton((Function0) rememberedValue14, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-313654090, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$3$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope TextButton, Composer composer3, int i2) {
                    boolean MapTabContent$lambda$22;
                    boolean MapTabContent$lambda$23;
                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                    if ((i2 & 17) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-313654090, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:601)");
                        }
                        MapTabContent$lambda$22 = MapTabContentKt.MapTabContent$lambda$2(mutableState10);
                        IconKt.m1833Iconww6aTOc(MapTabContent$lambda$22 ? EtIcons.INSTANCE.getCaretUp() : EtIcons.INSTANCE.getCaretDown(), (String) null, (Modifier) null, 0L, composer3, 48, 12);
                        SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(4)), composer3, 6);
                        MapTabContent$lambda$23 = MapTabContentKt.MapTabContent$lambda$2(mutableState10);
                        TextKt.m2376Text4IGK_g(MapTabContent$lambda$23 ? "Hide map tools" : "More map tools", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composer, 54), composer, 805306368, 510);
            composer.startReplaceGroup(1952943733);
            MapTabContent$lambda$6 = MapTabContentKt.MapTabContent$lambda$6(mutableState11);
            if (MapTabContent$lambda$6.size() >= 2) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                MapTabContent$lambda$67 = MapTabContentKt.MapTabContent$lambda$6(mutableState11);
                String format = String.format(locale, "%.2f km planned", Arrays.copyOf(new Object[]{Double.valueOf(MainActivityFormattersKt.plannedDistanceKm(MapTabContent$lambda$67))}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                str = "format(...)";
                mutableState = mutableState7;
                managedActivityResultLauncher = managedActivityResultLauncher2;
                context = context3;
                TextKt.m2376Text4IGK_g(format, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
            } else {
                str = "format(...)";
                mutableState = mutableState7;
                managedActivityResultLauncher = managedActivityResultLauncher2;
                context = context3;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            MapTabContent$lambda$2 = MapTabContentKt.MapTabContent$lambda$2(mutableState10);
            if (MapTabContent$lambda$2) {
                composer.startReplaceGroup(1765290751);
                Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m717heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6303constructorimpl(340), 1, null), scrollState, false, null, false, 14, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getStart(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor5);
                } else {
                    composer.useNode();
                }
                Composer m3336constructorimpl7 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl7, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl7, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl7.getInserting() || !Intrinsics.areEqual(m3336constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    m3336constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    m3336constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash5);
                }
                Updater.m3343setimpl(m3336constructorimpl7, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Arrangement.HorizontalOrVertical m564spacedBy0680j_44 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                Modifier horizontalScroll$default2 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m564spacedBy0680j_44, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer, horizontalScroll$default2);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor6);
                } else {
                    composer.useNode();
                }
                Composer m3336constructorimpl8 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl8, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl8, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl8.getInserting() || !Intrinsics.areEqual(m3336constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    m3336constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    m3336constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash6);
                }
                Updater.m3343setimpl(m3336constructorimpl8, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                composer.startReplaceGroup(481707213);
                boolean changedInstance9 = composer.changedInstance(managedActivityResultLauncher3);
                Object rememberedValue15 = composer.rememberedValue();
                if (changedInstance9 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$81$lambda$80$lambda$27$lambda$18$lambda$17;
                            invoke$lambda$81$lambda$80$lambda$27$lambda$18$lambda$17 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$27$lambda$18$lambda$17(ManagedActivityResultLauncher.this);
                            return invoke$lambda$81$lambda$80$lambda$27$lambda$18$lambda$17;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue15);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue15, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7223getLambda2$app_sideload(), composer, 805306368, 510);
                composer.startReplaceGroup(481710885);
                boolean changedInstance10 = composer.changedInstance(managedActivityResultLauncher4);
                Object rememberedValue16 = composer.rememberedValue();
                if (changedInstance10 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$81$lambda$80$lambda$27$lambda$20$lambda$19;
                            invoke$lambda$81$lambda$80$lambda$27$lambda$20$lambda$19 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$27$lambda$20$lambda$19(ManagedActivityResultLauncher.this);
                            return invoke$lambda$81$lambda$80$lambda$27$lambda$20$lambda$19;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue16);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue16, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7228getLambda3$app_sideload(), composer, 805306368, 510);
                MapTabContent$lambda$13 = MapTabContentKt.MapTabContent$lambda$13(mutableState17);
                boolean z6 = MapTabContent$lambda$13 != null;
                composer.startReplaceGroup(481718979);
                boolean changed5 = composer.changed(mutableState16);
                Object rememberedValue17 = composer.rememberedValue();
                if (changed5 || rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue17 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$81$lambda$80$lambda$27$lambda$22$lambda$21;
                            invoke$lambda$81$lambda$80$lambda$27$lambda$22$lambda$21 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$27$lambda$22$lambda$21(MutableState.this);
                            return invoke$lambda$81$lambda$80$lambda$27$lambda$22$lambda$21;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue17);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue17, null, z6, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(526984399, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$1$4
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope OutlinedButton, Composer composer3, int i2) {
                        boolean MapTabContent$lambda$29;
                        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                        if ((i2 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(526984399, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:636)");
                        }
                        MapTabContent$lambda$29 = MapTabContentKt.MapTabContent$lambda$29(mutableState16);
                        TextKt.m2376Text4IGK_g(MapTabContent$lambda$29 ? "Offline: ON" : "Offline: OFF", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 805306368, 506);
                composer.startReplaceGroup(481724157);
                boolean changed6 = composer.changed(mutableState9);
                Object rememberedValue18 = composer.rememberedValue();
                if (changed6 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue18 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$81$lambda$80$lambda$27$lambda$24$lambda$23;
                            invoke$lambda$81$lambda$80$lambda$27$lambda$24$lambda$23 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$27$lambda$24$lambda$23(MutableState.this);
                            return invoke$lambda$81$lambda$80$lambda$27$lambda$24$lambda$23;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue18);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue18, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1430200238, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$1$6
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope OutlinedButton, Composer composer3, int i2) {
                        boolean MapTabContent$lambda$17;
                        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                        if ((i2 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1430200238, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:637)");
                        }
                        MapTabContent$lambda$17 = MapTabContentKt.MapTabContent$lambda$17(mutableState9);
                        TextKt.m2376Text4IGK_g(MapTabContent$lambda$17 ? "Heading: ON" : "North up", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 805306368, 510);
                composer.startReplaceGroup(481728251);
                boolean changed7 = composer.changed(mutableState6);
                Object rememberedValue19 = composer.rememberedValue();
                if (changed7 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue19 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$81$lambda$80$lambda$27$lambda$26$lambda$25;
                            invoke$lambda$81$lambda$80$lambda$27$lambda$26$lambda$25 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$27$lambda$26$lambda$25(MutableState.this);
                            return invoke$lambda$81$lambda$80$lambda$27$lambda$26$lambda$25;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue19);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue19, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1961551219, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$1$8
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope OutlinedButton, Composer composer3, int i2) {
                        boolean MapTabContent$lambda$37;
                        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                        if ((i2 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1961551219, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:638)");
                        }
                        MapTabContent$lambda$37 = MapTabContentKt.MapTabContent$lambda$37(mutableState6);
                        TextKt.m2376Text4IGK_g(MapTabContent$lambda$37 ? "Plan: ON" : "Plan: OFF", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 805306368, 510);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextKt.m2376Text4IGK_g("Offline map download (.map URL)", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 54, 0, 65532);
                MapTabContent$lambda$49 = MapTabContentKt.MapTabContent$lambda$49(mutableState12);
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(1953007145);
                boolean changed8 = composer.changed(mutableState12);
                Object rememberedValue20 = composer.rememberedValue();
                if (changed8 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue20 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            Unit invoke$lambda$81$lambda$80$lambda$29$lambda$28;
                            invoke$lambda$81$lambda$80$lambda$29$lambda$28 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$29$lambda$28(MutableState.this, (String) obj3);
                            return invoke$lambda$81$lambda$80$lambda$29$lambda$28;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue20);
                }
                composer.endReplaceGroup();
                TextFieldKt.TextField(MapTabContent$lambda$49, (Function1<? super String, Unit>) rememberedValue20, fillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$MapTabContentKt.INSTANCE.m7229getLambda4$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1573248, 12582912, 0, 8257464);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_45 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                Modifier horizontalScroll$default3 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(m564spacedBy0680j_45, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer, horizontalScroll$default3);
                Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor7);
                } else {
                    composer.useNode();
                }
                Composer m3336constructorimpl9 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl9, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl9, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl9.getInserting() || !Intrinsics.areEqual(m3336constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                    m3336constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                    m3336constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash7);
                }
                Updater.m3343setimpl(m3336constructorimpl9, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                final RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                MapTabContent$lambda$492 = MapTabContentKt.MapTabContent$lambda$49(mutableState12);
                if (StringsKt.startsWith$default(StringsKt.trim((CharSequence) MapTabContent$lambda$492).toString(), ProxyConfig.MATCH_HTTP, false, 2, (Object) null)) {
                    MapTabContent$lambda$61 = MapTabContentKt.MapTabContent$lambda$61(mutableState19);
                    if (!MapTabContent$lambda$61) {
                        z = true;
                        composer.startReplaceGroup(481761325);
                        context2 = context;
                        changed = composer.changed(mutableState12) | composer.changedInstance(context2) | composer.changed(mutableState18) | composer.changed(mutableState19) | composer.changed(mutableState20) | composer.changed(mutableState21);
                        rememberedValue = composer.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                            rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$81$lambda$80$lambda$39$lambda$35$lambda$34;
                                    invoke$lambda$81$lambda$80$lambda$39$lambda$35$lambda$34 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$39$lambda$35$lambda$34(RowScope.this, mutableState12, context2, mutableState18, mutableState19, mutableState20, mutableState21);
                                    return invoke$lambda$81$lambda$80$lambda$39$lambda$35$lambda$34;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        } else {
                            str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                        }
                        composer.endReplaceGroup();
                        String str5 = str2;
                        ButtonKt.Button((Function0) rememberedValue, null, z, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2074484110, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$3$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer3, int i2) {
                                boolean MapTabContent$lambda$612;
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i2 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2074484110, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:684)");
                                }
                                MapTabContent$lambda$612 = MapTabContentKt.MapTabContent$lambda$61(mutableState19);
                                TextKt.m2376Text4IGK_g(MapTabContent$lambda$612 ? "Downloading…" : "Download", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 805306368, 506);
                        MapTabContent$lambda$53 = MapTabContentKt.MapTabContent$lambda$53(mutableState21);
                        boolean z7 = MapTabContent$lambda$53 == null;
                        composer.startReplaceGroup(481826691);
                        changedInstance = composer.changedInstance(context2) | composer.changed(mutableState21) | composer.changed(mutableState19) | composer.changed(mutableState20);
                        rememberedValue2 = composer.rememberedValue();
                        if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda24
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$81$lambda$80$lambda$39$lambda$38$lambda$37;
                                    invoke$lambda$81$lambda$80$lambda$39$lambda$38$lambda$37 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$39$lambda$38$lambda$37(RowScope.this, context2, mutableState21, mutableState19, mutableState20);
                                    return invoke$lambda$81$lambda$80$lambda$39$lambda$38$lambda$37;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        composer.endReplaceGroup();
                        ButtonKt.OutlinedButton((Function0) rememberedValue2, null, z7, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7230getLambda5$app_sideload(), composer, 805306368, 506);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_46 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                        Modifier horizontalScroll$default4 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy5 = RowKt.rowMeasurePolicy(m564spacedBy0680j_46, Alignment.INSTANCE.getTop(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer, horizontalScroll$default4);
                        Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str5);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (!composer.getInserting()) {
                            composer.createNode(constructor8);
                        } else {
                            composer.useNode();
                        }
                        m3336constructorimpl = Updater.m3336constructorimpl(composer);
                        Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash8);
                        }
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                        boolean z8 = !list2.isEmpty();
                        composer.startReplaceGroup(481859581);
                        changedInstance2 = composer.changedInstance(list) | composer.changed(function2) | composer.changedInstance(context2);
                        rememberedValue3 = composer.rememberedValue();
                        if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$81$lambda$80$lambda$49$lambda$41$lambda$40;
                                    invoke$lambda$81$lambda$80$lambda$49$lambda$41$lambda$40 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$49$lambda$41$lambda$40(list, function2, context2);
                                    return invoke$lambda$81$lambda$80$lambda$49$lambda$41$lambda$40;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        composer.endReplaceGroup();
                        Function2<Long, String, Unit> function22 = function2;
                        ButtonKt.OutlinedButton((Function0) rememberedValue3, null, z8, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(132692943, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$4$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope OutlinedButton, Composer composer3, int i2) {
                                String str6;
                                Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                                if ((i2 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(132692943, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:717)");
                                }
                                Long l2 = l;
                                if (l2 == null) {
                                    str6 = "Follow route";
                                } else {
                                    String str7 = str4;
                                    if (str7 == null) {
                                        str7 = "#" + l2;
                                    }
                                    str6 = "Route: " + str7;
                                }
                                TextKt.m2376Text4IGK_g(str6, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 805306368, 506);
                        composer.startReplaceGroup(481877633);
                        if (!list2.isEmpty()) {
                            for (final RouteEntity routeEntity : CollectionsKt.take(list, 6)) {
                                MapTabContent$lambda$723 = MapTabContentKt.MapTabContent$lambda$72(mutableState22);
                                boolean z9 = !MapTabContent$lambda$723;
                                composer.startReplaceGroup(-2029375754);
                                final Function2<Long, String, Unit> function23 = function22;
                                boolean changed9 = composer.changed(function23) | composer.changedInstance(routeEntity) | composer.changedInstance(context2);
                                Object rememberedValue21 = composer.rememberedValue();
                                if (changed9 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue21 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda26
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit invoke$lambda$81$lambda$80$lambda$49$lambda$44$lambda$43$lambda$42;
                                            invoke$lambda$81$lambda$80$lambda$49$lambda$44$lambda$43$lambda$42 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$49$lambda$44$lambda$43$lambda$42(Function2.this, routeEntity, context2);
                                            return invoke$lambda$81$lambda$80$lambda$49$lambda$44$lambda$43$lambda$42;
                                        }
                                    };
                                    composer.updateRememberedValue(rememberedValue21);
                                }
                                composer.endReplaceGroup();
                                ButtonKt.OutlinedButton((Function0) rememberedValue21, null, z9, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1205742529, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$4$3$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                        invoke(rowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope OutlinedButton, Composer composer3, int i2) {
                                        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                                        if ((i2 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1205742529, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:727)");
                                        }
                                        TextKt.m2376Text4IGK_g(StringsKt.take(RouteEntity.this.getName(), 14), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), composer, 805306368, 506);
                                function22 = function23;
                            }
                        }
                        Function2<Long, String, Unit> function24 = function22;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(481896160);
                        changedInstance3 = composer.changedInstance(mapView) | composer.changedInstance(context2);
                        rememberedValue4 = composer.rememberedValue();
                        if (!changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda27
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$81$lambda$80$lambda$49$lambda$46$lambda$45;
                                    invoke$lambda$81$lambda$80$lambda$49$lambda$46$lambda$45 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$49$lambda$46$lambda$45(MapView.this, context2);
                                    return invoke$lambda$81$lambda$80$lambda$49$lambda$46$lambda$45;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue4);
                        }
                        composer.endReplaceGroup();
                        ButtonKt.OutlinedButton((Function0) rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7231getLambda6$app_sideload(), composer, 805306368, 510);
                        composer.startReplaceGroup(481905814);
                        final ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher5 = managedActivityResultLauncher;
                        final MutableState<Boolean> mutableState25 = mutableState;
                        changedInstance4 = composer.changedInstance(context2) | composer.changedInstance(managedActivityResultLauncher5) | composer.changed(mutableState25) | composer.changed(mutableState8);
                        rememberedValue5 = composer.rememberedValue();
                        if (!changedInstance4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda28
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$81$lambda$80$lambda$49$lambda$48$lambda$47;
                                    invoke$lambda$81$lambda$80$lambda$49$lambda$48$lambda$47 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$49$lambda$48$lambda$47(context2, managedActivityResultLauncher5, mutableState25, mutableState8);
                                    return invoke$lambda$81$lambda$80$lambda$49$lambda$48$lambda$47;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue5);
                        }
                        composer.endReplaceGroup();
                        ButtonKt.OutlinedButton((Function0) rememberedValue5, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7232getLambda7$app_sideload(), composer, 805306368, 510);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_47 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy6 = RowKt.rowMeasurePolicy(m564spacedBy0680j_47, centerVertically2, composer, 54);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default3);
                        Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str5);
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (!composer.getInserting()) {
                            composer.createNode(constructor9);
                        } else {
                            composer.useNode();
                        }
                        m3336constructorimpl2 = Updater.m3336constructorimpl(composer);
                        Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash9);
                        }
                        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                        MapTabContent$lambda$62 = MapTabContentKt.MapTabContent$lambda$6(mutableState11);
                        boolean z10 = !MapTabContent$lambda$62.isEmpty();
                        composer.startReplaceGroup(481934551);
                        rememberedValue6 = composer.rememberedValue();
                        if (rememberedValue6 != Composer.INSTANCE.getEmpty()) {
                            mutableState2 = mutableState23;
                            mutableState3 = mutableState24;
                            rememberedValue6 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$81$lambda$80$lambda$54$lambda$51$lambda$50;
                                    invoke$lambda$81$lambda$80$lambda$54$lambda$51$lambda$50 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$54$lambda$51$lambda$50(MutableState.this, mutableState3);
                                    return invoke$lambda$81$lambda$80$lambda$54$lambda$51$lambda$50;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue6);
                        } else {
                            mutableState2 = mutableState23;
                            mutableState3 = mutableState24;
                        }
                        composer.endReplaceGroup();
                        final MutableState<List<GeoPoint>> mutableState26 = mutableState3;
                        final MutableState<List<GeoPoint>> mutableState27 = mutableState2;
                        String str6 = "C101@5126L9:Row.kt#2w3rfo";
                        String str7 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                        String str8 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                        String str9 = str5;
                        ButtonKt.OutlinedButton((Function0) rememberedValue6, null, z10, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7233getLambda8$app_sideload(), composer, 805306374, 506);
                        MapTabContent$lambda$9 = MapTabContentKt.MapTabContent$lambda$9(state);
                        if (MapTabContent$lambda$9) {
                            MapTabContent$lambda$722 = MapTabContentKt.MapTabContent$lambda$72(mutableState22);
                            if (!MapTabContent$lambda$722) {
                                z2 = true;
                                composer.startReplaceGroup(481947657);
                                changedInstance5 = composer.changedInstance(context2) | composer.changedInstance(coroutineScope);
                                rememberedValue7 = composer.rememberedValue();
                                if (!changedInstance5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    z3 = 6;
                                    rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52;
                                            invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52(MutableState.this, context2, coroutineScope, mutableState11, mutableState27, mutableState22);
                                            return invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52;
                                        }
                                    };
                                    composer.updateRememberedValue(rememberedValue7);
                                } else {
                                    z3 = 6;
                                }
                                composer.endReplaceGroup();
                                ButtonKt.FilledTonalButton((Function0) rememberedValue7, null, z2, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7234getLambda9$app_sideload(), composer, 805306368, 506);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.startReplaceGroup(1953294254);
                                MapTabContent$lambda$92 = MapTabContentKt.MapTabContent$lambda$9(state);
                                if (!MapTabContent$lambda$92) {
                                    MapTabContent$lambda$66 = MapTabContentKt.MapTabContent$lambda$6(mutableState11);
                                    if (!MapTabContent$lambda$66.isEmpty()) {
                                        TextKt.m2376Text4IGK_g("Add another point (Plan ON) or import a route so snapping has two anchors.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                                    }
                                }
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(1953309785);
                                if (list2.isEmpty()) {
                                    composer2 = composer;
                                } else {
                                    composer.startReplaceGroup(1953309804);
                                    Object rememberedValue22 = composer.rememberedValue();
                                    if (rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                                        obj = null;
                                        rememberedValue22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                        composer.updateRememberedValue(rememberedValue22);
                                    } else {
                                        obj = null;
                                    }
                                    final MutableState mutableState28 = (MutableState) rememberedValue22;
                                    composer.endReplaceGroup();
                                    Long invoke$lambda$81$lambda$80$lambda$56 = invoke$lambda$81$lambda$80$lambda$56(mutableState28);
                                    composer.startReplaceGroup(1953314176);
                                    if (invoke$lambda$81$lambda$80$lambda$56 != null) {
                                        Iterator<T> it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                obj2 = obj;
                                                break;
                                            }
                                            obj2 = it.next();
                                            long id = ((RouteEntity) obj2).getId();
                                            if (invoke$lambda$81$lambda$80$lambda$56 != null && id == invoke$lambda$81$lambda$80$lambda$56.longValue()) {
                                                break;
                                            }
                                        }
                                        RouteEntity routeEntity2 = (RouteEntity) obj2;
                                        if (routeEntity2 == null || (str3 = routeEntity2.getName()) == null) {
                                            str3 = "#" + invoke$lambda$81$lambda$80$lambda$56;
                                        }
                                        final String str10 = str3;
                                        composer.startReplaceGroup(1953319548);
                                        Object rememberedValue23 = composer.rememberedValue();
                                        if (rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue23 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit invoke$lambda$81$lambda$80$lambda$60$lambda$59;
                                                    invoke$lambda$81$lambda$80$lambda$60$lambda$59 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$60$lambda$59(MutableState.this);
                                                    return invoke$lambda$81$lambda$80$lambda$60$lambda$59;
                                                }
                                            };
                                            composer.updateRememberedValue(rememberedValue23);
                                        }
                                        composer.endReplaceGroup();
                                        mutableState4 = mutableState28;
                                        AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue23, ComposableLambdaKt.rememberComposableLambda(-165657256, true, new MapTabContentKt$MapTabContent$13$1$4$7(runsViewModel, invoke$lambda$81$lambda$80$lambda$56, l, function24, mutableState28), composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1584518822, true, new MapTabContentKt$MapTabContent$13$1$4$8(mutableState28), composer, 54), null, ComposableSingletons$MapTabContentKt.INSTANCE.m7215getLambda12$app_sideload(), ComposableLambdaKt.rememberComposableLambda(-1565327523, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$9
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i2) {
                                                if ((i2 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1565327523, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:821)");
                                                }
                                                TextKt.m2376Text4IGK_g("Delete “" + str10 + "” from saved routes?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer, 1772598, 0, 16276);
                                    } else {
                                        mutableState4 = mutableState28;
                                    }
                                    composer.endReplaceGroup();
                                    TextKt.m2376Text4IGK_g("Saved routes", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 6, 0, 65534);
                                    for (final RouteEntity routeEntity3 : CollectionsKt.take(list, 12)) {
                                        Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                                        String str11 = str8;
                                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, str11);
                                        MeasurePolicy rowMeasurePolicy7 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, composer, 54);
                                        String str12 = str7;
                                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str12);
                                        int currentCompositeKeyHash10 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap10 = composer.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier10 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default4);
                                        Function0<ComposeUiNode> constructor10 = ComposeUiNode.INSTANCE.getConstructor();
                                        String str13 = str9;
                                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str13);
                                        if (!(composer.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer.startReusableNode();
                                        if (composer.getInserting()) {
                                            composer.createNode(constructor10);
                                        } else {
                                            composer.useNode();
                                        }
                                        Composer m3336constructorimpl10 = Updater.m3336constructorimpl(composer);
                                        Updater.m3343setimpl(m3336constructorimpl10, rowMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(m3336constructorimpl10, currentCompositionLocalMap10, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash10 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3336constructorimpl10.getInserting() || !Intrinsics.areEqual(m3336constructorimpl10.rememberedValue(), Integer.valueOf(currentCompositeKeyHash10))) {
                                            m3336constructorimpl10.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash10));
                                            m3336constructorimpl10.apply(Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                                        }
                                        Updater.m3343setimpl(m3336constructorimpl10, materializeModifier10, ComposeUiNode.INSTANCE.getSetModifier());
                                        String str14 = str6;
                                        ComposerKt.sourceInformationMarkerStart(composer, -407840262, str14);
                                        RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                                        TextKt.m2376Text4IGK_g(routeEntity3.getName(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
                                        Arrangement.HorizontalOrVertical m564spacedBy0680j_48 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                                        ComposerKt.sourceInformationMarkerStart(composer, 693286680, str11);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        MeasurePolicy rowMeasurePolicy8 = RowKt.rowMeasurePolicy(m564spacedBy0680j_48, Alignment.INSTANCE.getTop(), composer, 6);
                                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str12);
                                        int currentCompositeKeyHash11 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap11 = composer.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier11 = ComposedModifierKt.materializeModifier(composer, companion);
                                        Function0<ComposeUiNode> constructor11 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str13);
                                        if (!(composer.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer.startReusableNode();
                                        if (composer.getInserting()) {
                                            composer.createNode(constructor11);
                                        } else {
                                            composer.useNode();
                                        }
                                        Composer m3336constructorimpl11 = Updater.m3336constructorimpl(composer);
                                        Updater.m3343setimpl(m3336constructorimpl11, rowMeasurePolicy8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(m3336constructorimpl11, currentCompositionLocalMap11, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash11 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m3336constructorimpl11.getInserting() || !Intrinsics.areEqual(m3336constructorimpl11.rememberedValue(), Integer.valueOf(currentCompositeKeyHash11))) {
                                            m3336constructorimpl11.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash11));
                                            m3336constructorimpl11.apply(Integer.valueOf(currentCompositeKeyHash11), setCompositeKeyHash11);
                                        }
                                        Updater.m3343setimpl(m3336constructorimpl11, materializeModifier11, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer, -407840262, str14);
                                        RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
                                        MapTabContent$lambda$72 = MapTabContentKt.MapTabContent$lambda$72(mutableState22);
                                        boolean z11 = !MapTabContent$lambda$72;
                                        composer.startReplaceGroup(1933011814);
                                        final Function2<Long, String, Unit> function25 = function24;
                                        boolean changed10 = composer.changed(function25) | composer.changedInstance(routeEntity3);
                                        Object rememberedValue24 = composer.rememberedValue();
                                        if (changed10 || rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue24 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit invoke$lambda$81$lambda$80$lambda$67$lambda$66$lambda$65$lambda$62$lambda$61;
                                                    invoke$lambda$81$lambda$80$lambda$67$lambda$66$lambda$65$lambda$62$lambda$61 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$67$lambda$66$lambda$65$lambda$62$lambda$61(Function2.this, routeEntity3);
                                                    return invoke$lambda$81$lambda$80$lambda$67$lambda$66$lambda$65$lambda$62$lambda$61;
                                                }
                                            };
                                            composer.updateRememberedValue(rememberedValue24);
                                        }
                                        composer.endReplaceGroup();
                                        ButtonKt.OutlinedButton((Function0) rememberedValue24, null, z11, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7216getLambda13$app_sideload(), composer, 805306368, 506);
                                        composer.startReplaceGroup(1933016441);
                                        boolean changedInstance11 = composer.changedInstance(routeEntity3);
                                        Object rememberedValue25 = composer.rememberedValue();
                                        if (changedInstance11 || rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                                            mutableState5 = mutableState4;
                                            rememberedValue25 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    Unit invoke$lambda$81$lambda$80$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63;
                                                    invoke$lambda$81$lambda$80$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63(RouteEntity.this, mutableState5);
                                                    return invoke$lambda$81$lambda$80$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63;
                                                }
                                            };
                                            composer.updateRememberedValue(rememberedValue25);
                                        } else {
                                            mutableState5 = mutableState4;
                                        }
                                        composer.endReplaceGroup();
                                        ButtonKt.OutlinedButton((Function0) rememberedValue25, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7217getLambda14$app_sideload(), composer, 805306368, 510);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        composer.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        ComposerKt.sourceInformationMarkerEnd(composer);
                                        mutableState4 = mutableState5;
                                        function24 = function25;
                                        str8 = str11;
                                        str6 = str14;
                                        str9 = str13;
                                        str7 = str12;
                                    }
                                    composer2 = composer;
                                }
                                String str15 = str6;
                                String str16 = str7;
                                String str17 = str8;
                                String str18 = str9;
                                composer.endReplaceGroup();
                                composer2.startReplaceGroup(1953381317);
                                MapTabContent$lambda$63 = MapTabContentKt.MapTabContent$lambda$6(mutableState11);
                                if (MapTabContent$lambda$63.size() >= 2) {
                                    MapTabContent$lambda$64 = MapTabContentKt.MapTabContent$lambda$6(mutableState11);
                                    double coerceAtLeast = RangesKt.coerceAtLeast(MainActivityFormattersKt.plannedDistanceKm(MapTabContent$lambda$64), 0.0d);
                                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                    String format2 = String.format(Locale.US, "%.2f km", Arrays.copyOf(new Object[]{Double.valueOf(coerceAtLeast)}, 1));
                                    String str19 = str;
                                    Intrinsics.checkNotNullExpressionValue(format2, str19);
                                    TextKt.m2376Text4IGK_g(format2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
                                    composer.startReplaceGroup(1953389060);
                                    if (z4 && d != null && d2 != null) {
                                        GeoPoint geoPoint = new GeoPoint(d.doubleValue(), d2.doubleValue());
                                        MapTabContent$lambda$65 = MapTabContentKt.MapTabContent$lambda$6(mutableState11);
                                        MapTabContent$offRouteMeters = MapTabContentKt.MapTabContent$offRouteMeters(geoPoint, MapTabContent$lambda$65);
                                        if (MapTabContent$offRouteMeters != null) {
                                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                                            String format3 = String.format(Locale.US, "Off route: %.0f m", Arrays.copyOf(new Object[]{MapTabContent$offRouteMeters}, 1));
                                            Intrinsics.checkNotNullExpressionValue(format3, str19);
                                            if (MapTabContent$offRouteMeters.doubleValue() > 25.0d) {
                                                composer.startReplaceGroup(1953400745);
                                                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError();
                                            } else {
                                                composer.startReplaceGroup(1953401940);
                                                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant();
                                            }
                                            composer.endReplaceGroup();
                                            TextKt.m2376Text4IGK_g(format3, (Modifier) null, onSurfaceVariant, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
                                        }
                                    }
                                    composer.endReplaceGroup();
                                    MapTabContent$lambda$76 = MapTabContentKt.MapTabContent$lambda$76(mutableState13);
                                    String formatElapsed = (invoke$lambda$81$lambda$80$parsePaceSecPerKm(MapTabContent$lambda$76) != null ? Integer.valueOf(MathKt.roundToInt(r0.intValue() * coerceAtLeast)) : null) == null ? "—" : MainActivityFormattersKt.formatElapsed(r12.intValue() * 1000);
                                    Arrangement.HorizontalOrVertical m564spacedBy0680j_49 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                                    Modifier horizontalScroll$default5 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                                    ComposerKt.sourceInformationMarkerStart(composer, 693286680, str17);
                                    MeasurePolicy rowMeasurePolicy9 = RowKt.rowMeasurePolicy(m564spacedBy0680j_49, Alignment.INSTANCE.getTop(), composer, 6);
                                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str16);
                                    int currentCompositeKeyHash12 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap12 = composer.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier12 = ComposedModifierKt.materializeModifier(composer, horizontalScroll$default5);
                                    Function0<ComposeUiNode> constructor12 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, str18);
                                    if (!(composer.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor12);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer m3336constructorimpl12 = Updater.m3336constructorimpl(composer);
                                    Updater.m3343setimpl(m3336constructorimpl12, rowMeasurePolicy9, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(m3336constructorimpl12, currentCompositionLocalMap12, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash12 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3336constructorimpl12.getInserting() || !Intrinsics.areEqual(m3336constructorimpl12.rememberedValue(), Integer.valueOf(currentCompositeKeyHash12))) {
                                        m3336constructorimpl12.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash12));
                                        m3336constructorimpl12.apply(Integer.valueOf(currentCompositeKeyHash12), setCompositeKeyHash12);
                                    }
                                    Updater.m3343setimpl(m3336constructorimpl12, materializeModifier12, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer, -407840262, str15);
                                    RowScopeInstance rowScopeInstance9 = RowScopeInstance.INSTANCE;
                                    composer.startReplaceGroup(482172760);
                                    boolean changed11 = composer.changed(mutableState13);
                                    Object rememberedValue26 = composer.rememberedValue();
                                    if (changed11 || rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue26 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit invoke$lambda$81$lambda$80$lambda$74$lambda$69$lambda$68;
                                                invoke$lambda$81$lambda$80$lambda$74$lambda$69$lambda$68 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$74$lambda$69$lambda$68(MutableState.this);
                                                return invoke$lambda$81$lambda$80$lambda$74$lambda$69$lambda$68;
                                            }
                                        };
                                        composer.updateRememberedValue(rememberedValue26);
                                    }
                                    composer.endReplaceGroup();
                                    ButtonKt.OutlinedButton((Function0) rememberedValue26, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7218getLambda15$app_sideload(), composer, 805306368, 510);
                                    composer.startReplaceGroup(482175608);
                                    boolean changed12 = composer.changed(mutableState13);
                                    Object rememberedValue27 = composer.rememberedValue();
                                    if (changed12 || rememberedValue27 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue27 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit invoke$lambda$81$lambda$80$lambda$74$lambda$71$lambda$70;
                                                invoke$lambda$81$lambda$80$lambda$74$lambda$71$lambda$70 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$74$lambda$71$lambda$70(MutableState.this);
                                                return invoke$lambda$81$lambda$80$lambda$74$lambda$71$lambda$70;
                                            }
                                        };
                                        composer.updateRememberedValue(rememberedValue27);
                                    }
                                    composer.endReplaceGroup();
                                    ButtonKt.OutlinedButton((Function0) rememberedValue27, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7219getLambda16$app_sideload(), composer, 805306368, 510);
                                    composer.startReplaceGroup(482178456);
                                    boolean changed13 = composer.changed(mutableState13);
                                    Object rememberedValue28 = composer.rememberedValue();
                                    if (changed13 || rememberedValue28 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue28 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit invoke$lambda$81$lambda$80$lambda$74$lambda$73$lambda$72;
                                                invoke$lambda$81$lambda$80$lambda$74$lambda$73$lambda$72 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$74$lambda$73$lambda$72(MutableState.this);
                                                return invoke$lambda$81$lambda$80$lambda$74$lambda$73$lambda$72;
                                            }
                                        };
                                        composer.updateRememberedValue(rememberedValue28);
                                    }
                                    composer.endReplaceGroup();
                                    ButtonKt.OutlinedButton((Function0) rememberedValue28, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7220getLambda17$app_sideload(), composer, 805306368, 510);
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    composer.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    ComposerKt.sourceInformationMarkerEnd(composer);
                                    MapTabContent$lambda$762 = MapTabContentKt.MapTabContent$lambda$76(mutableState13);
                                    Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    composer.startReplaceGroup(1953451976);
                                    boolean changed14 = composer.changed(mutableState13);
                                    Object rememberedValue29 = composer.rememberedValue();
                                    if (changed14 || rememberedValue29 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue29 = new Function1() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda10
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj3) {
                                                Unit invoke$lambda$81$lambda$80$lambda$77$lambda$76;
                                                invoke$lambda$81$lambda$80$lambda$77$lambda$76 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$77$lambda$76(MutableState.this, (String) obj3);
                                                return invoke$lambda$81$lambda$80$lambda$77$lambda$76;
                                            }
                                        };
                                        composer.updateRememberedValue(rememberedValue29);
                                    }
                                    composer.endReplaceGroup();
                                    TextFieldKt.TextField(MapTabContent$lambda$762, (Function1<? super String, Unit>) rememberedValue29, fillMaxWidth$default5, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$MapTabContentKt.INSTANCE.m7221getLambda18$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1573248, 12582912, 0, 8257464);
                                    TextKt.m2376Text4IGK_g("Est time: " + formatElapsed, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
                                    composer2 = composer;
                                    composer2.startReplaceGroup(1953467052);
                                    boolean changed15 = composer2.changed(mutableState14) | composer2.changed(mutableState15);
                                    Object rememberedValue30 = composer.rememberedValue();
                                    if (changed15 || rememberedValue30 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue30 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda12
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                Unit invoke$lambda$81$lambda$80$lambda$79$lambda$78;
                                                invoke$lambda$81$lambda$80$lambda$79$lambda$78 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$79$lambda$78(MutableState.this, mutableState15);
                                                return invoke$lambda$81$lambda$80$lambda$79$lambda$78;
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue30);
                                    }
                                    composer.endReplaceGroup();
                                    ButtonKt.OutlinedButton((Function0) rememberedValue30, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7222getLambda19$app_sideload(), composer, 805306368, 510);
                                }
                                composer.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endReplaceGroup();
                            }
                        }
                        z2 = false;
                        composer.startReplaceGroup(481947657);
                        changedInstance5 = composer.changedInstance(context2) | composer.changedInstance(coroutineScope);
                        rememberedValue7 = composer.rememberedValue();
                        if (changedInstance5) {
                        }
                        z3 = 6;
                        rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52;
                                invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52(MutableState.this, context2, coroutineScope, mutableState11, mutableState27, mutableState22);
                                return invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue7);
                        composer.endReplaceGroup();
                        ButtonKt.FilledTonalButton((Function0) rememberedValue7, null, z2, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7234getLambda9$app_sideload(), composer, 805306368, 506);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.startReplaceGroup(1953294254);
                        MapTabContent$lambda$92 = MapTabContentKt.MapTabContent$lambda$9(state);
                        if (!MapTabContent$lambda$92) {
                        }
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1953309785);
                        if (list2.isEmpty()) {
                        }
                        String str152 = str6;
                        String str162 = str7;
                        String str172 = str8;
                        String str182 = str9;
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(1953381317);
                        MapTabContent$lambda$63 = MapTabContentKt.MapTabContent$lambda$6(mutableState11);
                        if (MapTabContent$lambda$63.size() >= 2) {
                        }
                        composer.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endReplaceGroup();
                    }
                }
                z = false;
                composer.startReplaceGroup(481761325);
                context2 = context;
                changed = composer.changed(mutableState12) | composer.changedInstance(context2) | composer.changed(mutableState18) | composer.changed(mutableState19) | composer.changed(mutableState20) | composer.changed(mutableState21);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$80$lambda$39$lambda$35$lambda$34;
                        invoke$lambda$81$lambda$80$lambda$39$lambda$35$lambda$34 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$39$lambda$35$lambda$34(RowScope.this, mutableState12, context2, mutableState18, mutableState19, mutableState20, mutableState21);
                        return invoke$lambda$81$lambda$80$lambda$39$lambda$35$lambda$34;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
                composer.endReplaceGroup();
                String str52 = str2;
                ButtonKt.Button((Function0) rememberedValue, null, z, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2074484110, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$3$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer3, int i2) {
                        boolean MapTabContent$lambda$612;
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i2 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2074484110, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:684)");
                        }
                        MapTabContent$lambda$612 = MapTabContentKt.MapTabContent$lambda$61(mutableState19);
                        TextKt.m2376Text4IGK_g(MapTabContent$lambda$612 ? "Downloading…" : "Download", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 805306368, 506);
                MapTabContent$lambda$53 = MapTabContentKt.MapTabContent$lambda$53(mutableState21);
                if (MapTabContent$lambda$53 == null) {
                }
                composer.startReplaceGroup(481826691);
                changedInstance = composer.changedInstance(context2) | composer.changed(mutableState21) | composer.changed(mutableState19) | composer.changed(mutableState20);
                rememberedValue2 = composer.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$80$lambda$39$lambda$38$lambda$37;
                        invoke$lambda$81$lambda$80$lambda$39$lambda$38$lambda$37 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$39$lambda$38$lambda$37(RowScope.this, context2, mutableState21, mutableState19, mutableState20);
                        return invoke$lambda$81$lambda$80$lambda$39$lambda$38$lambda$37;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue2, null, z7, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7230getLambda5$app_sideload(), composer, 805306368, 506);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_462 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                Modifier horizontalScroll$default42 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy52 = RowKt.rowMeasurePolicy(m564spacedBy0680j_462, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap82 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier82 = ComposedModifierKt.materializeModifier(composer, horizontalScroll$default42);
                Function0<ComposeUiNode> constructor82 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str52);
                if (!(composer.getApplier() instanceof Applier)) {
                }
                composer.startReusableNode();
                if (!composer.getInserting()) {
                }
                m3336constructorimpl = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap82, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash82 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting()) {
                }
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash82);
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier82, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance52 = RowScopeInstance.INSTANCE;
                boolean z82 = !list2.isEmpty();
                composer.startReplaceGroup(481859581);
                changedInstance2 = composer.changedInstance(list) | composer.changed(function2) | composer.changedInstance(context2);
                rememberedValue3 = composer.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$80$lambda$49$lambda$41$lambda$40;
                        invoke$lambda$81$lambda$80$lambda$49$lambda$41$lambda$40 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$49$lambda$41$lambda$40(list, function2, context2);
                        return invoke$lambda$81$lambda$80$lambda$49$lambda$41$lambda$40;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
                composer.endReplaceGroup();
                Function2<Long, String, Unit> function222 = function2;
                ButtonKt.OutlinedButton((Function0) rememberedValue3, null, z82, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(132692943, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$4$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope OutlinedButton, Composer composer3, int i2) {
                        String str62;
                        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                        if ((i2 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(132692943, i2, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:717)");
                        }
                        Long l2 = l;
                        if (l2 == null) {
                            str62 = "Follow route";
                        } else {
                            String str72 = str4;
                            if (str72 == null) {
                                str72 = "#" + l2;
                            }
                            str62 = "Route: " + str72;
                        }
                        TextKt.m2376Text4IGK_g(str62, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 805306368, 506);
                composer.startReplaceGroup(481877633);
                if (!list2.isEmpty()) {
                }
                Function2<Long, String, Unit> function242 = function222;
                composer.endReplaceGroup();
                composer.startReplaceGroup(481896160);
                changedInstance3 = composer.changedInstance(mapView) | composer.changedInstance(context2);
                rememberedValue4 = composer.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$80$lambda$49$lambda$46$lambda$45;
                        invoke$lambda$81$lambda$80$lambda$49$lambda$46$lambda$45 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$49$lambda$46$lambda$45(MapView.this, context2);
                        return invoke$lambda$81$lambda$80$lambda$49$lambda$46$lambda$45;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7231getLambda6$app_sideload(), composer, 805306368, 510);
                composer.startReplaceGroup(481905814);
                final ManagedActivityResultLauncher managedActivityResultLauncher52 = managedActivityResultLauncher;
                final MutableState mutableState252 = mutableState;
                changedInstance4 = composer.changedInstance(context2) | composer.changedInstance(managedActivityResultLauncher52) | composer.changed(mutableState252) | composer.changed(mutableState8);
                rememberedValue5 = composer.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue5 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$80$lambda$49$lambda$48$lambda$47;
                        invoke$lambda$81$lambda$80$lambda$49$lambda$48$lambda$47 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$49$lambda$48$lambda$47(context2, managedActivityResultLauncher52, mutableState252, mutableState8);
                        return invoke$lambda$81$lambda$80$lambda$49$lambda$48$lambda$47;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue5, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7232getLambda7$app_sideload(), composer, 805306368, 510);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_472 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy62 = RowKt.rowMeasurePolicy(m564spacedBy0680j_472, centerVertically22, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap92 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier92 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default32);
                Function0<ComposeUiNode> constructor92 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str52);
                if (!(composer.getApplier() instanceof Applier)) {
                }
                composer.startReusableNode();
                if (!composer.getInserting()) {
                }
                m3336constructorimpl2 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy62, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap92, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash92 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl2.getInserting()) {
                }
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash92);
                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier92, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance62 = RowScopeInstance.INSTANCE;
                MapTabContent$lambda$62 = MapTabContentKt.MapTabContent$lambda$6(mutableState11);
                boolean z102 = !MapTabContent$lambda$62.isEmpty();
                composer.startReplaceGroup(481934551);
                rememberedValue6 = composer.rememberedValue();
                if (rememberedValue6 != Composer.INSTANCE.getEmpty()) {
                }
                composer.endReplaceGroup();
                final MutableState mutableState262 = mutableState3;
                final MutableState mutableState272 = mutableState2;
                String str62 = "C101@5126L9:Row.kt#2w3rfo";
                String str72 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                String str82 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                String str92 = str52;
                ButtonKt.OutlinedButton((Function0) rememberedValue6, null, z102, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7233getLambda8$app_sideload(), composer, 805306374, 506);
                MapTabContent$lambda$9 = MapTabContentKt.MapTabContent$lambda$9(state);
                if (MapTabContent$lambda$9) {
                }
                z2 = false;
                composer.startReplaceGroup(481947657);
                changedInstance5 = composer.changedInstance(context2) | composer.changedInstance(coroutineScope);
                rememberedValue7 = composer.rememberedValue();
                if (changedInstance5) {
                }
                z3 = 6;
                rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52;
                        invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52 = MapTabContentKt$MapTabContent$13.invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52(MutableState.this, context2, coroutineScope, mutableState11, mutableState272, mutableState22);
                        return invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52;
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
                composer.endReplaceGroup();
                ButtonKt.FilledTonalButton((Function0) rememberedValue7, null, z2, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7234getLambda9$app_sideload(), composer, 805306368, 506);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.startReplaceGroup(1953294254);
                MapTabContent$lambda$92 = MapTabContentKt.MapTabContent$lambda$9(state);
                if (!MapTabContent$lambda$92) {
                }
                composer.endReplaceGroup();
                composer.startReplaceGroup(1953309785);
                if (list2.isEmpty()) {
                }
                String str1522 = str62;
                String str1622 = str72;
                String str1722 = str82;
                String str1822 = str92;
                composer.endReplaceGroup();
                composer2.startReplaceGroup(1953381317);
                MapTabContent$lambda$63 = MapTabContentKt.MapTabContent$lambda$6(mutableState11);
                if (MapTabContent$lambda$63.size() >= 2) {
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else if (z4 && l != null) {
                composer.startReplaceGroup(1780812513);
                TextKt.m2376Text4IGK_g("Recording — open Home for map + stats", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1781054685);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapView invoke$lambda$81$lambda$4$lambda$1$lambda$0(OsMapKit osMapKit, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return osMapKit.getMapView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$4$lambda$3$lambda$2(MapView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$13$lambda$6$lambda$5(MutableState mutableState) {
        boolean MapTabContent$lambda$37;
        MapTabContent$lambda$37 = MapTabContentKt.MapTabContent$lambda$37(mutableState);
        MapTabContentKt.MapTabContent$lambda$38(mutableState, !MapTabContent$lambda$37);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$13$lambda$8$lambda$7(Context context, ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState, MutableState mutableState2) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            MapTabContentKt.MapTabContent$lambda$70(mutableState, true);
            MapTabContentKt.MapTabContent$lambda$66(mutableState2, true);
            return Unit.INSTANCE;
        }
        managedActivityResultLauncher.launch("android.permission.ACCESS_FINE_LOCATION");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$13$lambda$10$lambda$9(List list, Function2 function2, Context context) {
        RouteEntity routeEntity = (RouteEntity) CollectionsKt.firstOrNull(list);
        if (routeEntity != null) {
            function2.invoke(Long.valueOf(routeEntity.getId()), routeEntity.getName());
            Toast.makeText(context, "Following: " + routeEntity.getName(), 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$13$lambda$12$lambda$11(MutableState mutableState) {
        boolean MapTabContent$lambda$17;
        MapTabContent$lambda$17 = MapTabContentKt.MapTabContent$lambda$17(mutableState);
        MapTabContentKt.MapTabContent$lambda$18(mutableState, !MapTabContent$lambda$17);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$16$lambda$15$lambda$14(MutableState mutableState) {
        boolean MapTabContent$lambda$2;
        MapTabContent$lambda$2 = MapTabContentKt.MapTabContent$lambda$2(mutableState);
        MapTabContentKt.MapTabContent$lambda$3(mutableState, !MapTabContent$lambda$2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$27$lambda$18$lambda$17(ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch(new String[]{"*/*"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$27$lambda$20$lambda$19(ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch(new String[]{"application/gpx+xml", "application/octet-stream", "*/*"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$27$lambda$22$lambda$21(MutableState mutableState) {
        boolean MapTabContent$lambda$29;
        MapTabContent$lambda$29 = MapTabContentKt.MapTabContent$lambda$29(mutableState);
        MapTabContentKt.MapTabContent$lambda$30(mutableState, !MapTabContent$lambda$29);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$27$lambda$24$lambda$23(MutableState mutableState) {
        boolean MapTabContent$lambda$17;
        MapTabContent$lambda$17 = MapTabContentKt.MapTabContent$lambda$17(mutableState);
        MapTabContentKt.MapTabContent$lambda$18(mutableState, !MapTabContent$lambda$17);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$27$lambda$26$lambda$25(MutableState mutableState) {
        boolean MapTabContent$lambda$37;
        MapTabContent$lambda$37 = MapTabContentKt.MapTabContent$lambda$37(mutableState);
        MapTabContentKt.MapTabContent$lambda$38(mutableState, !MapTabContent$lambda$37);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$29$lambda$28(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(StringsKt.take(it, LogSeverity.WARNING_VALUE));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$39$lambda$35$lambda$34(RowScope rowScope, MutableState mutableState, Context context, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        String MapTabContent$lambda$49;
        Object m7905constructorimpl;
        DownloadManager downloadManager;
        MapTabContent$lambda$49 = MapTabContentKt.MapTabContent$lambda$49(mutableState);
        String obj = StringsKt.trim((CharSequence) MapTabContent$lambda$49).toString();
        try {
            Result.Companion companion = Result.INSTANCE;
            downloadManager = (DownloadManager) context.getSystemService(DownloadManager.class);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (downloadManager == null) {
            throw new IllegalStateException("No DownloadManager");
        }
        File file = new File(context.getExternalFilesDir(null), "offline-maps");
        file.mkdirs();
        File file2 = new File(file, "map-" + System.currentTimeMillis() + ".map");
        mutableState2.setValue(file2.getAbsolutePath());
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(obj));
        request.setTitle("Exercise Tracker offline map");
        request.setDescription("Downloading offline map…");
        request.setNotificationVisibility(1);
        request.setAllowedOverRoaming(false);
        request.setDestinationUri(Uri.fromFile(file2));
        MapTabContentKt.MapTabContent$lambda$62(mutableState3, true);
        mutableState4.setValue("downloading…");
        mutableState5.setValue(Long.valueOf(downloadManager.enqueue(request)));
        Toast.makeText(context, "Downloading… (check notifications)", 0).show();
        m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            MapTabContentKt.MapTabContent$lambda$62(mutableState3, false);
            mutableState5.setValue(null);
            String message = m7908exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "error";
            }
            Toast.makeText(context, "Download failed: " + message, 1).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x000e, code lost:
    
        r0 = com.example.rungps.ui.main.MapTabContentKt.MapTabContent$lambda$53(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit invoke$lambda$81$lambda$80$lambda$39$lambda$38$lambda$37(RowScope rowScope, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        Long MapTabContent$lambda$53;
        try {
            Result.Companion companion = Result.INSTANCE;
            DownloadManager downloadManager = (DownloadManager) context.getSystemService(DownloadManager.class);
            if (downloadManager != null && MapTabContent$lambda$53 != null) {
                downloadManager.remove(MapTabContent$lambda$53.longValue());
            }
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        MapTabContentKt.MapTabContent$lambda$62(mutableState2, false);
        mutableState.setValue(null);
        mutableState3.setValue("download cancelled");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$49$lambda$41$lambda$40(List list, Function2 function2, Context context) {
        RouteEntity routeEntity = (RouteEntity) CollectionsKt.firstOrNull(list);
        if (routeEntity != null) {
            function2.invoke(Long.valueOf(routeEntity.getId()), routeEntity.getName());
            Toast.makeText(context, "Following: " + routeEntity.getName(), 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$49$lambda$44$lambda$43$lambda$42(Function2 function2, RouteEntity routeEntity, Context context) {
        function2.invoke(Long.valueOf(routeEntity.getId()), routeEntity.getName());
        Toast.makeText(context, "Following: " + routeEntity.getName(), 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$49$lambda$46$lambda$45(MapView mapView, Context context) {
        mapView.getTileProvider().clearTileCache();
        mapView.invalidate();
        Toast.makeText(context, "Reloading tiles…", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$49$lambda$48$lambda$47(Context context, ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState, MutableState mutableState2) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            MapTabContentKt.MapTabContent$lambda$70(mutableState, true);
            MapTabContentKt.MapTabContent$lambda$66(mutableState2, true);
            return Unit.INSTANCE;
        }
        managedActivityResultLauncher.launch("android.permission.ACCESS_FINE_LOCATION");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$54$lambda$51$lambda$50(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(CollectionsKt.emptyList());
        mutableState2.setValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$54$lambda$53$lambda$52(MutableState mutableState, Context context, CoroutineScope coroutineScope, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        List MapTabContent$lambda$6;
        OsrmWalkingRouter osrmWalkingRouter = OsrmWalkingRouter.INSTANCE;
        List list = (List) mutableState.getValue();
        MapTabContent$lambda$6 = MapTabContentKt.MapTabContent$lambda$6(mutableState2);
        List anchorsForSnap$default = OsrmWalkingRouter.anchorsForSnap$default(osrmWalkingRouter, list, MapTabContent$lambda$6, 0, 4, null);
        if (anchorsForSnap$default.size() >= 2) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new MapTabContentKt$MapTabContent$13$1$4$5$2$1$1(anchorsForSnap$default, mutableState3, mutableState, mutableState4, context, null), 2, null);
            return Unit.INSTANCE;
        }
        Toast.makeText(context, "Need at least two plan anchors to snap.", 1).show();
        return Unit.INSTANCE;
    }

    private static final Long invoke$lambda$81$lambda$80$lambda$56(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$60$lambda$59(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$67$lambda$66$lambda$65$lambda$62$lambda$61(Function2 function2, RouteEntity routeEntity) {
        function2.invoke(Long.valueOf(routeEntity.getId()), routeEntity.getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$67$lambda$66$lambda$65$lambda$64$lambda$63(RouteEntity routeEntity, MutableState mutableState) {
        mutableState.setValue(Long.valueOf(routeEntity.getId()));
        return Unit.INSTANCE;
    }

    private static final Integer invoke$lambda$81$lambda$80$parsePaceSecPerKm(String str) {
        Integer intOrNull;
        List split$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) str).toString(), new String[]{":"}, false, 0, 6, (Object) null);
        if (split$default.size() == 2 && (intOrNull = StringsKt.toIntOrNull((String) split$default.get(0))) != null) {
            int intValue = intOrNull.intValue();
            Integer intOrNull2 = StringsKt.toIntOrNull((String) split$default.get(1));
            if (intOrNull2 != null) {
                int intValue2 = intOrNull2.intValue();
                if (intValue >= 0 && intValue2 >= 0 && intValue2 < 60) {
                    return Integer.valueOf((intValue * 60) + intValue2);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$74$lambda$69$lambda$68(MutableState mutableState) {
        mutableState.setValue("5:00");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$74$lambda$71$lambda$70(MutableState mutableState) {
        mutableState.setValue("6:00");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$74$lambda$73$lambda$72(MutableState mutableState) {
        mutableState.setValue("7:00");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$79$lambda$78(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue("");
        MapTabContentKt.MapTabContent$lambda$22(mutableState2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$81$lambda$80$lambda$77$lambda$76(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == ':') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(StringsKt.take(sb2, 5));
        return Unit.INSTANCE;
    }
}
