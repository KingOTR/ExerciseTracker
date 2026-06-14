package com.example.rungps.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.example.rungps.tracking.TrackingActiveStore;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RideRunWidgetRefreshReceiver.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.widget.RideRunWidgetRefreshReceiver$onReceive$1", f = "RideRunWidgetRefreshReceiver.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RideRunWidgetRefreshReceiver$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $app;
    final /* synthetic */ BroadcastReceiver.PendingResult $pending;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RideRunWidgetRefreshReceiver$onReceive$1(BroadcastReceiver.PendingResult pendingResult, Context context, Continuation<? super RideRunWidgetRefreshReceiver$onReceive$1> continuation) {
        super(2, continuation);
        this.$pending = pendingResult;
        this.$app = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RideRunWidgetRefreshReceiver$onReceive$1 rideRunWidgetRefreshReceiver$onReceive$1 = new RideRunWidgetRefreshReceiver$onReceive$1(this.$pending, this.$app, continuation);
        rideRunWidgetRefreshReceiver$onReceive$1.L$0 = obj;
        return rideRunWidgetRefreshReceiver$onReceive$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RideRunWidgetRefreshReceiver$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context context2 = this.$app;
            Result.Companion companion2 = Result.INSTANCE;
            TrackingActiveStore trackingActiveStore = TrackingActiveStore.INSTANCE;
            Intrinsics.checkNotNull(context2);
            if (trackingActiveStore.isActive(context2)) {
                RideRunWidgetUpdater rideRunWidgetUpdater = RideRunWidgetUpdater.INSTANCE;
                this.L$0 = context2;
                this.label = 1;
                if (rideRunWidgetUpdater.refresh(context2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                context = context2;
            } else {
                RideRunWidgetUpdater.INSTANCE.cancelRecordingRefresh(context2);
                Result.m7905constructorimpl(Unit.INSTANCE);
                this.$pending.finish();
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        RideRunWidgetUpdater rideRunWidgetUpdater2 = RideRunWidgetUpdater.INSTANCE;
        Intrinsics.checkNotNull(context);
        rideRunWidgetUpdater2.scheduleRecordingRefresh(context);
        Result.m7905constructorimpl(Unit.INSTANCE);
        this.$pending.finish();
        return Unit.INSTANCE;
    }
}
