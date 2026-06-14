package com.example.rungps.gym;

import android.content.Context;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.nfc.GymLocationHelper;
import com.example.rungps.nfc.GymNfcGuard;
import com.example.rungps.tracking.TrackingService;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AmbientSessionTagger.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002%&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0012\u001a\u00020\u0006J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J*\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010 H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/example/rungps/gym/AmbientSessionTagger;", "", "<init>", "()V", "chipSuggestions", "", "", "getChipSuggestions", "()Ljava/util/List;", "CHIP_SEP", "LEGACY_CHIP_SEP", "CUSTOM_MARKER", "parseStoredTags", "", "ambientTagCustom", "customOnly", "encodeStoredTags", "chips", TrackingService.PLAN_CUSTOM, "displayTags", "ambientTag", "compose", "Lcom/example/rungps/gym/AmbientSessionTagger$Result;", "context", "Landroid/content/Context;", "startedAtMs", "", "hint", "Lcom/example/rungps/gym/AmbientSessionTagger$Hint;", "(Landroid/content/Context;JLcom/example/rungps/gym/AmbientSessionTagger$Hint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "displayTag", "loadLastSleep", "Lcom/example/rungps/data/SleepEntryEntity;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSleepDebt", "", "last", TextFieldImplKt.PlaceholderId, "Result", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AmbientSessionTagger {
    public static final String CHIP_SEP = "|";
    public static final String CUSTOM_MARKER = "|~|";
    private static final String LEGACY_CHIP_SEP = " · ";
    public static final AmbientSessionTagger INSTANCE = new AmbientSessionTagger();
    private static final List<String> chipSuggestions = CollectionsKt.listOf((Object[]) new String[]{"At gym", "Compressed lunch", "Sleep-debt grind", "Rested push", "Late session", "Early bird", "Weekend slot", "Off-site start", "Free flow", "Deload", "Travel day", "High energy", "Crowded gym", "Partner session", "Solo focus"});
    public static final int $stable = 8;

    private AmbientSessionTagger() {
    }

    /* compiled from: AmbientSessionTagger.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/gym/AmbientSessionTagger$Hint;", "", "atGym", "", "fromNfc", "<init>", "(Ljava/lang/Boolean;Z)V", "getAtGym", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFromNfc", "()Z", "component1", "component2", "copy", "(Ljava/lang/Boolean;Z)Lcom/example/rungps/gym/AmbientSessionTagger$Hint;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Hint {
        public static final int $stable = 0;
        private final Boolean atGym;
        private final boolean fromNfc;

        /* JADX WARN: Multi-variable type inference failed */
        public Hint() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Hint copy$default(Hint hint, Boolean bool, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = hint.atGym;
            }
            if ((i & 2) != 0) {
                z = hint.fromNfc;
            }
            return hint.copy(bool, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getAtGym() {
            return this.atGym;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFromNfc() {
            return this.fromNfc;
        }

        public final Hint copy(Boolean atGym, boolean fromNfc) {
            return new Hint(atGym, fromNfc);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hint)) {
                return false;
            }
            Hint hint = (Hint) other;
            return Intrinsics.areEqual(this.atGym, hint.atGym) && this.fromNfc == hint.fromNfc;
        }

        public int hashCode() {
            Boolean bool = this.atGym;
            return ((bool == null ? 0 : bool.hashCode()) * 31) + Boolean.hashCode(this.fromNfc);
        }

        public String toString() {
            return "Hint(atGym=" + this.atGym + ", fromNfc=" + this.fromNfc + ")";
        }

        public Hint(Boolean bool, boolean z) {
            this.atGym = bool;
            this.fromNfc = z;
        }

        public /* synthetic */ Hint(Boolean bool, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? false : z);
        }

        public final Boolean getAtGym() {
            return this.atGym;
        }

        public final boolean getFromNfc() {
            return this.fromNfc;
        }
    }

    /* compiled from: AmbientSessionTagger.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/gym/AmbientSessionTagger$Result;", "", "tag", "", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "getDetail", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {
        public static final int $stable = 0;
        private final String detail;
        private final String tag;

        public static /* synthetic */ Result copy$default(Result result, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = result.tag;
            }
            if ((i & 2) != 0) {
                str2 = result.detail;
            }
            return result.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        public final Result copy(String tag, String detail) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(detail, "detail");
            return new Result(tag, detail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.tag, result.tag) && Intrinsics.areEqual(this.detail, result.detail);
        }

        public int hashCode() {
            return (this.tag.hashCode() * 31) + this.detail.hashCode();
        }

        public String toString() {
            return "Result(tag=" + this.tag + ", detail=" + this.detail + ")";
        }

        public Result(String tag, String detail) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.tag = tag;
            this.detail = detail;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getDetail() {
            return this.detail;
        }
    }

    public final List<String> getChipSuggestions() {
        return chipSuggestions;
    }

    public final Set<String> parseStoredTags(String ambientTagCustom) {
        String obj = ambientTagCustom != null ? StringsKt.trim((CharSequence) ambientTagCustom).toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (obj.length() == 0) {
            return SetsKt.emptySet();
        }
        String obj2 = StringsKt.trim((CharSequence) StringsKt.substringBefore$default(obj, CUSTOM_MARKER, (String) null, 2, (Object) null)).toString();
        if (obj2.length() == 0) {
            return SetsKt.emptySet();
        }
        String str = CHIP_SEP;
        if (!StringsKt.contains$default((CharSequence) obj2, (CharSequence) CHIP_SEP, false, 2, (Object) null)) {
            str = LEGACY_CHIP_SEP;
        }
        List split$default = StringsKt.split$default((CharSequence) obj2, new String[]{str}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            String str2 = (String) obj3;
            if (str2.length() > 0 && chipSuggestions.contains(str2)) {
                arrayList2.add(obj3);
            }
        }
        return CollectionsKt.toSet(arrayList2);
    }

    public final String customOnly(String ambientTagCustom) {
        String obj = ambientTagCustom != null ? StringsKt.trim((CharSequence) ambientTagCustom).toString() : null;
        if (obj == null) {
            obj = "";
        }
        String str = obj;
        if (str.length() == 0) {
            return null;
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) CUSTOM_MARKER, false, 2, (Object) null)) {
            String obj2 = StringsKt.trim((CharSequence) StringsKt.substringAfter$default(obj, CUSTOM_MARKER, (String) null, 2, (Object) null)).toString();
            if (StringsKt.isBlank(obj2)) {
                return null;
            }
            return obj2;
        }
        Set<String> parseStoredTags = parseStoredTags(obj);
        String str2 = CHIP_SEP;
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) CHIP_SEP, false, 2, (Object) null)) {
            str2 = LEGACY_CHIP_SEP;
        }
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{str2}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            String str3 = (String) obj3;
            if (str3.length() > 0 && !parseStoredTags.contains(str3)) {
                arrayList2.add(obj3);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList2, str2, null, null, 0, null, null, 62, null);
        if (StringsKt.isBlank(joinToString$default)) {
            return null;
        }
        return joinToString$default;
    }

    public final String encodeStoredTags(Set<String> chips, String custom) {
        Intrinsics.checkNotNullParameter(chips, "chips");
        Intrinsics.checkNotNullParameter(custom, "custom");
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.sorted(chips), CHIP_SEP, null, null, 0, null, null, 62, null);
        String obj = StringsKt.trim((CharSequence) custom).toString();
        String str = joinToString$default;
        if (str.length() > 0 && obj.length() > 0) {
            return joinToString$default + CUSTOM_MARKER + obj;
        }
        if (str.length() > 0) {
            return joinToString$default;
        }
        if (obj.length() > 0) {
            return CUSTOM_MARKER + obj;
        }
        return null;
    }

    public final String displayTags(String ambientTag, String ambientTagCustom) {
        String obj;
        String obj2;
        Set<String> parseStoredTags = parseStoredTags(ambientTagCustom);
        String customOnly = customOnly(ambientTagCustom);
        String str = null;
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.sorted(parseStoredTags), LEGACY_CHIP_SEP, null, null, 0, null, null, 62, null);
        String str2 = joinToString$default;
        if (str2.length() > 0 && customOnly != null) {
            customOnly = joinToString$default + LEGACY_CHIP_SEP + customOnly;
        } else if (str2.length() > 0) {
            customOnly = joinToString$default;
        } else if (customOnly == null) {
            customOnly = null;
        }
        if (customOnly != null && (obj2 = StringsKt.trim((CharSequence) customOnly).toString()) != null) {
            if (obj2.length() <= 0) {
                obj2 = null;
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        if (ambientTag != null && (obj = StringsKt.trim((CharSequence) ambientTag).toString()) != null && obj.length() > 0) {
            str = obj;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f9, code lost:
    
        if ((r11 != null ? r11.intValue() : 0) >= 82) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compose(Context context, long j, Hint hint, Continuation<? super Result> continuation) {
        AmbientSessionTagger$compose$1 ambientSessionTagger$compose$1;
        Object coroutine_suspended;
        int i;
        long j2;
        Hint hint2;
        AmbientSessionTagger ambientSessionTagger;
        Context context2;
        long j3;
        Object loadLastSleep;
        int i2;
        Hint hint3;
        int i3;
        boolean z;
        AmbientSessionTagger ambientSessionTagger2;
        int i4;
        SleepEntryEntity sleepEntryEntity;
        boolean isSleepDebt;
        boolean z2;
        String str;
        if (continuation instanceof AmbientSessionTagger$compose$1) {
            ambientSessionTagger$compose$1 = (AmbientSessionTagger$compose$1) continuation;
            if ((ambientSessionTagger$compose$1.label & Integer.MIN_VALUE) != 0) {
                ambientSessionTagger$compose$1.label -= Integer.MIN_VALUE;
                Object obj = ambientSessionTagger$compose$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ambientSessionTagger$compose$1.label;
                boolean z3 = false;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (hint.getAtGym() == null) {
                        GymLocationHelper gymLocationHelper = GymLocationHelper.INSTANCE;
                        ambientSessionTagger$compose$1.L$0 = this;
                        ambientSessionTagger$compose$1.L$1 = context;
                        hint2 = hint;
                        ambientSessionTagger$compose$1.L$2 = hint2;
                        j2 = j;
                        ambientSessionTagger$compose$1.J$0 = j2;
                        ambientSessionTagger$compose$1.label = 1;
                        if (gymLocationHelper.refreshStoredLocation(context, ambientSessionTagger$compose$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        j2 = j;
                        hint2 = hint;
                    }
                    long j4 = j2;
                    ambientSessionTagger = this;
                    context2 = context;
                    j3 = j4;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i4 = ambientSessionTagger$compose$1.I$2;
                        i3 = ambientSessionTagger$compose$1.I$1;
                        i2 = ambientSessionTagger$compose$1.I$0;
                        z = ambientSessionTagger$compose$1.Z$0;
                        hint3 = (Hint) ambientSessionTagger$compose$1.L$1;
                        ambientSessionTagger2 = (AmbientSessionTagger) ambientSessionTagger$compose$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        sleepEntryEntity = (SleepEntryEntity) obj;
                        isSleepDebt = ambientSessionTagger2.isSleepDebt(sleepEntryEntity);
                        if (sleepEntryEntity != null && !isSleepDebt) {
                            if (sleepEntryEntity.getTotalSleepMin() < 420) {
                                Integer sleepEfficiency = sleepEntryEntity.getSleepEfficiency();
                            }
                            z2 = true;
                            ArrayList arrayList = new ArrayList();
                            if (!z) {
                                arrayList.add("inside gym area");
                            } else {
                                arrayList.add("outside saved gym");
                            }
                            if (hint3.getFromNfc()) {
                                arrayList.add("NFC");
                            }
                            if (sleepEntryEntity != null) {
                                arrayList.add((sleepEntryEntity.getTotalSleepMin() / 60) + "h sleep");
                            }
                            if (isSleepDebt) {
                                if (11 <= i2 && i2 < 15) {
                                    if (1 <= i3 && i3 < 6) {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        str = "Compressed lunch";
                                    }
                                }
                                if (i4 != 0 && i2 < 12) {
                                    str = "Weekend slot";
                                } else if (i2 < 7) {
                                    str = "Early bird";
                                } else if (i2 >= 21) {
                                    str = "Late session";
                                } else if (z2 && z) {
                                    str = "Rested push";
                                } else if (z) {
                                    str = "At gym";
                                } else if (!z) {
                                    str = "Off-site start";
                                } else {
                                    str = "Free flow";
                                }
                            } else {
                                str = "Sleep-debt grind";
                            }
                            return new Result(str, CollectionsKt.joinToString$default(arrayList, LEGACY_CHIP_SEP, null, null, 0, null, null, 62, null));
                        }
                        z2 = false;
                        ArrayList arrayList2 = new ArrayList();
                        if (!z) {
                        }
                        if (hint3.getFromNfc()) {
                        }
                        if (sleepEntryEntity != null) {
                        }
                        if (isSleepDebt) {
                        }
                        return new Result(str, CollectionsKt.joinToString$default(arrayList2, LEGACY_CHIP_SEP, null, null, 0, null, null, 62, null));
                    }
                    j3 = ambientSessionTagger$compose$1.J$0;
                    hint2 = (Hint) ambientSessionTagger$compose$1.L$2;
                    context2 = (Context) ambientSessionTagger$compose$1.L$1;
                    ambientSessionTagger = (AmbientSessionTagger) ambientSessionTagger$compose$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Boolean atGym = hint2.getAtGym();
                boolean booleanValue = atGym == null ? atGym.booleanValue() : GymNfcGuard.INSTANCE.isAtGym(context2);
                ZonedDateTime ofInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault());
                int hour = ofInstant.getHour();
                int value = ofInstant.getDayOfWeek().getValue();
                int i5 = (value != 6 || value == 7) ? 1 : 0;
                ambientSessionTagger$compose$1.L$0 = ambientSessionTagger;
                ambientSessionTagger$compose$1.L$1 = hint2;
                ambientSessionTagger$compose$1.L$2 = null;
                ambientSessionTagger$compose$1.Z$0 = booleanValue;
                ambientSessionTagger$compose$1.I$0 = hour;
                ambientSessionTagger$compose$1.I$1 = value;
                ambientSessionTagger$compose$1.I$2 = i5;
                ambientSessionTagger$compose$1.label = 2;
                loadLastSleep = ambientSessionTagger.loadLastSleep(context2, ambientSessionTagger$compose$1);
                if (loadLastSleep != coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2 = hour;
                hint3 = hint2;
                i3 = value;
                z = booleanValue;
                obj = loadLastSleep;
                ambientSessionTagger2 = ambientSessionTagger;
                i4 = i5;
                sleepEntryEntity = (SleepEntryEntity) obj;
                isSleepDebt = ambientSessionTagger2.isSleepDebt(sleepEntryEntity);
                if (sleepEntryEntity != null) {
                    if (sleepEntryEntity.getTotalSleepMin() < 420) {
                    }
                    z2 = true;
                    ArrayList arrayList22 = new ArrayList();
                    if (!z) {
                    }
                    if (hint3.getFromNfc()) {
                    }
                    if (sleepEntryEntity != null) {
                    }
                    if (isSleepDebt) {
                    }
                    return new Result(str, CollectionsKt.joinToString$default(arrayList22, LEGACY_CHIP_SEP, null, null, 0, null, null, 62, null));
                }
                z2 = false;
                ArrayList arrayList222 = new ArrayList();
                if (!z) {
                }
                if (hint3.getFromNfc()) {
                }
                if (sleepEntryEntity != null) {
                }
                if (isSleepDebt) {
                }
                return new Result(str, CollectionsKt.joinToString$default(arrayList222, LEGACY_CHIP_SEP, null, null, 0, null, null, 62, null));
            }
        }
        ambientSessionTagger$compose$1 = new AmbientSessionTagger$compose$1(this, continuation);
        Object obj2 = ambientSessionTagger$compose$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ambientSessionTagger$compose$1.label;
        boolean z32 = false;
        if (i != 0) {
        }
        Boolean atGym2 = hint2.getAtGym();
        if (atGym2 == null) {
        }
        ZonedDateTime ofInstant2 = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault());
        int hour2 = ofInstant2.getHour();
        int value2 = ofInstant2.getDayOfWeek().getValue();
        if (value2 != 6) {
        }
        ambientSessionTagger$compose$1.L$0 = ambientSessionTagger;
        ambientSessionTagger$compose$1.L$1 = hint2;
        ambientSessionTagger$compose$1.L$2 = null;
        ambientSessionTagger$compose$1.Z$0 = booleanValue;
        ambientSessionTagger$compose$1.I$0 = hour2;
        ambientSessionTagger$compose$1.I$1 = value2;
        ambientSessionTagger$compose$1.I$2 = i5;
        ambientSessionTagger$compose$1.label = 2;
        loadLastSleep = ambientSessionTagger.loadLastSleep(context2, ambientSessionTagger$compose$1);
        if (loadLastSleep != coroutine_suspended) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object compose$default(AmbientSessionTagger ambientSessionTagger, Context context, long j, Hint hint, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        if ((i & 4) != 0) {
            hint = new Hint(null, false, 3, 0 == true ? 1 : 0);
        }
        return ambientSessionTagger.compose(context, j2, hint, continuation);
    }

    public final String displayTag(String ambientTag, String ambientTagCustom) {
        String displayTags = displayTags(ambientTag, ambientTagCustom);
        if (displayTags.length() > 0) {
            return displayTags;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadLastSleep(Context context, Continuation<? super SleepEntryEntity> continuation) {
        AmbientSessionTagger$loadLastSleep$1 ambientSessionTagger$loadLastSleep$1;
        int i;
        long j;
        Iterator it;
        if (continuation instanceof AmbientSessionTagger$loadLastSleep$1) {
            ambientSessionTagger$loadLastSleep$1 = (AmbientSessionTagger$loadLastSleep$1) continuation;
            if ((ambientSessionTagger$loadLastSleep$1.label & Integer.MIN_VALUE) != 0) {
                ambientSessionTagger$loadLastSleep$1.label -= Integer.MIN_VALUE;
                Object obj = ambientSessionTagger$loadLastSleep$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ambientSessionTagger$loadLastSleep$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Repository repository = Repository.INSTANCE.get(context);
                    long currentTimeMillis = System.currentTimeMillis();
                    ambientSessionTagger$loadLastSleep$1.J$0 = currentTimeMillis;
                    ambientSessionTagger$loadLastSleep$1.label = 1;
                    obj = repository.sleepSince(currentTimeMillis - 129600000, ambientSessionTagger$loadLastSleep$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = currentTimeMillis;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = ambientSessionTagger$loadLastSleep$1.J$0;
                    ResultKt.throwOnFailure(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (((SleepEntryEntity) obj2).getEndTimeMs() <= j) {
                        arrayList.add(obj2);
                    }
                }
                it = arrayList.iterator();
                if (it.hasNext()) {
                    return null;
                }
                Object next = it.next();
                if (it.hasNext()) {
                    long endTimeMs = ((SleepEntryEntity) next).getEndTimeMs();
                    do {
                        Object next2 = it.next();
                        long endTimeMs2 = ((SleepEntryEntity) next2).getEndTimeMs();
                        if (endTimeMs < endTimeMs2) {
                            next = next2;
                            endTimeMs = endTimeMs2;
                        }
                    } while (it.hasNext());
                }
                return next;
            }
        }
        ambientSessionTagger$loadLastSleep$1 = new AmbientSessionTagger$loadLastSleep$1(this, continuation);
        Object obj3 = ambientSessionTagger$loadLastSleep$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ambientSessionTagger$loadLastSleep$1.label;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r7.hasNext()) {
        }
        it = arrayList2.iterator();
        if (it.hasNext()) {
        }
    }

    private final boolean isSleepDebt(SleepEntryEntity last) {
        if (last == null) {
            return false;
        }
        if (last.getTotalSleepMin() < 390) {
            return true;
        }
        Integer sleepEfficiency = last.getSleepEfficiency();
        if ((sleepEfficiency != null ? sleepEfficiency.intValue() : 100) < 72) {
            return true;
        }
        Integer restlessnessIndex = last.getRestlessnessIndex();
        return (restlessnessIndex != null ? restlessnessIndex.intValue() : 0) > 65;
    }
}
