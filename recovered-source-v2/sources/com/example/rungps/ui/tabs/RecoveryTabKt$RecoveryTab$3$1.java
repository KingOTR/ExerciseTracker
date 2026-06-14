package com.example.rungps.ui.tabs;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RecoveryTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$3$1", f = "RecoveryTab.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<List<RecoveryEventEntity>> $events$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ MutableState<List<RecoveryEventEntity>> $visibleEvents$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RecoveryTabKt$RecoveryTab$3$1(State<? extends List<RecoveryEventEntity>> state, Repository repository, MutableState<List<RecoveryEventEntity>> mutableState, Continuation<? super RecoveryTabKt$RecoveryTab$3$1> continuation) {
        super(2, continuation);
        this.$events$delegate = state;
        this.$repo = repository;
        this.$visibleEvents$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecoveryTabKt$RecoveryTab$3$1(this.$events$delegate, this.$repo, this.$visibleEvents$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecoveryTabKt$RecoveryTab$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: RecoveryTab.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/example/rungps/data/RecoveryEventEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$3$1$1", f = "RecoveryTab.kt", i = {0, 0, 1, 1, 2, 2}, l = {145, 146, 147}, m = "invokeSuspend", n = {"destination$iv$iv", "element$iv$iv", "destination$iv$iv", "element$iv$iv", "destination$iv$iv", "element$iv$iv"}, s = {"L$1", "L$3", "L$1", "L$3", "L$1", "L$3"})
    /* renamed from: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends RecoveryEventEntity>>, Object> {
        final /* synthetic */ State<List<RecoveryEventEntity>> $events$delegate;
        final /* synthetic */ Repository $repo;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(State<? extends List<RecoveryEventEntity>> state, Repository repository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$events$delegate = state;
            this.$repo = repository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$events$delegate, this.$repo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends RecoveryEventEntity>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<RecoveryEventEntity>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<RecoveryEventEntity>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
        
            if (r8.equals(com.example.rungps.tracking.ActivityTypes.BIKE) != false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
        
            r8 = r11.getSourceId();
            r10.L$0 = r7;
            r10.L$1 = r6;
            r10.L$2 = r5;
            r10.L$3 = r1;
            r10.label = 1;
            r11 = r7.runExists(r8, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
        
            if (r11 != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b3, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
        
            r11 = ((java.lang.Boolean) r11).booleanValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
        
            if (r8.equals("RUN") == false) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00fb -> B:7:0x00fe). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0108 -> B:8:0x0109). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List RecoveryTab$lambda$1;
            Repository repository;
            Collection arrayList;
            Iterator it;
            Object next;
            boolean z;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    next = this.L$3;
                    it = (Iterator) this.L$2;
                    arrayList = (Collection) this.L$1;
                    repository = (Repository) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    z = ((Boolean) obj).booleanValue();
                } else if (i == 2) {
                    next = this.L$3;
                    it = (Iterator) this.L$2;
                    arrayList = (Collection) this.L$1;
                    repository = (Repository) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    z = ((Boolean) obj).booleanValue();
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    next = this.L$3;
                    it = (Iterator) this.L$2;
                    arrayList = (Collection) this.L$1;
                    repository = (Repository) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    z = ((Boolean) obj).booleanValue();
                }
                if (z) {
                    arrayList.add(next);
                }
                if (it.hasNext()) {
                    next = it.next();
                    RecoveryEventEntity recoveryEventEntity = (RecoveryEventEntity) next;
                    String kind = recoveryEventEntity.getKind();
                    switch (kind.hashCode()) {
                        case -2047622491:
                            str = "STRAVA_BIKE";
                            kind.equals(str);
                            z = true;
                            if (z) {
                            }
                            if (it.hasNext()) {
                                return (List) arrayList;
                            }
                            break;
                        case -1843726999:
                            if (kind.equals("SOCCER")) {
                                long sourceId = recoveryEventEntity.getSourceId();
                                this.L$0 = repository;
                                this.L$1 = arrayList;
                                this.L$2 = it;
                                this.L$3 = next;
                                this.label = 3;
                                obj = repository.soccerSessionExists(sourceId, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                z = ((Boolean) obj).booleanValue();
                                if (z) {
                                }
                                if (it.hasNext()) {
                                }
                            }
                            z = true;
                            if (z) {
                            }
                            if (it.hasNext()) {
                            }
                            break;
                        case 71067:
                            if (kind.equals("GYM")) {
                                long sourceId2 = recoveryEventEntity.getSourceId();
                                this.L$0 = repository;
                                this.L$1 = arrayList;
                                this.L$2 = it;
                                this.L$3 = next;
                                this.label = 2;
                                Object gymSessionExists = repository.gymSessionExists(sourceId2, this);
                                if (gymSessionExists == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                z = ((Boolean) gymSessionExists).booleanValue();
                                if (z) {
                                }
                                if (it.hasNext()) {
                                }
                            }
                            z = true;
                            if (z) {
                            }
                            if (it.hasNext()) {
                            }
                            break;
                        case 81515:
                            break;
                        case 2038753:
                            break;
                        case 626700071:
                            str = "STRAVA_RUN";
                            kind.equals(str);
                            z = true;
                            if (z) {
                            }
                            if (it.hasNext()) {
                            }
                            break;
                        default:
                            z = true;
                            if (z) {
                            }
                            if (it.hasNext()) {
                            }
                            break;
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                RecoveryTab$lambda$1 = RecoveryTabKt.RecoveryTab$lambda$1(this.$events$delegate);
                repository = this.$repo;
                arrayList = new ArrayList();
                it = RecoveryTab$lambda$1.iterator();
                if (it.hasNext()) {
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<List<RecoveryEventEntity>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableState<List<RecoveryEventEntity>> mutableState2 = this.$visibleEvents$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$events$delegate, this.$repo, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = withContext;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((List) obj);
        return Unit.INSTANCE;
    }
}
