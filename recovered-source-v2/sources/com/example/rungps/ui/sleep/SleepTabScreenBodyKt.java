package com.example.rungps.ui.sleep;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorScheme;
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
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.sleep.BatteryOptimizationNudgeKt;
import com.example.rungps.sleep.BedtimeReminderPrefs;
import com.example.rungps.sleep.GoogleCalendarLink;
import com.example.rungps.sleep.SleepAlarmAudit;
import com.example.rungps.sleep.SleepAlarmDismiss;
import com.example.rungps.sleep.SleepAlarmPreferences;
import com.example.rungps.sleep.SleepCalendarHelper;
import com.example.rungps.sleep.SleepCalendarObserver;
import com.example.rungps.sleep.SleepConsistencyScorer;
import com.example.rungps.sleep.SleepDebtTracker;
import com.example.rungps.sleep.SleepEntryRepair;
import com.example.rungps.sleep.SleepEntryTimeEditor;
import com.example.rungps.sleep.SleepListenPreferences;
import com.example.rungps.sleep.SleepMlFeedbackApply;
import com.example.rungps.sleep.SleepMlPipelineStatus;
import com.example.rungps.sleep.SleepMorningDiagnostics;
import com.example.rungps.sleep.SleepNapDetector;
import com.example.rungps.sleep.SleepOvernightStore;
import com.example.rungps.sleep.SleepSessionFinisher;
import com.example.rungps.sleep.SleepTrackingLiveStats;
import com.example.rungps.sleep.SleepTrendAnalysis;
import com.example.rungps.sleep.SleepWakePlanner;
import com.example.rungps.ui.ExerciseTrackerLocalsKt;
import com.example.rungps.ui.components.TabUiKt;
import com.example.rungps.util.SigningFingerprints;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u008a\u0084\u0002²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\nX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\bX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u008e\u0002²\u0006\f\u0010'\u001a\u0004\u0018\u00010(X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\nX\u008a\u008e\u0002²\u0006\f\u0010+\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u00103\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\f\u00104\u001a\u0004\u0018\u000105X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u00020\nX\u008a\u008e\u0002²\u0006\f\u00107\u001a\u0004\u0018\u00010\bX\u008a\u008e\u0002²\u0006\n\u00108\u001a\u000209X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010;\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\f\u0010<\u001a\u0004\u0018\u00010=X\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010?\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010C\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010D\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\u0012\u0010E\u001a\n F*\u0004\u0018\u00010\u00100\u0010X\u008a\u008e\u0002²\u0006\f\u0010G\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002"}, d2 = {"SleepTabScreenBody", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "entries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "hcHasSleepPerms", "", "importing", "didAutoImport", "showAdd", "selectedNight", "startText", "", "endText", "totalMinText", "deepMinText", "lightMinText", "sourceText", "trackingActive", "sleepLive", "Lcom/example/rungps/sleep/SleepTrackingLiveStats$Live;", "alarmHour", "", "alarmMinute", "windowMin", "", "smartAlarm", "saveSoundClips", "sonarBeta", "highFidelity", "autoWakeSuggest", "mapsTravelEta", "homeAddress", "wakeSuggestion", "Lcom/example/rungps/sleep/SleepWakePlanner$Suggestion;", "calendarQuery", "Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult;", "googleCalendarLinked", "showGoogleTroubleshoot", "googleTroubleshootDetail", "soundMode", "spotifyInput", "showWakeMood", "showManualCalendar", "manualEventTitle", "manualEventHour", "manualEventMinute", "wakeMood", "hypnoFeedback", "Lcom/example/rungps/sleep/SleepMlFeedbackApply$Kind;", "showRepairPrompt", "repairEntry", "nowMs", "", "alarmRinging", "calendarRefreshTick", "morningDiagnostics", "Lcom/example/rungps/sleep/SleepMorningDiagnostics$Snapshot;", "bedtimeReminder", "bedHour", "bedMinute", "windDim", "windDnd", "windPause", "recoverableSampleCount", "wakeText", "kotlin.jvm.PlatformType", "wakeError"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepTabScreenBodyKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$262(Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepTabScreenBody(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:346:0x1587, code lost:
    
        if (r0 == null) goto L410;
     */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepTabScreenBody(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        MutableState mutableState;
        MutableState mutableState2;
        SleepCalendarHelper.MorningCommitment morningCommitment;
        ExerciseTrackerUseCases exerciseTrackerUseCases;
        MutableState mutableState3;
        HealthConnectManager healthConnectManager;
        CoroutineScope coroutineScope;
        Composer composer2;
        boolean z;
        LifecycleOwner lifecycleOwner;
        Modifier modifier3;
        int i4;
        SnapshotMutationPolicy snapshotMutationPolicy;
        MutableState mutableState4;
        Object obj;
        MutableState mutableState5;
        final MutableState mutableState6;
        final boolean z2;
        MutableState mutableState7;
        MutableState mutableState8;
        MutableState mutableState9;
        MutableState mutableState10;
        MutableState mutableState11;
        boolean z3;
        MutableState mutableState12;
        MutableState mutableState13;
        MutableState mutableState14;
        int i5;
        MutableState mutableState15;
        ExerciseTrackerUseCases exerciseTrackerUseCases2;
        HealthConnectManager healthConnectManager2;
        MutableState mutableState16;
        MutableState mutableState17;
        MutableState mutableState18;
        State state;
        Composer composer3;
        MutableState mutableState19;
        String str;
        String str2;
        String str3;
        Modifier modifier4;
        ?? r1;
        String str4;
        ColorScheme colorScheme;
        String str5;
        String str6;
        Object obj2;
        final MutableState mutableState20;
        ExerciseTrackerUseCases exerciseTrackerUseCases3;
        CoroutineScope coroutineScope2;
        ColorScheme colorScheme2;
        final MutableState mutableState21;
        final MutableState mutableState22;
        final CoroutineScope coroutineScope3;
        final ExerciseTrackerUseCases exerciseTrackerUseCases4;
        Function0 function0;
        CoroutineScope coroutineScope4;
        Composer composer4;
        Composer composer5;
        final MutableState mutableState23;
        final MutableState mutableState24;
        final MutableState mutableState25;
        final MutableState mutableState26;
        SleepMorningDiagnostics.Snapshot SleepTabScreenBody$lambda$187;
        final MutableState mutableState27;
        Composer startRestartGroup = composer.startRestartGroup(-1853858858);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            Modifier modifier5 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1853858858, i3, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody (SleepTabScreenBody.kt:133)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) consume2;
            ProvidableCompositionLocal<ExerciseTrackerUseCases> localExerciseTrackerUseCases = ExerciseTrackerLocalsKt.getLocalExerciseTrackerUseCases();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localExerciseTrackerUseCases);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final ExerciseTrackerUseCases exerciseTrackerUseCases5 = (ExerciseTrackerUseCases) consume3;
            List emptyList = CollectionsKt.emptyList();
            startRestartGroup.startReplaceGroup(-493424034);
            boolean changedInstance = startRestartGroup.changedInstance(exerciseTrackerUseCases5);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$entries$2$1(exerciseTrackerUseCases5, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            State produceState = SnapshotStateKt.produceState(emptyList, exerciseTrackerUseCases5, (Function2<? super ProduceStateScope<List>, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final CoroutineScope coroutineScope5 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-493415304);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                rememberedValue3 = new HealthConnectManager(applicationContext);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            HealthConnectManager healthConnectManager3 = (HealthConnectManager) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493412607);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState28 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493410815);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState29 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            Object[] objArr = new Object[0];
            startRestartGroup.startReplaceGroup(-493404905);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$10$lambda$9;
                        SleepTabScreenBody$lambda$10$lambda$9 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$10$lambda$9();
                        return SleepTabScreenBody$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceGroup();
            Modifier modifier6 = modifier5;
            MutableState mutableState30 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue6, startRestartGroup, 3072, 6);
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(-493403069);
            boolean changedInstance2 = startRestartGroup.changedInstance(healthConnectManager3);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$1$1(healthConnectManager3, mutableState28, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 6);
            ActivityResultContracts.OpenDocument openDocument = new ActivityResultContracts.OpenDocument();
            startRestartGroup.startReplaceGroup(-493391139);
            boolean changedInstance3 = startRestartGroup.changedInstance(coroutineScope5) | startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(exerciseTrackerUseCases5);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit SleepTabScreenBody$lambda$15$lambda$14;
                        SleepTabScreenBody$lambda$15$lambda$14 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$15$lambda$14(CoroutineScope.this, context, exerciseTrackerUseCases5, (Uri) obj3);
                        return SleepTabScreenBody$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            startRestartGroup.endReplaceGroup();
            final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(openDocument, (Function1) rememberedValue8, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-493374623);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState31 = (MutableState) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493372685);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            MutableState mutableState32 = (MutableState) rememberedValue10;
            startRestartGroup.endReplaceGroup();
            Object[] objArr2 = new Object[0];
            startRestartGroup.startReplaceGroup(-493369795);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$23$lambda$22;
                        SleepTabScreenBody$lambda$23$lambda$22 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$23$lambda$22();
                        return SleepTabScreenBody$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState33 = mutableState32;
            MutableState mutableState34 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue11, startRestartGroup, 3072, 6);
            Object[] objArr3 = new Object[0];
            startRestartGroup.startReplaceGroup(-493367652);
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$27$lambda$26;
                        SleepTabScreenBody$lambda$27$lambda$26 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$27$lambda$26();
                        return SleepTabScreenBody$lambda$27$lambda$26;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState35 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue12, startRestartGroup, 3072, 6);
            Object[] objArr4 = new Object[0];
            startRestartGroup.startReplaceGroup(-493365384);
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$31$lambda$30;
                        SleepTabScreenBody$lambda$31$lambda$30 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$31$lambda$30();
                        return SleepTabScreenBody$lambda$31$lambda$30;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState36 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) rememberedValue13, startRestartGroup, 3072, 6);
            Object[] objArr5 = new Object[0];
            startRestartGroup.startReplaceGroup(-493363275);
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$35$lambda$34;
                        SleepTabScreenBody$lambda$35$lambda$34 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$35$lambda$34();
                        return SleepTabScreenBody$lambda$35$lambda$34;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState37 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) rememberedValue14, startRestartGroup, 3072, 6);
            Object[] objArr6 = new Object[0];
            startRestartGroup.startReplaceGroup(-493361227);
            Object rememberedValue15 = startRestartGroup.rememberedValue();
            if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                rememberedValue15 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$39$lambda$38;
                        SleepTabScreenBody$lambda$39$lambda$38 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$39$lambda$38();
                        return SleepTabScreenBody$lambda$39$lambda$38;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue15);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState38 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr6, (Saver) null, (String) null, (Function0) rememberedValue15, startRestartGroup, 3072, 6);
            Object[] objArr7 = new Object[0];
            startRestartGroup.startReplaceGroup(-493359237);
            Object rememberedValue16 = startRestartGroup.rememberedValue();
            if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                rememberedValue16 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$43$lambda$42;
                        SleepTabScreenBody$lambda$43$lambda$42 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$43$lambda$42();
                        return SleepTabScreenBody$lambda$43$lambda$42;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue16);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState39 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr7, (Saver) null, (String) null, (Function0) rememberedValue16, startRestartGroup, 3072, 6);
            ColorScheme colorScheme3 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) CollectionsKt.firstOrNull((List) SleepTabScreenBody$lambda$1(produceState));
            List take = CollectionsKt.take(SleepTabScreenBody$lambda$1(produceState), 7);
            ArrayList arrayList = new ArrayList();
            Iterator it = take.iterator();
            while (it.hasNext()) {
                Integer sleepQuality = ((SleepEntryEntity) it.next()).getSleepQuality();
                if (sleepQuality != null) {
                    arrayList.add(sleepQuality);
                }
            }
            Double valueOf = Double.valueOf(CollectionsKt.averageOfInt(arrayList));
            Double d = !Double.isNaN(valueOf.doubleValue()) ? valueOf : null;
            startRestartGroup.startReplaceGroup(-493351715);
            Object rememberedValue17 = startRestartGroup.rememberedValue();
            if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                rememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(SleepOvernightStore.INSTANCE.isActive(context)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue17);
            }
            final MutableState mutableState40 = (MutableState) rememberedValue17;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493349021);
            Object rememberedValue18 = startRestartGroup.rememberedValue();
            if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                rememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SleepTrackingLiveStats.INSTANCE.fromContext(context), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue18);
            }
            MutableState mutableState41 = (MutableState) rememberedValue18;
            startRestartGroup.endReplaceGroup();
            Object[] objArr8 = new Object[0];
            startRestartGroup.startReplaceGroup(-493345644);
            Object rememberedValue19 = startRestartGroup.rememberedValue();
            if (rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                rememberedValue19 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$55$lambda$54;
                        SleepTabScreenBody$lambda$55$lambda$54 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$55$lambda$54();
                        return SleepTabScreenBody$lambda$55$lambda$54;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue19);
            }
            startRestartGroup.endReplaceGroup();
            final MutableState mutableState42 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr8, (Saver) null, (String) null, (Function0) rememberedValue19, startRestartGroup, 3072, 6);
            Object[] objArr9 = new Object[0];
            startRestartGroup.startReplaceGroup(-493343660);
            Object rememberedValue20 = startRestartGroup.rememberedValue();
            if (rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                rememberedValue20 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$59$lambda$58;
                        SleepTabScreenBody$lambda$59$lambda$58 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$59$lambda$58();
                        return SleepTabScreenBody$lambda$59$lambda$58;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue20);
            }
            startRestartGroup.endReplaceGroup();
            final MutableState mutableState43 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr9, (Saver) null, (String) null, (Function0) rememberedValue20, startRestartGroup, 3072, 6);
            Object SleepTabScreenBody$lambda$1 = SleepTabScreenBody$lambda$1(produceState);
            int SleepTabScreenBody$lambda$56 = SleepTabScreenBody$lambda$56(mutableState42);
            int SleepTabScreenBody$lambda$60 = SleepTabScreenBody$lambda$60(mutableState43);
            startRestartGroup.startReplaceGroup(-493342137);
            boolean changed = startRestartGroup.changed(SleepTabScreenBody$lambda$1) | startRestartGroup.changed(SleepTabScreenBody$lambda$56) | startRestartGroup.changed(SleepTabScreenBody$lambda$60);
            Object rememberedValue21 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                rememberedValue21 = SleepDebtTracker.analyze$default(SleepDebtTracker.INSTANCE, SleepTabScreenBody$lambda$1(produceState), 0.0d, SleepTabScreenBody$lambda$56(mutableState42), SleepTabScreenBody$lambda$60(mutableState43), null, 18, null);
                startRestartGroup.updateRememberedValue(rememberedValue21);
            }
            final SleepDebtTracker.Snapshot snapshot = (SleepDebtTracker.Snapshot) rememberedValue21;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493335158);
            Object rememberedValue22 = startRestartGroup.rememberedValue();
            if (rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                rememberedValue22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(SleepAlarmPreferences.INSTANCE.windowMin(context)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue22);
            }
            final MutableState mutableState44 = (MutableState) rememberedValue22;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493332024);
            Object rememberedValue23 = startRestartGroup.rememberedValue();
            if (rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                rememberedValue23 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(SleepAlarmPreferences.INSTANCE.smartAlarmEnabled(context)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue23);
            }
            final MutableState mutableState45 = (MutableState) rememberedValue23;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493328826);
            Object rememberedValue24 = startRestartGroup.rememberedValue();
            if (rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                rememberedValue24 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(SleepListenPreferences.INSTANCE.saveSoundClips(context)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue24);
            }
            MutableState mutableState46 = (MutableState) rememberedValue24;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493325848);
            Object rememberedValue25 = startRestartGroup.rememberedValue();
            if (rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                rememberedValue25 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(SleepListenPreferences.INSTANCE.sonarBetaEnabled(context)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue25);
            }
            MutableState mutableState47 = (MutableState) rememberedValue25;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493322711);
            Object rememberedValue26 = startRestartGroup.rememberedValue();
            if (rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                rememberedValue26 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(SleepListenPreferences.INSTANCE.highFidelityAudio(context)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue26);
            }
            MutableState mutableState48 = (MutableState) rememberedValue26;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493319669);
            Object rememberedValue27 = startRestartGroup.rememberedValue();
            if (rememberedValue27 == Composer.INSTANCE.getEmpty()) {
                rememberedValue27 = SleepMlPipelineStatus.INSTANCE.load(context);
                startRestartGroup.updateRememberedValue(rememberedValue27);
            }
            SleepMlPipelineStatus.Status status = (SleepMlPipelineStatus.Status) rememberedValue27;
            startRestartGroup.endReplaceGroup();
            Object SleepTabScreenBody$lambda$12 = SleepTabScreenBody$lambda$1(produceState);
            startRestartGroup.startReplaceGroup(-493317508);
            boolean changed2 = startRestartGroup.changed(SleepTabScreenBody$lambda$12);
            Object rememberedValue28 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue28 == Composer.INSTANCE.getEmpty()) {
                rememberedValue28 = SleepConsistencyScorer.analyze$default(SleepConsistencyScorer.INSTANCE, SleepTabScreenBody$lambda$1(produceState), 0, null, 6, null);
                startRestartGroup.updateRememberedValue(rememberedValue28);
            }
            final SleepConsistencyScorer.Snapshot snapshot2 = (SleepConsistencyScorer.Snapshot) rememberedValue28;
            startRestartGroup.endReplaceGroup();
            Object SleepTabScreenBody$lambda$13 = SleepTabScreenBody$lambda$1(produceState);
            startRestartGroup.startReplaceGroup(-493314679);
            boolean changed3 = startRestartGroup.changed(SleepTabScreenBody$lambda$13);
            Object rememberedValue29 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue29 == Composer.INSTANCE.getEmpty()) {
                List<SleepEntryEntity> SleepTabScreenBody$lambda$14 = SleepTabScreenBody$lambda$1(produceState);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = SleepTabScreenBody$lambda$14.iterator();
                while (it2.hasNext()) {
                    SleepEntryEntity sleepEntryEntity2 = (SleepEntryEntity) it2.next();
                    Iterator it3 = it2;
                    SleepNapDetector.NapHint analyze$default = SleepNapDetector.analyze$default(SleepNapDetector.INSTANCE, sleepEntryEntity2, null, 2, null);
                    if (!analyze$default.isLikelyNap()) {
                        analyze$default = null;
                    }
                    Pair pair = analyze$default != null ? TuplesKt.to(sleepEntryEntity2, analyze$default) : null;
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                    it2 = it3;
                }
                rememberedValue29 = CollectionsKt.take(arrayList2, 5);
                startRestartGroup.updateRememberedValue(rememberedValue29);
            }
            final List list = (List) rememberedValue29;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493308435);
            Object rememberedValue30 = startRestartGroup.rememberedValue();
            if (rememberedValue30 == Composer.INSTANCE.getEmpty()) {
                rememberedValue30 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(SleepAlarmPreferences.INSTANCE.autoWakeSuggestEnabled(context)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue30);
            }
            MutableState mutableState49 = (MutableState) rememberedValue30;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493305109);
            Object rememberedValue31 = startRestartGroup.rememberedValue();
            if (rememberedValue31 == Composer.INSTANCE.getEmpty()) {
                rememberedValue31 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(SleepAlarmPreferences.INSTANCE.mapsTravelEtaEnabled(context)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue31);
            }
            MutableState mutableState50 = (MutableState) rememberedValue31;
            startRestartGroup.endReplaceGroup();
            Object[] objArr10 = new Object[0];
            startRestartGroup.startReplaceGroup(-493301373);
            boolean changedInstance4 = startRestartGroup.changedInstance(context);
            Object rememberedValue32 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue32 == Composer.INSTANCE.getEmpty()) {
                rememberedValue32 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$91$lambda$90;
                        SleepTabScreenBody$lambda$91$lambda$90 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$91$lambda$90(context);
                        return SleepTabScreenBody$lambda$91$lambda$90;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue32);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState51 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr10, (Saver) null, (String) null, (Function0) rememberedValue32, startRestartGroup, 0, 6);
            startRestartGroup.startReplaceGroup(-493298338);
            Object rememberedValue33 = startRestartGroup.rememberedValue();
            if (rememberedValue33 == Composer.INSTANCE.getEmpty()) {
                rememberedValue33 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue33);
            }
            MutableState mutableState52 = (MutableState) rememberedValue33;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493295486);
            Object rememberedValue34 = startRestartGroup.rememberedValue();
            if (rememberedValue34 == Composer.INSTANCE.getEmpty()) {
                rememberedValue34 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue34);
            }
            MutableState mutableState53 = (MutableState) rememberedValue34;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493292292);
            Object rememberedValue35 = startRestartGroup.rememberedValue();
            if (rememberedValue35 == Composer.INSTANCE.getEmpty()) {
                rememberedValue35 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(GoogleCalendarLink.INSTANCE.isLinked(context)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue35);
            }
            final MutableState mutableState54 = (MutableState) rememberedValue35;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493289247);
            Object rememberedValue36 = startRestartGroup.rememberedValue();
            if (rememberedValue36 == Composer.INSTANCE.getEmpty()) {
                rememberedValue36 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue36);
            }
            final MutableState mutableState55 = (MutableState) rememberedValue36;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493286967);
            Object rememberedValue37 = startRestartGroup.rememberedValue();
            if (rememberedValue37 == Composer.INSTANCE.getEmpty()) {
                rememberedValue37 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue37);
            }
            final MutableState mutableState56 = (MutableState) rememberedValue37;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-493284614);
            Object rememberedValue38 = startRestartGroup.rememberedValue();
            if (rememberedValue38 == Composer.INSTANCE.getEmpty()) {
                rememberedValue38 = Boolean.valueOf(SleepAlarmPreferences.INSTANCE.calendarSyncEnabled(context));
                startRestartGroup.updateRememberedValue(rememberedValue38);
            }
            boolean booleanValue = ((Boolean) rememberedValue38).booleanValue();
            startRestartGroup.endReplaceGroup();
            SleepCalendarHelper.QueryResult SleepTabScreenBody$lambda$98 = SleepTabScreenBody$lambda$98(mutableState53);
            SleepCalendarHelper.QueryResult.Success success = SleepTabScreenBody$lambda$98 instanceof SleepCalendarHelper.QueryResult.Success ? (SleepCalendarHelper.QueryResult.Success) SleepTabScreenBody$lambda$98 : null;
            SleepCalendarHelper.MorningCommitment commitment = success != null ? success.getCommitment() : null;
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            startRestartGroup.startReplaceGroup(-493273095);
            boolean changedInstance5 = startRestartGroup.changedInstance(context);
            Object rememberedValue39 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue39 == Composer.INSTANCE.getEmpty()) {
                rememberedValue39 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit SleepTabScreenBody$lambda$115$lambda$114;
                        SleepTabScreenBody$lambda$115$lambda$114 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$115$lambda$114(context, mutableState54, mutableState56, mutableState55, (ActivityResult) obj3);
                        return SleepTabScreenBody$lambda$115$lambda$114;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue39);
            }
            startRestartGroup.endReplaceGroup();
            ManagedActivityResultLauncher rememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (Function1) rememberedValue39, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-493213006);
            if (SleepTabScreenBody$lambda$104(mutableState55)) {
                startRestartGroup.startReplaceGroup(-493211903);
                Object rememberedValue40 = startRestartGroup.rememberedValue();
                if (rememberedValue40 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue40 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda31
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit SleepTabScreenBody$lambda$117$lambda$116;
                            SleepTabScreenBody$lambda$117$lambda$116 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$117$lambda$116(MutableState.this);
                            return SleepTabScreenBody$lambda$117$lambda$116;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue40);
                }
                startRestartGroup.endReplaceGroup();
                morningCommitment = commitment;
                mutableState2 = mutableState51;
                z = booleanValue;
                exerciseTrackerUseCases = exerciseTrackerUseCases5;
                mutableState = mutableState54;
                mutableState3 = mutableState28;
                healthConnectManager = healthConnectManager3;
                lifecycleOwner = lifecycleOwner2;
                modifier3 = modifier6;
                coroutineScope = coroutineScope5;
                composer2 = startRestartGroup;
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue40, ComposableLambdaKt.rememberComposableLambda(-1498990807, true, new SleepTabScreenBodyKt$SleepTabScreenBody$3(context, mutableState56), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-551952921, true, new SleepTabScreenBodyKt$SleepTabScreenBody$4(mutableState55), startRestartGroup, 54), null, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7524getLambda3$app_sideload(), ComposableLambdaKt.rememberComposableLambda(868603908, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                        invoke(composer6, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer6, int i7) {
                        String SleepTabScreenBody$lambda$107;
                        if ((i7 & 3) != 2 || !composer6.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(868603908, i7, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous> (SleepTabScreenBody.kt:263)");
                            }
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                            MutableState<String> mutableState57 = mutableState56;
                            ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer6, 6);
                            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer6, companion);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer6.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor);
                            } else {
                                composer6.useNode();
                            }
                            Composer m3336constructorimpl = Updater.m3336constructorimpl(composer6);
                            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            TextKt.m2376Text4IGK_g("This usually means the Android OAuth client is missing the correct SHA-1 fingerprint.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodySmall(), composer6, 6, 0, 65530);
                            SleepTabScreenBody$lambda$107 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$107(mutableState57);
                            if (SleepTabScreenBody$lambda$107 == null) {
                                SleepTabScreenBody$lambda$107 = "Check Google Cloud Console credentials.";
                            }
                            TextKt.m2376Text4IGK_g(SleepTabScreenBody$lambda$107, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodySmall(), composer6, 0, 0, 65534);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            composer6.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer6.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1772598, 0, 16276);
            } else {
                mutableState = mutableState54;
                mutableState2 = mutableState51;
                morningCommitment = commitment;
                exerciseTrackerUseCases = exerciseTrackerUseCases5;
                mutableState3 = mutableState28;
                healthConnectManager = healthConnectManager3;
                coroutineScope = coroutineScope5;
                composer2 = startRestartGroup;
                z = booleanValue;
                lifecycleOwner = lifecycleOwner2;
                modifier3 = modifier6;
            }
            composer2.endReplaceGroup();
            Composer composer6 = composer2;
            composer6.startReplaceGroup(-493164032);
            Object rememberedValue41 = composer6.rememberedValue();
            if (rememberedValue41 == Composer.INSTANCE.getEmpty()) {
                i4 = 2;
                snapshotMutationPolicy = null;
                rememberedValue41 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SleepAlarmPreferences.INSTANCE.soundMode(context), null, 2, null);
                composer6.updateRememberedValue(rememberedValue41);
            } else {
                i4 = 2;
                snapshotMutationPolicy = null;
            }
            MutableState mutableState57 = (MutableState) rememberedValue41;
            composer6.endReplaceGroup();
            Object[] objArr11 = new Object[0];
            composer6.startReplaceGroup(-493160614);
            boolean changedInstance6 = composer6.changedInstance(context);
            Object rememberedValue42 = composer6.rememberedValue();
            if (changedInstance6 || rememberedValue42 == Composer.INSTANCE.getEmpty()) {
                rememberedValue42 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$122$lambda$121;
                        SleepTabScreenBody$lambda$122$lambda$121 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$122$lambda$121(context);
                        return SleepTabScreenBody$lambda$122$lambda$121;
                    }
                };
                composer6.updateRememberedValue(rememberedValue42);
            }
            composer6.endReplaceGroup();
            MutableState mutableState58 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr11, (Saver) null, (String) null, (Function0) rememberedValue42, composer6, 0, 6);
            composer6.startReplaceGroup(-493157951);
            Object rememberedValue43 = composer6.rememberedValue();
            if (rememberedValue43 == Composer.INSTANCE.getEmpty()) {
                rememberedValue43 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, i4, snapshotMutationPolicy);
                composer6.updateRememberedValue(rememberedValue43);
            }
            final MutableState mutableState59 = (MutableState) rememberedValue43;
            composer6.endReplaceGroup();
            composer6.startReplaceGroup(-493155871);
            Object rememberedValue44 = composer6.rememberedValue();
            if (rememberedValue44 == Composer.INSTANCE.getEmpty()) {
                rememberedValue44 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, i4, snapshotMutationPolicy);
                composer6.updateRememberedValue(rememberedValue44);
            }
            MutableState mutableState60 = (MutableState) rememberedValue44;
            composer6.endReplaceGroup();
            Object[] objArr12 = new Object[0];
            composer6.startReplaceGroup(-493153310);
            Object rememberedValue45 = composer6.rememberedValue();
            if (rememberedValue45 == Composer.INSTANCE.getEmpty()) {
                rememberedValue45 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$132$lambda$131;
                        SleepTabScreenBody$lambda$132$lambda$131 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$132$lambda$131();
                        return SleepTabScreenBody$lambda$132$lambda$131;
                    }
                };
                composer6.updateRememberedValue(rememberedValue45);
            }
            composer6.endReplaceGroup();
            MutableState mutableState61 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr12, (Saver) null, (String) null, (Function0) rememberedValue45, composer6, 3072, 6);
            Object[] objArr13 = new Object[0];
            composer6.startReplaceGroup(-493150764);
            Object rememberedValue46 = composer6.rememberedValue();
            if (rememberedValue46 == Composer.INSTANCE.getEmpty()) {
                rememberedValue46 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$136$lambda$135;
                        SleepTabScreenBody$lambda$136$lambda$135 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$136$lambda$135();
                        return SleepTabScreenBody$lambda$136$lambda$135;
                    }
                };
                composer6.updateRememberedValue(rememberedValue46);
            }
            composer6.endReplaceGroup();
            MutableState mutableState62 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr13, (Saver) null, (String) null, (Function0) rememberedValue46, composer6, 3072, 6);
            Object[] objArr14 = new Object[0];
            composer6.startReplaceGroup(-493148588);
            Object rememberedValue47 = composer6.rememberedValue();
            if (rememberedValue47 == Composer.INSTANCE.getEmpty()) {
                rememberedValue47 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SleepTabScreenBody$lambda$140$lambda$139;
                        SleepTabScreenBody$lambda$140$lambda$139 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$140$lambda$139();
                        return SleepTabScreenBody$lambda$140$lambda$139;
                    }
                };
                composer6.updateRememberedValue(rememberedValue47);
            }
            composer6.endReplaceGroup();
            MutableState mutableState63 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr14, (Saver) null, (String) null, (Function0) rememberedValue47, composer6, 3072, 6);
            composer6.startReplaceGroup(-493147232);
            Object rememberedValue48 = composer6.rememberedValue();
            if (rememberedValue48 == Composer.INSTANCE.getEmpty()) {
                rememberedValue48 = SnapshotIntStateKt.mutableIntStateOf(3);
                composer6.updateRememberedValue(rememberedValue48);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue48;
            composer6.endReplaceGroup();
            composer6.startReplaceGroup(-493145316);
            Object rememberedValue49 = composer6.rememberedValue();
            if (rememberedValue49 == Composer.INSTANCE.getEmpty()) {
                rememberedValue49 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i4, snapshotMutationPolicy);
                composer6.updateRememberedValue(rememberedValue49);
            }
            MutableState mutableState64 = (MutableState) rememberedValue49;
            composer6.endReplaceGroup();
            composer6.startReplaceGroup(-493142463);
            Object rememberedValue50 = composer6.rememberedValue();
            if (rememberedValue50 == Composer.INSTANCE.getEmpty()) {
                rememberedValue50 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, i4, snapshotMutationPolicy);
                composer6.updateRememberedValue(rememberedValue50);
            }
            MutableState mutableState65 = (MutableState) rememberedValue50;
            composer6.endReplaceGroup();
            composer6.startReplaceGroup(-493140589);
            Object rememberedValue51 = composer6.rememberedValue();
            if (rememberedValue51 == Composer.INSTANCE.getEmpty()) {
                rememberedValue51 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i4, snapshotMutationPolicy);
                composer6.updateRememberedValue(rememberedValue51);
            }
            MutableState mutableState66 = (MutableState) rememberedValue51;
            composer6.endReplaceGroup();
            composer6.startReplaceGroup(-493138346);
            Object rememberedValue52 = composer6.rememberedValue();
            if (rememberedValue52 == Composer.INSTANCE.getEmpty()) {
                rememberedValue52 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(System.currentTimeMillis()), snapshotMutationPolicy, i4, snapshotMutationPolicy);
                composer6.updateRememberedValue(rememberedValue52);
            }
            MutableState mutableState67 = (MutableState) rememberedValue52;
            composer6.endReplaceGroup();
            composer6.startReplaceGroup(-493135783);
            Object rememberedValue53 = composer6.rememberedValue();
            if (rememberedValue53 == Composer.INSTANCE.getEmpty()) {
                rememberedValue53 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(SleepAlarmDismiss.INSTANCE.isRinging()), snapshotMutationPolicy, i4, snapshotMutationPolicy);
                composer6.updateRememberedValue(rememberedValue53);
            }
            MutableState mutableState68 = (MutableState) rememberedValue53;
            composer6.endReplaceGroup();
            ActivityResultContracts.StartActivityForResult startActivityForResult2 = new ActivityResultContracts.StartActivityForResult();
            composer6.startReplaceGroup(-493129363);
            boolean changedInstance7 = composer6.changedInstance(context);
            Object rememberedValue54 = composer6.rememberedValue();
            if (changedInstance7 || rememberedValue54 == Composer.INSTANCE.getEmpty()) {
                rememberedValue54 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit SleepTabScreenBody$lambda$162$lambda$161;
                        SleepTabScreenBody$lambda$162$lambda$161 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$162$lambda$161(context, (ActivityResult) obj3);
                        return SleepTabScreenBody$lambda$162$lambda$161;
                    }
                };
                composer6.updateRememberedValue(rememberedValue54);
            }
            composer6.endReplaceGroup();
            ManagedActivityResultLauncher rememberLauncherForActivityResult3 = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult2, (Function1) rememberedValue54, composer6, 0);
            ActivityResultContracts.RequestPermission requestPermission = new ActivityResultContracts.RequestPermission();
            composer6.startReplaceGroup(-493113941);
            boolean changedInstance8 = composer6.changedInstance(context) | composer6.changed(mutableState42) | composer6.changed(mutableState43);
            Object rememberedValue55 = composer6.rememberedValue();
            if (changedInstance8 || rememberedValue55 == Composer.INSTANCE.getEmpty()) {
                rememberedValue55 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit SleepTabScreenBody$lambda$164$lambda$163;
                        SleepTabScreenBody$lambda$164$lambda$163 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$164$lambda$163(context, mutableState42, mutableState43, mutableState44, mutableState45, mutableState40, ((Boolean) obj3).booleanValue());
                        return SleepTabScreenBody$lambda$164$lambda$163;
                    }
                };
                composer6.updateRememberedValue(rememberedValue55);
            }
            composer6.endReplaceGroup();
            ManagedActivityResultLauncher rememberLauncherForActivityResult4 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (Function1) rememberedValue55, composer6, 0);
            Unit unit2 = Unit.INSTANCE;
            composer6.startReplaceGroup(-493107657);
            Object rememberedValue56 = composer6.rememberedValue();
            if (rememberedValue56 == Composer.INSTANCE.getEmpty()) {
                rememberedValue56 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$6$1(mutableState68, null);
                composer6.updateRememberedValue(rememberedValue56);
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue56, composer6, 6);
            Unit unit3 = Unit.INSTANCE;
            composer6.startReplaceGroup(-493102962);
            boolean changedInstance9 = composer6.changedInstance(context) | composer6.changed(mutableState42) | composer6.changed(mutableState43);
            Object rememberedValue57 = composer6.rememberedValue();
            if (changedInstance9 || rememberedValue57 == Composer.INSTANCE.getEmpty()) {
                rememberedValue57 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$7$1(context, mutableState42, mutableState43, null);
                composer6.updateRememberedValue(rememberedValue57);
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue57, composer6, 6);
            Unit unit4 = Unit.INSTANCE;
            composer6.startReplaceGroup(-493097950);
            boolean changedInstance10 = composer6.changedInstance(context);
            Object rememberedValue58 = composer6.rememberedValue();
            if (changedInstance10 || rememberedValue58 == Composer.INSTANCE.getEmpty()) {
                mutableState4 = mutableState40;
                obj = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$8$1(context, mutableState4, mutableState59, null);
                composer6.updateRememberedValue(obj);
            } else {
                obj = rememberedValue58;
                mutableState4 = mutableState40;
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj, composer6, 6);
            List<SleepEntryEntity> SleepTabScreenBody$lambda$15 = SleepTabScreenBody$lambda$1(produceState);
            composer6.startReplaceGroup(-493074769);
            boolean changed4 = composer6.changed(produceState) | composer6.changedInstance(context);
            Object rememberedValue59 = composer6.rememberedValue();
            if (changed4 || rememberedValue59 == Composer.INSTANCE.getEmpty()) {
                rememberedValue59 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$9$1(produceState, context, null);
                composer6.updateRememberedValue(rememberedValue59);
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(SleepTabScreenBody$lambda$15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue59, composer6, 0);
            Integer valueOf2 = Integer.valueOf(SleepTabScreenBody$lambda$56(mutableState42));
            Integer valueOf3 = Integer.valueOf(SleepTabScreenBody$lambda$60(mutableState43));
            composer6.startReplaceGroup(-493063826);
            boolean changedInstance11 = composer6.changedInstance(context) | composer6.changed(mutableState42) | composer6.changed(mutableState43);
            Object rememberedValue60 = composer6.rememberedValue();
            if (changedInstance11 || rememberedValue60 == Composer.INSTANCE.getEmpty()) {
                rememberedValue60 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$10$1(context, mutableState42, mutableState43, null);
                composer6.updateRememberedValue(rememberedValue60);
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf2, valueOf3, (Function2) rememberedValue60, composer6, 0);
            Object[] objArr15 = {Integer.valueOf(SleepTabScreenBody$lambda$56(mutableState42)), Integer.valueOf(SleepTabScreenBody$lambda$60(mutableState43)), Float.valueOf(SleepTabScreenBody$lambda$64(mutableState44)), Boolean.valueOf(SleepTabScreenBody$lambda$49(mutableState4))};
            composer6.startReplaceGroup(-493058681);
            boolean changedInstance12 = composer6.changedInstance(context) | composer6.changed(mutableState42) | composer6.changed(mutableState43);
            Object rememberedValue61 = composer6.rememberedValue();
            if (changedInstance12 || rememberedValue61 == Composer.INSTANCE.getEmpty()) {
                rememberedValue61 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$11$1(context, mutableState4, mutableState42, mutableState43, mutableState44, null);
                composer6.updateRememberedValue(rememberedValue61);
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(objArr15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue61, composer6, 0);
            ActivityResultContracts.RequestPermission requestPermission2 = new ActivityResultContracts.RequestPermission();
            composer6.startReplaceGroup(-493041834);
            final CoroutineScope coroutineScope6 = coroutineScope;
            final MutableState mutableState69 = mutableState2;
            boolean changedInstance13 = composer6.changedInstance(context) | composer6.changedInstance(coroutineScope6) | composer6.changed(mutableState69);
            Object rememberedValue62 = composer6.rememberedValue();
            if (changedInstance13 || rememberedValue62 == Composer.INSTANCE.getEmpty()) {
                rememberedValue62 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit SleepTabScreenBody$lambda$172$lambda$171;
                        SleepTabScreenBody$lambda$172$lambda$171 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$172$lambda$171(context, coroutineScope6, mutableState69, ((Boolean) obj3).booleanValue());
                        return SleepTabScreenBody$lambda$172$lambda$171;
                    }
                };
                composer6.updateRememberedValue(rememberedValue62);
            }
            composer6.endReplaceGroup();
            ManagedActivityResultLauncher rememberLauncherForActivityResult5 = ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission2, (Function1) rememberedValue62, composer6, 0);
            composer6.startReplaceGroup(-493016224);
            Object rememberedValue63 = composer6.rememberedValue();
            if (rememberedValue63 == Composer.INSTANCE.getEmpty()) {
                rememberedValue63 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer6.updateRememberedValue(rememberedValue63);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) rememberedValue63;
            composer6.endReplaceGroup();
            Unit unit5 = Unit.INSTANCE;
            composer6.startReplaceGroup(-493013652);
            final LifecycleOwner lifecycleOwner3 = lifecycleOwner;
            boolean changedInstance14 = composer6.changedInstance(context) | composer6.changedInstance(lifecycleOwner3);
            Object rememberedValue64 = composer6.rememberedValue();
            if (changedInstance14 || rememberedValue64 == Composer.INSTANCE.getEmpty()) {
                final MutableState mutableState70 = mutableState;
                final MutableState mutableState71 = mutableState4;
                rememberedValue64 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        DisposableEffectResult SleepTabScreenBody$lambda$179$lambda$178;
                        SleepTabScreenBody$lambda$179$lambda$178 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$179$lambda$178(LifecycleOwner.this, context, mutableState70, mutableState71, mutableState59, mutableIntState2, (DisposableEffectScope) obj3);
                        return SleepTabScreenBody$lambda$179$lambda$178;
                    }
                };
                composer6.updateRememberedValue(rememberedValue64);
            }
            composer6.endReplaceGroup();
            EffectsKt.DisposableEffect(unit5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue64, composer6, 6);
            Boolean valueOf4 = Boolean.valueOf(z);
            Boolean valueOf5 = Boolean.valueOf(SleepTabScreenBody$lambda$101(mutableState));
            composer6.startReplaceGroup(-492991027);
            boolean changedInstance15 = composer6.changedInstance(context);
            Object rememberedValue65 = composer6.rememberedValue();
            if (changedInstance15 || rememberedValue65 == Composer.INSTANCE.getEmpty()) {
                mutableState5 = mutableState60;
                mutableState6 = mutableState;
                z2 = z;
                rememberedValue65 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        DisposableEffectResult SleepTabScreenBody$lambda$183$lambda$182;
                        SleepTabScreenBody$lambda$183$lambda$182 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$183$lambda$182(context, z2, mutableIntState2, mutableState6, (DisposableEffectScope) obj3);
                        return SleepTabScreenBody$lambda$183$lambda$182;
                    }
                };
                composer6.updateRememberedValue(rememberedValue65);
            } else {
                mutableState5 = mutableState60;
                mutableState6 = mutableState;
                z2 = z;
            }
            composer6.endReplaceGroup();
            EffectsKt.DisposableEffect(valueOf4, valueOf5, (Function1) rememberedValue65, composer6, 6);
            Boolean valueOf6 = Boolean.valueOf(z2);
            Boolean valueOf7 = Boolean.valueOf(SleepTabScreenBody$lambda$101(mutableState6));
            Integer valueOf8 = Integer.valueOf(SleepTabScreenBody$lambda$174(mutableIntState2));
            composer6.startReplaceGroup(-492979151);
            boolean changedInstance16 = composer6.changedInstance(context);
            Object rememberedValue66 = composer6.rememberedValue();
            if (changedInstance16 || rememberedValue66 == Composer.INSTANCE.getEmpty()) {
                mutableState7 = mutableState69;
                mutableState8 = mutableState6;
                mutableState9 = mutableState68;
                mutableState10 = mutableState66;
                mutableState11 = mutableState42;
                z3 = z2;
                mutableState12 = mutableState5;
                rememberedValue66 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$14$1(z2, context, mutableState8, mutableState53, null);
                composer6.updateRememberedValue(rememberedValue66);
            } else {
                mutableState8 = mutableState6;
                mutableState11 = mutableState42;
                z3 = z2;
                mutableState12 = mutableState5;
                mutableState10 = mutableState66;
                mutableState7 = mutableState69;
                mutableState9 = mutableState68;
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf6, valueOf7, valueOf8, (Function2) rememberedValue66, composer6, 6);
            SleepCalendarHelper.MorningCommitment morningCommitment2 = morningCommitment;
            Object[] objArr16 = {SleepTabScreenBody$lambda$1(produceState), Boolean.valueOf(SleepTabScreenBody$lambda$85(mutableState49)), Boolean.valueOf(SleepTabScreenBody$lambda$49(mutableState4)), morningCommitment2};
            composer6.startReplaceGroup(-492951554);
            boolean changed5 = composer6.changed(produceState) | composer6.changedInstance(morningCommitment2) | composer6.changedInstance(context) | composer6.changed(mutableState11) | composer6.changed(mutableState43);
            Object rememberedValue67 = composer6.rememberedValue();
            if (changed5 || rememberedValue67 == Composer.INSTANCE.getEmpty()) {
                rememberedValue67 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$15$1(morningCommitment2, context, produceState, mutableState52, mutableState49, mutableState4, mutableState11, mutableState43, mutableState44, null);
                composer6.updateRememberedValue(rememberedValue67);
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(objArr16, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue67, composer6, 0);
            Boolean valueOf9 = Boolean.valueOf(SleepTabScreenBody$lambda$49(mutableState4));
            Long valueOf10 = Long.valueOf(SleepTabScreenBody$lambda$156(mutableState67));
            composer6.startReplaceGroup(-492930152);
            boolean changedInstance17 = composer6.changedInstance(context);
            Object rememberedValue68 = composer6.rememberedValue();
            if (changedInstance17 || rememberedValue68 == Composer.INSTANCE.getEmpty()) {
                rememberedValue68 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$morningDiagnostics$2$1(context, null);
                composer6.updateRememberedValue(rememberedValue68);
            }
            composer6.endReplaceGroup();
            State produceState2 = SnapshotStateKt.produceState(null, valueOf9, valueOf10, (Function2) rememberedValue68, composer6, 6);
            Boolean valueOf11 = Boolean.valueOf(SleepTabScreenBody$lambda$49(mutableState4));
            composer6.startReplaceGroup(-492925767);
            boolean changedInstance18 = composer6.changedInstance(context);
            Object rememberedValue69 = composer6.rememberedValue();
            if (changedInstance18 || rememberedValue69 == Composer.INSTANCE.getEmpty()) {
                mutableState13 = mutableState63;
                mutableState14 = mutableState65;
                rememberedValue69 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$16$1(context, mutableState4, mutableState67, mutableState41, null);
                composer6.updateRememberedValue(rememberedValue69);
            } else {
                mutableState13 = mutableState63;
                mutableState14 = mutableState65;
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue69, composer6, 0);
            Unit unit6 = Unit.INSTANCE;
            composer6.startReplaceGroup(-492890053);
            boolean changedInstance19 = composer6.changedInstance(context);
            Object rememberedValue70 = composer6.rememberedValue();
            if (changedInstance19 || rememberedValue70 == Composer.INSTANCE.getEmpty()) {
                rememberedValue70 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$17$1(context, mutableState59, null);
                composer6.updateRememberedValue(rememberedValue70);
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue70, composer6, 6);
            Boolean valueOf12 = Boolean.valueOf(SleepTabScreenBody$lambda$4(mutableState3));
            composer6.startReplaceGroup(-492849789);
            boolean changed6 = composer6.changed(mutableState30);
            HealthConnectManager healthConnectManager4 = healthConnectManager;
            ExerciseTrackerUseCases exerciseTrackerUseCases6 = exerciseTrackerUseCases;
            boolean changedInstance20 = changed6 | composer6.changedInstance(healthConnectManager4) | composer6.changedInstance(exerciseTrackerUseCases6) | composer6.changedInstance(context);
            Object rememberedValue71 = composer6.rememberedValue();
            if (changedInstance20 || rememberedValue71 == Composer.INSTANCE.getEmpty()) {
                rememberedValue71 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$18$1(healthConnectManager4, mutableState30, mutableState3, mutableState29, exerciseTrackerUseCases6, context, null);
                composer6.updateRememberedValue(rememberedValue71);
            }
            composer6.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue71, composer6, 0);
            composer6.startReplaceGroup(-492690637);
            if (SleepTabScreenBody$lambda$17(mutableState31)) {
                composer6.startReplaceGroup(-492693806);
                Object rememberedValue72 = composer6.rememberedValue();
                if (rememberedValue72 == Composer.INSTANCE.getEmpty()) {
                    mutableState27 = mutableState31;
                    rememberedValue72 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit SleepTabScreenBody$lambda$197$lambda$196;
                            SleepTabScreenBody$lambda$197$lambda$196 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$197$lambda$196(MutableState.this);
                            return SleepTabScreenBody$lambda$197$lambda$196;
                        }
                    };
                    composer6.updateRememberedValue(rememberedValue72);
                } else {
                    mutableState27 = mutableState31;
                }
                composer6.endReplaceGroup();
                exerciseTrackerUseCases2 = exerciseTrackerUseCases6;
                mutableState15 = mutableState30;
                healthConnectManager2 = healthConnectManager4;
                mutableState19 = mutableState27;
                mutableState16 = mutableState4;
                mutableState17 = mutableState59;
                i5 = 0;
                mutableState18 = mutableState43;
                state = produceState;
                composer3 = composer6;
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue72, ComposableLambdaKt.rememberComposableLambda(-515204640, true, new SleepTabScreenBodyKt$SleepTabScreenBody$20(mutableState34, mutableState35, mutableState36, context, mutableState37, mutableState38, mutableState39, coroutineScope6, exerciseTrackerUseCases6, mutableState27), composer6, 54), null, ComposableLambdaKt.rememberComposableLambda(-944862946, true, new SleepTabScreenBodyKt$SleepTabScreenBody$21(mutableState27), composer6, 54), null, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7548getLambda6$app_sideload(), ComposableLambdaKt.rememberComposableLambda(-1589350405, true, new SleepTabScreenBodyKt$SleepTabScreenBody$22(mutableState36, mutableState39, mutableState34, mutableState35, mutableState37, mutableState38), composer6, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer3, 1772598, 0, 16276);
            } else {
                i5 = 0;
                mutableState15 = mutableState30;
                exerciseTrackerUseCases2 = exerciseTrackerUseCases6;
                healthConnectManager2 = healthConnectManager4;
                mutableState16 = mutableState4;
                mutableState17 = mutableState59;
                mutableState18 = mutableState43;
                state = produceState;
                composer3 = composer6;
                mutableState19 = mutableState31;
            }
            composer3.endReplaceGroup();
            Composer composer7 = composer3;
            Modifier modifier7 = modifier3;
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(modifier7, 0.0f, 1, null), 0.0f, 1, null), ScrollKt.rememberScrollState(i5, composer7, i5, 1), false, null, false, 14, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(14));
            ComposerKt.sourceInformationMarkerStart(composer7, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer7, 6);
            ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer7, i5);
            CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer7, verticalScroll$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer7, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer7.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer7.startReusableNode();
            if (composer7.getInserting()) {
                composer7.createNode(constructor);
            } else {
                composer7.useNode();
            }
            Composer m3336constructorimpl = Updater.m3336constructorimpl(composer7);
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer7, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer7.startReplaceGroup(-1961495501);
            if (SleepMorningDiagnostics.INSTANCE.shouldShowCard(context) && (SleepTabScreenBody$lambda$187 = SleepTabScreenBody$lambda$187(produceState2)) != null) {
                SleepMorningDiagnosticsCardKt.SleepMorningDiagnosticsCard(SleepTabScreenBody$lambda$187, null, composer7, i5, 2);
                Unit unit7 = Unit.INSTANCE;
                Unit unit8 = Unit.INSTANCE;
            }
            composer7.endReplaceGroup();
            composer7.startReplaceGroup(-1961487879);
            if (SleepTabScreenBody$lambda$159(mutableState9)) {
                str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str3 = "C88@4444L9:Column.kt#2w3rfo";
                str4 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
                modifier4 = modifier7;
                r1 = 1;
                colorScheme = colorScheme3;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(colorScheme3.getErrorContainer(), 0L, 0L, 0L, composer7, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1285767920, true, new SleepTabScreenBodyKt$SleepTabScreenBody$23$2(colorScheme, context, mutableState9), composer7, 54), composer7, 196614, 26);
            } else {
                str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str3 = "C88@4444L9:Column.kt#2w3rfo";
                modifier4 = modifier7;
                r1 = 1;
                str4 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
                colorScheme = colorScheme3;
            }
            composer7.endReplaceGroup();
            final ColorScheme colorScheme4 = colorScheme;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, r1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(colorScheme.getSurfaceContainerHigh(), 0L, 0L, 0L, composer7, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1060227650, r1, new SleepTabScreenBodyKt$SleepTabScreenBody$23$3(colorScheme4, mutableState11, mutableState18, context, status, rememberLauncherForActivityResult4, z3, rememberLauncherForActivityResult2, mutableState7, coroutineScope6, rememberLauncherForActivityResult5, rememberLauncherForActivityResult3, mutableState58, mutableState16, mutableState44, mutableState45, mutableState46, mutableState47, mutableState48, mutableState41, mutableState67, mutableState17, mutableState8, mutableState12, mutableState53, mutableIntState2, mutableState52, mutableState49, mutableState50, mutableState57), composer7, 54), composer7, 196614, 26);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, r1, null);
            String str7 = str4;
            ComposerKt.sourceInformationMarkerStart(composer7, -483455358, str7);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer7, 0);
            String str8 = str;
            ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, str8);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer7.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer7, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            String str9 = str2;
            ComposerKt.sourceInformationMarkerStart(composer7, -692256719, str9);
            if (!(composer7.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer7.startReusableNode();
            if (composer7.getInserting()) {
                composer7.createNode(constructor2);
            } else {
                composer7.useNode();
            }
            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer7);
            Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            String str10 = str3;
            ComposerKt.sourceInformationMarkerStart(composer7, -384784025, str10);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            TabUiKt.TabHeroHeader("Sleep", "History, stages, and recovery", null, null, composer7, 54, 12);
            Modifier m688paddingqDBjuR0$default = PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(12), 0.0f, 0.0f, 13, null);
            ComposerKt.sourceInformationMarkerStart(composer7, -483455358, str7);
            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer7, 0);
            ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, str8);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer7, m688paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer7, -692256719, str9);
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
            Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer7, -384784025, str10);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer7, 0, 1), false, null, false, 14, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(composer7, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer7, 6);
            ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, str8);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer7, horizontalScroll$default);
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
            Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer7);
            Updater.m3343setimpl(m3336constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer7, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (sleepEntryEntity == null || (str5 = SleepFormattersKt.formatDurationMinutes(sleepEntryEntity.getTotalSleepMin())) == null) {
                str5 = "—";
            }
            SleepTabComponentsKt.SleepStatChip("Last night", str5, composer7, 6);
            if (d != null) {
                str6 = ((int) d.doubleValue()) + "/100";
            }
            str6 = "—";
            SleepTabComponentsKt.SleepStatChip("7-night avg", str6, composer7, 6);
            SleepTabComponentsKt.SleepStatChip("Nights", String.valueOf(RangesKt.coerceAtMost(SleepTabScreenBody$lambda$1(state).size(), 999)), composer7, 6);
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
            ComposerKt.sourceInformationMarkerEnd(composer7);
            composer7.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            HealthConnectSleepBannerKt.HealthConnectSleepBanner(healthConnectManager2, SleepTabScreenBody$lambda$4(mutableState3), null, composer7, 0, 4);
            composer7.startReplaceGroup(-1960593575);
            if (!SleepTabScreenBody$lambda$1(state).isEmpty()) {
                SleepTrendCardKt.SleepTrendCard(SleepTabScreenBody$lambda$1(state), null, composer7, 0, 2);
            }
            composer7.endReplaceGroup();
            BatteryOptimizationNudgeKt.BatteryOptimizationCard(SleepTabScreenBody$lambda$49(mutableState16) || SleepOvernightStore.INSTANCE.isRecoverableStale(context), false, null, composer7, 0, 6);
            composer7.startReplaceGroup(-1960584728);
            if (SleepTabScreenBody$lambda$1(state).size() >= 3) {
                final SleepTrendAnalysis.TrendSummary summarize = SleepTrendAnalysis.INSTANCE.summarize(SleepTabScreenBody$lambda$1(state), SleepTrendAnalysis.Window.Week);
                List take2 = CollectionsKt.take(SleepTabScreenBody$lambda$1(state), 7);
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = take2.iterator();
                while (it4.hasNext()) {
                    Integer snoreEvents = ((SleepEntryEntity) it4.next()).getSnoreEvents();
                    if (snoreEvents != null) {
                        arrayList3.add(snoreEvents);
                    }
                }
                final int sumOfInt = CollectionsKt.sumOfInt(arrayList3);
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-899905518, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$5
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer8, Integer num) {
                        invoke(columnScope, composer8, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer8, int i7) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i7 & 17) == 16 && composer8.getSkipping()) {
                            composer8.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-899905518, i7, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous>.<anonymous> (SleepTabScreenBody.kt:1284)");
                        }
                        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14));
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(4));
                        SleepTrendAnalysis.TrendSummary trendSummary = SleepTrendAnalysis.TrendSummary.this;
                        int i8 = sumOfInt;
                        ComposerKt.sourceInformationMarkerStart(composer8, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getStart(), composer8, 6);
                        ComposerKt.sourceInformationMarkerStart(composer8, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer8, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer8.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer8, m684padding3ABfNKs);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer8.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer8.startReusableNode();
                        if (composer8.getInserting()) {
                            composer8.createNode(constructor5);
                        } else {
                            composer8.useNode();
                        }
                        Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer8);
                        Updater.m3343setimpl(m3336constructorimpl5, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m3343setimpl(m3336constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer8, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g("Weekly report", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer8, 196614, 0, 131038);
                        String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(trendSummary.getAvgSleepHours())}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        Object avgQuality = trendSummary.getAvgQuality();
                        if (avgQuality == null) {
                            avgQuality = "—";
                        }
                        TextKt.m2376Text4IGK_g(format + " h avg · " + avgQuality + "/100 quality", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getBodySmall(), composer8, 0, 0, 65534);
                        composer8.startReplaceGroup(-1115456941);
                        if (i8 > 0) {
                            TextKt.m2376Text4IGK_g("Snore events: " + i8, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getBodySmall(), composer8, 0, 0, 65534);
                        }
                        composer8.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        composer8.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer7, 54), composer7, 196614, 30);
            }
            composer7.endReplaceGroup();
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(Color.m3842copywmQWz5c$default(colorScheme4.getPrimaryContainer(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, composer7, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1862774581, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$6
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer8, Integer num) {
                    invoke(columnScope, composer8, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer8, int i7) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i7 & 17) == 16 && composer8.getSkipping()) {
                        composer8.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1862774581, i7, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous>.<anonymous> (SleepTabScreenBody.kt:1301)");
                    }
                    Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                    SleepDebtTracker.Snapshot snapshot3 = SleepDebtTracker.Snapshot.this;
                    final ColorScheme colorScheme5 = colorScheme4;
                    ComposerKt.sourceInformationMarkerStart(composer8, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getStart(), composer8, 6);
                    ComposerKt.sourceInformationMarkerStart(composer8, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer8, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer8.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer8, m684padding3ABfNKs);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer8.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer8.startReusableNode();
                    if (composer8.getInserting()) {
                        composer8.createNode(constructor5);
                    } else {
                        composer8.useNode();
                    }
                    Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer8);
                    Updater.m3343setimpl(m3336constructorimpl5, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m3343setimpl(m3336constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer8, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                    TextKt.m2376Text4IGK_g("Sleep debt (7 nights)", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getTitleSmall(), composer8, 196614, 0, 65502);
                    TextKt.m2376Text4IGK_g(snapshot3.getSummary(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getBodyMedium(), composer8, 0, 0, 65534);
                    final String suggestedBedtimeLabel = snapshot3.getSuggestedBedtimeLabel();
                    composer8.startReplaceGroup(-1115429891);
                    if (suggestedBedtimeLabel != null) {
                        SurfaceKt.m2226SurfaceT9BRK9s(null, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(8)), Color.m3842copywmQWz5c$default(colorScheme5.getPrimaryContainer(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1469064910, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$6$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num) {
                                invoke(composer9, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer9, int i8) {
                                if ((i8 & 3) != 2 || !composer9.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1469064910, i8, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepTabScreenBody.kt:1313)");
                                    }
                                    TextKt.m2376Text4IGK_g("Tonight · bed by " + suggestedBedtimeLabel, PaddingKt.m685paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(10), Dp.m6303constructorimpl(8)), colorScheme5.getOnPrimaryContainer(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer9, MaterialTheme.$stable).getLabelLarge(), composer9, 196656, 0, 65496);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer9.skipToGroupEnd();
                            }
                        }, composer8, 54), composer8, 12582912, 121);
                    }
                    composer8.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer8);
                    composer8.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer8);
                    ComposerKt.sourceInformationMarkerEnd(composer8);
                    ComposerKt.sourceInformationMarkerEnd(composer8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer7, 54), composer7, 196614, 26);
            composer7.startReplaceGroup(-1960509848);
            if (snapshot2.getNightsUsed() >= 3) {
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-706974317, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$7
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer8, Integer num) {
                        invoke(columnScope, composer8, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer8, int i7) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i7 & 17) == 16 && composer8.getSkipping()) {
                            composer8.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-706974317, i7, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous>.<anonymous> (SleepTabScreenBody.kt:1327)");
                        }
                        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                        SleepConsistencyScorer.Snapshot snapshot3 = SleepConsistencyScorer.Snapshot.this;
                        ComposerKt.sourceInformationMarkerStart(composer8, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getStart(), composer8, 6);
                        ComposerKt.sourceInformationMarkerStart(composer8, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer8, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer8.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer8, m684padding3ABfNKs);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer8.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer8.startReusableNode();
                        if (composer8.getInserting()) {
                            composer8.createNode(constructor5);
                        } else {
                            composer8.useNode();
                        }
                        Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer8);
                        Updater.m3343setimpl(m3336constructorimpl5, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m3343setimpl(m3336constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer8, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g("Bedtime consistency", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getTitleSmall(), composer8, 196614, 0, 65502);
                        TextKt.m2376Text4IGK_g(snapshot3.getConsistencyScore() + "/100 · " + snapshot3.getSummary(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getBodyMedium(), composer8, 0, 0, 65534);
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        composer8.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer7, 54), composer7, 196614, 30);
            }
            composer7.endReplaceGroup();
            composer7.startReplaceGroup(-1960486435);
            if (!list.isEmpty()) {
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-514043116, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$8
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer8, Integer num) {
                        invoke(columnScope, composer8, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer8, int i7) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i7 & 17) == 16 && composer8.getSkipping()) {
                            composer8.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-514043116, i7, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous>.<anonymous> (SleepTabScreenBody.kt:1343)");
                        }
                        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                        List<Pair<SleepEntryEntity, SleepNapDetector.NapHint>> list2 = list;
                        ComposerKt.sourceInformationMarkerStart(composer8, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getStart(), composer8, 6);
                        ComposerKt.sourceInformationMarkerStart(composer8, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer8, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer8.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer8, m684padding3ABfNKs);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer8, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer8.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer8.startReusableNode();
                        if (composer8.getInserting()) {
                            composer8.createNode(constructor5);
                        } else {
                            composer8.useNode();
                        }
                        Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer8);
                        Updater.m3343setimpl(m3336constructorimpl5, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m3343setimpl(m3336constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer8, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g("Daytime naps detected", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer8, MaterialTheme.$stable).getTitleSmall(), composer8, 196614, 0, 65502);
                        Composer composer9 = composer8;
                        composer9.startReplaceGroup(-1115367704);
                        Iterator<T> it5 = list2.iterator();
                        while (it5.hasNext()) {
                            Pair pair2 = (Pair) it5.next();
                            SleepEntryEntity sleepEntryEntity3 = (SleepEntryEntity) pair2.component1();
                            SleepNapDetector.NapHint napHint = (SleepNapDetector.NapHint) pair2.component2();
                            TextKt.m2376Text4IGK_g(SleepFormattersKt.formatSleepRange$default(sleepEntryEntity3.getStartTimeMs(), sleepEntryEntity3.getEndTimeMs(), null, 4, null) + " — " + napHint.getReason(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer9, MaterialTheme.$stable).getBodySmall(), composer8, 0, 0, 65534);
                            composer9 = composer8;
                        }
                        composer8.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        composer8.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        ComposerKt.sourceInformationMarkerEnd(composer8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer7, 54), composer7, 196614, 30);
            }
            composer7.endReplaceGroup();
            composer7.startReplaceGroup(-1960459426);
            Object rememberedValue73 = composer7.rememberedValue();
            if (rememberedValue73 == Composer.INSTANCE.getEmpty()) {
                rememberedValue73 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(BedtimeReminderPrefs.INSTANCE.isEnabled(context)), null, 2, null);
                composer7.updateRememberedValue(rememberedValue73);
            }
            MutableState mutableState72 = (MutableState) rememberedValue73;
            composer7.endReplaceGroup();
            composer7.startReplaceGroup(-1960456484);
            Object rememberedValue74 = composer7.rememberedValue();
            if (rememberedValue74 == Composer.INSTANCE.getEmpty()) {
                rememberedValue74 = SnapshotIntStateKt.mutableIntStateOf(BedtimeReminderPrefs.INSTANCE.hour(context));
                composer7.updateRememberedValue(rememberedValue74);
            }
            MutableIntState mutableIntState3 = (MutableIntState) rememberedValue74;
            composer7.endReplaceGroup();
            composer7.startReplaceGroup(-1960453538);
            Object rememberedValue75 = composer7.rememberedValue();
            if (rememberedValue75 == Composer.INSTANCE.getEmpty()) {
                rememberedValue75 = SnapshotIntStateKt.mutableIntStateOf(BedtimeReminderPrefs.INSTANCE.minute(context));
                composer7.updateRememberedValue(rememberedValue75);
            }
            MutableIntState mutableIntState4 = (MutableIntState) rememberedValue75;
            composer7.endReplaceGroup();
            composer7.startReplaceGroup(-1960450592);
            Object rememberedValue76 = composer7.rememberedValue();
            if (rememberedValue76 == Composer.INSTANCE.getEmpty()) {
                rememberedValue76 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(BedtimeReminderPrefs.INSTANCE.windDownDim(context)), null, 2, null);
                composer7.updateRememberedValue(rememberedValue76);
            }
            MutableState mutableState73 = (MutableState) rememberedValue76;
            composer7.endReplaceGroup();
            composer7.startReplaceGroup(-1960447584);
            Object rememberedValue77 = composer7.rememberedValue();
            if (rememberedValue77 == Composer.INSTANCE.getEmpty()) {
                rememberedValue77 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(BedtimeReminderPrefs.INSTANCE.windDownDnd(context)), null, 2, null);
                composer7.updateRememberedValue(rememberedValue77);
            }
            MutableState mutableState74 = (MutableState) rememberedValue77;
            composer7.endReplaceGroup();
            composer7.startReplaceGroup(-1960444505);
            Object rememberedValue78 = composer7.rememberedValue();
            if (rememberedValue78 == Composer.INSTANCE.getEmpty()) {
                obj2 = null;
                rememberedValue78 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(BedtimeReminderPrefs.INSTANCE.windDownPauseMedia(context)), null, 2, null);
                composer7.updateRememberedValue(rememberedValue78);
            } else {
                obj2 = null;
            }
            composer7.endReplaceGroup();
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj2), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2055705782, true, new SleepTabScreenBodyKt$SleepTabScreenBody$23$9(context, mutableState72, mutableIntState3, mutableIntState4, (MutableState) rememberedValue78, mutableState74, mutableState73), composer7, 54), composer7, 196614, 30);
            composer7.startReplaceGroup(-1960300789);
            if (SleepTabScreenBody$lambda$7(mutableState29)) {
                ProgressIndicatorKt.m2059LinearProgressIndicatorrIrjwxo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, 0, 0.0f, composer7, 6, 30);
                SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(4)), composer7, 6);
            }
            composer7.endReplaceGroup();
            composer7.startReplaceGroup(-1960294293);
            List createListBuilder = CollectionsKt.createListBuilder();
            composer7.startReplaceGroup(1731277359);
            Object rememberedValue79 = composer7.rememberedValue();
            if (rememberedValue79 == Composer.INSTANCE.getEmpty()) {
                mutableState20 = mutableState19;
                rememberedValue79 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SleepTabScreenBody$lambda$235$lambda$231$lambda$224$lambda$223;
                        SleepTabScreenBody$lambda$235$lambda$231$lambda$224$lambda$223 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$231$lambda$224$lambda$223(MutableState.this);
                        return SleepTabScreenBody$lambda$235$lambda$231$lambda$224$lambda$223;
                    }
                };
                composer7.updateRememberedValue(rememberedValue79);
            } else {
                mutableState20 = mutableState19;
            }
            composer7.endReplaceGroup();
            createListBuilder.add(TuplesKt.to("Add manually", (Function0) rememberedValue79));
            composer7.startReplaceGroup(1731279353);
            boolean changedInstance21 = composer7.changedInstance(rememberLauncherForActivityResult);
            Object rememberedValue80 = composer7.rememberedValue();
            if (changedInstance21 || rememberedValue80 == Composer.INSTANCE.getEmpty()) {
                rememberedValue80 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SleepTabScreenBody$lambda$235$lambda$231$lambda$226$lambda$225;
                        SleepTabScreenBody$lambda$235$lambda$231$lambda$226$lambda$225 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$231$lambda$226$lambda$225(ManagedActivityResultLauncher.this);
                        return SleepTabScreenBody$lambda$235$lambda$231$lambda$226$lambda$225;
                    }
                };
                composer7.updateRememberedValue(rememberedValue80);
            }
            composer7.endReplaceGroup();
            createListBuilder.add(TuplesKt.to("CSV import", (Function0) rememberedValue80));
            composer7.startReplaceGroup(1731283892);
            final HealthConnectManager healthConnectManager5 = healthConnectManager2;
            final ExerciseTrackerUseCases exerciseTrackerUseCases7 = exerciseTrackerUseCases2;
            boolean changedInstance22 = composer7.changedInstance(healthConnectManager5) | composer7.changedInstance(context) | composer7.changedInstance(coroutineScope6) | composer7.changedInstance(exerciseTrackerUseCases7);
            Object rememberedValue81 = composer7.rememberedValue();
            if (changedInstance22 || rememberedValue81 == Composer.INSTANCE.getEmpty()) {
                final MutableState mutableState75 = mutableState3;
                rememberedValue81 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SleepTabScreenBody$lambda$235$lambda$231$lambda$228$lambda$227;
                        SleepTabScreenBody$lambda$235$lambda$231$lambda$228$lambda$227 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$231$lambda$228$lambda$227(HealthConnectManager.this, context, coroutineScope6, mutableState75, mutableState29, exerciseTrackerUseCases7);
                        return SleepTabScreenBody$lambda$235$lambda$231$lambda$228$lambda$227;
                    }
                };
                composer7.updateRememberedValue(rememberedValue81);
            }
            composer7.endReplaceGroup();
            createListBuilder.add(TuplesKt.to("Merge Health Connect", (Function0) rememberedValue81));
            composer7.startReplaceGroup(1731286318);
            final MutableState mutableState76 = mutableState15;
            boolean changed7 = composer7.changed(mutableState76) | composer7.changedInstance(context);
            Object rememberedValue82 = composer7.rememberedValue();
            if (changed7 || rememberedValue82 == Composer.INSTANCE.getEmpty()) {
                rememberedValue82 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SleepTabScreenBody$lambda$235$lambda$231$lambda$230$lambda$229;
                        SleepTabScreenBody$lambda$235$lambda$231$lambda$230$lambda$229 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$231$lambda$230$lambda$229(context, mutableState76);
                        return SleepTabScreenBody$lambda$235$lambda$231$lambda$230$lambda$229;
                    }
                };
                composer7.updateRememberedValue(rememberedValue82);
            }
            composer7.endReplaceGroup();
            createListBuilder.add(TuplesKt.to("Reset auto-fetch", (Function0) rememberedValue82));
            List build = CollectionsKt.build(createListBuilder);
            composer7.endReplaceGroup();
            SleepTabComponentsKt.FlowRowMini(build, composer7, 0);
            if (SleepTabScreenBody$lambda$1(state).isEmpty()) {
                composer7.startReplaceGroup(-638993022);
                exerciseTrackerUseCases3 = exerciseTrackerUseCases7;
                coroutineScope2 = coroutineScope6;
                colorScheme2 = colorScheme4;
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(colorScheme4.getSurfaceContainerHigh(), 0L, 0L, 0L, composer7, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-128180714, true, new SleepTabScreenBodyKt$SleepTabScreenBody$23$11(healthConnectManager5, context, coroutineScope2, exerciseTrackerUseCases3, mutableState3, mutableState29, mutableState20), composer7, 54), composer7, 196614, 26);
                composer7.endReplaceGroup();
                mutableState21 = mutableState33;
            } else {
                exerciseTrackerUseCases3 = exerciseTrackerUseCases7;
                coroutineScope2 = coroutineScope6;
                colorScheme2 = colorScheme4;
                composer7.startReplaceGroup(-637933442);
                for (final SleepEntryEntity sleepEntryEntity3 : CollectionsKt.take(SleepTabScreenBody$lambda$1(state), 28)) {
                    composer7.startReplaceGroup(1731333394);
                    boolean changedInstance23 = composer7.changedInstance(sleepEntryEntity3);
                    Object rememberedValue83 = composer7.rememberedValue();
                    if (changedInstance23 || rememberedValue83 == Composer.INSTANCE.getEmpty()) {
                        mutableState22 = mutableState33;
                        rememberedValue83 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit SleepTabScreenBody$lambda$235$lambda$234$lambda$233$lambda$232;
                                SleepTabScreenBody$lambda$235$lambda$234$lambda$233$lambda$232 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$235$lambda$234$lambda$233$lambda$232(SleepEntryEntity.this, mutableState22);
                                return SleepTabScreenBody$lambda$235$lambda$234$lambda$233$lambda$232;
                            }
                        };
                        composer7.updateRememberedValue(rememberedValue83);
                    } else {
                        mutableState22 = mutableState33;
                    }
                    composer7.endReplaceGroup();
                    SleepTabComponentsKt.SleepNightRow(sleepEntryEntity3, (Function0) rememberedValue83, composer7, 0);
                    mutableState33 = mutableState22;
                }
                mutableState21 = mutableState33;
                composer7.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer7);
            composer7.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            SleepEntryEntity SleepTabScreenBody$lambda$20 = SleepTabScreenBody$lambda$20(mutableState21);
            composer7.startReplaceGroup(-491253929);
            Object rememberedValue84 = composer7.rememberedValue();
            if (rememberedValue84 == Composer.INSTANCE.getEmpty()) {
                rememberedValue84 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SleepTabScreenBody$lambda$237$lambda$236;
                        SleepTabScreenBody$lambda$237$lambda$236 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$237$lambda$236(MutableState.this);
                        return SleepTabScreenBody$lambda$237$lambda$236;
                    }
                };
                composer7.updateRememberedValue(rememberedValue84);
            }
            Function0 function02 = (Function0) rememberedValue84;
            composer7.endReplaceGroup();
            final SleepEntryEntity SleepTabScreenBody$lambda$202 = SleepTabScreenBody$lambda$20(mutableState21);
            composer7.startReplaceGroup(-491251823);
            if (SleepTabScreenBody$lambda$202 == null) {
                exerciseTrackerUseCases4 = exerciseTrackerUseCases3;
                coroutineScope3 = coroutineScope2;
                function0 = null;
            } else {
                composer7.startReplaceGroup(-1960229301);
                coroutineScope3 = coroutineScope2;
                exerciseTrackerUseCases4 = exerciseTrackerUseCases3;
                boolean changedInstance24 = composer7.changedInstance(coroutineScope3) | composer7.changedInstance(exerciseTrackerUseCases4) | composer7.changedInstance(SleepTabScreenBody$lambda$202);
                Object rememberedValue85 = composer7.rememberedValue();
                if (changedInstance24 || rememberedValue85 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue85 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit SleepTabScreenBody$lambda$240$lambda$239$lambda$238;
                            SleepTabScreenBody$lambda$240$lambda$239$lambda$238 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$240$lambda$239$lambda$238(CoroutineScope.this, exerciseTrackerUseCases4, SleepTabScreenBody$lambda$202, mutableState21);
                            return SleepTabScreenBody$lambda$240$lambda$239$lambda$238;
                        }
                    };
                    composer7.updateRememberedValue(rememberedValue85);
                }
                composer7.endReplaceGroup();
                function0 = (Function0) rememberedValue85;
            }
            composer7.endReplaceGroup();
            composer7.startReplaceGroup(-491244401);
            boolean changedInstance25 = composer7.changedInstance(coroutineScope3) | composer7.changedInstance(exerciseTrackerUseCases4);
            Object rememberedValue86 = composer7.rememberedValue();
            if (changedInstance25 || rememberedValue86 == Composer.INSTANCE.getEmpty()) {
                rememberedValue86 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        Unit SleepTabScreenBody$lambda$242$lambda$241;
                        SleepTabScreenBody$lambda$242$lambda$241 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$242$lambda$241(CoroutineScope.this, exerciseTrackerUseCases4, mutableState21, (SleepEntryEntity) obj3);
                        return SleepTabScreenBody$lambda$242$lambda$241;
                    }
                };
                composer7.updateRememberedValue(rememberedValue86);
            }
            composer7.endReplaceGroup();
            SleepNightDetailSheetKt.SleepNightDetailSheet(SleepTabScreenBody$lambda$20, function02, function0, (Function1) rememberedValue86, composer7, 48, 0);
            composer7.startReplaceGroup(-491227735);
            if (SleepTabScreenBody$lambda$126(mutableState17)) {
                composer7.startReplaceGroup(-491235152);
                Object rememberedValue87 = composer7.rememberedValue();
                if (rememberedValue87 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue87 = Long.valueOf(SleepOvernightStore.INSTANCE.startedAtMs(context));
                    composer7.updateRememberedValue(rememberedValue87);
                }
                final long longValue = ((Number) rememberedValue87).longValue();
                composer7.endReplaceGroup();
                composer7.startReplaceGroup(-491232718);
                Object rememberedValue88 = composer7.rememberedValue();
                if (rememberedValue88 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue88 = Long.valueOf(SleepOvernightStore.INSTANCE.alarmTargetMs(context));
                    composer7.updateRememberedValue(rememberedValue88);
                }
                final long longValue2 = ((Number) rememberedValue88).longValue();
                composer7.endReplaceGroup();
                Boolean valueOf13 = Boolean.valueOf(SleepTabScreenBody$lambda$126(mutableState17));
                composer7.startReplaceGroup(-491228349);
                boolean changedInstance26 = composer7.changedInstance(context);
                Object rememberedValue89 = composer7.rememberedValue();
                if (changedInstance26 || rememberedValue89 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue89 = (Function2) new SleepTabScreenBodyKt$SleepTabScreenBody$recoverableSampleCount$2$1(context, null);
                    composer7.updateRememberedValue(rememberedValue89);
                }
                composer7.endReplaceGroup();
                State produceState3 = SnapshotStateKt.produceState(0, valueOf13, (Function2<? super ProduceStateScope<int>, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue89, composer7, 6);
                Object[] objArr17 = {Boolean.valueOf(SleepTabScreenBody$lambda$126(mutableState17))};
                composer7.startReplaceGroup(-491223209);
                Object rememberedValue90 = composer7.rememberedValue();
                if (rememberedValue90 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue90 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState SleepTabScreenBody$lambda$248$lambda$247;
                            SleepTabScreenBody$lambda$248$lambda$247 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$248$lambda$247(longValue, longValue2);
                            return SleepTabScreenBody$lambda$248$lambda$247;
                        }
                    };
                    composer7.updateRememberedValue(rememberedValue90);
                }
                composer7.endReplaceGroup();
                MutableState mutableState77 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr17, (Saver) null, (String) null, (Function0) rememberedValue90, composer7, 3072, 6);
                composer7.startReplaceGroup(-491214647);
                Object rememberedValue91 = composer7.rememberedValue();
                if (rememberedValue91 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue91 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer7.updateRememberedValue(rememberedValue91);
                }
                MutableState mutableState78 = (MutableState) rememberedValue91;
                composer7.endReplaceGroup();
                boolean SleepTabScreenBody$lambda$126 = SleepTabScreenBody$lambda$126(mutableState17);
                composer7.startReplaceGroup(-491212323);
                boolean changed8 = composer7.changed(SleepTabScreenBody$lambda$126);
                Object rememberedValue92 = composer7.rememberedValue();
                if (changed8 || rememberedValue92 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue92 = SleepAlarmAudit.INSTANCE.formatWakeLine(context);
                    composer7.updateRememberedValue(rememberedValue92);
                }
                String str11 = (String) rememberedValue92;
                composer7.endReplaceGroup();
                boolean SleepTabScreenBody$lambda$1262 = SleepTabScreenBody$lambda$126(mutableState17);
                composer7.startReplaceGroup(-491209281);
                boolean changed9 = composer7.changed(SleepTabScreenBody$lambda$1262);
                Object rememberedValue93 = composer7.rememberedValue();
                if (changed9 || rememberedValue93 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue93 = SleepAlarmAudit.INSTANCE.smartAlarmUnavailableMessage(context);
                    composer7.updateRememberedValue(rememberedValue93);
                }
                String str12 = (String) rememberedValue93;
                composer7.endReplaceGroup();
                composer7.startReplaceGroup(-491204585);
                Object rememberedValue94 = composer7.rememberedValue();
                if (rememberedValue94 == Composer.INSTANCE.getEmpty()) {
                    mutableState26 = mutableState17;
                    rememberedValue94 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit SleepTabScreenBody$lambda$257$lambda$256;
                            SleepTabScreenBody$lambda$257$lambda$256 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$257$lambda$256(MutableState.this);
                            return SleepTabScreenBody$lambda$257$lambda$256;
                        }
                    };
                    composer7.updateRememberedValue(rememberedValue94);
                } else {
                    mutableState26 = mutableState17;
                }
                composer7.endReplaceGroup();
                CoroutineScope coroutineScope7 = coroutineScope3;
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(285330913, true, new SleepTabScreenBodyKt$SleepTabScreenBody$28(coroutineScope7, mutableState77, context, mutableState26, longValue, mutableState78, mutableState64, mutableIntState, mutableState45, mutableState10, mutableState14, mutableState16), composer7, 54);
                ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-144327393, true, new SleepTabScreenBodyKt$SleepTabScreenBody$29(coroutineScope7, context, mutableState26, mutableState64, mutableIntState, mutableState45, mutableState10, mutableState14, mutableState16), composer7, 54);
                Function2<Composer, Integer, Unit> m7532getLambda37$app_sideload = ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7532getLambda37$app_sideload();
                ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-788814852, true, new SleepTabScreenBodyKt$SleepTabScreenBody$30(context, str11, str12, mutableState77, produceState3, mutableState64, mutableIntState, mutableState78), composer7, 54);
                coroutineScope4 = coroutineScope3;
                composer4 = composer7;
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue94, rememberComposableLambda, null, rememberComposableLambda2, null, m7532getLambda37$app_sideload, rememberComposableLambda3, null, 0L, 0L, 0L, 0L, 0.0f, null, composer4, 1772598, 0, 16276);
            } else {
                coroutineScope4 = coroutineScope3;
                composer4 = composer7;
            }
            composer4.endReplaceGroup();
            Composer composer8 = composer4;
            composer8.startReplaceGroup(-490952952);
            if (!SleepTabScreenBody$lambda$150(mutableState14) || SleepTabScreenBody$lambda$153(mutableState10) == null) {
                composer5 = composer8;
            } else {
                final SleepEntryEntity SleepTabScreenBody$lambda$153 = SleepTabScreenBody$lambda$153(mutableState10);
                Intrinsics.checkNotNull(SleepTabScreenBody$lambda$153);
                composer8.startReplaceGroup(-490950086);
                Object rememberedValue95 = composer8.rememberedValue();
                if (rememberedValue95 == Composer.INSTANCE.getEmpty()) {
                    mutableState24 = mutableState10;
                    mutableState25 = mutableState14;
                    rememberedValue95 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit SleepTabScreenBody$lambda$259$lambda$258;
                            SleepTabScreenBody$lambda$259$lambda$258 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$259$lambda$258(MutableState.this, mutableState24);
                            return SleepTabScreenBody$lambda$259$lambda$258;
                        }
                    };
                    composer8.updateRememberedValue(rememberedValue95);
                } else {
                    mutableState24 = mutableState10;
                    mutableState25 = mutableState14;
                }
                composer8.endReplaceGroup();
                composer5 = composer8;
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue95, ComposableLambdaKt.rememberComposableLambda(1085866466, true, new SleepTabScreenBodyKt$SleepTabScreenBody$32(SleepTabScreenBody$lambda$153, coroutineScope4, context, mutableState25, mutableState24), composer8, 54), null, ComposableLambdaKt.rememberComposableLambda(656208160, true, new SleepTabScreenBodyKt$SleepTabScreenBody$33(mutableState25, mutableState24), composer8, 54), null, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7540getLambda44$app_sideload(), ComposableLambdaKt.rememberComposableLambda(11720701, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$34
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num) {
                        invoke(composer9, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer9, int i7) {
                        if ((i7 & 3) != 2 || !composer9.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(11720701, i7, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous> (SleepTabScreenBody.kt:1701)");
                            }
                            TextKt.m2376Text4IGK_g("This night has very little sensor coverage (" + SleepEntryEntity.this.getTotalSleepMin() + "m asleep). Rebuild stages from movement patterns?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer9, MaterialTheme.$stable).getBodyMedium(), composer9, 0, 0, 65534);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer9.skipToGroupEnd();
                    }
                }, composer8, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer5, 1772598, 0, 16276);
            }
            composer5.endReplaceGroup();
            if (SleepTabScreenBody$lambda$129(mutableState12)) {
                composer5.startReplaceGroup(-490904323);
                Object rememberedValue96 = composer5.rememberedValue();
                if (rememberedValue96 == Composer.INSTANCE.getEmpty()) {
                    mutableState23 = mutableState12;
                    rememberedValue96 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit SleepTabScreenBody$lambda$261$lambda$260;
                            SleepTabScreenBody$lambda$261$lambda$260 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$261$lambda$260(MutableState.this);
                            return SleepTabScreenBody$lambda$261$lambda$260;
                        }
                    };
                    composer5.updateRememberedValue(rememberedValue96);
                } else {
                    mutableState23 = mutableState12;
                }
                composer5.endReplaceGroup();
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue96, ComposableLambdaKt.rememberComposableLambda(1886402019, true, new SleepTabScreenBodyKt$SleepTabScreenBody$36(context, mutableState61, mutableState62, mutableState13, mutableState23), composer5, 54), null, ComposableLambdaKt.rememberComposableLambda(1456743713, true, new SleepTabScreenBodyKt$SleepTabScreenBody$37(mutableState23), composer5, 54), null, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7543getLambda47$app_sideload(), ComposableLambdaKt.rememberComposableLambda(812256254, true, new SleepTabScreenBodyKt$SleepTabScreenBody$38(colorScheme2, mutableState61, mutableState62, mutableState13), composer5, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer5, 1772598, 0, 16276);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer5 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer5.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Unit SleepTabScreenBody$lambda$262;
                    SleepTabScreenBody$lambda$262 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$262(Modifier.this, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    return SleepTabScreenBody$lambda$262;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$10$lambda$9() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$15$lambda$14(CoroutineScope coroutineScope, Context context, ExerciseTrackerUseCases exerciseTrackerUseCases, Uri uri) {
        if (uri != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SleepTabScreenBodyKt$SleepTabScreenBody$sleepCycleImportLauncher$1$1$1(context, uri, exerciseTrackerUseCases, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private static final boolean SleepTabScreenBody$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final SleepEntryEntity SleepTabScreenBody$lambda$20(MutableState<SleepEntryEntity> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$23$lambda$22() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("11:00 PM", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$24(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$27$lambda$26() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("7:00 AM", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$28(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$31$lambda$30() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("450", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$32(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$35$lambda$34() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$36(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$39$lambda$38() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$40(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$43$lambda$42() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("manual", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$44(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$49(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$50(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepTrackingLiveStats.Live SleepTabScreenBody$lambda$52(MutableState<SleepTrackingLiveStats.Live> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$55$lambda$54() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(7, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTabScreenBody$lambda$56(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$57(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$59$lambda$58() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTabScreenBody$lambda$60(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$61(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SleepTabScreenBody$lambda$64(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$65(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$67(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$68(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$70(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$71(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$73(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$74(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$76(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$77(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$85(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$86(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$88(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$89(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$91$lambda$90(Context context) {
        String homeAddress = SleepAlarmPreferences.INSTANCE.homeAddress(context);
        if (homeAddress == null) {
            homeAddress = "";
        }
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(homeAddress, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$92(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepWakePlanner.Suggestion SleepTabScreenBody$lambda$95(MutableState<SleepWakePlanner.Suggestion> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepCalendarHelper.QueryResult SleepTabScreenBody$lambda$98(MutableState<SleepCalendarHelper.QueryResult> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$101(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$102(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SleepTabScreenBody$lambda$104(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$105(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$107(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        if (r8 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit SleepTabScreenBody$lambda$115$lambda$114(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ActivityResult result) {
        Object m7905constructorimpl;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(result, "result");
        Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(result.getData());
        Intrinsics.checkNotNullExpressionValue(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
        try {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(signedInAccountFromIntent.getResult(ApiException.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7912isSuccessimpl(m7905constructorimpl)) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) m7905constructorimpl;
            GoogleCalendarLink googleCalendarLink = GoogleCalendarLink.INSTANCE;
            Intrinsics.checkNotNull(googleSignInAccount);
            googleCalendarLink.markLinked(context, googleSignInAccount);
            SleepTabScreenBody$lambda$102(mutableState, true);
            Toast.makeText(context, "Google Calendar linked", 0).show();
        }
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            ApiException apiException = m7908exceptionOrNullimpl instanceof ApiException ? (ApiException) m7908exceptionOrNullimpl : null;
            Integer valueOf = apiException != null ? Integer.valueOf(apiException.getStatusCode()) : null;
            if (valueOf != null && valueOf.intValue() == 16) {
                str2 = "Sign-in cancelled";
            } else if (valueOf != null && valueOf.intValue() == 7) {
                str2 = "Network error — try again";
            } else if (valueOf != null && valueOf.intValue() == 10) {
                str2 = "Google sign-in misconfigured (SHA-1 / OAuth client)";
            } else {
                if (valueOf != null) {
                    str = " (code " + valueOf.intValue() + ")";
                }
                str = "";
                str2 = "Google sign-in failed" + str;
            }
            Toast.makeText(context, str2, 1).show();
            if (valueOf != null && valueOf.intValue() == 10) {
                SigningFingerprints.Fingerprints currentApp = SigningFingerprints.INSTANCE.currentApp(context);
                String packageName = context.getPackageName();
                String sha1 = currentApp.getSha1();
                if (sha1 == null) {
                    sha1 = "unknown";
                }
                mutableState2.setValue("Package: " + packageName + "\nSHA-1 (installed build): " + sha1 + "\n\nGoogle Cloud Console → APIs & Services → Credentials\nCreate/Update OAuth client (Android):\n1) Package name must match exactly\n2) Add SHA-1 above\n3) Also add your RELEASE SHA-1 (from `./gradlew :app:signingReport`)\n\nAfter saving, wait a few minutes then try Connect Google again.");
                SleepTabScreenBody$lambda$105(mutableState3, true);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$117$lambda$116(MutableState mutableState) {
        SleepTabScreenBody$lambda$105(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$119(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$122$lambda$121(Context context) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SleepAlarmPreferences.INSTANCE.spotifyInput(context), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$123(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean SleepTabScreenBody$lambda$126(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$127(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SleepTabScreenBody$lambda$129(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$130(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$132$lambda$131() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Morning event", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$133(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$136$lambda$135() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(9, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTabScreenBody$lambda$137(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$138(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$140$lambda$139() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTabScreenBody$lambda$141(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$142(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTabScreenBody$lambda$144(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepMlFeedbackApply.Kind SleepTabScreenBody$lambda$147(MutableState<SleepMlFeedbackApply.Kind> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean SleepTabScreenBody$lambda$150(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$151(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final SleepEntryEntity SleepTabScreenBody$lambda$153(MutableState<SleepEntryEntity> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SleepTabScreenBody$lambda$156(MutableState<Long> mutableState) {
        return mutableState.getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$157(MutableState<Long> mutableState, long j) {
        mutableState.setValue(Long.valueOf(j));
    }

    private static final boolean SleepTabScreenBody$lambda$159(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$160(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$162$lambda$161(Context context, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            Intent data = result.getData();
            SleepAlarmPreferences.INSTANCE.setCustomRingtoneUri(context, data != null ? (Uri) data.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI") : null);
            Toast.makeText(context, "Alarm sound saved", 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$164$lambda$163(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, boolean z) {
        if (z) {
            SleepTabComponentsKt.startOvernight(context, SleepTabScreenBody$lambda$56(mutableState), SleepTabScreenBody$lambda$60(mutableState2), (int) SleepTabScreenBody$lambda$64(mutableState3), SleepTabScreenBody$lambda$67(mutableState4));
            SleepTabScreenBody$lambda$50(mutableState5, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$172$lambda$171(Context context, CoroutineScope coroutineScope, MutableState mutableState, boolean z) {
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SleepTabScreenBodyKt$SleepTabScreenBody$homeLocLauncher$1$1$1(context, mutableState, null), 3, null);
            return Unit.INSTANCE;
        }
        Toast.makeText(context, "Location permission needed to set home from GPS", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTabScreenBody$lambda$174(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SleepTabScreenBody$lambda$179$lambda$178(final LifecycleOwner lifecycleOwner, final Context context, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableIntState mutableIntState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda29
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                SleepTabScreenBodyKt.SleepTabScreenBody$lambda$179$lambda$178$lambda$176(context, mutableState, mutableState2, mutableState3, mutableIntState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$lambda$179$lambda$178$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$179$lambda$178$lambda$176(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableIntState mutableIntState, LifecycleOwner lifecycleOwner, Lifecycle.Event ev) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev == Lifecycle.Event.ON_RESUME) {
            SleepTabScreenBody$lambda$102(mutableState, GoogleCalendarLink.INSTANCE.isLinked(context));
            SleepOvernightStore.INSTANCE.clearSessionIfStale(context);
            SleepTabScreenBody$lambda$50(mutableState2, SleepOvernightStore.INSTANCE.isActive(context));
            if (SleepOvernightStore.INSTANCE.isRecoverableStale(context) || SleepOvernightStore.INSTANCE.alarmFired(context)) {
                SleepTabScreenBody$lambda$127(mutableState3, true);
            }
            mutableIntState.setIntValue(SleepTabScreenBody$lambda$174(mutableIntState) + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SleepTabScreenBody$lambda$183$lambda$182(Context context, boolean z, final MutableIntState mutableIntState, MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final SleepCalendarObserver sleepCalendarObserver = new SleepCalendarObserver(context, new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit SleepTabScreenBody$lambda$183$lambda$182$lambda$180;
                SleepTabScreenBody$lambda$183$lambda$182$lambda$180 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$183$lambda$182$lambda$180(MutableIntState.this);
                return SleepTabScreenBody$lambda$183$lambda$182$lambda$180;
            }
        });
        if (z || SleepTabScreenBody$lambda$101(mutableState) || SleepCalendarHelper.INSTANCE.hasPermission(context)) {
            sleepCalendarObserver.start();
        }
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$lambda$183$lambda$182$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SleepCalendarObserver.this.stop();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$183$lambda$182$lambda$180(MutableIntState mutableIntState) {
        mutableIntState.setIntValue(SleepTabScreenBody$lambda$174(mutableIntState) + 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object SleepTabScreenBody$persistWakeNight(Context context, MutableIntState mutableIntState, MutableState<Boolean> mutableState, MutableState<SleepEntryEntity> mutableState2, MutableState<Boolean> mutableState3, Long l, SleepMlFeedbackApply.Kind kind, Continuation<? super SleepEntryEntity> continuation) {
        SleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1 sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1;
        int i;
        Context context2;
        MutableState<SleepEntryEntity> mutableState4;
        MutableState<Boolean> mutableState5;
        SleepMlFeedbackApply.Kind kind2;
        Object finishAndSave;
        SleepEntryEntity sleepEntryEntity;
        MutableState<SleepEntryEntity> mutableState6;
        MutableState<Boolean> mutableState7;
        SleepEntryEntity sleepEntryEntity2;
        if (continuation instanceof SleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1) {
            sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1 = (SleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1) continuation;
            if ((sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.label & Integer.MIN_VALUE) != 0) {
                sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.label -= Integer.MIN_VALUE;
                Object obj = sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SleepSessionFinisher sleepSessionFinisher = SleepSessionFinisher.INSTANCE;
                    Integer boxInt = Boxing.boxInt(SleepTabScreenBody$lambda$144(mutableIntState));
                    Boolean boxBoolean = Boxing.boxBoolean(SleepTabScreenBody$lambda$67(mutableState));
                    context2 = context;
                    sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$0 = context2;
                    mutableState4 = mutableState2;
                    sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$1 = mutableState4;
                    mutableState5 = mutableState3;
                    sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$2 = mutableState5;
                    kind2 = kind;
                    sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$3 = kind2;
                    sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.label = 1;
                    finishAndSave = sleepSessionFinisher.finishAndSave(context, boxInt, boxBoolean, l, sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1);
                    if (finishAndSave == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sleepEntryEntity = (SleepEntryEntity) sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$2;
                        mutableState7 = (MutableState) sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$1;
                        mutableState6 = (MutableState) sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        sleepEntryEntity2 = (SleepEntryEntity) obj;
                        if (sleepEntryEntity2 == null) {
                            sleepEntryEntity2 = sleepEntryEntity;
                        }
                        if (sleepEntryEntity2 == null) {
                            mutableState4 = mutableState6;
                            mutableState5 = mutableState7;
                            sleepEntryEntity2 = sleepEntryEntity;
                            mutableState6 = mutableState4;
                            mutableState7 = mutableState5;
                        }
                        if (SleepEntryRepair.INSTANCE.needsRepair(sleepEntryEntity2)) {
                            mutableState6.setValue(sleepEntryEntity2);
                            SleepTabScreenBody$lambda$151(mutableState7, true);
                        }
                        return sleepEntryEntity2;
                    }
                    SleepMlFeedbackApply.Kind kind3 = (SleepMlFeedbackApply.Kind) sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$3;
                    MutableState<Boolean> mutableState8 = (MutableState) sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$2;
                    MutableState<SleepEntryEntity> mutableState9 = (MutableState) sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$1;
                    Context context3 = (Context) sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    kind2 = kind3;
                    mutableState5 = mutableState8;
                    mutableState4 = mutableState9;
                    finishAndSave = obj;
                    context2 = context3;
                }
                sleepEntryEntity = (SleepEntryEntity) finishAndSave;
                if (sleepEntryEntity != null) {
                    return null;
                }
                if (kind2 != null) {
                    SleepMlFeedbackApply sleepMlFeedbackApply = SleepMlFeedbackApply.INSTANCE;
                    sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$0 = mutableState4;
                    sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$1 = mutableState5;
                    sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$2 = sleepEntryEntity;
                    sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.L$3 = null;
                    sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.label = 2;
                    obj = sleepMlFeedbackApply.applyToEntry(context2, sleepEntryEntity, kind2, sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState6 = mutableState4;
                    mutableState7 = mutableState5;
                    sleepEntryEntity2 = (SleepEntryEntity) obj;
                    if (sleepEntryEntity2 == null) {
                    }
                    if (sleepEntryEntity2 == null) {
                    }
                    if (SleepEntryRepair.INSTANCE.needsRepair(sleepEntryEntity2)) {
                    }
                    return sleepEntryEntity2;
                }
                sleepEntryEntity2 = sleepEntryEntity;
                mutableState6 = mutableState4;
                mutableState7 = mutableState5;
                if (SleepEntryRepair.INSTANCE.needsRepair(sleepEntryEntity2)) {
                }
                return sleepEntryEntity2;
            }
        }
        sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1 = new SleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1(continuation);
        Object obj2 = sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1.label;
        if (i != 0) {
        }
        sleepEntryEntity = (SleepEntryEntity) finishAndSave;
        if (sleepEntryEntity != null) {
        }
    }

    private static final Pair<Integer, Integer> SleepTabScreenBody$parseHm(String str) {
        Integer intOrNull;
        List split$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) str).toString(), new String[]{":"}, false, 0, 6, (Object) null);
        if (split$default.size() == 2 && (intOrNull = StringsKt.toIntOrNull((String) split$default.get(0))) != null) {
            int intValue = intOrNull.intValue();
            Integer intOrNull2 = StringsKt.toIntOrNull((String) split$default.get(1));
            if (intOrNull2 != null) {
                int intValue2 = intOrNull2.intValue();
                if (intValue >= 0 && intValue < 24 && intValue2 >= 0 && intValue2 < 60) {
                    return TuplesKt.to(Integer.valueOf(intValue), Integer.valueOf(intValue2));
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalTime SleepTabScreenBody$parseBedWake(String str) {
        String replace = new Regex("\\s+").replace(StringsKt.trim((CharSequence) str).toString(), " ");
        Pair<Integer, Integer> SleepTabScreenBody$parseHm = SleepTabScreenBody$parseHm(replace);
        if (SleepTabScreenBody$parseHm != null) {
            return LocalTime.of(SleepTabScreenBody$parseHm.component1().intValue(), SleepTabScreenBody$parseHm.component2().intValue());
        }
        try {
            try {
                return LocalTime.parse(replace, SleepFormattersKt.getSleepAmPmParseFmt());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return LocalTime.parse(StringsKt.replace$default(replace, " ", "", false, 4, (Object) null), SleepFormattersKt.getSleepAmPmCompactParseFmt());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$mergeImportFromHc(HealthConnectManager healthConnectManager, Context context, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, ExerciseTrackerUseCases exerciseTrackerUseCases) {
        Object m7905constructorimpl;
        if (!healthConnectManager.isAvailable()) {
            Toast.makeText(context, healthConnectManager.statusMessage(), 1).show();
            return;
        }
        if (!SleepTabScreenBody$lambda$4(mutableState)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                context.startActivity(healthConnectManager.openHealthConnectApp().addFlags(268435456));
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    context.startActivity(healthConnectManager.openHealthConnectPlayStore());
                    Result.m7905constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th2));
                }
            }
            Toast.makeText(context, "Allow sleep access in Health Connect, then tap Merge again", 1).show();
            return;
        }
        SleepTabScreenBody$lambda$8(mutableState2, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SleepTabScreenBodyKt$SleepTabScreenBody$mergeImportFromHc$3(healthConnectManager, exerciseTrackerUseCases, mutableState2, context, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$197$lambda$196(MutableState mutableState) {
        SleepTabScreenBody$lambda$18(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$235$lambda$206(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$235$lambda$207(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTabScreenBody$lambda$235$lambda$209(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTabScreenBody$lambda$235$lambda$212(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$235$lambda$215(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$235$lambda$216(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$235$lambda$218(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$235$lambda$219(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepTabScreenBody$lambda$235$lambda$221(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepTabScreenBody$lambda$235$lambda$222(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$235$lambda$231$lambda$224$lambda$223(MutableState mutableState) {
        SleepTabScreenBody$lambda$18(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$235$lambda$231$lambda$226$lambda$225(ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch(new String[]{"text/*", "text/csv", "application/csv", "*/*"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$235$lambda$231$lambda$228$lambda$227(HealthConnectManager healthConnectManager, Context context, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, ExerciseTrackerUseCases exerciseTrackerUseCases) {
        SleepTabScreenBody$mergeImportFromHc(healthConnectManager, context, coroutineScope, mutableState, mutableState2, exerciseTrackerUseCases);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$235$lambda$231$lambda$230$lambda$229(Context context, MutableState mutableState) {
        SleepTabScreenBody$lambda$12(mutableState, false);
        Toast.makeText(context, "Re-open this tab to import again.", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$235$lambda$234$lambda$233$lambda$232(SleepEntryEntity sleepEntryEntity, MutableState mutableState) {
        mutableState.setValue(sleepEntryEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$237$lambda$236(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$240$lambda$239$lambda$238(CoroutineScope coroutineScope, ExerciseTrackerUseCases exerciseTrackerUseCases, SleepEntryEntity sleepEntryEntity, MutableState mutableState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new SleepTabScreenBodyKt$SleepTabScreenBody$25$1$1$1(exerciseTrackerUseCases, sleepEntryEntity, null), 2, null);
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$242$lambda$241(CoroutineScope coroutineScope, ExerciseTrackerUseCases exerciseTrackerUseCases, MutableState mutableState, SleepEntryEntity updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new SleepTabScreenBodyKt$SleepTabScreenBody$26$1$1(exerciseTrackerUseCases, updated, mutableState, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$249(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SleepTabScreenBody$lambda$248$lambda$247(long j, long j2) {
        Pair defaultWakeLocalTime;
        defaultWakeLocalTime = SleepEntryTimeEditor.INSTANCE.defaultWakeLocalTime(j, (r18 & 2) != 0 ? System.currentTimeMillis() : 0L, (r18 & 4) != 0 ? 0L : j2, (r18 & 8) != 0 ? ZoneId.systemDefault() : null);
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LocalTime.of(((Number) defaultWakeLocalTime.component1()).intValue(), ((Number) defaultWakeLocalTime.component2()).intValue()).format(SleepFormattersKt.getSleepAmPmFmt()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepTabScreenBody$lambda$252(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$257$lambda$256(MutableState mutableState) {
        SleepTabScreenBody$lambda$127(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$259$lambda$258(MutableState mutableState, MutableState mutableState2) {
        SleepTabScreenBody$lambda$151(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepTabScreenBody$lambda$261$lambda$260(MutableState mutableState) {
        SleepTabScreenBody$lambda$130(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SleepEntryEntity> SleepTabScreenBody$lambda$1(State<? extends List<SleepEntryEntity>> state) {
        return state.getValue();
    }

    private static final SleepMorningDiagnostics.Snapshot SleepTabScreenBody$lambda$187(State<SleepMorningDiagnostics.Snapshot> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SleepTabScreenBody$lambda$246(State<Integer> state) {
        return state.getValue().intValue();
    }
}
