package com.example.rungps.data;

import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RecoveryDao.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH'J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0010\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0016J&\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014H§@¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/data/RecoveryDao;", "", "insert", "", NotificationCompat.CATEGORY_EVENT, "Lcom/example/rungps/data/RecoveryEventEntity;", "(Lcom/example/rungps/data/RecoveryEventEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recentFlow", "Lkotlinx/coroutines/flow/Flow;", "", "limit", "", "active", "nowMs", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "since", "sinceMs", "existsForSource", "", "kind", "", "sourceId", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "existsActiveForSource", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteForSource", "", "deleteForKind", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "id", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RecoveryDao {
    Object active(long j, Continuation<? super List<RecoveryEventEntity>> continuation);

    Object deleteById(long j, Continuation<? super Unit> continuation);

    Object deleteForKind(String str, Continuation<? super Unit> continuation);

    Object deleteForSource(String str, long j, Continuation<? super Unit> continuation);

    Object existsActiveForSource(String str, long j, long j2, Continuation<? super Boolean> continuation);

    Object existsForSource(String str, long j, Continuation<? super Boolean> continuation);

    Object insert(RecoveryEventEntity recoveryEventEntity, Continuation<? super Long> continuation);

    Flow<List<RecoveryEventEntity>> recentFlow(int limit);

    Object since(long j, Continuation<? super List<RecoveryEventEntity>> continuation);

    /* compiled from: RecoveryDao.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Flow recentFlow$default(RecoveryDao recoveryDao, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recentFlow");
            }
            if ((i2 & 1) != 0) {
                i = 50;
            }
            return recoveryDao.recentFlow(i);
        }
    }
}
