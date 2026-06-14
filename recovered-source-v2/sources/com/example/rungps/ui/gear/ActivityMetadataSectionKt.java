package com.example.rungps.ui.gear;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
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
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.GearEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityMetadataSection.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÍ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"ActivityMetadataSection", "", "title", "", "description", "privateNotes", "gearOptions", "", "Lcom/example/rungps/data/GearEntity;", "selectedGearId", "", "kmByGearId", "", "", "isBike", "", "onTitleChange", "Lkotlin/Function1;", "onDescriptionChange", "onPrivateNotesChange", "onGearSelect", "onSave", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "saving", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/util/Map;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;III)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityMetadataSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActivityMetadataSection$lambda$1(String str, String str2, String str3, List list, Long l, Map map, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Modifier modifier, boolean z2, int i, int i2, int i3, Composer composer, int i4) {
        ActivityMetadataSection(str, str2, str3, list, l, map, z, function1, function12, function13, function14, function0, modifier, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityMetadataSection(final String title, final String description, final String privateNotes, final List<GearEntity> gearOptions, final Long l, final Map<Long, Double> kmByGearId, final boolean z, final Function1<? super String, Unit> onTitleChange, final Function1<? super String, Unit> onDescriptionChange, final Function1<? super String, Unit> onPrivateNotesChange, final Function1<? super Long, Unit> onGearSelect, final Function0<Unit> onSave, Modifier modifier, boolean z2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        Composer composer2;
        boolean z3;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(privateNotes, "privateNotes");
        Intrinsics.checkNotNullParameter(gearOptions, "gearOptions");
        Intrinsics.checkNotNullParameter(kmByGearId, "kmByGearId");
        Intrinsics.checkNotNullParameter(onTitleChange, "onTitleChange");
        Intrinsics.checkNotNullParameter(onDescriptionChange, "onDescriptionChange");
        Intrinsics.checkNotNullParameter(onPrivateNotesChange, "onPrivateNotesChange");
        Intrinsics.checkNotNullParameter(onGearSelect, "onGearSelect");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        Composer startRestartGroup = composer.startRestartGroup(-1054748715);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (startRestartGroup.changed(title) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(description) ? 32 : 16;
        }
        int i13 = i4;
        if ((i3 & 4) != 0) {
            i13 |= 384;
        } else if ((i & 384) == 0) {
            i13 |= startRestartGroup.changed(privateNotes) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i13 |= 3072;
        } else if ((i & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(gearOptions) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i13 |= 24576;
        } else if ((i & 24576) == 0) {
            i13 |= startRestartGroup.changed(l) ? 16384 : 8192;
            if ((i3 & 32) == 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i13 |= startRestartGroup.changedInstance(kmByGearId) ? 131072 : 65536;
            }
            if ((i3 & 64) != 0) {
                i12 = (i & 1572864) == 0 ? startRestartGroup.changed(z) ? 1048576 : 524288 : 1572864;
                if ((i3 & 128) == 0) {
                    i11 = (12582912 & i) == 0 ? startRestartGroup.changedInstance(onTitleChange) ? 8388608 : 4194304 : 12582912;
                    if ((i3 & 256) != 0) {
                        i10 = (100663296 & i) == 0 ? startRestartGroup.changedInstance(onDescriptionChange) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                        if ((i3 & 512) == 0) {
                            i9 = (805306368 & i) == 0 ? startRestartGroup.changedInstance(onPrivateNotesChange) ? 536870912 : 268435456 : 805306368;
                            i5 = i13;
                            if ((i3 & 1024) == 0) {
                                i6 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i6 = i2 | (startRestartGroup.changedInstance(onGearSelect) ? 4 : 2);
                            } else {
                                i6 = i2;
                            }
                            if ((i3 & 2048) == 0) {
                                i6 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i6 |= startRestartGroup.changedInstance(onSave) ? 32 : 16;
                            }
                            i7 = i3 & 4096;
                            if (i7 == 0) {
                                i6 |= 384;
                            } else if ((i2 & 384) == 0) {
                                i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
                                i8 = i3 & 8192;
                                if (i8 != 0) {
                                    i6 |= 3072;
                                } else if ((i2 & 3072) == 0) {
                                    i6 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                                    if ((i5 & 306783379) == 306783378 || (i6 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                        Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier;
                                        boolean z4 = i8 == 0 ? false : z2;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1054748715, i5, i6, "com.example.rungps.ui.gear.ActivityMetadataSection (ActivityMetadataSection.kt:36)");
                                        }
                                        int i14 = i6;
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                                        Modifier modifier3 = companion;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        final boolean z5 = z4;
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
                                        TextKt.m2376Text4IGK_g("Activity details", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), startRestartGroup, 196614, 0, 65502);
                                        OutlinedTextFieldKt.OutlinedTextField(title, onTitleChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7023getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248 | ((i5 >> 18) & SdkConfig.SDK_VERSION), 12582912, 0, 8257464);
                                        OutlinedTextFieldKt.OutlinedTextField(description, onDescriptionChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7024getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 3) & 14) | 1573248 | ((i5 >> 21) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                                        int i15 = i5 >> 6;
                                        OutlinedTextFieldKt.OutlinedTextField(privateNotes, onPrivateNotesChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7025getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i15 & 14) | 1573248 | ((i5 >> 24) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                                        GearPickerKt.GearPicker(!z ? "Bike" : "Shoes", gearOptions, l, onGearSelect, null, kmByGearId, startRestartGroup, (i15 & PointerIconCompat.TYPE_TEXT) | ((i14 << 9) & 7168) | (i5 & 458752), 16);
                                        composer2 = startRestartGroup;
                                        ButtonKt.Button(onSave, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !z5, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-255929797, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ActivityMetadataSectionKt$ActivityMetadataSection$1$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                                invoke(rowScope, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(RowScope Button, Composer composer3, int i16) {
                                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                                if ((i16 & 17) == 16 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-255929797, i16, -1, "com.example.rungps.ui.gear.ActivityMetadataSection.<anonymous>.<anonymous> (ActivityMetadataSection.kt:71)");
                                                }
                                                TextKt.m2376Text4IGK_g(z5 ? "Saving…" : "Save details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer2, 54), composer2, ((i14 >> 3) & 14) | 805306416, 504);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        z3 = z5;
                                        modifier2 = modifier3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        z3 = z2;
                                        composer2 = startRestartGroup;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        final boolean z6 = z3;
                                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gear.ActivityMetadataSectionKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit ActivityMetadataSection$lambda$1;
                                                ActivityMetadataSection$lambda$1 = ActivityMetadataSectionKt.ActivityMetadataSection$lambda$1(title, description, privateNotes, gearOptions, l, kmByGearId, z, onTitleChange, onDescriptionChange, onPrivateNotesChange, onGearSelect, onSave, modifier2, z6, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                return ActivityMetadataSection$lambda$1;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                if ((i5 & 306783379) == 306783378) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i142 = i6;
                                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                                Modifier modifier32 = companion;
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                final boolean z52 = z4;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                }
                                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3336constructorimpl.getInserting()) {
                                }
                                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                                Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                TextKt.m2376Text4IGK_g("Activity details", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), startRestartGroup, 196614, 0, 65502);
                                OutlinedTextFieldKt.OutlinedTextField(title, onTitleChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7023getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248 | ((i5 >> 18) & SdkConfig.SDK_VERSION), 12582912, 0, 8257464);
                                OutlinedTextFieldKt.OutlinedTextField(description, onDescriptionChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7024getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 3) & 14) | 1573248 | ((i5 >> 21) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                                int i152 = i5 >> 6;
                                OutlinedTextFieldKt.OutlinedTextField(privateNotes, onPrivateNotesChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7025getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i152 & 14) | 1573248 | ((i5 >> 24) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                                GearPickerKt.GearPicker(!z ? "Bike" : "Shoes", gearOptions, l, onGearSelect, null, kmByGearId, startRestartGroup, (i152 & PointerIconCompat.TYPE_TEXT) | ((i142 << 9) & 7168) | (i5 & 458752), 16);
                                composer2 = startRestartGroup;
                                ButtonKt.Button(onSave, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !z52, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-255929797, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ActivityMetadataSectionKt$ActivityMetadataSection$1$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                        invoke(rowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope Button, Composer composer3, int i16) {
                                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                        if ((i16 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-255929797, i16, -1, "com.example.rungps.ui.gear.ActivityMetadataSection.<anonymous>.<anonymous> (ActivityMetadataSection.kt:71)");
                                        }
                                        TextKt.m2376Text4IGK_g(z52 ? "Saving…" : "Save details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, ((i142 >> 3) & 14) | 805306416, 504);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z3 = z52;
                                modifier2 = modifier32;
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i8 = i3 & 8192;
                            if (i8 != 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i1422 = i6;
                            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_422 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_422, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
                            Modifier modifier322 = companion;
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            final boolean z522 = z4;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3336constructorimpl.getInserting()) {
                            }
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                            Updater.m3343setimpl(m3336constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                            TextKt.m2376Text4IGK_g("Activity details", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), startRestartGroup, 196614, 0, 65502);
                            OutlinedTextFieldKt.OutlinedTextField(title, onTitleChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7023getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248 | ((i5 >> 18) & SdkConfig.SDK_VERSION), 12582912, 0, 8257464);
                            OutlinedTextFieldKt.OutlinedTextField(description, onDescriptionChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7024getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 3) & 14) | 1573248 | ((i5 >> 21) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                            int i1522 = i5 >> 6;
                            OutlinedTextFieldKt.OutlinedTextField(privateNotes, onPrivateNotesChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7025getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i1522 & 14) | 1573248 | ((i5 >> 24) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                            GearPickerKt.GearPicker(!z ? "Bike" : "Shoes", gearOptions, l, onGearSelect, null, kmByGearId, startRestartGroup, (i1522 & PointerIconCompat.TYPE_TEXT) | ((i1422 << 9) & 7168) | (i5 & 458752), 16);
                            composer2 = startRestartGroup;
                            ButtonKt.Button(onSave, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !z522, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-255929797, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ActivityMetadataSectionKt$ActivityMetadataSection$1$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer3, int i16) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    if ((i16 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-255929797, i16, -1, "com.example.rungps.ui.gear.ActivityMetadataSection.<anonymous>.<anonymous> (ActivityMetadataSection.kt:71)");
                                    }
                                    TextKt.m2376Text4IGK_g(z522 ? "Saving…" : "Save details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, ((i1422 >> 3) & 14) | 805306416, 504);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z3 = z522;
                            modifier2 = modifier322;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i13 |= i9;
                        i5 = i13;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i3 & 2048) == 0) {
                        }
                        i7 = i3 & 4096;
                        if (i7 == 0) {
                        }
                        i8 = i3 & 8192;
                        if (i8 != 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i14222 = i6;
                        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
                        Modifier modifier3222 = companion;
                        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                        final boolean z5222 = z4;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl.getInserting()) {
                        }
                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g("Activity details", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), startRestartGroup, 196614, 0, 65502);
                        OutlinedTextFieldKt.OutlinedTextField(title, onTitleChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7023getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248 | ((i5 >> 18) & SdkConfig.SDK_VERSION), 12582912, 0, 8257464);
                        OutlinedTextFieldKt.OutlinedTextField(description, onDescriptionChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7024getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 3) & 14) | 1573248 | ((i5 >> 21) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                        int i15222 = i5 >> 6;
                        OutlinedTextFieldKt.OutlinedTextField(privateNotes, onPrivateNotesChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7025getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i15222 & 14) | 1573248 | ((i5 >> 24) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                        GearPickerKt.GearPicker(!z ? "Bike" : "Shoes", gearOptions, l, onGearSelect, null, kmByGearId, startRestartGroup, (i15222 & PointerIconCompat.TYPE_TEXT) | ((i14222 << 9) & 7168) | (i5 & 458752), 16);
                        composer2 = startRestartGroup;
                        ButtonKt.Button(onSave, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !z5222, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-255929797, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ActivityMetadataSectionKt$ActivityMetadataSection$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer3, int i16) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i16 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-255929797, i16, -1, "com.example.rungps.ui.gear.ActivityMetadataSection.<anonymous>.<anonymous> (ActivityMetadataSection.kt:71)");
                                }
                                TextKt.m2376Text4IGK_g(z5222 ? "Saving…" : "Save details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, ((i14222 >> 3) & 14) | 805306416, 504);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z5222;
                        modifier2 = modifier3222;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i13 |= i10;
                    if ((i3 & 512) == 0) {
                    }
                    i13 |= i9;
                    i5 = i13;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    i7 = i3 & 4096;
                    if (i7 == 0) {
                    }
                    i8 = i3 & 8192;
                    if (i8 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i142222 = i6;
                    Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_42222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222);
                    Modifier modifier32222 = companion;
                    Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                    final boolean z52222 = z4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl.getInserting()) {
                    }
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                    TextKt.m2376Text4IGK_g("Activity details", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), startRestartGroup, 196614, 0, 65502);
                    OutlinedTextFieldKt.OutlinedTextField(title, onTitleChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7023getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248 | ((i5 >> 18) & SdkConfig.SDK_VERSION), 12582912, 0, 8257464);
                    OutlinedTextFieldKt.OutlinedTextField(description, onDescriptionChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7024getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 3) & 14) | 1573248 | ((i5 >> 21) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                    int i152222 = i5 >> 6;
                    OutlinedTextFieldKt.OutlinedTextField(privateNotes, onPrivateNotesChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7025getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i152222 & 14) | 1573248 | ((i5 >> 24) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                    GearPickerKt.GearPicker(!z ? "Bike" : "Shoes", gearOptions, l, onGearSelect, null, kmByGearId, startRestartGroup, (i152222 & PointerIconCompat.TYPE_TEXT) | ((i142222 << 9) & 7168) | (i5 & 458752), 16);
                    composer2 = startRestartGroup;
                    ButtonKt.Button(onSave, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !z52222, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-255929797, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ActivityMetadataSectionKt$ActivityMetadataSection$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope Button, Composer composer3, int i16) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            if ((i16 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-255929797, i16, -1, "com.example.rungps.ui.gear.ActivityMetadataSection.<anonymous>.<anonymous> (ActivityMetadataSection.kt:71)");
                            }
                            TextKt.m2376Text4IGK_g(z52222 ? "Saving…" : "Save details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, ((i142222 >> 3) & 14) | 805306416, 504);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z52222;
                    modifier2 = modifier32222;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i13 |= i11;
                if ((i3 & 256) != 0) {
                }
                i13 |= i10;
                if ((i3 & 512) == 0) {
                }
                i13 |= i9;
                i5 = i13;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                i7 = i3 & 4096;
                if (i7 == 0) {
                }
                i8 = i3 & 8192;
                if (i8 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1422222 = i6;
                Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_422222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_422222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22222);
                Modifier modifier322222 = companion;
                Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                final boolean z522222 = z4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting()) {
                }
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                TextKt.m2376Text4IGK_g("Activity details", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), startRestartGroup, 196614, 0, 65502);
                OutlinedTextFieldKt.OutlinedTextField(title, onTitleChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7023getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248 | ((i5 >> 18) & SdkConfig.SDK_VERSION), 12582912, 0, 8257464);
                OutlinedTextFieldKt.OutlinedTextField(description, onDescriptionChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7024getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 3) & 14) | 1573248 | ((i5 >> 21) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                int i1522222 = i5 >> 6;
                OutlinedTextFieldKt.OutlinedTextField(privateNotes, onPrivateNotesChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7025getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i1522222 & 14) | 1573248 | ((i5 >> 24) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
                GearPickerKt.GearPicker(!z ? "Bike" : "Shoes", gearOptions, l, onGearSelect, null, kmByGearId, startRestartGroup, (i1522222 & PointerIconCompat.TYPE_TEXT) | ((i1422222 << 9) & 7168) | (i5 & 458752), 16);
                composer2 = startRestartGroup;
                ButtonKt.Button(onSave, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !z522222, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-255929797, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ActivityMetadataSectionKt$ActivityMetadataSection$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer3, int i16) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i16 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-255929797, i16, -1, "com.example.rungps.ui.gear.ActivityMetadataSection.<anonymous>.<anonymous> (ActivityMetadataSection.kt:71)");
                        }
                        TextKt.m2376Text4IGK_g(z522222 ? "Saving…" : "Save details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, ((i1422222 >> 3) & 14) | 805306416, 504);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z522222;
                modifier2 = modifier322222;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i13 |= i12;
            if ((i3 & 128) == 0) {
            }
            i13 |= i11;
            if ((i3 & 256) != 0) {
            }
            i13 |= i10;
            if ((i3 & 512) == 0) {
            }
            i13 |= i9;
            i5 = i13;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            i7 = i3 & 4096;
            if (i7 == 0) {
            }
            i8 = i3 & 8192;
            if (i8 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i14222222 = i6;
            Modifier fillMaxWidth$default222222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4222222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222222);
            Modifier modifier3222222 = companion;
            Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
            final boolean z5222222 = z4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl.getInserting()) {
            }
            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
            TextKt.m2376Text4IGK_g("Activity details", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), startRestartGroup, 196614, 0, 65502);
            OutlinedTextFieldKt.OutlinedTextField(title, onTitleChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7023getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248 | ((i5 >> 18) & SdkConfig.SDK_VERSION), 12582912, 0, 8257464);
            OutlinedTextFieldKt.OutlinedTextField(description, onDescriptionChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7024getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 3) & 14) | 1573248 | ((i5 >> 21) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
            int i15222222 = i5 >> 6;
            OutlinedTextFieldKt.OutlinedTextField(privateNotes, onPrivateNotesChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7025getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i15222222 & 14) | 1573248 | ((i5 >> 24) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
            GearPickerKt.GearPicker(!z ? "Bike" : "Shoes", gearOptions, l, onGearSelect, null, kmByGearId, startRestartGroup, (i15222222 & PointerIconCompat.TYPE_TEXT) | ((i14222222 << 9) & 7168) | (i5 & 458752), 16);
            composer2 = startRestartGroup;
            ButtonKt.Button(onSave, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !z5222222, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-255929797, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ActivityMetadataSectionKt$ActivityMetadataSection$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer3, int i16) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i16 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-255929797, i16, -1, "com.example.rungps.ui.gear.ActivityMetadataSection.<anonymous>.<anonymous> (ActivityMetadataSection.kt:71)");
                    }
                    TextKt.m2376Text4IGK_g(z5222222 ? "Saving…" : "Save details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, ((i14222222 >> 3) & 14) | 805306416, 504);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z5222222;
            modifier2 = modifier3222222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        i13 |= i12;
        if ((i3 & 128) == 0) {
        }
        i13 |= i11;
        if ((i3 & 256) != 0) {
        }
        i13 |= i10;
        if ((i3 & 512) == 0) {
        }
        i13 |= i9;
        i5 = i13;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        i7 = i3 & 4096;
        if (i7 == 0) {
        }
        i8 = i3 & 8192;
        if (i8 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i142222222 = i6;
        Modifier fillMaxWidth$default2222222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_42222222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2222222);
        Modifier modifier32222222 = companion;
        Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
        final boolean z52222222 = z4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222222);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
        TextKt.m2376Text4IGK_g("Activity details", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), startRestartGroup, 196614, 0, 65502);
        OutlinedTextFieldKt.OutlinedTextField(title, onTitleChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7023getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248 | ((i5 >> 18) & SdkConfig.SDK_VERSION), 12582912, 0, 8257464);
        OutlinedTextFieldKt.OutlinedTextField(description, onDescriptionChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7024getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 3) & 14) | 1573248 | ((i5 >> 21) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
        int i152222222 = i5 >> 6;
        OutlinedTextFieldKt.OutlinedTextField(privateNotes, onPrivateNotesChange, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ActivityMetadataSectionKt.INSTANCE.m7025getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i152222222 & 14) | 1573248 | ((i5 >> 24) & SdkConfig.SDK_VERSION), 805306368, 0, 7864248);
        GearPickerKt.GearPicker(!z ? "Bike" : "Shoes", gearOptions, l, onGearSelect, null, kmByGearId, startRestartGroup, (i152222222 & PointerIconCompat.TYPE_TEXT) | ((i142222222 << 9) & 7168) | (i5 & 458752), 16);
        composer2 = startRestartGroup;
        ButtonKt.Button(onSave, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !z52222222, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-255929797, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ActivityMetadataSectionKt$ActivityMetadataSection$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                invoke(rowScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope Button, Composer composer3, int i16) {
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i16 & 17) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-255929797, i16, -1, "com.example.rungps.ui.gear.ActivityMetadataSection.<anonymous>.<anonymous> (ActivityMetadataSection.kt:71)");
                }
                TextKt.m2376Text4IGK_g(z52222222 ? "Saving…" : "Save details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer2, 54), composer2, ((i142222222 >> 3) & 14) | 805306416, 504);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z52222222;
        modifier2 = modifier32222222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
