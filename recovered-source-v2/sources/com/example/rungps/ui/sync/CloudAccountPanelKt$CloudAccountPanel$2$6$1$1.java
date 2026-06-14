package com.example.rungps.ui.sync;

import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.sync.CloudSyncResult;
import com.example.rungps.ui.components.AppSnackbarMessages;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CloudAccountPanel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$6$1$1", f = "CloudAccountPanel.kt", i = {}, l = {114, 115, MenuKt.InTransitionDuration}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class CloudAccountPanelKt$CloudAccountPanel$2$6$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $cloudSyncing$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnackbarHostState $snackbar;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloudAccountPanelKt$CloudAccountPanel$2$6$1$1(Repository repository, CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, MutableState<Boolean> mutableState, Continuation<? super CloudAccountPanelKt$CloudAccountPanel$2$6$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$scope = coroutineScope;
        this.$snackbar = snackbarHostState;
        this.$cloudSyncing$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CloudAccountPanelKt$CloudAccountPanel$2$6$1$1(this.$repo, this.$scope, this.$snackbar, this.$cloudSyncing$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CloudAccountPanelKt$CloudAccountPanel$2$6$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            this.label = 3;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$scope, this.$snackbar, e, this.$cloudSyncing$delegate, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$repo.syncAllToCloud(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        CloudSyncResult cloudSyncResult = (CloudSyncResult) obj;
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$scope, this.$snackbar, cloudSyncResult, this.$cloudSyncing$delegate, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CloudAccountPanel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$6$1$1$1", f = "CloudAccountPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$6$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Boolean> $cloudSyncing$delegate;
        final /* synthetic */ CloudSyncResult $r;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SnackbarHostState $snackbar;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, CloudSyncResult cloudSyncResult, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$scope = coroutineScope;
            this.$snackbar = snackbarHostState;
            this.$r = cloudSyncResult;
            this.$cloudSyncing$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$scope, this.$snackbar, this.$r, this.$cloudSyncing$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CloudAccountPanelKt.CloudAccountPanel$lambda$11(this.$cloudSyncing$delegate, false);
                CloudAccountPanelKt.toastSyncResult(this.$scope, this.$snackbar, "Synced", this.$r);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CloudAccountPanel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$6$1$1$2", f = "CloudAccountPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$6$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Boolean> $cloudSyncing$delegate;
        final /* synthetic */ Exception $e;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SnackbarHostState $snackbar;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, Exception exc, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$scope = coroutineScope;
            this.$snackbar = snackbarHostState;
            this.$e = exc;
            this.$cloudSyncing$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$scope, this.$snackbar, this.$e, this.$cloudSyncing$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CloudAccountPanelKt.CloudAccountPanel$lambda$11(this.$cloudSyncing$delegate, false);
                AppSnackbarMessages appSnackbarMessages = AppSnackbarMessages.INSTANCE;
                CoroutineScope coroutineScope = this.$scope;
                SnackbarHostState snackbarHostState = this.$snackbar;
                String message = this.$e.getMessage();
                if (message == null) {
                    message = "Sync failed";
                }
                appSnackbarMessages.showError(coroutineScope, snackbarHostState, message);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
