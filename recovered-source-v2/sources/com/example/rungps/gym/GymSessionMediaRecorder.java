package com.example.rungps.gym;

import android.content.Context;
import com.example.rungps.data.Repository;
import com.example.rungps.media.SessionMediaReader;
import com.example.rungps.media.SessionMediaSnapshot;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymSessionMediaRecorder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/gym/GymSessionMediaRecorder;", "", "<init>", "()V", "lastKey", "", "lastSavedAtMs", "", "reset", "", "pollAndSave", "", "sessionId", "context", "Landroid/content/Context;", "repo", "Lcom/example/rungps/data/Repository;", "(JLandroid/content/Context;Lcom/example/rungps/data/Repository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSessionMediaRecorder {
    public static final int $stable = 8;
    private String lastKey;
    private long lastSavedAtMs;

    public final void reset() {
        this.lastKey = null;
        this.lastSavedAtMs = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollAndSave(long j, Context context, Repository repository, Continuation<? super Boolean> continuation) {
        GymSessionMediaRecorder$pollAndSave$1 gymSessionMediaRecorder$pollAndSave$1;
        int i;
        long j2;
        Repository repository2;
        SessionMediaSnapshot sessionMediaSnapshot;
        boolean z;
        GymSessionMediaRecorder gymSessionMediaRecorder = this;
        if (continuation instanceof GymSessionMediaRecorder$pollAndSave$1) {
            gymSessionMediaRecorder$pollAndSave$1 = (GymSessionMediaRecorder$pollAndSave$1) continuation;
            if ((gymSessionMediaRecorder$pollAndSave$1.label & Integer.MIN_VALUE) != 0) {
                gymSessionMediaRecorder$pollAndSave$1.label -= Integer.MIN_VALUE;
                Object obj = gymSessionMediaRecorder$pollAndSave$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gymSessionMediaRecorder$pollAndSave$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SessionMediaReader sessionMediaReader = SessionMediaReader.INSTANCE;
                    gymSessionMediaRecorder$pollAndSave$1.L$0 = gymSessionMediaRecorder;
                    gymSessionMediaRecorder$pollAndSave$1.L$1 = repository;
                    j2 = j;
                    gymSessionMediaRecorder$pollAndSave$1.J$0 = j2;
                    gymSessionMediaRecorder$pollAndSave$1.label = 1;
                    obj = sessionMediaReader.read(context, repository, gymSessionMediaRecorder$pollAndSave$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    repository2 = repository;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        z = true;
                        return Boxing.boxBoolean(z);
                    }
                    long j3 = gymSessionMediaRecorder$pollAndSave$1.J$0;
                    repository2 = (Repository) gymSessionMediaRecorder$pollAndSave$1.L$1;
                    GymSessionMediaRecorder gymSessionMediaRecorder2 = (GymSessionMediaRecorder) gymSessionMediaRecorder$pollAndSave$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    gymSessionMediaRecorder = gymSessionMediaRecorder2;
                    j2 = j3;
                }
                sessionMediaSnapshot = (SessionMediaSnapshot) obj;
                if (sessionMediaSnapshot != null) {
                    return Boxing.boxBoolean(false);
                }
                long currentTimeMillis = System.currentTimeMillis();
                String timelineKey = sessionMediaSnapshot.timelineKey();
                boolean areEqual = Intrinsics.areEqual(timelineKey, gymSessionMediaRecorder.lastKey);
                boolean z2 = currentTimeMillis - gymSessionMediaRecorder.lastSavedAtMs > 45000;
                if (areEqual && !z2 && !sessionMediaSnapshot.isPlaying() && !sessionMediaSnapshot.isPodcast()) {
                    return Boxing.boxBoolean(false);
                }
                gymSessionMediaRecorder.lastKey = timelineKey;
                gymSessionMediaRecorder.lastSavedAtMs = currentTimeMillis;
                String artUrl = sessionMediaSnapshot.getArtUrl();
                boolean isPlaying = sessionMediaSnapshot.isPlaying();
                String itemType = sessionMediaSnapshot.getItemType();
                String itemId = sessionMediaSnapshot.getItemId();
                String title = sessionMediaSnapshot.getTitle();
                String subtitle = sessionMediaSnapshot.getSubtitle();
                Long progressMs = sessionMediaSnapshot.getProgressMs();
                gymSessionMediaRecorder$pollAndSave$1.L$0 = null;
                gymSessionMediaRecorder$pollAndSave$1.L$1 = null;
                gymSessionMediaRecorder$pollAndSave$1.label = 2;
                z = true;
                if (repository2.addSpotifyTimelineForGymSession(j2, currentTimeMillis, isPlaying, itemType, itemId, title, subtitle, progressMs, artUrl, gymSessionMediaRecorder$pollAndSave$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Boxing.boxBoolean(z);
            }
        }
        gymSessionMediaRecorder$pollAndSave$1 = new GymSessionMediaRecorder$pollAndSave$1(gymSessionMediaRecorder, continuation);
        Object obj2 = gymSessionMediaRecorder$pollAndSave$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gymSessionMediaRecorder$pollAndSave$1.label;
        if (i != 0) {
        }
        sessionMediaSnapshot = (SessionMediaSnapshot) obj2;
        if (sessionMediaSnapshot != null) {
        }
    }
}
