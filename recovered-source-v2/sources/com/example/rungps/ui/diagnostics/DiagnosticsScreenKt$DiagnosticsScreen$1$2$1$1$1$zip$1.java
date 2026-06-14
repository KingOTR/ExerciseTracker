package com.example.rungps.ui.diagnostics;

import android.content.Context;
import com.example.rungps.export.DiagnosticsExporter;
import com.example.rungps.sleep.SleepScience;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiagnosticsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.diagnostics.DiagnosticsScreenKt$DiagnosticsScreen$1$2$1$1$1$zip$1", f = "DiagnosticsScreen.kt", i = {}, l = {SleepScience.CYCLE_TYPICAL_MIN}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DiagnosticsScreenKt$DiagnosticsScreen$1$2$1$1$1$zip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ Context $ctx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiagnosticsScreenKt$DiagnosticsScreen$1$2$1$1$1$zip$1(Context context, Continuation<? super DiagnosticsScreenKt$DiagnosticsScreen$1$2$1$1$1$zip$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiagnosticsScreenKt$DiagnosticsScreen$1$2$1$1$1$zip$1(this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((DiagnosticsScreenKt$DiagnosticsScreen$1$2$1$1$1$zip$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            File file = new File(this.$ctx.getCacheDir(), "diagnostics-" + System.currentTimeMillis() + ".zip");
            this.label = 1;
            obj = DiagnosticsExporter.INSTANCE.writeZip(this.$ctx, file, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
