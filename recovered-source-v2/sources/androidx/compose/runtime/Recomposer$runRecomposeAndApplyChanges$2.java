package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {574, 585}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* loaded from: classes.dex */
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation<? super Recomposer$runRecomposeAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    public static final /* synthetic */ void access$invokeSuspend$clearRecompositionState(Recomposer recomposer, List list, List list2, List list3, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, MutableScatterSet mutableScatterSet3, MutableScatterSet mutableScatterSet4) {
        invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, mutableScatterSet, mutableScatterSet2, mutableScatterSet3, mutableScatterSet4);
    }

    public static final /* synthetic */ void access$invokeSuspend$fillToInsert(List list, Recomposer recomposer) {
        invokeSuspend$fillToInsert(list, recomposer);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, continuation);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0166  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0148 -> B:6:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0151 -> B:7:0x015c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MonotonicFrameClock monotonicFrameClock;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        MutableScatterSet mutableScatterSetOf;
        MutableScatterSet mutableScatterSetOf2;
        MutableScatterSet mutableScatterSet;
        Set wrapIntoSet;
        MutableScatterSet mutableScatterSetOf3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        MutableScatterSet mutableScatterSet2;
        MutableScatterSet mutableScatterSet3;
        Set set;
        MutableScatterSet mutableScatterSet4;
        boolean recordComposerModifications;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        char c = 2;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            monotonicFrameClock = (MonotonicFrameClock) this.L$0;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            mutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            mutableScatterSetOf2 = ScatterSetKt.mutableScatterSetOf();
            mutableScatterSet = new MutableScatterSet(0, 1, null);
            wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
            mutableScatterSetOf3 = ScatterSetKt.mutableScatterSetOf();
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else if (i == 1) {
            MutableScatterSet mutableScatterSet5 = (MutableScatterSet) this.L$8;
            Set set2 = (Set) this.L$7;
            MutableScatterSet mutableScatterSet6 = (MutableScatterSet) this.L$6;
            MutableScatterSet mutableScatterSet7 = (MutableScatterSet) this.L$5;
            MutableScatterSet mutableScatterSet8 = (MutableScatterSet) this.L$4;
            ?? r9 = (List) this.L$3;
            ?? r10 = (List) this.L$2;
            ?? r11 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            arrayList6 = r9;
            arrayList5 = r10;
            arrayList4 = r11;
            set = set2;
            mutableScatterSet = mutableScatterSet6;
            mutableScatterSet3 = mutableScatterSet7;
            mutableScatterSet4 = mutableScatterSet5;
            monotonicFrameClock = monotonicFrameClock2;
            mutableScatterSet2 = mutableScatterSet8;
            recordComposerModifications = this.this$0.recordComposerModifications();
            if (recordComposerModifications) {
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutableScatterSet mutableScatterSet9 = (MutableScatterSet) this.L$8;
            Set set3 = (Set) this.L$7;
            MutableScatterSet mutableScatterSet10 = (MutableScatterSet) this.L$6;
            MutableScatterSet mutableScatterSet11 = (MutableScatterSet) this.L$5;
            MutableScatterSet mutableScatterSet12 = (MutableScatterSet) this.L$4;
            ?? r92 = (List) this.L$3;
            ?? r102 = (List) this.L$2;
            ?? r112 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock3 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList7 = r102;
            mutableScatterSet = mutableScatterSet10;
            Object obj2 = coroutine_suspended;
            mutableScatterSetOf3 = mutableScatterSet9;
            monotonicFrameClock = monotonicFrameClock3;
            char c2 = 2;
            MutableScatterSet mutableScatterSet13 = mutableScatterSet12;
            wrapIntoSet = set3;
            arrayList = r112;
            mutableScatterSetOf2 = mutableScatterSet11;
            arrayList3 = r92;
            this.this$0.discardUnusedValues();
            coroutine_suspended = obj2;
            arrayList2 = arrayList7;
            i2 = 1;
            char c3 = c2;
            mutableScatterSetOf = mutableScatterSet13;
            c = c3;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
                this.L$0 = monotonicFrameClock;
                this.L$1 = arrayList;
                this.L$2 = arrayList2;
                this.L$3 = arrayList3;
                this.L$4 = mutableScatterSetOf;
                this.L$5 = mutableScatterSetOf2;
                this.L$6 = mutableScatterSet;
                this.L$7 = wrapIntoSet;
                this.L$8 = mutableScatterSetOf3;
                this.label = i2;
                awaitWorkAvailable = this.this$0.awaitWorkAvailable(this);
                if (awaitWorkAvailable == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                arrayList6 = arrayList3;
                mutableScatterSet4 = mutableScatterSetOf3;
                mutableScatterSet2 = mutableScatterSetOf;
                Set set4 = wrapIntoSet;
                mutableScatterSet3 = mutableScatterSetOf2;
                set = set4;
                recordComposerModifications = this.this$0.recordComposerModifications();
                if (recordComposerModifications) {
                    obj2 = coroutine_suspended;
                    c2 = c;
                    mutableScatterSet13 = mutableScatterSet2;
                    arrayList7 = arrayList5;
                    mutableScatterSetOf3 = mutableScatterSet4;
                    MutableScatterSet mutableScatterSet14 = mutableScatterSet3;
                    wrapIntoSet = set;
                    mutableScatterSetOf2 = mutableScatterSet14;
                    arrayList = arrayList4;
                    arrayList3 = arrayList6;
                    coroutine_suspended = obj2;
                    arrayList2 = arrayList7;
                    i2 = 1;
                    char c32 = c2;
                    mutableScatterSetOf = mutableScatterSet13;
                    c = c32;
                    shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                    if (!shouldKeepRecomposing) {
                    }
                } else {
                    final Recomposer recomposer = this.this$0;
                    final MutableScatterSet mutableScatterSet15 = mutableScatterSet4;
                    final MutableScatterSet mutableScatterSet16 = mutableScatterSet;
                    final Set set5 = set;
                    final ArrayList arrayList8 = arrayList4;
                    MutableScatterSet mutableScatterSet17 = mutableScatterSet;
                    final ArrayList arrayList9 = arrayList5;
                    final MutableScatterSet mutableScatterSet18 = mutableScatterSet3;
                    final MutableScatterSet mutableScatterSet19 = mutableScatterSet2;
                    mutableScatterSet13 = mutableScatterSet2;
                    final ArrayList arrayList10 = arrayList6;
                    Object obj3 = coroutine_suspended;
                    ArrayList arrayList11 = arrayList6;
                    arrayList7 = arrayList5;
                    this.L$0 = monotonicFrameClock;
                    this.L$1 = arrayList4;
                    this.L$2 = arrayList7;
                    this.L$3 = arrayList11;
                    this.L$4 = mutableScatterSet13;
                    this.L$5 = mutableScatterSet18;
                    mutableScatterSet = mutableScatterSet17;
                    this.L$6 = mutableScatterSet;
                    wrapIntoSet = set5;
                    this.L$7 = wrapIntoSet;
                    mutableScatterSetOf3 = mutableScatterSet15;
                    this.L$8 = mutableScatterSetOf3;
                    c2 = 2;
                    this.label = 2;
                    Object withFrameNanos = monotonicFrameClock.withFrameNanos(new Function1<Long, Unit>() { // from class: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                            invoke(l.longValue());
                            return Unit.INSTANCE;
                        }

                        /*  JADX ERROR: Types fix failed
                            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
                            */
                        /* JADX WARN: Not initialized variable reg: 22, insn: 0x018a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:162:0x018a */
                        /* JADX WARN: Not initialized variable reg: 22, insn: 0x018f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:166:0x018f */
                        public final void invoke(long r27) {
                            /*
                                Method dump skipped, instructions count: 888
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.AnonymousClass1.invoke(long):void");
                        }
                    }, this);
                    obj2 = obj3;
                    if (withFrameNanos == obj2) {
                        return obj2;
                    }
                    mutableScatterSetOf2 = mutableScatterSet18;
                    arrayList = arrayList4;
                    arrayList3 = arrayList11;
                    this.this$0.discardUnusedValues();
                    coroutine_suspended = obj2;
                    arrayList2 = arrayList7;
                    i2 = 1;
                    char c322 = c2;
                    mutableScatterSetOf = mutableScatterSet13;
                    c = c322;
                    shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                    if (!shouldKeepRecomposing) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(Recomposer recomposer, List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, MutableScatterSet<ControlledComposition> mutableScatterSet, MutableScatterSet<ControlledComposition> mutableScatterSet2, MutableScatterSet<Object> mutableScatterSet3, MutableScatterSet<ControlledComposition> mutableScatterSet4) {
        long j;
        synchronized (recomposer.stateLock) {
            list.clear();
            list2.clear();
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                ControlledComposition controlledComposition = list3.get(i);
                controlledComposition.abandonChanges();
                recomposer.recordFailedCompositionLocked(controlledComposition);
            }
            list3.clear();
            MutableScatterSet<ControlledComposition> mutableScatterSet5 = mutableScatterSet;
            Object[] objArr = mutableScatterSet5.elements;
            long[] jArr = mutableScatterSet5.metadata;
            int length = jArr.length - 2;
            char c = 7;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j2 & 255) < 128) {
                                ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i2 << 3) + i4];
                                controlledComposition2.abandonChanges();
                                recomposer.recordFailedCompositionLocked(controlledComposition2);
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            mutableScatterSet.clear();
            MutableScatterSet<ControlledComposition> mutableScatterSet6 = mutableScatterSet2;
            Object[] objArr2 = mutableScatterSet6.elements;
            long[] jArr2 = mutableScatterSet6.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i5 = 0;
                while (true) {
                    long j3 = jArr2[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length2)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            int i8 = i7;
                            if ((j3 & 255) < 128) {
                                ((ControlledComposition) objArr2[(i5 << 3) + i8]).changesApplied();
                            }
                            j3 >>= 8;
                            i7 = i8 + 1;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length2) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            mutableScatterSet2.clear();
            mutableScatterSet3.clear();
            MutableScatterSet<ControlledComposition> mutableScatterSet7 = mutableScatterSet4;
            Object[] objArr3 = mutableScatterSet7.elements;
            long[] jArr3 = mutableScatterSet7.metadata;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i9 = 0;
                while (true) {
                    long j4 = jArr3[i9];
                    if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length3)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((j4 & 255) < 128) {
                                ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i9 << 3) + i11];
                                controlledComposition3.abandonChanges();
                                recomposer.recordFailedCompositionLocked(controlledComposition3);
                            }
                            j4 >>= 8;
                        }
                        j = 255;
                        if (i10 != 8) {
                            break;
                        }
                    } else {
                        j = 255;
                    }
                    if (i9 == length3) {
                        break;
                    }
                    i9++;
                    c = 7;
                }
            }
            mutableScatterSet4.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            list2 = recomposer.compositionValuesAwaitingInsert;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((MovableContentStateReference) list2.get(i));
            }
            list3 = recomposer.compositionValuesAwaitingInsert;
            list3.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
