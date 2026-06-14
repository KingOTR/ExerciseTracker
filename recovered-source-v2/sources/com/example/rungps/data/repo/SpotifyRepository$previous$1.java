package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SpotifyRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.SpotifyRepository", f = "SpotifyRepository.kt", i = {}, l = {65}, m = "previous", n = {}, s = {})
/* loaded from: classes3.dex */
final class SpotifyRepository$previous$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SpotifyRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpotifyRepository$previous$1(SpotifyRepository spotifyRepository, Continuation<? super SpotifyRepository$previous$1> continuation) {
        super(continuation);
        this.this$0 = spotifyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.previous(this);
    }
}
