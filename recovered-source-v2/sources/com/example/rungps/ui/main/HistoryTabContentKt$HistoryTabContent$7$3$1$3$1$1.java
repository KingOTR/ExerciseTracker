package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import com.example.rungps.data.Repository;
import com.example.rungps.spotify.SpotifyArtist;
import com.example.rungps.spotify.SpotifyItem;
import com.example.rungps.spotify.SpotifyNowPlaying;
import com.example.rungps.spotify.SpotifyShow;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HistoryTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$3$1$3$1$1", f = "HistoryTabContent.kt", i = {}, l = {429, 430}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$7$3$1$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Repository $repo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryTabContentKt$HistoryTabContent$7$3$1$3$1$1(Repository repository, Context context, Continuation<? super HistoryTabContentKt$HistoryTabContent$7$3$1$3$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HistoryTabContentKt$HistoryTabContent$7$3$1$3$1$1 historyTabContentKt$HistoryTabContent$7$3$1$3$1$1 = new HistoryTabContentKt$HistoryTabContent$7$3$1$3$1$1(this.$repo, this.$ctx, continuation);
        historyTabContentKt$HistoryTabContent$7$3$1$3$1$1.L$0 = obj;
        return historyTabContentKt$HistoryTabContent$7$3$1$3$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryTabContentKt$HistoryTabContent$7$3$1$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Repository repository = this.$repo;
            Result.Companion companion2 = Result.INSTANCE;
            this.label = 1;
            obj = repository.spotifyNowPlaying(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        m7905constructorimpl = Result.m7905constructorimpl((SpotifyNowPlaying) obj);
        this.label = 2;
        if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(m7905constructorimpl, this.$ctx, null), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HistoryTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$3$1$3$1$1$1", f = "HistoryTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$3$1$3$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ Object $r;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Object obj, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$r = obj;
            this.$ctx = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$r, this.$ctx, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpotifyShow show;
            String name;
            List<SpotifyArtist> artists;
            SpotifyArtist spotifyArtist;
            String name2;
            String name3;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.$r;
            Context context = this.$ctx;
            if (Result.m7912isSuccessimpl(obj2)) {
                SpotifyNowPlaying spotifyNowPlaying = (SpotifyNowPlaying) obj2;
                String str = null;
                SpotifyItem item = spotifyNowPlaying != null ? spotifyNowPlaying.getItem() : null;
                String obj3 = (item == null || (name3 = item.getName()) == null) ? null : StringsKt.trim((CharSequence) name3).toString();
                String str2 = "";
                if (obj3 == null) {
                    obj3 = "";
                }
                String str3 = obj3;
                if (StringsKt.isBlank(str3)) {
                    str3 = "Nothing playing";
                }
                String str4 = str3;
                String obj4 = (item == null || (artists = item.getArtists()) == null || (spotifyArtist = (SpotifyArtist) CollectionsKt.firstOrNull((List) artists)) == null || (name2 = spotifyArtist.getName()) == null) ? null : StringsKt.trim((CharSequence) name2).toString();
                if (obj4 == null) {
                    obj4 = "";
                }
                if (item != null && (show = item.getShow()) != null && (name = show.getName()) != null) {
                    str = StringsKt.trim((CharSequence) name).toString();
                }
                if (str == null) {
                    str = "";
                }
                if (!StringsKt.isBlank(obj4)) {
                    str2 = " — " + obj4;
                } else if (!StringsKt.isBlank(str)) {
                    str2 = " — " + str;
                }
                Toast.makeText(context, "Now playing: " + str4 + str2, 1).show();
            }
            Context context2 = this.$ctx;
            Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(obj2);
            if (m7908exceptionOrNullimpl != null) {
                String message = m7908exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "Spotify error";
                }
                Toast.makeText(context2, message, 1).show();
            }
            return Unit.INSTANCE;
        }
    }
}
