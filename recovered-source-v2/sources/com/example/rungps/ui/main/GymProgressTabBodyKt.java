package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.example.rungps.analytics.ExerciseHistoryPoint;
import com.example.rungps.analytics.MuscleVolumeHeatmap;
import com.example.rungps.analytics.WeekVolumeBar;
import com.example.rungps.data.ExercisePr;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.data.Repository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymProgressTabBody.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÑ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u001e\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\r\u0012\u0004\u0012\u00020\u00010\u001b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"GymProgressTabBody", "", "volumeHeatmap", "Lcom/example/rungps/analytics/MuscleVolumeHeatmap;", "heatmapDays", "", "onHeatmapDaysChange", "Lkotlin/Function1;", "splitProgrammeRegions", "", "", "", "weekBars", "", "Lcom/example/rungps/analytics/WeekVolumeBar;", "load", "Lcom/example/rungps/data/GymLoadStats;", "topPrs", "Lcom/example/rungps/data/ExercisePr;", "untaggedExercises", "muscleKgByGroup", "", "repo", "Lcom/example/rungps/data/Repository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onHistoryExercise", "Lkotlin/Function2;", "Lcom/example/rungps/analytics/ExerciseHistoryPoint;", "onMuscleEdit", "(Lcom/example/rungps/analytics/MuscleVolumeHeatmap;ILkotlin/jvm/functions/Function1;Ljava/util/Map;Ljava/util/List;Lcom/example/rungps/data/GymLoadStats;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/example/rungps/data/Repository;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "filterRegion", "sortMode"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymProgressTabBodyKt {

    /* compiled from: GymProgressTabBody.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PrRegionFilter.values().length];
            try {
                iArr[PrRegionFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PrSortMode.values().length];
            try {
                iArr2[PrSortMode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[PrSortMode.HEAVIEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PrSortMode.LIGHTEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PrSortMode.MOST_REPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PrSortMode.LEAST_REPS.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PrSortMode.MOST_RECENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PrSortMode.OLDEST.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymProgressTabBody$lambda$26(MuscleVolumeHeatmap muscleVolumeHeatmap, int i, Function1 function1, Map map, List list, GymLoadStats gymLoadStats, List list2, List list3, Map map2, Repository repository, CoroutineScope coroutineScope, Function2 function2, Function1 function12, int i2, int i3, Composer composer, int i4) {
        GymProgressTabBody(muscleVolumeHeatmap, i, function1, map, list, gymLoadStats, list2, list3, map2, repository, coroutineScope, function2, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x028b, code lost:
    
        if (r47.getByUserTag().isEmpty() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028d, code lost:
    
        com.example.rungps.ui.components.TabUiKt.TabSectionCard("Muscle load (" + r48 + " days)", null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(164381429, true, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$3(r13, r47, r55, r48), r4, 54), r4, 384, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02bd, code lost:
    
        r4.endReplaceGroup();
        r4.startReplaceGroup(-2035445612);
        r22 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02cf, code lost:
    
        if (r51.isEmpty() != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02d1, code lost:
    
        r0 = com.example.rungps.analytics.GymWeeklyVolume.INSTANCE.estimatedAverageWeeklyTonnage(r51, 4);
        r10 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02dd, code lost:
    
        if ((r10 instanceof java.util.Collection) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02e6, code lost:
    
        if (r10.isEmpty() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e8, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x030b, code lost:
    
        com.example.rungps.ui.components.TabUiKt.TabSectionCard("Weekly volume (8 weeks)", null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(810830636, true, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$4(r13, r0, r51), r4, 54), r4, 390, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02ea, code lost:
    
        r10 = r10.iterator();
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f3, code lost:
    
        if (r10.hasNext() == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0301, code lost:
    
        if (((com.example.rungps.analytics.WeekVolumeBar) r10.next()).getTonnage() <= 0.0d) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0303, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0305, code lost:
    
        if (r13 >= 0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0307, code lost:
    
        kotlin.collections.CollectionsKt.throwCountOverflow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0328, code lost:
    
        r4.endReplaceGroup();
        r4.startReplaceGroup(-2035421927);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0331, code lost:
    
        if (r52 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0333, code lost:
    
        r0 = r52.getLastSessionAtMs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x033b, code lost:
    
        if (r0 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x033d, code lost:
    
        r0 = r52.getLastTonnage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0341, code lost:
    
        if (r0 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0343, code lost:
    
        r15 = r0.doubleValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x034a, code lost:
    
        r0 = r52.getLastMaxWeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x034e, code lost:
    
        if (r0 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0350, code lost:
    
        r22 = r0.doubleValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0354, code lost:
    
        r0 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        r0 = java.lang.String.format(java.util.Locale.US, "Last load: %.0f (tonnage) • max %.1f kg", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(r15), java.lang.Double.valueOf(r22)}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "format(...)");
        androidx.compose.material3.TextKt.m2376Text4IGK_g(r0, (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(r4, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, r4, 0, 0, 131066);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0348, code lost:
    
        r15 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03aa, code lost:
    
        r4.endReplaceGroup();
        androidx.compose.material3.TextKt.m2376Text4IGK_g("Personal records", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, androidx.compose.ui.text.font.FontWeight.INSTANCE.getSemiBold(), (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(r4, androidx.compose.material3.MaterialTheme.$stable).getTitleSmall(), r4, 196614, 0, 65502);
        r4.startReplaceGroup(-2035408708);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03f4, code lost:
    
        if (r53.isEmpty() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03f6, code lost:
    
        androidx.compose.material3.TextKt.m2376Text4IGK_g("No PRs logged yet.", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(r4, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, r4, 6, 0, 131066);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x042e, code lost:
    
        r4.endReplaceGroup();
        r0 = GymProgressTabBody$lambda$2(r8);
        r13 = GymProgressTabBody$lambda$6(r12);
        r4.startReplaceGroup(-2035403028);
        r0 = (r4.changed(r53) | r4.changed(r0)) | r4.changed(r13);
        r13 = r4.rememberedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0454, code lost:
    
        if (r0 != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x045c, code lost:
    
        if (r13 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0549, code lost:
    
        r4.endReplaceGroup();
        androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.Arrangement.INSTANCE.m564spacedBy0680j_4(androidx.compose.ui.unit.Dp.m6303constructorimpl(r15)), androidx.compose.foundation.layout.Arrangement.INSTANCE.m564spacedBy0680j_4(androidx.compose.ui.unit.Dp.m6303constructorimpl(r11)), 0, 0, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-427314409, true, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$5(r8), r4, 54), r4, 1573302, 56);
        androidx.compose.foundation.layout.FlowLayoutKt.FlowRow(androidx.compose.foundation.layout.PaddingKt.m688paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m6303constructorimpl(r11), 0.0f, 0.0f, 13, null), androidx.compose.foundation.layout.Arrangement.INSTANCE.m564spacedBy0680j_4(androidx.compose.ui.unit.Dp.m6303constructorimpl(r15)), androidx.compose.foundation.layout.Arrangement.INSTANCE.m564spacedBy0680j_4(androidx.compose.ui.unit.Dp.m6303constructorimpl(r11)), 0, 0, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1082707416, true, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$6(r12), r4, 54), r4, 1573302, 56);
        r4.startReplaceGroup(-2035330424);
        r0 = ((java.util.List) r13).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05fe, code lost:
    
        if (r0.hasNext() == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0600, code lost:
    
        r1 = (com.example.rungps.data.ExercisePr) r0.next();
        r7 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        r7 = java.util.Locale.US;
        r8 = r1.getExerciseName();
        r11 = com.example.rungps.util.GymWeightFormat.format$default(com.example.rungps.util.GymWeightFormat.INSTANCE, r1.getWeightKg(), false, 2, null);
        r12 = r1.getReps();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0622, code lost:
    
        if (r12 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0624, code lost:
    
        r12 = r12.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x062a, code lost:
    
        r7 = java.lang.String.format(r7, "%s: %s kg × %s (e1RM %s)", java.util.Arrays.copyOf(new java.lang.Object[]{r8, r11, java.lang.String.valueOf(r12), com.example.rungps.util.GymWeightFormat.format$default(com.example.rungps.util.GymWeightFormat.INSTANCE, r1.getE1rm(), false, 2, null)}, 4));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "format(...)");
        r18 = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(r4, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant();
        r20 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
        r4.startReplaceGroup(537940351);
        r8 = (r4.changedInstance(r57) | r4.changedInstance(r56)) | r4.changed(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0685, code lost:
    
        if ((r14 & androidx.health.platform.client.SdkConfig.SDK_VERSION) != 32) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0687, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x068a, code lost:
    
        r8 = r8 | r12;
        r12 = r4.rememberedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x068f, code lost:
    
        if (r8 != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0697, code lost:
    
        if (r12 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x06a7, code lost:
    
        r4.endReplaceGroup();
        androidx.compose.material3.TextKt.m2376Text4IGK_g(r7, androidx.compose.foundation.ClickableKt.m272clickableXHw0xAI$default(r20, false, null, null, (kotlin.jvm.functions.Function0) r12, 7, null), r18, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, r4, 0, 0, 131064);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x069d, code lost:
    
        r12 = new com.example.rungps.ui.main.GymProgressTabBodyKt$$ExternalSyntheticLambda2(r57, r58, r1, r56);
        r4.updateRememberedValue(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0689, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0629, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x06e4, code lost:
    
        r4.endReplaceGroup();
        r4.startReplaceGroup(-2035306842);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x06fc, code lost:
    
        if (r54.isEmpty() != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x06fe, code lost:
    
        com.example.rungps.ui.components.TabUiKt.TabSectionCard("Untagged lifts", null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1045928815, true, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$8(r54, r59), r4, 54), r4, 390, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0723, code lost:
    
        r4.endReplaceGroup();
        com.example.rungps.ui.components.TabUiKt.TabSectionCard("Cloud backup", null, com.example.rungps.ui.main.ComposableSingletons$GymProgressTabBodyKt.INSTANCE.m7191getLambda2$app_sideload(), r4, 390, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x073d, code lost:
    
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress() == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x073f, code lost:
    
        androidx.compose.runtime.ComposerKt.traceEventEnd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x045e, code lost:
    
        r0 = com.example.rungps.ui.main.PrRegionFilter.INSTANCE.byId(GymProgressTabBody$lambda$2(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0470, code lost:
    
        if (com.example.rungps.ui.main.GymProgressTabBodyKt.WhenMappings.$EnumSwitchMapping$0[r0.ordinal()] != 1) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0472, code lost:
    
        r14 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x04bf, code lost:
    
        switch(com.example.rungps.ui.main.GymProgressTabBodyKt.WhenMappings.$EnumSwitchMapping$1[com.example.rungps.ui.main.PrSortMode.INSTANCE.byId(GymProgressTabBody$lambda$6(r12)).ordinal()]) {
            case 1: goto L176;
            case 2: goto L175;
            case 3: goto L174;
            case 4: goto L173;
            case 5: goto L172;
            case 6: goto L171;
            case 7: goto L170;
            default: goto L168;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x04c7, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04c8, code lost:
    
        r0 = new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$compareBy$1();
        r7 = new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$thenByDescending$2(r0);
        r0 = kotlin.collections.CollectionsKt.sortedWith(r14, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$thenBy$2(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0545, code lost:
    
        r13 = r0;
        r4.updateRememberedValue(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04e4, code lost:
    
        r0 = new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$compareByDescending$1();
        r7 = new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$thenByDescending$1(r0);
        r0 = kotlin.collections.CollectionsKt.sortedWith(r14, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$thenBy$1(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0500, code lost:
    
        r0 = kotlin.collections.CollectionsKt.sortedWith(r14, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$sortedBy$3());
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x050e, code lost:
    
        r0 = kotlin.collections.CollectionsKt.sortedWith(r14, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$sortedByDescending$2());
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x051c, code lost:
    
        r0 = kotlin.collections.CollectionsKt.sortedWith(r14, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$sortedBy$2());
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x052a, code lost:
    
        r0 = kotlin.collections.CollectionsKt.sortedWith(r14, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$sortedByDescending$1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0538, code lost:
    
        r0 = kotlin.collections.CollectionsKt.sortedWith(r14, new com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$lambda$22$$inlined$sortedBy$1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0474, code lost:
    
        r14 = new java.util.ArrayList();
        r13 = r53.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0488, code lost:
    
        if (r13.hasNext() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x048a, code lost:
    
        r7 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04a2, code lost:
    
        if (r0.getRegex().matches(((com.example.rungps.data.ExercisePr) r7).getExerciseName()) == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04a4, code lost:
    
        r14.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04ab, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0338, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GymProgressTabBody(final MuscleVolumeHeatmap volumeHeatmap, final int i, final Function1<? super Integer, Unit> onHeatmapDaysChange, final Map<String, Float> splitProgrammeRegions, final List<WeekVolumeBar> weekBars, final GymLoadStats gymLoadStats, final List<ExercisePr> topPrs, final List<String> untaggedExercises, final Map<String, Double> muscleKgByGroup, final Repository repo, final CoroutineScope scope, final Function2<? super String, ? super List<ExerciseHistoryPoint>, Unit> onHistoryExercise, final Function1<? super String, Unit> onMuscleEdit, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(volumeHeatmap, "volumeHeatmap");
        Intrinsics.checkNotNullParameter(onHeatmapDaysChange, "onHeatmapDaysChange");
        Intrinsics.checkNotNullParameter(splitProgrammeRegions, "splitProgrammeRegions");
        Intrinsics.checkNotNullParameter(weekBars, "weekBars");
        Intrinsics.checkNotNullParameter(topPrs, "topPrs");
        Intrinsics.checkNotNullParameter(untaggedExercises, "untaggedExercises");
        Intrinsics.checkNotNullParameter(muscleKgByGroup, "muscleKgByGroup");
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onHistoryExercise, "onHistoryExercise");
        Intrinsics.checkNotNullParameter(onMuscleEdit, "onMuscleEdit");
        Composer startRestartGroup = composer.startRestartGroup(-423080517);
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(volumeHeatmap) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(onHeatmapDaysChange) ? 256 : 128;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(weekBars) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changed(gymLoadStats) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(topPrs) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(untaggedExercises) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(muscleKgByGroup) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(repo) ? 536870912 : 268435456;
        }
        int i6 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changedInstance(scope) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(onHistoryExercise) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(onMuscleEdit) ? 256 : 128;
        }
        int i7 = i5;
        if ((i6 & 306782355) != 306782354 || (i7 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-423080517, i6, i7, "com.example.rungps.ui.main.GymProgressTabBody (GymProgressTabBody.kt:60)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            final Map<String, Float> byRegion = volumeHeatmap.getByRegion();
            Object[] objArr = new Object[0];
            startRestartGroup.startReplaceGroup(-2035484591);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.GymProgressTabBodyKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState GymProgressTabBody$lambda$1$lambda$0;
                        GymProgressTabBody$lambda$1$lambda$0 = GymProgressTabBodyKt.GymProgressTabBody$lambda$1$lambda$0();
                        return GymProgressTabBody$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue, startRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            startRestartGroup.startReplaceGroup(-2035482062);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.GymProgressTabBodyKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState GymProgressTabBody$lambda$5$lambda$4;
                        GymProgressTabBody$lambda$5$lambda$4 = GymProgressTabBodyKt.GymProgressTabBody$lambda$5$lambda$4();
                        return GymProgressTabBody$lambda$5$lambda$4;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState2 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 3072, 6);
            float f = 8;
            float f2 = 6;
            FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f)), Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f2)), 0, 0, null, ComposableLambdaKt.rememberComposableLambda(1123985824, true, new GymProgressTabBodyKt$GymProgressTabBody$1(i, context, onHeatmapDaysChange), startRestartGroup, 54), startRestartGroup, 1573302, 56);
            startRestartGroup.startReplaceGroup(-2035461029);
            Collection<Float> values = byRegion.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator<T> it = values.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).floatValue() > 0.08f) {
                        break;
                    }
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.GymProgressTabBodyKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GymProgressTabBody$lambda$26;
                    GymProgressTabBody$lambda$26 = GymProgressTabBodyKt.GymProgressTabBody$lambda$26(MuscleVolumeHeatmap.this, i, onHeatmapDaysChange, splitProgrammeRegions, weekBars, gymLoadStats, topPrs, untaggedExercises, muscleKgByGroup, repo, scope, onHistoryExercise, onMuscleEdit, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return GymProgressTabBody$lambda$26;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState GymProgressTabBody$lambda$1$lambda$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PrRegionFilter.ALL.getId(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymProgressTabBody$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState GymProgressTabBody$lambda$5$lambda$4() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PrSortMode.HEAVIEST.getId(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymProgressTabBody$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymProgressTabBody$lambda$25$lambda$24$lambda$23(CoroutineScope coroutineScope, Function2 function2, ExercisePr exercisePr, Repository repository) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GymProgressTabBodyKt$GymProgressTabBody$7$1$1$1(function2, exercisePr, repository, null), 3, null);
        return Unit.INSTANCE;
    }
}
