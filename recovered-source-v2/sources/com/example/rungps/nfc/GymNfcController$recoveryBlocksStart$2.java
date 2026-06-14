package com.example.rungps.nfc;

import androidx.activity.ComponentActivity;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.recovery.DeloadAdvice;
import com.example.rungps.recovery.DeloadPlanner;
import com.example.rungps.recovery.ReadyToTrain;
import com.example.rungps.recovery.TrainReadiness;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GymNfcController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.nfc.GymNfcController$recoveryBlocksStart$2", f = "GymNfcController.kt", i = {0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4}, l = {313, 315, 316, 317, 321}, m = "invokeSuspend", n = {"repo", "repo", "destination$iv$iv", "element$iv$iv", "repo", "destination$iv$iv", "element$iv$iv", "repo", "destination$iv$iv", "element$iv$iv", "events"}, s = {"L$0", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0"})
/* loaded from: classes3.dex */
final class GymNfcController$recoveryBlocksStart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ GymNfcController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymNfcController$recoveryBlocksStart$2(GymNfcController gymNfcController, Continuation<? super GymNfcController$recoveryBlocksStart$2> continuation) {
        super(2, continuation);
        this.this$0 = gymNfcController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymNfcController$recoveryBlocksStart$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((GymNfcController$recoveryBlocksStart$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0146  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0121 -> B:52:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0135 -> B:51:0x0138). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ComponentActivity componentActivity;
        Repository repository;
        Object first;
        ArrayList arrayList;
        Iterator it;
        Repository repository2;
        List list;
        Object first2;
        Object next;
        Object soccerSessionExists;
        boolean z;
        ArrayList arrayList2;
        Iterator it2;
        Iterator it3;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        Long l = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Repository.Companion companion = Repository.INSTANCE;
            componentActivity = this.this$0.activity;
            repository = companion.get(componentActivity);
            this.L$0 = repository;
            this.label = 1;
            first = FlowKt.first(repository.recoveryRecentFlow(60), this);
            if (first == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                next = this.L$3;
                it = (Iterator) this.L$2;
                arrayList = (Collection) this.L$1;
                repository2 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                z = ((Boolean) obj).booleanValue();
            } else if (i2 == 3) {
                next = this.L$3;
                it = (Iterator) this.L$2;
                arrayList = (Collection) this.L$1;
                repository2 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                z = ((Boolean) obj).booleanValue();
            } else {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    list = list2;
                    first2 = obj;
                    DeloadAdvice advise$default = DeloadPlanner.advise$default(DeloadPlanner.INSTANCE, (List) first2, list, 0L, 4, null);
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((RecoveryEventEntity) obj2).getEndsAtMs() > currentTimeMillis) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = arrayList3;
                    arrayList2 = arrayList4;
                    it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        Long boxLong = Boxing.boxLong(((RecoveryEventEntity) it2.next()).getEndsAtMs());
                        loop1: while (true) {
                            l = boxLong;
                            while (it2.hasNext()) {
                                boxLong = Boxing.boxLong(((RecoveryEventEntity) it2.next()).getEndsAtMs());
                                if (l.compareTo(boxLong) < 0) {
                                    break;
                                }
                            }
                        }
                    }
                    Long l2 = l;
                    long longValue = (l2 == null ? l2.longValue() : currentTimeMillis) - currentTimeMillis;
                    if ((arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                        it3 = arrayList2.iterator();
                        int i3 = 0;
                        while (it3.hasNext()) {
                            if (Intrinsics.areEqual(((RecoveryEventEntity) it3.next()).getKind(), "SOCCER") && (i3 = i3 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                        i = i3;
                    } else {
                        i = 0;
                    }
                    return Boxing.boxBoolean(ReadyToTrain.INSTANCE.assess(longValue, arrayList4.size(), i, advise$default, null, null, null).getReadiness() != TrainReadiness.Rest);
                }
                next = this.L$3;
                it = (Iterator) this.L$2;
                arrayList = (Collection) this.L$1;
                repository2 = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                soccerSessionExists = obj;
                z = ((Boolean) soccerSessionExists).booleanValue();
            }
            if (z) {
                arrayList.add(next);
            }
            if (it.hasNext()) {
                next = it.next();
                RecoveryEventEntity recoveryEventEntity = (RecoveryEventEntity) next;
                String kind = recoveryEventEntity.getKind();
                int hashCode = kind.hashCode();
                if (hashCode != -1843726999) {
                    if (hashCode == 71067) {
                        if (kind.equals("GYM")) {
                            long sourceId = recoveryEventEntity.getSourceId();
                            this.L$0 = repository2;
                            this.L$1 = arrayList;
                            this.L$2 = it;
                            this.L$3 = next;
                            this.label = 3;
                            Object gymSessionExists = repository2.gymSessionExists(sourceId, this);
                            if (gymSessionExists == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            z = ((Boolean) gymSessionExists).booleanValue();
                            if (z) {
                            }
                        }
                    } else if (hashCode == 81515 && kind.equals("RUN")) {
                        long sourceId2 = recoveryEventEntity.getSourceId();
                        this.L$0 = repository2;
                        this.L$1 = arrayList;
                        this.L$2 = it;
                        this.L$3 = next;
                        this.label = 2;
                        Object runExists = repository2.runExists(sourceId2, this);
                        if (runExists == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        z = ((Boolean) runExists).booleanValue();
                        if (z) {
                        }
                    }
                    if (it.hasNext()) {
                    }
                } else if (kind.equals("SOCCER")) {
                    long sourceId3 = recoveryEventEntity.getSourceId();
                    this.L$0 = repository2;
                    this.L$1 = arrayList;
                    this.L$2 = it;
                    this.L$3 = next;
                    this.label = 4;
                    soccerSessionExists = repository2.soccerSessionExists(sourceId3, this);
                    if (soccerSessionExists == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = ((Boolean) soccerSessionExists).booleanValue();
                    if (z) {
                    }
                    if (it.hasNext()) {
                        list = (List) arrayList;
                        this.L$0 = list;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 5;
                        first2 = FlowKt.first(repository2.gymSessionsFlow(), this);
                        if (first2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        DeloadAdvice advise$default2 = DeloadPlanner.advise$default(DeloadPlanner.INSTANCE, (List) first2, list, 0L, 4, null);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        ArrayList arrayList32 = new ArrayList();
                        while (r2.hasNext()) {
                        }
                        ArrayList arrayList42 = arrayList32;
                        arrayList2 = arrayList42;
                        it2 = arrayList2.iterator();
                        if (it2.hasNext()) {
                        }
                        Long l22 = l;
                        long longValue2 = (l22 == null ? l22.longValue() : currentTimeMillis2) - currentTimeMillis2;
                        if (arrayList2 instanceof Collection) {
                        }
                        it3 = arrayList2.iterator();
                        int i32 = 0;
                        while (it3.hasNext()) {
                        }
                        i = i32;
                        return Boxing.boxBoolean(ReadyToTrain.INSTANCE.assess(longValue2, arrayList42.size(), i, advise$default2, null, null, null).getReadiness() != TrainReadiness.Rest);
                    }
                }
                z = true;
                if (z) {
                }
                if (it.hasNext()) {
                }
            }
        } else {
            repository = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            first = obj;
        }
        arrayList = new ArrayList();
        it = ((Iterable) first).iterator();
        repository2 = repository;
        if (it.hasNext()) {
        }
    }
}
