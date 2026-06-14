package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: TrainingPlanDao.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H'J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/example/rungps/data/TrainingPlanDao;", "", "progressFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/rungps/data/TrainingPlanProgressEntity;", "progressOnce", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsert", "", "entity", "(Lcom/example/rungps/data/TrainingPlanProgressEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAll", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TrainingPlanDao {
    Object clearAll(Continuation<? super Unit> continuation);

    Flow<TrainingPlanProgressEntity> progressFlow();

    Object progressOnce(Continuation<? super TrainingPlanProgressEntity> continuation);

    Object upsert(TrainingPlanProgressEntity trainingPlanProgressEntity, Continuation<? super Unit> continuation);
}
