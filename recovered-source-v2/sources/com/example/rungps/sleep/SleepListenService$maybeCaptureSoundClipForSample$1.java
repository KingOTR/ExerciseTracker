package com.example.rungps.sleep;

import android.content.Context;
import com.example.rungps.data.AppDb;
import com.example.rungps.data.SleepSoundDao;
import com.example.rungps.data.SleepSoundEventEntity;
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
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepListenService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepListenService$maybeCaptureSoundClipForSample$1", f = "SleepListenService.kt", i = {}, l = {557}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepListenService$maybeCaptureSoundClipForSample$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $clipMs;
    final /* synthetic */ String $fileName;
    final /* synthetic */ String $kind;
    final /* synthetic */ long $now;
    final /* synthetic */ byte[] $pcm;
    final /* synthetic */ SleepTrackSample $sample;
    final /* synthetic */ long $startedAtMs;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SleepListenService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepListenService$maybeCaptureSoundClipForSample$1(SleepListenService sleepListenService, String str, byte[] bArr, long j, long j2, String str2, SleepTrackSample sleepTrackSample, int i, Continuation<? super SleepListenService$maybeCaptureSoundClipForSample$1> continuation) {
        super(2, continuation);
        this.this$0 = sleepListenService;
        this.$fileName = str;
        this.$pcm = bArr;
        this.$startedAtMs = j;
        this.$now = j2;
        this.$kind = str2;
        this.$sample = sleepTrackSample;
        this.$clipMs = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepListenService$maybeCaptureSoundClipForSample$1 sleepListenService$maybeCaptureSoundClipForSample$1 = new SleepListenService$maybeCaptureSoundClipForSample$1(this.this$0, this.$fileName, this.$pcm, this.$startedAtMs, this.$now, this.$kind, this.$sample, this.$clipMs, continuation);
        sleepListenService$maybeCaptureSoundClipForSample$1.L$0 = obj;
        return sleepListenService$maybeCaptureSoundClipForSample$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepListenService$maybeCaptureSoundClipForSample$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        float coerceIn;
        int i;
        SleepListenService sleepListenService;
        long j;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                SleepListenService sleepListenService2 = this.this$0;
                String str = this.$fileName;
                byte[] bArr = this.$pcm;
                long j2 = this.$startedAtMs;
                long j3 = this.$now;
                String str2 = this.$kind;
                SleepTrackSample sleepTrackSample = this.$sample;
                int i4 = this.$clipMs;
                Result.Companion companion = Result.INSTANCE;
                SleepAudioClipStore sleepAudioClipStore = SleepAudioClipStore.INSTANCE;
                Context applicationContext = sleepListenService2.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                sleepAudioClipStore.writeEncryptedWav(applicationContext, str, SleepListenService.INSTANCE.getSAMPLE_RATE(), bArr);
                AppDb.Companion companion2 = AppDb.INSTANCE;
                Context applicationContext2 = sleepListenService2.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                SleepSoundDao sleepSoundDao = companion2.get(applicationContext2).sleepSoundDao();
                if (Intrinsics.areEqual(str2, "snore")) {
                    coerceIn = RangesKt.coerceIn(sleepTrackSample.getSnoreLikelihood(), 0.0f, 1.0f);
                } else {
                    coerceIn = Intrinsics.areEqual(str2, "noise") ? RangesKt.coerceIn(sleepTrackSample.getAudioLevel() / 3.2f, 0.0f, 1.0f) : RangesKt.coerceIn(sleepTrackSample.getAudioLevel() / 4.0f, 0.0f, 1.0f);
                }
                SleepSoundEventEntity sleepSoundEventEntity = new SleepSoundEventEntity(0L, j2, j3, str2, coerceIn, i4, str, 0L, 129, null);
                this.L$0 = sleepListenService2;
                this.J$0 = j3;
                i = 1;
                this.label = 1;
                if (sleepSoundDao.insert(sleepSoundEventEntity, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sleepListenService = sleepListenService2;
                j = j3;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                sleepListenService = (SleepListenService) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = 1;
            }
            i2 = sleepListenService.clipsThisNight;
            sleepListenService.clipsThisNight = i2 + i;
            sleepListenService.lastClipAtMs = j;
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        SleepListenService sleepListenService3 = this.this$0;
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            SleepOvernightStore.INSTANCE.recordHealth(sleepListenService3, "clip_write_failed:" + m7908exceptionOrNullimpl.getClass().getSimpleName());
        }
        return Unit.INSTANCE;
    }
}
