package com.example.rungps.data.repo;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.example.rungps.data.RecoveryDao;
import com.example.rungps.data.RecoveryEventEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RecoveryRepository.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0002\u0010\f\u001a\u00020\rJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/data/repo/RecoveryRepository;", "", "recoveryDao", "Lcom/example/rungps/data/RecoveryDao;", "appContext", "Landroid/content/Context;", "<init>", "(Lcom/example/rungps/data/RecoveryDao;Landroid/content/Context;)V", "recentFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/RecoveryEventEntity;", "limit", "", "since", "sinceMs", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", NotificationCompat.CATEGORY_EVENT, "(Lcom/example/rungps/data/RecoveryEventEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "", "id", "deleteForSource", "kind", "", "sourceId", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecoveryRepository {
    public static final int $stable = 8;
    private final Context appContext;
    private final RecoveryDao recoveryDao;

    public RecoveryRepository(RecoveryDao recoveryDao, Context appContext) {
        Intrinsics.checkNotNullParameter(recoveryDao, "recoveryDao");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.recoveryDao = recoveryDao;
        this.appContext = appContext;
    }

    public static /* synthetic */ Flow recentFlow$default(RecoveryRepository recoveryRepository, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 50;
        }
        return recoveryRepository.recentFlow(i);
    }

    public final Flow<List<RecoveryEventEntity>> recentFlow(int limit) {
        return this.recoveryDao.recentFlow(limit);
    }

    public final Object since(long j, Continuation<? super List<RecoveryEventEntity>> continuation) {
        return this.recoveryDao.since(j, continuation);
    }

    public final Object insert(RecoveryEventEntity recoveryEventEntity, Continuation<? super Long> continuation) {
        return this.recoveryDao.insert(recoveryEventEntity, continuation);
    }

    public final Object deleteById(long j, Continuation<? super Unit> continuation) {
        Object deleteById = this.recoveryDao.deleteById(j, continuation);
        return deleteById == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteById : Unit.INSTANCE;
    }

    public final Object deleteForSource(String str, long j, Continuation<? super Unit> continuation) {
        Object deleteForSource = this.recoveryDao.deleteForSource(str, j, continuation);
        return deleteForSource == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteForSource : Unit.INSTANCE;
    }
}
