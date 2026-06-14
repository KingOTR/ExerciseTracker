package com.example.rungps.ui.shell;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.example.rungps.MainActivity;
import com.example.rungps.ble.BleClient;
import com.example.rungps.ble.BleStatus;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.tracking.TrackingUiState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$29$1$4 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ BleClient $ble;
    final /* synthetic */ MutableState<String> $bleAddr$delegate;
    final /* synthetic */ State<BleStatus> $bleStatus$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Long> $deleteOneId$delegate;
    final /* synthetic */ MutableState<Long> $focusGymSessionId$delegate;
    final /* synthetic */ State<GymLoadStats> $gymLoad$delegate;
    final /* synthetic */ State<List<GymSessionEntity>> $gymSessions$delegate;
    final /* synthetic */ State<TrackingUiState> $live$delegate;
    final /* synthetic */ MainActivity $mainAct;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Function1<Long, Unit> $onExport;
    final /* synthetic */ Function0<Unit> $onStart;
    final /* synthetic */ Function0<Unit> $onStop;
    final /* synthetic */ MutableState<Long> $photoExportRunId$delegate;
    final /* synthetic */ State<List<RouteEntity>> $routes$delegate;
    final /* synthetic */ MutableState<Long> $selectedRunId$delegate;
    final /* synthetic */ MutableState<Boolean> $showConfirmStart$delegate;
    final /* synthetic */ MutableState<Boolean> $showDeleteAll$delegate;
    final /* synthetic */ boolean $started;
    final /* synthetic */ RunsViewModel $vm;

    /* JADX WARN: Multi-variable type inference failed */
    AppScreenKt$AppScreen$29$1$4(NavHostController navHostController, State<TrackingUiState> state, MutableState<Long> mutableState, MutableState<Long> mutableState2, State<? extends List<RouteEntity>> state2, State<BleStatus> state3, State<? extends List<GymSessionEntity>> state4, MutableState<String> mutableState3, State<GymLoadStats> state5, Function1<? super Long, Unit> function1, MutableState<Long> mutableState4, RunsViewModel runsViewModel, MainActivity mainActivity, boolean z, Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState5, BleClient bleClient, Context context, MutableState<Boolean> mutableState6, MutableState<Long> mutableState7) {
        this.$navController = navHostController;
        this.$live$delegate = state;
        this.$selectedRunId$delegate = mutableState;
        this.$focusGymSessionId$delegate = mutableState2;
        this.$routes$delegate = state2;
        this.$bleStatus$delegate = state3;
        this.$gymSessions$delegate = state4;
        this.$bleAddr$delegate = mutableState3;
        this.$gymLoad$delegate = state5;
        this.$onExport = function1;
        this.$photoExportRunId$delegate = mutableState4;
        this.$vm = runsViewModel;
        this.$mainAct = mainActivity;
        this.$started = z;
        this.$onStart = function0;
        this.$onStop = function02;
        this.$showConfirmStart$delegate = mutableState5;
        this.$ble = bleClient;
        this.$ctx = context;
        this.$showDeleteAll$delegate = mutableState6;
        this.$deleteOneId$delegate = mutableState7;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState invoke$lambda$1$lambda$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long invoke$lambda$2(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v26 ??, still in use, count: 1, list:
          (r1v26 ?? I:java.lang.Object) from 0x0232: INVOKE (r40v0 ?? I:androidx.compose.runtime.Composer), (r1v26 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:565)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v26 ??, still in use, count: 1, list:
          (r1v26 ?? I:java.lang.Object) from 0x0232: INVOKE (r40v0 ?? I:androidx.compose.runtime.Composer), (r1v26 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:565)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r39v0 ??
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
    public static final MutableState invoke$lambda$5$lambda$4() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(List list, State state, MutableState mutableState, Function1 function1, MutableState mutableState2, RunsViewModel runsViewModel, MutableState mutableState3, MutableState mutableState4, MainActivity mainActivity, boolean z, Function0 function0, Function0 function02, MutableState mutableState5, BleClient bleClient, MutableState mutableState6, Context context, NavHostController navHostController, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, State state2, State state3, State state4, State state5, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            NavGraphBuilderKt.composable$default(NavHost, str, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(306149953, true, new AppScreenKt$AppScreen$29$1$4$1$1$1$1(str, state, mutableState, function1, mutableState2, runsViewModel, mutableState3, mutableState4, mainActivity, z, function0, function02, mutableState5, bleClient, mutableState6, context, navHostController, mutableState7, mutableState8, mutableState9, state2, state3, state4, state5)), 254, null);
        }
        return Unit.INSTANCE;
    }
}
