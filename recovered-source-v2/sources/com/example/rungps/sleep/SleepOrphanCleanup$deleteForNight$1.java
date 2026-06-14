package com.example.rungps.sleep;

import android.content.Context;
import com.example.rungps.data.AppDb;
import com.example.rungps.data.SleepSoundDao;
import com.example.rungps.data.SleepSoundEventEntity;
import java.util.Iterator;
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

/* compiled from: SleepOrphanCleanup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepOrphanCleanup$deleteForNight$1", f = "SleepOrphanCleanup.kt", i = {0}, l = {16, 20}, m = "invokeSuspend", n = {"dao"}, s = {"L$1"})
/* loaded from: classes3.dex */
final class SleepOrphanCleanup$deleteForNight$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ long $nightStartMs;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepOrphanCleanup$deleteForNight$1(Context context, long j, Continuation<? super SleepOrphanCleanup$deleteForNight$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$nightStartMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepOrphanCleanup$deleteForNight$1 sleepOrphanCleanup$deleteForNight$1 = new SleepOrphanCleanup$deleteForNight$1(this.$context, this.$nightStartMs, continuation);
        sleepOrphanCleanup$deleteForNight$1.L$0 = obj;
        return sleepOrphanCleanup$deleteForNight$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((SleepOrphanCleanup$deleteForNight$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Context context;
        long j;
        SleepSoundDao sleepSoundDao;
        Object forNight;
        Context context2;
        long j2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            context = this.$context;
            j = this.$nightStartMs;
            Result.Companion companion2 = Result.INSTANCE;
            sleepSoundDao = AppDb.INSTANCE.get(context).sleepSoundDao();
            this.L$0 = context;
            this.L$1 = sleepSoundDao;
            this.J$0 = j;
            this.label = 1;
            forNight = sleepSoundDao.forNight(j, this);
            if (forNight == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = this.J$0;
                context2 = (Context) this.L$0;
                ResultKt.throwOnFailure(obj);
                SleepAudioClipStore.INSTANCE.deleteForNight(context2, j2);
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                return Result.m7904boximpl(m7905constructorimpl);
            }
            long j3 = this.J$0;
            sleepSoundDao = (SleepSoundDao) this.L$1;
            Context context3 = (Context) this.L$0;
            ResultKt.throwOnFailure(obj);
            forNight = obj;
            context = context3;
            j = j3;
        }
        Iterator it = ((List) forNight).iterator();
        while (it.hasNext()) {
            SleepAudioClipStore.INSTANCE.deleteEncrypted(context, ((SleepSoundEventEntity) it.next()).getEncryptedFileName());
        }
        this.L$0 = context;
        this.L$1 = null;
        this.J$0 = j;
        this.label = 2;
        if (sleepSoundDao.deleteForNight(j, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        context2 = context;
        j2 = j;
        SleepAudioClipStore.INSTANCE.deleteForNight(context2, j2);
        m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        return Result.m7904boximpl(m7905constructorimpl);
    }
}
