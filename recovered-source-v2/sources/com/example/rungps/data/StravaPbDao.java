package com.example.rungps.data;

import androidx.health.connect.client.records.CervicalMucusRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: StravaPbDao.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\tH'J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/example/rungps/data/StravaPbDao;", "", "upsertAll", "", "rows", "", "Lcom/example/rungps/data/StravaPbEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pbsFlow", "Lkotlinx/coroutines/flow/Flow;", "allOnce", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StravaPbDao {
    Object allOnce(Continuation<? super List<StravaPbEntity>> continuation);

    Object clear(Continuation<? super Unit> continuation);

    Flow<List<StravaPbEntity>> pbsFlow();

    Object upsertAll(List<StravaPbEntity> list, Continuation<? super Unit> continuation);
}
