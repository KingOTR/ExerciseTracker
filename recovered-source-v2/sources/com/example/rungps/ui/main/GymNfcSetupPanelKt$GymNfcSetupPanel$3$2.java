package com.example.rungps.ui.main;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.nfc.GymCheckIn;
import com.example.rungps.nfc.GymLocation;
import com.example.rungps.nfc.GymLocationStore;
import com.example.rungps.nfc.RegisteredGymCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymNfcSetupPanel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymNfcSetupPanelKt$GymNfcSetupPanel$3$2 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<List<RegisteredGymCard>> $cards$delegate;
    final /* synthetic */ MutableState<List<GymCheckIn>> $checkIns$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableFloatState $defaultRadiusM$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $locationPermLauncher;
    final /* synthetic */ MutableState<List<GymLocation>> $locations$delegate;
    final /* synthetic */ MutableState<String> $newLocationName$delegate;
    final /* synthetic */ CoroutineScope $scope;

    GymNfcSetupPanelKt$GymNfcSetupPanel$3$2(MutableState<String> mutableState, Context context, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, CoroutineScope coroutineScope, MutableFloatState mutableFloatState, MutableState<List<GymLocation>> mutableState2, MutableState<List<RegisteredGymCard>> mutableState3, MutableState<List<GymCheckIn>> mutableState4) {
        this.$newLocationName$delegate = mutableState;
        this.$ctx = context;
        this.$locationPermLauncher = managedActivityResultLauncher;
        this.$scope = coroutineScope;
        this.$defaultRadiusM$delegate = mutableFloatState;
        this.$locations$delegate = mutableState2;
        this.$cards$delegate = mutableState3;
        this.$checkIns$delegate = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v22 ??, still in use, count: 1, list:
          (r0v22 ?? I:java.lang.Object) from 0x04a0: INVOKE (r36v0 ?? I:androidx.compose.runtime.Composer), (r0v22 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:503)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v22 ??, still in use, count: 1, list:
          (r0v22 ?? I:java.lang.Object) from 0x04a0: INVOKE (r36v0 ?? I:androidx.compose.runtime.Composer), (r0v22 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:503)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
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
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(StringsKt.take(it, 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(MutableFloatState mutableFloatState, float f) {
        mutableFloatState.setFloatValue(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(Context context, MutableFloatState mutableFloatState) {
        float GymNfcSetupPanel$lambda$10;
        GymLocationStore gymLocationStore = GymLocationStore.INSTANCE;
        GymNfcSetupPanel$lambda$10 = GymNfcSetupPanelKt.GymNfcSetupPanel$lambda$10(mutableFloatState);
        gymLocationStore.setDefaultRadiusM(context, GymNfcSetupPanel$lambda$10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(Context context, ManagedActivityResultLauncher managedActivityResultLauncher, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableFloatState mutableFloatState) {
        GymNfcSetupPanelKt.GymNfcSetupPanel$requestLocationAndSave(context, managedActivityResultLauncher, coroutineScope, mutableState, mutableState2, mutableState3, mutableState4, mutableFloatState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10$lambda$9(Context context, GymLocation gymLocation, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableFloatState mutableFloatState) {
        GymLocationStore.INSTANCE.remove(context, gymLocation.getId());
        GymNfcSetupPanelKt.GymNfcSetupPanel$refresh(context, mutableState, mutableState2, mutableState3, mutableFloatState);
        return Unit.INSTANCE;
    }
}
