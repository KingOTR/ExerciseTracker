package com.example.rungps.ui.gym;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.health.platform.client.SdkConfig;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.example.rungps.MainActivity;
import com.example.rungps.analytics.ExerciseHistoryPoint;
import com.example.rungps.analytics.MuscleVolumeHeatmap;
import com.example.rungps.analytics.WeekVolumeBar;
import com.example.rungps.data.AppPreferences;
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
import com.example.rungps.gym.GymSessionMediaRecorder;
import com.example.rungps.nfc.GymNfcController;
import com.example.rungps.ui.viewmodel.MainViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a%\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u008a\u0084\u0002²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u008a\u0084\u0002²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u008a\u008e\u0002²\u0006\u0010\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fX\u008a\u008e\u0002²\u0006\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u000fX\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002²\u0006\f\u0010\"\u001a\u0004\u0018\u00010#X\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fX\u008a\u008e\u0002²\u0006\u0010\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fX\u008a\u008e\u0002²\u0006\u0016\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020(0'X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\u0016\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180'X\u008a\u008e\u0002²\u0006\u0010\u0010+\u001a\b\u0012\u0004\u0012\u00020#0\u000fX\u008a\u008e\u0002²\u0006\f\u0010,\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002²\u0006\u0010\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050.X\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002²\u0006\f\u00100\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002²\u0006\u0016\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002020'X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u00105\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u000207X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u000209X\u008a\u008e\u0002²\u0006\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u000fX\u008a\u008e\u0002²\u0006\u0016\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020=0'X\u008a\u008e\u0002²\u0006\u0016\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002040'X\u008a\u008e\u0002²\u0006\f\u0010?\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002²\u0006\u0010\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u000fX\u008a\u008e\u0002²\u0006\f\u0010B\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002²\u0006\u0018\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0018\u00010DX\u008a\u008e\u0002²\u0006\n\u0010E\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\u0016\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180'X\u008a\u008e\u0002²\u0006\n\u0010G\u001a\u000204X\u008a\u008e\u0002²\u00066\u0010H\u001a.\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u000f0'\u0018\u00010IX\u008a\u008e\u0002²\u0006\u0010\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000fX\u008a\u0084\u0002²\u0006\n\u0010L\u001a\u000207X\u008a\u008e\u0002²\u0006\u0010\u0010M\u001a\b\u0012\u0004\u0012\u00020J0\u000fX\u008a\u008e\u0002²\u0006\u0016\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180'X\u008a\u008e\u0002²\u0006\f\u0010O\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\f\u0010P\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\u0010\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u000fX\u008a\u0084\u0002²\u0006\u0010\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fX\u008a\u008e\u0002²\u0006\n\u0010T\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u0010U\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u0010V\u001a\u000204X\u008a\u008e\u0002²\u0006\u0010\u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u000fX\u008a\u008e\u0002²\u0006\f\u0010Y\u001a\u0004\u0018\u00010ZX\u008a\u008e\u0002²\u0006\f\u0010[\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002²\u0006\u0010\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000fX\u008a\u0084\u0002²\u0006\u0016\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180'X\u008a\u008e\u0002²\u0006\u0016\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180'X\u008a\u008e\u0002²\u0006\u0016\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020(0'X\u008a\u008e\u0002²\u0006\u0016\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020(0'X\u008a\u008e\u0002²\u0006\n\u0010a\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u0010b\u001a\u000204X\u008a\u008e\u0002²\u0006\f\u0010c\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002²\u0006\n\u0010d\u001a\u000207X\u008a\u008e\u0002²\u0006$\u0010e\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020=0D0'X\u008a\u008e\u0002²\u0006\f\u0010f\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002²\u0006$\u0010e\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u000107\u0012\u0004\u0012\u00020=0D0'X\u008a\u008e\u0002²\u0006\f\u0010f\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002²\u0006\u0010\u0010g\u001a\b\u0012\u0004\u0012\u00020X0\u000fX\u008a\u0084\u0002²\u0006\n\u0010h\u001a\u000204X\u008a\u008e\u0002"}, d2 = {"GymTabContent", "", "mainActivity", "Lcom/example/rungps/MainActivity;", "focusSessionId", "", "(Lcom/example/rungps/MainActivity;Ljava/lang/Long;Landroidx/compose/runtime/Composer;II)V", "GymSessionMediaTimelineSection", "sessionId", "startedAtMs", "repo", "Lcom/example/rungps/data/Repository;", "(JJLcom/example/rungps/data/Repository;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "splits", "", "Lcom/example/rungps/data/GymSplitEntity;", "sessions", "Lcom/example/rungps/data/GymSessionEntity;", "recoveryEvents", "Lcom/example/rungps/data/RecoveryEventEntity;", "load", "Lcom/example/rungps/data/GymLoadStats;", "exerciseName", "", "repsText", "weightText", "pr", "Lcom/example/rungps/data/ExercisePr;", "lastBest", "Lcom/example/rungps/data/GymSetEntity;", "topPrs", "untaggedExercises", "activeSplitId", "nextSplitDay", "Lcom/example/rungps/data/GymDayTemplateEntity;", "nextDayExerciseNames", "previewDayExerciseNames", "splitProgrammeRegions", "", "", "splitScheduleHeadline", "dayNameCache", "dayOptions", "selectedSplitDayId", "pendingSplitDayIds", "", "setupNoteExercise", "setupNoteText", "pulleyByExerciseKey", "Lcom/example/rungps/gym/GymPulleySelection;", "showPulleyChooser", "", "showRpeRom", "heatmapDays", "", "progressHeatmap", "Lcom/example/rungps/analytics/MuscleVolumeHeatmap;", "weekBars", "Lcom/example/rungps/analytics/WeekVolumeBar;", "muscleKgByGroup", "", "unilateralLookup", "historyExercise", "historyPoints", "Lcom/example/rungps/analytics/ExerciseHistoryPoint;", "muscleEditExercise", "renameExercise", "Lkotlin/Pair;", "renameText", "muscleLookup", "showSplitEditor", "splitEditorPayload", "Lkotlin/Triple;", "Lcom/example/rungps/data/ExerciseTemplateEntity;", "openHeatmapSets", "gymPage", "activeDayExercises", "setupNotesByExercise", "finishTimeDialogSession", "adjustEndTimeSession", "carryoverItems", "Lcom/example/rungps/data/GymCarryoverEntity;", "currentMuscles", "currentUni", "spotifyConnected", "backfillingSpotify", "mediaTimeline", "Lcom/example/rungps/data/SpotifyTimelineEntity;", "liveMedia", "Lcom/example/rungps/media/SessionMediaSnapshot;", "liveArtUrl", "sessionSets", "weightDrafts", "sessionOverrides", "liveVolumeRegions", "liveRecoveryRegions", "showAutoFinishConfirm", "autoFinishPrompted", "restEndsAtMs", "restTick", "localSetValues", "exercisePr", "rows", "enrichedOnce"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymTabContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymSessionMediaTimelineSection$lambda$169(long j, long j2, Repository repository, int i, Composer composer, int i2) {
        GymSessionMediaTimelineSection(j, j2, repository, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymSessionMediaTimelineSection$lambda$170(long j, long j2, Repository repository, int i, Composer composer, int i2) {
        GymSessionMediaTimelineSection(j, j2, repository, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymTabContent$lambda$162(MainActivity mainActivity, Long l, int i, int i2, Composer composer, int i3) {
        GymTabContent(mainActivity, l, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0b81, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L313;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0f49  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GymTabContent(MainActivity mainActivity, Long l, Composer composer, final int i, final int i2) {
        final MainActivity mainActivity2;
        int i3;
        final Long l2;
        int i4;
        ViewModelStoreOwner current;
        MutableState mutableState;
        Object obj;
        Object next;
        int i5;
        Long l3;
        Long l4;
        boolean z;
        Long l5;
        int i6;
        Long l6;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        Flow<List<GymCarryoverEntity>> flowOf;
        MutableState mutableState8;
        MutableState mutableState9;
        MutableState mutableState10;
        State state;
        MutableIntState mutableIntState;
        Long l7;
        GymNfcController gymNfc;
        int i7 = i2;
        Composer startRestartGroup = composer.startRestartGroup(639408941);
        int i8 = i7 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            mainActivity2 = mainActivity;
        } else if ((i & 6) == 0) {
            mainActivity2 = mainActivity;
            i3 = (startRestartGroup.changedInstance(mainActivity2) ? 4 : 2) | i;
        } else {
            mainActivity2 = mainActivity;
            i3 = i;
        }
        int i9 = i7 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            l2 = l;
            i3 |= startRestartGroup.changed(l2) ? 32 : 16;
            i4 = i3;
            if ((i4 & 19) == 18 || !startRestartGroup.getSkipping()) {
                MainActivity mainActivity3 = i8 == 0 ? null : mainActivity2;
                Long l8 = i9 == 0 ? null : l2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(639408941, i4, -1, "com.example.rungps.ui.gym.GymTabContent (GymTabContent.kt:77)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                MainActivity mainActivity4 = mainActivity3 != null ? context instanceof MainActivity ? (MainActivity) context : null : mainActivity3;
                startRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(startRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
                if (current != null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                MainActivity mainActivity5 = mainActivity4;
                Long l9 = l8;
                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(MainViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                startRestartGroup.endReplaceableGroup();
                Repository repository = ((MainViewModel) viewModel).getRepository();
                State collectAsState = SnapshotStateKt.collectAsState(repository.gymSplitsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                State collectAsState2 = SnapshotStateKt.collectAsState(repository.gymSessionsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                State collectAsState3 = SnapshotStateKt.collectAsState(repository.recoveryRecentFlow(60), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                State collectAsState4 = SnapshotStateKt.collectAsState(repository.gymLoadFlow(), null, null, startRestartGroup, 48, 2);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                    startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Object[] objArr = new Object[0];
                startRestartGroup.startReplaceGroup(1780133318);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState GymTabContent$lambda$5$lambda$4;
                            GymTabContent$lambda$5$lambda$4 = GymTabContentKt.GymTabContent$lambda$5$lambda$4();
                            return GymTabContent$lambda$5$lambda$4;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState11 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 3072, 6);
                Object[] objArr2 = new Object[0];
                startRestartGroup.startReplaceGroup(1780135238);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState GymTabContent$lambda$9$lambda$8;
                            GymTabContent$lambda$9$lambda$8 = GymTabContentKt.GymTabContent$lambda$9$lambda$8();
                            return GymTabContent$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState12 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 3072, 6);
                Object[] objArr3 = new Object[0];
                startRestartGroup.startReplaceGroup(1780137222);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState GymTabContent$lambda$13$lambda$12;
                            GymTabContent$lambda$13$lambda$12 = GymTabContentKt.GymTabContent$lambda$13$lambda$12();
                            return GymTabContent$lambda$13$lambda$12;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState13 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(1780138454);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState14 = (MutableState) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780141368);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                MutableState mutableState15 = (MutableState) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780144290);
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState16 = (MutableState) rememberedValue7;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780147846);
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                MutableState mutableState17 = (MutableState) rememberedValue8;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780150392);
                Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                MutableState mutableState18 = (MutableState) rememberedValue9;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780152488);
                Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                MutableState mutableState19 = (MutableState) rememberedValue10;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780155334);
                Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                MutableState mutableState20 = (MutableState) rememberedValue11;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780158214);
                Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                MutableState mutableState21 = (MutableState) rememberedValue12;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780161035);
                Object rememberedValue13 = startRestartGroup.rememberedValue();
                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                }
                MutableState mutableState22 = (MutableState) rememberedValue13;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780163983);
                Object rememberedValue14 = startRestartGroup.rememberedValue();
                if (rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                }
                MutableState mutableState23 = (MutableState) rememberedValue14;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780165802);
                Object rememberedValue15 = startRestartGroup.rememberedValue();
                if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue15);
                }
                MutableState mutableState24 = (MutableState) rememberedValue15;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780168404);
                Object rememberedValue16 = startRestartGroup.rememberedValue();
                if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue16);
                }
                MutableState mutableState25 = (MutableState) rememberedValue16;
                startRestartGroup.endReplaceGroup();
                Object[] objArr4 = new Object[0];
                startRestartGroup.startReplaceGroup(1780172079);
                Object rememberedValue17 = startRestartGroup.rememberedValue();
                if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue17 = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState GymTabContent$lambda$53$lambda$52;
                            GymTabContent$lambda$53$lambda$52 = GymTabContentKt.GymTabContent$lambda$53$lambda$52();
                            return GymTabContent$lambda$53$lambda$52;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue17);
                }
                Function0 function0 = (Function0) rememberedValue17;
                startRestartGroup.endReplaceGroup();
                MutableState mutableState26 = mutableState22;
                MutableState mutableState27 = mutableState21;
                MutableState mutableState28 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr4, (Saver) null, (String) null, function0, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(1780174082);
                Object rememberedValue18 = startRestartGroup.rememberedValue();
                if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SetsKt.emptySet(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue18);
                }
                MutableState mutableState29 = (MutableState) rememberedValue18;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780176634);
                Object rememberedValue19 = startRestartGroup.rememberedValue();
                if (rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue19);
                }
                MutableState mutableState30 = (MutableState) rememberedValue19;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780178810);
                Object rememberedValue20 = startRestartGroup.rememberedValue();
                if (rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue20 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue20);
                }
                MutableState mutableState31 = (MutableState) rememberedValue20;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780181208);
                Object rememberedValue21 = startRestartGroup.rememberedValue();
                if (rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue21 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue21);
                }
                MutableState mutableState32 = (MutableState) rememberedValue21;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780184466);
                Object rememberedValue22 = startRestartGroup.rememberedValue();
                if (rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(GymPreferences.INSTANCE.showPulleyChooser(context)), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue22);
                }
                MutableState mutableState33 = (MutableState) rememberedValue22;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780187315);
                Object rememberedValue23 = startRestartGroup.rememberedValue();
                if (rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue23 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(AppPreferences.INSTANCE.showRpeRomBlocking(context)), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue23);
                }
                MutableState mutableState34 = (MutableState) rememberedValue23;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780190230);
                Object rememberedValue24 = startRestartGroup.rememberedValue();
                if (rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue24 = new GymSessionMediaRecorder();
                    startRestartGroup.updateRememberedValue(rememberedValue24);
                }
                GymSessionMediaRecorder gymSessionMediaRecorder = (GymSessionMediaRecorder) rememberedValue24;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780192277);
                Object rememberedValue25 = startRestartGroup.rememberedValue();
                if (rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue25 = SnapshotIntStateKt.mutableIntStateOf(GymPreferences.INSTANCE.volumeHeatmapDays(context));
                    startRestartGroup.updateRememberedValue(rememberedValue25);
                }
                MutableIntState mutableIntState2 = (MutableIntState) rememberedValue25;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780195362);
                Object rememberedValue26 = startRestartGroup.rememberedValue();
                if (rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue26 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new MuscleVolumeHeatmap(null, null, 3, null), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue26);
                }
                MutableState mutableState35 = (MutableState) rememberedValue26;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780197668);
                Object rememberedValue27 = startRestartGroup.rememberedValue();
                if (rememberedValue27 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue27 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue27);
                }
                MutableState mutableState36 = (MutableState) rememberedValue27;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780201228);
                Object rememberedValue28 = startRestartGroup.rememberedValue();
                if (rememberedValue28 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue28 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue28);
                }
                MutableState mutableState37 = (MutableState) rememberedValue28;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780204077);
                Object rememberedValue29 = startRestartGroup.rememberedValue();
                if (rememberedValue29 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue29 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue29);
                }
                MutableState mutableState38 = (MutableState) rememberedValue29;
                startRestartGroup.endReplaceGroup();
                Object[] objArr5 = new Object[0];
                startRestartGroup.startReplaceGroup(1780207441);
                Object rememberedValue30 = startRestartGroup.rememberedValue();
                if (rememberedValue30 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue30 = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState GymTabContent$lambda$91$lambda$90;
                            GymTabContent$lambda$91$lambda$90 = GymTabContentKt.GymTabContent$lambda$91$lambda$90();
                            return GymTabContent$lambda$91$lambda$90;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue30);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState39 = mutableState32;
                MutableState mutableState40 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) rememberedValue30, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(1780209364);
                Object rememberedValue31 = startRestartGroup.rememberedValue();
                if (rememberedValue31 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue31 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue31);
                }
                MutableState mutableState41 = (MutableState) rememberedValue31;
                startRestartGroup.endReplaceGroup();
                Object[] objArr6 = new Object[0];
                startRestartGroup.startReplaceGroup(1780213041);
                Object rememberedValue32 = startRestartGroup.rememberedValue();
                if (rememberedValue32 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue32 = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState GymTabContent$lambda$98$lambda$97;
                            GymTabContent$lambda$98$lambda$97 = GymTabContentKt.GymTabContent$lambda$98$lambda$97();
                            return GymTabContent$lambda$98$lambda$97;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue32);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState42 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr6, (Saver) null, (String) null, (Function0) rememberedValue32, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(1780214982);
                Object rememberedValue33 = startRestartGroup.rememberedValue();
                if (rememberedValue33 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue33 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue33);
                }
                MutableState mutableState43 = (MutableState) rememberedValue33;
                startRestartGroup.endReplaceGroup();
                Object[] objArr7 = new Object[0];
                startRestartGroup.startReplaceGroup(1780217958);
                Object rememberedValue34 = startRestartGroup.rememberedValue();
                if (rememberedValue34 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue34 = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState GymTabContent$lambda$105$lambda$104;
                            GymTabContent$lambda$105$lambda$104 = GymTabContentKt.GymTabContent$lambda$105$lambda$104();
                            return GymTabContent$lambda$105$lambda$104;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue34);
                }
                startRestartGroup.endReplaceGroup();
                MutableState mutableState44 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr7, (Saver) null, (String) null, (Function0) rememberedValue34, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(1780219500);
                Object rememberedValue35 = startRestartGroup.rememberedValue();
                if (rememberedValue35 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue35 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue35);
                }
                MutableState mutableState45 = (MutableState) rememberedValue35;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780222290);
                Object rememberedValue36 = startRestartGroup.rememberedValue();
                if (rememberedValue36 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue36 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue36);
                }
                MutableState mutableState46 = (MutableState) rememberedValue36;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780224467);
                Object rememberedValue37 = startRestartGroup.rememberedValue();
                if (rememberedValue37 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue37 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue37);
                }
                MutableState mutableState47 = (MutableState) rememberedValue37;
                startRestartGroup.endReplaceGroup();
                List<GymSessionEntity> GymTabContent$lambda$1 = GymTabContent$lambda$1(collectAsState2);
                startRestartGroup.startReplaceGroup(1780229787);
                boolean changed = startRestartGroup.changed(collectAsState2) | startRestartGroup.changedInstance(repository);
                Object rememberedValue38 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue38 == Composer.INSTANCE.getEmpty()) {
                    mutableState = mutableState36;
                    rememberedValue38 = (Function2) new GymTabContentKt$GymTabContent$1$1(repository, collectAsState2, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue38);
                } else {
                    mutableState = mutableState36;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(GymTabContent$lambda$1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue38, startRestartGroup, 0);
                Object GymTabContent$lambda$12 = GymTabContent$lambda$1(collectAsState2);
                startRestartGroup.startReplaceGroup(1780239210);
                boolean changed2 = startRestartGroup.changed(GymTabContent$lambda$12);
                Object rememberedValue39 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue39 == Composer.INSTANCE.getEmpty()) {
                    Iterator<T> it = GymTabContent$lambda$1(collectAsState2).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((GymSessionEntity) obj).getEndedAtMs() == null) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    GymSessionEntity gymSessionEntity = (GymSessionEntity) obj;
                    rememberedValue39 = Long.valueOf(gymSessionEntity != null ? gymSessionEntity.getId() : 0L);
                    startRestartGroup.updateRememberedValue(rememberedValue39);
                }
                long longValue = ((Number) rememberedValue39).longValue();
                startRestartGroup.endReplaceGroup();
                MutableState mutableState48 = mutableState;
                int size = longValue > 0 ? GymTabContent$lambda$120(SnapshotStateKt.collectAsState(repository.setsForSessionFlow(longValue), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2)).size() : 0;
                List<GymSessionEntity> GymTabContent$lambda$13 = GymTabContent$lambda$1(collectAsState2);
                Integer valueOf = Integer.valueOf(GymTabContent$lambda$76(mutableIntState2));
                Integer valueOf2 = Integer.valueOf(size);
                startRestartGroup.startReplaceGroup(1780251010);
                boolean changedInstance = startRestartGroup.changedInstance(repository);
                Object rememberedValue40 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue40 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue40 = (Function2) new GymTabContentKt$GymTabContent$2$1(repository, mutableState16, mutableIntState2, mutableState37, mutableState35, mutableState17, mutableState45, mutableState38, null);
                    startRestartGroup.updateRememberedValue(rememberedValue40);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(GymTabContent$lambda$13, valueOf, valueOf2, (Function2) rememberedValue40, startRestartGroup, 0);
                int pulse = (mainActivity5 == null || (gymNfc = mainActivity5.getGymNfc()) == null) ? 0 : gymNfc.getPulse();
                Object GymTabContent$lambda$14 = GymTabContent$lambda$1(collectAsState2);
                startRestartGroup.startReplaceGroup(1780269946);
                boolean changed3 = startRestartGroup.changed(GymTabContent$lambda$14);
                Object rememberedValue41 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue41 == Composer.INSTANCE.getEmpty()) {
                    List<GymSessionEntity> GymTabContent$lambda$15 = GymTabContent$lambda$1(collectAsState2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : GymTabContent$lambda$15) {
                        if (((GymSessionEntity) obj2).getEndedAtMs() == null) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            long startedAtMs = ((GymSessionEntity) next).getStartedAtMs();
                            while (true) {
                                Object next2 = it2.next();
                                long startedAtMs2 = ((GymSessionEntity) next2).getStartedAtMs();
                                if (startedAtMs < startedAtMs2) {
                                    next = next2;
                                    startedAtMs = startedAtMs2;
                                }
                                if (!it2.hasNext()) {
                                    break;
                                }
                                i7 = i7;
                                repository = repository;
                                mutableState27 = mutableState27;
                                mutableState26 = mutableState26;
                                mutableState39 = mutableState39;
                                l9 = l9;
                            }
                        }
                    } else {
                        next = null;
                    }
                    rememberedValue41 = (GymSessionEntity) next;
                    startRestartGroup.updateRememberedValue(rememberedValue41);
                }
                GymSessionEntity gymSessionEntity2 = (GymSessionEntity) rememberedValue41;
                startRestartGroup.endReplaceGroup();
                if (gymSessionEntity2 != null) {
                    l3 = Long.valueOf(gymSessionEntity2.getId());
                    i5 = 0;
                } else {
                    i5 = 0;
                    l3 = null;
                }
                Object[] objArr8 = new Object[i5];
                startRestartGroup.startReplaceGroup(1780275816);
                Object rememberedValue42 = startRestartGroup.rememberedValue();
                if (rememberedValue42 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue42 = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableIntState GymTabContent$lambda$126$lambda$125;
                            GymTabContent$lambda$126$lambda$125 = GymTabContentKt.GymTabContent$lambda$126$lambda$125();
                            return GymTabContent$lambda$126$lambda$125;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue42);
                }
                startRestartGroup.endReplaceGroup();
                Long l10 = l3;
                MutableIntState mutableIntState3 = (MutableIntState) RememberSaveableKt.m3429rememberSaveable(objArr8, (Saver) null, (String) null, (Function0) rememberedValue42, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(1780278306);
                if ((i4 & SdkConfig.SDK_VERSION) == 32) {
                    l4 = l10;
                    z = true;
                } else {
                    l4 = l10;
                    z = false;
                }
                boolean changed4 = z | startRestartGroup.changed(l4) | startRestartGroup.changed(mutableIntState3);
                Object rememberedValue43 = startRestartGroup.rememberedValue();
                if (changed4 || rememberedValue43 == Composer.INSTANCE.getEmpty()) {
                    l5 = l9;
                    rememberedValue43 = (Function2) new GymTabContentKt$GymTabContent$3$1(l5, l4, mutableIntState3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue43);
                } else {
                    l5 = l9;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(l5, l4, (Function2) rememberedValue43, startRestartGroup, (i4 >> 3) & 14);
                startRestartGroup.startReplaceGroup(1780283264);
                boolean changed5 = startRestartGroup.changed(l4) | startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(mainActivity5);
                Object rememberedValue44 = startRestartGroup.rememberedValue();
                if (changed5 || rememberedValue44 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue44 = (Function2) new GymTabContentKt$GymTabContent$4$1(l4, context, mainActivity5, null);
                    startRestartGroup.updateRememberedValue(rememberedValue44);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(l4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue44, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(1780293750);
                Object rememberedValue45 = startRestartGroup.rememberedValue();
                if (rememberedValue45 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue45 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue45);
                }
                MutableState mutableState49 = (MutableState) rememberedValue45;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780297036);
                Object rememberedValue46 = startRestartGroup.rememberedValue();
                if (rememberedValue46 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue46 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue46);
                }
                MutableState mutableState50 = (MutableState) rememberedValue46;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780300100);
                Object rememberedValue47 = startRestartGroup.rememberedValue();
                if (rememberedValue47 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue47 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue47);
                }
                MutableState mutableState51 = (MutableState) rememberedValue47;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780302820);
                Object rememberedValue48 = startRestartGroup.rememberedValue();
                if (rememberedValue48 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue48 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue48);
                }
                MutableState mutableState52 = (MutableState) rememberedValue48;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780305368);
                boolean changed6 = startRestartGroup.changed(context);
                Object rememberedValue49 = startRestartGroup.rememberedValue();
                if (changed6 || rememberedValue49 == Composer.INSTANCE.getEmpty()) {
                    Object sharedPreferences = context.getSharedPreferences("settings", 0);
                    startRestartGroup.updateRememberedValue(sharedPreferences);
                    rememberedValue49 = sharedPreferences;
                }
                SharedPreferences sharedPreferences2 = (SharedPreferences) rememberedValue49;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1780310578);
                boolean changed7 = startRestartGroup.changed(l4) | startRestartGroup.changedInstance(context);
                Object rememberedValue50 = startRestartGroup.rememberedValue();
                if (changed7 || rememberedValue50 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue50 = (Function2) new GymTabContentKt$GymTabContent$5$1(l4, context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue50);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(l4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue50, startRestartGroup, 0);
                Long templateDayId = gymSessionEntity2 != null ? gymSessionEntity2.getTemplateDayId() : null;
                startRestartGroup.startReplaceGroup(1780338320);
                boolean changedInstance2 = startRestartGroup.changedInstance(gymSessionEntity2) | startRestartGroup.changedInstance(repository);
                Object rememberedValue51 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue51 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue51 = (Function2) new GymTabContentKt$GymTabContent$6$1(gymSessionEntity2, repository, mutableState49, null);
                    startRestartGroup.updateRememberedValue(rememberedValue51);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(templateDayId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue51, startRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(1780346603);
                boolean changedInstance3 = startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(repository);
                Object rememberedValue52 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue52 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue52 = (Function2) new GymTabContentKt$GymTabContent$7$1(context, repository, null);
                    startRestartGroup.updateRememberedValue(rememberedValue52);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue52, startRestartGroup, 6);
                List<GymSplitEntity> GymTabContent$lambda$0 = GymTabContent$lambda$0(collectAsState);
                startRestartGroup.startReplaceGroup(1780362709);
                boolean changedInstance4 = startRestartGroup.changedInstance(context) | startRestartGroup.changed(collectAsState);
                Object rememberedValue53 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue53 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue53 = (Function2) new GymTabContentKt$GymTabContent$8$1(context, collectAsState, mutableState18, null);
                    startRestartGroup.updateRememberedValue(rememberedValue53);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(GymTabContent$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue53, startRestartGroup, 0);
                List<GymSessionEntity> GymTabContent$lambda$16 = GymTabContent$lambda$1(collectAsState2);
                if ((GymTabContent$lambda$16 instanceof Collection) && GymTabContent$lambda$16.isEmpty()) {
                    i6 = 0;
                } else {
                    int i10 = 0;
                    for (GymSessionEntity gymSessionEntity3 : GymTabContent$lambda$16) {
                        if (gymSessionEntity3.getEndedAtMs() != null && !gymSessionEntity3.getFreeDay() && gymSessionEntity3.getTemplateDayId() != null && (i10 = i10 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                    i6 = i10;
                }
                Long GymTabContent$lambda$29 = GymTabContent$lambda$29(mutableState18);
                Integer valueOf3 = Integer.valueOf(i6);
                List<GymSessionEntity> GymTabContent$lambda$17 = GymTabContent$lambda$1(collectAsState2);
                startRestartGroup.startReplaceGroup(1780383555);
                boolean changed8 = startRestartGroup.changed(collectAsState2) | startRestartGroup.changedInstance(repository);
                Long l11 = l5;
                Object rememberedValue54 = startRestartGroup.rememberedValue();
                if (changed8) {
                    l6 = l4;
                } else {
                    l6 = l4;
                }
                rememberedValue54 = (Function2) new GymTabContentKt$GymTabContent$9$1(mutableState18, collectAsState2, repository, mutableState19, mutableState23, mutableState20, null);
                startRestartGroup.updateRememberedValue(rememberedValue54);
                startRestartGroup.endReplaceGroup();
                Long l12 = l6;
                EffectsKt.LaunchedEffect(GymTabContent$lambda$29, valueOf3, GymTabContent$lambda$17, (Function2) rememberedValue54, startRestartGroup, 0);
                Long GymTabContent$lambda$292 = GymTabContent$lambda$29(mutableState18);
                startRestartGroup.startReplaceGroup(1780423207);
                boolean changedInstance5 = startRestartGroup.changedInstance(repository);
                Object rememberedValue55 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue55 == Composer.INSTANCE.getEmpty()) {
                    mutableState2 = mutableState25;
                    rememberedValue55 = (Function2) new GymTabContentKt$GymTabContent$10$1(mutableState18, mutableState2, repository, null);
                    startRestartGroup.updateRememberedValue(rememberedValue55);
                } else {
                    mutableState2 = mutableState25;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(GymTabContent$lambda$292, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue55, startRestartGroup, 0);
                GymDayTemplateEntity GymTabContent$lambda$32 = GymTabContent$lambda$32(mutableState19);
                Long valueOf4 = GymTabContent$lambda$32 != null ? Long.valueOf(GymTabContent$lambda$32.getId()) : null;
                List<GymDayTemplateEntity> GymTabContent$lambda$50 = GymTabContent$lambda$50(mutableState2);
                startRestartGroup.startReplaceGroup(1780431879);
                boolean changed9 = startRestartGroup.changed(mutableState28);
                Object rememberedValue56 = startRestartGroup.rememberedValue();
                if (changed9 || rememberedValue56 == Composer.INSTANCE.getEmpty()) {
                    mutableState3 = mutableState19;
                    rememberedValue56 = (Function2) new GymTabContentKt$GymTabContent$11$1(mutableState2, mutableState28, mutableState3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue56);
                } else {
                    mutableState3 = mutableState19;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf4, GymTabContent$lambda$50, (Function2) rememberedValue56, startRestartGroup, 0);
                Integer valueOf5 = Integer.valueOf(i6);
                startRestartGroup.startReplaceGroup(1780445397);
                boolean changed10 = startRestartGroup.changed(l12) | startRestartGroup.changed(mutableState28);
                Object rememberedValue57 = startRestartGroup.rememberedValue();
                if (changed10 || rememberedValue57 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue57 = (Function2) new GymTabContentKt$GymTabContent$12$1(l12, mutableState3, mutableState2, mutableState28, null);
                    startRestartGroup.updateRememberedValue(rememberedValue57);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf5, l12, (Function2) rememberedValue57, startRestartGroup, 0);
                Long GymTabContent$lambda$293 = GymTabContent$lambda$29(mutableState18);
                Integer valueOf6 = Integer.valueOf(i6);
                List<GymDayTemplateEntity> GymTabContent$lambda$502 = GymTabContent$lambda$50(mutableState2);
                startRestartGroup.startReplaceGroup(1780452848);
                boolean changedInstance6 = startRestartGroup.changedInstance(context);
                Object rememberedValue58 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue58 == Composer.INSTANCE.getEmpty()) {
                    mutableState4 = mutableState3;
                    mutableState5 = mutableState2;
                    rememberedValue58 = (Function2) new GymTabContentKt$GymTabContent$13$1(mutableState18, context, mutableState2, mutableState29, null);
                    startRestartGroup.updateRememberedValue(rememberedValue58);
                } else {
                    mutableState4 = mutableState3;
                    mutableState5 = mutableState2;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(GymTabContent$lambda$293, valueOf6, GymTabContent$lambda$502, (Function2) rememberedValue58, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(1780461019);
                boolean changed11 = startRestartGroup.changed(l12);
                Object rememberedValue59 = startRestartGroup.rememberedValue();
                if (changed11 || rememberedValue59 == Composer.INSTANCE.getEmpty()) {
                    mutableState6 = mutableState39;
                    rememberedValue59 = (Function2) new GymTabContentKt$GymTabContent$14$1(l12, mutableState6, null);
                    startRestartGroup.updateRememberedValue(rememberedValue59);
                } else {
                    mutableState6 = mutableState39;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(l12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue59, startRestartGroup, 0);
                Long GymTabContent$lambda$54 = GymTabContent$lambda$54(mutableState28);
                startRestartGroup.startReplaceGroup(1780464896);
                boolean changed12 = startRestartGroup.changed(mutableState28) | startRestartGroup.changedInstance(repository);
                Object rememberedValue60 = startRestartGroup.rememberedValue();
                if (changed12 || rememberedValue60 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue60 = (Function2) new GymTabContentKt$GymTabContent$15$1(mutableState28, repository, mutableState27, null);
                    startRestartGroup.updateRememberedValue(rememberedValue60);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(GymTabContent$lambda$54, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue60, startRestartGroup, 0);
                Long GymTabContent$lambda$294 = GymTabContent$lambda$29(mutableState18);
                startRestartGroup.startReplaceGroup(1780473952);
                boolean changedInstance7 = startRestartGroup.changedInstance(repository);
                Object rememberedValue61 = startRestartGroup.rememberedValue();
                if (changedInstance7 || rememberedValue61 == Composer.INSTANCE.getEmpty()) {
                    mutableState7 = mutableState26;
                    rememberedValue61 = (Function2) new GymTabContentKt$GymTabContent$16$1(mutableState18, repository, mutableState7, null);
                    startRestartGroup.updateRememberedValue(rememberedValue61);
                } else {
                    mutableState7 = mutableState26;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(GymTabContent$lambda$294, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue61, startRestartGroup, 0);
                Long GymTabContent$lambda$295 = GymTabContent$lambda$29(mutableState18);
                startRestartGroup.startReplaceGroup(1780489886);
                boolean changedInstance8 = startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(repository);
                Object rememberedValue62 = startRestartGroup.rememberedValue();
                if (changedInstance8 || rememberedValue62 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue62 = (Function2) new GymTabContentKt$GymTabContent$17$1(context, mutableState18, repository, null);
                    startRestartGroup.updateRememberedValue(rememberedValue62);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(GymTabContent$lambda$295, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue62, startRestartGroup, 0);
                Long GymTabContent$lambda$296 = GymTabContent$lambda$29(mutableState18);
                if (GymTabContent$lambda$296 == null || (flowOf = repository.gymCarryoverFlow(GymTabContent$lambda$296.longValue())) == null) {
                    flowOf = FlowKt.flowOf(CollectionsKt.emptyList());
                }
                MutableState mutableState53 = mutableState7;
                MutableState mutableState54 = mutableState6;
                State collectAsState5 = SnapshotStateKt.collectAsState(flowOf, CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
                List<GymSessionEntity> GymTabContent$lambda$18 = GymTabContent$lambda$1(collectAsState2);
                startRestartGroup.startReplaceGroup(1780509322);
                boolean changed13 = startRestartGroup.changed(collectAsState2) | startRestartGroup.changedInstance(repository);
                Object rememberedValue63 = startRestartGroup.rememberedValue();
                if (changed13 || rememberedValue63 == Composer.INSTANCE.getEmpty()) {
                    mutableState8 = mutableState24;
                    rememberedValue63 = (Function2) new GymTabContentKt$GymTabContent$18$1(collectAsState2, repository, mutableState8, null);
                    startRestartGroup.updateRememberedValue(rememberedValue63);
                } else {
                    mutableState8 = mutableState24;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(GymTabContent$lambda$18, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue63, startRestartGroup, 0);
                String GymTabContent$lambda$6 = GymTabContent$lambda$6(mutableState11);
                startRestartGroup.startReplaceGroup(1780521419);
                boolean changed14 = startRestartGroup.changed(mutableState11) | startRestartGroup.changedInstance(repository);
                Object rememberedValue64 = startRestartGroup.rememberedValue();
                if (changed14 || rememberedValue64 == Composer.INSTANCE.getEmpty()) {
                    mutableState9 = mutableState11;
                    mutableState10 = mutableState8;
                    state = collectAsState2;
                    mutableIntState = mutableIntState3;
                    l7 = l12;
                    rememberedValue64 = (Function2) new GymTabContentKt$GymTabContent$19$1(mutableState11, repository, mutableState14, mutableState15, null);
                    startRestartGroup.updateRememberedValue(rememberedValue64);
                } else {
                    mutableIntState = mutableIntState3;
                    mutableState9 = mutableState11;
                    mutableState10 = mutableState8;
                    state = collectAsState2;
                    l7 = l12;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(GymTabContent$lambda$6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue64, startRestartGroup, 0);
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1251424891, true, new GymTabContentKt$GymTabContent$20(mutableState40, repository, coroutineScope, mutableState42, l7, gymSessionEntity2, gymSessionMediaRecorder, context, mutableState9, mutableState13, mutableState12, mutableIntState, mutableState41, mutableState45, mutableState17, mutableIntState2, mutableState37, mutableState30, mutableState31, mutableState50, mutableState47, mutableState46, pulse, mutableState35, mutableState53, mutableState48, collectAsState4, mutableState16, collectAsState, mutableState18, mutableState23, mutableState5, mutableState28, mutableState27, mutableState29, mutableState4, mutableState51, sharedPreferences2, mutableState52, state, mutableState10, mutableState33, mutableState34, collectAsState5, mutableState49, collectAsState3, mutableState44, mutableState54, mutableState38, mutableState43, mutableState14, mutableState15), startRestartGroup, 54), startRestartGroup, 196614, 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mainActivity2 = mainActivity3;
                l2 = l11;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Unit GymTabContent$lambda$162;
                        GymTabContent$lambda$162 = GymTabContentKt.GymTabContent$lambda$162(MainActivity.this, l2, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                        return GymTabContent$lambda$162;
                    }
                });
                return;
            }
            return;
        }
        l2 = l;
        i4 = i3;
        if ((i4 & 19) == 18) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2 = (Context) consume2;
        if (mainActivity3 != null) {
        }
        startRestartGroup.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(startRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState GymTabContent$lambda$5$lambda$4() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymTabContent$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymTabContent$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState GymTabContent$lambda$9$lambda$8() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState GymTabContent$lambda$13$lambda$12() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymTabContent$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExercisePr GymTabContent$lambda$17(MutableState<ExercisePr> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GymSetEntity GymTabContent$lambda$20(MutableState<GymSetEntity> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ExercisePr> GymTabContent$lambda$23(MutableState<List<ExercisePr>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> GymTabContent$lambda$26(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long GymTabContent$lambda$29(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GymDayTemplateEntity GymTabContent$lambda$32(MutableState<GymDayTemplateEntity> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> GymTabContent$lambda$38(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Float> GymTabContent$lambda$41(MutableState<Map<String, Float>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymTabContent$lambda$44(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Long, String> GymTabContent$lambda$47(MutableState<Map<Long, String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GymDayTemplateEntity> GymTabContent$lambda$50(MutableState<List<GymDayTemplateEntity>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState GymTabContent$lambda$53$lambda$52() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long GymTabContent$lambda$54(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<Long> GymTabContent$lambda$57(MutableState<Set<Long>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymTabContent$lambda$60(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymTabContent$lambda$63(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, GymPulleySelection> GymTabContent$lambda$66(MutableState<Map<String, GymPulleySelection>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GymTabContent$lambda$69(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GymTabContent$lambda$70(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GymTabContent$lambda$72(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GymTabContent$lambda$73(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GymTabContent$lambda$76(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MuscleVolumeHeatmap GymTabContent$lambda$79(MutableState<MuscleVolumeHeatmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<WeekVolumeBar> GymTabContent$lambda$82(MutableState<List<WeekVolumeBar>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Double> GymTabContent$lambda$85(MutableState<Map<String, Double>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Boolean> GymTabContent$lambda$88(MutableState<Map<String, Boolean>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState GymTabContent$lambda$91$lambda$90() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymTabContent$lambda$92(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ExerciseHistoryPoint> GymTabContent$lambda$95(MutableState<List<ExerciseHistoryPoint>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState GymTabContent$lambda$98$lambda$97() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymTabContent$lambda$99(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Long, String> GymTabContent$lambda$102(MutableState<Pair<Long, String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState GymTabContent$lambda$105$lambda$104() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GymTabContent$lambda$106(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> GymTabContent$lambda$109(MutableState<Map<String, String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GymTabContent$lambda$112(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GymTabContent$lambda$113(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Triple<String, List<GymDayTemplateEntity>, Map<Long, List<ExerciseTemplateEntity>>> GymTabContent$lambda$115(MutableState<Triple<String, List<GymDayTemplateEntity>, Map<Long, List<ExerciseTemplateEntity>>>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableIntState GymTabContent$lambda$126$lambda$125() {
        return SnapshotIntStateKt.mutableIntStateOf(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GymTabContent$lambda$127(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<ExerciseTemplateEntity> GymTabContent$lambda$132(MutableState<List<ExerciseTemplateEntity>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> GymTabContent$lambda$135(MutableState<Map<String, String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GymSessionEntity GymTabContent$lambda$138(MutableState<GymSessionEntity> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GymSessionEntity GymTabContent$lambda$141(MutableState<GymSessionEntity> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GymSessionMediaTimelineSection(final long j, final long j2, final Repository repository, Composer composer, final int i) {
        int i2;
        int i3;
        Integer num;
        State state;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1774151597);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(repository) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1774151597, i4, -1, "com.example.rungps.ui.gym.GymSessionMediaTimelineSection (GymTabContent.kt:1663)");
            }
            State collectAsState = SnapshotStateKt.collectAsState(repository.spotifyTimelineForGymSessionFlow(j), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            startRestartGroup.startReplaceGroup(1291696663);
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            Long valueOf = Long.valueOf(j);
            startRestartGroup.startReplaceGroup(1291701105);
            boolean changedInstance = startRestartGroup.changedInstance(repository) | (i5 == 4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function2) new GymTabContentKt$GymSessionMediaTimelineSection$1$1(repository, j, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i5);
            Long valueOf2 = Long.valueOf(j);
            Integer valueOf3 = Integer.valueOf(GymSessionMediaTimelineSection$lambda$163(collectAsState).size());
            startRestartGroup.startReplaceGroup(1291711732);
            boolean changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(collectAsState) | startRestartGroup.changedInstance(repository) | (i5 == 4);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                i3 = i5;
                num = valueOf3;
                state = collectAsState;
                rememberedValue3 = (Function2) new GymTabContentKt$GymSessionMediaTimelineSection$2$1(mutableState, collectAsState, repository, j, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                i3 = i5;
                num = valueOf3;
                state = collectAsState;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf2, num, (Function2) rememberedValue3, startRestartGroup, i3);
            if (GymSessionMediaTimelineSection$lambda$163(state).isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit GymSessionMediaTimelineSection$lambda$169;
                            GymSessionMediaTimelineSection$lambda$169 = GymTabContentKt.GymSessionMediaTimelineSection$lambda$169(j, j2, repository, i, (Composer) obj, ((Integer) obj2).intValue());
                            return GymSessionMediaTimelineSection$lambda$169;
                        }
                    });
                    return;
                }
                return;
            }
            composer2 = startRestartGroup;
            GymSessionMediaTimelineKt.GymSessionMediaTimelineList(GymSessionMediaTimelineSection$lambda$163(state), j2, null, null, null, null, composer2, i4 & SdkConfig.SDK_VERSION, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymTabContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GymSessionMediaTimelineSection$lambda$170;
                    GymSessionMediaTimelineSection$lambda$170 = GymTabContentKt.GymSessionMediaTimelineSection$lambda$170(j, j2, repository, i, (Composer) obj, ((Integer) obj2).intValue());
                    return GymSessionMediaTimelineSection$lambda$170;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GymSessionMediaTimelineSection$lambda$165(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GymSessionMediaTimelineSection$lambda$166(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GymSplitEntity> GymTabContent$lambda$0(State<? extends List<GymSplitEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GymSessionEntity> GymTabContent$lambda$1(State<? extends List<GymSessionEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RecoveryEventEntity> GymTabContent$lambda$2(State<? extends List<RecoveryEventEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GymLoadStats GymTabContent$lambda$3(State<GymLoadStats> state) {
        return state.getValue();
    }

    private static final List<GymSetEntity> GymTabContent$lambda$120(State<? extends List<GymSetEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GymCarryoverEntity> GymTabContent$lambda$159(State<? extends List<GymCarryoverEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SpotifyTimelineEntity> GymSessionMediaTimelineSection$lambda$163(State<? extends List<SpotifyTimelineEntity>> state) {
        return state.getValue();
    }
}
