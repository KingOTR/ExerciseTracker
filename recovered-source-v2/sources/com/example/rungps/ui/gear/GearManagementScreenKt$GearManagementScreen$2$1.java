package com.example.rungps.ui.gear;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.rungps.data.GearEntity;
import com.example.rungps.data.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GearManagementScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GearManagementScreenKt$GearManagementScreen$2$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ State<List<GearEntity>> $allGear$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<GearEntity> $editing$delegate;
    final /* synthetic */ MutableState<Map<Long, Double>> $kmById$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $showAdd$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    GearManagementScreenKt$GearManagementScreen$2$1(State<? extends List<GearEntity>> state, CoroutineScope coroutineScope, Repository repository, Context context, MutableState<Map<Long, Double>> mutableState, MutableState<GearEntity> mutableState2, MutableState<Boolean> mutableState3) {
        this.$allGear$delegate = state;
        this.$scope = coroutineScope;
        this.$repo = repository;
        this.$ctx = context;
        this.$kmById$delegate = mutableState;
        this.$editing$delegate = mutableState2;
        this.$showAdd$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
        List GearManagementScreen$lambda$1;
        List GearManagementScreen$lambda$12;
        List GearManagementScreen$lambda$13;
        Map GearManagementScreen$lambda$3;
        Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(557633697, i, -1, "com.example.rungps.ui.gear.GearManagementScreen.<anonymous>.<anonymous> (GearManagementScreen.kt:72)");
            }
            GearManagementScreen$lambda$1 = GearManagementScreenKt.GearManagementScreen$lambda$1(this.$allGear$delegate);
            if (GearManagementScreen$lambda$1.isEmpty()) {
                composer.startReplaceGroup(-1560794900);
                TextKt.m2376Text4IGK_g("Add running shoes or a bike to auto-track mileage on activities.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1560470330);
                composer.startReplaceGroup(642400106);
                GearManagementScreen$lambda$12 = GearManagementScreenKt.GearManagementScreen$lambda$1(this.$allGear$delegate);
                ArrayList<GearEntity> arrayList = new ArrayList();
                for (Object obj : GearManagementScreen$lambda$12) {
                    if (!((GearEntity) obj).isRetired()) {
                        arrayList.add(obj);
                    }
                }
                final CoroutineScope coroutineScope = this.$scope;
                final Repository repository = this.$repo;
                final Context context = this.$ctx;
                MutableState<Map<Long, Double>> mutableState = this.$kmById$delegate;
                final MutableState<GearEntity> mutableState2 = this.$editing$delegate;
                for (final GearEntity gearEntity : arrayList) {
                    GearManagementScreen$lambda$3 = GearManagementScreenKt.GearManagementScreen$lambda$3(mutableState);
                    Double d = (Double) GearManagementScreen$lambda$3.get(Long.valueOf(gearEntity.getId()));
                    double doubleValue = d != null ? d.doubleValue() : gearEntity.getStartingOdometerKm();
                    composer.startReplaceGroup(1637326640);
                    boolean changedInstance = composer.changedInstance(gearEntity);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$GearManagementScreen$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$9$lambda$2$lambda$1;
                                invoke$lambda$9$lambda$2$lambda$1 = GearManagementScreenKt$GearManagementScreen$2$1.invoke$lambda$9$lambda$2$lambda$1(GearEntity.this, mutableState2);
                                return invoke$lambda$9$lambda$2$lambda$1;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(1637328654);
                    boolean changedInstance2 = composer.changedInstance(coroutineScope) | composer.changedInstance(repository) | composer.changedInstance(gearEntity) | composer.changedInstance(context);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$GearManagementScreen$2$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$9$lambda$4$lambda$3;
                                invoke$lambda$9$lambda$4$lambda$3 = GearManagementScreenKt$GearManagementScreen$2$1.invoke$lambda$9$lambda$4$lambda$3(CoroutineScope.this, context, gearEntity, repository);
                                return invoke$lambda$9$lambda$4$lambda$3;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function02 = (Function0) rememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(1637338712);
                    boolean changedInstance3 = composer.changedInstance(coroutineScope) | composer.changedInstance(repository) | composer.changedInstance(gearEntity) | composer.changedInstance(context);
                    Object rememberedValue3 = composer.rememberedValue();
                    if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$GearManagementScreen$2$1$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$9$lambda$6$lambda$5;
                                invoke$lambda$9$lambda$6$lambda$5 = GearManagementScreenKt$GearManagementScreen$2$1.invoke$lambda$9$lambda$6$lambda$5(CoroutineScope.this, context, repository, gearEntity);
                                return invoke$lambda$9$lambda$6$lambda$5;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function03 = (Function0) rememberedValue3;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(1637347130);
                    boolean changedInstance4 = composer.changedInstance(coroutineScope) | composer.changedInstance(repository) | composer.changedInstance(gearEntity) | composer.changedInstance(context);
                    Object rememberedValue4 = composer.rememberedValue();
                    if (changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$GearManagementScreen$2$1$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$9$lambda$8$lambda$7;
                                invoke$lambda$9$lambda$8$lambda$7 = GearManagementScreenKt$GearManagementScreen$2$1.invoke$lambda$9$lambda$8$lambda$7(CoroutineScope.this, context, repository, gearEntity);
                                return invoke$lambda$9$lambda$8$lambda$7;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue4);
                    }
                    composer.endReplaceGroup();
                    GearManagementScreenKt.GearListRow(gearEntity, doubleValue, function0, function02, function03, (Function0) rememberedValue4, composer, 0);
                    DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null), composer, 0, 3);
                }
                composer.endReplaceGroup();
                GearManagementScreen$lambda$13 = GearManagementScreenKt.GearManagementScreen$lambda$1(this.$allGear$delegate);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : GearManagementScreen$lambda$13) {
                    if (((GearEntity) obj2).isRetired()) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                if (!arrayList3.isEmpty()) {
                    TextKt.m2376Text4IGK_g("+" + arrayList3.size() + " retired", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65530);
                }
                composer.endReplaceGroup();
            }
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            final MutableState<Boolean> mutableState3 = this.$showAdd$delegate;
            final MutableState<GearEntity> mutableState4 = this.$editing$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            Composer m3336constructorimpl = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(1637374112);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: com.example.rungps.ui.gear.GearManagementScreenKt$GearManagementScreen$2$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$13$lambda$12$lambda$11;
                        invoke$lambda$13$lambda$12$lambda$11 = GearManagementScreenKt$GearManagementScreen$2$1.invoke$lambda$13$lambda$12$lambda$11(MutableState.this, mutableState4);
                        return invoke$lambda$13$lambda$12$lambda$11;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) rememberedValue5, null, false, null, null, null, null, null, null, ComposableSingletons$GearManagementScreenKt.INSTANCE.m7027getLambda1$app_sideload(), composer, 805306374, 510);
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
    public static final Unit invoke$lambda$9$lambda$2$lambda$1(GearEntity gearEntity, MutableState mutableState) {
        mutableState.setValue(gearEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$4$lambda$3(CoroutineScope coroutineScope, Context context, GearEntity gearEntity, Repository repository) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GearManagementScreenKt$GearManagementScreen$2$1$2$2$1$1(repository, gearEntity, null), 2, null);
        Toast.makeText(context, "Retired " + gearEntity.getName(), 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$6$lambda$5(CoroutineScope coroutineScope, Context context, Repository repository, GearEntity gearEntity) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GearManagementScreenKt$GearManagementScreen$2$1$2$3$1$1(repository, gearEntity, null), 2, null);
        Toast.makeText(context, "Default for runs", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7(CoroutineScope coroutineScope, Context context, Repository repository, GearEntity gearEntity) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GearManagementScreenKt$GearManagementScreen$2$1$2$4$1$1(repository, gearEntity, null), 2, null);
        Toast.makeText(context, "Default for rides", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$11(MutableState mutableState, MutableState mutableState2) {
        GearManagementScreenKt.GearManagementScreen$lambda$10(mutableState, true);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }
}
