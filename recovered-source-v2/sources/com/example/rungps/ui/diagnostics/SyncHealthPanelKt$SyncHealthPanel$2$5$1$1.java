package com.example.rungps.ui.diagnostics;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.health.platform.client.SdkConfig;
import com.example.rungps.data.Repository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SyncHealthPanel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.diagnostics.SyncHealthPanelKt$SyncHealthPanel$2$5$1$1", f = "SyncHealthPanel.kt", i = {}, l = {SdkConfig.SDK_VERSION, 113}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SyncHealthPanelKt$SyncHealthPanel$2$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $busy$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $lastSummary$delegate;
    final /* synthetic */ MutableState<List<String>> $syncErrors$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SyncHealthPanelKt$SyncHealthPanel$2$5$1$1(Context context, MutableState<Boolean> mutableState, MutableState<List<String>> mutableState2, MutableState<String> mutableState3, Continuation<? super SyncHealthPanelKt$SyncHealthPanel$2$5$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$busy$delegate = mutableState;
        this.$syncErrors$delegate = mutableState2;
        this.$lastSummary$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SyncHealthPanelKt$SyncHealthPanel$2$5$1$1(this.$ctx, this.$busy$delegate, this.$syncErrors$delegate, this.$lastSummary$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SyncHealthPanelKt$SyncHealthPanel$2$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = Repository.INSTANCE.get(this.$ctx).restoreRunsFromCloud(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        int intValue = ((Number) obj).intValue();
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(intValue, this.$ctx, this.$busy$delegate, this.$syncErrors$delegate, this.$lastSummary$delegate, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SyncHealthPanel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.diagnostics.SyncHealthPanelKt$SyncHealthPanel$2$5$1$1$1", f = "SyncHealthPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.diagnostics.SyncHealthPanelKt$SyncHealthPanel$2$5$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Boolean> $busy$delegate;
        final /* synthetic */ Context $ctx;
        final /* synthetic */ MutableState<String> $lastSummary$delegate;
        final /* synthetic */ int $n;
        final /* synthetic */ MutableState<List<String>> $syncErrors$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i, Context context, MutableState<Boolean> mutableState, MutableState<List<String>> mutableState2, MutableState<String> mutableState3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$n = i;
            this.$ctx = context;
            this.$busy$delegate = mutableState;
            this.$syncErrors$delegate = mutableState2;
            this.$lastSummary$delegate = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$n, this.$ctx, this.$busy$delegate, this.$syncErrors$delegate, this.$lastSummary$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String SyncHealthPanel$lambda$17;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SyncHealthPanelKt.SyncHealthPanel$lambda$15(this.$busy$delegate, false);
                this.$syncErrors$delegate.setValue(CollectionsKt.emptyList());
                this.$lastSummary$delegate.setValue("Restored " + this.$n + " run(s) from cloud");
                Context context = this.$ctx;
                SyncHealthPanel$lambda$17 = SyncHealthPanelKt.SyncHealthPanel$lambda$17(this.$lastSummary$delegate);
                Toast.makeText(context, SyncHealthPanel$lambda$17, 1).show();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
