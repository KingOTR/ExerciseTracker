package com.example.rungps.ui.profile;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.UserProfile;
import com.example.rungps.data.UserProfileStore;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: UserProfileForm.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001aÉ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a8\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0016\u001a\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"UserProfileForm", "", "displayName", "", "onDisplayNameChange", "Lkotlin/Function1;", "ageText", "onAgeTextChange", "dobText", "onDobTextChange", "heightText", "onHeightTextChange", "weightText", "onWeightTextChange", "sex", "onSexChange", "modifier", "Landroidx/compose/ui/Modifier;", "showHint", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;III)V", "parseProfileForm", "Lcom/example/rungps/data/UserProfile;", "toFormStrings", "Lcom/example/rungps/ui/profile/ProfileFormStrings;", "parseDobEpochDay", "", "(Ljava/lang/String;)Ljava/lang/Long;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserProfileFormKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileForm$lambda$18(String str, Function1 function1, String str2, Function1 function12, String str3, Function1 function13, String str4, Function1 function14, String str5, Function1 function15, String str6, Function1 function16, Modifier modifier, boolean z, int i, int i2, int i3, Composer composer, int i4) {
        UserProfileForm(str, function1, str2, function12, str3, function13, str4, function14, str5, function15, str6, function16, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserProfileForm(final String displayName, final Function1<? super String, Unit> onDisplayNameChange, final String ageText, final Function1<? super String, Unit> onAgeTextChange, final String dobText, final Function1<? super String, Unit> onDobTextChange, final String heightText, final Function1<? super String, Unit> onHeightTextChange, final String weightText, final Function1<? super String, Unit> onWeightTextChange, final String sex, final Function1<? super String, Unit> onSexChange, Modifier modifier, boolean z, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean z3;
        Object rememberedValue;
        boolean z4;
        Object rememberedValue2;
        boolean z5;
        Object rememberedValue3;
        boolean z6;
        Object rememberedValue4;
        boolean z7;
        Object rememberedValue5;
        Composer composer2;
        int currentCompositeKeyHash2;
        Composer m3336constructorimpl2;
        Composer composer3;
        final Modifier modifier2;
        final boolean z8;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(onDisplayNameChange, "onDisplayNameChange");
        Intrinsics.checkNotNullParameter(ageText, "ageText");
        Intrinsics.checkNotNullParameter(onAgeTextChange, "onAgeTextChange");
        Intrinsics.checkNotNullParameter(dobText, "dobText");
        Intrinsics.checkNotNullParameter(onDobTextChange, "onDobTextChange");
        Intrinsics.checkNotNullParameter(heightText, "heightText");
        Intrinsics.checkNotNullParameter(onHeightTextChange, "onHeightTextChange");
        Intrinsics.checkNotNullParameter(weightText, "weightText");
        Intrinsics.checkNotNullParameter(onWeightTextChange, "onWeightTextChange");
        Intrinsics.checkNotNullParameter(sex, "sex");
        Intrinsics.checkNotNullParameter(onSexChange, "onSexChange");
        Composer startRestartGroup = composer.startRestartGroup(-1939211142);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (startRestartGroup.changed(displayName) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onDisplayNameChange) ? 32 : 16;
        }
        int i13 = i4;
        if ((i3 & 4) != 0) {
            i13 |= 384;
        } else if ((i & 384) == 0) {
            i13 |= startRestartGroup.changed(ageText) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i13 |= 3072;
        } else if ((i & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(onAgeTextChange) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i13 |= 24576;
        } else if ((i & 24576) == 0) {
            i13 |= startRestartGroup.changed(dobText) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i13 |= startRestartGroup.changedInstance(onDobTextChange) ? 131072 : 65536;
        }
        if ((i3 & 64) == 0) {
            i12 = (1572864 & i) == 0 ? startRestartGroup.changed(heightText) ? 1048576 : 524288 : 1572864;
            if ((i3 & 128) != 0) {
                i11 = (12582912 & i) == 0 ? startRestartGroup.changedInstance(onHeightTextChange) ? 8388608 : 4194304 : 12582912;
                if ((i3 & 256) == 0) {
                    i10 = (100663296 & i) == 0 ? startRestartGroup.changed(weightText) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                    if ((i3 & 512) != 0) {
                        i9 = (805306368 & i) == 0 ? startRestartGroup.changedInstance(onWeightTextChange) ? 536870912 : 268435456 : 805306368;
                        i5 = i13;
                        if ((i3 & 1024) != 0) {
                            i6 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i6 = (startRestartGroup.changed(sex) ? 4 : 2) | i2;
                        } else {
                            i6 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            i6 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i6 |= startRestartGroup.changedInstance(onSexChange) ? 32 : 16;
                            i7 = i3 & 4096;
                            if (i7 == 0) {
                                i6 |= 384;
                            } else if ((i2 & 384) == 0) {
                                i6 |= startRestartGroup.changed(modifier) ? 256 : 128;
                                i8 = i3 & 8192;
                                if (i8 != 0) {
                                    i6 |= 3072;
                                } else if ((i2 & 3072) == 0) {
                                    i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
                                    if ((i5 & 306783379) == 306783378 || (i6 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
                                        Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                        z2 = i8 == 0 ? true : z;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1939211142, i5, i6, "com.example.rungps.ui.profile.UserProfileForm (UserProfileForm.kt:37)");
                                        }
                                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                        int i14 = i6;
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                                        Modifier modifier4 = modifier3;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (!startRestartGroup.getInserting()) {
                                            startRestartGroup.createNode(constructor);
                                        } else {
                                            startRestartGroup.useNode();
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
                                        startRestartGroup.startReplaceGroup(-462478217);
                                        if (z2) {
                                            TextKt.m2376Text4IGK_g("Used for BMI and future personalized coaching. Stored only on this device.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 6, 0, 65530);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        startRestartGroup.startReplaceGroup(-462466684);
                                        z3 = (i5 & SdkConfig.SDK_VERSION) != 32;
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit UserProfileForm$lambda$17$lambda$1$lambda$0;
                                                    UserProfileForm$lambda$17$lambda$1$lambda$0 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$1$lambda$0(Function1.this, (String) obj);
                                                    return UserProfileForm$lambda$17$lambda$1$lambda$0;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        OutlinedTextFieldKt.OutlinedTextField(displayName, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7393getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248, 12582912, 0, 8257464);
                                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        startRestartGroup.startReplaceGroup(-462458341);
                                        z4 = (i5 & 7168) != 2048;
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (!z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit UserProfileForm$lambda$17$lambda$4$lambda$3;
                                                    UserProfileForm$lambda$17$lambda$4$lambda$3 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$4$lambda$3(Function1.this, (String) obj);
                                                    return UserProfileForm$lambda$17$lambda$4$lambda$3;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        OutlinedTextFieldKt.OutlinedTextField(ageText, (Function1<? super String, Unit>) rememberedValue2, fillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7394getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248, 12582912, 0, 8257464);
                                        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        startRestartGroup.startReplaceGroup(-462448736);
                                        z5 = (i5 & 458752) != 131072;
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (!z5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit UserProfileForm$lambda$17$lambda$6$lambda$5;
                                                    UserProfileForm$lambda$17$lambda$6$lambda$5 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$6$lambda$5(Function1.this, (String) obj);
                                                    return UserProfileForm$lambda$17$lambda$6$lambda$5;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        OutlinedTextFieldKt.OutlinedTextField(dobText, (Function1<? super String, Unit>) rememberedValue3, fillMaxWidth$default3, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7395getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 12) & 14) | 1573248, 12582912, 0, 8257464);
                                        Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        startRestartGroup.startReplaceGroup(-462440066);
                                        z6 = (i5 & 29360128) != 8388608;
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (!z6 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit UserProfileForm$lambda$17$lambda$9$lambda$8;
                                                    UserProfileForm$lambda$17$lambda$9$lambda$8 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$9$lambda$8(Function1.this, (String) obj);
                                                    return UserProfileForm$lambda$17$lambda$9$lambda$8;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        OutlinedTextFieldKt.OutlinedTextField(heightText, (Function1<? super String, Unit>) rememberedValue4, fillMaxWidth$default4, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7396getLambda4$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 18) & 14) | 1573248, 12582912, 0, 8257464);
                                        Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        startRestartGroup.startReplaceGroup(-462430934);
                                        z7 = (i5 & 1879048192) != 536870912;
                                        rememberedValue5 = startRestartGroup.rememberedValue();
                                        if (!z7 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit UserProfileForm$lambda$17$lambda$12$lambda$11;
                                                    UserProfileForm$lambda$17$lambda$12$lambda$11 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$12$lambda$11(Function1.this, (String) obj);
                                                    return UserProfileForm$lambda$17$lambda$12$lambda$11;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue5);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        OutlinedTextFieldKt.OutlinedTextField(weightText, (Function1<? super String, Unit>) rememberedValue5, fillMaxWidth$default5, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7397getLambda5$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 24) & 14) | 1573248, 12582912, 0, 8257464);
                                        TextKt.m2376Text4IGK_g("Sex (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 6, 0, 65534);
                                        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                                        composer2 = startRestartGroup;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer2, 6);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                        boolean z9 = false;
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (!composer2.getInserting()) {
                                            composer2.createNode(constructor2);
                                        } else {
                                            composer2.useNode();
                                        }
                                        m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                                        Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        composer2.startReplaceGroup(-640042010);
                                        boolean z10 = true;
                                        for (Pair pair : CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(UserProfileStore.SEX_UNSPECIFIED, "—"), TuplesKt.to(UserProfileStore.SEX_MALE, "Male"), TuplesKt.to(UserProfileStore.SEX_FEMALE, "Female"), TuplesKt.to(UserProfileStore.SEX_OTHER, "Other")})) {
                                            final String str = (String) pair.component1();
                                            final String str2 = (String) pair.component2();
                                            boolean areEqual = Intrinsics.areEqual(sex, str);
                                            composer2.startReplaceGroup(-990554380);
                                            boolean changed = ((i14 & SdkConfig.SDK_VERSION) == 32 ? z10 : z9) | composer2.changed(str);
                                            Object rememberedValue6 = composer2.rememberedValue();
                                            if (changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue6 = new Function0() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit UserProfileForm$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13;
                                                        UserProfileForm$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13(Function1.this, str);
                                                        return UserProfileForm$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13;
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue6);
                                            }
                                            composer2.endReplaceGroup();
                                            ChipKt.FilterChip(areEqual, (Function0) rememberedValue6, ComposableLambdaKt.rememberComposableLambda(-128643942, z10, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$UserProfileForm$1$6$1$2
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i15) {
                                                    if ((i15 & 3) == 2 && composer4.getSkipping()) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-128643942, i15, -1, "com.example.rungps.ui.profile.UserProfileForm.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserProfileForm.kt:92)");
                                                    }
                                                    TextKt.m2376Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer2, 54), null, false, null, null, null, null, null, null, null, composer2, 384, 0, 4088);
                                            z10 = z10;
                                            z9 = z9;
                                            composer2 = composer2;
                                        }
                                        composer3 = composer2;
                                        composer3.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier2 = modifier4;
                                        z8 = z2;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        modifier2 = modifier;
                                        z8 = z;
                                        composer3 = startRestartGroup;
                                    }
                                    endRestartGroup = composer3.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                Unit UserProfileForm$lambda$18;
                                                UserProfileForm$lambda$18 = UserProfileFormKt.UserProfileForm$lambda$18(displayName, onDisplayNameChange, ageText, onAgeTextChange, dobText, onDobTextChange, heightText, onHeightTextChange, weightText, onWeightTextChange, sex, onSexChange, modifier2, z8, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                                return UserProfileForm$lambda$18;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                if ((i5 & 306783379) == 306783378) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                int i142 = i6;
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                                Modifier modifier42 = modifier3;
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                }
                                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3336constructorimpl.getInserting()) {
                                }
                                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                                Updater.m3343setimpl(m3336constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                startRestartGroup.startReplaceGroup(-462478217);
                                if (z2) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier fillMaxWidth$default6 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                startRestartGroup.startReplaceGroup(-462466684);
                                if ((i5 & SdkConfig.SDK_VERSION) != 32) {
                                }
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z3) {
                                }
                                rememberedValue = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit UserProfileForm$lambda$17$lambda$1$lambda$0;
                                        UserProfileForm$lambda$17$lambda$1$lambda$0 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$1$lambda$0(Function1.this, (String) obj);
                                        return UserProfileForm$lambda$17$lambda$1$lambda$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                                startRestartGroup.endReplaceGroup();
                                OutlinedTextFieldKt.OutlinedTextField(displayName, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default6, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7393getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248, 12582912, 0, 8257464);
                                Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                startRestartGroup.startReplaceGroup(-462458341);
                                if ((i5 & 7168) != 2048) {
                                }
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!z4) {
                                }
                                rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit UserProfileForm$lambda$17$lambda$4$lambda$3;
                                        UserProfileForm$lambda$17$lambda$4$lambda$3 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$4$lambda$3(Function1.this, (String) obj);
                                        return UserProfileForm$lambda$17$lambda$4$lambda$3;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                startRestartGroup.endReplaceGroup();
                                OutlinedTextFieldKt.OutlinedTextField(ageText, (Function1<? super String, Unit>) rememberedValue2, fillMaxWidth$default22, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7394getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248, 12582912, 0, 8257464);
                                Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                startRestartGroup.startReplaceGroup(-462448736);
                                if ((i5 & 458752) != 131072) {
                                }
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!z5) {
                                }
                                rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit UserProfileForm$lambda$17$lambda$6$lambda$5;
                                        UserProfileForm$lambda$17$lambda$6$lambda$5 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$6$lambda$5(Function1.this, (String) obj);
                                        return UserProfileForm$lambda$17$lambda$6$lambda$5;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                startRestartGroup.endReplaceGroup();
                                OutlinedTextFieldKt.OutlinedTextField(dobText, (Function1<? super String, Unit>) rememberedValue3, fillMaxWidth$default32, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7395getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 12) & 14) | 1573248, 12582912, 0, 8257464);
                                Modifier fillMaxWidth$default42 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                startRestartGroup.startReplaceGroup(-462440066);
                                if ((i5 & 29360128) != 8388608) {
                                }
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!z6) {
                                }
                                rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit UserProfileForm$lambda$17$lambda$9$lambda$8;
                                        UserProfileForm$lambda$17$lambda$9$lambda$8 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$9$lambda$8(Function1.this, (String) obj);
                                        return UserProfileForm$lambda$17$lambda$9$lambda$8;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                startRestartGroup.endReplaceGroup();
                                OutlinedTextFieldKt.OutlinedTextField(heightText, (Function1<? super String, Unit>) rememberedValue4, fillMaxWidth$default42, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7396getLambda4$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 18) & 14) | 1573248, 12582912, 0, 8257464);
                                Modifier fillMaxWidth$default52 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                startRestartGroup.startReplaceGroup(-462430934);
                                if ((i5 & 1879048192) != 536870912) {
                                }
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (!z7) {
                                }
                                rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit UserProfileForm$lambda$17$lambda$12$lambda$11;
                                        UserProfileForm$lambda$17$lambda$12$lambda$11 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$12$lambda$11(Function1.this, (String) obj);
                                        return UserProfileForm$lambda$17$lambda$12$lambda$11;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                                startRestartGroup.endReplaceGroup();
                                OutlinedTextFieldKt.OutlinedTextField(weightText, (Function1<? super String, Unit>) rememberedValue5, fillMaxWidth$default52, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7397getLambda5$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 24) & 14) | 1573248, 12582912, 0, 8257464);
                                TextKt.m2376Text4IGK_g("Sex (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 6, 0, 65534);
                                Arrangement.HorizontalOrVertical m564spacedBy0680j_422 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                                composer2 = startRestartGroup;
                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_422, Alignment.INSTANCE.getTop(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                boolean z92 = false;
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, companion2);
                                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                }
                                m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                                Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3336constructorimpl2.getInserting()) {
                                }
                                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                composer2.startReplaceGroup(-640042010);
                                boolean z102 = true;
                                while (r0.hasNext()) {
                                }
                                composer3 = composer2;
                                composer3.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier42;
                                z8 = z2;
                                endRestartGroup = composer3.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i8 = i3 & 8192;
                            if (i8 != 0) {
                            }
                            if ((i5 & 306783379) == 306783378) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_432 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_432, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                            int i1422 = i6;
                            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                            Modifier modifier422 = modifier3;
                            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3336constructorimpl.getInserting()) {
                            }
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                            Updater.m3343setimpl(m3336constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(-462478217);
                            if (z2) {
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier fillMaxWidth$default62 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(-462466684);
                            if ((i5 & SdkConfig.SDK_VERSION) != 32) {
                            }
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z3) {
                            }
                            rememberedValue = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit UserProfileForm$lambda$17$lambda$1$lambda$0;
                                    UserProfileForm$lambda$17$lambda$1$lambda$0 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$1$lambda$0(Function1.this, (String) obj);
                                    return UserProfileForm$lambda$17$lambda$1$lambda$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                            startRestartGroup.endReplaceGroup();
                            OutlinedTextFieldKt.OutlinedTextField(displayName, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default62, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7393getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248, 12582912, 0, 8257464);
                            Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(-462458341);
                            if ((i5 & 7168) != 2048) {
                            }
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z4) {
                            }
                            rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit UserProfileForm$lambda$17$lambda$4$lambda$3;
                                    UserProfileForm$lambda$17$lambda$4$lambda$3 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$4$lambda$3(Function1.this, (String) obj);
                                    return UserProfileForm$lambda$17$lambda$4$lambda$3;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                            startRestartGroup.endReplaceGroup();
                            OutlinedTextFieldKt.OutlinedTextField(ageText, (Function1<? super String, Unit>) rememberedValue2, fillMaxWidth$default222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7394getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248, 12582912, 0, 8257464);
                            Modifier fillMaxWidth$default322 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(-462448736);
                            if ((i5 & 458752) != 131072) {
                            }
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z5) {
                            }
                            rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit UserProfileForm$lambda$17$lambda$6$lambda$5;
                                    UserProfileForm$lambda$17$lambda$6$lambda$5 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$6$lambda$5(Function1.this, (String) obj);
                                    return UserProfileForm$lambda$17$lambda$6$lambda$5;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            startRestartGroup.endReplaceGroup();
                            OutlinedTextFieldKt.OutlinedTextField(dobText, (Function1<? super String, Unit>) rememberedValue3, fillMaxWidth$default322, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7395getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 12) & 14) | 1573248, 12582912, 0, 8257464);
                            Modifier fillMaxWidth$default422 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(-462440066);
                            if ((i5 & 29360128) != 8388608) {
                            }
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!z6) {
                            }
                            rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit UserProfileForm$lambda$17$lambda$9$lambda$8;
                                    UserProfileForm$lambda$17$lambda$9$lambda$8 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$9$lambda$8(Function1.this, (String) obj);
                                    return UserProfileForm$lambda$17$lambda$9$lambda$8;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            startRestartGroup.endReplaceGroup();
                            OutlinedTextFieldKt.OutlinedTextField(heightText, (Function1<? super String, Unit>) rememberedValue4, fillMaxWidth$default422, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7396getLambda4$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 18) & 14) | 1573248, 12582912, 0, 8257464);
                            Modifier fillMaxWidth$default522 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(-462430934);
                            if ((i5 & 1879048192) != 536870912) {
                            }
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!z7) {
                            }
                            rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit UserProfileForm$lambda$17$lambda$12$lambda$11;
                                    UserProfileForm$lambda$17$lambda$12$lambda$11 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$12$lambda$11(Function1.this, (String) obj);
                                    return UserProfileForm$lambda$17$lambda$12$lambda$11;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                            startRestartGroup.endReplaceGroup();
                            OutlinedTextFieldKt.OutlinedTextField(weightText, (Function1<? super String, Unit>) rememberedValue5, fillMaxWidth$default522, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7397getLambda5$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 24) & 14) | 1573248, 12582912, 0, 8257464);
                            TextKt.m2376Text4IGK_g("Sex (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 6, 0, 65534);
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_4222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                            composer2 = startRestartGroup;
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m564spacedBy0680j_4222, Alignment.INSTANCE.getTop(), composer2, 6);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            boolean z922 = false;
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer2, companion22);
                            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                            }
                            composer2.startReusableNode();
                            if (!composer2.getInserting()) {
                            }
                            m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m3336constructorimpl2.getInserting()) {
                            }
                            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                            composer2.startReplaceGroup(-640042010);
                            boolean z1022 = true;
                            while (r0.hasNext()) {
                            }
                            composer3 = composer2;
                            composer3.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier422;
                            z8 = z2;
                            endRestartGroup = composer3.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i7 = i3 & 4096;
                        if (i7 == 0) {
                        }
                        i8 = i3 & 8192;
                        if (i8 != 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4322 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4322, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                        int i14222 = i6;
                        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                        Modifier modifier4222 = modifier3;
                        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl.getInserting()) {
                        }
                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-462478217);
                        if (z2) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier fillMaxWidth$default622 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(-462466684);
                        if ((i5 & SdkConfig.SDK_VERSION) != 32) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z3) {
                        }
                        rememberedValue = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit UserProfileForm$lambda$17$lambda$1$lambda$0;
                                UserProfileForm$lambda$17$lambda$1$lambda$0 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$1$lambda$0(Function1.this, (String) obj);
                                return UserProfileForm$lambda$17$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        OutlinedTextFieldKt.OutlinedTextField(displayName, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default622, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7393getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248, 12582912, 0, 8257464);
                        Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(-462458341);
                        if ((i5 & 7168) != 2048) {
                        }
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z4) {
                        }
                        rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit UserProfileForm$lambda$17$lambda$4$lambda$3;
                                UserProfileForm$lambda$17$lambda$4$lambda$3 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$4$lambda$3(Function1.this, (String) obj);
                                return UserProfileForm$lambda$17$lambda$4$lambda$3;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceGroup();
                        OutlinedTextFieldKt.OutlinedTextField(ageText, (Function1<? super String, Unit>) rememberedValue2, fillMaxWidth$default2222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7394getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248, 12582912, 0, 8257464);
                        Modifier fillMaxWidth$default3222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(-462448736);
                        if ((i5 & 458752) != 131072) {
                        }
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!z5) {
                        }
                        rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit UserProfileForm$lambda$17$lambda$6$lambda$5;
                                UserProfileForm$lambda$17$lambda$6$lambda$5 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$6$lambda$5(Function1.this, (String) obj);
                                return UserProfileForm$lambda$17$lambda$6$lambda$5;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceGroup();
                        OutlinedTextFieldKt.OutlinedTextField(dobText, (Function1<? super String, Unit>) rememberedValue3, fillMaxWidth$default3222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7395getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 12) & 14) | 1573248, 12582912, 0, 8257464);
                        Modifier fillMaxWidth$default4222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(-462440066);
                        if ((i5 & 29360128) != 8388608) {
                        }
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!z6) {
                        }
                        rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit UserProfileForm$lambda$17$lambda$9$lambda$8;
                                UserProfileForm$lambda$17$lambda$9$lambda$8 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$9$lambda$8(Function1.this, (String) obj);
                                return UserProfileForm$lambda$17$lambda$9$lambda$8;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceGroup();
                        OutlinedTextFieldKt.OutlinedTextField(heightText, (Function1<? super String, Unit>) rememberedValue4, fillMaxWidth$default4222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7396getLambda4$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 18) & 14) | 1573248, 12582912, 0, 8257464);
                        Modifier fillMaxWidth$default5222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(-462430934);
                        if ((i5 & 1879048192) != 536870912) {
                        }
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!z7) {
                        }
                        rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit UserProfileForm$lambda$17$lambda$12$lambda$11;
                                UserProfileForm$lambda$17$lambda$12$lambda$11 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$12$lambda$11(Function1.this, (String) obj);
                                return UserProfileForm$lambda$17$lambda$12$lambda$11;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        startRestartGroup.endReplaceGroup();
                        OutlinedTextFieldKt.OutlinedTextField(weightText, (Function1<? super String, Unit>) rememberedValue5, fillMaxWidth$default5222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7397getLambda5$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 24) & 14) | 1573248, 12582912, 0, 8257464);
                        TextKt.m2376Text4IGK_g("Sex (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 6, 0, 65534);
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_42222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                        composer2 = startRestartGroup;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier.Companion companion222 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42222, Alignment.INSTANCE.getTop(), composer2, 6);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        boolean z9222 = false;
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2222 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(composer2, companion222);
                        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
                        }
                        m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                        Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl2.getInserting()) {
                        }
                        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(-640042010);
                        boolean z10222 = true;
                        while (r0.hasNext()) {
                        }
                        composer3 = composer2;
                        composer3.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier4222;
                        z8 = z2;
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i13 |= i9;
                    i5 = i13;
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    i7 = i3 & 4096;
                    if (i7 == 0) {
                    }
                    i8 = i3 & 8192;
                    if (i8 != 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_43222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                    int i142222 = i6;
                    Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                    Modifier modifier42222 = modifier3;
                    Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl.getInserting()) {
                    }
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-462478217);
                    if (z2) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxWidth$default6222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-462466684);
                    if ((i5 & SdkConfig.SDK_VERSION) != 32) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z3) {
                    }
                    rememberedValue = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit UserProfileForm$lambda$17$lambda$1$lambda$0;
                            UserProfileForm$lambda$17$lambda$1$lambda$0 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$1$lambda$0(Function1.this, (String) obj);
                            return UserProfileForm$lambda$17$lambda$1$lambda$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    OutlinedTextFieldKt.OutlinedTextField(displayName, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default6222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7393getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248, 12582912, 0, 8257464);
                    Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-462458341);
                    if ((i5 & 7168) != 2048) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit UserProfileForm$lambda$17$lambda$4$lambda$3;
                            UserProfileForm$lambda$17$lambda$4$lambda$3 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$4$lambda$3(Function1.this, (String) obj);
                            return UserProfileForm$lambda$17$lambda$4$lambda$3;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    OutlinedTextFieldKt.OutlinedTextField(ageText, (Function1<? super String, Unit>) rememberedValue2, fillMaxWidth$default22222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7394getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248, 12582912, 0, 8257464);
                    Modifier fillMaxWidth$default32222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-462448736);
                    if ((i5 & 458752) != 131072) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z5) {
                    }
                    rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit UserProfileForm$lambda$17$lambda$6$lambda$5;
                            UserProfileForm$lambda$17$lambda$6$lambda$5 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$6$lambda$5(Function1.this, (String) obj);
                            return UserProfileForm$lambda$17$lambda$6$lambda$5;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceGroup();
                    OutlinedTextFieldKt.OutlinedTextField(dobText, (Function1<? super String, Unit>) rememberedValue3, fillMaxWidth$default32222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7395getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 12) & 14) | 1573248, 12582912, 0, 8257464);
                    Modifier fillMaxWidth$default42222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-462440066);
                    if ((i5 & 29360128) != 8388608) {
                    }
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z6) {
                    }
                    rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit UserProfileForm$lambda$17$lambda$9$lambda$8;
                            UserProfileForm$lambda$17$lambda$9$lambda$8 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$9$lambda$8(Function1.this, (String) obj);
                            return UserProfileForm$lambda$17$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceGroup();
                    OutlinedTextFieldKt.OutlinedTextField(heightText, (Function1<? super String, Unit>) rememberedValue4, fillMaxWidth$default42222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7396getLambda4$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 18) & 14) | 1573248, 12582912, 0, 8257464);
                    Modifier fillMaxWidth$default52222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-462430934);
                    if ((i5 & 1879048192) != 536870912) {
                    }
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!z7) {
                    }
                    rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit UserProfileForm$lambda$17$lambda$12$lambda$11;
                            UserProfileForm$lambda$17$lambda$12$lambda$11 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$12$lambda$11(Function1.this, (String) obj);
                            return UserProfileForm$lambda$17$lambda$12$lambda$11;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    startRestartGroup.endReplaceGroup();
                    OutlinedTextFieldKt.OutlinedTextField(weightText, (Function1<? super String, Unit>) rememberedValue5, fillMaxWidth$default52222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7397getLambda5$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 24) & 14) | 1573248, 12582912, 0, 8257464);
                    TextKt.m2376Text4IGK_g("Sex (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 6, 0, 65534);
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_422222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                    composer2 = startRestartGroup;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    Modifier.Companion companion2222 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(m564spacedBy0680j_422222, Alignment.INSTANCE.getTop(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    boolean z92222 = false;
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap22222 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(composer2, companion2222);
                    Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                    }
                    m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                    Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl2.getInserting()) {
                    }
                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(-640042010);
                    boolean z102222 = true;
                    while (r0.hasNext()) {
                    }
                    composer3 = composer2;
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42222;
                    z8 = z2;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i13 |= i10;
                if ((i3 & 512) != 0) {
                }
                i13 |= i9;
                i5 = i13;
                if ((i3 & 1024) != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                i7 = i3 & 4096;
                if (i7 == 0) {
                }
                i8 = i3 & 8192;
                if (i8 != 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement.HorizontalOrVertical m564spacedBy0680j_432222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_432222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
                int i1422222 = i6;
                Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                Modifier modifier422222 = modifier3;
                Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting()) {
                }
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-462478217);
                if (z2) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxWidth$default62222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-462466684);
                if ((i5 & SdkConfig.SDK_VERSION) != 32) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit UserProfileForm$lambda$17$lambda$1$lambda$0;
                        UserProfileForm$lambda$17$lambda$1$lambda$0 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$1$lambda$0(Function1.this, (String) obj);
                        return UserProfileForm$lambda$17$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                OutlinedTextFieldKt.OutlinedTextField(displayName, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default62222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7393getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248, 12582912, 0, 8257464);
                Modifier fillMaxWidth$default222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-462458341);
                if ((i5 & 7168) != 2048) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit UserProfileForm$lambda$17$lambda$4$lambda$3;
                        UserProfileForm$lambda$17$lambda$4$lambda$3 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$4$lambda$3(Function1.this, (String) obj);
                        return UserProfileForm$lambda$17$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                OutlinedTextFieldKt.OutlinedTextField(ageText, (Function1<? super String, Unit>) rememberedValue2, fillMaxWidth$default222222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7394getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248, 12582912, 0, 8257464);
                Modifier fillMaxWidth$default322222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-462448736);
                if ((i5 & 458752) != 131072) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z5) {
                }
                rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit UserProfileForm$lambda$17$lambda$6$lambda$5;
                        UserProfileForm$lambda$17$lambda$6$lambda$5 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$6$lambda$5(Function1.this, (String) obj);
                        return UserProfileForm$lambda$17$lambda$6$lambda$5;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceGroup();
                OutlinedTextFieldKt.OutlinedTextField(dobText, (Function1<? super String, Unit>) rememberedValue3, fillMaxWidth$default322222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7395getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 12) & 14) | 1573248, 12582912, 0, 8257464);
                Modifier fillMaxWidth$default422222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-462440066);
                if ((i5 & 29360128) != 8388608) {
                }
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z6) {
                }
                rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit UserProfileForm$lambda$17$lambda$9$lambda$8;
                        UserProfileForm$lambda$17$lambda$9$lambda$8 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$9$lambda$8(Function1.this, (String) obj);
                        return UserProfileForm$lambda$17$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                OutlinedTextFieldKt.OutlinedTextField(heightText, (Function1<? super String, Unit>) rememberedValue4, fillMaxWidth$default422222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7396getLambda4$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 18) & 14) | 1573248, 12582912, 0, 8257464);
                Modifier fillMaxWidth$default522222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-462430934);
                if ((i5 & 1879048192) != 536870912) {
                }
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!z7) {
                }
                rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit UserProfileForm$lambda$17$lambda$12$lambda$11;
                        UserProfileForm$lambda$17$lambda$12$lambda$11 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$12$lambda$11(Function1.this, (String) obj);
                        return UserProfileForm$lambda$17$lambda$12$lambda$11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceGroup();
                OutlinedTextFieldKt.OutlinedTextField(weightText, (Function1<? super String, Unit>) rememberedValue5, fillMaxWidth$default522222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7397getLambda5$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 24) & 14) | 1573248, 12582912, 0, 8257464);
                TextKt.m2376Text4IGK_g("Sex (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 6, 0, 65534);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4222222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                composer2 = startRestartGroup;
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier.Companion companion22222 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(m564spacedBy0680j_4222222, Alignment.INSTANCE.getTop(), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                boolean z922222 = false;
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap222222 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(composer2, companion22222);
                Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl2.getInserting()) {
                }
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22222 = RowScopeInstance.INSTANCE;
                composer2.startReplaceGroup(-640042010);
                boolean z1022222 = true;
                while (r0.hasNext()) {
                }
                composer3 = composer2;
                composer3.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier422222;
                z8 = z2;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i13 |= i11;
            if ((i3 & 256) == 0) {
            }
            i13 |= i10;
            if ((i3 & 512) != 0) {
            }
            i13 |= i9;
            i5 = i13;
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            i7 = i3 & 4096;
            if (i7 == 0) {
            }
            i8 = i3 & 8192;
            if (i8 != 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4322222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy222222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4322222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
            int i14222222 = i6;
            Modifier materializeModifier322222 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
            Modifier modifier4222222 = modifier3;
            Function0<ComposeUiNode> constructor322222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap322222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl.getInserting()) {
            }
            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322222);
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier322222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance222222 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-462478217);
            if (z2) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxWidth$default622222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-462466684);
            if ((i5 & SdkConfig.SDK_VERSION) != 32) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit UserProfileForm$lambda$17$lambda$1$lambda$0;
                    UserProfileForm$lambda$17$lambda$1$lambda$0 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$1$lambda$0(Function1.this, (String) obj);
                    return UserProfileForm$lambda$17$lambda$1$lambda$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(displayName, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default622222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7393getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248, 12582912, 0, 8257464);
            Modifier fillMaxWidth$default2222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-462458341);
            if ((i5 & 7168) != 2048) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit UserProfileForm$lambda$17$lambda$4$lambda$3;
                    UserProfileForm$lambda$17$lambda$4$lambda$3 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$4$lambda$3(Function1.this, (String) obj);
                    return UserProfileForm$lambda$17$lambda$4$lambda$3;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(ageText, (Function1<? super String, Unit>) rememberedValue2, fillMaxWidth$default2222222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7394getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248, 12582912, 0, 8257464);
            Modifier fillMaxWidth$default3222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-462448736);
            if ((i5 & 458752) != 131072) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z5) {
            }
            rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit UserProfileForm$lambda$17$lambda$6$lambda$5;
                    UserProfileForm$lambda$17$lambda$6$lambda$5 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$6$lambda$5(Function1.this, (String) obj);
                    return UserProfileForm$lambda$17$lambda$6$lambda$5;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(dobText, (Function1<? super String, Unit>) rememberedValue3, fillMaxWidth$default3222222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7395getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 12) & 14) | 1573248, 12582912, 0, 8257464);
            Modifier fillMaxWidth$default4222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-462440066);
            if ((i5 & 29360128) != 8388608) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z6) {
            }
            rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit UserProfileForm$lambda$17$lambda$9$lambda$8;
                    UserProfileForm$lambda$17$lambda$9$lambda$8 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$9$lambda$8(Function1.this, (String) obj);
                    return UserProfileForm$lambda$17$lambda$9$lambda$8;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(heightText, (Function1<? super String, Unit>) rememberedValue4, fillMaxWidth$default4222222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7396getLambda4$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 18) & 14) | 1573248, 12582912, 0, 8257464);
            Modifier fillMaxWidth$default5222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-462430934);
            if ((i5 & 1879048192) != 536870912) {
            }
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!z7) {
            }
            rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit UserProfileForm$lambda$17$lambda$12$lambda$11;
                    UserProfileForm$lambda$17$lambda$12$lambda$11 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$12$lambda$11(Function1.this, (String) obj);
                    return UserProfileForm$lambda$17$lambda$12$lambda$11;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceGroup();
            OutlinedTextFieldKt.OutlinedTextField(weightText, (Function1<? super String, Unit>) rememberedValue5, fillMaxWidth$default5222222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7397getLambda5$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 24) & 14) | 1573248, 12582912, 0, 8257464);
            TextKt.m2376Text4IGK_g("Sex (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 6, 0, 65534);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42222222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            composer2 = startRestartGroup;
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion222222 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy222222 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42222222, Alignment.INSTANCE.getTop(), composer2, 6);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            boolean z9222222 = false;
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2222222 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(composer2, companion222222);
            Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl2.getInserting()) {
            }
            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222222 = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-640042010);
            boolean z10222222 = true;
            while (r0.hasNext()) {
            }
            composer3 = composer2;
            composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier4222222;
            z8 = z2;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i13 |= i12;
        if ((i3 & 128) != 0) {
        }
        i13 |= i11;
        if ((i3 & 256) == 0) {
        }
        i13 |= i10;
        if ((i3 & 512) != 0) {
        }
        i13 |= i9;
        i5 = i13;
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        i7 = i3 & 4096;
        if (i7 == 0) {
        }
        i8 = i3 & 8192;
        if (i8 != 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Arrangement.HorizontalOrVertical m564spacedBy0680j_43222222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2222222 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_43222222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222222 = startRestartGroup.getCurrentCompositionLocalMap();
        int i142222222 = i6;
        Modifier materializeModifier3222222 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
        Modifier modifier42222222 = modifier3;
        Function0<ComposeUiNode> constructor3222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap3222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222222);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier3222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2222222 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-462478217);
        if (z2) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxWidth$default6222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-462466684);
        if ((i5 & SdkConfig.SDK_VERSION) != 32) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit UserProfileForm$lambda$17$lambda$1$lambda$0;
                UserProfileForm$lambda$17$lambda$1$lambda$0 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$1$lambda$0(Function1.this, (String) obj);
                return UserProfileForm$lambda$17$lambda$1$lambda$0;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        OutlinedTextFieldKt.OutlinedTextField(displayName, (Function1<? super String, Unit>) rememberedValue, fillMaxWidth$default6222222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7393getLambda1$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (i5 & 14) | 1573248, 12582912, 0, 8257464);
        Modifier fillMaxWidth$default22222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-462458341);
        if ((i5 & 7168) != 2048) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit UserProfileForm$lambda$17$lambda$4$lambda$3;
                UserProfileForm$lambda$17$lambda$4$lambda$3 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$4$lambda$3(Function1.this, (String) obj);
                return UserProfileForm$lambda$17$lambda$4$lambda$3;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        OutlinedTextFieldKt.OutlinedTextField(ageText, (Function1<? super String, Unit>) rememberedValue2, fillMaxWidth$default22222222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7394getLambda2$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 6) & 14) | 1573248, 12582912, 0, 8257464);
        Modifier fillMaxWidth$default32222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-462448736);
        if ((i5 & 458752) != 131072) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit UserProfileForm$lambda$17$lambda$6$lambda$5;
                UserProfileForm$lambda$17$lambda$6$lambda$5 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$6$lambda$5(Function1.this, (String) obj);
                return UserProfileForm$lambda$17$lambda$6$lambda$5;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        OutlinedTextFieldKt.OutlinedTextField(dobText, (Function1<? super String, Unit>) rememberedValue3, fillMaxWidth$default32222222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7395getLambda3$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 12) & 14) | 1573248, 12582912, 0, 8257464);
        Modifier fillMaxWidth$default42222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-462440066);
        if ((i5 & 29360128) != 8388608) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z6) {
        }
        rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit UserProfileForm$lambda$17$lambda$9$lambda$8;
                UserProfileForm$lambda$17$lambda$9$lambda$8 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$9$lambda$8(Function1.this, (String) obj);
                return UserProfileForm$lambda$17$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        OutlinedTextFieldKt.OutlinedTextField(heightText, (Function1<? super String, Unit>) rememberedValue4, fillMaxWidth$default42222222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7396getLambda4$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 18) & 14) | 1573248, 12582912, 0, 8257464);
        Modifier fillMaxWidth$default52222222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-462430934);
        if ((i5 & 1879048192) != 536870912) {
        }
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!z7) {
        }
        rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.profile.UserProfileFormKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit UserProfileForm$lambda$17$lambda$12$lambda$11;
                UserProfileForm$lambda$17$lambda$12$lambda$11 = UserProfileFormKt.UserProfileForm$lambda$17$lambda$12$lambda$11(Function1.this, (String) obj);
                return UserProfileForm$lambda$17$lambda$12$lambda$11;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        OutlinedTextFieldKt.OutlinedTextField(weightText, (Function1<? super String, Unit>) rememberedValue5, fillMaxWidth$default52222222, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$UserProfileFormKt.INSTANCE.m7397getLambda5$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, ((i5 >> 24) & 14) | 1573248, 12582912, 0, 8257464);
        TextKt.m2376Text4IGK_g("Sex (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 6, 0, 65534);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_422222222 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
        composer2 = startRestartGroup;
        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        Modifier.Companion companion2222222 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy2222222 = RowKt.rowMeasurePolicy(m564spacedBy0680j_422222222, Alignment.INSTANCE.getTop(), composer2, 6);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        boolean z92222222 = false;
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22222222 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222222 = ComposedModifierKt.materializeModifier(composer2, companion2222222);
        Function0<ComposeUiNode> constructor22222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
        Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap22222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl2.getInserting()) {
        }
        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222);
        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier22222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222222 = RowScopeInstance.INSTANCE;
        composer2.startReplaceGroup(-640042010);
        boolean z102222222 = true;
        while (r0.hasNext()) {
        }
        composer3 = composer2;
        composer3.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier42222222;
        z8 = z2;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileForm$lambda$17$lambda$1$lambda$0(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(StringsKt.take(it, 40));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileForm$lambda$17$lambda$6$lambda$5(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(StringsKt.take(it, 10));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileForm$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final UserProfile parseProfileForm(String displayName, String ageText, String dobText, String heightText, String weightText, String sex) {
        Integer intOrNull;
        Integer intOrNull2;
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(ageText, "ageText");
        Intrinsics.checkNotNullParameter(dobText, "dobText");
        Intrinsics.checkNotNullParameter(heightText, "heightText");
        Intrinsics.checkNotNullParameter(weightText, "weightText");
        Intrinsics.checkNotNullParameter(sex, "sex");
        Long parseDobEpochDay = parseDobEpochDay(dobText);
        if (parseDobEpochDay != null) {
            intOrNull = Integer.valueOf(Period.between(LocalDate.ofEpochDay(parseDobEpochDay.longValue()), LocalDate.now(ZoneId.systemDefault())).getYears());
        } else {
            intOrNull = StringsKt.toIntOrNull(ageText);
        }
        Integer num = intOrNull;
        if (num == null || (intOrNull2 = StringsKt.toIntOrNull(heightText)) == null) {
            return null;
        }
        int intValue = intOrNull2.intValue();
        Double doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.replace$default(weightText, AbstractJsonLexerKt.COMMA, '.', false, 4, (Object) null));
        if (doubleOrNull == null) {
            return null;
        }
        UserProfile userProfile = new UserProfile(StringsKt.trim((CharSequence) displayName).toString(), num, parseDobEpochDay, Integer.valueOf(intValue), Double.valueOf(doubleOrNull.doubleValue()), sex);
        if (userProfile.getHasCoreStats()) {
            return userProfile;
        }
        return null;
    }

    public static final ProfileFormStrings toFormStrings(UserProfile userProfile) {
        Intrinsics.checkNotNullParameter(userProfile, "<this>");
        String displayName = userProfile.getDisplayName();
        Integer ageYears = userProfile.getAgeYears();
        String str = null;
        String num = ageYears != null ? ageYears.toString() : null;
        if (num == null) {
            num = "";
        }
        Long dobEpochDay = userProfile.getDobEpochDay();
        String localDate = dobEpochDay != null ? LocalDate.ofEpochDay(dobEpochDay.longValue()).toString() : null;
        if (localDate == null) {
            localDate = "";
        }
        Integer heightCm = userProfile.getHeightCm();
        String num2 = heightCm != null ? heightCm.toString() : null;
        if (num2 == null) {
            num2 = "";
        }
        Double weightKg = userProfile.getWeightKg();
        if (weightKg != null) {
            double doubleValue = weightKg.doubleValue();
            if (doubleValue % 1.0d == 0.0d) {
                str = String.valueOf((int) doubleValue);
            } else {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
        }
        return new ProfileFormStrings(displayName, num, localDate, num2, str == null ? "" : str, userProfile.getSex());
    }

    private static final Long parseDobEpochDay(String str) {
        String obj = StringsKt.trim((CharSequence) str).toString();
        if (obj.length() == 0) {
            return null;
        }
        try {
            return Long.valueOf(LocalDate.parse(obj).toEpochDay());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileForm$lambda$17$lambda$4$lambda$3(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        function1.invoke(StringsKt.take(sb2, 3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileForm$lambda$17$lambda$9$lambda$8(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        function1.invoke(StringsKt.take(sb2, 3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileForm$lambda$17$lambda$12$lambda$11(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == '.') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        function1.invoke(StringsKt.take(sb2, 6));
        return Unit.INSTANCE;
    }
}
