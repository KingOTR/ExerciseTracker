package com.example.rungps.data;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.example.rungps.sleep.SleepAlarmPreferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AppPreferences.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b,\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\"\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010'\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0005J\u0016\u0010(\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ \u0010)\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010*\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0018\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u0010/\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00100\u001a\u00020.H\u0086@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u00103\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010%J\u000e\u00104\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u00105\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0005J\u0016\u00106\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u00107\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u00109J\u000e\u0010:\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010;\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u000eJ\u0016\u0010<\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u0010=\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010%J\u000e\u0010?\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010@\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u000e\u0010A\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u001e\u0010B\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010+J\u0018\u0010D\u001a\u0004\u0018\u00010.2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u0010E\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020.H\u0086@¢\u0006\u0002\u00101J\u0016\u0010G\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u0010H\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010%J\u000e\u0010I\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010J\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u0005J\u0016\u0010K\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u0010L\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010%J\u0015\u0010N\u001a\u0004\u0018\u00010.2\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010OJ\u0016\u0010P\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00100\u001a\u00020.J\u0016\u0010Q\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u0010R\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010+J\u000e\u0010T\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010U\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020\bJ\u0016\u0010V\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0086@¢\u0006\u0002\u0010\u001eJ\u001e\u0010W\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010+J\u000e\u0010X\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010Y\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010S\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/example/rungps/data/AppPreferences;", "", "<init>", "()V", "LEGACY", "", "migratedKey", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "themeModeKey", "onboardingDoneKey", "gymActiveSplitIdKey", "carryoverModeKey", "volumeHeatmapDaysKey", "", "mapEngineKey", "sleepLiteModeKey", "moyoungLastSyncMsKey", "stravaClientIdKey", "bleLastAddressKey", "showPulleyChooserKey", "showRpeRomKey", "MAP_ENGINE_MAPLIBRE", "MAP_ENGINE_OSMDROID", "CARRYOVER_ANY_NEXT", "CARRYOVER_SAME_DAY", "migrateFromLegacyIfNeeded", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrateFromLegacyBlocking", "themeModeFlow", "Lkotlinx/coroutines/flow/Flow;", "themeMode", "setThemeMode", "mode", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "themeModeBlocking", "setThemeModeBlocking", "isOnboardingDone", "setOnboardingDone", "done", "(Landroid/content/Context;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isOnboardingDoneBlocking", "gymActiveSplitId", "", "setGymActiveSplitId", "id", "(Landroid/content/Context;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "carryoverMode", "setCarryoverMode", "carryoverModeBlocking", "setCarryoverModeBlocking", "volumeHeatmapDays", "setVolumeHeatmapDays", "days", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "volumeHeatmapDaysBlocking", "setVolumeHeatmapDaysBlocking", "mapEngine", "setMapEngine", "engine", "useMapLibrePlanningBlocking", "sleepLiteMode", "sleepLiteModeBlocking", "setSleepLiteMode", "enabled", "moyoungLastSyncMs", "setMoyoungLastSyncMs", "ms", "stravaClientId", "setStravaClientId", "stravaClientIdBlocking", "setStravaClientIdBlocking", "bleLastAddress", "setBleLastAddress", "address", "gymActiveSplitIdBlocking", "(Landroid/content/Context;)Ljava/lang/Long;", "setGymActiveSplitIdBlocking", "showPulleyChooser", "setShowPulleyChooser", "show", "showPulleyChooserBlocking", "setShowPulleyChooserBlocking", "showRpeRom", "setShowRpeRom", "showRpeRomBlocking", "setShowRpeRomBlocking", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppPreferences {
    public static final String CARRYOVER_ANY_NEXT = "any_next";
    public static final String CARRYOVER_SAME_DAY = "same_day";
    private static final String LEGACY = "settings";
    public static final String MAP_ENGINE_MAPLIBRE = "maplibre";
    public static final String MAP_ENGINE_OSMDROID = "osmdroid";
    public static final AppPreferences INSTANCE = new AppPreferences();
    private static final Preferences.Key<Boolean> migratedKey = PreferencesKeys.booleanKey("prefs_migrated_v1");
    private static final Preferences.Key<String> themeModeKey = PreferencesKeys.stringKey("themeMode");
    private static final Preferences.Key<Boolean> onboardingDoneKey = PreferencesKeys.booleanKey("onboardingDone");
    private static final Preferences.Key<String> gymActiveSplitIdKey = PreferencesKeys.stringKey("gymActiveSplitId");
    private static final Preferences.Key<String> carryoverModeKey = PreferencesKeys.stringKey("gym_carryover_mode");
    private static final Preferences.Key<Integer> volumeHeatmapDaysKey = PreferencesKeys.intKey("gym_volume_heatmap_days");
    private static final Preferences.Key<String> mapEngineKey = PreferencesKeys.stringKey("map_engine");
    private static final Preferences.Key<Boolean> sleepLiteModeKey = PreferencesKeys.booleanKey("sleep_lite_mode");
    private static final Preferences.Key<String> moyoungLastSyncMsKey = PreferencesKeys.stringKey("moyoung_last_sync_ms");
    private static final Preferences.Key<String> stravaClientIdKey = PreferencesKeys.stringKey("strava_client_id");
    private static final Preferences.Key<String> bleLastAddressKey = PreferencesKeys.stringKey("ble_last_address");
    private static final Preferences.Key<Boolean> showPulleyChooserKey = PreferencesKeys.booleanKey("gym_show_pulley_chooser");
    private static final Preferences.Key<Boolean> showRpeRomKey = PreferencesKeys.booleanKey("gym_show_rpe_rom");
    public static final int $stable = 8;

    private AppPreferences() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object migrateFromLegacyIfNeeded(Context context, Continuation<? super Unit> continuation) {
        AppPreferences$migrateFromLegacyIfNeeded$1 appPreferences$migrateFromLegacyIfNeeded$1;
        Object obj;
        int i;
        DataStore appDataStore;
        DataStore dataStore;
        if (continuation instanceof AppPreferences$migrateFromLegacyIfNeeded$1) {
            appPreferences$migrateFromLegacyIfNeeded$1 = (AppPreferences$migrateFromLegacyIfNeeded$1) continuation;
            if ((appPreferences$migrateFromLegacyIfNeeded$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$migrateFromLegacyIfNeeded$1.label -= Integer.MIN_VALUE;
                obj = appPreferences$migrateFromLegacyIfNeeded$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$migrateFromLegacyIfNeeded$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$migrateFromLegacyIfNeeded$1.L$0 = context;
                    appPreferences$migrateFromLegacyIfNeeded$1.L$1 = appDataStore;
                    appPreferences$migrateFromLegacyIfNeeded$1.label = 1;
                    Object first = FlowKt.first(data, appPreferences$migrateFromLegacyIfNeeded$1);
                    if (first == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dataStore = appDataStore;
                    obj = first;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    DataStore dataStore2 = (DataStore) appPreferences$migrateFromLegacyIfNeeded$1.L$1;
                    Context context2 = (Context) appPreferences$migrateFromLegacyIfNeeded$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dataStore = dataStore2;
                    context = context2;
                }
                if (!Intrinsics.areEqual(((Preferences) obj).get(migratedKey), Boxing.boxBoolean(true))) {
                    return Unit.INSTANCE;
                }
                AppPreferences$migrateFromLegacyIfNeeded$2 appPreferences$migrateFromLegacyIfNeeded$2 = new AppPreferences$migrateFromLegacyIfNeeded$2(context.getSharedPreferences(LEGACY, 0), null);
                appPreferences$migrateFromLegacyIfNeeded$1.L$0 = null;
                appPreferences$migrateFromLegacyIfNeeded$1.L$1 = null;
                appPreferences$migrateFromLegacyIfNeeded$1.label = 2;
                if (PreferencesKt.edit(dataStore, appPreferences$migrateFromLegacyIfNeeded$2, appPreferences$migrateFromLegacyIfNeeded$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        appPreferences$migrateFromLegacyIfNeeded$1 = new AppPreferences$migrateFromLegacyIfNeeded$1(this, continuation);
        obj = appPreferences$migrateFromLegacyIfNeeded$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$migrateFromLegacyIfNeeded$1.label;
        if (i != 0) {
        }
        if (!Intrinsics.areEqual(((Preferences) obj).get(migratedKey), Boxing.boxBoolean(true))) {
        }
    }

    public final void migrateFromLegacyBlocking(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$migrateFromLegacyBlocking$1(context, null), 1, null);
    }

    public final Flow<String> themeModeFlow(Context context) {
        DataStore appDataStore;
        Intrinsics.checkNotNullParameter(context, "context");
        appDataStore = AppPreferencesKt.getAppDataStore(context);
        final Flow data = appDataStore.getData();
        return new Flow<String>() { // from class: com.example.rungps.data.AppPreferences$themeModeFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.example.rungps.data.AppPreferences$themeModeFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.example.rungps.data.AppPreferences$themeModeFlow$$inlined$map$1$2", f = "AppPreferences.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.example.rungps.data.AppPreferences$themeModeFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Preferences.Key<T> key;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                key = AppPreferences.themeModeKey;
                                String str = (String) ((Preferences) obj).get(key);
                                if (str == null) {
                                    str = SleepAlarmPreferences.SOUND_SYSTEM;
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(str, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
    }

    public final Object themeMode(Context context, Continuation<? super String> continuation) {
        return FlowKt.first(themeModeFlow(context), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setThemeMode(Context context, String str, Continuation<? super Unit> continuation) {
        AppPreferences$setThemeMode$1 appPreferences$setThemeMode$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$setThemeMode$1) {
            appPreferences$setThemeMode$1 = (AppPreferences$setThemeMode$1) continuation;
            if ((appPreferences$setThemeMode$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$setThemeMode$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$setThemeMode$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$setThemeMode$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    AppPreferences$setThemeMode$2 appPreferences$setThemeMode$2 = new AppPreferences$setThemeMode$2(str, null);
                    appPreferences$setThemeMode$1.L$0 = context;
                    appPreferences$setThemeMode$1.L$1 = str;
                    appPreferences$setThemeMode$1.label = 1;
                    if (PreferencesKt.edit(appDataStore, appPreferences$setThemeMode$2, appPreferences$setThemeMode$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) appPreferences$setThemeMode$1.L$1;
                    context = (Context) appPreferences$setThemeMode$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                context.getSharedPreferences(LEGACY, 0).edit().putString("themeMode", str).apply();
                return Unit.INSTANCE;
            }
        }
        appPreferences$setThemeMode$1 = new AppPreferences$setThemeMode$1(this, continuation);
        Object obj2 = appPreferences$setThemeMode$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$setThemeMode$1.label;
        if (i != 0) {
        }
        context.getSharedPreferences(LEGACY, 0).edit().putString("themeMode", str).apply();
        return Unit.INSTANCE;
    }

    public final String themeModeBlocking(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$themeModeBlocking$1(context, null), 1, null);
        return (String) runBlocking$default;
    }

    public final void setThemeModeBlocking(Context context, String mode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$setThemeModeBlocking$1(context, mode, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isOnboardingDone(Context context, Continuation<? super Boolean> continuation) {
        AppPreferences$isOnboardingDone$1 appPreferences$isOnboardingDone$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$isOnboardingDone$1) {
            appPreferences$isOnboardingDone$1 = (AppPreferences$isOnboardingDone$1) continuation;
            if ((appPreferences$isOnboardingDone$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$isOnboardingDone$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$isOnboardingDone$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$isOnboardingDone$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$isOnboardingDone$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$isOnboardingDone$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(Intrinsics.areEqual(((Preferences) obj).get(onboardingDoneKey), Boxing.boxBoolean(true)));
            }
        }
        appPreferences$isOnboardingDone$1 = new AppPreferences$isOnboardingDone$1(this, continuation);
        Object obj2 = appPreferences$isOnboardingDone$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$isOnboardingDone$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(Intrinsics.areEqual(((Preferences) obj2).get(onboardingDoneKey), Boxing.boxBoolean(true)));
    }

    public static /* synthetic */ Object setOnboardingDone$default(AppPreferences appPreferences, Context context, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return appPreferences.setOnboardingDone(context, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setOnboardingDone(Context context, boolean z, Continuation<? super Unit> continuation) {
        AppPreferences$setOnboardingDone$1 appPreferences$setOnboardingDone$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$setOnboardingDone$1) {
            appPreferences$setOnboardingDone$1 = (AppPreferences$setOnboardingDone$1) continuation;
            if ((appPreferences$setOnboardingDone$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$setOnboardingDone$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$setOnboardingDone$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$setOnboardingDone$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    AppPreferences$setOnboardingDone$2 appPreferences$setOnboardingDone$2 = new AppPreferences$setOnboardingDone$2(z, null);
                    appPreferences$setOnboardingDone$1.L$0 = context;
                    appPreferences$setOnboardingDone$1.Z$0 = z;
                    appPreferences$setOnboardingDone$1.label = 1;
                    if (PreferencesKt.edit(appDataStore, appPreferences$setOnboardingDone$2, appPreferences$setOnboardingDone$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = appPreferences$setOnboardingDone$1.Z$0;
                    context = (Context) appPreferences$setOnboardingDone$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                context.getSharedPreferences(LEGACY, 0).edit().putBoolean("onboardingDone", z).apply();
                return Unit.INSTANCE;
            }
        }
        appPreferences$setOnboardingDone$1 = new AppPreferences$setOnboardingDone$1(this, continuation);
        Object obj2 = appPreferences$setOnboardingDone$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$setOnboardingDone$1.label;
        if (i != 0) {
        }
        context.getSharedPreferences(LEGACY, 0).edit().putBoolean("onboardingDone", z).apply();
        return Unit.INSTANCE;
    }

    public final boolean isOnboardingDoneBlocking(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$isOnboardingDoneBlocking$1(context, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object gymActiveSplitId(Context context, Continuation<? super Long> continuation) {
        AppPreferences$gymActiveSplitId$1 appPreferences$gymActiveSplitId$1;
        int i;
        DataStore appDataStore;
        String str;
        Long longOrNull;
        if (continuation instanceof AppPreferences$gymActiveSplitId$1) {
            appPreferences$gymActiveSplitId$1 = (AppPreferences$gymActiveSplitId$1) continuation;
            if ((appPreferences$gymActiveSplitId$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$gymActiveSplitId$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$gymActiveSplitId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$gymActiveSplitId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$gymActiveSplitId$1.L$0 = context;
                    appPreferences$gymActiveSplitId$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$gymActiveSplitId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (Context) appPreferences$gymActiveSplitId$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) ((Preferences) obj).get(gymActiveSplitIdKey);
                if (str == null) {
                    Long boxLong = Boxing.boxLong(context.getSharedPreferences(LEGACY, 0).getLong("gymActiveSplitId", -1L));
                    if (boxLong.longValue() <= 0) {
                        boxLong = null;
                    }
                    str = boxLong != null ? boxLong.toString() : null;
                }
                if (str != null || (longOrNull = StringsKt.toLongOrNull(str)) == null || longOrNull.longValue() <= 0) {
                    return null;
                }
                return longOrNull;
            }
        }
        appPreferences$gymActiveSplitId$1 = new AppPreferences$gymActiveSplitId$1(this, continuation);
        Object obj2 = appPreferences$gymActiveSplitId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$gymActiveSplitId$1.label;
        if (i != 0) {
        }
        str = (String) ((Preferences) obj2).get(gymActiveSplitIdKey);
        if (str == null) {
        }
        return str != null ? null : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setGymActiveSplitId(Context context, long j, Continuation<? super Unit> continuation) {
        AppPreferences$setGymActiveSplitId$1 appPreferences$setGymActiveSplitId$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$setGymActiveSplitId$1) {
            appPreferences$setGymActiveSplitId$1 = (AppPreferences$setGymActiveSplitId$1) continuation;
            if ((appPreferences$setGymActiveSplitId$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$setGymActiveSplitId$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$setGymActiveSplitId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$setGymActiveSplitId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    AppPreferences$setGymActiveSplitId$2 appPreferences$setGymActiveSplitId$2 = new AppPreferences$setGymActiveSplitId$2(j, null);
                    appPreferences$setGymActiveSplitId$1.L$0 = context;
                    appPreferences$setGymActiveSplitId$1.J$0 = j;
                    appPreferences$setGymActiveSplitId$1.label = 1;
                    if (PreferencesKt.edit(appDataStore, appPreferences$setGymActiveSplitId$2, appPreferences$setGymActiveSplitId$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = appPreferences$setGymActiveSplitId$1.J$0;
                    context = (Context) appPreferences$setGymActiveSplitId$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                context.getSharedPreferences(LEGACY, 0).edit().putLong("gymActiveSplitId", j).apply();
                return Unit.INSTANCE;
            }
        }
        appPreferences$setGymActiveSplitId$1 = new AppPreferences$setGymActiveSplitId$1(this, continuation);
        Object obj2 = appPreferences$setGymActiveSplitId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$setGymActiveSplitId$1.label;
        if (i != 0) {
        }
        context.getSharedPreferences(LEGACY, 0).edit().putLong("gymActiveSplitId", j).apply();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object carryoverMode(Context context, Continuation<? super String> continuation) {
        AppPreferences$carryoverMode$1 appPreferences$carryoverMode$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$carryoverMode$1) {
            appPreferences$carryoverMode$1 = (AppPreferences$carryoverMode$1) continuation;
            if ((appPreferences$carryoverMode$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$carryoverMode$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$carryoverMode$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$carryoverMode$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$carryoverMode$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$carryoverMode$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) ((Preferences) obj).get(carryoverModeKey);
                return str != null ? "any_next" : str;
            }
        }
        appPreferences$carryoverMode$1 = new AppPreferences$carryoverMode$1(this, continuation);
        Object obj2 = appPreferences$carryoverMode$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$carryoverMode$1.label;
        if (i != 0) {
        }
        String str2 = (String) ((Preferences) obj2).get(carryoverModeKey);
        if (str2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setCarryoverMode(Context context, String str, Continuation<? super Unit> continuation) {
        AppPreferences$setCarryoverMode$1 appPreferences$setCarryoverMode$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$setCarryoverMode$1) {
            appPreferences$setCarryoverMode$1 = (AppPreferences$setCarryoverMode$1) continuation;
            if ((appPreferences$setCarryoverMode$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$setCarryoverMode$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$setCarryoverMode$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$setCarryoverMode$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    AppPreferences$setCarryoverMode$2 appPreferences$setCarryoverMode$2 = new AppPreferences$setCarryoverMode$2(str, null);
                    appPreferences$setCarryoverMode$1.L$0 = context;
                    appPreferences$setCarryoverMode$1.L$1 = str;
                    appPreferences$setCarryoverMode$1.label = 1;
                    if (PreferencesKt.edit(appDataStore, appPreferences$setCarryoverMode$2, appPreferences$setCarryoverMode$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) appPreferences$setCarryoverMode$1.L$1;
                    context = (Context) appPreferences$setCarryoverMode$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                context.getSharedPreferences(LEGACY, 0).edit().putString("gym_carryover_mode", str).apply();
                return Unit.INSTANCE;
            }
        }
        appPreferences$setCarryoverMode$1 = new AppPreferences$setCarryoverMode$1(this, continuation);
        Object obj2 = appPreferences$setCarryoverMode$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$setCarryoverMode$1.label;
        if (i != 0) {
        }
        context.getSharedPreferences(LEGACY, 0).edit().putString("gym_carryover_mode", str).apply();
        return Unit.INSTANCE;
    }

    public final String carryoverModeBlocking(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$carryoverModeBlocking$1(context, null), 1, null);
        return (String) runBlocking$default;
    }

    public final void setCarryoverModeBlocking(Context context, String mode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$setCarryoverModeBlocking$1(context, mode, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object volumeHeatmapDays(Context context, Continuation<? super Integer> continuation) {
        AppPreferences$volumeHeatmapDays$1 appPreferences$volumeHeatmapDays$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$volumeHeatmapDays$1) {
            appPreferences$volumeHeatmapDays$1 = (AppPreferences$volumeHeatmapDays$1) continuation;
            if ((appPreferences$volumeHeatmapDays$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$volumeHeatmapDays$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$volumeHeatmapDays$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$volumeHeatmapDays$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$volumeHeatmapDays$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$volumeHeatmapDays$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Integer num = (Integer) ((Preferences) obj).get(volumeHeatmapDaysKey);
                return Boxing.boxInt(num == null ? RangesKt.coerceIn(num.intValue(), 7, 365) : 90);
            }
        }
        appPreferences$volumeHeatmapDays$1 = new AppPreferences$volumeHeatmapDays$1(this, continuation);
        Object obj2 = appPreferences$volumeHeatmapDays$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$volumeHeatmapDays$1.label;
        if (i != 0) {
        }
        Integer num2 = (Integer) ((Preferences) obj2).get(volumeHeatmapDaysKey);
        return Boxing.boxInt(num2 == null ? RangesKt.coerceIn(num2.intValue(), 7, 365) : 90);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setVolumeHeatmapDays(Context context, int i, Continuation<? super Unit> continuation) {
        AppPreferences$setVolumeHeatmapDays$1 appPreferences$setVolumeHeatmapDays$1;
        int i2;
        int coerceIn;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$setVolumeHeatmapDays$1) {
            appPreferences$setVolumeHeatmapDays$1 = (AppPreferences$setVolumeHeatmapDays$1) continuation;
            if ((appPreferences$setVolumeHeatmapDays$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$setVolumeHeatmapDays$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$setVolumeHeatmapDays$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = appPreferences$setVolumeHeatmapDays$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    coerceIn = RangesKt.coerceIn(i, 7, 365);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    AppPreferences$setVolumeHeatmapDays$2 appPreferences$setVolumeHeatmapDays$2 = new AppPreferences$setVolumeHeatmapDays$2(coerceIn, null);
                    appPreferences$setVolumeHeatmapDays$1.L$0 = context;
                    appPreferences$setVolumeHeatmapDays$1.I$0 = coerceIn;
                    appPreferences$setVolumeHeatmapDays$1.label = 1;
                    if (PreferencesKt.edit(appDataStore, appPreferences$setVolumeHeatmapDays$2, appPreferences$setVolumeHeatmapDays$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = appPreferences$setVolumeHeatmapDays$1.I$0;
                    Context context2 = (Context) appPreferences$setVolumeHeatmapDays$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    coerceIn = i3;
                    context = context2;
                }
                context.getSharedPreferences(LEGACY, 0).edit().putInt("gym_volume_heatmap_days", coerceIn).apply();
                return Unit.INSTANCE;
            }
        }
        appPreferences$setVolumeHeatmapDays$1 = new AppPreferences$setVolumeHeatmapDays$1(this, continuation);
        Object obj2 = appPreferences$setVolumeHeatmapDays$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = appPreferences$setVolumeHeatmapDays$1.label;
        if (i2 != 0) {
        }
        context.getSharedPreferences(LEGACY, 0).edit().putInt("gym_volume_heatmap_days", coerceIn).apply();
        return Unit.INSTANCE;
    }

    public final int volumeHeatmapDaysBlocking(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$volumeHeatmapDaysBlocking$1(context, null), 1, null);
        return ((Number) runBlocking$default).intValue();
    }

    public final void setVolumeHeatmapDaysBlocking(Context context, int days) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$setVolumeHeatmapDaysBlocking$1(context, days, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mapEngine(Context context, Continuation<? super String> continuation) {
        AppPreferences$mapEngine$1 appPreferences$mapEngine$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$mapEngine$1) {
            appPreferences$mapEngine$1 = (AppPreferences$mapEngine$1) continuation;
            if ((appPreferences$mapEngine$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$mapEngine$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$mapEngine$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$mapEngine$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$mapEngine$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$mapEngine$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) ((Preferences) obj).get(mapEngineKey);
                return str != null ? MAP_ENGINE_MAPLIBRE : str;
            }
        }
        appPreferences$mapEngine$1 = new AppPreferences$mapEngine$1(this, continuation);
        Object obj2 = appPreferences$mapEngine$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$mapEngine$1.label;
        if (i != 0) {
        }
        String str2 = (String) ((Preferences) obj2).get(mapEngineKey);
        if (str2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setMapEngine(Context context, String str, Continuation<? super Unit> continuation) {
        AppPreferences$setMapEngine$1 appPreferences$setMapEngine$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$setMapEngine$1) {
            appPreferences$setMapEngine$1 = (AppPreferences$setMapEngine$1) continuation;
            if ((appPreferences$setMapEngine$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$setMapEngine$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$setMapEngine$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$setMapEngine$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    AppPreferences$setMapEngine$2 appPreferences$setMapEngine$2 = new AppPreferences$setMapEngine$2(str, null);
                    appPreferences$setMapEngine$1.L$0 = context;
                    appPreferences$setMapEngine$1.L$1 = str;
                    appPreferences$setMapEngine$1.label = 1;
                    if (PreferencesKt.edit(appDataStore, appPreferences$setMapEngine$2, appPreferences$setMapEngine$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) appPreferences$setMapEngine$1.L$1;
                    context = (Context) appPreferences$setMapEngine$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                context.getSharedPreferences(LEGACY, 0).edit().putString("map_engine", str).apply();
                return Unit.INSTANCE;
            }
        }
        appPreferences$setMapEngine$1 = new AppPreferences$setMapEngine$1(this, continuation);
        Object obj2 = appPreferences$setMapEngine$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$setMapEngine$1.label;
        if (i != 0) {
        }
        context.getSharedPreferences(LEGACY, 0).edit().putString("map_engine", str).apply();
        return Unit.INSTANCE;
    }

    public final boolean useMapLibrePlanningBlocking(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$useMapLibrePlanningBlocking$1(context, null), 1, null);
        return !Intrinsics.areEqual(runBlocking$default, "osmdroid");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sleepLiteMode(Context context, Continuation<? super Boolean> continuation) {
        AppPreferences$sleepLiteMode$1 appPreferences$sleepLiteMode$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$sleepLiteMode$1) {
            appPreferences$sleepLiteMode$1 = (AppPreferences$sleepLiteMode$1) continuation;
            if ((appPreferences$sleepLiteMode$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$sleepLiteMode$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$sleepLiteMode$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$sleepLiteMode$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$sleepLiteMode$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$sleepLiteMode$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(Intrinsics.areEqual(((Preferences) obj).get(sleepLiteModeKey), Boxing.boxBoolean(true)));
            }
        }
        appPreferences$sleepLiteMode$1 = new AppPreferences$sleepLiteMode$1(this, continuation);
        Object obj2 = appPreferences$sleepLiteMode$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$sleepLiteMode$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(Intrinsics.areEqual(((Preferences) obj2).get(sleepLiteModeKey), Boxing.boxBoolean(true)));
    }

    public final boolean sleepLiteModeBlocking(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$sleepLiteModeBlocking$1(context, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    public final Object setSleepLiteMode(Context context, boolean z, Continuation<? super Unit> continuation) {
        DataStore appDataStore;
        appDataStore = AppPreferencesKt.getAppDataStore(context);
        Object edit = PreferencesKt.edit(appDataStore, new AppPreferences$setSleepLiteMode$2(z, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object moyoungLastSyncMs(Context context, Continuation<? super Long> continuation) {
        AppPreferences$moyoungLastSyncMs$1 appPreferences$moyoungLastSyncMs$1;
        int i;
        DataStore appDataStore;
        String str;
        if (continuation instanceof AppPreferences$moyoungLastSyncMs$1) {
            appPreferences$moyoungLastSyncMs$1 = (AppPreferences$moyoungLastSyncMs$1) continuation;
            if ((appPreferences$moyoungLastSyncMs$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$moyoungLastSyncMs$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$moyoungLastSyncMs$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$moyoungLastSyncMs$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$moyoungLastSyncMs$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$moyoungLastSyncMs$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) ((Preferences) obj).get(moyoungLastSyncMsKey);
                if (str == null) {
                    return StringsKt.toLongOrNull(str);
                }
                return null;
            }
        }
        appPreferences$moyoungLastSyncMs$1 = new AppPreferences$moyoungLastSyncMs$1(this, continuation);
        Object obj2 = appPreferences$moyoungLastSyncMs$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$moyoungLastSyncMs$1.label;
        if (i != 0) {
        }
        str = (String) ((Preferences) obj2).get(moyoungLastSyncMsKey);
        if (str == null) {
        }
    }

    public final Object setMoyoungLastSyncMs(Context context, long j, Continuation<? super Unit> continuation) {
        DataStore appDataStore;
        appDataStore = AppPreferencesKt.getAppDataStore(context);
        Object edit = PreferencesKt.edit(appDataStore, new AppPreferences$setMoyoungLastSyncMs$2(j, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object stravaClientId(Context context, Continuation<? super String> continuation) {
        AppPreferences$stravaClientId$1 appPreferences$stravaClientId$1;
        int i;
        DataStore appDataStore;
        String str;
        if (continuation instanceof AppPreferences$stravaClientId$1) {
            appPreferences$stravaClientId$1 = (AppPreferences$stravaClientId$1) continuation;
            if ((appPreferences$stravaClientId$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$stravaClientId$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$stravaClientId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$stravaClientId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$stravaClientId$1.L$0 = context;
                    appPreferences$stravaClientId$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$stravaClientId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (Context) appPreferences$stravaClientId$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) ((Preferences) obj).get(stravaClientIdKey);
                if (str == null) {
                    return str;
                }
                String string = context.getSharedPreferences(LEGACY, 0).getString("stravaClientId", null);
                return string == null ? "" : string;
            }
        }
        appPreferences$stravaClientId$1 = new AppPreferences$stravaClientId$1(this, continuation);
        Object obj2 = appPreferences$stravaClientId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$stravaClientId$1.label;
        if (i != 0) {
        }
        str = (String) ((Preferences) obj2).get(stravaClientIdKey);
        if (str == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setStravaClientId(Context context, String str, Continuation<? super Unit> continuation) {
        AppPreferences$setStravaClientId$1 appPreferences$setStravaClientId$1;
        int i;
        String obj;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$setStravaClientId$1) {
            appPreferences$setStravaClientId$1 = (AppPreferences$setStravaClientId$1) continuation;
            if ((appPreferences$setStravaClientId$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$setStravaClientId$1.label -= Integer.MIN_VALUE;
                Object obj2 = appPreferences$setStravaClientId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$setStravaClientId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    obj = StringsKt.trim((CharSequence) str).toString();
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    AppPreferences$setStravaClientId$2 appPreferences$setStravaClientId$2 = new AppPreferences$setStravaClientId$2(obj, null);
                    appPreferences$setStravaClientId$1.L$0 = context;
                    appPreferences$setStravaClientId$1.L$1 = obj;
                    appPreferences$setStravaClientId$1.label = 1;
                    if (PreferencesKt.edit(appDataStore, appPreferences$setStravaClientId$2, appPreferences$setStravaClientId$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str2 = (String) appPreferences$setStravaClientId$1.L$1;
                    Context context2 = (Context) appPreferences$setStravaClientId$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    obj = str2;
                    context = context2;
                }
                context.getSharedPreferences(LEGACY, 0).edit().putString("stravaClientId", obj).apply();
                return Unit.INSTANCE;
            }
        }
        appPreferences$setStravaClientId$1 = new AppPreferences$setStravaClientId$1(this, continuation);
        Object obj22 = appPreferences$setStravaClientId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$setStravaClientId$1.label;
        if (i != 0) {
        }
        context.getSharedPreferences(LEGACY, 0).edit().putString("stravaClientId", obj).apply();
        return Unit.INSTANCE;
    }

    public final String stravaClientIdBlocking(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$stravaClientIdBlocking$1(context, null), 1, null);
        return (String) runBlocking$default;
    }

    public final void setStravaClientIdBlocking(Context context, String id) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(id, "id");
        BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$setStravaClientIdBlocking$1(context, id, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bleLastAddress(Context context, Continuation<? super String> continuation) {
        AppPreferences$bleLastAddress$1 appPreferences$bleLastAddress$1;
        int i;
        DataStore appDataStore;
        String str;
        if (continuation instanceof AppPreferences$bleLastAddress$1) {
            appPreferences$bleLastAddress$1 = (AppPreferences$bleLastAddress$1) continuation;
            if ((appPreferences$bleLastAddress$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$bleLastAddress$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$bleLastAddress$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$bleLastAddress$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$bleLastAddress$1.L$0 = context;
                    appPreferences$bleLastAddress$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$bleLastAddress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context = (Context) appPreferences$bleLastAddress$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) ((Preferences) obj).get(bleLastAddressKey);
                if (str == null) {
                    return str;
                }
                String string = context.getSharedPreferences(LEGACY, 0).getString("bleLastAddress", null);
                return string == null ? "" : string;
            }
        }
        appPreferences$bleLastAddress$1 = new AppPreferences$bleLastAddress$1(this, continuation);
        Object obj2 = appPreferences$bleLastAddress$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$bleLastAddress$1.label;
        if (i != 0) {
        }
        str = (String) ((Preferences) obj2).get(bleLastAddressKey);
        if (str == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setBleLastAddress(Context context, String str, Continuation<? super Unit> continuation) {
        AppPreferences$setBleLastAddress$1 appPreferences$setBleLastAddress$1;
        int i;
        String obj;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$setBleLastAddress$1) {
            appPreferences$setBleLastAddress$1 = (AppPreferences$setBleLastAddress$1) continuation;
            if ((appPreferences$setBleLastAddress$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$setBleLastAddress$1.label -= Integer.MIN_VALUE;
                Object obj2 = appPreferences$setBleLastAddress$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$setBleLastAddress$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    obj = StringsKt.trim((CharSequence) str).toString();
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    AppPreferences$setBleLastAddress$2 appPreferences$setBleLastAddress$2 = new AppPreferences$setBleLastAddress$2(obj, null);
                    appPreferences$setBleLastAddress$1.L$0 = context;
                    appPreferences$setBleLastAddress$1.L$1 = obj;
                    appPreferences$setBleLastAddress$1.label = 1;
                    if (PreferencesKt.edit(appDataStore, appPreferences$setBleLastAddress$2, appPreferences$setBleLastAddress$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str2 = (String) appPreferences$setBleLastAddress$1.L$1;
                    Context context2 = (Context) appPreferences$setBleLastAddress$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    obj = str2;
                    context = context2;
                }
                context.getSharedPreferences(LEGACY, 0).edit().putString("bleLastAddress", obj).apply();
                return Unit.INSTANCE;
            }
        }
        appPreferences$setBleLastAddress$1 = new AppPreferences$setBleLastAddress$1(this, continuation);
        Object obj22 = appPreferences$setBleLastAddress$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$setBleLastAddress$1.label;
        if (i != 0) {
        }
        context.getSharedPreferences(LEGACY, 0).edit().putString("bleLastAddress", obj).apply();
        return Unit.INSTANCE;
    }

    public final Long gymActiveSplitIdBlocking(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$gymActiveSplitIdBlocking$1(context, null), 1, null);
        return (Long) runBlocking$default;
    }

    public final void setGymActiveSplitIdBlocking(Context context, long id) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$setGymActiveSplitIdBlocking$1(context, id, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showPulleyChooser(Context context, Continuation<? super Boolean> continuation) {
        AppPreferences$showPulleyChooser$1 appPreferences$showPulleyChooser$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$showPulleyChooser$1) {
            appPreferences$showPulleyChooser$1 = (AppPreferences$showPulleyChooser$1) continuation;
            if ((appPreferences$showPulleyChooser$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$showPulleyChooser$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$showPulleyChooser$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$showPulleyChooser$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$showPulleyChooser$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$showPulleyChooser$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Boolean bool = (Boolean) ((Preferences) obj).get(showPulleyChooserKey);
                return Boxing.boxBoolean(bool != null ? bool.booleanValue() : true);
            }
        }
        appPreferences$showPulleyChooser$1 = new AppPreferences$showPulleyChooser$1(this, continuation);
        Object obj2 = appPreferences$showPulleyChooser$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$showPulleyChooser$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) ((Preferences) obj2).get(showPulleyChooserKey);
        return Boxing.boxBoolean(bool2 != null ? bool2.booleanValue() : true);
    }

    public final Object setShowPulleyChooser(Context context, boolean z, Continuation<? super Unit> continuation) {
        DataStore appDataStore;
        appDataStore = AppPreferencesKt.getAppDataStore(context);
        Object edit = PreferencesKt.edit(appDataStore, new AppPreferences$setShowPulleyChooser$2(z, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    public final boolean showPulleyChooserBlocking(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$showPulleyChooserBlocking$1(context, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    public final void setShowPulleyChooserBlocking(Context context, boolean show) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$setShowPulleyChooserBlocking$1(context, show, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showRpeRom(Context context, Continuation<? super Boolean> continuation) {
        AppPreferences$showRpeRom$1 appPreferences$showRpeRom$1;
        int i;
        DataStore appDataStore;
        if (continuation instanceof AppPreferences$showRpeRom$1) {
            appPreferences$showRpeRom$1 = (AppPreferences$showRpeRom$1) continuation;
            if ((appPreferences$showRpeRom$1.label & Integer.MIN_VALUE) != 0) {
                appPreferences$showRpeRom$1.label -= Integer.MIN_VALUE;
                Object obj = appPreferences$showRpeRom$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appPreferences$showRpeRom$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    appDataStore = AppPreferencesKt.getAppDataStore(context);
                    Flow data = appDataStore.getData();
                    appPreferences$showRpeRom$1.label = 1;
                    obj = FlowKt.first(data, appPreferences$showRpeRom$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Boolean bool = (Boolean) ((Preferences) obj).get(showRpeRomKey);
                return Boxing.boxBoolean(bool == null ? bool.booleanValue() : false);
            }
        }
        appPreferences$showRpeRom$1 = new AppPreferences$showRpeRom$1(this, continuation);
        Object obj2 = appPreferences$showRpeRom$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appPreferences$showRpeRom$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) ((Preferences) obj2).get(showRpeRomKey);
        return Boxing.boxBoolean(bool2 == null ? bool2.booleanValue() : false);
    }

    public final Object setShowRpeRom(Context context, boolean z, Continuation<? super Unit> continuation) {
        DataStore appDataStore;
        appDataStore = AppPreferencesKt.getAppDataStore(context);
        Object edit = PreferencesKt.edit(appDataStore, new AppPreferences$setShowRpeRom$2(z, null), continuation);
        return edit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? edit : Unit.INSTANCE;
    }

    public final boolean showRpeRomBlocking(Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$showRpeRomBlocking$1(context, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    public final void setShowRpeRomBlocking(Context context, boolean show) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__BuildersKt.runBlocking$default(null, new AppPreferences$setShowRpeRomBlocking$1(context, show, null), 1, null);
    }
}
