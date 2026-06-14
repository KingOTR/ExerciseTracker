package com.example.rungps.ui.gym;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.rungps.notify.GymSessionReminderNotifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* compiled from: GymTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$5$1", f = "GymTabContent.kt", i = {0}, l = {181}, m = "invokeSuspend", n = {"sid"}, s = {"J$0"})
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Long $openSessionId;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymTabContentKt$GymTabContent$5$1(Long l, Context context, Continuation<? super GymTabContentKt$GymTabContent$5$1> continuation) {
        super(2, continuation);
        this.$openSessionId = l;
        this.$ctx = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymTabContentKt$GymTabContent$5$1(this.$openSessionId, this.$ctx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymTabContentKt$GymTabContent$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0040 -> B:5:0x0043). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long longValue;
        Long l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Long l2 = this.$openSessionId;
            if (l2 == null) {
                return Unit.INSTANCE;
            }
            longValue = l2.longValue();
            l = this.$openSessionId;
            if (l != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        longValue = this.J$0;
        ResultKt.throwOnFailure(obj);
        Long l3 = this.$openSessionId;
        if (l3 != null && l3.longValue() == longValue) {
            SharedPreferences sharedPreferences = this.$ctx.getSharedPreferences("settings", 0);
            long j = sharedPreferences.getLong("gym_last_set_entry_ms_" + longValue, 0L);
            long j2 = sharedPreferences.getLong("gym_idle_notif_sent_ms_" + longValue, 0L);
            long currentTimeMillis = System.currentTimeMillis();
            if (j <= 0) {
                j = currentTimeMillis;
            }
            long j3 = currentTimeMillis - j;
            if ((j2 > 0 || currentTimeMillis - j2 >= OpenStreetMapTileProviderConstants.ONE_HOUR) && j3 >= OpenStreetMapTileProviderConstants.ONE_HOUR) {
                sharedPreferences.edit().putLong("gym_idle_notif_sent_ms_" + longValue, currentTimeMillis).apply();
                GymSessionReminderNotifier.INSTANCE.showIdleReminder(this.$ctx, longValue);
            }
            l = this.$openSessionId;
            if (l != null && l.longValue() == longValue) {
                this.J$0 = longValue;
                this.label = 1;
                if (DelayKt.delay(60000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Long l32 = this.$openSessionId;
                if (l32 != null) {
                    SharedPreferences sharedPreferences2 = this.$ctx.getSharedPreferences("settings", 0);
                    long j4 = sharedPreferences2.getLong("gym_last_set_entry_ms_" + longValue, 0L);
                    long j22 = sharedPreferences2.getLong("gym_idle_notif_sent_ms_" + longValue, 0L);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (j4 <= 0) {
                    }
                    long j32 = currentTimeMillis2 - j4;
                    if (j22 > 0) {
                    }
                    sharedPreferences2.edit().putLong("gym_idle_notif_sent_ms_" + longValue, currentTimeMillis2).apply();
                    GymSessionReminderNotifier.INSTANCE.showIdleReminder(this.$ctx, longValue);
                    l = this.$openSessionId;
                    if (l != null) {
                        this.J$0 = longValue;
                        this.label = 1;
                        if (DelayKt.delay(60000L, this) == coroutine_suspended) {
                        }
                        Long l322 = this.$openSessionId;
                        if (l322 != null) {
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
