package com.example.rungps.data;

import com.example.rungps.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AppPreferences.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.AppPreferences", f = "AppPreferences.kt", i = {0, 0}, l = {BuildConfig.VERSION_CODE}, m = "setGymActiveSplitId", n = {"context", "id"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class AppPreferences$setGymActiveSplitId$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppPreferences this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppPreferences$setGymActiveSplitId$1(AppPreferences appPreferences, Continuation<? super AppPreferences$setGymActiveSplitId$1> continuation) {
        super(continuation);
        this.this$0 = appPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setGymActiveSplitId(null, 0L, this);
    }
}
