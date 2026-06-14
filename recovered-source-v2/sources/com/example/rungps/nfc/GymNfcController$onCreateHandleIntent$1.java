package com.example.rungps.nfc;

import android.content.Intent;
import android.nfc.Tag;
import androidx.activity.ComponentActivity;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.nfc.GymNfcHandler;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymNfcController.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.nfc.GymNfcController$onCreateHandleIntent$1", f = "GymNfcController.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_POOL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymNfcController$onCreateHandleIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GymNfcController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymNfcController$onCreateHandleIntent$1(Intent intent, GymNfcController gymNfcController, Continuation<? super GymNfcController$onCreateHandleIntent$1> continuation) {
        super(2, continuation);
        this.$intent = intent;
        this.this$0 = gymNfcController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GymNfcController$onCreateHandleIntent$1 gymNfcController$onCreateHandleIntent$1 = new GymNfcController$onCreateHandleIntent$1(this.$intent, this.this$0, continuation);
        gymNfcController$onCreateHandleIntent$1.L$0 = obj;
        return gymNfcController$onCreateHandleIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymNfcController$onCreateHandleIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        ComponentActivity componentActivity;
        GymNfcHandler.TagResult tagResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GymNfcController gymNfcController = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                GymNfcController$onCreateHandleIntent$1$hasOpen$1$1 gymNfcController$onCreateHandleIntent$1$hasOpen$1$1 = new GymNfcController$onCreateHandleIntent$1$hasOpen$1$1(gymNfcController, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, gymNfcController$onCreateHandleIntent$1$hasOpen$1$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        Boolean boxBoolean = Boxing.boxBoolean(false);
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = boxBoolean;
        }
        Boolean bool = (Boolean) m7905constructorimpl;
        OpenGymSessionCache.INSTANCE.set(bool.booleanValue());
        boolean booleanValue = bool.booleanValue();
        Tag tag = (Tag) this.$intent.getParcelableExtra("android.nfc.extra.TAG", Tag.class);
        GymNfcController gymNfcController2 = this.this$0;
        GymNfcHandler gymNfcHandler = GymNfcHandler.INSTANCE;
        componentActivity = this.this$0.activity;
        gymNfcController2.pendingTagResult = gymNfcHandler.handleTagDiscoveryIntent(componentActivity, this.$intent, booleanValue, true);
        tagResult = this.this$0.pendingTagResult;
        if (tagResult == null && tag != null) {
            this.this$0.notifyNfcScanMiss(tag, booleanValue);
        } else {
            this.this$0.deliverPendingTagResult();
        }
        return Unit.INSTANCE;
    }
}
