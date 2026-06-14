package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.material3.ColorScheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.example.rungps.sleep.SleepAlarmPreferences;
import com.example.rungps.sleep.SleepWakePlanner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$23$3$1$17$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Integer> $alarmHour$delegate;
    final /* synthetic */ MutableState<Integer> $alarmMinute$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ SleepWakePlanner.Suggestion $s;
    final /* synthetic */ ColorScheme $scheme;
    final /* synthetic */ MutableState<Float> $windowMin$delegate;

    SleepTabScreenBodyKt$SleepTabScreenBody$23$3$1$17$1(SleepWakePlanner.Suggestion suggestion, ColorScheme colorScheme, MutableState<Integer> mutableState, MutableState<Integer> mutableState2, Context context, MutableState<Float> mutableState3) {
        this.$s = suggestion;
        this.$scheme = colorScheme;
        this.$alarmHour$delegate = mutableState;
        this.$alarmMinute$delegate = mutableState2;
        this.$ctx = context;
        this.$windowMin$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v23 ??, still in use, count: 1, list:
          (r1v23 ?? I:java.lang.Object) from 0x0281: INVOKE (r33v0 ?? I:androidx.compose.runtime.Composer), (r1v23 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1866)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v23 ??, still in use, count: 1, list:
          (r1v23 ?? I:java.lang.Object) from 0x0281: INVOKE (r33v0 ?? I:androidx.compose.runtime.Composer), (r1v23 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:1866)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 ??
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
    public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(SleepWakePlanner.Suggestion suggestion, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$57(mutableState, suggestion.getAlarmHour());
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$61(mutableState2, suggestion.getAlarmMinute());
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$65(mutableState3, suggestion.getWindowMin());
        SleepAlarmPreferences.INSTANCE.setWindowMin(context, suggestion.getWindowMin());
        return Unit.INSTANCE;
    }
}
