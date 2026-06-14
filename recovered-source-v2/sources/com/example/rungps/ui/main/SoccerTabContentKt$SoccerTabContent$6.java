package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.rungps.analytics.SoccerHrZones;
import com.example.rungps.ble.BleClient;
import com.example.rungps.ble.BleStatus;
import com.example.rungps.data.MoyoungImportStats;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SoccerSessionEntity;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SoccerTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SoccerTabContentKt$SoccerTabContent$6 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ BleClient $ble;
    final /* synthetic */ BleStatus $bleStatus;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Function0<Unit> $onOpenWatchConnect;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ State<List<SoccerSessionEntity>> $sessions$delegate;
    final /* synthetic */ MutableState<Boolean> $showAdd$delegate;
    final /* synthetic */ String $sportLabel;

    /* JADX WARN: Multi-variable type inference failed */
    SoccerTabContentKt$SoccerTabContent$6(BleStatus bleStatus, Function0<Unit> function0, String str, MutableState<Boolean> mutableState, BleClient bleClient, Context context, State<? extends List<SoccerSessionEntity>> state, CoroutineScope coroutineScope, Repository repository) {
        this.$bleStatus = bleStatus;
        this.$onOpenWatchConnect = function0;
        this.$sportLabel = str;
        this.$showAdd$delegate = mutableState;
        this.$ble = bleClient;
        this.$ctx = context;
        this.$sessions$delegate = state;
        this.$scope = coroutineScope;
        this.$repo = repository;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(ColumnScope Card, Composer composer, int i) {
        Context context;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean changedInstance;
        Object rememberedValue;
        boolean changedInstance2;
        Object rememberedValue2;
        MoyoungImportStats lastMoyoungImport;
        List SoccerTabContent$lambda$1;
        List SoccerTabContent$lambda$12;
        String str8;
        SoccerSessionEntity soccerSessionEntity;
        String str9;
        String str10;
        String str11;
        CoroutineScope coroutineScope;
        Repository repository;
        final Context context2;
        String label;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1890805668, i, -1, "com.example.rungps.ui.main.SoccerTabContent.<anonymous> (SoccerTabContent.kt:180)");
        }
        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
        final BleStatus bleStatus = this.$bleStatus;
        Function0<Unit> function0 = this.$onOpenWatchConnect;
        String str12 = this.$sportLabel;
        final MutableState<Boolean> mutableState = this.$showAdd$delegate;
        final BleClient bleClient = this.$ble;
        final Context context3 = this.$ctx;
        State<List<SoccerSessionEntity>> state = this.$sessions$delegate;
        CoroutineScope coroutineScope2 = this.$scope;
        Repository repository2 = this.$repo;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
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
        Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
        }
        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
        Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
        }
        Updater.m3343setimpl(m3336constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String str13 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
        String str14 = "C88@4444L9:Column.kt#2w3rfo";
        CoroutineScope coroutineScope3 = coroutineScope2;
        Repository repository3 = repository2;
        TextKt.m2376Text4IGK_g(str12, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 0, 0, 65534);
        composer.startReplaceGroup(-259789995);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$29$lambda$2$lambda$1$lambda$0;
                    invoke$lambda$29$lambda$2$lambda$1$lambda$0 = SoccerTabContentKt$SoccerTabContent$6.invoke$lambda$29$lambda$2$lambda$1$lambda$0(MutableState.this);
                    return invoke$lambda$29$lambda$2$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        ButtonKt.OutlinedButton((Function0) rememberedValue3, null, false, null, null, null, null, null, null, ComposableSingletons$SoccerTabContentKt.INSTANCE.m7270getLambda10$app_sideload(), composer, 805306374, 510);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextKt.m2376Text4IGK_g("Manual log on phone, or sync sessions recorded on your Exercise Tracker watch.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131066);
        if (bleStatus.getConnectedAddress() == null) {
            composer.startReplaceGroup(-106117811);
            ButtonKt.OutlinedButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$SoccerTabContentKt.INSTANCE.m7271getLambda11$app_sideload(), composer, 805306368, 510);
            composer.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
            str5 = str12;
            context = context3;
            str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
            str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            str3 = "C101@5126L9:Row.kt#2w3rfo";
            str4 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
        } else if (bleStatus.getHasExerciseTrackerSoccerService()) {
            composer.startReplaceGroup(-105898083);
            Integer watchSoccerState = bleStatus.getWatchSoccerState();
            if (watchSoccerState == null) {
                str6 = str12;
            } else if (watchSoccerState.intValue() == 1) {
                Integer watchSoccerElapsedSec = bleStatus.getWatchSoccerElapsedSec();
                str6 = str12;
                str7 = str6 + ": recording on watch (" + ((watchSoccerElapsedSec != null ? watchSoccerElapsedSec.intValue() : 0) / 60) + " min)";
                String str15 = str6;
                TextKt.m2376Text4IGK_g(str7, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.useNode();
                } else {
                    composer.createNode(constructor3);
                }
                m3336constructorimpl = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer.startReplaceGroup(-259745627);
                changedInstance = composer.changedInstance(bleClient);
                rememberedValue = composer.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$29$lambda$8$lambda$4$lambda$3;
                            invoke$lambda$29$lambda$8$lambda$4$lambda$3 = SoccerTabContentKt$SoccerTabContent$6.invoke$lambda$29$lambda$8$lambda$4$lambda$3(BleClient.this);
                            return invoke$lambda$29$lambda$8$lambda$4$lambda$3;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                str3 = "C101@5126L9:Row.kt#2w3rfo";
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str4 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                ButtonKt.OutlinedButton((Function0) rememberedValue, null, !bleStatus.getSyncingSoccer(), null, null, null, null, null, null, ComposableSingletons$SoccerTabContentKt.INSTANCE.m7272getLambda12$app_sideload(), composer, 805306368, 506);
                composer.startReplaceGroup(-259738791);
                changedInstance2 = composer.changedInstance(bleClient) | composer.changedInstance(context3);
                rememberedValue2 = composer.rememberedValue();
                if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$29$lambda$8$lambda$7$lambda$6;
                            invoke$lambda$29$lambda$8$lambda$7$lambda$6 = SoccerTabContentKt$SoccerTabContent$6.invoke$lambda$29$lambda$8$lambda$7$lambda$6(BleClient.this, context3);
                            return invoke$lambda$29$lambda$8$lambda$7$lambda$6;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                context = context3;
                ButtonKt.OutlinedButton((Function0) rememberedValue2, null, !bleStatus.getSyncingSoccer(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2140400477, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$1$2$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope OutlinedButton, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                        if ((i2 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2140400477, i2, -1, "com.example.rungps.ui.main.SoccerTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SoccerTabContent.kt:224)");
                        }
                        TextKt.m2376Text4IGK_g(BleStatus.this.getSyncingSoccer() ? "Syncing…" : "Sync from watch", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 805306368, 506);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                lastMoyoungImport = bleStatus.getLastMoyoungImport();
                if (lastMoyoungImport != null) {
                    str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                } else {
                    str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                    TextKt.m2376Text4IGK_g("Synced: " + lastMoyoungImport.getMessage(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                    Unit unit2 = Unit.INSTANCE;
                    Unit unit3 = Unit.INSTANCE;
                }
                composer.endReplaceGroup();
                str5 = str15;
            } else {
                str6 = str12;
            }
            str7 = (watchSoccerState != null && watchSoccerState.intValue() == 2) ? str6 + ": stopped on watch — sync when ready" : str6 + ": start/stop on watch (works without phone)";
            String str152 = str6;
            TextKt.m2376Text4IGK_g(str7, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_422 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m564spacedBy0680j_422, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap32 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer, companion2);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
            }
            m3336constructorimpl = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl.getInserting()) {
            }
            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(-259745627);
            changedInstance = composer.changedInstance(bleClient);
            rememberedValue = composer.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$29$lambda$8$lambda$4$lambda$3;
                    invoke$lambda$29$lambda$8$lambda$4$lambda$3 = SoccerTabContentKt$SoccerTabContent$6.invoke$lambda$29$lambda$8$lambda$4$lambda$3(BleClient.this);
                    return invoke$lambda$29$lambda$8$lambda$4$lambda$3;
                }
            };
            composer.updateRememberedValue(rememberedValue);
            composer.endReplaceGroup();
            str3 = "C101@5126L9:Row.kt#2w3rfo";
            str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            str4 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            ButtonKt.OutlinedButton((Function0) rememberedValue, null, !bleStatus.getSyncingSoccer(), null, null, null, null, null, null, ComposableSingletons$SoccerTabContentKt.INSTANCE.m7272getLambda12$app_sideload(), composer, 805306368, 506);
            composer.startReplaceGroup(-259738791);
            changedInstance2 = composer.changedInstance(bleClient) | composer.changedInstance(context3);
            rememberedValue2 = composer.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$29$lambda$8$lambda$7$lambda$6;
                    invoke$lambda$29$lambda$8$lambda$7$lambda$6 = SoccerTabContentKt$SoccerTabContent$6.invoke$lambda$29$lambda$8$lambda$7$lambda$6(BleClient.this, context3);
                    return invoke$lambda$29$lambda$8$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
            composer.endReplaceGroup();
            context = context3;
            ButtonKt.OutlinedButton((Function0) rememberedValue2, null, !bleStatus.getSyncingSoccer(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-2140400477, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$1$2$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope OutlinedButton, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i2 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2140400477, i2, -1, "com.example.rungps.ui.main.SoccerTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SoccerTabContent.kt:224)");
                    }
                    TextKt.m2376Text4IGK_g(BleStatus.this.getSyncingSoccer() ? "Syncing…" : "Sync from watch", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 805306368, 506);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            lastMoyoungImport = bleStatus.getLastMoyoungImport();
            if (lastMoyoungImport != null) {
            }
            composer.endReplaceGroup();
            str5 = str152;
        } else {
            context = context3;
            str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
            str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            str3 = "C101@5126L9:Row.kt#2w3rfo";
            str4 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            composer.startReplaceGroup(-104068122);
            str5 = str12;
            TextKt.m2376Text4IGK_g("Watch connected but " + str12 + " service not found on this device.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
            composer.endReplaceGroup();
            Unit unit4 = Unit.INSTANCE;
        }
        SoccerTabContent$lambda$1 = SoccerTabContentKt.SoccerTabContent$lambda$1(state);
        if (SoccerTabContent$lambda$1.isEmpty()) {
            composer.startReplaceGroup(-103757409);
            TextKt.m2376Text4IGK_g("No " + str5 + " sessions logged yet.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
            composer.endReplaceGroup();
        } else {
            Composer composer2 = composer;
            composer2.startReplaceGroup(-103509905);
            SoccerTabContent$lambda$12 = SoccerTabContentKt.SoccerTabContent$lambda$1(state);
            for (final SoccerSessionEntity soccerSessionEntity2 : CollectionsKt.take(SoccerTabContent$lambda$12, 20)) {
                LocalDate localDate = Instant.ofEpochMilli(soccerSessionEntity2.getStartTimeMs()).atZone(ZoneId.systemDefault()).toLocalDate();
                int warmupMin = soccerSessionEntity2.getWarmupMin() + soccerSessionEntity2.getPlayMin();
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                String str16 = str;
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, str16);
                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composer2, 54);
                String str17 = str4;
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str17);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                String str18 = str2;
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str18);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer.useNode();
                }
                Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                String str19 = str3;
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, str19);
                Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                String str20 = str13;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str20);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str17);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, weight$default);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str18);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer.useNode();
                }
                Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl5, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m3343setimpl(m3336constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                String str21 = str14;
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, str21);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                TextKt.m2376Text4IGK_g(soccerSessionEntity2.getKind() + " • " + localDate + " · " + (soccerSessionEntity2.getWatchSessionId() != null ? "watch" : "manual"), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleSmall(), composer, 0, 0, 65534);
                if (Intrinsics.areEqual(soccerSessionEntity2.getKind(), "TRAINING")) {
                    str8 = "Training " + soccerSessionEntity2.getPlayMin() + "m · Int " + soccerSessionEntity2.getIntensity() + "/10";
                } else if (soccerSessionEntity2.getWatchSessionId() != null) {
                    str8 = warmupMin + "m · Int " + soccerSessionEntity2.getIntensity() + "/10";
                } else {
                    str8 = "Warmup " + soccerSessionEntity2.getWarmupMin() + "m · Game " + soccerSessionEntity2.getPlayMin() + "m · Total " + warmupMin + "m · Int " + soccerSessionEntity2.getIntensity() + "/10";
                }
                TextKt.m2376Text4IGK_g(str8, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
                List createListBuilder = CollectionsKt.createListBuilder();
                Integer hrAvgBpm = soccerSessionEntity2.getHrAvgBpm();
                if (hrAvgBpm != null) {
                    Boolean.valueOf(createListBuilder.add("HR avg " + hrAvgBpm.intValue()));
                }
                Integer hrMaxBpm = soccerSessionEntity2.getHrMaxBpm();
                if (hrMaxBpm != null) {
                    Boolean.valueOf(createListBuilder.add("max " + hrMaxBpm.intValue()));
                }
                Integer steps = soccerSessionEntity2.getSteps();
                if (steps != null) {
                    if (steps.intValue() <= 0) {
                        steps = null;
                    }
                    if (steps != null) {
                        Boolean.valueOf(createListBuilder.add(steps.intValue() + " steps"));
                    }
                }
                Integer distanceM = soccerSessionEntity2.getDistanceM();
                if (distanceM != null) {
                    if (distanceM.intValue() <= 0) {
                        distanceM = null;
                    }
                    if (distanceM != null) {
                        Boolean.valueOf(createListBuilder.add(distanceM.intValue() + " m"));
                    }
                }
                Integer calories = soccerSessionEntity2.getCalories();
                if (calories != null) {
                    if (calories.intValue() <= 0) {
                        calories = null;
                    }
                    if (calories != null) {
                        Boolean.valueOf(createListBuilder.add(calories.intValue() + " kcal"));
                    }
                }
                SoccerHrZones.ZoneMinutes parseJson = SoccerHrZones.INSTANCE.parseJson(soccerSessionEntity2.getHrZonesJson());
                if (parseJson != null && (label = parseJson.label()) != null) {
                    if (StringsKt.isBlank(label)) {
                        label = null;
                    }
                    if (label != null) {
                        createListBuilder.add(label);
                        Unit unit5 = Unit.INSTANCE;
                        Unit unit6 = Unit.INSTANCE;
                    }
                }
                List build = CollectionsKt.build(createListBuilder);
                composer.startReplaceGroup(110448785);
                if (!build.isEmpty()) {
                    TextKt.m2376Text4IGK_g(CollectionsKt.joinToString$default(build, " · ", null, null, 0, null, null, 62, null), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                }
                composer.endReplaceGroup();
                composer.startReplaceGroup(110461282);
                String notes = soccerSessionEntity2.getNotes();
                if (notes != null && !StringsKt.isBlank(notes)) {
                    String notes2 = soccerSessionEntity2.getNotes();
                    Intrinsics.checkNotNull(notes2);
                    TextKt.m2376Text4IGK_g(notes2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, str16);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str17);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer, companion3);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str18);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor6);
                } else {
                    composer.useNode();
                }
                Composer m3336constructorimpl6 = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl6, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl6.getInserting() || !Intrinsics.areEqual(m3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    m3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    m3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m3343setimpl(m3336constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, str19);
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                composer.startReplaceGroup(110471490);
                if (soccerSessionEntity2.getWatchSessionId() != null) {
                    composer.startReplaceGroup(110474194);
                    final CoroutineScope coroutineScope4 = coroutineScope3;
                    final Repository repository4 = repository3;
                    boolean changedInstance3 = composer.changedInstance(coroutineScope4) | composer.changedInstance(repository4) | composer.changedInstance(soccerSessionEntity2);
                    context2 = context;
                    boolean changedInstance4 = changedInstance3 | composer.changedInstance(context2);
                    Object rememberedValue4 = composer.rememberedValue();
                    if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$29$lambda$28$lambda$27$lambda$26$lambda$23$lambda$22;
                                invoke$lambda$29$lambda$28$lambda$27$lambda$26$lambda$23$lambda$22 = SoccerTabContentKt$SoccerTabContent$6.invoke$lambda$29$lambda$28$lambda$27$lambda$26$lambda$23$lambda$22(CoroutineScope.this, repository4, soccerSessionEntity2, context2);
                                return invoke$lambda$29$lambda$28$lambda$27$lambda$26$lambda$23$lambda$22;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue4);
                    }
                    composer.endReplaceGroup();
                    soccerSessionEntity = soccerSessionEntity2;
                    coroutineScope = coroutineScope4;
                    repository = repository4;
                    str9 = str19;
                    str10 = str18;
                    str11 = str17;
                    ButtonKt.OutlinedButton((Function0) rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$SoccerTabContentKt.INSTANCE.m7273getLambda13$app_sideload(), composer, 805306368, 510);
                } else {
                    soccerSessionEntity = soccerSessionEntity2;
                    str9 = str19;
                    str10 = str18;
                    str11 = str17;
                    coroutineScope = coroutineScope3;
                    repository = repository3;
                    context2 = context;
                }
                composer.endReplaceGroup();
                composer.startReplaceGroup(110499168);
                final CoroutineScope coroutineScope5 = coroutineScope;
                final Repository repository5 = repository;
                final SoccerSessionEntity soccerSessionEntity3 = soccerSessionEntity;
                boolean changedInstance5 = composer.changedInstance(coroutineScope5) | composer.changedInstance(repository5) | composer.changedInstance(soccerSessionEntity3);
                Object rememberedValue5 = composer.rememberedValue();
                if (changedInstance5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24;
                            invoke$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24 = SoccerTabContentKt$SoccerTabContent$6.invoke$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24(CoroutineScope.this, repository5, soccerSessionEntity3);
                            return invoke$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue5, null, false, null, null, null, null, null, null, ComposableSingletons$SoccerTabContentKt.INSTANCE.m7274getLambda14$app_sideload(), composer, 805306368, 510);
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
                context = context2;
                str = str16;
                str4 = str11;
                coroutineScope3 = coroutineScope5;
                str3 = str9;
                str2 = str10;
                str14 = str21;
                repository3 = repository5;
                composer2 = composer;
                str13 = str20;
            }
            composer.endReplaceGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$29$lambda$2$lambda$1$lambda$0(MutableState mutableState) {
        SoccerTabContentKt.SoccerTabContent$lambda$5(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$29$lambda$8$lambda$4$lambda$3(BleClient bleClient) {
        bleClient.refreshWatchSoccerStatus();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$29$lambda$8$lambda$7$lambda$6(BleClient bleClient, final Context context) {
        bleClient.syncSoccerFromWatch(new Function1() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$29$lambda$8$lambda$7$lambda$6$lambda$5;
                invoke$lambda$29$lambda$8$lambda$7$lambda$6$lambda$5 = SoccerTabContentKt$SoccerTabContent$6.invoke$lambda$29$lambda$8$lambda$7$lambda$6$lambda$5(context, (MoyoungImportStats) obj);
                return invoke$lambda$29$lambda$8$lambda$7$lambda$6$lambda$5;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$29$lambda$8$lambda$7$lambda$6$lambda$5(Context context, MoyoungImportStats stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        Toast.makeText(context, stats.getMessage(), 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$29$lambda$28$lambda$27$lambda$26$lambda$23$lambda$22(CoroutineScope coroutineScope, Repository repository, SoccerSessionEntity soccerSessionEntity, Context context) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new SoccerTabContentKt$SoccerTabContent$6$1$4$1$2$1$1$1(repository, soccerSessionEntity, context, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$29$lambda$28$lambda$27$lambda$26$lambda$25$lambda$24(CoroutineScope coroutineScope, Repository repository, SoccerSessionEntity soccerSessionEntity) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new SoccerTabContentKt$SoccerTabContent$6$1$4$1$2$2$1$1(repository, soccerSessionEntity, null), 2, null);
        return Unit.INSTANCE;
    }
}
