package com.example.rungps.ui.components;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MuscleHeatmapView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.components.MuscleHeatmapViewKt$MuscleHeatmapView$2$1", f = "MuscleHeatmapView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MuscleHeatmapViewKt$MuscleHeatmapView$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bodyStateJson;
    final /* synthetic */ MuscleAtlasBridge $bridge;
    final /* synthetic */ boolean $isDark;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MuscleHeatmapViewKt$MuscleHeatmapView$2$1(MuscleAtlasBridge muscleAtlasBridge, String str, boolean z, Continuation<? super MuscleHeatmapViewKt$MuscleHeatmapView$2$1> continuation) {
        super(2, continuation);
        this.$bridge = muscleAtlasBridge;
        this.$bodyStateJson = str;
        this.$isDark = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MuscleHeatmapViewKt$MuscleHeatmapView$2$1(this.$bridge, this.$bodyStateJson, this.$isDark, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MuscleHeatmapViewKt$MuscleHeatmapView$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$bridge.setLatestJson(this.$bodyStateJson);
        this.$bridge.setDarkTheme(this.$isDark);
        return Unit.INSTANCE;
    }
}
