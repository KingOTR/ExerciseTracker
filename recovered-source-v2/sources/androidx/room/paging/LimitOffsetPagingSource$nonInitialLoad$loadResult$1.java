package androidx.room.paging;

import android.database.Cursor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* compiled from: LimitOffsetPagingSource.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class LimitOffsetPagingSource$nonInitialLoad$loadResult$1<Value> extends FunctionReferenceImpl implements Function1<Cursor, List<? extends Value>> {
    LimitOffsetPagingSource$nonInitialLoad$loadResult$1(Object obj) {
        super(1, obj, LimitOffsetPagingSource.class, "convertRows", "convertRows(Landroid/database/Cursor;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<Value> invoke(Cursor p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((LimitOffsetPagingSource) this.receiver).convertRows(p0);
    }
}
