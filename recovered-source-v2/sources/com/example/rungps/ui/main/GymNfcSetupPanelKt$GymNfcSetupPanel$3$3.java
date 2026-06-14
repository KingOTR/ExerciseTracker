package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.nfc.GymCardStore;
import com.example.rungps.nfc.GymCheckIn;
import com.example.rungps.nfc.GymLocation;
import com.example.rungps.nfc.GymNfcConfig;
import com.example.rungps.nfc.RegisteredGymCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GymNfcSetupPanel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymNfcSetupPanelKt$GymNfcSetupPanel$3$3 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<List<RegisteredGymCard>> $cards$delegate;
    final /* synthetic */ MutableState<List<GymCheckIn>> $checkIns$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableFloatState $defaultRadiusM$delegate;
    final /* synthetic */ MutableState<String> $editingCardId$delegate;
    final /* synthetic */ MutableState<String> $editingCardName$delegate;
    final /* synthetic */ MutableState<List<GymLocation>> $locations$delegate;
    final /* synthetic */ MutableState<String> $newCardName$delegate;
    final /* synthetic */ boolean $nfcAvailable;
    final /* synthetic */ boolean $registering;

    GymNfcSetupPanelKt$GymNfcSetupPanel$3$3(MutableState<String> mutableState, boolean z, boolean z2, Context context, MutableState<List<GymLocation>> mutableState2, MutableState<List<RegisteredGymCard>> mutableState3, MutableState<List<GymCheckIn>> mutableState4, MutableFloatState mutableFloatState, MutableState<String> mutableState5, MutableState<String> mutableState6) {
        this.$newCardName$delegate = mutableState;
        this.$nfcAvailable = z;
        this.$registering = z2;
        this.$ctx = context;
        this.$locations$delegate = mutableState2;
        this.$cards$delegate = mutableState3;
        this.$checkIns$delegate = mutableState4;
        this.$defaultRadiusM$delegate = mutableFloatState;
        this.$editingCardId$delegate = mutableState5;
        this.$editingCardName$delegate = mutableState6;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v11 ??, still in use, count: 1, list:
          (r1v11 ?? I:java.lang.Object) from 0x00ee: INVOKE (r31v0 ?? I:androidx.compose.runtime.Composer), (r1v11 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:412)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v11 ??, still in use, count: 1, list:
          (r1v11 ?? I:java.lang.Object) from 0x00ee: INVOKE (r31v0 ?? I:androidx.compose.runtime.Composer), (r1v11 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:412)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
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
        mutableState.setValue(StringsKt.take(it, 40));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableFloatState mutableFloatState) {
        String GymNfcSetupPanel$lambda$18;
        GymNfcSetupPanel$lambda$18 = GymNfcSetupPanelKt.GymNfcSetupPanel$lambda$18(mutableState);
        String obj = StringsKt.trim((CharSequence) GymNfcSetupPanel$lambda$18).toString();
        if (obj.length() == 0) {
            obj = "Gym card";
        }
        GymNfcConfig.INSTANCE.setRegistering(context, true, obj);
        GymNfcSetupPanelKt.GymNfcSetupPanel$refresh(context, mutableState2, mutableState3, mutableState4, mutableFloatState);
        Toast.makeText(context, "Hold phone to your gym card…", 1).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$6$lambda$5(RegisteredGymCard registeredGymCard, MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(registeredGymCard.getId());
        mutableState2.setValue(registeredGymCard.getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$8$lambda$7(Context context, RegisteredGymCard registeredGymCard, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableFloatState mutableFloatState) {
        String GymNfcSetupPanel$lambda$26;
        GymCardStore gymCardStore = GymCardStore.INSTANCE;
        String id = registeredGymCard.getId();
        GymNfcSetupPanel$lambda$26 = GymNfcSetupPanelKt.GymNfcSetupPanel$lambda$26(mutableState);
        gymCardStore.updateName(context, id, GymNfcSetupPanel$lambda$26);
        mutableState2.setValue(null);
        GymNfcSetupPanelKt.GymNfcSetupPanel$refresh(context, mutableState3, mutableState4, mutableState5, mutableFloatState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$10$lambda$9(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$12$lambda$11(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14$lambda$13(Context context, RegisteredGymCard registeredGymCard, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableFloatState mutableFloatState) {
        GymCardStore.INSTANCE.remove(context, registeredGymCard.getId());
        GymNfcSetupPanelKt.GymNfcSetupPanel$refresh(context, mutableState, mutableState2, mutableState3, mutableFloatState);
        return Unit.INSTANCE;
    }
}
