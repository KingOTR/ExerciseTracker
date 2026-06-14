package com.example.rungps.sync;

import android.content.Context;
import androidx.autofill.HintConstants;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.data.RoutePointEntity;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.SetOptions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: RouteFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.RouteFirestoreSync$pushRoute$2", f = "RouteFirestoreSync.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3}, l = {41, 42, 55, 57}, m = "invokeSuspend", n = {"user", "repo", "user", "repo", "route", "repo", "route", "rid", "rid"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes3.dex */
final class RouteFirestoreSync$pushRoute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ long $localRouteId;
    final /* synthetic */ String $remoteId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RouteFirestoreSync$pushRoute$2(Context context, long j, String str, Continuation<? super RouteFirestoreSync$pushRoute$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$localRouteId = j;
        this.$remoteId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RouteFirestoreSync$pushRoute$2(this.$context, this.$localRouteId, this.$remoteId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((RouteFirestoreSync$pushRoute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object routeById;
        FirebaseUser firebaseUser;
        Repository repository;
        Object routePoints;
        Repository repository2;
        RouteEntity routeEntity;
        FirebaseUser firebaseUser2;
        List list;
        CollectionReference col;
        RouteEntity routeEntity2;
        Repository repository3;
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return null;
            }
            Repository repository4 = Repository.INSTANCE.get(this.$context);
            this.L$0 = currentUser;
            this.L$1 = repository4;
            this.label = 1;
            routeById = repository4.routeById(this.$localRouteId, this);
            if (routeById == coroutine_suspended) {
                return coroutine_suspended;
            }
            firebaseUser = currentUser;
            repository = repository4;
        } else if (i == 1) {
            repository = (Repository) this.L$1;
            firebaseUser = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
            routeById = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return str2;
                }
                str = (String) this.L$2;
                routeEntity2 = (RouteEntity) this.L$1;
                repository3 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (!Intrinsics.areEqual(routeEntity2.getRemoteId(), str)) {
                    return str;
                }
                this.L$0 = str;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                if (repository3.setRouteRemoteId(this.$localRouteId, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                return str2;
            }
            routeEntity = (RouteEntity) this.L$2;
            repository2 = (Repository) this.L$1;
            firebaseUser2 = (FirebaseUser) this.L$0;
            ResultKt.throwOnFailure(obj);
            routePoints = obj;
            list = (List) routePoints;
            if (list.size() >= 2) {
                return null;
            }
            String str3 = this.$remoteId;
            if (str3 != null) {
                if (StringsKt.isBlank(str3)) {
                    str3 = null;
                }
            }
            str3 = "route_" + this.$localRouteId;
            List<RoutePointEntity> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (RoutePointEntity routePointEntity : list2) {
                arrayList.add(MapsKt.mapOf(TuplesKt.to("lat", Boxing.boxDouble(routePointEntity.getLat())), TuplesKt.to("lon", Boxing.boxDouble(routePointEntity.getLon()))));
            }
            RouteFirestoreSync routeFirestoreSync = RouteFirestoreSync.INSTANCE;
            String uid = firebaseUser2.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            col = routeFirestoreSync.col(uid);
            Task<Void> task = col.document(str3).set(MapsKt.mapOf(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, routeEntity.getName()), TuplesKt.to("points", arrayList), TuplesKt.to("distanceM", Boxing.boxDouble(routeEntity.getDistanceM())), TuplesKt.to("updatedAtMs", Boxing.boxLong(System.currentTimeMillis())), TuplesKt.to("dedupeKey", routeEntity.getDedupeKey())), SetOptions.merge());
            Intrinsics.checkNotNullExpressionValue(task, "set(...)");
            this.L$0 = repository2;
            this.L$1 = routeEntity;
            this.L$2 = str3;
            this.label = 3;
            if (TasksKt.await(task, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            routeEntity2 = routeEntity;
            repository3 = repository2;
            str = str3;
            if (!Intrinsics.areEqual(routeEntity2.getRemoteId(), str)) {
            }
        }
        RouteEntity routeEntity3 = (RouteEntity) routeById;
        if (routeEntity3 == null) {
            return null;
        }
        this.L$0 = firebaseUser;
        this.L$1 = repository;
        this.L$2 = routeEntity3;
        this.label = 2;
        routePoints = repository.routePoints(this.$localRouteId, this);
        if (routePoints == coroutine_suspended) {
            return coroutine_suspended;
        }
        FirebaseUser firebaseUser3 = firebaseUser;
        repository2 = repository;
        routeEntity = routeEntity3;
        firebaseUser2 = firebaseUser3;
        list = (List) routePoints;
        if (list.size() >= 2) {
        }
    }
}
