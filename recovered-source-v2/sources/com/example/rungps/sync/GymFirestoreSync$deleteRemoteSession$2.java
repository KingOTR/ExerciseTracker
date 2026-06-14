package com.example.rungps.sync;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: GymFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.GymFirestoreSync$deleteRemoteSession$2", f = "GymFirestoreSync.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymFirestoreSync$deleteRemoteSession$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $remoteId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymFirestoreSync$deleteRemoteSession$2(String str, Continuation<? super GymFirestoreSync$deleteRemoteSession$2> continuation) {
        super(2, continuation);
        this.$remoteId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymFirestoreSync$deleteRemoteSession$2 gymFirestoreSync$deleteRemoteSession$2 = new GymFirestoreSync$deleteRemoteSession$2(this.$remoteId, continuation);
        gymFirestoreSync$deleteRemoteSession$2.L$0 = obj;
        return gymFirestoreSync$deleteRemoteSession$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymFirestoreSync$deleteRemoteSession$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CollectionReference sessionsCollection;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
                if (currentUser == null) {
                    return Unit.INSTANCE;
                }
                String str = this.$remoteId;
                if (str != null) {
                    if (StringsKt.isBlank(str)) {
                        str = null;
                    }
                    if (str != null) {
                        Result.Companion companion = Result.INSTANCE;
                        GymFirestoreSync gymFirestoreSync = GymFirestoreSync.INSTANCE;
                        String uid = currentUser.getUid();
                        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                        sessionsCollection = gymFirestoreSync.sessionsCollection(uid);
                        Task<Void> delete = sessionsCollection.document(str).delete();
                        Intrinsics.checkNotNullExpressionValue(delete, "delete(...)");
                        this.label = 1;
                        obj = TasksKt.await(delete, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Result.m7905constructorimpl((Void) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
