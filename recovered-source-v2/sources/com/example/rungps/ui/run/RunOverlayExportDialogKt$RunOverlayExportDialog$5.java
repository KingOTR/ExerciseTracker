package com.example.rungps.ui.run;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RunOverlayExportDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RunOverlayExportDialogKt$RunOverlayExportDialog$5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $canAct;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $loadingRun$delegate;
    final /* synthetic */ ManagedActivityResultLauncher<String, Uri> $pickImage;
    final /* synthetic */ MutableState<Uri> $pickedUri$delegate;
    final /* synthetic */ MutableState<Bitmap> $previewBitmap$delegate;
    final /* synthetic */ MutableState<String> $renderError$delegate;
    final /* synthetic */ MutableState<Boolean> $renderingImage$delegate;
    final /* synthetic */ long $runId;
    final /* synthetic */ MutableState<Boolean> $runReady$delegate;
    final /* synthetic */ MutableState<Boolean> $saving$delegate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $stravaUploading$delegate;

    RunOverlayExportDialogKt$RunOverlayExportDialog$5(ManagedActivityResultLauncher<String, Uri> managedActivityResultLauncher, CoroutineScope coroutineScope, Context context, boolean z, long j, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Uri> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5, MutableState<String> mutableState6, MutableState<Bitmap> mutableState7, MutableState<Boolean> mutableState8) {
        this.$pickImage = managedActivityResultLauncher;
        this.$scope = coroutineScope;
        this.$ctx = context;
        this.$canAct = z;
        this.$runId = j;
        this.$runReady$delegate = mutableState;
        this.$loadingRun$delegate = mutableState2;
        this.$pickedUri$delegate = mutableState3;
        this.$renderingImage$delegate = mutableState4;
        this.$saving$delegate = mutableState5;
        this.$renderError$delegate = mutableState6;
        this.$previewBitmap$delegate = mutableState7;
        this.$stravaUploading$delegate = mutableState8;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x01a8, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x020f, code lost:
    
        if (r0 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0465, code lost:
    
        if (r7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        Object obj;
        boolean RunOverlayExportDialog$lambda$22;
        boolean z;
        boolean RunOverlayExportDialog$lambda$7;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean RunOverlayExportDialog$lambda$13;
        boolean RunOverlayExportDialog$lambda$10;
        String str;
        String RunOverlayExportDialog$lambda$19;
        Bitmap RunOverlayExportDialog$lambda$4;
        int i2;
        Object obj2;
        float f;
        boolean changedInstance;
        final MutableState<Bitmap> mutableState;
        Object obj3;
        boolean changedInstance2;
        Object obj4;
        boolean RunOverlayExportDialog$lambda$102;
        boolean RunOverlayExportDialog$lambda$132;
        boolean RunOverlayExportDialog$lambda$72;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(748012540, i, -1, "com.example.rungps.ui.run.RunOverlayExportDialog.<anonymous> (RunOverlayExportDialog.kt:150)");
            }
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m717heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6303constructorimpl(520), 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
            final ManagedActivityResultLauncher<String, Uri> managedActivityResultLauncher = this.$pickImage;
            final CoroutineScope coroutineScope = this.$scope;
            final Context context = this.$ctx;
            boolean z2 = this.$canAct;
            final long j = this.$runId;
            MutableState<Boolean> mutableState2 = this.$runReady$delegate;
            MutableState<Boolean> mutableState3 = this.$loadingRun$delegate;
            final MutableState<Uri> mutableState4 = this.$pickedUri$delegate;
            MutableState<Boolean> mutableState5 = this.$renderingImage$delegate;
            final MutableState<Boolean> mutableState6 = this.$saving$delegate;
            MutableState<String> mutableState7 = this.$renderError$delegate;
            MutableState<Bitmap> mutableState8 = this.$previewBitmap$delegate;
            final MutableState<Boolean> mutableState9 = this.$stravaUploading$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2376Text4IGK_g("Choose a photo (read-only — your original is never changed). Route and stats are drawn on a new full-resolution image; save/share as lossless PNG.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
            composer.startReplaceGroup(300229405);
            boolean changedInstance3 = composer.changedInstance(managedActivityResultLauncher);
            Object rememberedValue = composer.rememberedValue();
            if (!changedInstance3) {
                obj = rememberedValue;
            }
            Object obj5 = new Function0() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$9$lambda$1$lambda$0;
                    invoke$lambda$9$lambda$1$lambda$0 = RunOverlayExportDialogKt$RunOverlayExportDialog$5.invoke$lambda$9$lambda$1$lambda$0(ManagedActivityResultLauncher.this);
                    return invoke$lambda$9$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(obj5);
            obj = obj5;
            Function0 function0 = (Function0) obj;
            composer.endReplaceGroup();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            RunOverlayExportDialog$lambda$22 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$22(mutableState2);
            if (RunOverlayExportDialog$lambda$22) {
                RunOverlayExportDialog$lambda$72 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$7(mutableState3);
                if (!RunOverlayExportDialog$lambda$72) {
                    z = true;
                    ButtonKt.OutlinedButton(function0, fillMaxWidth$default, z, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1964164332, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$5$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope OutlinedButton, Composer composer2, int i3) {
                            Uri RunOverlayExportDialog$lambda$1;
                            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                            if ((i3 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1964164332, i3, -1, "com.example.rungps.ui.run.RunOverlayExportDialog.<anonymous>.<anonymous>.<anonymous> (RunOverlayExportDialog.kt:168)");
                            }
                            RunOverlayExportDialog$lambda$1 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$1(mutableState4);
                            TextKt.m2376Text4IGK_g(RunOverlayExportDialog$lambda$1 == null ? "Choose image" : "Change image", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 805306416, 504);
                    composer.startReplaceGroup(300239100);
                    RunOverlayExportDialog$lambda$7 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$7(mutableState3);
                    if (!RunOverlayExportDialog$lambda$7) {
                        RunOverlayExportDialog$lambda$102 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$10(mutableState5);
                        if (!RunOverlayExportDialog$lambda$102) {
                            RunOverlayExportDialog$lambda$132 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$13(mutableState6);
                        }
                    }
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer, 6);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (!composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    m3336constructorimpl = Updater.m3336constructorimpl(composer);
                    Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    }
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ProgressIndicatorKt.m2050CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer, 0, 31);
                    RunOverlayExportDialog$lambda$13 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$13(mutableState6);
                    if (RunOverlayExportDialog$lambda$13) {
                        RunOverlayExportDialog$lambda$10 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$10(mutableState5);
                        str = RunOverlayExportDialog$lambda$10 ? "  Building preview…" : "  Loading run…";
                    } else {
                        str = "  Saving to Photos…";
                    }
                    TextKt.m2376Text4IGK_g(str, rowScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65532);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceGroup();
                    RunOverlayExportDialog$lambda$19 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$19(mutableState7);
                    composer.startReplaceGroup(300261967);
                    if (RunOverlayExportDialog$lambda$19 != null) {
                        TextKt.m2376Text4IGK_g(RunOverlayExportDialog$lambda$19, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                        Unit unit = Unit.INSTANCE;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer.endReplaceGroup();
                    RunOverlayExportDialog$lambda$4 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$4(mutableState8);
                    composer.startReplaceGroup(300267864);
                    if (RunOverlayExportDialog$lambda$4 != null) {
                        i2 = 1;
                        obj2 = null;
                        f = 0.0f;
                    } else {
                        i2 = 1;
                        obj2 = null;
                        f = 0.0f;
                        ImageKt.m295Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(RunOverlayExportDialog$lambda$4), "Run overlay preview", SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, ContentScale.INSTANCE.getFit(), 0.0f, null, FilterQuality.INSTANCE.m3942getHighfv9h1I(), composer, 25008, 104);
                        Unit unit3 = Unit.INSTANCE;
                        Unit unit4 = Unit.INSTANCE;
                    }
                    composer.endReplaceGroup();
                    Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i2, obj2);
                    composer.startReplaceGroup(300282832);
                    changedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(context);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        mutableState = mutableState8;
                        Object obj6 = new Function0() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$5$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$9$lambda$6$lambda$5;
                                invoke$lambda$9$lambda$6$lambda$5 = RunOverlayExportDialogKt$RunOverlayExportDialog$5.invoke$lambda$9$lambda$6$lambda$5(CoroutineScope.this, mutableState, context, mutableState6);
                                return invoke$lambda$9$lambda$6$lambda$5;
                            }
                        };
                        composer.updateRememberedValue(obj6);
                        obj3 = obj6;
                    } else {
                        mutableState = mutableState8;
                        obj3 = rememberedValue2;
                    }
                    composer.endReplaceGroup();
                    final MutableState<Bitmap> mutableState10 = mutableState;
                    boolean z3 = i2;
                    ButtonKt.OutlinedButton((Function0) obj3, fillMaxWidth$default3, z2, null, null, null, null, null, null, ComposableSingletons$RunOverlayExportDialogKt.INSTANCE.m7414getLambda4$app_sideload(), composer, 805306416, 504);
                    Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, z3 ? 1 : 0, obj2);
                    composer.startReplaceGroup(300291950);
                    changedInstance2 = composer.changedInstance(coroutineScope) | composer.changedInstance(context) | composer.changed(j);
                    Object rememberedValue3 = composer.rememberedValue();
                    if (!changedInstance2) {
                        obj4 = rememberedValue3;
                    }
                    Object obj7 = new Function0() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$5$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$9$lambda$8$lambda$7;
                            invoke$lambda$9$lambda$8$lambda$7 = RunOverlayExportDialogKt$RunOverlayExportDialog$5.invoke$lambda$9$lambda$8$lambda$7(CoroutineScope.this, mutableState10, context, mutableState9, j);
                            return invoke$lambda$9$lambda$8$lambda$7;
                        }
                    };
                    composer.updateRememberedValue(obj7);
                    obj4 = obj7;
                    composer.endReplaceGroup();
                    ButtonKt.OutlinedButton((Function0) obj4, fillMaxWidth$default4, z2, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(283181852, z3, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$5$1$8
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                            invoke(rowScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope OutlinedButton, Composer composer2, int i3) {
                            boolean RunOverlayExportDialog$lambda$16;
                            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                            if ((i3 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(283181852, i3, -1, "com.example.rungps.ui.run.RunOverlayExportDialog.<anonymous>.<anonymous>.<anonymous> (RunOverlayExportDialog.kt:225)");
                            }
                            RunOverlayExportDialog$lambda$16 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$16(mutableState9);
                            TextKt.m2376Text4IGK_g(RunOverlayExportDialog$lambda$16 ? "Uploading to Strava…" : "Post overlay to Strava", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 805306416, 504);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
            }
            z = false;
            ButtonKt.OutlinedButton(function0, fillMaxWidth$default, z, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1964164332, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$5$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope OutlinedButton, Composer composer2, int i3) {
                    Uri RunOverlayExportDialog$lambda$1;
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1964164332, i3, -1, "com.example.rungps.ui.run.RunOverlayExportDialog.<anonymous>.<anonymous>.<anonymous> (RunOverlayExportDialog.kt:168)");
                    }
                    RunOverlayExportDialog$lambda$1 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$1(mutableState4);
                    TextKt.m2376Text4IGK_g(RunOverlayExportDialog$lambda$1 == null ? "Choose image" : "Change image", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 805306416, 504);
            composer.startReplaceGroup(300239100);
            RunOverlayExportDialog$lambda$7 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$7(mutableState3);
            if (!RunOverlayExportDialog$lambda$7) {
            }
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
            }
            composer.startReusableNode();
            if (!composer.getInserting()) {
            }
            m3336constructorimpl = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl.getInserting()) {
            }
            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ProgressIndicatorKt.m2050CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer, 0, 31);
            RunOverlayExportDialog$lambda$13 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$13(mutableState6);
            if (RunOverlayExportDialog$lambda$13) {
            }
            TextKt.m2376Text4IGK_g(str, rowScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
            RunOverlayExportDialog$lambda$19 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$19(mutableState7);
            composer.startReplaceGroup(300261967);
            if (RunOverlayExportDialog$lambda$19 != null) {
            }
            composer.endReplaceGroup();
            RunOverlayExportDialog$lambda$4 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$4(mutableState8);
            composer.startReplaceGroup(300267864);
            if (RunOverlayExportDialog$lambda$4 != null) {
            }
            composer.endReplaceGroup();
            Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i2, obj2);
            composer.startReplaceGroup(300282832);
            changedInstance = composer.changedInstance(coroutineScope) | composer.changedInstance(context);
            Object rememberedValue22 = composer.rememberedValue();
            if (changedInstance) {
            }
            mutableState = mutableState8;
            Object obj62 = new Function0() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$5$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$9$lambda$6$lambda$5;
                    invoke$lambda$9$lambda$6$lambda$5 = RunOverlayExportDialogKt$RunOverlayExportDialog$5.invoke$lambda$9$lambda$6$lambda$5(CoroutineScope.this, mutableState, context, mutableState6);
                    return invoke$lambda$9$lambda$6$lambda$5;
                }
            };
            composer.updateRememberedValue(obj62);
            obj3 = obj62;
            composer.endReplaceGroup();
            final MutableState mutableState102 = mutableState;
            boolean z32 = i2;
            ButtonKt.OutlinedButton((Function0) obj3, fillMaxWidth$default32, z2, null, null, null, null, null, null, ComposableSingletons$RunOverlayExportDialogKt.INSTANCE.m7414getLambda4$app_sideload(), composer, 805306416, 504);
            Modifier fillMaxWidth$default42 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, z32 ? 1 : 0, obj2);
            composer.startReplaceGroup(300291950);
            changedInstance2 = composer.changedInstance(coroutineScope) | composer.changedInstance(context) | composer.changed(j);
            Object rememberedValue32 = composer.rememberedValue();
            if (!changedInstance2) {
            }
            Object obj72 = new Function0() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$5$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$9$lambda$8$lambda$7;
                    invoke$lambda$9$lambda$8$lambda$7 = RunOverlayExportDialogKt$RunOverlayExportDialog$5.invoke$lambda$9$lambda$8$lambda$7(CoroutineScope.this, mutableState102, context, mutableState9, j);
                    return invoke$lambda$9$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(obj72);
            obj4 = obj72;
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) obj4, fillMaxWidth$default42, z2, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(283181852, z32, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$5$1$8
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope OutlinedButton, Composer composer2, int i3) {
                    boolean RunOverlayExportDialog$lambda$16;
                    Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(283181852, i3, -1, "com.example.rungps.ui.run.RunOverlayExportDialog.<anonymous>.<anonymous>.<anonymous> (RunOverlayExportDialog.kt:225)");
                    }
                    RunOverlayExportDialog$lambda$16 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$16(mutableState9);
                    TextKt.m2376Text4IGK_g(RunOverlayExportDialog$lambda$16 ? "Uploading to Strava…" : "Post overlay to Strava", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 805306416, 504);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$1$lambda$0(ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$6$lambda$5(CoroutineScope coroutineScope, MutableState mutableState, Context context, MutableState mutableState2) {
        RunOverlayExportDialogKt.RunOverlayExportDialog$saveToPhotos(coroutineScope, mutableState, context, mutableState2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7(CoroutineScope coroutineScope, MutableState mutableState, Context context, MutableState mutableState2, long j) {
        Bitmap RunOverlayExportDialog$lambda$4;
        RunOverlayExportDialog$lambda$4 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$4(mutableState);
        if (RunOverlayExportDialog$lambda$4 == null) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RunOverlayExportDialogKt$RunOverlayExportDialog$5$1$7$1$1(context, mutableState2, RunOverlayExportDialog$lambda$4, j, null), 3, null);
        return Unit.INSTANCE;
    }
}
