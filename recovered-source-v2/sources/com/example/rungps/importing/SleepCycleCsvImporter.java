package com.example.rungps.importing;

import android.content.ContentResolver;
import android.net.Uri;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.maplibre.android.style.layers.Property;

/* compiled from: SleepCycleCsvImporter.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ2\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0005\u0012\u0004\u0012\u00020\u00120\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00052\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010#R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/example/rungps/importing/SleepCycleCsvImporter;", "", "<init>", "()V", "dateFormats", "", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "import", "Lcom/example/rungps/importing/SleepCycleImportResult;", "resolver", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "zone", "Ljava/time/ZoneId;", "parse", "text", "", "parseEntries", "Lcom/example/rungps/data/SleepEntryEntity;", "importEntries", "Lkotlin/Pair;", "normalizeHeader", "h", "splitCsvLine", Property.SYMBOL_PLACEMENT_LINE, "delim", "", "parseDateTime", "", "raw", "(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/lang/Long;", "parseMinutes", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepCycleCsvImporter {
    public static final SleepCycleCsvImporter INSTANCE = new SleepCycleCsvImporter();
    private static final List<DateTimeFormatter> dateFormats = CollectionsKt.listOf((Object[]) new DateTimeFormatter[]{DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"), DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"), DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm")});
    public static final int $stable = 8;

    private SleepCycleCsvImporter() {
    }

    public static /* synthetic */ SleepCycleImportResult import$default(SleepCycleCsvImporter sleepCycleCsvImporter, ContentResolver contentResolver, Uri uri, ZoneId zoneId, int i, Object obj) {
        if ((i & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCycleCsvImporter.m6899import(contentResolver, uri, zoneId);
    }

    /* renamed from: import, reason: not valid java name */
    public final SleepCycleImportResult m6899import(ContentResolver resolver, Uri uri, ZoneId zone) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(zone, "zone");
        InputStream openInputStream = resolver.openInputStream(uri);
        if (openInputStream != null) {
            InputStream inputStream = openInputStream;
            try {
                SleepCycleImportResult parse = INSTANCE.parse(TextStreamsKt.readText(new BufferedReader(new InputStreamReader(inputStream))), zone);
                CloseableKt.closeFinally(inputStream, null);
                return parse;
            } finally {
            }
        } else {
            return new SleepCycleImportResult(0, 0, "Could not read file");
        }
    }

    public static /* synthetic */ SleepCycleImportResult parse$default(SleepCycleCsvImporter sleepCycleCsvImporter, String str, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCycleCsvImporter.parse(str, zoneId);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SleepCycleImportResult parse(String text, ZoneId zone) {
        Long parseDateTime;
        Long parseDateTime2;
        int i;
        int i2;
        Integer parseMinutes;
        int intValue;
        int i3;
        char c;
        Integer num;
        int resolveQuality;
        SleepCycleCsvImporter sleepCycleCsvImporter = this;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(zone, "zone");
        List<String> lines = StringsKt.lines(text);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lines, 10));
        Iterator<T> it = lines.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        int i4 = 0;
        if (arrayList3.isEmpty()) {
            return new SleepCycleImportResult(0, 0, "Empty file");
        }
        CharSequence charSequence = (CharSequence) arrayList3.get(0);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= charSequence.length()) {
                break;
            }
            if (charSequence.charAt(i5) == ';') {
                i6++;
            }
            i5++;
        }
        CharSequence charSequence2 = (CharSequence) arrayList3.get(0);
        int i7 = 0;
        for (int i8 = 0; i8 < charSequence2.length(); i8++) {
            if (charSequence2.charAt(i8) == ',') {
                i7++;
            }
        }
        char c2 = i6 <= i7 ? ',' : ';';
        List split$default = StringsKt.split$default((CharSequence) arrayList3.get(0), new char[]{c2}, false, 0, 6, (Object) null);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
        Iterator it2 = split$default.iterator();
        while (it2.hasNext()) {
            arrayList4.add(INSTANCE.normalizeHeader((String) it2.next()));
        }
        ArrayList arrayList5 = arrayList4;
        Iterator it3 = arrayList5.iterator();
        int i9 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i9 = -1;
                break;
            }
            if (CollectionsKt.listOf((Object[]) new String[]{"start", "bedtime", "bed", "sleepstart"}).contains((String) it3.next())) {
                break;
            }
            i9++;
        }
        Iterator it4 = arrayList5.iterator();
        int i10 = 0;
        while (true) {
            if (!it4.hasNext()) {
                i10 = -1;
                break;
            }
            if (CollectionsKt.listOf((Object[]) new String[]{"end", "waketime", "wake", "sleepend"}).contains((String) it4.next())) {
                break;
            }
            i10++;
        }
        Iterator it5 = arrayList5.iterator();
        int i11 = 0;
        while (true) {
            if (!it5.hasNext()) {
                i11 = -1;
                break;
            }
            String str = (String) it5.next();
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "quality", false, 2, (Object) null) || Intrinsics.areEqual(str, "sleepquality")) {
                break;
            }
            i11++;
        }
        Iterator it6 = arrayList5.iterator();
        int i12 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i12 = -1;
                break;
            }
            String str2 = (String) it6.next();
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "asleep", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "after", false, 2, (Object) null)) {
                break;
            }
            i12++;
        }
        Iterator it7 = arrayList5.iterator();
        int i13 = 0;
        while (true) {
            if (!it7.hasNext()) {
                i13 = -1;
                break;
            }
            String str3 = (String) it7.next();
            Iterator it8 = it7;
            if (StringsKt.contains$default((CharSequence) str3, (CharSequence) "inbed", false, 2, (Object) null) || Intrinsics.areEqual(str3, "timeinbed")) {
                break;
            }
            i13++;
            it7 = it8;
        }
        Iterator it9 = arrayList5.iterator();
        int i14 = 0;
        while (true) {
            if (!it9.hasNext()) {
                i14 = -1;
                break;
            }
            String str4 = (String) it9.next();
            if (Intrinsics.areEqual(str4, "duration") || StringsKt.contains$default((CharSequence) str4, (CharSequence) "totalsleep", false, 2, (Object) null)) {
                break;
            }
            i14++;
        }
        if (i9 < 0 || i10 < 0) {
            return new SleepCycleImportResult(0, 0, "Missing Start/End columns — export CSV from Sleep Cycle app");
        }
        ArrayList arrayList6 = new ArrayList();
        int size = arrayList3.size();
        int i15 = 1;
        while (i15 < size) {
            List<String> splitCsvLine = sleepCycleCsvImporter.splitCsvLine((String) arrayList3.get(i15), c2);
            ArrayList arrayList7 = arrayList3;
            if (splitCsvLine.size() > Math.max(i9, i10) && (parseDateTime = sleepCycleCsvImporter.parseDateTime(splitCsvLine.get(i9), zone)) != null && (parseDateTime2 = sleepCycleCsvImporter.parseDateTime(splitCsvLine.get(i10), zone)) != null && parseDateTime2.longValue() > parseDateTime.longValue()) {
                i = i9;
                i2 = size;
                int coerceAtLeast = RangesKt.coerceAtLeast((int) ((parseDateTime2.longValue() - parseDateTime.longValue()) / 60000), 1);
                if (i12 < 0 || i12 >= splitCsvLine.size()) {
                    if (i14 < 0 || i14 >= splitCsvLine.size()) {
                        if (i13 >= 0 && i13 < splitCsvLine.size() && (parseMinutes = sleepCycleCsvImporter.parseMinutes(splitCsvLine.get(i13))) != null) {
                            intValue = parseMinutes.intValue();
                            Integer efficiencyPercent = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                            if (i11 >= 0 || i11 >= splitCsvLine.size()) {
                                i3 = i10;
                                c = c2;
                            } else {
                                Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.trim((CharSequence) StringsKt.replace$default(splitCsvLine.get(i11), "%", "", false, 4, (Object) null)).toString());
                                i3 = i10;
                                c = c2;
                                if (doubleOrNull != null) {
                                    num = Integer.valueOf((int) doubleOrNull.doubleValue());
                                    resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : num);
                                    arrayList6.add(new SleepEntryEntity(0L, parseDateTime.longValue(), parseDateTime2.longValue(), intValue, null, null, efficiencyPercent, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                                }
                            }
                            num = null;
                            resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : num);
                            arrayList6.add(new SleepEntryEntity(0L, parseDateTime.longValue(), parseDateTime2.longValue(), intValue, null, null, efficiencyPercent, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                        }
                        intValue = coerceAtLeast;
                        Integer efficiencyPercent2 = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                        if (i11 >= 0) {
                        }
                        i3 = i10;
                        c = c2;
                        num = null;
                        resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent2, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : num);
                        arrayList6.add(new SleepEntryEntity(0L, parseDateTime.longValue(), parseDateTime2.longValue(), intValue, null, null, efficiencyPercent2, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                    } else {
                        Integer parseMinutes2 = sleepCycleCsvImporter.parseMinutes(splitCsvLine.get(i14));
                        if (parseMinutes2 != null) {
                            intValue = parseMinutes2.intValue();
                            Integer efficiencyPercent22 = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                            if (i11 >= 0) {
                            }
                            i3 = i10;
                            c = c2;
                            num = null;
                            resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent22, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : num);
                            arrayList6.add(new SleepEntryEntity(0L, parseDateTime.longValue(), parseDateTime2.longValue(), intValue, null, null, efficiencyPercent22, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                        }
                        intValue = coerceAtLeast;
                        Integer efficiencyPercent222 = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                        if (i11 >= 0) {
                        }
                        i3 = i10;
                        c = c2;
                        num = null;
                        resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent222, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : num);
                        arrayList6.add(new SleepEntryEntity(0L, parseDateTime.longValue(), parseDateTime2.longValue(), intValue, null, null, efficiencyPercent222, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                    }
                } else {
                    Integer parseMinutes3 = sleepCycleCsvImporter.parseMinutes(splitCsvLine.get(i12));
                    if (parseMinutes3 != null) {
                        intValue = parseMinutes3.intValue();
                        Integer efficiencyPercent2222 = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                        if (i11 >= 0) {
                        }
                        i3 = i10;
                        c = c2;
                        num = null;
                        resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent2222, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : num);
                        arrayList6.add(new SleepEntryEntity(0L, parseDateTime.longValue(), parseDateTime2.longValue(), intValue, null, null, efficiencyPercent2222, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                    }
                    intValue = coerceAtLeast;
                    Integer efficiencyPercent22222 = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                    if (i11 >= 0) {
                    }
                    i3 = i10;
                    c = c2;
                    num = null;
                    resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent22222, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : num);
                    arrayList6.add(new SleepEntryEntity(0L, parseDateTime.longValue(), parseDateTime2.longValue(), intValue, null, null, efficiencyPercent22222, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                }
            } else {
                i4++;
                i = i9;
                i2 = size;
                i3 = i10;
                c = c2;
            }
            i15++;
            sleepCycleCsvImporter = this;
            c2 = c;
            arrayList3 = arrayList7;
            i10 = i3;
            i9 = i;
            size = i2;
        }
        return new SleepCycleImportResult(arrayList6.size(), i4, arrayList6.isEmpty() ? "No valid rows parsed" : "Parsed " + arrayList6.size() + " night(s)");
    }

    public static /* synthetic */ List parseEntries$default(SleepCycleCsvImporter sleepCycleCsvImporter, String str, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCycleCsvImporter.parseEntries(str, zoneId);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<SleepEntryEntity> parseEntries(String text, ZoneId zone) {
        ArrayList arrayList;
        Long parseDateTime;
        Integer parseMinutes;
        int intValue;
        int resolveQuality;
        Double doubleOrNull;
        SleepCycleCsvImporter sleepCycleCsvImporter = this;
        ZoneId zone2 = zone;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(zone2, "zone");
        if (parse(text, zone).getImported() == 0) {
            return CollectionsKt.emptyList();
        }
        List<String> lines = StringsKt.lines(text);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(lines, 10));
        Iterator<T> it = lines.iterator();
        while (it.hasNext()) {
            arrayList2.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = arrayList3;
        CharSequence charSequence = (CharSequence) arrayList4.get(0);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= charSequence.length()) {
                break;
            }
            if (charSequence.charAt(i) == ';') {
                i2++;
            }
            i++;
        }
        CharSequence charSequence2 = (CharSequence) arrayList4.get(0);
        int i3 = 0;
        for (int i4 = 0; i4 < charSequence2.length(); i4++) {
            if (charSequence2.charAt(i4) == ',') {
                i3++;
            }
        }
        char c = i2 <= i3 ? ',' : ';';
        List split$default = StringsKt.split$default((CharSequence) arrayList4.get(0), new char[]{c}, false, 0, 6, (Object) null);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
        Iterator it2 = split$default.iterator();
        while (it2.hasNext()) {
            arrayList5.add(INSTANCE.normalizeHeader((String) it2.next()));
        }
        ArrayList arrayList6 = arrayList5;
        Iterator it3 = arrayList6.iterator();
        int i5 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i5 = -1;
                break;
            }
            if (CollectionsKt.listOf((Object[]) new String[]{"start", "bedtime", "bed", "sleepstart"}).contains((String) it3.next())) {
                break;
            }
            i5++;
        }
        Iterator it4 = arrayList6.iterator();
        int i6 = 0;
        while (true) {
            if (!it4.hasNext()) {
                i6 = -1;
                break;
            }
            if (CollectionsKt.listOf((Object[]) new String[]{"end", "waketime", "wake", "sleepend"}).contains((String) it4.next())) {
                break;
            }
            i6++;
        }
        Iterator it5 = arrayList6.iterator();
        int i7 = 0;
        while (true) {
            if (!it5.hasNext()) {
                i7 = -1;
                break;
            }
            String str = (String) it5.next();
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "quality", false, 2, (Object) null) || Intrinsics.areEqual(str, "sleepquality")) {
                break;
            }
            i7++;
        }
        Iterator it6 = arrayList6.iterator();
        int i8 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i8 = -1;
                break;
            }
            String str2 = (String) it6.next();
            if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "asleep", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "after", false, 2, (Object) null)) {
                break;
            }
            i8++;
        }
        Iterator it7 = arrayList6.iterator();
        int i9 = 0;
        while (true) {
            if (!it7.hasNext()) {
                i9 = -1;
                break;
            }
            String str3 = (String) it7.next();
            Iterator it8 = it7;
            if (StringsKt.contains$default((CharSequence) str3, (CharSequence) "inbed", false, 2, (Object) null) || Intrinsics.areEqual(str3, "timeinbed")) {
                break;
            }
            i9++;
            it7 = it8;
        }
        Iterator it9 = arrayList6.iterator();
        int i10 = 0;
        while (true) {
            if (!it9.hasNext()) {
                i10 = -1;
                break;
            }
            String str4 = (String) it9.next();
            if (Intrinsics.areEqual(str4, "duration") || StringsKt.contains$default((CharSequence) str4, (CharSequence) "totalsleep", false, 2, (Object) null)) {
                break;
            }
            i10++;
        }
        ArrayList arrayList7 = new ArrayList();
        int size = arrayList4.size();
        int i11 = 1;
        while (i11 < size) {
            List<String> splitCsvLine = sleepCycleCsvImporter.splitCsvLine((String) arrayList4.get(i11), c);
            if (splitCsvLine.size() > Math.max(i5, i6) && (parseDateTime = sleepCycleCsvImporter.parseDateTime(splitCsvLine.get(i5), zone2)) != null) {
                long longValue = parseDateTime.longValue();
                Long parseDateTime2 = sleepCycleCsvImporter.parseDateTime(splitCsvLine.get(i6), zone2);
                if (parseDateTime2 != null) {
                    long longValue2 = parseDateTime2.longValue();
                    if (longValue2 > longValue) {
                        int coerceAtLeast = RangesKt.coerceAtLeast((int) ((longValue2 - longValue) / 60000), 1);
                        if (i8 < 0 || i8 >= splitCsvLine.size()) {
                            if (i10 < 0 || i10 >= splitCsvLine.size()) {
                                if (i9 >= 0 && i9 < splitCsvLine.size() && (parseMinutes = sleepCycleCsvImporter.parseMinutes(splitCsvLine.get(i9))) != null) {
                                    intValue = parseMinutes.intValue();
                                    Integer efficiencyPercent = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                                    arrayList = arrayList4;
                                    resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : (i7 >= 0 || i7 >= splitCsvLine.size() || (doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.trim((CharSequence) StringsKt.replace$default(splitCsvLine.get(i7), "%", "", false, 4, (Object) null)).toString())) == null) ? null : Integer.valueOf((int) doubleOrNull.doubleValue()));
                                    arrayList7.add(new SleepEntryEntity(0L, longValue, longValue2, intValue, null, null, efficiencyPercent, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                                    i11++;
                                    sleepCycleCsvImporter = this;
                                    zone2 = zone;
                                    arrayList4 = arrayList;
                                }
                                intValue = coerceAtLeast;
                                Integer efficiencyPercent2 = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                                arrayList = arrayList4;
                                resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent2, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : (i7 >= 0 || i7 >= splitCsvLine.size() || (doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.trim((CharSequence) StringsKt.replace$default(splitCsvLine.get(i7), "%", "", false, 4, (Object) null)).toString())) == null) ? null : Integer.valueOf((int) doubleOrNull.doubleValue()));
                                arrayList7.add(new SleepEntryEntity(0L, longValue, longValue2, intValue, null, null, efficiencyPercent2, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                                i11++;
                                sleepCycleCsvImporter = this;
                                zone2 = zone;
                                arrayList4 = arrayList;
                            } else {
                                Integer parseMinutes2 = sleepCycleCsvImporter.parseMinutes(splitCsvLine.get(i10));
                                if (parseMinutes2 != null) {
                                    intValue = parseMinutes2.intValue();
                                    Integer efficiencyPercent22 = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                                    arrayList = arrayList4;
                                    resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent22, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : (i7 >= 0 || i7 >= splitCsvLine.size() || (doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.trim((CharSequence) StringsKt.replace$default(splitCsvLine.get(i7), "%", "", false, 4, (Object) null)).toString())) == null) ? null : Integer.valueOf((int) doubleOrNull.doubleValue()));
                                    arrayList7.add(new SleepEntryEntity(0L, longValue, longValue2, intValue, null, null, efficiencyPercent22, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                                    i11++;
                                    sleepCycleCsvImporter = this;
                                    zone2 = zone;
                                    arrayList4 = arrayList;
                                }
                                intValue = coerceAtLeast;
                                Integer efficiencyPercent222 = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                                arrayList = arrayList4;
                                resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent222, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : (i7 >= 0 || i7 >= splitCsvLine.size() || (doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.trim((CharSequence) StringsKt.replace$default(splitCsvLine.get(i7), "%", "", false, 4, (Object) null)).toString())) == null) ? null : Integer.valueOf((int) doubleOrNull.doubleValue()));
                                arrayList7.add(new SleepEntryEntity(0L, longValue, longValue2, intValue, null, null, efficiencyPercent222, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                                i11++;
                                sleepCycleCsvImporter = this;
                                zone2 = zone;
                                arrayList4 = arrayList;
                            }
                        } else {
                            Integer parseMinutes3 = sleepCycleCsvImporter.parseMinutes(splitCsvLine.get(i8));
                            if (parseMinutes3 != null) {
                                intValue = parseMinutes3.intValue();
                                Integer efficiencyPercent2222 = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                                arrayList = arrayList4;
                                resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent2222, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : (i7 >= 0 || i7 >= splitCsvLine.size() || (doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.trim((CharSequence) StringsKt.replace$default(splitCsvLine.get(i7), "%", "", false, 4, (Object) null)).toString())) == null) ? null : Integer.valueOf((int) doubleOrNull.doubleValue()));
                                arrayList7.add(new SleepEntryEntity(0L, longValue, longValue2, intValue, null, null, efficiencyPercent2222, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                                i11++;
                                sleepCycleCsvImporter = this;
                                zone2 = zone;
                                arrayList4 = arrayList;
                            }
                            intValue = coerceAtLeast;
                            Integer efficiencyPercent22222 = SleepScoring.INSTANCE.efficiencyPercent(intValue, coerceAtLeast);
                            arrayList = arrayList4;
                            resolveQuality = SleepScoring.INSTANCE.resolveQuality("sleep_cycle", intValue, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : efficiencyPercent22222, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : (i7 >= 0 || i7 >= splitCsvLine.size() || (doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.trim((CharSequence) StringsKt.replace$default(splitCsvLine.get(i7), "%", "", false, 4, (Object) null)).toString())) == null) ? null : Integer.valueOf((int) doubleOrNull.doubleValue()));
                            arrayList7.add(new SleepEntryEntity(0L, longValue, longValue2, intValue, null, null, efficiencyPercent22222, Integer.valueOf(resolveQuality), "sleep_cycle", null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741361, null));
                            i11++;
                            sleepCycleCsvImporter = this;
                            zone2 = zone;
                            arrayList4 = arrayList;
                        }
                    }
                }
            }
            arrayList = arrayList4;
            i11++;
            sleepCycleCsvImporter = this;
            zone2 = zone;
            arrayList4 = arrayList;
        }
        return arrayList7;
    }

    public static /* synthetic */ Pair importEntries$default(SleepCycleCsvImporter sleepCycleCsvImporter, ContentResolver contentResolver, Uri uri, ZoneId zoneId, int i, Object obj) {
        if ((i & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepCycleCsvImporter.importEntries(contentResolver, uri, zoneId);
    }

    public final Pair<List<SleepEntryEntity>, String> importEntries(ContentResolver resolver, Uri uri, ZoneId zone) {
        String str;
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(zone, "zone");
        InputStream openInputStream = resolver.openInputStream(uri);
        if (openInputStream != null) {
            InputStream inputStream = openInputStream;
            try {
                List<SleepEntryEntity> parseEntries = INSTANCE.parseEntries(TextStreamsKt.readText(new BufferedReader(new InputStreamReader(inputStream))), zone);
                if (parseEntries.isEmpty()) {
                    str = "No valid Sleep Cycle rows found";
                } else {
                    str = "Imported " + parseEntries.size() + " night(s) from Sleep Cycle";
                }
                Pair<List<SleepEntryEntity>, String> pair = TuplesKt.to(parseEntries, str);
                CloseableKt.closeFinally(inputStream, null);
                return pair;
            } finally {
            }
        } else {
            return TuplesKt.to(CollectionsKt.emptyList(), "Could not read file");
        }
    }

    private final String normalizeHeader(String h) {
        String obj = StringsKt.trim((CharSequence) h).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new Regex("[^a-z0-9]").replace(lowerCase, "");
    }

    private final List<String> splitCsvLine(String line, char delim) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int length = line.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = line.charAt(i);
            if (charAt == '\"') {
                z = !z;
                Unit unit = Unit.INSTANCE;
            } else if (charAt == delim && !z) {
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                arrayList.add(StringsKt.trim(StringsKt.trim((CharSequence) sb2).toString(), '\"'));
                StringsKt.clear(sb);
            } else {
                sb.append(charAt);
            }
        }
        String sb3 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        arrayList.add(StringsKt.trim(StringsKt.trim((CharSequence) sb3).toString(), '\"'));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.time.ZonedDateTime] */
    private final Long parseDateTime(String raw, ZoneId zone) {
        String trim = StringsKt.trim(StringsKt.trim((CharSequence) raw).toString(), '\"');
        Iterator<DateTimeFormatter> it = dateFormats.iterator();
        while (it.hasNext()) {
            try {
                return Long.valueOf(LocalDateTime.parse(trim, it.next()).atZone(zone).toInstant().toEpochMilli());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final Integer parseMinutes(String raw) {
        Integer intOrNull;
        Integer intOrNull2;
        String obj = StringsKt.trim((CharSequence) raw).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str = lowerCase;
        if (str.length() == 0) {
            return null;
        }
        Integer intOrNull3 = StringsKt.toIntOrNull(lowerCase);
        if (intOrNull3 != null) {
            return Integer.valueOf(intOrNull3.intValue());
        }
        int i = 0;
        MatchResult find$default = Regex.find$default(new Regex("(\\d+)\\s*h(?:\\s*(\\d+)\\s*m)?"), str, 0, 2, null);
        if (find$default != null) {
            Integer intOrNull4 = StringsKt.toIntOrNull(find$default.getGroupValues().get(1));
            int intValue = intOrNull4 != null ? intOrNull4.intValue() : 0;
            String str2 = (String) CollectionsKt.getOrNull(find$default.getGroupValues(), 2);
            if (str2 != null && (intOrNull2 = StringsKt.toIntOrNull(str2)) != null) {
                i = intOrNull2.intValue();
            }
            return Integer.valueOf((intValue * 60) + i);
        }
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null);
        if (split$default.size() == 2 && (intOrNull = StringsKt.toIntOrNull((String) split$default.get(0))) != null) {
            int intValue2 = intOrNull.intValue();
            Integer intOrNull5 = StringsKt.toIntOrNull((String) split$default.get(1));
            if (intOrNull5 != null) {
                return Integer.valueOf((intValue2 * 60) + intOrNull5.intValue());
            }
        }
        return null;
    }
}
