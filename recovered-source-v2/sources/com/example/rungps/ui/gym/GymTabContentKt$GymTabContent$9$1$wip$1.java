package com.example.rungps.ui.gym;

import androidx.compose.runtime.State;
import com.example.rungps.data.GymDayTemplateEntity;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.Repository;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/GymSessionEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$9$1$wip$1", f = "GymTabContent.kt", i = {0}, l = {238}, m = "invokeSuspend", n = {"element$iv"}, s = {"L$2"})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$9$1$wip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GymSessionEntity>, Object> {
    final /* synthetic */ Repository $repo;
    final /* synthetic */ State<List<GymSessionEntity>> $sessions$delegate;
    final /* synthetic */ long $spId;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GymTabContentKt$GymTabContent$9$1$wip$1(State<? extends List<GymSessionEntity>> state, Repository repository, long j, Continuation<? super GymTabContentKt$GymTabContent$9$1$wip$1> continuation) {
        super(2, continuation);
        this.$sessions$delegate = state;
        this.$repo = repository;
        this.$spId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$9$1$wip$1(this.$sessions$delegate, this.$repo, this.$spId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GymSessionEntity> continuation) {
        return ((GymTabContentKt$GymTabContent$9$1$wip$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0070 -> B:5:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0081 -> B:10:0x0082). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List GymTabContent$lambda$1;
        long j;
        Iterator it;
        Repository repository;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GymTabContent$lambda$1 = GymTabContentKt.GymTabContent$lambda$1(this.$sessions$delegate);
            Repository repository2 = this.$repo;
            j = this.$spId;
            it = GymTabContent$lambda$1.iterator();
            repository = repository2;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            Object obj2 = this.L$2;
            it = (Iterator) this.L$1;
            repository = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            GymDayTemplateEntity gymDayTemplateEntity = (GymDayTemplateEntity) obj;
            if (gymDayTemplateEntity != null && gymDayTemplateEntity.getSplitId() == j) {
                z = true;
                if (z) {
                    return obj2;
                }
                if (!it.hasNext()) {
                    obj2 = it.next();
                    GymSessionEntity gymSessionEntity = (GymSessionEntity) obj2;
                    if (gymSessionEntity.getEndedAtMs() == null && !gymSessionEntity.getFreeDay() && gymSessionEntity.getTemplateDayId() != null) {
                        Long templateDayId = gymSessionEntity.getTemplateDayId();
                        Intrinsics.checkNotNull(templateDayId);
                        long longValue = templateDayId.longValue();
                        this.L$0 = repository;
                        this.L$1 = it;
                        this.L$2 = obj2;
                        this.J$0 = j;
                        this.label = 1;
                        obj = repository.dayTemplateById(longValue, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        GymDayTemplateEntity gymDayTemplateEntity2 = (GymDayTemplateEntity) obj;
                        if (gymDayTemplateEntity2 != null) {
                            z = true;
                            if (z) {
                            }
                            if (!it.hasNext()) {
                                return null;
                            }
                        }
                    }
                }
            }
            z = false;
            if (z) {
            }
            if (!it.hasNext()) {
            }
        }
    }
}
