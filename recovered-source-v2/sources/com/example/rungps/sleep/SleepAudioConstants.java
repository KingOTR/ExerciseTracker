package com.example.rungps.sleep;

import kotlin.Metadata;

/* compiled from: SleepMelFeatureExtractor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/sleep/SleepAudioConstants;", "", "<init>", "()V", "SAMPLE_RATE_V1", "", "SAMPLE_RATE_V2", "BUCKET_MS", "", "EPOCH_BUCKETS", "EPOCH_MS", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAudioConstants {
    public static final int $stable = 0;
    public static final long BUCKET_MS = 10000;
    public static final int EPOCH_BUCKETS = 3;
    public static final long EPOCH_MS = 30000;
    public static final SleepAudioConstants INSTANCE = new SleepAudioConstants();
    public static final int SAMPLE_RATE_V1 = 8000;
    public static final int SAMPLE_RATE_V2 = 16000;

    private SleepAudioConstants() {
    }
}
