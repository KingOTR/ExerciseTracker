package com.example.rungps.ui.gear;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GearEntity;
import com.example.rungps.gear.GearTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GearManagementScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GearManagementScreenKt$GearEditorCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ List<GearEntity> $bikes;
    final /* synthetic */ MutableState<String> $brand$delegate;
    final /* synthetic */ GearEntity $existing;
    final /* synthetic */ MutableState<String> $gearType$delegate;
    final /* synthetic */ MutableState<String> $model$delegate;
    final /* synthetic */ MutableState<String> $name$delegate;
    final /* synthetic */ MutableState<String> $notes$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<GearEntity, Unit> $onSave;
    final /* synthetic */ MutableState<Long> $parentBikeId$delegate;
    final /* synthetic */ MutableState<String> $startingKm$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    GearManagementScreenKt$GearEditorCard$1(List<GearEntity> list, MutableState<Long> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, MutableState<String> mutableState7, Function1<? super GearEntity, Unit> function1, GearEntity gearEntity, Function0<Unit> function0) {
        this.$bikes = list;
        this.$parentBikeId$delegate = mutableState;
        this.$name$delegate = mutableState2;
        this.$brand$delegate = mutableState3;
        this.$model$delegate = mutableState4;
        this.$startingKm$delegate = mutableState5;
        this.$notes$delegate = mutableState6;
        this.$gearType$delegate = mutableState7;
        this.$onSave = function1;
        this.$existing = gearEntity;
        this.$onDismiss = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v76 ??, still in use, count: 1, list:
          (r1v76 ?? I:java.lang.Object) from 0x06df: INVOKE (r52v0 ?? I:androidx.compose.runtime.Composer), (r1v76 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:441)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v76 ??, still in use, count: 1, list:
          (r1v76 ?? I:java.lang.Object) from 0x06df: INVOKE (r52v0 ?? I:androidx.compose.runtime.Composer), (r1v76 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:441)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r51v0 ??
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
    public static final Unit invoke$lambda$24$lambda$3$lambda$2$lambda$1$lambda$0(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$5$lambda$4(MutableState mutableState, Long l) {
        mutableState.setValue(l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$7$lambda$6(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$9$lambda$8(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$11$lambda$10(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$16$lambda$15(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$23$lambda$22$lambda$21(Function1 function1, GearEntity gearEntity, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        String GearEditorCard$lambda$48;
        GearEntity gearEntity2;
        String GearEditorCard$lambda$35;
        String GearEditorCard$lambda$38;
        String GearEditorCard$lambda$41;
        String GearEditorCard$lambda$44;
        String GearEditorCard$lambda$51;
        String GearEditorCard$lambda$352;
        Long l;
        GearEntity copy;
        Long GearEditorCard$lambda$54;
        String GearEditorCard$lambda$353;
        String GearEditorCard$lambda$382;
        GearEditorCard$lambda$48 = GearManagementScreenKt.GearEditorCard$lambda$48(mutableState);
        Double doubleOrNull = StringsKt.toDoubleOrNull(GearEditorCard$lambda$48);
        double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        if (gearEntity == null) {
            GearEditorCard$lambda$353 = GearManagementScreenKt.GearEditorCard$lambda$35(mutableState2);
            GearEditorCard$lambda$382 = GearManagementScreenKt.GearEditorCard$lambda$38(mutableState3);
            gearEntity2 = new GearEntity(0L, GearEditorCard$lambda$353, StringsKt.trim((CharSequence) GearEditorCard$lambda$382).toString(), null, null, null, 0.0d, null, false, false, false, null, null, 0L, 16377, null);
        } else {
            gearEntity2 = gearEntity;
        }
        GearEditorCard$lambda$35 = GearManagementScreenKt.GearEditorCard$lambda$35(mutableState2);
        GearEditorCard$lambda$38 = GearManagementScreenKt.GearEditorCard$lambda$38(mutableState3);
        String obj = StringsKt.trim((CharSequence) GearEditorCard$lambda$38).toString();
        if (StringsKt.isBlank(obj)) {
            obj = "Gear";
        }
        String str = obj;
        GearEditorCard$lambda$41 = GearManagementScreenKt.GearEditorCard$lambda$41(mutableState4);
        String obj2 = StringsKt.trim((CharSequence) GearEditorCard$lambda$41).toString();
        if (StringsKt.isBlank(obj2)) {
            obj2 = null;
        }
        String str2 = obj2;
        GearEditorCard$lambda$44 = GearManagementScreenKt.GearEditorCard$lambda$44(mutableState5);
        String obj3 = StringsKt.trim((CharSequence) GearEditorCard$lambda$44).toString();
        if (StringsKt.isBlank(obj3)) {
            obj3 = null;
        }
        String str3 = obj3;
        GearEditorCard$lambda$51 = GearManagementScreenKt.GearEditorCard$lambda$51(mutableState6);
        String obj4 = StringsKt.trim((CharSequence) GearEditorCard$lambda$51).toString();
        if (StringsKt.isBlank(obj4)) {
            obj4 = null;
        }
        String str4 = obj4;
        GearTypes gearTypes = GearTypes.INSTANCE;
        GearEditorCard$lambda$352 = GearManagementScreenKt.GearEditorCard$lambda$35(mutableState2);
        if (gearTypes.isComponent(GearEditorCard$lambda$352)) {
            GearEditorCard$lambda$54 = GearManagementScreenKt.GearEditorCard$lambda$54(mutableState7);
            l = GearEditorCard$lambda$54;
        } else {
            l = null;
        }
        copy = gearEntity2.copy((r34 & 1) != 0 ? gearEntity2.id : 0L, (r34 & 2) != 0 ? gearEntity2.gearType : GearEditorCard$lambda$35, (r34 & 4) != 0 ? gearEntity2.name : str, (r34 & 8) != 0 ? gearEntity2.brand : str2, (r34 & 16) != 0 ? gearEntity2.model : str3, (r34 & 32) != 0 ? gearEntity2.purchaseDateMs : null, (r34 & 64) != 0 ? gearEntity2.startingOdometerKm : doubleValue, (r34 & 128) != 0 ? gearEntity2.notes : str4, (r34 & 256) != 0 ? gearEntity2.isRetired : false, (r34 & 512) != 0 ? gearEntity2.isDefaultForRun : false, (r34 & 1024) != 0 ? gearEntity2.isDefaultForRide : false, (r34 & 2048) != 0 ? gearEntity2.photoUri : null, (r34 & 4096) != 0 ? gearEntity2.parentGearId : l, (r34 & 8192) != 0 ? gearEntity2.createdAtMs : 0L);
        function1.invoke(copy);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$24$lambda$14$lambda$13(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == '.') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mutableState.setValue(StringsKt.take(sb2, 8));
        return Unit.INSTANCE;
    }
}
