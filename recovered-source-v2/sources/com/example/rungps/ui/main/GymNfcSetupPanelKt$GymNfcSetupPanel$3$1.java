package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.nfc.GymCheckIn;
import com.example.rungps.nfc.GymLocation;
import com.example.rungps.nfc.GymNfcConfig;
import com.example.rungps.nfc.RegisteredGymCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymNfcSetupPanel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymNfcSetupPanelKt$GymNfcSetupPanel$3$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ boolean $atGym;
    final /* synthetic */ MutableState<Boolean> $atGymState$delegate;
    final /* synthetic */ MutableState<Boolean> $autoStartAtGym$delegate;
    final /* synthetic */ boolean $batterySaver;
    final /* synthetic */ MutableState<List<RegisteredGymCard>> $cards$delegate;
    final /* synthetic */ boolean $checkInReady;
    final /* synthetic */ MutableState<List<GymCheckIn>> $checkIns$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableFloatState $defaultRadiusM$delegate;
    final /* synthetic */ MutableState<List<GymLocation>> $locations$delegate;
    final /* synthetic */ String $nearest;
    final /* synthetic */ boolean $nfcAvailable;
    final /* synthetic */ boolean $registering;
    final /* synthetic */ String $registeringName;
    final /* synthetic */ CoroutineScope $scope;

    GymNfcSetupPanelKt$GymNfcSetupPanel$3$1(boolean z, boolean z2, boolean z3, String str, boolean z4, String str2, Context context, boolean z5, CoroutineScope coroutineScope, MutableState<List<RegisteredGymCard>> mutableState, MutableState<List<GymLocation>> mutableState2, MutableState<List<GymCheckIn>> mutableState3, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5) {
        this.$nfcAvailable = z;
        this.$checkInReady = z2;
        this.$atGym = z3;
        this.$nearest = str;
        this.$registering = z4;
        this.$registeringName = str2;
        this.$ctx = context;
        this.$batterySaver = z5;
        this.$scope = coroutineScope;
        this.$cards$delegate = mutableState;
        this.$locations$delegate = mutableState2;
        this.$checkIns$delegate = mutableState3;
        this.$defaultRadiusM$delegate = mutableFloatState;
        this.$autoStartAtGym$delegate = mutableState4;
        this.$atGymState$delegate = mutableState5;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v68 ??, still in use, count: 1, list:
          (r1v68 ?? I:java.lang.Object) from 0x01c2: INVOKE (r14v9 ?? I:androidx.compose.runtime.Composer), (r1v68 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:407)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v68 ??, still in use, count: 1, list:
          (r1v68 ?? I:java.lang.Object) from 0x01c2: INVOKE (r14v9 ?? I:androidx.compose.runtime.Composer), (r1v68 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:407)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v0 ??
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
    public static final Unit invoke$lambda$2$lambda$1(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableFloatState mutableFloatState) {
        GymNfcConfig.setRegistering$default(GymNfcConfig.INSTANCE, context, false, null, 4, null);
        GymNfcSetupPanelKt.GymNfcSetupPanel$refresh(context, mutableState, mutableState2, mutableState3, mutableFloatState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3(Context context, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, boolean z) {
        List GymNfcSetupPanel$lambda$1;
        GymNfcSetupPanelKt.GymNfcSetupPanel$lambda$31(mutableState, z);
        GymNfcConfig.INSTANCE.setAutoStartAtGymOnly(context, z);
        if (z) {
            GymNfcSetupPanel$lambda$1 = GymNfcSetupPanelKt.GymNfcSetupPanel$lambda$1(mutableState2);
            if (GymNfcSetupPanel$lambda$1.isEmpty()) {
                Toast.makeText(context, "Save a gym location first — auto-start needs GPS at the gym", 1).show();
                return Unit.INSTANCE;
            }
        }
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GymNfcSetupPanelKt$GymNfcSetupPanel$3$1$3$1$1$1(context, mutableState3, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(CoroutineScope coroutineScope, Context context, String str, MutableState mutableState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GymNfcSetupPanelKt$GymNfcSetupPanel$3$1$4$1$1(context, str, mutableState, null), 3, null);
        return Unit.INSTANCE;
    }
}
