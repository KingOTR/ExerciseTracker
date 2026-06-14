package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.AppDb;
import com.example.rungps.data.SleepSoundDao;
import com.example.rungps.data.SleepSoundEventEntity;
import com.example.rungps.sleep.SleepAudioClipStore;
import com.example.rungps.sleep.SleepClipPlayer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
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

/* compiled from: SleepNightDetailSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$2$1$1", f = "SleepNightDetailSheet.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ SleepSoundEventEntity $ev;
    final /* synthetic */ MutableState<Boolean> $soundBusy$delegate;
    final /* synthetic */ MutableState<List<SleepSoundEventEntity>> $soundEvents$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$2$1$1(MutableState<Boolean> mutableState, Context context, SleepSoundEventEntity sleepSoundEventEntity, MutableState<List<SleepSoundEventEntity>> mutableState2, Continuation<? super SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$2$1$1> continuation) {
        super(2, continuation);
        this.$soundBusy$delegate = mutableState;
        this.$ctx = context;
        this.$ev = sleepSoundEventEntity;
        this.$soundEvents$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$2$1$1(this.$soundBusy$delegate, this.$ctx, this.$ev, this.$soundEvents$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List SleepNightDetailSheetContent$lambda$15;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$22(this.$soundBusy$delegate, true);
            SleepClipPlayer.INSTANCE.stop();
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, this.$ev, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        MutableState<List<SleepSoundEventEntity>> mutableState = this.$soundEvents$delegate;
        SleepNightDetailSheetContent$lambda$15 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$15(mutableState);
        SleepSoundEventEntity sleepSoundEventEntity = this.$ev;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : SleepNightDetailSheetContent$lambda$15) {
            if (((SleepSoundEventEntity) obj2).getId() != sleepSoundEventEntity.getId()) {
                arrayList.add(obj2);
            }
        }
        mutableState.setValue(arrayList);
        SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$22(this.$soundBusy$delegate, false);
        return Unit.INSTANCE;
    }

    /* compiled from: SleepNightDetailSheet.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$2$1$1$1", f = "SleepNightDetailSheet.kt", i = {}, l = {343}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$2$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ SleepSoundEventEntity $ev;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, SleepSoundEventEntity sleepSoundEventEntity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$ev = sleepSoundEventEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ctx, this.$ev, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Context context = this.$ctx;
                    SleepSoundEventEntity sleepSoundEventEntity = this.$ev;
                    Result.Companion companion = Result.INSTANCE;
                    SleepSoundDao sleepSoundDao = AppDb.INSTANCE.get(context).sleepSoundDao();
                    long id = sleepSoundEventEntity.getId();
                    this.label = 1;
                    if (sleepSoundDao.deleteById(id, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            SleepAudioClipStore.INSTANCE.deleteEncrypted(this.$ctx, this.$ev.getEncryptedFileName());
            return Unit.INSTANCE;
        }
    }
}
