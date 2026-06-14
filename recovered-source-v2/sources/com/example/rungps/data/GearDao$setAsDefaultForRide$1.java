package com.example.rungps.data;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.GearDao;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GearDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.GearDao$DefaultImpls", f = "GearDao.kt", i = {0, 0}, l = {ExerciseSessionRecord.EXERCISE_TYPE_WEIGHTLIFTING, ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR}, m = "setAsDefaultForRide", n = {"$this", "id"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class GearDao$setAsDefaultForRide$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    GearDao$setAsDefaultForRide$1(Continuation<? super GearDao$setAsDefaultForRide$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GearDao.DefaultImpls.setAsDefaultForRide(null, 0L, this);
    }
}
