package com.example.rungps.training;

import com.example.rungps.analytics.TrainingWeekPlanner;
import com.example.rungps.data.ArchivedTrainingWeekEntity;
import com.example.rungps.training.DailyTrainingCoach;
import com.example.rungps.training.TrainingWeekSnapshot;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: TrainingWeekSnapshot.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/training/TrainingWeekSnapshotCodec;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "fromWeek", "Lcom/example/rungps/training/TrainingWeekSnapshot;", "week", "Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;", "coach", "Lcom/example/rungps/training/DailyTrainingCoach$DailyCoachBrief;", "encode", "", "snapshot", "decode", "raw", "decodeEntity", "entity", "Lcom/example/rungps/data/ArchivedTrainingWeekEntity;", "toWeekView", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainingWeekSnapshotCodec {
    public static final TrainingWeekSnapshotCodec INSTANCE = new TrainingWeekSnapshotCodec();
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.example.rungps.training.TrainingWeekSnapshotCodec$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit json$lambda$0;
            json$lambda$0 = TrainingWeekSnapshotCodec.json$lambda$0((JsonBuilder) obj);
            return json$lambda$0;
        }
    }, 1, null);
    public static final int $stable = 8;

    private TrainingWeekSnapshotCodec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ TrainingWeekSnapshot fromWeek$default(TrainingWeekSnapshotCodec trainingWeekSnapshotCodec, TrainingWeekPlanner.TrainingWeekView trainingWeekView, DailyTrainingCoach.DailyCoachBrief dailyCoachBrief, int i, Object obj) {
        if ((i & 2) != 0) {
            dailyCoachBrief = null;
        }
        return trainingWeekSnapshotCodec.fromWeek(trainingWeekView, dailyCoachBrief);
    }

    public final TrainingWeekSnapshot fromWeek(TrainingWeekPlanner.TrainingWeekView week, DailyTrainingCoach.DailyCoachBrief coach) {
        Intrinsics.checkNotNullParameter(week, "week");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        String format = week.getWeekStart().format(dateTimeFormatter);
        String str = "format(...)";
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String format2 = week.getWeekEnd().format(dateTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        double totalRunKm = week.getTotalRunKm();
        double totalGymKg = week.getTotalGymKg();
        int sleepNights = week.getSleepNights();
        Double avgSleepHours = week.getAvgSleepHours();
        String headline = coach != null ? coach.getHeadline() : null;
        String summary = coach != null ? coach.getSummary() : null;
        String weekLine = coach != null ? coach.getWeekLine() : null;
        List<TrainingWeekPlanner.WeekDay> days = week.getDays();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(days, 10));
        Iterator it = days.iterator();
        while (it.hasNext()) {
            TrainingWeekPlanner.WeekDay weekDay = (TrainingWeekPlanner.WeekDay) it.next();
            String dayLabel = weekDay.getDayLabel();
            String format3 = weekDay.getDate().format(dateTimeFormatter);
            Intrinsics.checkNotNullExpressionValue(format3, str);
            boolean isToday = weekDay.isToday();
            double runKm = weekDay.getRunKm();
            double gymTonnageKg = weekDay.getGymTonnageKg();
            List<TrainingWeekPlanner.WeekEvent> events = weekDay.getEvents();
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            Iterator it2 = it;
            String str2 = str;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(events, 10));
            Iterator it3 = events.iterator();
            while (it3.hasNext()) {
                TrainingWeekPlanner.WeekEvent weekEvent = (TrainingWeekPlanner.WeekEvent) it3.next();
                arrayList2.add(new TrainingWeekSnapshot.EventSnapshot(weekEvent.getKind().name(), weekEvent.getTitle(), weekEvent.getSubtitle()));
                it3 = it3;
                summary = summary;
            }
            arrayList.add(new TrainingWeekSnapshot.DaySnapshot(dayLabel, format3, isToday, runKm, gymTonnageKg, arrayList2));
            it = it2;
            dateTimeFormatter = dateTimeFormatter2;
            str = str2;
        }
        return new TrainingWeekSnapshot(format, format2, totalRunKm, totalGymKg, sleepNights, avgSleepHours, headline, summary, weekLine, arrayList);
    }

    public final String encode(TrainingWeekSnapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Json json2 = json;
        json2.getSerializersModule();
        return json2.encodeToString(TrainingWeekSnapshot.INSTANCE.serializer(), snapshot);
    }

    public final TrainingWeekSnapshot decode(String raw) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(raw, "raw");
        try {
            Result.Companion companion = Result.INSTANCE;
            TrainingWeekSnapshotCodec trainingWeekSnapshotCodec = this;
            Json json2 = json;
            json2.getSerializersModule();
            m7905constructorimpl = Result.m7905constructorimpl((TrainingWeekSnapshot) json2.decodeFromString(TrainingWeekSnapshot.INSTANCE.serializer(), raw));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        return (TrainingWeekSnapshot) m7905constructorimpl;
    }

    public final TrainingWeekSnapshot decodeEntity(ArchivedTrainingWeekEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return decode(entity.getSnapshotJson());
    }

    public final TrainingWeekPlanner.TrainingWeekView toWeekView(TrainingWeekSnapshot snapshot) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        LocalDate parse = LocalDate.parse(snapshot.getWeekStartIso(), dateTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        LocalDate parse2 = LocalDate.parse(snapshot.getWeekEndIso(), dateTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(parse2, "parse(...)");
        List<TrainingWeekSnapshot.DaySnapshot> days = snapshot.getDays();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(days, 10));
        for (TrainingWeekSnapshot.DaySnapshot daySnapshot : days) {
            LocalDate parse3 = LocalDate.parse(daySnapshot.getDateIso(), dateTimeFormatter);
            Intrinsics.checkNotNullExpressionValue(parse3, "parse(...)");
            String dayLabel = daySnapshot.getDayLabel();
            boolean isToday = daySnapshot.isToday();
            List<TrainingWeekSnapshot.EventSnapshot> events = daySnapshot.getEvents();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(events, 10));
            for (TrainingWeekSnapshot.EventSnapshot eventSnapshot : events) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(TrainingWeekPlanner.EventKind.valueOf(eventSnapshot.getKind()));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                TrainingWeekPlanner.EventKind eventKind = TrainingWeekPlanner.EventKind.REST_HINT;
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    m7905constructorimpl = eventKind;
                }
                arrayList2.add(new TrainingWeekPlanner.WeekEvent((TrainingWeekPlanner.EventKind) m7905constructorimpl, eventSnapshot.getTitle(), eventSnapshot.getSubtitle(), 0L));
            }
            arrayList.add(new TrainingWeekPlanner.WeekDay(parse3, dayLabel, isToday, arrayList2, daySnapshot.getRunKm(), daySnapshot.getGymTonnageKg()));
        }
        return new TrainingWeekPlanner.TrainingWeekView(parse, parse2, arrayList, snapshot.getTotalRunKm(), snapshot.getTotalGymKg(), snapshot.getSleepNights(), snapshot.getAvgSleepHours());
    }
}
