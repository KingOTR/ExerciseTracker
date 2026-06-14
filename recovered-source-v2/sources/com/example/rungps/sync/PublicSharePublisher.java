package com.example.rungps.sync;

import android.content.Context;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PublicSharePublisher.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005Jþ\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u001e\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00160\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u001c\b\u0002\u0010\u001f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010 \u0018\u00010\u00152\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010 \u0018\u00010\u00152\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/example/rungps/sync/PublicSharePublisher;", "", "<init>", "()V", "PREFS", "", "KEY_TOKEN", "existingToken", "context", "Landroid/content/Context;", "shareUrl", "token", "publishSummary", "Lcom/example/rungps/sync/PublicSharePublisher$PublishResult;", "displayName", "combinedLoad", "", "weeklyGymKg", "", "runKm7d", "topPrs", "", "Lkotlin/Triple;", "coachHeadline", "readiness", "sleepAvgHours", "restingHrBpm", "gymSessions7d", "gymSets7d", "gymAttendanceLabel", "gymAttendancePct", "gymMuscleTop", "", "gymWeeklyBars", "gymLastSession", "(Landroid/content/Context;Ljava/lang/String;IDDLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PublishResult", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PublicSharePublisher {
    public static final int $stable = 0;
    public static final PublicSharePublisher INSTANCE = new PublicSharePublisher();
    private static final String KEY_TOKEN = "share_token";
    private static final String PREFS = "public_share";

    private PublicSharePublisher() {
    }

    /* compiled from: PublicSharePublisher.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/sync/PublicSharePublisher$PublishResult;", "", "token", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getErrorMessage", "success", "", "getSuccess", "()Z", "component1", "component2", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PublishResult {
        public static final int $stable = 0;
        private final String errorMessage;
        private final String token;

        public static /* synthetic */ PublishResult copy$default(PublishResult publishResult, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = publishResult.token;
            }
            if ((i & 2) != 0) {
                str2 = publishResult.errorMessage;
            }
            return publishResult.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final PublishResult copy(String token, String errorMessage) {
            return new PublishResult(token, errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PublishResult)) {
                return false;
            }
            PublishResult publishResult = (PublishResult) other;
            return Intrinsics.areEqual(this.token, publishResult.token) && Intrinsics.areEqual(this.errorMessage, publishResult.errorMessage);
        }

        public int hashCode() {
            String str = this.token;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.errorMessage;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "PublishResult(token=" + this.token + ", errorMessage=" + this.errorMessage + ")";
        }

        public PublishResult(String str, String str2) {
            this.token = str;
            this.errorMessage = str2;
        }

        public final String getToken() {
            return this.token;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean getSuccess() {
            return this.token != null;
        }
    }

    public final String existingToken(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getString(KEY_TOKEN, null);
    }

    public final String shareUrl(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return "https://exercise-tracker-2936d.web.app/?share=" + token;
    }

    public final Object publishSummary(Context context, String str, int i, double d, double d2, List<Triple<String, Double, Double>> list, String str2, String str3, Double d3, Integer num, Integer num2, Integer num3, String str4, Integer num4, List<? extends Map<String, ? extends Object>> list2, List<? extends Map<String, ? extends Object>> list3, String str5, Continuation<? super PublishResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new PublicSharePublisher$publishSummary$2(context, list, str, i, d, d2, str2, str3, d3, num, num2, num3, str4, num4, list2, list3, str5, null), continuation);
    }
}
