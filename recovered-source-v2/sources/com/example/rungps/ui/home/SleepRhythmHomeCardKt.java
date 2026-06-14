package com.example.rungps.ui.home;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepRhythmHomeCard.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"SleepRhythmHomeCard", "", "sleepEntries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepRhythmHomeCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepRhythmHomeCard$lambda$10(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepRhythmHomeCard(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepRhythmHomeCard$lambda$6(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepRhythmHomeCard(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6 A[LOOP:0: B:29:0x00e0->B:31:0x00e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122 A[LOOP:1: B:34:0x011c->B:36:0x0122, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepRhythmHomeCard(final List<SleepEntryEntity> sleepEntries, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        boolean changed;
        Object rememberedValue;
        Iterator it;
        Iterator it2;
        final SleepScoring.SleepRhythm sleepRhythm;
        Composer composer2;
        Intrinsics.checkNotNullParameter(sleepEntries, "sleepEntries");
        Composer startRestartGroup = composer.startRestartGroup(1113285030);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sleepEntries) ? 4 : 2) | i;
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
                    ComposerKt.traceEventStart(1113285030, i3, -1, "com.example.rungps.ui.home.SleepRhythmHomeCard (SleepRhythmHomeCard.kt:23)");
                }
                ZoneId systemDefault = ZoneId.systemDefault();
                startRestartGroup.startReplaceGroup(-368826041);
                changed = startRestartGroup.changed(sleepEntries);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : sleepEntries) {
                        if (((SleepEntryEntity) obj).getEndTimeMs() > System.currentTimeMillis() - 691200000) {
                            arrayList.add(obj);
                        }
                    }
                    rememberedValue = CollectionsKt.take(arrayList, 10);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                List list = (List) rememberedValue;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    ZonedDateTime atZone = Instant.ofEpochMilli(((SleepEntryEntity) it.next()).getStartTimeMs()).atZone(systemDefault);
                    arrayList2.add(Integer.valueOf((atZone.getHour() * 60) + atZone.getMinute()));
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it2 = list.iterator();
                while (it2.hasNext()) {
                    ZonedDateTime atZone2 = Instant.ofEpochMilli(((SleepEntryEntity) it2.next()).getEndTimeMs()).atZone(systemDefault);
                    arrayList4.add(Integer.valueOf((atZone2.getHour() * 60) + atZone2.getMinute()));
                }
                sleepRhythm = SleepScoring.INSTANCE.sleepRhythm(arrayList3, arrayList4);
                if (sleepRhythm != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.home.SleepRhythmHomeCardKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit SleepRhythmHomeCard$lambda$6;
                                SleepRhythmHomeCard$lambda$6 = SleepRhythmHomeCardKt.SleepRhythmHomeCard$lambda$6(sleepEntries, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                return SleepRhythmHomeCard$lambda$6;
                            }
                        });
                        return;
                    }
                    return;
                }
                DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("h:mm a");
                String format = Instant.ofEpochMilli(0L).atZone(systemDefault).withHour(sleepRhythm.getAvgBedMin() / 60).withMinute(sleepRhythm.getAvgBedMin() % 60).format(ofPattern);
                String format2 = Instant.ofEpochMilli(0L).atZone(systemDefault).withHour(sleepRhythm.getAvgWakeMin() / 60).withMinute(sleepRhythm.getAvgWakeMin() % 60).format(ofPattern);
                Modifier m688paddingqDBjuR0$default = PaddingKt.m688paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, Dp.m6303constructorimpl(8), 0.0f, 0.0f, 13, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                Modifier modifier4 = modifier3;
                TextKt.m2376Text4IGK_g("Sleep rhythm", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, 196614, 0, 65502);
                TextKt.m2376Text4IGK_g("Regularity " + sleepRhythm.getRegularityScore() + "/100 · bed ~" + format + " · wake ~" + format2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 0, 0, 65530);
                startRestartGroup.startReplaceGroup(876120137);
                boolean changed2 = startRestartGroup.changed(sleepRhythm);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.home.SleepRhythmHomeCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float SleepRhythmHomeCard$lambda$9$lambda$8$lambda$7;
                            SleepRhythmHomeCard$lambda$9$lambda$8$lambda$7 = SleepRhythmHomeCardKt.SleepRhythmHomeCard$lambda$9$lambda$8$lambda$7(SleepScoring.SleepRhythm.this);
                            return Float.valueOf(SleepRhythmHomeCard$lambda$9$lambda$8$lambda$7);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                ProgressIndicatorKt.m2054LinearProgressIndicatorGJbTh5U((Function0) rememberedValue2, PaddingKt.m688paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6303constructorimpl(6), 0.0f, 0.0f, 13, null), 0L, 0L, 0, 0.0f, null, startRestartGroup, 48, 124);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
            if (endRestartGroup2 != null) {
                endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.home.SleepRhythmHomeCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit SleepRhythmHomeCard$lambda$10;
                        SleepRhythmHomeCard$lambda$10 = SleepRhythmHomeCardKt.SleepRhythmHomeCard$lambda$10(sleepEntries, modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return SleepRhythmHomeCard$lambda$10;
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
        ZoneId systemDefault2 = ZoneId.systemDefault();
        startRestartGroup.startReplaceGroup(-368826041);
        changed = startRestartGroup.changed(sleepEntries);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        ArrayList arrayList5 = new ArrayList();
        while (r4.hasNext()) {
        }
        rememberedValue = CollectionsKt.take(arrayList5, 10);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        List list2 = (List) rememberedValue;
        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList32 = arrayList22;
        ArrayList arrayList42 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        it2 = list2.iterator();
        while (it2.hasNext()) {
        }
        sleepRhythm = SleepScoring.INSTANCE.sleepRhythm(arrayList32, arrayList42);
        if (sleepRhythm != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SleepRhythmHomeCard$lambda$9$lambda$8$lambda$7(SleepScoring.SleepRhythm sleepRhythm) {
        return sleepRhythm.getRegularityScore() / 100.0f;
    }
}
