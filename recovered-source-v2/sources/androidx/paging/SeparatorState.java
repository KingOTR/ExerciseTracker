package androidx.paging;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: Separators.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u0002H\u00012\u00020\u0002B[\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012L\u0010\u0006\u001aH\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007¢\u0006\u0002\u0010\rJ\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010;J\"\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010>H\u0086@¢\u0006\u0002\u0010?J\"\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000A2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010AH\u0086@¢\u0006\u0002\u0010BJ\"\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000>2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010DH\u0086@¢\u0006\u0002\u0010EJ\"\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000>2\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010GH\u0086@¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00030%\"\b\b\u0002\u0010\u0003*\u00020\u00022\f\u0010J\u001a\b\u0012\u0004\u0012\u0002H\u00030%H\u0002J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000A*\b\u0012\u0004\u0012\u00028\u00010AJ\"\u0010L\u001a\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00030A2\u0006\u0010\u0004\u001a\u00020\u0005J\"\u0010M\u001a\u00020\u000f\"\b\b\u0002\u0010\u0003*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00030A2\u0006\u0010\u0004\u001a\u00020\u0005R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013RY\u0010\u0006\u001aH\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010%0$¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u00105\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0011\"\u0004\b7\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006N"}, d2 = {"Landroidx/paging/SeparatorState;", "R", "", ExifInterface.GPS_DIRECTION_TRUE, "terminalSeparatorType", "Landroidx/paging/TerminalSeparatorType;", "generator", "Lkotlin/Function3;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "before", "after", "Lkotlin/coroutines/Continuation;", "(Landroidx/paging/TerminalSeparatorType;Lkotlin/jvm/functions/Function3;)V", "endTerminalSeparatorDeferred", "", "getEndTerminalSeparatorDeferred", "()Z", "setEndTerminalSeparatorDeferred", "(Z)V", "footerAdded", "getFooterAdded", "setFooterAdded", "getGenerator", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "headerAdded", "getHeaderAdded", "setHeaderAdded", "mediatorStates", "Landroidx/paging/LoadStates;", "getMediatorStates", "()Landroidx/paging/LoadStates;", "setMediatorStates", "(Landroidx/paging/LoadStates;)V", "pageStash", "", "Landroidx/paging/TransformablePage;", "getPageStash", "()Ljava/util/List;", "placeholdersAfter", "", "getPlaceholdersAfter", "()I", "setPlaceholdersAfter", "(I)V", "placeholdersBefore", "getPlaceholdersBefore", "setPlaceholdersBefore", "sourceStates", "Landroidx/paging/MutableLoadStateCollection;", "getSourceStates", "()Landroidx/paging/MutableLoadStateCollection;", "startTerminalSeparatorDeferred", "getStartTerminalSeparatorDeferred", "setStartTerminalSeparatorDeferred", "getTerminalSeparatorType", "()Landroidx/paging/TerminalSeparatorType;", "onDrop", "Landroidx/paging/PageEvent$Drop;", NotificationCompat.CATEGORY_EVENT, "onEvent", "Landroidx/paging/PageEvent;", "(Landroidx/paging/PageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onInsert", "Landroidx/paging/PageEvent$Insert;", "(Landroidx/paging/PageEvent$Insert;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLoadStateUpdate", "Landroidx/paging/PageEvent$LoadStateUpdate;", "(Landroidx/paging/PageEvent$LoadStateUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStaticList", "Landroidx/paging/PageEvent$StaticList;", "(Landroidx/paging/PageEvent$StaticList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformablePageToStash", "originalPage", "asRType", "terminatesEnd", "terminatesStart", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SeparatorState<R, T extends R> {
    private boolean endTerminalSeparatorDeferred;
    private boolean footerAdded;
    private final Function3<T, T, Continuation<? super R>, Object> generator;
    private boolean headerAdded;
    private LoadStates mediatorStates;
    private final List<TransformablePage<T>> pageStash;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private final MutableLoadStateCollection sourceStates;
    private boolean startTerminalSeparatorDeferred;
    private final TerminalSeparatorType terminalSeparatorType;

    /* compiled from: Separators.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TerminalSeparatorType.values().length];
            try {
                iArr[TerminalSeparatorType.FULLY_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TerminalSeparatorType.SOURCE_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PageEvent.Insert<R> asRType(PageEvent.Insert<T> insert) {
        Intrinsics.checkNotNullParameter(insert, "<this>");
        return insert;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SeparatorState(TerminalSeparatorType terminalSeparatorType, Function3<? super T, ? super T, ? super Continuation<? super R>, ? extends Object> generator) {
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(generator, "generator");
        this.terminalSeparatorType = terminalSeparatorType;
        this.generator = generator;
        this.pageStash = new ArrayList();
        this.sourceStates = new MutableLoadStateCollection();
    }

    public final TerminalSeparatorType getTerminalSeparatorType() {
        return this.terminalSeparatorType;
    }

    public final Function3<T, T, Continuation<? super R>, Object> getGenerator() {
        return this.generator;
    }

    public final List<TransformablePage<T>> getPageStash() {
        return this.pageStash;
    }

    public final boolean getEndTerminalSeparatorDeferred() {
        return this.endTerminalSeparatorDeferred;
    }

    public final void setEndTerminalSeparatorDeferred(boolean z) {
        this.endTerminalSeparatorDeferred = z;
    }

    public final boolean getStartTerminalSeparatorDeferred() {
        return this.startTerminalSeparatorDeferred;
    }

    public final void setStartTerminalSeparatorDeferred(boolean z) {
        this.startTerminalSeparatorDeferred = z;
    }

    public final MutableLoadStateCollection getSourceStates() {
        return this.sourceStates;
    }

    public final LoadStates getMediatorStates() {
        return this.mediatorStates;
    }

    public final void setMediatorStates(LoadStates loadStates) {
        this.mediatorStates = loadStates;
    }

    public final int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    public final void setPlaceholdersBefore(int i) {
        this.placeholdersBefore = i;
    }

    public final int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    public final void setPlaceholdersAfter(int i) {
        this.placeholdersAfter = i;
    }

    public final boolean getFooterAdded() {
        return this.footerAdded;
    }

    public final void setFooterAdded(boolean z) {
        this.footerAdded = z;
    }

    public final boolean getHeaderAdded() {
        return this.headerAdded;
    }

    public final void setHeaderAdded(boolean z) {
        this.headerAdded = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onEvent(PageEvent<T> pageEvent, Continuation<? super PageEvent<R>> continuation) {
        SeparatorState$onEvent$1 separatorState$onEvent$1;
        int i;
        PageEvent.Drop<R> onDrop;
        if (continuation instanceof SeparatorState$onEvent$1) {
            separatorState$onEvent$1 = (SeparatorState$onEvent$1) continuation;
            if ((separatorState$onEvent$1.label & Integer.MIN_VALUE) != 0) {
                separatorState$onEvent$1.label -= Integer.MIN_VALUE;
                Object obj = separatorState$onEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = separatorState$onEvent$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (pageEvent instanceof PageEvent.Insert) {
                        separatorState$onEvent$1.L$0 = this;
                        separatorState$onEvent$1.label = 1;
                        obj = onInsert((PageEvent.Insert) pageEvent, separatorState$onEvent$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        onDrop = (PageEvent) obj;
                    } else if (pageEvent instanceof PageEvent.Drop) {
                        onDrop = onDrop((PageEvent.Drop) pageEvent);
                    } else if (pageEvent instanceof PageEvent.LoadStateUpdate) {
                        separatorState$onEvent$1.L$0 = this;
                        separatorState$onEvent$1.label = 2;
                        obj = onLoadStateUpdate((PageEvent.LoadStateUpdate) pageEvent, separatorState$onEvent$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        onDrop = (PageEvent) obj;
                    } else {
                        if (!(pageEvent instanceof PageEvent.StaticList)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        separatorState$onEvent$1.L$0 = this;
                        separatorState$onEvent$1.label = 3;
                        obj = onStaticList((PageEvent.StaticList) pageEvent, separatorState$onEvent$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        onDrop = (PageEvent) obj;
                    }
                } else if (i == 1) {
                    this = (SeparatorState) separatorState$onEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    onDrop = (PageEvent) obj;
                } else if (i == 2) {
                    this = (SeparatorState) separatorState$onEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    onDrop = (PageEvent) obj;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (SeparatorState) separatorState$onEvent$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    onDrop = (PageEvent) obj;
                }
                if (!this.endTerminalSeparatorDeferred && !this.pageStash.isEmpty()) {
                    throw new IllegalStateException("deferred endTerm, page stash should be empty".toString());
                }
                if (this.startTerminalSeparatorDeferred || this.pageStash.isEmpty()) {
                    return onDrop;
                }
                throw new IllegalStateException("deferred startTerm, page stash should be empty".toString());
            }
        }
        separatorState$onEvent$1 = new SeparatorState$onEvent$1(this, continuation);
        Object obj2 = separatorState$onEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = separatorState$onEvent$1.label;
        if (i != 0) {
        }
        if (!this.endTerminalSeparatorDeferred) {
        }
        if (this.startTerminalSeparatorDeferred) {
        }
        return onDrop;
    }

    public final <T> boolean terminatesStart(PageEvent.Insert<T> insert, TerminalSeparatorType terminalSeparatorType) {
        LoadStates mediatorLoadStates;
        LoadState prepend;
        Intrinsics.checkNotNullParameter(insert, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        if (insert.getLoadType() == LoadType.APPEND) {
            return this.startTerminalSeparatorDeferred;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType.ordinal()];
        if (i == 1) {
            return insert.getSourceLoadStates().getPrepend().getEndOfPaginationReached() && ((mediatorLoadStates = insert.getMediatorLoadStates()) == null || (prepend = mediatorLoadStates.getPrepend()) == null || prepend.getEndOfPaginationReached());
        }
        if (i == 2) {
            return insert.getSourceLoadStates().getPrepend().getEndOfPaginationReached();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final <T> boolean terminatesEnd(PageEvent.Insert<T> insert, TerminalSeparatorType terminalSeparatorType) {
        LoadStates mediatorLoadStates;
        LoadState append;
        Intrinsics.checkNotNullParameter(insert, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        if (insert.getLoadType() == LoadType.PREPEND) {
            return this.endTerminalSeparatorDeferred;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[terminalSeparatorType.ordinal()];
        if (i == 1) {
            return insert.getSourceLoadStates().getAppend().getEndOfPaginationReached() && ((mediatorLoadStates = insert.getMediatorLoadStates()) == null || (append = mediatorLoadStates.getAppend()) == null || append.getEndOfPaginationReached());
        }
        if (i == 2) {
            return insert.getSourceLoadStates().getAppend().getEndOfPaginationReached();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0555 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x077d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x07e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x07b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x068b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x06a7  */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0482 -> B:122:0x0489). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x077e -> B:24:0x077f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x068c -> B:56:0x00d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onInsert(PageEvent.Insert<T> insert, Continuation<? super PageEvent.Insert<R>> continuation) {
        SeparatorState$onInsert$1 separatorState$onInsert$1;
        boolean terminatesEnd;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        TransformablePage<T> transformablePage;
        Integer num;
        TransformablePage<T> transformablePage2;
        Integer num2;
        SeparatorState<R, T> separatorState;
        PageEvent.Insert<T> insert2;
        TransformablePage<T> transformablePage3;
        int i2;
        TransformablePage<T> transformablePage4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj;
        Integer num3;
        TransformablePage<T> transformablePage5;
        TransformablePage<T> transformablePage6;
        Integer num4;
        boolean z;
        List list;
        boolean z2;
        boolean z3;
        int i3;
        SeparatorState$onInsert$1 separatorState$onInsert$12;
        int i4;
        int intValue;
        int i5;
        TransformablePage<T> transformablePage7;
        Integer num5;
        Integer num6;
        TransformablePage<T> transformablePage8;
        boolean z4;
        int i6;
        ArrayList arrayList5;
        Integer num7;
        TransformablePage<T> transformablePage9;
        ArrayList arrayList6;
        Integer num8;
        TransformablePage transformablePage10;
        PageEvent.Insert<T> insert3;
        SeparatorState<R, T> separatorState2;
        Object obj2;
        TransformablePage<T> transformablePage11;
        SeparatorState<R, T> separatorState3;
        ArrayList arrayList7;
        TransformablePage<T> transformablePage12;
        TransformablePage<T> transformablePage13;
        ArrayList arrayList8;
        ArrayList arrayList9;
        PageEvent.Insert<T> insert4;
        SeparatorState<R, T> separatorState4;
        Iterator it;
        Object next;
        Integer num9;
        TransformablePage<T> transformablePage14;
        Iterator it2;
        TransformablePage<T> transformablePage15;
        Object obj3;
        TransformablePage transformablePage16;
        ArrayList arrayList10;
        ArrayList arrayList11;
        PageEvent.Insert<T> insert5;
        SeparatorState<R, T> separatorState5;
        ArrayList arrayList12;
        TransformablePage<T> transformablePage17;
        Integer num10;
        Iterator it3;
        TransformablePage<T> transformablePage18;
        TransformablePage transformablePage19;
        SeparatorState<R, T> separatorState6;
        PageEvent.Insert<T> insert6;
        ArrayList arrayList13;
        ArrayList arrayList14;
        int hintOriginalPageOffset;
        int i7;
        int intValue2;
        int i8;
        TransformablePage transformablePage20;
        PageEvent.Insert<T> insert7;
        SeparatorState<R, T> separatorState7;
        int intValue3;
        int lastIndex;
        boolean z5;
        int i9;
        SeparatorState<R, T> separatorState8;
        PageEvent.Insert<T> insert8;
        int i10;
        int i11;
        TransformablePage<T> transformablePage21;
        ArrayList arrayList15;
        ArrayList arrayList16;
        TransformablePage<T> transformablePage22;
        Object invoke;
        Object obj4;
        TransformablePage<T> transformablePage23;
        ArrayList arrayList17;
        ArrayList arrayList18;
        ArrayList arrayList19;
        ArrayList arrayList20;
        SeparatorState<R, T> separatorState9 = this;
        PageEvent.Insert<T> insert9 = insert;
        if (continuation instanceof SeparatorState$onInsert$1) {
            separatorState$onInsert$1 = (SeparatorState$onInsert$1) continuation;
            if ((separatorState$onInsert$1.label & Integer.MIN_VALUE) != 0) {
                separatorState$onInsert$1.label -= Integer.MIN_VALUE;
                Object obj5 = separatorState$onInsert$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (separatorState$onInsert$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj5);
                        boolean terminatesStart = separatorState9.terminatesStart(insert9, separatorState9.terminalSeparatorType);
                        terminatesEnd = separatorState9.terminatesEnd(insert9, separatorState9.terminalSeparatorType);
                        List<TransformablePage<T>> pages = insert.getPages();
                        if (!(pages instanceof Collection) || !pages.isEmpty()) {
                            Iterator it4 = pages.iterator();
                            while (it4.hasNext()) {
                                if (!((TransformablePage) it4.next()).getData().isEmpty()) {
                                    i = 0;
                                    if (!separatorState9.headerAdded && insert.getLoadType() == LoadType.PREPEND && i == 0) {
                                        throw new IllegalArgumentException("Additional prepend event after prepend state is done".toString());
                                    }
                                    if (!separatorState9.footerAdded && insert.getLoadType() == LoadType.APPEND && i == 0) {
                                        throw new IllegalArgumentException("Additional append event after append state is done".toString());
                                    }
                                    separatorState9.sourceStates.set(insert.getSourceLoadStates());
                                    separatorState9.mediatorStates = insert.getMediatorLoadStates();
                                    if (insert.getLoadType() != LoadType.APPEND) {
                                        separatorState9.placeholdersBefore = insert.getPlaceholdersBefore();
                                    }
                                    if (insert.getLoadType() != LoadType.PREPEND) {
                                        separatorState9.placeholdersAfter = insert.getPlaceholdersAfter();
                                    }
                                    if (i != 0) {
                                        if (!terminatesStart && !terminatesEnd) {
                                            return asRType(insert);
                                        }
                                        if (separatorState9.headerAdded && separatorState9.footerAdded) {
                                            return asRType(insert);
                                        }
                                        if (separatorState9.pageStash.isEmpty()) {
                                            if (terminatesStart && terminatesEnd && !separatorState9.headerAdded && !separatorState9.footerAdded) {
                                                Function3<T, T, Continuation<? super R>, Object> function3 = separatorState9.generator;
                                                separatorState$onInsert$1.L$0 = separatorState9;
                                                separatorState$onInsert$1.L$1 = insert9;
                                                z3 = true;
                                                separatorState$onInsert$1.label = 1;
                                                obj5 = function3.invoke(null, null, separatorState$onInsert$1);
                                                if (obj5 == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                i3 = 0;
                                                separatorState9.endTerminalSeparatorDeferred = i3;
                                                separatorState9.startTerminalSeparatorDeferred = i3;
                                                separatorState9.headerAdded = z3;
                                                separatorState9.footerAdded = z3;
                                                if (obj5 != null) {
                                                    return separatorState9.asRType(insert9);
                                                }
                                                LoadType loadType = insert9.getLoadType();
                                                insert9.getPages();
                                                return new PageEvent.Insert(loadType, CollectionsKt.listOf(SeparatorsKt.separatorPage(obj5, new int[]{i3}, i3, i3)), insert9.getPlaceholdersBefore(), insert9.getPlaceholdersAfter(), insert9.getSourceLoadStates(), insert9.getMediatorLoadStates(), null);
                                            }
                                            if (!terminatesEnd || separatorState9.footerAdded) {
                                                z2 = true;
                                            } else {
                                                z2 = true;
                                                separatorState9.endTerminalSeparatorDeferred = true;
                                            }
                                            if (terminatesStart && !separatorState9.headerAdded) {
                                                separatorState9.startTerminalSeparatorDeferred = z2;
                                            }
                                            return asRType(insert);
                                        }
                                    }
                                    arrayList = new ArrayList(insert.getPages().size());
                                    arrayList2 = new ArrayList(insert.getPages().size());
                                    if (i != 0) {
                                        int i12 = 0;
                                        while (i12 < CollectionsKt.getLastIndex(insert.getPages()) && insert.getPages().get(i12).getData().isEmpty()) {
                                            i12++;
                                        }
                                        num = Boxing.boxInt(i12);
                                        transformablePage = insert.getPages().get(i12);
                                        int lastIndex2 = CollectionsKt.getLastIndex(insert.getPages());
                                        while (lastIndex2 > 0 && insert.getPages().get(lastIndex2).getData().isEmpty()) {
                                            lastIndex2--;
                                        }
                                        num2 = Boxing.boxInt(lastIndex2);
                                        transformablePage2 = insert.getPages().get(lastIndex2);
                                    } else {
                                        transformablePage = null;
                                        num = null;
                                        transformablePage2 = null;
                                        num2 = null;
                                    }
                                    if (terminatesStart || separatorState9.headerAdded) {
                                        separatorState = this;
                                        insert2 = insert9;
                                        if (i != 0) {
                                            Intrinsics.checkNotNull(num);
                                            intValue = num.intValue();
                                            i5 = 0;
                                            Integer num11 = num2;
                                            transformablePage7 = transformablePage;
                                            num5 = num11;
                                            TransformablePage<T> transformablePage24 = transformablePage2;
                                            num6 = num;
                                            transformablePage8 = transformablePage24;
                                            if (i5 < intValue) {
                                                TransformablePage<T> transformablePage25 = insert2.getPages().get(i5);
                                                Function3<T, T, Continuation<? super R>, Object> function32 = separatorState.generator;
                                                separatorState$onInsert$1.L$0 = separatorState;
                                                separatorState$onInsert$1.L$1 = insert2;
                                                separatorState$onInsert$1.L$2 = arrayList;
                                                separatorState$onInsert$1.L$3 = arrayList2;
                                                separatorState$onInsert$1.L$4 = transformablePage7;
                                                separatorState$onInsert$1.L$5 = num6;
                                                separatorState$onInsert$1.L$6 = transformablePage8;
                                                separatorState$onInsert$1.L$7 = num5;
                                                separatorState$onInsert$1.L$8 = arrayList;
                                                Integer num12 = num5;
                                                separatorState$onInsert$1.L$9 = null;
                                                separatorState$onInsert$1.Z$0 = terminatesEnd;
                                                separatorState$onInsert$1.I$0 = i;
                                                separatorState$onInsert$1.I$1 = i5;
                                                separatorState$onInsert$1.I$2 = intValue;
                                                separatorState$onInsert$1.label = 3;
                                                obj5 = SeparatorsKt.insertInternalSeparators(transformablePage25, function32, separatorState$onInsert$1);
                                                if (obj5 == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                separatorState3 = separatorState;
                                                num5 = num12;
                                                arrayList7 = arrayList;
                                                transformablePage12 = transformablePage7;
                                                transformablePage13 = transformablePage8;
                                                arrayList8 = arrayList7;
                                                arrayList8.add(obj5);
                                                i5++;
                                                transformablePage8 = transformablePage13;
                                                transformablePage7 = transformablePage12;
                                                arrayList = arrayList7;
                                                separatorState = separatorState3;
                                                if (i5 < intValue) {
                                                    Integer num13 = num5;
                                                    if (insert2.getLoadType() == LoadType.APPEND && !separatorState.pageStash.isEmpty()) {
                                                        TransformablePage transformablePage26 = (TransformablePage) CollectionsKt.last((List) separatorState.pageStash);
                                                        Function3<T, T, Continuation<? super R>, Object> function33 = separatorState.generator;
                                                        Object last = CollectionsKt.last((List<? extends Object>) transformablePage26.getData());
                                                        Intrinsics.checkNotNull(transformablePage7);
                                                        Object first = CollectionsKt.first((List<? extends Object>) transformablePage7.getData());
                                                        separatorState$onInsert$1.L$0 = separatorState;
                                                        separatorState$onInsert$1.L$1 = insert2;
                                                        separatorState$onInsert$1.L$2 = arrayList;
                                                        separatorState$onInsert$1.L$3 = arrayList2;
                                                        separatorState$onInsert$1.L$4 = transformablePage7;
                                                        separatorState$onInsert$1.L$5 = num6;
                                                        separatorState$onInsert$1.L$6 = transformablePage8;
                                                        num8 = num13;
                                                        separatorState$onInsert$1.L$7 = num8;
                                                        separatorState$onInsert$1.L$8 = transformablePage26;
                                                        separatorState$onInsert$1.L$9 = null;
                                                        separatorState$onInsert$1.Z$0 = terminatesEnd;
                                                        separatorState$onInsert$1.I$0 = i;
                                                        separatorState$onInsert$1.label = 4;
                                                        Object invoke2 = function33.invoke(last, first, separatorState$onInsert$1);
                                                        if (invoke2 == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        transformablePage10 = transformablePage26;
                                                        z4 = terminatesEnd;
                                                        i6 = i;
                                                        insert3 = insert2;
                                                        separatorState2 = separatorState;
                                                        obj2 = invoke2;
                                                        transformablePage11 = transformablePage8;
                                                        ArrayList arrayList21 = arrayList2;
                                                        ArrayList arrayList22 = arrayList;
                                                        Integer num14 = num6;
                                                        transformablePage9 = transformablePage7;
                                                        ArrayList arrayList23 = arrayList22;
                                                        int hintOriginalPageOffset2 = transformablePage9.getHintOriginalPageOffset();
                                                        List<Integer> hintOriginalIndices = transformablePage9.getHintOriginalIndices();
                                                        SeparatorsKt.addSeparatorPage(arrayList23, obj2, transformablePage10, transformablePage9, hintOriginalPageOffset2, hintOriginalIndices == null ? ((Number) CollectionsKt.first((List) hintOriginalIndices)).intValue() : 0);
                                                        transformablePage8 = transformablePage11;
                                                        num6 = num14;
                                                        arrayList6 = arrayList21;
                                                        arrayList5 = arrayList22;
                                                        num7 = num8;
                                                        insert2 = insert3;
                                                        separatorState = separatorState2;
                                                        Intrinsics.checkNotNull(transformablePage9);
                                                        arrayList6.add(separatorState.transformablePageToStash(transformablePage9));
                                                        Function3<T, T, Continuation<? super R>, Object> function34 = separatorState.generator;
                                                        separatorState$onInsert$1.L$0 = separatorState;
                                                        separatorState$onInsert$1.L$1 = insert2;
                                                        separatorState$onInsert$1.L$2 = arrayList5;
                                                        separatorState$onInsert$1.L$3 = arrayList6;
                                                        separatorState$onInsert$1.L$4 = num6;
                                                        separatorState$onInsert$1.L$5 = transformablePage8;
                                                        separatorState$onInsert$1.L$6 = num7;
                                                        separatorState$onInsert$1.L$7 = arrayList5;
                                                        separatorState$onInsert$1.L$8 = null;
                                                        separatorState$onInsert$1.L$9 = null;
                                                        separatorState$onInsert$1.Z$0 = z4;
                                                        separatorState$onInsert$1.I$0 = i6;
                                                        separatorState$onInsert$1.label = 5;
                                                        obj5 = SeparatorsKt.insertInternalSeparators(transformablePage9, function34, separatorState$onInsert$1);
                                                        if (obj5 == coroutine_suspended) {
                                                        }
                                                    } else {
                                                        z4 = terminatesEnd;
                                                        i6 = i;
                                                        arrayList5 = arrayList;
                                                        num7 = num13;
                                                        transformablePage9 = transformablePage7;
                                                        arrayList6 = arrayList2;
                                                        Intrinsics.checkNotNull(transformablePage9);
                                                        arrayList6.add(separatorState.transformablePageToStash(transformablePage9));
                                                        Function3<T, T, Continuation<? super R>, Object> function342 = separatorState.generator;
                                                        separatorState$onInsert$1.L$0 = separatorState;
                                                        separatorState$onInsert$1.L$1 = insert2;
                                                        separatorState$onInsert$1.L$2 = arrayList5;
                                                        separatorState$onInsert$1.L$3 = arrayList6;
                                                        separatorState$onInsert$1.L$4 = num6;
                                                        separatorState$onInsert$1.L$5 = transformablePage8;
                                                        separatorState$onInsert$1.L$6 = num7;
                                                        separatorState$onInsert$1.L$7 = arrayList5;
                                                        separatorState$onInsert$1.L$8 = null;
                                                        separatorState$onInsert$1.L$9 = null;
                                                        separatorState$onInsert$1.Z$0 = z4;
                                                        separatorState$onInsert$1.I$0 = i6;
                                                        separatorState$onInsert$1.label = 5;
                                                        obj5 = SeparatorsKt.insertInternalSeparators(transformablePage9, function342, separatorState$onInsert$1);
                                                        if (obj5 == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        arrayList9 = arrayList5;
                                                        insert4 = insert2;
                                                        separatorState4 = separatorState;
                                                        arrayList5.add(obj5);
                                                        List<TransformablePage<T>> pages2 = insert4.getPages();
                                                        int intValue4 = num6.intValue();
                                                        Intrinsics.checkNotNull(num7);
                                                        it = pages2.subList(intValue4, num7.intValue() + 1).iterator();
                                                        if (it.hasNext()) {
                                                            throw new UnsupportedOperationException("Empty collection can't be reduced.");
                                                        }
                                                        next = it.next();
                                                        num9 = num7;
                                                        separatorState = separatorState4;
                                                        insert2 = insert4;
                                                        arrayList = arrayList9;
                                                        arrayList2 = arrayList6;
                                                        transformablePage14 = transformablePage8;
                                                        it2 = it;
                                                        if (it2.hasNext()) {
                                                            transformablePage15 = (TransformablePage) it2.next();
                                                            TransformablePage transformablePage27 = (TransformablePage) next;
                                                            if (!transformablePage15.getData().isEmpty()) {
                                                                Function3<T, T, Continuation<? super R>, Object> function35 = separatorState.generator;
                                                                Object last2 = CollectionsKt.last((List<? extends Object>) transformablePage27.getData());
                                                                Object first2 = CollectionsKt.first((List<? extends Object>) transformablePage15.getData());
                                                                separatorState$onInsert$1.L$0 = separatorState;
                                                                separatorState$onInsert$1.L$1 = insert2;
                                                                separatorState$onInsert$1.L$2 = arrayList;
                                                                separatorState$onInsert$1.L$3 = arrayList2;
                                                                separatorState$onInsert$1.L$4 = transformablePage14;
                                                                separatorState$onInsert$1.L$5 = num9;
                                                                separatorState$onInsert$1.L$6 = it2;
                                                                separatorState$onInsert$1.L$7 = transformablePage15;
                                                                separatorState$onInsert$1.L$8 = transformablePage27;
                                                                separatorState$onInsert$1.L$9 = null;
                                                                separatorState$onInsert$1.Z$0 = z4;
                                                                separatorState$onInsert$1.I$0 = i6;
                                                                separatorState$onInsert$1.label = 6;
                                                                Object invoke3 = function35.invoke(last2, first2, separatorState$onInsert$1);
                                                                if (invoke3 == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                                obj3 = invoke3;
                                                                arrayList10 = arrayList2;
                                                                arrayList11 = arrayList;
                                                                insert5 = insert2;
                                                                separatorState5 = separatorState;
                                                                transformablePage16 = transformablePage27;
                                                                TransformablePage<T> transformablePage28 = transformablePage15;
                                                                Iterator it5 = it2;
                                                                Integer num15 = num9;
                                                                TransformablePage<T> transformablePage29 = transformablePage14;
                                                                ArrayList arrayList24 = arrayList11;
                                                                if (insert5.getLoadType() != LoadType.PREPEND) {
                                                                    hintOriginalPageOffset = transformablePage16.getHintOriginalPageOffset();
                                                                } else {
                                                                    hintOriginalPageOffset = transformablePage28.getHintOriginalPageOffset();
                                                                }
                                                                int i13 = hintOriginalPageOffset;
                                                                if (insert5.getLoadType() == LoadType.PREPEND) {
                                                                    List<Integer> hintOriginalIndices2 = transformablePage16.getHintOriginalIndices();
                                                                    intValue2 = hintOriginalIndices2 != null ? ((Number) CollectionsKt.last((List) hintOriginalIndices2)).intValue() : CollectionsKt.getLastIndex(transformablePage16.getData());
                                                                } else {
                                                                    List<Integer> hintOriginalIndices3 = transformablePage28.getHintOriginalIndices();
                                                                    if (hintOriginalIndices3 != null) {
                                                                        intValue2 = ((Number) CollectionsKt.first((List) hintOriginalIndices3)).intValue();
                                                                    } else {
                                                                        i7 = 0;
                                                                        SeparatorsKt.addSeparatorPage(arrayList24, obj3, transformablePage16, transformablePage28, i13, i7);
                                                                        transformablePage19 = transformablePage16;
                                                                        transformablePage18 = transformablePage28;
                                                                        it3 = it5;
                                                                        num10 = num15;
                                                                        transformablePage17 = transformablePage29;
                                                                        arrayList12 = arrayList10;
                                                                        arrayList13 = arrayList11;
                                                                        insert6 = insert5;
                                                                        separatorState6 = separatorState5;
                                                                        if (!transformablePage18.getData().isEmpty()) {
                                                                            arrayList12.add(separatorState6.transformablePageToStash(transformablePage18));
                                                                        }
                                                                        Function3<T, T, Continuation<? super R>, Object> function36 = separatorState6.generator;
                                                                        separatorState$onInsert$1.L$0 = separatorState6;
                                                                        separatorState$onInsert$1.L$1 = insert6;
                                                                        separatorState$onInsert$1.L$2 = arrayList13;
                                                                        separatorState$onInsert$1.L$3 = arrayList12;
                                                                        separatorState$onInsert$1.L$4 = transformablePage17;
                                                                        separatorState$onInsert$1.L$5 = num10;
                                                                        separatorState$onInsert$1.L$6 = it3;
                                                                        separatorState$onInsert$1.L$7 = transformablePage18;
                                                                        separatorState$onInsert$1.L$8 = transformablePage19;
                                                                        separatorState$onInsert$1.L$9 = arrayList13;
                                                                        separatorState$onInsert$1.Z$0 = z4;
                                                                        separatorState$onInsert$1.I$0 = i6;
                                                                        separatorState$onInsert$1.label = 7;
                                                                        obj5 = SeparatorsKt.insertInternalSeparators(transformablePage18, function36, separatorState$onInsert$1);
                                                                        if (obj5 != coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                        arrayList14 = arrayList13;
                                                                        ArrayList arrayList25 = arrayList12;
                                                                        separatorState = separatorState6;
                                                                        it2 = it3;
                                                                        arrayList2 = arrayList25;
                                                                        arrayList13.add(obj5);
                                                                        next = transformablePage18.getData().isEmpty() ? transformablePage18 : transformablePage19;
                                                                        num9 = num10;
                                                                        transformablePage14 = transformablePage17;
                                                                        arrayList = arrayList14;
                                                                        insert2 = insert6;
                                                                        if (it2.hasNext()) {
                                                                            if (insert2.getLoadType() == LoadType.PREPEND && !separatorState.pageStash.isEmpty()) {
                                                                                transformablePage20 = (TransformablePage) CollectionsKt.first((List) separatorState.pageStash);
                                                                                Function3<T, T, Continuation<? super R>, Object> function37 = separatorState.generator;
                                                                                Intrinsics.checkNotNull(transformablePage14);
                                                                                Object last3 = CollectionsKt.last((List<? extends Object>) transformablePage14.getData());
                                                                                Object first3 = CollectionsKt.first((List<? extends Object>) transformablePage20.getData());
                                                                                separatorState$onInsert$1.L$0 = separatorState;
                                                                                separatorState$onInsert$1.L$1 = insert2;
                                                                                separatorState$onInsert$1.L$2 = arrayList;
                                                                                separatorState$onInsert$1.L$3 = arrayList2;
                                                                                separatorState$onInsert$1.L$4 = transformablePage14;
                                                                                separatorState$onInsert$1.L$5 = num9;
                                                                                separatorState$onInsert$1.L$6 = transformablePage20;
                                                                                separatorState$onInsert$1.L$7 = null;
                                                                                separatorState$onInsert$1.L$8 = null;
                                                                                separatorState$onInsert$1.L$9 = null;
                                                                                separatorState$onInsert$1.Z$0 = z4;
                                                                                separatorState$onInsert$1.I$0 = i6;
                                                                                separatorState$onInsert$1.label = 8;
                                                                                obj5 = function37.invoke(last3, first3, separatorState$onInsert$1);
                                                                                if (obj5 == coroutine_suspended) {
                                                                                    return coroutine_suspended;
                                                                                }
                                                                                Object obj6 = obj5;
                                                                                TransformablePage transformablePage30 = transformablePage20;
                                                                                Integer num16 = num9;
                                                                                SeparatorState<R, T> separatorState10 = separatorState;
                                                                                PageEvent.Insert<T> insert10 = insert2;
                                                                                ArrayList arrayList26 = arrayList;
                                                                                ArrayList arrayList27 = arrayList2;
                                                                                TransformablePage<T> transformablePage31 = transformablePage14;
                                                                                ArrayList arrayList28 = arrayList26;
                                                                                int hintOriginalPageOffset3 = transformablePage31.getHintOriginalPageOffset();
                                                                                List<Integer> hintOriginalIndices4 = transformablePage31.getHintOriginalIndices();
                                                                                SeparatorsKt.addSeparatorPage(arrayList28, obj6, transformablePage31, transformablePage30, hintOriginalPageOffset3, hintOriginalIndices4 == null ? ((Number) CollectionsKt.last((List) hintOriginalIndices4)).intValue() : CollectionsKt.getLastIndex(transformablePage31.getData()));
                                                                                i8 = i6;
                                                                                terminatesEnd = z4;
                                                                                num9 = num16;
                                                                                transformablePage14 = transformablePage31;
                                                                                arrayList2 = arrayList27;
                                                                                arrayList = arrayList26;
                                                                                insert2 = insert10;
                                                                                separatorState = separatorState10;
                                                                                intValue3 = num9.intValue() + 1;
                                                                                lastIndex = CollectionsKt.getLastIndex(insert2.getPages());
                                                                                if (intValue3 <= lastIndex) {
                                                                                }
                                                                            } else {
                                                                                i8 = i6;
                                                                                terminatesEnd = z4;
                                                                                intValue3 = num9.intValue() + 1;
                                                                                lastIndex = CollectionsKt.getLastIndex(insert2.getPages());
                                                                                if (intValue3 <= lastIndex) {
                                                                                    z5 = terminatesEnd;
                                                                                    i9 = i8;
                                                                                    separatorState8 = separatorState;
                                                                                    insert8 = insert2;
                                                                                    i10 = intValue3;
                                                                                    i11 = lastIndex;
                                                                                    ArrayList arrayList29 = arrayList2;
                                                                                    transformablePage21 = transformablePage14;
                                                                                    arrayList15 = arrayList;
                                                                                    arrayList16 = arrayList29;
                                                                                    TransformablePage<T> transformablePage32 = insert8.getPages().get(i10);
                                                                                    Function3<T, T, Continuation<? super R>, Object> function38 = separatorState8.generator;
                                                                                    separatorState$onInsert$1.L$0 = separatorState8;
                                                                                    separatorState$onInsert$1.L$1 = insert8;
                                                                                    separatorState$onInsert$1.L$2 = arrayList15;
                                                                                    separatorState$onInsert$1.L$3 = arrayList16;
                                                                                    separatorState$onInsert$1.L$4 = transformablePage21;
                                                                                    separatorState$onInsert$1.L$5 = arrayList15;
                                                                                    separatorState$onInsert$1.L$6 = null;
                                                                                    separatorState$onInsert$1.L$7 = null;
                                                                                    separatorState$onInsert$1.L$8 = null;
                                                                                    separatorState$onInsert$1.L$9 = null;
                                                                                    separatorState$onInsert$1.Z$0 = z5;
                                                                                    separatorState$onInsert$1.I$0 = i9;
                                                                                    separatorState$onInsert$1.I$1 = i10;
                                                                                    separatorState$onInsert$1.I$2 = i11;
                                                                                    separatorState$onInsert$1.label = 9;
                                                                                    obj5 = SeparatorsKt.insertInternalSeparators(transformablePage32, function38, separatorState$onInsert$1);
                                                                                    if (obj5 != coroutine_suspended) {
                                                                                        return coroutine_suspended;
                                                                                    }
                                                                                    arrayList20 = arrayList15;
                                                                                    arrayList15.add(obj5);
                                                                                    if (i10 == i11) {
                                                                                        i10++;
                                                                                        arrayList15 = arrayList20;
                                                                                        TransformablePage<T> transformablePage322 = insert8.getPages().get(i10);
                                                                                        Function3<T, T, Continuation<? super R>, Object> function382 = separatorState8.generator;
                                                                                        separatorState$onInsert$1.L$0 = separatorState8;
                                                                                        separatorState$onInsert$1.L$1 = insert8;
                                                                                        separatorState$onInsert$1.L$2 = arrayList15;
                                                                                        separatorState$onInsert$1.L$3 = arrayList16;
                                                                                        separatorState$onInsert$1.L$4 = transformablePage21;
                                                                                        separatorState$onInsert$1.L$5 = arrayList15;
                                                                                        separatorState$onInsert$1.L$6 = null;
                                                                                        separatorState$onInsert$1.L$7 = null;
                                                                                        separatorState$onInsert$1.L$8 = null;
                                                                                        separatorState$onInsert$1.L$9 = null;
                                                                                        separatorState$onInsert$1.Z$0 = z5;
                                                                                        separatorState$onInsert$1.I$0 = i9;
                                                                                        separatorState$onInsert$1.I$1 = i10;
                                                                                        separatorState$onInsert$1.I$2 = i11;
                                                                                        separatorState$onInsert$1.label = 9;
                                                                                        obj5 = SeparatorsKt.insertInternalSeparators(transformablePage322, function382, separatorState$onInsert$1);
                                                                                        if (obj5 != coroutine_suspended) {
                                                                                        }
                                                                                    } else {
                                                                                        separatorState$onInsert$12 = separatorState$onInsert$1;
                                                                                        i4 = i9;
                                                                                        terminatesEnd = z5;
                                                                                        transformablePage2 = transformablePage21;
                                                                                        arrayList2 = arrayList16;
                                                                                        arrayList = arrayList20;
                                                                                        insert7 = insert8;
                                                                                        separatorState7 = separatorState8;
                                                                                        if (terminatesEnd && !separatorState7.footerAdded) {
                                                                                            separatorState7.footerAdded = true;
                                                                                            if (i4 == 0) {
                                                                                                transformablePage22 = (TransformablePage) CollectionsKt.last((List) separatorState7.pageStash);
                                                                                            } else {
                                                                                                Intrinsics.checkNotNull(transformablePage2);
                                                                                                transformablePage22 = transformablePage2;
                                                                                            }
                                                                                            ArrayList arrayList30 = arrayList;
                                                                                            Function3<T, T, Continuation<? super R>, Object> function39 = separatorState7.generator;
                                                                                            Object last4 = CollectionsKt.last((List<? extends Object>) transformablePage22.getData());
                                                                                            separatorState$onInsert$12.L$0 = separatorState7;
                                                                                            separatorState$onInsert$12.L$1 = insert7;
                                                                                            separatorState$onInsert$12.L$2 = arrayList;
                                                                                            separatorState$onInsert$12.L$3 = arrayList2;
                                                                                            separatorState$onInsert$12.L$4 = transformablePage22;
                                                                                            separatorState$onInsert$12.L$5 = arrayList30;
                                                                                            separatorState$onInsert$12.L$6 = null;
                                                                                            separatorState$onInsert$12.L$7 = null;
                                                                                            separatorState$onInsert$12.L$8 = null;
                                                                                            separatorState$onInsert$12.L$9 = null;
                                                                                            separatorState$onInsert$12.label = 10;
                                                                                            invoke = function39.invoke(last4, null, separatorState$onInsert$12);
                                                                                            if (invoke != coroutine_suspended) {
                                                                                                return coroutine_suspended;
                                                                                            }
                                                                                            obj4 = invoke;
                                                                                            transformablePage23 = transformablePage22;
                                                                                            arrayList17 = arrayList30;
                                                                                            arrayList18 = arrayList2;
                                                                                            arrayList19 = arrayList;
                                                                                            int hintOriginalPageOffset4 = transformablePage23.getHintOriginalPageOffset();
                                                                                            List<Integer> hintOriginalIndices5 = transformablePage23.getHintOriginalIndices();
                                                                                            SeparatorsKt.addSeparatorPage(arrayList17, obj4, transformablePage23, null, hintOriginalPageOffset4, hintOriginalIndices5 == null ? ((Number) CollectionsKt.last((List) hintOriginalIndices5)).intValue() : CollectionsKt.getLastIndex(transformablePage23.getData()));
                                                                                            arrayList2 = arrayList18;
                                                                                            arrayList = arrayList19;
                                                                                        }
                                                                                        separatorState7.endTerminalSeparatorDeferred = false;
                                                                                        separatorState7.startTerminalSeparatorDeferred = false;
                                                                                        if (insert7.getLoadType() != LoadType.APPEND) {
                                                                                            separatorState7.pageStash.addAll(arrayList2);
                                                                                        } else {
                                                                                            separatorState7.pageStash.addAll(0, arrayList2);
                                                                                        }
                                                                                        LoadType loadType2 = insert7.getLoadType();
                                                                                        insert7.getPages();
                                                                                        return new PageEvent.Insert(loadType2, arrayList, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                                                                                    }
                                                                                } else {
                                                                                    separatorState$onInsert$12 = separatorState$onInsert$1;
                                                                                    i4 = i8;
                                                                                    transformablePage2 = transformablePage14;
                                                                                    insert7 = insert2;
                                                                                    separatorState7 = separatorState;
                                                                                    if (terminatesEnd) {
                                                                                        separatorState7.footerAdded = true;
                                                                                        if (i4 == 0) {
                                                                                        }
                                                                                        ArrayList arrayList302 = arrayList;
                                                                                        Function3<T, T, Continuation<? super R>, Object> function392 = separatorState7.generator;
                                                                                        Object last42 = CollectionsKt.last((List<? extends Object>) transformablePage22.getData());
                                                                                        separatorState$onInsert$12.L$0 = separatorState7;
                                                                                        separatorState$onInsert$12.L$1 = insert7;
                                                                                        separatorState$onInsert$12.L$2 = arrayList;
                                                                                        separatorState$onInsert$12.L$3 = arrayList2;
                                                                                        separatorState$onInsert$12.L$4 = transformablePage22;
                                                                                        separatorState$onInsert$12.L$5 = arrayList302;
                                                                                        separatorState$onInsert$12.L$6 = null;
                                                                                        separatorState$onInsert$12.L$7 = null;
                                                                                        separatorState$onInsert$12.L$8 = null;
                                                                                        separatorState$onInsert$12.L$9 = null;
                                                                                        separatorState$onInsert$12.label = 10;
                                                                                        invoke = function392.invoke(last42, null, separatorState$onInsert$12);
                                                                                        if (invoke != coroutine_suspended) {
                                                                                        }
                                                                                    }
                                                                                    separatorState7.endTerminalSeparatorDeferred = false;
                                                                                    separatorState7.startTerminalSeparatorDeferred = false;
                                                                                    if (insert7.getLoadType() != LoadType.APPEND) {
                                                                                    }
                                                                                    LoadType loadType22 = insert7.getLoadType();
                                                                                    insert7.getPages();
                                                                                    return new PageEvent.Insert(loadType22, arrayList, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i7 = intValue2;
                                                                SeparatorsKt.addSeparatorPage(arrayList24, obj3, transformablePage16, transformablePage28, i13, i7);
                                                                transformablePage19 = transformablePage16;
                                                                transformablePage18 = transformablePage28;
                                                                it3 = it5;
                                                                num10 = num15;
                                                                transformablePage17 = transformablePage29;
                                                                arrayList12 = arrayList10;
                                                                arrayList13 = arrayList11;
                                                                insert6 = insert5;
                                                                separatorState6 = separatorState5;
                                                                if (!transformablePage18.getData().isEmpty()) {
                                                                }
                                                                Function3<T, T, Continuation<? super R>, Object> function362 = separatorState6.generator;
                                                                separatorState$onInsert$1.L$0 = separatorState6;
                                                                separatorState$onInsert$1.L$1 = insert6;
                                                                separatorState$onInsert$1.L$2 = arrayList13;
                                                                separatorState$onInsert$1.L$3 = arrayList12;
                                                                separatorState$onInsert$1.L$4 = transformablePage17;
                                                                separatorState$onInsert$1.L$5 = num10;
                                                                separatorState$onInsert$1.L$6 = it3;
                                                                separatorState$onInsert$1.L$7 = transformablePage18;
                                                                separatorState$onInsert$1.L$8 = transformablePage19;
                                                                separatorState$onInsert$1.L$9 = arrayList13;
                                                                separatorState$onInsert$1.Z$0 = z4;
                                                                separatorState$onInsert$1.I$0 = i6;
                                                                separatorState$onInsert$1.label = 7;
                                                                obj5 = SeparatorsKt.insertInternalSeparators(transformablePage18, function362, separatorState$onInsert$1);
                                                                if (obj5 != coroutine_suspended) {
                                                                }
                                                            } else {
                                                                arrayList13 = arrayList;
                                                                num10 = num9;
                                                                transformablePage19 = transformablePage27;
                                                                TransformablePage<T> transformablePage33 = transformablePage14;
                                                                transformablePage18 = transformablePage15;
                                                                insert6 = insert2;
                                                                transformablePage17 = transformablePage33;
                                                                ArrayList arrayList31 = arrayList2;
                                                                it3 = it2;
                                                                separatorState6 = separatorState;
                                                                arrayList12 = arrayList31;
                                                                if (!transformablePage18.getData().isEmpty()) {
                                                                }
                                                                Function3<T, T, Continuation<? super R>, Object> function3622 = separatorState6.generator;
                                                                separatorState$onInsert$1.L$0 = separatorState6;
                                                                separatorState$onInsert$1.L$1 = insert6;
                                                                separatorState$onInsert$1.L$2 = arrayList13;
                                                                separatorState$onInsert$1.L$3 = arrayList12;
                                                                separatorState$onInsert$1.L$4 = transformablePage17;
                                                                separatorState$onInsert$1.L$5 = num10;
                                                                separatorState$onInsert$1.L$6 = it3;
                                                                separatorState$onInsert$1.L$7 = transformablePage18;
                                                                separatorState$onInsert$1.L$8 = transformablePage19;
                                                                separatorState$onInsert$1.L$9 = arrayList13;
                                                                separatorState$onInsert$1.Z$0 = z4;
                                                                separatorState$onInsert$1.I$0 = i6;
                                                                separatorState$onInsert$1.label = 7;
                                                                obj5 = SeparatorsKt.insertInternalSeparators(transformablePage18, function3622, separatorState$onInsert$1);
                                                                if (obj5 != coroutine_suspended) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            separatorState$onInsert$12 = separatorState$onInsert$1;
                                            i4 = i;
                                            insert7 = insert2;
                                            separatorState7 = separatorState;
                                            if (terminatesEnd) {
                                            }
                                            separatorState7.endTerminalSeparatorDeferred = false;
                                            separatorState7.startTerminalSeparatorDeferred = false;
                                            if (insert7.getLoadType() != LoadType.APPEND) {
                                            }
                                            LoadType loadType222 = insert7.getLoadType();
                                            insert7.getPages();
                                            return new PageEvent.Insert(loadType222, arrayList, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                                        }
                                    } else {
                                        separatorState9.headerAdded = true;
                                        if (i != 0) {
                                            transformablePage3 = (TransformablePage) CollectionsKt.first((List) separatorState9.pageStash);
                                        } else {
                                            Intrinsics.checkNotNull(transformablePage);
                                            transformablePage3 = transformablePage;
                                        }
                                        ArrayList arrayList32 = arrayList;
                                        Function3<T, T, Continuation<? super R>, Object> function310 = separatorState9.generator;
                                        Object first4 = CollectionsKt.first((List<? extends Object>) transformablePage3.getData());
                                        separatorState$onInsert$1.L$0 = separatorState9;
                                        separatorState$onInsert$1.L$1 = insert9;
                                        separatorState$onInsert$1.L$2 = arrayList;
                                        separatorState$onInsert$1.L$3 = arrayList2;
                                        separatorState$onInsert$1.L$4 = transformablePage;
                                        separatorState$onInsert$1.L$5 = num;
                                        separatorState$onInsert$1.L$6 = transformablePage2;
                                        separatorState$onInsert$1.L$7 = num2;
                                        separatorState$onInsert$1.L$8 = transformablePage3;
                                        separatorState$onInsert$1.L$9 = arrayList32;
                                        separatorState$onInsert$1.Z$0 = terminatesEnd;
                                        separatorState$onInsert$1.I$0 = i;
                                        separatorState$onInsert$1.label = 2;
                                        Object invoke4 = function310.invoke(null, first4, separatorState$onInsert$1);
                                        if (invoke4 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        i2 = i;
                                        transformablePage4 = transformablePage;
                                        arrayList3 = arrayList2;
                                        arrayList4 = arrayList;
                                        obj = invoke4;
                                        separatorState = this;
                                        num3 = num;
                                        transformablePage5 = transformablePage2;
                                        transformablePage6 = transformablePage3;
                                        num4 = num2;
                                        insert2 = insert9;
                                        z = terminatesEnd;
                                        list = arrayList32;
                                        int hintOriginalPageOffset5 = transformablePage6.getHintOriginalPageOffset();
                                        List<Integer> hintOriginalIndices6 = transformablePage6.getHintOriginalIndices();
                                        SeparatorsKt.addSeparatorPage(list, obj, null, transformablePage6, hintOriginalPageOffset5, hintOriginalIndices6 == null ? ((Number) CollectionsKt.first((List) hintOriginalIndices6)).intValue() : 0);
                                        i = i2;
                                        terminatesEnd = z;
                                        num2 = num4;
                                        transformablePage2 = transformablePage5;
                                        num = num3;
                                        transformablePage = transformablePage4;
                                        arrayList2 = arrayList3;
                                        arrayList = arrayList4;
                                        if (i != 0) {
                                        }
                                    }
                                }
                            }
                        }
                        i = 1;
                        if (!separatorState9.headerAdded) {
                        }
                        if (!separatorState9.footerAdded) {
                        }
                        separatorState9.sourceStates.set(insert.getSourceLoadStates());
                        separatorState9.mediatorStates = insert.getMediatorLoadStates();
                        if (insert.getLoadType() != LoadType.APPEND) {
                        }
                        if (insert.getLoadType() != LoadType.PREPEND) {
                        }
                        if (i != 0) {
                        }
                        arrayList = new ArrayList(insert.getPages().size());
                        arrayList2 = new ArrayList(insert.getPages().size());
                        if (i != 0) {
                        }
                        if (terminatesStart) {
                        }
                        separatorState = this;
                        insert2 = insert9;
                        if (i != 0) {
                        }
                        break;
                    case 1:
                        PageEvent.Insert<T> insert11 = (PageEvent.Insert) separatorState$onInsert$1.L$1;
                        SeparatorState<R, T> separatorState11 = (SeparatorState) separatorState$onInsert$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        i3 = 0;
                        z3 = true;
                        insert9 = insert11;
                        separatorState9 = separatorState11;
                        separatorState9.endTerminalSeparatorDeferred = i3;
                        separatorState9.startTerminalSeparatorDeferred = i3;
                        separatorState9.headerAdded = z3;
                        separatorState9.footerAdded = z3;
                        if (obj5 != null) {
                        }
                        break;
                    case 2:
                        i2 = separatorState$onInsert$1.I$0;
                        z = separatorState$onInsert$1.Z$0;
                        list = (List) separatorState$onInsert$1.L$9;
                        TransformablePage<T> transformablePage34 = (TransformablePage) separatorState$onInsert$1.L$8;
                        Integer num17 = (Integer) separatorState$onInsert$1.L$7;
                        TransformablePage<T> transformablePage35 = (TransformablePage) separatorState$onInsert$1.L$6;
                        Integer num18 = (Integer) separatorState$onInsert$1.L$5;
                        TransformablePage<T> transformablePage36 = (TransformablePage) separatorState$onInsert$1.L$4;
                        ArrayList arrayList33 = (ArrayList) separatorState$onInsert$1.L$3;
                        ArrayList arrayList34 = (ArrayList) separatorState$onInsert$1.L$2;
                        insert2 = (PageEvent.Insert) separatorState$onInsert$1.L$1;
                        separatorState = (SeparatorState) separatorState$onInsert$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        transformablePage4 = transformablePage36;
                        arrayList3 = arrayList33;
                        arrayList4 = arrayList34;
                        transformablePage5 = transformablePage35;
                        num3 = num18;
                        transformablePage6 = transformablePage34;
                        obj = obj5;
                        num4 = num17;
                        int hintOriginalPageOffset52 = transformablePage6.getHintOriginalPageOffset();
                        List<Integer> hintOriginalIndices62 = transformablePage6.getHintOriginalIndices();
                        SeparatorsKt.addSeparatorPage(list, obj, null, transformablePage6, hintOriginalPageOffset52, hintOriginalIndices62 == null ? ((Number) CollectionsKt.first((List) hintOriginalIndices62)).intValue() : 0);
                        i = i2;
                        terminatesEnd = z;
                        num2 = num4;
                        transformablePage2 = transformablePage5;
                        num = num3;
                        transformablePage = transformablePage4;
                        arrayList2 = arrayList3;
                        arrayList = arrayList4;
                        if (i != 0) {
                        }
                        break;
                    case 3:
                        intValue = separatorState$onInsert$1.I$2;
                        i5 = separatorState$onInsert$1.I$1;
                        int i14 = separatorState$onInsert$1.I$0;
                        boolean z6 = separatorState$onInsert$1.Z$0;
                        arrayList8 = (ArrayList) separatorState$onInsert$1.L$8;
                        Integer num19 = (Integer) separatorState$onInsert$1.L$7;
                        transformablePage13 = (TransformablePage) separatorState$onInsert$1.L$6;
                        Integer num20 = (Integer) separatorState$onInsert$1.L$5;
                        transformablePage12 = (TransformablePage) separatorState$onInsert$1.L$4;
                        ArrayList arrayList35 = (ArrayList) separatorState$onInsert$1.L$3;
                        arrayList7 = (ArrayList) separatorState$onInsert$1.L$2;
                        PageEvent.Insert<T> insert12 = (PageEvent.Insert) separatorState$onInsert$1.L$1;
                        SeparatorState<R, T> separatorState12 = (SeparatorState) separatorState$onInsert$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        i = i14;
                        terminatesEnd = z6;
                        num5 = num19;
                        num6 = num20;
                        arrayList2 = arrayList35;
                        insert2 = insert12;
                        separatorState3 = separatorState12;
                        arrayList8.add(obj5);
                        i5++;
                        transformablePage8 = transformablePage13;
                        transformablePage7 = transformablePage12;
                        arrayList = arrayList7;
                        separatorState = separatorState3;
                        if (i5 < intValue) {
                        }
                        break;
                    case 4:
                        i6 = separatorState$onInsert$1.I$0;
                        z4 = separatorState$onInsert$1.Z$0;
                        TransformablePage transformablePage37 = (TransformablePage) separatorState$onInsert$1.L$8;
                        Integer num21 = (Integer) separatorState$onInsert$1.L$7;
                        TransformablePage<T> transformablePage38 = (TransformablePage) separatorState$onInsert$1.L$6;
                        num6 = (Integer) separatorState$onInsert$1.L$5;
                        transformablePage7 = (TransformablePage) separatorState$onInsert$1.L$4;
                        arrayList2 = (ArrayList) separatorState$onInsert$1.L$3;
                        arrayList = (ArrayList) separatorState$onInsert$1.L$2;
                        PageEvent.Insert<T> insert13 = (PageEvent.Insert) separatorState$onInsert$1.L$1;
                        SeparatorState<R, T> separatorState13 = (SeparatorState) separatorState$onInsert$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        obj2 = obj5;
                        num8 = num21;
                        transformablePage11 = transformablePage38;
                        insert3 = insert13;
                        separatorState2 = separatorState13;
                        transformablePage10 = transformablePage37;
                        ArrayList arrayList212 = arrayList2;
                        ArrayList arrayList222 = arrayList;
                        Integer num142 = num6;
                        transformablePage9 = transformablePage7;
                        ArrayList arrayList232 = arrayList222;
                        int hintOriginalPageOffset22 = transformablePage9.getHintOriginalPageOffset();
                        List<Integer> hintOriginalIndices7 = transformablePage9.getHintOriginalIndices();
                        SeparatorsKt.addSeparatorPage(arrayList232, obj2, transformablePage10, transformablePage9, hintOriginalPageOffset22, hintOriginalIndices7 == null ? ((Number) CollectionsKt.first((List) hintOriginalIndices7)).intValue() : 0);
                        transformablePage8 = transformablePage11;
                        num6 = num142;
                        arrayList6 = arrayList212;
                        arrayList5 = arrayList222;
                        num7 = num8;
                        insert2 = insert3;
                        separatorState = separatorState2;
                        Intrinsics.checkNotNull(transformablePage9);
                        arrayList6.add(separatorState.transformablePageToStash(transformablePage9));
                        Function3<T, T, Continuation<? super R>, Object> function3422 = separatorState.generator;
                        separatorState$onInsert$1.L$0 = separatorState;
                        separatorState$onInsert$1.L$1 = insert2;
                        separatorState$onInsert$1.L$2 = arrayList5;
                        separatorState$onInsert$1.L$3 = arrayList6;
                        separatorState$onInsert$1.L$4 = num6;
                        separatorState$onInsert$1.L$5 = transformablePage8;
                        separatorState$onInsert$1.L$6 = num7;
                        separatorState$onInsert$1.L$7 = arrayList5;
                        separatorState$onInsert$1.L$8 = null;
                        separatorState$onInsert$1.L$9 = null;
                        separatorState$onInsert$1.Z$0 = z4;
                        separatorState$onInsert$1.I$0 = i6;
                        separatorState$onInsert$1.label = 5;
                        obj5 = SeparatorsKt.insertInternalSeparators(transformablePage9, function3422, separatorState$onInsert$1);
                        if (obj5 == coroutine_suspended) {
                        }
                        break;
                    case 5:
                        i6 = separatorState$onInsert$1.I$0;
                        z4 = separatorState$onInsert$1.Z$0;
                        arrayList5 = (ArrayList) separatorState$onInsert$1.L$7;
                        num7 = (Integer) separatorState$onInsert$1.L$6;
                        transformablePage8 = (TransformablePage) separatorState$onInsert$1.L$5;
                        num6 = (Integer) separatorState$onInsert$1.L$4;
                        arrayList6 = (ArrayList) separatorState$onInsert$1.L$3;
                        arrayList9 = (ArrayList) separatorState$onInsert$1.L$2;
                        insert4 = (PageEvent.Insert) separatorState$onInsert$1.L$1;
                        separatorState4 = (SeparatorState) separatorState$onInsert$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        arrayList5.add(obj5);
                        List<TransformablePage<T>> pages22 = insert4.getPages();
                        int intValue42 = num6.intValue();
                        Intrinsics.checkNotNull(num7);
                        it = pages22.subList(intValue42, num7.intValue() + 1).iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 6:
                        i6 = separatorState$onInsert$1.I$0;
                        z4 = separatorState$onInsert$1.Z$0;
                        TransformablePage transformablePage39 = (TransformablePage) separatorState$onInsert$1.L$8;
                        transformablePage15 = (TransformablePage) separatorState$onInsert$1.L$7;
                        it2 = (Iterator) separatorState$onInsert$1.L$6;
                        num9 = (Integer) separatorState$onInsert$1.L$5;
                        transformablePage14 = (TransformablePage) separatorState$onInsert$1.L$4;
                        ArrayList arrayList36 = (ArrayList) separatorState$onInsert$1.L$3;
                        ArrayList arrayList37 = (ArrayList) separatorState$onInsert$1.L$2;
                        PageEvent.Insert<T> insert14 = (PageEvent.Insert) separatorState$onInsert$1.L$1;
                        SeparatorState<R, T> separatorState14 = (SeparatorState) separatorState$onInsert$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        obj3 = obj5;
                        transformablePage16 = transformablePage39;
                        arrayList10 = arrayList36;
                        arrayList11 = arrayList37;
                        insert5 = insert14;
                        separatorState5 = separatorState14;
                        TransformablePage<T> transformablePage282 = transformablePage15;
                        Iterator it52 = it2;
                        Integer num152 = num9;
                        TransformablePage<T> transformablePage292 = transformablePage14;
                        ArrayList arrayList242 = arrayList11;
                        if (insert5.getLoadType() != LoadType.PREPEND) {
                        }
                        int i132 = hintOriginalPageOffset;
                        if (insert5.getLoadType() == LoadType.PREPEND) {
                        }
                        i7 = intValue2;
                        SeparatorsKt.addSeparatorPage(arrayList242, obj3, transformablePage16, transformablePage282, i132, i7);
                        transformablePage19 = transformablePage16;
                        transformablePage18 = transformablePage282;
                        it3 = it52;
                        num10 = num152;
                        transformablePage17 = transformablePage292;
                        arrayList12 = arrayList10;
                        arrayList13 = arrayList11;
                        insert6 = insert5;
                        separatorState6 = separatorState5;
                        if (!transformablePage18.getData().isEmpty()) {
                        }
                        Function3<T, T, Continuation<? super R>, Object> function36222 = separatorState6.generator;
                        separatorState$onInsert$1.L$0 = separatorState6;
                        separatorState$onInsert$1.L$1 = insert6;
                        separatorState$onInsert$1.L$2 = arrayList13;
                        separatorState$onInsert$1.L$3 = arrayList12;
                        separatorState$onInsert$1.L$4 = transformablePage17;
                        separatorState$onInsert$1.L$5 = num10;
                        separatorState$onInsert$1.L$6 = it3;
                        separatorState$onInsert$1.L$7 = transformablePage18;
                        separatorState$onInsert$1.L$8 = transformablePage19;
                        separatorState$onInsert$1.L$9 = arrayList13;
                        separatorState$onInsert$1.Z$0 = z4;
                        separatorState$onInsert$1.I$0 = i6;
                        separatorState$onInsert$1.label = 7;
                        obj5 = SeparatorsKt.insertInternalSeparators(transformablePage18, function36222, separatorState$onInsert$1);
                        if (obj5 != coroutine_suspended) {
                        }
                        break;
                    case 7:
                        i6 = separatorState$onInsert$1.I$0;
                        z4 = separatorState$onInsert$1.Z$0;
                        arrayList13 = (ArrayList) separatorState$onInsert$1.L$9;
                        transformablePage19 = (TransformablePage) separatorState$onInsert$1.L$8;
                        transformablePage18 = (TransformablePage) separatorState$onInsert$1.L$7;
                        it3 = (Iterator) separatorState$onInsert$1.L$6;
                        num10 = (Integer) separatorState$onInsert$1.L$5;
                        transformablePage17 = (TransformablePage) separatorState$onInsert$1.L$4;
                        arrayList12 = (ArrayList) separatorState$onInsert$1.L$3;
                        arrayList14 = (ArrayList) separatorState$onInsert$1.L$2;
                        insert6 = (PageEvent.Insert) separatorState$onInsert$1.L$1;
                        separatorState6 = (SeparatorState) separatorState$onInsert$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        ArrayList arrayList252 = arrayList12;
                        separatorState = separatorState6;
                        it2 = it3;
                        arrayList2 = arrayList252;
                        arrayList13.add(obj5);
                        if (transformablePage18.getData().isEmpty()) {
                        }
                        num9 = num10;
                        transformablePage14 = transformablePage17;
                        arrayList = arrayList14;
                        insert2 = insert6;
                        if (it2.hasNext()) {
                        }
                        break;
                    case 8:
                        i6 = separatorState$onInsert$1.I$0;
                        z4 = separatorState$onInsert$1.Z$0;
                        transformablePage20 = (TransformablePage) separatorState$onInsert$1.L$6;
                        num9 = (Integer) separatorState$onInsert$1.L$5;
                        transformablePage14 = (TransformablePage) separatorState$onInsert$1.L$4;
                        arrayList2 = (ArrayList) separatorState$onInsert$1.L$3;
                        arrayList = (ArrayList) separatorState$onInsert$1.L$2;
                        insert2 = (PageEvent.Insert) separatorState$onInsert$1.L$1;
                        separatorState = (SeparatorState) separatorState$onInsert$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        Object obj62 = obj5;
                        TransformablePage transformablePage302 = transformablePage20;
                        Integer num162 = num9;
                        SeparatorState<R, T> separatorState102 = separatorState;
                        PageEvent.Insert<T> insert102 = insert2;
                        ArrayList arrayList262 = arrayList;
                        ArrayList arrayList272 = arrayList2;
                        TransformablePage<T> transformablePage312 = transformablePage14;
                        ArrayList arrayList282 = arrayList262;
                        int hintOriginalPageOffset32 = transformablePage312.getHintOriginalPageOffset();
                        List<Integer> hintOriginalIndices42 = transformablePage312.getHintOriginalIndices();
                        SeparatorsKt.addSeparatorPage(arrayList282, obj62, transformablePage312, transformablePage302, hintOriginalPageOffset32, hintOriginalIndices42 == null ? ((Number) CollectionsKt.last((List) hintOriginalIndices42)).intValue() : CollectionsKt.getLastIndex(transformablePage312.getData()));
                        i8 = i6;
                        terminatesEnd = z4;
                        num9 = num162;
                        transformablePage14 = transformablePage312;
                        arrayList2 = arrayList272;
                        arrayList = arrayList262;
                        insert2 = insert102;
                        separatorState = separatorState102;
                        intValue3 = num9.intValue() + 1;
                        lastIndex = CollectionsKt.getLastIndex(insert2.getPages());
                        if (intValue3 <= lastIndex) {
                        }
                        break;
                    case 9:
                        i11 = separatorState$onInsert$1.I$2;
                        i10 = separatorState$onInsert$1.I$1;
                        i9 = separatorState$onInsert$1.I$0;
                        z5 = separatorState$onInsert$1.Z$0;
                        arrayList15 = (ArrayList) separatorState$onInsert$1.L$5;
                        transformablePage21 = (TransformablePage) separatorState$onInsert$1.L$4;
                        arrayList16 = (ArrayList) separatorState$onInsert$1.L$3;
                        arrayList20 = (ArrayList) separatorState$onInsert$1.L$2;
                        insert8 = (PageEvent.Insert) separatorState$onInsert$1.L$1;
                        separatorState8 = (SeparatorState) separatorState$onInsert$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        arrayList15.add(obj5);
                        if (i10 == i11) {
                        }
                        break;
                    case 10:
                        ?? r0 = (List) separatorState$onInsert$1.L$5;
                        TransformablePage<T> transformablePage40 = (TransformablePage) separatorState$onInsert$1.L$4;
                        arrayList18 = (ArrayList) separatorState$onInsert$1.L$3;
                        arrayList19 = (ArrayList) separatorState$onInsert$1.L$2;
                        insert7 = (PageEvent.Insert) separatorState$onInsert$1.L$1;
                        separatorState7 = (SeparatorState) separatorState$onInsert$1.L$0;
                        ResultKt.throwOnFailure(obj5);
                        arrayList17 = r0;
                        transformablePage23 = transformablePage40;
                        obj4 = obj5;
                        int hintOriginalPageOffset42 = transformablePage23.getHintOriginalPageOffset();
                        List<Integer> hintOriginalIndices52 = transformablePage23.getHintOriginalIndices();
                        SeparatorsKt.addSeparatorPage(arrayList17, obj4, transformablePage23, null, hintOriginalPageOffset42, hintOriginalIndices52 == null ? ((Number) CollectionsKt.last((List) hintOriginalIndices52)).intValue() : CollectionsKt.getLastIndex(transformablePage23.getData()));
                        arrayList2 = arrayList18;
                        arrayList = arrayList19;
                        separatorState7.endTerminalSeparatorDeferred = false;
                        separatorState7.startTerminalSeparatorDeferred = false;
                        if (insert7.getLoadType() != LoadType.APPEND) {
                        }
                        LoadType loadType2222 = insert7.getLoadType();
                        insert7.getPages();
                        return new PageEvent.Insert(loadType2222, arrayList, insert7.getPlaceholdersBefore(), insert7.getPlaceholdersAfter(), insert7.getSourceLoadStates(), insert7.getMediatorLoadStates(), null);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        separatorState$onInsert$1 = new SeparatorState$onInsert$1(separatorState9, continuation);
        Object obj52 = separatorState$onInsert$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (separatorState$onInsert$1.label) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PageEvent.Drop<R> onDrop(PageEvent.Drop<T> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.sourceStates.set(event.getLoadType(), LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
        if (event.getLoadType() == LoadType.PREPEND) {
            this.placeholdersBefore = event.getPlaceholdersRemaining();
            this.headerAdded = false;
        } else if (event.getLoadType() == LoadType.APPEND) {
            this.placeholdersAfter = event.getPlaceholdersRemaining();
            this.footerAdded = false;
        }
        if (this.pageStash.isEmpty()) {
            if (event.getLoadType() == LoadType.PREPEND) {
                this.startTerminalSeparatorDeferred = false;
            } else {
                this.endTerminalSeparatorDeferred = false;
            }
        }
        final IntRange intRange = new IntRange(event.getMinPageOffset(), event.getMaxPageOffset());
        CollectionsKt.removeAll((List) this.pageStash, new Function1<TransformablePage<T>, Boolean>() { // from class: androidx.paging.SeparatorState$onDrop$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(TransformablePage<T> stash) {
                Intrinsics.checkNotNullParameter(stash, "stash");
                int[] originalPageOffsets = stash.getOriginalPageOffsets();
                IntRange intRange2 = IntRange.this;
                int length = originalPageOffsets.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (intRange2.contains(originalPageOffsets[i])) {
                        z = true;
                        break;
                    }
                    i++;
                }
                return Boolean.valueOf(z);
            }
        });
        return event;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object onLoadStateUpdate(PageEvent.LoadStateUpdate<T> loadStateUpdate, Continuation<? super PageEvent<R>> continuation) {
        LoadStates loadStates = this.mediatorStates;
        if (Intrinsics.areEqual(this.sourceStates.snapshot(), loadStateUpdate.getSource()) && Intrinsics.areEqual(loadStates, loadStateUpdate.getMediator())) {
            Intrinsics.checkNotNull(loadStateUpdate, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
            return loadStateUpdate;
        }
        this.sourceStates.set(loadStateUpdate.getSource());
        this.mediatorStates = loadStateUpdate.getMediator();
        if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getPrepend().getEndOfPaginationReached()) {
            if (!Intrinsics.areEqual(loadStates != null ? loadStates.getPrepend() : null, loadStateUpdate.getMediator().getPrepend())) {
                return onInsert(PageEvent.Insert.INSTANCE.Prepend(CollectionsKt.emptyList(), this.placeholdersBefore, loadStateUpdate.getSource(), loadStateUpdate.getMediator()), continuation);
            }
        }
        if (loadStateUpdate.getMediator() != null && loadStateUpdate.getMediator().getAppend().getEndOfPaginationReached()) {
            if (!Intrinsics.areEqual(loadStates != null ? loadStates.getAppend() : null, loadStateUpdate.getMediator().getAppend())) {
                return onInsert(PageEvent.Insert.INSTANCE.Append(CollectionsKt.emptyList(), this.placeholdersAfter, loadStateUpdate.getSource(), loadStateUpdate.getMediator()), continuation);
            }
        }
        Intrinsics.checkNotNull(loadStateUpdate, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.SeparatorState>");
        return loadStateUpdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0085 -> B:10:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onStaticList(PageEvent.StaticList<T> staticList, Continuation<? super PageEvent<R>> continuation) {
        SeparatorState$onStaticList$1 separatorState$onStaticList$1;
        int i;
        ArrayList arrayList;
        int size;
        int i2;
        Object invoke;
        if (continuation instanceof SeparatorState$onStaticList$1) {
            separatorState$onStaticList$1 = (SeparatorState$onStaticList$1) continuation;
            if ((separatorState$onStaticList$1.label & Integer.MIN_VALUE) != 0) {
                separatorState$onStaticList$1.label -= Integer.MIN_VALUE;
                Object obj = separatorState$onStaticList$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = separatorState$onStaticList$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    arrayList = new ArrayList();
                    size = staticList.getData().size();
                    if (size >= 0) {
                        i2 = 0;
                        Object orNull = CollectionsKt.getOrNull(staticList.getData(), i2 - 1);
                        Object orNull2 = CollectionsKt.getOrNull(staticList.getData(), i2);
                        Function3<T, T, Continuation<? super R>, Object> function3 = this.generator;
                        separatorState$onStaticList$1.L$0 = this;
                        separatorState$onStaticList$1.L$1 = staticList;
                        separatorState$onStaticList$1.L$2 = arrayList;
                        separatorState$onStaticList$1.L$3 = orNull2;
                        separatorState$onStaticList$1.I$0 = i2;
                        separatorState$onStaticList$1.I$1 = size;
                        separatorState$onStaticList$1.label = 1;
                        invoke = function3.invoke(orNull, orNull2, separatorState$onStaticList$1);
                        if (invoke != coroutine_suspended) {
                        }
                    }
                    return new PageEvent.StaticList(arrayList, staticList.getSourceLoadStates(), staticList.getMediatorLoadStates());
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = separatorState$onStaticList$1.I$1;
                int i4 = separatorState$onStaticList$1.I$0;
                Object obj2 = separatorState$onStaticList$1.L$3;
                ?? r4 = (List) separatorState$onStaticList$1.L$2;
                PageEvent.StaticList<T> staticList2 = (PageEvent.StaticList) separatorState$onStaticList$1.L$1;
                SeparatorState<R, T> separatorState = (SeparatorState) separatorState$onStaticList$1.L$0;
                ResultKt.throwOnFailure(obj);
                int i5 = i3;
                this = separatorState;
                ArrayList arrayList2 = r4;
                if (obj != null) {
                    arrayList2.add(obj);
                }
                if (obj2 != null) {
                    arrayList2.add(obj2);
                }
                if (i4 == i5) {
                    arrayList = arrayList2;
                    size = i5;
                    i2 = i4 + 1;
                    staticList = staticList2;
                    Object orNull3 = CollectionsKt.getOrNull(staticList.getData(), i2 - 1);
                    Object orNull22 = CollectionsKt.getOrNull(staticList.getData(), i2);
                    Function3<T, T, Continuation<? super R>, Object> function32 = this.generator;
                    separatorState$onStaticList$1.L$0 = this;
                    separatorState$onStaticList$1.L$1 = staticList;
                    separatorState$onStaticList$1.L$2 = arrayList;
                    separatorState$onStaticList$1.L$3 = orNull22;
                    separatorState$onStaticList$1.I$0 = i2;
                    separatorState$onStaticList$1.I$1 = size;
                    separatorState$onStaticList$1.label = 1;
                    invoke = function32.invoke(orNull3, orNull22, separatorState$onStaticList$1);
                    if (invoke != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    staticList2 = staticList;
                    i4 = i2;
                    arrayList2 = arrayList;
                    obj = invoke;
                    i5 = size;
                    obj2 = orNull22;
                    if (obj != null) {
                    }
                    if (obj2 != null) {
                    }
                    if (i4 == i5) {
                        arrayList = arrayList2;
                        staticList = staticList2;
                        return new PageEvent.StaticList(arrayList, staticList.getSourceLoadStates(), staticList.getMediatorLoadStates());
                    }
                }
            }
        }
        separatorState$onStaticList$1 = new SeparatorState$onStaticList$1(this, continuation);
        Object obj3 = separatorState$onStaticList$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = separatorState$onStaticList$1.label;
        if (i != 0) {
        }
    }

    private final <T> TransformablePage<T> transformablePageToStash(TransformablePage<T> originalPage) {
        int[] originalPageOffsets = originalPage.getOriginalPageOffsets();
        List listOf = CollectionsKt.listOf(CollectionsKt.first((List) originalPage.getData()), CollectionsKt.last((List) originalPage.getData()));
        int hintOriginalPageOffset = originalPage.getHintOriginalPageOffset();
        Integer[] numArr = new Integer[2];
        List<Integer> hintOriginalIndices = originalPage.getHintOriginalIndices();
        numArr[0] = Integer.valueOf(hintOriginalIndices != null ? ((Number) CollectionsKt.first((List) hintOriginalIndices)).intValue() : 0);
        List<Integer> hintOriginalIndices2 = originalPage.getHintOriginalIndices();
        numArr[1] = Integer.valueOf(hintOriginalIndices2 != null ? ((Number) CollectionsKt.last((List) hintOriginalIndices2)).intValue() : CollectionsKt.getLastIndex(originalPage.getData()));
        return new TransformablePage<>(originalPageOffsets, listOf, hintOriginalPageOffset, CollectionsKt.listOf((Object[]) numArr));
    }
}
