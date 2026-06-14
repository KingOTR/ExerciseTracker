package com.example.rungps.ui.shell;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavHostController;
import com.example.rungps.data.Repository;
import com.example.rungps.gym.ExerciseMuscleTagSeeder;
import com.example.rungps.nfc.GymNfcHandler;
import com.example.rungps.tracking.TrackingUiState;
import com.example.rungps.ui.navigation.AppDestinationsKt;
import com.example.rungps.ui.navigation.MainTab;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: AppScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.shell.AppScreenKt$AppScreen$1$1", f = "AppScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Long> $focusGymSessionId$delegate;
    final /* synthetic */ State<TrackingUiState> $live$delegate;
    final /* synthetic */ NavHostController $navController;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppScreenKt$AppScreen$1$1(Context context, MutableState<Long> mutableState, NavHostController navHostController, State<TrackingUiState> state, Continuation<? super AppScreenKt$AppScreen$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$focusGymSessionId$delegate = mutableState;
        this.$navController = navHostController;
        this.$live$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppScreenKt$AppScreen$1$1 appScreenKt$AppScreen$1$1 = new AppScreenKt$AppScreen$1$1(this.$ctx, this.$focusGymSessionId$delegate, this.$navController, this.$live$delegate, continuation);
        appScreenKt$AppScreen$1$1.L$0 = obj;
        return appScreenKt$AppScreen$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppScreenKt$AppScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: AppScreen.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.shell.AppScreenKt$AppScreen$1$1$1", f = "AppScreen.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.shell.AppScreenKt$AppScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ctx, continuation);
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
                    Result.Companion companion = Result.INSTANCE;
                    ExerciseMuscleTagSeeder exerciseMuscleTagSeeder = ExerciseMuscleTagSeeder.INSTANCE;
                    Repository repository = Repository.INSTANCE.get(context);
                    this.label = 1;
                    obj = exerciseMuscleTagSeeder.repairMisclassifiedLegCurlTags(repository, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Result.m7905constructorimpl(Boxing.boxInt(((Number) obj).intValue()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TrackingUiState AppScreen$lambda$2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new AnonymousClass1(this.$ctx, null), 2, null);
            Long consumeFocusGymSession = GymNfcHandler.INSTANCE.consumeFocusGymSession(this.$ctx);
            if (consumeFocusGymSession != null) {
                this.$focusGymSessionId$delegate.setValue(Boxing.boxLong(consumeFocusGymSession.longValue()));
            }
            String consumeOpenTab = GymNfcHandler.INSTANCE.consumeOpenTab(this.$ctx);
            if (consumeOpenTab != null) {
                AppScreenKt.AppScreen$goTab(this.$ctx, this.$navController, AppDestinationsKt.routeForNfcTab(consumeOpenTab));
            } else {
                AppScreen$lambda$2 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
                if (!AppScreen$lambda$2.isRecording()) {
                    AppScreenKt.AppScreen$goTab(this.$ctx, this.$navController, MainTab.Home.getRoute());
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
