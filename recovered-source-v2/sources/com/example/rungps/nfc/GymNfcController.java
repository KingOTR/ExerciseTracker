package com.example.rungps.nfc;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.example.rungps.MainActivity;
import com.example.rungps.nfc.GymNfcHandler;
import com.example.rungps.notify.AppNotifications;
import com.example.rungps.notify.GymNfcNotifier;
import com.example.rungps.notify.RestTimerNotifier;
import com.example.rungps.sleep.SleepAlarmDismiss;
import com.example.rungps.util.HapticFeedback;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymNfcController.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100J\u0006\u00101\u001a\u00020.J\u0006\u00102\u001a\u00020.J\u0006\u00103\u001a\u00020.J\u000e\u00104\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0010\u00105\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100J\u0006\u00106\u001a\u00020.J\u0006\u00107\u001a\u00020.J\b\u00108\u001a\u00020\"H\u0002J\b\u00109\u001a\u00020.H\u0002J\u0018\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\"H\u0002J\u0010\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020%H\u0002J\u0010\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020\u0013H\u0002J\u0010\u0010B\u001a\u00020.2\u0006\u0010A\u001a\u00020\u0013H\u0002J\u000e\u0010C\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010DJ\b\u0010E\u001a\u00020\"H\u0002J\b\u0010F\u001a\u00020.H\u0002J\u0010\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020.H\u0002J\b\u0010K\u001a\u00020.H\u0002J\b\u0010L\u001a\u00020.H\u0002J\u0012\u0010M\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0012\u0010N\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR/\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/example/rungps/nfc/GymNfcController;", "", "activity", "Landroidx/activity/ComponentActivity;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "<set-?>", "", "pulse", "getPulse", "()I", "setPulse", "(I)V", "pulse$delegate", "Landroidx/compose/runtime/MutableIntState;", "confirmSeq", "getConfirmSeq", "setConfirmSeq", "confirmSeq$delegate", "", "prompt", "getPrompt", "()Ljava/lang/String;", "setPrompt", "(Ljava/lang/String;)V", "prompt$delegate", "Landroidx/compose/runtime/MutableState;", "nfcAdapter", "Landroid/nfc/NfcAdapter;", "getNfcAdapter", "()Landroid/nfc/NfcAdapter;", "nfcAdapter$delegate", "Lkotlin/Lazy;", "nfcReaderActive", "", "activityResumed", "pendingTagResult", "Lcom/example/rungps/nfc/GymNfcHandler$TagResult;", "nfcSaverHandler", "Landroid/os/Handler;", "nfcSaverPollScheduled", "nfcSaverPollRunnable", "Ljava/lang/Runnable;", "nfcReaderCallback", "Landroid/nfc/NfcAdapter$ReaderCallback;", "onCreateHandleIntent", "", "intent", "Landroid/content/Intent;", "deliverPendingTagResult", "onResume", "onPause", "onNewIntent", "afterCreateIntents", "updateReaderMode", "bumpPulse", "nfcIsBackground", "clearNfcDiscoveryIntent", "notifyNfcScanMiss", "tag", "Landroid/nfc/Tag;", "hasOpenSession", "deliverMembershipTagResult", "result", "promptOrAutoNfc", "kind", "promptOrAutoNfcAfterLocation", "recoveryBlocksStart", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldListenForGymNfc", "enableNfcReaderModeContinuous", "openNfcListenWindow", "durationMs", "", "scheduleNfcSaverPoll", "stopNfcSaverPolling", "disableNfcReaderMode", "handleTagIntentWhileRunning", "deliverNfcIntentAction", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymNfcController {
    public static final int $stable = 8;
    private final ComponentActivity activity;
    private boolean activityResumed;

    /* renamed from: confirmSeq$delegate, reason: from kotlin metadata */
    private final MutableIntState confirmSeq;

    /* renamed from: nfcAdapter$delegate, reason: from kotlin metadata */
    private final Lazy nfcAdapter;
    private boolean nfcReaderActive;
    private final NfcAdapter.ReaderCallback nfcReaderCallback;
    private final Handler nfcSaverHandler;
    private final Runnable nfcSaverPollRunnable;
    private boolean nfcSaverPollScheduled;
    private GymNfcHandler.TagResult pendingTagResult;

    /* renamed from: prompt$delegate, reason: from kotlin metadata */
    private final MutableState prompt;

    /* renamed from: pulse$delegate, reason: from kotlin metadata */
    private final MutableIntState pulse;

    /* compiled from: GymNfcController.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GymNfcHandler.TagResult.values().length];
            try {
                iArr[GymNfcHandler.TagResult.REGISTERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GymNfcHandler.TagResult.ASK_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GymNfcHandler.TagResult.ASK_FINISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GymNfcController(ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.pulse = SnapshotIntStateKt.mutableIntStateOf(0);
        this.confirmSeq = SnapshotIntStateKt.mutableIntStateOf(0);
        this.prompt = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.nfcAdapter = LazyKt.lazy(new Function0() { // from class: com.example.rungps.nfc.GymNfcController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NfcAdapter nfcAdapter_delegate$lambda$0;
                nfcAdapter_delegate$lambda$0 = GymNfcController.nfcAdapter_delegate$lambda$0(GymNfcController.this);
                return nfcAdapter_delegate$lambda$0;
            }
        });
        this.nfcSaverHandler = new Handler(Looper.getMainLooper());
        this.nfcSaverPollRunnable = new Runnable() { // from class: com.example.rungps.nfc.GymNfcController$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                GymNfcController.nfcSaverPollRunnable$lambda$1(GymNfcController.this);
            }
        };
        this.nfcReaderCallback = new NfcAdapter.ReaderCallback() { // from class: com.example.rungps.nfc.GymNfcController$$ExternalSyntheticLambda3
            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(Tag tag) {
                GymNfcController.nfcReaderCallback$lambda$4(GymNfcController.this, tag);
            }
        };
    }

    private final void setPulse(int i) {
        this.pulse.setIntValue(i);
    }

    public final int getPulse() {
        return this.pulse.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConfirmSeq(int i) {
        this.confirmSeq.setIntValue(i);
    }

    public final int getConfirmSeq() {
        return this.confirmSeq.getIntValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getPrompt() {
        return (String) this.prompt.getValue();
    }

    public final void setPrompt(String str) {
        this.prompt.setValue(str);
    }

    private final NfcAdapter getNfcAdapter() {
        return (NfcAdapter) this.nfcAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NfcAdapter nfcAdapter_delegate$lambda$0(GymNfcController gymNfcController) {
        return NfcAdapter.getDefaultAdapter(gymNfcController.activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nfcSaverPollRunnable$lambda$1(GymNfcController gymNfcController) {
        gymNfcController.nfcSaverPollScheduled = false;
        if (!gymNfcController.shouldListenForGymNfc()) {
            gymNfcController.stopNfcSaverPolling();
        } else {
            gymNfcController.openNfcListenWindow(5000L);
            gymNfcController.scheduleNfcSaverPoll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nfcReaderCallback$lambda$4(final GymNfcController gymNfcController, final Tag tag) {
        final boolean hasOpenSession = OpenGymSessionCache.INSTANCE.hasOpenSession();
        GymNfcHandler gymNfcHandler = GymNfcHandler.INSTANCE;
        ComponentActivity componentActivity = gymNfcController.activity;
        Intrinsics.checkNotNull(tag);
        final GymNfcHandler.TagResult handleReaderTag = gymNfcHandler.handleReaderTag(componentActivity, tag, hasOpenSession, true);
        if ((handleReaderTag == null ? -1 : WhenMappings.$EnumSwitchMapping$0[handleReaderTag.ordinal()]) == -1) {
            gymNfcController.activity.runOnUiThread(new Runnable() { // from class: com.example.rungps.nfc.GymNfcController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    GymNfcController.nfcReaderCallback$lambda$4$lambda$2(GymNfcController.this, tag, hasOpenSession);
                }
            });
        } else {
            gymNfcController.activity.runOnUiThread(new Runnable() { // from class: com.example.rungps.nfc.GymNfcController$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    GymNfcController.nfcReaderCallback$lambda$4$lambda$3(GymNfcController.this, handleReaderTag);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nfcReaderCallback$lambda$4$lambda$2(GymNfcController gymNfcController, Tag tag, boolean z) {
        Intrinsics.checkNotNull(tag);
        gymNfcController.notifyNfcScanMiss(tag, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nfcReaderCallback$lambda$4$lambda$3(GymNfcController gymNfcController, GymNfcHandler.TagResult tagResult) {
        gymNfcController.deliverMembershipTagResult(tagResult);
        gymNfcController.updateReaderMode();
    }

    public final void onCreateHandleIntent(Intent intent) {
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.nfc.action.TAG_DISCOVERED")) {
            BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getMain(), CoroutineStart.UNDISPATCHED, new GymNfcController$onCreateHandleIntent$1(intent, this, null));
        }
    }

    public final void deliverPendingTagResult() {
        GymNfcHandler.TagResult tagResult = this.pendingTagResult;
        if (tagResult != null) {
            deliverMembershipTagResult(tagResult);
        }
        this.pendingTagResult = null;
    }

    public final void onResume() {
        this.activityResumed = true;
        AppNotifications.INSTANCE.onAppOpened(this.activity, 4402, RestTimerNotifier.NOTIF_ID, 7103, SleepAlarmDismiss.SOUND_NOTIFICATION_ID);
        updateReaderMode();
    }

    public final void onPause() {
        this.activityResumed = false;
        stopNfcSaverPolling();
        disableNfcReaderMode();
    }

    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(intent.getAction(), "android.nfc.action.TAG_DISCOVERED")) {
            handleTagIntentWhileRunning(intent);
        } else {
            deliverNfcIntentAction(intent);
        }
    }

    public final void afterCreateIntents(Intent intent) {
        if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.nfc.action.TAG_DISCOVERED")) {
            deliverNfcIntentAction(intent);
        }
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.nfc.action.TAG_DISCOVERED")) {
            clearNfcDiscoveryIntent();
        }
    }

    public final void updateReaderMode() {
        if (getNfcAdapter() == null) {
            return;
        }
        NfcAdapter nfcAdapter = getNfcAdapter();
        if (nfcAdapter == null || !nfcAdapter.isEnabled()) {
            stopNfcSaverPolling();
            disableNfcReaderMode();
            return;
        }
        if (!shouldListenForGymNfc()) {
            stopNfcSaverPolling();
            disableNfcReaderMode();
            return;
        }
        if (GymNfcConfig.INSTANCE.isRegistering(this.activity)) {
            stopNfcSaverPolling();
            enableNfcReaderModeContinuous();
        } else if (GymNfcBattery.INSTANCE.isPowerSave(this.activity)) {
            disableNfcReaderMode();
            scheduleNfcSaverPoll();
            openNfcListenWindow(5000L);
        } else {
            stopNfcSaverPolling();
            enableNfcReaderModeContinuous();
        }
    }

    public final void bumpPulse() {
        setPulse(getPulse() + 1);
    }

    private final boolean nfcIsBackground() {
        return !this.activityResumed;
    }

    private final void clearNfcDiscoveryIntent() {
        Intent intent = this.activity.getIntent();
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.nfc.action.TAG_DISCOVERED")) {
            ComponentActivity componentActivity = this.activity;
            Intent intent2 = new Intent(this.activity, (Class<?>) MainActivity.class);
            intent2.addFlags(603979776);
            componentActivity.setIntent(intent2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyNfcScanMiss(Tag tag, boolean hasOpenSession) {
        HapticFeedback.INSTANCE.pulse(this.activity, HapticFeedback.Pattern.Nfc);
        boolean nfcIsBackground = nfcIsBackground();
        GymNfcHandler gymNfcHandler = GymNfcHandler.INSTANCE;
        byte[] id = tag.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        String formatTagId = gymNfcHandler.formatTagId(id);
        if (GymNfcConfig.INSTANCE.isRegistering(this.activity)) {
            GymNfcNotifier.INSTANCE.notifyRegistering(this.activity, nfcIsBackground);
            Toast.makeText(this.activity, "Hold your gym membership card on the back of the phone", 1).show();
        } else if (GymNfcConfig.INSTANCE.matchesRegisteredUid(this.activity, formatTagId) && !GymNfcConfig.INSTANCE.wouldAcceptTagScan(this.activity)) {
            GymNfcNotifier.INSTANCE.notifyScanTooSoon(this.activity, nfcIsBackground);
        } else if (GymNfcConfig.INSTANCE.hasRegisteredTag(this.activity) && !GymNfcConfig.INSTANCE.matchesRegisteredUid(this.activity, formatTagId)) {
            GymNfcNotifier.INSTANCE.notifyUnrecognizedTag(this.activity, nfcIsBackground);
        } else if (!GymNfcConfig.INSTANCE.hasRegisteredTag(this.activity)) {
            GymNfcNotifier.INSTANCE.notifyNoCardRegistered(this.activity, nfcIsBackground);
            Toast.makeText(this.activity, "NFC detected — register your gym card under Gym → More", 1).show();
        } else {
            String readNdefActionFromTag = GymNfcHandler.INSTANCE.readNdefActionFromTag(tag);
            if (Intrinsics.areEqual(readNdefActionFromTag, "finish") && !hasOpenSession) {
                GymNfcNotifier.INSTANCE.notifyNoOpenSession(this.activity, nfcIsBackground);
                Toast.makeText(this.activity, "No open gym session to finish", 0).show();
            } else if (readNdefActionFromTag != null) {
                GymNfcHandler.TagResult tagResultForAction = GymNfcHandler.INSTANCE.tagResultForAction(readNdefActionFromTag, hasOpenSession);
                if (tagResultForAction != null) {
                    deliverMembershipTagResult(tagResultForAction);
                } else {
                    GymNfcNotifier.INSTANCE.notifyGenericTag(this.activity, "Gym tag (" + readNdefActionFromTag + ")", nfcIsBackground);
                    Toast.makeText(this.activity, "Gym tag scanned", 0).show();
                }
            } else {
                GymNfcNotifier.INSTANCE.notifyGenericTag(this.activity, "Tag " + formatTagId, nfcIsBackground);
                Toast.makeText(this.activity, "NFC tag scanned", 0).show();
            }
        }
        bumpPulse();
    }

    private final void deliverMembershipTagResult(GymNfcHandler.TagResult result) {
        String str;
        HapticFeedback.INSTANCE.pulse(this.activity, HapticFeedback.Pattern.Nfc);
        int i = WhenMappings.$EnumSwitchMapping$0[result.ordinal()];
        if (i == 1) {
            str = "register";
        } else if (i == 2) {
            str = "start";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "finish";
        }
        GymCheckInStore.INSTANCE.record(this.activity, str, GymNfcGuard.INSTANCE.nearestGymName(this.activity), GymNfcConfig.INSTANCE.lastMatchedCardName(this.activity));
        GymNfcNotifier.INSTANCE.notifyTagResult(this.activity, str, nfcIsBackground());
        int i2 = WhenMappings.$EnumSwitchMapping$0[result.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                promptOrAutoNfc("start");
                return;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                promptOrAutoNfc("finish");
                return;
            }
        }
        GymNfcHandler.INSTANCE.requestOpenTab(this.activity, "gym");
        String lastMatchedCardName = GymNfcConfig.INSTANCE.lastMatchedCardName(this.activity);
        if (lastMatchedCardName == null) {
            RegisteredGymCard registeredGymCard = (RegisteredGymCard) CollectionsKt.lastOrNull((List) GymCardStore.INSTANCE.all(this.activity));
            lastMatchedCardName = registeredGymCard != null ? registeredGymCard.getName() : null;
        }
        Toast.makeText(this.activity, lastMatchedCardName != null ? "Registered: " + lastMatchedCardName : "Gym card registered", 0).show();
        bumpPulse();
    }

    private final void promptOrAutoNfc(String kind) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.activity), null, null, new GymNfcController$promptOrAutoNfc$1(this, kind, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void promptOrAutoNfcAfterLocation(String kind) {
        GymNfcHandler.INSTANCE.requestOpenTab(this.activity, "gym");
        if (GymNfcConfig.INSTANCE.autoStartAtGymOnly(this.activity) && GymNfcGuard.INSTANCE.isAtGym(this.activity)) {
            if (Intrinsics.areEqual(kind, "start")) {
                BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(this.activity), Dispatchers.getMain(), CoroutineStart.UNDISPATCHED, new GymNfcController$promptOrAutoNfcAfterLocation$1(this, kind, null));
                return;
            } else if (Intrinsics.areEqual(kind, "finish")) {
                GymNfcHandler.INSTANCE.setPending(this.activity, "finish");
                bumpPulse();
                Toast.makeText(this.activity, "Finishing gym session — open Gym tab", 0).show();
                return;
            }
        }
        setPrompt(kind);
        setConfirmSeq(getConfirmSeq() + 1);
        bumpPulse();
        Toast.makeText(this.activity, Intrinsics.areEqual(kind, "finish") ? "Gym card — finish session?" : "Gym card — start session?", 0).show();
    }

    public final Object recoveryBlocksStart(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GymNfcController$recoveryBlocksStart$2(this, null), continuation);
    }

    private final boolean shouldListenForGymNfc() {
        NfcAdapter nfcAdapter = getNfcAdapter();
        if (nfcAdapter != null && nfcAdapter.isEnabled()) {
            return GymNfcConfig.INSTANCE.isRegistering(this.activity) || this.activityResumed;
        }
        return false;
    }

    private final void enableNfcReaderModeContinuous() {
        NfcAdapter nfcAdapter = getNfcAdapter();
        if (nfcAdapter == null || this.nfcReaderActive) {
            return;
        }
        nfcAdapter.enableReaderMode(this.activity, this.nfcReaderCallback, 143, null);
        this.nfcReaderActive = true;
    }

    private final void openNfcListenWindow(long durationMs) {
        if (shouldListenForGymNfc()) {
            enableNfcReaderModeContinuous();
            this.nfcSaverHandler.postDelayed(new Runnable() { // from class: com.example.rungps.nfc.GymNfcController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GymNfcController.this.disableNfcReaderMode();
                }
            }, durationMs);
        }
    }

    private final void scheduleNfcSaverPoll() {
        if (this.nfcSaverPollScheduled) {
            return;
        }
        this.nfcSaverPollScheduled = true;
        this.nfcSaverHandler.postDelayed(this.nfcSaverPollRunnable, GymNfcBattery.INSTANCE.saverPollIntervalMs(this.activity));
    }

    private final void stopNfcSaverPolling() {
        this.nfcSaverHandler.removeCallbacks(this.nfcSaverPollRunnable);
        this.nfcSaverPollScheduled = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableNfcReaderMode() {
        NfcAdapter nfcAdapter = getNfcAdapter();
        if (nfcAdapter != null) {
            nfcAdapter.disableReaderMode(this.activity);
        }
        this.nfcReaderActive = false;
    }

    private final void handleTagIntentWhileRunning(Intent intent) {
        boolean hasOpenSession = OpenGymSessionCache.INSTANCE.hasOpenSession();
        GymNfcHandler.TagResult handleTagDiscoveryIntent = GymNfcHandler.INSTANCE.handleTagDiscoveryIntent(this.activity, intent, hasOpenSession, true);
        if (handleTagDiscoveryIntent != null) {
            deliverMembershipTagResult(handleTagDiscoveryIntent);
        } else {
            Tag tag = intent != null ? (Tag) intent.getParcelableExtra("android.nfc.extra.TAG", Tag.class) : null;
            if (tag != null) {
                notifyNfcScanMiss(tag, hasOpenSession);
            }
        }
        clearNfcDiscoveryIntent();
    }

    private final void deliverNfcIntentAction(Intent intent) {
        String parseIntentAction = GymNfcHandler.INSTANCE.parseIntentAction(intent);
        if (parseIntentAction == null) {
            return;
        }
        boolean hasOpenSession = OpenGymSessionCache.INSTANCE.hasOpenSession();
        GymNfcHandler.TagResult tagResultForAction = GymNfcHandler.INSTANCE.tagResultForAction(parseIntentAction, hasOpenSession);
        if (tagResultForAction != null) {
            deliverMembershipTagResult(tagResultForAction);
            return;
        }
        if (Intrinsics.areEqual(parseIntentAction, "finish") && !hasOpenSession) {
            GymNfcNotifier.INSTANCE.notifyNoOpenSession(this.activity, nfcIsBackground());
            Toast.makeText(this.activity, "No open gym session to finish", 0).show();
        } else {
            GymNfcHandler.INSTANCE.setPending(this.activity, parseIntentAction);
            GymNfcNotifier.show$default(GymNfcNotifier.INSTANCE, this.activity, "Gym tag scanned", "Open the app to continue", false, false, nfcIsBackground(), 24, null);
            Toast.makeText(this.activity, "Gym tag scanned", 0).show();
            bumpPulse();
        }
    }
}
