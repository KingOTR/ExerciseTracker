package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.sleep.SleepAlarmPreferences;
import com.example.rungps.sleep.SleepCalendarHelper;
import kotlin.Metadata;
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

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$14$1", f = "SleepTabScreenBody.kt", i = {}, l = {425}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$14$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<SleepCalendarHelper.QueryResult> $calendarQuery$delegate;
    final /* synthetic */ boolean $calendarSyncEnabled;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $googleCalendarLinked$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepTabScreenBodyKt$SleepTabScreenBody$14$1(boolean z, Context context, MutableState<Boolean> mutableState, MutableState<SleepCalendarHelper.QueryResult> mutableState2, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$14$1> continuation) {
        super(2, continuation);
        this.$calendarSyncEnabled = z;
        this.$ctx = context;
        this.$googleCalendarLinked$delegate = mutableState;
        this.$calendarQuery$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$14$1(this.$calendarSyncEnabled, this.$ctx, this.$googleCalendarLinked$delegate, this.$calendarQuery$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$14$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<SleepCalendarHelper.QueryResult> mutableState;
        boolean SleepTabScreenBody$lambda$101;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$calendarSyncEnabled) {
                SleepTabScreenBody$lambda$101 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$101(this.$googleCalendarLinked$delegate);
                if (!SleepTabScreenBody$lambda$101 && !SleepCalendarHelper.INSTANCE.hasPermission(this.$ctx)) {
                    this.$calendarQuery$delegate.setValue(null);
                    return Unit.INSTANCE;
                }
            }
            MutableState<SleepCalendarHelper.QueryResult> mutableState2 = this.$calendarQuery$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, this.$googleCalendarLinked$delegate, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = withContext;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((SleepCalendarHelper.QueryResult) obj);
        return Unit.INSTANCE;
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$14$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$14$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SleepCalendarHelper.QueryResult>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ MutableState<Boolean> $googleCalendarLinked$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$googleCalendarLinked$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$googleCalendarLinked$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SleepCalendarHelper.QueryResult> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean SleepTabScreenBody$lambda$101;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int travelBufferMin = SleepAlarmPreferences.INSTANCE.travelBufferMin(this.$ctx);
                this.label = 1;
                obj = SleepCalendarHelper.resolveTomorrowCommitmentAsync$default(SleepCalendarHelper.INSTANCE, this.$ctx, travelBufferMin, null, this, 4, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SleepCalendarHelper.MorningCommitment morningCommitment = (SleepCalendarHelper.MorningCommitment) obj;
            if (morningCommitment != null) {
                return new SleepCalendarHelper.QueryResult.Success(morningCommitment);
            }
            if (!SleepCalendarHelper.INSTANCE.hasPermission(this.$ctx)) {
                SleepTabScreenBody$lambda$101 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$101(this.$googleCalendarLinked$delegate);
                if (!SleepTabScreenBody$lambda$101) {
                    return SleepCalendarHelper.QueryResult.NoPermission.INSTANCE;
                }
            }
            return new SleepCalendarHelper.QueryResult.Success(null);
        }
    }
}
