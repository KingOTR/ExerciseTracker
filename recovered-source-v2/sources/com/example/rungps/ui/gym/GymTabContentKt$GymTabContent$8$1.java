package com.example.rungps.ui.gym;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.GymSplitEntity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$8$1", f = "GymTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Long> $activeSplitId$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ State<List<GymSplitEntity>> $splits$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymTabContentKt$GymTabContent$8$1(Context context, State<? extends List<GymSplitEntity>> state, MutableState<Long> mutableState, Continuation<? super GymTabContentKt$GymTabContent$8$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$splits$delegate = state;
        this.$activeSplitId$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$8$1(this.$ctx, this.$splits$delegate, this.$activeSplitId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List GymTabContent$lambda$0;
        List GymTabContent$lambda$02;
        List GymTabContent$lambda$03;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SharedPreferences sharedPreferences = this.$ctx.getSharedPreferences("settings", 0);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = sharedPreferences.getLong("gymActiveSplitId", -1L);
        GymTabContent$lambda$0 = GymTabContentKt.GymTabContent$lambda$0(this.$splits$delegate);
        if (!GymTabContent$lambda$0.isEmpty()) {
            if (longRef.element > 0) {
                GymTabContent$lambda$03 = GymTabContentKt.GymTabContent$lambda$0(this.$splits$delegate);
                List list = GymTabContent$lambda$03;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((GymSplitEntity) it.next()).getId() == longRef.element) {
                            break;
                        }
                    }
                }
            }
            GymTabContent$lambda$02 = GymTabContentKt.GymTabContent$lambda$0(this.$splits$delegate);
            longRef.element = ((GymSplitEntity) CollectionsKt.first(GymTabContent$lambda$02)).getId();
            sharedPreferences.edit().putLong("gymActiveSplitId", longRef.element).apply();
            this.$activeSplitId$delegate.setValue(Boxing.boxLong(longRef.element));
            return Unit.INSTANCE;
        }
        this.$activeSplitId$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}
