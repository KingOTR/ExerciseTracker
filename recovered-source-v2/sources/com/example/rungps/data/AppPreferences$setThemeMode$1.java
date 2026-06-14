package com.example.rungps.data;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AppPreferences.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.AppPreferences", f = "AppPreferences.kt", i = {0, 0}, l = {ExerciseSessionRecord.EXERCISE_TYPE_WALKING}, m = "setThemeMode", n = {"context", "mode"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class AppPreferences$setThemeMode$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppPreferences this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppPreferences$setThemeMode$1(AppPreferences appPreferences, Continuation<? super AppPreferences$setThemeMode$1> continuation) {
        super(continuation);
        this.this$0 = appPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setThemeMode(null, null, this);
    }
}
