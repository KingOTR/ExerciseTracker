package com.example.rungps.data;

import com.example.rungps.data.repo.StravaRepository;
import com.example.rungps.strava.StravaPhotoUpload;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$uploadOverlayToStrava$2", f = "Repository.kt", i = {1}, l = {2456, 2460}, m = "invokeSuspend", n = {"aid"}, s = {"J$0"})
/* loaded from: classes3.dex */
final class Repository$uploadOverlayToStrava$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ byte[] $pngBytes;
    final /* synthetic */ long $runId;
    long J$0;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$uploadOverlayToStrava$2(Repository repository, long j, byte[] bArr, Continuation<? super Repository$uploadOverlayToStrava$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$runId = j;
        this.$pngBytes = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$uploadOverlayToStrava$2(this.this$0, this.$runId, this.$pngBytes, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<String>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
        return ((Repository$uploadOverlayToStrava$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:7:0x0016, B:8:0x00ce, B:14:0x0023, B:15:0x00ab, B:17:0x00b8, B:21:0x00ef, B:24:0x0034, B:26:0x004f, B:28:0x0067, B:30:0x0079, B:32:0x0091, B:34:0x009b), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:7:0x0016, B:8:0x00ce, B:14:0x0023, B:15:0x00ab, B:17:0x00b8, B:21:0x00ef, B:24:0x0034, B:26:0x004f, B:28:0x0067, B:30:0x0079, B:32:0x0091, B:34:0x009b), top: B:2:0x000e }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String stravaUploadFailureMessage;
        Object m7905constructorimpl;
        StravaRepository stravaRepository;
        Triple readStravaTokens;
        Long stravaActivityIdForRun;
        Object m6844uploadRunToStravagIAlus;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            stravaUploadFailureMessage = this.this$0.stravaUploadFailureMessage(e);
            this.this$0.getAppContext().getSharedPreferences("settings", 0).edit().putLong("strava_last_upload_ms", System.currentTimeMillis()).putString("strava_last_upload_status", "Failed: " + stravaUploadFailureMessage).apply();
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException(stravaUploadFailureMessage, e)));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getAppContext().getSharedPreferences("settings", 0);
            stravaRepository = this.this$0.stravaRepo;
            if (stravaRepository.clientId().length() != 0) {
                readStravaTokens = this.this$0.readStravaTokens();
                if (((CharSequence) readStravaTokens.getFirst()).length() == 0) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Connect Strava first"))));
                }
                stravaActivityIdForRun = this.this$0.stravaActivityIdForRun(this.$runId);
                if (stravaActivityIdForRun == null) {
                    this.label = 1;
                    m6844uploadRunToStravagIAlus = this.this$0.m6844uploadRunToStravagIAlus(this.$runId, this);
                    if (m6844uploadRunToStravagIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (stravaActivityIdForRun == null) {
                    long longValue = stravaActivityIdForRun.longValue();
                    this.J$0 = longValue;
                    this.label = 2;
                    obj = Repository.obtainStravaAccessToken$app_sideload$default(this.this$0, false, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = longValue;
                    StravaPhotoUpload.INSTANCE.uploadPhoto((String) obj, j, this.$pngBytes, "Exercise Tracker · exercise-tracker.app");
                    Result.Companion companion3 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl("Photo added to Strava activity " + j);
                    return Result.m7904boximpl(m7905constructorimpl);
                }
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("No Strava activity for this run"))));
            }
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Strava Client ID not configured"))));
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
            StravaPhotoUpload.INSTANCE.uploadPhoto((String) obj, j, this.$pngBytes, "Exercise Tracker · exercise-tracker.app");
            Result.Companion companion32 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl("Photo added to Strava activity " + j);
            return Result.m7904boximpl(m7905constructorimpl);
        }
        ResultKt.throwOnFailure(obj);
        m6844uploadRunToStravagIAlus = ((Result) obj).getValue();
        ResultKt.throwOnFailure(m6844uploadRunToStravagIAlus);
        stravaActivityIdForRun = this.this$0.stravaActivityIdForRun(this.$runId);
        if (stravaActivityIdForRun == null) {
        }
    }
}
