package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.sleep.SleepOvernightStore;
import com.example.rungps.sleep.SleepTrackingLiveStats;
import kotlin.Metadata;
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

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$16$1", f = "SleepTabScreenBody.kt", i = {}, l = {460, 463}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$16$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Long> $nowMs$delegate;
    final /* synthetic */ MutableState<SleepTrackingLiveStats.Live> $sleepLive$delegate;
    final /* synthetic */ MutableState<Boolean> $trackingActive$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$16$1(Context context, MutableState<Boolean> mutableState, MutableState<Long> mutableState2, MutableState<SleepTrackingLiveStats.Live> mutableState3, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$16$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$trackingActive$delegate = mutableState;
        this.$nowMs$delegate = mutableState2;
        this.$sleepLive$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$16$1(this.$ctx, this.$trackingActive$delegate, this.$nowMs$delegate, this.$sleepLive$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$16$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x007d -> B:6:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean SleepTabScreenBody$lambda$49;
        MutableState<SleepTrackingLiveStats.Live> mutableState;
        boolean SleepTabScreenBody$lambda$492;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SleepTabScreenBody$lambda$49 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$49(this.$trackingActive$delegate);
            if (!SleepTabScreenBody$lambda$49) {
                return Unit.INSTANCE;
            }
        } else if (i == 1) {
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutableState.setValue((SleepTrackingLiveStats.Live) obj);
            this.L$0 = null;
            this.label = 2;
            if (DelayKt.delay(15000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        SleepTabScreenBody$lambda$492 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$49(this.$trackingActive$delegate);
        if (!SleepTabScreenBody$lambda$492 && SleepOvernightStore.INSTANCE.isActive(this.$ctx)) {
            SleepTabScreenBodyKt.SleepTabScreenBody$lambda$157(this.$nowMs$delegate, System.currentTimeMillis());
            mutableState = this.$sleepLive$delegate;
            this.L$0 = mutableState;
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableState.setValue((SleepTrackingLiveStats.Live) obj);
            this.L$0 = null;
            this.label = 2;
            if (DelayKt.delay(15000L, this) == coroutine_suspended) {
            }
            SleepTabScreenBody$lambda$492 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$49(this.$trackingActive$delegate);
            if (!SleepTabScreenBody$lambda$492) {
            }
            if (!SleepOvernightStore.INSTANCE.isActive(this.$ctx)) {
            }
            return Unit.INSTANCE;
        }
        if (!SleepOvernightStore.INSTANCE.isActive(this.$ctx)) {
            SleepTabScreenBodyKt.SleepTabScreenBody$lambda$50(this.$trackingActive$delegate, false);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/sleep/SleepTrackingLiveStats$Live;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$16$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$16$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SleepTrackingLiveStats.Live>, Object> {
        final /* synthetic */ Context $ctx;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SleepTrackingLiveStats.Live> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SleepTrackingLiveStats.INSTANCE.fromContextWithCoverage(this.$ctx);
        }
    }
}
