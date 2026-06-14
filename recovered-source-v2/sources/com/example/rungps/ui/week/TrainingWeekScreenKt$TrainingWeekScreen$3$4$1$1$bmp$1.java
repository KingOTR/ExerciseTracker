package com.example.rungps.ui.week;

import android.content.Context;
import android.graphics.Bitmap;
import com.example.rungps.analytics.TrainingWeekPlanner;
import com.example.rungps.export.WeekShareCardRenderer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TrainingWeekScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.week.TrainingWeekScreenKt$TrainingWeekScreen$3$4$1$1$bmp$1", f = "TrainingWeekScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrainingWeekScreenKt$TrainingWeekScreen$3$4$1$1$bmp$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ TrainingWeekPlanner.TrainingWeekView $w;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrainingWeekScreenKt$TrainingWeekScreen$3$4$1$1$bmp$1(Context context, TrainingWeekPlanner.TrainingWeekView trainingWeekView, Continuation<? super TrainingWeekScreenKt$TrainingWeekScreen$3$4$1$1$bmp$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$w = trainingWeekView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrainingWeekScreenKt$TrainingWeekScreen$3$4$1$1$bmp$1(this.$ctx, this.$w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((TrainingWeekScreenKt$TrainingWeekScreen$3$4$1$1$bmp$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return WeekShareCardRenderer.INSTANCE.render(this.$ctx, this.$w, null);
    }
}
