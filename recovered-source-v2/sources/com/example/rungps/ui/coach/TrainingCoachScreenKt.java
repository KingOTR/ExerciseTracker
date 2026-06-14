package com.example.rungps.ui.coach;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
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
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.analytics.RaceTrendCalculator;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.TrainingPlanProgressEntity;
import com.example.rungps.training.BuiltinTrainingPlans;
import com.example.rungps.training.DailyTrainingCoach;
import com.example.rungps.training.GoalPromptParser;
import com.example.rungps.training.RaceGoalSplitSheet;
import com.example.rungps.training.RunningGoalCoach;
import com.example.rungps.ui.week.DailyCoachCardKt;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TrainingCoachScreen.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0002X\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0002X\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u008a\u008e\u0002²\u0006\u0016\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 X\u008a\u008e\u0002²\u0006\u0010\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0001X\u008a\u0084\u0002²\u0006\u0010\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0001X\u008a\u0084\u0002²\u0006\u0010\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0001X\u008a\u0084\u0002²\u0006\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0001X\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u0004\u0018\u00010,X\u008a\u008e\u0002"}, d2 = {"goalPresets", "", "", "TrainingCoachScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CoachPlanCard", "p", "Lcom/example/rungps/training/RunningGoalCoach$CoachPlan;", "(Lcom/example/rungps/training/RunningGoalCoach$CoachPlan;Landroidx/compose/runtime/Composer;I)V", "CoachRow", "label", "body", "accent", "Landroidx/compose/ui/graphics/Color;", "CoachRow-XO-JAsU", "(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V", "app_sideload", NotificationCompat.CATEGORY_PROGRESS, "Lcom/example/rungps/data/TrainingPlanProgressEntity;", "goalText", "plan", "slug", "confirmStart", "Lcom/example/rungps/training/BuiltinTrainingPlans$PlanDefinition;", "confirmSaveCoach", "", "snap", "Lcom/example/rungps/analytics/RaceTrendCalculator$Snapshot;", "distancePbs", "", "", "", "runs", "Lcom/example/rungps/data/RunEntity;", "gymSessions", "Lcom/example/rungps/data/GymSessionEntity;", "recoveryEvents", "Lcom/example/rungps/data/RecoveryEventEntity;", "sleepDb", "Lcom/example/rungps/data/SleepEntryEntity;", "dailyBrief", "Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainingCoachScreenKt {
    private static final List<String> goalPresets = CollectionsKt.listOf((Object[]) new String[]{"Sub 45 min 10K in 12 weeks", "8 km race in 8 weeks", "First 5K", "Half marathon sub 1:45", "Marathon in autumn", "Run more km per week", "Get faster at 5K"});

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoachPlanCard$lambda$48(RunningGoalCoach.CoachPlan coachPlan, int i, Composer composer, int i2) {
        CoachPlanCard(coachPlan, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoachRow_XO_JAsU$lambda$49(String str, String str2, long j, int i, Composer composer, int i2) {
        m6946CoachRowXOJAsU(str, str2, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrainingCoachScreen$lambda$47(Modifier modifier, int i, int i2, Composer composer, int i3) {
        TrainingCoachScreen(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0601  */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TrainingCoachScreen(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Object[] objArr;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        Object obj;
        MutableState mutableState4;
        int i4;
        MutableState mutableState5;
        Composer composer2;
        Long l;
        List<RaceGoalSplitSheet.KmSplitRow> emptyList;
        final List<RaceGoalSplitSheet.KmSplitRow> list;
        Object rememberedValue;
        final MutableState mutableState6;
        RaceTrendCalculator.Snapshot snapshot;
        Context context;
        float f;
        ?? r1;
        final MutableState mutableState7;
        final MutableState mutableState8;
        Composer startRestartGroup = composer.startRestartGroup(-204751801);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-204751801, i3, -1, "com.example.rungps.ui.coach.TrainingCoachScreen (TrainingCoachScreen.kt:72)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context2 = (Context) consume;
            startRestartGroup.startReplaceGroup(-59644895);
            boolean changed = startRestartGroup.changed(context2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = Repository.INSTANCE.get(context2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Repository repository = (Repository) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            ZoneId systemDefault = ZoneId.systemDefault();
            State collectAsState = SnapshotStateKt.collectAsState(repository.trainingPlanProgressFlow(), null, null, startRestartGroup, 48, 2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue3 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue3).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Object[] objArr2 = new Object[0];
            startRestartGroup.startReplaceGroup(-59637294);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState TrainingCoachScreen$lambda$3$lambda$2;
                        TrainingCoachScreen$lambda$3$lambda$2 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$3$lambda$2();
                        return TrainingCoachScreen$lambda$3$lambda$2;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState9 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
            startRestartGroup.startReplaceGroup(-59636006);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState10 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            Object[] objArr3 = new Object[0];
            startRestartGroup.startReplaceGroup(-59632930);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState TrainingCoachScreen$lambda$10$lambda$9;
                        TrainingCoachScreen$lambda$10$lambda$9 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$10$lambda$9();
                        return TrainingCoachScreen$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState11 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue6, startRestartGroup, 3072, 6);
            startRestartGroup.startReplaceGroup(-59630013);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState12 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-59626850);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState13 = (MutableState) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-59625188);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState14 = (MutableState) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-59622378);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            MutableState mutableState15 = (MutableState) rememberedValue10;
            startRestartGroup.endReplaceGroup();
            MutableState mutableState16 = mutableState13;
            State collectAsState2 = SnapshotStateKt.collectAsState(repository.runsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState3 = SnapshotStateKt.collectAsState(repository.gymSessionsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState4 = SnapshotStateKt.collectAsState(repository.recoveryRecentFlow(60), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState5 = SnapshotStateKt.collectAsState(repository.sleepRecentFlow(14), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(-59609278);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            MutableState mutableState17 = (MutableState) rememberedValue11;
            startRestartGroup.endReplaceGroup();
            Object[] objArr4 = {TrainingCoachScreen$lambda$25(collectAsState2), TrainingCoachScreen$lambda$26(collectAsState3), TrainingCoachScreen$lambda$27(collectAsState4), TrainingCoachScreen$lambda$28(collectAsState5)};
            startRestartGroup.startReplaceGroup(-59604871);
            boolean changedInstance = startRestartGroup.changedInstance(context2) | startRestartGroup.changed(collectAsState2) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changed(collectAsState4) | startRestartGroup.changed(collectAsState5);
            TrainingCoachScreenKt$TrainingCoachScreen$1$1 rememberedValue12 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                objArr = objArr4;
                mutableState = mutableState12;
                rememberedValue12 = new TrainingCoachScreenKt$TrainingCoachScreen$1$1(context2, collectAsState2, collectAsState3, collectAsState4, collectAsState5, mutableState17, null);
                startRestartGroup.updateRememberedValue(rememberedValue12);
            } else {
                objArr = objArr4;
                mutableState = mutableState12;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 0);
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(-59598973);
            boolean changedInstance2 = startRestartGroup.changedInstance(repository);
            TrainingCoachScreenKt$TrainingCoachScreen$2$1 rememberedValue13 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState15;
                mutableState3 = mutableState14;
                obj = null;
                rememberedValue13 = new TrainingCoachScreenKt$TrainingCoachScreen$2$1(repository, mutableState3, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue13);
            } else {
                mutableState2 = mutableState15;
                mutableState3 = mutableState14;
                obj = null;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue13, startRestartGroup, 6);
            Modifier m688paddingqDBjuR0$default = PaddingKt.m688paddingqDBjuR0$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, obj), 0.0f, 1, obj), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 0.0f, 0.0f, Dp.m6303constructorimpl(24), 7, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(14));
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
            final DailyTrainingCoach.DailyCoachBrief TrainingCoachScreen$lambda$30 = TrainingCoachScreen$lambda$30(mutableState17);
            startRestartGroup.startReplaceGroup(836802647);
            if (TrainingCoachScreen$lambda$30 == null) {
                mutableState5 = mutableState2;
                mutableState4 = mutableState3;
                i4 = 1;
            } else {
                mutableState4 = mutableState3;
                i4 = 1;
                mutableState5 = mutableState2;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(690384899, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$3$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i6 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(690384899, i6, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous>.<anonymous>.<anonymous> (TrainingCoachScreen.kt:124)");
                        }
                        DailyCoachCardKt.DailyCoachCard(DailyTrainingCoach.DailyCoachBrief.this, PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14)), null, false, composer3, 48, 12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 196614, 30);
                Unit unit2 = Unit.INSTANCE;
                Unit unit3 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            Modifier modifier4 = modifier3;
            MutableState mutableState18 = mutableState4;
            composer2 = startRestartGroup;
            SurfaceKt.m2226SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i4, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(20)), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimaryContainer(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6931getLambda1$app_sideload(), startRestartGroup, 12582918, MenuKt.InTransitionDuration);
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m1512cardElevationaqJV_2Y(Dp.m6303constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-2029339601, true, new TrainingCoachScreenKt$TrainingCoachScreen$3$2(mutableState9, context2, mutableState18, mutableState5, mutableState10), composer2, 54), composer2, 196614, 18);
            RunningGoalCoach.CoachPlan TrainingCoachScreen$lambda$7 = TrainingCoachScreen$lambda$7(mutableState10);
            composer2.startReplaceGroup(836918342);
            if (TrainingCoachScreen$lambda$7 == null) {
                context = context2;
                snapshot = null;
                f = 0.0f;
            } else {
                CoachPlanCard(TrainingCoachScreen$lambda$7, composer2, 0);
                final GoalPromptParser.ParsedGoal parse = GoalPromptParser.INSTANCE.parse(TrainingCoachScreen$lambda$4(mutableState9));
                Long targetTimeMs = parse.getTargetTimeMs();
                if (targetTimeMs == null) {
                    Integer targetPaceSecPerKm = parse.getTargetPaceSecPerKm();
                    if (targetPaceSecPerKm != null) {
                        int intValue = targetPaceSecPerKm.intValue();
                        targetTimeMs = parse.getTargetDistanceKm() != null ? Long.valueOf(MathKt.roundToInt(intValue * r4.doubleValue() * 1000.0d)) : null;
                    } else {
                        l = null;
                        if (parse.getTargetDistanceKm() == null && l != null && l.longValue() > 0) {
                            emptyList = RaceGoalSplitSheet.INSTANCE.build(parse.getTargetDistanceKm().doubleValue(), l.longValue());
                        } else {
                            emptyList = CollectionsKt.emptyList();
                        }
                        list = emptyList;
                        composer2.startReplaceGroup(836936113);
                        if (list.isEmpty()) {
                            final Long l2 = l;
                            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSurfaceVariant(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1875773825, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$3$3$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                    invoke(columnScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope Card, Composer composer3, int i6) {
                                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1875773825, i6, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous>.<anonymous>.<anonymous> (TrainingCoachScreen.kt:215)");
                                    }
                                    Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
                                    Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                                    GoalPromptParser.ParsedGoal parsedGoal = GoalPromptParser.ParsedGoal.this;
                                    Long l3 = l2;
                                    List<RaceGoalSplitSheet.KmSplitRow> list2 = list;
                                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer3, 6);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m684padding3ABfNKs);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                                    Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    TextKt.m2376Text4IGK_g("Race pace sheet", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer3, 196614, 0, 65502);
                                    String distanceLabel = parsedGoal.getDistanceLabel();
                                    if (distanceLabel == null) {
                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                        distanceLabel = String.format("%.1f km", Arrays.copyOf(new Object[]{parsedGoal.getTargetDistanceKm()}, 1));
                                        Intrinsics.checkNotNullExpressionValue(distanceLabel, "format(...)");
                                    }
                                    RaceGoalSplitSheet raceGoalSplitSheet = RaceGoalSplitSheet.INSTANCE;
                                    Intrinsics.checkNotNull(l3);
                                    String str = " · ";
                                    TextKt.m2376Text4IGK_g("Target " + distanceLabel + " · " + raceGoalSplitSheet.formatRaceTime(l3.longValue()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                                    Composer composer4 = composer3;
                                    composer4.startReplaceGroup(-1201082667);
                                    for (RaceGoalSplitSheet.KmSplitRow kmSplitRow : list2) {
                                        String str2 = str;
                                        TextKt.m2376Text4IGK_g(kmSplitRow.getSegmentLabel() + ": " + RaceGoalSplitSheet.INSTANCE.formatPace(kmSplitRow.getPaceSecPerKm()) + str2 + kmSplitRow.getCumulativeDisplay(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyMedium(), composer3, 0, 0, 65534);
                                        composer4 = composer3;
                                        str = str2;
                                    }
                                    composer3.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 196614, 26);
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1181617547);
                        rememberedValue = composer2.rememberedValue();
                        if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                            mutableState6 = mutableState16;
                            rememberedValue = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit TrainingCoachScreen$lambda$42$lambda$39$lambda$38$lambda$37;
                                    TrainingCoachScreen$lambda$42$lambda$39$lambda$38$lambda$37 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$42$lambda$39$lambda$38$lambda$37(MutableState.this);
                                    return TrainingCoachScreen$lambda$42$lambda$39$lambda$38$lambda$37;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue);
                        } else {
                            mutableState6 = mutableState16;
                        }
                        composer2.endReplaceGroup();
                        snapshot = null;
                        context = context2;
                        mutableState16 = mutableState6;
                        f = 0.0f;
                        ButtonKt.Button((Function0) rememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, ButtonDefaults.INSTANCE.m1491buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondary(), 0L, 0L, 0L, composer2, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6938getLambda4$app_sideload(), composer2, 805306422, 492);
                        Unit unit4 = Unit.INSTANCE;
                        Unit unit5 = Unit.INSTANCE;
                    }
                }
                l = targetTimeMs;
                if (parse.getTargetDistanceKm() == null) {
                }
                emptyList = CollectionsKt.emptyList();
                list = emptyList;
                composer2.startReplaceGroup(836936113);
                if (list.isEmpty()) {
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1181617547);
                rememberedValue = composer2.rememberedValue();
                if (rememberedValue != Composer.INSTANCE.getEmpty()) {
                }
                composer2.endReplaceGroup();
                snapshot = null;
                context = context2;
                mutableState16 = mutableState6;
                f = 0.0f;
                ButtonKt.Button((Function0) rememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, ButtonDefaults.INSTANCE.m1491buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondary(), 0L, 0L, 0L, composer2, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6938getLambda4$app_sideload(), composer2, 805306422, 492);
                Unit unit42 = Unit.INSTANCE;
                Unit unit52 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            RaceTrendCalculator.Snapshot TrainingCoachScreen$lambda$20 = TrainingCoachScreen$lambda$20(mutableState18);
            final RaceTrendCalculator.Snapshot snapshot2 = (TrainingCoachScreen$lambda$20 == null || TrainingCoachScreen$lambda$20.getAnchorDistanceKm() <= 0.0d) ? snapshot : TrainingCoachScreen$lambda$20;
            composer2.startReplaceGroup(836993870);
            if (snapshot2 == null) {
                r1 = 1;
            } else {
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, 1, snapshot);
                r1 = 1;
                CardKt.Card(fillMaxWidth$default, null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiaryContainer(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(2093263672, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$3$5$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:27:0x01cd, code lost:
                    
                        if (r1 == null) goto L30;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(ColumnScope Card, Composer composer3, int i6) {
                        String str;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i6 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2093263672, i6, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous>.<anonymous>.<anonymous> (TrainingCoachScreen.kt:250)");
                        }
                        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                        RaceTrendCalculator.Snapshot snapshot3 = RaceTrendCalculator.Snapshot.this;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer3, 6);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m684padding3ABfNKs);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g("Your current fitness", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer3, 196614, 0, 65502);
                        String anchorLabel = snapshot3.getAnchorLabel();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(snapshot3.getAnchorDistanceKm())}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        TextKt.m2376Text4IGK_g("Based on " + anchorLabel + " · " + format + " km", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                        Composer composer4 = composer3;
                        composer4.startReplaceGroup(-1201032524);
                        for (RaceTrendCalculator.Projection projection : CollectionsKt.take(snapshot3.getProjections(), 3)) {
                            Long predictedMillis = projection.getPredictedMillis();
                            String str2 = "—";
                            if (predictedMillis != null) {
                                str = RaceTrendCalculator.INSTANCE.formatRaceTime(predictedMillis.longValue());
                            }
                            str = "—";
                            String label = projection.getLabel();
                            String formattedPacePerKm = projection.getFormattedPacePerKm();
                            if (formattedPacePerKm != null) {
                                str2 = formattedPacePerKm;
                            }
                            TextKt.m2376Text4IGK_g(label + ": " + str + " (" + str2 + ")", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodyMedium(), composer3, 0, 0, 65534);
                            composer4 = composer3;
                        }
                        composer3.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 196614, 26);
                Unit unit6 = Unit.INSTANCE;
                Unit unit7 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, r1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondaryContainer(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1932807194, r1, new TrainingCoachScreenKt$TrainingCoachScreen$3$6(mutableState11, coroutineScope, repository, context, mutableState, collectAsState), composer2, 54), composer2, 196614, 26);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            final BuiltinTrainingPlans.PlanDefinition TrainingCoachScreen$lambda$14 = TrainingCoachScreen$lambda$14(mutableState);
            composer2.startReplaceGroup(-59214241);
            if (TrainingCoachScreen$lambda$14 != null) {
                composer2.startReplaceGroup(-59213069);
                Object rememberedValue14 = composer2.rememberedValue();
                if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    mutableState8 = mutableState;
                    rememberedValue14 = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TrainingCoachScreen$lambda$44$lambda$43;
                            TrainingCoachScreen$lambda$44$lambda$43 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$44$lambda$43(MutableState.this);
                            return TrainingCoachScreen$lambda$44$lambda$43;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue14);
                } else {
                    mutableState8 = mutableState;
                }
                composer2.endReplaceGroup();
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue14, ComposableLambdaKt.rememberComposableLambda(1521028826, r1, new TrainingCoachScreenKt$TrainingCoachScreen$5(TrainingCoachScreen$lambda$14, coroutineScope, repository, systemDefault, context, mutableState8), composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(1091370520, r1, new TrainingCoachScreenKt$TrainingCoachScreen$6(mutableState8), composer2, 54), null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6932getLambda10$app_sideload(), ComposableLambdaKt.rememberComposableLambda(446883061, r1, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(446883061, i6, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous> (TrainingCoachScreen.kt:342)");
                            }
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                            BuiltinTrainingPlans.PlanDefinition planDefinition = BuiltinTrainingPlans.PlanDefinition.this;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer3, 6);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                            Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            TextKt.m2376Text4IGK_g(planDefinition.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                            TextKt.m2376Text4IGK_g(planDefinition.getDescription(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65534);
                            TextKt.m2376Text4IGK_g(planDefinition.getWorkouts().size() + " sessions", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer3, 0, 0, 65534);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1772598, 0, 16276);
            }
            composer2.endReplaceGroup();
            final RunningGoalCoach.CoachPlan TrainingCoachScreen$lambda$72 = TrainingCoachScreen$lambda$7(mutableState10);
            if (TrainingCoachScreen$lambda$17(mutableState16) && TrainingCoachScreen$lambda$72 != null) {
                composer2.startReplaceGroup(-59170952);
                Object rememberedValue15 = composer2.rememberedValue();
                if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    mutableState7 = mutableState16;
                    rememberedValue15 = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TrainingCoachScreen$lambda$46$lambda$45;
                            TrainingCoachScreen$lambda$46$lambda$45 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$46$lambda$45(MutableState.this);
                            return TrainingCoachScreen$lambda$46$lambda$45;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue15);
                } else {
                    mutableState7 = mutableState16;
                }
                composer2.endReplaceGroup();
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue15, ComposableLambdaKt.rememberComposableLambda(2046730193, r1, new TrainingCoachScreenKt$TrainingCoachScreen$9(mutableState9, TrainingCoachScreen$lambda$72, coroutineScope, context, repository, systemDefault, mutableState7), composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(1461958543, r1, new TrainingCoachScreenKt$TrainingCoachScreen$10(mutableState7), composer2, 54), null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6935getLambda13$app_sideload(), ComposableLambdaKt.rememberComposableLambda(584801068, r1, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$11
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(584801068, i6, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous> (TrainingCoachScreen.kt:372)");
                            }
                            TextKt.m2376Text4IGK_g("This turns your coach plan into a follow-along schedule (" + RunningGoalCoach.CoachPlan.this.getTimeframeLabel() + "). You can mark each session done from this tab.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65534);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1772598, 0, 16276);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit TrainingCoachScreen$lambda$47;
                    TrainingCoachScreen$lambda$47 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$47(Modifier.this, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    return TrainingCoachScreen$lambda$47;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TrainingCoachScreen$lambda$3$lambda$2() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TrainingCoachScreen$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final RunningGoalCoach.CoachPlan TrainingCoachScreen$lambda$7(MutableState<RunningGoalCoach.CoachPlan> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState TrainingCoachScreen$lambda$10$lambda$9() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(BuiltinTrainingPlans.INSTANCE.getBeginner5kEightWeeks().getSlug(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TrainingCoachScreen$lambda$11(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final BuiltinTrainingPlans.PlanDefinition TrainingCoachScreen$lambda$14(MutableState<BuiltinTrainingPlans.PlanDefinition> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean TrainingCoachScreen$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TrainingCoachScreen$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final RaceTrendCalculator.Snapshot TrainingCoachScreen$lambda$20(MutableState<RaceTrendCalculator.Snapshot> mutableState) {
        return mutableState.getValue();
    }

    private static final Map<Double, Long> TrainingCoachScreen$lambda$23(MutableState<Map<Double, Long>> mutableState) {
        return mutableState.getValue();
    }

    private static final DailyTrainingCoach.DailyCoachBrief TrainingCoachScreen$lambda$30(MutableState<DailyTrainingCoach.DailyCoachBrief> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TrainingCoachScreen$buildPlan(Context context, MutableState<String> mutableState, MutableState<RaceTrendCalculator.Snapshot> mutableState2, MutableState<Map<Double, Long>> mutableState3, MutableState<RunningGoalCoach.CoachPlan> mutableState4) {
        String obj = StringsKt.trim((CharSequence) TrainingCoachScreen$lambda$4(mutableState)).toString();
        if (obj.length() == 0) {
            Toast.makeText(context, "Describe your running goal first", 0).show();
        } else {
            mutableState4.setValue(RunningGoalCoach.INSTANCE.build(obj, TrainingCoachScreen$lambda$20(mutableState2), TrainingCoachScreen$lambda$23(mutableState3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrainingCoachScreen$lambda$42$lambda$39$lambda$38$lambda$37(MutableState mutableState) {
        TrainingCoachScreen$lambda$18(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrainingCoachScreen$lambda$44$lambda$43(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrainingCoachScreen$lambda$46$lambda$45(MutableState mutableState) {
        TrainingCoachScreen$lambda$18(mutableState, false);
        return Unit.INSTANCE;
    }

    private static final void CoachPlanCard(final RunningGoalCoach.CoachPlan coachPlan, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1306123256);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(coachPlan) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1306123256, i2, -1, "com.example.rungps.ui.coach.CoachPlanCard (TrainingCoachScreen.kt:402)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimaryContainer(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m1512cardElevationaqJV_2Y(Dp.m6303constructorimpl(3), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-694107306, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$CoachPlanCard$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-694107306, i3, -1, "com.example.rungps.ui.coach.CoachPlanCard.<anonymous> (TrainingCoachScreen.kt:408)");
                    }
                    Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                    RunningGoalCoach.CoachPlan coachPlan2 = RunningGoalCoach.CoachPlan.this;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m684padding3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3336constructorimpl = Updater.m3336constructorimpl(composer2);
                    Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2376Text4IGK_g(coachPlan2.getGoalTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleLarge(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                    composer2.startReplaceGroup(-153158897);
                    if (!StringsKt.isBlank(coachPlan2.getParsedSummary())) {
                        TextKt.m2376Text4IGK_g(coachPlan2.getParsedSummary(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                    }
                    composer2.endReplaceGroup();
                    String pbLine = coachPlan2.getPbLine();
                    composer2.startReplaceGroup(-153152624);
                    if (pbLine != null) {
                        TextKt.m2376Text4IGK_g(pbLine, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 0, 65530);
                    }
                    composer2.endReplaceGroup();
                    TextKt.m2376Text4IGK_g(coachPlan2.getHeadline(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyLarge(), composer2, 0, 0, 65530);
                    DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer2, 0, 7);
                    TrainingCoachScreenKt.m6946CoachRowXOJAsU("Timeframe", coachPlan2.getTimeframeLabel(), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary(), composer2, 6);
                    TrainingCoachScreenKt.m6946CoachRowXOJAsU("How often", coachPlan2.getSessionsPerWeek(), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondary(), composer2, 6);
                    TrainingCoachScreenKt.m6946CoachRowXOJAsU("Weekly distance", coachPlan2.getWeeklyDistance(), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), composer2, 6);
                    TrainingCoachScreenKt.m6946CoachRowXOJAsU("Paces", coachPlan2.getPacesBlock(), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), composer2, 6);
                    TrainingCoachScreenKt.m6946CoachRowXOJAsU("Intensity", coachPlan2.getIntensityBlock(), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary(), composer2, 6);
                    TrainingCoachScreenKt.m6946CoachRowXOJAsU("Recovery", coachPlan2.getRecoveryBlock(), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondary(), composer2, 6);
                    TextKt.m2376Text4IGK_g("Sample week", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleSmall(), composer2, 196614, 0, 65502);
                    Composer composer3 = composer2;
                    composer3.startReplaceGroup(-153122003);
                    Iterator<T> it = coachPlan2.getWeeklyOutline().iterator();
                    while (it.hasNext()) {
                        TextKt.m2376Text4IGK_g("• " + ((String) it.next()), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 0, 65534);
                        composer3 = composer2;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-153117888);
                    if (!coachPlan2.getMilestones().isEmpty()) {
                        TextKt.m2376Text4IGK_g("Milestones", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleSmall(), composer2, 196614, 0, 65502);
                        Iterator<T> it2 = coachPlan2.getMilestones().iterator();
                        while (it2.hasNext()) {
                            TextKt.m2376Text4IGK_g("✓ " + ((String) it2.next()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                        }
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 196614, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CoachPlanCard$lambda$48;
                    CoachPlanCard$lambda$48 = TrainingCoachScreenKt.CoachPlanCard$lambda$48(RunningGoalCoach.CoachPlan.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CoachPlanCard$lambda$48;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CoachRow-XO-JAsU, reason: not valid java name */
    public static final void m6946CoachRowXOJAsU(final String str, final String str2, final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(117390367);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(117390367, i2, -1, "com.example.rungps.ui.coach.CoachRow (TrainingCoachScreen.kt:439)");
            }
            composer2 = startRestartGroup;
            SurfaceKt.m2226SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(12)), Color.m3842copywmQWz5c$default(j, 0.12f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(427145786, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$CoachRow$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(427145786, i3, -1, "com.example.rungps.ui.coach.CoachRow.<anonymous> (TrainingCoachScreen.kt:445)");
                        }
                        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(12));
                        String str3 = str;
                        long j2 = j;
                        String str4 = str2;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
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
                        Composer m3336constructorimpl = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g(str3, (Modifier) null, j2, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelLarge(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                        TextKt.m2376Text4IGK_g(str4, PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(4), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 48, 0, 65532);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), composer2, 12582918, MenuKt.InTransitionDuration);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CoachRow_XO_JAsU$lambda$49;
                    CoachRow_XO_JAsU$lambda$49 = TrainingCoachScreenKt.CoachRow_XO_JAsU$lambda$49(str, str2, j, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CoachRow_XO_JAsU$lambda$49;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingPlanProgressEntity TrainingCoachScreen$lambda$1(State<TrainingPlanProgressEntity> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RunEntity> TrainingCoachScreen$lambda$25(State<? extends List<RunEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GymSessionEntity> TrainingCoachScreen$lambda$26(State<? extends List<GymSessionEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RecoveryEventEntity> TrainingCoachScreen$lambda$27(State<? extends List<RecoveryEventEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SleepEntryEntity> TrainingCoachScreen$lambda$28(State<? extends List<SleepEntryEntity>> state) {
        return state.getValue();
    }
}
