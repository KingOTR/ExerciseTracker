package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepMlFeedbackApply;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$28 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<SleepMlFeedbackApply.Kind> $hypnoFeedback$delegate;
    final /* synthetic */ MutableState<SleepEntryEntity> $repairEntry$delegate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $showRepairPrompt$delegate;
    final /* synthetic */ MutableState<Boolean> $showWakeMood$delegate;
    final /* synthetic */ MutableState<Boolean> $smartAlarm$delegate;
    final /* synthetic */ long $started;
    final /* synthetic */ MutableState<Boolean> $trackingActive$delegate;
    final /* synthetic */ MutableState<String> $wakeError$delegate;
    final /* synthetic */ MutableIntState $wakeMood$delegate;
    final /* synthetic */ MutableState<String> $wakeText$delegate;

    SleepTabScreenBodyKt$SleepTabScreenBody$28(CoroutineScope coroutineScope, MutableState<String> mutableState, Context context, MutableState<Boolean> mutableState2, long j, MutableState<String> mutableState3, MutableState<SleepMlFeedbackApply.Kind> mutableState4, MutableIntState mutableIntState, MutableState<Boolean> mutableState5, MutableState<SleepEntryEntity> mutableState6, MutableState<Boolean> mutableState7, MutableState<Boolean> mutableState8) {
        this.$scope = coroutineScope;
        this.$wakeText$delegate = mutableState;
        this.$ctx = context;
        this.$showWakeMood$delegate = mutableState2;
        this.$started = j;
        this.$wakeError$delegate = mutableState3;
        this.$hypnoFeedback$delegate = mutableState4;
        this.$wakeMood$delegate = mutableIntState;
        this.$smartAlarm$delegate = mutableState5;
        this.$repairEntry$delegate = mutableState6;
        this.$showRepairPrompt$delegate = mutableState7;
        this.$trackingActive$delegate = mutableState8;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 ??, still in use, count: 1, list:
          (r1v6 ?? I:java.lang.Object) from 0x007d: INVOKE (r26v0 ?? I:androidx.compose.runtime.Composer), (r1v6 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1791)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 ??, still in use, count: 1, list:
          (r1v6 ?? I:java.lang.Object) from 0x007d: INVOKE (r26v0 ?? I:androidx.compose.runtime.Composer), (r1v6 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1791)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
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
    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, long j, MutableState mutableState3, Context context, MutableState mutableState4, MutableIntState mutableIntState, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$127(mutableState, false);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SleepTabScreenBodyKt$SleepTabScreenBody$28$1$1$1(mutableState2, j, mutableState3, mutableState, context, mutableState4, mutableIntState, mutableState5, mutableState6, mutableState7, mutableState8, null), 3, null);
        return Unit.INSTANCE;
    }
}
