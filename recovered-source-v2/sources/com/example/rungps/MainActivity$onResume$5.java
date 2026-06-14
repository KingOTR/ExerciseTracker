package com.example.rungps;

import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.nfc.OpenGymSessionCache;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.MainActivity$onResume$5", f = "MainActivity.kt", i = {}, l = {591}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MainActivity$onResume$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$onResume$5(MainActivity mainActivity, Continuation<? super MainActivity$onResume$5> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainActivity$onResume$5 mainActivity$onResume$5 = new MainActivity$onResume$5(this.this$0, continuation);
        mainActivity$onResume$5.L$0 = obj;
        return mainActivity$onResume$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$onResume$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainActivity mainActivity = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                Flow<List<GymSessionEntity>> gymSessionsFlow = Repository.INSTANCE.get(mainActivity).gymSessionsFlow();
                FlowCollector<? super List<GymSessionEntity>> flowCollector = new FlowCollector() { // from class: com.example.rungps.MainActivity$onResume$5$1$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<GymSessionEntity>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(List<GymSessionEntity> list, Continuation<? super Unit> continuation) {
                        OpenGymSessionCache openGymSessionCache = OpenGymSessionCache.INSTANCE;
                        List<GymSessionEntity> list2 = list;
                        boolean z = false;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (((GymSessionEntity) it.next()).getEndedAtMs() == null) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        openGymSessionCache.set(z);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (gymSessionsFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
