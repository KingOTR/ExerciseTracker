package com.example.rungps.ui.sync;

import androidx.compose.material3.SnackbarHostState;
import com.example.rungps.data.Repository;
import com.example.rungps.ui.components.AppSnackbarMessages;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CloudAccountPanel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$7$1$1", f = "CloudAccountPanel.kt", i = {1}, l = {130, 131, 132, 147}, m = "invokeSuspend", n = {"gymN"}, s = {"I$0"})
/* loaded from: classes3.dex */
final class CloudAccountPanelKt$CloudAccountPanel$2$7$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ SnackbarHostState $snackbar;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloudAccountPanelKt$CloudAccountPanel$2$7$1$1(Repository repository, CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, Continuation<? super CloudAccountPanelKt$CloudAccountPanel$2$7$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$scope = coroutineScope;
        this.$snackbar = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CloudAccountPanelKt$CloudAccountPanel$2$7$1$1(this.$repo, this.$scope, this.$snackbar, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CloudAccountPanelKt$CloudAccountPanel$2$7$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int intValue;
        int i;
        int intValue2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
        } catch (Exception e) {
            this.label = 4;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$scope, this.$snackbar, e, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$repo.pullGymSessionsFromCloud(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    intValue = this.I$0;
                    ResultKt.throwOnFailure(obj);
                    i = intValue;
                    intValue2 = ((Number) obj).intValue();
                    this.label = 3;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$scope, this.$snackbar, i, intValue2, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i2 == 3) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        intValue = ((Number) obj).intValue();
        this.I$0 = intValue;
        this.label = 2;
        obj = this.$repo.pullRunsFromCloud(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        i = intValue;
        intValue2 = ((Number) obj).intValue();
        this.label = 3;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$scope, this.$snackbar, i, intValue2, null), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CloudAccountPanel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$7$1$1$1", f = "CloudAccountPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$7$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $gymN;
        final /* synthetic */ int $runN;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ SnackbarHostState $snackbar;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, int i, int i2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$scope = coroutineScope;
            this.$snackbar = snackbarHostState;
            this.$gymN = i;
            this.$runN = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$scope, this.$snackbar, this.$gymN, this.$runN, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = this.$gymN;
            int i2 = this.$runN;
            StringBuilder sb = new StringBuilder();
            if (i == 0 && i2 == 0) {
                str = "Cloud pull: nothing new";
            } else {
                str = "Pulled";
            }
            sb.append(str);
            if (i > 0) {
                sb.append(" " + i + " gym");
            }
            if (i2 > 0) {
                sb.append((i > 0 ? new StringBuilder(", ").append(i2) : new StringBuilder(" ").append(i2)).append(" run").toString());
            }
            if (i > 0 || i2 > 0) {
                sb.append(i + i2 == 1 ? " session" : " sessions");
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            AppSnackbarMessages.INSTANCE.showSuccess(this.$scope, this.$snackbar, sb2);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CloudAccountPanel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$7$1$1$2", f = "CloudAccountPanel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$2$7$1$1$2, reason: invalid class name */
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
                message = "Pull failed";
            }
            appSnackbarMessages.showError(coroutineScope, snackbarHostState, message);
            return Unit.INSTANCE;
        }
    }
}
