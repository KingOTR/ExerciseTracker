package com.example.rungps.ui.sleep;

import android.content.Context;
import com.example.rungps.data.AppDb;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SleepSoundDao;
import com.example.rungps.data.SleepSoundEventEntity;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepNightDetailSheet.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/example/rungps/data/SleepSoundEventEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1", f = "SleepNightDetailSheet.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends SleepSoundEventEntity>>>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ SleepEntryEntity $e;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1(Context context, SleepEntryEntity sleepEntryEntity, Continuation<? super SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$e = sleepEntryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1 sleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1 = new SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1(this.$ctx, this.$e, continuation);
        sleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1.L$0 = obj;
        return sleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends SleepSoundEventEntity>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<SleepSoundEventEntity>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<SleepSoundEventEntity>>> continuation) {
        return ((SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = this.$ctx;
                SleepEntryEntity sleepEntryEntity = this.$e;
                Result.Companion companion = Result.INSTANCE;
                SleepSoundDao sleepSoundDao = AppDb.INSTANCE.get(context).sleepSoundDao();
                long startTimeMs = sleepEntryEntity.getStartTimeMs();
                this.label = 1;
                obj = sleepSoundDao.forNight(startTimeMs, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m7905constructorimpl = Result.m7905constructorimpl((List) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m7904boximpl(m7905constructorimpl);
    }
}
