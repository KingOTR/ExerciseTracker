package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 0, 0}, l = {1673, 1675, 1678}, m = "persistSetupNoteToRoom", n = {"this", "nameLower", "displayName", "note"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class Repository$persistSetupNoteToRoom$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$persistSetupNoteToRoom$1(Repository repository, Continuation<? super Repository$persistSetupNoteToRoom$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object persistSetupNoteToRoom;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        persistSetupNoteToRoom = this.this$0.persistSetupNoteToRoom(null, null, null, this);
        return persistSetupNoteToRoom;
    }
}
