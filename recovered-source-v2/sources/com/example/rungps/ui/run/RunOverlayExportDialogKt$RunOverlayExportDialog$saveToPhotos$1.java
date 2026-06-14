package com.example.rungps.ui.run;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.export.RunOverlayShare;
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

/* compiled from: RunOverlayExportDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$saveToPhotos$1", f = "RunOverlayExportDialog.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunOverlayExportDialogKt$RunOverlayExportDialog$saveToPhotos$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bitmap $bmp;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $saving$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunOverlayExportDialogKt$RunOverlayExportDialog$saveToPhotos$1(Context context, MutableState<Boolean> mutableState, Bitmap bitmap, Continuation<? super RunOverlayExportDialogKt$RunOverlayExportDialog$saveToPhotos$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$saving$delegate = mutableState;
        this.$bmp = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunOverlayExportDialogKt$RunOverlayExportDialog$saveToPhotos$1(this.$ctx, this.$saving$delegate, this.$bmp, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunOverlayExportDialogKt$RunOverlayExportDialog$saveToPhotos$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$14(this.$saving$delegate, true);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new RunOverlayExportDialogKt$RunOverlayExportDialog$saveToPhotos$1$result$1(this.$ctx, this.$bmp, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        RunOverlayShare.SaveResult saveResult = (RunOverlayShare.SaveResult) obj;
        RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$14(this.$saving$delegate, false);
        if (saveResult.getUri() != null) {
            Toast.makeText(this.$ctx, "Saved PNG to Pictures/ExerciseTracker", 1).show();
        } else {
            Context context = this.$ctx;
            String error = saveResult.getError();
            if (error == null) {
                error = "Save failed";
            }
            Toast.makeText(context, error, 1).show();
        }
        return Unit.INSTANCE;
    }
}
