package com.example.rungps.ui.main;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.intervals.CustomSegment;
import com.example.rungps.intervals.CustomTarget;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CustomPlanEditorPanel.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"CustomPlanEditorPanel", "", "enabled", "", "isBike", HintConstants.AUTOFILL_HINT_NAME, "", "segments", "", "Lcom/example/rungps/intervals/CustomSegment;", "onNameChange", "Lkotlin/Function1;", "onSegmentsChange", "(ZZLjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CustomPlanChip", "selected", "text", "onClick", "Lkotlin/Function0;", "(ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomPlanEditorPanelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanChip$lambda$43(boolean z, String str, boolean z2, Function0 function0, int i, Composer composer, int i2) {
        CustomPlanChip(z, str, z2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$42(boolean z, boolean z2, String str, List list, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        CustomPlanEditorPanel(z, z2, str, list, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0b64  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomPlanEditorPanel(final boolean z, boolean z2, final String name, final List<CustomSegment> segments, final Function1<? super String, Unit> onNameChange, final Function1<? super List<CustomSegment>, Unit> onSegmentsChange, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        final List<CustomSegment> list;
        Composer composer2;
        int currentCompositeKeyHash2;
        Composer m3336constructorimpl2;
        boolean changedInstance;
        Object rememberedValue;
        Composer composer3;
        boolean changedInstance2;
        Object rememberedValue2;
        final boolean z5;
        final Function1<? super List<CustomSegment>, Unit> function1;
        final Function1<? super List<CustomSegment>, Unit> function12;
        String str;
        String str2;
        String str3;
        String str4;
        final String str5;
        int i6;
        int i7;
        Composer composer4;
        boolean z6;
        boolean z7;
        boolean changedInstance3;
        Object rememberedValue3;
        final Function1<? super List<CustomSegment>, Unit> function13;
        boolean changedInstance4;
        Object rememberedValue4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(onNameChange, "onNameChange");
        Intrinsics.checkNotNullParameter(onSegmentsChange, "onSegmentsChange");
        Composer startRestartGroup = composer.startRestartGroup(1269324070);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z3 = z2;
            i3 |= startRestartGroup.changed(z3) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(name) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(segments) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(onNameChange) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                if ((196608 & i) == 0) {
                    i4 = startRestartGroup.changedInstance(onSegmentsChange) ? 131072 : 65536;
                }
                i5 = i3;
                if ((74899 & i5) == 74898 || !startRestartGroup.getSkipping()) {
                    z4 = i8 != 0 ? false : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1269324070, i5, -1, "com.example.rungps.ui.main.CustomPlanEditorPanel (CustomPlanEditorPanel.kt:24)");
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    float f = 8;
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2376Text4IGK_g(z4 ? "Custom ride intervals (time, distance, speed)" : "Custom intervals (mix time + distance)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, 0, 0, 65534);
                    int i9 = (i5 << 9) & 7168;
                    String str6 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    String str7 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    TextFieldKt.TextField(name, onNameChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7163getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248 | ((i5 >> 9) & SdkConfig.SDK_VERSION) | i9, 0, 0, 8388528);
                    Composer composer5 = startRestartGroup;
                    composer5.startReplaceGroup(849447314);
                    final List<CustomSegment> list2 = segments;
                    final int i10 = 0;
                    for (Object obj : list2) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final CustomSegment customSegment = (CustomSegment) obj;
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                        ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer5, 6);
                        String str8 = str7;
                        ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, str8);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer5, fillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        String str9 = str6;
                        ComposerKt.sourceInformationMarkerStart(composer5, -692256719, str9);
                        if (!(composer5.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer5.startReusableNode();
                        if (composer5.getInserting()) {
                            composer5.createNode(constructor2);
                        } else {
                            composer5.useNode();
                        }
                        Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer5);
                        Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
                        }
                        Updater.m3343setimpl(m3336constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        String label = customSegment.getLabel();
                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        composer5.startReplaceGroup(-1570418027);
                        int i12 = i5 & 458752;
                        boolean changedInstance5 = (i12 == 131072) | composer5.changedInstance(list2) | composer5.changed(i10);
                        Object rememberedValue5 = composer5.rememberedValue();
                        if (changedInstance5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            function1 = onSegmentsChange;
                            rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$2$lambda$1;
                                    CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$2$lambda$1 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$2$lambda$1(Function1.this, list2, i10, (String) obj2);
                                    return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$2$lambda$1;
                                }
                            };
                            composer5.updateRememberedValue(rememberedValue5);
                        } else {
                            function1 = onSegmentsChange;
                        }
                        composer5.endReplaceGroup();
                        int i13 = i9 | 1573248;
                        final int i14 = i10;
                        Composer composer6 = composer5;
                        TextFieldKt.TextField(label, (Function1<? super String, Unit>) rememberedValue5, fillMaxWidth$default3, z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(2076533199, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$CustomPlanEditorPanel$1$1$1$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                invoke(composer7, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer7, int i15) {
                                if ((i15 & 3) == 2 && composer7.getSkipping()) {
                                    composer7.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2076533199, i15, -1, "com.example.rungps.ui.main.CustomPlanEditorPanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomPlanEditorPanel.kt:47)");
                                }
                                TextKt.m2376Text4IGK_g("Segment " + (i10 + 1) + " label", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer7, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer5, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer6, i13, 0, 0, 8388528);
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                        Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ComposerKt.sourceInformationMarkerStart(composer6, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getTop(), composer6, 6);
                        ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, str8);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer6, fillMaxWidth$default4);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer6, -692256719, str9);
                        if (!(composer6.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer6.startReusableNode();
                        if (composer6.getInserting()) {
                            composer6.createNode(constructor3);
                        } else {
                            composer6.useNode();
                        }
                        Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer6);
                        Updater.m3343setimpl(m3336constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash3);
                        }
                        Updater.m3343setimpl(m3336constructorimpl4, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer6, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        boolean z8 = customSegment.getTarget() instanceof CustomTarget.TimeMs;
                        composer6.startReplaceGroup(-2125570520);
                        boolean changedInstance6 = (i12 == 131072) | composer6.changedInstance(segments) | composer6.changed(i14);
                        Object rememberedValue6 = composer6.rememberedValue();
                        if (changedInstance6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            function12 = onSegmentsChange;
                            rememberedValue6 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$5$lambda$4;
                                    CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$5$lambda$4 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$5$lambda$4(Function1.this, segments, i14);
                                    return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$5$lambda$4;
                                }
                            };
                            composer6.updateRememberedValue(rememberedValue6);
                        } else {
                            function12 = onSegmentsChange;
                        }
                        Function0 function0 = (Function0) rememberedValue6;
                        composer6.endReplaceGroup();
                        int i15 = (i5 << 6) & 896;
                        int i16 = i15 | 48;
                        final Function1<? super List<CustomSegment>, Unit> function14 = function12;
                        CustomPlanChip(z8, "Time", z, function0, composer6, i16);
                        boolean z9 = customSegment.getTarget() instanceof CustomTarget.DistanceM;
                        composer6.startReplaceGroup(-2125552951);
                        boolean changedInstance7 = (i12 == 131072) | composer6.changedInstance(segments) | composer6.changed(i14);
                        Object rememberedValue7 = composer6.rememberedValue();
                        if (changedInstance7 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$8$lambda$7;
                                    CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$8$lambda$7 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$8$lambda$7(Function1.this, segments, i14);
                                    return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$8$lambda$7;
                                }
                            };
                            composer6.updateRememberedValue(rememberedValue7);
                        }
                        composer6.endReplaceGroup();
                        CustomPlanChip(z9, "Distance", z, (Function0) rememberedValue7, composer6, i16);
                        composer6.startReplaceGroup(-2125541697);
                        if (z4) {
                            boolean z10 = customSegment.getTarget() instanceof CustomTarget.SpeedHold;
                            composer6.startReplaceGroup(-2125533686);
                            boolean changedInstance8 = (i12 == 131072) | composer6.changedInstance(segments) | composer6.changed(i14);
                            Object rememberedValue8 = composer6.rememberedValue();
                            if (changedInstance8 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$11$lambda$10;
                                        CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$11$lambda$10 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$11$lambda$10(Function1.this, segments, i14);
                                        return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$11$lambda$10;
                                    }
                                };
                                composer6.updateRememberedValue(rememberedValue8);
                            }
                            composer6.endReplaceGroup();
                            CustomPlanChip(z10, "Speed", z, (Function0) rememberedValue8, composer6, i16);
                        }
                        composer6.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        composer6.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        ComposerKt.sourceInformationMarkerEnd(composer6);
                        final CustomTarget target = customSegment.getTarget();
                        boolean z11 = target instanceof CustomTarget.SpeedHold;
                        if (z11) {
                            composer6.startReplaceGroup(-1435991657);
                            CustomTarget.SpeedHold speedHold = (CustomTarget.SpeedHold) target;
                            String valueOf = String.valueOf(speedHold.getMs() / 1000);
                            Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            composer6.startReplaceGroup(-1570337989);
                            boolean changedInstance9 = (i12 == 131072) | composer6.changedInstance(segments) | composer6.changed(i14) | composer6.changedInstance(target);
                            Object rememberedValue9 = composer6.rememberedValue();
                            if (changedInstance9 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = new Function1() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$16$lambda$15;
                                        CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$16$lambda$15 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$16$lambda$15(Function1.this, segments, i14, target, (String) obj2);
                                        return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$16$lambda$15;
                                    }
                                };
                                composer6.updateRememberedValue(rememberedValue9);
                            }
                            composer6.endReplaceGroup();
                            str = "C101@5126L9:Row.kt#2w3rfo";
                            str2 = str8;
                            str3 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                            TextFieldKt.TextField(valueOf, (Function1<? super String, Unit>) rememberedValue9, fillMaxWidth$default5, z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7164getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer6, i13, 0, 0, 8388528);
                            String valueOf2 = String.valueOf(speedHold.getKmh());
                            Modifier fillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            composer6.startReplaceGroup(-1570313976);
                            boolean changedInstance10 = composer6.changedInstance(segments) | (i12 == 131072) | composer6.changed(i14) | composer6.changedInstance(target);
                            Object rememberedValue10 = composer6.rememberedValue();
                            if (changedInstance10 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue10 = new Function1() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$20$lambda$19;
                                        CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$20$lambda$19 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$20$lambda$19(Function1.this, segments, i14, target, (String) obj2);
                                        return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$20$lambda$19;
                                    }
                                };
                                composer6.updateRememberedValue(rememberedValue10);
                            }
                            composer6.endReplaceGroup();
                            composer4 = composer6;
                            TextFieldKt.TextField(valueOf2, (Function1<? super String, Unit>) rememberedValue10, fillMaxWidth$default6, z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7165getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer4, i13, 0, 0, 8388528);
                            composer4.endReplaceGroup();
                            i6 = i14;
                            i7 = i12;
                        } else {
                            str = "C101@5126L9:Row.kt#2w3rfo";
                            str2 = str8;
                            str3 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                            composer6.startReplaceGroup(-1434420918);
                            boolean z12 = target instanceof CustomTarget.TimeMs;
                            if (z12) {
                                str4 = String.valueOf(((CustomTarget.TimeMs) target).getMs() / 1000);
                            } else if (target instanceof CustomTarget.DistanceM) {
                                str4 = String.valueOf(((CustomTarget.DistanceM) target).getMeters());
                            } else {
                                if (!z11) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str4 = "";
                            }
                            if (z12) {
                                str5 = "Seconds";
                            } else if (target instanceof CustomTarget.DistanceM) {
                                str5 = "Meters";
                            } else {
                                if (!z11) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str5 = "";
                            }
                            Modifier fillMaxWidth$default7 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            composer6.startReplaceGroup(-1570269770);
                            boolean changedInstance11 = composer6.changedInstance(target) | (i12 == 131072) | composer6.changedInstance(segments) | composer6.changed(i14);
                            Object rememberedValue11 = composer6.rememberedValue();
                            if (changedInstance11 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue11 = new Function1() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$24$lambda$23;
                                        CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$24$lambda$23 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$24$lambda$23(CustomTarget.this, onSegmentsChange, segments, i14, (String) obj2);
                                        return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$24$lambda$23;
                                    }
                                };
                                composer6.updateRememberedValue(rememberedValue11);
                            }
                            composer6.endReplaceGroup();
                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(200221486, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$CustomPlanEditorPanel$1$1$1$7
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                    invoke(composer7, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer7, int i17) {
                                    if ((i17 & 3) == 2 && composer7.getSkipping()) {
                                        composer7.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(200221486, i17, -1, "com.example.rungps.ui.main.CustomPlanEditorPanel.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomPlanEditorPanel.kt:152)");
                                    }
                                    TextKt.m2376Text4IGK_g(str5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer7, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer6, 54);
                            i6 = i14;
                            i7 = i12;
                            composer4 = composer6;
                            TextFieldKt.TextField(str4, (Function1<? super String, Unit>) rememberedValue11, fillMaxWidth$default7, z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) rememberComposableLambda, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer4, i13, 0, 0, 8388528);
                            composer4.endReplaceGroup();
                        }
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_44 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                        Composer composer7 = composer4;
                        ComposerKt.sourceInformationMarkerStart(composer7, 693286680, str3);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_44, Alignment.INSTANCE.getTop(), composer7, 6);
                        String str10 = str2;
                        ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, str10);
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer7, companion);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer7, -692256719, str9);
                        if (!(composer7.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            composer7.createNode(constructor4);
                        } else {
                            composer7.useNode();
                        }
                        Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer7);
                        Updater.m3343setimpl(m3336constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash4);
                        }
                        Updater.m3343setimpl(m3336constructorimpl5, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer7, -407840262, str);
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        if (z) {
                            z6 = true;
                            if (segments.size() > 1) {
                                z7 = true;
                                composer7.startReplaceGroup(-2125402426);
                                int i17 = i7;
                                final int i18 = i6;
                                changedInstance3 = (i17 != 131072 ? z6 : false) | composer7.changedInstance(segments) | composer7.changed(i18);
                                rememberedValue3 = composer7.rememberedValue();
                                if (!changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    function13 = onSegmentsChange;
                                    rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$27$lambda$26;
                                            CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$27$lambda$26 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$27$lambda$26(Function1.this, segments, i18);
                                            return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$27$lambda$26;
                                        }
                                    };
                                    composer7.updateRememberedValue(rememberedValue3);
                                } else {
                                    function13 = onSegmentsChange;
                                }
                                composer7.endReplaceGroup();
                                final Function1<? super List<CustomSegment>, Unit> function15 = function13;
                                ButtonKt.OutlinedButton((Function0) rememberedValue3, null, z7, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7166getLambda4$app_sideload(), composer7, 805306368, 506);
                                composer7.startReplaceGroup(-2125395190);
                                changedInstance4 = composer7.changedInstance(segments) | (i17 != 131072) | composer7.changed(i18) | composer7.changedInstance(customSegment);
                                rememberedValue4 = composer7.rememberedValue();
                                if (!changedInstance4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29;
                                            CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29(Function1.this, segments, i18, customSegment);
                                            return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29;
                                        }
                                    };
                                    composer7.updateRememberedValue(rememberedValue4);
                                }
                                composer7.endReplaceGroup();
                                ButtonKt.OutlinedButton((Function0) rememberedValue4, null, z, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7167getLambda5$app_sideload(), composer7, i15 | 805306368, 506);
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                composer7.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                composer7.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                ComposerKt.sourceInformationMarkerEnd(composer7);
                                composer5 = composer7;
                                list2 = segments;
                                i10 = i11;
                                str6 = str9;
                                str7 = str10;
                            }
                        } else {
                            z6 = true;
                        }
                        z7 = false;
                        composer7.startReplaceGroup(-2125402426);
                        int i172 = i7;
                        final int i182 = i6;
                        changedInstance3 = (i172 != 131072 ? z6 : false) | composer7.changedInstance(segments) | composer7.changed(i182);
                        rememberedValue3 = composer7.rememberedValue();
                        if (changedInstance3) {
                        }
                        function13 = onSegmentsChange;
                        rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$27$lambda$26;
                                CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$27$lambda$26 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$27$lambda$26(Function1.this, segments, i182);
                                return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$27$lambda$26;
                            }
                        };
                        composer7.updateRememberedValue(rememberedValue3);
                        composer7.endReplaceGroup();
                        final Function1 function152 = function13;
                        ButtonKt.OutlinedButton((Function0) rememberedValue3, null, z7, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7166getLambda4$app_sideload(), composer7, 805306368, 506);
                        composer7.startReplaceGroup(-2125395190);
                        changedInstance4 = composer7.changedInstance(segments) | (i172 != 131072) | composer7.changed(i182) | composer7.changedInstance(customSegment);
                        rememberedValue4 = composer7.rememberedValue();
                        if (!changedInstance4) {
                        }
                        rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29;
                                CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29(Function1.this, segments, i182, customSegment);
                                return CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29;
                            }
                        };
                        composer7.updateRememberedValue(rememberedValue4);
                        composer7.endReplaceGroup();
                        ButtonKt.OutlinedButton((Function0) rememberedValue4, null, z, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7167getLambda5$app_sideload(), composer7, i15 | 805306368, 506);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        composer7.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        composer7.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        composer5 = composer7;
                        list2 = segments;
                        i10 = i11;
                        str6 = str9;
                        str7 = str10;
                    }
                    list = list2;
                    composer2 = composer5;
                    composer2.endReplaceGroup();
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_45 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m564spacedBy0680j_45, Alignment.INSTANCE.getTop(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str7);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer2, companion2);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str6);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                    Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash5);
                    }
                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(-392807590);
                    int i19 = i5 & 458752;
                    changedInstance = composer2.changedInstance(list) | (i19 == 131072);
                    rememberedValue = composer2.rememberedValue();
                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34;
                                CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34(Function1.this, list);
                                return CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    composer2.endReplaceGroup();
                    int i20 = ((i5 << 6) & 896) | 805306368;
                    composer3 = composer2;
                    ButtonKt.OutlinedButton((Function0) rememberedValue, null, z, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7168getLambda6$app_sideload(), composer2, i20, 506);
                    composer3.startReplaceGroup(-392800737);
                    changedInstance2 = composer3.changedInstance(list) | (i19 == 131072);
                    rememberedValue2 = composer3.rememberedValue();
                    if (!changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36;
                                CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36(Function1.this, list);
                                return CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36;
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    ButtonKt.OutlinedButton((Function0) rememberedValue2, null, z, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7169getLambda7$app_sideload(), composer3, i20, 506);
                    composer3.startReplaceGroup(-392795788);
                    if (z4) {
                        composer3.startReplaceGroup(-392792278);
                        boolean changedInstance12 = composer3.changedInstance(list) | (i19 == 131072);
                        Object rememberedValue12 = composer3.rememberedValue();
                        if (changedInstance12 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit CustomPlanEditorPanel$lambda$41$lambda$40$lambda$39$lambda$38;
                                    CustomPlanEditorPanel$lambda$41$lambda$40$lambda$39$lambda$38 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$40$lambda$39$lambda$38(Function1.this, list);
                                    return CustomPlanEditorPanel$lambda$41$lambda$40$lambda$39$lambda$38;
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue12);
                        }
                        composer3.endReplaceGroup();
                        ButtonKt.OutlinedButton((Function0) rememberedValue12, null, z, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7170getLambda8$app_sideload(), composer3, i20, 506);
                    }
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z5 = z3;
                    composer3 = startRestartGroup;
                }
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit CustomPlanEditorPanel$lambda$42;
                            CustomPlanEditorPanel$lambda$42 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$42(z, z5, name, segments, onNameChange, onSegmentsChange, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            return CustomPlanEditorPanel$lambda$42;
                        }
                    });
                    return;
                }
                return;
            }
            i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i3 |= i4;
            i5 = i3;
            if ((74899 & i5) == 74898) {
            }
            if (i8 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier fillMaxWidth$default8 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            float f2 = 8;
            Arrangement.HorizontalOrVertical m564spacedBy0680j_46 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f2));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_46, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default8);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl.getInserting()) {
            }
            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            TextKt.m2376Text4IGK_g(z4 ? "Custom ride intervals (time, distance, speed)" : "Custom intervals (mix time + distance)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, 0, 0, 65534);
            int i92 = (i5 << 9) & 7168;
            String str62 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            String str72 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            TextFieldKt.TextField(name, onNameChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7163getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248 | ((i5 >> 9) & SdkConfig.SDK_VERSION) | i92, 0, 0, 8388528);
            Composer composer52 = startRestartGroup;
            composer52.startReplaceGroup(849447314);
            final List list22 = segments;
            final int i102 = 0;
            while (r31.hasNext()) {
            }
            list = list22;
            composer2 = composer52;
            composer2.endReplaceGroup();
            Arrangement.HorizontalOrVertical m564spacedBy0680j_452 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f2));
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion22 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(m564spacedBy0680j_452, Alignment.INSTANCE.getTop(), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str72);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap52 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(composer2, companion22);
            Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str62);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl2.getInserting()) {
            }
            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash52);
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-392807590);
            int i192 = i5 & 458752;
            changedInstance = composer2.changedInstance(list) | (i192 == 131072);
            rememberedValue = composer2.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34;
                    CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34(Function1.this, list);
                    return CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34;
                }
            };
            composer2.updateRememberedValue(rememberedValue);
            composer2.endReplaceGroup();
            int i202 = ((i5 << 6) & 896) | 805306368;
            composer3 = composer2;
            ButtonKt.OutlinedButton((Function0) rememberedValue, null, z, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7168getLambda6$app_sideload(), composer2, i202, 506);
            composer3.startReplaceGroup(-392800737);
            changedInstance2 = composer3.changedInstance(list) | (i192 == 131072);
            rememberedValue2 = composer3.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36;
                    CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36(Function1.this, list);
                    return CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36;
                }
            };
            composer3.updateRememberedValue(rememberedValue2);
            composer3.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue2, null, z, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7169getLambda7$app_sideload(), composer3, i202, 506);
            composer3.startReplaceGroup(-392795788);
            if (z4) {
            }
            composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        i3 |= i4;
        i5 = i3;
        if ((74899 & i5) == 74898) {
        }
        if (i8 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxWidth$default82 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        float f22 = 8;
        Arrangement.HorizontalOrVertical m564spacedBy0680j_462 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f22));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_462, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default82);
        Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
        TextKt.m2376Text4IGK_g(z4 ? "Custom ride intervals (time, distance, speed)" : "Custom intervals (mix time + distance)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, 0, 0, 65534);
        int i922 = (i5 << 9) & 7168;
        String str622 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
        String str722 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
        TextFieldKt.TextField(name, onNameChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7163getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248 | ((i5 >> 9) & SdkConfig.SDK_VERSION) | i922, 0, 0, 8388528);
        Composer composer522 = startRestartGroup;
        composer522.startReplaceGroup(849447314);
        final List list222 = segments;
        final int i1022 = 0;
        while (r31.hasNext()) {
        }
        list = list222;
        composer2 = composer522;
        composer2.endReplaceGroup();
        Arrangement.HorizontalOrVertical m564spacedBy0680j_4522 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f22));
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        Modifier.Companion companion222 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(m564spacedBy0680j_4522, Alignment.INSTANCE.getTop(), composer2, 6);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str722);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap522 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(composer2, companion222);
        Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str622);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
        Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl2.getInserting()) {
        }
        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash522);
        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
        composer2.startReplaceGroup(-392807590);
        int i1922 = i5 & 458752;
        changedInstance = composer2.changedInstance(list) | (i1922 == 131072);
        rememberedValue = composer2.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34;
                CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34(Function1.this, list);
                return CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34;
            }
        };
        composer2.updateRememberedValue(rememberedValue);
        composer2.endReplaceGroup();
        int i2022 = ((i5 << 6) & 896) | 805306368;
        composer3 = composer2;
        ButtonKt.OutlinedButton((Function0) rememberedValue, null, z, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7168getLambda6$app_sideload(), composer2, i2022, 506);
        composer3.startReplaceGroup(-392800737);
        changedInstance2 = composer3.changedInstance(list) | (i1922 == 131072);
        rememberedValue2 = composer3.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36;
                CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36 = CustomPlanEditorPanelKt.CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36(Function1.this, list);
                return CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36;
            }
        };
        composer3.updateRememberedValue(rememberedValue2);
        composer3.endReplaceGroup();
        ButtonKt.OutlinedButton((Function0) rememberedValue2, null, z, null, null, null, null, null, null, ComposableSingletons$CustomPlanEditorPanelKt.INSTANCE.m7169getLambda7$app_sideload(), composer3, i2022, 506);
        composer3.startReplaceGroup(-392795788);
        if (z4) {
        }
        composer3.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z4;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$2$lambda$1(Function1 function1, List list, int i, String newLabel) {
        Intrinsics.checkNotNullParameter(newLabel, "newLabel");
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.set(i, CustomSegment.copy$default((CustomSegment) mutableList.get(i), newLabel, null, 2, null));
        function1.invoke(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$5$lambda$4(Function1 function1, List list, int i) {
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.set(i, CustomSegment.copy$default((CustomSegment) mutableList.get(i), null, new CustomTarget.TimeMs(60000L), 1, null));
        function1.invoke(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$8$lambda$7(Function1 function1, List list, int i) {
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.set(i, CustomSegment.copy$default((CustomSegment) mutableList.get(i), null, new CustomTarget.DistanceM(400.0d), 1, null));
        function1.invoke(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$12$lambda$11$lambda$10(Function1 function1, List list, int i) {
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.set(i, CustomSegment.copy$default((CustomSegment) mutableList.get(i), null, new CustomTarget.SpeedHold(300000L, 25.0d), 1, null));
        function1.invoke(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$27$lambda$26(Function1 function1, List list, int i) {
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.remove(i);
        function1.invoke(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$31$lambda$30$lambda$29(Function1 function1, List list, int i, CustomSegment customSegment) {
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.add(i + 1, customSegment);
        function1.invoke(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$40$lambda$35$lambda$34(Function1 function1, List list) {
        function1.invoke(CollectionsKt.plus((Collection<? extends CustomSegment>) list, new CustomSegment("New time", new CustomTarget.TimeMs(60000L))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$40$lambda$37$lambda$36(Function1 function1, List list) {
        function1.invoke(CollectionsKt.plus((Collection<? extends CustomSegment>) list, new CustomSegment("New distance", new CustomTarget.DistanceM(400.0d))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$40$lambda$39$lambda$38(Function1 function1, List list) {
        function1.invoke(CollectionsKt.plus((Collection<? extends CustomSegment>) list, new CustomSegment("Speed block", new CustomTarget.SpeedHold(300000L, 25.0d))));
        return Unit.INSTANCE;
    }

    private static final void CustomPlanChip(final boolean z, final String str, final boolean z2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-781803035);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-781803035, i2, -1, "com.example.rungps.ui.main.CustomPlanChip (CustomPlanEditorPanel.kt:194)");
            }
            ChipKt.FilterChip(z, function0, ComposableLambdaKt.rememberComposableLambda(-1418793448, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$CustomPlanChip$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1418793448, i3, -1, "com.example.rungps.ui.main.CustomPlanChip.<anonymous> (CustomPlanEditorPanel.kt:199)");
                    }
                    TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, z2, null, null, null, null, null, null, null, startRestartGroup, (i2 & 14) | 384 | ((i2 >> 6) & SdkConfig.SDK_VERSION) | ((i2 << 6) & 57344), 0, 4072);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.CustomPlanEditorPanelKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CustomPlanChip$lambda$43;
                    CustomPlanChip$lambda$43 = CustomPlanEditorPanelKt.CustomPlanChip$lambda$43(z, str, z2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CustomPlanChip$lambda$43;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$16$lambda$15(Function1 function1, List list, int i, CustomTarget customTarget, String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        String str = raw;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        Long longOrNull = StringsKt.toLongOrNull(sb2);
        long longValue = longOrNull != null ? longOrNull.longValue() : 0L;
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.set(i, CustomSegment.copy$default((CustomSegment) mutableList.get(i), null, CustomTarget.SpeedHold.copy$default((CustomTarget.SpeedHold) customTarget, 1000 * longValue, 0.0d, 2, null), 1, null));
        function1.invoke(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$20$lambda$19(Function1 function1, List list, int i, CustomTarget customTarget, String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        String str = raw;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt) || charAt == '.') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        Double doubleOrNull = StringsKt.toDoubleOrNull(sb2);
        double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.set(i, CustomSegment.copy$default((CustomSegment) mutableList.get(i), null, CustomTarget.SpeedHold.copy$default((CustomTarget.SpeedHold) customTarget, 0L, doubleValue, 1, null), 1, null));
        function1.invoke(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomPlanEditorPanel$lambda$41$lambda$33$lambda$32$lambda$24$lambda$23(CustomTarget customTarget, Function1 function1, List list, int i, String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        String str = raw;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt) || charAt == '.') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        if (customTarget instanceof CustomTarget.TimeMs) {
            Long longOrNull = StringsKt.toLongOrNull(sb2);
            customTarget = new CustomTarget.TimeMs((longOrNull != null ? longOrNull.longValue() : 0L) * 1000);
        } else if (customTarget instanceof CustomTarget.DistanceM) {
            Double doubleOrNull = StringsKt.toDoubleOrNull(sb2);
            customTarget = new CustomTarget.DistanceM(doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d);
        } else if (!(customTarget instanceof CustomTarget.SpeedHold)) {
            throw new NoWhenBranchMatchedException();
        }
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.set(i, CustomSegment.copy$default((CustomSegment) mutableList.get(i), null, customTarget, 1, null));
        function1.invoke(mutableList);
        return Unit.INSTANCE;
    }
}
