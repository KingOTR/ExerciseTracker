package com.example.rungps.ui.components;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.Repository;
import com.example.rungps.media.DeviceNowPlaying;
import com.example.rungps.media.DeviceNowPlayingReader;
import com.example.rungps.media.SessionMediaReader;
import com.example.rungps.media.SessionMediaSnapshot;
import com.example.rungps.spotify.SpotifyAlbum;
import com.example.rungps.spotify.SpotifyImage;
import com.example.rungps.spotify.SpotifyItem;
import com.example.rungps.spotify.SpotifyNowPlaying;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SpotifyMiniPlayerCard.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.components.SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1", f = "SpotifyMiniPlayerCard.kt", i = {0, 0, 1, 2, 3}, l = {ExerciseSessionRecord.EXERCISE_TYPE_STRENGTH_TRAINING, 77, 92, 98}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "deviceNp", "$this$LaunchedEffect", "$this$LaunchedEffect", "$this$LaunchedEffect"}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $artUrl$delegate;
    final /* synthetic */ MutableState<Boolean> $connected$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<DeviceNowPlaying> $deviceNowPlaying$delegate;
    final /* synthetic */ MutableState<Boolean> $isPlaying$delegate;
    final /* synthetic */ MutableState<String> $lastTitle$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<String> $subtitle$delegate;
    final /* synthetic */ MutableState<String> $title$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1(Repository repository, Context context, MutableState<Boolean> mutableState, MutableState<DeviceNowPlaying> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<Boolean> mutableState5, MutableState<String> mutableState6, MutableState<String> mutableState7, Continuation<? super SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
        this.$ctx = context;
        this.$connected$delegate = mutableState;
        this.$deviceNowPlaying$delegate = mutableState2;
        this.$title$delegate = mutableState3;
        this.$subtitle$delegate = mutableState4;
        this.$isPlaying$delegate = mutableState5;
        this.$artUrl$delegate = mutableState6;
        this.$lastTitle$delegate = mutableState7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1 spotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1 = new SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1(this.$repo, this.$ctx, this.$connected$delegate, this.$deviceNowPlaying$delegate, this.$title$delegate, this.$subtitle$delegate, this.$isPlaying$delegate, this.$artUrl$delegate, this.$lastTitle$delegate, continuation);
        spotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1.L$0 = obj;
        return spotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01b0 -> B:38:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00c2 -> B:39:0x004b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        DeviceNowPlaying deviceNowPlaying;
        Object m7905constructorimpl;
        Object m7905constructorimpl2;
        SessionMediaSnapshot sessionMediaSnapshot;
        SpotifyNowPlaying spotifyNowPlaying;
        String str;
        SpotifyItem item;
        SpotifyAlbum album;
        List<SpotifyImage> images;
        Sequence asSequence;
        Sequence mapNotNull;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$3(this.$connected$delegate, this.$repo.isSpotifyConnected());
            if (!DeviceNowPlayingReader.INSTANCE.hasNotificationListenerAccess(this.$ctx)) {
            }
            Context context = this.$ctx;
            Repository repository = this.$repo;
            Result.Companion companion = Result.INSTANCE;
            SessionMediaReader sessionMediaReader = SessionMediaReader.INSTANCE;
            this.L$0 = coroutineScope;
            this.L$1 = deviceNowPlaying;
            this.label = 1;
            obj = sessionMediaReader.read(context, repository, this);
            if (obj == coroutine_suspended) {
            }
            m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj);
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            }
            sessionMediaSnapshot = (SessionMediaSnapshot) m7905constructorimpl;
            if (sessionMediaSnapshot == null) {
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    coroutineScope2 = (CoroutineScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                        }
                        spotifyNowPlaying = (SpotifyNowPlaying) m7905constructorimpl2;
                        MutableState<String> mutableState = this.$artUrl$delegate;
                        if (spotifyNowPlaying != null) {
                        }
                        str = null;
                        mutableState.setValue(str);
                        this.L$0 = coroutineScope2;
                        this.L$1 = null;
                        this.label = 4;
                        if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                        }
                        coroutineScope = coroutineScope2;
                        SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$3(this.$connected$delegate, this.$repo.isSpotifyConnected());
                        if (!DeviceNowPlayingReader.INSTANCE.hasNotificationListenerAccess(this.$ctx)) {
                        }
                        Context context2 = this.$ctx;
                        Repository repository2 = this.$repo;
                        Result.Companion companion3 = Result.INSTANCE;
                        SessionMediaReader sessionMediaReader2 = SessionMediaReader.INSTANCE;
                        this.L$0 = coroutineScope;
                        this.L$1 = deviceNowPlaying;
                        this.label = 1;
                        obj = sessionMediaReader2.read(context2, repository2, this);
                        if (obj == coroutine_suspended) {
                        }
                        m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj);
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        sessionMediaSnapshot = (SessionMediaSnapshot) m7905constructorimpl;
                        if (sessionMediaSnapshot == null) {
                        }
                    }
                    m7905constructorimpl2 = Result.m7905constructorimpl((SpotifyNowPlaying) obj);
                    if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                        m7905constructorimpl2 = null;
                    }
                    spotifyNowPlaying = (SpotifyNowPlaying) m7905constructorimpl2;
                    MutableState<String> mutableState2 = this.$artUrl$delegate;
                    if (spotifyNowPlaying != null || (item = spotifyNowPlaying.getItem()) == null || (album = item.getAlbum()) == null || (images = album.getImages()) == null || (asSequence = CollectionsKt.asSequence(images)) == null || (mapNotNull = SequencesKt.mapNotNull(asSequence, new Function1() { // from class: com.example.rungps.ui.components.SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            String invokeSuspend$lambda$2;
                            invokeSuspend$lambda$2 = SpotifyMiniPlayerCardKt$SpotifyMiniPlayerCard$1$1.invokeSuspend$lambda$2((SpotifyImage) obj3);
                            return invokeSuspend$lambda$2;
                        }
                    })) == null) {
                        str = null;
                    } else {
                        Iterator it = mapNotNull.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (!StringsKt.isBlank((String) obj2)) {
                                break;
                            }
                        }
                        str = (String) obj2;
                    }
                    mutableState2.setValue(str);
                    this.L$0 = coroutineScope2;
                    this.L$1 = null;
                    this.label = 4;
                    if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope2;
                    SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$3(this.$connected$delegate, this.$repo.isSpotifyConnected());
                    deviceNowPlaying = !DeviceNowPlayingReader.INSTANCE.hasNotificationListenerAccess(this.$ctx) ? DeviceNowPlayingReader.INSTANCE.read(this.$ctx) : null;
                    Context context22 = this.$ctx;
                    Repository repository22 = this.$repo;
                    Result.Companion companion32 = Result.INSTANCE;
                    SessionMediaReader sessionMediaReader22 = SessionMediaReader.INSTANCE;
                    this.L$0 = coroutineScope;
                    this.L$1 = deviceNowPlaying;
                    this.label = 1;
                    obj = sessionMediaReader22.read(context22, repository22, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj);
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        m7905constructorimpl = null;
                    }
                    sessionMediaSnapshot = (SessionMediaSnapshot) m7905constructorimpl;
                    if (sessionMediaSnapshot == null) {
                        if (Intrinsics.areEqual(sessionMediaSnapshot.getSource(), "device")) {
                            this.$deviceNowPlaying$delegate.setValue(deviceNowPlaying);
                            this.$title$delegate.setValue(sessionMediaSnapshot.getTitle());
                            this.$subtitle$delegate.setValue(sessionMediaSnapshot.getSubtitle());
                            this.$isPlaying$delegate.setValue(Boxing.boxBoolean(sessionMediaSnapshot.isPlaying()));
                            this.$artUrl$delegate.setValue(null);
                            coroutineScope2 = coroutineScope;
                            this.L$0 = coroutineScope2;
                            this.L$1 = null;
                            this.label = 4;
                            if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                            }
                            coroutineScope = coroutineScope2;
                            SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$3(this.$connected$delegate, this.$repo.isSpotifyConnected());
                            if (!DeviceNowPlayingReader.INSTANCE.hasNotificationListenerAccess(this.$ctx)) {
                            }
                            Context context222 = this.$ctx;
                            Repository repository222 = this.$repo;
                            Result.Companion companion322 = Result.INSTANCE;
                            SessionMediaReader sessionMediaReader222 = SessionMediaReader.INSTANCE;
                            this.L$0 = coroutineScope;
                            this.L$1 = deviceNowPlaying;
                            this.label = 1;
                            obj = sessionMediaReader222.read(context222, repository222, this);
                            if (obj == coroutine_suspended) {
                            }
                            m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj);
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            }
                            sessionMediaSnapshot = (SessionMediaSnapshot) m7905constructorimpl;
                            if (sessionMediaSnapshot == null) {
                                this.$deviceNowPlaying$delegate.setValue(deviceNowPlaying);
                                this.$title$delegate.setValue(null);
                                this.$subtitle$delegate.setValue(null);
                                this.$isPlaying$delegate.setValue(null);
                                this.$artUrl$delegate.setValue(null);
                                this.L$0 = coroutineScope;
                                this.L$1 = null;
                                this.label = 2;
                                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$3(this.$connected$delegate, this.$repo.isSpotifyConnected());
                                if (!DeviceNowPlayingReader.INSTANCE.hasNotificationListenerAccess(this.$ctx)) {
                                }
                                Context context2222 = this.$ctx;
                                Repository repository2222 = this.$repo;
                                Result.Companion companion3222 = Result.INSTANCE;
                                SessionMediaReader sessionMediaReader2222 = SessionMediaReader.INSTANCE;
                                this.L$0 = coroutineScope;
                                this.L$1 = deviceNowPlaying;
                                this.label = 1;
                                obj = sessionMediaReader2222.read(context2222, repository2222, this);
                                if (obj == coroutine_suspended) {
                                }
                                m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj);
                                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                }
                                sessionMediaSnapshot = (SessionMediaSnapshot) m7905constructorimpl;
                                if (sessionMediaSnapshot == null) {
                                }
                            }
                        } else {
                            this.$deviceNowPlaying$delegate.setValue(null);
                            this.$lastTitle$delegate.setValue(sessionMediaSnapshot.getTitle());
                            this.$title$delegate.setValue(sessionMediaSnapshot.getTitle());
                            this.$subtitle$delegate.setValue(sessionMediaSnapshot.getSubtitle());
                            this.$isPlaying$delegate.setValue(Boxing.boxBoolean(sessionMediaSnapshot.isPlaying()));
                            Repository repository3 = this.$repo;
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                coroutineScope2 = coroutineScope;
                                Result.Companion companion22 = Result.INSTANCE;
                                m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th));
                                if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                                }
                                spotifyNowPlaying = (SpotifyNowPlaying) m7905constructorimpl2;
                                MutableState<String> mutableState22 = this.$artUrl$delegate;
                                if (spotifyNowPlaying != null) {
                                }
                                str = null;
                                mutableState22.setValue(str);
                                this.L$0 = coroutineScope2;
                                this.L$1 = null;
                                this.label = 4;
                                if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                                }
                                coroutineScope = coroutineScope2;
                                SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$3(this.$connected$delegate, this.$repo.isSpotifyConnected());
                                if (!DeviceNowPlayingReader.INSTANCE.hasNotificationListenerAccess(this.$ctx)) {
                                }
                                Context context22222 = this.$ctx;
                                Repository repository22222 = this.$repo;
                                Result.Companion companion32222 = Result.INSTANCE;
                                SessionMediaReader sessionMediaReader22222 = SessionMediaReader.INSTANCE;
                                this.L$0 = coroutineScope;
                                this.L$1 = deviceNowPlaying;
                                this.label = 1;
                                obj = sessionMediaReader22222.read(context22222, repository22222, this);
                                if (obj == coroutine_suspended) {
                                }
                                m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj);
                                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                                }
                                sessionMediaSnapshot = (SessionMediaSnapshot) m7905constructorimpl;
                                if (sessionMediaSnapshot == null) {
                                }
                            }
                            Result.Companion companion4 = Result.INSTANCE;
                            this.L$0 = coroutineScope;
                            this.L$1 = null;
                            this.label = 3;
                            obj = repository3.spotifyNowPlaying(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            coroutineScope2 = coroutineScope;
                            m7905constructorimpl2 = Result.m7905constructorimpl((SpotifyNowPlaying) obj);
                            if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                            }
                            spotifyNowPlaying = (SpotifyNowPlaying) m7905constructorimpl2;
                            MutableState<String> mutableState222 = this.$artUrl$delegate;
                            if (spotifyNowPlaying != null) {
                            }
                            str = null;
                            mutableState222.setValue(str);
                            this.L$0 = coroutineScope2;
                            this.L$1 = null;
                            this.label = 4;
                            if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                            }
                            coroutineScope = coroutineScope2;
                            SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$3(this.$connected$delegate, this.$repo.isSpotifyConnected());
                            if (!DeviceNowPlayingReader.INSTANCE.hasNotificationListenerAccess(this.$ctx)) {
                            }
                            Context context222222 = this.$ctx;
                            Repository repository222222 = this.$repo;
                            Result.Companion companion322222 = Result.INSTANCE;
                            SessionMediaReader sessionMediaReader222222 = SessionMediaReader.INSTANCE;
                            this.L$0 = coroutineScope;
                            this.L$1 = deviceNowPlaying;
                            this.label = 1;
                            obj = sessionMediaReader222222.read(context222222, repository222222, this);
                            if (obj == coroutine_suspended) {
                            }
                            m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj);
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            }
                            sessionMediaSnapshot = (SessionMediaSnapshot) m7905constructorimpl;
                            if (sessionMediaSnapshot == null) {
                            }
                        }
                    }
                } else if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
            SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard$lambda$3(this.$connected$delegate, this.$repo.isSpotifyConnected());
            if (!DeviceNowPlayingReader.INSTANCE.hasNotificationListenerAccess(this.$ctx)) {
            }
            Context context2222222 = this.$ctx;
            Repository repository2222222 = this.$repo;
            Result.Companion companion3222222 = Result.INSTANCE;
            SessionMediaReader sessionMediaReader2222222 = SessionMediaReader.INSTANCE;
            this.L$0 = coroutineScope;
            this.L$1 = deviceNowPlaying;
            this.label = 1;
            obj = sessionMediaReader2222222.read(context2222222, repository2222222, this);
            if (obj == coroutine_suspended) {
            }
            m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj);
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            }
            sessionMediaSnapshot = (SessionMediaSnapshot) m7905constructorimpl;
            if (sessionMediaSnapshot == null) {
            }
        } else {
            deviceNowPlaying = (DeviceNowPlaying) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                Result.Companion companion5 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th3));
            }
            m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj);
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            }
            sessionMediaSnapshot = (SessionMediaSnapshot) m7905constructorimpl;
            if (sessionMediaSnapshot == null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$2(SpotifyImage spotifyImage) {
        String url = spotifyImage.getUrl();
        if (url != null) {
            return StringsKt.trim((CharSequence) url).toString();
        }
        return null;
    }
}
