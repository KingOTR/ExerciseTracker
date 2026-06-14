package com.example.rungps.data;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RepositoryCloudSync.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0080@¢\u0006\u0002\u0010\u0004\u001a \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\b\u001a\u001a\u0010\t\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"syncStravaPersonalBestsImpl", "Lkotlin/Result;", "", "Lcom/example/rungps/data/Repository;", "(Lcom/example/rungps/data/Repository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncStravaPersonalBestsAttempt", "allowAuthRetry", "", "(Lcom/example/rungps/data/Repository;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importGymTrackingXlsxImpl", "Lcom/example/rungps/data/GymXlsxImportResult;", "uri", "Landroid/net/Uri;", "(Lcom/example/rungps/data/Repository;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RepositoryCloudSyncKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object syncStravaPersonalBestsImpl(Repository repository, Continuation<? super Result<String>> continuation) {
        RepositoryCloudSyncKt$syncStravaPersonalBestsImpl$1 repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1;
        int i;
        if (continuation instanceof RepositoryCloudSyncKt$syncStravaPersonalBestsImpl$1) {
            repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1 = (RepositoryCloudSyncKt$syncStravaPersonalBestsImpl$1) continuation;
            if ((repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1.label & Integer.MIN_VALUE) != 0) {
                repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1.label -= Integer.MIN_VALUE;
                Object obj = repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1.label = 1;
                Object syncStravaPersonalBestsAttempt = syncStravaPersonalBestsAttempt(repository, true, repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1);
                return syncStravaPersonalBestsAttempt == coroutine_suspended ? coroutine_suspended : syncStravaPersonalBestsAttempt;
            }
        }
        repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1 = new RepositoryCloudSyncKt$syncStravaPersonalBestsImpl$1(continuation);
        Object obj2 = repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = repositoryCloudSyncKt$syncStravaPersonalBestsImpl$1.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object syncStravaPersonalBestsAttempt(Repository repository, boolean z, Continuation<? super Result<String>> continuation) {
        RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1 repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1;
        int i;
        if (continuation instanceof RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1) {
            repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1 = (RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1) continuation;
            if ((repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1.label & Integer.MIN_VALUE) != 0) {
                repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1.label -= Integer.MIN_VALUE;
                Object obj = repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2 repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2 = new RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2(repository, z, null);
                    repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1.label = 1;
                    obj = BuildersKt.withContext(io2, repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2, repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1 = new RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1(continuation);
        Object obj2 = repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public static final Object importGymTrackingXlsxImpl(Repository repository, Uri uri, Continuation<? super GymXlsxImportResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RepositoryCloudSyncKt$importGymTrackingXlsxImpl$2(repository, uri, null), continuation);
    }
}
