package com.example.rungps.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.media.DeviceNowPlaying;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SpotifyMiniPlayerCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $artUrl$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ DeviceNowPlaying $device;
    final /* synthetic */ MutableState<DeviceNowPlaying> $deviceNowPlaying$delegate;
    final /* synthetic */ String $displayTitle;
    final /* synthetic */ MutableState<Boolean> $isPlaying$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ boolean $showSpotify;
    final /* synthetic */ MutableState<String> $subtitle$delegate;

    SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3(boolean z, DeviceNowPlaying deviceNowPlaying, MutableState<String> mutableState, String str, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, CoroutineScope coroutineScope, Repository repository, Context context, MutableState<DeviceNowPlaying> mutableState4) {
        this.$showSpotify = z;
        this.$device = deviceNowPlaying;
        this.$artUrl$delegate = mutableState;
        this.$displayTitle = str;
        this.$isPlaying$delegate = mutableState2;
        this.$subtitle$delegate = mutableState3;
        this.$scope = coroutineScope;
        this.$repo = repository;
        this.$ctx = context;
        this.$deviceNowPlaying$delegate = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v60 ??, still in use, count: 1, list:
          (r0v60 ?? I:java.lang.Object) from 0x06fb: INVOKE (r71v0 ?? I:androidx.compose.runtime.Composer), (r0v60 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:443)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v60 ??, still in use, count: 1, list:
          (r0v60 ?? I:java.lang.Object) from 0x06fb: INVOKE (r71v0 ?? I:androidx.compose.runtime.Composer), (r0v60 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:443)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r70v0 ??
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
    public static final Unit invoke$lambda$10$lambda$9$lambda$4$lambda$3(CoroutineScope coroutineScope, boolean z, Repository repository, MutableState mutableState, Context context) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$1$1$1(z, repository, mutableState, context, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$6$lambda$5(CoroutineScope coroutineScope, boolean z, MutableState mutableState, MutableState mutableState2, Repository repository, Context context) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$3$1$1(z, mutableState, mutableState2, repository, context, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9$lambda$8$lambda$7(CoroutineScope coroutineScope, boolean z, Repository repository, MutableState mutableState, Context context) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$3$1$2$5$1$1(z, repository, mutableState, context, null), 3, null);
        return Unit.INSTANCE;
    }
}
