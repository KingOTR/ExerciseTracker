package com.example.rungps.ui.main;

import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.gym.AmbientSessionTagger;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymAmbientTagRow.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"GymAmbientTagRow", "", "session", "Lcom/example/rungps/data/GymSessionEntity;", "repo", "Lcom/example/rungps/data/Repository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/rungps/data/GymSessionEntity;Lcom/example/rungps/data/Repository;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "selected", "", "", "customDraft"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymAmbientTagRowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymAmbientTagRow$lambda$19(GymSessionEntity gymSessionEntity, Repository repository, CoroutineScope coroutineScope, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GymAmbientTagRow(gymSessionEntity, repository, coroutineScope, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GymAmbientTagRow(final GymSessionEntity session, final Repository repo, final CoroutineScope scope, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        String customOnly;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        String displayTags;
        String ambientTag;
        int currentCompositeKeyHash2;
        Composer m3336constructorimpl2;
        Composer composer2;
        boolean changed3;
        Object rememberedValue3;
        int currentCompositeKeyHash3;
        Composer m3336constructorimpl3;
        boolean changedInstance;
        Object rememberedValue4;
        Composer composer3;
        Composer composer4;
        boolean changed4;
        Object rememberedValue5;
        String str;
        String str2;
        final MutableState mutableState;
        MutableState mutableState2;
        String str3;
        Modifier modifier3;
        Composer composer5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Composer startRestartGroup = composer.startRestartGroup(-1016956982);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(session) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(repo) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(scope) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1016956982, i3, -1, "com.example.rungps.ui.main.GymAmbientTagRow (GymAmbientTagRow.kt:34)");
                }
                Set<String> parseStoredTags = AmbientSessionTagger.INSTANCE.parseStoredTags(session.getAmbientTagCustom());
                long id = session.getId();
                String ambientTagCustom = session.getAmbientTagCustom();
                startRestartGroup.startReplaceGroup(-497327361);
                changed = startRestartGroup.changed(ambientTagCustom) | startRestartGroup.changed(id);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(parseStoredTags, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final MutableState mutableState3 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                long id2 = session.getId();
                String ambientTagCustom2 = session.getAmbientTagCustom();
                startRestartGroup.startReplaceGroup(-497324184);
                changed2 = startRestartGroup.changed(id2) | startRestartGroup.changed(ambientTagCustom2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    customOnly = AmbientSessionTagger.INSTANCE.customOnly(session.getAmbientTagCustom());
                    if (customOnly == null) {
                        customOnly = "";
                    }
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(customOnly, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState4 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                float f = 6;
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                String str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
                String str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                TextKt.m2376Text4IGK_g("Session vibe", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, 196614, 0, 65502);
                displayTags = AmbientSessionTagger.INSTANCE.displayTags(session.getAmbientTag(), session.getAmbientTagCustom());
                startRestartGroup.startReplaceGroup(-1974805941);
                if (displayTags.length() > 0) {
                    TextKt.m2376Text4IGK_g(displayTags, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyLarge(), startRestartGroup, 0, 0, 65530);
                }
                startRestartGroup.endReplaceGroup();
                ambientTag = session.getAmbientTag();
                startRestartGroup.startReplaceGroup(-1974800062);
                if (ambientTag != null) {
                    startRestartGroup.startReplaceGroup(-1974799266);
                    if (session.getAmbientTagCustom() != null) {
                        TextKt.m2376Text4IGK_g("Auto: " + ambientTag, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                    }
                    startRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
                TextKt.m2376Text4IGK_g("Pick one or more tags", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 6, 0, 65530);
                Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                String str6 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str5);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, horizontalScroll$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                String str7 = "C101@5126L9:Row.kt#2w3rfo";
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-378144231);
                for (final String str8 : AmbientSessionTagger.INSTANCE.getChipSuggestions()) {
                    boolean contains = GymAmbientTagRow$lambda$1(mutableState3).contains(str8);
                    startRestartGroup.startReplaceGroup(787606813);
                    boolean changed5 = startRestartGroup.changed(mutableState3) | startRestartGroup.changed(str8) | startRestartGroup.changedInstance(scope) | startRestartGroup.changedInstance(repo) | startRestartGroup.changedInstance(session) | startRestartGroup.changed(mutableState4);
                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changed5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        str = str6;
                        str2 = str5;
                        mutableState = mutableState4;
                        mutableState2 = mutableState3;
                        str3 = str4;
                        modifier3 = modifier4;
                        composer5 = startRestartGroup;
                        rememberedValue6 = new Function0() { // from class: com.example.rungps.ui.main.GymAmbientTagRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit GymAmbientTagRow$lambda$18$lambda$10$lambda$9$lambda$8$lambda$7;
                                GymAmbientTagRow$lambda$18$lambda$10$lambda$9$lambda$8$lambda$7 = GymAmbientTagRowKt.GymAmbientTagRow$lambda$18$lambda$10$lambda$9$lambda$8$lambda$7(str8, scope, mutableState3, repo, session, mutableState);
                                return GymAmbientTagRow$lambda$18$lambda$10$lambda$9$lambda$8$lambda$7;
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue6);
                    } else {
                        str2 = str5;
                        mutableState = mutableState4;
                        mutableState2 = mutableState3;
                        str3 = str4;
                        modifier3 = modifier4;
                        str = str6;
                        composer5 = startRestartGroup;
                    }
                    composer5.endReplaceGroup();
                    Composer composer6 = composer5;
                    ChipKt.FilterChip(contains, (Function0) rememberedValue6, ComposableLambdaKt.rememberComposableLambda(1863002913, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.GymAmbientTagRowKt$GymAmbientTagRow$1$2$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                            invoke(composer7, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer7, int i5) {
                            if ((i5 & 3) == 2 && composer7.getSkipping()) {
                                composer7.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1863002913, i5, -1, "com.example.rungps.ui.main.GymAmbientTagRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GymAmbientTagRow.kt:78)");
                            }
                            TextKt.m2376Text4IGK_g(str8, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer7, 0, 3072, 122878);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer5, 54), null, false, null, null, null, null, null, null, null, composer6, 384, 0, 4088);
                    mutableState4 = mutableState;
                    mutableState3 = mutableState2;
                    str7 = str7;
                    startRestartGroup = composer6;
                    str6 = str;
                    str5 = str2;
                    str4 = str3;
                    modifier4 = modifier3;
                }
                String str9 = str5;
                final MutableState mutableState5 = mutableState4;
                final MutableState mutableState6 = mutableState3;
                String str10 = str4;
                Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                String str11 = str7;
                String str12 = str6;
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                String GymAmbientTagRow$lambda$4 = GymAmbientTagRow$lambda$4(mutableState5);
                composer2.startReplaceGroup(-1974752727);
                changed3 = composer2.changed(mutableState5);
                rememberedValue3 = composer2.rememberedValue();
                if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.main.GymAmbientTagRowKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit GymAmbientTagRow$lambda$18$lambda$12$lambda$11;
                            GymAmbientTagRow$lambda$18$lambda$12$lambda$11 = GymAmbientTagRowKt.GymAmbientTagRow$lambda$18$lambda$12$lambda$11(MutableState.this, (String) obj);
                            return GymAmbientTagRow$lambda$18$lambda$12$lambda$11;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                composer2.endReplaceGroup();
                OutlinedTextFieldKt.OutlinedTextField(GymAmbientTagRow$lambda$4, (Function1<? super String, Unit>) rememberedValue3, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GymAmbientTagRowKt.INSTANCE.m7171getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GymAmbientTagRowKt.INSTANCE.m7172getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer2, 14156160, 12582912, 0, 8257336);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, str12);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getTop(), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str9);
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str10);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                m3336constructorimpl3 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, str11);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                composer2.startReplaceGroup(-378109535);
                changedInstance = composer2.changedInstance(scope) | composer2.changedInstance(repo) | composer2.changedInstance(session) | composer2.changed(mutableState6) | composer2.changed(mutableState5);
                rememberedValue4 = composer2.rememberedValue();
                if (!changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    composer3 = composer2;
                    Function0 function0 = new Function0() { // from class: com.example.rungps.ui.main.GymAmbientTagRowKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit GymAmbientTagRow$lambda$18$lambda$17$lambda$14$lambda$13;
                            GymAmbientTagRow$lambda$18$lambda$17$lambda$14$lambda$13 = GymAmbientTagRowKt.GymAmbientTagRow$lambda$18$lambda$17$lambda$14$lambda$13(CoroutineScope.this, repo, session, mutableState6, mutableState5);
                            return GymAmbientTagRow$lambda$18$lambda$17$lambda$14$lambda$13;
                        }
                    };
                    composer3.updateRememberedValue(function0);
                    rememberedValue4 = function0;
                } else {
                    composer3 = composer2;
                }
                composer3.endReplaceGroup();
                composer4 = composer3;
                ButtonKt.TextButton((Function0) rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$GymAmbientTagRowKt.INSTANCE.m7173getLambda3$app_sideload(), composer4, 805306368, 510);
                composer4.startReplaceGroup(-378097153);
                changed4 = composer4.changed(mutableState6) | composer4.changed(mutableState5) | composer4.changedInstance(scope) | composer4.changedInstance(repo) | composer4.changedInstance(session);
                rememberedValue5 = composer4.rememberedValue();
                if (!changed4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    startRestartGroup = composer4;
                    Function0 function02 = new Function0() { // from class: com.example.rungps.ui.main.GymAmbientTagRowKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit GymAmbientTagRow$lambda$18$lambda$17$lambda$16$lambda$15;
                            GymAmbientTagRow$lambda$18$lambda$17$lambda$16$lambda$15 = GymAmbientTagRowKt.GymAmbientTagRow$lambda$18$lambda$17$lambda$16$lambda$15(CoroutineScope.this, mutableState6, mutableState5, repo, session);
                            return GymAmbientTagRow$lambda$18$lambda$17$lambda$16$lambda$15;
                        }
                    };
                    startRestartGroup.updateRememberedValue(function02);
                    rememberedValue5 = function02;
                } else {
                    startRestartGroup = composer4;
                }
                startRestartGroup.endReplaceGroup();
                ButtonKt.TextButton((Function0) rememberedValue5, null, false, null, null, null, null, null, null, ComposableSingletons$GymAmbientTagRowKt.INSTANCE.m7174getLambda4$app_sideload(), startRestartGroup, 805306368, 510);
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
                modifier2 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.GymAmbientTagRowKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit GymAmbientTagRow$lambda$19;
                        GymAmbientTagRow$lambda$19 = GymAmbientTagRowKt.GymAmbientTagRow$lambda$19(GymSessionEntity.this, repo, scope, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return GymAmbientTagRow$lambda$19;
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
        Set<String> parseStoredTags2 = AmbientSessionTagger.INSTANCE.parseStoredTags(session.getAmbientTagCustom());
        long id3 = session.getId();
        String ambientTagCustom3 = session.getAmbientTagCustom();
        startRestartGroup.startReplaceGroup(-497327361);
        changed = startRestartGroup.changed(ambientTagCustom3) | startRestartGroup.changed(id3);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(parseStoredTags2, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        final MutableState mutableState32 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        long id22 = session.getId();
        String ambientTagCustom22 = session.getAmbientTagCustom();
        startRestartGroup.startReplaceGroup(-497324184);
        changed2 = startRestartGroup.changed(id22) | startRestartGroup.changed(ambientTagCustom22);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        customOnly = AmbientSessionTagger.INSTANCE.customOnly(session.getAmbientTagCustom());
        if (customOnly == null) {
        }
        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(customOnly, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        MutableState mutableState42 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
        float f2 = 6;
        Arrangement.HorizontalOrVertical m564spacedBy0680j_44 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f2));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_44, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        String str42 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        String str52 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
        TextKt.m2376Text4IGK_g("Session vibe", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, 196614, 0, 65502);
        displayTags = AmbientSessionTagger.INSTANCE.displayTags(session.getAmbientTag(), session.getAmbientTagCustom());
        startRestartGroup.startReplaceGroup(-1974805941);
        if (displayTags.length() > 0) {
        }
        startRestartGroup.endReplaceGroup();
        ambientTag = session.getAmbientTag();
        startRestartGroup.startReplaceGroup(-1974800062);
        if (ambientTag != null) {
        }
        startRestartGroup.endReplaceGroup();
        TextKt.m2376Text4IGK_g("Pick one or more tags", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 6, 0, 65530);
        Modifier horizontalScroll$default2 = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_422 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f2));
        String str62 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m564spacedBy0680j_422, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str52);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, horizontalScroll$default2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl2.getInserting()) {
        }
        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        String str72 = "C101@5126L9:Row.kt#2w3rfo";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-378144231);
        while (r27.hasNext()) {
        }
        String str92 = str52;
        final MutableState mutableState52 = mutableState42;
        final MutableState mutableState62 = mutableState32;
        String str102 = str42;
        Modifier modifier52 = modifier4;
        composer2 = startRestartGroup;
        String str112 = str72;
        String str122 = str62;
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        String GymAmbientTagRow$lambda$42 = GymAmbientTagRow$lambda$4(mutableState52);
        composer2.startReplaceGroup(-1974752727);
        changed3 = composer2.changed(mutableState52);
        rememberedValue3 = composer2.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.main.GymAmbientTagRowKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit GymAmbientTagRow$lambda$18$lambda$12$lambda$11;
                GymAmbientTagRow$lambda$18$lambda$12$lambda$11 = GymAmbientTagRowKt.GymAmbientTagRow$lambda$18$lambda$12$lambda$11(MutableState.this, (String) obj);
                return GymAmbientTagRow$lambda$18$lambda$12$lambda$11;
            }
        };
        composer2.updateRememberedValue(rememberedValue3);
        composer2.endReplaceGroup();
        OutlinedTextFieldKt.OutlinedTextField(GymAmbientTagRow$lambda$42, (Function1<? super String, Unit>) rememberedValue3, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GymAmbientTagRowKt.INSTANCE.m7171getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GymAmbientTagRowKt.INSTANCE.m7172getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer2, 14156160, 12582912, 0, 8257336);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_432 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, str122);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m564spacedBy0680j_432, Alignment.INSTANCE.getTop(), composer2, 6);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str92);
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer2, companion2);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str102);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m3336constructorimpl3 = Updater.m3336constructorimpl(composer2);
        Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl3.getInserting()) {
        }
        m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
        Updater.m3343setimpl(m3336constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, str112);
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        composer2.startReplaceGroup(-378109535);
        changedInstance = composer2.changedInstance(scope) | composer2.changedInstance(repo) | composer2.changedInstance(session) | composer2.changed(mutableState62) | composer2.changed(mutableState52);
        rememberedValue4 = composer2.rememberedValue();
        if (changedInstance) {
        }
        composer3 = composer2;
        Function0 function03 = new Function0() { // from class: com.example.rungps.ui.main.GymAmbientTagRowKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit GymAmbientTagRow$lambda$18$lambda$17$lambda$14$lambda$13;
                GymAmbientTagRow$lambda$18$lambda$17$lambda$14$lambda$13 = GymAmbientTagRowKt.GymAmbientTagRow$lambda$18$lambda$17$lambda$14$lambda$13(CoroutineScope.this, repo, session, mutableState62, mutableState52);
                return GymAmbientTagRow$lambda$18$lambda$17$lambda$14$lambda$13;
            }
        };
        composer3.updateRememberedValue(function03);
        rememberedValue4 = function03;
        composer3.endReplaceGroup();
        composer4 = composer3;
        ButtonKt.TextButton((Function0) rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$GymAmbientTagRowKt.INSTANCE.m7173getLambda3$app_sideload(), composer4, 805306368, 510);
        composer4.startReplaceGroup(-378097153);
        changed4 = composer4.changed(mutableState62) | composer4.changed(mutableState52) | composer4.changedInstance(scope) | composer4.changedInstance(repo) | composer4.changedInstance(session);
        rememberedValue5 = composer4.rememberedValue();
        if (changed4) {
        }
        startRestartGroup = composer4;
        Function0 function022 = new Function0() { // from class: com.example.rungps.ui.main.GymAmbientTagRowKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit GymAmbientTagRow$lambda$18$lambda$17$lambda$16$lambda$15;
                GymAmbientTagRow$lambda$18$lambda$17$lambda$16$lambda$15 = GymAmbientTagRowKt.GymAmbientTagRow$lambda$18$lambda$17$lambda$16$lambda$15(CoroutineScope.this, mutableState62, mutableState52, repo, session);
                return GymAmbientTagRow$lambda$18$lambda$17$lambda$16$lambda$15;
            }
        };
        startRestartGroup.updateRememberedValue(function022);
        rememberedValue5 = function022;
        startRestartGroup.endReplaceGroup();
        ButtonKt.TextButton((Function0) rememberedValue5, null, false, null, null, null, null, null, null, ComposableSingletons$GymAmbientTagRowKt.INSTANCE.m7174getLambda4$app_sideload(), startRestartGroup, 805306368, 510);
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
        }
        modifier2 = modifier52;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<String> GymAmbientTagRow$lambda$1(MutableState<Set<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymAmbientTagRow$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymAmbientTagRow$lambda$18$lambda$10$lambda$9$lambda$8$lambda$7(String str, CoroutineScope coroutineScope, MutableState mutableState, Repository repository, GymSessionEntity gymSessionEntity, MutableState mutableState2) {
        mutableState.setValue(GymAmbientTagRow$lambda$1(mutableState).contains(str) ? SetsKt.minus(GymAmbientTagRow$lambda$1(mutableState), str) : SetsKt.plus(GymAmbientTagRow$lambda$1(mutableState), str));
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymAmbientTagRowKt$GymAmbientTagRow$1$2$1$1$1$1(repository, gymSessionEntity, mutableState, mutableState2, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymAmbientTagRow$lambda$18$lambda$12$lambda$11(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymAmbientTagRow$lambda$18$lambda$17$lambda$14$lambda$13(CoroutineScope coroutineScope, Repository repository, GymSessionEntity gymSessionEntity, MutableState mutableState, MutableState mutableState2) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymAmbientTagRowKt$GymAmbientTagRow$1$4$1$1$1(repository, gymSessionEntity, mutableState, mutableState2, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymAmbientTagRow$lambda$18$lambda$17$lambda$16$lambda$15(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Repository repository, GymSessionEntity gymSessionEntity) {
        mutableState.setValue(SetsKt.emptySet());
        mutableState2.setValue("");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymAmbientTagRowKt$GymAmbientTagRow$1$4$2$1$1(repository, gymSessionEntity, null), 2, null);
        return Unit.INSTANCE;
    }
}
