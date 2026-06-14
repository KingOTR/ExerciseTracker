package com.example.rungps.sync;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymSyncQueue.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.GymSyncQueue$flush$2", f = "GymSyncQueue.kt", i = {0, 0, 0, 0}, l = {43}, m = "invokeSuspend", n = {"$this$withContext", "remaining", "pushed", "id"}, s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes3.dex */
final class GymSyncQueue$flush$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymSyncQueue$flush$2(Context context, Continuation<? super GymSyncQueue$flush$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymSyncQueue$flush$2 gymSyncQueue$flush$2 = new GymSyncQueue$flush$2(this.$context, continuation);
        gymSyncQueue$flush$2.L$0 = obj;
        return gymSyncQueue$flush$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((GymSyncQueue$flush$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x009f -> B:7:0x00a2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Set loadIds;
        CoroutineScope coroutineScope;
        Iterator it;
        int i;
        Set set;
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            if (!GymSyncQueue.INSTANCE.isOnline(this.$context)) {
                return Boxing.boxInt(0);
            }
            if (FirebaseAuth.getInstance().getCurrentUser() != null) {
                loadIds = GymSyncQueue.INSTANCE.loadIds(this.$context);
                List list = CollectionsKt.toList(loadIds);
                if (list.isEmpty()) {
                    return Boxing.boxInt(0);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                coroutineScope = coroutineScope2;
                it = list.iterator();
                i = 0;
                set = linkedHashSet;
                if (it.hasNext()) {
                }
            } else {
                return Boxing.boxInt(0);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = this.J$0;
            i = this.I$0;
            it = (Iterator) this.L$2;
            set = (Set) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
            if (!Result.m7912isSuccessimpl(m7905constructorimpl)) {
                Boxing.boxInt(i);
                i++;
            } else {
                Boxing.boxBoolean(set.add(Boxing.boxLong(j)));
            }
            if (it.hasNext()) {
                j = ((Number) it.next()).longValue();
                Context context = this.$context;
                Result.Companion companion2 = Result.INSTANCE;
                GymFirestoreSync gymFirestoreSync = GymFirestoreSync.INSTANCE;
                this.L$0 = coroutineScope;
                this.L$1 = set;
                this.L$2 = it;
                this.I$0 = i;
                this.J$0 = j;
                this.label = 1;
                if (gymFirestoreSync.pushFinishedSession(context, j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                if (!Result.m7912isSuccessimpl(m7905constructorimpl)) {
                }
                if (it.hasNext()) {
                    GymSyncQueue.INSTANCE.saveIds(this.$context, set);
                    if (i > 0) {
                        this.$context.getSharedPreferences("gym_sync_queue", 0).edit().putLong("last_flush_ms", System.currentTimeMillis()).apply();
                    }
                    return Boxing.boxInt(i);
                }
            }
        }
    }
}
