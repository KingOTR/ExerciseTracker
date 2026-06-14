package com.example.rungps.ui.gym;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SpotifyTimelineEntity;
import com.example.rungps.gym.GymSessionMediaRecorder;
import com.example.rungps.media.SessionMediaReader;
import com.example.rungps.media.SessionMediaSnapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$20$1", f = "GymTabContent.kt", i = {0, 0, 1, 1, 2, 2}, l = {871, 872, 876}, m = "invokeSuspend", n = {"$this$LaunchedEffect", "sid", "$this$LaunchedEffect", "sid", "$this$LaunchedEffect", "sid"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$20$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<SessionMediaSnapshot> $liveMedia$delegate;
    final /* synthetic */ GymSessionMediaRecorder $mediaRecorder;
    final /* synthetic */ MutableState<List<SpotifyTimelineEntity>> $mediaTimeline$delegate;
    final /* synthetic */ Long $openSessionId;
    final /* synthetic */ Repository $repo;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$20$1$20$1(Long l, GymSessionMediaRecorder gymSessionMediaRecorder, Context context, Repository repository, MutableState<SessionMediaSnapshot> mutableState, MutableState<List<SpotifyTimelineEntity>> mutableState2, Continuation<? super GymTabContentKt$GymTabContent$20$1$20$1> continuation) {
        super(2, continuation);
        this.$openSessionId = l;
        this.$mediaRecorder = gymSessionMediaRecorder;
        this.$ctx = context;
        this.$repo = repository;
        this.$liveMedia$delegate = mutableState;
        this.$mediaTimeline$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymTabContentKt$GymTabContent$20$1$20$1 gymTabContentKt$GymTabContent$20$1$20$1 = new GymTabContentKt$GymTabContent$20$1$20$1(this.$openSessionId, this.$mediaRecorder, this.$ctx, this.$repo, this.$liveMedia$delegate, this.$mediaTimeline$delegate, continuation);
        gymTabContentKt$GymTabContent$20$1$20$1.L$0 = obj;
        return gymTabContentKt$GymTabContent$20$1$20$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$20$1$20$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ee -> B:7:0x00ef). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        CoroutineScope coroutineScope;
        MutableState<SessionMediaSnapshot> mutableState;
        Object m7905constructorimpl;
        CoroutineScope coroutineScope2;
        char c;
        long j;
        Object obj2;
        Long l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            Long l2 = this.$openSessionId;
            if (l2 == null) {
                return Unit.INSTANCE;
            }
            longValue = l2.longValue();
            this.$mediaRecorder.reset();
            coroutineScope = coroutineScope3;
            l = this.$openSessionId;
            if (l != null) {
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            longValue = this.J$0;
            mutableState = (MutableState) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj2);
            j = longValue;
            CoroutineScope coroutineScope4 = coroutineScope;
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            }
            mutableState.setValue((SessionMediaSnapshot) m7905constructorimpl);
            this.L$0 = coroutineScope4;
            this.L$1 = null;
            this.J$0 = j;
            this.label = 2;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this.$mediaRecorder, j, this.$ctx, this.$repo, this.$mediaTimeline$delegate, null), this) == coroutine_suspended) {
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                longValue = this.J$0;
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope5;
                c = 3;
                i2 = 1;
                l = this.$openSessionId;
                if (l != null && l.longValue() == longValue) {
                    mutableState = this.$liveMedia$delegate;
                    Context context = this.$ctx;
                    Repository repository = this.$repo;
                    Result.Companion companion2 = Result.INSTANCE;
                    SessionMediaReader sessionMediaReader = SessionMediaReader.INSTANCE;
                    this.L$0 = coroutineScope;
                    this.L$1 = mutableState;
                    this.J$0 = longValue;
                    this.label = i2;
                    obj2 = sessionMediaReader.read(context, repository, this);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj2);
                    j = longValue;
                    CoroutineScope coroutineScope42 = coroutineScope;
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        m7905constructorimpl = null;
                    }
                    mutableState.setValue((SessionMediaSnapshot) m7905constructorimpl);
                    this.L$0 = coroutineScope42;
                    this.L$1 = null;
                    this.J$0 = j;
                    this.label = 2;
                    if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this.$mediaRecorder, j, this.$ctx, this.$repo, this.$mediaTimeline$delegate, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope2 = coroutineScope42;
                    longValue = j;
                    this.L$0 = coroutineScope2;
                    this.J$0 = longValue;
                    c = 3;
                    this.label = 3;
                    if (DelayKt.delay(5000L, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope2;
                    i2 = 1;
                    l = this.$openSessionId;
                    if (l != null) {
                        mutableState = this.$liveMedia$delegate;
                        Context context2 = this.$ctx;
                        Repository repository2 = this.$repo;
                        Result.Companion companion22 = Result.INSTANCE;
                        SessionMediaReader sessionMediaReader2 = SessionMediaReader.INSTANCE;
                        this.L$0 = coroutineScope;
                        this.L$1 = mutableState;
                        this.J$0 = longValue;
                        this.label = i2;
                        obj2 = sessionMediaReader2.read(context2, repository2, this);
                        if (obj2 == coroutine_suspended) {
                        }
                        m7905constructorimpl = Result.m7905constructorimpl((SessionMediaSnapshot) obj2);
                        j = longValue;
                        CoroutineScope coroutineScope422 = coroutineScope;
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        mutableState.setValue((SessionMediaSnapshot) m7905constructorimpl);
                        this.L$0 = coroutineScope422;
                        this.L$1 = null;
                        this.J$0 = j;
                        this.label = 2;
                        if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(this.$mediaRecorder, j, this.$ctx, this.$repo, this.$mediaTimeline$delegate, null), this) == coroutine_suspended) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            longValue = this.J$0;
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = coroutineScope2;
            this.J$0 = longValue;
            c = 3;
            this.label = 3;
            if (DelayKt.delay(5000L, this) != coroutine_suspended) {
            }
        }
    }

    /* compiled from: GymTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$20$1$2", f = "GymTabContent.kt", i = {}, l = {873, 874}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$20$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ GymSessionMediaRecorder $mediaRecorder;
        final /* synthetic */ MutableState<List<SpotifyTimelineEntity>> $mediaTimeline$delegate;
        final /* synthetic */ Repository $repo;
        final /* synthetic */ long $sid;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(GymSessionMediaRecorder gymSessionMediaRecorder, long j, Context context, Repository repository, MutableState<List<SpotifyTimelineEntity>> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$mediaRecorder = gymSessionMediaRecorder;
            this.$sid = j;
            this.$ctx = context;
            this.$repo = repository;
            this.$mediaTimeline$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$mediaRecorder, this.$sid, this.$ctx, this.$repo, this.$mediaTimeline$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableState<List<SpotifyTimelineEntity>> mutableState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$mediaRecorder.pollAndSave(this.$sid, this.$ctx, this.$repo, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableState = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableState.setValue((List) obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableState<List<SpotifyTimelineEntity>> mutableState2 = this.$mediaTimeline$delegate;
            this.L$0 = mutableState2;
            this.label = 2;
            Object gymMediaTimelineForDisplay = this.$repo.gymMediaTimelineForDisplay(this.$sid, this);
            if (gymMediaTimelineForDisplay == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = gymMediaTimelineForDisplay;
            mutableState = mutableState2;
            mutableState.setValue((List) obj);
            return Unit.INSTANCE;
        }
    }
}
