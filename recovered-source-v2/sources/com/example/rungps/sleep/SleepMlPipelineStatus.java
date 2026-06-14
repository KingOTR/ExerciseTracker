package com.example.rungps.sleep;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepMlPipelineStatus.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/example/rungps/sleep/SleepMlPipelineStatus;", "", "<init>", "()V", "load", "Lcom/example/rungps/sleep/SleepMlPipelineStatus$Status;", "context", "Landroid/content/Context;", "summaryLine", "", NotificationCompat.CATEGORY_STATUS, "Status", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepMlPipelineStatus {
    public static final int $stable = 0;
    public static final SleepMlPipelineStatus INSTANCE = new SleepMlPipelineStatus();

    private SleepMlPipelineStatus() {
    }

    /* compiled from: SleepMlPipelineStatus.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006!"}, d2 = {"Lcom/example/rungps/sleep/SleepMlPipelineStatus$Status;", "", "yamnetLoaded", "", "stagingV2Loaded", "mlpLoaded", "sampleRateHz", "", "eventMode", "", "stagingMode", "<init>", "(ZZZILjava/lang/String;Ljava/lang/String;)V", "getYamnetLoaded", "()Z", "getStagingV2Loaded", "getMlpLoaded", "getSampleRateHz", "()I", "getEventMode", "()Ljava/lang/String;", "getStagingMode", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;
        private final String eventMode;
        private final boolean mlpLoaded;
        private final int sampleRateHz;
        private final String stagingMode;
        private final boolean stagingV2Loaded;
        private final boolean yamnetLoaded;

        public static /* synthetic */ Status copy$default(Status status, boolean z, boolean z2, boolean z3, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = status.yamnetLoaded;
            }
            if ((i2 & 2) != 0) {
                z2 = status.stagingV2Loaded;
            }
            boolean z4 = z2;
            if ((i2 & 4) != 0) {
                z3 = status.mlpLoaded;
            }
            boolean z5 = z3;
            if ((i2 & 8) != 0) {
                i = status.sampleRateHz;
            }
            int i3 = i;
            if ((i2 & 16) != 0) {
                str = status.eventMode;
            }
            String str3 = str;
            if ((i2 & 32) != 0) {
                str2 = status.stagingMode;
            }
            return status.copy(z, z4, z5, i3, str3, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getYamnetLoaded() {
            return this.yamnetLoaded;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getStagingV2Loaded() {
            return this.stagingV2Loaded;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getMlpLoaded() {
            return this.mlpLoaded;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSampleRateHz() {
            return this.sampleRateHz;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEventMode() {
            return this.eventMode;
        }

        /* renamed from: component6, reason: from getter */
        public final String getStagingMode() {
            return this.stagingMode;
        }

        public final Status copy(boolean yamnetLoaded, boolean stagingV2Loaded, boolean mlpLoaded, int sampleRateHz, String eventMode, String stagingMode) {
            Intrinsics.checkNotNullParameter(eventMode, "eventMode");
            Intrinsics.checkNotNullParameter(stagingMode, "stagingMode");
            return new Status(yamnetLoaded, stagingV2Loaded, mlpLoaded, sampleRateHz, eventMode, stagingMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return this.yamnetLoaded == status.yamnetLoaded && this.stagingV2Loaded == status.stagingV2Loaded && this.mlpLoaded == status.mlpLoaded && this.sampleRateHz == status.sampleRateHz && Intrinsics.areEqual(this.eventMode, status.eventMode) && Intrinsics.areEqual(this.stagingMode, status.stagingMode);
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.yamnetLoaded) * 31) + Boolean.hashCode(this.stagingV2Loaded)) * 31) + Boolean.hashCode(this.mlpLoaded)) * 31) + Integer.hashCode(this.sampleRateHz)) * 31) + this.eventMode.hashCode()) * 31) + this.stagingMode.hashCode();
        }

        public String toString() {
            return "Status(yamnetLoaded=" + this.yamnetLoaded + ", stagingV2Loaded=" + this.stagingV2Loaded + ", mlpLoaded=" + this.mlpLoaded + ", sampleRateHz=" + this.sampleRateHz + ", eventMode=" + this.eventMode + ", stagingMode=" + this.stagingMode + ")";
        }

        public Status(boolean z, boolean z2, boolean z3, int i, String eventMode, String stagingMode) {
            Intrinsics.checkNotNullParameter(eventMode, "eventMode");
            Intrinsics.checkNotNullParameter(stagingMode, "stagingMode");
            this.yamnetLoaded = z;
            this.stagingV2Loaded = z2;
            this.mlpLoaded = z3;
            this.sampleRateHz = i;
            this.eventMode = eventMode;
            this.stagingMode = stagingMode;
        }

        public final boolean getYamnetLoaded() {
            return this.yamnetLoaded;
        }

        public final boolean getStagingV2Loaded() {
            return this.stagingV2Loaded;
        }

        public final boolean getMlpLoaded() {
            return this.mlpLoaded;
        }

        public final int getSampleRateHz() {
            return this.sampleRateHz;
        }

        public final String getEventMode() {
            return this.eventMode;
        }

        public final String getStagingMode() {
            return this.stagingMode;
        }
    }

    public final Status load(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        SleepMlClassifier.INSTANCE.ensureLoaded(context);
        boolean isLoaded = SleepMlClassifier.INSTANCE.isLoaded();
        SleepTfliteRunner sleepTfliteRunner = new SleepTfliteRunner(SleepTfliteRunner.ASSET_STAGING_V2);
        sleepTfliteRunner.ensureLoaded(context);
        boolean isLoaded2 = sleepTfliteRunner.isLoaded();
        SleepTfliteRunner sleepTfliteRunner2 = new SleepTfliteRunner(SleepTfliteRunner.ASSET_YAMNET);
        sleepTfliteRunner2.ensureLoaded(context);
        boolean isLoaded3 = sleepTfliteRunner2.isLoaded();
        String str2 = isLoaded3 ? "YAMNet TFLite" : "Bedside heuristics (snore/talk/cough/noise)";
        if (isLoaded2) {
            str = "Mel epoch TFLite";
        } else if (isLoaded) {
            str = "Distilled MLP + Mel features";
        } else {
            str = "Rule-based staging";
        }
        return new Status(isLoaded3, isLoaded2, isLoaded, SleepAudioConstants.SAMPLE_RATE_V2, str2, str);
    }

    public final String summaryLine(Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return status.getEventMode() + " · " + status.getStagingMode() + " @ " + (status.getSampleRateHz() / 1000) + " kHz";
    }
}
