package com.example.rungps.sleep;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.example.rungps.sleep.SleepAlarmActivity;
import com.example.rungps.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepAlarmActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "dismissAndFinish", "configureAlarmWindow", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAlarmActivity extends ComponentActivity {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile SleepAlarmActivity instance;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureAlarmWindow();
        instance = this;
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(396762345, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.sleep.SleepAlarmActivity$onCreate$1

            /* compiled from: SleepAlarmActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.example.rungps.sleep.SleepAlarmActivity$onCreate$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ SleepAlarmActivity this$0;

                AnonymousClass1(SleepAlarmActivity sleepAlarmActivity) {
                    this.this$0 = sleepAlarmActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(SleepAlarmActivity sleepAlarmActivity) {
                    sleepAlarmActivity.dismissAndFinish();
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-616019615, i, -1, "com.example.rungps.sleep.SleepAlarmActivity.onCreate.<anonymous>.<anonymous> (SleepAlarmActivity.kt:42)");
                    }
                    composer.startReplaceGroup(-143894529);
                    boolean changed = composer.changed(this.this$0);
                    final SleepAlarmActivity sleepAlarmActivity = this.this$0;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003d: CONSTRUCTOR (r0v3 'rememberedValue' java.lang.Object) = (r3v1 'sleepAlarmActivity' com.example.rungps.sleep.SleepAlarmActivity A[DONT_INLINE]) A[MD:(com.example.rungps.sleep.SleepAlarmActivity):void (m)] (LINE:43) call: com.example.rungps.sleep.SleepAlarmActivity$onCreate$1$1$$ExternalSyntheticLambda0.<init>(com.example.rungps.sleep.SleepAlarmActivity):void type: CONSTRUCTOR in method: com.example.rungps.sleep.SleepAlarmActivity$onCreate$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes3.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.example.rungps.sleep.SleepAlarmActivity$onCreate$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r5 & 3
                            r1 = 2
                            if (r0 != r1) goto L10
                            boolean r0 = r4.getSkipping()
                            if (r0 != 0) goto Lc
                            goto L10
                        Lc:
                            r4.skipToGroupEnd()
                            goto L55
                        L10:
                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r0 == 0) goto L1f
                            r0 = -1
                            java.lang.String r1 = "com.example.rungps.sleep.SleepAlarmActivity.onCreate.<anonymous>.<anonymous> (SleepAlarmActivity.kt:42)"
                            r2 = -616019615(0xffffffffdb484961, float:-5.6375676E16)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r0, r1)
                        L1f:
                            r5 = -143894529(0xfffffffff76c57ff, float:-4.7936204E33)
                            r4.startReplaceGroup(r5)
                            com.example.rungps.sleep.SleepAlarmActivity r5 = r3.this$0
                            boolean r5 = r4.changed(r5)
                            com.example.rungps.sleep.SleepAlarmActivity r3 = r3.this$0
                            java.lang.Object r0 = r4.rememberedValue()
                            if (r5 != 0) goto L3b
                            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r5 = r5.getEmpty()
                            if (r0 != r5) goto L43
                        L3b:
                            com.example.rungps.sleep.SleepAlarmActivity$onCreate$1$1$$ExternalSyntheticLambda0 r0 = new com.example.rungps.sleep.SleepAlarmActivity$onCreate$1$1$$ExternalSyntheticLambda0
                            r0.<init>(r3)
                            r4.updateRememberedValue(r0)
                        L43:
                            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                            r4.endReplaceGroup()
                            r3 = 0
                            com.example.rungps.sleep.SleepAlarmActivityKt.access$SleepAlarmScreen(r0, r4, r3)
                            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r3 == 0) goto L55
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        L55:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.example.rungps.sleep.SleepAlarmActivity$onCreate$1.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    if ((i & 3) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(396762345, i, -1, "com.example.rungps.sleep.SleepAlarmActivity.onCreate.<anonymous> (SleepAlarmActivity.kt:41)");
                        }
                        ThemeKt.ExerciseTrackerTheme(true, false, ComposableLambdaKt.rememberComposableLambda(-616019615, true, new AnonymousClass1(SleepAlarmActivity.this), composer, 54), composer, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), 1, null);
        }

        @Override // android.app.Activity
        protected void onDestroy() {
            if (instance == this) {
                instance = null;
            }
            super.onDestroy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void dismissAndFinish() {
            SleepAlarmDismiss sleepAlarmDismiss = SleepAlarmDismiss.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            sleepAlarmDismiss.dismissAll(applicationContext);
            finish();
        }

        private final void configureAlarmWindow() {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
            getWindow().addFlags(6815873);
            KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KeyguardManager.class);
            if (keyguardManager != null) {
                keyguardManager.requestDismissKeyguard(this, null);
            }
        }

        /* compiled from: SleepAlarmActivity.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/sleep/SleepAlarmActivity$Companion;", "", "<init>", "()V", "instance", "Lcom/example/rungps/sleep/SleepAlarmActivity;", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "launch", "", "closeIfShowing", "isShowing", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Intent intent(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) SleepAlarmActivity.class);
                intent.addFlags(872415232);
                return intent;
            }

            public final void launch(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(intent(context));
            }

            public final void closeIfShowing() {
                SleepAlarmActivity sleepAlarmActivity = SleepAlarmActivity.instance;
                if (sleepAlarmActivity != null) {
                    sleepAlarmActivity.runOnUiThread(new Runnable() { // from class: com.example.rungps.sleep.SleepAlarmActivity$Companion$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SleepAlarmActivity.Companion.closeIfShowing$lambda$1();
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void closeIfShowing$lambda$1() {
                SleepAlarmActivity sleepAlarmActivity = SleepAlarmActivity.instance;
                if (sleepAlarmActivity != null) {
                    sleepAlarmActivity.finish();
                }
                Companion companion = SleepAlarmActivity.INSTANCE;
                SleepAlarmActivity.instance = null;
            }

            public final boolean isShowing() {
                return SleepAlarmActivity.instance != null;
            }
        }
    }
