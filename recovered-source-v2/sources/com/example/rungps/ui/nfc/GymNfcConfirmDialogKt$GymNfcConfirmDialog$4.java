package com.example.rungps.ui.nfc;

import android.content.Context;
import androidx.compose.runtime.Composer;
import com.example.rungps.nfc.GymNfcHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: GymNfcConfirmDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymNfcConfirmDialogKt$GymNfcConfirmDialog$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $confirmSeq;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ boolean $isFinish;
    final /* synthetic */ Function0<Unit> $onClearPrompt;
    final /* synthetic */ Function0<Unit> $onConfirm;
    final /* synthetic */ Function1<Integer, Unit> $onHandledSeq;

    /* JADX WARN: Multi-variable type inference failed */
    GymNfcConfirmDialogKt$GymNfcConfirmDialog$4(Function1<? super Integer, Unit> function1, int i, Function0<Unit> function0, Context context, boolean z, Function0<Unit> function02) {
        this.$onHandledSeq = function1;
        this.$confirmSeq = i;
        this.$onClearPrompt = function0;
        this.$ctx = context;
        this.$isFinish = z;
        this.$onConfirm = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v9 ??, still in use, count: 1, list:
          (r1v9 ?? I:java.lang.Object) from 0x0073: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer), (r1v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:92)
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
          (r1v9 ?? I:java.lang.Object) from 0x0073: INVOKE (r15v0 ?? I:androidx.compose.runtime.Composer), (r1v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:92)
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, int i, Function0 function0, Context context, boolean z, Function0 function02) {
        function1.invoke(Integer.valueOf(i));
        function0.invoke();
        GymNfcHandler.INSTANCE.setPending(context, z ? "finish" : "start_next");
        function02.invoke();
        return Unit.INSTANCE;
    }
}
