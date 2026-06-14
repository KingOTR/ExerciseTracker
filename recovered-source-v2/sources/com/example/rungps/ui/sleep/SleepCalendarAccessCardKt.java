package com.example.rungps.ui.sleep;

import android.content.Context;
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
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
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
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.sleep.GoogleCalendarLink;
import com.example.rungps.sleep.SleepCalendarHelper;
import com.example.rungps.sleep.SleepCalendarManualCommitment;
import com.example.rungps.sleep.SleepCalendarPermissions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepCalendarAccessCard.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"SleepCalendarAccessCard", "", "calendarSyncEnabled", "", "googleLinked", "onRequestPermission", "Lkotlin/Function0;", "onConnectGoogle", "onDisconnectGoogle", "onOpenManualSetup", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepCalendarAccessCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepCalendarAccessCard$lambda$0(boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepCalendarAccessCard(z, z2, function0, function02, function03, function04, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepCalendarAccessCard(final boolean z, final boolean z2, final Function0<Unit> onRequestPermission, final Function0<Unit> onConnectGoogle, final Function0<Unit> onDisconnectGoogle, final Function0<Unit> onOpenManualSetup, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onRequestPermission, "onRequestPermission");
        Intrinsics.checkNotNullParameter(onConnectGoogle, "onConnectGoogle");
        Intrinsics.checkNotNullParameter(onDisconnectGoogle, "onDisconnectGoogle");
        Intrinsics.checkNotNullParameter(onOpenManualSetup, "onOpenManualSetup");
        Composer startRestartGroup = composer.startRestartGroup(-894232180);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(onRequestPermission) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onConnectGoogle) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onDisconnectGoogle) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(onOpenManualSetup) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
            if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-894232180, i3, -1, "com.example.rungps.ui.sleep.SleepCalendarAccessCard (SleepCalendarAccessCard.kt:34)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Context context = (Context) consume;
                final boolean hasPermission = SleepCalendarHelper.INSTANCE.hasPermission(context);
                final boolean isEnabled = SleepCalendarManualCommitment.INSTANCE.isEnabled(context);
                final boolean wasCalendarDenied = SleepCalendarPermissions.INSTANCE.wasCalendarDenied(context);
                final ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                CardKt.Card(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(Color.m3842copywmQWz5c$default(colorScheme.getSecondaryContainer(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-489075970, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepCalendarAccessCardKt$SleepCalendarAccessCard$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:28:0x0424  */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x04b9  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x04c5  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x054e  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x058e  */
                    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x04c9  */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x0462  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(ColumnScope Card, Composer composer3, int i5) {
                        String str;
                        String str2;
                        String str3;
                        Composer composer4;
                        String str4;
                        String str5;
                        String str6;
                        String str7;
                        boolean z3;
                        String str8;
                        int currentCompositeKeyHash;
                        Composer m3336constructorimpl;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i5 & 17) != 16 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-489075970, i5, -1, "com.example.rungps.ui.sleep.SleepCalendarAccessCard.<anonymous> (SleepCalendarAccessCard.kt:44)");
                            }
                            Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14));
                            float f = 8;
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                            boolean z4 = z2;
                            boolean z5 = hasPermission;
                            Context context2 = context;
                            ColorScheme colorScheme2 = colorScheme;
                            Function0<Unit> function0 = onDisconnectGoogle;
                            Function0<Unit> function02 = onConnectGoogle;
                            boolean z6 = wasCalendarDenied;
                            boolean z7 = z;
                            boolean z8 = isEnabled;
                            Function0<Unit> function03 = onRequestPermission;
                            Function0<Unit> function04 = onOpenManualSetup;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m684padding3ABfNKs);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
                            }
                            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            TextKt.m2376Text4IGK_g("Google Calendar", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer3, 196614, 0, 65502);
                            if (!z4 || !z5) {
                                str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                str2 = "C101@5126L9:Row.kt#2w3rfo";
                                if (z4) {
                                    composer3.startReplaceGroup(1489826032);
                                    TextKt.m2376Text4IGK_g(GoogleCalendarLink.INSTANCE.formatLinkedStatus(context2), (Modifier) null, colorScheme2.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                                    ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7489getLambda2$app_sideload(), composer3, 805306368, 510);
                                    composer3.endReplaceGroup();
                                } else if (z5) {
                                    composer3.startReplaceGroup(1490205410);
                                    TextKt.m2376Text4IGK_g("Device calendar read is on (includes synced Google events).", (Modifier) null, colorScheme2.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
                                    ButtonKt.OutlinedButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7490getLambda3$app_sideload(), composer3, 805306368, 510);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(1490672766);
                                    if (z6) {
                                        str3 = "Calendar was blocked. Allow calendar access, or connect your Google account directly.";
                                    } else if (z7) {
                                        str3 = "For wake hints: allow Android calendar read (synced Google events) or connect Google sign-in below.";
                                    } else {
                                        str3 = "Optional: link calendar for tomorrow morning wake hints.";
                                    }
                                    TextKt.m2376Text4IGK_g(str3, (Modifier) null, colorScheme2.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                                    Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                                    composer4 = composer3;
                                    str4 = str;
                                    ComposerKt.sourceInformationMarkerStart(composer4, 693286680, str4);
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer4, 6);
                                    ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, companion);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer3);
                                    Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
                                    }
                                    Updater.m3343setimpl(m3336constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -407840262, str2);
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    str5 = str2;
                                    str6 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                    str7 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                    ButtonKt.Button(function03, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7491getLambda4$app_sideload(), composer3, 805306368, 510);
                                    ButtonKt.OutlinedButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7492getLambda5$app_sideload(), composer3, 805306368, 510);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endReplaceGroup();
                                    composer4.startReplaceGroup(1987781254);
                                    if (z8) {
                                        z3 = z8;
                                        str8 = str4;
                                    } else {
                                        z3 = z8;
                                        str8 = str4;
                                        TextKt.m2376Text4IGK_g("Manual tomorrow event is set — wake planner uses it until calendar works.", (Modifier) null, colorScheme2.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelMedium(), composer3, 6, 0, 65530);
                                    }
                                    composer3.endReplaceGroup();
                                    Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, str8);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getTop(), composer3, 6);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion2);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str6);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (!composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    m3336constructorimpl = Updater.m3336constructorimpl(composer3);
                                    Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                                    }
                                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -407840262, str5);
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    final boolean z9 = z3;
                                    ButtonKt.OutlinedButton(function04, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(611395274, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepCalendarAccessCardKt$SleepCalendarAccessCard$1$1$2$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer5, Integer num) {
                                            invoke(rowScope, composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope OutlinedButton, Composer composer5, int i6) {
                                            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                                            if ((i6 & 17) == 16 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(611395274, i6, -1, "com.example.rungps.ui.sleep.SleepCalendarAccessCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepCalendarAccessCard.kt:113)");
                                            }
                                            TextKt.m2376Text4IGK_g(z9 ? "Edit manual" : "Manual event", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 0, 0, 131070);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 805306368, 510);
                                    composer3.startReplaceGroup(2099615248);
                                    if (!z5) {
                                        ButtonKt.TextButton(function03, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7493getLambda6$app_sideload(), composer3, 805306368, 510);
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
                                        return;
                                    }
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                            } else {
                                composer3.startReplaceGroup(1489192392);
                                str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                                str2 = "C101@5126L9:Row.kt#2w3rfo";
                                TextKt.m2376Text4IGK_g(GoogleCalendarLink.INSTANCE.formatLinkedStatus(context2), (Modifier) null, colorScheme2.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                                TextKt.m2376Text4IGK_g("Device calendar + Google API both active for tomorrow's events.", (Modifier) null, colorScheme2.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
                                ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7488getLambda1$app_sideload(), composer3, 805306368, 510);
                                composer3.endReplaceGroup();
                            }
                            composer4 = composer3;
                            str6 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                            str7 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                            str4 = str;
                            str5 = str2;
                            composer4.startReplaceGroup(1987781254);
                            if (z8) {
                            }
                            composer3.endReplaceGroup();
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_432 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, str8);
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m564spacedBy0680j_432, Alignment.INSTANCE.getTop(), composer3, 6);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer3, companion22);
                            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str6);
                            if (!(composer3.getApplier() instanceof Applier)) {
                            }
                            composer3.startReusableNode();
                            if (!composer3.getInserting()) {
                            }
                            m3336constructorimpl = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3336constructorimpl.getInserting()) {
                            }
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                            Updater.m3343setimpl(m3336constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, str5);
                            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                            final boolean z92 = z3;
                            ButtonKt.OutlinedButton(function04, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(611395274, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepCalendarAccessCardKt$SleepCalendarAccessCard$1$1$2$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer5, Integer num) {
                                    invoke(rowScope, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope OutlinedButton, Composer composer5, int i6) {
                                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                                    if ((i6 & 17) == 16 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(611395274, i6, -1, "com.example.rungps.ui.sleep.SleepCalendarAccessCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepCalendarAccessCard.kt:113)");
                                    }
                                    TextKt.m2376Text4IGK_g(z92 ? "Edit manual" : "Manual event", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 805306368, 510);
                            composer3.startReplaceGroup(2099615248);
                            if (!z5) {
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
                        } else {
                            composer3.skipToGroupEnd();
                        }
                    }
                }, composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepCalendarAccessCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SleepCalendarAccessCard$lambda$0;
                        SleepCalendarAccessCard$lambda$0 = SleepCalendarAccessCardKt.SleepCalendarAccessCard$lambda$0(z, z2, onRequestPermission, onConnectGoogle, onDisconnectGoogle, onOpenManualSetup, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SleepCalendarAccessCard$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context2 = (Context) consume2;
        final boolean hasPermission2 = SleepCalendarHelper.INSTANCE.hasPermission(context2);
        final boolean isEnabled2 = SleepCalendarManualCommitment.INSTANCE.isEnabled(context2);
        final boolean wasCalendarDenied2 = SleepCalendarPermissions.INSTANCE.wasCalendarDenied(context2);
        final ColorScheme colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
        Modifier modifier52 = modifier4;
        composer2 = startRestartGroup;
        CardKt.Card(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(Color.m3842copywmQWz5c$default(colorScheme2.getSecondaryContainer(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-489075970, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepCalendarAccessCardKt$SleepCalendarAccessCard$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                invoke(columnScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0424  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x04b9  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x04c5  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x054e  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x058e  */
            /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x04c9  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0462  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(ColumnScope Card, Composer composer3, int i5) {
                String str;
                String str2;
                String str3;
                Composer composer4;
                String str4;
                String str5;
                String str6;
                String str7;
                boolean z3;
                String str8;
                int currentCompositeKeyHash;
                Composer m3336constructorimpl;
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i5 & 17) != 16 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-489075970, i5, -1, "com.example.rungps.ui.sleep.SleepCalendarAccessCard.<anonymous> (SleepCalendarAccessCard.kt:44)");
                    }
                    Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14));
                    float f = 8;
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                    boolean z4 = z2;
                    boolean z5 = hasPermission2;
                    Context context22 = context2;
                    ColorScheme colorScheme22 = colorScheme2;
                    Function0<Unit> function0 = onDisconnectGoogle;
                    Function0<Unit> function02 = onConnectGoogle;
                    boolean z6 = wasCalendarDenied2;
                    boolean z7 = z;
                    boolean z8 = isEnabled2;
                    Function0<Unit> function03 = onRequestPermission;
                    Function0<Unit> function04 = onOpenManualSetup;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m684padding3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                    Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2376Text4IGK_g("Google Calendar", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer3, 196614, 0, 65502);
                    if (!z4 || !z5) {
                        str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                        str2 = "C101@5126L9:Row.kt#2w3rfo";
                        if (z4) {
                            composer3.startReplaceGroup(1489826032);
                            TextKt.m2376Text4IGK_g(GoogleCalendarLink.INSTANCE.formatLinkedStatus(context22), (Modifier) null, colorScheme22.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7489getLambda2$app_sideload(), composer3, 805306368, 510);
                            composer3.endReplaceGroup();
                        } else if (z5) {
                            composer3.startReplaceGroup(1490205410);
                            TextKt.m2376Text4IGK_g("Device calendar read is on (includes synced Google events).", (Modifier) null, colorScheme22.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
                            ButtonKt.OutlinedButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7490getLambda3$app_sideload(), composer3, 805306368, 510);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1490672766);
                            if (z6) {
                                str3 = "Calendar was blocked. Allow calendar access, or connect your Google account directly.";
                            } else if (z7) {
                                str3 = "For wake hints: allow Android calendar read (synced Google events) or connect Google sign-in below.";
                            } else {
                                str3 = "Optional: link calendar for tomorrow morning wake hints.";
                            }
                            TextKt.m2376Text4IGK_g(str3, (Modifier) null, colorScheme22.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                            composer4 = composer3;
                            str4 = str;
                            ComposerKt.sourceInformationMarkerStart(composer4, 693286680, str4);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer4, 6);
                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, companion);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer4, -407840262, str2);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            str5 = str2;
                            str6 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                            str7 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                            ButtonKt.Button(function03, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7491getLambda4$app_sideload(), composer3, 805306368, 510);
                            ButtonKt.OutlinedButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7492getLambda5$app_sideload(), composer3, 805306368, 510);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceGroup();
                            composer4.startReplaceGroup(1987781254);
                            if (z8) {
                                z3 = z8;
                                str8 = str4;
                            } else {
                                z3 = z8;
                                str8 = str4;
                                TextKt.m2376Text4IGK_g("Manual tomorrow event is set — wake planner uses it until calendar works.", (Modifier) null, colorScheme22.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getLabelMedium(), composer3, 6, 0, 65530);
                            }
                            composer3.endReplaceGroup();
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_432 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, str8);
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m564spacedBy0680j_432, Alignment.INSTANCE.getTop(), composer3, 6);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer3, companion22);
                            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str6);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (!composer3.getInserting()) {
                                composer3.createNode(constructor32);
                            } else {
                                composer3.useNode();
                            }
                            m3336constructorimpl = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                            }
                            Updater.m3343setimpl(m3336constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -407840262, str5);
                            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                            final boolean z92 = z3;
                            ButtonKt.OutlinedButton(function04, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(611395274, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepCalendarAccessCardKt$SleepCalendarAccessCard$1$1$2$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer5, Integer num) {
                                    invoke(rowScope, composer5, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope OutlinedButton, Composer composer5, int i6) {
                                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                                    if ((i6 & 17) == 16 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(611395274, i6, -1, "com.example.rungps.ui.sleep.SleepCalendarAccessCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepCalendarAccessCard.kt:113)");
                                    }
                                    TextKt.m2376Text4IGK_g(z92 ? "Edit manual" : "Manual event", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 805306368, 510);
                            composer3.startReplaceGroup(2099615248);
                            if (!z5) {
                                ButtonKt.TextButton(function03, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7493getLambda6$app_sideload(), composer3, 805306368, 510);
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
                                return;
                            }
                            ComposerKt.traceEventEnd();
                            return;
                        }
                    } else {
                        composer3.startReplaceGroup(1489192392);
                        str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                        str2 = "C101@5126L9:Row.kt#2w3rfo";
                        TextKt.m2376Text4IGK_g(GoogleCalendarLink.INSTANCE.formatLinkedStatus(context22), (Modifier) null, colorScheme22.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                        TextKt.m2376Text4IGK_g("Device calendar + Google API both active for tomorrow's events.", (Modifier) null, colorScheme22.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
                        ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$SleepCalendarAccessCardKt.INSTANCE.m7488getLambda1$app_sideload(), composer3, 805306368, 510);
                        composer3.endReplaceGroup();
                    }
                    composer4 = composer3;
                    str6 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    str7 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    str4 = str;
                    str5 = str2;
                    composer4.startReplaceGroup(1987781254);
                    if (z8) {
                    }
                    composer3.endReplaceGroup();
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4322 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, str8);
                    Modifier.Companion companion222 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m564spacedBy0680j_4322, Alignment.INSTANCE.getTop(), composer3, 6);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str7);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap322 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(composer3, companion222);
                    Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str6);
                    if (!(composer3.getApplier() instanceof Applier)) {
                    }
                    composer3.startReusableNode();
                    if (!composer3.getInserting()) {
                    }
                    m3336constructorimpl = Updater.m3336constructorimpl(composer3);
                    Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl.getInserting()) {
                    }
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -407840262, str5);
                    RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                    final boolean z922 = z3;
                    ButtonKt.OutlinedButton(function04, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(611395274, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepCalendarAccessCardKt$SleepCalendarAccessCard$1$1$2$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer5, Integer num) {
                            invoke(rowScope, composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope OutlinedButton, Composer composer5, int i6) {
                            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                            if ((i6 & 17) == 16 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(611395274, i6, -1, "com.example.rungps.ui.sleep.SleepCalendarAccessCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepCalendarAccessCard.kt:113)");
                            }
                            TextKt.m2376Text4IGK_g(z922 ? "Edit manual" : "Manual event", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 805306368, 510);
                    composer3.startReplaceGroup(2099615248);
                    if (!z5) {
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
                } else {
                    composer3.skipToGroupEnd();
                }
            }
        }, composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
