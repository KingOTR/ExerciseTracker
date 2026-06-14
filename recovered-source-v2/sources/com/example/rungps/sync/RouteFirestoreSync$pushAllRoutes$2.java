package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RouteEntity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RouteFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.RouteFirestoreSync$pushAllRoutes$2", f = "RouteFirestoreSync.kt", i = {0, 0, 1, 1}, l = {65, 66}, m = "invokeSuspend", n = {"$this$withContext", "n", "$this$withContext", "n"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class RouteFirestoreSync$pushAllRoutes$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RouteFirestoreSync$pushAllRoutes$2(Context context, Continuation<? super RouteFirestoreSync$pushAllRoutes$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RouteFirestoreSync$pushAllRoutes$2 routeFirestoreSync$pushAllRoutes$2 = new RouteFirestoreSync$pushAllRoutes$2(this.$context, continuation);
        routeFirestoreSync$pushAllRoutes$2.L$0 = obj;
        return routeFirestoreSync$pushAllRoutes$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((RouteFirestoreSync$pushAllRoutes$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0082 -> B:8:0x0085). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        int i;
        CoroutineScope coroutineScope2;
        Iterator it;
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope3;
            this.I$0 = 0;
            this.label = 1;
            Object allRoutesList = Repository.INSTANCE.get(this.$context).allRoutesList(this);
            if (allRoutesList == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope3;
            obj = allRoutesList;
            i = 0;
        } else if (i2 == 1) {
            i = this.I$0;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            it = (Iterator) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            m7905constructorimpl = Result.m7905constructorimpl((String) obj);
            if (Result.m7912isSuccessimpl(m7905constructorimpl)) {
                i++;
            }
            if (it.hasNext()) {
                RouteEntity routeEntity = (RouteEntity) it.next();
                Context context = this.$context;
                Result.Companion companion2 = Result.INSTANCE;
                RouteFirestoreSync routeFirestoreSync = RouteFirestoreSync.INSTANCE;
                long id = routeEntity.getId();
                this.L$0 = coroutineScope2;
                this.L$1 = it;
                this.I$0 = i;
                this.label = 2;
                obj = RouteFirestoreSync.pushRoute$default(routeFirestoreSync, context, id, null, this, 4, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl = Result.m7905constructorimpl((String) obj);
                if (Result.m7912isSuccessimpl(m7905constructorimpl)) {
                }
                if (it.hasNext()) {
                    return Boxing.boxInt(i);
                }
            }
        }
        coroutineScope2 = coroutineScope;
        it = ((List) obj).iterator();
        if (it.hasNext()) {
        }
    }
}
