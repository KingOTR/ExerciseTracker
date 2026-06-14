package com.example.rungps.notify;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.compose.ui.layout.LayoutKt;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.example.rungps.data.ExercisePr;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: PrNotifier.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J'\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J<\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/notify/PrNotifier;", "", "<init>", "()V", "CHANNEL_ID", "", "ensureChannel", "", "context", "Landroid/content/Context;", "beatsHeaviestSet", "", "best", "Lcom/example/rungps/data/ExercisePr;", "weightKg", "", "reps", "", "(Lcom/example/rungps/data/ExercisePr;DLjava/lang/Integer;)Z", "maybeNotifyPr", "exerciseName", "previousBest", "(Landroid/content/Context;Ljava/lang/String;DLjava/lang/Integer;Lcom/example/rungps/data/ExercisePr;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e1rm", "weight", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrNotifier {
    public static final int $stable = 0;
    private static final String CHANNEL_ID = "pr_alerts";
    public static final PrNotifier INSTANCE = new PrNotifier();

    private PrNotifier() {
    }

    private final void ensureChannel(Context context) {
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel(CHANNEL_ID) != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Personal records", 3);
        notificationChannel.setDescription("New lift PRs");
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public final boolean beatsHeaviestSet(ExercisePr best, double weightKg, Integer reps) {
        if (weightKg <= 0.0d) {
            return false;
        }
        int intValue = reps != null ? reps.intValue() : 0;
        if (intValue <= 0) {
            return false;
        }
        if (best == null || weightKg > best.getWeightKg() + 0.05d) {
            return true;
        }
        if (weightKg < best.getWeightKg() - 0.05d) {
            return false;
        }
        Integer reps2 = best.getReps();
        return intValue > (reps2 != null ? reps2.intValue() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01b2, code lost:
    
        if (r3 == null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object maybeNotifyPr(Context context, String str, double d, Integer num, ExercisePr exercisePr, Continuation<? super Unit> continuation) {
        PrNotifier$maybeNotifyPr$1 prNotifier$maybeNotifyPr$1;
        int i;
        PrNotifier prNotifier;
        int i2;
        ExercisePr exercisePr2;
        String str2;
        Context context2;
        PrNotifier prNotifier2;
        String str3;
        double d2;
        ExercisePr exercisePr3;
        String str4;
        String str5;
        Context context3 = context;
        String str6 = str;
        double d3 = d;
        Integer num2 = num;
        if (continuation instanceof PrNotifier$maybeNotifyPr$1) {
            prNotifier$maybeNotifyPr$1 = (PrNotifier$maybeNotifyPr$1) continuation;
            if ((prNotifier$maybeNotifyPr$1.label & Integer.MIN_VALUE) != 0) {
                prNotifier$maybeNotifyPr$1.label -= Integer.MIN_VALUE;
                Object obj = prNotifier$maybeNotifyPr$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = prNotifier$maybeNotifyPr$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (d3 <= 0.0d) {
                        return Unit.INSTANCE;
                    }
                    int intValue = num2 != null ? num.intValue() : 0;
                    if (intValue <= 0) {
                        return Unit.INSTANCE;
                    }
                    if (exercisePr == null) {
                        CoroutineDispatcher io2 = Dispatchers.getIO();
                        PrNotifier$maybeNotifyPr$prior$1 prNotifier$maybeNotifyPr$prior$1 = new PrNotifier$maybeNotifyPr$prior$1(context3, str6, null);
                        prNotifier$maybeNotifyPr$1.L$0 = this;
                        prNotifier$maybeNotifyPr$1.L$1 = context3;
                        prNotifier$maybeNotifyPr$1.L$2 = str6;
                        prNotifier$maybeNotifyPr$1.L$3 = num2;
                        prNotifier$maybeNotifyPr$1.D$0 = d3;
                        prNotifier$maybeNotifyPr$1.I$0 = intValue;
                        prNotifier$maybeNotifyPr$1.label = 1;
                        Object withContext = BuildersKt.withContext(io2, prNotifier$maybeNotifyPr$prior$1, prNotifier$maybeNotifyPr$1);
                        if (withContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        prNotifier = this;
                        i2 = intValue;
                        obj = withContext;
                    } else {
                        prNotifier = this;
                        i2 = intValue;
                        exercisePr2 = exercisePr;
                        if (!prNotifier.beatsHeaviestSet(exercisePr2, d3, num2)) {
                            return Unit.INSTANCE;
                        }
                        double e1rm = prNotifier.e1rm(d3, i2);
                        SharedPreferences sharedPreferences = context3.getSharedPreferences("pr_notify", 0);
                        String lowerCase = str6.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        str2 = "toLowerCase(...)";
                        sharedPreferences.edit().putFloat("last_" + lowerCase, (float) e1rm).apply();
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        PrNotifier$maybeNotifyPr$2 prNotifier$maybeNotifyPr$2 = new PrNotifier$maybeNotifyPr$2(str6, d3, num2, e1rm, null);
                        prNotifier$maybeNotifyPr$1.L$0 = prNotifier;
                        prNotifier$maybeNotifyPr$1.L$1 = context3;
                        prNotifier$maybeNotifyPr$1.L$2 = str6;
                        prNotifier$maybeNotifyPr$1.L$3 = exercisePr2;
                        prNotifier$maybeNotifyPr$1.D$0 = d3;
                        prNotifier$maybeNotifyPr$1.I$0 = i2;
                        prNotifier$maybeNotifyPr$1.label = 2;
                        if (BuildersKt.withContext(main, prNotifier$maybeNotifyPr$2, prNotifier$maybeNotifyPr$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        context2 = context3;
                        prNotifier2 = prNotifier;
                        str3 = str6;
                        d2 = d3;
                        exercisePr3 = exercisePr2;
                        if (Build.VERSION.SDK_INT < 33) {
                        }
                        prNotifier2.ensureChannel(context2);
                        int hashCode = (str3.hashCode() & LayoutKt.LargeDimension) + 4403;
                        String lowerCase2 = StringsKt.trim((CharSequence) str3).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, str2);
                        str4 = "pr:" + lowerCase2;
                        if (AppNotifications.INSTANCE.shouldPost(context2, str4)) {
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2 = prNotifier$maybeNotifyPr$1.I$0;
                        d2 = prNotifier$maybeNotifyPr$1.D$0;
                        exercisePr3 = (ExercisePr) prNotifier$maybeNotifyPr$1.L$3;
                        str3 = (String) prNotifier$maybeNotifyPr$1.L$2;
                        Context context4 = (Context) prNotifier$maybeNotifyPr$1.L$1;
                        PrNotifier prNotifier3 = (PrNotifier) prNotifier$maybeNotifyPr$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        context2 = context4;
                        prNotifier2 = prNotifier3;
                        str2 = "toLowerCase(...)";
                        if (Build.VERSION.SDK_INT < 33 && ContextCompat.checkSelfPermission(context2, "android.permission.POST_NOTIFICATIONS") != 0) {
                            return Unit.INSTANCE;
                        }
                        prNotifier2.ensureChannel(context2);
                        int hashCode2 = (str3.hashCode() & LayoutKt.LargeDimension) + 4403;
                        String lowerCase22 = StringsKt.trim((CharSequence) str3).toString().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase22, str2);
                        str4 = "pr:" + lowerCase22;
                        if (AppNotifications.INSTANCE.shouldPost(context2, str4)) {
                            return Unit.INSTANCE;
                        }
                        if (exercisePr3 != null) {
                            double weightKg = exercisePr3.getWeightKg();
                            Integer reps = exercisePr3.getReps();
                            str5 = weightKg + " kg × " + (reps != null ? reps.intValue() : 1);
                        }
                        str5 = "none";
                        NotificationCompat.Builder contentTitle = new NotificationCompat.Builder(context2, CHANNEL_ID).setSmallIcon(R.drawable.star_on).setContentTitle("New PR: " + str3);
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format(Locale.US, "%.1f kg × %d (was %s)", Arrays.copyOf(new Object[]{Boxing.boxDouble(d2), Boxing.boxInt(i2), str5}, 3));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        NotificationCompat.Builder contentText = contentTitle.setContentText(format);
                        Intrinsics.checkNotNullExpressionValue(contentText, "setContentText(...)");
                        PrNotifier prNotifier4 = prNotifier2;
                        AppNotifications.INSTANCE.applyOpenAndDismiss(context2, contentText, hashCode2, str4, hashCode2, (r17 & 32) != 0 ? null : "gym", (r17 & 64) != 0 ? MapsKt.emptyMap() : null);
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            PrNotifier prNotifier5 = prNotifier4;
                            NotificationManagerCompat.from(context2).notify(hashCode2, contentText.build());
                            Result.m7905constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th));
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = prNotifier$maybeNotifyPr$1.I$0;
                    double d4 = prNotifier$maybeNotifyPr$1.D$0;
                    Integer num3 = (Integer) prNotifier$maybeNotifyPr$1.L$3;
                    String str7 = (String) prNotifier$maybeNotifyPr$1.L$2;
                    Context context5 = (Context) prNotifier$maybeNotifyPr$1.L$1;
                    prNotifier = (PrNotifier) prNotifier$maybeNotifyPr$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    num2 = num3;
                    str6 = str7;
                    d3 = d4;
                    context3 = context5;
                }
                exercisePr2 = (ExercisePr) obj;
                if (!prNotifier.beatsHeaviestSet(exercisePr2, d3, num2)) {
                }
            }
        }
        prNotifier$maybeNotifyPr$1 = new PrNotifier$maybeNotifyPr$1(this, continuation);
        Object obj2 = prNotifier$maybeNotifyPr$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = prNotifier$maybeNotifyPr$1.label;
        if (i != 0) {
        }
        exercisePr2 = (ExercisePr) obj2;
        if (!prNotifier.beatsHeaviestSet(exercisePr2, d3, num2)) {
        }
    }

    private final double e1rm(double weight, int reps) {
        return (reps > 0 && reps != 1) ? weight * ((RangesKt.coerceAtMost(reps, 36) / 30.0d) + 1.0d) : weight;
    }
}
