package com.example.rungps.ble;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.MoyoungImportStats;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010C\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010,J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010F\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010H\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u00105J\t\u0010I\u001a\u00020\u0003HÆ\u0003Jà\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u00032\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u0012HÖ\u0001J\t\u0010O\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010-\u001a\u0004\b.\u0010,R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010-\u001a\u0004\b0\u0010,R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010-\u001a\u0004\b3\u0010,R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001f¨\u0006P"}, d2 = {"Lcom/example/rungps/ble/BleStatus;", "", "enabled", "", "scanning", "connectingTo", "", "connectedAddress", "lastError", "devices", "", "Lcom/example/rungps/ble/BleScanDevice;", "services", "Lcom/example/rungps/ble/BleGattServiceInfo;", "hasHeartRateService", "hasExerciseTrackerSoccerService", "hasMoyoungService", "watchSoccerState", "", "watchSoccerElapsedSec", "syncingSoccer", "lastSoccerSyncImported", "lastMoyoungImport", "Lcom/example/rungps/data/MoyoungImportStats;", "latestHrBpm", "latestHrAtMs", "", "hrTestRunning", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZLjava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Lcom/example/rungps/data/MoyoungImportStats;Ljava/lang/Integer;Ljava/lang/Long;Z)V", "getEnabled", "()Z", "getScanning", "getConnectingTo", "()Ljava/lang/String;", "getConnectedAddress", "getLastError", "getDevices", "()Ljava/util/List;", "getServices", "getHasHeartRateService", "getHasExerciseTrackerSoccerService", "getHasMoyoungService", "getWatchSoccerState", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWatchSoccerElapsedSec", "getSyncingSoccer", "getLastSoccerSyncImported", "getLastMoyoungImport", "()Lcom/example/rungps/data/MoyoungImportStats;", "getLatestHrBpm", "getLatestHrAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHrTestRunning", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZLjava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Lcom/example/rungps/data/MoyoungImportStats;Ljava/lang/Integer;Ljava/lang/Long;Z)Lcom/example/rungps/ble/BleStatus;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BleStatus {
    public static final int $stable = 8;
    private final String connectedAddress;
    private final String connectingTo;
    private final List<BleScanDevice> devices;
    private final boolean enabled;
    private final boolean hasExerciseTrackerSoccerService;
    private final boolean hasHeartRateService;
    private final boolean hasMoyoungService;
    private final boolean hrTestRunning;
    private final String lastError;
    private final MoyoungImportStats lastMoyoungImport;
    private final Integer lastSoccerSyncImported;
    private final Long latestHrAtMs;
    private final Integer latestHrBpm;
    private final boolean scanning;
    private final List<BleGattServiceInfo> services;
    private final boolean syncingSoccer;
    private final Integer watchSoccerElapsedSec;
    private final Integer watchSoccerState;

    public BleStatus() {
        this(false, false, null, null, null, null, null, false, false, false, null, null, false, null, null, null, null, false, 262143, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getHasMoyoungService() {
        return this.hasMoyoungService;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getWatchSoccerState() {
        return this.watchSoccerState;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getWatchSoccerElapsedSec() {
        return this.watchSoccerElapsedSec;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getSyncingSoccer() {
        return this.syncingSoccer;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getLastSoccerSyncImported() {
        return this.lastSoccerSyncImported;
    }

    /* renamed from: component15, reason: from getter */
    public final MoyoungImportStats getLastMoyoungImport() {
        return this.lastMoyoungImport;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getLatestHrBpm() {
        return this.latestHrBpm;
    }

    /* renamed from: component17, reason: from getter */
    public final Long getLatestHrAtMs() {
        return this.latestHrAtMs;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getHrTestRunning() {
        return this.hrTestRunning;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getScanning() {
        return this.scanning;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConnectingTo() {
        return this.connectingTo;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConnectedAddress() {
        return this.connectedAddress;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLastError() {
        return this.lastError;
    }

    public final List<BleScanDevice> component6() {
        return this.devices;
    }

    public final List<BleGattServiceInfo> component7() {
        return this.services;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasHeartRateService() {
        return this.hasHeartRateService;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasExerciseTrackerSoccerService() {
        return this.hasExerciseTrackerSoccerService;
    }

    public final BleStatus copy(boolean enabled, boolean scanning, String connectingTo, String connectedAddress, String lastError, List<BleScanDevice> devices, List<BleGattServiceInfo> services, boolean hasHeartRateService, boolean hasExerciseTrackerSoccerService, boolean hasMoyoungService, Integer watchSoccerState, Integer watchSoccerElapsedSec, boolean syncingSoccer, Integer lastSoccerSyncImported, MoyoungImportStats lastMoyoungImport, Integer latestHrBpm, Long latestHrAtMs, boolean hrTestRunning) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        Intrinsics.checkNotNullParameter(services, "services");
        return new BleStatus(enabled, scanning, connectingTo, connectedAddress, lastError, devices, services, hasHeartRateService, hasExerciseTrackerSoccerService, hasMoyoungService, watchSoccerState, watchSoccerElapsedSec, syncingSoccer, lastSoccerSyncImported, lastMoyoungImport, latestHrBpm, latestHrAtMs, hrTestRunning);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleStatus)) {
            return false;
        }
        BleStatus bleStatus = (BleStatus) other;
        return this.enabled == bleStatus.enabled && this.scanning == bleStatus.scanning && Intrinsics.areEqual(this.connectingTo, bleStatus.connectingTo) && Intrinsics.areEqual(this.connectedAddress, bleStatus.connectedAddress) && Intrinsics.areEqual(this.lastError, bleStatus.lastError) && Intrinsics.areEqual(this.devices, bleStatus.devices) && Intrinsics.areEqual(this.services, bleStatus.services) && this.hasHeartRateService == bleStatus.hasHeartRateService && this.hasExerciseTrackerSoccerService == bleStatus.hasExerciseTrackerSoccerService && this.hasMoyoungService == bleStatus.hasMoyoungService && Intrinsics.areEqual(this.watchSoccerState, bleStatus.watchSoccerState) && Intrinsics.areEqual(this.watchSoccerElapsedSec, bleStatus.watchSoccerElapsedSec) && this.syncingSoccer == bleStatus.syncingSoccer && Intrinsics.areEqual(this.lastSoccerSyncImported, bleStatus.lastSoccerSyncImported) && Intrinsics.areEqual(this.lastMoyoungImport, bleStatus.lastMoyoungImport) && Intrinsics.areEqual(this.latestHrBpm, bleStatus.latestHrBpm) && Intrinsics.areEqual(this.latestHrAtMs, bleStatus.latestHrAtMs) && this.hrTestRunning == bleStatus.hrTestRunning;
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.scanning)) * 31;
        String str = this.connectingTo;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.connectedAddress;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastError;
        int hashCode4 = (((((((((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.devices.hashCode()) * 31) + this.services.hashCode()) * 31) + Boolean.hashCode(this.hasHeartRateService)) * 31) + Boolean.hashCode(this.hasExerciseTrackerSoccerService)) * 31) + Boolean.hashCode(this.hasMoyoungService)) * 31;
        Integer num = this.watchSoccerState;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.watchSoccerElapsedSec;
        int hashCode6 = (((hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31) + Boolean.hashCode(this.syncingSoccer)) * 31;
        Integer num3 = this.lastSoccerSyncImported;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        MoyoungImportStats moyoungImportStats = this.lastMoyoungImport;
        int hashCode8 = (hashCode7 + (moyoungImportStats == null ? 0 : moyoungImportStats.hashCode())) * 31;
        Integer num4 = this.latestHrBpm;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l = this.latestHrAtMs;
        return ((hashCode9 + (l != null ? l.hashCode() : 0)) * 31) + Boolean.hashCode(this.hrTestRunning);
    }

    public String toString() {
        return "BleStatus(enabled=" + this.enabled + ", scanning=" + this.scanning + ", connectingTo=" + this.connectingTo + ", connectedAddress=" + this.connectedAddress + ", lastError=" + this.lastError + ", devices=" + this.devices + ", services=" + this.services + ", hasHeartRateService=" + this.hasHeartRateService + ", hasExerciseTrackerSoccerService=" + this.hasExerciseTrackerSoccerService + ", hasMoyoungService=" + this.hasMoyoungService + ", watchSoccerState=" + this.watchSoccerState + ", watchSoccerElapsedSec=" + this.watchSoccerElapsedSec + ", syncingSoccer=" + this.syncingSoccer + ", lastSoccerSyncImported=" + this.lastSoccerSyncImported + ", lastMoyoungImport=" + this.lastMoyoungImport + ", latestHrBpm=" + this.latestHrBpm + ", latestHrAtMs=" + this.latestHrAtMs + ", hrTestRunning=" + this.hrTestRunning + ")";
    }

    public BleStatus(boolean z, boolean z2, String str, String str2, String str3, List<BleScanDevice> devices, List<BleGattServiceInfo> services, boolean z3, boolean z4, boolean z5, Integer num, Integer num2, boolean z6, Integer num3, MoyoungImportStats moyoungImportStats, Integer num4, Long l, boolean z7) {
        Intrinsics.checkNotNullParameter(devices, "devices");
        Intrinsics.checkNotNullParameter(services, "services");
        this.enabled = z;
        this.scanning = z2;
        this.connectingTo = str;
        this.connectedAddress = str2;
        this.lastError = str3;
        this.devices = devices;
        this.services = services;
        this.hasHeartRateService = z3;
        this.hasExerciseTrackerSoccerService = z4;
        this.hasMoyoungService = z5;
        this.watchSoccerState = num;
        this.watchSoccerElapsedSec = num2;
        this.syncingSoccer = z6;
        this.lastSoccerSyncImported = num3;
        this.lastMoyoungImport = moyoungImportStats;
        this.latestHrBpm = num4;
        this.latestHrAtMs = l;
        this.hrTestRunning = z7;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getScanning() {
        return this.scanning;
    }

    public final String getConnectingTo() {
        return this.connectingTo;
    }

    public final String getConnectedAddress() {
        return this.connectedAddress;
    }

    public final String getLastError() {
        return this.lastError;
    }

    public /* synthetic */ BleStatus(boolean z, boolean z2, String str, String str2, String str3, List list, List list2, boolean z3, boolean z4, boolean z5, Integer num, Integer num2, boolean z6, Integer num3, MoyoungImportStats moyoungImportStats, Integer num4, Long l, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? CollectionsKt.emptyList() : list2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? false : z6, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : moyoungImportStats, (i & 32768) != 0 ? null : num4, (i & 65536) != 0 ? null : l, (i & 131072) != 0 ? false : z7);
    }

    public final List<BleScanDevice> getDevices() {
        return this.devices;
    }

    public final List<BleGattServiceInfo> getServices() {
        return this.services;
    }

    public final boolean getHasHeartRateService() {
        return this.hasHeartRateService;
    }

    public final boolean getHasExerciseTrackerSoccerService() {
        return this.hasExerciseTrackerSoccerService;
    }

    public final boolean getHasMoyoungService() {
        return this.hasMoyoungService;
    }

    public final Integer getWatchSoccerState() {
        return this.watchSoccerState;
    }

    public final Integer getWatchSoccerElapsedSec() {
        return this.watchSoccerElapsedSec;
    }

    public final boolean getSyncingSoccer() {
        return this.syncingSoccer;
    }

    public final Integer getLastSoccerSyncImported() {
        return this.lastSoccerSyncImported;
    }

    public final MoyoungImportStats getLastMoyoungImport() {
        return this.lastMoyoungImport;
    }

    public final Integer getLatestHrBpm() {
        return this.latestHrBpm;
    }

    public final Long getLatestHrAtMs() {
        return this.latestHrAtMs;
    }

    public final boolean getHrTestRunning() {
        return this.hrTestRunning;
    }
}
