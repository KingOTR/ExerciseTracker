package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0}, l = {1998}, m = "canonicalExerciseNameForSession", n = {"trimmed", DatabaseFileArchive.COLUMN_KEY}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class Repository$canonicalExerciseNameForSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$canonicalExerciseNameForSession$1(Repository repository, Continuation<? super Repository$canonicalExerciseNameForSession$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object canonicalExerciseNameForSession;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        canonicalExerciseNameForSession = this.this$0.canonicalExerciseNameForSession(0L, null, this);
        return canonicalExerciseNameForSession;
    }
}
