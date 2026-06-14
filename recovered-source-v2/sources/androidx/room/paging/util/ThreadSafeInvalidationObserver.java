package androidx.room.paging.util;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadSafeInvalidationObserver.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\u0005\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/room/paging/util/ThreadSafeInvalidationObserver;", "Landroidx/room/InvalidationTracker$Observer;", "tables", "", "", "onInvalidated", "Lkotlin/Function0;", "", "([Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getOnInvalidated", "()Lkotlin/jvm/functions/Function0;", "registered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "registerIfNecessary", "db", "Landroidx/room/RoomDatabase;", "room-paging_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThreadSafeInvalidationObserver extends InvalidationTracker.Observer {
    private final Function0<Unit> onInvalidated;
    private final AtomicBoolean registered;

    public final Function0<Unit> getOnInvalidated() {
        return this.onInvalidated;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadSafeInvalidationObserver(String[] tables, Function0<Unit> onInvalidated) {
        super(tables);
        Intrinsics.checkNotNullParameter(tables, "tables");
        Intrinsics.checkNotNullParameter(onInvalidated, "onInvalidated");
        this.onInvalidated = onInvalidated;
        this.registered = new AtomicBoolean(false);
    }

    @Override // androidx.room.InvalidationTracker.Observer
    public void onInvalidated(Set<String> tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.onInvalidated.invoke();
    }

    public final void registerIfNecessary(RoomDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        if (this.registered.compareAndSet(false, true)) {
            db.getInvalidationTracker().addWeakObserver(this);
        }
    }
}
