package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardColors;
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
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepListenPreferences;
import com.example.rungps.sleep.SleepOsaRiskScorer;
import com.example.rungps.sleep.SleepTrendAnalysis;
import com.google.firebase.firestore.model.Values;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepTrendCard.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\f\u001a_\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0017X\u008a\u008e\u0002"}, d2 = {"SleepTrendCard", "", "entries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TrendStat", "label", "", Values.VECTOR_MAP_VECTORS_KEY, "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SleepHoursSparkline", "points", "", "barColor", "Landroidx/compose/ui/graphics/Color;", "guideMinHours", "guideGoalHours", "guideMaxHours", "onTapIndex", "Lkotlin/Function1;", "", "SleepHoursSparkline-oC9nPe0", "(Ljava/util/List;JFFFLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "window", "Lcom/example/rungps/sleep/SleepTrendAnalysis$Window;", "activeIdx"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepTrendCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepHoursSparkline_oC9nPe0$lambda$18(List list, long j, float f, float f2, float f3, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        m7607SleepHoursSparklineoC9nPe0(list, j, f, f2, f3, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTrendCard$lambda$0(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepTrendCard(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTrendCard$lambda$10(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepTrendCard(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTrendCard$lambda$6(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepTrendCard(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrendStat$lambda$12(String str, String str2, int i, Composer composer, int i2) {
        TrendStat(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepTrendCard(final List<SleepEntryEntity> entries, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Composer startRestartGroup = composer.startRestartGroup(1629829672);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(entries) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1629829672, i3, -1, "com.example.rungps.ui.sleep.SleepTrendCard (SleepTrendCard.kt:43)");
                }
                if (!entries.isEmpty()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SleepTrendCard$lambda$0;
                                SleepTrendCard$lambda$0 = SleepTrendCardKt.SleepTrendCard$lambda$0(entries, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return SleepTrendCard$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                startRestartGroup.startReplaceGroup(-168461820);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SleepTrendAnalysis.Window.Week, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-168459264);
                boolean changed = startRestartGroup.changed(entries);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SleepOsaRiskScorer.INSTANCE.scoreRecentNights(entries, SleepListenPreferences.INSTANCE.sleptAlone(context));
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                SleepOsaRiskScorer.Result result = (SleepOsaRiskScorer.Result) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                SleepTrendAnalysis.Window SleepTrendCard$lambda$2 = SleepTrendCard$lambda$2(mutableState);
                startRestartGroup.startReplaceGroup(-168454892);
                boolean changed2 = startRestartGroup.changed(SleepTrendCard$lambda$2) | startRestartGroup.changed(entries);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SleepTrendAnalysis.INSTANCE.summarize(entries, SleepTrendCard$lambda$2(mutableState));
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                SleepTrendAnalysis.TrendSummary trendSummary = (SleepTrendAnalysis.TrendSummary) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                if (trendSummary.getNightsLogged() == 0) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SleepTrendCard$lambda$6;
                                SleepTrendCard$lambda$6 = SleepTrendCardKt.SleepTrendCard$lambda$6(entries, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return SleepTrendCard$lambda$6;
                            }
                        });
                        return;
                    }
                    return;
                }
                List<SleepTrendAnalysis.NightPoint> points = trendSummary.getPoints();
                startRestartGroup.startReplaceGroup(-168450469);
                boolean changed3 = startRestartGroup.changed(points);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(-1);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                MutableIntState mutableIntState = (MutableIntState) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                int size = trendSummary.getPoints().size();
                int SleepTrendCard$lambda$8 = SleepTrendCard$lambda$8(mutableIntState);
                SleepTrendAnalysis.NightPoint nightPoint = (SleepTrendCard$lambda$8 < 0 || SleepTrendCard$lambda$8 >= size) ? null : trendSummary.getPoints().get(SleepTrendCard$lambda$8(mutableIntState));
                ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                CardColors m1511cardColorsro_MJ88 = CardDefaults.INSTANCE.m1511cardColorsro_MJ88(colorScheme.getSurfaceContainerHigh(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14);
                Modifier modifier4 = modifier3;
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2053121674, true, new SleepTrendCardKt$SleepTrendCard$3(nightPoint, colorScheme, trendSummary, result, entries, mutableIntState, mutableState), startRestartGroup, 54);
                composer2 = startRestartGroup;
                CardKt.Card(fillMaxWidth$default, null, m1511cardColorsro_MJ88, null, null, rememberComposableLambda, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup3 = composer2.endRestartGroup();
            if (endRestartGroup3 != null) {
                endRestartGroup3.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SleepTrendCard$lambda$10;
                        SleepTrendCard$lambda$10 = SleepTrendCardKt.SleepTrendCard$lambda$10(entries, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SleepTrendCard$lambda$10;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!entries.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepTrendAnalysis.Window SleepTrendCard$lambda$2(MutableState<SleepTrendAnalysis.Window> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTrendCard$lambda$8(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TrendStat(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-769440754);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-769440754, i3, -1, "com.example.rungps.ui.sleep.TrendStat (SleepTrendCard.kt:175)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            TextKt.m2376Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, i3 & 14, 0, 65530);
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), composer2, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TrendStat$lambda$12;
                    TrendStat$lambda$12 = SleepTrendCardKt.TrendStat$lambda$12(str, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TrendStat$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b8  */
    /* renamed from: SleepHoursSparkline-oC9nPe0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7607SleepHoursSparklineoC9nPe0(final List<Float> list, final long j, final float f, final float f2, final float f3, Modifier modifier, Function1<? super Integer, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Function1<? super Integer, Unit> function12;
        Function1<? super Integer, Unit> function13;
        Modifier.Companion companion;
        Modifier then;
        boolean changedInstance;
        Object rememberedValue;
        Modifier modifier3;
        int i5;
        Function1<? super Integer, Unit> function14;
        Modifier modifier4;
        final Function1<? super Integer, Unit> function15;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(268473589);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(f3) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                function12 = function1;
            } else {
                function12 = function1;
                if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                }
            }
            if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                function13 = i4 == 0 ? null : function12;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(268473589, i3, -1, "com.example.rungps.ui.sleep.SleepHoursSparkline (SleepTrendCard.kt:191)");
                }
                Float maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) list);
                final float coerceAtLeast = RangesKt.coerceAtLeast(maxOrNull == null ? maxOrNull.floatValue() : 1.0f, 1.0f + f3);
                final long m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3873getGray0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
                startRestartGroup.startReplaceGroup(560953247);
                if (function13 == null) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    startRestartGroup.startReplaceGroup(560955419);
                    boolean changedInstance2 = ((i3 & 3670016) == 1048576) | startRestartGroup.changedInstance(list);
                    SleepTrendCardKt$SleepHoursSparkline$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new SleepTrendCardKt$SleepHoursSparkline$1$1(list, function13, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    companion = SuspendingPointerInputFilterKt.pointerInput(companion2, list, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2);
                } else {
                    companion = Modifier.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
                then = modifier2.then(companion);
                startRestartGroup.startReplaceGroup(560967470);
                changedInstance = startRestartGroup.changedInstance(list) | startRestartGroup.changed(coerceAtLeast) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | ((57344 & i3) != 16384) | ((i3 & SdkConfig.SDK_VERSION) != 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    modifier3 = then;
                    i5 = 0;
                    function14 = function13;
                    modifier4 = modifier2;
                    Function1 function16 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16;
                            SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16 = SleepTrendCardKt.SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16(list, f, f2, f3, m3842copywmQWz5c$default, coerceAtLeast, j, (DrawScope) obj);
                            return SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16;
                        }
                    };
                    startRestartGroup.updateRememberedValue(function16);
                    rememberedValue = function16;
                } else {
                    modifier3 = then;
                    function14 = function13;
                    modifier4 = modifier2;
                    i5 = 0;
                }
                startRestartGroup.endReplaceGroup();
                CanvasKt.Canvas(modifier3, (Function1) rememberedValue, startRestartGroup, i5);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function15 = function14;
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                function15 = function12;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SleepHoursSparkline_oC9nPe0$lambda$18;
                        SleepHoursSparkline_oC9nPe0$lambda$18 = SleepTrendCardKt.SleepHoursSparkline_oC9nPe0$lambda$18(list, j, f, f2, f3, modifier2, function15, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SleepHoursSparkline_oC9nPe0$lambda$18;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        if (i6 != 0) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Float maxOrNull2 = CollectionsKt.maxOrNull((Iterable<? extends Float>) list);
        final float coerceAtLeast2 = RangesKt.coerceAtLeast(maxOrNull2 == null ? maxOrNull2.floatValue() : 1.0f, 1.0f + f3);
        final long m3842copywmQWz5c$default2 = Color.m3842copywmQWz5c$default(Color.INSTANCE.m3873getGray0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
        startRestartGroup.startReplaceGroup(560953247);
        if (function13 == null) {
        }
        startRestartGroup.endReplaceGroup();
        then = modifier2.then(companion);
        startRestartGroup.startReplaceGroup(560967470);
        changedInstance = startRestartGroup.changedInstance(list) | startRestartGroup.changed(coerceAtLeast2) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | ((57344 & i3) != 16384) | ((i3 & SdkConfig.SDK_VERSION) != 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        modifier3 = then;
        i5 = 0;
        function14 = function13;
        modifier4 = modifier2;
        Function1 function162 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16;
                SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16 = SleepTrendCardKt.SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16(list, f, f2, f3, m3842copywmQWz5c$default2, coerceAtLeast2, j, (DrawScope) obj);
                return SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16;
            }
        };
        startRestartGroup.updateRememberedValue(function162);
        rememberedValue = function162;
        startRestartGroup.endReplaceGroup();
        CanvasKt.Canvas(modifier3, (Function1) rememberedValue, startRestartGroup, i5);
        if (ComposerKt.isTraceInProgress()) {
        }
        function15 = function14;
        modifier2 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16(List list, float f, float f2, float f3, long j, float f4, long j2, DrawScope drawScope) {
        DrawScope Canvas = drawScope;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        int size = list.size();
        if (size == 0) {
            return Unit.INSTANCE;
        }
        Iterator it = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)}).iterator();
        while (it.hasNext()) {
            float SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16$yForHours = SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16$yForHours(f4, Canvas, ((Number) it.next()).floatValue());
            DrawScope.m4385drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(0.0f, SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16$yForHours), OffsetKt.Offset(Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc()), SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16$yForHours), 1.0f, 0, null, 0.0f, null, 0, 496, null);
            Canvas = drawScope;
            size = size;
        }
        float f5 = size;
        float m3671getWidthimpl = (Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc()) * 0.04f) / f5;
        float m3671getWidthimpl2 = (Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc()) - ((r21 + 1) * m3671getWidthimpl)) / f5;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float m3668getHeightimpl = Size.m3668getHeightimpl(drawScope.mo4399getSizeNHjbRc()) * RangesKt.coerceIn(((Number) obj).floatValue() / f4, 0.05f, 1.0f);
            DrawScope.m4395drawRoundRectuAw5IA$default(drawScope, j2, OffsetKt.Offset(m3671getWidthimpl + (i * (m3671getWidthimpl2 + m3671getWidthimpl)), Size.m3668getHeightimpl(drawScope.mo4399getSizeNHjbRc()) - m3668getHeightimpl), androidx.compose.ui.geometry.SizeKt.Size(m3671getWidthimpl2, m3668getHeightimpl), CornerRadiusKt.CornerRadius(4.0f, 4.0f), null, 0.0f, null, 0, 240, null);
            i = i2;
            m3671getWidthimpl2 = m3671getWidthimpl2;
        }
        return Unit.INSTANCE;
    }

    private static final float SleepHoursSparkline_oC9nPe0$lambda$17$lambda$16$yForHours(float f, DrawScope drawScope, float f2) {
        return Size.m3668getHeightimpl(drawScope.mo4399getSizeNHjbRc()) * (1.0f - RangesKt.coerceIn(f2 / f, 0.0f, 1.0f));
    }
}
