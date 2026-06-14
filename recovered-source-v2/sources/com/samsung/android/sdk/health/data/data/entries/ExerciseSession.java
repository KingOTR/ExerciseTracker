package com.samsung.android.sdk.health.data.data.entries;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.samsung.android.sdk.health.data.d;
import com.samsung.android.sdk.health.data.e;
import com.samsung.android.sdk.health.data.e0;
import com.samsung.android.sdk.health.data.error.ErrorCode;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.error.PlatformInternalException;
import com.samsung.android.sdk.health.data.request.DataType;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b5\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0082\u00012\u00020\u0001:\u0004\u0083\u0001\u0082\u0001J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0004J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010/\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u0019\u00101\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*R\u0019\u00103\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104R\u0019\u00108\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010*R\u0019\u0010:\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010*R\u0019\u0010<\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010*R\u0019\u0010>\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b?\u0010*R\u0019\u0010@\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\bA\u0010*R\u0019\u0010B\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bB\u0010(\u001a\u0004\bC\u0010*R\u0019\u0010D\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bD\u0010(\u001a\u0004\bE\u0010*R\u0019\u0010F\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bF\u0010(\u001a\u0004\bG\u0010*R\u0019\u0010H\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bH\u0010(\u001a\u0004\bI\u0010*R\u0019\u0010J\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bJ\u0010(\u001a\u0004\bK\u0010*R\u0019\u0010L\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bL\u0010(\u001a\u0004\bM\u0010*R\u0019\u0010N\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bN\u0010(\u001a\u0004\bO\u0010*R\u0019\u0010P\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bP\u0010(\u001a\u0004\bQ\u0010*R\u0019\u0010R\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bR\u0010(\u001a\u0004\bS\u0010*R\u0019\u0010T\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bT\u0010(\u001a\u0004\bU\u0010*R\u0019\u0010V\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bV\u0010(\u001a\u0004\bW\u0010*R\u0019\u0010X\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\bX\u0010(\u001a\u0004\bY\u0010*R\u0019\u0010Z\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\bZ\u0010#\u001a\u0004\b[\u0010%R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_R\u0019\u0010b\u001a\u0004\u0018\u00010a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR%\u0010g\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010\\8\u0006¢\u0006\u0012\n\u0004\bg\u0010_\u0012\u0004\bj\u0010k\u001a\u0004\bh\u0010iR%\u0010m\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010\\8\u0006¢\u0006\u0012\n\u0004\bm\u0010_\u0012\u0004\bo\u0010k\u001a\u0004\bn\u0010iR\u001f\u0010p\u001a\u0004\u0018\u00010&8\u0006¢\u0006\u0012\n\u0004\bp\u0010(\u0012\u0004\br\u0010k\u001a\u0004\bq\u0010*R\u001f\u0010s\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u0012\n\u0004\bs\u0010t\u0012\u0004\bw\u0010k\u001a\u0004\bu\u0010vR\u0017\u0010|\u001a\u00020x8F¢\u0006\f\u0012\u0004\b{\u0010k\u001a\u0004\by\u0010zR\u0019\u0010\u0081\u0001\u001a\u00020}8F¢\u0006\r\u0012\u0005\b\u0080\u0001\u0010k\u001a\u0004\b~\u0010\u007f¨\u0006\u0084\u0001"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/ExerciseSession;", "Landroid/os/Parcelable;", "", "getDataSize$SDK_clientRelease", "()I", "getDataSize", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/time/Instant;", "startTime", "Ljava/time/Instant;", "getStartTime", "()Ljava/time/Instant;", "endTime", "getEndTime", "Ljava/time/Duration;", "duration", "Ljava/time/Duration;", "getDuration", "()Ljava/time/Duration;", "exerciseTypeOrdinal", "I", "", "customTitle", "Ljava/lang/String;", "getCustomTitle", "()Ljava/lang/String;", "", "distance", "Ljava/lang/Float;", "getDistance", "()Ljava/lang/Float;", "calories", "F", "getCalories", "()F", "altitudeGain", "getAltitudeGain", "altitudeLoss", "getAltitudeLoss", "count", "Ljava/lang/Integer;", "getCount", "()Ljava/lang/Integer;", "countTypeOrdinal", "maxSpeed", "getMaxSpeed", "meanSpeed", "getMeanSpeed", "maxCalorieBurnRate", "getMaxCalorieBurnRate", "meanCalorieBurnRate", "getMeanCalorieBurnRate", "maxCadence", "getMaxCadence", "meanCadence", "getMeanCadence", "maxHeartRate", "getMaxHeartRate", "meanHeartRate", "getMeanHeartRate", "minHeartRate", "getMinHeartRate", "maxAltitude", "getMaxAltitude", "minAltitude", "getMinAltitude", "inclineDistance", "getInclineDistance", "declineDistance", "getDeclineDistance", "maxPower", "getMaxPower", "meanPower", "getMeanPower", "maxRpm", "getMaxRpm", "meanRpm", "getMeanRpm", "comment", "getComment", "", "", "routeByteList", "Ljava/util/List;", "logByteList", "Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog;", "swimmingLog", "Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog;", "getSwimmingLog", "()Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog;", "Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLocation;", "route", "getRoute", "()Ljava/util/List;", "getRoute$annotations", "()V", "Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLog;", "log", "getLog", "getLog$annotations", "vo2Max", "getVo2Max", "getVo2Max$annotations", "autoDetected", "Ljava/lang/Boolean;", "getAutoDetected", "()Ljava/lang/Boolean;", "getAutoDetected$annotations", "Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$PredefinedExerciseType;", "getExerciseType", "()Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$PredefinedExerciseType;", "getExerciseType$annotations", "exerciseType", "Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$CountType;", "getCountType", "()Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$CountType;", "getCountType$annotations", "countType", "Companion", "Builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ExerciseSession implements Parcelable {
    private final Float altitudeGain;
    private final Float altitudeLoss;
    private final Boolean autoDetected;
    private final float calories;
    private final String comment;
    private final Integer count;
    private final Integer countTypeOrdinal;
    private final String customTitle;
    private final Float declineDistance;
    private final Float distance;
    private final Duration duration;
    private final Instant endTime;
    private final int exerciseTypeOrdinal;
    private final Float inclineDistance;
    private final List<ExerciseLog> log;
    private final List<byte[]> logByteList;
    private final Float maxAltitude;
    private final Float maxCadence;
    private final Float maxCalorieBurnRate;
    private final Float maxHeartRate;
    private final Float maxPower;
    private final Float maxRpm;
    private final Float maxSpeed;
    private final Float meanCadence;
    private final Float meanCalorieBurnRate;
    private final Float meanHeartRate;
    private final Float meanPower;
    private final Float meanRpm;
    private final Float meanSpeed;
    private final Float minAltitude;
    private final Float minHeartRate;
    private final List<ExerciseLocation> route;
    private final List<byte[]> routeByteList;
    private final Instant startTime;
    private final SwimmingLog swimmingLog;
    private final Float vo2Max;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ExerciseSession> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0006\u00105\u001a\u000206J\u0015\u00107\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u00109\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010;\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0015\u0010<\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010@J\u0010\u0010A\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\fJ\u0015\u0010B\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010C\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010E\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020HJ\u0015\u0010I\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0014\u0010J\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0015\u0010K\u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010L\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010M\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010N\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010O\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010P\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010Q\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010R\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010S\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010T\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010U\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010V\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010W\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010X\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0015\u0010Y\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108J\u0014\u0010Z\u001a\u00020\u00002\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001bJ\u000e\u0010[\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0017J\u0010\u0010\\\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u000103J\u0015\u0010]\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u00108R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010 \u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010!\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010#\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010$\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010%\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010&\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010'\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010(\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010)\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010*\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010+\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010,\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010-\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00104\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006^"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/ExerciseSession$Builder;", "", "()V", "altitudeGain", "", "Ljava/lang/Float;", "altitudeLoss", "autoDetected", "", "Ljava/lang/Boolean;", "calories", "comment", "", "count", "", "Ljava/lang/Integer;", "countTypeOrdinal", "customTitle", "declineDistance", "distance", "duration", "Ljava/time/Duration;", "endTime", "Ljava/time/Instant;", "exerciseTypeOrdinal", "inclineDistance", "log", "", "Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLog;", "logByteList", "", "maxAltitude", "maxCadence", "maxCalorieBurnRate", "maxHeartRate", "maxPower", "maxRPM", "maxSpeed", "meanCadence", "meanCalorieBurnRate", "meanHeartRate", "meanPower", "meanRPM", "meanSpeed", "minAltitude", "minHeartRate", "route", "Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLocation;", "routeByteList", "startTime", "swimmingLog", "Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog;", "vo2Max", "build", "Lcom/samsung/android/sdk/health/data/data/entries/ExerciseSession;", "setAltitudeGain", "(Ljava/lang/Float;)Lcom/samsung/android/sdk/health/data/data/entries/ExerciseSession$Builder;", "setAltitudeLoss", "setCalories", "setComment", "setCount", "(Ljava/lang/Integer;)Lcom/samsung/android/sdk/health/data/data/entries/ExerciseSession$Builder;", "setCountType", "countType", "Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$CountType;", "setCustomTitle", "setDeclineDistance", "setDistance", "setDuration", "setEndTime", "setExerciseType", "exerciseType", "Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$PredefinedExerciseType;", "setInclineDistance", "setLog", "setMaxAltitude", "setMaxCadence", "setMaxCalorieBurnRate", "setMaxHeartRate", "setMaxPower", "setMaxRPM", "setMaxSpeed", "setMeanCadence", "setMeanCalorieBurnRate", "setMeanHeartRate", "setMeanPower", "setMeanRPM", "setMeanSpeed", "setMinAltitude", "setMinHeartRate", "setRoute", "setStartTime", "setSwimmingLog", "setVo2Max", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private Float altitudeGain;
        private Float altitudeLoss;
        private Boolean autoDetected;
        private Float calories;
        private String comment;
        private Integer count;
        private Integer countTypeOrdinal;
        private String customTitle;
        private Float declineDistance;
        private Float distance;
        private Duration duration;
        private Instant endTime;
        private Integer exerciseTypeOrdinal;
        private Float inclineDistance;
        private List<ExerciseLog> log;
        private Float maxAltitude;
        private Float maxCadence;
        private Float maxCalorieBurnRate;
        private Float maxHeartRate;
        private Float maxPower;
        private Float maxRPM;
        private Float maxSpeed;
        private Float meanCadence;
        private Float meanCalorieBurnRate;
        private Float meanHeartRate;
        private Float meanPower;
        private Float meanRPM;
        private Float meanSpeed;
        private Float minAltitude;
        private Float minHeartRate;
        private List<ExerciseLocation> route;
        private Instant startTime;
        private SwimmingLog swimmingLog;
        private Float vo2Max;
        private List<byte[]> routeByteList = CollectionsKt.emptyList();
        private List<byte[]> logByteList = CollectionsKt.emptyList();

        public final ExerciseSession build() {
            Instant instant = this.startTime;
            Instant instant2 = this.endTime;
            if (instant == null) {
                throw new InvalidRequestException(1001, "Start time must be set");
            }
            if (instant2 == null) {
                throw new InvalidRequestException(1001, "End time must be set");
            }
            if (instant.compareTo(instant2) > 0) {
                throw new InvalidRequestException(1001, "End time can not be less than start time");
            }
            if (this.duration == null || this.exerciseTypeOrdinal == null || this.calories == null) {
                throw new InvalidRequestException(1001, "All mandatory fields must be set");
            }
            Instant instant3 = this.startTime;
            Intrinsics.checkNotNull(instant3);
            Instant instant4 = this.endTime;
            Intrinsics.checkNotNull(instant4);
            Duration duration = this.duration;
            Intrinsics.checkNotNull(duration);
            Integer num = this.exerciseTypeOrdinal;
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            String str = this.customTitle;
            Float f = this.distance;
            Float f2 = this.calories;
            Intrinsics.checkNotNull(f2);
            return new ExerciseSession(instant3, instant4, duration, intValue, str, f, f2.floatValue(), this.altitudeGain, this.altitudeLoss, this.count, this.countTypeOrdinal, this.maxSpeed, this.meanSpeed, this.maxCalorieBurnRate, this.meanCalorieBurnRate, this.maxCadence, this.meanCadence, this.maxHeartRate, this.meanHeartRate, this.minHeartRate, this.maxAltitude, this.minAltitude, this.inclineDistance, this.declineDistance, this.maxPower, this.meanPower, this.maxRPM, this.meanRPM, this.comment, this.routeByteList, this.logByteList, this.swimmingLog, this.route, this.log, this.vo2Max, this.autoDetected, null);
        }

        public final Builder setAltitudeGain(Float altitudeGain) {
            this.altitudeGain = altitudeGain;
            return this;
        }

        public final Builder setAltitudeLoss(Float altitudeLoss) {
            this.altitudeLoss = altitudeLoss;
            return this;
        }

        public final Builder setCalories(float calories) {
            this.calories = Float.valueOf(calories);
            return this;
        }

        public final Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public final Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        public final Builder setCountType(DataType.ExerciseType.CountType countType) {
            if (countType != null && countType.ordinal() == 0) {
                throw new InvalidRequestException(1001, "The enum value should not be of undefined type. It needs to be explicitly specified");
            }
            this.countTypeOrdinal = countType != null ? Integer.valueOf(countType.ordinal()) : null;
            return this;
        }

        public final Builder setCustomTitle(String customTitle) {
            this.customTitle = customTitle;
            return this;
        }

        public final Builder setDeclineDistance(Float declineDistance) {
            this.declineDistance = declineDistance;
            return this;
        }

        public final Builder setDistance(Float distance) {
            this.distance = distance;
            return this;
        }

        public final Builder setDuration(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.duration = duration;
            return this;
        }

        public final Builder setEndTime(Instant endTime) {
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            this.endTime = endTime;
            return this;
        }

        public final Builder setExerciseType(DataType.ExerciseType.PredefinedExerciseType exerciseType) {
            Intrinsics.checkNotNullParameter(exerciseType, "exerciseType");
            if (exerciseType != null && exerciseType.ordinal() == 0) {
                throw new InvalidRequestException(1001, "The enum value should not be of undefined type. It needs to be explicitly specified");
            }
            this.exerciseTypeOrdinal = exerciseType != null ? Integer.valueOf(exerciseType.ordinal()) : null;
            return this;
        }

        public final Builder setInclineDistance(Float inclineDistance) {
            this.inclineDistance = inclineDistance;
            return this;
        }

        public final Builder setLog(List<ExerciseLog> log) {
            Intrinsics.checkNotNullParameter(log, "log");
            this.log = log;
            return this;
        }

        public final Builder setMaxAltitude(Float maxAltitude) {
            this.maxAltitude = maxAltitude;
            return this;
        }

        public final Builder setMaxCadence(Float maxCadence) {
            this.maxCadence = maxCadence;
            return this;
        }

        public final Builder setMaxCalorieBurnRate(Float maxCalorieBurnRate) {
            this.maxCalorieBurnRate = maxCalorieBurnRate;
            return this;
        }

        public final Builder setMaxHeartRate(Float maxHeartRate) {
            this.maxHeartRate = maxHeartRate;
            return this;
        }

        public final Builder setMaxPower(Float maxPower) {
            this.maxPower = maxPower;
            return this;
        }

        public final Builder setMaxRPM(Float maxRPM) {
            this.maxRPM = maxRPM;
            return this;
        }

        public final Builder setMaxSpeed(Float maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public final Builder setMeanCadence(Float meanCadence) {
            this.meanCadence = meanCadence;
            return this;
        }

        public final Builder setMeanCalorieBurnRate(Float meanCalorieBurnRate) {
            this.meanCalorieBurnRate = meanCalorieBurnRate;
            return this;
        }

        public final Builder setMeanHeartRate(Float meanHeartRate) {
            this.meanHeartRate = meanHeartRate;
            return this;
        }

        public final Builder setMeanPower(Float meanPower) {
            this.meanPower = meanPower;
            return this;
        }

        public final Builder setMeanRPM(Float meanRPM) {
            this.meanRPM = meanRPM;
            return this;
        }

        public final Builder setMeanSpeed(Float meanSpeed) {
            this.meanSpeed = meanSpeed;
            return this;
        }

        public final Builder setMinAltitude(Float minAltitude) {
            this.minAltitude = minAltitude;
            return this;
        }

        public final Builder setMinHeartRate(Float minHeartRate) {
            this.minHeartRate = minHeartRate;
            return this;
        }

        public final Builder setRoute(List<ExerciseLocation> route) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.route = route;
            return this;
        }

        public final Builder setStartTime(Instant startTime) {
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            this.startTime = startTime;
            return this;
        }

        public final Builder setSwimmingLog(SwimmingLog swimmingLog) {
            this.swimmingLog = swimmingLog;
            return this;
        }

        public final Builder setVo2Max(Float vo2Max) {
            this.vo2Max = vo2Max;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/ExerciseSession$Companion;", "", "Lcom/samsung/android/sdk/health/data/data/entries/ExerciseSession$Builder;", "builder", "()Lcom/samsung/android/sdk/health/data/data/entries/ExerciseSession$Builder;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExerciseSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExerciseSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Instant instant = (Instant) parcel.readSerializable();
            Instant instant2 = (Instant) parcel.readSerializable();
            Duration duration = (Duration) parcel.readSerializable();
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            float readFloat = parcel.readFloat();
            Float valueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf3 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Float valueOf6 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf7 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf8 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf9 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf10 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf11 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf12 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf13 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf14 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf15 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf16 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf17 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf18 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf19 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf20 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf21 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float valueOf22 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            Float f = valueOf7;
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                arrayList.add(parcel.createByteArray());
                i++;
                readInt2 = readInt2;
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                arrayList2.add(parcel.createByteArray());
                i2++;
                readInt3 = readInt3;
            }
            return new ExerciseSession(instant, instant2, duration, readInt, readString, valueOf, readFloat, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, f, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, readString2, arrayList, arrayList2, parcel.readInt() == 0 ? null : SwimmingLog.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExerciseSession[] newArray(int i) {
            return new ExerciseSession[i];
        }
    }

    public /* synthetic */ ExerciseSession(Instant instant, Instant instant2, Duration duration, int i, String str, Float f, float f2, Float f3, Float f4, Integer num, Integer num2, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f21, String str2, List list, List list2, SwimmingLog swimmingLog, List list3, List list4, Float f22, Boolean bool, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, instant2, duration, i, str, f, f2, f3, f4, num, num2, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, str2, list, list2, swimmingLog, list3, list4, f22, bool);
    }

    public static /* synthetic */ void getAutoDetected$annotations() {
    }

    public static /* synthetic */ void getCountType$annotations() {
    }

    public static /* synthetic */ void getExerciseType$annotations() {
    }

    public static /* synthetic */ void getLog$annotations() {
    }

    public static /* synthetic */ void getRoute$annotations() {
    }

    public static /* synthetic */ void getVo2Max$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(ExerciseSession.class, other.getClass())) {
            return false;
        }
        ExerciseSession exerciseSession = (ExerciseSession) other;
        return Intrinsics.areEqual(this.startTime, exerciseSession.startTime) && Intrinsics.areEqual(this.endTime, exerciseSession.endTime) && Intrinsics.areEqual(this.duration, exerciseSession.duration) && getExerciseType() == exerciseSession.getExerciseType() && Intrinsics.areEqual(this.customTitle, exerciseSession.customTitle) && Intrinsics.areEqual(this.distance, exerciseSession.distance) && this.calories == exerciseSession.calories && Intrinsics.areEqual(this.altitudeGain, exerciseSession.altitudeGain) && Intrinsics.areEqual(this.altitudeLoss, exerciseSession.altitudeLoss) && Intrinsics.areEqual(this.count, exerciseSession.count) && getCountType() == exerciseSession.getCountType() && Intrinsics.areEqual(this.maxSpeed, exerciseSession.maxSpeed) && Intrinsics.areEqual(this.meanSpeed, exerciseSession.meanSpeed) && Intrinsics.areEqual(this.maxCalorieBurnRate, exerciseSession.maxCalorieBurnRate) && Intrinsics.areEqual(this.meanCalorieBurnRate, exerciseSession.meanCalorieBurnRate) && Intrinsics.areEqual(this.maxCadence, exerciseSession.maxCadence) && Intrinsics.areEqual(this.meanCadence, exerciseSession.meanCadence) && Intrinsics.areEqual(this.maxHeartRate, exerciseSession.maxHeartRate) && Intrinsics.areEqual(this.meanHeartRate, exerciseSession.meanHeartRate) && Intrinsics.areEqual(this.minHeartRate, exerciseSession.minHeartRate) && Intrinsics.areEqual(this.maxAltitude, exerciseSession.maxAltitude) && Intrinsics.areEqual(this.minAltitude, exerciseSession.minAltitude) && Intrinsics.areEqual(this.inclineDistance, exerciseSession.inclineDistance) && Intrinsics.areEqual(this.declineDistance, exerciseSession.declineDistance) && Intrinsics.areEqual(this.maxPower, exerciseSession.maxPower) && Intrinsics.areEqual(this.meanPower, exerciseSession.meanPower) && Intrinsics.areEqual(this.maxRpm, exerciseSession.maxRpm) && Intrinsics.areEqual(this.meanRpm, exerciseSession.meanRpm) && Intrinsics.areEqual(this.comment, exerciseSession.comment) && Intrinsics.areEqual(this.route, exerciseSession.route) && Intrinsics.areEqual(this.log, exerciseSession.log) && Intrinsics.areEqual(this.swimmingLog, exerciseSession.swimmingLog) && Intrinsics.areEqual(this.vo2Max, exerciseSession.vo2Max) && Intrinsics.areEqual(this.autoDetected, exerciseSession.autoDetected);
    }

    public final Float getAltitudeGain() {
        return this.altitudeGain;
    }

    public final Float getAltitudeLoss() {
        return this.altitudeLoss;
    }

    public final Boolean getAutoDetected() {
        return this.autoDetected;
    }

    public final float getCalories() {
        return this.calories;
    }

    public final String getComment() {
        return this.comment;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final DataType.ExerciseType.CountType getCountType() {
        Enum r3;
        Integer num = this.countTypeOrdinal;
        int intValue = num != null ? num.intValue() : 0;
        Enum[] enumConstants = (Enum[]) DataType.ExerciseType.CountType.class.getEnumConstants();
        if (enumConstants != null) {
            Intrinsics.checkNotNullExpressionValue(enumConstants, "enumConstants");
            r3 = (intValue <= 0 || intValue >= enumConstants.length) ? enumConstants[0] : enumConstants[intValue];
        } else {
            r3 = null;
        }
        DataType.ExerciseType.CountType countType = (DataType.ExerciseType.CountType) r3;
        return countType == null ? DataType.ExerciseType.CountType.UNDEFINED : countType;
    }

    public final String getCustomTitle() {
        return this.customTitle;
    }

    public final int getDataSize$SDK_clientRelease() {
        Iterator<T> it = this.routeByteList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((byte[]) it.next()).length;
        }
        Iterator<T> it2 = this.logByteList.iterator();
        while (it2.hasNext()) {
            i += ((byte[]) it2.next()).length;
        }
        return i;
    }

    public final Float getDeclineDistance() {
        return this.declineDistance;
    }

    public final Float getDistance() {
        return this.distance;
    }

    public final Duration getDuration() {
        return this.duration;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final DataType.ExerciseType.PredefinedExerciseType getExerciseType() {
        Enum r2;
        int i = this.exerciseTypeOrdinal;
        Enum[] enumConstants = (Enum[]) DataType.ExerciseType.PredefinedExerciseType.class.getEnumConstants();
        if (enumConstants != null) {
            Intrinsics.checkNotNullExpressionValue(enumConstants, "enumConstants");
            r2 = (i <= 0 || i >= enumConstants.length) ? enumConstants[0] : enumConstants[i];
        } else {
            r2 = null;
        }
        DataType.ExerciseType.PredefinedExerciseType predefinedExerciseType = (DataType.ExerciseType.PredefinedExerciseType) r2;
        return predefinedExerciseType == null ? DataType.ExerciseType.PredefinedExerciseType.UNDEFINED : predefinedExerciseType;
    }

    public final Float getInclineDistance() {
        return this.inclineDistance;
    }

    public final List<ExerciseLog> getLog() {
        return this.log;
    }

    public final Float getMaxAltitude() {
        return this.maxAltitude;
    }

    public final Float getMaxCadence() {
        return this.maxCadence;
    }

    public final Float getMaxCalorieBurnRate() {
        return this.maxCalorieBurnRate;
    }

    public final Float getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final Float getMaxPower() {
        return this.maxPower;
    }

    public final Float getMaxRpm() {
        return this.maxRpm;
    }

    public final Float getMaxSpeed() {
        return this.maxSpeed;
    }

    public final Float getMeanCadence() {
        return this.meanCadence;
    }

    public final Float getMeanCalorieBurnRate() {
        return this.meanCalorieBurnRate;
    }

    public final Float getMeanHeartRate() {
        return this.meanHeartRate;
    }

    public final Float getMeanPower() {
        return this.meanPower;
    }

    public final Float getMeanRpm() {
        return this.meanRpm;
    }

    public final Float getMeanSpeed() {
        return this.meanSpeed;
    }

    public final Float getMinAltitude() {
        return this.minAltitude;
    }

    public final Float getMinHeartRate() {
        return this.minHeartRate;
    }

    public final List<ExerciseLocation> getRoute() {
        return this.route;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final SwimmingLog getSwimmingLog() {
        return this.swimmingLog;
    }

    public final Float getVo2Max() {
        return this.vo2Max;
    }

    public int hashCode() {
        return Objects.hash(this.startTime, this.endTime, this.duration, getExerciseType(), this.customTitle, this.distance, Float.valueOf(this.calories), this.altitudeGain, this.altitudeLoss, this.count, getCountType(), this.maxSpeed, this.meanSpeed, this.maxCalorieBurnRate, this.meanCalorieBurnRate, this.maxCadence, this.meanCadence, this.maxHeartRate, this.meanHeartRate, this.minHeartRate, this.maxAltitude, this.minAltitude, this.inclineDistance, this.declineDistance, this.maxPower, this.meanPower, this.maxRpm, this.meanRpm, this.comment, this.route, this.log, this.swimmingLog, this.vo2Max, this.autoDetected);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeSerializable(this.startTime);
        parcel.writeSerializable(this.endTime);
        parcel.writeSerializable(this.duration);
        parcel.writeInt(this.exerciseTypeOrdinal);
        parcel.writeString(this.customTitle);
        Float f = this.distance;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f);
        }
        parcel.writeFloat(this.calories);
        Float f2 = this.altitudeGain;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f2);
        }
        Float f3 = this.altitudeLoss;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f3);
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.countTypeOrdinal;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Float f4 = this.maxSpeed;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f4);
        }
        Float f5 = this.meanSpeed;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f5);
        }
        Float f6 = this.maxCalorieBurnRate;
        if (f6 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f6);
        }
        Float f7 = this.meanCalorieBurnRate;
        if (f7 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f7);
        }
        Float f8 = this.maxCadence;
        if (f8 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f8);
        }
        Float f9 = this.meanCadence;
        if (f9 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f9);
        }
        Float f10 = this.maxHeartRate;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f10);
        }
        Float f11 = this.meanHeartRate;
        if (f11 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f11);
        }
        Float f12 = this.minHeartRate;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f12);
        }
        Float f13 = this.maxAltitude;
        if (f13 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f13);
        }
        Float f14 = this.minAltitude;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f14);
        }
        Float f15 = this.inclineDistance;
        if (f15 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f15);
        }
        Float f16 = this.declineDistance;
        if (f16 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f16);
        }
        Float f17 = this.maxPower;
        if (f17 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f17);
        }
        Float f18 = this.meanPower;
        if (f18 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f18);
        }
        Float f19 = this.maxRpm;
        if (f19 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f19);
        }
        Float f20 = this.meanRpm;
        if (f20 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f20);
        }
        parcel.writeString(this.comment);
        List<byte[]> list = this.routeByteList;
        parcel.writeInt(list.size());
        Iterator<byte[]> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeByteArray(it.next());
        }
        List<byte[]> list2 = this.logByteList;
        parcel.writeInt(list2.size());
        Iterator<byte[]> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeByteArray(it2.next());
        }
        SwimmingLog swimmingLog = this.swimmingLog;
        if (swimmingLog == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            swimmingLog.writeToParcel(parcel, flags);
        }
    }

    private ExerciseSession(Instant instant, Instant instant2, Duration duration, int i, String str, Float f, float f2, Float f3, Float f4, Integer num, Integer num2, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f21, String str2, List list, List list2, SwimmingLog swimmingLog, List list3, List list4, Float f22, Boolean bool) {
        this.startTime = instant;
        this.endTime = instant2;
        this.duration = duration;
        this.exerciseTypeOrdinal = i;
        this.customTitle = str;
        this.distance = f;
        this.calories = f2;
        this.altitudeGain = f3;
        this.altitudeLoss = f4;
        this.count = num;
        this.countTypeOrdinal = num2;
        this.maxSpeed = f5;
        this.meanSpeed = f6;
        this.maxCalorieBurnRate = f7;
        this.meanCalorieBurnRate = f8;
        this.maxCadence = f9;
        this.meanCadence = f10;
        this.maxHeartRate = f11;
        this.meanHeartRate = f12;
        this.minHeartRate = f13;
        this.maxAltitude = f14;
        this.minAltitude = f15;
        this.inclineDistance = f16;
        this.declineDistance = f17;
        this.maxPower = f18;
        this.meanPower = f19;
        this.maxRpm = f20;
        this.meanRpm = f21;
        this.comment = str2;
        this.routeByteList = list;
        this.logByteList = list2;
        this.swimmingLog = swimmingLog;
        this.route = list3;
        this.log = list4;
        this.vo2Max = f22;
        this.autoDetected = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ ExerciseSession(Instant instant, Instant instant2, Duration duration, int i, String str, Float f, float f2, Float f3, Float f4, Integer num, Integer num2, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, Float f18, Float f19, Float f20, Float f21, String str2, ArrayList arrayList, ArrayList arrayList2, SwimmingLog swimmingLog) {
        this(instant, instant2, duration, i, str, f, f2, f3, f4, num, num2, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, str2, arrayList, arrayList2, swimmingLog, r40, r41, null, null);
        ArrayList arrayList3;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        InputStreamReader inputStreamReader;
        Gson gson;
        ArrayList arrayList4;
        Gson gson2;
        Gson gson3 = e.a;
        try {
            if (arrayList.isEmpty()) {
                arrayList3 = null;
            } else {
                ArrayList arrayList5 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byteArrayInputStream = new ByteArrayInputStream((byte[]) it.next());
                    try {
                        gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        try {
                            inputStreamReader = new InputStreamReader(gZIPInputStream);
                            try {
                                d a = e.a(ExerciseLocation.class);
                                gson = e.a;
                                List list = (List) gson.fromJson(inputStreamReader, a);
                                if (list != null) {
                                    Intrinsics.checkNotNullExpressionValue(list, "fromJson<List<T>>(reader, listTypeOfT)");
                                    arrayList5.addAll(list);
                                    Unit unit = Unit.INSTANCE;
                                }
                                Unit unit2 = Unit.INSTANCE;
                                CloseableKt.closeFinally(inputStreamReader, null);
                                CloseableKt.closeFinally(gZIPInputStream, null);
                                CloseableKt.closeFinally(byteArrayInputStream, null);
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                arrayList3 = arrayList5;
            }
            Gson gson4 = e.a;
            try {
                if (arrayList2.isEmpty()) {
                    arrayList4 = null;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        byteArrayInputStream = new ByteArrayInputStream((byte[]) it2.next());
                        try {
                            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                            try {
                                inputStreamReader = new InputStreamReader(gZIPInputStream);
                                try {
                                    d a2 = e.a(ExerciseLog.class);
                                    gson2 = e.a;
                                    List list2 = (List) gson2.fromJson(inputStreamReader, a2);
                                    if (list2 != null) {
                                        Intrinsics.checkNotNullExpressionValue(list2, "fromJson<List<T>>(reader, listTypeOfT)");
                                        arrayList6.addAll(list2);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    Unit unit4 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(inputStreamReader, null);
                                    CloseableKt.closeFinally(gZIPInputStream, null);
                                    CloseableKt.closeFinally(byteArrayInputStream, null);
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    arrayList4 = arrayList6;
                }
            } catch (JsonIOException e) {
                throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), String.valueOf(e.getMessage()), null, 4, null);
            } catch (JsonSyntaxException unused) {
                throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), "Json blob is invalid. It should be a JSON compressed by Zip.", null, 4, null);
            } catch (ZipException unused2) {
                throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), "Json blob is invalid. It should be a JSON compressed by Zip.", null, 4, null);
            } catch (IOException e2) {
                throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), String.valueOf(e2.getMessage()), null, 4, null);
            }
        } catch (JsonIOException e3) {
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), String.valueOf(e3.getMessage()), null, 4, null);
        } catch (JsonSyntaxException unused3) {
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), "Json blob is invalid. It should be a JSON compressed by Zip.", null, 4, null);
        } catch (ZipException unused4) {
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), "Json blob is invalid. It should be a JSON compressed by Zip.", null, 4, null);
        } catch (IOException e4) {
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), String.valueOf(e4.getMessage()), null, 4, null);
        }
    }
}
