package com.example.rungps.data;

import android.content.Context;
import com.example.rungps.strava.StravaActivitiesApi;
import com.example.rungps.strava.StravaActivityJson;
import com.example.rungps.strava.StravaAuthErrors;
import com.example.rungps.strava.StravaHistorySyncResult;
import com.example.rungps.strava.StravaPbCalculator;
import com.example.rungps.sync.StravaPbFirestoreSync;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.maplibre.android.log.Logger;

/* compiled from: RepositoryCloudSync.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2", f = "RepositoryCloudSync.kt", i = {0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {39, 48, 53, 56, 97, Logger.NONE}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "runActivities", "rideActivities", "runPbs", "ridePbs", "pbs", "$this$withContext", "runActivities", "rideActivities", "runPbs", "ridePbs", "pbs", "runActivities", "rideActivities", "runPbs", "ridePbs", "pbs", "history"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes3.dex */
final class RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ boolean $allowAuthRetry;
    final /* synthetic */ Repository $this_syncStravaPersonalBestsAttempt;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2(Repository repository, boolean z, Continuation<? super RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2> continuation) {
        super(2, continuation);
        this.$this_syncStravaPersonalBestsAttempt = repository;
        this.$allowAuthRetry = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2 repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2 = new RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2(this.$this_syncStravaPersonalBestsAttempt, this.$allowAuthRetry, continuation);
        repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2.L$0 = obj;
        return repositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<String>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
        return ((RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b0 A[Catch: Exception -> 0x0290, TryCatch #0 {Exception -> 0x0290, blocks: (B:19:0x018b, B:22:0x0196, B:24:0x01b0, B:26:0x01bd, B:27:0x01d3, B:29:0x01d9, B:30:0x01de, B:33:0x01ea, B:35:0x0267, B:36:0x027d, B:39:0x022d, B:41:0x0233, B:43:0x0239, B:44:0x023f, B:47:0x0181, B:49:0x006a, B:51:0x013a, B:53:0x0140, B:62:0x028f, B:64:0x0097, B:65:0x0119, B:69:0x00a0, B:72:0x00be, B:77:0x00ae), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d9 A[Catch: Exception -> 0x0290, TryCatch #0 {Exception -> 0x0290, blocks: (B:19:0x018b, B:22:0x0196, B:24:0x01b0, B:26:0x01bd, B:27:0x01d3, B:29:0x01d9, B:30:0x01de, B:33:0x01ea, B:35:0x0267, B:36:0x027d, B:39:0x022d, B:41:0x0233, B:43:0x0239, B:44:0x023f, B:47:0x0181, B:49:0x006a, B:51:0x013a, B:53:0x0140, B:62:0x028f, B:64:0x0097, B:65:0x0119, B:69:0x00a0, B:72:0x00be, B:77:0x00ae), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ea A[Catch: Exception -> 0x0290, TRY_ENTER, TryCatch #0 {Exception -> 0x0290, blocks: (B:19:0x018b, B:22:0x0196, B:24:0x01b0, B:26:0x01bd, B:27:0x01d3, B:29:0x01d9, B:30:0x01de, B:33:0x01ea, B:35:0x0267, B:36:0x027d, B:39:0x022d, B:41:0x0233, B:43:0x0239, B:44:0x023f, B:47:0x0181, B:49:0x006a, B:51:0x013a, B:53:0x0140, B:62:0x028f, B:64:0x0097, B:65:0x0119, B:69:0x00a0, B:72:0x00be, B:77:0x00ae), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0267 A[Catch: Exception -> 0x0290, TryCatch #0 {Exception -> 0x0290, blocks: (B:19:0x018b, B:22:0x0196, B:24:0x01b0, B:26:0x01bd, B:27:0x01d3, B:29:0x01d9, B:30:0x01de, B:33:0x01ea, B:35:0x0267, B:36:0x027d, B:39:0x022d, B:41:0x0233, B:43:0x0239, B:44:0x023f, B:47:0x0181, B:49:0x006a, B:51:0x013a, B:53:0x0140, B:62:0x028f, B:64:0x0097, B:65:0x0119, B:69:0x00a0, B:72:0x00be, B:77:0x00ae), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022d A[Catch: Exception -> 0x0290, TryCatch #0 {Exception -> 0x0290, blocks: (B:19:0x018b, B:22:0x0196, B:24:0x01b0, B:26:0x01bd, B:27:0x01d3, B:29:0x01d9, B:30:0x01de, B:33:0x01ea, B:35:0x0267, B:36:0x027d, B:39:0x022d, B:41:0x0233, B:43:0x0239, B:44:0x023f, B:47:0x0181, B:49:0x006a, B:51:0x013a, B:53:0x0140, B:62:0x028f, B:64:0x0097, B:65:0x0119, B:69:0x00a0, B:72:0x00be, B:77:0x00ae), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0140 A[Catch: Exception -> 0x0290, TRY_LEAVE, TryCatch #0 {Exception -> 0x0290, blocks: (B:19:0x018b, B:22:0x0196, B:24:0x01b0, B:26:0x01bd, B:27:0x01d3, B:29:0x01d9, B:30:0x01de, B:33:0x01ea, B:35:0x0267, B:36:0x027d, B:39:0x022d, B:41:0x0233, B:43:0x0239, B:44:0x023f, B:47:0x0181, B:49:0x006a, B:51:0x013a, B:53:0x0140, B:62:0x028f, B:64:0x0097, B:65:0x0119, B:69:0x00a0, B:72:0x00be, B:77:0x00ae), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028f A[Catch: Exception -> 0x0290, TRY_LEAVE, TryCatch #0 {Exception -> 0x0290, blocks: (B:19:0x018b, B:22:0x0196, B:24:0x01b0, B:26:0x01bd, B:27:0x01d3, B:29:0x01d9, B:30:0x01de, B:33:0x01ea, B:35:0x0267, B:36:0x027d, B:39:0x022d, B:41:0x0233, B:43:0x0239, B:44:0x023f, B:47:0x0181, B:49:0x006a, B:51:0x013a, B:53:0x0140, B:62:0x028f, B:64:0x0097, B:65:0x0119, B:69:0x00a0, B:72:0x00be, B:77:0x00ae), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object m7905constructorimpl;
        Object syncStravaPersonalBestsAttempt;
        CoroutineScope coroutineScope;
        Object obtainStravaAccessToken$app_sideload$default;
        CoroutineScope coroutineScope2;
        List<StravaActivityJson> fetchAllRunActivities$default;
        List<StravaActivityJson> fetchAllRideActivities$default;
        List<StravaPbEntity> computeRides;
        List<StravaPbEntity> plus;
        List<StravaPbEntity> list;
        List<StravaPbEntity> list2;
        Object m6836syncStravaActivitiesToHistory0E7RQCE$default;
        List<StravaActivityJson> list3;
        List<StravaPbEntity> list4;
        List<StravaPbEntity> list5;
        List<StravaPbEntity> list6;
        Throwable m7908exceptionOrNullimpl;
        List<StravaActivityJson> list7;
        StravaHistorySyncResult stravaHistorySyncResult;
        Object pushAll;
        Object m7905constructorimpl2;
        int intValue;
        Repository repository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            if ((StravaAuthErrors.INSTANCE.isReconnectableAuthFailure(message) || StringsKt.contains((CharSequence) message, (CharSequence) "401", true)) && this.$allowAuthRetry) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 5;
                if (this.$this_syncStravaPersonalBestsAttempt.obtainStravaAccessToken$app_sideload(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (StravaAuthErrors.INSTANCE.isReconnectableAuthFailure(message)) {
                    str = StravaAuthErrors.RECONNECT_MESSAGE;
                } else {
                    String str2 = message;
                    if (StringsKt.contains((CharSequence) str2, (CharSequence) "Client Secret", true)) {
                        str = StravaAuthErrors.MISSING_SECRET_MESSAGE;
                    } else if (StringsKt.contains((CharSequence) str2, (CharSequence) "Strava activities HTTP 403", true)) {
                        str = "Strava denied access (403). Reconnect and ensure you approve activity:read and activity:write.";
                    } else {
                        if (StringsKt.isBlank(str2)) {
                            str2 = "Strava sync failed";
                        }
                        str = str2;
                    }
                }
                Result.Companion companion = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException(str, e)));
            }
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                this.L$0 = coroutineScope;
                this.label = 1;
                obtainStravaAccessToken$app_sideload$default = Repository.obtainStravaAccessToken$app_sideload$default(this.$this_syncStravaPersonalBestsAttempt, false, this, 1, null);
                if (obtainStravaAccessToken$app_sideload$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope;
                String str3 = (String) obtainStravaAccessToken$app_sideload$default;
                fetchAllRunActivities$default = StravaActivitiesApi.fetchAllRunActivities$default(StravaActivitiesApi.INSTANCE, str3, 0, null, 6, null);
                fetchAllRideActivities$default = StravaActivitiesApi.fetchAllRideActivities$default(StravaActivitiesApi.INSTANCE, str3, 0, null, 6, null);
                long currentTimeMillis = System.currentTimeMillis();
                List<StravaPbEntity> computeRuns = StravaPbCalculator.INSTANCE.computeRuns(fetchAllRunActivities$default, currentTimeMillis);
                computeRides = StravaPbCalculator.INSTANCE.computeRides(fetchAllRideActivities$default, currentTimeMillis);
                plus = CollectionsKt.plus((Collection) computeRuns, (Iterable) computeRides);
                this.L$0 = coroutineScope2;
                this.L$1 = fetchAllRunActivities$default;
                this.L$2 = fetchAllRideActivities$default;
                this.L$3 = computeRuns;
                this.L$4 = computeRides;
                this.L$5 = plus;
                this.label = 2;
                if (this.$this_syncStravaPersonalBestsAttempt.getStravaPbDao().upsertAll(plus, this) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = computeRuns;
                list2 = plus;
                this.L$0 = coroutineScope2;
                this.L$1 = fetchAllRunActivities$default;
                this.L$2 = fetchAllRideActivities$default;
                this.L$3 = list;
                this.L$4 = computeRides;
                this.L$5 = list2;
                this.label = 3;
                m6836syncStravaActivitiesToHistory0E7RQCE$default = Repository.m6836syncStravaActivitiesToHistory0E7RQCE$default(this.$this_syncStravaPersonalBestsAttempt, true, 0, this, 2, null);
                if (m6836syncStravaActivitiesToHistory0E7RQCE$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list3 = fetchAllRunActivities$default;
                list4 = list;
                list5 = list2;
                List<StravaActivityJson> list8 = fetchAllRideActivities$default;
                list6 = computeRides;
                m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m6836syncStravaActivitiesToHistory0E7RQCE$default);
                if (m7908exceptionOrNullimpl != null) {
                    throw m7908exceptionOrNullimpl;
                }
                StravaHistorySyncResult stravaHistorySyncResult2 = (StravaHistorySyncResult) m6836syncStravaActivitiesToHistory0E7RQCE$default;
                Repository repository2 = this.$this_syncStravaPersonalBestsAttempt;
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    StravaPbFirestoreSync stravaPbFirestoreSync = StravaPbFirestoreSync.INSTANCE;
                    Context appContext = repository2.getAppContext();
                    Intrinsics.checkNotNullExpressionValue(appContext, "<get-appContext>(...)");
                    this.L$0 = list3;
                    this.L$1 = list8;
                    this.L$2 = list4;
                    this.L$3 = list6;
                    this.L$4 = list5;
                    this.L$5 = stravaHistorySyncResult2;
                    this.label = 4;
                    pushAll = stravaPbFirestoreSync.pushAll(appContext, this);
                } catch (Throwable th) {
                    th = th;
                    list7 = list8;
                    stravaHistorySyncResult = stravaHistorySyncResult2;
                    Result.Companion companion3 = Result.INSTANCE;
                    m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    Integer boxInt = Boxing.boxInt(0);
                    if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                    }
                    intValue = ((Number) m7905constructorimpl2).intValue();
                    repository = this.$this_syncStravaPersonalBestsAttempt;
                    StringBuilder sb = new StringBuilder();
                    sb.append(stravaHistorySyncResult.userMessage());
                    if (stravaHistorySyncResult.getTotalImported() == 0) {
                    }
                    if (!repository.stravaHasReadAllScope()) {
                    }
                    if (list5.isEmpty()) {
                    }
                    if (intValue > 0) {
                    }
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                    Result.Companion companion4 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(sb2);
                    return Result.m7904boximpl(m7905constructorimpl);
                }
                if (pushAll == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list7 = list8;
                stravaHistorySyncResult = stravaHistorySyncResult2;
                m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushAll).intValue()));
                Integer boxInt2 = Boxing.boxInt(0);
                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                    m7905constructorimpl2 = boxInt2;
                }
                intValue = ((Number) m7905constructorimpl2).intValue();
                repository = this.$this_syncStravaPersonalBestsAttempt;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(stravaHistorySyncResult.userMessage());
                if (stravaHistorySyncResult.getTotalImported() == 0) {
                    String summarySuffix = stravaHistorySyncResult.summarySuffix();
                    if (summarySuffix.length() > 0) {
                        sb3.append(" (" + summarySuffix + ")");
                    }
                }
                if (!repository.stravaHasReadAllScope()) {
                    sb3.append(" · reconnect Strava for private activities (activity:read_all)");
                }
                if (list5.isEmpty()) {
                    sb3.append(" · " + list4.size() + " run + " + list6.size() + " ride PBs (" + list3.size() + " runs, " + list7.size() + " rides)");
                } else if (list3.isEmpty() && list7.isEmpty()) {
                    sb3.append(" · no Strava runs/rides returned (reconnect if this persists)");
                } else {
                    sb3.append(" · " + list3.size() + " runs, " + list7.size() + " rides, no standard-distance PBs yet");
                }
                if (intValue > 0) {
                    sb3.append(" · " + intValue + " PBs backed up to cloud");
                }
                String sb22 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb22, "toString(...)");
                Result.Companion companion42 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(sb22);
                return Result.m7904boximpl(m7905constructorimpl);
            case 1:
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obtainStravaAccessToken$app_sideload$default = obj;
                coroutineScope2 = coroutineScope;
                String str32 = (String) obtainStravaAccessToken$app_sideload$default;
                fetchAllRunActivities$default = StravaActivitiesApi.fetchAllRunActivities$default(StravaActivitiesApi.INSTANCE, str32, 0, null, 6, null);
                fetchAllRideActivities$default = StravaActivitiesApi.fetchAllRideActivities$default(StravaActivitiesApi.INSTANCE, str32, 0, null, 6, null);
                long currentTimeMillis2 = System.currentTimeMillis();
                List<StravaPbEntity> computeRuns2 = StravaPbCalculator.INSTANCE.computeRuns(fetchAllRunActivities$default, currentTimeMillis2);
                computeRides = StravaPbCalculator.INSTANCE.computeRides(fetchAllRideActivities$default, currentTimeMillis2);
                plus = CollectionsKt.plus((Collection) computeRuns2, (Iterable) computeRides);
                this.L$0 = coroutineScope2;
                this.L$1 = fetchAllRunActivities$default;
                this.L$2 = fetchAllRideActivities$default;
                this.L$3 = computeRuns2;
                this.L$4 = computeRides;
                this.L$5 = plus;
                this.label = 2;
                if (this.$this_syncStravaPersonalBestsAttempt.getStravaPbDao().upsertAll(plus, this) != coroutine_suspended) {
                }
                break;
            case 2:
                list2 = (List) this.L$5;
                computeRides = (List) this.L$4;
                list = (List) this.L$3;
                fetchAllRideActivities$default = (List) this.L$2;
                fetchAllRunActivities$default = (List) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope2;
                this.L$1 = fetchAllRunActivities$default;
                this.L$2 = fetchAllRideActivities$default;
                this.L$3 = list;
                this.L$4 = computeRides;
                this.L$5 = list2;
                this.label = 3;
                m6836syncStravaActivitiesToHistory0E7RQCE$default = Repository.m6836syncStravaActivitiesToHistory0E7RQCE$default(this.$this_syncStravaPersonalBestsAttempt, true, 0, this, 2, null);
                if (m6836syncStravaActivitiesToHistory0E7RQCE$default == coroutine_suspended) {
                }
                list3 = fetchAllRunActivities$default;
                list4 = list;
                list5 = list2;
                List<StravaActivityJson> list82 = fetchAllRideActivities$default;
                list6 = computeRides;
                m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m6836syncStravaActivitiesToHistory0E7RQCE$default);
                if (m7908exceptionOrNullimpl != null) {
                }
                break;
            case 3:
                list2 = (List) this.L$5;
                computeRides = (List) this.L$4;
                list = (List) this.L$3;
                fetchAllRideActivities$default = (List) this.L$2;
                fetchAllRunActivities$default = (List) this.L$1;
                ResultKt.throwOnFailure(obj);
                m6836syncStravaActivitiesToHistory0E7RQCE$default = ((Result) obj).getValue();
                list3 = fetchAllRunActivities$default;
                list4 = list;
                list5 = list2;
                List<StravaActivityJson> list822 = fetchAllRideActivities$default;
                list6 = computeRides;
                m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m6836syncStravaActivitiesToHistory0E7RQCE$default);
                if (m7908exceptionOrNullimpl != null) {
                }
                break;
            case 4:
                stravaHistorySyncResult = (StravaHistorySyncResult) this.L$5;
                list5 = (List) this.L$4;
                list6 = (List) this.L$3;
                list4 = (List) this.L$2;
                list7 = (List) this.L$1;
                list3 = (List) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    pushAll = obj;
                    m7905constructorimpl2 = Result.m7905constructorimpl(Boxing.boxInt(((Number) pushAll).intValue()));
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion32 = Result.INSTANCE;
                    m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    Integer boxInt22 = Boxing.boxInt(0);
                    if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                    }
                    intValue = ((Number) m7905constructorimpl2).intValue();
                    repository = this.$this_syncStravaPersonalBestsAttempt;
                    StringBuilder sb32 = new StringBuilder();
                    sb32.append(stravaHistorySyncResult.userMessage());
                    if (stravaHistorySyncResult.getTotalImported() == 0) {
                    }
                    if (!repository.stravaHasReadAllScope()) {
                    }
                    if (list5.isEmpty()) {
                    }
                    if (intValue > 0) {
                    }
                    String sb222 = sb32.toString();
                    Intrinsics.checkNotNullExpressionValue(sb222, "toString(...)");
                    Result.Companion companion422 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(sb222);
                    return Result.m7904boximpl(m7905constructorimpl);
                }
                Integer boxInt222 = Boxing.boxInt(0);
                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                }
                intValue = ((Number) m7905constructorimpl2).intValue();
                repository = this.$this_syncStravaPersonalBestsAttempt;
                StringBuilder sb322 = new StringBuilder();
                sb322.append(stravaHistorySyncResult.userMessage());
                if (stravaHistorySyncResult.getTotalImported() == 0) {
                }
                if (!repository.stravaHasReadAllScope()) {
                }
                if (list5.isEmpty()) {
                }
                if (intValue > 0) {
                }
                String sb2222 = sb322.toString();
                Intrinsics.checkNotNullExpressionValue(sb2222, "toString(...)");
                Result.Companion companion4222 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(sb2222);
                return Result.m7904boximpl(m7905constructorimpl);
            case 5:
                ResultKt.throwOnFailure(obj);
                this.label = 6;
                syncStravaPersonalBestsAttempt = RepositoryCloudSyncKt.syncStravaPersonalBestsAttempt(this.$this_syncStravaPersonalBestsAttempt, false, this);
                if (syncStravaPersonalBestsAttempt == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Result.m7904boximpl(syncStravaPersonalBestsAttempt);
            case 6:
                ResultKt.throwOnFailure(obj);
                syncStravaPersonalBestsAttempt = ((Result) obj).getValue();
                return Result.m7904boximpl(syncStravaPersonalBestsAttempt);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
