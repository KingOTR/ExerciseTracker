package com.example.rungps.sleep;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import androidx.core.content.ContextCompat;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.gym.AmbientSessionTagger;
import com.example.rungps.sleep.SleepCalendarHelper;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepCalendarHelper.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003,-.B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J$\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ2\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J(\u0010 \u001a\u0004\u0018\u00010\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J$\u0010!\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ,\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010#JA\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b(J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rR\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006/"}, d2 = {"Lcom/example/rungps/sleep/SleepCalendarHelper;", "", "<init>", "()V", "hasPermission", "", "context", "Landroid/content/Context;", "earliestTomorrowMorning", "Lcom/example/rungps/sleep/SleepCalendarHelper$MorningCommitment;", "travelBufferMin", "", "zone", "Ljava/time/ZoneId;", "commitment", "Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult;", "getCommitment", "(Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult;)Lcom/example/rungps/sleep/SleepCalendarHelper$MorningCommitment;", "tomorrowRange", "Lkotlin/Triple;", "Ljava/time/LocalDate;", "", "wakeAnchorWindow", "Lkotlin/Pair;", "queryTomorrowMorning", "enrichWithAllTimedEvents", "anchor", "events", "", "Lcom/example/rungps/sleep/SleepCalendarHelper$TomorrowEvent;", "timeFmt", "Ljava/time/format/DateTimeFormatter;", "buildAllDayListing", "resolveTomorrowCommitment", "resolveTomorrowCommitmentAsync", "(Landroid/content/Context;ILjava/time/ZoneId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeTomorrowCommitments", "google", "device", "manual", "mergeTomorrowCommitments$app_sideload", "formatCommitment", "", "c", "MorningCommitment", "QueryResult", "TomorrowEvent", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepCalendarHelper {
    public static final int $stable = 0;
    public static final SleepCalendarHelper INSTANCE = new SleepCalendarHelper();

    private SleepCalendarHelper() {
    }

    /* compiled from: SleepCalendarHelper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\bHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/example/rungps/sleep/SleepCalendarHelper$MorningCommitment;", "", "title", "", "startMs", "", "location", "bufferMin", "", "travelDetail", "allDayEvents", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getStartMs", "()J", "getLocation", "getBufferMin", "()I", "getTravelDetail", "getAllDayEvents", "()Ljava/util/List;", "wakeByMs", "getReadyMin", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MorningCommitment {
        public static final int $stable = 8;
        private final List<String> allDayEvents;
        private final int bufferMin;
        private final String location;
        private final long startMs;
        private final String title;
        private final String travelDetail;

        public static /* synthetic */ MorningCommitment copy$default(MorningCommitment morningCommitment, String str, long j, String str2, int i, String str3, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = morningCommitment.title;
            }
            if ((i2 & 2) != 0) {
                j = morningCommitment.startMs;
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                str2 = morningCommitment.location;
            }
            String str4 = str2;
            if ((i2 & 8) != 0) {
                i = morningCommitment.bufferMin;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                str3 = morningCommitment.travelDetail;
            }
            String str5 = str3;
            if ((i2 & 32) != 0) {
                list = morningCommitment.allDayEvents;
            }
            return morningCommitment.copy(str, j2, str4, i3, str5, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartMs() {
            return this.startMs;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* renamed from: component4, reason: from getter */
        public final int getBufferMin() {
            return this.bufferMin;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTravelDetail() {
            return this.travelDetail;
        }

        public final List<String> component6() {
            return this.allDayEvents;
        }

        public final MorningCommitment copy(String title, long startMs, String location, int bufferMin, String travelDetail, List<String> allDayEvents) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(allDayEvents, "allDayEvents");
            return new MorningCommitment(title, startMs, location, bufferMin, travelDetail, allDayEvents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MorningCommitment)) {
                return false;
            }
            MorningCommitment morningCommitment = (MorningCommitment) other;
            return Intrinsics.areEqual(this.title, morningCommitment.title) && this.startMs == morningCommitment.startMs && Intrinsics.areEqual(this.location, morningCommitment.location) && this.bufferMin == morningCommitment.bufferMin && Intrinsics.areEqual(this.travelDetail, morningCommitment.travelDetail) && Intrinsics.areEqual(this.allDayEvents, morningCommitment.allDayEvents);
        }

        public int hashCode() {
            int hashCode = ((this.title.hashCode() * 31) + Long.hashCode(this.startMs)) * 31;
            String str = this.location;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.bufferMin)) * 31;
            String str2 = this.travelDetail;
            return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.allDayEvents.hashCode();
        }

        public String toString() {
            return "MorningCommitment(title=" + this.title + ", startMs=" + this.startMs + ", location=" + this.location + ", bufferMin=" + this.bufferMin + ", travelDetail=" + this.travelDetail + ", allDayEvents=" + this.allDayEvents + ")";
        }

        public MorningCommitment(String title, long j, String str, int i, String str2, List<String> allDayEvents) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(allDayEvents, "allDayEvents");
            this.title = title;
            this.startMs = j;
            this.location = str;
            this.bufferMin = i;
            this.travelDetail = str2;
            this.allDayEvents = allDayEvents;
        }

        public final String getTitle() {
            return this.title;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        public final String getLocation() {
            return this.location;
        }

        public final int getBufferMin() {
            return this.bufferMin;
        }

        public final String getTravelDetail() {
            return this.travelDetail;
        }

        public /* synthetic */ MorningCommitment(String str, long j, String str2, int i, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j, str2, i, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<String> getAllDayEvents() {
            return this.allDayEvents;
        }

        public static /* synthetic */ long wakeByMs$default(MorningCommitment morningCommitment, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 15;
            }
            return morningCommitment.wakeByMs(i);
        }

        public final long wakeByMs(int getReadyMin) {
            return this.startMs - ((this.bufferMin + getReadyMin) * 60000);
        }
    }

    public final boolean hasPermission(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextCompat.checkSelfPermission(context, "android.permission.READ_CALENDAR") == 0;
    }

    public static /* synthetic */ MorningCommitment earliestTomorrowMorning$default(SleepCalendarHelper sleepCalendarHelper, Context context, int i, ZoneId zoneId, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 30;
        }
        if ((i2 & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCalendarHelper.earliestTomorrowMorning(context, i, zoneId);
    }

    public final MorningCommitment earliestTomorrowMorning(Context context, int travelBufferMin, ZoneId zone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zone, "zone");
        QueryResult queryTomorrowMorning = queryTomorrowMorning(context, travelBufferMin, zone);
        if (queryTomorrowMorning instanceof QueryResult.Success) {
            return ((QueryResult.Success) queryTomorrowMorning).getCommitment();
        }
        return null;
    }

    public final MorningCommitment getCommitment(QueryResult queryResult) {
        Intrinsics.checkNotNullParameter(queryResult, "<this>");
        QueryResult.Success success = queryResult instanceof QueryResult.Success ? (QueryResult.Success) queryResult : null;
        if (success != null) {
            return success.getCommitment();
        }
        return null;
    }

    /* compiled from: SleepCalendarHelper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult;", "", "<init>", "()V", "Success", "Error", "NoPermission", "Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult$Error;", "Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult$NoPermission;", "Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult$Success;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class QueryResult {
        public static final int $stable = 0;

        public /* synthetic */ QueryResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private QueryResult() {
        }

        /* compiled from: SleepCalendarHelper.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult$Success;", "Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult;", "commitment", "Lcom/example/rungps/sleep/SleepCalendarHelper$MorningCommitment;", "<init>", "(Lcom/example/rungps/sleep/SleepCalendarHelper$MorningCommitment;)V", "getCommitment", "()Lcom/example/rungps/sleep/SleepCalendarHelper$MorningCommitment;", "component1", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends QueryResult {
            public static final int $stable = 8;
            private final MorningCommitment commitment;

            public static /* synthetic */ Success copy$default(Success success, MorningCommitment morningCommitment, int i, Object obj) {
                if ((i & 1) != 0) {
                    morningCommitment = success.commitment;
                }
                return success.copy(morningCommitment);
            }

            /* renamed from: component1, reason: from getter */
            public final MorningCommitment getCommitment() {
                return this.commitment;
            }

            public final Success copy(MorningCommitment commitment) {
                return new Success(commitment);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.commitment, ((Success) other).commitment);
            }

            public int hashCode() {
                MorningCommitment morningCommitment = this.commitment;
                if (morningCommitment == null) {
                    return 0;
                }
                return morningCommitment.hashCode();
            }

            public String toString() {
                return "Success(commitment=" + this.commitment + ")";
            }

            public Success(MorningCommitment morningCommitment) {
                super(null);
                this.commitment = morningCommitment;
            }

            public final MorningCommitment getCommitment() {
                return this.commitment;
            }
        }

        /* compiled from: SleepCalendarHelper.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult$Error;", "Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends QueryResult {
            public static final int $stable = 0;
            private final String message;

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Error copy(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Error(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final String getMessage() {
                return this.message;
            }
        }

        /* compiled from: SleepCalendarHelper.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult$NoPermission;", "Lcom/example/rungps/sleep/SleepCalendarHelper$QueryResult;", "<init>", "()V", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoPermission extends QueryResult {
            public static final int $stable = 0;
            public static final NoPermission INSTANCE = new NoPermission();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoPermission)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 727559289;
            }

            public String toString() {
                return "NoPermission";
            }

            private NoPermission() {
                super(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SleepCalendarHelper.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/sleep/SleepCalendarHelper$TomorrowEvent;", "", "title", "", "startMs", "", "location", "allDay", "", "<init>", "(Ljava/lang/String;JLjava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getStartMs", "()J", "getLocation", "getAllDay", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final /* data */ class TomorrowEvent {
        private final boolean allDay;
        private final String location;
        private final long startMs;
        private final String title;

        public static /* synthetic */ TomorrowEvent copy$default(TomorrowEvent tomorrowEvent, String str, long j, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tomorrowEvent.title;
            }
            if ((i & 2) != 0) {
                j = tomorrowEvent.startMs;
            }
            long j2 = j;
            if ((i & 4) != 0) {
                str2 = tomorrowEvent.location;
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                z = tomorrowEvent.allDay;
            }
            return tomorrowEvent.copy(str, j2, str3, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartMs() {
            return this.startMs;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAllDay() {
            return this.allDay;
        }

        public final TomorrowEvent copy(String title, long startMs, String location, boolean allDay) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new TomorrowEvent(title, startMs, location, allDay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TomorrowEvent)) {
                return false;
            }
            TomorrowEvent tomorrowEvent = (TomorrowEvent) other;
            return Intrinsics.areEqual(this.title, tomorrowEvent.title) && this.startMs == tomorrowEvent.startMs && Intrinsics.areEqual(this.location, tomorrowEvent.location) && this.allDay == tomorrowEvent.allDay;
        }

        public int hashCode() {
            int hashCode = ((this.title.hashCode() * 31) + Long.hashCode(this.startMs)) * 31;
            String str = this.location;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.allDay);
        }

        public String toString() {
            return "TomorrowEvent(title=" + this.title + ", startMs=" + this.startMs + ", location=" + this.location + ", allDay=" + this.allDay + ")";
        }

        public TomorrowEvent(String title, long j, String str, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.startMs = j;
            this.location = str;
            this.allDay = z;
        }

        public final String getTitle() {
            return this.title;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        public final String getLocation() {
            return this.location;
        }

        public final boolean getAllDay() {
            return this.allDay;
        }
    }

    private final Triple<LocalDate, Long, Long> tomorrowRange(ZoneId zone) {
        LocalDate plusDays = LocalDate.now(zone).plusDays(1L);
        return new Triple<>(plusDays, Long.valueOf(plusDays.atStartOfDay(zone).toInstant().toEpochMilli()), Long.valueOf(plusDays.plusDays(1L).atStartOfDay(zone).toInstant().toEpochMilli() - 1));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.time.ZonedDateTime] */
    private final Pair<Long, Long> wakeAnchorWindow(ZoneId zone) {
        LocalDate plusDays = LocalDate.now(zone).plusDays(1L);
        return TuplesKt.to(Long.valueOf(plusDays.atTime(5, 0).atZone(zone).toInstant().toEpochMilli()), Long.valueOf(plusDays.atTime(14, 0).atZone(zone).toInstant().toEpochMilli()));
    }

    public static /* synthetic */ QueryResult queryTomorrowMorning$default(SleepCalendarHelper sleepCalendarHelper, Context context, int i, ZoneId zoneId, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 30;
        }
        if ((i2 & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCalendarHelper.queryTomorrowMorning(context, i, zoneId);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0113 A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:22:0x00e2, B:23:0x00f6, B:26:0x00fe, B:29:0x0109, B:31:0x0113, B:34:0x0124, B:37:0x012e, B:39:0x0136, B:41:0x0142, B:45:0x0151, B:56:0x017c, B:58:0x0193, B:66:0x0172, B:75:0x019e), top: B:21:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0151 A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:22:0x00e2, B:23:0x00f6, B:26:0x00fe, B:29:0x0109, B:31:0x0113, B:34:0x0124, B:37:0x012e, B:39:0x0136, B:41:0x0142, B:45:0x0151, B:56:0x017c, B:58:0x0193, B:66:0x0172, B:75:0x019e), top: B:21:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172 A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:22:0x00e2, B:23:0x00f6, B:26:0x00fe, B:29:0x0109, B:31:0x0113, B:34:0x0124, B:37:0x012e, B:39:0x0136, B:41:0x0142, B:45:0x0151, B:56:0x017c, B:58:0x0193, B:66:0x0172, B:75:0x019e), top: B:21:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QueryResult queryTomorrowMorning(Context context, int travelBufferMin, ZoneId zone) {
        DateTimeFormatter dateTimeFormatter;
        String str;
        String str2;
        Object m7905constructorimpl;
        Throwable m7908exceptionOrNullimpl;
        boolean z;
        long j;
        String obj;
        String str3;
        String str4;
        String string;
        String str5;
        Cursor query;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zone, "zone");
        if (!hasPermission(context)) {
            MorningCommitment loadForPlanner = SleepCalendarManualCommitment.INSTANCE.loadForPlanner(context, zone);
            return loadForPlanner != null ? new QueryResult.Success(loadForPlanner) : QueryResult.NoPermission.INSTANCE;
        }
        Triple<LocalDate, Long, Long> triple = tomorrowRange(zone);
        long longValue = triple.component2().longValue();
        long longValue2 = triple.component3().longValue();
        Pair<Long, Long> wakeAnchorWindow = wakeAnchorWindow(zone);
        long longValue3 = wakeAnchorWindow.component1().longValue();
        long longValue4 = wakeAnchorWindow.component2().longValue();
        Uri build = CalendarContract.Instances.CONTENT_URI.buildUpon().appendPath(String.valueOf(longValue)).appendPath(String.valueOf(longValue2)).build();
        String[] strArr = {"title", "begin", "eventLocation", "allDay"};
        ArrayList arrayList = new ArrayList();
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("h:mm a");
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepCalendarHelper sleepCalendarHelper = this;
            str = "allDay";
            dateTimeFormatter = ofPattern;
            str2 = "eventLocation";
            try {
                query = context.getContentResolver().query(build, strArr, null, null, "begin ASC");
            } catch (Throwable th) {
                th = th;
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                if (m7908exceptionOrNullimpl != null) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            dateTimeFormatter = ofPattern;
            str = "allDay";
            str2 = "eventLocation";
        }
        if (query != null) {
            m7905constructorimpl = Result.m7905constructorimpl(query);
            m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
            if (m7908exceptionOrNullimpl != null) {
                Cursor cursor = (Cursor) m7905constructorimpl;
                try {
                    Cursor cursor2 = cursor;
                    int columnIndex = cursor2.getColumnIndex("title");
                    int columnIndex2 = cursor2.getColumnIndex("begin");
                    int columnIndex3 = cursor2.getColumnIndex(str2);
                    int columnIndex4 = cursor2.getColumnIndex(str);
                    MorningCommitment morningCommitment = null;
                    while (cursor2.moveToNext()) {
                        if (columnIndex4 >= 0 && cursor2.getInt(columnIndex4) == 1) {
                            z = true;
                            j = cursor2.getLong(columnIndex2);
                            String string2 = cursor2.getString(columnIndex);
                            obj = string2 == null ? StringsKt.trim((CharSequence) string2).toString() : null;
                            if (obj == null) {
                                obj = "";
                            }
                            str3 = obj;
                            if (StringsKt.isBlank(str3)) {
                                str3 = "Event";
                            }
                            str4 = str3;
                            string = cursor2.getString(columnIndex3);
                            if (string != null || (str5 = StringsKt.trim((CharSequence) string).toString()) == null || str5.length() <= 0) {
                                str5 = null;
                            }
                            if (!z) {
                                arrayList.add(new TomorrowEvent(str4, j, str5, false));
                            }
                            if (!z && longValue3 <= j && j <= longValue4) {
                                MorningCommitment morningCommitment2 = new MorningCommitment(str4, j, str5, str5 == null ? travelBufferMin : RangesKt.coerceAtLeast(travelBufferMin / 2, 15), null, null, 48, null);
                                if (morningCommitment != null || j < morningCommitment.getStartMs()) {
                                    morningCommitment = morningCommitment2;
                                }
                            }
                        }
                        z = false;
                        j = cursor2.getLong(columnIndex2);
                        String string22 = cursor2.getString(columnIndex);
                        if (string22 == null) {
                        }
                        if (obj == null) {
                        }
                        str3 = obj;
                        if (StringsKt.isBlank(str3)) {
                        }
                        str4 = str3;
                        string = cursor2.getString(columnIndex3);
                        if (string != null) {
                        }
                        str5 = null;
                        if (!z) {
                        }
                        if (!z) {
                            MorningCommitment morningCommitment22 = new MorningCommitment(str4, j, str5, str5 == null ? travelBufferMin : RangesKt.coerceAtLeast(travelBufferMin / 2, 15), null, null, 48, null);
                            if (morningCommitment != null) {
                            }
                            morningCommitment = morningCommitment22;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor, null);
                    MorningCommitment loadForPlanner2 = SleepCalendarManualCommitment.INSTANCE.loadForPlanner(context, zone);
                    SleepCalendarHelper sleepCalendarHelper2 = INSTANCE;
                    if (morningCommitment == null) {
                        morningCommitment = loadForPlanner2;
                    }
                    Intrinsics.checkNotNull(dateTimeFormatter);
                    DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
                    MorningCommitment enrichWithAllTimedEvents = sleepCalendarHelper2.enrichWithAllTimedEvents(morningCommitment, arrayList, zone, dateTimeFormatter2);
                    if (enrichWithAllTimedEvents == null) {
                        enrichWithAllTimedEvents = sleepCalendarHelper2.buildAllDayListing(arrayList, zone, dateTimeFormatter2);
                    }
                    return new QueryResult.Success(enrichWithAllTimedEvents);
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(cursor, th3);
                        throw th4;
                    }
                }
            }
            MorningCommitment loadForPlanner3 = SleepCalendarManualCommitment.INSTANCE.loadForPlanner(context, zone);
            if (loadForPlanner3 != null) {
                return new QueryResult.Success(loadForPlanner3);
            }
            String message = m7908exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Could not read calendar";
            }
            return new QueryResult.Error(message);
        }
        throw new IllegalStateException("Calendar provider returned null");
    }

    private final MorningCommitment enrichWithAllTimedEvents(MorningCommitment anchor, List<TomorrowEvent> events, ZoneId zone, DateTimeFormatter timeFmt) {
        if (anchor == null || events.isEmpty()) {
            return anchor;
        }
        List<TomorrowEvent> take = CollectionsKt.take(CollectionsKt.sortedWith(events, new Comparator() { // from class: com.example.rungps.sleep.SleepCalendarHelper$enrichWithAllTimedEvents$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SleepCalendarHelper.TomorrowEvent) t).getStartMs()), Long.valueOf(((SleepCalendarHelper.TomorrowEvent) t2).getStartMs()));
            }
        }), 8);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
        for (TomorrowEvent tomorrowEvent : take) {
            String format = Instant.ofEpochMilli(tomorrowEvent.getStartMs()).atZone(zone).format(timeFmt);
            arrayList.add((tomorrowEvent.getLocation() != null ? new StringBuilder().append(format).append(" · ").append(tomorrowEvent.getTitle()).append(" (").append(tomorrowEvent.getLocation()).append(")") : new StringBuilder().append(format).append(" · ").append(tomorrowEvent.getTitle())).toString());
        }
        ArrayList arrayList2 = arrayList;
        return MorningCommitment.copy$default(anchor, events.size() == 1 ? anchor.getTitle() : "Tomorrow · " + events.size() + " events", 0L, null, 0, CollectionsKt.joinToString$default(arrayList2, " · ", null, null, 0, null, null, 62, null), arrayList2, 14, null);
    }

    private final MorningCommitment buildAllDayListing(List<TomorrowEvent> events, ZoneId zone, DateTimeFormatter timeFmt) {
        Object next;
        if (events.isEmpty()) {
            return null;
        }
        List<TomorrowEvent> list = events;
        List<TomorrowEvent> take = CollectionsKt.take(list, 6);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
        for (TomorrowEvent tomorrowEvent : take) {
            String format = Instant.ofEpochMilli(tomorrowEvent.getStartMs()).atZone(zone).format(timeFmt);
            arrayList.add((tomorrowEvent.getLocation() != null ? new StringBuilder().append(format).append(" · ").append(tomorrowEvent.getTitle()).append(" (").append(tomorrowEvent.getLocation()).append(")") : new StringBuilder().append(format).append(" · ").append(tomorrowEvent.getTitle())).toString());
        }
        ArrayList arrayList2 = arrayList;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long startMs = ((TomorrowEvent) next).getStartMs();
                do {
                    Object next2 = it.next();
                    long startMs2 = ((TomorrowEvent) next2).getStartMs();
                    if (startMs > startMs2) {
                        next = next2;
                        startMs = startMs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        TomorrowEvent tomorrowEvent2 = (TomorrowEvent) next;
        if (tomorrowEvent2 == null) {
            return null;
        }
        return new MorningCommitment(events.size() == 1 ? tomorrowEvent2.getTitle() : "Tomorrow · " + events.size() + " events", tomorrowEvent2.getStartMs(), tomorrowEvent2.getLocation(), 15, CollectionsKt.joinToString$default(arrayList2, " · ", null, null, 0, null, null, 62, null), arrayList2);
    }

    public static /* synthetic */ MorningCommitment resolveTomorrowCommitment$default(SleepCalendarHelper sleepCalendarHelper, Context context, int i, ZoneId zoneId, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 30;
        }
        if ((i2 & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCalendarHelper.resolveTomorrowCommitment(context, i, zoneId);
    }

    public final MorningCommitment resolveTomorrowCommitment(Context context, int travelBufferMin, ZoneId zone) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zone, "zone");
        QueryResult queryTomorrowMorning = queryTomorrowMorning(context, travelBufferMin, zone);
        return queryTomorrowMorning instanceof QueryResult.Success ? ((QueryResult.Success) queryTomorrowMorning).getCommitment() : SleepCalendarManualCommitment.INSTANCE.loadForPlanner(context, zone);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolveTomorrowCommitmentAsync(Context context, int i, ZoneId zoneId, Continuation<? super MorningCommitment> continuation) {
        SleepCalendarHelper$resolveTomorrowCommitmentAsync$1 sleepCalendarHelper$resolveTomorrowCommitmentAsync$1;
        int i2;
        SleepCalendarHelper sleepCalendarHelper;
        int i3;
        ZoneId zoneId2;
        MorningCommitment morningCommitment;
        if (continuation instanceof SleepCalendarHelper$resolveTomorrowCommitmentAsync$1) {
            sleepCalendarHelper$resolveTomorrowCommitmentAsync$1 = (SleepCalendarHelper$resolveTomorrowCommitmentAsync$1) continuation;
            if ((sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.label & Integer.MIN_VALUE) != 0) {
                sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.label -= Integer.MIN_VALUE;
                Object obj = sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (GoogleCalendarLink.INSTANCE.isLinked(context)) {
                        GoogleCalendarLink googleCalendarLink = GoogleCalendarLink.INSTANCE;
                        sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.L$0 = this;
                        sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.L$1 = context;
                        sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.L$2 = zoneId;
                        sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.I$0 = i;
                        sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.label = 1;
                        obj = googleCalendarLink.tomorrowCommitment(context, i, zoneId, sleepCalendarHelper$resolveTomorrowCommitmentAsync$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        sleepCalendarHelper = this;
                        i3 = i;
                        zoneId2 = zoneId;
                        morningCommitment = null;
                        QueryResult queryTomorrowMorning = sleepCalendarHelper.queryTomorrowMorning(context, i3, zoneId2);
                        return sleepCalendarHelper.mergeTomorrowCommitments$app_sideload(morningCommitment, queryTomorrowMorning instanceof QueryResult.Success ? ((QueryResult.Success) queryTomorrowMorning).getCommitment() : null, SleepCalendarManualCommitment.INSTANCE.loadForPlanner(context, zoneId2), i3, zoneId2);
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.I$0;
                    ZoneId zoneId3 = (ZoneId) sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.L$2;
                    Context context2 = (Context) sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.L$1;
                    SleepCalendarHelper sleepCalendarHelper2 = (SleepCalendarHelper) sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i = i4;
                    this = sleepCalendarHelper2;
                    zoneId = zoneId3;
                    context = context2;
                }
                sleepCalendarHelper = this;
                i3 = i;
                zoneId2 = zoneId;
                morningCommitment = (MorningCommitment) obj;
                QueryResult queryTomorrowMorning2 = sleepCalendarHelper.queryTomorrowMorning(context, i3, zoneId2);
                return sleepCalendarHelper.mergeTomorrowCommitments$app_sideload(morningCommitment, queryTomorrowMorning2 instanceof QueryResult.Success ? ((QueryResult.Success) queryTomorrowMorning2).getCommitment() : null, SleepCalendarManualCommitment.INSTANCE.loadForPlanner(context, zoneId2), i3, zoneId2);
            }
        }
        sleepCalendarHelper$resolveTomorrowCommitmentAsync$1 = new SleepCalendarHelper$resolveTomorrowCommitmentAsync$1(this, continuation);
        Object obj2 = sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = sleepCalendarHelper$resolveTomorrowCommitmentAsync$1.label;
        if (i2 != 0) {
        }
        sleepCalendarHelper = this;
        i3 = i;
        zoneId2 = zoneId;
        morningCommitment = (MorningCommitment) obj2;
        QueryResult queryTomorrowMorning22 = sleepCalendarHelper.queryTomorrowMorning(context, i3, zoneId2);
        return sleepCalendarHelper.mergeTomorrowCommitments$app_sideload(morningCommitment, queryTomorrowMorning22 instanceof QueryResult.Success ? ((QueryResult.Success) queryTomorrowMorning22).getCommitment() : null, SleepCalendarManualCommitment.INSTANCE.loadForPlanner(context, zoneId2), i3, zoneId2);
    }

    public static /* synthetic */ Object resolveTomorrowCommitmentAsync$default(SleepCalendarHelper sleepCalendarHelper, Context context, int i, ZoneId zoneId, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 30;
        }
        if ((i2 & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCalendarHelper.resolveTomorrowCommitmentAsync(context, i, zoneId, continuation);
    }

    public static /* synthetic */ MorningCommitment mergeTomorrowCommitments$app_sideload$default(SleepCalendarHelper sleepCalendarHelper, MorningCommitment morningCommitment, MorningCommitment morningCommitment2, MorningCommitment morningCommitment3, int i, ZoneId zoneId, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 30;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCalendarHelper.mergeTomorrowCommitments$app_sideload(morningCommitment, morningCommitment2, morningCommitment3, i3, zoneId);
    }

    public final MorningCommitment mergeTomorrowCommitments$app_sideload(MorningCommitment google, MorningCommitment device, MorningCommitment manual, int travelBufferMin, ZoneId zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("h:mm a");
        Triple<LocalDate, Long, Long> triple = tomorrowRange(zone);
        long longValue = triple.component2().longValue();
        long longValue2 = triple.component3().longValue();
        Pair<Long, Long> wakeAnchorWindow = wakeAnchorWindow(zone);
        long longValue3 = wakeAnchorWindow.component1().longValue();
        long longValue4 = wakeAnchorWindow.component2().longValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        mergeTomorrowCommitments$ingest(longValue, longValue2, linkedHashMap, zone, google);
        mergeTomorrowCommitments$ingest(longValue, longValue2, linkedHashMap, zone, device);
        mergeTomorrowCommitments$ingest(longValue, longValue2, linkedHashMap, zone, manual);
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        Collection values = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        List sortedWith = CollectionsKt.sortedWith(values, new Comparator() { // from class: com.example.rungps.sleep.SleepCalendarHelper$mergeTomorrowCommitments$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SleepCalendarHelper$mergeTomorrowCommitments$Ev) t).getStartMs()), Long.valueOf(((SleepCalendarHelper$mergeTomorrowCommitments$Ev) t2).getStartMs()));
            }
        });
        MorningCommitment morningCommitment = null;
        for (Object obj : sortedWith) {
            Intrinsics.checkNotNullExpressionValue(obj, "next(...)");
            SleepCalendarHelper$mergeTomorrowCommitments$Ev sleepCalendarHelper$mergeTomorrowCommitments$Ev = (SleepCalendarHelper$mergeTomorrowCommitments$Ev) obj;
            long startMs = sleepCalendarHelper$mergeTomorrowCommitments$Ev.getStartMs();
            if (longValue3 <= startMs && startMs <= longValue4) {
                MorningCommitment morningCommitment2 = new MorningCommitment(sleepCalendarHelper$mergeTomorrowCommitments$Ev.getTitle(), sleepCalendarHelper$mergeTomorrowCommitments$Ev.getStartMs(), sleepCalendarHelper$mergeTomorrowCommitments$Ev.getLoc(), sleepCalendarHelper$mergeTomorrowCommitments$Ev.getLoc() != null ? travelBufferMin : RangesKt.coerceAtLeast(travelBufferMin / 2, 15), null, null, 48, null);
                if (morningCommitment == null || sleepCalendarHelper$mergeTomorrowCommitments$Ev.getStartMs() < morningCommitment.getStartMs()) {
                    morningCommitment = morningCommitment2;
                }
            }
        }
        List<SleepCalendarHelper$mergeTomorrowCommitments$Ev> take = CollectionsKt.take(sortedWith, 8);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
        for (SleepCalendarHelper$mergeTomorrowCommitments$Ev sleepCalendarHelper$mergeTomorrowCommitments$Ev2 : take) {
            String format = Instant.ofEpochMilli(sleepCalendarHelper$mergeTomorrowCommitments$Ev2.getStartMs()).atZone(zone).format(ofPattern);
            arrayList.add((sleepCalendarHelper$mergeTomorrowCommitments$Ev2.getLoc() != null ? new StringBuilder().append(format).append(" · ").append(sleepCalendarHelper$mergeTomorrowCommitments$Ev2.getTitle()).append(" (").append(sleepCalendarHelper$mergeTomorrowCommitments$Ev2.getLoc()).append(")") : new StringBuilder().append(format).append(" · ").append(sleepCalendarHelper$mergeTomorrowCommitments$Ev2.getTitle())).toString());
        }
        ArrayList arrayList2 = arrayList;
        Object first = CollectionsKt.first((List<? extends Object>) sortedWith);
        Intrinsics.checkNotNullExpressionValue(first, "first(...)");
        SleepCalendarHelper$mergeTomorrowCommitments$Ev sleepCalendarHelper$mergeTomorrowCommitments$Ev3 = (SleepCalendarHelper$mergeTomorrowCommitments$Ev) first;
        String title = sortedWith.size() == 1 ? sleepCalendarHelper$mergeTomorrowCommitments$Ev3.getTitle() : "Tomorrow · " + sortedWith.size() + " events";
        long startMs2 = sleepCalendarHelper$mergeTomorrowCommitments$Ev3.getStartMs();
        String loc = sleepCalendarHelper$mergeTomorrowCommitments$Ev3.getLoc();
        ArrayList arrayList3 = arrayList2;
        MorningCommitment morningCommitment3 = new MorningCommitment(title, startMs2, loc, 15, CollectionsKt.joinToString$default(arrayList3, " · ", null, null, 0, null, null, 62, null), arrayList2);
        if (morningCommitment != null) {
            return MorningCommitment.copy$default(morningCommitment, sortedWith.size() == 1 ? morningCommitment.getTitle() : "Tomorrow · " + sortedWith.size() + " events", 0L, null, 0, CollectionsKt.joinToString$default(arrayList3, " · ", null, null, 0, null, null, 62, null), arrayList2, 14, null);
        }
        return morningCommitment3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.time.ZonedDateTime] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void mergeTomorrowCommitments$ingest(long j, long j2, LinkedHashMap<String, SleepCalendarHelper$mergeTomorrowCommitments$Ev> linkedHashMap, ZoneId zoneId, MorningCommitment morningCommitment) {
        Object m7905constructorimpl;
        long longValue;
        if (morningCommitment == null) {
            return;
        }
        if (!morningCommitment.getAllDayEvents().isEmpty()) {
            for (String str : morningCommitment.getAllDayEvents()) {
                String obj = StringsKt.trim((CharSequence) StringsKt.substringBefore$default(str, " · ", (String) null, 2, (Object) null)).toString();
                String substringAfter = StringsKt.substringAfter(str, " · ", morningCommitment.getTitle());
                String obj2 = StringsKt.trim((CharSequence) StringsKt.substringBefore$default(StringsKt.substringAfter(substringAfter, " (", ""), ")", (String) null, 2, (Object) null)).toString();
                if (!StringsKt.contains$default((CharSequence) substringAfter, (CharSequence) "(", false, 2, (Object) null) || obj2.length() <= 0) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    substringAfter = StringsKt.substringBefore$default(substringAfter, " (", (String) null, 2, (Object) null);
                }
                String str2 = substringAfter;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    String upperCase = obj.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    try {
                        m7905constructorimpl = Result.m7905constructorimpl(Long.valueOf(LocalDate.now(zoneId).plusDays(1L).atTime(LocalTime.parse(upperCase, DateTimeFormatter.ofPattern("h:mm a", Locale.US))).atZone(zoneId).toInstant().toEpochMilli()));
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        Long valueOf = Long.valueOf(morningCommitment.getStartMs());
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        longValue = ((Number) m7905constructorimpl).longValue();
                        if (j <= longValue) {
                            linkedHashMap.putIfAbsent(longValue + AmbientSessionTagger.CHIP_SEP + str2, new SleepCalendarHelper$mergeTomorrowCommitments$Ev(str2, longValue, obj2));
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                Long valueOf2 = Long.valueOf(morningCommitment.getStartMs());
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    m7905constructorimpl = valueOf2;
                }
                longValue = ((Number) m7905constructorimpl).longValue();
                if (j <= longValue && longValue <= j2) {
                    linkedHashMap.putIfAbsent(longValue + AmbientSessionTagger.CHIP_SEP + str2, new SleepCalendarHelper$mergeTomorrowCommitments$Ev(str2, longValue, obj2));
                }
            }
            return;
        }
        long startMs = morningCommitment.getStartMs();
        if (j > startMs || startMs > j2) {
            return;
        }
        linkedHashMap.putIfAbsent(morningCommitment.getStartMs() + AmbientSessionTagger.CHIP_SEP + morningCommitment.getTitle(), new SleepCalendarHelper$mergeTomorrowCommitments$Ev(morningCommitment.getTitle(), morningCommitment.getStartMs(), morningCommitment.getLocation()));
    }

    public static /* synthetic */ String formatCommitment$default(SleepCalendarHelper sleepCalendarHelper, MorningCommitment morningCommitment, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCalendarHelper.formatCommitment(morningCommitment, zoneId);
    }

    public final String formatCommitment(MorningCommitment c, ZoneId zone) {
        String str;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(zone, "zone");
        String format = Instant.ofEpochMilli(c.getStartMs()).atZone(zone).format(DateTimeFormatter.ofPattern("h:mm a"));
        if (c.getLocation() != null) {
            String travelDetail = c.getTravelDetail();
            if (travelDetail == null) {
                travelDetail = c.getBufferMin() + " min travel";
            }
            str = c.getTitle() + " " + format + " · " + travelDetail;
        } else {
            str = c.getTitle() + " " + format;
        }
        if (c.getAllDayEvents().isEmpty() || c.getTravelDetail() == null) {
            return str;
        }
        String travelDetail2 = c.getTravelDetail();
        Intrinsics.checkNotNull(travelDetail2);
        return travelDetail2;
    }
}
