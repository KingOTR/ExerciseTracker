package com.example.rungps.data;

import com.example.rungps.data.Repository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$syncStravaFull$2", f = "Repository.kt", i = {1}, l = {2505, 2506}, m = "invokeSuspend", n = {"pb"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class Repository$syncStravaFull$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$syncStravaFull$2(Repository repository, Continuation<? super Repository$syncStravaFull$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$syncStravaFull$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<String>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
        return ((Repository$syncStravaFull$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m6842syncStravaPersonalBestsIoAF18A;
        Object obj2;
        Repository.StravaUploadRetryResult stravaUploadRetryResult;
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            m6842syncStravaPersonalBestsIoAF18A = this.this$0.m6842syncStravaPersonalBestsIoAF18A(this);
            if (m6842syncStravaPersonalBestsIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                stravaUploadRetryResult = (Repository.StravaUploadRetryResult) obj;
                if (stravaUploadRetryResult.getSucceeded() <= 0) {
                    str = " · uploaded " + stravaUploadRetryResult.getSucceeded() + " run(s) to Strava";
                } else {
                    str = stravaUploadRetryResult.getAttempted() > 0 ? " · " + stravaUploadRetryResult.getAttempted() + " upload(s) still failed — check Last upload below" : "";
                }
                if (!Result.m7912isSuccessimpl(obj2)) {
                    Result.Companion companion = Result.INSTANCE;
                    ResultKt.throwOnFailure(obj2);
                    obj2 = Result.m7905constructorimpl(obj2 + str);
                } else if (stravaUploadRetryResult.getSucceeded() > 0) {
                    Result.Companion companion2 = Result.INSTANCE;
                    int succeeded = stravaUploadRetryResult.getSucceeded();
                    Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(obj2);
                    if (m7908exceptionOrNullimpl == null || (str2 = m7908exceptionOrNullimpl.getMessage()) == null) {
                        str2 = "unknown error";
                    }
                    obj2 = Result.m7905constructorimpl("Uploaded " + succeeded + " run(s) to Strava · import failed: " + str2);
                }
                return Result.m7904boximpl(obj2);
            }
            ResultKt.throwOnFailure(obj);
            m6842syncStravaPersonalBestsIoAF18A = ((Result) obj).getValue();
        }
        this.L$0 = m6842syncStravaPersonalBestsIoAF18A;
        this.label = 2;
        Object retryPendingStravaUploads = this.this$0.retryPendingStravaUploads(5, this);
        if (retryPendingStravaUploads == coroutine_suspended) {
            return coroutine_suspended;
        }
        Object obj3 = m6842syncStravaPersonalBestsIoAF18A;
        obj = retryPendingStravaUploads;
        obj2 = obj3;
        stravaUploadRetryResult = (Repository.StravaUploadRetryResult) obj;
        if (stravaUploadRetryResult.getSucceeded() <= 0) {
        }
        if (!Result.m7912isSuccessimpl(obj2)) {
        }
        return Result.m7904boximpl(obj2);
    }
}
