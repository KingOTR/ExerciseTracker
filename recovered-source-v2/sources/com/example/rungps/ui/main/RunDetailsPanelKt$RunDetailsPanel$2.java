package com.example.rungps.ui.main;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GearEntity;
import com.example.rungps.data.PointEntity;
import com.example.rungps.data.RunHrSampleEntity;
import com.example.rungps.data.RunSplitEntity;
import com.example.rungps.data.SpotifyTimelineEntity;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.gear.ActivityTitleGenerator;
import com.example.rungps.tracking.ActivityTypes;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: RunDetailsPanel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RunDetailsPanelKt$RunDetailsPanel$2 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $editDescription$delegate;
    final /* synthetic */ MutableState<String> $editPrivateNotes$delegate;
    final /* synthetic */ MutableState<String> $editTitle$delegate;
    final /* synthetic */ MutableState<Integer> $endIdx$delegate;
    final /* synthetic */ MutableState<String> $endOffsetText$delegate;
    final /* synthetic */ MutableState<List<GearEntity>> $gearOptions$delegate;
    final /* synthetic */ MutableState<String> $header$delegate;
    final /* synthetic */ MutableState<List<RunHrSampleEntity>> $hrSamples$delegate;
    final /* synthetic */ MutableState<Boolean> $isBike$delegate;
    final /* synthetic */ MutableState<Map<Long, Double>> $kmByGearId$delegate;
    final /* synthetic */ Function0<Unit> $onClose;
    final /* synthetic */ Function1<Long, Unit> $onExport;
    final /* synthetic */ Function0<Unit> $onShareOnPhoto;
    final /* synthetic */ MutableState<List<PointEntity>> $points$delegate;
    final /* synthetic */ Integer $profileAge;
    final /* synthetic */ long $runId;
    final /* synthetic */ MutableState<Boolean> $savingMeta$delegate;
    final /* synthetic */ ScrollState $scroll;
    final /* synthetic */ MutableState<Long> $selectedGearId$delegate;
    final /* synthetic */ MutableState<Boolean> $showTrim$delegate;
    final /* synthetic */ MutableState<List<RunSplitEntity>> $splits$delegate;
    final /* synthetic */ String $sportLabel;
    final /* synthetic */ MutableState<List<SpotifyTimelineEntity>> $spotify$delegate;
    final /* synthetic */ MutableState<Integer> $startIdx$delegate;
    final /* synthetic */ MutableState<String> $startOffsetText$delegate;
    final /* synthetic */ MutableState<Long> $startedAtMs$delegate;
    final /* synthetic */ MutableState<String> $sub$delegate;
    final /* synthetic */ MutableState<Double> $totalDistanceM$delegate;
    final /* synthetic */ MutableState<Long> $totalDurationMs$delegate;
    final /* synthetic */ RunsViewModel $vm;
    final /* synthetic */ MutableState<Long> $watchImportId$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    RunDetailsPanelKt$RunDetailsPanel$2(ScrollState scrollState, RunsViewModel runsViewModel, long j, Function0<Unit> function0, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<Long> mutableState4, MutableState<Boolean> mutableState5, MutableState<Long> mutableState6, MutableState<Boolean> mutableState7, MutableState<Double> mutableState8, MutableState<Long> mutableState9, Integer num, MutableState<Boolean> mutableState10, MutableState<Integer> mutableState11, MutableState<Integer> mutableState12, MutableState<String> mutableState13, MutableState<String> mutableState14, MutableState<Long> mutableState15, String str, MutableState<List<GearEntity>> mutableState16, MutableState<Map<Long, Double>> mutableState17, MutableState<List<RunSplitEntity>> mutableState18, MutableState<List<RunHrSampleEntity>> mutableState19, MutableState<List<SpotifyTimelineEntity>> mutableState20, MutableState<List<PointEntity>> mutableState21, MutableState<String> mutableState22, MutableState<String> mutableState23, Function0<Unit> function02, Function1<? super Long, Unit> function1) {
        this.$scroll = scrollState;
        this.$vm = runsViewModel;
        this.$runId = j;
        this.$onClose = function0;
        this.$editTitle$delegate = mutableState;
        this.$editDescription$delegate = mutableState2;
        this.$editPrivateNotes$delegate = mutableState3;
        this.$selectedGearId$delegate = mutableState4;
        this.$savingMeta$delegate = mutableState5;
        this.$startedAtMs$delegate = mutableState6;
        this.$isBike$delegate = mutableState7;
        this.$totalDistanceM$delegate = mutableState8;
        this.$totalDurationMs$delegate = mutableState9;
        this.$profileAge = num;
        this.$showTrim$delegate = mutableState10;
        this.$startIdx$delegate = mutableState11;
        this.$endIdx$delegate = mutableState12;
        this.$header$delegate = mutableState13;
        this.$sub$delegate = mutableState14;
        this.$watchImportId$delegate = mutableState15;
        this.$sportLabel = str;
        this.$gearOptions$delegate = mutableState16;
        this.$kmByGearId$delegate = mutableState17;
        this.$splits$delegate = mutableState18;
        this.$hrSamples$delegate = mutableState19;
        this.$spotify$delegate = mutableState20;
        this.$points$delegate = mutableState21;
        this.$startOffsetText$delegate = mutableState22;
        this.$endOffsetText$delegate = mutableState23;
        this.$onShareOnPhoto = function02;
        this.$onExport = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 ??, still in use, count: 1, list:
          (r2v10 ?? I:java.lang.Object) from 0x062b: INVOKE (r14v5 ?? I:androidx.compose.runtime.Composer), (r2v10 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:500)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v10 ??, still in use, count: 1, list:
          (r2v10 ?? I:java.lang.Object) from 0x062b: INVOKE (r14v5 ?? I:androidx.compose.runtime.Composer), (r2v10 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:500)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r90v0 ??
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
    public static final Unit invoke$lambda$40$lambda$39$lambda$2$lambda$1(RunsViewModel runsViewModel, long j, Function0 function0) {
        runsViewModel.reclassifyWatchRunToSoccer(j, function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$4$lambda$3(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$6$lambda$5(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$8$lambda$7(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$10$lambda$9(MutableState mutableState, Long l) {
        mutableState.setValue(l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$18$lambda$17(RunsViewModel runsViewModel, long j, final MutableState mutableState, final MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, final MutableState mutableState6, final MutableState mutableState7, final MutableState mutableState8, final MutableState mutableState9, final MutableState mutableState10) {
        String RunDetailsPanel$lambda$49;
        String RunDetailsPanel$lambda$52;
        String RunDetailsPanel$lambda$55;
        Long RunDetailsPanel$lambda$58;
        RunDetailsPanelKt.RunDetailsPanel$lambda$68(mutableState, true);
        RunDetailsPanel$lambda$49 = RunDetailsPanelKt.RunDetailsPanel$lambda$49(mutableState2);
        String obj = StringsKt.trim((CharSequence) RunDetailsPanel$lambda$49).toString();
        if (StringsKt.isBlank(obj)) {
            obj = null;
        }
        String str = obj;
        RunDetailsPanel$lambda$52 = RunDetailsPanelKt.RunDetailsPanel$lambda$52(mutableState3);
        String obj2 = StringsKt.trim((CharSequence) RunDetailsPanel$lambda$52).toString();
        if (StringsKt.isBlank(obj2)) {
            obj2 = null;
        }
        String str2 = obj2;
        RunDetailsPanel$lambda$55 = RunDetailsPanelKt.RunDetailsPanel$lambda$55(mutableState4);
        String obj3 = StringsKt.trim((CharSequence) RunDetailsPanel$lambda$55).toString();
        String str3 = StringsKt.isBlank(obj3) ? null : obj3;
        RunDetailsPanel$lambda$58 = RunDetailsPanelKt.RunDetailsPanel$lambda$58(mutableState5);
        runsViewModel.updateRunMetadata(j, str, str2, str3, RunDetailsPanel$lambda$58, new Function0() { // from class: com.example.rungps.ui.main.RunDetailsPanelKt$RunDetailsPanel$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$40$lambda$39$lambda$18$lambda$17$lambda$16;
                invoke$lambda$40$lambda$39$lambda$18$lambda$17$lambda$16 = RunDetailsPanelKt$RunDetailsPanel$2.invoke$lambda$40$lambda$39$lambda$18$lambda$17$lambda$16(MutableState.this, mutableState2, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10);
                return invoke$lambda$40$lambda$39$lambda$18$lambda$17$lambda$16;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$18$lambda$17$lambda$16(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        String RunDetailsPanel$lambda$49;
        double RunDetailsPanel$lambda$70;
        long RunDetailsPanel$lambda$73;
        Long RunDetailsPanel$lambda$17;
        boolean RunDetailsPanel$lambda$43;
        RunDetailsPanelKt.RunDetailsPanel$lambda$68(mutableState, false);
        StringBuilder sb = new StringBuilder();
        RunDetailsPanel$lambda$49 = RunDetailsPanelKt.RunDetailsPanel$lambda$49(mutableState2);
        String obj = StringsKt.trim((CharSequence) RunDetailsPanel$lambda$49).toString();
        if (StringsKt.isBlank(obj)) {
            ActivityTitleGenerator activityTitleGenerator = ActivityTitleGenerator.INSTANCE;
            RunDetailsPanel$lambda$17 = RunDetailsPanelKt.RunDetailsPanel$lambda$17(mutableState3);
            long longValue = RunDetailsPanel$lambda$17 != null ? RunDetailsPanel$lambda$17.longValue() : 0L;
            RunDetailsPanel$lambda$43 = RunDetailsPanelKt.RunDetailsPanel$lambda$43(mutableState4);
            obj = ActivityTitleGenerator.defaultTitle$default(activityTitleGenerator, longValue, RunDetailsPanel$lambda$43 ? ActivityTypes.BIKE : "RUN", null, 4, null);
        }
        sb.append(obj);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        RunDetailsPanel$lambda$70 = RunDetailsPanelKt.RunDetailsPanel$lambda$70(mutableState5);
        Double valueOf = Double.valueOf(RunDetailsPanel$lambda$70 / 1000.0d);
        RunDetailsPanel$lambda$73 = RunDetailsPanelKt.RunDetailsPanel$lambda$73(mutableState6);
        String format = String.format(locale, " · %.2f km · %s", Arrays.copyOf(new Object[]{valueOf, MainActivityFormattersKt.formatElapsed(RunDetailsPanel$lambda$73)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb.append(format);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState7.setValue(sb2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$20$lambda$19(MutableState mutableState) {
        boolean RunDetailsPanel$lambda$37;
        RunDetailsPanel$lambda$37 = RunDetailsPanelKt.RunDetailsPanel$lambda$37(mutableState);
        RunDetailsPanelKt.RunDetailsPanel$lambda$38(mutableState, !RunDetailsPanel$lambda$37);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$22$lambda$21(int i, MutableState mutableState, MutableState mutableState2, float f) {
        int RunDetailsPanel$lambda$25;
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt(f), 0, i);
        RunDetailsPanel$lambda$25 = RunDetailsPanelKt.RunDetailsPanel$lambda$25(mutableState);
        RunDetailsPanelKt.RunDetailsPanel$lambda$22(mutableState2, RangesKt.coerceAtMost(coerceIn, RunDetailsPanel$lambda$25));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$24$lambda$23(int i, MutableState mutableState, MutableState mutableState2, float f) {
        int RunDetailsPanel$lambda$21;
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt(f), 0, i);
        RunDetailsPanel$lambda$21 = RunDetailsPanelKt.RunDetailsPanel$lambda$21(mutableState);
        RunDetailsPanelKt.RunDetailsPanel$lambda$26(mutableState2, RangesKt.coerceAtLeast(coerceIn, RunDetailsPanel$lambda$21));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$33$lambda$32(RunsViewModel runsViewModel, long j, long j2, long j3, Function0 function0) {
        runsViewModel.trimRun(j, j2, j3);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$38$lambda$35$lambda$34(Function1 function1, long j) {
        function1.invoke(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36(RunsViewModel runsViewModel, long j, Function0 function0) {
        runsViewModel.deleteRun(j);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$31$lambda$27$lambda$26(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == ':') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(StringsKt.take(sb2, 8));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$40$lambda$39$lambda$31$lambda$30$lambda$29(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == ':') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(StringsKt.take(sb2, 8));
        return Unit.INSTANCE;
    }
}
