package com.example.rungps.gym;

import android.content.Context;
import android.content.SharedPreferences;
import com.caverock.androidsvg.SVGParser;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: GymPulleyStore.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\fJ&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J.\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001aJ\u001e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J&\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001aJ\u0016\u0010 \u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\u001e\u0010!\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\fJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0016\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0016\u0010&\u001a\u00020\u00052\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010'\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/example/rungps/gym/GymPulleyStore;", "", "<init>", "()V", "PREFS", "", "KEY_SESSION_PREFIX", "KEY_LAST_PREFIX", "KEY_LAST_EX_PREFIX", "KEY_SESSION_EX_PREFIX", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "Lcom/example/rungps/gym/GymPulleyStore$Config;", "chooserOptions", "configById", "id", "getForSession", "context", "Landroid/content/Context;", "sessionId", "", "gymKey", "setForSession", "", "config", "getForSessionExercise", "Lcom/example/rungps/gym/GymPulleySelection;", "exerciseKey", "setForSessionExercise", "selection", "getLastUsedForExercise", "setLastUsedForExercise", "getLastUsed", "setLastUsed", "effectiveKg", "", "pinKg", "formatEffective", "formatEffectiveOrSame", "canonKey", "Config", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymPulleyStore {
    public static final int $stable = 0;
    public static final GymPulleyStore INSTANCE = new GymPulleyStore();
    private static final String KEY_LAST_EX_PREFIX = "ex_";
    private static final String KEY_LAST_PREFIX = "last_";
    private static final String KEY_SESSION_EX_PREFIX = "session_ex_";
    private static final String KEY_SESSION_PREFIX = "session_";
    private static final String PREFS = "gym_pulley";

    private GymPulleyStore() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GymPulleyStore.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/gym/GymPulleyStore$Config;", "", "id", "", "label", "effectiveRatio", "", "hint", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLabel", "getEffectiveRatio", "()F", "getHint", "NONE", "TOP", "BOTTOM", "LOW", "DOUBLE", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Config {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Config[] $VALUES;
        private final float effectiveRatio;
        private final String hint;
        private final String id;
        private final String label;
        public static final Config NONE = new Config("NONE", 0, "none", "Normal stack", 1.0f, "No cable pulley — pin ≈ load");
        public static final Config TOP = new Config("TOP", 1, "top", "Top pulley", 1.0f, "Pin ≈ stack load");
        public static final Config BOTTOM = new Config("BOTTOM", 2, "bottom", "Bottom pulley", 0.5f, "Pin ≈ half effective load");
        public static final Config LOW = new Config("LOW", 3, "low", "Low pulley", 0.67f, "Pin ≈ 67% effective load");
        public static final Config DOUBLE = new Config("DOUBLE", 4, "double", "Double cable", 2.0f, "Pin ≈ 2× effective load");

        private static final /* synthetic */ Config[] $values() {
            return new Config[]{NONE, TOP, BOTTOM, LOW, DOUBLE};
        }

        public static EnumEntries<Config> getEntries() {
            return $ENTRIES;
        }

        private Config(String str, int i, String str2, String str3, float f, String str4) {
            this.id = str2;
            this.label = str3;
            this.effectiveRatio = f;
            this.hint = str4;
        }

        public final String getId() {
            return this.id;
        }

        public final String getLabel() {
            return this.label;
        }

        public final float getEffectiveRatio() {
            return this.effectiveRatio;
        }

        public final String getHint() {
            return this.hint;
        }

        static {
            Config[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Config valueOf(String str) {
            return (Config) Enum.valueOf(Config.class, str);
        }

        public static Config[] values() {
            return (Config[]) $VALUES.clone();
        }
    }

    public final List<Config> all() {
        return Config.getEntries();
    }

    public final List<Config> chooserOptions() {
        return Config.getEntries();
    }

    public final Config configById(String id) {
        Object obj;
        Iterator<E> it = Config.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Config) obj).getId(), id)) {
                break;
            }
        }
        Config config = (Config) obj;
        return config == null ? Config.NONE : config;
    }

    public final Config getForSession(Context context, long sessionId, long gymKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_SESSION_PREFIX + sessionId, null);
        if (string != null) {
            return configById(string);
        }
        return getLastUsed(context, gymKey);
    }

    public final void setForSession(Context context, long sessionId, long gymKey, Config config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_SESSION_PREFIX + sessionId, config.getId()).apply();
        setLastUsed(context, gymKey, config);
    }

    public final GymPulleySelection getForSessionExercise(Context context, long sessionId, String exerciseKey, long gymKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exerciseKey, "exerciseKey");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_SESSION_EX_PREFIX + sessionId + "_" + canonKey(exerciseKey), null);
        if (string != null) {
            return GymPulleySelection.INSTANCE.fromIds(string);
        }
        return getLastUsedForExercise(context, exerciseKey, gymKey);
    }

    public final void setForSessionExercise(Context context, long sessionId, String exerciseKey, long gymKey, GymPulleySelection selection) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exerciseKey, "exerciseKey");
        Intrinsics.checkNotNullParameter(selection, "selection");
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_SESSION_EX_PREFIX + sessionId + "_" + canonKey(exerciseKey), GymPulleySelection.INSTANCE.toIds(selection)).apply();
        setLastUsedForExercise(context, exerciseKey, gymKey, selection);
    }

    public final GymPulleySelection getLastUsedForExercise(Context context, String exerciseKey, long gymKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exerciseKey, "exerciseKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        String string = sharedPreferences.getString(KEY_LAST_EX_PREFIX + gymKey + "_" + canonKey(exerciseKey), null);
        String str = string;
        if (str != null && !StringsKt.isBlank(str)) {
            return GymPulleySelection.INSTANCE.fromIds(string);
        }
        String string2 = sharedPreferences.getString(KEY_LAST_EX_PREFIX + canonKey(exerciseKey), null);
        String str2 = string2;
        return (str2 == null || StringsKt.isBlank(str2)) ? GymPulleySelection.INSTANCE.fromIds(getLastUsed(context, gymKey).getId()) : GymPulleySelection.INSTANCE.fromIds(string2);
    }

    public final void setLastUsedForExercise(Context context, String exerciseKey, long gymKey, GymPulleySelection selection) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exerciseKey, "exerciseKey");
        Intrinsics.checkNotNullParameter(selection, "selection");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        String ids = GymPulleySelection.INSTANCE.toIds(selection);
        sharedPreferences.edit().putString(KEY_LAST_EX_PREFIX + canonKey(exerciseKey), ids).putString(KEY_LAST_EX_PREFIX + gymKey + "_" + canonKey(exerciseKey), ids).apply();
    }

    public final Config getLastUsed(Context context, long gymKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        return configById(context.getSharedPreferences(PREFS, 0).getString(KEY_LAST_PREFIX + gymKey, Config.NONE.getId()));
    }

    public final void setLastUsed(Context context, long gymKey, Config config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_LAST_PREFIX + gymKey, config.getId()).apply();
    }

    public final double effectiveKg(double pinKg, GymPulleySelection selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        return pinKg * selection.getEffectiveRatio();
    }

    public final String formatEffective(double pinKg, GymPulleySelection selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        double effectiveKg = effectiveKg(pinKg, selection);
        if (selection.getEffectiveRatio() == 1.0f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%.1f kg", Arrays.copyOf(new Object[]{Double.valueOf(pinKg)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(Locale.US, "%.1f kg pin → %.1f kg load (%s)", Arrays.copyOf(new Object[]{Double.valueOf(pinKg), Double.valueOf(effectiveKg), selection.label()}, 3));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public final String formatEffectiveOrSame(double pinKg, GymPulleySelection selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        if (selection.getEffectiveRatio() != 1.0f) {
            return formatEffective(pinKg, selection);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f kg", Arrays.copyOf(new Object[]{Double.valueOf(pinKg)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final String canonKey(String exerciseKey) {
        String obj = StringsKt.trim((CharSequence) exerciseKey).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return StringsKt.take(new Regex("\\s+").replace(lowerCase, "_"), 64);
    }
}
