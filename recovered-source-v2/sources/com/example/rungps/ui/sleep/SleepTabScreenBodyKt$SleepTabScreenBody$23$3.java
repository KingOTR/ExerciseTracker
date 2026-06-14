package com.example.rungps.ui.sleep;

import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.core.content.ContextCompat;
import com.example.rungps.sleep.GoogleCalendarLink;
import com.example.rungps.sleep.SleepAlarmPreferences;
import com.example.rungps.sleep.SleepCalendarHelper;
import com.example.rungps.sleep.SleepCalendarPermissions;
import com.example.rungps.sleep.SleepListenPreferences;
import com.example.rungps.sleep.SleepMlPipelineStatus;
import com.example.rungps.sleep.SleepSonarBeta;
import com.example.rungps.sleep.SleepSpotifyPicker;
import com.example.rungps.sleep.SleepTrackingLiveStats;
import com.example.rungps.sleep.SleepWakePlanner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$23$3 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Integer> $alarmHour$delegate;
    final /* synthetic */ MutableState<Integer> $alarmMinute$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $audioPermLauncher;
    final /* synthetic */ MutableState<Boolean> $autoWakeSuggest$delegate;
    final /* synthetic */ MutableState<SleepCalendarHelper.QueryResult> $calendarQuery$delegate;
    final /* synthetic */ MutableIntState $calendarRefreshTick$delegate;
    final /* synthetic */ boolean $calendarSyncEnabled;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $googleCalendarLinked$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $googleSignInLauncher;
    final /* synthetic */ MutableState<Boolean> $highFidelity$delegate;
    final /* synthetic */ MutableState<String> $homeAddress$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<String, Boolean> $homeLocLauncher;
    final /* synthetic */ MutableState<Boolean> $mapsTravelEta$delegate;
    final /* synthetic */ SleepMlPipelineStatus.Status $mlPipeline;
    final /* synthetic */ MutableState<Long> $nowMs$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> $ringtonePickerLauncher;
    final /* synthetic */ MutableState<Boolean> $saveSoundClips$delegate;
    final /* synthetic */ ColorScheme $scheme;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $showManualCalendar$delegate;
    final /* synthetic */ MutableState<Boolean> $showWakeMood$delegate;
    final /* synthetic */ MutableState<SleepTrackingLiveStats.Live> $sleepLive$delegate;
    final /* synthetic */ MutableState<Boolean> $smartAlarm$delegate;
    final /* synthetic */ MutableState<Boolean> $sonarBeta$delegate;
    final /* synthetic */ MutableState<String> $soundMode$delegate;
    final /* synthetic */ MutableState<String> $spotifyInput$delegate;
    final /* synthetic */ MutableState<Boolean> $trackingActive$delegate;
    final /* synthetic */ MutableState<SleepWakePlanner.Suggestion> $wakeSuggestion$delegate;
    final /* synthetic */ MutableState<Float> $windowMin$delegate;

    SleepTabScreenBodyKt$SleepTabScreenBody$23$3(ColorScheme colorScheme, MutableState<Integer> mutableState, MutableState<Integer> mutableState2, Context context, SleepMlPipelineStatus.Status status, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, boolean z, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher2, MutableState<String> mutableState3, CoroutineScope coroutineScope, ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher3, ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher4, MutableState<String> mutableState4, MutableState<Boolean> mutableState5, MutableState<Float> mutableState6, MutableState<Boolean> mutableState7, MutableState<Boolean> mutableState8, MutableState<Boolean> mutableState9, MutableState<Boolean> mutableState10, MutableState<SleepTrackingLiveStats.Live> mutableState11, MutableState<Long> mutableState12, MutableState<Boolean> mutableState13, MutableState<Boolean> mutableState14, MutableState<Boolean> mutableState15, MutableState<SleepCalendarHelper.QueryResult> mutableState16, MutableIntState mutableIntState, MutableState<SleepWakePlanner.Suggestion> mutableState17, MutableState<Boolean> mutableState18, MutableState<Boolean> mutableState19, MutableState<String> mutableState20) {
        this.$scheme = colorScheme;
        this.$alarmHour$delegate = mutableState;
        this.$alarmMinute$delegate = mutableState2;
        this.$ctx = context;
        this.$mlPipeline = status;
        this.$audioPermLauncher = managedActivityResultLauncher;
        this.$calendarSyncEnabled = z;
        this.$googleSignInLauncher = managedActivityResultLauncher2;
        this.$homeAddress$delegate = mutableState3;
        this.$scope = coroutineScope;
        this.$homeLocLauncher = managedActivityResultLauncher3;
        this.$ringtonePickerLauncher = managedActivityResultLauncher4;
        this.$spotifyInput$delegate = mutableState4;
        this.$trackingActive$delegate = mutableState5;
        this.$windowMin$delegate = mutableState6;
        this.$smartAlarm$delegate = mutableState7;
        this.$saveSoundClips$delegate = mutableState8;
        this.$sonarBeta$delegate = mutableState9;
        this.$highFidelity$delegate = mutableState10;
        this.$sleepLive$delegate = mutableState11;
        this.$nowMs$delegate = mutableState12;
        this.$showWakeMood$delegate = mutableState13;
        this.$googleCalendarLinked$delegate = mutableState14;
        this.$showManualCalendar$delegate = mutableState15;
        this.$calendarQuery$delegate = mutableState16;
        this.$calendarRefreshTick$delegate = mutableIntState;
        this.$wakeSuggestion$delegate = mutableState17;
        this.$autoWakeSuggest$delegate = mutableState18;
        this.$mapsTravelEta$delegate = mutableState19;
        this.$soundMode$delegate = mutableState20;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void invoke(androidx.compose.foundation.layout.ColumnScope r113, androidx.compose.runtime.Composer r114, int r115) {
        /*
            Method dump skipped, instructions count: 6546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$23$3.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$1$lambda$0(MutableState mutableState, int i) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$57(mutableState, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$3$lambda$2(MutableState mutableState, int i) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$61(mutableState, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$5$lambda$4(MutableState mutableState, float f) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$65(mutableState, f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$7$lambda$6(Context context, MutableState mutableState) {
        float SleepTabScreenBody$lambda$64;
        SleepAlarmPreferences sleepAlarmPreferences = SleepAlarmPreferences.INSTANCE;
        SleepTabScreenBody$lambda$64 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$64(mutableState);
        sleepAlarmPreferences.setWindowMin(context, MathKt.roundToInt(SleepTabScreenBody$lambda$64));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$10$lambda$9$lambda$8(Context context, MutableState mutableState, boolean z) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$68(mutableState, z);
        SleepAlarmPreferences.INSTANCE.setSmartAlarmEnabled(context, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$14$lambda$13$lambda$12(Context context, MutableState mutableState, boolean z) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$71(mutableState, z);
        SleepListenPreferences.INSTANCE.setSaveSoundClips(context, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$19$lambda$18$lambda$17(Context context, MutableState mutableState, boolean z) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$74(mutableState, z);
        String onToggleRequested = SleepSonarBeta.INSTANCE.onToggleRequested(context, z);
        if (onToggleRequested != null) {
            Toast.makeText(context, onToggleRequested, 1).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$23$lambda$22$lambda$21(Context context, MutableState mutableState, boolean z) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$77(mutableState, z);
        SleepListenPreferences.INSTANCE.setHighFidelityAudio(context, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$25$lambda$24(MutableState mutableState) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$127(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$27$lambda$26(Context context, ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5) {
        int SleepTabScreenBody$lambda$56;
        int SleepTabScreenBody$lambda$60;
        float SleepTabScreenBody$lambda$64;
        boolean SleepTabScreenBody$lambda$67;
        if (ContextCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0) {
            SleepTabScreenBody$lambda$56 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$56(mutableState);
            SleepTabScreenBody$lambda$60 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$60(mutableState2);
            SleepTabScreenBody$lambda$64 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$64(mutableState3);
            int roundToInt = MathKt.roundToInt(SleepTabScreenBody$lambda$64);
            SleepTabScreenBody$lambda$67 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$67(mutableState4);
            SleepTabComponentsKt.startOvernight(context, SleepTabScreenBody$lambda$56, SleepTabScreenBody$lambda$60, roundToInt, SleepTabScreenBody$lambda$67);
            SleepTabScreenBodyKt.SleepTabScreenBody$lambda$50(mutableState5, true);
        } else {
            managedActivityResultLauncher.launch("android.permission.RECORD_AUDIO");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$29$lambda$28(Context context) {
        SleepCalendarPermissions.INSTANCE.launchPermissionRequest(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$31$lambda$30(ManagedActivityResultLauncher managedActivityResultLauncher, Context context) {
        Intent signInIntent = GoogleCalendarLink.INSTANCE.signInClient(context).getSignInIntent();
        Intrinsics.checkNotNullExpressionValue(signInIntent, "getSignInIntent(...)");
        managedActivityResultLauncher.launch(signInIntent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$33$lambda$32(Context context, MutableState mutableState) {
        GoogleCalendarLink.INSTANCE.disconnect(context);
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$102(mutableState, false);
        Toast.makeText(context, "Google Calendar disconnected", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$35$lambda$34(MutableState mutableState) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$130(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$41$lambda$40$lambda$39(Context context, MutableState mutableState, boolean z) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$86(mutableState, z);
        SleepAlarmPreferences.INSTANCE.setAutoWakeSuggestEnabled(context, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$44$lambda$43$lambda$42(Context context, MutableState mutableState, boolean z) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$89(mutableState, z);
        SleepAlarmPreferences.INSTANCE.setMapsTravelEtaEnabled(context, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$48$lambda$47(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(StringsKt.take(it, MenuKt.InTransitionDuration));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$46$lambda$45(CoroutineScope coroutineScope, MutableState mutableState, Context context, FocusState focus) {
        String SleepTabScreenBody$lambda$92;
        Intrinsics.checkNotNullParameter(focus, "focus");
        if (!focus.isFocused()) {
            SleepTabScreenBody$lambda$92 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$92(mutableState);
            if (!StringsKt.isBlank(SleepTabScreenBody$lambda$92)) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new SleepTabScreenBodyKt$SleepTabScreenBody$23$3$1$20$1$1(context, mutableState, null), 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$50$lambda$49(ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch("android.permission.ACCESS_FINE_LOCATION");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$54$lambda$53$lambda$52$lambda$51(String str, Context context, MutableState mutableState) {
        mutableState.setValue(str);
        SleepAlarmPreferences.INSTANCE.setSoundMode(context, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$57$lambda$56(ManagedActivityResultLauncher managedActivityResultLauncher, Context context) {
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        intent.putExtra("android.intent.extra.ringtone.TYPE", 4);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", false);
        Uri customRingtoneUri = SleepAlarmPreferences.INSTANCE.customRingtoneUri(context);
        if (customRingtoneUri == null) {
            customRingtoneUri = RingtoneManager.getDefaultUri(4);
        }
        intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", customRingtoneUri);
        managedActivityResultLauncher.launch(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$62$lambda$59$lambda$58(Context context) {
        SleepSpotifyPicker.INSTANCE.openBrowse(context, "wake up");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$62$lambda$61$lambda$60(Context context, MutableState mutableState, MutableState mutableState2) {
        if (!SleepSpotifyPicker.INSTANCE.applyClipboardToAlarm(context)) {
            Toast.makeText(context, "Copy a Spotify link first (Share in Spotify)", 1).show();
        } else {
            mutableState.setValue(SleepAlarmPreferences.INSTANCE.spotifyInput(context));
            mutableState2.setValue(SleepAlarmPreferences.SOUND_SPOTIFY);
            Toast.makeText(context, "Alarm sound set from clipboard", 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$66$lambda$64$lambda$63(Context context, MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        SleepAlarmPreferences.INSTANCE.setSpotifyInput(context, it);
        return Unit.INSTANCE;
    }
}
