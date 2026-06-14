package com.example.rungps.ui.onboarding;

import android.content.Context;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.health.platform.client.SdkConfig;
import com.example.rungps.data.UserProfileStore;
import com.example.rungps.ui.profile.ProfileFormStrings;
import com.example.rungps.ui.profile.UserProfileFormKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OnboardingWizard.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001aU\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"OnboardingWizard", "", "onOpenGym", "Lkotlin/Function0;", "onDismiss", "onRequestRuntimePermissions", "onRequestHealthConnect", "runtimeStatusLine", "", "healthConnectStatusLine", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "step", "", "displayName", "ageText", "dobText", "heightText", "weightText", "sex"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingWizardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingWizard$lambda$34(Function0 function0, Function0 function02, Function0 function03, Function0 function04, String str, String str2, int i, Composer composer, int i2) {
        OnboardingWizard(function0, function02, function03, function04, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OnboardingWizard(final Function0<Unit> onOpenGym, final Function0<Unit> onDismiss, final Function0<Unit> onRequestRuntimePermissions, final Function0<Unit> onRequestHealthConnect, final String runtimeStatusLine, final String healthConnectStatusLine, Composer composer, final int i) {
        int i2;
        final ProfileFormStrings profileFormStrings;
        final ProfileFormStrings profileFormStrings2;
        final ProfileFormStrings profileFormStrings3;
        final ProfileFormStrings profileFormStrings4;
        int i3;
        int i4;
        Integer num;
        OnboardingStep onboardingStep;
        List list;
        final MutableIntState mutableIntState;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onOpenGym, "onOpenGym");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onRequestRuntimePermissions, "onRequestRuntimePermissions");
        Intrinsics.checkNotNullParameter(onRequestHealthConnect, "onRequestHealthConnect");
        Intrinsics.checkNotNullParameter(runtimeStatusLine, "runtimeStatusLine");
        Intrinsics.checkNotNullParameter(healthConnectStatusLine, "healthConnectStatusLine");
        Composer startRestartGroup = composer.startRestartGroup(-1432527539);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(onOpenGym) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onRequestRuntimePermissions) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onRequestHealthConnect) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(runtimeStatusLine) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(healthConnectStatusLine) ? 131072 : 65536;
        }
        int i5 = i2;
        if ((74899 & i5) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1432527539, i5, -1, "com.example.rungps.ui.onboarding.OnboardingWizard (OnboardingWizard.kt:105)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            startRestartGroup.startReplaceGroup(-655134178);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableIntState mutableIntState2 = (MutableIntState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-655132236);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = UserProfileFormKt.toFormStrings(UserProfileStore.INSTANCE.load(context));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final ProfileFormStrings profileFormStrings5 = (ProfileFormStrings) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            Object[] objArr = new Object[0];
            startRestartGroup.startReplaceGroup(-655129141);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState OnboardingWizard$lambda$5$lambda$4;
                        OnboardingWizard$lambda$5$lambda$4 = OnboardingWizardKt.OnboardingWizard$lambda$5$lambda$4(ProfileFormStrings.this);
                        return OnboardingWizard$lambda$5$lambda$4;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            boolean z = false;
            MutableState mutableState = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            startRestartGroup.startReplaceGroup(-655126457);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                profileFormStrings = profileFormStrings5;
                rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState OnboardingWizard$lambda$9$lambda$8;
                        OnboardingWizard$lambda$9$lambda$8 = OnboardingWizardKt.OnboardingWizard$lambda$9$lambda$8(ProfileFormStrings.this);
                        return OnboardingWizard$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                profileFormStrings = profileFormStrings5;
            }
            startRestartGroup.endReplaceGroup();
            ProfileFormStrings profileFormStrings6 = profileFormStrings;
            MutableState mutableState2 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
            Object[] objArr3 = new Object[0];
            startRestartGroup.startReplaceGroup(-655123897);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                profileFormStrings2 = profileFormStrings6;
                rememberedValue5 = new Function0() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState OnboardingWizard$lambda$13$lambda$12;
                        OnboardingWizard$lambda$13$lambda$12 = OnboardingWizardKt.OnboardingWizard$lambda$13$lambda$12(ProfileFormStrings.this);
                        return OnboardingWizard$lambda$13$lambda$12;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                profileFormStrings2 = profileFormStrings6;
            }
            startRestartGroup.endReplaceGroup();
            ProfileFormStrings profileFormStrings7 = profileFormStrings2;
            MutableState mutableState3 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue5, startRestartGroup, 3072, 6);
            Object[] objArr4 = new Object[0];
            startRestartGroup.startReplaceGroup(-655121238);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                profileFormStrings3 = profileFormStrings7;
                rememberedValue6 = new Function0() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState OnboardingWizard$lambda$17$lambda$16;
                        OnboardingWizard$lambda$17$lambda$16 = OnboardingWizardKt.OnboardingWizard$lambda$17$lambda$16(ProfileFormStrings.this);
                        return OnboardingWizard$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                profileFormStrings3 = profileFormStrings7;
            }
            startRestartGroup.endReplaceGroup();
            ProfileFormStrings profileFormStrings8 = profileFormStrings3;
            MutableState mutableState4 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) rememberedValue6, startRestartGroup, 3072, 6);
            Object[] objArr5 = new Object[0];
            startRestartGroup.startReplaceGroup(-655118486);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                profileFormStrings4 = profileFormStrings8;
                rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState OnboardingWizard$lambda$21$lambda$20;
                        OnboardingWizard$lambda$21$lambda$20 = OnboardingWizardKt.OnboardingWizard$lambda$21$lambda$20(ProfileFormStrings.this);
                        return OnboardingWizard$lambda$21$lambda$20;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            } else {
                profileFormStrings4 = profileFormStrings8;
            }
            startRestartGroup.endReplaceGroup();
            final ProfileFormStrings profileFormStrings9 = profileFormStrings4;
            MutableState mutableState5 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) rememberedValue7, startRestartGroup, 3072, 6);
            Object[] objArr6 = new Object[0];
            startRestartGroup.startReplaceGroup(-655115965);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function0() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState OnboardingWizard$lambda$25$lambda$24;
                        OnboardingWizard$lambda$25$lambda$24 = OnboardingWizardKt.OnboardingWizard$lambda$25$lambda$24(ProfileFormStrings.this);
                        return OnboardingWizard$lambda$25$lambda$24;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState6 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr6, (Saver) null, (String) null, (Function0) rememberedValue8, startRestartGroup, 3072, 6);
            startRestartGroup.startReplaceGroup(-655111253);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                i3 = 2;
                rememberedValue9 = CollectionsKt.listOf((Object[]) new OnboardingStep[]{new OnboardingStep("Welcome to Exercise Tracker", "This install is empty — no runs, gym logs, or passwords are bundled in the APK. Your data stays on your phone unless you sign in with your own account.", false, false, false, 28, null), new OnboardingStep("About you", "Basic stats help with BMI and future personalized load advice. You can change these anytime under More → Profile.", true, false, false, 24, null), new OnboardingStep("Allow phone permissions", "Grant location (GPS runs & map), notifications (run timer & gym rest), activity recognition, and Bluetooth (optional watch).", false, true, false, 20, null), new OnboardingStep("Health Connect", "Allows steps, sleep, and heart rate for recovery and daily stats. Install or update Health Connect from Play Store if prompted.", false, false, true, 12, null), new OnboardingStep("Home — runs & watch", "Home tab: pick a route (optional), tap Start run for GPS tracking. Scan/connect a BLE watch if you use one.", false, false, false, 28, null), new OnboardingStep("Map & History", "Map: offline tiles and route planning. History: past runs and optional Strava PB import.", false, false, false, 28, null), new OnboardingStep("Gym", "Gym → Workout logs sets, rest timer, and split days. NFC registers your membership tag. Progress shows muscle load and PRs.", false, false, false, 28, null), new OnboardingStep("Gym NFC card", "Gym → NFC: register your membership tag to check in or finish a session. Scanning can open the gym tab even from the lock screen when NFC is enabled.", false, false, false, 28, null), new OnboardingStep("Home screen widgets", "Add Gym tracker and Coach & recovery widgets from the widget picker. After updating the app, remove old widgets and add them again if they look stuck.", false, false, false, 28, null), new OnboardingStep("Recovery & more", "Recovery merges training load. Sleep and sport sessions live under More.", false, false, false, 28, null), new OnboardingStep("You're set", "Use the bottom tabs anytime. Re-open permissions from Home if you skipped them.", false, false, false, 28, null)});
                startRestartGroup.updateRememberedValue(rememberedValue9);
            } else {
                i3 = 2;
            }
            List list2 = (List) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            OnboardingStep onboardingStep2 = (OnboardingStep) list2.get(OnboardingWizard$lambda$1(mutableIntState2));
            String str = runtimeStatusLine;
            if (str.length() == 0) {
                str = OnboardingPermissions.INSTANCE.runtimeStatusLine(context);
            }
            String str2 = str;
            String str3 = healthConnectStatusLine;
            if (str3.length() == 0) {
                str3 = OnboardingPermissions.healthConnectStatusLine$default(OnboardingPermissions.INSTANCE, context, null, i3, null);
            }
            String str4 = str3;
            Integer valueOf = Integer.valueOf(OnboardingWizard$lambda$1(mutableIntState2));
            startRestartGroup.startReplaceGroup(-655010173);
            boolean changedInstance = startRestartGroup.changedInstance(list2) | startRestartGroup.changedInstance(context) | ((i5 & 896) == 256) | ((i5 & 7168) == 2048);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                i4 = i5;
                num = valueOf;
                onboardingStep = onboardingStep2;
                list = list2;
                rememberedValue10 = (Function2) new OnboardingWizardKt$OnboardingWizard$1$1(list2, context, onRequestRuntimePermissions, onRequestHealthConnect, mutableIntState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            } else {
                i4 = i5;
                num = valueOf;
                onboardingStep = onboardingStep2;
                list = list2;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue10, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-654997463);
            final List list3 = list;
            boolean changedInstance2 = startRestartGroup.changedInstance(list3);
            if ((i4 & SdkConfig.SDK_VERSION) == 32) {
                z = true;
            }
            boolean z2 = z | changedInstance2;
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                mutableIntState = mutableIntState2;
                rememberedValue11 = new Function0() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit OnboardingWizard$lambda$33$lambda$32;
                        OnboardingWizard$lambda$33$lambda$32 = OnboardingWizardKt.OnboardingWizard$lambda$33$lambda$32(list3, onDismiss, mutableIntState);
                        return OnboardingWizard$lambda$33$lambda$32;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            } else {
                mutableIntState = mutableIntState2;
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-793188859, true, new OnboardingWizardKt$OnboardingWizard$3(onboardingStep, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, context, list3, onDismiss, mutableIntState), composer2, 54);
            MutableIntState mutableIntState3 = mutableIntState;
            final OnboardingStep onboardingStep3 = onboardingStep;
            AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue11, rememberComposableLambda, null, ComposableLambdaKt.rememberComposableLambda(-1579186749, true, new OnboardingWizardKt$OnboardingWizard$4(onboardingStep3, context, list3, onDismiss, onOpenGym, mutableIntState3), composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(1929782657, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$OnboardingWizard$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                    invoke(composer3, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1929782657, i6, -1, "com.example.rungps.ui.onboarding.OnboardingWizard.<anonymous> (OnboardingWizard.kt:269)");
                    }
                    TextKt.m2376Text4IGK_g(OnboardingStep.this.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(1536783712, true, new OnboardingWizardKt$OnboardingWizard$6(onboardingStep3, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, str2, onRequestRuntimePermissions, str4, onRequestHealthConnect, list3, mutableIntState3), composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.onboarding.OnboardingWizardKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OnboardingWizard$lambda$34;
                    OnboardingWizard$lambda$34 = OnboardingWizardKt.OnboardingWizard$lambda$34(Function0.this, onDismiss, onRequestRuntimePermissions, onRequestHealthConnect, runtimeStatusLine, healthConnectStatusLine, i, (Composer) obj, ((Integer) obj2).intValue());
                    return OnboardingWizard$lambda$34;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int OnboardingWizard$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState OnboardingWizard$lambda$5$lambda$4(ProfileFormStrings profileFormStrings) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(profileFormStrings.getDisplayName(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String OnboardingWizard$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String OnboardingWizard$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState OnboardingWizard$lambda$9$lambda$8(ProfileFormStrings profileFormStrings) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(profileFormStrings.getAgeText(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState OnboardingWizard$lambda$13$lambda$12(ProfileFormStrings profileFormStrings) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(profileFormStrings.getDobText(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String OnboardingWizard$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState OnboardingWizard$lambda$17$lambda$16(ProfileFormStrings profileFormStrings) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(profileFormStrings.getHeightText(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String OnboardingWizard$lambda$18(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState OnboardingWizard$lambda$21$lambda$20(ProfileFormStrings profileFormStrings) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(profileFormStrings.getWeightText(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String OnboardingWizard$lambda$22(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState OnboardingWizard$lambda$25$lambda$24(ProfileFormStrings profileFormStrings) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(profileFormStrings.getSex(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String OnboardingWizard$lambda$26(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OnboardingWizard$advanceStep(List<OnboardingStep> list, Function0<Unit> function0, MutableIntState mutableIntState) {
        if (OnboardingWizard$lambda$1(mutableIntState) < CollectionsKt.getLastIndex(list)) {
            mutableIntState.setIntValue(OnboardingWizard$lambda$1(mutableIntState) + 1);
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingWizard$lambda$33$lambda$32(List list, Function0 function0, MutableIntState mutableIntState) {
        if (OnboardingWizard$lambda$1(mutableIntState) >= CollectionsKt.getLastIndex(list)) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
