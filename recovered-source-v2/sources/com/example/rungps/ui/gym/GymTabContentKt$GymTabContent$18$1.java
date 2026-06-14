package com.example.rungps.ui.gym;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$18$1", f = "GymTabContent.kt", i = {0, 0}, l = {340}, m = "invokeSuspend", n = {"m", "tid"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$18$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Map<Long, String>> $dayNameCache$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ State<List<GymSessionEntity>> $sessions$delegate;
    long J$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymTabContentKt$GymTabContent$18$1(State<? extends List<GymSessionEntity>> state, Repository repository, MutableState<Map<Long, String>> mutableState, Continuation<? super GymTabContentKt$GymTabContent$18$1> continuation) {
        super(2, continuation);
        this.$sessions$delegate = state;
        this.$repo = repository;
        this.$dayNameCache$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$18$1(this.$sessions$delegate, this.$repo, this.$dayNameCache$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$18$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0075 -> B:5:0x0078). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List GymTabContent$lambda$1;
        Iterator it;
        Map map;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            GymTabContent$lambda$1 = GymTabContentKt.GymTabContent$lambda$1(this.$sessions$delegate);
            it = GymTabContent$lambda$1.iterator();
            map = linkedHashMap;
            while (it.hasNext()) {
            }
            this.$dayNameCache$delegate.setValue(map);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = this.J$0;
        it = (Iterator) this.L$1;
        map = (Map) this.L$0;
        ResultKt.throwOnFailure(obj);
        String str = (String) obj;
        if (str != null) {
            map.put(Boxing.boxLong(longValue), str);
        }
        while (it.hasNext()) {
            Long templateDayId = ((GymSessionEntity) it.next()).getTemplateDayId();
            if (templateDayId != null) {
                longValue = templateDayId.longValue();
                if (!map.containsKey(Boxing.boxLong(longValue))) {
                    this.L$0 = map;
                    this.L$1 = it;
                    this.J$0 = longValue;
                    this.label = 1;
                    obj = BuildersKt.withContext(Dispatchers.getIO(), new GymTabContentKt$GymTabContent$18$1$name$1(this.$repo, longValue, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String str2 = (String) obj;
                    if (str2 != null) {
                    }
                    while (it.hasNext()) {
                    }
                }
            }
        }
        this.$dayNameCache$delegate.setValue(map);
        return Unit.INSTANCE;
    }
}
