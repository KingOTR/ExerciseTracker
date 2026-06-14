package com.example.rungps.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ArchivedTrainingWeekDao.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH§@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH§@¢\u0006\u0002\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/data/ArchivedTrainingWeekDao;", "", "allFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/ArchivedTrainingWeekEntity;", "recent", "limit", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exists", "weekStartEpochDay", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "entity", "(Lcom/example/rungps/data/ArchivedTrainingWeekEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOlderThan", "", "beforeEpochDay", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ArchivedTrainingWeekDao {
    Flow<List<ArchivedTrainingWeekEntity>> allFlow();

    Object deleteOlderThan(long j, Continuation<? super Unit> continuation);

    Object exists(long j, Continuation<? super Integer> continuation);

    Object insert(ArchivedTrainingWeekEntity archivedTrainingWeekEntity, Continuation<? super Long> continuation);

    Object recent(int i, Continuation<? super List<ArchivedTrainingWeekEntity>> continuation);

    /* compiled from: ArchivedTrainingWeekDao.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object recent$default(ArchivedTrainingWeekDao archivedTrainingWeekDao, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recent");
            }
            if ((i2 & 1) != 0) {
                i = 52;
            }
            return archivedTrainingWeekDao.recent(i, continuation);
        }
    }
}
