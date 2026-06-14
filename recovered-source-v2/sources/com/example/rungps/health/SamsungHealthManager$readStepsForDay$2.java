package com.example.rungps.health;

import java.time.LocalDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SamsungHealthManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.health.SamsungHealthManager$readStepsForDay$2", f = "SamsungHealthManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SamsungHealthManager$readStepsForDay$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ LocalDateTime $endLdt;
    final /* synthetic */ LocalDateTime $startLdt;
    final /* synthetic */ Object $store;
    int label;
    final /* synthetic */ SamsungHealthManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SamsungHealthManager$readStepsForDay$2(SamsungHealthManager samsungHealthManager, LocalDateTime localDateTime, LocalDateTime localDateTime2, Object obj, Continuation<? super SamsungHealthManager$readStepsForDay$2> continuation) {
        super(2, continuation);
        this.this$0 = samsungHealthManager;
        this.$startLdt = localDateTime;
        this.$endLdt = localDateTime2;
        this.$store = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SamsungHealthManager$readStepsForDay$2(this.this$0, this.$startLdt, this.$endLdt, this.$store, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((SamsungHealthManager$readStepsForDay$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        r2 = r8.this$0.requestBuilder(r2);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object stepsTypeTotal;
        Object requestBuilder;
        Object futureGet;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                str = this.this$0.base;
                Class<?> cls = Class.forName(str + ".request.filter.LocalTimeFilter");
                Object invoke = cls.getMethod("of", LocalDateTime.class, LocalDateTime.class).invoke(null, this.$startLdt, this.$endLdt);
                str2 = this.this$0.base;
                Class<?> cls2 = Class.forName(str2 + ".data.DataType$StepsType");
                SamsungHealthManager samsungHealthManager = this.this$0;
                Intrinsics.checkNotNull(cls2);
                stepsTypeTotal = samsungHealthManager.stepsTypeTotal(cls2);
                if (stepsTypeTotal == null || requestBuilder == null) {
                    return null;
                }
                Object invoke2 = requestBuilder.getClass().getMethod("setLocalTimeFilter", cls).invoke(requestBuilder, invoke);
                Object invoke3 = invoke2.getClass().getMethod("build", new Class[0]).invoke(invoke2, new Object[0]);
                Object invoke4 = this.$store.getClass().getMethod("aggregateDataAsync", invoke3.getClass()).invoke(this.$store, invoke3);
                SamsungHealthManager samsungHealthManager2 = this.this$0;
                Intrinsics.checkNotNull(invoke4);
                futureGet = samsungHealthManager2.futureGet(invoke4);
                if (futureGet == null) {
                    return null;
                }
                Object invoke5 = futureGet.getClass().getMethod("getDataList", new Class[0]).invoke(futureGet, new Object[0]);
                List list = invoke5 instanceof List ? (List) invoke5 : null;
                if (list == null) {
                    return null;
                }
                long j = 0;
                for (Object obj2 : list) {
                    if (obj2 != null) {
                        Object invoke6 = obj2.getClass().getMethod("getValue", new Class[0]).invoke(obj2, new Object[0]);
                        Long l = invoke6 instanceof Long ? (Long) invoke6 : null;
                        if (l != null) {
                            j = l.longValue();
                        }
                    }
                }
                return Boxing.boxLong(j);
            } catch (Throwable unused) {
                return null;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
