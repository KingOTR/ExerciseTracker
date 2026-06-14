package com.example.rungps.importing;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.caverock.androidsvg.SVGParser;
import com.example.rungps.data.GymDayExerciseSpec;
import com.example.rungps.data.RemoteGymSetRow;
import com.example.rungps.gym.AmbientSessionTagger;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* compiled from: GymTrackingXlsxImporter.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010#\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u00039:;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ0\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\tH\u0002J4\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00130\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\t2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0002J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0006\u0010#\u001a\u00020\tH\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00132\u0006\u0010&\u001a\u00020\tH\u0002J\u0010\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\tH\u0002J2\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00130\u00132\f\u0010*\u001a\b\u0012\u0004\u0012\u00020%0\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0002J:\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0014\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00130\u00132\u0006\u0010\u0015\u001a\u00020\t2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0.H\u0002J\u001a\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0010H\u0002J&\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00132\u0006\u00105\u001a\u00020\u0010H\u0002J\u0017\u00106\u001a\u0004\u0018\u0001072\u0006\u00101\u001a\u00020\tH\u0002¢\u0006\u0002\u00108R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/example/rungps/importing/GymTrackingXlsxImporter;", "", "<init>", "()V", "dmy", "Ljava/time/format/DateTimeFormatter;", "dm", "ignoreRowLabels", "", "", "parse", "Lcom/example/rungps/importing/GymTrackingXlsxImporter$ParsedImport;", "file", "Ljava/io/File;", "exercisesByCycle", "", "", "", "sessions", "", "Lcom/example/rungps/importing/GymTrackingXlsxImporter$SessionInsert;", "kind", "templateOrderToCycle", "orderIdx", "(Ljava/lang/String;I)Ljava/lang/Integer;", "mapSheetNamesToPaths", "zip", "Ljava/util/zip/ZipFile;", "readSharedStrings", "readEntryText", "path", "readSheetGrid", "sheetPath", "shared", "parseSharedStringsXml", "xml", "parseCells", "Lcom/example/rungps/importing/GymTrackingXlsxImporter$Cell;", "sheetXml", "colLettersToIndex", "letters", "cellsToGrid", "cells", "parseSheetSessions", "grid", "warnings", "", "parseFlexibleDate", "Ljava/time/LocalDate;", "s", "year", "exerciseNamesFromRow", "row", "firstDateCol", "parseWeightKg", "", "(Ljava/lang/String;)Ljava/lang/Double;", "ParsedImport", "SessionInsert", "Cell", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymTrackingXlsxImporter {
    public static final int $stable;
    public static final GymTrackingXlsxImporter INSTANCE = new GymTrackingXlsxImporter();
    private static final DateTimeFormatter dm;
    private static final DateTimeFormatter dmy;
    private static final Set<String> ignoreRowLabels;

    private GymTrackingXlsxImporter() {
    }

    static {
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("d-MMM-yyyy", Locale.ENGLISH);
        Intrinsics.checkNotNullExpressionValue(ofPattern, "ofPattern(...)");
        dmy = ofPattern;
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("d-MMM").toFormatter(Locale.ENGLISH);
        Intrinsics.checkNotNullExpressionValue(formatter, "toFormatter(...)");
        dm = formatter;
        ignoreRowLabels = SetsKt.setOf((Object[]) new String[]{"number", "cycle check", "date", ""});
        $stable = 8;
    }

    /* compiled from: GymTrackingXlsxImporter.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/importing/GymTrackingXlsxImporter$ParsedImport;", "", "daySpecs", "", "Lcom/example/rungps/data/GymDayExerciseSpec;", "sessions", "Lcom/example/rungps/importing/GymTrackingXlsxImporter$SessionInsert;", "warnings", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDaySpecs", "()Ljava/util/List;", "getSessions", "getWarnings", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ParsedImport {
        public static final int $stable = 8;
        private final List<GymDayExerciseSpec> daySpecs;
        private final List<SessionInsert> sessions;
        private final List<String> warnings;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ParsedImport copy$default(ParsedImport parsedImport, List list, List list2, List list3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = parsedImport.daySpecs;
            }
            if ((i & 2) != 0) {
                list2 = parsedImport.sessions;
            }
            if ((i & 4) != 0) {
                list3 = parsedImport.warnings;
            }
            return parsedImport.copy(list, list2, list3);
        }

        public final List<GymDayExerciseSpec> component1() {
            return this.daySpecs;
        }

        public final List<SessionInsert> component2() {
            return this.sessions;
        }

        public final List<String> component3() {
            return this.warnings;
        }

        public final ParsedImport copy(List<GymDayExerciseSpec> daySpecs, List<SessionInsert> sessions, List<String> warnings) {
            Intrinsics.checkNotNullParameter(daySpecs, "daySpecs");
            Intrinsics.checkNotNullParameter(sessions, "sessions");
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            return new ParsedImport(daySpecs, sessions, warnings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedImport)) {
                return false;
            }
            ParsedImport parsedImport = (ParsedImport) other;
            return Intrinsics.areEqual(this.daySpecs, parsedImport.daySpecs) && Intrinsics.areEqual(this.sessions, parsedImport.sessions) && Intrinsics.areEqual(this.warnings, parsedImport.warnings);
        }

        public int hashCode() {
            return (((this.daySpecs.hashCode() * 31) + this.sessions.hashCode()) * 31) + this.warnings.hashCode();
        }

        public String toString() {
            return "ParsedImport(daySpecs=" + this.daySpecs + ", sessions=" + this.sessions + ", warnings=" + this.warnings + ")";
        }

        public ParsedImport(List<GymDayExerciseSpec> daySpecs, List<SessionInsert> sessions, List<String> warnings) {
            Intrinsics.checkNotNullParameter(daySpecs, "daySpecs");
            Intrinsics.checkNotNullParameter(sessions, "sessions");
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            this.daySpecs = daySpecs;
            this.sessions = sessions;
            this.warnings = warnings;
        }

        public final List<GymDayExerciseSpec> getDaySpecs() {
            return this.daySpecs;
        }

        public final List<SessionInsert> getSessions() {
            return this.sessions;
        }

        public final List<String> getWarnings() {
            return this.warnings;
        }
    }

    /* compiled from: GymTrackingXlsxImporter.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/example/rungps/importing/GymTrackingXlsxImporter$SessionInsert;", "", "remoteId", "", "templateOrderIdx", "", "startedAtMs", "", "endedAtMs", "sets", "", "Lcom/example/rungps/data/RemoteGymSetRow;", "<init>", "(Ljava/lang/String;IJJLjava/util/List;)V", "getRemoteId", "()Ljava/lang/String;", "getTemplateOrderIdx", "()I", "getStartedAtMs", "()J", "getEndedAtMs", "getSets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SessionInsert {
        public static final int $stable = 8;
        private final long endedAtMs;
        private final String remoteId;
        private final List<RemoteGymSetRow> sets;
        private final long startedAtMs;
        private final int templateOrderIdx;

        public static /* synthetic */ SessionInsert copy$default(SessionInsert sessionInsert, String str, int i, long j, long j2, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = sessionInsert.remoteId;
            }
            if ((i2 & 2) != 0) {
                i = sessionInsert.templateOrderIdx;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                j = sessionInsert.startedAtMs;
            }
            long j3 = j;
            if ((i2 & 8) != 0) {
                j2 = sessionInsert.endedAtMs;
            }
            long j4 = j2;
            if ((i2 & 16) != 0) {
                list = sessionInsert.sets;
            }
            return sessionInsert.copy(str, i3, j3, j4, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRemoteId() {
            return this.remoteId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTemplateOrderIdx() {
            return this.templateOrderIdx;
        }

        /* renamed from: component3, reason: from getter */
        public final long getStartedAtMs() {
            return this.startedAtMs;
        }

        /* renamed from: component4, reason: from getter */
        public final long getEndedAtMs() {
            return this.endedAtMs;
        }

        public final List<RemoteGymSetRow> component5() {
            return this.sets;
        }

        public final SessionInsert copy(String remoteId, int templateOrderIdx, long startedAtMs, long endedAtMs, List<RemoteGymSetRow> sets) {
            Intrinsics.checkNotNullParameter(remoteId, "remoteId");
            Intrinsics.checkNotNullParameter(sets, "sets");
            return new SessionInsert(remoteId, templateOrderIdx, startedAtMs, endedAtMs, sets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionInsert)) {
                return false;
            }
            SessionInsert sessionInsert = (SessionInsert) other;
            return Intrinsics.areEqual(this.remoteId, sessionInsert.remoteId) && this.templateOrderIdx == sessionInsert.templateOrderIdx && this.startedAtMs == sessionInsert.startedAtMs && this.endedAtMs == sessionInsert.endedAtMs && Intrinsics.areEqual(this.sets, sessionInsert.sets);
        }

        public int hashCode() {
            return (((((((this.remoteId.hashCode() * 31) + Integer.hashCode(this.templateOrderIdx)) * 31) + Long.hashCode(this.startedAtMs)) * 31) + Long.hashCode(this.endedAtMs)) * 31) + this.sets.hashCode();
        }

        public String toString() {
            return "SessionInsert(remoteId=" + this.remoteId + ", templateOrderIdx=" + this.templateOrderIdx + ", startedAtMs=" + this.startedAtMs + ", endedAtMs=" + this.endedAtMs + ", sets=" + this.sets + ")";
        }

        public SessionInsert(String remoteId, int i, long j, long j2, List<RemoteGymSetRow> sets) {
            Intrinsics.checkNotNullParameter(remoteId, "remoteId");
            Intrinsics.checkNotNullParameter(sets, "sets");
            this.remoteId = remoteId;
            this.templateOrderIdx = i;
            this.startedAtMs = j;
            this.endedAtMs = j2;
            this.sets = sets;
        }

        public final String getRemoteId() {
            return this.remoteId;
        }

        public final int getTemplateOrderIdx() {
            return this.templateOrderIdx;
        }

        public final long getStartedAtMs() {
            return this.startedAtMs;
        }

        public final long getEndedAtMs() {
            return this.endedAtMs;
        }

        public final List<RemoteGymSetRow> getSets() {
            return this.sets;
        }
    }

    public final ParsedImport parse(File file) {
        int i;
        Object obj;
        Object obj2;
        List<SessionInsert> emptyList;
        List<SessionInsert> emptyList2;
        Intrinsics.checkNotNullParameter(file, "file");
        ArrayList arrayList = new ArrayList();
        if (!file.exists() || !file.canRead()) {
            return new ParsedImport(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.listOf("Cannot read file"));
        }
        ZipFile zipFile = new ZipFile(file);
        try {
            ZipFile zipFile2 = zipFile;
            GymTrackingXlsxImporter gymTrackingXlsxImporter = INSTANCE;
            List<String> readSharedStrings = gymTrackingXlsxImporter.readSharedStrings(zipFile2);
            Map<String, String> mapSheetNamesToPaths = gymTrackingXlsxImporter.mapSheetNamesToPaths(zipFile2);
            if (mapSheetNamesToPaths == null) {
                ParsedImport parsedImport = new ParsedImport(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.listOf("Invalid workbook (xl/workbook.xml)"));
                CloseableKt.closeFinally(zipFile, null);
                return parsedImport;
            }
            Iterator<T> it = mapSheetNamesToPaths.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (StringsKt.equals((String) ((Map.Entry) obj).getKey(), "Upper", true)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            String str = entry != null ? (String) entry.getValue() : null;
            Iterator<T> it2 = mapSheetNamesToPaths.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (StringsKt.equals((String) ((Map.Entry) obj2).getKey(), "Lower", true)) {
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) obj2;
            String str2 = entry2 != null ? (String) entry2.getValue() : null;
            if (str == null && str2 == null) {
                ParsedImport parsedImport2 = new ParsedImport(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.listOf("No Upper/Lower sheets found"));
                CloseableKt.closeFinally(zipFile, null);
                return parsedImport2;
            }
            List<List<String>> readSheetGrid = str != null ? INSTANCE.readSheetGrid(zipFile2, str, readSharedStrings) : null;
            List<List<String>> readSheetGrid2 = str2 != null ? INSTANCE.readSheetGrid(zipFile2, str2, readSharedStrings) : null;
            if (readSheetGrid == null || (emptyList = INSTANCE.parseSheetSessions(readSheetGrid, "U", arrayList)) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            if (readSheetGrid2 == null || (emptyList2 = INSTANCE.parseSheetSessions(readSheetGrid2, "L", arrayList)) == null) {
                emptyList2 = CollectionsKt.emptyList();
            }
            GymTrackingXlsxImporter gymTrackingXlsxImporter2 = INSTANCE;
            Map<Integer, Set<String>> exercisesByCycle = gymTrackingXlsxImporter2.exercisesByCycle(emptyList, "U");
            Map<Integer, Set<String>> exercisesByCycle2 = gymTrackingXlsxImporter2.exercisesByCycle(emptyList2, "L");
            List createListBuilder = CollectionsKt.createListBuilder();
            for (int i2 = 1; i2 < 5; i2++) {
                Set<String> set = exercisesByCycle.get(Integer.valueOf(i2));
                if (set == null) {
                    set = SetsKt.emptySet();
                }
                createListBuilder.add(new GymDayExerciseSpec("Upper · day " + i2, i2 - 1, CollectionsKt.sorted(set)));
            }
            for (i = 1; i < 5; i++) {
                Set<String> set2 = exercisesByCycle2.get(Integer.valueOf(i));
                if (set2 == null) {
                    set2 = SetsKt.emptySet();
                }
                createListBuilder.add(new GymDayExerciseSpec("Lower · day " + i, i + 3, CollectionsKt.sorted(set2)));
            }
            List build = CollectionsKt.build(createListBuilder);
            List plus = CollectionsKt.plus((Collection) emptyList, (Iterable) emptyList2);
            if (plus.isEmpty()) {
                arrayList.add("No numeric workout cells found under dated columns.");
            }
            ParsedImport parsedImport3 = new ParsedImport(build, plus, arrayList);
            CloseableKt.closeFinally(zipFile, null);
            return parsedImport3;
        } finally {
        }
    }

    private final Map<Integer, Set<String>> exercisesByCycle(List<SessionInsert> sessions, String kind) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SessionInsert sessionInsert : sessions) {
            Integer templateOrderToCycle = templateOrderToCycle(kind, sessionInsert.getTemplateOrderIdx());
            if (templateOrderToCycle != null) {
                int intValue = templateOrderToCycle.intValue();
                List<RemoteGymSetRow> sets = sessionInsert.getSets();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sets, 10));
                Iterator<T> it = sets.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RemoteGymSetRow) it.next()).getExerciseName());
                }
                List distinct = CollectionsKt.distinct(arrayList);
                Integer valueOf = Integer.valueOf(intValue);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = (Set) new LinkedHashSet();
                    linkedHashMap.put(valueOf, obj);
                }
                ((Set) obj).addAll(distinct);
            }
        }
        return linkedHashMap;
    }

    private final Integer templateOrderToCycle(String kind, int orderIdx) {
        if (Intrinsics.areEqual(kind, "U")) {
            if (orderIdx < 0 || orderIdx >= 4) {
                return null;
            }
            return Integer.valueOf(orderIdx + 1);
        }
        if (!Intrinsics.areEqual(kind, "L") || 4 > orderIdx || orderIdx >= 8) {
            return null;
        }
        return Integer.valueOf(orderIdx - 3);
    }

    private final Map<String, String> mapSheetNamesToPaths(ZipFile zip) {
        String readEntryText;
        List<String> groupValues;
        String str;
        MatchResult find$default;
        List<String> groupValues2;
        String str2;
        String str3;
        String readEntryText2 = readEntryText(zip, "xl/workbook.xml");
        if (readEntryText2 == null || (readEntryText = readEntryText(zip, "xl/_rels/workbook.xml.rels")) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str4 = readEntryText;
        for (MatchResult matchResult : Regex.findAll$default(new Regex("<Relationship[^>]+Id=\"([^\"]+)\"[^>]+Target=\"([^\"]+)\""), str4, 0, 2, null)) {
            linkedHashMap.put(matchResult.getGroupValues().get(1), matchResult.getGroupValues().get(2));
        }
        for (MatchResult matchResult2 : Regex.findAll$default(new Regex("<Relationship[^>]+Target=\"([^\"]+)\"[^>]+Id=\"([^\"]+)\""), str4, 0, 2, null)) {
            linkedHashMap.put(matchResult2.getGroupValues().get(2), matchResult2.getGroupValues().get(1));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = Regex.findAll$default(new Regex("<sheet([^/>]+)/?>"), readEntryText2, 0, 2, null).iterator();
        while (it.hasNext()) {
            String str5 = ((MatchResult) it.next()).getGroupValues().get(1);
            MatchResult find$default2 = Regex.find$default(new Regex("name=\"([^\"]+)\""), str5, 0, 2, null);
            if (find$default2 != null && (groupValues = find$default2.getGroupValues()) != null && (str = groupValues.get(1)) != null && (find$default = Regex.find$default(new Regex("r:id=\"([^\"]+)\""), str5, 0, 2, null)) != null && (groupValues2 = find$default.getGroupValues()) != null && (str2 = groupValues2.get(1)) != null && (str3 = (String) linkedHashMap.get(str2)) != null) {
                linkedHashMap2.put(str, StringsKt.replace$default(StringsKt.startsWith$default(str3, DomExceptionUtils.SEPARATOR, false, 2, (Object) null) ? StringsKt.removePrefix(str3, (CharSequence) DomExceptionUtils.SEPARATOR) : "xl/" + str3, "//", DomExceptionUtils.SEPARATOR, false, 4, (Object) null));
            }
        }
        return linkedHashMap2;
    }

    private final List<String> readSharedStrings(ZipFile zip) {
        String readEntryText = readEntryText(zip, "xl/sharedStrings.xml");
        return readEntryText == null ? CollectionsKt.emptyList() : parseSharedStringsXml(readEntryText);
    }

    private final String readEntryText(ZipFile zip, String path) {
        ZipEntry entry = zip.getEntry(path);
        if (entry == null) {
            return null;
        }
        InputStream inputStream = zip.getInputStream(entry);
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String readText = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            return readText;
        } finally {
        }
    }

    private final List<List<String>> readSheetGrid(ZipFile zip, String sheetPath, List<String> shared) {
        String readEntryText = readEntryText(zip, sheetPath);
        return readEntryText == null ? CollectionsKt.emptyList() : cellsToGrid(parseCells(readEntryText), shared);
    }

    private final List<String> parseSharedStringsXml(String xml) {
        ArrayList arrayList = new ArrayList();
        Iterator it = Regex.findAll$default(new Regex("<si>(.*?)</si>", RegexOption.DOT_MATCHES_ALL), xml, 0, 2, null).iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(SequencesKt.joinToString$default(Regex.findAll$default(new Regex("<t[^>]*>([^<]*)</t>"), ((MatchResult) it.next()).getGroupValues().get(1), 0, 2, null), "", null, null, 0, null, new Function1() { // from class: com.example.rungps.importing.GymTrackingXlsxImporter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence parseSharedStringsXml$lambda$12;
                    parseSharedStringsXml$lambda$12 = GymTrackingXlsxImporter.parseSharedStringsXml$lambda$12((MatchResult) obj);
                    return parseSharedStringsXml$lambda$12;
                }
            }, 30, null), "&amp;", "&", false, 4, (Object) null), "&lt;", "<", false, 4, (Object) null), "&gt;", ">", false, 4, (Object) null), "&quot;", "\"", false, 4, (Object) null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence parseSharedStringsXml$lambda$12(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getGroupValues().get(1);
    }

    /* compiled from: GymTrackingXlsxImporter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/importing/GymTrackingXlsxImporter$Cell;", "", "row", "", "col", "raw", "", SVGParser.XML_STYLESHEET_ATTR_TYPE, "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getRow", "()I", "getCol", "getRaw", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class Cell {
        private final int col;
        private final String raw;
        private final int row;
        private final String type;

        public static /* synthetic */ Cell copy$default(Cell cell, int i, int i2, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = cell.row;
            }
            if ((i3 & 2) != 0) {
                i2 = cell.col;
            }
            if ((i3 & 4) != 0) {
                str = cell.raw;
            }
            if ((i3 & 8) != 0) {
                str2 = cell.type;
            }
            return cell.copy(i, i2, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRow() {
            return this.row;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCol() {
            return this.col;
        }

        /* renamed from: component3, reason: from getter */
        public final String getRaw() {
            return this.raw;
        }

        /* renamed from: component4, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final Cell copy(int row, int col, String raw, String type) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            return new Cell(row, col, raw, type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cell)) {
                return false;
            }
            Cell cell = (Cell) other;
            return this.row == cell.row && this.col == cell.col && Intrinsics.areEqual(this.raw, cell.raw) && Intrinsics.areEqual(this.type, cell.type);
        }

        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.row) * 31) + Integer.hashCode(this.col)) * 31) + this.raw.hashCode()) * 31;
            String str = this.type;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Cell(row=" + this.row + ", col=" + this.col + ", raw=" + this.raw + ", type=" + this.type + ")";
        }

        public Cell(int i, int i2, String raw, String str) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            this.row = i;
            this.col = i2;
            this.raw = raw;
            this.type = str;
        }

        public final int getCol() {
            return this.col;
        }

        public final String getRaw() {
            return this.raw;
        }

        public final int getRow() {
            return this.row;
        }

        public final String getType() {
            return this.type;
        }
    }

    private final List<Cell> parseCells(String sheetXml) {
        ArrayList arrayList = new ArrayList();
        for (MatchResult matchResult : Regex.findAll$default(new Regex("<c r=\"([A-Za-z]+)(\\d+)\"([^>]*)>\\s*<v>([^<]*)</v>\\s*</c>"), sheetXml, 0, 2, null)) {
            String str = matchResult.getGroupValues().get(1);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            int parseInt = Integer.parseInt(matchResult.getGroupValues().get(2)) - 1;
            String str2 = matchResult.getGroupValues().get(3);
            arrayList.add(new Cell(parseInt, colLettersToIndex(upperCase), matchResult.getGroupValues().get(4), (StringsKt.contains$default((CharSequence) str2, (CharSequence) "t=\"s\"", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "t='s'", false, 2, (Object) null)) ? "s" : null));
        }
        return arrayList;
    }

    private final int colLettersToIndex(String letters) {
        int length = letters.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = letters.charAt(i2);
            if ('A' <= charAt && charAt < '[') {
                i = (i * 26) + (charAt - '@');
            }
        }
        return i - 1;
    }

    private final List<List<String>> cellsToGrid(List<Cell> cells, List<String> shared) {
        String raw;
        String str;
        if (cells.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        int i = 0;
        int i2 = 0;
        for (Cell cell : cells) {
            if (cell.getRow() > i) {
                i = cell.getRow();
            }
            if (cell.getCol() > i2) {
                i2 = cell.getCol();
            }
        }
        int i3 = i + 1;
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + 1;
            ArrayList arrayList2 = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList2.add(null);
            }
            arrayList.add(arrayList2);
        }
        ArrayList arrayList3 = arrayList;
        for (Cell cell2 : cells) {
            String type = cell2.getType();
            if (Intrinsics.areEqual(type, "s")) {
                Integer intOrNull = StringsKt.toIntOrNull(cell2.getRaw());
                raw = intOrNull != null ? (String) CollectionsKt.getOrNull(shared, intOrNull.intValue()) : null;
            } else {
                raw = Intrinsics.areEqual(type, "inlineStr") ? cell2.getRaw() : cell2.getRaw();
            }
            List list = (List) arrayList3.get(cell2.getRow());
            int col = cell2.getCol();
            if (raw == null || (str = StringsKt.trim((CharSequence) raw).toString()) == null || str.length() <= 0) {
                str = null;
            }
            list.set(col, str);
        }
        return arrayList3;
    }

    /* JADX WARN: Type inference failed for: r8v14, types: [java.time.ZonedDateTime] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.time.ZonedDateTime] */
    private final List<SessionInsert> parseSheetSessions(List<? extends List<String>> grid, String kind, List<String> warnings) {
        Integer num;
        Integer valueOf;
        Integer valueOf2;
        SessionInsert sessionInsert;
        Integer intOrNull;
        Double parseWeightKg;
        List list;
        LocalDate parseFlexibleDate;
        int i;
        String obj;
        LocalDate parseFlexibleDate2;
        List<? extends List<String>> list2 = grid;
        if (grid.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Iterator<Integer> it = CollectionsKt.getIndices(list2).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            List<String> list3 = list2.get(num.intValue());
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (String str : list3) {
                    if (str != null && StringsKt.equals(str, "Number", true)) {
                        break loop0;
                    }
                }
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            warnings.add("Sheet " + kind + ": no \"Number\" row — skip");
            return CollectionsKt.emptyList();
        }
        int intValue = num2.intValue();
        List list4 = (List) CollectionsKt.getOrNull(list2, RangesKt.coerceAtLeast(intValue - 1, 0));
        if (list4 == null) {
            list4 = CollectionsKt.emptyList();
        }
        List list5 = (List) CollectionsKt.getOrNull(list2, intValue);
        if (list5 == null) {
            list5 = CollectionsKt.emptyList();
        }
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            valueOf = Integer.valueOf(((List) it2.next()).size());
            while (it2.hasNext()) {
                Integer valueOf3 = Integer.valueOf(((List) it2.next()).size());
                if (valueOf.compareTo(valueOf3) < 0) {
                    valueOf = valueOf3;
                }
            }
        } else {
            valueOf = null;
        }
        Integer num3 = valueOf;
        int intValue2 = num3 != null ? num3.intValue() : 0;
        ArrayList arrayList = new ArrayList();
        int year = LocalDate.now().getYear();
        int i2 = -1;
        int i3 = 0;
        while (i3 < intValue2) {
            String str2 = (String) CollectionsKt.getOrNull(list4, i3);
            if (str2 == null || (parseFlexibleDate = parseFlexibleDate(str2, year)) == null) {
                list = list4;
            } else {
                int monthValue = parseFlexibleDate.getMonthValue();
                if (i2 >= 0 && monthValue < i2 - 2 && (parseFlexibleDate2 = parseFlexibleDate(str2, (year = year + 1))) != null) {
                    parseFlexibleDate = parseFlexibleDate2;
                }
                LocalDate localDate = parseFlexibleDate;
                String str3 = (String) CollectionsKt.getOrNull(list5, i3);
                Integer intOrNull2 = (str3 == null || (obj = StringsKt.trim((CharSequence) str3).toString()) == null) ? null : StringsKt.toIntOrNull(obj);
                list = list4;
                if (intOrNull2 != null) {
                    i = monthValue;
                    if (new IntRange(1, 4).contains(intOrNull2.intValue())) {
                        arrayList.add(new GymTrackingXlsxImporter$parseSheetSessions$ColMeta(i3, localDate, intOrNull2.intValue()));
                    }
                } else {
                    i = monthValue;
                }
                i2 = i;
            }
            i3++;
            list4 = list;
        }
        if (arrayList.isEmpty()) {
            warnings.add("Sheet " + kind + ": no dated columns with cycle 1–4");
            return CollectionsKt.emptyList();
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            valueOf2 = Integer.valueOf(((GymTrackingXlsxImporter$parseSheetSessions$ColMeta) it3.next()).getCol());
            while (it3.hasNext()) {
                Integer valueOf4 = Integer.valueOf(((GymTrackingXlsxImporter$parseSheetSessions$ColMeta) it3.next()).getCol());
                if (valueOf2.compareTo(valueOf4) > 0) {
                    valueOf2 = valueOf4;
                }
            }
        } else {
            valueOf2 = null;
        }
        Integer num4 = valueOf2;
        if (num4 == null) {
            return CollectionsKt.emptyList();
        }
        int intValue3 = num4.intValue();
        ZoneId systemDefault = ZoneId.systemDefault();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i4 = intValue + 1;
        int size = grid.size();
        while (i4 < size) {
            List<String> list6 = list2.get(i4);
            List<String> exerciseNamesFromRow = exerciseNamesFromRow(list6, intValue3);
            if (!exerciseNamesFromRow.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                Intrinsics.checkNotNullExpressionValue(it4, "iterator(...)");
                while (it4.hasNext()) {
                    Object next = it4.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    GymTrackingXlsxImporter$parseSheetSessions$ColMeta gymTrackingXlsxImporter$parseSheetSessions$ColMeta = (GymTrackingXlsxImporter$parseSheetSessions$ColMeta) next;
                    String str4 = (String) CollectionsKt.getOrNull(list6, gymTrackingXlsxImporter$parseSheetSessions$ColMeta.getCol());
                    if (str4 != null && (parseWeightKg = parseWeightKg(str4)) != null) {
                        double doubleValue = parseWeightKg.doubleValue();
                        String str5 = kind + AmbientSessionTagger.CHIP_SEP + gymTrackingXlsxImporter$parseSheetSessions$ColMeta.getDate() + AmbientSessionTagger.CHIP_SEP + gymTrackingXlsxImporter$parseSheetSessions$ColMeta.getCycle();
                        LinkedHashMap linkedHashMap2 = linkedHashMap;
                        Object obj2 = linkedHashMap2.get(str5);
                        if (obj2 == null) {
                            obj2 = (List) new ArrayList();
                            linkedHashMap2.put(str5, obj2);
                        }
                        List list7 = (List) obj2;
                        int size2 = list7.size();
                        Iterator<String> it5 = exerciseNamesFromRow.iterator();
                        int i5 = size2;
                        while (it5.hasNext()) {
                            list7.add(new RemoteGymSetRow(it5.next(), i5, 1, doubleValue, null, null, 48, null));
                            i5++;
                        }
                    }
                }
            }
            i4++;
            list2 = grid;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str6 = (String) entry.getKey();
            List list8 = (List) entry.getValue();
            if (list8.isEmpty()) {
                sessionInsert = null;
            } else {
                List split$default = StringsKt.split$default((CharSequence) str6, new String[]{AmbientSessionTagger.CHIP_SEP}, false, 0, 6, (Object) null);
                String str7 = (String) CollectionsKt.getOrNull(split$default, 2);
                if (str7 == null || (intOrNull = StringsKt.toIntOrNull(str7)) == null) {
                    sessionInsert = null;
                } else {
                    int intValue4 = intOrNull.intValue();
                    LocalDate parse = LocalDate.parse((CharSequence) split$default.get(1));
                    sessionInsert = new SessionInsert("xlsx:" + split$default.get(0) + ":" + parse + "_" + intValue4, Intrinsics.areEqual(split$default.get(0), "U") ? intValue4 - 1 : intValue4 + 3, parse.atTime(12, 0).atZone(systemDefault).toInstant().toEpochMilli(), parse.atTime(13, 0).atZone(systemDefault).toInstant().toEpochMilli(), list8);
                }
            }
            if (sessionInsert != null) {
                arrayList2.add(sessionInsert);
            }
        }
        return arrayList2;
    }

    private final LocalDate parseFlexibleDate(String s, int year) {
        Object m7905constructorimpl;
        String obj = StringsKt.trim((CharSequence) s).toString();
        if (obj.length() == 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            GymTrackingXlsxImporter gymTrackingXlsxImporter = this;
            return LocalDate.parse(obj, dmy);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
            try {
                Result.Companion companion3 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(LocalDate.parse(obj, dm).withYear(year));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
            }
            return (LocalDate) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
        }
    }

    private final List<String> exerciseNamesFromRow(List<String> row, int firstDateCol) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int coerceAtMost = RangesKt.coerceAtMost(firstDateCol, row.size());
        for (int i = 0; i < coerceAtMost; i++) {
            String str = (String) CollectionsKt.getOrNull(row, i);
            String obj = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
            if (obj == null) {
                obj = "";
            }
            if (obj.length() != 0) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = obj.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!ignoreRowLabels.contains(lowerCase)) {
                    linkedHashSet.add(obj);
                }
            }
        }
        return CollectionsKt.toList(linkedHashSet);
    }

    private final Double parseWeightKg(String s) {
        MatchResult find$default;
        List<String> groupValues;
        String str;
        Double doubleOrNull;
        String obj = StringsKt.trim((CharSequence) s).toString();
        if (obj.length() == 0 || (find$default = Regex.find$default(new Regex("([\\d.]+)"), obj, 0, 2, null)) == null || (groupValues = find$default.getGroupValues()) == null || (str = groupValues.get(1)) == null || (doubleOrNull = StringsKt.toDoubleOrNull(str)) == null) {
            return null;
        }
        return Double.valueOf(doubleOrNull.doubleValue());
    }
}
