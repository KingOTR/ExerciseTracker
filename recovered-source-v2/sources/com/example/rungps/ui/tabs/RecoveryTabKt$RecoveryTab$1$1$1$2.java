package com.example.rungps.ui.tabs;

import android.content.Context;
import android.widget.Toast;
import com.example.rungps.recovery.StravaRecoverySyncResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$1$1$1$2", f = "RecoveryTab.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$1$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ StravaRecoverySyncResult $sync;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryTabKt$RecoveryTab$1$1$1$2(StravaRecoverySyncResult stravaRecoverySyncResult, Context context, Continuation<? super RecoveryTabKt$RecoveryTab$1$1$1$2> continuation) {
        super(2, continuation);
        this.$sync = stravaRecoverySyncResult;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoveryTabKt$RecoveryTab$1$1$1$2(this.$sync, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoveryTabKt$RecoveryTab$1$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$sync.getInserted() > 0) {
            if (this.$sync.getInserted() == 1) {
                str = "Added 1 new Strava activity to recovery";
            } else {
                str = "Added " + this.$sync.getInserted() + " new Strava activities to recovery";
            }
        } else {
            str = "Strava sync: 0 new (" + this.$sync.summarySuffix() + ")";
        }
        Toast.makeText(this.$ctx, str, 1).show();
        return Unit.INSTANCE;
    }
}
