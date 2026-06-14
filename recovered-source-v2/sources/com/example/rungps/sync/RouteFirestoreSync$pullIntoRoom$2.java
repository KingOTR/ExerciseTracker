package com.example.rungps.sync;

import android.content.Context;
import androidx.autofill.HintConstants;
import com.example.rungps.data.Repository;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.RouteFirestoreSync$pullIntoRoom$2", f = "RouteFirestoreSync.kt", i = {0, 1, 1}, l = {19, 31}, m = "invokeSuspend", n = {"repo", "repo", "n"}, s = {"L$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class RouteFirestoreSync$pullIntoRoom$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RouteFirestoreSync$pullIntoRoom$2(Context context, Continuation<? super RouteFirestoreSync$pullIntoRoom$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RouteFirestoreSync$pullIntoRoom$2 routeFirestoreSync$pullIntoRoom$2 = new RouteFirestoreSync$pullIntoRoom$2(this.$context, continuation);
        routeFirestoreSync$pullIntoRoom$2.L$0 = obj;
        return routeFirestoreSync$pullIntoRoom$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((RouteFirestoreSync$pullIntoRoom$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x015d -> B:7:0x0160). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Iterator<DocumentSnapshot> it;
        int i;
        Repository repository;
        Pair pair;
        CollectionReference col;
        Object await;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Boxing.boxInt(0);
            }
            repository = Repository.INSTANCE.get(this.$context);
            Result.Companion companion2 = Result.INSTANCE;
            RouteFirestoreSync routeFirestoreSync = RouteFirestoreSync.INSTANCE;
            String uid = currentUser.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            col = routeFirestoreSync.col(uid);
            Task<QuerySnapshot> task = col.get();
            Intrinsics.checkNotNullExpressionValue(task, "get(...)");
            this.L$0 = repository;
            this.label = 1;
            await = TasksKt.await(task, this);
            if (await == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                it = (Iterator) this.L$1;
                repository = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                i++;
                while (it.hasNext()) {
                    DocumentSnapshot next = it.next();
                    String string = next.getString(HintConstants.AUTOFILL_HINT_NAME);
                    String obj2 = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    String str = obj2;
                    if (str.length() == 0) {
                        str = "Route";
                    }
                    String str2 = str;
                    Object obj3 = next.get("points");
                    List list = obj3 instanceof List ? (List) obj3 : null;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            Map map = obj4 instanceof Map ? (Map) obj4 : null;
                            if (map != null) {
                                Object obj5 = map.get("lat");
                                Number number = obj5 instanceof Number ? (Number) obj5 : null;
                                if (number != null) {
                                    double doubleValue = number.doubleValue();
                                    Object obj6 = map.get("lon");
                                    Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
                                    if (number2 != null) {
                                        pair = TuplesKt.to(Boxing.boxDouble(doubleValue), Boxing.boxDouble(number2.doubleValue()));
                                        if (pair == null) {
                                            arrayList.add(pair);
                                        }
                                    }
                                }
                            }
                            pair = null;
                            if (pair == null) {
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2.size() >= 2) {
                            String id = next.getId();
                            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                            this.L$0 = repository;
                            this.L$1 = it;
                            this.I$0 = i;
                            this.label = 2;
                            if (repository.importCloudRoute(id, str2, arrayList2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i++;
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                return Boxing.boxInt(i);
            }
            repository = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            await = obj;
        }
        m7905constructorimpl = Result.m7905constructorimpl((QuerySnapshot) await);
        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
            return Boxing.boxInt(0);
        }
        it = ((QuerySnapshot) m7905constructorimpl).getDocuments().iterator();
        i = 0;
        while (it.hasNext()) {
        }
        return Boxing.boxInt(i);
    }
}
