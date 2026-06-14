package com.example.rungps.health;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* compiled from: SamsungHealthManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.health.SamsungHealthManager$backupRun$2", f = "SamsungHealthManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SamsungHealthManager$backupRun$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ double $distanceMeters;
    final /* synthetic */ Instant $endTime;
    final /* synthetic */ long $runId;
    final /* synthetic */ Instant $startTime;
    final /* synthetic */ long $steps;
    final /* synthetic */ Object $store;
    int label;
    final /* synthetic */ SamsungHealthManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SamsungHealthManager$backupRun$2(Instant instant, Instant instant2, double d, SamsungHealthManager samsungHealthManager, long j, long j2, Object obj, Continuation<? super SamsungHealthManager$backupRun$2> continuation) {
        super(2, continuation);
        this.$startTime = instant;
        this.$endTime = instant2;
        this.$distanceMeters = d;
        this.this$0 = samsungHealthManager;
        this.$runId = j;
        this.$steps = j2;
        this.$store = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SamsungHealthManager$backupRun$2(this.$startTime, this.$endTime, this.$distanceMeters, this.this$0, this.$runId, this.$steps, this.$store, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((SamsungHealthManager$backupRun$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        r10 = r17.this$0.exerciseLogOf(r10, r17.$endTime);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        Duration between;
        float f;
        double roughRunKcal;
        float f2;
        String str;
        Object exerciseLogOf;
        Object exerciseLogOf2;
        String str2;
        String str3;
        String str4;
        Class<?> cls;
        String str5;
        Object invoke;
        String str6;
        Object obj2;
        Method method;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            between = Duration.between(this.$startTime, this.$endTime);
            double d = this.$distanceMeters;
            f = (float) d;
            SamsungHealthManager samsungHealthManager = this.this$0;
            Intrinsics.checkNotNull(between);
            roughRunKcal = samsungHealthManager.roughRunKcal(d, between);
            f2 = (float) roughRunKcal;
            str = this.this$0.base;
            Class<?> cls2 = Class.forName(str + ".data.values.ExerciseLog");
            SamsungHealthManager samsungHealthManager2 = this.this$0;
            Intrinsics.checkNotNull(cls2);
            exerciseLogOf = samsungHealthManager2.exerciseLogOf(cls2, this.$startTime);
        } catch (Throwable unused) {
            z = false;
        }
        if (exerciseLogOf != null && exerciseLogOf2 != null) {
            List listOf = CollectionsKt.listOf(exerciseLogOf, exerciseLogOf2);
            str2 = this.this$0.base;
            Object invoke2 = Class.forName(str2 + ".data.values.ExerciseSession").getMethod("builder", new Class[0]).invoke(null, new Object[0]);
            str3 = this.this$0.base;
            Object obj3 = Class.forName(str3 + ".data.DataType$ExerciseType$PredefinedExerciseType").getField(DebugCoroutineInfoImplKt.RUNNING).get(null);
            SamsungHealthManager samsungHealthManager3 = this.this$0;
            Intrinsics.checkNotNull(invoke2);
            samsungHealthManager3.chain(invoke2, "setStartTime", this.$startTime);
            this.this$0.chain(invoke2, "setEndTime", this.$endTime);
            this.this$0.chain(invoke2, "setExerciseType", obj3);
            this.this$0.chain(invoke2, "setDuration", between);
            this.this$0.chain(invoke2, "setCalories", Boxing.boxFloat(f2));
            this.this$0.chain(invoke2, "setDistance", Boxing.boxFloat(f));
            try {
                this.this$0.chain(invoke2, "setComment", "Exercise Tracker run #" + this.$runId + " (steps " + this.$steps + ")");
                this.this$0.chain(invoke2, "setLog", listOf);
                Object invoke3 = invoke2.getClass().getMethod("build", new Class[0]).invoke(invoke2, new Object[0]);
                str4 = this.this$0.base;
                cls = Class.forName(str4 + ".data.values.HealthDataPoint");
                try {
                    Object invoke4 = cls.getMethod("builder", new Class[0]).invoke(null, new Object[0]);
                    str5 = this.this$0.base;
                    Class<?> cls3 = Class.forName(str5 + ".data.DataType$ExerciseType");
                    Object obj4 = cls3.getField("EXERCISE_TYPE").get(null);
                    Object obj5 = cls3.getField("SESSIONS").get(null);
                    SamsungHealthManager samsungHealthManager4 = this.this$0;
                    Intrinsics.checkNotNull(invoke4);
                    samsungHealthManager4.chain(invoke4, "setStartTime", this.$startTime);
                    this.this$0.chain(invoke4, "setEndTime", this.$endTime);
                    SamsungHealthManager samsungHealthManager5 = this.this$0;
                    Intrinsics.checkNotNull(obj4);
                    samsungHealthManager5.addFieldData(invoke4, "addFieldData", obj4, obj3);
                    SamsungHealthManager samsungHealthManager6 = this.this$0;
                    Intrinsics.checkNotNull(obj5);
                    samsungHealthManager6.addFieldData(invoke4, "addFieldData", obj5, CollectionsKt.listOf(invoke3));
                    try {
                        invoke = invoke4.getClass().getMethod("build", new Class[0]).invoke(invoke4, new Object[0]);
                        str6 = this.this$0.base;
                        obj2 = Class.forName(str6 + ".data.DataTypes").getField("EXERCISE").get(null);
                    } catch (Throwable unused2) {
                        z = false;
                    }
                } catch (Throwable unused3) {
                    z = false;
                }
            } catch (Throwable unused4) {
                z = false;
            }
            if (obj2 == null) {
                try {
                    return Boxing.boxBoolean(false);
                } catch (Throwable unused5) {
                    z = false;
                }
            } else {
                Method[] methods = obj2.getClass().getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                for (Method method2 : methods) {
                    Method method3 = method2;
                    if (!Intrinsics.areEqual(method3.getName(), "getInsertDataRequestBuilder") && !Intrinsics.areEqual(method3.getName(), "insertDataRequestBuilder")) {
                        if (method3.getParameterCount() == 0) {
                            String name = method3.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            if (StringsKt.contains((CharSequence) name, (CharSequence) "InsertDataRequest", true)) {
                            }
                        }
                    }
                    method = method2;
                }
                method = null;
                Method method4 = method;
                try {
                } catch (Throwable unused6) {
                    z = false;
                }
                if (method4 == null) {
                    return Boxing.boxBoolean(false);
                }
                Object invoke5 = method4.invoke(obj2, new Object[0]);
                if (invoke5 == null) {
                    return Boxing.boxBoolean(false);
                }
                Object invoke6 = invoke5.getClass().getMethod("addData", cls).invoke(invoke5, invoke);
                Object invoke7 = invoke6.getClass().getMethod("build", new Class[0]).invoke(invoke6, new Object[0]);
                Class<?> cls4 = this.$store.getClass();
                Class<?>[] clsArr = new Class[1];
                z = false;
                try {
                    clsArr[0] = invoke7.getClass();
                    Object invoke8 = cls4.getMethod("insertDataAsync", clsArr).invoke(this.$store, invoke7);
                    SamsungHealthManager samsungHealthManager7 = this.this$0;
                    Intrinsics.checkNotNull(invoke8);
                    samsungHealthManager7.futureGet(invoke8);
                    z2 = true;
                } catch (Throwable unused7) {
                }
                return Boxing.boxBoolean(z2);
            }
            z2 = z;
            return Boxing.boxBoolean(z2);
        }
        return Boxing.boxBoolean(false);
    }
}
