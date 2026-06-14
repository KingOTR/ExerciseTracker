package com.example.rungps.ui.gear;

import android.content.Context;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.GearEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.gear.GearAdvice;
import com.example.rungps.gear.GearTypes;
import com.example.rungps.ui.components.TabUiKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GearManagementScreen.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001aU\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u000f\u001aG\u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016X\u008a\u0084\u0002²\u0006\u0016\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u001bX\u008a\u008e\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020!X\u008a\u008e\u0002²\u0006\f\u0010'\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002"}, d2 = {"GearManagementScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GearListRow", "gear", "Lcom/example/rungps/data/GearEntity;", "totalKm", "", "onEdit", "Lkotlin/Function0;", "onRetire", "onSetDefaultRun", "onSetDefaultRide", "(Lcom/example/rungps/data/GearEntity;DLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GearEditorCard", "existing", "onDismiss", "onSave", "Lkotlin/Function1;", "bikes", "", "(Lcom/example/rungps/data/GearEntity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "allGear", "kmById", "", "", "editing", "showAdd", "", "gearType", "", HintConstants.AUTOFILL_HINT_NAME, "brand", "model", "startingKm", "notes", "parentBikeId"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearManagementScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GearEditorCard$lambda$56(GearEntity gearEntity, Function0 function0, Function1 function1, List list, int i, Composer composer, int i2) {
        GearEditorCard(gearEntity, function0, function1, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GearListRow$lambda$32$lambda$28$lambda$27$lambda$26(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GearListRow$lambda$33(GearEntity gearEntity, double d, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, Composer composer, int i2) {
        GearListRow(gearEntity, d, function0, function02, function03, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GearManagementScreen$lambda$18(Modifier modifier, int i, int i2, Composer composer, int i3) {
        GearManagementScreen(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void GearManagementScreen(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final MutableState mutableState;
        final MutableState mutableState2;
        Composer startRestartGroup = composer.startRestartGroup(-1637497322);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1637497322, i3, -1, "com.example.rungps.ui.gear.GearManagementScreen (GearManagementScreen.kt:45)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            startRestartGroup.startReplaceGroup(-1494274938);
            boolean changed = startRestartGroup.changed(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = Repository.INSTANCE.get(context);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Repository repository = (Repository) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            State collectAsState = SnapshotStateKt.collectAsState(repository.gearFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(-1494269477);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1494266993);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState4 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1494264893);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState5 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            List<GearEntity> GearManagementScreen$lambda$1 = GearManagementScreen$lambda$1(collectAsState);
            startRestartGroup.startReplaceGroup(-1494262745);
            boolean changed2 = startRestartGroup.changed(collectAsState) | startRestartGroup.changedInstance(repository);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (Function2) new GearManagementScreenKt$GearManagementScreen$1$1(collectAsState, repository, mutableState3, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(GearManagementScreen$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
            Modifier m688paddingqDBjuR0$default = PaddingKt.m688paddingqDBjuR0$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, Dp.m6303constructorimpl(24), 7, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m688paddingqDBjuR0$default);
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
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TabUiKt.TabHeroHeader("My gear", "Track shoes, bikes & components — mileage links to runs and rides", null, null, startRestartGroup, 54, 12);
            TabUiKt.TabSectionCard("Your gear", null, ComposableLambdaKt.rememberComposableLambda(557633697, true, new GearManagementScreenKt$GearManagementScreen$2$1(collectAsState, coroutineScope, repository, context, mutableState3, mutableState4, mutableState5), startRestartGroup, 54), startRestartGroup, 390, 2);
            GearAdviceCardsKt.GearAdviceSection(null, 4, null, startRestartGroup, 48, 5);
            startRestartGroup.startReplaceGroup(1947192759);
            if (GearManagementScreen$lambda$9(mutableState5) || GearManagementScreen$lambda$6(mutableState4) != null) {
                GearEntity GearManagementScreen$lambda$6 = GearManagementScreen$lambda$6(mutableState4);
                startRestartGroup.startReplaceGroup(1947196163);
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    mutableState = mutableState4;
                    mutableState2 = mutableState5;
                    rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit GearManagementScreen$lambda$17$lambda$13$lambda$12;
                            GearManagementScreen$lambda$17$lambda$13$lambda$12 = GearManagementScreenKt.GearManagementScreen$lambda$17$lambda$13$lambda$12(MutableState.this, mutableState);
                            return GearManagementScreen$lambda$17$lambda$13$lambda$12;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                } else {
                    mutableState = mutableState4;
                    mutableState2 = mutableState5;
                }
                Function0 function0 = (Function0) rememberedValue7;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1947198471);
                boolean changedInstance = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(repository) | startRestartGroup.changedInstance(context);
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Unit GearManagementScreen$lambda$17$lambda$15$lambda$14;
                            GearManagementScreen$lambda$17$lambda$15$lambda$14 = GearManagementScreenKt.GearManagementScreen$lambda$17$lambda$15$lambda$14(CoroutineScope.this, context, repository, mutableState2, mutableState, (GearEntity) obj2);
                            return GearManagementScreen$lambda$17$lambda$15$lambda$14;
                        }
                    };
                    startRestartGroup.updateRememberedValue(obj);
                    rememberedValue8 = obj;
                }
                Function1 function1 = (Function1) rememberedValue8;
                startRestartGroup.endReplaceGroup();
                List<GearEntity> GearManagementScreen$lambda$12 = GearManagementScreen$lambda$1(collectAsState);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : GearManagementScreen$lambda$12) {
                    GearEntity gearEntity = (GearEntity) obj2;
                    if (GearTypes.INSTANCE.isBike(gearEntity.getGearType()) && !gearEntity.isRetired()) {
                        arrayList.add(obj2);
                    }
                }
                GearEditorCard(GearManagementScreen$lambda$6, function0, function1, arrayList, startRestartGroup, 48);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Unit GearManagementScreen$lambda$18;
                    GearManagementScreen$lambda$18 = GearManagementScreenKt.GearManagementScreen$lambda$18(Modifier.this, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    return GearManagementScreen$lambda$18;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Long, Double> GearManagementScreen$lambda$3(MutableState<Map<Long, Double>> mutableState) {
        return mutableState.getValue();
    }

    private static final GearEntity GearManagementScreen$lambda$6(MutableState<GearEntity> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GearManagementScreen$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GearManagementScreen$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GearManagementScreen$lambda$17$lambda$13$lambda$12(MutableState mutableState, MutableState mutableState2) {
        GearManagementScreen$lambda$10(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GearManagementScreen$lambda$17$lambda$15$lambda$14(CoroutineScope coroutineScope, Context context, Repository repository, MutableState mutableState, MutableState mutableState2, GearEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GearManagementScreenKt$GearManagementScreen$2$3$1$1(entity, repository, null), 2, null);
        GearManagementScreen$lambda$10(mutableState, false);
        mutableState2.setValue(null);
        Toast.makeText(context, "Saved " + entity.getName(), 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GearListRow(final GearEntity gearEntity, final double d, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Composer composer, final int i) {
        int i2;
        GearAdvice.Advice advice;
        Composer startRestartGroup = composer.startRestartGroup(2094761623);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(gearEntity) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(d) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2094761623, i2, -1, "com.example.rungps.ui.gear.GearListRow (GearManagementScreen.kt:141)");
            }
            GearAdvice.Advice advise = GearAdvice.INSTANCE.advise(gearEntity, d);
            GearAdvice.Thresholds thresholds = GearAdvice.INSTANCE.thresholds(gearEntity.getGearType());
            Modifier m686paddingVpY3zN4$default = PaddingKt.m686paddingVpY3zN4$default(ClickableKt.m272clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, function0, 7, null), 0.0f, Dp.m6303constructorimpl(8), 1, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m686paddingVpY3zN4$default);
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
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
            Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            TextKt.m2376Text4IGK_g(gearEntity.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
            StringBuilder sb = new StringBuilder();
            sb.append(GearTypes.INSTANCE.label(gearEntity.getGearType()));
            String brand = gearEntity.getBrand();
            if (brand != null) {
                if (StringsKt.isBlank(brand)) {
                    brand = null;
                }
                if (brand != null) {
                    sb.append(" · " + brand);
                }
            }
            String model = gearEntity.getModel();
            if (model != null) {
                if (StringsKt.isBlank(model)) {
                    model = null;
                }
                if (model != null) {
                    sb.append(" " + model);
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            TextKt.m2376Text4IGK_g(sb2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%.0f km", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.m2376Text4IGK_g(format, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131034);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1462802779);
            if (thresholds == null) {
                advice = null;
            } else {
                final float coerceIn = RangesKt.coerceIn((float) (d / thresholds.getReplaceKm()), 0.0f, 1.0f);
                startRestartGroup.startReplaceGroup(-1197406956);
                boolean changed = startRestartGroup.changed(coerceIn);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float GearListRow$lambda$32$lambda$28$lambda$27$lambda$26;
                            GearListRow$lambda$32$lambda$28$lambda$27$lambda$26 = GearManagementScreenKt.GearListRow$lambda$32$lambda$28$lambda$27$lambda$26(coerceIn);
                            return Float.valueOf(GearListRow$lambda$32$lambda$28$lambda$27$lambda$26);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                advice = null;
                ProgressIndicatorKt.m2054LinearProgressIndicatorGJbTh5U((Function0) rememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, 0, 0.0f, null, startRestartGroup, 48, 124);
                TextKt.m2376Text4IGK_g(RangesKt.coerceAtMost((int) ((d / thresholds.getReplaceKm()) * 100), 999) + "% of " + ((int) thresholds.getReplaceKm()) + " km", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            if (advise == null || advise.getUrgency() == GearAdvice.Urgency.GOOD) {
                advise = advice;
            }
            startRestartGroup.startReplaceGroup(1462819501);
            if (advise != null) {
                TextKt.m2376Text4IGK_g(advise.getMessage(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getTertiary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 0, 0, 65530);
                Unit unit5 = Unit.INSTANCE;
                Unit unit6 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            Updater.m3343setimpl(m3336constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1197387261);
            if (GearTypes.INSTANCE.isShoe(gearEntity.getGearType())) {
                ChipKt.FilterChip(gearEntity.isDefaultForRun(), function03, ComposableSingletons$GearManagementScreenKt.INSTANCE.m7030getLambda2$app_sideload(), null, false, null, null, null, null, null, null, null, startRestartGroup, ((i2 >> 9) & SdkConfig.SDK_VERSION) | 384, 0, 4088);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1197378810);
            if (GearTypes.INSTANCE.isBike(gearEntity.getGearType())) {
                ChipKt.FilterChip(gearEntity.isDefaultForRide(), function04, ComposableSingletons$GearManagementScreenKt.INSTANCE.m7031getLambda3$app_sideload(), null, false, null, null, null, null, null, null, null, startRestartGroup, ((i2 >> 12) & SdkConfig.SDK_VERSION) | 384, 0, 4088);
            }
            startRestartGroup.endReplaceGroup();
            ButtonKt.OutlinedButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$GearManagementScreenKt.INSTANCE.m7032getLambda4$app_sideload(), startRestartGroup, ((i2 >> 9) & 14) | 805306368, 510);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GearListRow$lambda$33;
                    GearListRow$lambda$33 = GearManagementScreenKt.GearListRow$lambda$33(GearEntity.this, d, function0, function02, function03, function04, i, (Composer) obj, ((Integer) obj2).intValue());
                    return GearListRow$lambda$33;
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x016c, code lost:
    
        if (r0 == null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void GearEditorCard(final GearEntity gearEntity, final Function0<Unit> function0, final Function1<? super GearEntity, Unit> function1, final List<GearEntity> list, Composer composer, final int i) {
        int i2;
        String str;
        String str2;
        String str3;
        Composer startRestartGroup = composer.startRestartGroup(1560716600);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(gearEntity) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1560716600, i2, -1, "com.example.rungps.ui.gear.GearEditorCard (GearManagementScreen.kt:212)");
            }
            startRestartGroup.startReplaceGroup(-1031820817);
            boolean changed = startRestartGroup.changed(gearEntity);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                if (gearEntity == null || (str = gearEntity.getGearType()) == null) {
                    str = GearTypes.RUNNING_SHOES;
                }
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1031817238);
            boolean changed2 = startRestartGroup.changed(gearEntity);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (gearEntity == null || (str2 = gearEntity.getName()) == null) {
                    str2 = "";
                }
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1031814769);
            boolean changed3 = startRestartGroup.changed(gearEntity);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                String brand = gearEntity != null ? gearEntity.getBrand() : null;
                if (brand == null) {
                    brand = "";
                }
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(brand, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1031812145);
            boolean changed4 = startRestartGroup.changed(gearEntity);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                String model = gearEntity != null ? gearEntity.getModel() : null;
                if (model == null) {
                    model = "";
                }
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(model, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState4 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1031809293);
            boolean changed5 = startRestartGroup.changed(gearEntity);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                if (gearEntity != null) {
                    double startingOdometerKm = gearEntity.getStartingOdometerKm();
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str3 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(startingOdometerKm)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                }
                str3 = "0";
                MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str3, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                rememberedValue5 = mutableStateOf$default;
            }
            MutableState mutableState5 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1031804561);
            boolean changed6 = startRestartGroup.changed(gearEntity);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                String notes = gearEntity != null ? gearEntity.getNotes() : null;
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(notes != null ? notes : "", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState6 = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1031801716);
            boolean changed7 = startRestartGroup.changed(gearEntity);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed7 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(gearEntity != null ? gearEntity.getParentGearId() : null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState7 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            TabUiKt.TabSectionCard(gearEntity == null ? "Add gear" : "Edit gear", null, ComposableLambdaKt.rememberComposableLambda(1454602775, true, new GearManagementScreenKt$GearEditorCard$1(list, mutableState7, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState, function1, gearEntity, function0), startRestartGroup, 54), startRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GearEditorCard$lambda$56;
                    GearEditorCard$lambda$56 = GearManagementScreenKt.GearEditorCard$lambda$56(GearEntity.this, function0, function1, list, i, (Composer) obj, ((Integer) obj2).intValue());
                    return GearEditorCard$lambda$56;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GearEditorCard$lambda$35(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GearEditorCard$lambda$38(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GearEditorCard$lambda$41(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GearEditorCard$lambda$44(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GearEditorCard$lambda$48(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GearEditorCard$lambda$51(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long GearEditorCard$lambda$54(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GearEntity> GearManagementScreen$lambda$1(State<? extends List<GearEntity>> state) {
        return state.getValue();
    }
}
