package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.analytics.LocalPbWithRun;
import com.example.rungps.data.Repository;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
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

/* compiled from: HistoryTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$2$1$1$1$1$1", f = "HistoryTabContent.kt", i = {1}, l = {253, 254, 255}, m = "invokeSuspend", n = {"r"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$7$2$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Map<String, LocalPbWithRun>> $localPbRuns$delegate;
    final /* synthetic */ MutableState<Map<String, Long>> $localPbs$delegate;
    final /* synthetic */ MutableState<Map<String, LocalPbWithRun>> $localRidePbs$delegate;
    final /* synthetic */ MutableState<Boolean> $refreshingPbs$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<Boolean> $stravaConnected$delegate;
    final /* synthetic */ MutableState<String> $stravaUploadStatus$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryTabContentKt$HistoryTabContent$7$2$1$1$1$1$1(Repository repository, MutableState<Map<String, LocalPbWithRun>> mutableState, MutableState<Map<String, LocalPbWithRun>> mutableState2, MutableState<Map<String, Long>> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5, MutableState<String> mutableState6, Context context, Continuation<? super HistoryTabContentKt$HistoryTabContent$7$2$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$localPbRuns$delegate = mutableState;
        this.$localRidePbs$delegate = mutableState2;
        this.$localPbs$delegate = mutableState3;
        this.$refreshingPbs$delegate = mutableState4;
        this.$stravaConnected$delegate = mutableState5;
        this.$stravaUploadStatus$delegate = mutableState6;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryTabContentKt$HistoryTabContent$7$2$1$1$1$1$1(this.$repo, this.$localPbRuns$delegate, this.$localRidePbs$delegate, this.$localPbs$delegate, this.$refreshingPbs$delegate, this.$stravaConnected$delegate, this.$stravaUploadStatus$delegate, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryTabContentKt$HistoryTabContent$7$2$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m6841syncStravaFullIoAF18A;
        Object obj2;
        Object HistoryTabContent$reloadLocalPbs;
        Object obj3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            m6841syncStravaFullIoAF18A = this.$repo.m6841syncStravaFullIoAF18A(this);
            if (m6841syncStravaFullIoAF18A == coroutine_suspended) {
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
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                obj3 = obj2;
                this.L$0 = null;
                this.label = 3;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(obj3, this.$refreshingPbs$delegate, this.$repo, this.$stravaConnected$delegate, this.$stravaUploadStatus$delegate, this.$ctx, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            m6841syncStravaFullIoAF18A = ((Result) obj).getValue();
        }
        obj2 = m6841syncStravaFullIoAF18A;
        this.L$0 = obj2;
        this.label = 2;
        HistoryTabContent$reloadLocalPbs = HistoryTabContentKt.HistoryTabContent$reloadLocalPbs(this.$repo, this.$localPbRuns$delegate, this.$localRidePbs$delegate, this.$localPbs$delegate, this);
        if (HistoryTabContent$reloadLocalPbs == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj3 = obj2;
        this.L$0 = null;
        this.label = 3;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(obj3, this.$refreshingPbs$delegate, this.$repo, this.$stravaConnected$delegate, this.$stravaUploadStatus$delegate, this.$ctx, null), this) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HistoryTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$2$1$1$1$1$1$1", f = "HistoryTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$2$1$1$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ Object $r;
        final /* synthetic */ MutableState<Boolean> $refreshingPbs$delegate;
        final /* synthetic */ Repository $repo;
        final /* synthetic */ MutableState<Boolean> $stravaConnected$delegate;
        final /* synthetic */ MutableState<String> $stravaUploadStatus$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj, MutableState<Boolean> mutableState, Repository repository, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$r = obj;
            this.$refreshingPbs$delegate = mutableState;
            this.$repo = repository;
            this.$stravaConnected$delegate = mutableState2;
            this.$stravaUploadStatus$delegate = mutableState3;
            this.$ctx = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$r, this.$refreshingPbs$delegate, this.$repo, this.$stravaConnected$delegate, this.$stravaUploadStatus$delegate, this.$ctx, continuation);
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
                HistoryTabContentKt.HistoryTabContent$lambda$56(this.$refreshingPbs$delegate, false);
                HistoryTabContentKt.HistoryTabContent$refreshStravaUiState(this.$repo, this.$stravaConnected$delegate, this.$stravaUploadStatus$delegate);
                Object obj2 = this.$r;
                Context context = this.$ctx;
                if (Result.m7912isSuccessimpl(obj2)) {
                    Toast.makeText(context, (String) obj2, 1).show();
                }
                Object obj3 = this.$r;
                Context context2 = this.$ctx;
                Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(obj3);
                if (m7908exceptionOrNullimpl != null) {
                    String message = m7908exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Sync failed";
                    }
                    Toast.makeText(context2, message, 1).show();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
