package com.example.rungps.training;

import android.content.Context;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.example.rungps.tracking.TrackingService;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: GymGoalsStore.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/training/GymGoalsStore;", "", "<init>", "()V", "PREFS", "", "KEY_JSON", "load", "Lcom/example/rungps/training/GymGoal;", "context", "Landroid/content/Context;", TrackingService.BATTERY_SAVE, "", "goal", CervicalMucusRecord.Appearance.CLEAR, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymGoalsStore {
    public static final int $stable = 0;
    public static final GymGoalsStore INSTANCE = new GymGoalsStore();
    private static final String KEY_JSON = "active_goal";
    private static final String PREFS = "gym_goals";

    private GymGoalsStore() {
    }

    public final GymGoal load(Context context) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_JSON, null);
        if (string == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            GymGoalsStore gymGoalsStore = this;
            JSONObject jSONObject = new JSONObject(string);
            String string2 = jSONObject.getString("exercise");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            double d = jSONObject.getDouble("weightKg");
            int optInt = jSONObject.optInt("reps", 1);
            Long valueOf = Long.valueOf(jSONObject.optLong("deadlineMs", 0L));
            m7905constructorimpl = Result.m7905constructorimpl(new GymGoal(string2, d, optInt, valueOf.longValue() > 0 ? valueOf : null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return (GymGoal) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
    }

    public final void save(Context context, GymGoal goal) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(goal, "goal");
        JSONObject put = new JSONObject().put("exercise", goal.getExerciseName()).put("weightKg", goal.getTargetWeightKg()).put("reps", goal.getTargetReps());
        Long deadlineMs = goal.getDeadlineMs();
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_JSON, put.put("deadlineMs", deadlineMs != null ? deadlineMs.longValue() : 0L).toString()).apply();
    }

    public final void clear(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().remove(KEY_JSON).apply();
    }
}
