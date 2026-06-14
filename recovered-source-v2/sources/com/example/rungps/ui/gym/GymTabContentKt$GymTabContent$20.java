package com.example.rungps.ui.gym;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.example.rungps.analytics.ExerciseHistoryPoint;
import com.example.rungps.analytics.MuscleVolumeHeatmap;
import com.example.rungps.analytics.WeekVolumeBar;
import com.example.rungps.data.AppPreferences;
import com.example.rungps.data.ExerciseNameNormalizer;
import com.example.rungps.data.ExercisePr;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymCarryoverEntity;
import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.GymSplitEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SpotifyTimelineEntity;
import com.example.rungps.gym.GymPreferences;
import com.example.rungps.gym.GymPulleySelection;
import com.example.rungps.gym.GymPulleyStore;
import com.example.rungps.gym.GymSessionMediaRecorder;
import com.example.rungps.gym.GymSetValidation;
import com.example.rungps.media.SessionMediaSnapshot;
import com.example.rungps.notify.RestTimerScheduler;
import com.example.rungps.util.GymWeightFormat;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<List<ExerciseTemplateEntity>> $activeDayExercises$delegate;
    final /* synthetic */ MutableState<Long> $activeSplitId$delegate;
    final /* synthetic */ MutableState<GymSessionEntity> $adjustEndTimeSession$delegate;
    final /* synthetic */ State<List<GymCarryoverEntity>> $carryoverItems$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Map<Long, String>> $dayNameCache$delegate;
    final /* synthetic */ MutableState<List<GymDayTemplateEntity>> $dayOptions$delegate;
    final /* synthetic */ MutableState<String> $exerciseName$delegate;
    final /* synthetic */ MutableState<GymSessionEntity> $finishTimeDialogSession$delegate;
    final /* synthetic */ MutableIntState $gymPage$delegate;
    final /* synthetic */ SharedPreferences $gymTimingPrefs;
    final /* synthetic */ MutableIntState $heatmapDays$delegate;
    final /* synthetic */ MutableState<String> $historyExercise$delegate;
    final /* synthetic */ MutableState<List<ExerciseHistoryPoint>> $historyPoints$delegate;
    final /* synthetic */ MutableState<GymSetEntity> $lastBest$delegate;
    final /* synthetic */ State<GymLoadStats> $load$delegate;
    final /* synthetic */ GymSessionMediaRecorder $mediaRecorder;
    final /* synthetic */ MutableState<String> $muscleEditExercise$delegate;
    final /* synthetic */ MutableState<Map<String, Double>> $muscleKgByGroup$delegate;
    final /* synthetic */ MutableState<Map<String, String>> $muscleLookup$delegate;
    final /* synthetic */ MutableState<GymDayTemplateEntity> $nextSplitDay$delegate;
    final /* synthetic */ int $nfcPulse;
    final /* synthetic */ GymSessionEntity $openGymSession;
    final /* synthetic */ Long $openSessionId;
    final /* synthetic */ MutableState<Set<Long>> $pendingSplitDayIds$delegate;
    final /* synthetic */ MutableState<ExercisePr> $pr$delegate;
    final /* synthetic */ MutableState<List<String>> $previewDayExerciseNames$delegate;
    final /* synthetic */ MutableState<MuscleVolumeHeatmap> $progressHeatmap$delegate;
    final /* synthetic */ MutableState<Map<String, GymPulleySelection>> $pulleyByExerciseKey$delegate;
    final /* synthetic */ State<List<RecoveryEventEntity>> $recoveryEvents$delegate;
    final /* synthetic */ MutableState<Pair<Long, String>> $renameExercise$delegate;
    final /* synthetic */ MutableState<String> $renameText$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<String> $repsText$delegate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Long> $selectedSplitDayId$delegate;
    final /* synthetic */ State<List<GymSessionEntity>> $sessions$delegate;
    final /* synthetic */ MutableState<String> $setupNoteExercise$delegate;
    final /* synthetic */ MutableState<String> $setupNoteText$delegate;
    final /* synthetic */ MutableState<Map<String, String>> $setupNotesByExercise$delegate;
    final /* synthetic */ MutableState<Boolean> $showPulleyChooser$delegate;
    final /* synthetic */ MutableState<Boolean> $showRpeRom$delegate;
    final /* synthetic */ MutableState<Boolean> $showSplitEditor$delegate;
    final /* synthetic */ MutableState<Triple<String, List<GymDayTemplateEntity>, Map<Long, List<ExerciseTemplateEntity>>>> $splitEditorPayload$delegate;
    final /* synthetic */ MutableState<Map<String, Float>> $splitProgrammeRegions$delegate;
    final /* synthetic */ MutableState<String> $splitScheduleHeadline$delegate;
    final /* synthetic */ State<List<GymSplitEntity>> $splits$delegate;
    final /* synthetic */ MutableState<List<ExercisePr>> $topPrs$delegate;
    final /* synthetic */ MutableState<Map<String, Boolean>> $unilateralLookup$delegate;
    final /* synthetic */ MutableState<List<String>> $untaggedExercises$delegate;
    final /* synthetic */ MutableState<List<WeekVolumeBar>> $weekBars$delegate;
    final /* synthetic */ MutableState<String> $weightText$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    GymTabContentKt$GymTabContent$20(MutableState<String> mutableState, Repository repository, CoroutineScope coroutineScope, MutableState<String> mutableState2, Long l, GymSessionEntity gymSessionEntity, GymSessionMediaRecorder gymSessionMediaRecorder, Context context, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableIntState mutableIntState, MutableState<List<ExerciseHistoryPoint>> mutableState6, MutableState<Map<String, String>> mutableState7, MutableState<List<String>> mutableState8, MutableIntState mutableIntState2, MutableState<Map<String, Double>> mutableState9, MutableState<String> mutableState10, MutableState<String> mutableState11, MutableState<Map<String, String>> mutableState12, MutableState<Triple<String, List<GymDayTemplateEntity>, Map<Long, List<ExerciseTemplateEntity>>>> mutableState13, MutableState<Boolean> mutableState14, int i, MutableState<MuscleVolumeHeatmap> mutableState15, MutableState<Map<String, Float>> mutableState16, MutableState<List<WeekVolumeBar>> mutableState17, State<GymLoadStats> state, MutableState<List<ExercisePr>> mutableState18, State<? extends List<GymSplitEntity>> state2, MutableState<Long> mutableState19, MutableState<String> mutableState20, MutableState<List<GymDayTemplateEntity>> mutableState21, MutableState<Long> mutableState22, MutableState<List<String>> mutableState23, MutableState<Set<Long>> mutableState24, MutableState<GymDayTemplateEntity> mutableState25, MutableState<GymSessionEntity> mutableState26, SharedPreferences sharedPreferences, MutableState<GymSessionEntity> mutableState27, State<? extends List<GymSessionEntity>> state3, MutableState<Map<Long, String>> mutableState28, MutableState<Boolean> mutableState29, MutableState<Boolean> mutableState30, State<? extends List<GymCarryoverEntity>> state4, MutableState<List<ExerciseTemplateEntity>> mutableState31, State<? extends List<RecoveryEventEntity>> state5, MutableState<String> mutableState32, MutableState<Map<String, GymPulleySelection>> mutableState33, MutableState<Map<String, Boolean>> mutableState34, MutableState<Pair<Long, String>> mutableState35, MutableState<ExercisePr> mutableState36, MutableState<GymSetEntity> mutableState37) {
        this.$historyExercise$delegate = mutableState;
        this.$repo = repository;
        this.$scope = coroutineScope;
        this.$muscleEditExercise$delegate = mutableState2;
        this.$openSessionId = l;
        this.$openGymSession = gymSessionEntity;
        this.$mediaRecorder = gymSessionMediaRecorder;
        this.$ctx = context;
        this.$exerciseName$delegate = mutableState3;
        this.$weightText$delegate = mutableState4;
        this.$repsText$delegate = mutableState5;
        this.$gymPage$delegate = mutableIntState;
        this.$historyPoints$delegate = mutableState6;
        this.$muscleLookup$delegate = mutableState7;
        this.$untaggedExercises$delegate = mutableState8;
        this.$heatmapDays$delegate = mutableIntState2;
        this.$muscleKgByGroup$delegate = mutableState9;
        this.$setupNoteExercise$delegate = mutableState10;
        this.$setupNoteText$delegate = mutableState11;
        this.$setupNotesByExercise$delegate = mutableState12;
        this.$splitEditorPayload$delegate = mutableState13;
        this.$showSplitEditor$delegate = mutableState14;
        this.$nfcPulse = i;
        this.$progressHeatmap$delegate = mutableState15;
        this.$splitProgrammeRegions$delegate = mutableState16;
        this.$weekBars$delegate = mutableState17;
        this.$load$delegate = state;
        this.$topPrs$delegate = mutableState18;
        this.$splits$delegate = state2;
        this.$activeSplitId$delegate = mutableState19;
        this.$splitScheduleHeadline$delegate = mutableState20;
        this.$dayOptions$delegate = mutableState21;
        this.$selectedSplitDayId$delegate = mutableState22;
        this.$previewDayExerciseNames$delegate = mutableState23;
        this.$pendingSplitDayIds$delegate = mutableState24;
        this.$nextSplitDay$delegate = mutableState25;
        this.$finishTimeDialogSession$delegate = mutableState26;
        this.$gymTimingPrefs = sharedPreferences;
        this.$adjustEndTimeSession$delegate = mutableState27;
        this.$sessions$delegate = state3;
        this.$dayNameCache$delegate = mutableState28;
        this.$showPulleyChooser$delegate = mutableState29;
        this.$showRpeRom$delegate = mutableState30;
        this.$carryoverItems$delegate = state4;
        this.$activeDayExercises$delegate = mutableState31;
        this.$recoveryEvents$delegate = state5;
        this.$renameText$delegate = mutableState32;
        this.$pulleyByExerciseKey$delegate = mutableState33;
        this.$unilateralLookup$delegate = mutableState34;
        this.$renameExercise$delegate = mutableState35;
        this.$pr$delegate = mutableState36;
        this.$lastBest$delegate = mutableState37;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v127 ??, still in use, count: 1, list:
          (r2v127 ?? I:java.lang.Object) from 0x13bc: INVOKE (r15v34 ?? I:androidx.compose.runtime.Composer), (r2v127 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:2045)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v127 ??, still in use, count: 1, list:
          (r2v127 ?? I:java.lang.Object) from 0x13bc: INVOKE (r15v34 ?? I:androidx.compose.runtime.Composer), (r2v127 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:2045)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r183v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$1$lambda$0(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    private static final List<String> invoke$lambda$264$lambda$13$lambda$3(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean invoke$lambda$264$lambda$13$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$264$lambda$13$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$13$lambda$10$lambda$9(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$13$lambda$12$lambda$11(CoroutineScope coroutineScope, Context context, String str, Repository repository, MutableState mutableState, MutableState mutableState2, MutableIntState mutableIntState, MutableState mutableState3, MutableState mutableState4, List muscles, boolean z) {
        Intrinsics.checkNotNullParameter(muscles, "muscles");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$3$3$1$1(muscles, repository, str, z, mutableState, mutableState2, mutableIntState, mutableState3, null), 2, null);
        mutableState4.setValue(null);
        Toast.makeText(context, "Muscles saved for " + str, 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$20$lambda$16$lambda$15(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$20$lambda$19$lambda$18(CoroutineScope coroutineScope, Context context, Repository repository, String str, MutableState mutableState, MutableState mutableState2, String note) {
        Map GymTabContent$lambda$135;
        Intrinsics.checkNotNullParameter(note, "note");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$5$2$1$1(repository, str, note, null), 2, null);
        GymTabContent$lambda$135 = GymTabContentKt.GymTabContent$lambda$135(mutableState);
        Map mutableMap = MapsKt.toMutableMap(GymTabContent$lambda$135);
        mutableState.setValue(mutableMap);
        mutableState2.setValue(null);
        Toast.makeText(context, "Setup note saved", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$25$lambda$22$lambda$21(MutableState mutableState, MutableState mutableState2) {
        GymTabContentKt.GymTabContent$lambda$113(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$25$lambda$24$lambda$23(CoroutineScope coroutineScope, Context context, Repository repository, MutableState mutableState, MutableState mutableState2, List rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$6$2$1$1(rows, repository, null), 2, null);
        GymTabContentKt.GymTabContent$lambda$113(mutableState, false);
        mutableState2.setValue(null);
        Toast.makeText(context, "Programme updated for future sessions", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$27$lambda$26(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$29$lambda$28(MutableState mutableState, MutableState mutableState2, String name, List points) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(points, "points");
        mutableState.setValue(name);
        mutableState2.setValue(points);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$31$lambda$30(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$36$lambda$35$lambda$34$lambda$33(Context context, GymSplitEntity gymSplitEntity, MutableState mutableState) {
        context.getSharedPreferences("settings", 0).edit().putLong("gymActiveSplitId", gymSplitEntity.getId()).apply();
        mutableState.setValue(Long.valueOf(gymSplitEntity.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$40$lambda$39$lambda$38(CoroutineScope coroutineScope, Repository repository, long j, GymSplitEntity gymSplitEntity, MutableState mutableState, MutableState mutableState2) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$12$1$1$1(repository, j, gymSplitEntity, mutableState, mutableState2, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$45$lambda$44$lambda$43$lambda$42(GymDayTemplateEntity gymDayTemplateEntity, MutableState mutableState) {
        mutableState.setValue(Long.valueOf(gymDayTemplateEntity.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$55$lambda$48$lambda$47(GymDayTemplateEntity gymDayTemplateEntity, CoroutineScope coroutineScope, Repository repository) {
        if (gymDayTemplateEntity != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$14$1$1$1(repository, gymDayTemplateEntity, null), 2, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$55$lambda$50$lambda$49(CoroutineScope coroutineScope, Repository repository) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$14$3$1$1(repository, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$55$lambda$52$lambda$51(CoroutineScope coroutineScope, Repository repository) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$14$4$1$1(repository, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$55$lambda$54$lambda$53(GymSessionEntity gymSessionEntity, MutableState mutableState) {
        mutableState.setValue(gymSessionEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$57$lambda$56(GymSessionEntity gymSessionEntity, MutableState mutableState) {
        mutableState.setValue(gymSessionEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$62$lambda$59$lambda$58(CoroutineScope coroutineScope, MutableState mutableState, Repository repository, Context context, GymSessionEntity gymSessionEntity, long j) {
        mutableState.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$16$1$1$1(repository, context, gymSessionEntity, j, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$62$lambda$61$lambda$60(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$67$lambda$64$lambda$63(CoroutineScope coroutineScope, MutableState mutableState, Repository repository, GymSessionEntity gymSessionEntity, Context context, long j) {
        mutableState.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$17$1$1$1(repository, gymSessionEntity, j, context, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$67$lambda$66$lambda$65(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$264$lambda$70(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$264$lambda$71(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$264$lambda$73(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$264$lambda$74(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final List<SpotifyTimelineEntity> invoke$lambda$264$lambda$77(MutableState<List<SpotifyTimelineEntity>> mutableState) {
        return mutableState.getValue();
    }

    private static final SessionMediaSnapshot invoke$lambda$264$lambda$80(MutableState<SessionMediaSnapshot> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$91$lambda$90$lambda$87$lambda$86(Context context, MutableState mutableState) {
        boolean GymTabContent$lambda$69;
        boolean GymTabContent$lambda$692;
        GymTabContent$lambda$69 = GymTabContentKt.GymTabContent$lambda$69(mutableState);
        GymTabContentKt.GymTabContent$lambda$70(mutableState, !GymTabContent$lambda$69);
        GymPreferences gymPreferences = GymPreferences.INSTANCE;
        GymTabContent$lambda$692 = GymTabContentKt.GymTabContent$lambda$69(mutableState);
        gymPreferences.setShowPulleyChooser(context, GymTabContent$lambda$692);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$91$lambda$90$lambda$89$lambda$88(Context context, MutableState mutableState) {
        boolean GymTabContent$lambda$72;
        boolean GymTabContent$lambda$722;
        GymTabContent$lambda$72 = GymTabContentKt.GymTabContent$lambda$72(mutableState);
        GymTabContentKt.GymTabContent$lambda$73(mutableState, !GymTabContent$lambda$72);
        AppPreferences appPreferences = AppPreferences.INSTANCE;
        GymTabContent$lambda$722 = GymTabContentKt.GymTabContent$lambda$72(mutableState);
        appPreferences.setShowRpeRomBlocking(context, GymTabContent$lambda$722);
        return Unit.INSTANCE;
    }

    private static final Map<Long, String> invoke$lambda$264$lambda$94(MutableState<Map<Long, String>> mutableState) {
        return mutableState.getValue();
    }

    private static final Map<String, String> invoke$lambda$264$lambda$98(MutableState<Map<String, String>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean invoke$lambda$264$lambda$110(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$264$lambda$111(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$264$lambda$113(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$264$lambda$114(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState invoke$lambda$264$lambda$131$lambda$130() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long invoke$lambda$264$lambda$132(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$264$lambda$135(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final void invoke$lambda$264$startRest(Context context, MutableState<Long> mutableState, int i) {
        long currentTimeMillis = System.currentTimeMillis() + (i * 1000);
        mutableState.setValue(Long.valueOf(currentTimeMillis));
        RestTimerScheduler.INSTANCE.schedule(context, currentTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$147$lambda$140$lambda$139(Context context, MutableState mutableState) {
        invoke$lambda$264$startRest(context, mutableState, 60);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$147$lambda$142$lambda$141(Context context, MutableState mutableState) {
        invoke$lambda$264$startRest(context, mutableState, 90);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$147$lambda$144$lambda$143(Context context, MutableState mutableState) {
        invoke$lambda$264$startRest(context, mutableState, MenuKt.InTransitionDuration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$147$lambda$146$lambda$145(Context context, MutableState mutableState) {
        mutableState.setValue(null);
        RestTimerScheduler.INSTANCE.cancel(context);
        return Unit.INSTANCE;
    }

    private static final Map<Long, Pair<Integer, Double>> invoke$lambda$264$lambda$192$lambda$155(MutableState<Map<Long, Pair<Integer, Double>>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$192$lambda$191$lambda$162$lambda$161(Long l, String str, MutableState mutableState, MutableState mutableState2) {
        if (l == null) {
            return Unit.INSTANCE;
        }
        mutableState.setValue(TuplesKt.to(Long.valueOf(l.longValue()), str));
        mutableState2.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$192$lambda$191$lambda$164$lambda$163(ExerciseTemplateEntity exerciseTemplateEntity, MutableState mutableState) {
        mutableState.setValue(exerciseTemplateEntity.getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$192$lambda$191$lambda$166$lambda$165(CoroutineScope coroutineScope, ExerciseTemplateEntity exerciseTemplateEntity, Repository repository, MutableState mutableState, MutableState mutableState2) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GymTabContentKt$GymTabContent$20$1$31$2$5$1$1(exerciseTemplateEntity, repository, mutableState, mutableState2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$192$lambda$191$lambda$168$lambda$167(ExerciseTemplateEntity exerciseTemplateEntity, MutableState mutableState) {
        mutableState.setValue(exerciseTemplateEntity.getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$192$lambda$191$lambda$173$lambda$172(ExerciseTemplateEntity exerciseTemplateEntity, Context context, Long l, MutableState mutableState, MutableState mutableState2, GymPulleySelection cfg) {
        Map GymTabContent$lambda$66;
        Long GymTabContent$lambda$29;
        Intrinsics.checkNotNullParameter(cfg, "cfg");
        String canonicalKey = ExerciseNameNormalizer.INSTANCE.canonicalKey(exerciseTemplateEntity.getName());
        GymTabContent$lambda$66 = GymTabContentKt.GymTabContent$lambda$66(mutableState);
        mutableState.setValue(MapsKt.plus(GymTabContent$lambda$66, TuplesKt.to(canonicalKey, cfg)));
        GymPulleyStore gymPulleyStore = GymPulleyStore.INSTANCE;
        long longValue = l.longValue();
        String name = exerciseTemplateEntity.getName();
        GymTabContent$lambda$29 = GymTabContentKt.GymTabContent$lambda$29(mutableState2);
        gymPulleyStore.setForSessionExercise(context, longValue, name, GymTabContent$lambda$29 != null ? GymTabContent$lambda$29.longValue() : 0L, cfg);
        return Unit.INSTANCE;
    }

    private static final ExercisePr invoke$lambda$264$lambda$192$lambda$191$lambda$177(MutableState<ExercisePr> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$192$lambda$191$lambda$190$lambda$182$lambda$181(CoroutineScope coroutineScope, MutableState mutableState, GymSetEntity gymSetEntity, double d, Repository repository, Integer num) {
        Map mutableMap = MapsKt.toMutableMap(invoke$lambda$264$lambda$192$lambda$155(mutableState));
        mutableMap.put(Long.valueOf(gymSetEntity.getId()), TuplesKt.to(num, Double.valueOf(d)));
        mutableState.setValue(mutableMap);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$31$2$11$1$1$2(repository, gymSetEntity, num, d, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$192$lambda$191$lambda$190$lambda$185$lambda$184(GymSetEntity gymSetEntity, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Integer num, Repository repository, double d, String draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        mutableState.setValue(MapsKt.plus(invoke$lambda$264$lambda$94(mutableState), TuplesKt.to(Long.valueOf(gymSetEntity.getId()), draft)));
        Map mutableMap = MapsKt.toMutableMap(invoke$lambda$264$lambda$192$lambda$155(mutableState2));
        mutableMap.put(Long.valueOf(gymSetEntity.getId()), TuplesKt.to(num, Double.valueOf(d)));
        mutableState2.setValue(mutableMap);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$31$2$11$2$1$2(repository, gymSetEntity, num, d, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$192$lambda$191$lambda$190$lambda$187$lambda$186(CoroutineScope coroutineScope, Repository repository, GymSetEntity gymSetEntity, Integer num) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$31$2$11$3$1$1(repository, gymSetEntity, num, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$192$lambda$191$lambda$190$lambda$189$lambda$188(CoroutineScope coroutineScope, Repository repository, GymSetEntity gymSetEntity, String str) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$31$2$11$4$1$1(repository, gymSetEntity, str, null), 2, null);
        return Unit.INSTANCE;
    }

    private static final Map<Long, Pair<Integer, Double>> invoke$lambda$264$lambda$237$lambda$201(MutableState<Map<Long, Pair<Integer, Double>>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$237$lambda$236$lambda$207$lambda$206(Long l, String str, MutableState mutableState, MutableState mutableState2) {
        if (l == null) {
            return Unit.INSTANCE;
        }
        mutableState.setValue(TuplesKt.to(Long.valueOf(l.longValue()), str));
        mutableState2.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$237$lambda$236$lambda$209$lambda$208(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$237$lambda$236$lambda$211$lambda$210(CoroutineScope coroutineScope, String str, Repository repository, MutableState mutableState, MutableState mutableState2) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GymTabContentKt$GymTabContent$20$1$32$2$4$1$1(str, repository, mutableState, mutableState2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$237$lambda$236$lambda$213$lambda$212(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$237$lambda$236$lambda$218$lambda$217(String str, Context context, Long l, MutableState mutableState, MutableState mutableState2, GymPulleySelection cfg) {
        Map GymTabContent$lambda$66;
        Long GymTabContent$lambda$29;
        Intrinsics.checkNotNullParameter(cfg, "cfg");
        String canonicalKey = ExerciseNameNormalizer.INSTANCE.canonicalKey(str);
        GymTabContent$lambda$66 = GymTabContentKt.GymTabContent$lambda$66(mutableState);
        mutableState.setValue(MapsKt.plus(GymTabContent$lambda$66, TuplesKt.to(canonicalKey, cfg)));
        GymPulleyStore gymPulleyStore = GymPulleyStore.INSTANCE;
        long longValue = l.longValue();
        GymTabContent$lambda$29 = GymTabContentKt.GymTabContent$lambda$29(mutableState2);
        gymPulleyStore.setForSessionExercise(context, longValue, str, GymTabContent$lambda$29 != null ? GymTabContent$lambda$29.longValue() : 0L, cfg);
        return Unit.INSTANCE;
    }

    private static final ExercisePr invoke$lambda$264$lambda$237$lambda$236$lambda$222(MutableState<ExercisePr> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$237$lambda$236$lambda$235$lambda$227$lambda$226(CoroutineScope coroutineScope, MutableState mutableState, GymSetEntity gymSetEntity, double d, Repository repository, Integer num) {
        Map mutableMap = MapsKt.toMutableMap(invoke$lambda$264$lambda$237$lambda$201(mutableState));
        mutableMap.put(Long.valueOf(gymSetEntity.getId()), TuplesKt.to(num, Double.valueOf(d)));
        mutableState.setValue(mutableMap);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$32$2$10$1$1$2(repository, gymSetEntity, num, d, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$237$lambda$236$lambda$235$lambda$230$lambda$229(GymSetEntity gymSetEntity, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Integer num, Repository repository, double d, String draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        mutableState.setValue(MapsKt.plus(invoke$lambda$264$lambda$94(mutableState), TuplesKt.to(Long.valueOf(gymSetEntity.getId()), draft)));
        Map mutableMap = MapsKt.toMutableMap(invoke$lambda$264$lambda$237$lambda$201(mutableState2));
        mutableMap.put(Long.valueOf(gymSetEntity.getId()), TuplesKt.to(num, Double.valueOf(d)));
        mutableState2.setValue(mutableMap);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$32$2$10$2$1$2(repository, gymSetEntity, num, d, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$237$lambda$236$lambda$235$lambda$232$lambda$231(CoroutineScope coroutineScope, Repository repository, GymSetEntity gymSetEntity, Integer num) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$32$2$10$3$1$1(repository, gymSetEntity, num, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$237$lambda$236$lambda$235$lambda$234$lambda$233(CoroutineScope coroutineScope, Repository repository, GymSetEntity gymSetEntity, String str) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$32$2$10$4$1$1(repository, gymSetEntity, str, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$244$lambda$243(MutableState mutableState) {
        invoke$lambda$264$lambda$111(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$247$lambda$246$lambda$245(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$249$lambda$248(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(StringsKt.take(it, 40));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$256$lambda$255$lambda$254(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(GymWeightFormat.INSTANCE.sanitizeInput(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$259$lambda$258(Long l, Context context, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Repository repository, MutableState mutableState4, MutableState mutableState5) {
        String GymTabContent$lambda$6;
        String GymTabContent$lambda$14;
        String GymTabContent$lambda$10;
        if (l != null) {
            long longValue = l.longValue();
            GymTabContent$lambda$6 = GymTabContentKt.GymTabContent$lambda$6(mutableState);
            String obj = StringsKt.trim((CharSequence) GymTabContent$lambda$6).toString();
            GymWeightFormat gymWeightFormat = GymWeightFormat.INSTANCE;
            GymTabContent$lambda$14 = GymTabContentKt.GymTabContent$lambda$14(mutableState2);
            Double parse = gymWeightFormat.parse(GymTabContent$lambda$14);
            double doubleValue = parse != null ? parse.doubleValue() : 0.0d;
            if (obj.length() != 0) {
                GymTabContent$lambda$10 = GymTabContentKt.GymTabContent$lambda$10(mutableState3);
                Integer intOrNull = StringsKt.toIntOrNull(GymTabContent$lambda$10);
                String validateSet = GymSetValidation.INSTANCE.validateSet(doubleValue, intOrNull);
                if (validateSet == null) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$40$1$2(repository, longValue, obj, intOrNull, doubleValue, mutableState4, mutableState5, null), 2, null);
                    mutableState3.setValue("");
                    return Unit.INSTANCE;
                }
                Toast.makeText(context, validateSet, 0).show();
                return Unit.INSTANCE;
            }
            Toast.makeText(context, "Enter an exercise name", 0).show();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$263$lambda$262$lambda$261(CoroutineScope coroutineScope, Repository repository, GymDayTemplateEntity gymDayTemplateEntity) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$41$1$1$1(repository, gymDayTemplateEntity, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GymSetEntity> invoke$lambda$264$lambda$92(State<? extends List<GymSetEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$264$lambda$256$lambda$253$lambda$252(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(StringsKt.take(sb2, 3));
        return Unit.INSTANCE;
    }
}
