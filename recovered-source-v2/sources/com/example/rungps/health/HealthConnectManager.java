package com.example.rungps.health;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.DistanceRecord;
import androidx.health.connect.client.records.ExerciseRoute;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.records.Vo2MaxRecord;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.response.ReadRecordsResponse;
import androidx.health.connect.client.time.TimeRangeFilter;
import androidx.health.connect.client.units.Length;
import com.example.rungps.AppBranding;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.sleep.SleepHypnogramEncoder;
import com.example.rungps.sleep.SleepStageLabel;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.tracking.TrackingService;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import org.maplibre.android.style.layers.Property;

/* compiled from: HealthConnectManager.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001ZB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\"\u001a\u00020\u0015J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020\u000bJ\b\u0010'\u001a\u0004\u0018\u00010(J\u000e\u0010)\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010*J\u000e\u0010+\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010*J\u000e\u0010,\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010*J\u000e\u0010-\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010*J\"\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u000203H\u0086@¢\u0006\u0002\u00104J4\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020/07062\b\b\u0002\u00108\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u000203H\u0086@¢\u0006\u0002\u00109J@\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020/2\b\b\u0002\u0010B\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010CJ8\u0010D\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020/2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010F\u001a\u00020\u00152\b\u0010G\u001a\u0004\u0018\u00010\u0015H\u0086@¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020KH\u0086@¢\u0006\u0002\u0010LJ\u0016\u0010M\u001a\b\u0012\u0004\u0012\u00020N062\u0006\u0010J\u001a\u00020KH\u0002J\u0018\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020=2\u0006\u0010Q\u001a\u00020=H\u0002J\u0010\u0010R\u001a\u00020\u00152\u0006\u0010S\u001a\u00020TH\u0002J\u0012\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010S\u001a\u00020TH\u0002J(\u0010W\u001a\b\u0012\u0004\u0012\u00020V062\b\b\u0002\u0010X\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u000203H\u0086@¢\u0006\u0002\u00109J$\u0010Y\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010X\u001a\u00020\u00072\b\b\u0002\u00102\u001a\u000203H\u0086@¢\u0006\u0002\u00109R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u0006["}, d2 = {"Lcom/example/rungps/health/HealthConnectManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sdkStatus", "", "getSdkStatus", "()I", "isReady", "", "()Z", "clientOrNull", "Landroidx/health/connect/client/HealthConnectClient;", "getClientOrNull", "()Landroidx/health/connect/client/HealthConnectClient;", "clientOrNull$delegate", "Lkotlin/Lazy;", "stepsReadPermissions", "", "", "getStepsReadPermissions", "()Ljava/util/Set;", "backupWritePermissions", "getBackupWritePermissions", "sleepReadPermissions", "getSleepReadPermissions", "sleepWritePermissions", "getSleepWritePermissions", "heartRateReadPermissions", "getHeartRateReadPermissions", "allRequestedPermissions", "getAllRequestedPermissions", "statusMessage", "openHealthConnectApp", "Landroid/content/Intent;", "openHealthConnectPlayStore", "isAvailable", "permissionController", "Landroidx/health/connect/client/PermissionController;", "hasStepsReadPermission", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasBackupWritePermissions", "hasAllPermissions", "hasSleepWritePermission", "readStepsForDay", "", "date", "Ljava/time/LocalDate;", "zoneId", "Ljava/time/ZoneId;", "(Ljava/time/LocalDate;Ljava/time/ZoneId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readDailyStepsBackward", "", "Lkotlin/Pair;", "days", "(ILjava/time/ZoneId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backupRunToHealthConnect", "runId", "startTime", "Ljava/time/Instant;", "endTime", "distanceMeters", "", "steps", TrackingService.EXTRA_ACTIVITY_TYPE, "(JLjava/time/Instant;Ljava/time/Instant;DJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backupGymSession", "sessionId", "title", "notes", "(JLjava/time/Instant;Ljava/time/Instant;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backupSleepSession", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "(Lcom/example/rungps/data/SleepEntryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hypnogramStagesForWriteback", "Landroidx/health/connect/client/records/SleepSessionRecord$Stage;", "minutesBetween", "start", "end", "sleepSourceFromRecord", "s", "Landroidx/health/connect/client/records/SleepSessionRecord;", "summarizeSleepSession", "Lcom/example/rungps/health/HealthConnectManager$SleepWindow;", "readSleepSessions", "daysBack", "readRestingHeartRateBpm", "SleepWindow", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthConnectManager {
    public static final int $stable = 8;
    private final Set<String> allRequestedPermissions;
    private final Set<String> backupWritePermissions;

    /* renamed from: clientOrNull$delegate, reason: from kotlin metadata */
    private final Lazy clientOrNull;
    private final Context context;
    private final Set<String> heartRateReadPermissions;
    private final Set<String> sleepReadPermissions;
    private final Set<String> sleepWritePermissions;
    private final Set<String> stepsReadPermissions;

    /* compiled from: HealthConnectManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepStageLabel.values().length];
            try {
                iArr[SleepStageLabel.AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SleepStageLabel.DEEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SleepStageLabel.REM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HealthConnectManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.clientOrNull = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.example.rungps.health.HealthConnectManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HealthConnectClient clientOrNull_delegate$lambda$1;
                clientOrNull_delegate$lambda$1 = HealthConnectManager.clientOrNull_delegate$lambda$1(HealthConnectManager.this);
                return clientOrNull_delegate$lambda$1;
            }
        });
        Set<String> of = SetsKt.setOf(HealthPermission.INSTANCE.getReadPermission(Reflection.getOrCreateKotlinClass(StepsRecord.class)));
        this.stepsReadPermissions = of;
        Set<String> of2 = SetsKt.setOf((Object[]) new String[]{HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(StepsRecord.class)), HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(ExerciseSessionRecord.class)), HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(DistanceRecord.class))});
        this.backupWritePermissions = of2;
        Set<String> of3 = SetsKt.setOf(HealthPermission.INSTANCE.getReadPermission(Reflection.getOrCreateKotlinClass(SleepSessionRecord.class)));
        this.sleepReadPermissions = of3;
        Set<String> of4 = SetsKt.setOf(HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(SleepSessionRecord.class)));
        this.sleepWritePermissions = of4;
        Set<String> of5 = SetsKt.setOf(HealthPermission.INSTANCE.getReadPermission(Reflection.getOrCreateKotlinClass(HeartRateRecord.class)));
        this.heartRateReadPermissions = of5;
        this.allRequestedPermissions = SetsKt.plus(SetsKt.plus(SetsKt.plus(SetsKt.plus((Set) of, (Iterable) of2), (Iterable) of3), (Iterable) of4), (Iterable) of5);
    }

    public final int getSdkStatus() {
        return HealthConnectClient.Companion.getSdkStatus$default(HealthConnectClient.INSTANCE, this.context, null, 2, null);
    }

    public final boolean isReady() {
        return getSdkStatus() == 3;
    }

    private final HealthConnectClient getClientOrNull() {
        return (HealthConnectClient) this.clientOrNull.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HealthConnectClient clientOrNull_delegate$lambda$1(HealthConnectManager healthConnectManager) {
        Object m7905constructorimpl;
        if (!healthConnectManager.isReady()) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, healthConnectManager.context, null, 2, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return (HealthConnectClient) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
    }

    public final Set<String> getStepsReadPermissions() {
        return this.stepsReadPermissions;
    }

    public final Set<String> getBackupWritePermissions() {
        return this.backupWritePermissions;
    }

    public final Set<String> getSleepReadPermissions() {
        return this.sleepReadPermissions;
    }

    public final Set<String> getSleepWritePermissions() {
        return this.sleepWritePermissions;
    }

    public final Set<String> getHeartRateReadPermissions() {
        return this.heartRateReadPermissions;
    }

    public final Set<String> getAllRequestedPermissions() {
        return this.allRequestedPermissions;
    }

    public final String statusMessage() {
        int sdkStatus = getSdkStatus();
        if (sdkStatus == 2) {
            return "Install or update the Health Connect app from Google.";
        }
        if (sdkStatus == 3) {
            return "Health Connect is available.";
        }
        return "Health Connect is not available on this Android profile or OS version.";
    }

    public final Intent openHealthConnectApp() {
        return HealthConnectClient.Companion.getHealthConnectManageDataIntent$default(HealthConnectClient.INSTANCE, this.context, null, 2, null);
    }

    public final Intent openHealthConnectPlayStore() {
        try {
            return new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.healthdata")).addFlags(268435456);
        } catch (Exception unused) {
            return new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.healthdata")).addFlags(268435456);
        }
    }

    public final boolean isAvailable() {
        return getClientOrNull() != null;
    }

    public final PermissionController permissionController() {
        HealthConnectClient clientOrNull = getClientOrNull();
        if (clientOrNull != null) {
            return clientOrNull.getPermissionController();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasStepsReadPermission(Continuation<? super Boolean> continuation) {
        HealthConnectManager$hasStepsReadPermission$1 healthConnectManager$hasStepsReadPermission$1;
        int i;
        if (continuation instanceof HealthConnectManager$hasStepsReadPermission$1) {
            healthConnectManager$hasStepsReadPermission$1 = (HealthConnectManager$hasStepsReadPermission$1) continuation;
            if ((healthConnectManager$hasStepsReadPermission$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectManager$hasStepsReadPermission$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectManager$hasStepsReadPermission$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectManager$hasStepsReadPermission$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClient clientOrNull = getClientOrNull();
                    if (clientOrNull == null) {
                        return Boxing.boxBoolean(false);
                    }
                    PermissionController permissionController = clientOrNull.getPermissionController();
                    healthConnectManager$hasStepsReadPermission$1.L$0 = this;
                    healthConnectManager$hasStepsReadPermission$1.label = 1;
                    obj = permissionController.getGrantedPermissions(healthConnectManager$hasStepsReadPermission$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (HealthConnectManager) healthConnectManager$hasStepsReadPermission$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Set) obj).containsAll(this.stepsReadPermissions));
            }
        }
        healthConnectManager$hasStepsReadPermission$1 = new HealthConnectManager$hasStepsReadPermission$1(this, continuation);
        Object obj2 = healthConnectManager$hasStepsReadPermission$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectManager$hasStepsReadPermission$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Set) obj2).containsAll(this.stepsReadPermissions));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasBackupWritePermissions(Continuation<? super Boolean> continuation) {
        HealthConnectManager$hasBackupWritePermissions$1 healthConnectManager$hasBackupWritePermissions$1;
        int i;
        if (continuation instanceof HealthConnectManager$hasBackupWritePermissions$1) {
            healthConnectManager$hasBackupWritePermissions$1 = (HealthConnectManager$hasBackupWritePermissions$1) continuation;
            if ((healthConnectManager$hasBackupWritePermissions$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectManager$hasBackupWritePermissions$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectManager$hasBackupWritePermissions$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectManager$hasBackupWritePermissions$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClient clientOrNull = getClientOrNull();
                    if (clientOrNull == null) {
                        return Boxing.boxBoolean(false);
                    }
                    PermissionController permissionController = clientOrNull.getPermissionController();
                    healthConnectManager$hasBackupWritePermissions$1.L$0 = this;
                    healthConnectManager$hasBackupWritePermissions$1.label = 1;
                    obj = permissionController.getGrantedPermissions(healthConnectManager$hasBackupWritePermissions$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (HealthConnectManager) healthConnectManager$hasBackupWritePermissions$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Set) obj).containsAll(this.backupWritePermissions));
            }
        }
        healthConnectManager$hasBackupWritePermissions$1 = new HealthConnectManager$hasBackupWritePermissions$1(this, continuation);
        Object obj2 = healthConnectManager$hasBackupWritePermissions$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectManager$hasBackupWritePermissions$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Set) obj2).containsAll(this.backupWritePermissions));
    }

    public final Object hasAllPermissions(Continuation<? super Boolean> continuation) {
        return hasBackupWritePermissions(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasSleepWritePermission(Continuation<? super Boolean> continuation) {
        HealthConnectManager$hasSleepWritePermission$1 healthConnectManager$hasSleepWritePermission$1;
        int i;
        if (continuation instanceof HealthConnectManager$hasSleepWritePermission$1) {
            healthConnectManager$hasSleepWritePermission$1 = (HealthConnectManager$hasSleepWritePermission$1) continuation;
            if ((healthConnectManager$hasSleepWritePermission$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectManager$hasSleepWritePermission$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectManager$hasSleepWritePermission$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectManager$hasSleepWritePermission$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClient clientOrNull = getClientOrNull();
                    if (clientOrNull == null) {
                        return Boxing.boxBoolean(false);
                    }
                    PermissionController permissionController = clientOrNull.getPermissionController();
                    healthConnectManager$hasSleepWritePermission$1.L$0 = this;
                    healthConnectManager$hasSleepWritePermission$1.label = 1;
                    obj = permissionController.getGrantedPermissions(healthConnectManager$hasSleepWritePermission$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = (HealthConnectManager) healthConnectManager$hasSleepWritePermission$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(((Set) obj).containsAll(this.sleepWritePermissions));
            }
        }
        healthConnectManager$hasSleepWritePermission$1 = new HealthConnectManager$hasSleepWritePermission$1(this, continuation);
        Object obj2 = healthConnectManager$hasSleepWritePermission$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectManager$hasSleepWritePermission$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(((Set) obj2).containsAll(this.sleepWritePermissions));
    }

    public static /* synthetic */ Object readStepsForDay$default(HealthConnectManager healthConnectManager, LocalDate localDate, ZoneId zoneId, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return healthConnectManager.readStepsForDay(localDate, zoneId, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readStepsForDay(LocalDate localDate, ZoneId zoneId, Continuation<? super Long> continuation) {
        HealthConnectManager$readStepsForDay$1 healthConnectManager$readStepsForDay$1;
        int i;
        Long l;
        if (continuation instanceof HealthConnectManager$readStepsForDay$1) {
            healthConnectManager$readStepsForDay$1 = (HealthConnectManager$readStepsForDay$1) continuation;
            if ((healthConnectManager$readStepsForDay$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectManager$readStepsForDay$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectManager$readStepsForDay$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectManager$readStepsForDay$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClient clientOrNull = getClientOrNull();
                    if (clientOrNull == null) {
                        return null;
                    }
                    Instant instant = localDate.atStartOfDay(zoneId).toInstant();
                    Instant instant2 = localDate.plusDays(1L).atStartOfDay(zoneId).toInstant();
                    Set of = SetsKt.setOf(StepsRecord.COUNT_TOTAL);
                    TimeRangeFilter.Companion companion = TimeRangeFilter.INSTANCE;
                    Intrinsics.checkNotNull(instant);
                    Intrinsics.checkNotNull(instant2);
                    AggregateRequest aggregateRequest = new AggregateRequest(of, companion.between(instant, instant2), null, 4, null);
                    healthConnectManager$readStepsForDay$1.label = 1;
                    obj = clientOrNull.aggregate(aggregateRequest, healthConnectManager$readStepsForDay$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                l = (Long) ((AggregationResult) obj).get(StepsRecord.COUNT_TOTAL);
                if (l == null) {
                    return Boxing.boxLong(l.longValue());
                }
                return null;
            }
        }
        healthConnectManager$readStepsForDay$1 = new HealthConnectManager$readStepsForDay$1(this, continuation);
        Object obj2 = healthConnectManager$readStepsForDay$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectManager$readStepsForDay$1.label;
        if (i != 0) {
        }
        l = (Long) ((AggregationResult) obj2).get(StepsRecord.COUNT_TOTAL);
        if (l == null) {
        }
    }

    public static /* synthetic */ Object readDailyStepsBackward$default(HealthConnectManager healthConnectManager, int i, ZoneId zoneId, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 21;
        }
        if ((i2 & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return healthConnectManager.readDailyStepsBackward(i, zoneId, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a4 -> B:10:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDailyStepsBackward(int i, ZoneId zoneId, Continuation<? super List<Pair<LocalDate, Long>>> continuation) {
        HealthConnectManager$readDailyStepsBackward$1 healthConnectManager$readDailyStepsBackward$1;
        HealthConnectManager healthConnectManager;
        int i2;
        int coerceIn;
        LocalDate localDate;
        List list;
        ZoneId zoneId2;
        int i3;
        List list2;
        if (continuation instanceof HealthConnectManager$readDailyStepsBackward$1) {
            healthConnectManager$readDailyStepsBackward$1 = (HealthConnectManager$readDailyStepsBackward$1) continuation;
            if ((healthConnectManager$readDailyStepsBackward$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectManager$readDailyStepsBackward$1.label -= Integer.MIN_VALUE;
                healthConnectManager = this;
                Object obj = healthConnectManager$readDailyStepsBackward$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = healthConnectManager$readDailyStepsBackward$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (getClientOrNull() == null) {
                        return CollectionsKt.emptyList();
                    }
                    LocalDate now = LocalDate.now(zoneId);
                    List createListBuilder = CollectionsKt.createListBuilder();
                    coerceIn = RangesKt.coerceIn(i, 1, 45);
                    localDate = now;
                    list = createListBuilder;
                    zoneId2 = zoneId;
                    i3 = 0;
                    list2 = list;
                    if (i3 < coerceIn) {
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = healthConnectManager$readDailyStepsBackward$1.I$1;
                    i3 = healthConnectManager$readDailyStepsBackward$1.I$0;
                    LocalDate localDate2 = (LocalDate) healthConnectManager$readDailyStepsBackward$1.L$5;
                    List list3 = (List) healthConnectManager$readDailyStepsBackward$1.L$4;
                    List list4 = (List) healthConnectManager$readDailyStepsBackward$1.L$3;
                    LocalDate localDate3 = (LocalDate) healthConnectManager$readDailyStepsBackward$1.L$2;
                    ZoneId zoneId3 = (ZoneId) healthConnectManager$readDailyStepsBackward$1.L$1;
                    HealthConnectManager healthConnectManager2 = (HealthConnectManager) healthConnectManager$readDailyStepsBackward$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    int i5 = i4;
                    healthConnectManager = healthConnectManager2;
                    LocalDate localDate4 = localDate3;
                    List list5 = list4;
                    List list6 = list3;
                    Long l = (Long) obj;
                    if (l != null) {
                        long longValue = l.longValue();
                        if (longValue >= 0) {
                            list6.add(TuplesKt.to(localDate2, Boxing.boxLong(longValue)));
                        }
                    }
                    i3++;
                    coerceIn = i5;
                    list2 = list6;
                    list = list5;
                    zoneId2 = zoneId3;
                    localDate = localDate4;
                    if (i3 < coerceIn) {
                        LocalDate minusDays = localDate.minusDays(i3);
                        Intrinsics.checkNotNull(minusDays);
                        healthConnectManager$readDailyStepsBackward$1.L$0 = healthConnectManager;
                        healthConnectManager$readDailyStepsBackward$1.L$1 = zoneId2;
                        healthConnectManager$readDailyStepsBackward$1.L$2 = localDate;
                        healthConnectManager$readDailyStepsBackward$1.L$3 = list;
                        healthConnectManager$readDailyStepsBackward$1.L$4 = list2;
                        healthConnectManager$readDailyStepsBackward$1.L$5 = minusDays;
                        healthConnectManager$readDailyStepsBackward$1.I$0 = i3;
                        healthConnectManager$readDailyStepsBackward$1.I$1 = coerceIn;
                        healthConnectManager$readDailyStepsBackward$1.label = 1;
                        Object readStepsForDay = healthConnectManager.readStepsForDay(minusDays, zoneId2, healthConnectManager$readDailyStepsBackward$1);
                        if (readStepsForDay == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zoneId3 = zoneId2;
                        obj = readStepsForDay;
                        localDate4 = localDate;
                        list5 = list;
                        list6 = list2;
                        i5 = coerceIn;
                        localDate2 = minusDays;
                        Long l2 = (Long) obj;
                        if (l2 != null) {
                        }
                        i3++;
                        coerceIn = i5;
                        list2 = list6;
                        list = list5;
                        zoneId2 = zoneId3;
                        localDate = localDate4;
                        if (i3 < coerceIn) {
                            return CollectionsKt.build(list);
                        }
                    }
                }
            }
        }
        healthConnectManager = this;
        healthConnectManager$readDailyStepsBackward$1 = new HealthConnectManager$readDailyStepsBackward$1(healthConnectManager, continuation);
        Object obj2 = healthConnectManager$readDailyStepsBackward$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = healthConnectManager$readDailyStepsBackward$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:19|(3:20|21|22)|(2:23|24)|25|(1:27)|28|29|30|31|32|33|34|(1:36)|37|(1:39)(1:51)|40|(1:42)(1:50)|43|(1:45)(1:49)|46|(1:48)) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:19|20|21|22|(2:23|24)|25|(1:27)|28|29|30|31|32|33|34|(1:36)|37|(1:39)(1:51)|40|(1:42)(1:50)|43|(1:45)(1:49)|46|(1:48)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0090, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object backupRunToHealthConnect(long j, Instant instant, Instant instant2, double d, long j2, String str, Continuation<? super Boolean> continuation) {
        HealthConnectManager$backupRunToHealthConnect$1 healthConnectManager$backupRunToHealthConnect$1;
        int i;
        Object m7905constructorimpl;
        boolean z;
        List<? extends Record> listOf;
        if (continuation instanceof HealthConnectManager$backupRunToHealthConnect$1) {
            healthConnectManager$backupRunToHealthConnect$1 = (HealthConnectManager$backupRunToHealthConnect$1) continuation;
            if ((healthConnectManager$backupRunToHealthConnect$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectManager$backupRunToHealthConnect$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectManager$backupRunToHealthConnect$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectManager$backupRunToHealthConnect$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClient clientOrNull = getClientOrNull();
                    if (clientOrNull == null) {
                        return Boxing.boxBoolean(false);
                    }
                    ZoneId systemDefault = ZoneId.systemDefault();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        HealthConnectManager healthConnectManager = this;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        m7905constructorimpl = Result.m7905constructorimpl(systemDefault.getRules().getOffset(instant));
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion2 = Result.INSTANCE;
                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        ZoneOffset zoneOffset = (ZoneOffset) m7905constructorimpl;
                        Result.Companion companion3 = Result.INSTANCE;
                        HealthConnectManager healthConnectManager2 = this;
                        Object m7905constructorimpl2 = Result.m7905constructorimpl(systemDefault.getRules().getOffset(instant2));
                        ZoneOffset zoneOffset2 = (ZoneOffset) (Result.m7911isFailureimpl(m7905constructorimpl2) ? null : m7905constructorimpl2);
                        androidx.health.connect.client.records.metadata.Metadata metadata = new androidx.health.connect.client.records.metadata.Metadata(null, null, null, "rungps-run-" + j, 1L, null, 0, 103, null);
                        boolean isBike = ActivityTypes.INSTANCE.isBike(str);
                        int i2 = isBike ? 8 : 56;
                        String concat = "Exercise Tracker ".concat(isBike ? "ride" : "run");
                        String format = String.format("%.0f", Arrays.copyOf(new Object[]{Boxing.boxDouble(d)}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        z = true;
                        listOf = CollectionsKt.listOf((Object[]) new IntervalRecord[]{new ExerciseSessionRecord(instant, zoneOffset, instant2, zoneOffset2, i2, concat, "Distance " + format + " m" + (isBike ? "" : " • Steps " + j2), metadata, (List) null, (List) null, (ExerciseRoute) null, (String) null, 3840, (DefaultConstructorMarker) null), new DistanceRecord(instant, zoneOffset, instant2, zoneOffset2, Length.INSTANCE.meters(d), metadata), new StepsRecord(instant, zoneOffset, instant2, zoneOffset2, j2, metadata)});
                        healthConnectManager$backupRunToHealthConnect$1.label = 1;
                        if (clientOrNull.insertRecords(listOf, healthConnectManager$backupRunToHealthConnect$1) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(z);
                    }
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        m7905constructorimpl = null;
                    }
                    ZoneOffset zoneOffset3 = (ZoneOffset) m7905constructorimpl;
                    Result.Companion companion32 = Result.INSTANCE;
                    HealthConnectManager healthConnectManager22 = this;
                    Object m7905constructorimpl22 = Result.m7905constructorimpl(systemDefault.getRules().getOffset(instant2));
                    ZoneOffset zoneOffset22 = (ZoneOffset) (Result.m7911isFailureimpl(m7905constructorimpl22) ? null : m7905constructorimpl22);
                    androidx.health.connect.client.records.metadata.Metadata metadata2 = new androidx.health.connect.client.records.metadata.Metadata(null, null, null, "rungps-run-" + j, 1L, null, 0, 103, null);
                    boolean isBike2 = ActivityTypes.INSTANCE.isBike(str);
                    int i22 = isBike2 ? 8 : 56;
                    String concat2 = "Exercise Tracker ".concat(isBike2 ? "ride" : "run");
                    String format2 = String.format("%.0f", Arrays.copyOf(new Object[]{Boxing.boxDouble(d)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    z = true;
                    listOf = CollectionsKt.listOf((Object[]) new IntervalRecord[]{new ExerciseSessionRecord(instant, zoneOffset3, instant2, zoneOffset22, i22, concat2, "Distance " + format2 + " m" + (isBike2 ? "" : " • Steps " + j2), metadata2, (List) null, (List) null, (ExerciseRoute) null, (String) null, 3840, (DefaultConstructorMarker) null), new DistanceRecord(instant, zoneOffset3, instant2, zoneOffset22, Length.INSTANCE.meters(d), metadata2), new StepsRecord(instant, zoneOffset3, instant2, zoneOffset22, j2, metadata2)});
                    healthConnectManager$backupRunToHealthConnect$1.label = 1;
                    if (clientOrNull.insertRecords(listOf, healthConnectManager$backupRunToHealthConnect$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    z = true;
                }
                return Boxing.boxBoolean(z);
            }
        }
        healthConnectManager$backupRunToHealthConnect$1 = new HealthConnectManager$backupRunToHealthConnect$1(this, continuation);
        Object obj2 = healthConnectManager$backupRunToHealthConnect$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectManager$backupRunToHealthConnect$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:19|20|21|22|(2:23|24)|25|(1:27)|28|29|30|31|32|33|34|(1:36)|37|(1:39)) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        r6 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object backupGymSession(long j, Instant instant, Instant instant2, String str, String str2, Continuation<? super Boolean> continuation) {
        HealthConnectManager$backupGymSession$1 healthConnectManager$backupGymSession$1;
        int i;
        Object m7905constructorimpl;
        List<? extends Record> listOf;
        if (continuation instanceof HealthConnectManager$backupGymSession$1) {
            healthConnectManager$backupGymSession$1 = (HealthConnectManager$backupGymSession$1) continuation;
            if ((healthConnectManager$backupGymSession$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectManager$backupGymSession$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectManager$backupGymSession$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectManager$backupGymSession$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClient clientOrNull = getClientOrNull();
                    if (clientOrNull == null) {
                        return Boxing.boxBoolean(false);
                    }
                    ZoneId systemDefault = ZoneId.systemDefault();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        HealthConnectManager healthConnectManager = this;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        m7905constructorimpl = Result.m7905constructorimpl(systemDefault.getRules().getOffset(instant));
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion2 = Result.INSTANCE;
                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        ZoneOffset zoneOffset = (ZoneOffset) m7905constructorimpl;
                        Result.Companion companion3 = Result.INSTANCE;
                        HealthConnectManager healthConnectManager2 = this;
                        Object m7905constructorimpl2 = Result.m7905constructorimpl(systemDefault.getRules().getOffset(instant2));
                        if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                        }
                        listOf = CollectionsKt.listOf(new ExerciseSessionRecord(instant, zoneOffset, instant2, (ZoneOffset) (Result.m7911isFailureimpl(m7905constructorimpl2) ? null : m7905constructorimpl2), 70, str, str2, new androidx.health.connect.client.records.metadata.Metadata(null, null, null, "rungps-gym-" + j, 1L, null, 0, 103, null), (List) null, (List) null, (ExerciseRoute) null, (String) null, 3840, (DefaultConstructorMarker) null));
                        healthConnectManager$backupGymSession$1.label = 1;
                        if (clientOrNull.insertRecords(listOf, healthConnectManager$backupGymSession$1) == coroutine_suspended) {
                        }
                        return Boxing.boxBoolean(true);
                    }
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        m7905constructorimpl = null;
                    }
                    ZoneOffset zoneOffset2 = (ZoneOffset) m7905constructorimpl;
                    Result.Companion companion32 = Result.INSTANCE;
                    HealthConnectManager healthConnectManager22 = this;
                    Object m7905constructorimpl22 = Result.m7905constructorimpl(systemDefault.getRules().getOffset(instant2));
                    listOf = CollectionsKt.listOf(new ExerciseSessionRecord(instant, zoneOffset2, instant2, (ZoneOffset) (Result.m7911isFailureimpl(m7905constructorimpl22) ? null : m7905constructorimpl22), 70, str, str2, new androidx.health.connect.client.records.metadata.Metadata(null, null, null, "rungps-gym-" + j, 1L, null, 0, 103, null), (List) null, (List) null, (ExerciseRoute) null, (String) null, 3840, (DefaultConstructorMarker) null));
                    healthConnectManager$backupGymSession$1.label = 1;
                    if (clientOrNull.insertRecords(listOf, healthConnectManager$backupGymSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(true);
            }
        }
        healthConnectManager$backupGymSession$1 = new HealthConnectManager$backupGymSession$1(this, continuation);
        Object obj2 = healthConnectManager$backupGymSession$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectManager$backupGymSession$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object backupSleepSession(SleepEntryEntity sleepEntryEntity, Continuation<? super Boolean> continuation) {
        HealthConnectManager$backupSleepSession$1 healthConnectManager$backupSleepSession$1;
        int i;
        Object m7905constructorimpl;
        Object m7905constructorimpl2;
        String str;
        if (continuation instanceof HealthConnectManager$backupSleepSession$1) {
            healthConnectManager$backupSleepSession$1 = (HealthConnectManager$backupSleepSession$1) continuation;
            if ((healthConnectManager$backupSleepSession$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectManager$backupSleepSession$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectManager$backupSleepSession$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectManager$backupSleepSession$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClient clientOrNull = getClientOrNull();
                    if (clientOrNull == null) {
                        return Boxing.boxBoolean(false);
                    }
                    ZoneId systemDefault = ZoneId.systemDefault();
                    Instant ofEpochMilli = Instant.ofEpochMilli(sleepEntryEntity.getStartTimeMs());
                    Instant ofEpochMilli2 = Instant.ofEpochMilli(sleepEntryEntity.getEndTimeMs());
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        HealthConnectManager healthConnectManager = this;
                        m7905constructorimpl = Result.m7905constructorimpl(systemDefault.getRules().getOffset(ofEpochMilli));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        m7905constructorimpl = null;
                    }
                    ZoneOffset zoneOffset = (ZoneOffset) m7905constructorimpl;
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        HealthConnectManager healthConnectManager2 = this;
                        m7905constructorimpl2 = Result.m7905constructorimpl(systemDefault.getRules().getOffset(ofEpochMilli2));
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.m7911isFailureimpl(m7905constructorimpl2)) {
                        m7905constructorimpl2 = null;
                    }
                    ZoneOffset zoneOffset2 = (ZoneOffset) m7905constructorimpl2;
                    androidx.health.connect.client.records.metadata.Metadata metadata = new androidx.health.connect.client.records.metadata.Metadata(null, null, null, "rungps-sleep-" + sleepEntryEntity.getStartTimeMs(), 1L, null, 0, 103, null);
                    if (SleepScoring.INSTANCE.isOvernightSource(sleepEntryEntity.getSource())) {
                        str = AppBranding.OVERNIGHT_SOURCE_LABEL;
                    } else {
                        str = "Exercise Tracker sleep";
                    }
                    String str2 = str;
                    StringBuilder sb = new StringBuilder();
                    sb.append(sleepEntryEntity.getTotalSleepMin() + " min asleep");
                    Integer sleepQuality = sleepEntryEntity.getSleepQuality();
                    if (sleepQuality != null) {
                        sb.append(" · quality " + sleepQuality.intValue() + "/100");
                    }
                    String notes = sleepEntryEntity.getNotes();
                    if (notes != null) {
                        String str3 = StringsKt.isBlank(notes) ? null : notes;
                        if (str3 != null) {
                            sb.append(" · " + str3);
                        }
                    }
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                    List<SleepSessionRecord.Stage> hypnogramStagesForWriteback = hypnogramStagesForWriteback(sleepEntryEntity);
                    Intrinsics.checkNotNull(ofEpochMilli);
                    Intrinsics.checkNotNull(ofEpochMilli2);
                    List<? extends Record> listOf = CollectionsKt.listOf(new SleepSessionRecord(ofEpochMilli, zoneOffset, ofEpochMilli2, zoneOffset2, str2, sb2, hypnogramStagesForWriteback, metadata));
                    healthConnectManager$backupSleepSession$1.label = 1;
                    if (clientOrNull.insertRecords(listOf, healthConnectManager$backupSleepSession$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(true);
            }
        }
        healthConnectManager$backupSleepSession$1 = new HealthConnectManager$backupSleepSession$1(this, continuation);
        Object obj2 = healthConnectManager$backupSleepSession$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectManager$backupSleepSession$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(true);
    }

    private final List<SleepSessionRecord.Stage> hypnogramStagesForWriteback(SleepEntryEntity entry) {
        int i;
        String hypnogramCompact = entry.getHypnogramCompact();
        if (hypnogramCompact == null) {
            return CollectionsKt.emptyList();
        }
        List<SleepStageLabel> decode = SleepHypnogramEncoder.INSTANCE.decode(hypnogramCompact);
        if (decode.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        long startTimeMs = entry.getStartTimeMs();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < decode.size(); i2 = i) {
            SleepStageLabel sleepStageLabel = decode.get(i2);
            i = i2 + 1;
            while (i < decode.size() && decode.get(i) == sleepStageLabel) {
                i++;
            }
            Instant ofEpochMilli = Instant.ofEpochMilli((i2 * 60000) + startTimeMs);
            Instant ofEpochMilli2 = Instant.ofEpochMilli((i * 60000) + startTimeMs);
            Intrinsics.checkNotNull(ofEpochMilli);
            Intrinsics.checkNotNull(ofEpochMilli2);
            int i3 = WhenMappings.$EnumSwitchMapping$0[sleepStageLabel.ordinal()];
            arrayList.add(new SleepSessionRecord.Stage(ofEpochMilli, ofEpochMilli2, i3 != 1 ? i3 != 2 ? i3 != 3 ? 4 : 6 : 5 : 7));
        }
        return arrayList;
    }

    /* compiled from: HealthConnectManager.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010&\u001a\u00020\rHÆ\u0003Jp\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\t\u0010-\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/example/rungps/health/HealthConnectManager$SleepWindow;", "", "startTime", "Ljava/time/Instant;", "endTime", "inBedMin", "", "asleepMin", "deepMin", "lightMin", "remMin", "efficiencyPercent", Property.SYMBOL_Z_ORDER_SOURCE, "", "<init>", "(Ljava/time/Instant;Ljava/time/Instant;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getStartTime", "()Ljava/time/Instant;", "getEndTime", "getInBedMin", "()I", "getAsleepMin", "getDeepMin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLightMin", "getRemMin", "getEfficiencyPercent", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/time/Instant;Ljava/time/Instant;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/rungps/health/HealthConnectManager$SleepWindow;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepWindow {
        public static final int $stable = 8;
        private final int asleepMin;
        private final Integer deepMin;
        private final Integer efficiencyPercent;
        private final Instant endTime;
        private final int inBedMin;
        private final Integer lightMin;
        private final Integer remMin;
        private final String source;
        private final Instant startTime;

        /* renamed from: component1, reason: from getter */
        public final Instant getStartTime() {
            return this.startTime;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getEndTime() {
            return this.endTime;
        }

        /* renamed from: component3, reason: from getter */
        public final int getInBedMin() {
            return this.inBedMin;
        }

        /* renamed from: component4, reason: from getter */
        public final int getAsleepMin() {
            return this.asleepMin;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getDeepMin() {
            return this.deepMin;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getLightMin() {
            return this.lightMin;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getRemMin() {
            return this.remMin;
        }

        /* renamed from: component8, reason: from getter */
        public final Integer getEfficiencyPercent() {
            return this.efficiencyPercent;
        }

        /* renamed from: component9, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final SleepWindow copy(Instant startTime, Instant endTime, int inBedMin, int asleepMin, Integer deepMin, Integer lightMin, Integer remMin, Integer efficiencyPercent, String source) {
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            Intrinsics.checkNotNullParameter(source, "source");
            return new SleepWindow(startTime, endTime, inBedMin, asleepMin, deepMin, lightMin, remMin, efficiencyPercent, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepWindow)) {
                return false;
            }
            SleepWindow sleepWindow = (SleepWindow) other;
            return Intrinsics.areEqual(this.startTime, sleepWindow.startTime) && Intrinsics.areEqual(this.endTime, sleepWindow.endTime) && this.inBedMin == sleepWindow.inBedMin && this.asleepMin == sleepWindow.asleepMin && Intrinsics.areEqual(this.deepMin, sleepWindow.deepMin) && Intrinsics.areEqual(this.lightMin, sleepWindow.lightMin) && Intrinsics.areEqual(this.remMin, sleepWindow.remMin) && Intrinsics.areEqual(this.efficiencyPercent, sleepWindow.efficiencyPercent) && Intrinsics.areEqual(this.source, sleepWindow.source);
        }

        public int hashCode() {
            int hashCode = ((((((this.startTime.hashCode() * 31) + this.endTime.hashCode()) * 31) + Integer.hashCode(this.inBedMin)) * 31) + Integer.hashCode(this.asleepMin)) * 31;
            Integer num = this.deepMin;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.lightMin;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.remMin;
            int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.efficiencyPercent;
            return ((hashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "SleepWindow(startTime=" + this.startTime + ", endTime=" + this.endTime + ", inBedMin=" + this.inBedMin + ", asleepMin=" + this.asleepMin + ", deepMin=" + this.deepMin + ", lightMin=" + this.lightMin + ", remMin=" + this.remMin + ", efficiencyPercent=" + this.efficiencyPercent + ", source=" + this.source + ")";
        }

        public SleepWindow(Instant startTime, Instant endTime, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, String source) {
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            Intrinsics.checkNotNullParameter(source, "source");
            this.startTime = startTime;
            this.endTime = endTime;
            this.inBedMin = i;
            this.asleepMin = i2;
            this.deepMin = num;
            this.lightMin = num2;
            this.remMin = num3;
            this.efficiencyPercent = num4;
            this.source = source;
        }

        public final Instant getStartTime() {
            return this.startTime;
        }

        public final Instant getEndTime() {
            return this.endTime;
        }

        public final int getInBedMin() {
            return this.inBedMin;
        }

        public final int getAsleepMin() {
            return this.asleepMin;
        }

        public final Integer getDeepMin() {
            return this.deepMin;
        }

        public final Integer getLightMin() {
            return this.lightMin;
        }

        public final Integer getRemMin() {
            return this.remMin;
        }

        public final Integer getEfficiencyPercent() {
            return this.efficiencyPercent;
        }

        public /* synthetic */ SleepWindow(Instant instant, Instant instant2, int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(instant, instant2, i, i2, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : num3, (i3 & 128) != 0 ? null : num4, (i3 & 256) != 0 ? "health_connect" : str);
        }

        public final String getSource() {
            return this.source;
        }
    }

    private final int minutesBetween(Instant start, Instant end) {
        return (int) (RangesKt.coerceAtLeast(end.toEpochMilli() - start.toEpochMilli(), 0L) / 60000);
    }

    private final String sleepSourceFromRecord(SleepSessionRecord s) {
        DataOrigin dataOrigin = s.getMetadata().getDataOrigin();
        String packageName = dataOrigin != null ? dataOrigin.getPackageName() : null;
        if (packageName == null) {
            packageName = "";
        }
        String lowerCase = packageName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = lowerCase;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "sleepcycle", false, 2, (Object) null)) {
            return "sleep_cycle";
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "shealth", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "samsung", false, 2, (Object) null)) {
            return "samsung_health";
        }
        return "health_connect";
    }

    private final SleepWindow summarizeSleepSession(SleepSessionRecord s) {
        int coerceIn;
        Integer num;
        Instant startTime = s.getStartTime();
        Instant endTime = s.getEndTime();
        int i = 1;
        int coerceAtLeast = RangesKt.coerceAtLeast(minutesBetween(startTime, endTime), 1);
        if (coerceAtLeast <= 0) {
            return null;
        }
        String sleepSourceFromRecord = sleepSourceFromRecord(s);
        List<SleepSessionRecord.Stage> stages = s.getStages();
        if (stages.isEmpty()) {
            double d = coerceAtLeast;
            int coerceIn2 = RangesKt.coerceIn((int) (0.88d * d), 1, coerceAtLeast);
            return new SleepWindow(startTime, endTime, coerceAtLeast, coerceIn2, null, null, null, Integer.valueOf(RangesKt.coerceIn((int) ((coerceIn2 * 100.0d) / d), 50, 95)), sleepSourceFromRecord, 64, null);
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (SleepSessionRecord.Stage stage : stages) {
            int coerceAtLeast2 = RangesKt.coerceAtLeast(minutesBetween(stage.getStartTime(), stage.getEndTime()), 0);
            if (coerceAtLeast2 > 0) {
                i4 += coerceAtLeast2;
                int stage2 = stage.getStage();
                if (stage2 != i && stage2 != 3) {
                    if (stage2 == 5) {
                        i2 += coerceAtLeast2;
                        i6 += coerceAtLeast2;
                    } else if (stage2 == 6) {
                        i2 += coerceAtLeast2;
                        i7 += coerceAtLeast2;
                    } else if (stage2 != 7) {
                        i2 += coerceAtLeast2;
                        i5 += coerceAtLeast2;
                    }
                    i = 1;
                }
                i3 += coerceAtLeast2;
                i = 1;
            }
        }
        if (i2 <= 0 && i3 > 0) {
            i2 = RangesKt.coerceIn(coerceAtLeast - i3, 0, coerceAtLeast);
        }
        double d2 = coerceAtLeast;
        if (i2 < ((int) (d2 * 0.5d))) {
            int coerceAtLeast3 = (int) (RangesKt.coerceAtLeast(coerceAtLeast - i4, 0) * 0.7d);
            int coerceIn3 = RangesKt.coerceIn(i2 + coerceAtLeast3, i2, coerceAtLeast);
            Integer valueOf = Integer.valueOf(i5 + coerceAtLeast3);
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            num = valueOf;
            coerceIn = coerceIn3;
        } else {
            coerceIn = RangesKt.coerceIn(i2, 0, coerceAtLeast);
            Integer valueOf2 = Integer.valueOf(i5);
            if (valueOf2.intValue() <= 0) {
                valueOf2 = null;
            }
            num = valueOf2;
        }
        if (coerceIn <= 0) {
            return null;
        }
        Integer valueOf3 = Integer.valueOf(i7);
        Integer num2 = valueOf3.intValue() > 0 ? valueOf3 : null;
        int coerceIn4 = RangesKt.coerceIn((int) ((coerceIn * 100.0d) / d2), 0, 100);
        Integer valueOf4 = Integer.valueOf(i6);
        if (valueOf4.intValue() <= 0) {
            valueOf4 = null;
        }
        return new SleepWindow(startTime, endTime, coerceAtLeast, coerceIn, valueOf4, num, num2, Integer.valueOf(coerceIn4), sleepSourceFromRecord);
    }

    public static /* synthetic */ Object readSleepSessions$default(HealthConnectManager healthConnectManager, int i, ZoneId zoneId, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 14;
        }
        if ((i2 & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return healthConnectManager.readSleepSessions(i, zoneId, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:35|36))(2:37|(2:39|40)(3:41|42|(1:44)))|12|13|(1:15)|16|(2:18|19)(5:21|(4:24|(3:26|27|28)(1:30)|29|22)|31|32|33)))|47|6|7|(0)(0)|12|13|(0)|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readSleepSessions(int i, ZoneId zoneId, Continuation<? super List<SleepWindow>> continuation) {
        HealthConnectManager$readSleepSessions$1 healthConnectManager$readSleepSessions$1;
        int i2;
        Object m7905constructorimpl;
        List list;
        HealthConnectManager healthConnectManager = this;
        if (continuation instanceof HealthConnectManager$readSleepSessions$1) {
            healthConnectManager$readSleepSessions$1 = (HealthConnectManager$readSleepSessions$1) continuation;
            if ((healthConnectManager$readSleepSessions$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectManager$readSleepSessions$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectManager$readSleepSessions$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = healthConnectManager$readSleepSessions$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClient clientOrNull = getClientOrNull();
                    if (clientOrNull == null) {
                        return CollectionsKt.emptyList();
                    }
                    Instant now = Instant.now();
                    Instant instant = LocalDate.now(zoneId).minusDays(i).atStartOfDay(zoneId).toInstant();
                    Result.Companion companion = Result.INSTANCE;
                    HealthConnectManager healthConnectManager2 = healthConnectManager;
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SleepSessionRecord.class);
                    TimeRangeFilter.Companion companion2 = TimeRangeFilter.INSTANCE;
                    Intrinsics.checkNotNull(instant);
                    Intrinsics.checkNotNull(now);
                    ReadRecordsRequest readRecordsRequest = new ReadRecordsRequest(orCreateKotlinClass, companion2.between(instant, now), null, false, 0, null, 60, null);
                    healthConnectManager$readSleepSessions$1.L$0 = healthConnectManager;
                    healthConnectManager$readSleepSessions$1.label = 1;
                    obj = clientOrNull.readRecords(readRecordsRequest, healthConnectManager$readSleepSessions$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    healthConnectManager = (HealthConnectManager) healthConnectManager$readSleepSessions$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                m7905constructorimpl = Result.m7905constructorimpl(((ReadRecordsResponse) obj).getRecords());
                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                    m7905constructorimpl = CollectionsKt.emptyList();
                }
                list = (List) m7905constructorimpl;
                if (!list.isEmpty()) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    SleepWindow summarizeSleepSession = healthConnectManager.summarizeSleepSession((SleepSessionRecord) it.next());
                    if (summarizeSleepSession != null) {
                        arrayList.add(summarizeSleepSession);
                    }
                }
                return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.rungps.health.HealthConnectManager$readSleepSessions$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((HealthConnectManager.SleepWindow) t2).getStartTime(), ((HealthConnectManager.SleepWindow) t).getStartTime());
                    }
                });
            }
        }
        healthConnectManager$readSleepSessions$1 = new HealthConnectManager$readSleepSessions$1(healthConnectManager, continuation);
        Object obj2 = healthConnectManager$readSleepSessions$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = healthConnectManager$readSleepSessions$1.label;
        if (i2 != 0) {
        }
        m7905constructorimpl = Result.m7905constructorimpl(((ReadRecordsResponse) obj2).getRecords());
        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
        }
        list = (List) m7905constructorimpl;
        if (!list.isEmpty()) {
        }
    }

    public static /* synthetic */ Object readRestingHeartRateBpm$default(HealthConnectManager healthConnectManager, int i, ZoneId zoneId, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        if ((i2 & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return healthConnectManager.readRestingHeartRateBpm(i, zoneId, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:62|63))(2:64|(1:66)(3:67|68|(1:70)))|12|13|(1:15)|16|(1:18)(8:20|(5:23|(5:26|(1:37)(1:30)|(3:32|33|34)(1:36)|35|24)|38|39|21)|40|41|(4:44|(3:49|50|51)|52|42)|55|56|(2:58|59)(1:60))))|73|6|7|(0)(0)|12|13|(0)|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x009b, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m7905constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readRestingHeartRateBpm(int i, ZoneId zoneId, Continuation<? super Integer> continuation) {
        HealthConnectManager$readRestingHeartRateBpm$1 healthConnectManager$readRestingHeartRateBpm$1;
        int i2;
        Object m7905constructorimpl;
        List list;
        ZoneId zoneId2 = zoneId;
        if (continuation instanceof HealthConnectManager$readRestingHeartRateBpm$1) {
            healthConnectManager$readRestingHeartRateBpm$1 = (HealthConnectManager$readRestingHeartRateBpm$1) continuation;
            if ((healthConnectManager$readRestingHeartRateBpm$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectManager$readRestingHeartRateBpm$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectManager$readRestingHeartRateBpm$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = healthConnectManager$readRestingHeartRateBpm$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClient clientOrNull = getClientOrNull();
                    if (clientOrNull == null) {
                        return null;
                    }
                    Instant now = Instant.now();
                    Instant instant = LocalDate.now(zoneId).minusDays(i).atStartOfDay(zoneId2).toInstant();
                    Result.Companion companion = Result.INSTANCE;
                    HealthConnectManager healthConnectManager = this;
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HeartRateRecord.class);
                    TimeRangeFilter.Companion companion2 = TimeRangeFilter.INSTANCE;
                    Intrinsics.checkNotNull(instant);
                    Intrinsics.checkNotNull(now);
                    ReadRecordsRequest readRecordsRequest = new ReadRecordsRequest(orCreateKotlinClass, companion2.between(instant, now), null, false, 0, null, 60, null);
                    healthConnectManager$readRestingHeartRateBpm$1.L$0 = zoneId2;
                    healthConnectManager$readRestingHeartRateBpm$1.label = 1;
                    obj = clientOrNull.readRecords(readRecordsRequest, healthConnectManager$readRestingHeartRateBpm$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zoneId2 = (ZoneId) healthConnectManager$readRestingHeartRateBpm$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                m7905constructorimpl = Result.m7905constructorimpl(((ReadRecordsResponse) obj).getRecords());
                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                    m7905constructorimpl = CollectionsKt.emptyList();
                }
                list = (List) m7905constructorimpl;
                if (!list.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<HeartRateRecord.Sample> samples = ((HeartRateRecord) it.next()).getSamples();
                    ArrayList arrayList2 = new ArrayList();
                    for (HeartRateRecord.Sample sample : samples) {
                        int hour = sample.getTime().atZone(zoneId2).getHour();
                        Long boxLong = (2 > hour || hour >= 6) ? null : Boxing.boxLong(sample.getBeatsPerMinute());
                        if (boxLong != null) {
                            arrayList2.add(boxLong);
                        }
                    }
                    CollectionsKt.addAll(arrayList, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    long longValue = ((Number) obj2).longValue();
                    if (35 <= longValue && longValue < 111) {
                        arrayList3.add(obj2);
                    }
                }
                Long l = (Long) CollectionsKt.minOrNull((Iterable) arrayList3);
                if (l != null) {
                    return Boxing.boxInt((int) l.longValue());
                }
                return null;
            }
        }
        healthConnectManager$readRestingHeartRateBpm$1 = new HealthConnectManager$readRestingHeartRateBpm$1(this, continuation);
        Object obj3 = healthConnectManager$readRestingHeartRateBpm$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = healthConnectManager$readRestingHeartRateBpm$1.label;
        if (i2 != 0) {
        }
        m7905constructorimpl = Result.m7905constructorimpl(((ReadRecordsResponse) obj3).getRecords());
        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
        }
        list = (List) m7905constructorimpl;
        if (!list.isEmpty()) {
        }
    }
}
