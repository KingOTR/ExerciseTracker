package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.repo.RunRepository;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.logging.type.LogSeverity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RunFirestoreSync.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ>\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00110\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0002J>\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00110\u00102\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u00110\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010\u0018\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ(\u0010\u001d\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001fH\u0086@¢\u0006\u0002\u0010 ¨\u0006!"}, d2 = {"Lcom/example/rungps/sync/RunFirestoreSync;", "", "<init>", "()V", "runsCollection", "Lcom/google/firebase/firestore/CollectionReference;", "uid", "", "pushFinishedRun", "", "context", "Landroid/content/Context;", "localRunId", "", "(Landroid/content/Context;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decimateHr", "", "", "samples", "max", "", "decimateRoute", "", "points", "deleteRunFromCloud", "pullIntoRoom", "runRepo", "Lcom/example/rungps/data/repo/RunRepository;", "(Landroid/content/Context;Lcom/example/rungps/data/repo/RunRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushAllFinishedRuns", "errors", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunFirestoreSync {
    public static final int $stable = 0;
    public static final RunFirestoreSync INSTANCE = new RunFirestoreSync();

    private RunFirestoreSync() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionReference runsCollection(String uid) {
        CollectionReference collection = FirebaseFirestore.getInstance().collection("users").document(uid).collection("runs");
        Intrinsics.checkNotNullExpressionValue(collection, "collection(...)");
        return collection;
    }

    public final Object pushFinishedRun(Context context, long j, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RunFirestoreSync$pushFinishedRun$2(context, j, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    static /* synthetic */ List decimateHr$default(RunFirestoreSync runFirestoreSync, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 300;
        }
        return runFirestoreSync.decimateHr(list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<Map<String, Object>> decimateHr(List<? extends Map<String, ? extends Object>> samples, int max) {
        if (samples.size() <= max) {
            return samples;
        }
        double size = samples.size() / max;
        IntRange until = RangesKt.until(0, max);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add((Map) samples.get(RangesKt.coerceIn((int) (((IntIterator) it).nextInt() * size), 0, CollectionsKt.getLastIndex(samples))));
        }
        return arrayList;
    }

    static /* synthetic */ List decimateRoute$default(RunFirestoreSync runFirestoreSync, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = LogSeverity.WARNING_VALUE;
        }
        return runFirestoreSync.decimateRoute(list, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<Map<String, Double>> decimateRoute(List<? extends Map<String, Double>> points, int max) {
        if (points.size() <= max) {
            return points;
        }
        double size = points.size() / max;
        IntRange until = RangesKt.until(0, max);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add((Map) points.get(RangesKt.coerceIn((int) (((IntIterator) it).nextInt() * size), 0, CollectionsKt.getLastIndex(points))));
        }
        return arrayList;
    }

    public final Object deleteRunFromCloud(Context context, long j, Continuation<Object> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RunFirestoreSync$deleteRunFromCloud$2(j, null), continuation);
    }

    public final Object pullIntoRoom(Context context, RunRepository runRepository, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RunFirestoreSync$pullIntoRoom$2(context, runRepository, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object pushAllFinishedRuns$default(RunFirestoreSync runFirestoreSync, Context context, List list, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return runFirestoreSync.pushAllFinishedRuns(context, list, continuation);
    }

    public final Object pushAllFinishedRuns(Context context, List<String> list, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RunFirestoreSync$pushAllFinishedRuns$2(context, list, null), continuation);
    }
}
