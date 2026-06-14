package com.example.rungps.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SpotifyTimelineDao.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000b\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\fJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00102\u0006\u0010\u000e\u001a\u00020\u0003H'J\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/data/SpotifyTimelineDao;", "", "insert", "", "e", "Lcom/example/rungps/data/SpotifyTimelineEntity;", "(Lcom/example/rungps/data/SpotifyTimelineEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "", "forRun", "", "runId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forGymSession", "sessionId", "forGymSessionFlow", "Lkotlinx/coroutines/flow/Flow;", "deleteForRun", "deleteForGymSession", "countForGymSession", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SpotifyTimelineDao {
    Object countForGymSession(long j, Continuation<? super Integer> continuation);

    Object deleteForGymSession(long j, Continuation<? super Unit> continuation);

    Object deleteForRun(long j, Continuation<? super Unit> continuation);

    Object forGymSession(long j, Continuation<? super List<SpotifyTimelineEntity>> continuation);

    Flow<List<SpotifyTimelineEntity>> forGymSessionFlow(long sessionId);

    Object forRun(long j, Continuation<? super List<SpotifyTimelineEntity>> continuation);

    Object insert(SpotifyTimelineEntity spotifyTimelineEntity, Continuation<? super Long> continuation);

    Object update(SpotifyTimelineEntity spotifyTimelineEntity, Continuation<? super Unit> continuation);
}
