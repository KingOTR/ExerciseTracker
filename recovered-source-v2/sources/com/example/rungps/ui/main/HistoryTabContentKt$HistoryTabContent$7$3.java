package com.example.rungps.ui.main;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.util.SecureSettingsStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HistoryTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$7$3 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<Boolean> $showSpotifySetup$delegate;
    final /* synthetic */ MutableState<String> $spotifyClientId$delegate;
    final /* synthetic */ MutableState<Boolean> $spotifyConnected$delegate;
    final /* synthetic */ CoroutineScope $stravaScope;

    HistoryTabContentKt$HistoryTabContent$7$3(MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, CoroutineScope coroutineScope, Repository repository, Context context) {
        this.$spotifyClientId$delegate = mutableState;
        this.$spotifyConnected$delegate = mutableState2;
        this.$showSpotifySetup$delegate = mutableState3;
        this.$stravaScope = coroutineScope;
        this.$repo = repository;
        this.$ctx = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v42 ??, still in use, count: 1, list:
          (r1v42 ?? I:java.lang.Object) from 0x0568: INVOKE (r40v0 ?? I:androidx.compose.runtime.Composer), (r1v42 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:722)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v42 ??, still in use, count: 1, list:
          (r1v42 ?? I:java.lang.Object) from 0x0568: INVOKE (r40v0 ?? I:androidx.compose.runtime.Composer), (r1v42 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:722)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r39v0 ??
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
    public static final Unit invoke$lambda$12$lambda$1$lambda$0(MutableState mutableState) {
        boolean HistoryTabContent$lambda$52;
        HistoryTabContent$lambda$52 = HistoryTabContentKt.HistoryTabContent$lambda$52(mutableState);
        HistoryTabContentKt.HistoryTabContent$lambda$53(mutableState, !HistoryTabContent$lambda$52);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$3$lambda$2(CoroutineScope coroutineScope, Repository repository, Context context) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new HistoryTabContentKt$HistoryTabContent$7$3$1$3$1$1(repository, context, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$5$lambda$4(CoroutineScope coroutineScope, Repository repository) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new HistoryTabContentKt$HistoryTabContent$7$3$1$4$1$1(repository, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$7$lambda$6(CoroutineScope coroutineScope, Repository repository) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new HistoryTabContentKt$HistoryTabContent$7$3$1$5$1$1(repository, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$9$lambda$8(CoroutineScope coroutineScope, Repository repository) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new HistoryTabContentKt$HistoryTabContent$7$3$1$6$1$1(repository, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10(CoroutineScope coroutineScope, Repository repository) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new HistoryTabContentKt$HistoryTabContent$7$3$1$7$1$1(repository, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(StringsKt.take(it, 64));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$16$lambda$15(Context context, MutableState mutableState) {
        String HistoryTabContent$lambda$45;
        SharedPreferences.Editor edit = context.getSharedPreferences("settings", 0).edit();
        HistoryTabContent$lambda$45 = HistoryTabContentKt.HistoryTabContent$lambda$45(mutableState);
        edit.putString("spotifyClientId", StringsKt.trim((CharSequence) HistoryTabContent$lambda$45).toString()).apply();
        Toast.makeText(context, "Spotify Client ID saved", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$18$lambda$17(CoroutineScope coroutineScope, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1(context, mutableState, mutableState2, mutableState3, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$21$lambda$20$lambda$19(Context context, MutableState mutableState, MutableState mutableState2) {
        SecureSettingsStore.INSTANCE.putString(context, "spotifyAccessToken", null);
        SecureSettingsStore.INSTANCE.putString(context, "spotifyRefreshToken", null);
        SecureSettingsStore.INSTANCE.putLong(context, "spotifyExpiresAtSec", 0L);
        HistoryTabContentKt.HistoryTabContent$lambda$49(mutableState, false);
        HistoryTabContentKt.HistoryTabContent$lambda$53(mutableState2, false);
        Toast.makeText(context, "Spotify disconnected", 0).show();
        return Unit.INSTANCE;
    }
}
