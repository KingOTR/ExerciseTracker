package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.health.platform.client.SdkConfig;
import com.example.rungps.data.GearEntity;
import com.example.rungps.data.PointEntity;
import com.example.rungps.data.RunHrSampleEntity;
import com.example.rungps.data.RunSplitEntity;
import com.example.rungps.data.SpotifyTimelineEntity;
import com.example.rungps.data.UserProfile;
import com.example.rungps.data.UserProfileStore;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.sleep.SleepAlarmPreferences;
import com.example.rungps.ui.sport.SportTrackingPrefs;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.views.MapView;

/* compiled from: RunDetailsPanel.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\u0003\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a5\u0010\f\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u008a\u008e\u0002²\u0006\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000eX\u008a\u008e\u0002²\u0006\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002²\u0006\f\u0010#\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\"X\u008a\u008e\u0002²\u0006\u0010\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000eX\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\f\u0010*\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\u0010\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u000eX\u008a\u008e\u0002²\u0006\u0016\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020/0.X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\"X\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020/X\u008a\u008e\u0002²\u0006\n\u00102\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"RunDetailsPanel", "", "runId", "", "onClose", "Lkotlin/Function0;", "onExport", "Lkotlin/Function1;", "onShareOnPhoto", "vm", "Lcom/example/rungps/feature/run/RunsViewModel;", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/example/rungps/feature/run/RunsViewModel;Landroidx/compose/runtime/Composer;I)V", "RunDetailsMap", "points", "", "Lcom/example/rungps/data/PointEntity;", "startIdx", "", "endIdx", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "hrSamples", "Lcom/example/rungps/data/RunHrSampleEntity;", "splits", "Lcom/example/rungps/data/RunSplitEntity;", "header", "", "sub", "startedAtMs", "startOffsetText", "endOffsetText", "showTrim", "", "watchImportId", "isBike", SleepAlarmPreferences.SOUND_SPOTIFY, "Lcom/example/rungps/data/SpotifyTimelineEntity;", "editTitle", "editDescription", "editPrivateNotes", "selectedGearId", "gearOptions", "Lcom/example/rungps/data/GearEntity;", "kmByGearId", "", "", "savingMeta", "totalDistanceM", "totalDurationMs"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunDetailsPanelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MapView RunDetailsMap$lambda$86$lambda$85$lambda$84(MapView mapView, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return mapView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunDetailsMap$lambda$87(List list, int i, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        RunDetailsMap(list, i, i2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunDetailsPanel$lambda$77(long j, Function0 function0, Function1 function1, Function0 function02, RunsViewModel runsViewModel, int i, Composer composer, int i2) {
        RunDetailsPanel(j, function0, function1, function02, runsViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RunDetailsPanel(final long j, final Function0<Unit> onClose, final Function1<? super Long, Unit> onExport, final Function0<Unit> onShareOnPhoto, final RunsViewModel vm, Composer composer, final int i) {
        int i2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        Object obj;
        Object mutableStateOf$default;
        MutableState mutableState;
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onExport, "onExport");
        Intrinsics.checkNotNullParameter(onShareOnPhoto, "onShareOnPhoto");
        Intrinsics.checkNotNullParameter(vm, "vm");
        Composer startRestartGroup = composer.startRestartGroup(2016591038);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onClose) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onExport) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onShareOnPhoto) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(vm) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2016591038, i2, -1, "com.example.rungps.ui.main.RunDetailsPanel (RunDetailsPanel.kt:65)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            startRestartGroup.startReplaceGroup(-1836728305);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836725683);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState3 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836722230);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState4 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836718797);
            boolean changed = startRestartGroup.changed(context);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = UserProfile.resolvedAgeYears$default(UserProfileStore.INSTANCE.load(context), null, 1, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Integer num = (Integer) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836716197);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("Loading…", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState5 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836714445);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState6 = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836712669);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (z || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState7 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            Object[] objArr = {Long.valueOf(j)};
            startRestartGroup.startReplaceGroup(-1836709751);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function0() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState RunDetailsPanel$lambda$20$lambda$19;
                        RunDetailsPanel$lambda$20$lambda$19 = RunDetailsPanelKt.RunDetailsPanel$lambda$20$lambda$19();
                        return RunDetailsPanel$lambda$20$lambda$19;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState8 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue8, startRestartGroup, 3072, 6);
            Object[] objArr2 = {Long.valueOf(j)};
            startRestartGroup.startReplaceGroup(-1836707703);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new Function0() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState RunDetailsPanel$lambda$24$lambda$23;
                        RunDetailsPanel$lambda$24$lambda$23 = RunDetailsPanelKt.RunDetailsPanel$lambda$24$lambda$23();
                        return RunDetailsPanel$lambda$24$lambda$23;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState9 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue9, startRestartGroup, 3072, 6);
            Object[] objArr3 = {Long.valueOf(j)};
            startRestartGroup.startReplaceGroup(-1836705362);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new Function0() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState RunDetailsPanel$lambda$28$lambda$27;
                        RunDetailsPanel$lambda$28$lambda$27 = RunDetailsPanelKt.RunDetailsPanel$lambda$28$lambda$27();
                        return RunDetailsPanel$lambda$28$lambda$27;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState10 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue10, startRestartGroup, 3072, 6);
            Object[] objArr4 = {Long.valueOf(j)};
            startRestartGroup.startReplaceGroup(-1836702934);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new Function0() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState RunDetailsPanel$lambda$32$lambda$31;
                        RunDetailsPanel$lambda$32$lambda$31 = RunDetailsPanelKt.RunDetailsPanel$lambda$32$lambda$31();
                        return RunDetailsPanel$lambda$32$lambda$31;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState11 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) rememberedValue11, startRestartGroup, 3072, 6);
            Object[] objArr5 = {Long.valueOf(j)};
            startRestartGroup.startReplaceGroup(-1836700787);
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState RunDetailsPanel$lambda$36$lambda$35;
                        RunDetailsPanel$lambda$36$lambda$35 = RunDetailsPanelKt.RunDetailsPanel$lambda$36$lambda$35();
                        return RunDetailsPanel$lambda$36$lambda$35;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState12 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) rememberedValue12, startRestartGroup, 3072, 6);
            startRestartGroup.startReplaceGroup(-1836699133);
            boolean z2 = i3 == 4;
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                snapshotMutationPolicy = null;
                MutableState mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                rememberedValue13 = mutableStateOf$default2;
            } else {
                snapshotMutationPolicy = null;
            }
            MutableState mutableState13 = (MutableState) rememberedValue13;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836697027);
            boolean z3 = i3 == 4;
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            MutableState mutableState14 = (MutableState) rememberedValue14;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836695040);
            boolean z4 = i3 == 4;
            Object rememberedValue15 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                rememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue15);
            }
            MutableState mutableState15 = (MutableState) rememberedValue15;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836691942);
            boolean z5 = i3 == 4;
            Object rememberedValue16 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                obj = "";
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(mutableStateOf$default);
            } else {
                mutableStateOf$default = rememberedValue16;
                obj = "";
            }
            MutableState mutableState16 = (MutableState) mutableStateOf$default;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836689830);
            boolean z6 = i3 == 4;
            Object rememberedValue17 = startRestartGroup.rememberedValue();
            if (z6 || rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                rememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue17);
            }
            MutableState mutableState17 = (MutableState) rememberedValue17;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836687686);
            boolean z7 = i3 == 4;
            Object rememberedValue18 = startRestartGroup.rememberedValue();
            if (z7 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default3);
                rememberedValue18 = mutableStateOf$default3;
            }
            MutableState mutableState18 = (MutableState) rememberedValue18;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836685597);
            boolean z8 = i3 == 4;
            Object rememberedValue19 = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default4);
                rememberedValue19 = mutableStateOf$default4;
            }
            MutableState mutableState19 = (MutableState) rememberedValue19;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836683307);
            boolean z9 = i3 == 4;
            Object rememberedValue20 = startRestartGroup.rememberedValue();
            if (z9 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default5);
                rememberedValue20 = mutableStateOf$default5;
            }
            MutableState mutableState20 = (MutableState) rememberedValue20;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836680491);
            boolean z10 = i3 == 4;
            Object rememberedValue21 = startRestartGroup.rememberedValue();
            if (z10 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default6);
                rememberedValue21 = mutableStateOf$default6;
            }
            MutableState mutableState21 = (MutableState) rememberedValue21;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836677699);
            boolean z11 = i3 == 4;
            Object rememberedValue22 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default7);
                rememberedValue22 = mutableStateOf$default7;
            }
            MutableState mutableState22 = (MutableState) rememberedValue22;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836675525);
            boolean z12 = i3 == 4;
            Object rememberedValue23 = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Double.valueOf(0.0d), null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default8);
                rememberedValue23 = mutableStateOf$default8;
            }
            MutableState mutableState23 = (MutableState) rememberedValue23;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836673382);
            boolean z13 = i3 == 4;
            Object rememberedValue24 = startRestartGroup.rememberedValue();
            if (z13 || rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState22;
                rememberedValue24 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue24);
            } else {
                mutableState = mutableState22;
            }
            MutableState mutableState24 = (MutableState) rememberedValue24;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1836671447);
            boolean changed2 = startRestartGroup.changed(context);
            Object rememberedValue25 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                rememberedValue25 = SportTrackingPrefs.INSTANCE.displayName(context);
                startRestartGroup.updateRememberedValue(rememberedValue25);
            }
            String str = (String) rememberedValue25;
            startRestartGroup.endReplaceGroup();
            ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            Long valueOf = Long.valueOf(j);
            startRestartGroup.startReplaceGroup(-1836665352);
            boolean changed3 = startRestartGroup.changed(mutableState13) | startRestartGroup.changed(mutableState14) | startRestartGroup.changedInstance(context) | (i3 == 4) | startRestartGroup.changed(mutableState15) | startRestartGroup.changed(mutableState7) | startRestartGroup.changed(mutableState16) | startRestartGroup.changed(mutableState17) | startRestartGroup.changed(mutableState18) | startRestartGroup.changed(mutableState19) | startRestartGroup.changed(mutableState20) | startRestartGroup.changed(mutableState21) | startRestartGroup.changed(mutableState23) | startRestartGroup.changed(mutableState24) | startRestartGroup.changed(mutableState8) | startRestartGroup.changed(mutableState9) | startRestartGroup.changed(mutableState10) | startRestartGroup.changed(mutableState11);
            RunDetailsPanelKt$RunDetailsPanel$1$1 rememberedValue26 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                rememberedValue26 = new RunDetailsPanelKt$RunDetailsPanel$1$1(context, mutableState5, mutableState6, mutableState2, mutableState4, mutableState13, mutableState14, j, mutableState3, mutableState15, mutableState7, mutableState16, mutableState17, mutableState18, mutableState19, mutableState20, mutableState21, mutableState23, mutableState24, mutableState8, mutableState9, mutableState10, mutableState11, null);
                startRestartGroup.updateRememberedValue(rememberedValue26);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue26, startRestartGroup, i3);
            startRestartGroup = startRestartGroup;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1590932212, true, new RunDetailsPanelKt$RunDetailsPanel$2(rememberScrollState, vm, j, onClose, mutableState16, mutableState17, mutableState18, mutableState19, mutableState, mutableState7, mutableState14, mutableState23, mutableState24, num, mutableState12, mutableState8, mutableState9, mutableState5, mutableState6, mutableState13, str, mutableState20, mutableState21, mutableState4, mutableState3, mutableState15, mutableState2, mutableState10, mutableState11, onShareOnPhoto, onExport), startRestartGroup, 54), startRestartGroup, 196614, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit RunDetailsPanel$lambda$77;
                    RunDetailsPanel$lambda$77 = RunDetailsPanelKt.RunDetailsPanel$lambda$77(j, onClose, onExport, onShareOnPhoto, vm, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return RunDetailsPanel$lambda$77;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<PointEntity> RunDetailsPanel$lambda$1(MutableState<List<PointEntity>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RunHrSampleEntity> RunDetailsPanel$lambda$4(MutableState<List<RunHrSampleEntity>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RunSplitEntity> RunDetailsPanel$lambda$7(MutableState<List<RunSplitEntity>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RunDetailsPanel$lambda$11(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RunDetailsPanel$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long RunDetailsPanel$lambda$17(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState RunDetailsPanel$lambda$20$lambda$19() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RunDetailsPanel$lambda$21(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunDetailsPanel$lambda$22(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState RunDetailsPanel$lambda$24$lambda$23() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int RunDetailsPanel$lambda$25(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunDetailsPanel$lambda$26(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState RunDetailsPanel$lambda$28$lambda$27() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("0:00", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RunDetailsPanel$lambda$29(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState RunDetailsPanel$lambda$32$lambda$31() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RunDetailsPanel$lambda$33(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState RunDetailsPanel$lambda$36$lambda$35() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RunDetailsPanel$lambda$37(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunDetailsPanel$lambda$38(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long RunDetailsPanel$lambda$40(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RunDetailsPanel$lambda$43(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunDetailsPanel$lambda$44(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SpotifyTimelineEntity> RunDetailsPanel$lambda$46(MutableState<List<SpotifyTimelineEntity>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RunDetailsPanel$lambda$49(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RunDetailsPanel$lambda$52(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RunDetailsPanel$lambda$55(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long RunDetailsPanel$lambda$58(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GearEntity> RunDetailsPanel$lambda$61(MutableState<List<GearEntity>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<Long, Double> RunDetailsPanel$lambda$64(MutableState<Map<Long, Double>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RunDetailsPanel$lambda$67(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunDetailsPanel$lambda$68(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double RunDetailsPanel$lambda$70(MutableState<Double> mutableState) {
        return mutableState.getValue().doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunDetailsPanel$lambda$71(MutableState<Double> mutableState, double d) {
        mutableState.setValue(Double.valueOf(d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long RunDetailsPanel$lambda$73(MutableState<Long> mutableState) {
        return mutableState.getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunDetailsPanel$lambda$74(MutableState<Long> mutableState, long j) {
        mutableState.setValue(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RunDetailsMap(final List<PointEntity> list, final int i, final int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        Object rememberedValue;
        boolean changedInstance;
        Object rememberedValue2;
        boolean changedInstance2;
        Object rememberedValue3;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean changedInstance3;
        Object rememberedValue4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2001795122);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i6 = i5;
            if ((i6 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2001795122, i6, -1, "com.example.rungps.ui.main.RunDetailsMap (RunDetailsPanel.kt:314)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                startRestartGroup.startReplaceGroup(-1796379191);
                rememberedValue = startRestartGroup.rememberedValue();
                Object obj = rememberedValue;
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    MapView mapView = new MapView(context);
                    mapView.setMultiTouchControls(true);
                    mapView.setTileSource(TileSourceFactory.MAPNIK);
                    mapView.setBuiltInZoomControls(false);
                    startRestartGroup.updateRememberedValue(mapView);
                    obj = mapView;
                }
                final MapView mapView2 = (MapView) obj;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1796372215);
                changedInstance = startRestartGroup.changedInstance(mapView2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            DisposableEffectResult RunDetailsMap$lambda$82$lambda$81;
                            RunDetailsMap$lambda$82$lambda$81 = RunDetailsPanelKt.RunDetailsMap$lambda$82$lambda$81(MapView.this, (DisposableEffectScope) obj2);
                            return RunDetailsMap$lambda$82$lambda$81;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(mapView2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
                Integer valueOf = Integer.valueOf(i);
                Integer valueOf2 = Integer.valueOf(i2);
                startRestartGroup.startReplaceGroup(-1796366150);
                changedInstance2 = startRestartGroup.changedInstance(list) | ((i6 & SdkConfig.SDK_VERSION) != 32) | ((i6 & 896) != 256) | startRestartGroup.changedInstance(mapView2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (Function2) new RunDetailsPanelKt$RunDetailsMap$2$1(list, i, i2, mapView2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(list, valueOf, valueOf2, (Function2) rememberedValue3, startRestartGroup, i6 & 1022);
                float f = 260;
                Modifier clipToBounds = ClipKt.clipToBounds(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6303constructorimpl(f)));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, clipToBounds);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor);
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier m715height3ABfNKs = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(f));
                startRestartGroup.startReplaceGroup(118776374);
                changedInstance3 = startRestartGroup.changedInstance(mapView2);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            MapView RunDetailsMap$lambda$86$lambda$85$lambda$84;
                            RunDetailsMap$lambda$86$lambda$85$lambda$84 = RunDetailsPanelKt.RunDetailsMap$lambda$86$lambda$85$lambda$84(MapView.this, (Context) obj2);
                            return RunDetailsMap$lambda$86$lambda$85$lambda$84;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                modifier2 = modifier3;
                AndroidView_androidKt.AndroidView((Function1) rememberedValue4, m715height3ABfNKs, null, startRestartGroup, 48, 4);
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
            final Modifier modifier4 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit RunDetailsMap$lambda$87;
                        RunDetailsMap$lambda$87 = RunDetailsPanelKt.RunDetailsMap$lambda$87(list, i, i2, modifier4, i3, i4, (Composer) obj2, ((Integer) obj3).intValue());
                        return RunDetailsMap$lambda$87;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i6 = i5;
        if ((i6 & 1171) == 1170) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2 = (Context) consume2;
        startRestartGroup.startReplaceGroup(-1796379191);
        rememberedValue = startRestartGroup.rememberedValue();
        Object obj2 = rememberedValue;
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final MapView mapView22 = (MapView) obj2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1796372215);
        changedInstance = startRestartGroup.changedInstance(mapView22);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                DisposableEffectResult RunDetailsMap$lambda$82$lambda$81;
                RunDetailsMap$lambda$82$lambda$81 = RunDetailsPanelKt.RunDetailsMap$lambda$82$lambda$81(MapView.this, (DisposableEffectScope) obj22);
                return RunDetailsMap$lambda$82$lambda$81;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(mapView22, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
        Integer valueOf3 = Integer.valueOf(i);
        Integer valueOf22 = Integer.valueOf(i2);
        startRestartGroup.startReplaceGroup(-1796366150);
        changedInstance2 = startRestartGroup.changedInstance(list) | ((i6 & SdkConfig.SDK_VERSION) != 32) | ((i6 & 896) != 256) | startRestartGroup.changedInstance(mapView22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue3 = (Function2) new RunDetailsPanelKt$RunDetailsMap$2$1(list, i, i2, mapView22, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(list, valueOf3, valueOf22, (Function2) rememberedValue3, startRestartGroup, i6 & 1022);
        float f2 = 260;
        Modifier clipToBounds2 = ClipKt.clipToBounds(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6303constructorimpl(f2)));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, clipToBounds2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Modifier m715height3ABfNKs2 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(f2));
        startRestartGroup.startReplaceGroup(118776374);
        changedInstance3 = startRestartGroup.changedInstance(mapView22);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj22) {
                MapView RunDetailsMap$lambda$86$lambda$85$lambda$84;
                RunDetailsMap$lambda$86$lambda$85$lambda$84 = RunDetailsPanelKt.RunDetailsMap$lambda$86$lambda$85$lambda$84(MapView.this, (Context) obj22);
                return RunDetailsMap$lambda$86$lambda$85$lambda$84;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        modifier2 = modifier3;
        AndroidView_androidKt.AndroidView((Function1) rememberedValue4, m715height3ABfNKs2, null, startRestartGroup, 48, 4);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        final Modifier modifier42 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult RunDetailsMap$lambda$82$lambda$81(final MapView mapView, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        mapView.onResume();
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$RunDetailsMap$lambda$82$lambda$81$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MapView.this.onPause();
                MapView.this.onDetach();
            }
        };
    }
}
