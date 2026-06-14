package com.example.rungps.ui.run;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.health.platform.client.SdkConfig;
import com.example.rungps.export.RunRouteOverlayRenderer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RunOverlayExportDialog.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\f\u0010\b\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\rX\u008a\u008e\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\rX\u008a\u008e\u0002²\u0006\u001c\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00160\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002"}, d2 = {"RunOverlayExportDialog", "", "runId", "", "onDismiss", "Lkotlin/Function0;", "(JLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "pickedUri", "Landroid/net/Uri;", "previewBitmap", "Landroid/graphics/Bitmap;", "loadingRun", "", "renderingImage", "saving", "stravaUploading", "renderError", "", "runReady", "latLon", "", "Lkotlin/Pair;", "", "stats", "Lcom/example/rungps/export/RunRouteOverlayRenderer$RunStats;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunOverlayExportDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunOverlayExportDialog$lambda$34(long j, Function0 function0, int i, Composer composer, int i2) {
        RunOverlayExportDialog(j, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RunOverlayExportDialog(final long j, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        MutableState mutableState;
        int i3;
        MutableState mutableState2;
        MutableState mutableState3;
        int i4;
        Context context;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-1023625431);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i5 = i2;
        if ((i5 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1023625431, i5, -1, "com.example.rungps.ui.run.RunOverlayExportDialog (RunOverlayExportDialog.kt:47)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context2 = (Context) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(207332487);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(207334570);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState5 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(207336641);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState6 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(207338562);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState7 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(207340258);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState8 = (MutableState) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(207342242);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState9 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(207344106);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            final MutableState mutableState10 = (MutableState) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(207346114);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState11 = (MutableState) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(207347844);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            MutableState mutableState12 = (MutableState) rememberedValue10;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(207350610);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new RunRouteOverlayRenderer.RunStats(0.0d, 0L), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            MutableState mutableState13 = (MutableState) rememberedValue11;
            startRestartGroup.endReplaceGroup();
            ActivityResultContracts.GetContent getContent = new ActivityResultContracts.GetContent();
            startRestartGroup.startReplaceGroup(207357086);
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Function1() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit RunOverlayExportDialog$lambda$31$lambda$30;
                        RunOverlayExportDialog$lambda$31$lambda$30 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$31$lambda$30(MutableState.this, mutableState5, mutableState10, (Uri) obj);
                        return RunOverlayExportDialog$lambda$31$lambda$30;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            startRestartGroup.endReplaceGroup();
            ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent, (Function1) rememberedValue12, startRestartGroup, 48);
            Long valueOf = Long.valueOf(j);
            startRestartGroup.startReplaceGroup(207361804);
            int i6 = i5 & 14;
            boolean changedInstance = startRestartGroup.changedInstance(context2) | (i6 == 4) | ((i5 & SdkConfig.SDK_VERSION) == 32);
            RunOverlayExportDialogKt$RunOverlayExportDialog$1$1 rememberedValue13 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState10;
                i3 = i6;
                mutableState2 = mutableState5;
                mutableState3 = mutableState4;
                i4 = i5;
                context = context2;
                rememberedValue13 = new RunOverlayExportDialogKt$RunOverlayExportDialog$1$1(context2, onDismiss, mutableState6, j, mutableState12, mutableState13, mutableState11, null);
                startRestartGroup.updateRememberedValue(rememberedValue13);
            } else {
                mutableState = mutableState10;
                i3 = i6;
                mutableState2 = mutableState5;
                mutableState3 = mutableState4;
                i4 = i5;
                context = context2;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue13, startRestartGroup, i3);
            Object[] objArr = {RunOverlayExportDialog$lambda$1(mutableState3), Boolean.valueOf(RunOverlayExportDialog$lambda$22(mutableState11)), RunOverlayExportDialog$lambda$25(mutableState12), RunOverlayExportDialog$lambda$28(mutableState13)};
            startRestartGroup.startReplaceGroup(207392692);
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            RunOverlayExportDialogKt$RunOverlayExportDialog$2$1 rememberedValue14 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new RunOverlayExportDialogKt$RunOverlayExportDialog$2$1(mutableState3, mutableState11, mutableState12, mutableState7, mutableState, mutableState2, context, mutableState13, null);
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue14, startRestartGroup, 0);
            boolean z = (RunOverlayExportDialog$lambda$4(mutableState2) == null || (RunOverlayExportDialog$lambda$7(mutableState6) || RunOverlayExportDialog$lambda$10(mutableState7) || RunOverlayExportDialog$lambda$13(mutableState8) || RunOverlayExportDialog$lambda$16(mutableState9))) ? false : true;
            MutableState mutableState14 = mutableState2;
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(1822158305, true, new RunOverlayExportDialogKt$RunOverlayExportDialog$3(context, onDismiss, z, mutableState14), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(1392499999, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1392499999, i7, -1, "com.example.rungps.ui.run.RunOverlayExportDialog.<anonymous> (RunOverlayExportDialog.kt:242)");
                    }
                    ButtonKt.OutlinedButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$RunOverlayExportDialogKt.INSTANCE.m7412getLambda2$app_sideload(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableSingletons$RunOverlayExportDialogKt.INSTANCE.m7413getLambda3$app_sideload(), ComposableLambdaKt.rememberComposableLambda(748012540, true, new RunOverlayExportDialogKt$RunOverlayExportDialog$5(rememberLauncherForActivityResult, coroutineScope, context, z, j, mutableState11, mutableState6, mutableState3, mutableState7, mutableState8, mutableState, mutableState14, mutableState9), composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i4 >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RunOverlayExportDialog$lambda$34;
                    RunOverlayExportDialog$lambda$34 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$34(j, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                    return RunOverlayExportDialog$lambda$34;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri RunOverlayExportDialog$lambda$1(MutableState<Uri> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap RunOverlayExportDialog$lambda$4(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RunOverlayExportDialog$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunOverlayExportDialog$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RunOverlayExportDialog$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunOverlayExportDialog$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RunOverlayExportDialog$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunOverlayExportDialog$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RunOverlayExportDialog$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunOverlayExportDialog$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String RunOverlayExportDialog$lambda$19(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RunOverlayExportDialog$lambda$22(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunOverlayExportDialog$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Pair<Double, Double>> RunOverlayExportDialog$lambda$25(MutableState<List<Pair<Double, Double>>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RunRouteOverlayRenderer.RunStats RunOverlayExportDialog$lambda$28(MutableState<RunRouteOverlayRenderer.RunStats> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunOverlayExportDialog$lambda$31$lambda$30(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Uri uri) {
        mutableState.setValue(uri);
        mutableState2.setValue(null);
        mutableState3.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RunOverlayExportDialog$saveToPhotos(CoroutineScope coroutineScope, MutableState<Bitmap> mutableState, Context context, MutableState<Boolean> mutableState2) {
        Bitmap RunOverlayExportDialog$lambda$4 = RunOverlayExportDialog$lambda$4(mutableState);
        if (RunOverlayExportDialog$lambda$4 == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RunOverlayExportDialogKt$RunOverlayExportDialog$saveToPhotos$1(context, mutableState2, RunOverlayExportDialog$lambda$4, null), 3, null);
    }
}
