package com.example.rungps.data;

import androidx.compose.material3.MenuKt;
import androidx.health.platform.client.SdkConfig;
import com.example.rungps.data.RunDao;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RunDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RunDao$DefaultImpls", f = "RunDao.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 5, 5, 5, 6, 6, 6}, l = {110, 111, SdkConfig.SDK_VERSION, 113, 115, 119, MenuKt.InTransitionDuration, 124}, m = "trimRun", n = {"$this", "runId", "startTimeMs", "endTimeMs", "$this", "runId", "startTimeMs", "endTimeMs", "$this", "runId", "$this", "runId", "$this", "pts", "runId", "$this", "pts", "runId"}, s = {"L$0", "J$0", "J$1", "J$2", "L$0", "J$0", "J$1", "J$2", "L$0", "J$0", "L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class RunDao$trimRun$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    RunDao$trimRun$1(Continuation<? super RunDao$trimRun$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RunDao.DefaultImpls.trimRun(null, 0L, 0L, 0L, this);
    }
}
