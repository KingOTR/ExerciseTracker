package com.example.rungps.ui.sync;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.example.rungps.data.Repository;
import com.example.rungps.sync.CloudSyncManager;
import com.example.rungps.sync.CloudSyncResult;
import com.example.rungps.sync.GymSyncQueue;
import com.example.rungps.ui.components.AppSnackbarKt;
import com.example.rungps.ui.components.AppSnackbarMessages;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CloudAccountPanel.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0002\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0002\u0010\u000e\u001aE\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0002\u0010\u0017\u001a}\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0003¢\u0006\u0002\u0010!\u001a(\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)H\u0002¨\u0006*²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002"}, d2 = {"CloudAccountPanel", "", "modifier", "Landroidx/compose/ui/Modifier;", "showPullFromCloud", "", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "SignedInLine", "user", "Lcom/google/firebase/auth/FirebaseUser;", "(Lcom/google/firebase/auth/FirebaseUser;Landroidx/compose/runtime/Composer;I)V", "LastSyncLine", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/google/firebase/auth/FirebaseUser;Landroidx/compose/runtime/Composer;I)V", "PendingUploadLine", "CredentialFields", "cloudEmail", "", "cloudPassword", "onEmailChange", "Lkotlin/Function1;", "onPasswordChange", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AuthActions", "firebaseUser", "cloudSyncing", "onPasswordCleared", "Lkotlin/Function0;", "onSignIn", "onCreateAccount", "onSyncNow", "onPullFromCloud", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/auth/FirebaseUser;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "toastSyncResult", "scope", "Lkotlinx/coroutines/CoroutineScope;", "snackbar", "Landroidx/compose/material3/SnackbarHostState;", "prefix", "r", "Lcom/example/rungps/sync/CloudSyncResult;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudAccountPanelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthActions$lambda$52(String str, String str2, FirebaseUser firebaseUser, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, Composer composer, int i2) {
        AuthActions(str, str2, firebaseUser, z, z2, function0, function02, function03, function04, function05, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloudAccountPanel$lambda$34(Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        CloudAccountPanel(modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CredentialFields$lambda$48(String str, String str2, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        CredentialFields(str, str2, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LastSyncLine$lambda$36(Context context, FirebaseUser firebaseUser, int i, Composer composer, int i2) {
        LastSyncLine(context, firebaseUser, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LastSyncLine$lambda$37(Context context, FirebaseUser firebaseUser, int i, Composer composer, int i2) {
        LastSyncLine(context, firebaseUser, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LastSyncLine$lambda$39(Context context, FirebaseUser firebaseUser, int i, Composer composer, int i2) {
        LastSyncLine(context, firebaseUser, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingUploadLine$lambda$40(Context context, FirebaseUser firebaseUser, int i, Composer composer, int i2) {
        PendingUploadLine(context, firebaseUser, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingUploadLine$lambda$41(Context context, FirebaseUser firebaseUser, int i, Composer composer, int i2) {
        PendingUploadLine(context, firebaseUser, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingUploadLine$lambda$42(Context context, FirebaseUser firebaseUser, int i, Composer composer, int i2) {
        PendingUploadLine(context, firebaseUser, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignedInLine$lambda$35(FirebaseUser firebaseUser, int i, Composer composer, int i2) {
        SignedInLine(firebaseUser, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CloudAccountPanel(Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final boolean z2;
        int i4;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        Object rememberedValue5;
        Object rememberedValue6;
        Object rememberedValue7;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean changed;
        Object rememberedValue8;
        boolean changed2;
        Object rememberedValue9;
        boolean changed3;
        Object rememberedValue10;
        boolean changedInstance;
        Object rememberedValue11;
        boolean changedInstance2;
        Object rememberedValue12;
        boolean changedInstance3;
        Object rememberedValue13;
        boolean changedInstance4;
        Object rememberedValue14;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1426140260);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            i4 = i3;
            if ((i4 & 19) == 18 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z3 = i6 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1426140260, i4, -1, "com.example.rungps.ui.sync.CloudAccountPanel (CloudAccountPanel.kt:44)");
                }
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Context context = (Context) consume;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                    startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<SnackbarHostState> localAppSnackbar = AppSnackbarKt.getLocalAppSnackbar();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localAppSnackbar);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final SnackbarHostState snackbarHostState = (SnackbarHostState) consume2;
                startRestartGroup.startReplaceGroup(1451382101);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = Repository.INSTANCE.get(context);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final Repository repository = (Repository) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                Object[] objArr = new Object[0];
                startRestartGroup.startReplaceGroup(1451384395);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState CloudAccountPanel$lambda$2$lambda$1;
                            CloudAccountPanel$lambda$2$lambda$1 = CloudAccountPanelKt.CloudAccountPanel$lambda$2$lambda$1();
                            return CloudAccountPanel$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 3072, 6);
                Object[] objArr2 = new Object[0];
                startRestartGroup.startReplaceGroup(1451386475);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState CloudAccountPanel$lambda$6$lambda$5;
                            CloudAccountPanel$lambda$6$lambda$5 = CloudAccountPanelKt.CloudAccountPanel$lambda$6$lambda$5();
                            return CloudAccountPanel$lambda$6$lambda$5;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState2 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(1451387991);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                final MutableState mutableState3 = (MutableState) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1451389912);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(FirebaseAuth.getInstance().getCurrentUser(), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                final MutableState mutableState4 = (MutableState) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(1451393135);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function1() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DisposableEffectResult CloudAccountPanel$lambda$18$lambda$17;
                            CloudAccountPanel$lambda$18$lambda$17 = CloudAccountPanelKt.CloudAccountPanel$lambda$18$lambda$17(MutableState.this, (DisposableEffectScope) obj);
                            return CloudAccountPanel$lambda$18$lambda$17;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, startRestartGroup, 54);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor);
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifier4 = modifier3;
                TextKt.m2376Text4IGK_g("Sign in to back up gym sessions, runs, and profile to the cloud. Same email as the web portal.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 6, 0, 65530);
                startRestartGroup = startRestartGroup;
                SignedInLine(CloudAccountPanel$lambda$13(mutableState4), startRestartGroup, 0);
                LastSyncLine(context, CloudAccountPanel$lambda$13(mutableState4), startRestartGroup, 0);
                PendingUploadLine(context, CloudAccountPanel$lambda$13(mutableState4), startRestartGroup, 0);
                String CloudAccountPanel$lambda$3 = CloudAccountPanel$lambda$3(mutableState);
                String CloudAccountPanel$lambda$7 = CloudAccountPanel$lambda$7(mutableState2);
                startRestartGroup.startReplaceGroup(-1835632153);
                changed = startRestartGroup.changed(mutableState);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function1() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit CloudAccountPanel$lambda$33$lambda$20$lambda$19;
                            CloudAccountPanel$lambda$33$lambda$20$lambda$19 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$20$lambda$19(MutableState.this, (String) obj);
                            return CloudAccountPanel$lambda$33$lambda$20$lambda$19;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                Function1 function1 = (Function1) rememberedValue8;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1835630870);
                changed2 = startRestartGroup.changed(mutableState2);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new Function1() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit CloudAccountPanel$lambda$33$lambda$22$lambda$21;
                            CloudAccountPanel$lambda$33$lambda$22$lambda$21 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$22$lambda$21(MutableState.this, (String) obj);
                            return CloudAccountPanel$lambda$33$lambda$22$lambda$21;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                startRestartGroup.endReplaceGroup();
                CredentialFields(CloudAccountPanel$lambda$3, CloudAccountPanel$lambda$7, function1, (Function1) rememberedValue9, startRestartGroup, 0);
                String CloudAccountPanel$lambda$32 = CloudAccountPanel$lambda$3(mutableState);
                String CloudAccountPanel$lambda$72 = CloudAccountPanel$lambda$7(mutableState2);
                FirebaseUser CloudAccountPanel$lambda$13 = CloudAccountPanel$lambda$13(mutableState4);
                boolean CloudAccountPanel$lambda$10 = CloudAccountPanel$lambda$10(mutableState3);
                startRestartGroup.startReplaceGroup(-1835621590);
                changed3 = startRestartGroup.changed(mutableState2);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CloudAccountPanel$lambda$33$lambda$24$lambda$23;
                            CloudAccountPanel$lambda$33$lambda$24$lambda$23 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$24$lambda$23(MutableState.this);
                            return CloudAccountPanel$lambda$33$lambda$24$lambda$23;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                Function0 function0 = (Function0) rememberedValue10;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1835619367);
                changedInstance = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2) | startRestartGroup.changedInstance(repository) | startRestartGroup.changed(snackbarHostState);
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CloudAccountPanel$lambda$33$lambda$26$lambda$25;
                            CloudAccountPanel$lambda$33$lambda$26$lambda$25 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$26$lambda$25(CoroutineScope.this, repository, mutableState, mutableState2, snackbarHostState);
                            return CloudAccountPanel$lambda$33$lambda$26$lambda$25;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                Function0 function02 = (Function0) rememberedValue11;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1835594614);
                changedInstance2 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableState2) | startRestartGroup.changedInstance(repository) | startRestartGroup.changed(snackbarHostState);
                rememberedValue12 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CloudAccountPanel$lambda$33$lambda$28$lambda$27;
                            CloudAccountPanel$lambda$33$lambda$28$lambda$27 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$28$lambda$27(CoroutineScope.this, repository, mutableState, mutableState2, snackbarHostState);
                            return CloudAccountPanel$lambda$33$lambda$28$lambda$27;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                Function0 function03 = (Function0) rememberedValue12;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1835569582);
                changedInstance3 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(repository) | startRestartGroup.changed(snackbarHostState);
                rememberedValue13 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue13 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CloudAccountPanel$lambda$33$lambda$30$lambda$29;
                            CloudAccountPanel$lambda$33$lambda$30$lambda$29 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$30$lambda$29(CoroutineScope.this, mutableState3, repository, snackbarHostState);
                            return CloudAccountPanel$lambda$33$lambda$30$lambda$29;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue13);
                }
                Function0 function04 = (Function0) rememberedValue13;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1835545477);
                changedInstance4 = startRestartGroup.changedInstance(coroutineScope) | startRestartGroup.changedInstance(repository) | startRestartGroup.changed(snackbarHostState);
                rememberedValue14 = startRestartGroup.rememberedValue();
                if (!changedInstance4 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue14 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CloudAccountPanel$lambda$33$lambda$32$lambda$31;
                            CloudAccountPanel$lambda$33$lambda$32$lambda$31 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$32$lambda$31(CoroutineScope.this, repository, snackbarHostState);
                            return CloudAccountPanel$lambda$33$lambda$32$lambda$31;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                }
                startRestartGroup.endReplaceGroup();
                AuthActions(CloudAccountPanel$lambda$32, CloudAccountPanel$lambda$72, CloudAccountPanel$lambda$13, CloudAccountPanel$lambda$10, z3, function0, function02, function03, function04, (Function0) rememberedValue14, startRestartGroup, (i4 << 9) & 57344);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CloudAccountPanel$lambda$34;
                        CloudAccountPanel$lambda$34 = CloudAccountPanelKt.CloudAccountPanel$lambda$34(Modifier.this, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CloudAccountPanel$lambda$34;
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        i4 = i3;
        if ((i4 & 19) == 18) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2 = (Context) consume3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<SnackbarHostState> localAppSnackbar2 = AppSnackbarKt.getLocalAppSnackbar();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localAppSnackbar2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final SnackbarHostState snackbarHostState2 = (SnackbarHostState) consume22;
        startRestartGroup.startReplaceGroup(1451382101);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final Repository repository2 = (Repository) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        Object[] objArr3 = new Object[0];
        startRestartGroup.startReplaceGroup(1451384395);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState5 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 3072, 6);
        Object[] objArr22 = new Object[0];
        startRestartGroup.startReplaceGroup(1451386475);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState22 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) rememberedValue4, startRestartGroup, 3072, 6);
        startRestartGroup.startReplaceGroup(1451387991);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState32 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1451389912);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState42 = (MutableState) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        Unit unit2 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(1451393135);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, startRestartGroup, 54);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Modifier modifier42 = modifier3;
        TextKt.m2376Text4IGK_g("Sign in to back up gym sessions, runs, and profile to the cloud. Same email as the web portal.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 6, 0, 65530);
        startRestartGroup = startRestartGroup;
        SignedInLine(CloudAccountPanel$lambda$13(mutableState42), startRestartGroup, 0);
        LastSyncLine(context2, CloudAccountPanel$lambda$13(mutableState42), startRestartGroup, 0);
        PendingUploadLine(context2, CloudAccountPanel$lambda$13(mutableState42), startRestartGroup, 0);
        String CloudAccountPanel$lambda$33 = CloudAccountPanel$lambda$3(mutableState5);
        String CloudAccountPanel$lambda$73 = CloudAccountPanel$lambda$7(mutableState22);
        startRestartGroup.startReplaceGroup(-1835632153);
        changed = startRestartGroup.changed(mutableState5);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue8 = new Function1() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit CloudAccountPanel$lambda$33$lambda$20$lambda$19;
                CloudAccountPanel$lambda$33$lambda$20$lambda$19 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$20$lambda$19(MutableState.this, (String) obj);
                return CloudAccountPanel$lambda$33$lambda$20$lambda$19;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue8);
        Function1 function12 = (Function1) rememberedValue8;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1835630870);
        changed2 = startRestartGroup.changed(mutableState22);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue9 = new Function1() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit CloudAccountPanel$lambda$33$lambda$22$lambda$21;
                CloudAccountPanel$lambda$33$lambda$22$lambda$21 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$22$lambda$21(MutableState.this, (String) obj);
                return CloudAccountPanel$lambda$33$lambda$22$lambda$21;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue9);
        startRestartGroup.endReplaceGroup();
        CredentialFields(CloudAccountPanel$lambda$33, CloudAccountPanel$lambda$73, function12, (Function1) rememberedValue9, startRestartGroup, 0);
        String CloudAccountPanel$lambda$322 = CloudAccountPanel$lambda$3(mutableState5);
        String CloudAccountPanel$lambda$722 = CloudAccountPanel$lambda$7(mutableState22);
        FirebaseUser CloudAccountPanel$lambda$132 = CloudAccountPanel$lambda$13(mutableState42);
        boolean CloudAccountPanel$lambda$102 = CloudAccountPanel$lambda$10(mutableState32);
        startRestartGroup.startReplaceGroup(-1835621590);
        changed3 = startRestartGroup.changed(mutableState22);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue10 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit CloudAccountPanel$lambda$33$lambda$24$lambda$23;
                CloudAccountPanel$lambda$33$lambda$24$lambda$23 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$24$lambda$23(MutableState.this);
                return CloudAccountPanel$lambda$33$lambda$24$lambda$23;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue10);
        Function0 function05 = (Function0) rememberedValue10;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1835619367);
        changedInstance = startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changed(mutableState5) | startRestartGroup.changed(mutableState22) | startRestartGroup.changedInstance(repository2) | startRestartGroup.changed(snackbarHostState2);
        rememberedValue11 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue11 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit CloudAccountPanel$lambda$33$lambda$26$lambda$25;
                CloudAccountPanel$lambda$33$lambda$26$lambda$25 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$26$lambda$25(CoroutineScope.this, repository2, mutableState5, mutableState22, snackbarHostState2);
                return CloudAccountPanel$lambda$33$lambda$26$lambda$25;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue11);
        Function0 function022 = (Function0) rememberedValue11;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1835594614);
        changedInstance2 = startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changed(mutableState5) | startRestartGroup.changed(mutableState22) | startRestartGroup.changedInstance(repository2) | startRestartGroup.changed(snackbarHostState2);
        rememberedValue12 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit CloudAccountPanel$lambda$33$lambda$28$lambda$27;
                CloudAccountPanel$lambda$33$lambda$28$lambda$27 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$28$lambda$27(CoroutineScope.this, repository2, mutableState5, mutableState22, snackbarHostState2);
                return CloudAccountPanel$lambda$33$lambda$28$lambda$27;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue12);
        Function0 function032 = (Function0) rememberedValue12;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1835569582);
        changedInstance3 = startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(repository2) | startRestartGroup.changed(snackbarHostState2);
        rememberedValue13 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue13 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit CloudAccountPanel$lambda$33$lambda$30$lambda$29;
                CloudAccountPanel$lambda$33$lambda$30$lambda$29 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$30$lambda$29(CoroutineScope.this, mutableState32, repository2, snackbarHostState2);
                return CloudAccountPanel$lambda$33$lambda$30$lambda$29;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue13);
        Function0 function042 = (Function0) rememberedValue13;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1835545477);
        changedInstance4 = startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(repository2) | startRestartGroup.changed(snackbarHostState2);
        rememberedValue14 = startRestartGroup.rememberedValue();
        if (!changedInstance4) {
        }
        rememberedValue14 = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit CloudAccountPanel$lambda$33$lambda$32$lambda$31;
                CloudAccountPanel$lambda$33$lambda$32$lambda$31 = CloudAccountPanelKt.CloudAccountPanel$lambda$33$lambda$32$lambda$31(CoroutineScope.this, repository2, snackbarHostState2);
                return CloudAccountPanel$lambda$33$lambda$32$lambda$31;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue14);
        startRestartGroup.endReplaceGroup();
        AuthActions(CloudAccountPanel$lambda$322, CloudAccountPanel$lambda$722, CloudAccountPanel$lambda$132, CloudAccountPanel$lambda$102, z3, function05, function022, function032, function042, (Function0) rememberedValue14, startRestartGroup, (i4 << 9) & 57344);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        z2 = z3;
        modifier2 = modifier42;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState CloudAccountPanel$lambda$2$lambda$1() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CloudAccountPanel$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState CloudAccountPanel$lambda$6$lambda$5() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CloudAccountPanel$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean CloudAccountPanel$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CloudAccountPanel$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final FirebaseUser CloudAccountPanel$lambda$13(MutableState<FirebaseUser> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult CloudAccountPanel$lambda$18$lambda$17(final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        final FirebaseAuth.AuthStateListener authStateListener = new FirebaseAuth.AuthStateListener() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda15
            @Override // com.google.firebase.auth.FirebaseAuth.AuthStateListener
            public final void onAuthStateChanged(FirebaseAuth firebaseAuth2) {
                CloudAccountPanelKt.CloudAccountPanel$lambda$18$lambda$17$lambda$15(MutableState.this, firebaseAuth2);
            }
        };
        firebaseAuth.addAuthStateListener(authStateListener);
        return new DisposableEffectResult() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$CloudAccountPanel$lambda$18$lambda$17$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                FirebaseAuth.this.removeAuthStateListener(authStateListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CloudAccountPanel$lambda$18$lambda$17$lambda$15(MutableState mutableState, FirebaseAuth a) {
        Intrinsics.checkNotNullParameter(a, "a");
        mutableState.setValue(a.getCurrentUser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloudAccountPanel$lambda$33$lambda$20$lambda$19(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloudAccountPanel$lambda$33$lambda$22$lambda$21(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloudAccountPanel$lambda$33$lambda$24$lambda$23(MutableState mutableState) {
        mutableState.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloudAccountPanel$lambda$33$lambda$26$lambda$25(CoroutineScope coroutineScope, Repository repository, MutableState mutableState, MutableState mutableState2, SnackbarHostState snackbarHostState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new CloudAccountPanelKt$CloudAccountPanel$2$4$1$1(repository, mutableState, mutableState2, coroutineScope, snackbarHostState, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloudAccountPanel$lambda$33$lambda$28$lambda$27(CoroutineScope coroutineScope, Repository repository, MutableState mutableState, MutableState mutableState2, SnackbarHostState snackbarHostState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new CloudAccountPanelKt$CloudAccountPanel$2$5$1$1(repository, mutableState, mutableState2, coroutineScope, snackbarHostState, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloudAccountPanel$lambda$33$lambda$30$lambda$29(CoroutineScope coroutineScope, MutableState mutableState, Repository repository, SnackbarHostState snackbarHostState) {
        CloudAccountPanel$lambda$11(mutableState, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new CloudAccountPanelKt$CloudAccountPanel$2$6$1$1(repository, coroutineScope, snackbarHostState, mutableState, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CloudAccountPanel$lambda$33$lambda$32$lambda$31(CoroutineScope coroutineScope, Repository repository, SnackbarHostState snackbarHostState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new CloudAccountPanelKt$CloudAccountPanel$2$7$1$1(repository, coroutineScope, snackbarHostState, null), 2, null);
        return Unit.INSTANCE;
    }

    private static final void SignedInLine(final FirebaseUser firebaseUser, Composer composer, final int i) {
        int i2;
        String str;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-837140642);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(firebaseUser) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-837140642, i2, -1, "com.example.rungps.ui.sync.SignedInLine (CloudAccountPanel.kt:157)");
            }
            if (firebaseUser != null) {
                String email = firebaseUser.getEmail();
                if (email == null) {
                    email = firebaseUser.getUid();
                    Intrinsics.checkNotNullExpressionValue(email, "getUid(...)");
                }
                str = "Signed in: " + email;
            } else {
                str = "Not signed in";
            }
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SignedInLine$lambda$35;
                    SignedInLine$lambda$35 = CloudAccountPanelKt.SignedInLine$lambda$35(FirebaseUser.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SignedInLine$lambda$35;
                }
            });
        }
    }

    private static final void LastSyncLine(final Context context, final FirebaseUser firebaseUser, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1151943765);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(firebaseUser) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1151943765, i2, -1, "com.example.rungps.ui.sync.LastSyncLine (CloudAccountPanel.kt:165)");
            }
            if (firebaseUser == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit LastSyncLine$lambda$36;
                            LastSyncLine$lambda$36 = CloudAccountPanelKt.LastSyncLine$lambda$36(context, firebaseUser, i, (Composer) obj, ((Integer) obj2).intValue());
                            return LastSyncLine$lambda$36;
                        }
                    });
                    return;
                }
                return;
            }
            long lastSyncMs = CloudSyncManager.INSTANCE.lastSyncMs(context);
            if (lastSyncMs <= 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit LastSyncLine$lambda$37;
                            LastSyncLine$lambda$37 = CloudAccountPanelKt.LastSyncLine$lambda$37(context, firebaseUser, i, (Composer) obj, ((Integer) obj2).intValue());
                            return LastSyncLine$lambda$37;
                        }
                    });
                    return;
                }
                return;
            }
            startRestartGroup.startReplaceGroup(1765170434);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new SimpleDateFormat("d MMM yyyy HH:mm", Locale.getDefault());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g("Last full sync: " + ((SimpleDateFormat) rememberedValue).format(new Date(lastSyncMs)), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup3 = composer2.endRestartGroup();
        if (endRestartGroup3 != null) {
            endRestartGroup3.updateScope(new Function2() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LastSyncLine$lambda$39;
                    LastSyncLine$lambda$39 = CloudAccountPanelKt.LastSyncLine$lambda$39(context, firebaseUser, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LastSyncLine$lambda$39;
                }
            });
        }
    }

    private static final void PendingUploadLine(final Context context, final FirebaseUser firebaseUser, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1394152512);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(firebaseUser) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1394152512, i2, -1, "com.example.rungps.ui.sync.PendingUploadLine (CloudAccountPanel.kt:178)");
            }
            if (firebaseUser == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit PendingUploadLine$lambda$40;
                            PendingUploadLine$lambda$40 = CloudAccountPanelKt.PendingUploadLine$lambda$40(context, firebaseUser, i, (Composer) obj, ((Integer) obj2).intValue());
                            return PendingUploadLine$lambda$40;
                        }
                    });
                    return;
                }
                return;
            }
            int pendingCount = GymSyncQueue.INSTANCE.pendingCount(context);
            if (pendingCount <= 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit PendingUploadLine$lambda$41;
                            PendingUploadLine$lambda$41 = CloudAccountPanelKt.PendingUploadLine$lambda$41(context, firebaseUser, i, (Composer) obj, ((Integer) obj2).intValue());
                            return PendingUploadLine$lambda$41;
                        }
                    });
                    return;
                }
                return;
            }
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(pendingCount + " finished session(s) waiting to upload — tap Sync now.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup3 = composer2.endRestartGroup();
        if (endRestartGroup3 != null) {
            endRestartGroup3.updateScope(new Function2() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PendingUploadLine$lambda$42;
                    PendingUploadLine$lambda$42 = CloudAccountPanelKt.PendingUploadLine$lambda$42(context, firebaseUser, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PendingUploadLine$lambda$42;
                }
            });
        }
    }

    private static final void CredentialFields(final String str, final String str2, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-827881853);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-827881853, i2, -1, "com.example.rungps.ui.sync.CredentialFields (CloudAccountPanel.kt:195)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            startRestartGroup.startReplaceGroup(-1378988444);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CredentialFields$lambda$47$lambda$44$lambda$43;
                        CredentialFields$lambda$47$lambda$44$lambda$43 = CloudAccountPanelKt.CredentialFields$lambda$47$lambda$44$lambda$43(Function1.this, (String) obj);
                        return CredentialFields$lambda$47$lambda$44$lambda$43;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            int i3 = i2;
            TextFieldKt.TextField(str, (Function1<? super String, Unit>) rememberedValue, weight$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CloudAccountPanelKt.INSTANCE.m7620getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i2 & 14) | 1572864, 12582912, 0, 8257464);
            Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            startRestartGroup.startReplaceGroup(-1378980825);
            boolean z2 = (i3 & 7168) == 2048;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit CredentialFields$lambda$47$lambda$46$lambda$45;
                        CredentialFields$lambda$47$lambda$46$lambda$45 = CloudAccountPanelKt.CredentialFields$lambda$47$lambda$46$lambda$45(Function1.this, (String) obj);
                        return CredentialFields$lambda$47$lambda$46$lambda$45;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            TextFieldKt.TextField(str2, (Function1<? super String, Unit>) rememberedValue2, weight$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CloudAccountPanelKt.INSTANCE.m7621getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i3 >> 3) & 14) | 1572864, 12582912, 0, 8257464);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CredentialFields$lambda$48;
                    CredentialFields$lambda$48 = CloudAccountPanelKt.CredentialFields$lambda$48(str, str2, function1, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CredentialFields$lambda$48;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CredentialFields$lambda$47$lambda$44$lambda$43(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(StringsKt.take(it, 80));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CredentialFields$lambda$47$lambda$46$lambda$45(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(StringsKt.take(it, 64));
        return Unit.INSTANCE;
    }

    private static final void AuthActions(final String str, final String str2, final FirebaseUser firebaseUser, final boolean z, final boolean z2, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final Function0<Unit> function05, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1013795406);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(firebaseUser) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changedInstance(function05) ? 536870912 : 268435456;
        }
        if ((306775187 & i2) != 306775186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1013795406, i2, -1, "com.example.rungps.ui.sync.AuthActions (CloudAccountPanel.kt:226)");
            }
            boolean z3 = !StringsKt.isBlank(str) && str2.length() >= 6;
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, horizontalScroll$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean z4 = z3;
            ButtonKt.OutlinedButton(function02, null, z4, null, null, null, null, null, null, ComposableSingletons$CloudAccountPanelKt.INSTANCE.m7622getLambda3$app_sideload(), startRestartGroup, ((i2 >> 18) & 14) | 805306368, 506);
            ButtonKt.OutlinedButton(function03, null, z4, null, null, null, null, null, null, ComposableSingletons$CloudAccountPanelKt.INSTANCE.m7623getLambda4$app_sideload(), startRestartGroup, ((i2 >> 21) & 14) | 805306368, 506);
            startRestartGroup.startReplaceGroup(-1659373268);
            if (firebaseUser != null) {
                ButtonKt.Button(function04, null, !z, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(771612223, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$AuthActions$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i3 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(771612223, i3, -1, "com.example.rungps.ui.sync.AuthActions.<anonymous>.<anonymous> (CloudAccountPanel.kt:236)");
                        }
                        TextKt.m2376Text4IGK_g(z ? "Syncing…" : "Sync now", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i2 >> 24) & 14) | 805306368, 506);
                startRestartGroup.startReplaceGroup(-1659366779);
                boolean z5 = (458752 & i2) == 131072;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit AuthActions$lambda$51$lambda$50$lambda$49;
                            AuthActions$lambda$51$lambda$50$lambda$49 = CloudAccountPanelKt.AuthActions$lambda$51$lambda$50$lambda$49(Function0.this);
                            return AuthActions$lambda$51$lambda$50$lambda$49;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$CloudAccountPanelKt.INSTANCE.m7624getLambda5$app_sideload(), startRestartGroup, 805306368, 510);
                ButtonKt.OutlinedButton(function05, null, false, null, null, null, null, null, null, ComposableSingletons$CloudAccountPanelKt.INSTANCE.m7625getLambda6$app_sideload(), startRestartGroup, ((i2 >> 27) & 14) | 805306368, 510);
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sync.CloudAccountPanelKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AuthActions$lambda$52;
                    AuthActions$lambda$52 = CloudAccountPanelKt.AuthActions$lambda$52(str, str2, firebaseUser, z, z2, function0, function02, function03, function04, function05, i, (Composer) obj, ((Integer) obj2).intValue());
                    return AuthActions$lambda$52;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AuthActions$lambda$51$lambda$50$lambda$49(Function0 function0) {
        FirebaseAuth.getInstance().signOut();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toastSyncResult(CoroutineScope coroutineScope, SnackbarHostState snackbarHostState, String str, CloudSyncResult cloudSyncResult) {
        String str2;
        if (cloudSyncResult.getErrors().isEmpty()) {
            str2 = str + " · synced (" + cloudSyncResult.summary() + ")";
        } else {
            str2 = str + " · sync issues: " + CollectionsKt.first((List) cloudSyncResult.getErrors());
        }
        if (cloudSyncResult.getErrors().isEmpty()) {
            AppSnackbarMessages.INSTANCE.showSuccess(coroutineScope, snackbarHostState, str2);
        } else {
            AppSnackbarMessages.INSTANCE.showError(coroutineScope, snackbarHostState, str2);
        }
    }
}
