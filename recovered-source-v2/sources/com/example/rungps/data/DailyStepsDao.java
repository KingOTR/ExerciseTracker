package com.example.rungps.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: DailyStepsDao.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b2\u0006\u0010\t\u001a\u00020\u0003H'J\u0018\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/data/DailyStepsDao;", "", "upsert", "", "entity", "Lcom/example/rungps/data/DailyStepsEntity;", "(Lcom/example/rungps/data/DailyStepsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dayFlow", "Lkotlinx/coroutines/flow/Flow;", "epochDay", "day", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "since", "", "sinceEpoch", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DailyStepsDao {
    Object day(long j, Continuation<? super DailyStepsEntity> continuation);

    Flow<DailyStepsEntity> dayFlow(long epochDay);

    Object since(long j, Continuation<? super List<DailyStepsEntity>> continuation);

    Object upsert(DailyStepsEntity dailyStepsEntity, Continuation<? super Long> continuation);
}
