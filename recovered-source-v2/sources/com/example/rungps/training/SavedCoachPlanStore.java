package com.example.rungps.training;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.tracking.TrackingService;
import com.example.rungps.training.BuiltinTrainingPlans;
import com.example.rungps.training.GoalPromptParser;
import com.example.rungps.training.RunningGoalCoach;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: SavedCoachPlanStore.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/training/SavedCoachPlanStore;", "", "<init>", "()V", "SLUG", "", "PREFS", "KEY_JSON", "json", "Lkotlinx/serialization/json/Json;", TrackingService.BATTERY_SAVE, "", "context", "Landroid/content/Context;", "plan", "Lcom/example/rungps/training/BuiltinTrainingPlans$PlanDefinition;", "load", CervicalMucusRecord.Appearance.CLEAR, "fromCoachPlan", "Lcom/example/rungps/training/RunningGoalCoach$CoachPlan;", "parsed", "Lcom/example/rungps/training/GoalPromptParser$ParsedGoal;", "inferWeeksFromTimeframe", "", "label", "WorkoutDto", "PlanDto", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedCoachPlanStore {
    private static final String KEY_JSON = "plan_json";
    private static final String PREFS = "coach_saved_plan";
    public static final String SLUG = "coach_saved";
    public static final SavedCoachPlanStore INSTANCE = new SavedCoachPlanStore();
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.example.rungps.training.SavedCoachPlanStore$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit json$lambda$0;
            json$lambda$0 = SavedCoachPlanStore.json$lambda$0((JsonBuilder) obj);
            return json$lambda$0;
        }
    }, 1, null);
    public static final int $stable = 8;

    private SavedCoachPlanStore() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SavedCoachPlanStore.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002&'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006("}, d2 = {"Lcom/example/rungps/training/SavedCoachPlanStore$WorkoutDto;", "", "index", "", "weekLabel", "", "title", "detail", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "getWeekLabel", "()Ljava/lang/String;", "getTitle", "getDetail", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    static final /* data */ class WorkoutDto {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String detail;
        private final int index;
        private final String title;
        private final String weekLabel;

        public static /* synthetic */ WorkoutDto copy$default(WorkoutDto workoutDto, int i, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = workoutDto.index;
            }
            if ((i2 & 2) != 0) {
                str = workoutDto.weekLabel;
            }
            if ((i2 & 4) != 0) {
                str2 = workoutDto.title;
            }
            if ((i2 & 8) != 0) {
                str3 = workoutDto.detail;
            }
            return workoutDto.copy(i, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final String getWeekLabel() {
            return this.weekLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        public final WorkoutDto copy(int index, String weekLabel, String title, String detail) {
            Intrinsics.checkNotNullParameter(weekLabel, "weekLabel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new WorkoutDto(index, weekLabel, title, detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WorkoutDto)) {
                return false;
            }
            WorkoutDto workoutDto = (WorkoutDto) other;
            return this.index == workoutDto.index && Intrinsics.areEqual(this.weekLabel, workoutDto.weekLabel) && Intrinsics.areEqual(this.title, workoutDto.title) && Intrinsics.areEqual(this.detail, workoutDto.detail);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.index) * 31) + this.weekLabel.hashCode()) * 31) + this.title.hashCode()) * 31) + this.detail.hashCode();
        }

        public String toString() {
            return "WorkoutDto(index=" + this.index + ", weekLabel=" + this.weekLabel + ", title=" + this.title + ", detail=" + this.detail + ")";
        }

        /* compiled from: SavedCoachPlanStore.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/training/SavedCoachPlanStore$WorkoutDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/training/SavedCoachPlanStore$WorkoutDto;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<WorkoutDto> serializer() {
                return SavedCoachPlanStore$WorkoutDto$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ WorkoutDto(int i, int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, SavedCoachPlanStore$WorkoutDto$$serializer.INSTANCE.getDescriptor());
            }
            this.index = i2;
            this.weekLabel = str;
            this.title = str2;
            this.detail = str3;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$app_sideload(WorkoutDto self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.index);
            output.encodeStringElement(serialDesc, 1, self.weekLabel);
            output.encodeStringElement(serialDesc, 2, self.title);
            output.encodeStringElement(serialDesc, 3, self.detail);
        }

        public WorkoutDto(int i, String weekLabel, String title, String detail) {
            Intrinsics.checkNotNullParameter(weekLabel, "weekLabel");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.index = i;
            this.weekLabel = weekLabel;
            this.title = title;
            this.detail = detail;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getWeekLabel() {
            return this.weekLabel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SavedCoachPlanStore.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\fHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lcom/example/rungps/training/SavedCoachPlanStore$PlanDto;", "", "slug", "", "title", "description", "workouts", "", "Lcom/example/rungps/training/SavedCoachPlanStore$WorkoutDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSlug", "()Ljava/lang/String;", "getTitle", "getDescription", "getWorkouts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    static final /* data */ class PlanDto {
        private final String description;
        private final String slug;
        private final String title;
        private final List<WorkoutDto> workouts;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(SavedCoachPlanStore$WorkoutDto$$serializer.INSTANCE)};

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PlanDto copy$default(PlanDto planDto, String str, String str2, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = planDto.slug;
            }
            if ((i & 2) != 0) {
                str2 = planDto.title;
            }
            if ((i & 4) != 0) {
                str3 = planDto.description;
            }
            if ((i & 8) != 0) {
                list = planDto.workouts;
            }
            return planDto.copy(str, str2, str3, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final List<WorkoutDto> component4() {
            return this.workouts;
        }

        public final PlanDto copy(String slug, String title, String description, List<WorkoutDto> workouts) {
            Intrinsics.checkNotNullParameter(slug, "slug");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(workouts, "workouts");
            return new PlanDto(slug, title, description, workouts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlanDto)) {
                return false;
            }
            PlanDto planDto = (PlanDto) other;
            return Intrinsics.areEqual(this.slug, planDto.slug) && Intrinsics.areEqual(this.title, planDto.title) && Intrinsics.areEqual(this.description, planDto.description) && Intrinsics.areEqual(this.workouts, planDto.workouts);
        }

        public int hashCode() {
            return (((((this.slug.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.workouts.hashCode();
        }

        public String toString() {
            return "PlanDto(slug=" + this.slug + ", title=" + this.title + ", description=" + this.description + ", workouts=" + this.workouts + ")";
        }

        /* compiled from: SavedCoachPlanStore.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/training/SavedCoachPlanStore$PlanDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/training/SavedCoachPlanStore$PlanDto;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<PlanDto> serializer() {
                return SavedCoachPlanStore$PlanDto$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ PlanDto(int i, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, SavedCoachPlanStore$PlanDto$$serializer.INSTANCE.getDescriptor());
            }
            this.slug = str;
            this.title = str2;
            this.description = str3;
            this.workouts = list;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$app_sideload(PlanDto self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.slug);
            output.encodeStringElement(serialDesc, 1, self.title);
            output.encodeStringElement(serialDesc, 2, self.description);
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.workouts);
        }

        public PlanDto(String slug, String title, String description, List<WorkoutDto> workouts) {
            Intrinsics.checkNotNullParameter(slug, "slug");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(workouts, "workouts");
            this.slug = slug;
            this.title = title;
            this.description = description;
            this.workouts = workouts;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getDescription() {
            return this.description;
        }

        public final List<WorkoutDto> getWorkouts() {
            return this.workouts;
        }
    }

    public final void save(Context context, BuiltinTrainingPlans.PlanDefinition plan) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(plan, "plan");
        String slug = plan.getSlug();
        String title = plan.getTitle();
        String description = plan.getDescription();
        List<BuiltinTrainingPlans.Workout> workouts = plan.getWorkouts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(workouts, 10));
        for (BuiltinTrainingPlans.Workout workout : workouts) {
            arrayList.add(new WorkoutDto(workout.getIndex(), workout.getWeekLabel(), workout.getTitle(), workout.getDetail()));
        }
        PlanDto planDto = new PlanDto(slug, title, description, arrayList);
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(PREFS, 0).edit();
        Json json2 = json;
        json2.getSerializersModule();
        edit.putString(KEY_JSON, json2.encodeToString(PlanDto.INSTANCE.serializer(), planDto)).apply();
    }

    public final BuiltinTrainingPlans.PlanDefinition load(Context context) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getApplicationContext().getSharedPreferences(PREFS, 0).getString(KEY_JSON, null);
        if (string == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SavedCoachPlanStore savedCoachPlanStore = this;
            Json json2 = json;
            json2.getSerializersModule();
            PlanDto planDto = (PlanDto) json2.decodeFromString(PlanDto.INSTANCE.serializer(), string);
            String slug = planDto.getSlug();
            String title = planDto.getTitle();
            String description = planDto.getDescription();
            List<WorkoutDto> workouts = planDto.getWorkouts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(workouts, 10));
            for (WorkoutDto workoutDto : workouts) {
                arrayList.add(new BuiltinTrainingPlans.Workout(workoutDto.getIndex(), workoutDto.getWeekLabel(), workoutDto.getTitle(), workoutDto.getDetail()));
            }
            m7905constructorimpl = Result.m7905constructorimpl(new BuiltinTrainingPlans.PlanDefinition(slug, title, description, arrayList));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return (BuiltinTrainingPlans.PlanDefinition) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
    }

    public final void clear(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getApplicationContext().getSharedPreferences(PREFS, 0).edit().remove(KEY_JSON).apply();
    }

    public final BuiltinTrainingPlans.PlanDefinition fromCoachPlan(RunningGoalCoach.CoachPlan plan, GoalPromptParser.ParsedGoal parsed) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(parsed, "parsed");
        Integer timeframeWeeks = parsed.getTimeframeWeeks();
        int i = 1;
        int coerceIn = timeframeWeeks != null ? RangesKt.coerceIn(timeframeWeeks.intValue(), 1, 24) : inferWeeksFromTimeframe(plan.getTimeframeLabel());
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (1 <= coerceIn) {
            int i3 = 0;
            while (true) {
                String str = "Week " + i;
                int i4 = 0;
                for (Object obj : plan.getWeeklyOutline()) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(new BuiltinTrainingPlans.Workout(i3, str, "Session " + i5, (String) obj));
                    i4 = i5;
                    i3++;
                }
                if (i == coerceIn) {
                    break;
                }
                i++;
            }
            i2 = i3;
        }
        Iterator<T> it = plan.getMilestones().iterator();
        while (it.hasNext()) {
            arrayList.add(new BuiltinTrainingPlans.Workout(i2, "Checkpoint", (String) it.next(), "Review progress and adjust if needed."));
            i2++;
        }
        return new BuiltinTrainingPlans.PlanDefinition(SLUG, plan.getGoalTitle(), plan.getHeadline(), arrayList);
    }

    private final int inferWeeksFromTimeframe(String label) {
        List<String> groupValues;
        String str;
        Integer intOrNull;
        String str2 = label;
        MatchResult find$default = Regex.find$default(new Regex("(\\d{1,2})"), str2, 0, 2, null);
        if (find$default == null || (groupValues = find$default.getGroupValues()) == null || (str = groupValues.get(1)) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
            return 8;
        }
        int intValue = intOrNull.intValue();
        return StringsKt.contains((CharSequence) str2, (CharSequence) "month", true) ? RangesKt.coerceIn((int) (intValue * 4.33d), 4, 24) : RangesKt.coerceIn(intValue, 1, 24);
    }
}
