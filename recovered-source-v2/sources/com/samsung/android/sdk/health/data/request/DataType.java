package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.example.rungps.data.UserProfileStore;
import com.samsung.android.sdk.health.data.BuildConfig;
import com.samsung.android.sdk.health.data.d2;
import com.samsung.android.sdk.health.data.data.AggregateOperation;
import com.samsung.android.sdk.health.data.data.DataPoint;
import com.samsung.android.sdk.health.data.data.Field;
import com.samsung.android.sdk.health.data.data.HealthDataPoint;
import com.samsung.android.sdk.health.data.data.UserDataPoint;
import com.samsung.android.sdk.health.data.data.entries.BloodGlucose;
import com.samsung.android.sdk.health.data.data.entries.ExerciseSession;
import com.samsung.android.sdk.health.data.data.entries.HeartRate;
import com.samsung.android.sdk.health.data.data.entries.OxygenSaturation;
import com.samsung.android.sdk.health.data.data.entries.SkinTemperature;
import com.samsung.android.sdk.health.data.data.entries.SleepSession;
import com.samsung.android.sdk.health.data.o;
import com.samsung.android.sdk.health.data.request.AggregateRequest;
import com.samsung.android.sdk.health.data.request.AssociatedReadRequest;
import com.samsung.android.sdk.health.data.request.ChangedDataRequest;
import com.samsung.android.sdk.health.data.request.DataType;
import com.samsung.android.sdk.health.data.request.DeleteDataRequest;
import com.samsung.android.sdk.health.data.request.InsertDataRequest;
import com.samsung.android.sdk.health.data.request.ReadDataRequest;
import com.samsung.android.sdk.health.data.request.UpdateDataRequest;
import com.samsung.android.sdk.health.data.t;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.List;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.maplibre.android.style.layers.Property;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b&\u0018\u0000 \u001f2\u00020\u0001:\u001d\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010H\u0016R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u00063"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType;", "Landroid/os/Parcelable;", "()V", "allAggregateOperations", "", "Lcom/samsung/android/sdk/health/data/data/AggregateOperation;", "getAllAggregateOperations", "()Ljava/util/List;", "allFields", "Lcom/samsung/android/sdk/health/data/data/Field;", "getAllFields", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ActiveCaloriesBurnedGoalType", "ActiveTimeGoalType", "ActivitySummaryType", "BloodGlucoseType", "BloodOxygenType", "BloodPressureType", "BodyCompositionType", "BodyTemperatureType", "ChangeReadable", "Companion", "EnergyScoreType", "ExerciseLocationType", "ExerciseType", "FloorsClimbedType", "HeartRateType", "IrregularHeartRhythmNotificationType", "NutritionGoalType", "NutritionType", "Readable", "SkinTemperatureType", "SleepApneaType", "SleepGoalType", "SleepType", "StepsGoalType", "StepsType", "UserProfileDataType", "WaterIntakeGoalType", "WaterIntakeType", "Writeable", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DataType implements Parcelable {
    public static final Parcelable.Creator<DataType> CREATOR = new Parcelable.Creator<DataType>() { // from class: com.samsung.android.sdk.health.data.request.DataType$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataType createFromParcel(Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return t.b(in.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataType[] newArray(int size) {
            return new DataType[size];
        }
    };

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$ActiveCaloriesBurnedGoalType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ActiveCaloriesBurnedGoalType extends DataType {
        private static final String DATA_TYPE_NAME = "active_calories_burned_goal";
        private static final String LAST_CALORIES_OPERATION_NAME = "LAST.calories";
        public static final AggregateOperation<Integer, AggregateRequest.AllSourceLocalDateBuilder<Integer>> LAST = AggregateOperation.INSTANCE.of(DATA_TYPE_NAME, LAST_CALORIES_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$ActiveCaloriesBurnedGoalType$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                AggregateRequest.AllSourceLocalDateBuilder a;
                a = DataType.ActiveCaloriesBurnedGoalType.a();
                return a;
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.AllSourceLocalDateBuilder a() {
            AggregateRequest.AllSourceLocalDateBuilder.Companion companion = AggregateRequest.AllSourceLocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, LAST_CALORIES_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$ActiveTimeGoalType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ActiveTimeGoalType extends DataType {
        private static final String DATA_TYPE_NAME = "active_time_goal";
        private static final String LAST_ACTIVE_TIME_OPERATION_NAME = "LAST.active_time";
        public static final AggregateOperation<Duration, AggregateRequest.AllSourceLocalDateBuilder<Duration>> LAST = AggregateOperation.INSTANCE.of(DATA_TYPE_NAME, LAST_ACTIVE_TIME_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$ActiveTimeGoalType$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                AggregateRequest.AllSourceLocalDateBuilder a;
                a = DataType.ActiveTimeGoalType.a();
                return a;
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.AllSourceLocalDateBuilder a() {
            AggregateRequest.AllSourceLocalDateBuilder.Companion companion = AggregateRequest.AllSourceLocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, LAST_ACTIVE_TIME_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0000¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$ActivitySummaryType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ActivitySummaryType extends DataType {
        private static final String DATA_TYPE_NAME = "activity_summary";
        public static final AggregateOperation<Float, AggregateRequest.LocalTimeBuilder<Float>> TOTAL_ACTIVE_CALORIES_BURNED;
        private static final String TOTAL_ACTIVE_CALORIES_BURNED_OPERATION_NAME = "TOTAL.active_calories_burned";
        public static final AggregateOperation<Duration, AggregateRequest.LocalTimeBuilder<Duration>> TOTAL_ACTIVE_TIME;
        private static final String TOTAL_ACTIVE_TIME_OPERATION_NAME = "TOTAL.active_time";
        public static final AggregateOperation<Float, AggregateRequest.LocalTimeBuilder<Float>> TOTAL_CALORIES_BURNED;
        private static final String TOTAL_CALORIES_BURNED_OPERATION_NAME = "TOTAL.calories_burned";
        public static final AggregateOperation<Float, AggregateRequest.LocalTimeBuilder<Float>> TOTAL_DISTANCE;
        private static final String TOTAL_DISTANCE_OPERATION_NAME = "TOTAL.distance";

        static {
            AggregateOperation.Companion companion = AggregateOperation.INSTANCE;
            TOTAL_ACTIVE_CALORIES_BURNED = companion.of(DATA_TYPE_NAME, TOTAL_ACTIVE_CALORIES_BURNED_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$ActivitySummaryType$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    AggregateRequest.LocalTimeBuilder a;
                    a = DataType.ActivitySummaryType.a();
                    return a;
                }
            });
            TOTAL_CALORIES_BURNED = companion.of(DATA_TYPE_NAME, TOTAL_CALORIES_BURNED_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$ActivitySummaryType$$ExternalSyntheticLambda1
                @Override // java.util.function.Supplier
                public final Object get() {
                    AggregateRequest.LocalTimeBuilder c;
                    c = DataType.ActivitySummaryType.c();
                    return c;
                }
            });
            TOTAL_ACTIVE_TIME = companion.of(DATA_TYPE_NAME, TOTAL_ACTIVE_TIME_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$ActivitySummaryType$$ExternalSyntheticLambda2
                @Override // java.util.function.Supplier
                public final Object get() {
                    AggregateRequest.LocalTimeBuilder b;
                    b = DataType.ActivitySummaryType.b();
                    return b;
                }
            });
            TOTAL_DISTANCE = companion.of(DATA_TYPE_NAME, TOTAL_DISTANCE_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$ActivitySummaryType$$ExternalSyntheticLambda3
                @Override // java.util.function.Supplier
                public final Object get() {
                    AggregateRequest.LocalTimeBuilder d;
                    d = DataType.ActivitySummaryType.d();
                    return d;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalTimeBuilder a() {
            AggregateRequest.LocalTimeBuilder.Companion companion = AggregateRequest.LocalTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_ACTIVE_CALORIES_BURNED_OPERATION_NAME);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalTimeBuilder b() {
            AggregateRequest.LocalTimeBuilder.Companion companion = AggregateRequest.LocalTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_ACTIVE_TIME_OPERATION_NAME);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalTimeBuilder c() {
            AggregateRequest.LocalTimeBuilder.Companion companion = AggregateRequest.LocalTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_CALORIES_BURNED_OPERATION_NAME);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalTimeBuilder d() {
            AggregateRequest.LocalTimeBuilder.Companion companion = AggregateRequest.LocalTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_DISTANCE_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0004\u001f !\"B\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$BloodGlucoseType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Companion", "MealStatus", "MeasurementType", "SampleSourceType", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BloodGlucoseType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "blood_glucose";
        public static final Field<Float> GLUCOSE_LEVEL;
        public static final Field<Float> INSULIN_INJECTED;
        public static final Field<MealStatus> MEAL_STATUS;
        public static final Field<Instant> MEAL_TIME;
        public static final Field<MeasurementType> MEASUREMENT_TYPE;
        public static final Field<Boolean> MEDICATION_TAKEN;
        public static final Field<SampleSourceType> SAMPLE_SOURCE_TYPE;
        public static final Field<List<BloodGlucose>> SERIES_DATA;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$BloodGlucoseType$MealStatus;", "", "UNDEFINED", "FASTING", "AFTER_MEAL", "BEFORE_BREAKFAST", "AFTER_BREAKFAST", "BEFORE_LUNCH", "AFTER_LUNCH", "BEFORE_DINNER", "AFTER_DINNER", "AFTER_BED_TIME", "AFTER_SNACK", "BEFORE_MEAL", "GENERAL", "BEFORE_SLEEP", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum MealStatus {
            UNDEFINED,
            FASTING,
            AFTER_MEAL,
            BEFORE_BREAKFAST,
            AFTER_BREAKFAST,
            BEFORE_LUNCH,
            AFTER_LUNCH,
            BEFORE_DINNER,
            AFTER_DINNER,
            AFTER_BED_TIME,
            AFTER_SNACK,
            BEFORE_MEAL,
            GENERAL,
            BEFORE_SLEEP;

            MealStatus() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$BloodGlucoseType$MeasurementType;", "", "UNDEFINED", "WHOLE_BLOOD", "PLASMA", "SERUM", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum MeasurementType {
            UNDEFINED,
            WHOLE_BLOOD,
            PLASMA,
            SERUM;

            MeasurementType() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$BloodGlucoseType$SampleSourceType;", "", "UNDEFINED", "VENOUS", "CAPILLARY", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum SampleSourceType {
            UNDEFINED,
            VENOUS,
            CAPILLARY;

            SampleSourceType() {
            }
        }

        static {
            Field.Companion companion = Field.INSTANCE;
            GLUCOSE_LEVEL = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "glucose");
            SERIES_DATA = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "binning_data");
            MEASUREMENT_TYPE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "measurement_type");
            SAMPLE_SOURCE_TYPE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "sample_source_type");
            MEAL_TIME = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "meal_time");
            MEAL_STATUS = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "meal_type");
            INSULIN_INJECTED = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "insulin_injected");
            MEDICATION_TAKEN = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "medication");
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0001\u001fB\u0007\b\u0000¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$BloodOxygenType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BloodOxygenType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "blood_oxygen";
        public static final Field<Float> MAX_OXYGEN_SATURATION;
        public static final Field<Float> MIN_OXYGEN_SATURATION;
        public static final Field<Float> OXYGEN_SATURATION;
        public static final Field<List<OxygenSaturation>> SERIES_DATA;

        static {
            Field.Companion companion = Field.INSTANCE;
            OXYGEN_SATURATION = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "spo2");
            MIN_OXYGEN_SATURATION = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "min");
            MAX_OXYGEN_SATURATION = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "max");
            SERIES_DATA = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "binning_data");
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$BloodPressureType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BloodPressureType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "blood_pressure";
        public static final Field<Float> DIASTOLIC;
        public static final Field<Float> MEAN;
        public static final Field<Boolean> MEDICATION_TAKEN;
        public static final Field<Integer> PULSE_RATE;
        public static final Field<Float> SYSTOLIC;

        static {
            Field.Companion companion = Field.INSTANCE;
            SYSTOLIC = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "systolic");
            DIASTOLIC = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "diastolic");
            MEAN = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "mean");
            PULSE_RATE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "pulse");
            MEDICATION_TAKEN = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "medication");
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$BodyCompositionType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BodyCompositionType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        public static final Field<Integer> BASAL_METABOLIC_RATE;
        public static final Field<Float> BODY_FAT;
        public static final Field<Float> BODY_FAT_MASS;
        public static final Field<Float> BODY_MASS_INDEX;
        private static final String DATA_TYPE_NAME = "body_composition";
        public static final Field<Float> FAT_FREE;
        public static final Field<Float> FAT_FREE_MASS;
        public static final Field<Float> HEIGHT;
        public static final Field<Float> MUSCLE_MASS;
        public static final Field<Float> SKELETAL_MUSCLE;
        public static final Field<Float> SKELETAL_MUSCLE_MASS;
        public static final Field<Float> TOTAL_BODY_WATER;
        public static final Field<Float> WEIGHT;

        static {
            Field.Companion companion = Field.INSTANCE;
            WEIGHT = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "weight");
            HEIGHT = companion.of$SDK_clientRelease(DATA_TYPE_NAME, Property.ICON_TEXT_FIT_HEIGHT);
            BODY_FAT = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "body_fat");
            SKELETAL_MUSCLE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "skeletal_muscle");
            MUSCLE_MASS = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "muscle_mass");
            BASAL_METABOLIC_RATE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "basal_metabolic_rate");
            BODY_FAT_MASS = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "body_fat_mass");
            FAT_FREE_MASS = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "fat_free_mass");
            FAT_FREE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "fat_free");
            SKELETAL_MUSCLE_MASS = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "skeletal_muscle_mass");
            TOTAL_BODY_WATER = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "total_body_water");
            BODY_MASS_INDEX = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "bmi");
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0001\u001fB\u0007\b\u0000¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$BodyTemperatureType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BodyTemperatureType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "body_temperature";
        public static final Field<Float> BODY_TEMPERATURE = Field.INSTANCE.of$SDK_clientRelease(DATA_TYPE_NAME, "temperature");

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/data/DataPoint;", "", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ChangeReadable<T extends DataPoint> {
        ChangedDataRequest.BasicBuilder<T> getChangedDataRequestBuilder();
    }

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u0005:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$EnergyScoreType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EnergyScoreType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.LocalDateBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "energy_score";
        public static final Field<Float> ENERGY_SCORE = Field.INSTANCE.of$SDK_clientRelease(DATA_TYPE_NAME, "total_score");

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.LocalDateBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.LocalDateBuilder.Companion companion = ReadDataRequest.LocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0000¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseLocationType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ExerciseLocationType extends DataType {
        private static final String DATA_TYPE_NAME = "exercise_location";

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }
    }

    @o(read = 1009000, write = 1009000)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0004\u001f !\"B\u0007\b\u0000¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Companion", "CountType", "PredefinedExerciseType", "StrokeType", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ExerciseType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        public static final Field<String> CUSTOM_TITLE;
        private static final String DATA_TYPE_NAME = "exercise";
        public static final Field<PredefinedExerciseType> EXERCISE_TYPE;
        public static final Field<List<ExerciseSession>> SESSIONS;
        public static final AggregateOperation<Float, AggregateRequest.LocalTimeBuilder<Float>> TOTAL_CALORIES;
        public static final AggregateOperation<Duration, AggregateRequest.LocalDateBuilder<Duration>> TOTAL_DURATION;
        private static final String TOTAL_EXERCISE_CALORIES_OPERATION_NAME = "TOTAL.calories";
        private static final String TOTAL_EXERCISE_DURATION_OPERATION_NAME = "TOTAL.duration";

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$CountType;", "", "UNDEFINED", "STRIDE", "STROKE", "SWING", "REPETITION", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum CountType {
            UNDEFINED,
            STRIDE,
            STROKE,
            SWING,
            REPETITION;

            CountType() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\br\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\br¨\u0006s"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$PredefinedExerciseType;", "", "UNDEFINED", UserProfileStore.SEX_OTHER, "WALKING", DebugCoroutineInfoImplKt.RUNNING, "STAIR_CLIMBING", "TRACK_RUNNING", "BASEBALL", "SOFTBALL", "CRICKET", "GOLF", "BOWLING", "HOCKEY", "RUGBY", "BASKETBALL", "SOCCER", "HANDBALL", "AMERICAN_FOOTBALL", "VOLLEYBALL", "BEACH_VOLLEYBALL", "SQUASH", "TENNIS", "BADMINTON", "TABLE_TENNIS", "RACQUETBALL", "BOXING", "MARTIAL_ARTS", "BALLET", "DANCING", "BALLROOM_DANCING", "PILATES", "YOGA", "STRETCHING", "JUMP_ROPE", "HULA_HOOPING", "PUSH_UPS", "PULL_UPS", "SIT_UPS", "CIRCUIT_TRAINING", "MOUNTAIN_CLIMBERS", "JUMPING_JACKS", "BURPEES", "BENCH_PRESS", "SQUATS", "LUNGES", "LEG_PRESSES", "LEG_EXTENSIONS", "LEG_CURLS", "BACK_EXTENSIONS", "LAT_PULLDOWNS", "DEADLIFTS", "SHOULDER_PRESSES", "FRONT_RAISES", "LATERAL_RAISES", "CRUNCH", "LEG_RAISES", "PLANK", "ARM_CURLS", "ARM_EXTENSIONS", "SKATERS", "HIGH_KNEES", "INLINE_SKATING", "HANG_GLIDING", "ARCHERY", "HORSEBACK_RIDING", "BIKING", "FLYING_DISC", "ROLLER_SKATING", "AEROBICS", "HIKING", "ROCK_CLIMBING", "BACKPACKING", "MOUNTAIN_BIKING", "ORIENTEERING", "POOL_SWIMMING", "AQUA_AEROBICS", "CANOEING", "SAILING", "SCUBA_DIVING", "SNORKELING", "KAYAKING", "KITESURFING", "RAFTING", "ROWING", "WINDSURFING", "YACHTING", "WATER_SKIING", "STEP_MACHINE", "WEIGHT_MACHINE", "STATIONARY_BIKING", "ROWING_MACHINE", "TREADMILL", "ELLIPTICAL", "STAIR_CLIMBING_MACHINE", "CROSS_COUNTRY_SKIING", "SKIING", "ICE_DANCING", "ICE_SKATING", "ICE_HOCKEY", "SNOWBOARDING", "ALPINE_SKIING", "SNOWSHOEING", "TRIATHLON", "DUATHLON", "AQUATHLON", "AQUABIKE", "CROSS_TRIATHLON", "CROSS_DUATHLON", "BREAK", "COOL_DOWN", "WARM_UP", "TRANSITION", "ZUMBA", "OPEN_WATER_SWIMMING", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum PredefinedExerciseType {
            UNDEFINED,
            OTHER,
            WALKING,
            RUNNING,
            STAIR_CLIMBING,
            TRACK_RUNNING,
            BASEBALL,
            SOFTBALL,
            CRICKET,
            GOLF,
            BOWLING,
            HOCKEY,
            RUGBY,
            BASKETBALL,
            SOCCER,
            HANDBALL,
            AMERICAN_FOOTBALL,
            VOLLEYBALL,
            BEACH_VOLLEYBALL,
            SQUASH,
            TENNIS,
            BADMINTON,
            TABLE_TENNIS,
            RACQUETBALL,
            BOXING,
            MARTIAL_ARTS,
            BALLET,
            DANCING,
            BALLROOM_DANCING,
            PILATES,
            YOGA,
            STRETCHING,
            JUMP_ROPE,
            HULA_HOOPING,
            PUSH_UPS,
            PULL_UPS,
            SIT_UPS,
            CIRCUIT_TRAINING,
            MOUNTAIN_CLIMBERS,
            JUMPING_JACKS,
            BURPEES,
            BENCH_PRESS,
            SQUATS,
            LUNGES,
            LEG_PRESSES,
            LEG_EXTENSIONS,
            LEG_CURLS,
            BACK_EXTENSIONS,
            LAT_PULLDOWNS,
            DEADLIFTS,
            SHOULDER_PRESSES,
            FRONT_RAISES,
            LATERAL_RAISES,
            CRUNCH,
            LEG_RAISES,
            PLANK,
            ARM_CURLS,
            ARM_EXTENSIONS,
            SKATERS,
            HIGH_KNEES,
            INLINE_SKATING,
            HANG_GLIDING,
            ARCHERY,
            HORSEBACK_RIDING,
            BIKING,
            FLYING_DISC,
            ROLLER_SKATING,
            AEROBICS,
            HIKING,
            ROCK_CLIMBING,
            BACKPACKING,
            MOUNTAIN_BIKING,
            ORIENTEERING,
            POOL_SWIMMING,
            AQUA_AEROBICS,
            CANOEING,
            SAILING,
            SCUBA_DIVING,
            SNORKELING,
            KAYAKING,
            KITESURFING,
            RAFTING,
            ROWING,
            WINDSURFING,
            YACHTING,
            WATER_SKIING,
            STEP_MACHINE,
            WEIGHT_MACHINE,
            STATIONARY_BIKING,
            ROWING_MACHINE,
            TREADMILL,
            ELLIPTICAL,
            STAIR_CLIMBING_MACHINE,
            CROSS_COUNTRY_SKIING,
            SKIING,
            ICE_DANCING,
            ICE_SKATING,
            ICE_HOCKEY,
            SNOWBOARDING,
            ALPINE_SKIING,
            SNOWSHOEING,
            TRIATHLON,
            DUATHLON,
            AQUATHLON,
            AQUABIKE,
            CROSS_TRIATHLON,
            CROSS_DUATHLON,
            BREAK,
            COOL_DOWN,
            WARM_UP,
            TRANSITION,
            ZUMBA,
            OPEN_WATER_SWIMMING;

            PredefinedExerciseType() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$StrokeType;", "", "UNDEFINED", "BUTTERFLY", "BACKSTROKE", "FREESTYLE", "BREASTSTROKE", "KICK_BOARD", "MIXED", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum StrokeType {
            UNDEFINED,
            BUTTERFLY,
            BACKSTROKE,
            FREESTYLE,
            BREASTSTROKE,
            KICK_BOARD,
            MIXED;

            StrokeType() {
            }
        }

        static {
            AggregateOperation.Companion companion = AggregateOperation.INSTANCE;
            TOTAL_CALORIES = companion.of(DATA_TYPE_NAME, TOTAL_EXERCISE_CALORIES_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$ExerciseType$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    AggregateRequest.LocalTimeBuilder a;
                    a = DataType.ExerciseType.a();
                    return a;
                }
            });
            TOTAL_DURATION = companion.of(DATA_TYPE_NAME, TOTAL_EXERCISE_DURATION_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$ExerciseType$$ExternalSyntheticLambda1
                @Override // java.util.function.Supplier
                public final Object get() {
                    AggregateRequest.LocalDateBuilder b;
                    b = DataType.ExerciseType.b();
                    return b;
                }
            });
            Field.Companion companion2 = Field.INSTANCE;
            EXERCISE_TYPE = companion2.of$SDK_clientRelease(DATA_TYPE_NAME, "exercise_type");
            CUSTOM_TITLE = companion2.of$SDK_clientRelease(DATA_TYPE_NAME, "custom_title");
            SESSIONS = companion2.of$SDK_clientRelease(DATA_TYPE_NAME, "sessions");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalTimeBuilder a() {
            AggregateRequest.LocalTimeBuilder.Companion companion = AggregateRequest.LocalTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_EXERCISE_CALORIES_OPERATION_NAME);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalDateBuilder b() {
            AggregateRequest.LocalDateBuilder.Companion companion = AggregateRequest.LocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_EXERCISE_DURATION_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0001\u001fB\u0007\b\u0000¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$FloorsClimbedType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FloorsClimbedType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "floors_climbed";
        private static final String TOTAL_FLOORS_CLIMBED_OPERATION_NAME = "TOTAL.floors_climbed";
        public static final AggregateOperation<Float, AggregateRequest.LocalTimeBuilder<Float>> TOTAL = AggregateOperation.INSTANCE.of(DATA_TYPE_NAME, TOTAL_FLOORS_CLIMBED_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$FloorsClimbedType$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                AggregateRequest.LocalTimeBuilder a;
                a = DataType.FloorsClimbedType.a();
                return a;
            }
        });
        public static final Field<Float> FLOOR = Field.INSTANCE.of$SDK_clientRelease(DATA_TYPE_NAME, "floor");

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalTimeBuilder a() {
            AggregateRequest.LocalTimeBuilder.Companion companion = AggregateRequest.LocalTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_FLOORS_CLIMBED_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0001\u001fB\u0007\b\u0000¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$HeartRateType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HeartRateType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "heart_rate";
        public static final Field<Float> HEART_RATE;
        public static final AggregateOperation<Float, AggregateRequest.LocalDateBuilder<Float>> MAX;
        public static final Field<Float> MAX_HEART_RATE;
        private static final String MAX_OPERATION_NAME = "Max";
        public static final AggregateOperation<Float, AggregateRequest.LocalDateBuilder<Float>> MIN;
        public static final Field<Float> MIN_HEART_RATE;
        private static final String MIN_OPERATION_NAME = "Min";
        public static final Field<List<HeartRate>> SERIES_DATA;

        static {
            AggregateOperation.Companion companion = AggregateOperation.INSTANCE;
            MIN = companion.of(DATA_TYPE_NAME, MIN_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$HeartRateType$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    AggregateRequest.LocalDateBuilder b;
                    b = DataType.HeartRateType.b();
                    return b;
                }
            });
            MAX = companion.of(DATA_TYPE_NAME, MAX_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$HeartRateType$$ExternalSyntheticLambda1
                @Override // java.util.function.Supplier
                public final Object get() {
                    AggregateRequest.LocalDateBuilder a;
                    a = DataType.HeartRateType.a();
                    return a;
                }
            });
            Field.Companion companion2 = Field.INSTANCE;
            HEART_RATE = companion2.of$SDK_clientRelease(DATA_TYPE_NAME, DATA_TYPE_NAME);
            MIN_HEART_RATE = companion2.of$SDK_clientRelease(DATA_TYPE_NAME, "min");
            MAX_HEART_RATE = companion2.of$SDK_clientRelease(DATA_TYPE_NAME, "max");
            SERIES_DATA = companion2.of$SDK_clientRelease(DATA_TYPE_NAME, "binning_data");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalDateBuilder a() {
            AggregateRequest.LocalDateBuilder.Companion companion = AggregateRequest.LocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, MAX_OPERATION_NAME);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalDateBuilder b() {
            AggregateRequest.LocalDateBuilder.Companion companion = AggregateRequest.LocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, MIN_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = 1010000)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u0005:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$IrregularHeartRhythmNotificationType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Companion", "IrregularHeartRhythmStatus", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IrregularHeartRhythmNotificationType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "irregular_heart_rhythm_notification";
        public static final Field<IrregularHeartRhythmStatus> STATUS = Field.INSTANCE.of$SDK_clientRelease(DATA_TYPE_NAME, NotificationCompat.CATEGORY_STATUS);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$IrregularHeartRhythmNotificationType$IrregularHeartRhythmStatus;", "", "UNDEFINED", "DETECTED", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum IrregularHeartRhythmStatus {
            UNDEFINED,
            DETECTED;

            IrregularHeartRhythmStatus() {
            }
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$NutritionGoalType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NutritionGoalType extends DataType {
        private static final String DATA_TYPE_NAME = "nutrition_goal";
        private static final String LAST_CALORIES_OPERATION_NAME = "LAST.calories";
        public static final AggregateOperation<Float, AggregateRequest.AllSourceLocalDateBuilder<Float>> LAST_CALORIES = AggregateOperation.INSTANCE.of(DATA_TYPE_NAME, LAST_CALORIES_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$NutritionGoalType$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                AggregateRequest.AllSourceLocalDateBuilder a;
                a = DataType.NutritionGoalType.a();
                return a;
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.AllSourceLocalDateBuilder a() {
            AggregateRequest.AllSourceLocalDateBuilder.Companion companion = AggregateRequest.AllSourceLocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, LAST_CALORIES_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0002\u001f B\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$NutritionType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Companion", "MealType", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NutritionType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        public static final Field<Float> CALCIUM;
        public static final Field<Float> CALORIES;
        public static final Field<Float> CARBOHYDRATE;
        public static final Field<Float> CHOLESTEROL;
        public static final Field<Float> DIETARY_FIBER;
        public static final Field<Float> IRON;
        public static final Field<MealType> MEAL_TYPE;
        public static final Field<Float> MONOSATURATED_FAT;
        public static final Field<Float> POLYSATURATED_FAT;
        public static final Field<Float> POTASSIUM;
        public static final Field<Float> PROTEIN;
        public static final Field<Float> SATURATED_FAT;
        public static final Field<Float> SODIUM;
        public static final Field<Float> SUGAR;
        public static final Field<String> TITLE;
        public static final Field<Float> TOTAL_FAT;
        public static final Field<Float> TRANS_FAT;
        public static final Field<Float> VITAMIN_A;
        public static final Field<Float> VITAMIN_C;
        private static final String DATA_TYPE_NAME = "nutrition";
        private static final String TOTAL_CALORIES_OPERATION_NAME = "TOTAL.calories";
        public static final AggregateOperation<Float, AggregateRequest.DualTimeBuilder<Float>> TOTAL_CALORIES = AggregateOperation.INSTANCE.of(DATA_TYPE_NAME, TOTAL_CALORIES_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$NutritionType$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                AggregateRequest.DualTimeBuilder a;
                a = DataType.NutritionType.a();
                return a;
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$NutritionType$MealType;", "", "UNDEFINED", "BREAKFAST", "LUNCH", "DINNER", "MORNING_SNACK", "AFTERNOON_SNACK", "EVENING_SNACK", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum MealType {
            UNDEFINED,
            BREAKFAST,
            LUNCH,
            DINNER,
            MORNING_SNACK,
            AFTERNOON_SNACK,
            EVENING_SNACK;

            MealType() {
            }
        }

        static {
            Field.Companion companion = Field.INSTANCE;
            MEAL_TYPE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "meal_type");
            CALORIES = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "calories");
            TITLE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "title");
            TOTAL_FAT = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "total_fat");
            SATURATED_FAT = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "saturated_fat");
            POLYSATURATED_FAT = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "polysaturated_fat");
            MONOSATURATED_FAT = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "monosaturated_fat");
            TRANS_FAT = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "trans_fat");
            CARBOHYDRATE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "carbohydrate");
            DIETARY_FIBER = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "dietary_fiber");
            SUGAR = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "sugar");
            PROTEIN = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "protein");
            CHOLESTEROL = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "cholesterol");
            SODIUM = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "sodium");
            POTASSIUM = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "potassium");
            VITAMIN_A = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "vitamin_a");
            VITAMIN_C = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "vitamin_c");
            CALCIUM = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "calcium");
            IRON = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "iron");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.DualTimeBuilder a() {
            AggregateRequest.DualTimeBuilder.Companion companion = AggregateRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_CALORIES_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005R\u0012\u0010\u0006\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.LATITUDE_SOUTH, "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$Builder;", "", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$Builder;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Readable<T extends DataPoint, S extends ReadDataRequest.Builder<T>> {
        S getReadDataRequestBuilder();
    }

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u0005:\u0001\u0012B\u0007\b\u0000¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$SkinTemperatureType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SkinTemperatureType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "skin_temperature";
        public static final Field<Float> MAX_SKIN_TEMPERATURE;
        public static final Field<Float> MIN_SKIN_TEMPERATURE;
        public static final Field<List<SkinTemperature>> SERIES_DATA;
        public static final Field<Float> SKIN_TEMPERATURE;

        static {
            Field.Companion companion = Field.INSTANCE;
            SKIN_TEMPERATURE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "temperature");
            MIN_SKIN_TEMPERATURE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "min");
            MAX_SKIN_TEMPERATURE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "max");
            SERIES_DATA = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "binning_data");
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = 1010000)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u0005:\u0002\u0012\u0013B\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$SleepApneaType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Companion", "DetectedSign", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SleepApneaType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "sleep_apnea";
        public static final Field<DetectedSign> DETECTED_SIGN = Field.INSTANCE.of$SDK_clientRelease(DATA_TYPE_NAME, "result");

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$SleepApneaType$DetectedSign;", "", "UNDEFINED", "DETECTED", "NOT_DETECTED", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum DetectedSign {
            UNDEFINED,
            DETECTED,
            NOT_DETECTED;

            DetectedSign() {
            }
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$SleepGoalType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SleepGoalType extends DataType {
        private static final String DATA_TYPE_NAME = "sleep_goal";
        public static final AggregateOperation<LocalTime, AggregateRequest.AllSourceLocalDateBuilder<LocalTime>> LAST_BED_TIME;
        private static final String LAST_BED_TIME_OPERATION_NAME = "LAST.bed_time";
        public static final AggregateOperation<LocalTime, AggregateRequest.AllSourceLocalDateBuilder<LocalTime>> LAST_WAKE_UP_TIME;
        private static final String LAST_WAKE_UP_TIME_OPERATION_NAME = "LAST.wake_up_time";

        static {
            AggregateOperation.Companion companion = AggregateOperation.INSTANCE;
            LAST_BED_TIME = companion.of(DATA_TYPE_NAME, LAST_BED_TIME_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$SleepGoalType$$ExternalSyntheticLambda0
                @Override // java.util.function.Supplier
                public final Object get() {
                    AggregateRequest.AllSourceLocalDateBuilder a;
                    a = DataType.SleepGoalType.a();
                    return a;
                }
            });
            LAST_WAKE_UP_TIME = companion.of(DATA_TYPE_NAME, LAST_WAKE_UP_TIME_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$SleepGoalType$$ExternalSyntheticLambda1
                @Override // java.util.function.Supplier
                public final Object get() {
                    AggregateRequest.AllSourceLocalDateBuilder b;
                    b = DataType.SleepGoalType.b();
                    return b;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.AllSourceLocalDateBuilder a() {
            AggregateRequest.AllSourceLocalDateBuilder.Companion companion = AggregateRequest.AllSourceLocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, LAST_BED_TIME_OPERATION_NAME);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.AllSourceLocalDateBuilder b() {
            AggregateRequest.AllSourceLocalDateBuilder.Companion companion = AggregateRequest.AllSourceLocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, LAST_WAKE_UP_TIME_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0003$%&B\u0007\b\u0000¢\u0006\u0002\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$SleepType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "associatedReadRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest$AssociateBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$SleepType$Associates;", "getAssociatedReadRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest$AssociateBuilder;", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Associates", "Companion", "StageType", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SleepType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        public static final Field<Duration> DURATION;
        public static final Field<List<SleepSession>> SESSIONS;
        public static final Field<Integer> SLEEP_SCORE;
        private static final String DATA_TYPE_NAME = "sleep";
        private static final String TOTAL_DURATION_OPERATION_NAME = "TOTAL.sleep_duration";
        public static final AggregateOperation<Duration, AggregateRequest.LocalDateBuilder<Duration>> TOTAL_DURATION = AggregateOperation.INSTANCE.of(DATA_TYPE_NAME, TOTAL_DURATION_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$SleepType$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                AggregateRequest.LocalDateBuilder a;
                a = DataType.SleepType.a();
                return a;
            }
        });

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$SleepType$Associates;", "", "Lcom/samsung/android/sdk/health/data/request/AssociateTypes;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType", "()Lcom/samsung/android/sdk/health/data/request/DataType;", "SKIN_TEMPERATURE", "BLOOD_OXYGEN", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum Associates implements AssociateTypes {
            SKIN_TEMPERATURE(DataTypes.SKIN_TEMPERATURE),
            BLOOD_OXYGEN(DataTypes.BLOOD_OXYGEN);

            private final DataType dataType;

            Associates(DataType dataType) {
                this.dataType = dataType;
            }

            @Override // com.samsung.android.sdk.health.data.request.AssociateTypes
            public DataType getDataType() {
                return this.dataType;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$SleepType$StageType;", "", "UNDEFINED", "AWAKE", "LIGHT", "DEEP", "REM", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum StageType {
            UNDEFINED,
            AWAKE,
            LIGHT,
            DEEP,
            REM;

            StageType() {
            }
        }

        static {
            Field.Companion companion = Field.INSTANCE;
            DURATION = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "sleep_duration");
            SESSIONS = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "sessions");
            SLEEP_SCORE = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "sleep_score");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalDateBuilder a() {
            AggregateRequest.LocalDateBuilder.Companion companion = AggregateRequest.LocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_DURATION_OPERATION_NAME);
        }

        public final AssociatedReadRequest.AssociateBuilder<Associates> getAssociatedReadRequestBuilder() {
            AssociatedReadRequest.AssociateBuilder.Companion companion = AssociatedReadRequest.AssociateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$StepsGoalType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StepsGoalType extends DataType {
        private static final String DATA_TYPE_NAME = "steps_goal";
        private static final String LAST_STEPS_OPERATION_NAME = "LAST.steps";
        public static final AggregateOperation<Integer, AggregateRequest.AllSourceLocalDateBuilder<Integer>> LAST = AggregateOperation.INSTANCE.of(DATA_TYPE_NAME, LAST_STEPS_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$StepsGoalType$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                AggregateRequest.AllSourceLocalDateBuilder a;
                a = DataType.StepsGoalType.a();
                return a;
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.AllSourceLocalDateBuilder a() {
            AggregateRequest.AllSourceLocalDateBuilder.Companion companion = AggregateRequest.AllSourceLocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, LAST_STEPS_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\b\u0000¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$StepsType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StepsType extends DataType {
        private static final String DATA_TYPE_NAME = "steps";
        private static final String TOTAL_STEPS_OPERATION_NAME = "TOTAL.steps";
        public static final AggregateOperation<Long, AggregateRequest.LocalTimeBuilder<Long>> TOTAL = AggregateOperation.INSTANCE.of(DATA_TYPE_NAME, TOTAL_STEPS_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$StepsType$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                AggregateRequest.LocalTimeBuilder a;
                a = DataType.StepsType.a();
                return a;
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.LocalTimeBuilder a() {
            AggregateRequest.LocalTimeBuilder.Companion companion = AggregateRequest.LocalTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_STEPS_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002\r\u000eB\u0005¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$UserProfileDataType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/UserDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$UserProfileBuilder;", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$UserProfileBuilder;", "Companion", "Gender", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UserProfileDataType extends DataType implements Readable<UserDataPoint, ReadDataRequest.UserProfileBuilder> {
        private static final String DATA_TYPE_NAME = "user_profile";
        public static final Field<String> DATE_OF_BIRTH;
        public static final Field<Gender> GENDER;
        public static final Field<Float> HEIGHT;
        public static final Field<String> NICKNAME;
        public static final Field<Float> WEIGHT;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$UserProfileDataType$Gender;", "", "GENDER_UNKNOWN", "GENDER_MALE", "GENDER_FEMALE", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public enum Gender {
            GENDER_UNKNOWN,
            GENDER_MALE,
            GENDER_FEMALE;

            Gender() {
            }
        }

        static {
            Field.Companion companion = Field.INSTANCE;
            DATE_OF_BIRTH = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "date_of_birth");
            HEIGHT = companion.of$SDK_clientRelease(DATA_TYPE_NAME, Property.ICON_TEXT_FIT_HEIGHT);
            WEIGHT = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "weight");
            GENDER = companion.of$SDK_clientRelease(DATA_TYPE_NAME, HintConstants.AUTOFILL_HINT_GENDER);
            NICKNAME = companion.of$SDK_clientRelease(DATA_TYPE_NAME, "nickname");
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.UserProfileBuilder getReadDataRequestBuilder() {
            ReadDataRequest.UserProfileBuilder.Companion companion = ReadDataRequest.UserProfileBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$WaterIntakeGoalType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "()V", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WaterIntakeGoalType extends DataType {
        private static final String DATA_TYPE_NAME = "water_intake_goal";
        private static final String LAST_AMOUNT_OPERATION_NAME = "LAST.amount";
        public static final AggregateOperation<Float, AggregateRequest.AllSourceLocalDateBuilder<Float>> LAST = AggregateOperation.INSTANCE.of(DATA_TYPE_NAME, LAST_AMOUNT_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$WaterIntakeGoalType$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                AggregateRequest.AllSourceLocalDateBuilder a;
                a = DataType.WaterIntakeGoalType.a();
                return a;
            }
        });

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.AllSourceLocalDateBuilder a() {
            AggregateRequest.AllSourceLocalDateBuilder.Companion companion = AggregateRequest.AllSourceLocalDateBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, LAST_AMOUNT_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }
    }

    @o(read = DurationKt.NANOS_IN_MILLIS, write = DurationKt.NANOS_IN_MILLIS)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00040\u00022\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0012\u0004\u0012\u00020\u00030\u0006:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$WaterIntakeType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "Lcom/samsung/android/sdk/health/data/data/HealthDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "()V", "changedDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "getChangedDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "readDataRequestBuilder", "getReadDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class WaterIntakeType extends DataType implements Readable<HealthDataPoint, ReadDataRequest.DualTimeBuilder<HealthDataPoint>>, ChangeReadable<HealthDataPoint>, Writeable<HealthDataPoint> {
        private static final String DATA_TYPE_NAME = "water_intake";
        private static final String TOTAL_AMOUNT_OPERATION_NAME = "TOTAL.amount";
        public static final AggregateOperation<Float, AggregateRequest.DualTimeBuilder<Float>> TOTAL = AggregateOperation.INSTANCE.of(DATA_TYPE_NAME, TOTAL_AMOUNT_OPERATION_NAME, new Supplier() { // from class: com.samsung.android.sdk.health.data.request.DataType$WaterIntakeType$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                AggregateRequest.DualTimeBuilder a;
                a = DataType.WaterIntakeType.a();
                return a;
            }
        });
        public static final Field<Float> AMOUNT = Field.INSTANCE.of$SDK_clientRelease(DATA_TYPE_NAME, "amount");

        /* JADX INFO: Access modifiers changed from: private */
        public static final AggregateRequest.DualTimeBuilder a() {
            AggregateRequest.DualTimeBuilder.Companion companion = AggregateRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, DATA_TYPE_NAME, TOTAL_AMOUNT_OPERATION_NAME);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.ChangeReadable
        public ChangedDataRequest.BasicBuilder<HealthDataPoint> getChangedDataRequestBuilder() {
            ChangedDataRequest.BasicBuilder.Companion companion = ChangedDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder() {
            DeleteDataRequest.BasicBuilder.Companion companion = DeleteDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public InsertDataRequest.BasicBuilder<HealthDataPoint> getInsertDataRequestBuilder() {
            InsertDataRequest.BasicBuilder.Companion companion = InsertDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType
        public String getName() {
            return DATA_TYPE_NAME;
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Writeable
        public UpdateDataRequest.BasicBuilder<HealthDataPoint> getUpdateDataRequestBuilder() {
            UpdateDataRequest.BasicBuilder.Companion companion = UpdateDataRequest.BasicBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.write() : BuildConfig.SDK_VERSION_CODE, this);
        }

        @Override // com.samsung.android.sdk.health.data.request.DataType.Readable
        public ReadDataRequest.DualTimeBuilder<HealthDataPoint> getReadDataRequestBuilder() {
            ReadDataRequest.DualTimeBuilder.Companion companion = ReadDataRequest.DualTimeBuilder.INSTANCE;
            o oVar = (o) d2.a(DATA_TYPE_NAME, "dataTypeName", DATA_TYPE_NAME, o.class);
            return companion.builder$SDK_clientRelease(oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE, this);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/data/DataPoint;", "", "deleteDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "getDeleteDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "insertDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "getInsertDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "updateDataRequestBuilder", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "getUpdateDataRequestBuilder", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Writeable<T extends DataPoint> {
        DeleteDataRequest.BasicBuilder getDeleteDataRequestBuilder();

        InsertDataRequest.BasicBuilder<T> getInsertDataRequestBuilder();

        UpdateDataRequest.BasicBuilder<T> getUpdateDataRequestBuilder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<AggregateOperation<?, ?>> getAllAggregateOperations() {
        List<AggregateOperation<?, ?>> a = t.a(this);
        Intrinsics.checkNotNullExpressionValue(a, "getAllAggregateOperationsOf(this)");
        return a;
    }

    public final List<Field<?>> getAllFields() {
        List<Field<?>> b = t.b(this);
        Intrinsics.checkNotNullExpressionValue(b, "getAllFieldsOf(this)");
        return b;
    }

    public abstract String getName();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(getName());
    }
}
