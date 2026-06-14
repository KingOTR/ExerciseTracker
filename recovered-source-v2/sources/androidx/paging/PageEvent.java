package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.Vo2MaxRecord;
import androidx.paging.LoadState;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.maplibre.android.style.layers.Property;

/* compiled from: PageEvent.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0004\u000f\u0010\u0011\u0012B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@¢\u0006\u0002\u0010\tJH\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0000\"\b\b\u0001\u0010\u000b*\u00020\u00022(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\r0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@¢\u0006\u0002\u0010\tJB\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0000\"\b\b\u0001\u0010\u000b*\u00020\u00022\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006H\u0096@¢\u0006\u0002\u0010\t\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Landroidx/paging/PageEvent;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "filter", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flatMap", "R", "transform", "", "map", "Drop", "Insert", "LoadStateUpdate", "StaticList", "Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/PageEvent$LoadStateUpdate;", "Landroidx/paging/PageEvent$StaticList;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PageEvent<T> {
    public /* synthetic */ PageEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    static /* synthetic */ <T> Object filter$suspendImpl(PageEvent<T> pageEvent, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super PageEvent<T>> continuation) {
        return pageEvent;
    }

    public Object filter(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super PageEvent<T>> continuation) {
        return filter$suspendImpl(this, function2, continuation);
    }

    public <R> Object flatMap(Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function2, Continuation<? super PageEvent<R>> continuation) {
        return flatMap$suspendImpl(this, function2, continuation);
    }

    public <R> Object map(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super PageEvent<R>> continuation) {
        return map$suspendImpl(this, function2, continuation);
    }

    private PageEvent() {
    }

    /* compiled from: PageEvent.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003J8\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u001aJH\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u0003\"\b\b\u0002\u0010\u001c*\u00020\u00022(\u0010\u001d\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0\u001e0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u001aJ\t\u0010\u001f\u001a\u00020 HÖ\u0001JB\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u0003\"\b\b\u0002\u0010\u001c*\u00020\u00022\"\u0010\u001d\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001c0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u001aJ\b\u0010\"\u001a\u00020#H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006$"}, d2 = {"Landroidx/paging/PageEvent$StaticList;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/PageEvent;", "data", "", "sourceLoadStates", "Landroidx/paging/LoadStates;", "mediatorLoadStates", "(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "getData", "()Ljava/util/List;", "getMediatorLoadStates", "()Landroidx/paging/LoadStates;", "getSourceLoadStates", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "filter", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flatMap", "R", "transform", "", "hashCode", "", "map", "toString", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class StaticList<T> extends PageEvent<T> {
        private final List<T> data;
        private final LoadStates mediatorLoadStates;
        private final LoadStates sourceLoadStates;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StaticList copy$default(StaticList staticList, List list, LoadStates loadStates, LoadStates loadStates2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = staticList.data;
            }
            if ((i & 2) != 0) {
                loadStates = staticList.sourceLoadStates;
            }
            if ((i & 4) != 0) {
                loadStates2 = staticList.mediatorLoadStates;
            }
            return staticList.copy(list, loadStates, loadStates2);
        }

        public final List<T> component1() {
            return this.data;
        }

        /* renamed from: component2, reason: from getter */
        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        /* renamed from: component3, reason: from getter */
        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        public final StaticList<T> copy(List<? extends T> data, LoadStates sourceLoadStates, LoadStates mediatorLoadStates) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new StaticList<>(data, sourceLoadStates, mediatorLoadStates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StaticList)) {
                return false;
            }
            StaticList staticList = (StaticList) other;
            return Intrinsics.areEqual(this.data, staticList.data) && Intrinsics.areEqual(this.sourceLoadStates, staticList.sourceLoadStates) && Intrinsics.areEqual(this.mediatorLoadStates, staticList.mediatorLoadStates);
        }

        public int hashCode() {
            int hashCode = this.data.hashCode() * 31;
            LoadStates loadStates = this.sourceLoadStates;
            int hashCode2 = (hashCode + (loadStates == null ? 0 : loadStates.hashCode())) * 31;
            LoadStates loadStates2 = this.mediatorLoadStates;
            return hashCode2 + (loadStates2 != null ? loadStates2.hashCode() : 0);
        }

        public /* synthetic */ StaticList(List list, LoadStates loadStates, LoadStates loadStates2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : loadStates, (i & 4) != 0 ? null : loadStates2);
        }

        public final List<T> getData() {
            return this.data;
        }

        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StaticList(List<? extends T> data, LoadStates loadStates, LoadStates loadStates2) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:10:0x008a). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public <R> Object map(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super PageEvent<R>> continuation) {
            PageEvent$StaticList$map$1 pageEvent$StaticList$map$1;
            int i;
            Iterator<T> it;
            StaticList<T> staticList;
            Collection collection;
            PageEvent$StaticList$map$1 pageEvent$StaticList$map$12;
            Function2<? super T, ? super Continuation<? super R>, ? extends Object> function22;
            if (continuation instanceof PageEvent$StaticList$map$1) {
                pageEvent$StaticList$map$1 = (PageEvent$StaticList$map$1) continuation;
                if ((pageEvent$StaticList$map$1.label & Integer.MIN_VALUE) != 0) {
                    pageEvent$StaticList$map$1.label -= Integer.MIN_VALUE;
                    Object obj = pageEvent$StaticList$map$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$StaticList$map$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        List<T> list = this.data;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        it = list.iterator();
                        staticList = this;
                        collection = arrayList;
                        pageEvent$StaticList$map$12 = pageEvent$StaticList$map$1;
                        function22 = function2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        collection = (Collection) pageEvent$StaticList$map$1.L$4;
                        Iterator<T> it2 = (Iterator) pageEvent$StaticList$map$1.L$3;
                        Collection collection2 = (Collection) pageEvent$StaticList$map$1.L$2;
                        Function2<? super T, ? super Continuation<? super R>, ? extends Object> function23 = (Function2) pageEvent$StaticList$map$1.L$1;
                        StaticList<T> staticList2 = (StaticList) pageEvent$StaticList$map$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        PageEvent$StaticList$map$1 pageEvent$StaticList$map$13 = pageEvent$StaticList$map$1;
                        Iterator<T> it3 = it2;
                        staticList = staticList2;
                        PageEvent$StaticList$map$1 pageEvent$StaticList$map$14 = pageEvent$StaticList$map$13;
                        collection.add(obj);
                        it = it3;
                        collection = collection2;
                        function22 = function23;
                        pageEvent$StaticList$map$12 = pageEvent$StaticList$map$14;
                        if (it.hasNext()) {
                            T next = it.next();
                            pageEvent$StaticList$map$12.L$0 = staticList;
                            pageEvent$StaticList$map$12.L$1 = function22;
                            pageEvent$StaticList$map$12.L$2 = collection;
                            pageEvent$StaticList$map$12.L$3 = it;
                            pageEvent$StaticList$map$12.L$4 = collection;
                            pageEvent$StaticList$map$12.label = 1;
                            Object invoke = function22.invoke(next, pageEvent$StaticList$map$12);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pageEvent$StaticList$map$14 = pageEvent$StaticList$map$12;
                            collection2 = collection;
                            Function2<? super T, ? super Continuation<? super R>, ? extends Object> function24 = function22;
                            it3 = it;
                            obj = invoke;
                            function23 = function24;
                            collection.add(obj);
                            it = it3;
                            collection = collection2;
                            function22 = function23;
                            pageEvent$StaticList$map$12 = pageEvent$StaticList$map$14;
                            if (it.hasNext()) {
                                return new StaticList((List) collection, staticList.sourceLoadStates, staticList.mediatorLoadStates);
                            }
                        }
                    }
                }
            }
            pageEvent$StaticList$map$1 = new PageEvent$StaticList$map$1(this, continuation);
            Object obj2 = pageEvent$StaticList$map$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$StaticList$map$1.label;
            if (i != 0) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0076 -> B:10:0x007a). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public <R> Object flatMap(Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function2, Continuation<? super PageEvent<R>> continuation) {
            PageEvent$StaticList$flatMap$1 pageEvent$StaticList$flatMap$1;
            int i;
            ArrayList arrayList;
            StaticList<T> staticList;
            Iterator<T> it;
            Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function22;
            if (continuation instanceof PageEvent$StaticList$flatMap$1) {
                pageEvent$StaticList$flatMap$1 = (PageEvent$StaticList$flatMap$1) continuation;
                if ((pageEvent$StaticList$flatMap$1.label & Integer.MIN_VALUE) != 0) {
                    pageEvent$StaticList$flatMap$1.label -= Integer.MIN_VALUE;
                    Object obj = pageEvent$StaticList$flatMap$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$StaticList$flatMap$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        List<T> list = this.data;
                        arrayList = new ArrayList();
                        staticList = this;
                        it = list.iterator();
                        function22 = function2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) pageEvent$StaticList$flatMap$1.L$3;
                        ?? r7 = (Collection) pageEvent$StaticList$flatMap$1.L$2;
                        Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function23 = (Function2) pageEvent$StaticList$flatMap$1.L$1;
                        StaticList<T> staticList2 = (StaticList) pageEvent$StaticList$flatMap$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        ArrayList arrayList2 = r7;
                        staticList = staticList2;
                        CollectionsKt.addAll(arrayList2, (Iterable) obj);
                        function22 = function23;
                        arrayList = arrayList2;
                        if (it.hasNext()) {
                            Object obj2 = (T) it.next();
                            pageEvent$StaticList$flatMap$1.L$0 = staticList;
                            pageEvent$StaticList$flatMap$1.L$1 = function22;
                            pageEvent$StaticList$flatMap$1.L$2 = arrayList;
                            pageEvent$StaticList$flatMap$1.L$3 = it;
                            pageEvent$StaticList$flatMap$1.label = 1;
                            Object invoke = function22.invoke(obj2, pageEvent$StaticList$flatMap$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ArrayList arrayList3 = arrayList;
                            function23 = function22;
                            obj = invoke;
                            arrayList2 = arrayList3;
                            CollectionsKt.addAll(arrayList2, (Iterable) obj);
                            function22 = function23;
                            arrayList = arrayList2;
                            if (it.hasNext()) {
                                return new StaticList(arrayList, staticList.sourceLoadStates, staticList.mediatorLoadStates);
                            }
                        }
                    }
                }
            }
            pageEvent$StaticList$flatMap$1 = new PageEvent$StaticList$flatMap$1(this, continuation);
            Object obj3 = pageEvent$StaticList$flatMap$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$StaticList$flatMap$1.label;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0076 -> B:10:0x007b). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object filter(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super PageEvent<T>> continuation) {
            PageEvent$StaticList$filter$1 pageEvent$StaticList$filter$1;
            int i;
            ArrayList arrayList;
            Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function22;
            Iterator<T> it;
            if (continuation instanceof PageEvent$StaticList$filter$1) {
                pageEvent$StaticList$filter$1 = (PageEvent$StaticList$filter$1) continuation;
                if ((pageEvent$StaticList$filter$1.label & Integer.MIN_VALUE) != 0) {
                    pageEvent$StaticList$filter$1.label -= Integer.MIN_VALUE;
                    Object obj = pageEvent$StaticList$filter$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$StaticList$filter$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        List<T> list = this.data;
                        arrayList = new ArrayList();
                        Iterator<T> it2 = list.iterator();
                        function22 = function2;
                        it = it2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = pageEvent$StaticList$filter$1.L$4;
                        it = (Iterator) pageEvent$StaticList$filter$1.L$3;
                        arrayList = (Collection) pageEvent$StaticList$filter$1.L$2;
                        Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function23 = (Function2) pageEvent$StaticList$filter$1.L$1;
                        StaticList<T> staticList = (StaticList) pageEvent$StaticList$filter$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                            arrayList.add(obj2);
                        }
                        function22 = function23;
                        this = staticList;
                        if (it.hasNext()) {
                            Object next = it.next();
                            pageEvent$StaticList$filter$1.L$0 = this;
                            pageEvent$StaticList$filter$1.L$1 = function22;
                            pageEvent$StaticList$filter$1.L$2 = arrayList;
                            pageEvent$StaticList$filter$1.L$3 = it;
                            pageEvent$StaticList$filter$1.L$4 = next;
                            pageEvent$StaticList$filter$1.label = 1;
                            Object invoke = function22.invoke(next, pageEvent$StaticList$filter$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            staticList = this;
                            obj2 = next;
                            function23 = function22;
                            obj = invoke;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            function22 = function23;
                            this = staticList;
                            if (it.hasNext()) {
                                return new StaticList((List) arrayList, this.sourceLoadStates, this.mediatorLoadStates);
                            }
                        }
                    }
                }
            }
            pageEvent$StaticList$filter$1 = new PageEvent$StaticList$filter$1(this, continuation);
            Object obj3 = pageEvent$StaticList$filter$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$StaticList$filter$1.label;
            if (i != 0) {
            }
        }

        public String toString() {
            LoadStates loadStates = this.mediatorLoadStates;
            String str = "PageEvent.StaticList with " + this.data.size() + " items (\n                    |   first item: " + CollectionsKt.firstOrNull((List) this.data) + "\n                    |   last item: " + CollectionsKt.lastOrNull((List) this.data) + "\n                    |   sourceLoadStates: " + this.sourceLoadStates + "\n                    ";
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt.trimMargin$default(str + "|)", null, 1, null);
        }
    }

    /* compiled from: PageEvent.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 5*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u00015BG\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\rHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0002HÖ\u0003J8\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020&H\u0096@¢\u0006\u0002\u0010(JH\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0\u0003\"\b\b\u0002\u0010**\u00020\u00022(\u0010+\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0,0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020&H\u0096@¢\u0006\u0002\u0010(J\t\u0010-\u001a\u00020\nHÖ\u0001JB\u0010.\u001a\b\u0012\u0004\u0012\u0002H*0\u0003\"\b\b\u0002\u0010**\u00020\u00022\"\u0010+\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0'\u0012\u0006\u0012\u0004\u0018\u00010\u00020&H\u0096@¢\u0006\u0002\u0010(J9\u0010/\u001a\b\u0012\u0004\u0012\u0002H*0\u0000\"\b\b\u0002\u0010**\u00020\u00022\u001e\u0010+\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0\b00H\u0082\bJ\b\u00101\u001a\u000202H\u0016JM\u00103\u001a\b\u0012\u0004\u0012\u0002H*0\u0000\"\b\b\u0002\u0010**\u00020\u00022*\u0010+\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H*0\b0\u000700H\u0080\bø\u0001\u0000¢\u0006\u0002\b4R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"Landroidx/paging/PageEvent$Insert;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/PageEvent;", "loadType", "Landroidx/paging/LoadType;", "pages", "", "Landroidx/paging/TransformablePage;", "placeholdersBefore", "", "placeholdersAfter", "sourceLoadStates", "Landroidx/paging/LoadStates;", "mediatorLoadStates", "(Landroidx/paging/LoadType;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "getLoadType", "()Landroidx/paging/LoadType;", "getMediatorLoadStates", "()Landroidx/paging/LoadStates;", "getPages", "()Ljava/util/List;", "getPlaceholdersAfter", "()I", "getPlaceholdersBefore", "getSourceLoadStates", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "filter", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flatMap", "R", "transform", "", "hashCode", "map", "mapPages", "Lkotlin/Function1;", "toString", "", "transformPages", "transformPages$paging_common_release", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Insert<T> extends PageEvent<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Insert<Object> EMPTY_REFRESH_LOCAL;
        private final LoadType loadType;
        private final LoadStates mediatorLoadStates;
        private final List<TransformablePage<T>> pages;
        private final int placeholdersAfter;
        private final int placeholdersBefore;
        private final LoadStates sourceLoadStates;

        public /* synthetic */ Insert(LoadType loadType, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, DefaultConstructorMarker defaultConstructorMarker) {
            this(loadType, list, i, i2, loadStates, loadStates2);
        }

        public static /* synthetic */ Insert copy$default(Insert insert, LoadType loadType, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                loadType = insert.loadType;
            }
            if ((i3 & 2) != 0) {
                list = insert.pages;
            }
            List list2 = list;
            if ((i3 & 4) != 0) {
                i = insert.placeholdersBefore;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = insert.placeholdersAfter;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                loadStates = insert.sourceLoadStates;
            }
            LoadStates loadStates3 = loadStates;
            if ((i3 & 32) != 0) {
                loadStates2 = insert.mediatorLoadStates;
            }
            return insert.copy(loadType, list2, i4, i5, loadStates3, loadStates2);
        }

        /* renamed from: component1, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final List<TransformablePage<T>> component2() {
            return this.pages;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        /* renamed from: component4, reason: from getter */
        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        /* renamed from: component5, reason: from getter */
        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        /* renamed from: component6, reason: from getter */
        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        public final Insert<T> copy(LoadType loadType, List<TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, LoadStates sourceLoadStates, LoadStates mediatorLoadStates) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
            return new Insert<>(loadType, pages, placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) other;
            return this.loadType == insert.loadType && Intrinsics.areEqual(this.pages, insert.pages) && this.placeholdersBefore == insert.placeholdersBefore && this.placeholdersAfter == insert.placeholdersAfter && Intrinsics.areEqual(this.sourceLoadStates, insert.sourceLoadStates) && Intrinsics.areEqual(this.mediatorLoadStates, insert.mediatorLoadStates);
        }

        public int hashCode() {
            int hashCode = ((((((((this.loadType.hashCode() * 31) + this.pages.hashCode()) * 31) + Integer.hashCode(this.placeholdersBefore)) * 31) + Integer.hashCode(this.placeholdersAfter)) * 31) + this.sourceLoadStates.hashCode()) * 31;
            LoadStates loadStates = this.mediatorLoadStates;
            return hashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        /* synthetic */ Insert(LoadType loadType, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(loadType, list, i, i2, loadStates, (i3 & 32) != 0 ? null : loadStates2);
        }

        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final List<TransformablePage<T>> getPages() {
            return this.pages;
        }

        public final int getPlaceholdersBefore() {
            return this.placeholdersBefore;
        }

        public final int getPlaceholdersAfter() {
            return this.placeholdersAfter;
        }

        public final LoadStates getSourceLoadStates() {
            return this.sourceLoadStates;
        }

        public final LoadStates getMediatorLoadStates() {
            return this.mediatorLoadStates;
        }

        private Insert(LoadType loadType, List<TransformablePage<T>> list, int i, int i2, LoadStates loadStates, LoadStates loadStates2) {
            super(null);
            this.loadType = loadType;
            this.pages = list;
            this.placeholdersBefore = i;
            this.placeholdersAfter = i2;
            this.sourceLoadStates = loadStates;
            this.mediatorLoadStates = loadStates2;
            if (loadType != LoadType.APPEND && i < 0) {
                throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i).toString());
            }
            if (loadType != LoadType.PREPEND && i2 < 0) {
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i2).toString());
            }
            if (loadType == LoadType.REFRESH && list.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
            }
        }

        public final <R> Insert<R> transformPages$paging_common_release(Function1<? super List<TransformablePage<T>>, ? extends List<TransformablePage<R>>> transform) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            return new Insert<>(getLoadType(), transform.invoke(getPages()), getPlaceholdersBefore(), getPlaceholdersAfter(), getSourceLoadStates(), getMediatorLoadStates(), null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
        /* JADX WARN: Type inference failed for: r12v7, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00ea -> B:10:0x00ee). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009c -> B:11:0x00c1). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public <R> Object map(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super PageEvent<R>> continuation) {
            PageEvent$Insert$map$1 pageEvent$Insert$map$1;
            Insert<T> insert;
            int i;
            ArrayList arrayList;
            Iterator<T> it;
            LoadType loadType;
            Function2<? super T, ? super Continuation<? super R>, ? extends Object> function22;
            if (continuation instanceof PageEvent$Insert$map$1) {
                pageEvent$Insert$map$1 = (PageEvent$Insert$map$1) continuation;
                if ((pageEvent$Insert$map$1.label & Integer.MIN_VALUE) != 0) {
                    pageEvent$Insert$map$1.label -= Integer.MIN_VALUE;
                    insert = this;
                    Object obj = pageEvent$Insert$map$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$Insert$map$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        LoadType loadType2 = getLoadType();
                        List<TransformablePage<T>> pages = getPages();
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pages, 10));
                        it = pages.iterator();
                        loadType = loadType2;
                        function22 = function2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Collection collection = (Collection) pageEvent$Insert$map$1.L$10;
                        Collection collection2 = (Collection) pageEvent$Insert$map$1.L$9;
                        Iterator<T> it2 = (Iterator) pageEvent$Insert$map$1.L$8;
                        ?? r8 = (Collection) pageEvent$Insert$map$1.L$7;
                        int[] iArr = (int[]) pageEvent$Insert$map$1.L$6;
                        TransformablePage transformablePage = (TransformablePage) pageEvent$Insert$map$1.L$5;
                        Iterator<T> it3 = (Iterator) pageEvent$Insert$map$1.L$4;
                        ?? r12 = (Collection) pageEvent$Insert$map$1.L$3;
                        LoadType loadType3 = (LoadType) pageEvent$Insert$map$1.L$2;
                        Insert<T> insert2 = (Insert) pageEvent$Insert$map$1.L$1;
                        Function2<? super T, ? super Continuation<? super R>, ? extends Object> function23 = (Function2) pageEvent$Insert$map$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Iterator<T> it4 = it2;
                        Iterator<T> it5 = it3;
                        ArrayList arrayList2 = r8;
                        ArrayList arrayList3 = r12;
                        int[] originalPageOffsets = iArr;
                        LoadType loadType4 = loadType3;
                        TransformablePage transformablePage2 = transformablePage;
                        collection2.add(obj);
                        Insert<T> insert3 = insert2;
                        function22 = function23;
                        if (it4.hasNext()) {
                            Object obj2 = (T) it4.next();
                            pageEvent$Insert$map$1.L$0 = function22;
                            pageEvent$Insert$map$1.L$1 = insert3;
                            pageEvent$Insert$map$1.L$2 = loadType4;
                            pageEvent$Insert$map$1.L$3 = arrayList3;
                            pageEvent$Insert$map$1.L$4 = it5;
                            pageEvent$Insert$map$1.L$5 = transformablePage2;
                            pageEvent$Insert$map$1.L$6 = originalPageOffsets;
                            pageEvent$Insert$map$1.L$7 = arrayList2;
                            pageEvent$Insert$map$1.L$8 = it4;
                            pageEvent$Insert$map$1.L$9 = arrayList2;
                            pageEvent$Insert$map$1.L$10 = collection;
                            pageEvent$Insert$map$1.label = 1;
                            Object invoke = function22.invoke(obj2, pageEvent$Insert$map$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function23 = function22;
                            obj = invoke;
                            insert2 = insert3;
                            collection2 = arrayList2;
                            collection2.add(obj);
                            Insert<T> insert32 = insert2;
                            function22 = function23;
                            if (it4.hasNext()) {
                                collection.add(new TransformablePage(originalPageOffsets, arrayList2, transformablePage2.getHintOriginalPageOffset(), transformablePage2.getHintOriginalIndices()));
                                insert = insert32;
                                it = it5;
                                arrayList = arrayList3;
                                loadType = loadType4;
                                if (it.hasNext()) {
                                    return new Insert(loadType, arrayList, insert.getPlaceholdersBefore(), insert.getPlaceholdersAfter(), insert.getSourceLoadStates(), insert.getMediatorLoadStates(), null);
                                }
                                TransformablePage transformablePage3 = (TransformablePage) it.next();
                                originalPageOffsets = transformablePage3.getOriginalPageOffsets();
                                List<T> data = transformablePage3.getData();
                                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
                                it4 = data.iterator();
                                transformablePage2 = transformablePage3;
                                loadType4 = loadType;
                                arrayList3 = arrayList;
                                it5 = it;
                                insert32 = insert;
                                collection = arrayList3;
                                if (it4.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
            insert = this;
            pageEvent$Insert$map$1 = new PageEvent$Insert$map$1(insert, continuation);
            Object obj3 = pageEvent$Insert$map$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$Insert$map$1.label;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0123 A[LOOP:0: B:14:0x0119->B:16:0x0123, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f5 -> B:10:0x0104). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0095 -> B:17:0x00bb). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public <R> Object flatMap(Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function2, Continuation<? super PageEvent<R>> continuation) {
            PageEvent$Insert$flatMap$1 pageEvent$Insert$flatMap$1;
            Insert<T> insert;
            int i;
            Iterator<T> it;
            Collection collection;
            LoadType loadType;
            Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function22;
            if (continuation instanceof PageEvent$Insert$flatMap$1) {
                pageEvent$Insert$flatMap$1 = (PageEvent$Insert$flatMap$1) continuation;
                if ((pageEvent$Insert$flatMap$1.label & Integer.MIN_VALUE) != 0) {
                    pageEvent$Insert$flatMap$1.label -= Integer.MIN_VALUE;
                    insert = this;
                    Object obj = pageEvent$Insert$flatMap$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$Insert$flatMap$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        LoadType loadType2 = getLoadType();
                        List<TransformablePage<T>> pages = getPages();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pages, 10));
                        it = pages.iterator();
                        collection = arrayList;
                        loadType = loadType2;
                        function22 = function2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = pageEvent$Insert$flatMap$1.I$1;
                        int i3 = pageEvent$Insert$flatMap$1.I$0;
                        collection = (Collection) pageEvent$Insert$flatMap$1.L$10;
                        Collection collection2 = (Collection) pageEvent$Insert$flatMap$1.L$9;
                        Iterator<T> it2 = (Iterator) pageEvent$Insert$flatMap$1.L$8;
                        ArrayList arrayList2 = (List) pageEvent$Insert$flatMap$1.L$7;
                        List list = (List) pageEvent$Insert$flatMap$1.L$6;
                        TransformablePage transformablePage = (TransformablePage) pageEvent$Insert$flatMap$1.L$5;
                        Iterator<T> it3 = (Iterator) pageEvent$Insert$flatMap$1.L$4;
                        Collection collection3 = (Collection) pageEvent$Insert$flatMap$1.L$3;
                        LoadType loadType3 = (LoadType) pageEvent$Insert$flatMap$1.L$2;
                        Insert<T> insert2 = (Insert) pageEvent$Insert$flatMap$1.L$1;
                        Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function23 = (Function2) pageEvent$Insert$flatMap$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        TransformablePage transformablePage2 = transformablePage;
                        int i4 = i3;
                        CollectionsKt.addAll(collection2, (Iterable) obj);
                        List<Integer> hintOriginalIndices = transformablePage2.getHintOriginalIndices();
                        if (hintOriginalIndices != null) {
                            i2 = hintOriginalIndices.get(i2).intValue();
                        }
                        while (arrayList2.size() < list.size()) {
                            arrayList2.add(Boxing.boxInt(i2));
                        }
                        function22 = function23;
                        it = it3;
                        Collection collection4 = collection3;
                        loadType = loadType3;
                        insert = insert2;
                        TransformablePage transformablePage3 = transformablePage2;
                        if (it2.hasNext()) {
                            T next = it2.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            List list2 = list;
                            pageEvent$Insert$flatMap$1.L$0 = function22;
                            pageEvent$Insert$flatMap$1.L$1 = insert;
                            pageEvent$Insert$flatMap$1.L$2 = loadType;
                            pageEvent$Insert$flatMap$1.L$3 = collection4;
                            pageEvent$Insert$flatMap$1.L$4 = it;
                            pageEvent$Insert$flatMap$1.L$5 = transformablePage3;
                            pageEvent$Insert$flatMap$1.L$6 = list;
                            pageEvent$Insert$flatMap$1.L$7 = arrayList2;
                            pageEvent$Insert$flatMap$1.L$8 = it2;
                            pageEvent$Insert$flatMap$1.L$9 = list2;
                            pageEvent$Insert$flatMap$1.L$10 = collection;
                            pageEvent$Insert$flatMap$1.I$0 = i5;
                            pageEvent$Insert$flatMap$1.I$1 = i4;
                            Iterator<T> it4 = it;
                            pageEvent$Insert$flatMap$1.label = 1;
                            Object invoke = function22.invoke(next, pageEvent$Insert$flatMap$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            transformablePage2 = transformablePage3;
                            it3 = it4;
                            LoadType loadType4 = loadType;
                            function23 = function22;
                            obj = invoke;
                            collection3 = collection4;
                            collection2 = list2;
                            insert2 = insert;
                            i2 = i4;
                            i4 = i5;
                            loadType3 = loadType4;
                            CollectionsKt.addAll(collection2, (Iterable) obj);
                            List<Integer> hintOriginalIndices2 = transformablePage2.getHintOriginalIndices();
                            if (hintOriginalIndices2 != null) {
                            }
                            while (arrayList2.size() < list.size()) {
                            }
                            function22 = function23;
                            it = it3;
                            Collection collection42 = collection3;
                            loadType = loadType3;
                            insert = insert2;
                            TransformablePage transformablePage32 = transformablePage2;
                            if (it2.hasNext()) {
                                collection.add(new TransformablePage(transformablePage32.getOriginalPageOffsets(), list, transformablePage32.getHintOriginalPageOffset(), arrayList2));
                                it = it;
                                collection = collection42;
                                if (it.hasNext()) {
                                    return new Insert(loadType, (List) collection, insert.getPlaceholdersBefore(), insert.getPlaceholdersAfter(), insert.getSourceLoadStates(), insert.getMediatorLoadStates(), null);
                                }
                                TransformablePage transformablePage4 = (TransformablePage) it.next();
                                ArrayList arrayList3 = new ArrayList();
                                arrayList2 = new ArrayList();
                                Iterator<T> it5 = transformablePage4.getData().iterator();
                                i4 = 0;
                                transformablePage32 = transformablePage4;
                                collection42 = collection;
                                list = arrayList3;
                                it2 = it5;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
            insert = this;
            pageEvent$Insert$flatMap$1 = new PageEvent$Insert$flatMap$1(insert, continuation);
            Object obj2 = pageEvent$Insert$flatMap$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$Insert$flatMap$1.label;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f0 -> B:10:0x00fe). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0095 -> B:17:0x00bb). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object filter(Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super PageEvent<T>> continuation) {
            PageEvent$Insert$filter$1 pageEvent$Insert$filter$1;
            Insert<T> insert;
            int i;
            Iterator<T> it;
            Collection collection;
            LoadType loadType;
            Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function22;
            if (continuation instanceof PageEvent$Insert$filter$1) {
                pageEvent$Insert$filter$1 = (PageEvent$Insert$filter$1) continuation;
                if ((pageEvent$Insert$filter$1.label & Integer.MIN_VALUE) != 0) {
                    pageEvent$Insert$filter$1.label -= Integer.MIN_VALUE;
                    insert = this;
                    Object obj = pageEvent$Insert$filter$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageEvent$Insert$filter$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        LoadType loadType2 = getLoadType();
                        List<TransformablePage<T>> pages = getPages();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pages, 10));
                        it = pages.iterator();
                        collection = arrayList;
                        loadType = loadType2;
                        function22 = function2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = pageEvent$Insert$filter$1.I$1;
                        int i3 = pageEvent$Insert$filter$1.I$0;
                        collection = (Collection) pageEvent$Insert$filter$1.L$10;
                        Object obj2 = pageEvent$Insert$filter$1.L$9;
                        Iterator<T> it2 = (Iterator) pageEvent$Insert$filter$1.L$8;
                        ArrayList arrayList2 = (List) pageEvent$Insert$filter$1.L$7;
                        List list = (List) pageEvent$Insert$filter$1.L$6;
                        TransformablePage transformablePage = (TransformablePage) pageEvent$Insert$filter$1.L$5;
                        Iterator<T> it3 = (Iterator) pageEvent$Insert$filter$1.L$4;
                        Collection collection2 = (Collection) pageEvent$Insert$filter$1.L$3;
                        LoadType loadType3 = (LoadType) pageEvent$Insert$filter$1.L$2;
                        Insert<T> insert2 = (Insert) pageEvent$Insert$filter$1.L$1;
                        Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function23 = (Function2) pageEvent$Insert$filter$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        int i4 = i3;
                        it = it3;
                        TransformablePage transformablePage2 = transformablePage;
                        if (((Boolean) obj).booleanValue()) {
                            list.add(obj2);
                            List<Integer> hintOriginalIndices = transformablePage2.getHintOriginalIndices();
                            if (hintOriginalIndices != null) {
                                i2 = hintOriginalIndices.get(i2).intValue();
                            }
                            arrayList2.add(Boxing.boxInt(i2));
                        }
                        function22 = function23;
                        Collection collection3 = collection2;
                        loadType = loadType3;
                        insert = insert2;
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            pageEvent$Insert$filter$1.L$0 = function22;
                            pageEvent$Insert$filter$1.L$1 = insert;
                            pageEvent$Insert$filter$1.L$2 = loadType;
                            pageEvent$Insert$filter$1.L$3 = collection3;
                            pageEvent$Insert$filter$1.L$4 = it;
                            pageEvent$Insert$filter$1.L$5 = transformablePage2;
                            pageEvent$Insert$filter$1.L$6 = list;
                            pageEvent$Insert$filter$1.L$7 = arrayList2;
                            pageEvent$Insert$filter$1.L$8 = it2;
                            pageEvent$Insert$filter$1.L$9 = next;
                            pageEvent$Insert$filter$1.L$10 = collection;
                            pageEvent$Insert$filter$1.I$0 = i5;
                            pageEvent$Insert$filter$1.I$1 = i4;
                            pageEvent$Insert$filter$1.label = 1;
                            Object invoke = function22.invoke(next, pageEvent$Insert$filter$1);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            LoadType loadType4 = loadType;
                            function23 = function22;
                            obj = invoke;
                            insert2 = insert;
                            i2 = i4;
                            i4 = i5;
                            loadType3 = loadType4;
                            collection2 = collection3;
                            obj2 = next;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            function22 = function23;
                            Collection collection32 = collection2;
                            loadType = loadType3;
                            insert = insert2;
                            if (it2.hasNext()) {
                                collection.add(new TransformablePage(transformablePage2.getOriginalPageOffsets(), list, transformablePage2.getHintOriginalPageOffset(), arrayList2));
                                collection = collection32;
                                if (it.hasNext()) {
                                    return new Insert(loadType, (List) collection, insert.getPlaceholdersBefore(), insert.getPlaceholdersAfter(), insert.getSourceLoadStates(), insert.getMediatorLoadStates(), null);
                                }
                                TransformablePage transformablePage3 = (TransformablePage) it.next();
                                ArrayList arrayList3 = new ArrayList();
                                arrayList2 = new ArrayList();
                                Iterator<T> it4 = transformablePage3.getData().iterator();
                                i4 = 0;
                                transformablePage2 = transformablePage3;
                                collection32 = collection;
                                list = arrayList3;
                                it2 = it4;
                                if (it2.hasNext()) {
                                }
                            }
                        }
                    }
                }
            }
            insert = this;
            pageEvent$Insert$filter$1 = new PageEvent$Insert$filter$1(insert, continuation);
            Object obj3 = pageEvent$Insert$filter$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = pageEvent$Insert$filter$1.label;
            if (i != 0) {
            }
        }

        /* compiled from: PageEvent.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJF\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJN\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u000b0\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/paging/PageEvent$Insert$Companion;", "", "()V", "EMPTY_REFRESH_LOCAL", "Landroidx/paging/PageEvent$Insert;", "getEMPTY_REFRESH_LOCAL", "()Landroidx/paging/PageEvent$Insert;", "Append", ExifInterface.GPS_DIRECTION_TRUE, "pages", "", "Landroidx/paging/TransformablePage;", "placeholdersAfter", "", "sourceLoadStates", "Landroidx/paging/LoadStates;", "mediatorLoadStates", "Prepend", "placeholdersBefore", HttpHeaders.REFRESH, "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public static /* synthetic */ Insert Refresh$default(Companion companion, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2, int i3, Object obj) {
                if ((i3 & 16) != 0) {
                    loadStates2 = null;
                }
                return companion.Refresh(list, i, i2, loadStates, loadStates2);
            }

            public final <T> Insert<T> Refresh(List<TransformablePage<T>> pages, int placeholdersBefore, int placeholdersAfter, LoadStates sourceLoadStates, LoadStates mediatorLoadStates) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.REFRESH, pages, placeholdersBefore, placeholdersAfter, sourceLoadStates, mediatorLoadStates, null);
            }

            public static /* synthetic */ Insert Prepend$default(Companion companion, List list, int i, LoadStates loadStates, LoadStates loadStates2, int i2, Object obj) {
                if ((i2 & 8) != 0) {
                    loadStates2 = null;
                }
                return companion.Prepend(list, i, loadStates, loadStates2);
            }

            public final <T> Insert<T> Prepend(List<TransformablePage<T>> pages, int placeholdersBefore, LoadStates sourceLoadStates, LoadStates mediatorLoadStates) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.PREPEND, pages, placeholdersBefore, -1, sourceLoadStates, mediatorLoadStates, null);
            }

            public static /* synthetic */ Insert Append$default(Companion companion, List list, int i, LoadStates loadStates, LoadStates loadStates2, int i2, Object obj) {
                if ((i2 & 8) != 0) {
                    loadStates2 = null;
                }
                return companion.Append(list, i, loadStates, loadStates2);
            }

            public final <T> Insert<T> Append(List<TransformablePage<T>> pages, int placeholdersAfter, LoadStates sourceLoadStates, LoadStates mediatorLoadStates) {
                Intrinsics.checkNotNullParameter(pages, "pages");
                Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
                return new Insert<>(LoadType.APPEND, pages, -1, placeholdersAfter, sourceLoadStates, mediatorLoadStates, null);
            }

            public final Insert<Object> getEMPTY_REFRESH_LOCAL() {
                return Insert.EMPTY_REFRESH_LOCAL;
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            EMPTY_REFRESH_LOCAL = Companion.Refresh$default(companion, CollectionsKt.listOf(TransformablePage.INSTANCE.getEMPTY_INITIAL_PAGE()), 0, 0, new LoadStates(LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release(), LoadState.NotLoading.INSTANCE.getComplete$paging_common_release(), LoadState.NotLoading.INSTANCE.getComplete$paging_common_release()), null, 16, null);
        }

        public String toString() {
            List<T> data;
            List<T> data2;
            Iterator<T> it = this.pages.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((TransformablePage) it.next()).getData().size();
            }
            int i2 = this.placeholdersBefore;
            String valueOf = i2 != -1 ? String.valueOf(i2) : "none";
            int i3 = this.placeholdersAfter;
            String valueOf2 = i3 != -1 ? String.valueOf(i3) : "none";
            LoadStates loadStates = this.mediatorLoadStates;
            StringBuilder append = new StringBuilder("PageEvent.Insert for ").append(this.loadType).append(", with ").append(i).append(" items (\n                    |   first item: ");
            TransformablePage transformablePage = (TransformablePage) CollectionsKt.firstOrNull((List) this.pages);
            StringBuilder append2 = append.append((transformablePage == null || (data2 = transformablePage.getData()) == null) ? null : CollectionsKt.firstOrNull((List) data2)).append("\n                    |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) CollectionsKt.lastOrNull((List) this.pages);
            String sb = append2.append((transformablePage2 == null || (data = transformablePage2.getData()) == null) ? null : CollectionsKt.lastOrNull((List) data)).append("\n                    |   placeholdersBefore: ").append(valueOf).append("\n                    |   placeholdersAfter: ").append(valueOf2).append("\n                    |   sourceLoadStates: ").append(this.sourceLoadStates).append("\n                    ").toString();
            if (loadStates != null) {
                sb = sb + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt.trimMargin$default(sb + "|)", null, 1, null);
        }

        private final <R> Insert<R> mapPages(Function1<? super TransformablePage<T>, TransformablePage<R>> transform) {
            LoadType loadType = getLoadType();
            List<TransformablePage<T>> pages = getPages();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pages, 10));
            Iterator<T> it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(transform.invoke(it.next()));
            }
            return new Insert<>(loadType, arrayList, getPlaceholdersBefore(), getPlaceholdersAfter(), getSourceLoadStates(), getMediatorLoadStates(), null);
        }
    }

    /* compiled from: PageEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J7\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Landroidx/paging/PageEvent$Drop;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/PageEvent;", "loadType", "Landroidx/paging/LoadType;", "minPageOffset", "", "maxPageOffset", "placeholdersRemaining", "(Landroidx/paging/LoadType;III)V", "getLoadType", "()Landroidx/paging/LoadType;", "getMaxPageOffset", "()I", "getMinPageOffset", "pageCount", "getPageCount", "getPlaceholdersRemaining", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Drop<T> extends PageEvent<T> {
        private final LoadType loadType;
        private final int maxPageOffset;
        private final int minPageOffset;
        private final int placeholdersRemaining;

        /* compiled from: PageEvent.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[LoadType.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LoadType.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static /* synthetic */ Drop copy$default(Drop drop, LoadType loadType, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                loadType = drop.loadType;
            }
            if ((i4 & 2) != 0) {
                i = drop.minPageOffset;
            }
            if ((i4 & 4) != 0) {
                i2 = drop.maxPageOffset;
            }
            if ((i4 & 8) != 0) {
                i3 = drop.placeholdersRemaining;
            }
            return drop.copy(loadType, i, i2, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final LoadType getLoadType() {
            return this.loadType;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        /* renamed from: component4, reason: from getter */
        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        public final Drop<T> copy(LoadType loadType, int minPageOffset, int maxPageOffset, int placeholdersRemaining) {
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            return new Drop<>(loadType, minPageOffset, maxPageOffset, placeholdersRemaining);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Drop)) {
                return false;
            }
            Drop drop = (Drop) other;
            return this.loadType == drop.loadType && this.minPageOffset == drop.minPageOffset && this.maxPageOffset == drop.maxPageOffset && this.placeholdersRemaining == drop.placeholdersRemaining;
        }

        public int hashCode() {
            return (((((this.loadType.hashCode() * 31) + Integer.hashCode(this.minPageOffset)) * 31) + Integer.hashCode(this.maxPageOffset)) * 31) + Integer.hashCode(this.placeholdersRemaining);
        }

        public final LoadType getLoadType() {
            return this.loadType;
        }

        public final int getMinPageOffset() {
            return this.minPageOffset;
        }

        public final int getMaxPageOffset() {
            return this.maxPageOffset;
        }

        public final int getPlaceholdersRemaining() {
            return this.placeholdersRemaining;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Drop(LoadType loadType, int i, int i2, int i3) {
            super(null);
            Intrinsics.checkNotNullParameter(loadType, "loadType");
            this.loadType = loadType;
            this.minPageOffset = i;
            this.maxPageOffset = i2;
            this.placeholdersRemaining = i3;
            if (loadType == LoadType.REFRESH) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
            }
            if (getPageCount() <= 0) {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + getPageCount()).toString());
            }
            if (i3 < 0) {
                throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i3).toString());
            }
        }

        public final int getPageCount() {
            return (this.maxPageOffset - this.minPageOffset) + 1;
        }

        public String toString() {
            String str;
            int i = WhenMappings.$EnumSwitchMapping$0[this.loadType.ordinal()];
            if (i == 1) {
                str = "end";
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "front";
            }
            return StringsKt.trimMargin$default("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.minPageOffset + "\n                    |   maxPageOffset: " + this.maxPageOffset + "\n                    |   placeholdersRemaining: " + this.placeholdersRemaining + "\n                    |)", null, 1, null);
        }
    }

    /* compiled from: PageEvent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/paging/PageEvent$LoadStateUpdate;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/paging/PageEvent;", Property.SYMBOL_Z_ORDER_SOURCE, "Landroidx/paging/LoadStates;", "mediator", "(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V", "getMediator", "()Landroidx/paging/LoadStates;", "getSource", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LoadStateUpdate<T> extends PageEvent<T> {
        private final LoadStates mediator;
        private final LoadStates source;

        public static /* synthetic */ LoadStateUpdate copy$default(LoadStateUpdate loadStateUpdate, LoadStates loadStates, LoadStates loadStates2, int i, Object obj) {
            if ((i & 1) != 0) {
                loadStates = loadStateUpdate.source;
            }
            if ((i & 2) != 0) {
                loadStates2 = loadStateUpdate.mediator;
            }
            return loadStateUpdate.copy(loadStates, loadStates2);
        }

        /* renamed from: component1, reason: from getter */
        public final LoadStates getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final LoadStates getMediator() {
            return this.mediator;
        }

        public final LoadStateUpdate<T> copy(LoadStates source, LoadStates mediator) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new LoadStateUpdate<>(source, mediator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadStateUpdate)) {
                return false;
            }
            LoadStateUpdate loadStateUpdate = (LoadStateUpdate) other;
            return Intrinsics.areEqual(this.source, loadStateUpdate.source) && Intrinsics.areEqual(this.mediator, loadStateUpdate.mediator);
        }

        public int hashCode() {
            int hashCode = this.source.hashCode() * 31;
            LoadStates loadStates = this.mediator;
            return hashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public /* synthetic */ LoadStateUpdate(LoadStates loadStates, LoadStates loadStates2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(loadStates, (i & 2) != 0 ? null : loadStates2);
        }

        public final LoadStates getSource() {
            return this.source;
        }

        public final LoadStates getMediator() {
            return this.mediator;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadStateUpdate(LoadStates source, LoadStates loadStates) {
            super(null);
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
            this.mediator = loadStates;
        }

        public String toString() {
            LoadStates loadStates = this.mediator;
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.source + "\n                    ";
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt.trimMargin$default(str + "|)", null, 1, null);
        }
    }

    static /* synthetic */ <T, R> Object map$suspendImpl(PageEvent<T> pageEvent, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super PageEvent<R>> continuation) {
        Intrinsics.checkNotNull(pageEvent, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.map>");
        return pageEvent;
    }

    static /* synthetic */ <T, R> Object flatMap$suspendImpl(PageEvent<T> pageEvent, Function2<? super T, ? super Continuation<? super Iterable<? extends R>>, ? extends Object> function2, Continuation<? super PageEvent<R>> continuation) {
        Intrinsics.checkNotNull(pageEvent, "null cannot be cast to non-null type androidx.paging.PageEvent<R of androidx.paging.PageEvent.flatMap>");
        return pageEvent;
    }
}
