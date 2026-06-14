package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.routing.OsrmWalkingRouter;
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
import org.osmdroid.util.GeoPoint;

/* compiled from: MapTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$5$2$1$1", f = "MapTabContent.kt", i = {}, l = {772, 779, 783, 793}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$13$1$4$5$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<GeoPoint> $anchors;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<List<GeoPoint>> $planned;
    final /* synthetic */ MutableState<List<GeoPoint>> $plannedWaypoints;
    final /* synthetic */ MutableState<Boolean> $snapInProgress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MapTabContentKt$MapTabContent$13$1$4$5$2$1$1(List<? extends GeoPoint> list, MutableState<List<GeoPoint>> mutableState, MutableState<List<GeoPoint>> mutableState2, MutableState<Boolean> mutableState3, Context context, Continuation<? super MapTabContentKt$MapTabContent$13$1$4$5$2$1$1> continuation) {
        super(2, continuation);
        this.$anchors = list;
        this.$planned = mutableState;
        this.$plannedWaypoints = mutableState2;
        this.$snapInProgress$delegate = mutableState3;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTabContentKt$MapTabContent$13$1$4$5$2$1$1(this.$anchors, this.$planned, this.$plannedWaypoints, this.$snapInProgress$delegate, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapTabContentKt$MapTabContent$13$1$4$5$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6904footRouteStitched0E7RQCE$default;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            MapTabContentKt.MapTabContent$lambda$73(this.$snapInProgress$delegate, false);
            this.label = 4;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(this.$ctx, e, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MapTabContentKt.MapTabContent$lambda$73(this.$snapInProgress$delegate, true);
            this.label = 1;
            m6904footRouteStitched0E7RQCE$default = OsrmWalkingRouter.m6904footRouteStitched0E7RQCE$default(OsrmWalkingRouter.INSTANCE, this.$anchors, false, this, 2, null);
            if (m6904footRouteStitched0E7RQCE$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            m6904footRouteStitched0E7RQCE$default = ((Result) obj).getValue();
        }
        List<GeoPoint> list = (List) (Result.m7911isFailureimpl(m6904footRouteStitched0E7RQCE$default) ? null : m6904footRouteStitched0E7RQCE$default);
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m6904footRouteStitched0E7RQCE$default);
        if (m7908exceptionOrNullimpl == null || (str = m7908exceptionOrNullimpl.getMessage()) == null) {
            str = "OSRM failed";
        }
        MapTabContentKt.MapTabContent$lambda$73(this.$snapInProgress$delegate, false);
        if (list != null && list.size() >= 2) {
            this.$planned.setValue(list);
            this.$plannedWaypoints.setValue(this.$anchors);
            this.label = 2;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$ctx, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            this.label = 3;
            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$ctx, str, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MapTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$5$2$1$1$1", f = "MapTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$5$2$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Toast.makeText(this.$ctx, "Walking route snap applied.", 0).show();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MapTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$5$2$1$1$2", f = "MapTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$5$2$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ String $err;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$err = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$ctx, this.$err, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context context = this.$ctx;
            String str = this.$err;
            if (str == null) {
                str = "need internet or OSRM unavailable";
            }
            Toast.makeText(context, "Couldn't snap: " + str, 1).show();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MapTabContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$5$2$1$1$3", f = "MapTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$5$2$1$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ Exception $e;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Context context, Exception exc, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$ctx, this.$e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context context = this.$ctx;
            String message = this.$e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            Toast.makeText(context, "Snap error: " + message, 1).show();
            return Unit.INSTANCE;
        }
    }
}
