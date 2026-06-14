package com.example.rungps.ui.main;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.example.rungps.analytics.LocalPbWithRun;
import com.example.rungps.data.AppPreferences;
import com.example.rungps.data.Repository;
import com.example.rungps.strava.StravaOAuth;
import com.example.rungps.ui.components.AppSnackbarMessages;
import com.example.rungps.util.SecureSettingsStore;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HistoryTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$7$2 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Map<String, LocalPbWithRun>> $localPbRuns$delegate;
    final /* synthetic */ MutableState<Map<String, Long>> $localPbs$delegate;
    final /* synthetic */ MutableState<Map<String, LocalPbWithRun>> $localRidePbs$delegate;
    final /* synthetic */ List<HistoryMergedPb> $mergedRidePbs;
    final /* synthetic */ List<HistoryMergedPb> $mergedRunPbs;
    final /* synthetic */ Function1<Long, Unit> $onSelectRun;
    final /* synthetic */ MutableState<Boolean> $refreshingPbs$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<Boolean> $showStravaSetup$delegate;
    final /* synthetic */ SnackbarHostState $snackbar;
    final /* synthetic */ MutableState<String> $stravaClientId$delegate;
    final /* synthetic */ MutableState<String> $stravaClientSecret$delegate;
    final /* synthetic */ MutableState<Boolean> $stravaConnected$delegate;
    final /* synthetic */ CoroutineScope $stravaScope;
    final /* synthetic */ MutableState<Boolean> $stravaSecretSaved$delegate;
    final /* synthetic */ MutableState<String> $stravaUploadStatus$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    HistoryTabContentKt$HistoryTabContent$7$2(MutableState<String> mutableState, List<HistoryMergedPb> list, List<HistoryMergedPb> list2, Function1<? super Long, Unit> function1, MutableState<Boolean> mutableState2, CoroutineScope coroutineScope, Repository repository, Context context, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, MutableState<Map<String, LocalPbWithRun>> mutableState5, MutableState<Map<String, LocalPbWithRun>> mutableState6, MutableState<Map<String, Long>> mutableState7, MutableState<String> mutableState8, MutableState<String> mutableState9, MutableState<Boolean> mutableState10, SnackbarHostState snackbarHostState) {
        this.$stravaClientId$delegate = mutableState;
        this.$mergedRunPbs = list;
        this.$mergedRidePbs = list2;
        this.$onSelectRun = function1;
        this.$stravaConnected$delegate = mutableState2;
        this.$stravaScope = coroutineScope;
        this.$repo = repository;
        this.$ctx = context;
        this.$showStravaSetup$delegate = mutableState3;
        this.$refreshingPbs$delegate = mutableState4;
        this.$localPbRuns$delegate = mutableState5;
        this.$localRidePbs$delegate = mutableState6;
        this.$localPbs$delegate = mutableState7;
        this.$stravaUploadStatus$delegate = mutableState8;
        this.$stravaClientSecret$delegate = mutableState9;
        this.$stravaSecretSaved$delegate = mutableState10;
        this.$snackbar = snackbarHostState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v56 ??, still in use, count: 1, list:
          (r1v56 ?? I:java.lang.Object) from 0x07bd: INVOKE (r14v9 ?? I:androidx.compose.runtime.Composer), (r1v56 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:753)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v56 ??, still in use, count: 1, list:
          (r1v56 ?? I:java.lang.Object) from 0x07bd: INVOKE (r14v9 ?? I:androidx.compose.runtime.Composer), (r1v56 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:753)
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
    public static final Unit invoke$lambda$5$lambda$4$lambda$1$lambda$0(CoroutineScope coroutineScope, MutableState mutableState, Repository repository, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Context context) {
        HistoryTabContentKt.HistoryTabContent$lambda$56(mutableState, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new HistoryTabContentKt$HistoryTabContent$7$2$1$1$1$1$1(repository, mutableState2, mutableState3, mutableState4, mutableState, mutableState5, mutableState6, context, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(MutableState mutableState) {
        boolean HistoryTabContent$lambda$41;
        HistoryTabContent$lambda$41 = HistoryTabContentKt.HistoryTabContent$lambda$41(mutableState);
        HistoryTabContentKt.HistoryTabContent$lambda$42(mutableState, !HistoryTabContent$lambda$41);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(StringsKt.take(it, 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(StringsKt.take(it, 64));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$11$lambda$10(Context context, CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        String HistoryTabContent$lambda$28;
        String HistoryTabContent$lambda$31;
        String HistoryTabContent$lambda$312;
        AppPreferences appPreferences = AppPreferences.INSTANCE;
        HistoryTabContent$lambda$28 = HistoryTabContentKt.HistoryTabContent$lambda$28(mutableState);
        appPreferences.setStravaClientIdBlocking(context, HistoryTabContent$lambda$28);
        HistoryTabContent$lambda$31 = HistoryTabContentKt.HistoryTabContent$lambda$31(mutableState2);
        if (!StringsKt.isBlank(HistoryTabContent$lambda$31)) {
            SecureSettingsStore secureSettingsStore = SecureSettingsStore.INSTANCE;
            HistoryTabContent$lambda$312 = HistoryTabContentKt.HistoryTabContent$lambda$31(mutableState2);
            secureSettingsStore.setStravaClientSecret(context, HistoryTabContent$lambda$312);
            HistoryTabContentKt.HistoryTabContent$lambda$35(mutableState3, true);
            mutableState2.setValue("");
        }
        AppSnackbarMessages.INSTANCE.showSuccess(coroutineScope, snackbarHostState, "Strava credentials saved");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$15$lambda$14(Context context, RowScope rowScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        String HistoryTabContent$lambda$31;
        String HistoryTabContent$lambda$28;
        String HistoryTabContent$lambda$282;
        Object m7905constructorimpl;
        String HistoryTabContent$lambda$312;
        HistoryTabContent$lambda$31 = HistoryTabContentKt.HistoryTabContent$lambda$31(mutableState);
        if (!StringsKt.isBlank(HistoryTabContent$lambda$31)) {
            SecureSettingsStore secureSettingsStore = SecureSettingsStore.INSTANCE;
            HistoryTabContent$lambda$312 = HistoryTabContentKt.HistoryTabContent$lambda$31(mutableState);
            secureSettingsStore.setStravaClientSecret(context, HistoryTabContent$lambda$312);
            HistoryTabContentKt.HistoryTabContent$lambda$35(mutableState2, true);
            mutableState.setValue("");
        }
        AppPreferences appPreferences = AppPreferences.INSTANCE;
        HistoryTabContent$lambda$28 = HistoryTabContentKt.HistoryTabContent$lambda$28(mutableState3);
        appPreferences.setStravaClientIdBlocking(context, HistoryTabContent$lambda$28);
        StravaOAuth stravaOAuth = StravaOAuth.INSTANCE;
        HistoryTabContent$lambda$282 = HistoryTabContentKt.HistoryTabContent$lambda$28(mutableState3);
        String buildAuthorizeUrl = stravaOAuth.buildAuthorizeUrl(StringsKt.trim((CharSequence) HistoryTabContent$lambda$282).toString());
        try {
            Result.Companion companion = Result.INSTANCE;
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(buildAuthorizeUrl)));
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
            Toast.makeText(context, "Could not open browser", 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$18$lambda$17$lambda$16(Context context, Repository repository, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        SecureSettingsStore.INSTANCE.clearStravaTokens(context);
        HistoryTabContentKt.HistoryTabContent$refreshStravaUiState(repository, mutableState, mutableState2);
        HistoryTabContentKt.HistoryTabContent$lambda$42(mutableState3, false);
        Toast.makeText(context, "Strava disconnected", 0).show();
        return Unit.INSTANCE;
    }
}
