package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SleepSoundEventEntity;
import com.example.rungps.sleep.SleepSoundKinds;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1", f = "SleepNightDetailSheet.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ SleepEntryEntity $e;
    final /* synthetic */ MutableState<Boolean> $soundBusy$delegate;
    final /* synthetic */ MutableState<String> $soundError$delegate;
    final /* synthetic */ MutableState<List<SleepSoundEventEntity>> $soundEvents$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1(MutableState<String> mutableState, MutableState<Boolean> mutableState2, Context context, SleepEntryEntity sleepEntryEntity, MutableState<List<SleepSoundEventEntity>> mutableState3, Continuation<? super SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1> continuation) {
        super(2, continuation);
        this.$soundError$delegate = mutableState;
        this.$soundBusy$delegate = mutableState2;
        this.$ctx = context;
        this.$e = sleepEntryEntity;
        this.$soundEvents$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1(this.$soundError$delegate, this.$soundBusy$delegate, this.$ctx, this.$e, this.$soundEvents$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$soundError$delegate.setValue(null);
            SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$22(this.$soundBusy$delegate, true);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1(this.$ctx, this.$e, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Object value = ((Result) obj).getValue();
        MutableState<List<SleepSoundEventEntity>> mutableState = this.$soundEvents$delegate;
        Object emptyList = CollectionsKt.emptyList();
        if (!Result.m7911isFailureimpl(value)) {
            emptyList = value;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) emptyList) {
            if (SleepSoundKinds.INSTANCE.isDisturbance(((SleepSoundEventEntity) obj2).getKind())) {
                arrayList.add(obj2);
            }
        }
        mutableState.setValue(arrayList);
        MutableState<String> mutableState2 = this.$soundError$delegate;
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(value);
        mutableState2.setValue(m7908exceptionOrNullimpl != null ? m7908exceptionOrNullimpl.getMessage() : null);
        SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$22(this.$soundBusy$delegate, false);
        return Unit.INSTANCE;
    }
}
