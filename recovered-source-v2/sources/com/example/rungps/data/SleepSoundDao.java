package com.example.rungps.data;

import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: SleepSoundDao.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/data/SleepSoundDao;", "", "insert", "", NotificationCompat.CATEGORY_EVENT, "Lcom/example/rungps/data/SleepSoundEventEntity;", "(Lcom/example/rungps/data/SleepSoundEventEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forNight", "", "nightStartMs", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "", "id", "deleteForNight", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SleepSoundDao {
    Object deleteById(long j, Continuation<? super Unit> continuation);

    Object deleteForNight(long j, Continuation<? super Unit> continuation);

    Object forNight(long j, Continuation<? super List<SleepSoundEventEntity>> continuation);

    Object insert(SleepSoundEventEntity sleepSoundEventEntity, Continuation<? super Long> continuation);
}
