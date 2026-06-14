package com.example.rungps.ui.week;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import com.example.rungps.analytics.TrainingWeekPlanner;
import com.example.rungps.data.ArchivedTrainingWeekEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.training.DailyTrainingCoach;
import com.example.rungps.training.TrainingWeekSnapshot;
import com.example.rungps.training.TrainingWeekSnapshotCodec;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TrainingWeekScreen.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001aG\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001am\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u001b\u001a\u0015\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f¨\u0006 ²\u0006\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0014X\u008a\u0084\u0002²\u0006\u0010\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0014X\u008a\u0084\u0002²\u0006\u0010\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0014X\u008a\u0084\u0002²\u0006\u0010\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0014X\u008a\u0084\u0002²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u008e\u0002²\u0006\f\u0010+\u001a\u0004\u0018\u00010\u0015X\u008a\u008e\u0002²\u0006\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\f\u0010\b\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\u000bX\u008a\u008e\u0002"}, d2 = {"TrainingWeekScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CurrentWeekBody", "weekView", "Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;", "coachBrief", "Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;", "loading", "", "sharing", "fmt", "Ljava/time/format/DateTimeFormatter;", "onShare", "Lkotlin/Function0;", "(Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;ZZLjava/time/format/DateTimeFormatter;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ArchiveWeekBody", "archives", "", "Lcom/example/rungps/data/ArchivedTrainingWeekEntity;", "selected", "onSelect", "Lkotlin/Function1;", "snapshot", "Lcom/example/rungps/training/TrainingWeekSnapshot;", "(Ljava/util/List;Lcom/example/rungps/data/ArchivedTrainingWeekEntity;Lkotlin/jvm/functions/Function1;Lcom/example/rungps/training/TrainingWeekSnapshot;Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;Ljava/time/format/DateTimeFormatter;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "WeekDayRow", "day", "Lcom/example/rungps/analytics/TrainingWeekPlanner$WeekDay;", "(Lcom/example/rungps/analytics/TrainingWeekPlanner$WeekDay;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "runs", "Lcom/example/rungps/data/RunEntity;", "gymSessions", "Lcom/example/rungps/data/GymSessionEntity;", "recoveryEvents", "Lcom/example/rungps/data/RecoveryEventEntity;", "sleepDb", "Lcom/example/rungps/data/SleepEntryEntity;", "browseMode", "Lcom/example/rungps/ui/week/WeekBrowseMode;", "selectedArchive", "archiving"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainingWeekScreenKt {

    /* compiled from: TrainingWeekScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WeekBrowseMode.values().length];
            try {
                iArr[WeekBrowseMode.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WeekBrowseMode.ARCHIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TrainingWeekPlanner.EventKind.values().length];
            try {
                iArr2[TrainingWeekPlanner.EventKind.RUN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TrainingWeekPlanner.EventKind.GYM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TrainingWeekPlanner.EventKind.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TrainingWeekPlanner.EventKind.REST_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArchiveWeekBody$lambda$50(List list, ArchivedTrainingWeekEntity archivedTrainingWeekEntity, Function1 function1, TrainingWeekSnapshot trainingWeekSnapshot, TrainingWeekPlanner.TrainingWeekView trainingWeekView, DateTimeFormatter dateTimeFormatter, boolean z, Function0 function0, int i, Composer composer, int i2) {
        ArchiveWeekBody(list, archivedTrainingWeekEntity, function1, trainingWeekSnapshot, trainingWeekView, dateTimeFormatter, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArchiveWeekBody$lambda$60(List list, ArchivedTrainingWeekEntity archivedTrainingWeekEntity, Function1 function1, TrainingWeekSnapshot trainingWeekSnapshot, TrainingWeekPlanner.TrainingWeekView trainingWeekView, DateTimeFormatter dateTimeFormatter, boolean z, Function0 function0, int i, Composer composer, int i2) {
        ArchiveWeekBody(list, archivedTrainingWeekEntity, function1, trainingWeekSnapshot, trainingWeekView, dateTimeFormatter, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrentWeekBody$lambda$49(TrainingWeekPlanner.TrainingWeekView trainingWeekView, DailyTrainingCoach.DailyCoachBrief dailyCoachBrief, boolean z, boolean z2, DateTimeFormatter dateTimeFormatter, Function0 function0, int i, Composer composer, int i2) {
        CurrentWeekBody(trainingWeekView, dailyCoachBrief, z, z2, dateTimeFormatter, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrainingWeekScreen$lambda$43(Modifier modifier, int i, int i2, Composer composer, int i3) {
        TrainingWeekScreen(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WeekDayRow$lambda$68(TrainingWeekPlanner.WeekDay weekDay, int i, Composer composer, int i2) {
        WeekDayRow(weekDay, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TrainingWeekScreen(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final MutableState mutableState;
        final MutableState mutableState2;
        final MutableState mutableState3;
        Composer composer2;
        Composer composer3;
        Composer startRestartGroup = composer.startRestartGroup(-1435430447);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1435430447, i3, -1, "com.example.rungps.ui.week.TrainingWeekScreen (TrainingWeekScreen.kt:115)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            startRestartGroup.startReplaceGroup(996929437);
            boolean changed = startRestartGroup.changed(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = Repository.INSTANCE.get(context);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Repository repository = (Repository) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ZoneId systemDefault = ZoneId.systemDefault();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            State collectAsState = SnapshotStateKt.collectAsState(repository.runsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState2 = SnapshotStateKt.collectAsState(repository.gymSessionsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState3 = SnapshotStateKt.collectAsState(repository.recoveryRecentFlow(60), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            State collectAsState4 = SnapshotStateKt.collectAsState(repository.sleepRecentFlow(14), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            final State collectAsState5 = SnapshotStateKt.collectAsState(repository.archivedTrainingWeeksFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(996947691);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(WeekBrowseMode.CURRENT, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState4 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(996950262);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState5 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(996953024);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState6 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(996956094);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            final MutableState mutableState7 = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(996958969);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState8 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(996960762);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState9 = (MutableState) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(996962522);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            final MutableState mutableState10 = (MutableState) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(996968092);
            boolean changedInstance = startRestartGroup.changedInstance(repository);
            TrainingWeekScreenKt$TrainingWeekScreen$1$1 rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new TrainingWeekScreenKt$TrainingWeekScreen$1$1(mutableState9, repository, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(repository, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue10, startRestartGroup, 0);
            Object[] objArr = {TrainingWeekScreen$lambda$1(collectAsState), TrainingWeekScreen$lambda$2(collectAsState2), TrainingWeekScreen$lambda$3(collectAsState3), TrainingWeekScreen$lambda$4(collectAsState4), TrainingWeekScreen$lambda$7(mutableState4)};
            startRestartGroup.startReplaceGroup(996975062);
            boolean changedInstance2 = startRestartGroup.changedInstance(context) | startRestartGroup.changed(collectAsState) | startRestartGroup.changed(collectAsState2) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changed(collectAsState4) | startRestartGroup.changedInstance(systemDefault);
            TrainingWeekScreenKt$TrainingWeekScreen$2$1 rememberedValue11 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new TrainingWeekScreenKt$TrainingWeekScreen$2$1(mutableState4, mutableState8, context, systemDefault, collectAsState, collectAsState2, collectAsState3, collectAsState4, mutableState6, mutableState7, null);
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue11, startRestartGroup, 0);
            DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.getDefault());
            ArchivedTrainingWeekEntity TrainingWeekScreen$lambda$10 = TrainingWeekScreen$lambda$10(mutableState5);
            TrainingWeekSnapshot decodeEntity = TrainingWeekScreen$lambda$10 != null ? TrainingWeekSnapshotCodec.INSTANCE.decodeEntity(TrainingWeekScreen$lambda$10) : null;
            TrainingWeekPlanner.TrainingWeekView weekView = decodeEntity != null ? TrainingWeekSnapshotCodec.INSTANCE.toWeekView(decodeEntity) : null;
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            TrainingWeekSnapshot trainingWeekSnapshot = decodeEntity;
            Modifier modifier4 = modifier3;
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
            final TrainingWeekPlanner.TrainingWeekView trainingWeekView = weekView;
            TextKt.m2376Text4IGK_g("Training week", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineSmall(), startRestartGroup, 196614, 0, 65502);
            TextKt.m2376Text4IGK_g("Past weeks archive automatically each Monday (up to 52 weeks).", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 6, 0, 65530);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean z = TrainingWeekScreen$lambda$7(mutableState4) == WeekBrowseMode.CURRENT;
            startRestartGroup.startReplaceGroup(1342979439);
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState4;
                mutableState2 = mutableState5;
                rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TrainingWeekScreen$lambda$42$lambda$35$lambda$32$lambda$31;
                        TrainingWeekScreen$lambda$42$lambda$35$lambda$32$lambda$31 = TrainingWeekScreenKt.TrainingWeekScreen$lambda$42$lambda$35$lambda$32$lambda$31(MutableState.this, mutableState2);
                        return TrainingWeekScreen$lambda$42$lambda$35$lambda$32$lambda$31;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            } else {
                mutableState = mutableState4;
                mutableState2 = mutableState5;
            }
            startRestartGroup.endReplaceGroup();
            final MutableState mutableState11 = mutableState2;
            MutableState mutableState12 = mutableState;
            ChipKt.FilterChip(z, (Function0) rememberedValue12, ComposableSingletons$TrainingWeekScreenKt.INSTANCE.m7664getLambda1$app_sideload(), null, false, null, null, null, null, null, null, null, startRestartGroup, 432, 0, 4088);
            boolean z2 = TrainingWeekScreen$lambda$7(mutableState12) == WeekBrowseMode.ARCHIVE;
            startRestartGroup.startReplaceGroup(1342989085);
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                mutableState3 = mutableState12;
                rememberedValue13 = new Function0() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TrainingWeekScreen$lambda$42$lambda$35$lambda$34$lambda$33;
                        TrainingWeekScreen$lambda$42$lambda$35$lambda$34$lambda$33 = TrainingWeekScreenKt.TrainingWeekScreen$lambda$42$lambda$35$lambda$34$lambda$33(MutableState.this);
                        return TrainingWeekScreen$lambda$42$lambda$35$lambda$34$lambda$33;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
            } else {
                mutableState3 = mutableState12;
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState13 = mutableState3;
            ChipKt.FilterChip(z2, (Function0) rememberedValue13, ComposableLambdaKt.rememberComposableLambda(-787460019, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$TrainingWeekScreen$3$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i5) {
                    List TrainingWeekScreen$lambda$5;
                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-787460019, i5, -1, "com.example.rungps.ui.week.TrainingWeekScreen.<anonymous>.<anonymous>.<anonymous> (TrainingWeekScreen.kt:244)");
                    }
                    TrainingWeekScreen$lambda$5 = TrainingWeekScreenKt.TrainingWeekScreen$lambda$5(collectAsState5);
                    TextKt.m2376Text4IGK_g("History (" + TrainingWeekScreen$lambda$5.size() + ")", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, false, null, null, null, null, null, null, null, startRestartGroup, 432, 0, 4088);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-878379462);
            if (TrainingWeekScreen$lambda$22(mutableState9)) {
                composer2 = startRestartGroup;
                TextKt.m2376Text4IGK_g("Updating week archives…", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer2, 6, 0, 65530);
            } else {
                composer2 = startRestartGroup;
            }
            composer2.endReplaceGroup();
            int i5 = WhenMappings.$EnumSwitchMapping$0[TrainingWeekScreen$lambda$7(mutableState13).ordinal()];
            if (i5 == 1) {
                composer3 = composer2;
                composer3.startReplaceGroup(-878368893);
                TrainingWeekPlanner.TrainingWeekView TrainingWeekScreen$lambda$13 = TrainingWeekScreen$lambda$13(mutableState6);
                DailyTrainingCoach.DailyCoachBrief TrainingWeekScreen$lambda$16 = TrainingWeekScreen$lambda$16(mutableState7);
                boolean TrainingWeekScreen$lambda$19 = TrainingWeekScreen$lambda$19(mutableState8);
                boolean TrainingWeekScreen$lambda$25 = TrainingWeekScreen$lambda$25(mutableState10);
                Intrinsics.checkNotNull(ofPattern);
                composer3.startReplaceGroup(-878361965);
                boolean changedInstance3 = composer3.changedInstance(coroutineScope) | composer3.changedInstance(context);
                Object rememberedValue14 = composer3.rememberedValue();
                if (changedInstance3 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    Function0 function0 = new Function0() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TrainingWeekScreen$lambda$42$lambda$37$lambda$36;
                            TrainingWeekScreen$lambda$42$lambda$37$lambda$36 = TrainingWeekScreenKt.TrainingWeekScreen$lambda$42$lambda$37$lambda$36(CoroutineScope.this, mutableState6, mutableState10, context, mutableState7);
                            return TrainingWeekScreen$lambda$42$lambda$37$lambda$36;
                        }
                    };
                    composer3.updateRememberedValue(function0);
                    rememberedValue14 = function0;
                }
                composer3.endReplaceGroup();
                CurrentWeekBody(TrainingWeekScreen$lambda$13, TrainingWeekScreen$lambda$16, TrainingWeekScreen$lambda$19, TrainingWeekScreen$lambda$25, ofPattern, (Function0) rememberedValue14, composer3, 0);
                composer3.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else {
                if (i5 != 2) {
                    Composer composer4 = composer2;
                    composer4.startReplaceGroup(-878369299);
                    composer4.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer3 = composer2;
                composer3.startReplaceGroup(-878327181);
                List<ArchivedTrainingWeekEntity> TrainingWeekScreen$lambda$5 = TrainingWeekScreen$lambda$5(collectAsState5);
                ArchivedTrainingWeekEntity TrainingWeekScreen$lambda$102 = TrainingWeekScreen$lambda$10(mutableState11);
                composer3.startReplaceGroup(-878324433);
                Object rememberedValue15 = composer3.rememberedValue();
                if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = new Function1() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit TrainingWeekScreen$lambda$42$lambda$39$lambda$38;
                            TrainingWeekScreen$lambda$42$lambda$39$lambda$38 = TrainingWeekScreenKt.TrainingWeekScreen$lambda$42$lambda$39$lambda$38(MutableState.this, (ArchivedTrainingWeekEntity) obj);
                            return TrainingWeekScreen$lambda$42$lambda$39$lambda$38;
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue15);
                }
                Function1 function1 = (Function1) rememberedValue15;
                composer3.endReplaceGroup();
                Intrinsics.checkNotNull(ofPattern);
                boolean TrainingWeekScreen$lambda$252 = TrainingWeekScreen$lambda$25(mutableState10);
                composer3.startReplaceGroup(-878316812);
                boolean changedInstance4 = composer3.changedInstance(trainingWeekView) | composer3.changedInstance(coroutineScope) | composer3.changedInstance(context);
                Object rememberedValue16 = composer3.rememberedValue();
                if (changedInstance4 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = new Function0() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit TrainingWeekScreen$lambda$42$lambda$41$lambda$40;
                            TrainingWeekScreen$lambda$42$lambda$41$lambda$40 = TrainingWeekScreenKt.TrainingWeekScreen$lambda$42$lambda$41$lambda$40(TrainingWeekPlanner.TrainingWeekView.this, coroutineScope, mutableState10, context);
                            return TrainingWeekScreen$lambda$42$lambda$41$lambda$40;
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue16);
                }
                composer3.endReplaceGroup();
                ArchiveWeekBody(TrainingWeekScreen$lambda$5, TrainingWeekScreen$lambda$102, function1, trainingWeekSnapshot, trainingWeekView, ofPattern, TrainingWeekScreen$lambda$252, (Function0) rememberedValue16, composer3, 384);
                composer3.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TrainingWeekScreen$lambda$43;
                    TrainingWeekScreen$lambda$43 = TrainingWeekScreenKt.TrainingWeekScreen$lambda$43(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TrainingWeekScreen$lambda$43;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WeekBrowseMode TrainingWeekScreen$lambda$7(MutableState<WeekBrowseMode> mutableState) {
        return mutableState.getValue();
    }

    private static final ArchivedTrainingWeekEntity TrainingWeekScreen$lambda$10(MutableState<ArchivedTrainingWeekEntity> mutableState) {
        return mutableState.getValue();
    }

    private static final TrainingWeekPlanner.TrainingWeekView TrainingWeekScreen$lambda$13(MutableState<TrainingWeekPlanner.TrainingWeekView> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DailyTrainingCoach.DailyCoachBrief TrainingWeekScreen$lambda$16(MutableState<DailyTrainingCoach.DailyCoachBrief> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean TrainingWeekScreen$lambda$19(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TrainingWeekScreen$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean TrainingWeekScreen$lambda$22(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TrainingWeekScreen$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean TrainingWeekScreen$lambda$25(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TrainingWeekScreen$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrainingWeekScreen$lambda$42$lambda$35$lambda$32$lambda$31(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(WeekBrowseMode.CURRENT);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrainingWeekScreen$lambda$42$lambda$35$lambda$34$lambda$33(MutableState mutableState) {
        mutableState.setValue(WeekBrowseMode.ARCHIVE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrainingWeekScreen$lambda$42$lambda$37$lambda$36(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Context context, MutableState mutableState3) {
        TrainingWeekPlanner.TrainingWeekView TrainingWeekScreen$lambda$13 = TrainingWeekScreen$lambda$13(mutableState);
        if (TrainingWeekScreen$lambda$13 == null) {
            return Unit.INSTANCE;
        }
        TrainingWeekScreen$lambda$26(mutableState2, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TrainingWeekScreenKt$TrainingWeekScreen$3$2$1$1(context, TrainingWeekScreen$lambda$13, mutableState3, mutableState2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrainingWeekScreen$lambda$42$lambda$39$lambda$38(MutableState mutableState, ArchivedTrainingWeekEntity archivedTrainingWeekEntity) {
        mutableState.setValue(archivedTrainingWeekEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TrainingWeekScreen$lambda$42$lambda$41$lambda$40(TrainingWeekPlanner.TrainingWeekView trainingWeekView, CoroutineScope coroutineScope, MutableState mutableState, Context context) {
        if (trainingWeekView == null) {
            return Unit.INSTANCE;
        }
        TrainingWeekScreen$lambda$26(mutableState, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TrainingWeekScreenKt$TrainingWeekScreen$3$4$1$1(context, trainingWeekView, mutableState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void CurrentWeekBody(final TrainingWeekPlanner.TrainingWeekView trainingWeekView, final DailyTrainingCoach.DailyCoachBrief dailyCoachBrief, final boolean z, final boolean z2, final DateTimeFormatter dateTimeFormatter, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        String str4;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-695024934);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(trainingWeekView) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(dailyCoachBrief) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(dateTimeFormatter) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        int i5 = i2;
        if ((74899 & i5) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-695024934, i5, -1, "com.example.rungps.ui.week.CurrentWeekBody (TrainingWeekScreen.kt:406)");
            }
            startRestartGroup.startReplaceGroup(-1764153842);
            if (trainingWeekView == null) {
                i3 = i5;
            } else {
                i3 = i5;
                TextKt.m2376Text4IGK_g(trainingWeekView.getWeekStart().format(dateTimeFormatter) + " – " + trainingWeekView.getWeekEnd().format(dateTimeFormatter), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 0, 0, 65530);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "%.1f km run · %.0f kg gym · %d sleep nights", Arrays.copyOf(new Object[]{Double.valueOf(trainingWeekView.getTotalRunKm()), Double.valueOf(trainingWeekView.getTotalGymKg()), Integer.valueOf(trainingWeekView.getSleepNights())}, 3));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                TextKt.m2376Text4IGK_g(format, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, 0, 0, 65530);
                Unit unit = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1764134277);
            if (dailyCoachBrief != null) {
                SurfaceKt.m2226SurfaceT9BRK9s(null, MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getLarge(), 0L, 0L, Dp.m6303constructorimpl(2), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1995145088, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$CurrentWeekBody$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1995145088, i6, -1, "com.example.rungps.ui.week.CurrentWeekBody.<anonymous>.<anonymous> (TrainingWeekScreen.kt:450)");
                        }
                        DailyCoachCardKt.DailyCoachCard(DailyTrainingCoach.DailyCoachBrief.this, PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14)), null, false, composer2, 48, 12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 12607488, 109);
                Unit unit2 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1764128594);
            if (!z) {
                str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str4 = "C101@5126L9:Row.kt#2w3rfo";
            } else {
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
                str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str4 = "C101@5126L9:Row.kt#2w3rfo";
                ProgressIndicatorKt.m2050CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, startRestartGroup, 0, 31);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            startRestartGroup.endReplaceGroup();
            List<TrainingWeekPlanner.WeekDay> days = trainingWeekView != null ? trainingWeekView.getDays() : null;
            startRestartGroup.startReplaceGroup(-1764122882);
            if (days == null) {
                i4 = 0;
            } else {
                Iterator<T> it = days.iterator();
                while (it.hasNext()) {
                    WeekDayRow((TrainingWeekPlanner.WeekDay) it.next(), startRestartGroup, 0);
                    DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, 0L, startRestartGroup, 0, 7);
                }
                i4 = 0;
                Unit unit3 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, str);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str2);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i4);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, str4);
            ButtonKt.OutlinedButton(function0, RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), (trainingWeekView == null || z2) ? i4 : 1, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-179739984, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$CurrentWeekBody$5$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope OutlinedButton, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i6 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-179739984, i6, -1, "com.example.rungps.ui.week.CurrentWeekBody.<anonymous>.<anonymous> (TrainingWeekScreen.kt:492)");
                    }
                    TextKt.m2376Text4IGK_g(z2 ? "…" : "Save week to Photos", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ((i3 >> 15) & 14) | 805306368, 504);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CurrentWeekBody$lambda$49;
                    CurrentWeekBody$lambda$49 = TrainingWeekScreenKt.CurrentWeekBody$lambda$49(TrainingWeekPlanner.TrainingWeekView.this, dailyCoachBrief, z, z2, dateTimeFormatter, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CurrentWeekBody$lambda$49;
                }
            });
        }
    }

    private static final void ArchiveWeekBody(final List<ArchivedTrainingWeekEntity> list, final ArchivedTrainingWeekEntity archivedTrainingWeekEntity, final Function1<? super ArchivedTrainingWeekEntity, Unit> function1, final TrainingWeekSnapshot trainingWeekSnapshot, final TrainingWeekPlanner.TrainingWeekView trainingWeekView, final DateTimeFormatter dateTimeFormatter, final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        int i3;
        float m6303constructorimpl;
        Composer startRestartGroup = composer.startRestartGroup(201893036);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(archivedTrainingWeekEntity) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(trainingWeekSnapshot) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(trainingWeekView) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(dateTimeFormatter) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        int i4 = i2;
        if ((4793491 & i4) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(201893036, i4, -1, "com.example.rungps.ui.week.ArchiveWeekBody (TrainingWeekScreen.kt:522)");
            }
            startRestartGroup.startReplaceGroup(2021548700);
            if (list.isEmpty()) {
                TextKt.m2376Text4IGK_g("No archived weeks yet. Complete a week with runs, gym, or sleep logged — archives appear after the next Monday or when you open this screen.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyMedium(), startRestartGroup, 6, 0, 65530);
                startRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ArchiveWeekBody$lambda$50;
                            ArchiveWeekBody$lambda$50 = TrainingWeekScreenKt.ArchiveWeekBody$lambda$50(list, archivedTrainingWeekEntity, function1, trainingWeekSnapshot, trainingWeekView, dateTimeFormatter, z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                            return ArchiveWeekBody$lambda$50;
                        }
                    });
                    return;
                }
                return;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(2021561474);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final ArchivedTrainingWeekEntity archivedTrainingWeekEntity2 = (ArchivedTrainingWeekEntity) it.next();
                final LocalDate ofEpochDay = LocalDate.ofEpochDay(archivedTrainingWeekEntity2.getWeekStartEpochDay());
                final LocalDate ofEpochDay2 = LocalDate.ofEpochDay(archivedTrainingWeekEntity2.getWeekEndEpochDay());
                final boolean z2 = archivedTrainingWeekEntity != null && archivedTrainingWeekEntity.getId() == archivedTrainingWeekEntity2.getId();
                Iterator it2 = it;
                CornerBasedShape medium = MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getMedium();
                if (z2) {
                    m6303constructorimpl = Dp.m6303constructorimpl(3);
                    i3 = 1;
                } else {
                    i3 = 1;
                    m6303constructorimpl = Dp.m6303constructorimpl(1);
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i3, null);
                startRestartGroup.startReplaceGroup(-876535736);
                boolean changed = startRestartGroup.changed(z2) | ((i4 & 896) == 256) | startRestartGroup.changedInstance(archivedTrainingWeekEntity2);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ArchiveWeekBody$lambda$53$lambda$52$lambda$51;
                            ArchiveWeekBody$lambda$53$lambda$52$lambda$51 = TrainingWeekScreenKt.ArchiveWeekBody$lambda$53$lambda$52$lambda$51(Function1.this, z2, archivedTrainingWeekEntity2);
                            return ArchiveWeekBody$lambda$53$lambda$52$lambda$51;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                SurfaceKt.m2226SurfaceT9BRK9s(ClickableKt.m272clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue, 7, null), medium, 0L, 0L, m6303constructorimpl, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(378300373, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$ArchiveWeekBody$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(378300373, i5, -1, "com.example.rungps.ui.week.ArchiveWeekBody.<anonymous>.<anonymous> (TrainingWeekScreen.kt:564)");
                        }
                        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(12));
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(4));
                        LocalDate localDate = ofEpochDay;
                        DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
                        LocalDate localDate2 = ofEpochDay2;
                        ArchivedTrainingWeekEntity archivedTrainingWeekEntity3 = archivedTrainingWeekEntity2;
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
                        TextKt.m2376Text4IGK_g(localDate.format(dateTimeFormatter2) + " – " + localDate2.format(dateTimeFormatter2), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format(Locale.US, "%.1f km · %.0f kg gym · %d sleep nights", Arrays.copyOf(new Object[]{Double.valueOf(archivedTrainingWeekEntity3.getTotalRunKm()), Double.valueOf(archivedTrainingWeekEntity3.getTotalGymKg()), Integer.valueOf(archivedTrainingWeekEntity3.getSleepNights())}, 3));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        TextKt.m2376Text4IGK_g(format, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 12582912, 108);
                i4 = i4;
                it = it2;
            }
            int i5 = i4;
            startRestartGroup.endReplaceGroup();
            if (archivedTrainingWeekEntity != null && trainingWeekSnapshot != null && trainingWeekView != null) {
                DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, 0L, startRestartGroup, 0, 7);
                TextKt.m2376Text4IGK_g("Archived week", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), startRestartGroup, 196614, 0, 65502);
                String coachHeadline = trainingWeekSnapshot.getCoachHeadline();
                startRestartGroup.startReplaceGroup(2021608383);
                if (coachHeadline != null) {
                    TextKt.m2376Text4IGK_g(coachHeadline, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
                String coachSummary = trainingWeekSnapshot.getCoachSummary();
                startRestartGroup.startReplaceGroup(2021613712);
                if (coachSummary != null) {
                    TextKt.m2376Text4IGK_g(coachSummary, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 0, 0, 65530);
                    Unit unit3 = Unit.INSTANCE;
                    Unit unit4 = Unit.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
                String coachWeekLine = trainingWeekSnapshot.getCoachWeekLine();
                String str = (coachWeekLine == null || StringsKt.isBlank(coachWeekLine)) ? null : coachWeekLine;
                startRestartGroup.startReplaceGroup(2021620483);
                if (str != null) {
                    TextKt.m2376Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 0, 0, 65530);
                    Unit unit5 = Unit.INSTANCE;
                    Unit unit6 = Unit.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(2021625587);
                Iterator<T> it3 = trainingWeekView.getDays().iterator();
                while (it3.hasNext()) {
                    WeekDayRow((TrainingWeekPlanner.WeekDay) it3.next(), startRestartGroup, 0);
                    DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, 0L, startRestartGroup, 0, 7);
                }
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
                Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                ButtonKt.OutlinedButton(function0, RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), !z, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-949190268, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$ArchiveWeekBody$8$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope OutlinedButton, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                        if ((i6 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-949190268, i6, -1, "com.example.rungps.ui.week.ArchiveWeekBody.<anonymous>.<anonymous> (TrainingWeekScreen.kt:648)");
                        }
                        TextKt.m2376Text4IGK_g(z ? "…" : "Save week to Photos", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i5 >> 21) & 14) | 805306368, 504);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ArchiveWeekBody$lambda$60;
                    ArchiveWeekBody$lambda$60 = TrainingWeekScreenKt.ArchiveWeekBody$lambda$60(list, archivedTrainingWeekEntity, function1, trainingWeekSnapshot, trainingWeekView, dateTimeFormatter, z, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ArchiveWeekBody$lambda$60;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArchiveWeekBody$lambda$53$lambda$52$lambda$51(Function1 function1, boolean z, ArchivedTrainingWeekEntity archivedTrainingWeekEntity) {
        if (z) {
            archivedTrainingWeekEntity = null;
        }
        function1.invoke(archivedTrainingWeekEntity);
        return Unit.INSTANCE;
    }

    private static final void WeekDayRow(final TrainingWeekPlanner.WeekDay weekDay, Composer composer, final int i) {
        long onSurface;
        int i2;
        Composer composer2;
        Composer composer3;
        Composer composer4;
        long primary;
        Composer composer5;
        Composer startRestartGroup = composer.startRestartGroup(-2006192376);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(weekDay) ? 4 : 2) | i : i;
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2006192376, i3, -1, "com.example.rungps.ui.week.WeekDayRow (TrainingWeekScreen.kt:662)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String dayLabel = weekDay.getDayLabel();
            FontWeight bold = weekDay.isToday() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getMedium();
            if (weekDay.isToday()) {
                startRestartGroup.startReplaceGroup(-1135441995);
                onSurface = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary();
            } else {
                startRestartGroup.startReplaceGroup(-1135440745);
                onSurface = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurface();
            }
            startRestartGroup.endReplaceGroup();
            String str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            String str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            String str3 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
            String str4 = "C101@5126L9:Row.kt#2w3rfo";
            String str5 = "C88@4444L9:Column.kt#2w3rfo";
            TextKt.m2376Text4IGK_g(dayLabel, (Modifier) null, onSurface, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131034);
            List createListBuilder = CollectionsKt.createListBuilder();
            if (weekDay.getRunKm() > 0.01d) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                i2 = 1;
                String format = String.format(Locale.US, "%.1f km", Arrays.copyOf(new Object[]{Double.valueOf(weekDay.getRunKm())}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                createListBuilder.add(format);
            } else {
                i2 = 1;
            }
            if (weekDay.getGymTonnageKg() > 0.0d) {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String format2 = String.format(Locale.US, "%.0f kg", Arrays.copyOf(new Object[]{Double.valueOf(weekDay.getGymTonnageKg())}, i2));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                createListBuilder.add(format2);
            }
            List build = CollectionsKt.build(createListBuilder);
            startRestartGroup.startReplaceGroup(-1135431498);
            if (build.isEmpty()) {
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                TextKt.m2376Text4IGK_g(CollectionsKt.joinToString$default(build, " · ", null, null, 0, null, null, 62, null), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65534);
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Composer composer6 = composer2;
            composer6.startReplaceGroup(-2110709433);
            if (weekDay.getEvents().isEmpty()) {
                composer3 = composer6;
                TextKt.m2376Text4IGK_g("Rest — no logged activity", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
            } else {
                composer3 = composer6;
            }
            composer3.endReplaceGroup();
            Composer composer7 = composer3;
            composer7.startReplaceGroup(-2110699529);
            int i4 = 4;
            for (TrainingWeekPlanner.WeekEvent weekEvent : CollectionsKt.take(weekDay.getEvents(), 4)) {
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(composer7, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, centerVertically2, composer7, 54);
                String str6 = str;
                ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, str6);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer7, companion);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                String str7 = str2;
                ComposerKt.sourceInformationMarkerStart(composer7, -692256719, str7);
                if (!(composer7.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer7.startReusableNode();
                if (composer7.getInserting()) {
                    composer7.createNode(constructor3);
                } else {
                    composer7.useNode();
                }
                Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer7);
                Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                String str8 = str4;
                ComposerKt.sourceInformationMarkerStart(composer7, -407840262, str8);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                Modifier clip = ClipKt.clip(SizeKt.m715height3ABfNKs(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(i4)), Dp.m6303constructorimpl(28)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(2)));
                int i5 = WhenMappings.$EnumSwitchMapping$1[weekEvent.getKind().ordinal()];
                if (i5 == 1) {
                    composer7.startReplaceGroup(-1927773644);
                    primary = MaterialTheme.INSTANCE.getColorScheme(composer7, MaterialTheme.$stable).getPrimary();
                    composer7.endReplaceGroup();
                } else if (i5 == 2) {
                    composer7.startReplaceGroup(-1927770315);
                    primary = MaterialTheme.INSTANCE.getColorScheme(composer7, MaterialTheme.$stable).getTertiary();
                    composer7.endReplaceGroup();
                } else if (i5 == 3) {
                    composer7.startReplaceGroup(-1927766890);
                    primary = MaterialTheme.INSTANCE.getColorScheme(composer7, MaterialTheme.$stable).getSecondary();
                    composer7.endReplaceGroup();
                } else {
                    if (i5 != i4) {
                        composer7.startReplaceGroup(-1927776793);
                        composer7.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer7.startReplaceGroup(-1927763308);
                    primary = MaterialTheme.INSTANCE.getColorScheme(composer7, MaterialTheme.$stable).getOutline();
                    composer7.endReplaceGroup();
                }
                BoxKt.Box(BackgroundKt.m239backgroundbw27NRU$default(clip, primary, null, 2, null), composer7, 0);
                String str9 = str3;
                ComposerKt.sourceInformationMarkerStart(composer7, -483455358, str9);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer7, 0);
                ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, str6);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer7, companion2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer7, -692256719, str7);
                if (!(composer7.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer7.startReusableNode();
                if (composer7.getInserting()) {
                    composer7.createNode(constructor4);
                } else {
                    composer7.useNode();
                }
                Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer7);
                Updater.m3343setimpl(m3336constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                String str10 = str5;
                ComposerKt.sourceInformationMarkerStart(composer7, -384784025, str10);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i6 = i4;
                Composer composer8 = composer7;
                TextKt.m2376Text4IGK_g(weekEvent.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getBodySmall(), composer8, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                String subtitle = weekEvent.getSubtitle();
                composer8.startReplaceGroup(154640907);
                if (subtitle == null) {
                    composer5 = composer8;
                } else {
                    composer5 = composer8;
                    TextKt.m2376Text4IGK_g(subtitle, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer8, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getLabelSmall(), composer5, 0, 0, 65530);
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
                composer5.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                composer7 = composer5;
                str2 = str7;
                str3 = str9;
                str4 = str8;
                str = str6;
                i4 = i6;
                str5 = str10;
            }
            composer4 = composer7;
            composer4.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer4 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.week.TrainingWeekScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit WeekDayRow$lambda$68;
                    WeekDayRow$lambda$68 = TrainingWeekScreenKt.WeekDayRow$lambda$68(TrainingWeekPlanner.WeekDay.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return WeekDayRow$lambda$68;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RunEntity> TrainingWeekScreen$lambda$1(State<? extends List<RunEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GymSessionEntity> TrainingWeekScreen$lambda$2(State<? extends List<GymSessionEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RecoveryEventEntity> TrainingWeekScreen$lambda$3(State<? extends List<RecoveryEventEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SleepEntryEntity> TrainingWeekScreen$lambda$4(State<? extends List<SleepEntryEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ArchivedTrainingWeekEntity> TrainingWeekScreen$lambda$5(State<? extends List<ArchivedTrainingWeekEntity>> state) {
        return state.getValue();
    }
}
