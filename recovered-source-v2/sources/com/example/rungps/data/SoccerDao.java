package com.example.rungps.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SoccerDao.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000eJ \u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH§@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000eJ\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H§@¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/data/SoccerDao;", "", "sessionsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/SoccerSessionEntity;", "allSessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "session", "(Lcom/example/rungps/data/SoccerSessionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionById", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionByWatchId", "watchSessionId", "sessionNearStart", "startMs", "windowMs", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "sessionExists", "", "existingIds", "ids", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SoccerDao {
    Object allSessions(Continuation<? super List<SoccerSessionEntity>> continuation);

    Object delete(long j, Continuation<? super Unit> continuation);

    Object existingIds(List<Long> list, Continuation<? super List<Long>> continuation);

    Object insert(SoccerSessionEntity soccerSessionEntity, Continuation<? super Long> continuation);

    Object sessionById(long j, Continuation<? super SoccerSessionEntity> continuation);

    Object sessionByWatchId(long j, Continuation<? super SoccerSessionEntity> continuation);

    Object sessionExists(long j, Continuation<? super Boolean> continuation);

    Object sessionNearStart(long j, long j2, Continuation<? super SoccerSessionEntity> continuation);

    Flow<List<SoccerSessionEntity>> sessionsFlow();
}
