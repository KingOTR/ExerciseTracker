package com.example.rungps.data;

import android.content.SharedPreferences;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: AppPreferences.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.AppPreferences$migrateFromLegacyIfNeeded$2", f = "AppPreferences.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppPreferences$migrateFromLegacyIfNeeded$2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
    final /* synthetic */ SharedPreferences $legacy;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppPreferences$migrateFromLegacyIfNeeded$2(SharedPreferences sharedPreferences, Continuation<? super AppPreferences$migrateFromLegacyIfNeeded$2> continuation) {
        super(2, continuation);
        this.$legacy = sharedPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppPreferences$migrateFromLegacyIfNeeded$2 appPreferences$migrateFromLegacyIfNeeded$2 = new AppPreferences$migrateFromLegacyIfNeeded$2(this.$legacy, continuation);
        appPreferences$migrateFromLegacyIfNeeded$2.L$0 = obj;
        return appPreferences$migrateFromLegacyIfNeeded$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
        return ((AppPreferences$migrateFromLegacyIfNeeded$2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Preferences.Key key;
        Preferences.Key key2;
        Preferences.Key key3;
        Preferences.Key key4;
        Preferences.Key key5;
        Preferences.Key key6;
        Preferences.Key key7;
        Preferences.Key key8;
        Preferences.Key key9;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        String string = this.$legacy.getString("themeMode", null);
        if (string != null) {
            key9 = AppPreferences.themeModeKey;
            mutablePreferences.set(key9, string);
        }
        if (this.$legacy.contains("onboardingDone")) {
            key8 = AppPreferences.onboardingDoneKey;
            mutablePreferences.set(key8, Boxing.boxBoolean(this.$legacy.getBoolean("onboardingDone", false)));
        }
        long j = this.$legacy.getLong("gymActiveSplitId", -1L);
        if (j > 0) {
            key7 = AppPreferences.gymActiveSplitIdKey;
            mutablePreferences.set(key7, String.valueOf(j));
        }
        String string2 = this.$legacy.getString("gym_carryover_mode", null);
        if (string2 != null) {
            key6 = AppPreferences.carryoverModeKey;
            mutablePreferences.set(key6, string2);
        }
        if (this.$legacy.contains("gym_volume_heatmap_days")) {
            key5 = AppPreferences.volumeHeatmapDaysKey;
            mutablePreferences.set(key5, Boxing.boxInt(this.$legacy.getInt("gym_volume_heatmap_days", 90)));
        }
        if (this.$legacy.contains("map_engine")) {
            key4 = AppPreferences.mapEngineKey;
            SharedPreferences sharedPreferences = this.$legacy;
            String str = AppPreferences.MAP_ENGINE_MAPLIBRE;
            String string3 = sharedPreferences.getString("map_engine", AppPreferences.MAP_ENGINE_MAPLIBRE);
            if (string3 != null) {
                str = string3;
            }
            mutablePreferences.set(key4, str);
        }
        String string4 = this.$legacy.getString("stravaClientId", null);
        if (string4 != null) {
            key3 = AppPreferences.stravaClientIdKey;
            mutablePreferences.set(key3, string4);
        }
        String string5 = this.$legacy.getString("bleLastAddress", null);
        if (string5 != null) {
            key2 = AppPreferences.bleLastAddressKey;
            mutablePreferences.set(key2, string5);
        }
        key = AppPreferences.migratedKey;
        mutablePreferences.set(key, Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
