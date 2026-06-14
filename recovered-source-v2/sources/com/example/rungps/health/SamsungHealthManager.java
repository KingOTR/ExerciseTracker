package com.example.rungps.health;

import android.app.Activity;
import android.content.Context;
import androidx.autofill.HintConstants;
import com.google.firebase.firestore.model.Values;
import com.samsung.android.sdk.health.data.BuildConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: SamsungHealthManager.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002J\u0006\u0010\u000b\u001a\u00020\tJ\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002J\u0010\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0002J(\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0082@¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0082@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010\u001fJ\u0016\u0010!\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@¢\u0006\u0002\u0010\u001fJ$\u0010\"\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0082@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'H\u0002J\"\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-H\u0086@¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u0004\u0018\u00010\u00012\n\u00100\u001a\u0006\u0012\u0002\b\u000301H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\u0001H\u0002J6\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020)2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020)H\u0086@¢\u0006\u0002\u0010<J\u001e\u0010=\u001a\u0004\u0018\u00010\u00012\n\u0010>\u001a\u0006\u0012\u0002\b\u0003012\u0006\u0010?\u001a\u000207H\u0002J\"\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00072\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u0002J \u0010D\u001a\u00020\t2\n\u0010E\u001a\u0006\u0012\u0002\b\u0003012\n\u0010F\u001a\u0006\u0012\u0002\b\u000301H\u0002J*\u0010G\u001a\u00020%2\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u00012\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u0002J\u0018\u0010J\u001a\u00020:2\u0006\u0010K\u001a\u00020:2\u0006\u0010L\u001a\u00020MH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/example/rungps/health/SamsungHealthManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "base", "", "isSdkOnClasspath", "", "storeOrNull", "isSamsungHealthReachable", "permissionSetStepsReadOnly", "", "permissionSetExerciseWriteOnly", "permissionSetStepsAndExerciseWrite", "futureGet", "future", "grantedPermissions", "store", "wanted", "(Ljava/lang/Object;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasSubset", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasStepsReadPermission", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasExerciseWritePermission", "hasAllPermissions", "ensureStepsReadPermission", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureExerciseWritePermission", "ensurePermissions", "ensurePermissionSet", "(Landroid/app/Activity;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryResolve", "", "e", "", "readStepsForDay", "", "date", "Ljava/time/LocalDate;", "zoneId", "Ljava/time/ZoneId;", "(Ljava/time/LocalDate;Ljava/time/ZoneId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stepsTypeTotal", "stepsTypeCls", "Ljava/lang/Class;", "requestBuilder", "totalObj", "backupRun", "runId", "startTime", "Ljava/time/Instant;", "endTime", "distanceMeters", "", "steps", "(JLjava/time/Instant;Ljava/time/Instant;DJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exerciseLogOf", "logCls", "t", "chain", "target", HintConstants.AUTOFILL_HINT_NAME, "arg", "wrapPrimitive", "decl", "actual", "addFieldData", DatabaseFileArchive.COLUMN_KEY, Values.VECTOR_MAP_VECTORS_KEY, "roughRunKcal", "distanceM", "duration", "Ljava/time/Duration;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SamsungHealthManager {
    public static final int $stable = 8;
    private final String base;
    private final Context context;

    public SamsungHealthManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.base = BuildConfig.LIBRARY_PACKAGE_NAME;
    }

    public final boolean isSdkOnClasspath() {
        Object m7905constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            SamsungHealthManager samsungHealthManager = this;
            m7905constructorimpl = Result.m7905constructorimpl(Class.forName(this.base + ".HealthDataService"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m7912isSuccessimpl(m7905constructorimpl);
    }

    private final Object storeOrNull() {
        Object m7905constructorimpl;
        Method method;
        Object m7905constructorimpl2;
        Method method2;
        try {
            Result.Companion companion = Result.INSTANCE;
            SamsungHealthManager samsungHealthManager = this;
            m7905constructorimpl = Result.m7905constructorimpl(Class.forName(this.base + ".HealthDataService"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        Class cls = (Class) m7905constructorimpl;
        if (cls == null) {
            return null;
        }
        int i = 0;
        try {
            Result.Companion companion3 = Result.INSTANCE;
            SamsungHealthManager samsungHealthManager2 = this;
            Method[] methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            Method[] methodArr = methods;
            int length = methodArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methodArr[i2];
                Method method3 = method2;
                if (Intrinsics.areEqual(method3.getName(), "initialize") && method3.getParameterCount() == 1) {
                    break;
                }
                i2++;
            }
            Method method4 = method2;
            Result.m7905constructorimpl(method4 != null ? method4.invoke(null, this.context.getApplicationContext()) : null);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        Method[] methods2 = cls.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods2, "getMethods(...)");
        Method[] methodArr2 = methods2;
        int length2 = methodArr2.length;
        while (true) {
            if (i >= length2) {
                method = null;
                break;
            }
            method = methodArr2[i];
            Method method5 = method;
            if (Intrinsics.areEqual(method5.getName(), "getStore") && method5.getParameterCount() == 1) {
                break;
            }
            i++;
        }
        Method method6 = method;
        if (method6 == null) {
            return null;
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            SamsungHealthManager samsungHealthManager3 = this;
            m7905constructorimpl2 = Result.m7905constructorimpl(method6.invoke(null, this.context.getApplicationContext()));
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
            return null;
        }
        return m7905constructorimpl2;
    }

    public final boolean isSamsungHealthReachable() {
        return storeOrNull() != null;
    }

    private final Set<Object> permissionSetStepsReadOnly() {
        try {
            Class<?> cls = Class.forName(this.base + ".permission.Permission");
            Class<?> cls2 = Class.forName(this.base + ".data.DataTypes");
            Class<?> cls3 = Class.forName(this.base + ".permission.AccessType");
            Method[] methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            for (Method method : methods) {
                Method method2 = method;
                if (Intrinsics.areEqual(method2.getName(), "of") && method2.getParameterCount() == 2) {
                    return SetsKt.setOf(method.invoke(null, cls2.getField("STEPS").get(null), cls3.getField("READ").get(null)));
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Throwable unused) {
            return null;
        }
    }

    private final Set<Object> permissionSetExerciseWriteOnly() {
        try {
            Class<?> cls = Class.forName(this.base + ".permission.Permission");
            Class<?> cls2 = Class.forName(this.base + ".data.DataTypes");
            Class<?> cls3 = Class.forName(this.base + ".permission.AccessType");
            Method[] methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            for (Method method : methods) {
                Method method2 = method;
                if (Intrinsics.areEqual(method2.getName(), "of") && method2.getParameterCount() == 2) {
                    return SetsKt.setOf(method.invoke(null, cls2.getField("EXERCISE").get(null), cls3.getField("WRITE").get(null)));
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Throwable unused) {
            return null;
        }
    }

    private final Set<Object> permissionSetStepsAndExerciseWrite() {
        Set<Object> permissionSetExerciseWriteOnly;
        Set<Object> permissionSetStepsReadOnly = permissionSetStepsReadOnly();
        if (permissionSetStepsReadOnly == null || (permissionSetExerciseWriteOnly = permissionSetExerciseWriteOnly()) == null) {
            return null;
        }
        return SetsKt.plus((Set) permissionSetStepsReadOnly, (Iterable) permissionSetExerciseWriteOnly);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object futureGet(Object future) {
        return future.getClass().getMethod("get", new Class[0]).invoke(future, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object grantedPermissions(Object obj, Set<? extends Object> set, Continuation<? super Set<?>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SamsungHealthManager$grantedPermissions$2(obj, set, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(2:19|(2:21|22)(2:23|(1:25)))|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasSubset(Set<? extends Object> set, Continuation<? super Boolean> continuation) {
        SamsungHealthManager$hasSubset$1 samsungHealthManager$hasSubset$1;
        int i;
        if (continuation instanceof SamsungHealthManager$hasSubset$1) {
            samsungHealthManager$hasSubset$1 = (SamsungHealthManager$hasSubset$1) continuation;
            if ((samsungHealthManager$hasSubset$1.label & Integer.MIN_VALUE) != 0) {
                samsungHealthManager$hasSubset$1.label -= Integer.MIN_VALUE;
                Object obj = samsungHealthManager$hasSubset$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = samsungHealthManager$hasSubset$1.label;
                boolean z = false;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object storeOrNull = storeOrNull();
                    if (storeOrNull == null) {
                        return Boxing.boxBoolean(false);
                    }
                    samsungHealthManager$hasSubset$1.L$0 = set;
                    samsungHealthManager$hasSubset$1.label = 1;
                    obj = grantedPermissions(storeOrNull, set, samsungHealthManager$hasSubset$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (Set) samsungHealthManager$hasSubset$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                z = ((Set) obj).containsAll(set);
                return Boxing.boxBoolean(z);
            }
        }
        samsungHealthManager$hasSubset$1 = new SamsungHealthManager$hasSubset$1(this, continuation);
        Object obj2 = samsungHealthManager$hasSubset$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = samsungHealthManager$hasSubset$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        z2 = ((Set) obj2).containsAll(set);
        return Boxing.boxBoolean(z2);
    }

    public final Object hasStepsReadPermission(Continuation<? super Boolean> continuation) {
        Set<Object> permissionSetStepsReadOnly = permissionSetStepsReadOnly();
        return permissionSetStepsReadOnly == null ? Boxing.boxBoolean(false) : hasSubset(permissionSetStepsReadOnly, continuation);
    }

    public final Object hasExerciseWritePermission(Continuation<? super Boolean> continuation) {
        Set<Object> permissionSetExerciseWriteOnly = permissionSetExerciseWriteOnly();
        return permissionSetExerciseWriteOnly == null ? Boxing.boxBoolean(false) : hasSubset(permissionSetExerciseWriteOnly, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasAllPermissions(Continuation<? super Boolean> continuation) {
        SamsungHealthManager$hasAllPermissions$1 samsungHealthManager$hasAllPermissions$1;
        Object obj;
        int i;
        if (continuation instanceof SamsungHealthManager$hasAllPermissions$1) {
            samsungHealthManager$hasAllPermissions$1 = (SamsungHealthManager$hasAllPermissions$1) continuation;
            if ((samsungHealthManager$hasAllPermissions$1.label & Integer.MIN_VALUE) != 0) {
                samsungHealthManager$hasAllPermissions$1.label -= Integer.MIN_VALUE;
                obj = samsungHealthManager$hasAllPermissions$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = samsungHealthManager$hasAllPermissions$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    samsungHealthManager$hasAllPermissions$1.L$0 = this;
                    samsungHealthManager$hasAllPermissions$1.label = 1;
                    obj = hasStepsReadPermission(samsungHealthManager$hasAllPermissions$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (SamsungHealthManager) samsungHealthManager$hasAllPermissions$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boxing.boxBoolean(false);
                }
                samsungHealthManager$hasAllPermissions$1.L$0 = null;
                samsungHealthManager$hasAllPermissions$1.label = 2;
                obj = this.hasExerciseWritePermission(samsungHealthManager$hasAllPermissions$1);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        samsungHealthManager$hasAllPermissions$1 = new SamsungHealthManager$hasAllPermissions$1(this, continuation);
        obj = samsungHealthManager$hasAllPermissions$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = samsungHealthManager$hasAllPermissions$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final Object ensureStepsReadPermission(Activity activity, Continuation<? super Boolean> continuation) {
        Set<Object> permissionSetStepsReadOnly = permissionSetStepsReadOnly();
        return permissionSetStepsReadOnly == null ? Boxing.boxBoolean(false) : ensurePermissionSet(activity, permissionSetStepsReadOnly, continuation);
    }

    public final Object ensureExerciseWritePermission(Activity activity, Continuation<? super Boolean> continuation) {
        Set<Object> permissionSetExerciseWriteOnly = permissionSetExerciseWriteOnly();
        return permissionSetExerciseWriteOnly == null ? Boxing.boxBoolean(false) : ensurePermissionSet(activity, permissionSetExerciseWriteOnly, continuation);
    }

    public final Object ensurePermissions(Activity activity, Continuation<? super Boolean> continuation) {
        Set<Object> permissionSetStepsAndExerciseWrite = permissionSetStepsAndExerciseWrite();
        return permissionSetStepsAndExerciseWrite == null ? Boxing.boxBoolean(false) : ensurePermissionSet(activity, permissionSetStepsAndExerciseWrite, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(5:19|20|21|14|15))(6:23|24|25|26|27|(1:29)(4:30|21|14|15)))(4:38|39|40|41))(2:51|(2:53|54)(3:55|56|(1:58)(1:59)))|42|(2:44|45)(2:46|(1:48)(4:49|26|27|(0)(0)))))|65|6|7|(0)(0)|42|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0063, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0064, code lost:
    
        r10 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[Catch: all -> 0x0085, TryCatch #3 {all -> 0x0085, blocks: (B:40:0x007d, B:42:0x00b6, B:44:0x00c5, B:46:0x00ca), top: B:39:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #3 {all -> 0x0085, blocks: (B:40:0x007d, B:42:0x00b6, B:44:0x00c5, B:46:0x00ca), top: B:39:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.example.rungps.health.SamsungHealthManager] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.example.rungps.health.SamsungHealthManager] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v16, types: [com.example.rungps.health.SamsungHealthManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r14v21, types: [com.example.rungps.health.SamsungHealthManager] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ensurePermissionSet(Activity activity, Set<? extends Object> set, Continuation<? super Boolean> continuation) {
        SamsungHealthManager$ensurePermissionSet$1 samsungHealthManager$ensurePermissionSet$1;
        int i;
        ?? r10;
        MainCoroutineDispatcher main;
        SamsungHealthManager$ensurePermissionSet$2 samsungHealthManager$ensurePermissionSet$2;
        Object storeOrNull;
        Ref.ObjectRef objectRef;
        ?? r2;
        Activity activity2;
        Ref.ObjectRef objectRef2;
        Set<? extends Object> set2;
        Set set3;
        ?? r12;
        Set set4;
        if (continuation instanceof SamsungHealthManager$ensurePermissionSet$1) {
            samsungHealthManager$ensurePermissionSet$1 = (SamsungHealthManager$ensurePermissionSet$1) continuation;
            if ((samsungHealthManager$ensurePermissionSet$1.label & Integer.MIN_VALUE) != 0) {
                samsungHealthManager$ensurePermissionSet$1.label -= Integer.MIN_VALUE;
                Object obj = samsungHealthManager$ensurePermissionSet$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = samsungHealthManager$ensurePermissionSet$1.label;
                boolean z = false;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    storeOrNull = storeOrNull();
                    if (storeOrNull == null) {
                        return Boxing.boxBoolean(false);
                    }
                    try {
                        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                        samsungHealthManager$ensurePermissionSet$1.L$0 = this;
                        samsungHealthManager$ensurePermissionSet$1.L$1 = activity;
                        samsungHealthManager$ensurePermissionSet$1.L$2 = set;
                        samsungHealthManager$ensurePermissionSet$1.L$3 = storeOrNull;
                        samsungHealthManager$ensurePermissionSet$1.L$4 = objectRef3;
                        samsungHealthManager$ensurePermissionSet$1.L$5 = objectRef3;
                        samsungHealthManager$ensurePermissionSet$1.label = 1;
                        Object grantedPermissions = grantedPermissions(storeOrNull, set, samsungHealthManager$ensurePermissionSet$1);
                        if (grantedPermissions == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r10 = this;
                        objectRef = objectRef3;
                        r2 = grantedPermissions;
                        activity2 = activity;
                        objectRef2 = objectRef;
                        set2 = set;
                    } catch (Throwable th) {
                        r10 = this;
                        th = th;
                        main = Dispatchers.getMain();
                        samsungHealthManager$ensurePermissionSet$2 = new SamsungHealthManager$ensurePermissionSet$2(r10, activity, th, null);
                        samsungHealthManager$ensurePermissionSet$1.L$0 = null;
                        samsungHealthManager$ensurePermissionSet$1.L$1 = null;
                        samsungHealthManager$ensurePermissionSet$1.L$2 = null;
                        samsungHealthManager$ensurePermissionSet$1.L$3 = null;
                        samsungHealthManager$ensurePermissionSet$1.L$4 = null;
                        samsungHealthManager$ensurePermissionSet$1.L$5 = null;
                        samsungHealthManager$ensurePermissionSet$1.label = 4;
                        if (BuildersKt.withContext(main, samsungHealthManager$ensurePermissionSet$2, samsungHealthManager$ensurePermissionSet$1) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(z);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                return Boxing.boxBoolean(z);
                            }
                            set4 = (Set) samsungHealthManager$ensurePermissionSet$1.L$2;
                            activity = (Activity) samsungHealthManager$ensurePermissionSet$1.L$1;
                            ?? r14 = (SamsungHealthManager) samsungHealthManager$ensurePermissionSet$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            set = r14;
                            z = ((Set) obj).containsAll(set4);
                            return Boxing.boxBoolean(z);
                        }
                        Set set5 = (Set) samsungHealthManager$ensurePermissionSet$1.L$2;
                        Activity activity3 = (Activity) samsungHealthManager$ensurePermissionSet$1.L$1;
                        SamsungHealthManager samsungHealthManager = (SamsungHealthManager) samsungHealthManager$ensurePermissionSet$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        activity2 = activity3;
                        set3 = set5;
                        r12 = samsungHealthManager;
                        try {
                            CoroutineDispatcher io2 = Dispatchers.getIO();
                            SamsungHealthManager$ensurePermissionSet$obtained$1 samsungHealthManager$ensurePermissionSet$obtained$1 = new SamsungHealthManager$ensurePermissionSet$obtained$1(r12, obj, null);
                            samsungHealthManager$ensurePermissionSet$1.L$0 = r12;
                            samsungHealthManager$ensurePermissionSet$1.L$1 = activity2;
                            samsungHealthManager$ensurePermissionSet$1.L$2 = set3;
                            samsungHealthManager$ensurePermissionSet$1.label = 3;
                            obj = BuildersKt.withContext(io2, samsungHealthManager$ensurePermissionSet$obtained$1, samsungHealthManager$ensurePermissionSet$1);
                        } catch (Throwable th2) {
                            r10 = r12;
                            th = th2;
                            activity = activity2;
                            main = Dispatchers.getMain();
                            samsungHealthManager$ensurePermissionSet$2 = new SamsungHealthManager$ensurePermissionSet$2(r10, activity, th, null);
                            samsungHealthManager$ensurePermissionSet$1.L$0 = null;
                            samsungHealthManager$ensurePermissionSet$1.L$1 = null;
                            samsungHealthManager$ensurePermissionSet$1.L$2 = null;
                            samsungHealthManager$ensurePermissionSet$1.L$3 = null;
                            samsungHealthManager$ensurePermissionSet$1.L$4 = null;
                            samsungHealthManager$ensurePermissionSet$1.L$5 = null;
                            samsungHealthManager$ensurePermissionSet$1.label = 4;
                            if (BuildersKt.withContext(main, samsungHealthManager$ensurePermissionSet$2, samsungHealthManager$ensurePermissionSet$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Boxing.boxBoolean(z);
                        }
                        if (obj != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        set = r12;
                        set4 = set3;
                        activity = activity2;
                        z = ((Set) obj).containsAll(set4);
                        return Boxing.boxBoolean(z);
                    }
                    objectRef = (Ref.ObjectRef) samsungHealthManager$ensurePermissionSet$1.L$5;
                    objectRef2 = (Ref.ObjectRef) samsungHealthManager$ensurePermissionSet$1.L$4;
                    Object obj2 = samsungHealthManager$ensurePermissionSet$1.L$3;
                    Set<? extends Object> set6 = (Set) samsungHealthManager$ensurePermissionSet$1.L$2;
                    activity2 = (Activity) samsungHealthManager$ensurePermissionSet$1.L$1;
                    r10 = (SamsungHealthManager) samsungHealthManager$ensurePermissionSet$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        storeOrNull = obj2;
                        set2 = set6;
                        r2 = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        activity = activity2;
                        main = Dispatchers.getMain();
                        samsungHealthManager$ensurePermissionSet$2 = new SamsungHealthManager$ensurePermissionSet$2(r10, activity, th, null);
                        samsungHealthManager$ensurePermissionSet$1.L$0 = null;
                        samsungHealthManager$ensurePermissionSet$1.L$1 = null;
                        samsungHealthManager$ensurePermissionSet$1.L$2 = null;
                        samsungHealthManager$ensurePermissionSet$1.L$3 = null;
                        samsungHealthManager$ensurePermissionSet$1.L$4 = null;
                        samsungHealthManager$ensurePermissionSet$1.L$5 = null;
                        samsungHealthManager$ensurePermissionSet$1.label = 4;
                        if (BuildersKt.withContext(main, samsungHealthManager$ensurePermissionSet$2, samsungHealthManager$ensurePermissionSet$1) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(z);
                    }
                }
                objectRef.element = r2;
                if (!((Set) objectRef2.element).containsAll(set2)) {
                    return Boxing.boxBoolean(true);
                }
                Set mutableSet = CollectionsKt.toMutableSet(set2);
                TypeIntrinsics.asMutableCollection(mutableSet).removeAll(CollectionsKt.toSet((Iterable) objectRef2.element));
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                SamsungHealthManager$ensurePermissionSet$future$1 samsungHealthManager$ensurePermissionSet$future$1 = new SamsungHealthManager$ensurePermissionSet$future$1(storeOrNull, mutableSet, activity2, null);
                samsungHealthManager$ensurePermissionSet$1.L$0 = r10;
                samsungHealthManager$ensurePermissionSet$1.L$1 = activity2;
                samsungHealthManager$ensurePermissionSet$1.L$2 = mutableSet;
                samsungHealthManager$ensurePermissionSet$1.L$3 = null;
                samsungHealthManager$ensurePermissionSet$1.L$4 = null;
                samsungHealthManager$ensurePermissionSet$1.L$5 = null;
                samsungHealthManager$ensurePermissionSet$1.label = 2;
                obj = BuildersKt.withContext(main2, samsungHealthManager$ensurePermissionSet$future$1, samsungHealthManager$ensurePermissionSet$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                set3 = mutableSet;
                r12 = r10;
                CoroutineDispatcher io22 = Dispatchers.getIO();
                SamsungHealthManager$ensurePermissionSet$obtained$1 samsungHealthManager$ensurePermissionSet$obtained$12 = new SamsungHealthManager$ensurePermissionSet$obtained$1(r12, obj, null);
                samsungHealthManager$ensurePermissionSet$1.L$0 = r12;
                samsungHealthManager$ensurePermissionSet$1.L$1 = activity2;
                samsungHealthManager$ensurePermissionSet$1.L$2 = set3;
                samsungHealthManager$ensurePermissionSet$1.label = 3;
                obj = BuildersKt.withContext(io22, samsungHealthManager$ensurePermissionSet$obtained$12, samsungHealthManager$ensurePermissionSet$1);
                if (obj != coroutine_suspended) {
                }
            }
        }
        samsungHealthManager$ensurePermissionSet$1 = new SamsungHealthManager$ensurePermissionSet$1(this, continuation);
        Object obj3 = samsungHealthManager$ensurePermissionSet$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = samsungHealthManager$ensurePermissionSet$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        objectRef.element = r2;
        if (!((Set) objectRef2.element).containsAll(set2)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryResolve(Activity activity, final Throwable e) {
        try {
            Result.Companion companion = Result.INSTANCE;
            SamsungHealthManager samsungHealthManager = this;
            final Class<?> cls = Class.forName(this.base + ".exception.ResolvablePlatformException");
            if (cls.isInstance(e) && Intrinsics.areEqual(SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.sequenceOf("getHasResolution", "isHasResolution"), new Function1() { // from class: com.example.rungps.health.SamsungHealthManager$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Boolean tryResolve$lambda$11$lambda$10;
                    tryResolve$lambda$11$lambda$10 = SamsungHealthManager.tryResolve$lambda$11$lambda$10(SamsungHealthManager.this, cls, e, (String) obj);
                    return tryResolve$lambda$11$lambda$10;
                }
            })), (Object) true)) {
                cls.getMethod("resolve", Activity.class).invoke(e, activity);
            }
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean tryResolve$lambda$11$lambda$10(SamsungHealthManager samsungHealthManager, Class cls, Throwable th, String name) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object invoke = cls.getMethod(name, new Class[0]).invoke(th, new Object[0]);
            m7905constructorimpl = Result.m7905constructorimpl(invoke instanceof Boolean ? (Boolean) invoke : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        return (Boolean) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
    }

    public static /* synthetic */ Object readStepsForDay$default(SamsungHealthManager samsungHealthManager, LocalDate localDate, ZoneId zoneId, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return samsungHealthManager.readStepsForDay(localDate, zoneId, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readStepsForDay(LocalDate localDate, ZoneId zoneId, Continuation<? super Long> continuation) {
        SamsungHealthManager$readStepsForDay$1 samsungHealthManager$readStepsForDay$1;
        Object obj;
        int i;
        SamsungHealthManager samsungHealthManager;
        Object obj2;
        LocalDateTime atStartOfDay;
        if (continuation instanceof SamsungHealthManager$readStepsForDay$1) {
            samsungHealthManager$readStepsForDay$1 = (SamsungHealthManager$readStepsForDay$1) continuation;
            if ((samsungHealthManager$readStepsForDay$1.label & Integer.MIN_VALUE) != 0) {
                samsungHealthManager$readStepsForDay$1.label -= Integer.MIN_VALUE;
                obj = samsungHealthManager$readStepsForDay$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = samsungHealthManager$readStepsForDay$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object storeOrNull = storeOrNull();
                    if (storeOrNull == null) {
                        return null;
                    }
                    samsungHealthManager$readStepsForDay$1.L$0 = this;
                    samsungHealthManager$readStepsForDay$1.L$1 = localDate;
                    samsungHealthManager$readStepsForDay$1.L$2 = zoneId;
                    samsungHealthManager$readStepsForDay$1.L$3 = storeOrNull;
                    samsungHealthManager$readStepsForDay$1.label = 1;
                    Object hasStepsReadPermission = hasStepsReadPermission(samsungHealthManager$readStepsForDay$1);
                    if (hasStepsReadPermission == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    samsungHealthManager = this;
                    obj2 = storeOrNull;
                    obj = hasStepsReadPermission;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = samsungHealthManager$readStepsForDay$1.L$3;
                    zoneId = (ZoneId) samsungHealthManager$readStepsForDay$1.L$2;
                    localDate = (LocalDate) samsungHealthManager$readStepsForDay$1.L$1;
                    SamsungHealthManager samsungHealthManager2 = (SamsungHealthManager) samsungHealthManager$readStepsForDay$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj3;
                    samsungHealthManager = samsungHealthManager2;
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                LocalDateTime atStartOfDay2 = localDate.atStartOfDay();
                if (Intrinsics.areEqual(localDate, LocalDate.now(zoneId))) {
                    atStartOfDay = LocalDateTime.now(zoneId);
                } else {
                    atStartOfDay = localDate.plusDays(1L).atStartOfDay();
                }
                LocalDateTime localDateTime = atStartOfDay;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                SamsungHealthManager$readStepsForDay$2 samsungHealthManager$readStepsForDay$2 = new SamsungHealthManager$readStepsForDay$2(samsungHealthManager, atStartOfDay2, localDateTime, obj2, null);
                samsungHealthManager$readStepsForDay$1.L$0 = null;
                samsungHealthManager$readStepsForDay$1.L$1 = null;
                samsungHealthManager$readStepsForDay$1.L$2 = null;
                samsungHealthManager$readStepsForDay$1.L$3 = null;
                samsungHealthManager$readStepsForDay$1.label = 2;
                obj = BuildersKt.withContext(io2, samsungHealthManager$readStepsForDay$2, samsungHealthManager$readStepsForDay$1);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        samsungHealthManager$readStepsForDay$1 = new SamsungHealthManager$readStepsForDay$1(this, continuation);
        obj = samsungHealthManager$readStepsForDay$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = samsungHealthManager$readStepsForDay$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object stepsTypeTotal(Class<?> stepsTypeCls) {
        Iterator it = ArrayIteratorKt.iterator(stepsTypeCls.getFields());
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if (Intrinsics.areEqual(field.getName(), "TOTAL")) {
                field.setAccessible(true);
                return field.get(null);
            }
        }
        Iterator it2 = ArrayIteratorKt.iterator(stepsTypeCls.getDeclaredClasses());
        while (it2.hasNext()) {
            Class cls = (Class) it2.next();
            if (Intrinsics.areEqual(cls.getSimpleName(), "TOTAL")) {
                try {
                    Object obj = cls.getField("INSTANCE").get(null);
                    if (obj != null) {
                        return obj;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestBuilder(Object totalObj) {
        Method method;
        Class<?> cls = totalObj.getClass();
        Iterator it = CollectionsKt.listOf((Object[]) new String[]{"getRequestBuilder", "requestBuilder"}).iterator();
        do {
            Method method2 = null;
            if (!it.hasNext()) {
                return null;
            }
            String str = (String) it.next();
            Method[] methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            Method[] methodArr = methods;
            int length = methodArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method3 = methodArr[i];
                Method method4 = method3;
                if (Intrinsics.areEqual(method4.getName(), str) && method4.getParameterCount() == 0) {
                    method2 = method3;
                    break;
                }
                i++;
            }
            method = method2;
        } while (method == null);
        return method.invoke(totalObj, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object backupRun(long j, Instant instant, Instant instant2, double d, long j2, Continuation<? super Boolean> continuation) {
        SamsungHealthManager$backupRun$1 samsungHealthManager$backupRun$1;
        Object obj;
        int i;
        double d2;
        Object obj2;
        long j3;
        SamsungHealthManager samsungHealthManager;
        long j4;
        Instant instant3;
        Instant instant4;
        if (continuation instanceof SamsungHealthManager$backupRun$1) {
            samsungHealthManager$backupRun$1 = (SamsungHealthManager$backupRun$1) continuation;
            if ((samsungHealthManager$backupRun$1.label & Integer.MIN_VALUE) != 0) {
                samsungHealthManager$backupRun$1.label -= Integer.MIN_VALUE;
                obj = samsungHealthManager$backupRun$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = samsungHealthManager$backupRun$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object storeOrNull = storeOrNull();
                    if (storeOrNull == null) {
                        return Boxing.boxBoolean(false);
                    }
                    samsungHealthManager$backupRun$1.L$0 = this;
                    samsungHealthManager$backupRun$1.L$1 = instant;
                    samsungHealthManager$backupRun$1.L$2 = instant2;
                    samsungHealthManager$backupRun$1.L$3 = storeOrNull;
                    samsungHealthManager$backupRun$1.J$0 = j;
                    d2 = d;
                    samsungHealthManager$backupRun$1.D$0 = d2;
                    samsungHealthManager$backupRun$1.J$1 = j2;
                    samsungHealthManager$backupRun$1.label = 1;
                    Object hasExerciseWritePermission = hasExerciseWritePermission(samsungHealthManager$backupRun$1);
                    if (hasExerciseWritePermission == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = storeOrNull;
                    obj = hasExerciseWritePermission;
                    j3 = j2;
                    samsungHealthManager = this;
                    j4 = j;
                    instant3 = instant;
                    instant4 = instant2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j5 = samsungHealthManager$backupRun$1.J$1;
                    double d3 = samsungHealthManager$backupRun$1.D$0;
                    long j6 = samsungHealthManager$backupRun$1.J$0;
                    Object obj3 = samsungHealthManager$backupRun$1.L$3;
                    Instant instant5 = (Instant) samsungHealthManager$backupRun$1.L$2;
                    Instant instant6 = (Instant) samsungHealthManager$backupRun$1.L$1;
                    SamsungHealthManager samsungHealthManager2 = (SamsungHealthManager) samsungHealthManager$backupRun$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj3;
                    j3 = j5;
                    instant4 = instant5;
                    instant3 = instant6;
                    samsungHealthManager = samsungHealthManager2;
                    j4 = j6;
                    d2 = d3;
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boxing.boxBoolean(false);
                }
                CoroutineDispatcher io2 = Dispatchers.getIO();
                SamsungHealthManager$backupRun$2 samsungHealthManager$backupRun$2 = new SamsungHealthManager$backupRun$2(instant3, instant4, d2, samsungHealthManager, j4, j3, obj2, null);
                samsungHealthManager$backupRun$1.L$0 = null;
                samsungHealthManager$backupRun$1.L$1 = null;
                samsungHealthManager$backupRun$1.L$2 = null;
                samsungHealthManager$backupRun$1.L$3 = null;
                samsungHealthManager$backupRun$1.label = 2;
                obj = BuildersKt.withContext(io2, samsungHealthManager$backupRun$2, samsungHealthManager$backupRun$1);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        samsungHealthManager$backupRun$1 = new SamsungHealthManager$backupRun$1(this, continuation);
        obj = samsungHealthManager$backupRun$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = samsungHealthManager$backupRun$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object exerciseLogOf(Class<?> logCls, Instant t) {
        Method[] methods = logCls.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            if (Intrinsics.areEqual(method.getName(), "of")) {
                arrayList.add(method);
            }
        }
        ArrayList<Method> arrayList2 = arrayList;
        for (Method method2 : arrayList2) {
            if (method2.getParameterCount() == 6 && Intrinsics.areEqual(method2.getParameterTypes()[0], Instant.class)) {
                return method2.invoke(null, t, null, null, null, null, null);
            }
        }
        for (Method method3 : arrayList2) {
            if (method3.getParameterCount() == 1 && Intrinsics.areEqual(method3.getParameterTypes()[0], Instant.class)) {
                return method3.invoke(null, t);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void chain(Object target, String name, Object arg) {
        Method method;
        if (arg == null) {
            return;
        }
        Class<?> cls = arg.getClass();
        Method[] methods = target.getClass().getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
        Method[] methodArr = methods;
        int length = methodArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methodArr[i];
            Method method2 = method;
            if (Intrinsics.areEqual(method2.getName(), name) && method2.getParameterCount() == 1) {
                if (method2.getParameterTypes()[0].isAssignableFrom(cls)) {
                    break;
                }
                Class<?> cls2 = method2.getParameterTypes()[0];
                Intrinsics.checkNotNullExpressionValue(cls2, "get(...)");
                if (wrapPrimitive(cls2, cls)) {
                    break;
                }
            }
            i++;
        }
        Method method3 = method;
        if (method3 == null) {
            throw new NoSuchMethodException(name + "(" + cls.getSimpleName() + ")");
        }
        method3.invoke(target, arg);
    }

    private final boolean wrapPrimitive(Class<?> decl, Class<?> actual) {
        if (Intrinsics.areEqual(decl, Float.TYPE) && Intrinsics.areEqual(actual, Float.class)) {
            return true;
        }
        if (Intrinsics.areEqual(decl, Integer.TYPE) && Intrinsics.areEqual(actual, Integer.class)) {
            return true;
        }
        return Intrinsics.areEqual(decl, Long.TYPE) && Intrinsics.areEqual(actual, Long.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addFieldData(Object target, String name, Object key, Object value) {
        Method[] methods = target.getClass().getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            Method method2 = method;
            if (Intrinsics.areEqual(method2.getName(), name) && method2.getParameterCount() == 2) {
                arrayList.add(method);
            }
        }
        ArrayList<Method> arrayList2 = arrayList;
        Intrinsics.checkNotNull(value);
        for (Method method3 : arrayList2) {
            if (method3.getParameterTypes()[1].isAssignableFrom(value.getClass())) {
                method3.invoke(target, key, value);
                return;
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            try {
                ((Method) it.next()).invoke(target, key, value);
                return;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double roughRunKcal(double distanceM, Duration duration) {
        long max = Math.max(duration.toMinutes(), 1L);
        double d = distanceM / 1000.0d;
        double millis = d > 0.01d ? (duration.toMillis() / 60000.0d) / d : 6.0d;
        return ((((millis < 5.5d ? 12.0d : millis < 7.5d ? 10.0d : 8.0d) * 3.5d) * 70.0d) / 200.0d) * max;
    }
}
