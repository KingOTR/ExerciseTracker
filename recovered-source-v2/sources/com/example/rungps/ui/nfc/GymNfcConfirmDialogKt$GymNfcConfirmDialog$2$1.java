package com.example.rungps.ui.nfc;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymNfcConfirmDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.nfc.GymNfcConfirmDialogKt$GymNfcConfirmDialog$2$1", f = "GymNfcConfirmDialog.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymNfcConfirmDialogKt$GymNfcConfirmDialog$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFinish;
    final /* synthetic */ MutableState<Boolean> $recoveryBlocked$delegate;
    final /* synthetic */ Function1<Continuation<? super Boolean>, Object> $recoveryBlocksStart;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymNfcConfirmDialogKt$GymNfcConfirmDialog$2$1(boolean z, Function1<? super Continuation<? super Boolean>, ? extends Object> function1, MutableState<Boolean> mutableState, Continuation<? super GymNfcConfirmDialogKt$GymNfcConfirmDialog$2$1> continuation) {
        super(2, continuation);
        this.$isFinish = z;
        this.$recoveryBlocksStart = function1;
        this.$recoveryBlocked$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymNfcConfirmDialogKt$GymNfcConfirmDialog$2$1(this.$isFinish, this.$recoveryBlocksStart, this.$recoveryBlocked$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymNfcConfirmDialogKt$GymNfcConfirmDialog$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: GymNfcConfirmDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.nfc.GymNfcConfirmDialogKt$GymNfcConfirmDialog$2$1$1", f = "GymNfcConfirmDialog.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.nfc.GymNfcConfirmDialogKt$GymNfcConfirmDialog$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Function1<Continuation<? super Boolean>, Object> $recoveryBlocksStart;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super Continuation<? super Boolean>, ? extends Object> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$recoveryBlocksStart = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$recoveryBlocksStart, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Function1<Continuation<? super Boolean>, Object> function1 = this.$recoveryBlocksStart;
                this.label = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<Boolean> mutableState;
        MutableState<Boolean> mutableState2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableState = this.$recoveryBlocked$delegate;
            if (!this.$isFinish) {
                this.L$0 = mutableState;
                this.label = 1;
                Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$recoveryBlocksStart, null), this);
                if (withContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = withContext;
                mutableState2 = mutableState;
            }
            z = false;
            mutableState2 = mutableState;
            GymNfcConfirmDialogKt.GymNfcConfirmDialog$lambda$3(mutableState2, z);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableState2 = (MutableState) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (!((Boolean) obj).booleanValue()) {
            mutableState = mutableState2;
            z = false;
            mutableState2 = mutableState;
        }
        GymNfcConfirmDialogKt.GymNfcConfirmDialog$lambda$3(mutableState2, z);
        return Unit.INSTANCE;
    }
}
