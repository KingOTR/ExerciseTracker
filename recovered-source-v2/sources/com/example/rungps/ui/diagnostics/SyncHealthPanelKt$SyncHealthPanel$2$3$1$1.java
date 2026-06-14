package com.example.rungps.ui.diagnostics;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.sleep.SleepScience;
import com.example.rungps.sync.CloudSyncManager;
import com.example.rungps.sync.CloudSyncResult;
import com.example.rungps.sync.CloudSyncScheduler;
import com.example.rungps.sync.GymSyncQueue;
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
@DebugMetadata(c = "com.example.rungps.ui.diagnostics.SyncHealthPanelKt$SyncHealthPanel$2$3$1$1", f = "SyncHealthPanel.kt", i = {}, l = {89, SleepScience.CYCLE_TYPICAL_MIN, 91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SyncHealthPanelKt$SyncHealthPanel$2$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $busy$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $lastSummary$delegate;
    final /* synthetic */ MutableState<Long> $lastSyncMs$delegate;
    final /* synthetic */ MutableIntState $pending$delegate;
    final /* synthetic */ MutableState<List<String>> $syncErrors$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SyncHealthPanelKt$SyncHealthPanel$2$3$1$1(Context context, MutableState<Boolean> mutableState, MutableState<Long> mutableState2, MutableIntState mutableIntState, MutableState<List<String>> mutableState3, MutableState<String> mutableState4, Continuation<? super SyncHealthPanelKt$SyncHealthPanel$2$3$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$busy$delegate = mutableState;
        this.$lastSyncMs$delegate = mutableState2;
        this.$pending$delegate = mutableIntState;
        this.$syncErrors$delegate = mutableState3;
        this.$lastSummary$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SyncHealthPanelKt$SyncHealthPanel$2$3$1$1(this.$ctx, this.$busy$delegate, this.$lastSyncMs$delegate, this.$pending$delegate, this.$syncErrors$delegate, this.$lastSummary$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SyncHealthPanelKt$SyncHealthPanel$2$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CloudSyncResult cloudSyncResult;
        CloudSyncResult cloudSyncResult2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = CloudSyncScheduler.INSTANCE.syncIfDue(this.$ctx, true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                cloudSyncResult = (CloudSyncResult) obj;
                cloudSyncResult2 = cloudSyncResult;
                this.label = 3;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(cloudSyncResult2, this.$ctx, this.$busy$delegate, this.$lastSyncMs$delegate, this.$pending$delegate, this.$syncErrors$delegate, this.$lastSummary$delegate, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        cloudSyncResult = (CloudSyncResult) obj;
        if (cloudSyncResult == null) {
            this.label = 2;
            obj = CloudSyncManager.INSTANCE.syncAll(this.$ctx, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            cloudSyncResult = (CloudSyncResult) obj;
        }
        cloudSyncResult2 = cloudSyncResult;
        this.label = 3;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(cloudSyncResult2, this.$ctx, this.$busy$delegate, this.$lastSyncMs$delegate, this.$pending$delegate, this.$syncErrors$delegate, this.$lastSummary$delegate, null), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SyncHealthPanel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.diagnostics.SyncHealthPanelKt$SyncHealthPanel$2$3$1$1$1", f = "SyncHealthPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.diagnostics.SyncHealthPanelKt$SyncHealthPanel$2$3$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Boolean> $busy$delegate;
        final /* synthetic */ Context $ctx;
        final /* synthetic */ MutableState<String> $lastSummary$delegate;
        final /* synthetic */ MutableState<Long> $lastSyncMs$delegate;
        final /* synthetic */ MutableIntState $pending$delegate;
        final /* synthetic */ CloudSyncResult $r;
        final /* synthetic */ MutableState<List<String>> $syncErrors$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CloudSyncResult cloudSyncResult, Context context, MutableState<Boolean> mutableState, MutableState<Long> mutableState2, MutableIntState mutableIntState, MutableState<List<String>> mutableState3, MutableState<String> mutableState4, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$r = cloudSyncResult;
            this.$ctx = context;
            this.$busy$delegate = mutableState;
            this.$lastSyncMs$delegate = mutableState2;
            this.$pending$delegate = mutableIntState;
            this.$syncErrors$delegate = mutableState3;
            this.$lastSummary$delegate = mutableState4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$r, this.$ctx, this.$busy$delegate, this.$lastSyncMs$delegate, this.$pending$delegate, this.$syncErrors$delegate, this.$lastSummary$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List SyncHealthPanel$lambda$20;
            List SyncHealthPanel$lambda$202;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SyncHealthPanelKt.SyncHealthPanel$lambda$15(this.$busy$delegate, false);
                SyncHealthPanelKt.SyncHealthPanel$lambda$9(this.$lastSyncMs$delegate, this.$r.getLastSyncMs());
                this.$pending$delegate.setIntValue(GymSyncQueue.INSTANCE.pendingCount(this.$ctx));
                this.$syncErrors$delegate.setValue(CollectionsKt.distinct(this.$r.getErrors()));
                this.$lastSummary$delegate.setValue(this.$r.summary());
                Context context = this.$ctx;
                SyncHealthPanel$lambda$20 = SyncHealthPanelKt.SyncHealthPanel$lambda$20(this.$syncErrors$delegate);
                if (SyncHealthPanel$lambda$20.isEmpty()) {
                    str = SyncHealthPanelKt.SyncHealthPanel$lambda$17(this.$lastSummary$delegate);
                } else {
                    SyncHealthPanel$lambda$202 = SyncHealthPanelKt.SyncHealthPanel$lambda$20(this.$syncErrors$delegate);
                    str = (String) CollectionsKt.first(SyncHealthPanel$lambda$202);
                }
                Toast.makeText(context, str, 1).show();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
