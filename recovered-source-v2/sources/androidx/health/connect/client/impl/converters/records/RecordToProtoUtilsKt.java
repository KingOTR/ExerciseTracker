package androidx.health.connect.client.impl.converters.records;

import androidx.health.connect.client.records.ExerciseLap;
import androidx.health.connect.client.records.ExerciseRoute;
import androidx.health.connect.client.records.ExerciseSegment;
import androidx.health.connect.client.records.InstantaneousRecord;
import androidx.health.connect.client.records.IntervalRecord;
import androidx.health.connect.client.records.SkinTemperatureRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.metadata.Device;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import androidx.health.connect.client.units.Length;
import androidx.health.platform.client.proto.DataProto;
import com.caverock.androidsvg.SVGParser;
import java.time.Instant;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecordToProtoUtils.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0005*\u00020\bH\u0000\u001a\u0014\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000eH\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000fH\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0010H\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0011H\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0012H\u0000\u001a\f\u0010\f\u001a\u00020\u0013*\u00020\u0014H\u0000¨\u0006\u0015"}, d2 = {"protoDataType", "Landroidx/health/platform/client/proto/DataProto$DataType;", "dataTypeName", "", "instantaneousProto", "Landroidx/health/platform/client/proto/DataProto$DataPoint$Builder;", "Landroidx/health/connect/client/records/InstantaneousRecord;", "intervalProto", "Landroidx/health/connect/client/records/IntervalRecord;", "setMetadata", "metadata", "Landroidx/health/connect/client/records/metadata/Metadata;", "toProto", "Landroidx/health/platform/client/proto/DataProto$SubTypeDataValue;", "Landroidx/health/connect/client/records/ExerciseLap;", "Landroidx/health/connect/client/records/ExerciseRoute$Location;", "Landroidx/health/connect/client/records/ExerciseSegment;", "Landroidx/health/connect/client/records/SkinTemperatureRecord$Delta;", "Landroidx/health/connect/client/records/SleepSessionRecord$Stage;", "Landroidx/health/platform/client/proto/DataProto$Device;", "Landroidx/health/connect/client/records/metadata/Device;", "connect-client_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RecordToProtoUtilsKt {
    public static final DataProto.DataType protoDataType(String dataTypeName) {
        Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
        DataProto.DataType build = DataProto.DataType.newBuilder().setName(dataTypeName).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder().setName(dataTypeName).build()");
        return build;
    }

    public static final DataProto.DataPoint.Builder instantaneousProto(InstantaneousRecord instantaneousRecord) {
        Intrinsics.checkNotNullParameter(instantaneousRecord, "<this>");
        DataProto.DataPoint.Builder newBuilder = DataProto.DataPoint.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        DataProto.DataPoint.Builder builder = setMetadata(newBuilder, instantaneousRecord.getMetadata()).setInstantTimeMillis(instantaneousRecord.getTime().toEpochMilli());
        ZoneOffset zoneOffset = instantaneousRecord.getZoneOffset();
        if (zoneOffset != null) {
            builder.setZoneOffsetSeconds(zoneOffset.getTotalSeconds());
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    public static final DataProto.DataPoint.Builder intervalProto(IntervalRecord intervalRecord) {
        Intrinsics.checkNotNullParameter(intervalRecord, "<this>");
        DataProto.DataPoint.Builder newBuilder = DataProto.DataPoint.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        DataProto.DataPoint.Builder builder = setMetadata(newBuilder, intervalRecord.getMetadata()).setStartTimeMillis(intervalRecord.getStartTime().toEpochMilli()).setEndTimeMillis(intervalRecord.getEndTime().toEpochMilli());
        ZoneOffset startZoneOffset = intervalRecord.getStartZoneOffset();
        if (startZoneOffset != null) {
            builder.setStartZoneOffsetSeconds(startZoneOffset.getTotalSeconds());
        }
        ZoneOffset endZoneOffset = intervalRecord.getEndZoneOffset();
        if (endZoneOffset != null) {
            builder.setEndZoneOffsetSeconds(endZoneOffset.getTotalSeconds());
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    private static final DataProto.DataPoint.Builder setMetadata(DataProto.DataPoint.Builder builder, androidx.health.connect.client.records.metadata.Metadata metadata) {
        if (!Intrinsics.areEqual(metadata.getId(), "")) {
            builder.setUid(metadata.getId());
        }
        if (metadata.getDataOrigin().getPackageName().length() > 0) {
            builder.setDataOrigin(DataProto.DataOrigin.newBuilder().setApplicationId(metadata.getDataOrigin().getPackageName()).build());
        }
        if (metadata.getLastModifiedTime().isAfter(Instant.EPOCH)) {
            builder.setUpdateTimeMillis(metadata.getLastModifiedTime().toEpochMilli());
        }
        String clientRecordId = metadata.getClientRecordId();
        if (clientRecordId != null) {
            builder.setClientId(clientRecordId);
        }
        if (metadata.getClientRecordVersion() > 0) {
            builder.setClientVersion(metadata.getClientRecordVersion());
        }
        Device device = metadata.getDevice();
        if (device != null) {
            builder.setDevice(toProto(device));
        }
        if (metadata.getRecordingMethod() > 0) {
            builder.setRecordingMethod(metadata.getRecordingMethod());
        }
        return builder;
    }

    public static final DataProto.Device toProto(Device device) {
        Intrinsics.checkNotNullParameter(device, "<this>");
        DataProto.Device.Builder newBuilder = DataProto.Device.newBuilder();
        String manufacturer = device.getManufacturer();
        if (manufacturer != null) {
            newBuilder.setManufacturer(manufacturer);
        }
        String model = device.getModel();
        if (model != null) {
            newBuilder.setModel(model);
        }
        newBuilder.setType(DeviceTypeConvertersKt.getDEVICE_TYPE_INT_TO_STRING_MAP().getOrDefault(Integer.valueOf(device.getType()), DeviceTypes.UNKNOWN));
        DataProto.Device build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n        .ap…       }\n        .build()");
        return build;
    }

    public static final DataProto.SubTypeDataValue toProto(SkinTemperatureRecord.Delta delta) {
        Intrinsics.checkNotNullParameter(delta, "<this>");
        DataProto.SubTypeDataValue build = DataProto.SubTypeDataValue.newBuilder().setStartTimeMillis(delta.getTime().toEpochMilli()).setEndTimeMillis(delta.getTime().toEpochMilli()).putValues("temperatureDelta", ValueExtKt.doubleVal(delta.getDelta().getCelsius())).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n        .se…elsius))\n        .build()");
        return build;
    }

    public static final DataProto.SubTypeDataValue toProto(SleepSessionRecord.Stage stage) {
        Intrinsics.checkNotNullParameter(stage, "<this>");
        DataProto.SubTypeDataValue.Builder endTimeMillis = DataProto.SubTypeDataValue.newBuilder().setStartTimeMillis(stage.getStartTime().toEpochMilli()).setEndTimeMillis(stage.getEndTime().toEpochMilli());
        DataProto.Value enumValFromInt = ValueExtKt.enumValFromInt(stage.getStage(), SleepSessionRecord.STAGE_TYPE_INT_TO_STRING_MAP);
        if (enumValFromInt != null) {
            endTimeMillis.putValues("stage", enumValFromInt);
        }
        DataProto.SubTypeDataValue build = endTimeMillis.build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n        .se…       }\n        .build()");
        return build;
    }

    public static final DataProto.SubTypeDataValue toProto(ExerciseSegment exerciseSegment) {
        Intrinsics.checkNotNullParameter(exerciseSegment, "<this>");
        DataProto.SubTypeDataValue build = DataProto.SubTypeDataValue.newBuilder().setStartTimeMillis(exerciseSegment.getStartTime().toEpochMilli()).setEndTimeMillis(exerciseSegment.getEndTime().toEpochMilli()).putValues(SVGParser.XML_STYLESHEET_ATTR_TYPE, ValueExtKt.longVal(exerciseSegment.getSegmentType())).putValues("reps", ValueExtKt.longVal(exerciseSegment.getRepetitions())).build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n        .se…Long()))\n        .build()");
        return build;
    }

    public static final DataProto.SubTypeDataValue toProto(ExerciseLap exerciseLap) {
        Intrinsics.checkNotNullParameter(exerciseLap, "<this>");
        DataProto.SubTypeDataValue.Builder endTimeMillis = DataProto.SubTypeDataValue.newBuilder().setStartTimeMillis(exerciseLap.getStartTime().toEpochMilli()).setEndTimeMillis(exerciseLap.getEndTime().toEpochMilli());
        Length length = exerciseLap.getLength();
        if (length != null) {
            endTimeMillis.putValues("length", ValueExtKt.doubleVal(length.getMeters()));
        }
        DataProto.SubTypeDataValue build = endTimeMillis.build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n        .se…rs)) } }\n        .build()");
        return build;
    }

    public static final DataProto.SubTypeDataValue toProto(ExerciseRoute.Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        DataProto.SubTypeDataValue.Builder putValues = DataProto.SubTypeDataValue.newBuilder().setStartTimeMillis(location.getTime().toEpochMilli()).setEndTimeMillis(location.getTime().toEpochMilli()).putValues("latitude", ValueExtKt.doubleVal(location.getLatitude())).putValues("longitude", ValueExtKt.doubleVal(location.getLongitude()));
        Length horizontalAccuracy = location.getHorizontalAccuracy();
        if (horizontalAccuracy != null) {
            putValues.putValues("horizontal_accuracy", ValueExtKt.doubleVal(horizontalAccuracy.getMeters()));
        }
        Length verticalAccuracy = location.getVerticalAccuracy();
        if (verticalAccuracy != null) {
            putValues.putValues("vertical_accuracy", ValueExtKt.doubleVal(verticalAccuracy.getMeters()));
        }
        Length altitude = location.getAltitude();
        if (altitude != null) {
            putValues.putValues("altitude", ValueExtKt.doubleVal(altitude.getMeters()));
        }
        DataProto.SubTypeDataValue build = putValues.build();
        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n        .se…       }\n        .build()");
        return build;
    }
}
