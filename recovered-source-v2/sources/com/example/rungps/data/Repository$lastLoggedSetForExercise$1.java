package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 1}, l = {478, 479}, m = "lastLoggedSetForExercise", n = {"this", DatabaseFileArchive.COLUMN_KEY, DatabaseFileArchive.COLUMN_KEY}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class Repository$lastLoggedSetForExercise$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$lastLoggedSetForExercise$1(Repository repository, Continuation<? super Repository$lastLoggedSetForExercise$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.lastLoggedSetForExercise(null, this);
    }
}
