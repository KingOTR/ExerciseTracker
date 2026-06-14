package com.example.rungps.ui.shell;

import androidx.compose.material3.SnackbarHostState;
import com.example.rungps.feature.run.RunsViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: AppScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.shell.AppScreenKt$AppScreen$24$1", f = "AppScreen.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$24$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ CoroutineScope $snackbarScope;
    final /* synthetic */ RunsViewModel $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppScreenKt$AppScreen$24$1(RunsViewModel runsViewModel, CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, Continuation<? super AppScreenKt$AppScreen$24$1> continuation) {
        super(2, continuation);
        this.$vm = runsViewModel;
        this.$snackbarScope = coroutineScope;
        this.$snackbarHostState = snackbarHostState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppScreenKt$AppScreen$24$1(this.$vm, this.$snackbarScope, this.$snackbarHostState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppScreenKt$AppScreen$24$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<String> uiEvents = this.$vm.getUiEvents();
            final CoroutineScope coroutineScope = this.$snackbarScope;
            final SnackbarHostState snackbarHostState = this.$snackbarHostState;
            this.label = 1;
            if (uiEvents.collect(new FlowCollector() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$24$1.1

                /* compiled from: AppScreen.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.example.rungps.ui.shell.AppScreenKt$AppScreen$24$1$1$1", f = "AppScreen.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.example.rungps.ui.shell.AppScreenKt$AppScreen$24$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ String $msg;
                    final /* synthetic */ SnackbarHostState $snackbarHostState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00651(SnackbarHostState snackbarHostState, String str, Continuation<? super C00651> continuation) {
                        super(2, continuation);
                        this.$snackbarHostState = snackbarHostState;
                        this.$msg = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C00651(this.$snackbarHostState, this.$msg, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C00651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (SnackbarHostState.showSnackbar$default(this.$snackbarHostState, this.$msg, null, true, null, this, 10, null) == coroutine_suspended) {
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

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((String) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(String str, Continuation<? super Unit> continuation) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C00651(snackbarHostState, str, null), 3, null);
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
