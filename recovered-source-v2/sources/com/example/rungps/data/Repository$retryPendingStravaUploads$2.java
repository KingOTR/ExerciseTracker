package com.example.rungps.data;

import android.content.SharedPreferences;
import com.example.rungps.data.Repository;
import com.example.rungps.data.repo.RunRepository;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/Repository$StravaUploadRetryResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$retryPendingStravaUploads$2", f = "Repository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {2421, 2432}, m = "invokeSuspend", n = {"$this$withContext", "prefs", "attempted", "succeeded", "$this$withContext", "prefs", "attempted", "succeeded"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class Repository$retryPendingStravaUploads$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Repository.StravaUploadRetryResult>, Object> {
    final /* synthetic */ int $maxAttempts;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$retryPendingStravaUploads$2(Repository repository, int i, Continuation<? super Repository$retryPendingStravaUploads$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$maxAttempts = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Repository$retryPendingStravaUploads$2 repository$retryPendingStravaUploads$2 = new Repository$retryPendingStravaUploads$2(this.this$0, this.$maxAttempts, continuation);
        repository$retryPendingStravaUploads$2.L$0 = obj;
        return repository$retryPendingStravaUploads$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Repository.StravaUploadRetryResult> continuation) {
        return ((Repository$retryPendingStravaUploads$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00ef -> B:8:0x00f2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        SharedPreferences sharedPreferences;
        RunRepository runRepository;
        int i;
        int i2;
        CoroutineScope coroutineScope2;
        SharedPreferences sharedPreferences2;
        Iterator it;
        Object m7905constructorimpl;
        Object m6844uploadRunToStravagIAlus;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (!this.this$0.isStravaConnected()) {
                return new Repository.StravaUploadRetryResult(0, 0);
            }
            sharedPreferences = this.this$0.getAppContext().getSharedPreferences("settings", 0);
            runRepository = this.this$0.runRepo;
            this.L$0 = coroutineScope;
            this.L$1 = sharedPreferences;
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            obj = runRepository.allRuns(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = 0;
            i2 = 0;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$1;
                i2 = this.I$0;
                it = (Iterator) this.L$2;
                sharedPreferences2 = (SharedPreferences) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    m6844uploadRunToStravagIAlus = ((Result) obj).getValue();
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                m7905constructorimpl = Result.m7905constructorimpl(Result.m7904boximpl(m6844uploadRunToStravagIAlus));
                if (Result.m7912isSuccessimpl(m7905constructorimpl)) {
                    i++;
                }
                while (it.hasNext()) {
                    RunEntity runEntity = (RunEntity) it.next();
                    if (i2 >= this.$maxAttempts) {
                        break;
                    }
                    long id = runEntity.getId();
                    if (sharedPreferences2.getBoolean("strava_pending_run_" + id, false)) {
                        i2++;
                        Repository repository = this.this$0;
                        Result.Companion companion2 = Result.INSTANCE;
                        this.L$0 = coroutineScope2;
                        this.L$1 = sharedPreferences2;
                        this.L$2 = it;
                        this.I$0 = i2;
                        this.I$1 = i;
                        this.label = 2;
                        m6844uploadRunToStravagIAlus = repository.m6844uploadRunToStravagIAlus(id, this);
                        if (m6844uploadRunToStravagIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        m7905constructorimpl = Result.m7905constructorimpl(Result.m7904boximpl(m6844uploadRunToStravagIAlus));
                        if (Result.m7912isSuccessimpl(m7905constructorimpl)) {
                        }
                        while (it.hasNext()) {
                        }
                    }
                }
                return new Repository.StravaUploadRetryResult(i2, i);
            }
            i = this.I$1;
            i2 = this.I$0;
            sharedPreferences = (SharedPreferences) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        coroutineScope2 = coroutineScope;
        sharedPreferences2 = sharedPreferences;
        it = SequencesKt.toList(SequencesKt.take(SequencesKt.sortedWith(SequencesKt.filter(CollectionsKt.asSequence((Iterable) obj), new Function1() { // from class: com.example.rungps.data.Repository$retryPendingStravaUploads$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                boolean invokeSuspend$lambda$0;
                invokeSuspend$lambda$0 = Repository$retryPendingStravaUploads$2.invokeSuspend$lambda$0((RunEntity) obj2);
                return Boolean.valueOf(invokeSuspend$lambda$0);
            }
        }), new Comparator() { // from class: com.example.rungps.data.Repository$retryPendingStravaUploads$2$invokeSuspend$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                RunEntity runEntity2 = (RunEntity) t2;
                Long endedAtMs = runEntity2.getEndedAtMs();
                Long valueOf = Long.valueOf(endedAtMs != null ? endedAtMs.longValue() : runEntity2.getStartedAtMs());
                RunEntity runEntity3 = (RunEntity) t;
                Long endedAtMs2 = runEntity3.getEndedAtMs();
                return ComparisonsKt.compareValues(valueOf, Long.valueOf(endedAtMs2 != null ? endedAtMs2.longValue() : runEntity3.getStartedAtMs()));
            }
        }), 60)).iterator();
        while (it.hasNext()) {
        }
        return new Repository.StravaUploadRetryResult(i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(RunEntity runEntity) {
        return runEntity.getEndedAtMs() != null;
    }
}
