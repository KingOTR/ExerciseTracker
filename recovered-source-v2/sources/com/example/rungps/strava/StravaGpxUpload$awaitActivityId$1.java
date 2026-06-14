package com.example.rungps.strava;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.sleep.SleepAlarmScheduler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StravaGpxUpload.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.strava.StravaGpxUpload", f = "StravaGpxUpload.kt", i = {0, 0, 0, 0, 0}, l = {ExerciseSessionRecord.EXERCISE_TYPE_SURFING}, m = "awaitActivityId", n = {"this", "accessToken", "uploadId", "pollMs", SleepAlarmScheduler.EXTRA_DEADLINE}, s = {"L$0", "L$1", "J$0", "J$1", "J$2"})
/* loaded from: classes3.dex */
final class StravaGpxUpload$awaitActivityId$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StravaGpxUpload this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StravaGpxUpload$awaitActivityId$1(StravaGpxUpload stravaGpxUpload, Continuation<? super StravaGpxUpload$awaitActivityId$1> continuation) {
        super(continuation);
        this.this$0 = stravaGpxUpload;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitActivityId(null, 0L, 0L, 0L, this);
    }
}
