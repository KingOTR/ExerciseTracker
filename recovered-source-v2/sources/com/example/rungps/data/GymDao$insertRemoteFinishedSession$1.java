package com.example.rungps.data;

import com.example.rungps.data.GymDao;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GymDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.GymDao$DefaultImpls", f = "GymDao.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2}, l = {375, 376, 389}, m = "insertRemoteFinishedSession", n = {"$this", "remoteId", "templateDayId", "notes", "sets", "ambientTag", "ambientTagCustom", "startedAtMs", "endedAtMs", "freeDay", "$this", "sets", "$this", "sid"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "J$1", "Z$0", "L$0", "L$1", "L$0", "J$0"})
/* loaded from: classes3.dex */
final class GymDao$insertRemoteFinishedSession$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    GymDao$insertRemoteFinishedSession$1(Continuation<? super GymDao$insertRemoteFinishedSession$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GymDao.DefaultImpls.insertRemoteFinishedSession(null, null, 0L, 0L, null, false, null, null, null, null, this);
    }
}
