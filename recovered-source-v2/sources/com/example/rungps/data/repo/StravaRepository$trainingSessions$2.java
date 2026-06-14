package com.example.rungps.data.repo;

import com.example.rungps.analytics.WeeklyActivityKm;
import com.example.rungps.strava.StravaActivitiesApi;
import com.example.rungps.strava.StravaActivityJson;
import com.example.rungps.strava.StravaActivityTypes;
import com.example.rungps.strava.StravaAuthErrors;
import java.util.ArrayList;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StravaRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/analytics/WeeklyActivityKm$StravaSession;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.StravaRepository$trainingSessions$2", f = "StravaRepository.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class StravaRepository$trainingSessions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WeeklyActivityKm.StravaSession>>, Object> {
    final /* synthetic */ int $daysBack;
    int label;
    final /* synthetic */ StravaRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StravaRepository$trainingSessions$2(StravaRepository stravaRepository, int i, Continuation<? super StravaRepository$trainingSessions$2> continuation) {
        super(2, continuation);
        this.this$0 = stravaRepository;
        this.$daysBack = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StravaRepository$trainingSessions$2(this.this$0, this.$daysBack, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WeeklyActivityKm.StravaSession>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<WeeklyActivityKm.StravaSession>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<WeeklyActivityKm.StravaSession>> continuation) {
        return ((StravaRepository$trainingSessions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obtainAccessToken$default;
        WeeklyActivityKm.StravaSession stravaSession;
        StravaActivityTypes.Kind classify;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.this$0.isConnected()) {
                    return CollectionsKt.emptyList();
                }
                this.label = 1;
                obtainAccessToken$default = StravaRepository.obtainAccessToken$default(this.this$0, false, this, 1, null);
                if (obtainAccessToken$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                obtainAccessToken$default = obj;
            }
            long currentTimeMillis = System.currentTimeMillis() - (this.$daysBack * 86400000);
            List<StravaActivityJson> fetchTrainingActivities$default = StravaActivitiesApi.fetchTrainingActivities$default(StravaActivitiesApi.INSTANCE, (String) obtainAccessToken$default, 0, null, 6, null);
            ArrayList arrayList = new ArrayList();
            for (StravaActivityJson stravaActivityJson : fetchTrainingActivities$default) {
                Long parseStartMs = StravaActivitiesApi.INSTANCE.parseStartMs(stravaActivityJson.getStartDate(), stravaActivityJson.getStartDateLocal());
                if (parseStartMs != null) {
                    long longValue = parseStartMs.longValue();
                    int effectiveMovingSec = StravaActivitiesApi.INSTANCE.effectiveMovingSec(stravaActivityJson);
                    if (effectiveMovingSec > 0 && stravaActivityJson.getDistance() > 0.0d) {
                        long j = longValue + (effectiveMovingSec * 1000);
                        if (j >= currentTimeMillis && (classify = StravaActivityTypes.INSTANCE.classify(stravaActivityJson.getType(), stravaActivityJson.getSportType())) != StravaActivityTypes.Kind.OTHER) {
                            stravaSession = new WeeklyActivityKm.StravaSession(stravaActivityJson.getId(), longValue, j, stravaActivityJson.getDistance(), classify == StravaActivityTypes.Kind.BIKE);
                            if (stravaSession == null) {
                                arrayList.add(stravaSession);
                            }
                        }
                    }
                }
                stravaSession = null;
                if (stravaSession == null) {
                }
            }
            return arrayList;
        } catch (Exception e) {
            StravaAuthErrors stravaAuthErrors = StravaAuthErrors.INSTANCE;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            if (stravaAuthErrors.isReconnectableAuthFailure(message)) {
                throw e;
            }
            return CollectionsKt.emptyList();
        }
    }
}
