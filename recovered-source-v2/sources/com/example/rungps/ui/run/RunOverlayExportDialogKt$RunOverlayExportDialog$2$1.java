package com.example.rungps.ui.run;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.export.RunRouteOverlayRenderer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlinx.coroutines.Dispatchers;

/* compiled from: RunOverlayExportDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$2$1", f = "RunOverlayExportDialog.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunOverlayExportDialogKt$RunOverlayExportDialog$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<List<Pair<Double, Double>>> $latLon$delegate;
    final /* synthetic */ MutableState<Uri> $pickedUri$delegate;
    final /* synthetic */ MutableState<Bitmap> $previewBitmap$delegate;
    final /* synthetic */ MutableState<String> $renderError$delegate;
    final /* synthetic */ MutableState<Boolean> $renderingImage$delegate;
    final /* synthetic */ MutableState<Boolean> $runReady$delegate;
    final /* synthetic */ MutableState<RunRouteOverlayRenderer.RunStats> $stats$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunOverlayExportDialogKt$RunOverlayExportDialog$2$1(MutableState<Uri> mutableState, MutableState<Boolean> mutableState2, MutableState<List<Pair<Double, Double>>> mutableState3, MutableState<Boolean> mutableState4, MutableState<String> mutableState5, MutableState<Bitmap> mutableState6, Context context, MutableState<RunRouteOverlayRenderer.RunStats> mutableState7, Continuation<? super RunOverlayExportDialogKt$RunOverlayExportDialog$2$1> continuation) {
        super(2, continuation);
        this.$pickedUri$delegate = mutableState;
        this.$runReady$delegate = mutableState2;
        this.$latLon$delegate = mutableState3;
        this.$renderingImage$delegate = mutableState4;
        this.$renderError$delegate = mutableState5;
        this.$previewBitmap$delegate = mutableState6;
        this.$ctx = context;
        this.$stats$delegate = mutableState7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunOverlayExportDialogKt$RunOverlayExportDialog$2$1(this.$pickedUri$delegate, this.$runReady$delegate, this.$latLon$delegate, this.$renderingImage$delegate, this.$renderError$delegate, this.$previewBitmap$delegate, this.$ctx, this.$stats$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunOverlayExportDialogKt$RunOverlayExportDialog$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri RunOverlayExportDialog$lambda$1;
        boolean RunOverlayExportDialog$lambda$22;
        List RunOverlayExportDialog$lambda$25;
        String RunOverlayExportDialog$lambda$19;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RunOverlayExportDialog$lambda$1 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$1(this.$pickedUri$delegate);
            if (RunOverlayExportDialog$lambda$1 == null) {
                return Unit.INSTANCE;
            }
            RunOverlayExportDialog$lambda$22 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$22(this.$runReady$delegate);
            if (RunOverlayExportDialog$lambda$22) {
                RunOverlayExportDialog$lambda$25 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$25(this.$latLon$delegate);
                if (RunOverlayExportDialog$lambda$25.size() >= 2) {
                    RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$11(this.$renderingImage$delegate, true);
                    this.$renderError$delegate.setValue(null);
                    this.$previewBitmap$delegate.setValue(null);
                    this.label = 1;
                    obj = BuildersKt.withContext(Dispatchers.getIO(), new RunOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1(this.$ctx, RunOverlayExportDialog$lambda$1, this.$latLon$delegate, this.$stats$delegate, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Object value = ((Result) obj).getValue();
        RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$11(this.$renderingImage$delegate, false);
        MutableState<Bitmap> mutableState = this.$previewBitmap$delegate;
        Context context = this.$ctx;
        MutableState<String> mutableState2 = this.$renderError$delegate;
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(value);
        if (m7908exceptionOrNullimpl != null) {
            String message = m7908exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Could not build overlay";
            }
            mutableState2.setValue(message);
            RunOverlayExportDialog$lambda$19 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$19(mutableState2);
            Toast.makeText(context, RunOverlayExportDialog$lambda$19, 1).show();
        } else {
            mutableState.setValue((Bitmap) value);
        }
        return Unit.INSTANCE;
    }
}
