package com.example.rungps.ui.shell;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.example.rungps.MainActivity;
import com.example.rungps.data.AppPreferences;
import com.example.rungps.sleep.SleepAlarmPreferences;
import com.example.rungps.ui.main.MainActivityTopBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: AppScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$29$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ AppScreenHost $host;
    final /* synthetic */ MainActivity $mainAct;

    AppScreenKt$AppScreen$29$1$1(AppScreenHost appScreenHost, MainActivity mainActivity, Context context) {
        this.$host = appScreenHost;
        this.$mainAct = mainActivity;
        this.$ctx = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2117014615, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous>.<anonymous> (AppScreen.kt:334)");
            }
            String themeMode = this.$host.getThemeMode();
            composer.startReplaceGroup(-408894120);
            boolean changedInstance = composer.changedInstance(this.$host) | composer.changedInstance(this.$mainAct) | composer.changedInstance(this.$ctx);
            final AppScreenHost appScreenHost = this.$host;
            final MainActivity mainActivity = this.$mainAct;
            final Context context = this.$ctx;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$29$1$1.invoke$lambda$1$lambda$0(AppScreenHost.this, mainActivity, context);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            MainActivityTopBarKt.MainActivityTopBar(themeMode, (Function0) rememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r0.equals(com.example.rungps.sleep.SleepAlarmPreferences.SOUND_SYSTEM) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit invoke$lambda$1$lambda$0(AppScreenHost appScreenHost, MainActivity mainActivity, Context context) {
        String themeMode = appScreenHost.getThemeMode();
        int hashCode = themeMode.hashCode();
        String str = CervicalMucusRecord.Sensation.LIGHT;
        if (hashCode != -887328209) {
            if (hashCode != 3075958) {
                if (hashCode == 102970646 && themeMode.equals(CervicalMucusRecord.Sensation.LIGHT)) {
                    str = "dark";
                }
                str = SleepAlarmPreferences.SOUND_SYSTEM;
            } else {
                if (themeMode.equals("dark")) {
                    str = "amoled";
                }
                str = SleepAlarmPreferences.SOUND_SYSTEM;
            }
        }
        appScreenHost.setThemeMode(str);
        AppPreferences appPreferences = AppPreferences.INSTANCE;
        if (mainActivity != null) {
            context = mainActivity;
        }
        appPreferences.setThemeModeBlocking(context, appScreenHost.getThemeMode());
        return Unit.INSTANCE;
    }
}
