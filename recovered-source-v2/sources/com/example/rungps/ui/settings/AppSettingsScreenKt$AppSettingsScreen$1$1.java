package com.example.rungps.ui.settings;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.AppPreferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppSettingsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.settings.AppSettingsScreenKt$AppSettingsScreen$1$1", f = "AppSettingsScreen.kt", i = {}, l = {56, 57, 58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppSettingsScreenKt$AppSettingsScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $mapLibre$delegate;
    final /* synthetic */ MutableState<Long> $moyoungSync$delegate;
    final /* synthetic */ MutableState<Boolean> $sleepLite$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSettingsScreenKt$AppSettingsScreen$1$1(Context context, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Long> mutableState3, Continuation<? super AppSettingsScreenKt$AppSettingsScreen$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$sleepLite$delegate = mutableState;
        this.$mapLibre$delegate = mutableState2;
        this.$moyoungSync$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppSettingsScreenKt$AppSettingsScreen$1$1(this.$ctx, this.$sleepLite$delegate, this.$mapLibre$delegate, this.$moyoungSync$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppSettingsScreenKt$AppSettingsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState<Boolean> mutableState;
        MutableState<Boolean> mutableState2;
        Object moyoungLastSyncMs;
        MutableState<Long> mutableState3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableState = this.$sleepLite$delegate;
            this.L$0 = mutableState;
            this.label = 1;
            obj = AppPreferences.INSTANCE.sleepLiteMode(this.$ctx, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableState3 = (MutableState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableState3.setValue((Long) obj);
                    return Unit.INSTANCE;
                }
                mutableState2 = (MutableState) this.L$0;
                ResultKt.throwOnFailure(obj);
                AppSettingsScreenKt.AppSettingsScreen$lambda$6(mutableState2, !Intrinsics.areEqual(obj, "osmdroid"));
                MutableState<Long> mutableState4 = this.$moyoungSync$delegate;
                this.L$0 = mutableState4;
                this.label = 3;
                moyoungLastSyncMs = AppPreferences.INSTANCE.moyoungLastSyncMs(this.$ctx, this);
                if (moyoungLastSyncMs != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = moyoungLastSyncMs;
                mutableState3 = mutableState4;
                mutableState3.setValue((Long) obj);
                return Unit.INSTANCE;
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        AppSettingsScreenKt.AppSettingsScreen$lambda$3(mutableState, ((Boolean) obj).booleanValue());
        mutableState2 = this.$mapLibre$delegate;
        this.L$0 = mutableState2;
        this.label = 2;
        obj = AppPreferences.INSTANCE.mapEngine(this.$ctx, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        AppSettingsScreenKt.AppSettingsScreen$lambda$6(mutableState2, !Intrinsics.areEqual(obj, "osmdroid"));
        MutableState<Long> mutableState42 = this.$moyoungSync$delegate;
        this.L$0 = mutableState42;
        this.label = 3;
        moyoungLastSyncMs = AppPreferences.INSTANCE.moyoungLastSyncMs(this.$ctx, this);
        if (moyoungLastSyncMs != coroutine_suspended) {
        }
    }
}
