package com.example.rungps.ui.run;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RunOverlayExportDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1", f = "RunOverlayExportDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Bitmap>>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<List<Pair<Double, Double>>> $latLon$delegate;
    final /* synthetic */ MutableState<RunRouteOverlayRenderer.RunStats> $stats$delegate;
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1(Context context, Uri uri, MutableState<List<Pair<Double, Double>>> mutableState, MutableState<RunRouteOverlayRenderer.RunStats> mutableState2, Continuation<? super RunOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$uri = uri;
        this.$latLon$delegate = mutableState;
        this.$stats$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RunOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1 runOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1 = new RunOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1(this.$ctx, this.$uri, this.$latLon$delegate, this.$stats$delegate, continuation);
        runOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1.L$0 = obj;
        return runOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Bitmap>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Bitmap>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Bitmap>> continuation) {
        return ((RunOverlayExportDialogKt$RunOverlayExportDialog$2$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Bitmap decodeSampledBitmap$default;
        List<Pair<Double, Double>> RunOverlayExportDialog$lambda$25;
        RunRouteOverlayRenderer.RunStats RunOverlayExportDialog$lambda$28;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Context context = this.$ctx;
        Uri uri = this.$uri;
        MutableState<List<Pair<Double, Double>>> mutableState = this.$latLon$delegate;
        MutableState<RunRouteOverlayRenderer.RunStats> mutableState2 = this.$stats$delegate;
        try {
            Result.Companion companion = Result.INSTANCE;
            decodeSampledBitmap$default = RunRouteOverlayRenderer.decodeSampledBitmap$default(RunRouteOverlayRenderer.INSTANCE, context, uri, 0, 4, null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (decodeSampledBitmap$default == null) {
            throw new IllegalStateException("Could not read image".toString());
        }
        try {
            RunRouteOverlayRenderer runRouteOverlayRenderer = RunRouteOverlayRenderer.INSTANCE;
            RunOverlayExportDialog$lambda$25 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$25(mutableState);
            RunOverlayExportDialog$lambda$28 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$28(mutableState2);
            Bitmap render = runRouteOverlayRenderer.render(decodeSampledBitmap$default, RunOverlayExportDialog$lambda$25, RunOverlayExportDialog$lambda$28);
            decodeSampledBitmap$default.recycle();
            m7905constructorimpl = Result.m7905constructorimpl(render);
            return Result.m7904boximpl(m7905constructorimpl);
        } catch (Throwable th2) {
            decodeSampledBitmap$default.recycle();
            throw th2;
        }
    }
}
