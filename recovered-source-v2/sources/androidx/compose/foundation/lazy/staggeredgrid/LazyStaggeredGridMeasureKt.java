package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyStaggeredGridMeasure.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0083\b¢\u0006\u0002\u0010\u0010\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0001H\u0083\b\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001dH\u0002¢\u0006\u0002\u0010$\u001a\u001c\u0010%\u001a\u00020\u0005*\u00020\u00142\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0003H\u0002\u001a7\u0010(\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00122\b\b\u0002\u0010)\u001a\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b\u001a\u001c\u0010+\u001a\u00020\u0003*\u00020\u00142\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a+\u0010.\u001a\u00020\u0005*\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\f\u00102\u001a\u00020\u0003*\u00020 H\u0002\u001a2\u00103\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001d2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00104\u001a\u0016\u00105\u001a\u00020\u0003*\u00020 2\b\b\u0002\u00106\u001a\u00020\u0003H\u0000\u001a\u001e\u00107\u001a\u00020\u0003*\u00020 2\u0006\u00108\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a,\u0010;\u001a\u00020<*\u00020\u00142\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020\u0001H\u0003\u001a\u008c\u0001\u0010A\u001a\u00020<*\u00020\f2\u0006\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\u0014\u0010Y\u001a\u00020\u0005*\u00020 2\u0006\u0010Z\u001a\u00020\u0003H\u0002\u001a!\u0010[\u001a\u00020 *\u00020 2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", "message", "Lkotlin/Function0;", "", "withDebugLogging", ExifInterface.GPS_DIRECTION_TRUE, "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "filter", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "itemIndex", "beforeVisibleBounds", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "fastForEach", "reverse", "action", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "measureStaggeredGrid-XtK8cYQ", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final void debugLog(Function0<String> function0) {
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    /* renamed from: measureStaggeredGrid-XtK8cYQ, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m895measureStaggeredGridXtK8cYQ(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j, boolean z, boolean z2, long j2, int i, int i2, int i3, int i4, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        int i5;
        int m894maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j, z, lazyLayoutMeasureScope, i, j2, i3, i4, z2, i2, coroutineScope, graphicsContext, null);
        int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= updateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (m894maxInRangejy6DScQ = updateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                    m894maxInRangejy6DScQ = i6 == 0 ? 0 : m894maxInRangejy6DScQ(iArr, SpanRange.m905constructorimpl(0, i6)) + 1;
                }
                iArr[i6] = m894maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                i6++;
            }
            updateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i7 = 0;
            while (i7 < laneCount2) {
                if (i7 < scrollOffsets.length) {
                    i5 = scrollOffsets[i7];
                } else {
                    i5 = i7 == 0 ? 0 : iArr2[i7 - 1];
                }
                iArr2[i7] = i5;
                i7++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.getScrollToBeConsumed()), updateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x056c, code lost:
    
        if ((r12 != null ? r12.getIndex() : -1) > r15) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x02f3, code lost:
    
        r6 = indexOfMinValue$default(r8, 0, 1, null);
        r7 = indexOfMaxValue(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x02fe, code lost:
    
        if (r6 == r7) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0304, code lost:
    
        if (r8[r6] != r8[r7]) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0306, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0308, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0309, code lost:
    
        r7 = r31[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x030c, code lost:
    
        if (r7 != (-1)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x030e, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x030f, code lost:
    
        r7 = findPreviousItemIndex(r0, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0313, code lost:
    
        if (r7 >= 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0355, code lost:
    
        r14 = r25;
        r13 = r31;
        r47 = r5;
        r5 = r0.m890getSpanRangelOCCd4c(r46.getItemProvider(), r7, r6);
        r15 = r46.getLaneInfo();
        r48 = r3;
        r32 = r4;
        r3 = (int) (r5 & 4294967295L);
        r24 = r11;
        r25 = r12;
        r4 = (int) (r5 >> 32);
        r11 = r3 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x037f, code lost:
    
        if (r11 == 1) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0381, code lost:
    
        r20 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0386, code lost:
    
        if (r20 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0388, code lost:
    
        r12 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x038b, code lost:
    
        r15.setLane(r7, r12);
        r12 = r46.getMeasuredItemProvider().m899getAndMeasurejy6DScQ(r7, r5);
        r5 = m894maxInRangejy6DScQ(r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x039b, code lost:
    
        if (r11 == 1) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x039d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x03a0, code lost:
    
        if (r6 == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x03a2, code lost:
    
        r15 = r46.getLaneInfo().getGaps(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x03ac, code lost:
    
        if (r4 >= r3) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x03b0, code lost:
    
        if (r8[r4] == r5) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x03b2, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x03b3, code lost:
    
        r10[r4].addFirst(r12);
        r13[r4] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x03ba, code lost:
    
        if (r15 != null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x03bc, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x03c0, code lost:
    
        r8[r4] = (r12.getMainAxisSizeWithSpacings() + r5) + r6;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x03be, code lost:
    
        r6 = r15[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x03ab, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x039f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x038a, code lost:
    
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0384, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0315, code lost:
    
        r13 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0317, code lost:
    
        if (r1 != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x031d, code lost:
    
        if (measure$lambda$41$misalignedStart(r13, r0, r8, r6) == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0349, code lost:
    
        r14 = r25;
        r48 = r3;
        r32 = r4;
        r47 = r5;
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x031f, code lost:
    
        if (r50 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0321, code lost:
    
        r46.getLaneInfo().reset();
        r1 = r13.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x032c, code lost:
    
        if (r3 >= r1) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x032e, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0334, code lost:
    
        r1 = r8.length;
        r3 = new int[r1];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0338, code lost:
    
        if (r4 >= r1) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x033a, code lost:
    
        r3[r4] = r8[r6];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0348, code lost:
    
        return measure(r0, r25, r2, r3, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x066e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final LazyStaggeredGridMeasureResult measure(final LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int[] iArr, int[] iArr2, boolean z) {
        LazyLayoutMeasureScope lazyLayoutMeasureScope;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr3;
        int i7;
        int i8;
        int[] iArr4;
        int i9;
        int i10;
        int[] iArr5;
        int[] iArr6;
        int i11;
        int i12;
        int[] iArr7;
        int[] iArr8;
        int i13;
        int i14;
        int i15;
        int[] iArr9;
        int m6273constrainWidthK40F9xA;
        int m6255getMaxHeightimpl;
        int i16;
        int[] iArr10;
        List list;
        int i17;
        boolean z2;
        boolean z3;
        boolean z4;
        int[] iArr11;
        List<Integer> list2;
        int i18;
        boolean z5;
        int[] iArr12;
        boolean z6;
        int i19;
        int i20;
        int[] iArr13;
        int i21;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
        int i22 = i;
        LazyLayoutMeasureScope measureScope = lazyStaggeredGridMeasureContext.getMeasureScope();
        int itemCount = lazyStaggeredGridMeasureContext.getItemProvider().getItemCount();
        if (itemCount <= 0 || lazyStaggeredGridMeasureContext.getLaneCount() == 0) {
            int m6258getMinWidthimpl = Constraints.m6258getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
            int m6257getMinHeightimpl = Constraints.m6257getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
            lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().onMeasured(0, m6258getMinWidthimpl, m6257getMinHeightimpl, new ArrayList(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getLaneCount(), false, 0, 0, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
            long m849getMinSizeToFitDisappearingItemsYbymL2g = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().m849getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m6471equalsimpl0(m849getMinSizeToFitDisappearingItemsYbymL2g, IntSize.INSTANCE.m6478getZeroYbymL2g())) {
                m6258getMinWidthimpl = ConstraintsKt.m6273constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), IntSize.m6473getWidthimpl(m849getMinSizeToFitDisappearingItemsYbymL2g));
                m6257getMinHeightimpl = ConstraintsKt.m6272constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), IntSize.m6472getHeightimpl(m849getMinSizeToFitDisappearingItemsYbymL2g));
            }
            return new LazyStaggeredGridMeasureResult(iArr, iArr2, 0.0f, MeasureScope.layout$default(measureScope, m6258getMinWidthimpl, m6257getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null), false, lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), measureScope, itemCount, CollectionsKt.emptyList(), IntSizeKt.IntSize(Constraints.m6258getMinWidthimpl(lazyStaggeredGridMeasureContext.getConstraints()), Constraints.m6257getMinHeightimpl(lazyStaggeredGridMeasureContext.getConstraints())), -lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        String str = "copyOf(this, size)";
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        int[] copyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
        ensureIndicesInRange(lazyStaggeredGridMeasureContext2, copyOf, itemCount);
        offsetBy(copyOf2, -i22);
        int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[laneCount];
        for (int i23 = 0; i23 < laneCount; i23++) {
            arrayDequeArr[i23] = new ArrayDeque(16);
        }
        offsetBy(copyOf2, -lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        boolean z7 = false;
        while (true) {
            if (!measure$lambda$41$hasSpaceBeforeFirst(copyOf, copyOf2, lazyStaggeredGridMeasureContext2)) {
                lazyLayoutMeasureScope = measureScope;
                i2 = itemCount;
                i3 = -1;
                break;
            }
            i3 = indexOfMaxValue(copyOf);
            int i24 = copyOf[i3];
            int length = copyOf2.length;
            for (int i25 = 0; i25 < length; i25++) {
                if (copyOf[i25] != copyOf[i3]) {
                    int i26 = copyOf2[i25];
                    int i27 = copyOf2[i3];
                    if (i26 < i27) {
                        copyOf2[i25] = i27;
                    }
                }
            }
            int findPreviousItemIndex = findPreviousItemIndex(lazyStaggeredGridMeasureContext2, i24, i3);
            if (findPreviousItemIndex < 0) {
                lazyLayoutMeasureScope = measureScope;
                i2 = itemCount;
                break;
            }
            long m890getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext2.m890getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), findPreviousItemIndex, i3);
            int i28 = (int) (4294967295L & m890getSpanRangelOCCd4c);
            LazyLayoutMeasureScope lazyLayoutMeasureScope2 = measureScope;
            int i29 = itemCount;
            int i30 = (int) (m890getSpanRangelOCCd4c >> 32);
            int i31 = i28 - i30;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(findPreviousItemIndex, i31 != 1 ? -2 : i30);
            LazyStaggeredGridMeasuredItem m899getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m899getAndMeasurejy6DScQ(findPreviousItemIndex, m890getSpanRangelOCCd4c);
            int m894maxInRangejy6DScQ = m894maxInRangejy6DScQ(copyOf2, m890getSpanRangelOCCd4c);
            int[] gaps = i31 != 1 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(findPreviousItemIndex) : null;
            while (i30 < i28) {
                copyOf[i30] = findPreviousItemIndex;
                int mainAxisSizeWithSpacings = m899getAndMeasurejy6DScQ.getMainAxisSizeWithSpacings() + m894maxInRangejy6DScQ + (gaps == null ? 0 : gaps[i30]);
                copyOf2[i30] = mainAxisSizeWithSpacings;
                if (lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + mainAxisSizeWithSpacings <= 0) {
                    z7 = true;
                }
                i30++;
            }
            measureScope = lazyLayoutMeasureScope2;
            itemCount = i29;
        }
        int i32 = -lazyStaggeredGridMeasureContext.getBeforeContentPadding();
        int i33 = copyOf2[0];
        if (i33 < i32) {
            i22 += i33;
            offsetBy(copyOf2, i32 - i33);
        }
        offsetBy(copyOf2, lazyStaggeredGridMeasureContext.getBeforeContentPadding());
        int i34 = -1;
        if (i3 == -1) {
            i3 = ArraysKt.indexOf(copyOf, 0);
        }
        if (i3 != -1 && measure$lambda$41$misalignedStart(copyOf, lazyStaggeredGridMeasureContext2, copyOf2, i3) && z) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int length2 = copyOf.length;
            int[] iArr14 = new int[length2];
            int i35 = 0;
            while (i35 < length2) {
                iArr14[i35] = i34;
                i35++;
                i34 = -1;
            }
            int length3 = copyOf2.length;
            int[] iArr15 = new int[length3];
            for (int i36 = 0; i36 < length3; i36++) {
                iArr15[i36] = copyOf2[i3];
            }
            return measure(lazyStaggeredGridMeasureContext2, i22, iArr14, iArr15, false);
        }
        int[] copyOf3 = Arrays.copyOf(copyOf, copyOf.length);
        Intrinsics.checkNotNullExpressionValue(copyOf3, "copyOf(this, size)");
        int length4 = copyOf2.length;
        int[] iArr16 = new int[length4];
        for (int i37 = 0; i37 < length4; i37++) {
            iArr16[i37] = -copyOf2[i37];
        }
        int mainAxisSpacing = i32 + lazyStaggeredGridMeasureContext.getMainAxisSpacing();
        int coerceAtLeast = RangesKt.coerceAtLeast(lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() + lazyStaggeredGridMeasureContext.getAfterContentPadding(), 0);
        boolean z8 = z7;
        int indexOfMinValue$default = indexOfMinValue$default(copyOf3, 0, 1, null);
        int i38 = 0;
        while (indexOfMinValue$default != -1 && i38 < lazyStaggeredGridMeasureContext.getLaneCount()) {
            int i39 = copyOf3[indexOfMinValue$default];
            int indexOfMinValue = indexOfMinValue(copyOf3, i39);
            i38++;
            if (i39 >= 0) {
                int i40 = i22;
                long m890getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext2.m890getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), i39, indexOfMinValue$default);
                LazyStaggeredGridMeasuredItem m899getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m899getAndMeasurejy6DScQ(i39, m890getSpanRangelOCCd4c2);
                int i41 = i32;
                String str2 = str;
                int[] iArr17 = copyOf;
                int i42 = (int) (m890getSpanRangelOCCd4c2 & 4294967295L);
                int[] iArr18 = copyOf2;
                int i43 = laneCount;
                int i44 = (int) (m890getSpanRangelOCCd4c2 >> 32);
                int i45 = i42 - i44;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(i39, i45 != 1 ? -2 : i44);
                int m894maxInRangejy6DScQ2 = m894maxInRangejy6DScQ(iArr16, m890getSpanRangelOCCd4c2);
                for (int i46 = i44; i46 < i42; i46++) {
                    iArr16[i46] = m899getAndMeasurejy6DScQ2.getMainAxisSizeWithSpacings() + m894maxInRangejy6DScQ2;
                    copyOf3[i46] = i39;
                    arrayDequeArr[i46].addLast(m899getAndMeasurejy6DScQ2);
                }
                if (m894maxInRangejy6DScQ2 >= mainAxisSpacing || iArr16[i44] > mainAxisSpacing) {
                    i21 = 1;
                } else {
                    m899getAndMeasurejy6DScQ2.setVisible(false);
                    i21 = 1;
                    z8 = true;
                }
                i38 = i45 != i21 ? lazyStaggeredGridMeasureContext.getLaneCount() : i38;
                indexOfMinValue$default = indexOfMinValue;
                i22 = i40;
                str = str2;
                i32 = i41;
                copyOf = iArr17;
                laneCount = i43;
                copyOf2 = iArr18;
            } else {
                indexOfMinValue$default = indexOfMinValue;
            }
        }
        int i47 = i22;
        int i48 = i32;
        String str3 = str;
        int[] iArr19 = copyOf;
        int[] iArr20 = copyOf2;
        int i49 = laneCount;
        loop9: while (true) {
            for (int i50 = 0; i50 < length4; i50++) {
                int i51 = iArr16[i50];
                if (i51 < coerceAtLeast || i51 <= 0) {
                    i4 = i49;
                    break;
                }
            }
            i4 = i49;
            for (int i52 = 0; i52 < i4; i52++) {
                if (!arrayDequeArr[i52].isEmpty()) {
                    i5 = i2;
                    i6 = 1;
                    break loop9;
                }
            }
            i6 = 1;
            int indexOfMinValue$default2 = indexOfMinValue$default(iArr16, 0, 1, null);
            int maxOrThrow = ArraysKt.maxOrThrow(copyOf3) + 1;
            i5 = i2;
            if (maxOrThrow >= i5) {
                break;
            }
            int i53 = coerceAtLeast;
            i49 = i4;
            i2 = i5;
            int i54 = length4;
            int[] iArr21 = iArr16;
            int i55 = i47;
            int[] iArr22 = iArr19;
            int[] iArr23 = iArr20;
            int[] iArr24 = copyOf3;
            long m890getSpanRangelOCCd4c3 = lazyStaggeredGridMeasureContext2.m890getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), maxOrThrow, indexOfMinValue$default2);
            int i56 = (int) (m890getSpanRangelOCCd4c3 & 4294967295L);
            int i57 = (int) (m890getSpanRangelOCCd4c3 >> 32);
            int i58 = i56 - i57;
            lazyStaggeredGridMeasureContext.getLaneInfo().setLane(maxOrThrow, i58 != 1 ? -2 : i57);
            LazyStaggeredGridMeasuredItem m899getAndMeasurejy6DScQ3 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m899getAndMeasurejy6DScQ(maxOrThrow, m890getSpanRangelOCCd4c3);
            int m894maxInRangejy6DScQ3 = m894maxInRangejy6DScQ(iArr21, m890getSpanRangelOCCd4c3);
            if (i58 != 1) {
                iArr13 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(maxOrThrow);
                if (iArr13 == null) {
                    iArr13 = new int[lazyStaggeredGridMeasureContext.getLaneCount()];
                }
            } else {
                iArr13 = null;
            }
            for (int i59 = i57; i59 < i56; i59++) {
                if (iArr13 != null) {
                    iArr13[i59] = m894maxInRangejy6DScQ3 - iArr21[i59];
                }
                iArr24[i59] = maxOrThrow;
                iArr21[i59] = m894maxInRangejy6DScQ3 + m899getAndMeasurejy6DScQ3.getMainAxisSizeWithSpacings();
                arrayDequeArr[i59].addLast(m899getAndMeasurejy6DScQ3);
            }
            lazyStaggeredGridMeasureContext.getLaneInfo().setGaps(maxOrThrow, iArr13);
            if (m894maxInRangejy6DScQ3 < mainAxisSpacing && iArr21[i57] <= mainAxisSpacing) {
                m899getAndMeasurejy6DScQ3.setVisible(false);
            }
            coerceAtLeast = i53;
            iArr20 = iArr23;
            iArr19 = iArr22;
            copyOf3 = iArr24;
            i47 = i55;
            length4 = i54;
            iArr16 = iArr21;
        }
        int i60 = 0;
        while (i60 < i4) {
            ArrayDeque arrayDeque = arrayDequeArr[i60];
            while (arrayDeque.size() > i6 && !((LazyStaggeredGridMeasuredItem) arrayDeque.first()).getIsVisible()) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) arrayDeque.removeFirst();
                int[] gaps2 = lazyStaggeredGridMeasuredItem.getSpan() != i6 ? lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem.getIndex()) : null;
                iArr20[i60] = iArr20[i60] - (lazyStaggeredGridMeasuredItem.getMainAxisSizeWithSpacings() + (gaps2 == null ? 0 : gaps2[i60]));
                i6 = 1;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) arrayDeque.firstOrNull();
            iArr19[i60] = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : -1;
            i60++;
            i6 = 1;
        }
        int length5 = copyOf3.length;
        int i61 = 0;
        while (true) {
            if (i61 >= length5) {
                break;
            }
            if (copyOf3[i61] == i5 - 1) {
                offsetBy(iArr16, -lazyStaggeredGridMeasureContext.getMainAxisSpacing());
                break;
            }
            i61++;
        }
        int i62 = 0;
        while (true) {
            if (i62 < length4) {
                if (iArr16[i62] >= lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                    i7 = coerceAtLeast;
                    i8 = i4;
                    iArr4 = copyOf3;
                    i9 = length4;
                    iArr6 = iArr16;
                    i11 = i47;
                    iArr5 = iArr19;
                    iArr3 = iArr20;
                    break;
                }
                i62++;
            } else {
                int mainAxisAvailableSize = lazyStaggeredGridMeasureContext.getMainAxisAvailableSize() - iArr16[indexOfMaxValue(iArr16)];
                iArr3 = iArr20;
                offsetBy(iArr3, -mainAxisAvailableSize);
                offsetBy(iArr16, mainAxisAvailableSize);
                boolean z9 = false;
                loop26: while (true) {
                    int length6 = iArr3.length;
                    int i63 = 0;
                    while (true) {
                        if (i63 >= length6) {
                            i7 = coerceAtLeast;
                            i8 = i4;
                            iArr4 = copyOf3;
                            i9 = length4;
                            i10 = i47;
                            iArr5 = iArr19;
                            break loop26;
                        }
                        if (iArr3[i63] < lazyStaggeredGridMeasureContext.getBeforeContentPadding()) {
                            break;
                        }
                        i63++;
                        i47 = i47;
                    }
                    copyOf3 = iArr8;
                    coerceAtLeast = i13;
                    iArr19 = iArr7;
                    length4 = i15;
                    iArr16 = iArr9;
                    i4 = i14;
                    i47 = i12;
                }
                int[] iArr25 = iArr16;
                if (z9 && z) {
                    lazyStaggeredGridMeasureContext.getLaneInfo().reset();
                    return measure(lazyStaggeredGridMeasureContext2, i10, iArr5, iArr3, false);
                }
                int i64 = mainAxisAvailableSize + i10;
                int i65 = iArr3[indexOfMinValue$default(iArr3, 0, 1, null)];
                if (i65 < 0) {
                    i64 += i65;
                    iArr6 = iArr25;
                    offsetBy(iArr6, i65);
                    offsetBy(iArr3, -i65);
                } else {
                    iArr6 = iArr25;
                }
                i11 = i64;
            }
        }
        float scrollToBeConsumed = (MathKt.getSign(Math.round(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) != MathKt.getSign(i11) || Math.abs(Math.round(lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed())) < Math.abs(i11)) ? lazyStaggeredGridMeasureContext.getState().getScrollToBeConsumed() : i11;
        int[] copyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        Intrinsics.checkNotNullExpressionValue(copyOf4, str3);
        int length7 = copyOf4.length;
        for (int i66 = 0; i66 < length7; i66++) {
            copyOf4[i66] = -copyOf4[i66];
        }
        int i67 = i8;
        if (lazyStaggeredGridMeasureContext.getBeforeContentPadding() > lazyStaggeredGridMeasureContext.getMainAxisSpacing()) {
            for (int i68 = 0; i68 < i67; i68++) {
                ArrayDeque arrayDeque2 = arrayDequeArr[i68];
                int size = arrayDeque2.size();
                int i69 = 0;
                while (i69 < size) {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = (LazyStaggeredGridMeasuredItem) arrayDeque2.get(i69);
                    int[] gaps3 = lazyStaggeredGridMeasureContext.getLaneInfo().getGaps(lazyStaggeredGridMeasuredItem3.getIndex());
                    int mainAxisSizeWithSpacings2 = lazyStaggeredGridMeasuredItem3.getMainAxisSizeWithSpacings() + (gaps3 == null ? 0 : gaps3[i68]);
                    if (i69 != CollectionsKt.getLastIndex(arrayDeque2) && (i20 = iArr3[i68]) != 0 && i20 >= mainAxisSizeWithSpacings2) {
                        iArr3[i68] = i20 - mainAxisSizeWithSpacings2;
                        i69++;
                        iArr5[i68] = ((LazyStaggeredGridMeasuredItem) arrayDeque2.get(i69)).getIndex();
                    }
                }
            }
        }
        int beforeContentPadding = lazyStaggeredGridMeasureContext.getBeforeContentPadding() + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            m6273constrainWidthK40F9xA = Constraints.m6256getMaxWidthimpl(lazyStaggeredGridMeasureContext.getConstraints());
        } else {
            m6273constrainWidthK40F9xA = ConstraintsKt.m6273constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        }
        if (lazyStaggeredGridMeasureContext.getIsVertical()) {
            m6255getMaxHeightimpl = ConstraintsKt.m6272constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding);
        } else {
            m6255getMaxHeightimpl = Constraints.m6255getMaxHeightimpl(lazyStaggeredGridMeasureContext.getConstraints());
        }
        int min = (Math.min(lazyStaggeredGridMeasureContext.getIsVertical() ? m6255getMaxHeightimpl : m6273constrainWidthK40F9xA, lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) - lazyStaggeredGridMeasureContext.getBeforeContentPadding()) + lazyStaggeredGridMeasureContext.getAfterContentPadding();
        int i70 = copyOf4[0];
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size2 = pinnedItems.size() - 1;
        if (size2 >= 0) {
            ArrayList arrayList = null;
            while (true) {
                int i71 = size2 - 1;
                int intValue = pinnedItems.get(size2).intValue();
                List<Integer> list3 = pinnedItems;
                int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue);
                iArr10 = iArr5;
                if (lane == -2 || lane == -1) {
                    for (int i72 = 0; i72 < i67; i72++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (LazyStaggeredGridMeasuredItem) arrayDequeArr[i72].firstOrNull();
                        if (!((lazyStaggeredGridMeasuredItem4 != null ? lazyStaggeredGridMeasuredItem4.getIndex() : -1) > intValue)) {
                            z6 = false;
                            break;
                        }
                    }
                    z6 = true;
                } else {
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = (LazyStaggeredGridMeasuredItem) arrayDequeArr[lane].firstOrNull();
                }
                if (z6) {
                    i19 = i67;
                    i16 = m6255getMaxHeightimpl;
                    long m890getSpanRangelOCCd4c4 = lazyStaggeredGridMeasureContext2.m890getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    ArrayList arrayList2 = arrayList;
                    LazyStaggeredGridMeasuredItem m899getAndMeasurejy6DScQ4 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m899getAndMeasurejy6DScQ(intValue, m890getSpanRangelOCCd4c4);
                    i70 -= m899getAndMeasurejy6DScQ4.getMainAxisSizeWithSpacings();
                    m899getAndMeasurejy6DScQ4.position(i70, 0, min);
                    arrayList2.add(m899getAndMeasurejy6DScQ4);
                    arrayList = arrayList2;
                } else {
                    i19 = i67;
                    i16 = m6255getMaxHeightimpl;
                }
                if (i71 < 0) {
                    break;
                }
                pinnedItems = list3;
                m6255getMaxHeightimpl = i16;
                size2 = i71;
                iArr5 = iArr10;
                i67 = i19;
            }
            list = arrayList;
        } else {
            i16 = m6255getMaxHeightimpl;
            iArr10 = iArr5;
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List<LazyStaggeredGridMeasuredItem> calculateVisibleItems = calculateVisibleItems(lazyStaggeredGridMeasureContext2, arrayDequeArr, copyOf4, min);
        int i73 = copyOf4[0];
        List<Integer> pinnedItems2 = lazyStaggeredGridMeasureContext.getPinnedItems();
        int size3 = pinnedItems2.size();
        int i74 = 0;
        ArrayList arrayList3 = null;
        while (i74 < size3) {
            int intValue2 = pinnedItems2.get(i74).intValue();
            if (intValue2 < i5) {
                int lane2 = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(intValue2);
                if (lane2 != -2 && lane2 != -1) {
                    if (iArr4[lane2] < intValue2) {
                        iArr11 = iArr4;
                        list2 = pinnedItems2;
                    }
                } else {
                    iArr11 = iArr4;
                    int length8 = iArr11.length;
                    list2 = pinnedItems2;
                    int i75 = 0;
                    while (i75 < length8) {
                        i18 = size3;
                        if (!(iArr11[i75] < intValue2)) {
                            z5 = false;
                            break;
                        }
                        i75++;
                        size3 = i18;
                    }
                }
                i18 = size3;
                z5 = true;
                if (z5) {
                    iArr12 = iArr11;
                } else {
                    iArr12 = iArr11;
                    long m890getSpanRangelOCCd4c5 = lazyStaggeredGridMeasureContext2.m890getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    List list4 = arrayList3;
                    LazyStaggeredGridMeasuredItem m899getAndMeasurejy6DScQ5 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m899getAndMeasurejy6DScQ(intValue2, m890getSpanRangelOCCd4c5);
                    m899getAndMeasurejy6DScQ5.position(i73, 0, min);
                    i73 += m899getAndMeasurejy6DScQ5.getMainAxisSizeWithSpacings();
                    list4.add(m899getAndMeasurejy6DScQ5);
                    arrayList3 = list4;
                }
                i74++;
                lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
                pinnedItems2 = list2;
                size3 = i18;
                iArr4 = iArr12;
            }
            iArr11 = iArr4;
            list2 = pinnedItems2;
            i18 = size3;
            z5 = false;
            if (z5) {
            }
            i74++;
            lazyStaggeredGridMeasureContext2 = lazyStaggeredGridMeasureContext;
            pinnedItems2 = list2;
            size3 = i18;
            iArr4 = iArr12;
        }
        int[] iArr26 = iArr4;
        if (arrayList3 == null) {
            arrayList3 = CollectionsKt.emptyList();
        }
        final ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(list);
        arrayList4.addAll(calculateVisibleItems);
        arrayList4.addAll(arrayList3);
        lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().onMeasured((int) scrollToBeConsumed, m6273constrainWidthK40F9xA, i16, arrayList4, lazyStaggeredGridMeasureContext.getMeasuredItemProvider().getKeyIndexMap(), lazyStaggeredGridMeasureContext.getMeasuredItemProvider(), lazyStaggeredGridMeasureContext.getIsVertical(), false, lazyStaggeredGridMeasureContext.getLaneCount(), false, ArraysKt.minOrThrow(iArr3), ArraysKt.maxOrThrow(iArr6) + beforeContentPadding, lazyStaggeredGridMeasureContext.getCoroutineScope(), lazyStaggeredGridMeasureContext.getGraphicsContext());
        long m849getMinSizeToFitDisappearingItemsYbymL2g2 = lazyStaggeredGridMeasureContext.getState().getItemAnimator$foundation_release().m849getMinSizeToFitDisappearingItemsYbymL2g();
        if (IntSize.m6471equalsimpl0(m849getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.INSTANCE.m6478getZeroYbymL2g())) {
            i17 = i16;
        } else {
            int i76 = lazyStaggeredGridMeasureContext.getIsVertical() ? i16 : m6273constrainWidthK40F9xA;
            m6273constrainWidthK40F9xA = ConstraintsKt.m6273constrainWidthK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), Math.max(m6273constrainWidthK40F9xA, IntSize.m6473getWidthimpl(m849getMinSizeToFitDisappearingItemsYbymL2g2)));
            i17 = ConstraintsKt.m6272constrainHeightK40F9xA(lazyStaggeredGridMeasureContext.getConstraints(), Math.max(i16, IntSize.m6472getHeightimpl(m849getMinSizeToFitDisappearingItemsYbymL2g2)));
            int i77 = lazyStaggeredGridMeasureContext.getIsVertical() ? i17 : m6273constrainWidthK40F9xA;
            if (i77 != i76) {
                int size4 = arrayList4.size();
                for (int i78 = 0; i78 < size4; i78++) {
                    arrayList4.get(i78).updateMainAxisLayoutSize(i77);
                }
            }
        }
        int i79 = i9;
        int i80 = 0;
        while (true) {
            if (i80 >= i79) {
                z2 = false;
                break;
            }
            if (iArr6[i80] > lazyStaggeredGridMeasureContext.getMainAxisAvailableSize()) {
                z2 = true;
                break;
            }
            i80++;
        }
        if (!z2) {
            int length9 = iArr26.length;
            int i81 = 0;
            while (true) {
                if (i81 >= length9) {
                    z4 = true;
                    break;
                }
                if (!(iArr26[i81] < i5 + (-1))) {
                    z4 = false;
                    break;
                }
                i81++;
            }
            if (!z4) {
                z3 = false;
                return new LazyStaggeredGridMeasureResult(iArr10, iArr3, scrollToBeConsumed, MeasureScope.layout$default(lazyLayoutMeasureScope, m6273constrainWidthK40F9xA, i17, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        List<LazyStaggeredGridMeasuredItem> list5 = arrayList4;
                        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
                        int size5 = list5.size();
                        for (int i82 = 0; i82 < size5; i82++) {
                            list5.get(i82).place(placementScope, lazyStaggeredGridMeasureContext3);
                        }
                        ObservableScopeInvalidator.m858attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m903getPlacementScopeInvalidatorzYiylxw$foundation_release());
                    }
                }, 4, null), z3, lazyStaggeredGridMeasureContext.getIsVertical(), z8, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope, i5, calculateVisibleItems, IntSizeKt.IntSize(m6273constrainWidthK40F9xA, i17), i48, i7, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
            }
        }
        z3 = true;
        return new LazyStaggeredGridMeasureResult(iArr10, iArr3, scrollToBeConsumed, MeasureScope.layout$default(lazyLayoutMeasureScope, m6273constrainWidthK40F9xA, i17, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt$measure$1$33
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<LazyStaggeredGridMeasuredItem> list5 = arrayList4;
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext3 = lazyStaggeredGridMeasureContext;
                int size5 = list5.size();
                for (int i82 = 0; i82 < size5; i82++) {
                    list5.get(i82).place(placementScope, lazyStaggeredGridMeasureContext3);
                }
                ObservableScopeInvalidator.m858attachToScopeimpl(lazyStaggeredGridMeasureContext.getState().m903getPlacementScopeInvalidatorzYiylxw$foundation_release());
            }
        }, 4, null), z3, lazyStaggeredGridMeasureContext.getIsVertical(), z8, lazyStaggeredGridMeasureContext.getResolvedSlots(), lazyStaggeredGridMeasureContext.getItemProvider().getSpanProvider(), lazyLayoutMeasureScope, i5, calculateVisibleItems, IntSizeKt.IntSize(m6273constrainWidthK40F9xA, i17), i48, i7, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lazyStaggeredGridMeasureContext.getCoroutineScope(), null);
    }

    private static final boolean measure$lambda$41$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (iArr2[i] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i2 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$41$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i) {
        int i2 = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            i2 += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i3 = -1;
                    int i4 = Integer.MAX_VALUE;
                    for (int i5 = 0; i5 < length; i5++) {
                        LazyStaggeredGridMeasuredItem firstOrNull = arrayDequeArr[i5].firstOrNull();
                        int index = firstOrNull != null ? firstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i4 > index) {
                            i3 = i5;
                            i4 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem removeFirst = arrayDequeArr[i3].removeFirst();
                    if (removeFirst.getLane() == i3) {
                        long m905constructorimpl = SpanRange.m905constructorimpl(removeFirst.getLane(), removeFirst.getSpan());
                        int m894maxInRangejy6DScQ = m894maxInRangejy6DScQ(iArr, m905constructorimpl);
                        removeFirst.position(m894maxInRangejy6DScQ, lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i3], i);
                        arrayList.add(removeFirst);
                        int i6 = (int) (m905constructorimpl & 4294967295L);
                        for (int i7 = (int) (m905constructorimpl >> 32); i7 < i6; i7++) {
                            iArr[i7] = removeFirst.getMainAxisSizeWithSpacings() + m894maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function12, boolean z) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    int intValue = pinnedItems.get(size).intValue();
                    if (function12.invoke(Integer.valueOf(intValue)).booleanValue()) {
                        long m890getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m890getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem m899getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m899getAndMeasurejy6DScQ(intValue, m890getSpanRangelOCCd4c);
                        function1.invoke(m899getAndMeasurejy6DScQ);
                        arrayList.add(m899getAndMeasurejy6DScQ);
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int intValue2 = pinnedItems.get(i2).intValue();
                if (function12.invoke(Integer.valueOf(intValue2)).booleanValue()) {
                    long m890getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m890getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), intValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem m899getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m899getAndMeasurejy6DScQ(intValue2, m890getSpanRangelOCCd4c2);
                    function1.invoke(m899getAndMeasurejy6DScQ2);
                    arrayList.add(m899getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m893forEachnIS5qE8(long j, Function1<? super Integer, Unit> function1) {
        int i = (int) (j & 4294967295L);
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            function1.invoke(Integer.valueOf(i2));
        }
    }

    private static final void offsetBy(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m894maxInRangejy6DScQ(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i);
    }

    public static final int indexOfMinValue(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = i + 1;
            int i6 = iArr[i4];
            if (i5 <= i6 && i6 < i3) {
                i2 = i4;
                i3 = i6;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int intValue = function1.invoke(tArr[i3]).intValue();
            if (i2 > intValue) {
                i = i3;
                i2 = intValue;
            }
        }
        return i;
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(Integer.valueOf(iArr[i])).intValue();
        }
        return iArr;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            while (true) {
                if (iArr[length] < i && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i, int i2) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i, i2);
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z, Function1<? super T, Unit> function1) {
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i = size - 1;
                function1.invoke(list.get(size));
                if (i < 0) {
                    return;
                } else {
                    size = i;
                }
            }
        } else {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                function1.invoke(list.get(i2));
            }
        }
    }

    static /* synthetic */ void fastForEach$default(List list, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (z) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i2 = size - 1;
                function1.invoke(list.get(size));
                if (i2 < 0) {
                    return;
                } else {
                    size = i2;
                }
            }
        } else {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                function1.invoke(list.get(i3));
            }
        }
    }
}
