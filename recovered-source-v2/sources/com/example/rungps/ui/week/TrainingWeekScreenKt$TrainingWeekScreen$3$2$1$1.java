package com.example.rungps.ui.week;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.analytics.TrainingWeekPlanner;
import com.example.rungps.export.RunOverlayShare;
import com.example.rungps.training.DailyTrainingCoach;
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
import kotlinx.coroutines.Dispatchers;

/* compiled from: TrainingWeekScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.week.TrainingWeekScreenKt$TrainingWeekScreen$3$2$1$1", f = "TrainingWeekScreen.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrainingWeekScreenKt$TrainingWeekScreen$3$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<DailyTrainingCoach.DailyCoachBrief> $coachBrief$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $sharing$delegate;
    final /* synthetic */ TrainingWeekPlanner.TrainingWeekView $w;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrainingWeekScreenKt$TrainingWeekScreen$3$2$1$1(Context context, TrainingWeekPlanner.TrainingWeekView trainingWeekView, MutableState<DailyTrainingCoach.DailyCoachBrief> mutableState, MutableState<Boolean> mutableState2, Continuation<? super TrainingWeekScreenKt$TrainingWeekScreen$3$2$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$w = trainingWeekView;
        this.$coachBrief$delegate = mutableState;
        this.$sharing$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrainingWeekScreenKt$TrainingWeekScreen$3$2$1$1(this.$ctx, this.$w, this.$coachBrief$delegate, this.$sharing$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrainingWeekScreenKt$TrainingWeekScreen$3$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getDefault(), new TrainingWeekScreenKt$TrainingWeekScreen$3$2$1$1$bmp$1(this.$ctx, this.$w, this.$coachBrief$delegate, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        TrainingWeekScreenKt.TrainingWeekScreen$lambda$26(this.$sharing$delegate, false);
        if (bitmap != null) {
            RunOverlayShare.SaveResult saveToGallery = RunOverlayShare.INSTANCE.saveToGallery(this.$ctx, bitmap);
            if (saveToGallery.getUri() != null) {
                Toast.makeText(this.$ctx, "Saved to Photos", 0).show();
            } else {
                Context context = this.$ctx;
                String error = saveToGallery.getError();
                if (error == null) {
                    error = "Save failed";
                }
                Toast.makeText(context, error, 1).show();
            }
        } else {
            Toast.makeText(this.$ctx, "Could not build week card", 0).show();
        }
        return Unit.INSTANCE;
    }
}
