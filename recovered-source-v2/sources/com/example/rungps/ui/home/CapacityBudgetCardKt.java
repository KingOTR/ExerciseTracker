package com.example.rungps.ui.home;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.example.rungps.analytics.CapacityBudget;
import com.example.rungps.core.domain.analytics.CombinedLoadSnapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: CapacityBudgetCard.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"CapacityBudgetCard", "", "load", "Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;", "sportLabel", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/rungps/core/domain/analytics/CombinedLoadSnapshot;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "budget", "Lcom/example/rungps/analytics/CapacityBudget$WeekBudget;", "editing", "", "runF", "", "gymF", "soccerF"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CapacityBudgetCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CapacityBudgetCard$lambda$30(CombinedLoadSnapshot combinedLoadSnapshot, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CapacityBudgetCard(combinedLoadSnapshot, str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v113 ??, still in use, count: 1, list:
          (r5v113 ?? I:java.lang.Object) from 0x073e: INVOKE (r3v1 ?? I:androidx.compose.runtime.Composer), (r5v113 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:231)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void CapacityBudgetCard(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v113 ??, still in use, count: 1, list:
          (r5v113 ?? I:java.lang.Object) from 0x073e: INVOKE (r3v1 ?? I:androidx.compose.runtime.Composer), (r5v113 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:231)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r43v0 ??
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

    private static final CapacityBudget.WeekBudget CapacityBudgetCard$lambda$1(MutableState<CapacityBudget.WeekBudget> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CapacityBudgetCard$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void CapacityBudgetCard$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CapacityBudgetCard$lambda$29$lambda$9$lambda$8$lambda$7(MutableState mutableState) {
        CapacityBudgetCard$lambda$5(mutableState, !CapacityBudgetCard$lambda$4(mutableState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CapacityBudgetCard$lambda$29$lambda$11$lambda$10(float f) {
        return RangesKt.coerceAtMost(f, 1.0f);
    }

    private static final float CapacityBudgetCard$lambda$29$lambda$13(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    private static final float CapacityBudgetCard$lambda$29$lambda$16(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    private static final float CapacityBudgetCard$lambda$29$lambda$19(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CapacityBudgetCard$lambda$29$lambda$22$lambda$21(MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CapacityBudgetCard$lambda$29$lambda$24$lambda$23(MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CapacityBudgetCard$lambda$29$lambda$26$lambda$25(MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CapacityBudgetCard$lambda$29$lambda$28$lambda$27(Context context, MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, MutableFloatState mutableFloatState3, MutableState mutableState, MutableState mutableState2) {
        CapacityBudget.INSTANCE.saveBudget(context, MathKt.roundToInt(CapacityBudgetCard$lambda$29$lambda$13(mutableFloatState)), MathKt.roundToInt(CapacityBudgetCard$lambda$29$lambda$16(mutableFloatState2)), MathKt.roundToInt(CapacityBudgetCard$lambda$29$lambda$19(mutableFloatState3)));
        mutableState.setValue(CapacityBudget.INSTANCE.loadBudget(context));
        CapacityBudgetCard$lambda$5(mutableState2, false);
        return Unit.INSTANCE;
    }
}
