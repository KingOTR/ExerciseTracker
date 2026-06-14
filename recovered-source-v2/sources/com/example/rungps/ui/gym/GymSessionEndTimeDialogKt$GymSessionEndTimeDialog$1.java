package com.example.rungps.ui.gym;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import java.time.LocalDate;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: GymSessionEndTimeDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $confirmLabel;
    final /* synthetic */ MutableState<LocalDate> $endDate$delegate;
    final /* synthetic */ MutableIntState $hour$delegate;
    final /* synthetic */ MutableIntState $minute$delegate;
    final /* synthetic */ Function1<Long, Unit> $onConfirm;
    final /* synthetic */ long $startedAtMs;
    final /* synthetic */ ZoneId $zone;

    /* JADX WARN: Multi-variable type inference failed */
    GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$1(Function1<? super Long, Unit> function1, long j, ZoneId zoneId, MutableState<LocalDate> mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, String str) {
        this.$onConfirm = function1;
        this.$startedAtMs = j;
        this.$zone = zoneId;
        this.$endDate$delegate = mutableState;
        this.$hour$delegate = mutableIntState;
        this.$minute$delegate = mutableIntState2;
        this.$confirmLabel = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, long j, ZoneId zoneId, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        long GymSessionEndTimeDialog$buildEndMs;
        GymSessionEndTimeDialog$buildEndMs = GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$buildEndMs(j, zoneId, mutableState, mutableIntState, mutableIntState2);
        function1.invoke(Long.valueOf(GymSessionEndTimeDialog$buildEndMs));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v9 ??, still in use, count: 1, list:
          (r1v9 ?? I:java.lang.Object) from 0x0073: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer), (r1v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:136)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v9 ??, still in use, count: 1, list:
          (r1v9 ?? I:java.lang.Object) from 0x0073: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer), (r1v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:136)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
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
}
