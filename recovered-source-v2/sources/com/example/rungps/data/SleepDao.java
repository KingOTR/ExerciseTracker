package com.example.rungps.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SleepDao.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H'J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u000bJ\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000fJ$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH§@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/data/SleepDao;", "", "recentFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/SleepEntryEntity;", "limit", "", "insert", "", "entry", "(Lcom/example/rungps/data/SleepEntryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsert", "byStartTime", "startMs", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "id", "update", "since", "sinceMs", "overlappingSessions", "endMs", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SleepDao {
    Object byStartTime(long j, Continuation<? super SleepEntryEntity> continuation);

    Object delete(long j, Continuation<? super Unit> continuation);

    Object insert(SleepEntryEntity sleepEntryEntity, Continuation<? super Long> continuation);

    Object overlappingSessions(long j, long j2, Continuation<? super List<SleepEntryEntity>> continuation);

    Flow<List<SleepEntryEntity>> recentFlow(int limit);

    Object since(long j, Continuation<? super List<SleepEntryEntity>> continuation);

    Object update(SleepEntryEntity sleepEntryEntity, Continuation<? super Unit> continuation);

    Object upsert(SleepEntryEntity sleepEntryEntity, Continuation<? super Long> continuation);

    /* compiled from: SleepDao.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Flow recentFlow$default(SleepDao sleepDao, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recentFlow");
            }
            if ((i2 & 1) != 0) {
                i = 30;
            }
            return sleepDao.recentFlow(i);
        }
    }
}
