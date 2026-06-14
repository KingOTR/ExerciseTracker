package com.example.rungps.ui.sync;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.sync.CloudSyncResult;
import com.example.rungps.ui.components.AppSnackbarMessages;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.tasks.TasksKt;
import org.maplibre.android.log.Logger;

/* compiled from: CloudAccountPanel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$5$1$1", f = "CloudAccountPanel.kt", i = {}, l = {97, 98, Logger.NONE, 104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class CloudAccountPanelKt$CloudAccountPanel$2$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $cloudEmail$delegate;
    final /* synthetic */ MutableState<String> $cloudPassword$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnackbarHostState $snackbar;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloudAccountPanelKt$CloudAccountPanel$2$5$1$1(Repository repository, MutableState<String> mutableState, MutableState<String> mutableState2, CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, Continuation<? super CloudAccountPanelKt$CloudAccountPanel$2$5$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$cloudEmail$delegate = mutableState;
        this.$cloudPassword$delegate = mutableState2;
        this.$scope = coroutineScope;
        this.$snackbar = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CloudAccountPanelKt$CloudAccountPanel$2$5$1$1(this.$repo, this.$cloudEmail$delegate, this.$cloudPassword$delegate, this.$scope, this.$snackbar, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CloudAccountPanelKt$CloudAccountPanel$2$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String CloudAccountPanel$lambda$3;
        String CloudAccountPanel$lambda$7;
        CloudSyncResult cloudSyncResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            this.label = 4;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$scope, this.$snackbar, e, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
            CloudAccountPanel$lambda$3 = CloudAccountPanelKt.CloudAccountPanel$lambda$3(this.$cloudEmail$delegate);
            String obj2 = StringsKt.trim((CharSequence) CloudAccountPanel$lambda$3).toString();
            CloudAccountPanel$lambda$7 = CloudAccountPanelKt.CloudAccountPanel$lambda$7(this.$cloudPassword$delegate);
            Task<AuthResult> createUserWithEmailAndPassword = firebaseAuth.createUserWithEmailAndPassword(obj2, CloudAccountPanel$lambda$7);
            Intrinsics.checkNotNullExpressionValue(createUserWithEmailAndPassword, "createUserWithEmailAndPassword(...)");
            this.label = 1;
            if (TasksKt.await(createUserWithEmailAndPassword, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    cloudSyncResult = (CloudSyncResult) obj;
                    this.label = 3;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$scope, this.$snackbar, cloudSyncResult, this.$cloudPassword$delegate, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.label = 2;
        obj = this.$repo.syncAllToCloud(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        cloudSyncResult = (CloudSyncResult) obj;
        this.label = 3;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$scope, this.$snackbar, cloudSyncResult, this.$cloudPassword$delegate, null), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CloudAccountPanel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$5$1$1$1", f = "CloudAccountPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$5$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<String> $cloudPassword$delegate;
        final /* synthetic */ CloudSyncResult $r;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SnackbarHostState $snackbar;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, CloudSyncResult cloudSyncResult, MutableState<String> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$scope = coroutineScope;
            this.$snackbar = snackbarHostState;
            this.$r = cloudSyncResult;
            this.$cloudPassword$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$scope, this.$snackbar, this.$r, this.$cloudPassword$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$cloudPassword$delegate.setValue("");
            CloudAccountPanelKt.toastSyncResult(this.$scope, this.$snackbar, "Account created", this.$r);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CloudAccountPanel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$5$1$1$2", f = "CloudAccountPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$5$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Exception $e;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SnackbarHostState $snackbar;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, Exception exc, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$scope = coroutineScope;
            this.$snackbar = snackbarHostState;
            this.$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$scope, this.$snackbar, this.$e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AppSnackbarMessages appSnackbarMessages = AppSnackbarMessages.INSTANCE;
            CoroutineScope coroutineScope = this.$scope;
            SnackbarHostState snackbarHostState = this.$snackbar;
            String message = this.$e.getMessage();
            if (message == null) {
                message = "Create account failed";
            }
            appSnackbarMessages.showError(coroutineScope, snackbarHostState, message);
            return Unit.INSTANCE;
        }
    }
}
