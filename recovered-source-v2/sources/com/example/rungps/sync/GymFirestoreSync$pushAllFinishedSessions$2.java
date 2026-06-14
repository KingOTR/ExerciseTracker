package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.GymFirestoreSync$pushAllFinishedSessions$2", f = "GymFirestoreSync.kt", i = {0, 1, 1, 1, 1}, l = {182, 185}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "finished", "sess", "n"}, s = {"L$0", "L$0", "L$1", "L$3", "I$0"})
/* loaded from: classes3.dex */
final class GymFirestoreSync$pushAllFinishedSessions$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<String> $errors;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymFirestoreSync$pushAllFinishedSessions$2(Context context, List<String> list, Continuation<? super GymFirestoreSync$pushAllFinishedSessions$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$errors = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymFirestoreSync$pushAllFinishedSessions$2 gymFirestoreSync$pushAllFinishedSessions$2 = new GymFirestoreSync$pushAllFinishedSessions$2(this.$context, this.$errors, continuation);
        gymFirestoreSync$pushAllFinishedSessions$2.L$0 = obj;
        return gymFirestoreSync$pushAllFinishedSessions$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return ((GymFirestoreSync$pushAllFinishedSessions$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ad -> B:8:0x00af). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Iterator it;
        List list;
        CoroutineScope coroutineScope2;
        Object m7905constructorimpl;
        List<String> list2;
        List<String> list3;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null) {
                return Boxing.boxInt(0);
            }
            String uid = currentUser.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            if (StringsKt.isBlank(uid)) {
                return Boxing.boxInt(0);
            }
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = Repository.INSTANCE.get(this.$context).finishedGymSessions(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.I$0;
            GymSessionEntity gymSessionEntity = (GymSessionEntity) this.L$3;
            it = (Iterator) this.L$2;
            list = (List) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
            if (!Result.m7912isSuccessimpl(m7905constructorimpl)) {
                Boxing.boxInt(i3);
                i2 = i3 + 1;
            } else {
                long id = gymSessionEntity.getId();
                Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                if (m7908exceptionOrNullimpl == null || (str = m7908exceptionOrNullimpl.getMessage()) == null) {
                    str = "push failed";
                }
                String str2 = "gym #" + id + ": " + str;
                List<String> list4 = this.$errors;
                if (list4 != null) {
                    Boxing.boxBoolean(list4.add(str2));
                }
                i2 = i3;
            }
            if (it.hasNext()) {
                GymSessionEntity gymSessionEntity2 = (GymSessionEntity) it.next();
                Context context = this.$context;
                try {
                } catch (Throwable th2) {
                    int i4 = i2;
                    gymSessionEntity = gymSessionEntity2;
                    i3 = i4;
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
                }
                Result.Companion companion3 = Result.INSTANCE;
                GymFirestoreSync gymFirestoreSync = GymFirestoreSync.INSTANCE;
                long id2 = gymSessionEntity2.getId();
                this.L$0 = coroutineScope2;
                this.L$1 = list;
                this.L$2 = it;
                this.L$3 = gymSessionEntity2;
                this.I$0 = i2;
                this.label = 2;
                if (gymFirestoreSync.pushFinishedSession(context, id2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i3 = i2;
                gymSessionEntity = gymSessionEntity2;
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                if (!Result.m7912isSuccessimpl(m7905constructorimpl)) {
                }
                if (it.hasNext()) {
                    if (!list.isEmpty() && i2 == 0 && (((list2 = this.$errors) == null || list2.isEmpty()) && (list3 = this.$errors) != null)) {
                        Boxing.boxBoolean(list3.add("gym: " + list.size() + " finished session(s) but none uploaded"));
                    }
                    return Boxing.boxInt(i2);
                }
            }
        }
        List list5 = (List) obj;
        it = list5.iterator();
        list = list5;
        coroutineScope2 = coroutineScope;
        if (it.hasNext()) {
        }
    }
}
