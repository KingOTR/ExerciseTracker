package com.example.rungps;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.example.rungps.CrashLog;
import com.example.rungps.MainActivity$onCreate$9;
import com.example.rungps.ui.shell.AppScreenKt;
import com.example.rungps.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MainActivity.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MainActivity$onCreate$9 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MainActivity this$0;

    MainActivity$onCreate$9(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        if (r2.equals("dark") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r2.equals("amoled") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        boolean z;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1212548178, i, -1, "com.example.rungps.MainActivity.onCreate.<anonymous> (MainActivity.kt:703)");
            }
            boolean isSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(composer, 0);
            String themeMode = this.this$0.getThemeMode();
            int hashCode = themeMode.hashCode();
            if (hashCode != -1413862040) {
                if (hashCode != 3075958) {
                    if (hashCode == 102970646 && themeMode.equals(CervicalMucusRecord.Sensation.LIGHT)) {
                        z = false;
                    }
                }
                z = isSystemInDarkTheme;
            }
            composer.startReplaceGroup(-1679582561);
            MainActivity mainActivity = this.this$0;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CrashLog.INSTANCE.read(mainActivity), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            composer.endReplaceGroup();
            boolean areEqual = Intrinsics.areEqual(this.this$0.getThemeMode(), "amoled");
            final MainActivity mainActivity2 = this.this$0;
            ThemeKt.ExerciseTrackerTheme(z, areEqual, ComposableLambdaKt.rememberComposableLambda(-1035149622, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.MainActivity$onCreate$9.1

                /* compiled from: MainActivity.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: com.example.rungps.MainActivity$onCreate$9$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00641 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ MutableState<CrashLog.CrashEntry> $crashDialog$delegate;
                    final /* synthetic */ MainActivity this$0;

                    C00641(MainActivity mainActivity, MutableState<CrashLog.CrashEntry> mutableState) {
                        this.this$0 = mainActivity;
                        this.$crashDialog$delegate = mutableState;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        boolean started;
                        if ((i & 3) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(160113637, i, -1, "com.example.rungps.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:712)");
                            }
                            if (MainActivity$onCreate$9.invoke$lambda$1(this.$crashDialog$delegate) != null) {
                                composer.startReplaceGroup(778386924);
                                final CrashLog.CrashEntry invoke$lambda$1 = MainActivity$onCreate$9.invoke$lambda$1(this.$crashDialog$delegate);
                                Intrinsics.checkNotNull(invoke$lambda$1);
                                composer.startReplaceGroup(-1637455786);
                                final MutableState<CrashLog.CrashEntry> mutableState = this.$crashDialog$delegate;
                                Object rememberedValue = composer.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: com.example.rungps.MainActivity$onCreate$9$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit invoke$lambda$1$lambda$0;
                                            invoke$lambda$1$lambda$0 = MainActivity$onCreate$9.AnonymousClass1.C00641.invoke$lambda$1$lambda$0(MutableState.this);
                                            return invoke$lambda$1$lambda$0;
                                        }
                                    };
                                    composer.updateRememberedValue(rememberedValue);
                                }
                                composer.endReplaceGroup();
                                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(1330533298, true, new AnonymousClass2(this.this$0, invoke$lambda$1), composer, 54), null, ComposableLambdaKt.rememberComposableLambda(1155410996, true, new AnonymousClass3(this.this$0, this.$crashDialog$delegate), composer, 54), null, ComposableSingletons$MainActivityKt.INSTANCE.m6772getLambda3$app_sideload(), ComposableLambdaKt.rememberComposableLambda(-1254756105, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.MainActivity.onCreate.9.1.1.4
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i2) {
                                        if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1254756105, i2, -1, "com.example.rungps.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:718)");
                                            }
                                            TextKt.m2376Text4IGK_g(StringsKt.trim((CharSequence) CrashLog.CrashEntry.this.getStacktrace()).toString(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65534);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, composer, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer, 1772598, 0, 16276);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(779779785);
                                MainActivity mainActivity = this.this$0;
                                MainActivity mainActivity2 = mainActivity;
                                started = mainActivity.getStarted();
                                composer.startReplaceGroup(-1637407655);
                                boolean changedInstance = composer.changedInstance(this.this$0);
                                final MainActivity mainActivity3 = this.this$0;
                                Object rememberedValue2 = composer.rememberedValue();
                                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new Function0() { // from class: com.example.rungps.MainActivity$onCreate$9$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit invoke$lambda$3$lambda$2;
                                            invoke$lambda$3$lambda$2 = MainActivity$onCreate$9.AnonymousClass1.C00641.invoke$lambda$3$lambda$2(MainActivity.this);
                                            return invoke$lambda$3$lambda$2;
                                        }
                                    };
                                    composer.updateRememberedValue(rememberedValue2);
                                }
                                Function0 function0 = (Function0) rememberedValue2;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1637405614);
                                boolean changedInstance2 = composer.changedInstance(this.this$0);
                                final MainActivity mainActivity4 = this.this$0;
                                Object rememberedValue3 = composer.rememberedValue();
                                if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new Function0() { // from class: com.example.rungps.MainActivity$onCreate$9$1$1$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit invoke$lambda$5$lambda$4;
                                            invoke$lambda$5$lambda$4 = MainActivity$onCreate$9.AnonymousClass1.C00641.invoke$lambda$5$lambda$4(MainActivity.this);
                                            return invoke$lambda$5$lambda$4;
                                        }
                                    };
                                    composer.updateRememberedValue(rememberedValue3);
                                }
                                Function0 function02 = (Function0) rememberedValue3;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1637403710);
                                boolean changedInstance3 = composer.changedInstance(this.this$0);
                                final MainActivity mainActivity5 = this.this$0;
                                Object rememberedValue4 = composer.rememberedValue();
                                if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function1() { // from class: com.example.rungps.MainActivity$onCreate$9$1$1$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit invoke$lambda$7$lambda$6;
                                            invoke$lambda$7$lambda$6 = MainActivity$onCreate$9.AnonymousClass1.C00641.invoke$lambda$7$lambda$6(MainActivity.this, ((Long) obj).longValue());
                                            return invoke$lambda$7$lambda$6;
                                        }
                                    };
                                    composer.updateRememberedValue(rememberedValue4);
                                }
                                composer.endReplaceGroup();
                                AppScreenKt.AppScreen(mainActivity2, started, function0, function02, (Function1) rememberedValue4, composer, 0);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
                        MainActivity$onCreate$9.invoke$lambda$2(mutableState, null);
                        return Unit.INSTANCE;
                    }

                    /* compiled from: MainActivity.kt */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: com.example.rungps.MainActivity$onCreate$9$1$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ CrashLog.CrashEntry $crash;
                        final /* synthetic */ MainActivity this$0;

                        AnonymousClass2(MainActivity mainActivity, CrashLog.CrashEntry crashEntry) {
                            this.this$0 = mainActivity;
                            this.$crash = crashEntry;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1330533298, i, -1, "com.example.rungps.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:724)");
                            }
                            composer.startReplaceGroup(1879795387);
                            boolean changedInstance = composer.changedInstance(this.this$0) | composer.changed(this.$crash);
                            final MainActivity mainActivity = this.this$0;
                            final CrashLog.CrashEntry crashEntry = this.$crash;
                            Object rememberedValue = composer.rememberedValue();
                            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: com.example.rungps.MainActivity$onCreate$9$1$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit invoke$lambda$1$lambda$0;
                                        invoke$lambda$1$lambda$0 = MainActivity$onCreate$9.AnonymousClass1.C00641.AnonymousClass2.invoke$lambda$1$lambda$0(MainActivity.this, crashEntry);
                                        return invoke$lambda$1$lambda$0;
                                    }
                                };
                                composer.updateRememberedValue(rememberedValue);
                            }
                            composer.endReplaceGroup();
                            ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$MainActivityKt.INSTANCE.m6770getLambda1$app_sideload(), composer, 805306368, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(MainActivity mainActivity, CrashLog.CrashEntry crashEntry) {
                            Object systemService = mainActivity.getSystemService("clipboard");
                            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Crash stacktrace", crashEntry.getStacktrace()));
                            Toast.makeText(mainActivity, "Copied crash details", 0).show();
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: MainActivity.kt */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: com.example.rungps.MainActivity$onCreate$9$1$1$3, reason: invalid class name */
                    static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ MutableState<CrashLog.CrashEntry> $crashDialog$delegate;
                        final /* synthetic */ MainActivity this$0;

                        AnonymousClass3(MainActivity mainActivity, MutableState<CrashLog.CrashEntry> mutableState) {
                            this.this$0 = mainActivity;
                            this.$crashDialog$delegate = mutableState;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1155410996, i, -1, "com.example.rungps.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:731)");
                            }
                            composer.startReplaceGroup(1879813215);
                            boolean changedInstance = composer.changedInstance(this.this$0);
                            final MainActivity mainActivity = this.this$0;
                            final MutableState<CrashLog.CrashEntry> mutableState = this.$crashDialog$delegate;
                            Object rememberedValue = composer.rememberedValue();
                            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: com.example.rungps.MainActivity$onCreate$9$1$1$3$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit invoke$lambda$1$lambda$0;
                                        invoke$lambda$1$lambda$0 = MainActivity$onCreate$9.AnonymousClass1.C00641.AnonymousClass3.invoke$lambda$1$lambda$0(MainActivity.this, mutableState);
                                        return invoke$lambda$1$lambda$0;
                                    }
                                };
                                composer.updateRememberedValue(rememberedValue);
                            }
                            composer.endReplaceGroup();
                            ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$MainActivityKt.INSTANCE.m6771getLambda2$app_sideload(), composer, 805306368, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(MainActivity mainActivity, MutableState mutableState) {
                            CrashLog.INSTANCE.clear(mainActivity);
                            MainActivity$onCreate$9.invoke$lambda$2(mutableState, null);
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(MainActivity mainActivity) {
                        mainActivity.ensurePermsAndStart();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(MainActivity mainActivity) {
                        mainActivity.stopTracking();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(MainActivity mainActivity, long j) {
                        MainActivityExportsKt.exportAndShare(mainActivity, j);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1035149622, i2, -1, "com.example.rungps.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:711)");
                        }
                        SurfaceKt.m2226SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(160113637, true, new C00641(MainActivity.this, mutableState), composer2, 54), composer2, 12582918, 122);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composer, 54), composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrashLog.CrashEntry invoke$lambda$1(MutableState<CrashLog.CrashEntry> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(MutableState<CrashLog.CrashEntry> mutableState, CrashLog.CrashEntry crashEntry) {
        mutableState.setValue(crashEntry);
    }
}
