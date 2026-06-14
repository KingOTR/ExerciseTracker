package com.example.rungps.ui.run;

import android.content.Context;
import com.example.rungps.data.PointEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.export.RunRouteOverlayRenderer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RunOverlayExportDialog.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a(\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001*\u00020\u0007H\n"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "", "Lkotlin/Pair;", "", "Lcom/example/rungps/export/RunRouteOverlayRenderer$RunStats;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$1$1$loaded$1", f = "RunOverlayExportDialog.kt", i = {0, 1}, l = {76, 77}, m = "invokeSuspend", n = {"repo", "run"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class RunOverlayExportDialogKt$RunOverlayExportDialog$1$1$loaded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Triple<? extends List<? extends Pair<? extends Double, ? extends Double>>, ? extends RunRouteOverlayRenderer.RunStats, ? extends Boolean>>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ long $runId;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunOverlayExportDialogKt$RunOverlayExportDialog$1$1$loaded$1(Context context, long j, Continuation<? super RunOverlayExportDialogKt$RunOverlayExportDialog$1$1$loaded$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$runId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunOverlayExportDialogKt$RunOverlayExportDialog$1$1$loaded$1(this.$ctx, this.$runId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Triple<? extends List<? extends Pair<? extends Double, ? extends Double>>, ? extends RunRouteOverlayRenderer.RunStats, ? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Triple<? extends List<Pair<Double, Double>>, RunRouteOverlayRenderer.RunStats, Boolean>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Triple<? extends List<Pair<Double, Double>>, RunRouteOverlayRenderer.RunStats, Boolean>> continuation) {
        return ((RunOverlayExportDialogKt$RunOverlayExportDialog$1$1$loaded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0062 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Repository repository;
        RunEntity runEntity;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            repository = Repository.INSTANCE.get(this.$ctx);
            this.L$0 = repository;
            this.label = 1;
            obj = repository.runById(this.$runId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                runEntity = (RunEntity) this.L$0;
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (list.size() >= 2) {
                    return null;
                }
                List<PointEntity> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (PointEntity pointEntity : list2) {
                    arrayList.add(TuplesKt.to(Boxing.boxDouble(pointEntity.getLat()), Boxing.boxDouble(pointEntity.getLon())));
                }
                return new Triple(arrayList, new RunRouteOverlayRenderer.RunStats(runEntity.getTotalDistanceM() / 1000.0d, runEntity.getTotalDurationMs()), Boxing.boxBoolean(true));
            }
            repository = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        RunEntity runEntity2 = (RunEntity) obj;
        if (runEntity2 == null) {
            return null;
        }
        this.L$0 = runEntity2;
        this.label = 2;
        Object pointsForRun = repository.pointsForRun(this.$runId, this);
        if (pointsForRun == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = pointsForRun;
        runEntity = runEntity2;
        list = (List) obj;
        if (list.size() >= 2) {
        }
    }
}
