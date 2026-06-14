package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.repo.RunRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.maplibre.android.log.Logger;

/* compiled from: RunFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.RunFirestoreSync$pullIntoRoom$2", f = "RunFirestoreSync.kt", i = {0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6}, l = {86, 95, Logger.NONE, 100, 110, 117, 134}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "doc", "imported", "start", "end", "distanceM", "$this$withContext", "doc", "imported", "start", "end", "distanceM", "durationMs", "$this$withContext", "doc", "imported", "start", "durationMs", "runId", "$this$withContext", "doc", "imported", "start", "durationMs", "runId", "$this$withContext", "doc", "route", "imported", "start", "durationMs", "index$iv", "runId", "$this$withContext", "imported", "runId"}, s = {"L$0", "L$0", "L$2", "I$0", "J$0", "J$1", "D$0", "L$0", "L$2", "I$0", "J$0", "J$1", "D$0", "J$2", "L$0", "L$2", "I$0", "J$0", "J$1", "J$2", "L$0", "L$2", "I$0", "J$0", "J$1", "J$2", "L$0", "L$2", "L$4", "I$0", "J$0", "J$1", "I$1", "J$2", "L$0", "I$0", "J$0"})
/* loaded from: classes3.dex */
final class RunFirestoreSync$pullIntoRoom$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RunRepository $runRepo;
    double D$0;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    long J$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunFirestoreSync$pullIntoRoom$2(Context context, RunRepository runRepository, Continuation<? super RunFirestoreSync$pullIntoRoom$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$runRepo = runRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RunFirestoreSync$pullIntoRoom$2 runFirestoreSync$pullIntoRoom$2 = new RunFirestoreSync$pullIntoRoom$2(this.$context, this.$runRepo, continuation);
        runFirestoreSync$pullIntoRoom$2.L$0 = obj;
        return runFirestoreSync$pullIntoRoom$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((RunFirestoreSync$pullIntoRoom$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:60:0x059f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0122: MOVE (r6 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:334:0x0120 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0120: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:334:0x0120 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0121: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:334:0x0120 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0336 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0361 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0379 A[Catch: all -> 0x0533, TRY_LEAVE, TryCatch #9 {all -> 0x0533, blocks: (B:122:0x0368, B:125:0x0379, B:130:0x0391), top: B:121:0x0368 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04bf A[Catch: all -> 0x0525, TryCatch #2 {all -> 0x0525, blocks: (B:13:0x04b9, B:15:0x04bf, B:17:0x04d0, B:19:0x04d6, B:21:0x04e4, B:23:0x04ea, B:27:0x04f6), top: B:12:0x04b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0493 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:142:0x04b3 -> B:12:0x04b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x0539 -> B:36:0x0552). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:271:0x051b -> B:11:0x0517). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0514 -> B:11:0x0517). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0596 -> B:38:0x05b2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.rungps.sync.RunFirestoreSync$pullIntoRoom$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
