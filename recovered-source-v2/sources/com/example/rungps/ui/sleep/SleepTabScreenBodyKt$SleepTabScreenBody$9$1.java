package com.example.rungps.ui.sleep;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.State;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepEntryRepair;
import java.util.ArrayList;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$9$1", f = "SleepTabScreenBody.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$9$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ State<List<SleepEntryEntity>> $entries$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SleepTabScreenBodyKt$SleepTabScreenBody$9$1(State<? extends List<SleepEntryEntity>> state, Context context, Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$9$1> continuation) {
        super(2, continuation);
        this.$entries$delegate = state;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SleepTabScreenBodyKt$SleepTabScreenBody$9$1(this.$entries$delegate, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepTabScreenBodyKt$SleepTabScreenBody$9$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: SleepTabScreenBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$9$1$1", f = "SleepTabScreenBody.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$9$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ State<List<SleepEntryEntity>> $entries$delegate;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(State<? extends List<SleepEntryEntity>> state, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$entries$delegate = state;
            this.$ctx = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$entries$delegate, this.$ctx, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m7905constructorimpl;
            List SleepTabScreenBody$lambda$1;
            Iterator it;
            Context context;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    State<List<SleepEntryEntity>> state = this.$entries$delegate;
                    Context context2 = this.$ctx;
                    Result.Companion companion = Result.INSTANCE;
                    SleepTabScreenBody$lambda$1 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$1(state);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : SleepTabScreenBody$lambda$1) {
                        if (SleepEntryRepair.INSTANCE.needsRepair((SleepEntryEntity) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    context = context2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$1;
                    Context context3 = (Context) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    context = context3;
                }
                while (it.hasNext()) {
                    SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) it.next();
                    SleepEntryRepair sleepEntryRepair = SleepEntryRepair.INSTANCE;
                    this.L$0 = context;
                    this.L$1 = it;
                    this.label = 1;
                    if (SleepEntryRepair.repairIfNeeded$default(sleepEntryRepair, context, sleepEntryEntity, null, this, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
            if (m7908exceptionOrNullimpl != null) {
                Log.w(SleepTabComponentsKt.SLEEP_TAB_LOG, "sleep repair skipped", m7908exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$entries$delegate, this.$ctx, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
