package com.example.rungps.sleep;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepHistoryPersonalization.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/sleep/SleepHistoryPersonalization;", "", "<init>", "()V", "PREFS", "", "KEY_NIGHTS", "KEY_MOVE_AWAKE", "KEY_SNORE_AUDIO", "KEY_DEEP_CALM", "KEY_RESTLESS_EMA", "load", "Lcom/example/rungps/sleep/SleepHistoryPersonalization$Profile;", "context", "Landroid/content/Context;", "refreshFromDatabase", "", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordSavedNight", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "Profile", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepHistoryPersonalization {
    public static final int $stable = 0;
    public static final SleepHistoryPersonalization INSTANCE = new SleepHistoryPersonalization();
    private static final String KEY_DEEP_CALM = "deep_calm";
    private static final String KEY_MOVE_AWAKE = "move_awake";
    private static final String KEY_NIGHTS = "nights";
    private static final String KEY_RESTLESS_EMA = "restless_ema";
    private static final String KEY_SNORE_AUDIO = "snore_audio";
    private static final String PREFS = "sleep_history_profile";

    private static final float recordSavedNight$ema(float f, float f2, float f3) {
        if (f2 <= 0.0f) {
            return f3;
        }
        return (f3 * f) + (f2 * (1.0f - f));
    }

    private SleepHistoryPersonalization() {
    }

    /* compiled from: SleepHistoryPersonalization.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/sleep/SleepHistoryPersonalization$Profile;", "", "nightsUsed", "", "movementAwakeThreshold", "", "snoreAudioThreshold", "deepCalmThreshold", "typicalRestlessness", "<init>", "(IFFFI)V", "getNightsUsed", "()I", "getMovementAwakeThreshold", "()F", "getSnoreAudioThreshold", "getDeepCalmThreshold", "getTypicalRestlessness", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Profile {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Profile DEFAULT = new Profile(0, 2.2f, 0.35f, 0.65f, 40);
        private final float deepCalmThreshold;
        private final float movementAwakeThreshold;
        private final int nightsUsed;
        private final float snoreAudioThreshold;
        private final int typicalRestlessness;

        public static /* synthetic */ Profile copy$default(Profile profile, int i, float f, float f2, float f3, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = profile.nightsUsed;
            }
            if ((i3 & 2) != 0) {
                f = profile.movementAwakeThreshold;
            }
            float f4 = f;
            if ((i3 & 4) != 0) {
                f2 = profile.snoreAudioThreshold;
            }
            float f5 = f2;
            if ((i3 & 8) != 0) {
                f3 = profile.deepCalmThreshold;
            }
            float f6 = f3;
            if ((i3 & 16) != 0) {
                i2 = profile.typicalRestlessness;
            }
            return profile.copy(i, f4, f5, f6, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNightsUsed() {
            return this.nightsUsed;
        }

        /* renamed from: component2, reason: from getter */
        public final float getMovementAwakeThreshold() {
            return this.movementAwakeThreshold;
        }

        /* renamed from: component3, reason: from getter */
        public final float getSnoreAudioThreshold() {
            return this.snoreAudioThreshold;
        }

        /* renamed from: component4, reason: from getter */
        public final float getDeepCalmThreshold() {
            return this.deepCalmThreshold;
        }

        /* renamed from: component5, reason: from getter */
        public final int getTypicalRestlessness() {
            return this.typicalRestlessness;
        }

        public final Profile copy(int nightsUsed, float movementAwakeThreshold, float snoreAudioThreshold, float deepCalmThreshold, int typicalRestlessness) {
            return new Profile(nightsUsed, movementAwakeThreshold, snoreAudioThreshold, deepCalmThreshold, typicalRestlessness);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) other;
            return this.nightsUsed == profile.nightsUsed && Float.compare(this.movementAwakeThreshold, profile.movementAwakeThreshold) == 0 && Float.compare(this.snoreAudioThreshold, profile.snoreAudioThreshold) == 0 && Float.compare(this.deepCalmThreshold, profile.deepCalmThreshold) == 0 && this.typicalRestlessness == profile.typicalRestlessness;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.nightsUsed) * 31) + Float.hashCode(this.movementAwakeThreshold)) * 31) + Float.hashCode(this.snoreAudioThreshold)) * 31) + Float.hashCode(this.deepCalmThreshold)) * 31) + Integer.hashCode(this.typicalRestlessness);
        }

        public String toString() {
            return "Profile(nightsUsed=" + this.nightsUsed + ", movementAwakeThreshold=" + this.movementAwakeThreshold + ", snoreAudioThreshold=" + this.snoreAudioThreshold + ", deepCalmThreshold=" + this.deepCalmThreshold + ", typicalRestlessness=" + this.typicalRestlessness + ")";
        }

        public Profile(int i, float f, float f2, float f3, int i2) {
            this.nightsUsed = i;
            this.movementAwakeThreshold = f;
            this.snoreAudioThreshold = f2;
            this.deepCalmThreshold = f3;
            this.typicalRestlessness = i2;
        }

        public final int getNightsUsed() {
            return this.nightsUsed;
        }

        public final float getMovementAwakeThreshold() {
            return this.movementAwakeThreshold;
        }

        public final float getSnoreAudioThreshold() {
            return this.snoreAudioThreshold;
        }

        public final float getDeepCalmThreshold() {
            return this.deepCalmThreshold;
        }

        public final int getTypicalRestlessness() {
            return this.typicalRestlessness;
        }

        /* compiled from: SleepHistoryPersonalization.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/example/rungps/sleep/SleepHistoryPersonalization$Profile$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/example/rungps/sleep/SleepHistoryPersonalization$Profile;", "getDEFAULT", "()Lcom/example/rungps/sleep/SleepHistoryPersonalization$Profile;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Profile getDEFAULT() {
                return Profile.DEFAULT;
            }
        }
    }

    public final Profile load(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        int i = sharedPreferences.getInt(KEY_NIGHTS, 0);
        if (i < 2) {
            return Profile.INSTANCE.getDEFAULT();
        }
        return new Profile(i, RangesKt.coerceIn(sharedPreferences.getFloat(KEY_MOVE_AWAKE, 2.2f), 1.6f, 3.2f), RangesKt.coerceIn(sharedPreferences.getFloat(KEY_SNORE_AUDIO, Profile.INSTANCE.getDEFAULT().getSnoreAudioThreshold()), 0.22f, 0.55f), RangesKt.coerceIn(sharedPreferences.getFloat(KEY_DEEP_CALM, 0.65f), 0.5f, 0.78f), RangesKt.coerceIn(sharedPreferences.getInt(KEY_RESTLESS_EMA, 40), 10, 90));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshFromDatabase(Context context, Continuation<? super Unit> continuation) {
        SleepHistoryPersonalization$refreshFromDatabase$1 sleepHistoryPersonalization$refreshFromDatabase$1;
        int i;
        List take;
        float f;
        String hypnogramCompact;
        if (continuation instanceof SleepHistoryPersonalization$refreshFromDatabase$1) {
            sleepHistoryPersonalization$refreshFromDatabase$1 = (SleepHistoryPersonalization$refreshFromDatabase$1) continuation;
            if ((sleepHistoryPersonalization$refreshFromDatabase$1.label & Integer.MIN_VALUE) != 0) {
                sleepHistoryPersonalization$refreshFromDatabase$1.label -= Integer.MIN_VALUE;
                Object obj = sleepHistoryPersonalization$refreshFromDatabase$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sleepHistoryPersonalization$refreshFromDatabase$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Repository repository = Repository.INSTANCE.get(context);
                    long currentTimeMillis = System.currentTimeMillis() - 3888000000L;
                    sleepHistoryPersonalization$refreshFromDatabase$1.L$0 = context;
                    sleepHistoryPersonalization$refreshFromDatabase$1.label = 1;
                    obj = repository.sleepSince(currentTimeMillis, sleepHistoryPersonalization$refreshFromDatabase$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (Context) sleepHistoryPersonalization$refreshFromDatabase$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) obj2;
                    if (SleepScoring.INSTANCE.isOvernightSource(sleepEntryEntity.getSource()) || ((hypnogramCompact = sleepEntryEntity.getHypnogramCompact()) != null && !StringsKt.isBlank(hypnogramCompact))) {
                        arrayList.add(obj2);
                    }
                }
                take = CollectionsKt.take(arrayList, 14);
                if (!take.isEmpty()) {
                    return Unit.INSTANCE;
                }
                List<SleepEntryEntity> list = take;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Integer restlessnessIndex = ((SleepEntryEntity) it.next()).getRestlessnessIndex();
                    if (restlessnessIndex != null) {
                        arrayList2.add(restlessnessIndex);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Boxing.boxFloat(((((Number) it2.next()).intValue() / 100.0f) * 1.2f) + 1.8f));
                }
                float coerceIn = RangesKt.coerceIn((float) CollectionsKt.averageOfFloat(arrayList4), 1.7f, 3.0f);
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Integer snoreEvents = ((SleepEntryEntity) it3.next()).getSnoreEvents();
                    if (snoreEvents != null) {
                        arrayList5.add(snoreEvents);
                    }
                }
                ArrayList arrayList6 = arrayList5;
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(Boxing.boxFloat(((Number) it4.next()).intValue()));
                }
                ArrayList arrayList8 = arrayList7;
                if (arrayList8.isEmpty()) {
                    f = Profile.INSTANCE.getDEFAULT().getSnoreAudioThreshold();
                } else {
                    float averageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList8);
                    f = averageOfFloat < 5.0f ? 0.4f : averageOfFloat > 40.0f ? 0.28f : 0.35f;
                }
                ArrayList arrayList9 = new ArrayList();
                for (SleepEntryEntity sleepEntryEntity2 : list) {
                    int coerceAtLeast = RangesKt.coerceAtLeast(sleepEntryEntity2.getTotalSleepMin(), 1);
                    Float boxFloat = sleepEntryEntity2.getDeepSleepMin() != null ? Boxing.boxFloat((r7.intValue() * 100.0f) / coerceAtLeast) : null;
                    if (boxFloat != null) {
                        arrayList9.add(boxFloat);
                    }
                }
                ArrayList arrayList10 = arrayList9;
                float coerceIn2 = arrayList10.size() >= 2 ? RangesKt.coerceIn(((((float) CollectionsKt.averageOfFloat(arrayList10)) / 100.0f) * 0.2f) + 0.55f, 0.52f, 0.75f) : 0.65f;
                ArrayList arrayList11 = new ArrayList();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    Integer restlessnessIndex2 = ((SleepEntryEntity) it5.next()).getRestlessnessIndex();
                    if (restlessnessIndex2 != null) {
                        arrayList11.add(restlessnessIndex2);
                    }
                }
                context.getSharedPreferences(PREFS, 0).edit().putInt(KEY_NIGHTS, RangesKt.coerceAtMost(take.size(), 14)).putFloat(KEY_MOVE_AWAKE, coerceIn).putFloat(KEY_SNORE_AUDIO, f).putFloat(KEY_DEEP_CALM, coerceIn2).putInt(KEY_RESTLESS_EMA, MathKt.roundToInt(CollectionsKt.averageOfInt(arrayList11))).apply();
                return Unit.INSTANCE;
            }
        }
        sleepHistoryPersonalization$refreshFromDatabase$1 = new SleepHistoryPersonalization$refreshFromDatabase$1(this, continuation);
        Object obj3 = sleepHistoryPersonalization$refreshFromDatabase$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sleepHistoryPersonalization$refreshFromDatabase$1.label;
        if (i != 0) {
        }
        ArrayList arrayList12 = new ArrayList();
        while (r9.hasNext()) {
        }
        take = CollectionsKt.take(arrayList12, 14);
        if (!take.isEmpty()) {
        }
    }

    public final void recordSavedNight(Context context, SleepEntryEntity entry) {
        float recordSavedNight$ema;
        String hypnogramCompact;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (SleepScoring.INSTANCE.isOvernightSource(entry.getSource()) || !((hypnogramCompact = entry.getHypnogramCompact()) == null || StringsKt.isBlank(hypnogramCompact))) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
            int coerceAtMost = RangesKt.coerceAtMost(sharedPreferences.getInt(KEY_NIGHTS, 0), 13);
            float f = coerceAtMost < 3 ? 0.4f : 0.2f;
            Integer restlessnessIndex = entry.getRestlessnessIndex();
            float intValue = restlessnessIndex != null ? restlessnessIndex.intValue() : 40;
            float f2 = ((intValue / 100.0f) * 1.2f) + 1.8f;
            Integer snoreEvents = entry.getSnoreEvents();
            if ((snoreEvents != null ? snoreEvents.intValue() : 0) < 3) {
                recordSavedNight$ema = recordSavedNight$ema(f, sharedPreferences.getFloat(KEY_SNORE_AUDIO, 0.35f), 0.38f);
            } else {
                Integer snoreEvents2 = entry.getSnoreEvents();
                recordSavedNight$ema = (snoreEvents2 != null ? snoreEvents2.intValue() : 0) > 25 ? recordSavedNight$ema(f, sharedPreferences.getFloat(KEY_SNORE_AUDIO, 0.35f), 0.3f) : sharedPreferences.getFloat(KEY_SNORE_AUDIO, 0.35f);
            }
            sharedPreferences.edit().putInt(KEY_NIGHTS, RangesKt.coerceAtMost(coerceAtMost + 1, 14)).putFloat(KEY_MOVE_AWAKE, recordSavedNight$ema(f, sharedPreferences.getFloat(KEY_MOVE_AWAKE, 2.2f), f2)).putFloat(KEY_SNORE_AUDIO, recordSavedNight$ema).putFloat(KEY_DEEP_CALM, recordSavedNight$ema(f, sharedPreferences.getFloat(KEY_DEEP_CALM, 0.65f), RangesKt.coerceIn((((((entry.getDeepSleepMin() != null ? r14.intValue() : 0) * 100.0f) / RangesKt.coerceAtLeast(entry.getTotalSleepMin(), 1)) / 100.0f) * 0.2f) + 0.55f, 0.5f, 0.75f))).putInt(KEY_RESTLESS_EMA, MathKt.roundToInt(recordSavedNight$ema(f, sharedPreferences.getInt(KEY_RESTLESS_EMA, 40), intValue))).apply();
        }
    }
}
