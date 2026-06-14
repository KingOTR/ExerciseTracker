package com.example.rungps.sync;

import android.content.Context;
import com.example.rungps.data.UserProfile;
import com.example.rungps.data.UserProfileStore;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: ProfileFirestoreSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.ProfileFirestoreSync$pushFromPrefs$2", f = "ProfileFirestoreSync.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class ProfileFirestoreSync$pushFromPrefs$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileFirestoreSync$pushFromPrefs$2(Context context, Continuation<? super ProfileFirestoreSync$pushFromPrefs$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileFirestoreSync$pushFromPrefs$2(this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((ProfileFirestoreSync$pushFromPrefs$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String uid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
            if (currentUser == null || (uid = currentUser.getUid()) == null) {
                return Boxing.boxBoolean(false);
            }
            UserProfile load = UserProfileStore.INSTANCE.load(this.$context);
            if (!load.getHasCoreStats()) {
                return Boxing.boxBoolean(false);
            }
            Task<Void> task = FirebaseFirestore.getInstance().collection("users").document(uid).collection("prefs").document("body_profile").set(MapsKt.mapOf(TuplesKt.to("ageYears", UserProfile.resolvedAgeYears$default(load, null, 1, null)), TuplesKt.to("dobEpochDay", load.getDobEpochDay()), TuplesKt.to("heightCm", load.getHeightCm()), TuplesKt.to("weightKg", load.getWeightKg()), TuplesKt.to("sex", load.getSex()), TuplesKt.to("displayName", load.getDisplayName()), TuplesKt.to("updatedAtMs", Boxing.boxLong(System.currentTimeMillis()))), SetOptions.merge());
            Intrinsics.checkNotNullExpressionValue(task, "set(...)");
            this.label = 1;
            if (TasksKt.await(task, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(true);
    }
}
