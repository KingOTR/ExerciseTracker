package com.example.rungps.ui.profile;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.UserProfile;
import com.example.rungps.data.UserProfileStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: UserProfileScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class UserProfileScreenKt$UserProfileScreen$1$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $ageText$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $displayName$delegate;
    final /* synthetic */ MutableState<String> $dobText$delegate;
    final /* synthetic */ MutableState<String> $heightText$delegate;
    final /* synthetic */ MutableState<UserProfile> $savedProfile$delegate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<String> $sex$delegate;
    final /* synthetic */ MutableState<String> $weightText$delegate;

    UserProfileScreenKt$UserProfileScreen$1$1(Context context, CoroutineScope coroutineScope, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, MutableState<UserProfile> mutableState7) {
        this.$ctx = context;
        this.$scope = coroutineScope;
        this.$displayName$delegate = mutableState;
        this.$ageText$delegate = mutableState2;
        this.$dobText$delegate = mutableState3;
        this.$heightText$delegate = mutableState4;
        this.$weightText$delegate = mutableState5;
        this.$sex$delegate = mutableState6;
        this.$savedProfile$delegate = mutableState7;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 ??, still in use, count: 1, list:
          (r1v10 ?? I:java.lang.Object) from 0x01cb: INVOKE (r28v0 ?? I:androidx.compose.runtime.Composer), (r1v10 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:152)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v10 ??, still in use, count: 1, list:
          (r1v10 ?? I:java.lang.Object) from 0x01cb: INVOKE (r28v0 ?? I:androidx.compose.runtime.Composer), (r1v10 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:152)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
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
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(Context context, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        String UserProfileScreen$lambda$3;
        String UserProfileScreen$lambda$6;
        String UserProfileScreen$lambda$9;
        String UserProfileScreen$lambda$12;
        String UserProfileScreen$lambda$15;
        String UserProfileScreen$lambda$18;
        UserProfileScreen$lambda$3 = UserProfileScreenKt.UserProfileScreen$lambda$3(mutableState);
        UserProfileScreen$lambda$6 = UserProfileScreenKt.UserProfileScreen$lambda$6(mutableState2);
        UserProfileScreen$lambda$9 = UserProfileScreenKt.UserProfileScreen$lambda$9(mutableState3);
        UserProfileScreen$lambda$12 = UserProfileScreenKt.UserProfileScreen$lambda$12(mutableState4);
        UserProfileScreen$lambda$15 = UserProfileScreenKt.UserProfileScreen$lambda$15(mutableState5);
        UserProfileScreen$lambda$18 = UserProfileScreenKt.UserProfileScreen$lambda$18(mutableState6);
        UserProfile parseProfileForm = UserProfileFormKt.parseProfileForm(UserProfileScreen$lambda$3, UserProfileScreen$lambda$6, UserProfileScreen$lambda$9, UserProfileScreen$lambda$12, UserProfileScreen$lambda$15, UserProfileScreen$lambda$18);
        if (parseProfileForm == null) {
            Toast.makeText(context, "Enter age (10–120), height (100–250 cm), and weight (20–400 kg)", 1).show();
            return Unit.INSTANCE;
        }
        UserProfileStore.INSTANCE.save(context, parseProfileForm);
        mutableState7.setValue(parseProfileForm);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new UserProfileScreenKt$UserProfileScreen$1$1$8$1$1(context, null), 2, null);
        Toast.makeText(context, "Profile saved", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15(Context context) {
        UserProfileStore.INSTANCE.markSkipped(context);
        Toast.makeText(context, "You can fill this in anytime", 0).show();
        return Unit.INSTANCE;
    }
}
