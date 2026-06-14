package com.example.rungps.ui.gym;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.analytics.ProgressiveOverload;
import com.example.rungps.data.ExercisePr;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.Repository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymProgressiveOverloadHint.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a3\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\f\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002²\u0006\f\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002"}, d2 = {"GymProgressiveOverloadHint", "", "pr", "Lcom/example/rungps/data/ExercisePr;", "lastBest", "Lcom/example/rungps/data/GymSetEntity;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/rungps/data/ExercisePr;Lcom/example/rungps/data/GymSetEntity;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GymExerciseProgressiveOverloadHint", "exerciseName", "", "repo", "Lcom/example/rungps/data/Repository;", "refreshKey", "", "(Ljava/lang/String;Lcom/example/rungps/data/Repository;Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/runtime/Composer;II)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymProgressiveOverloadHintKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymExerciseProgressiveOverloadHint$lambda$9(String str, Repository repository, Modifier modifier, Object obj, int i, int i2, Composer composer, int i3) {
        GymExerciseProgressiveOverloadHint(str, repository, modifier, obj, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymProgressiveOverloadHint$lambda$0(ExercisePr exercisePr, GymSetEntity gymSetEntity, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GymProgressiveOverloadHint(exercisePr, gymSetEntity, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymProgressiveOverloadHint$lambda$1(ExercisePr exercisePr, GymSetEntity gymSetEntity, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GymProgressiveOverloadHint(exercisePr, gymSetEntity, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GymProgressiveOverloadHint(final ExercisePr exercisePr, final GymSetEntity gymSetEntity, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final ProgressiveOverload.Hint hint;
        Composer startRestartGroup = composer.startRestartGroup(2018765816);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(exercisePr) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(gymSetEntity) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2018765816, i3, -1, "com.example.rungps.ui.gym.GymProgressiveOverloadHint (GymProgressiveOverloadHint.kt:30)");
                }
                hint = ProgressiveOverload.INSTANCE.hint(exercisePr, gymSetEntity);
                if (hint != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Modifier modifier4 = modifier3;
                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymProgressiveOverloadHintKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit GymProgressiveOverloadHint$lambda$0;
                                GymProgressiveOverloadHint$lambda$0 = GymProgressiveOverloadHintKt.GymProgressiveOverloadHint$lambda$0(ExercisePr.this, gymSetEntity, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return GymProgressiveOverloadHint$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                final ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                RoundedCornerShape m967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(14));
                long m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(colorScheme.getSecondaryContainer(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null);
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1265190765, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.GymProgressiveOverloadHintKt$GymProgressiveOverloadHint$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1265190765, i5, -1, "com.example.rungps.ui.gym.GymProgressiveOverloadHint.<anonymous> (GymProgressiveOverloadHint.kt:38)");
                            }
                            Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(12));
                            ProgressiveOverload.Hint hint2 = ProgressiveOverload.Hint.this;
                            ColorScheme colorScheme2 = colorScheme;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m684padding3ABfNKs);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3336constructorimpl = Updater.m3336constructorimpl(composer2);
                            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            TextKt.m2376Text4IGK_g(hint2.getHeadline(), (Modifier) null, colorScheme2.getOnSecondaryContainer(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelLarge(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                            TextKt.m2376Text4IGK_g(hint2.getDetail(), PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(4), 0.0f, 0.0f, 13, null), colorScheme2.getOnSecondaryContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 48, 0, 65528);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54);
                Modifier modifier5 = modifier3;
                SurfaceKt.m2226SurfaceT9BRK9s(fillMaxWidth$default, m967RoundedCornerShape0680j_4, m3842copywmQWz5c$default, 0L, 0.0f, 0.0f, null, rememberComposableLambda, startRestartGroup, 12582912, MenuKt.InTransitionDuration);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 != null) {
                final Modifier modifier6 = modifier2;
                endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymProgressiveOverloadHintKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit GymProgressiveOverloadHint$lambda$1;
                        GymProgressiveOverloadHint$lambda$1 = GymProgressiveOverloadHintKt.GymProgressiveOverloadHint$lambda$1(ExercisePr.this, gymSetEntity, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return GymProgressiveOverloadHint$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        hint = ProgressiveOverload.INSTANCE.hint(exercisePr, gymSetEntity);
        if (hint != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GymExerciseProgressiveOverloadHint(final String exerciseName, final Repository repo, Modifier modifier, Object obj, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object obj2;
        int i5;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object rememberedValue2;
        boolean changed;
        GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1 rememberedValue3;
        final Object obj3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Intrinsics.checkNotNullParameter(repo, "repo");
        Composer startRestartGroup = composer.startRestartGroup(-1397949113);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(exerciseName) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(repo) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                obj2 = obj;
                i3 |= startRestartGroup.changedInstance(obj2) ? 2048 : 1024;
                i5 = i3;
                if ((i5 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    Object obj4 = i4 != 0 ? null : obj2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1397949113, i5, -1, "com.example.rungps.ui.gym.GymExerciseProgressiveOverloadHint (GymProgressiveOverloadHint.kt:63)");
                    }
                    startRestartGroup.startReplaceGroup(-1028408380);
                    int i7 = i5 & 14;
                    z = i7 == 4;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1028405786);
                    z2 = i7 == 4;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1028402212);
                    changed = (i7 == 4) | startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(repo) | startRestartGroup.changed(mutableState2);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1(repo, exerciseName, mutableState, mutableState2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(exerciseName, obj4, (Function2) rememberedValue3, startRestartGroup, ((i5 >> 6) & SdkConfig.SDK_VERSION) | i7);
                    Object obj5 = obj4;
                    GymProgressiveOverloadHint(GymExerciseProgressiveOverloadHint$lambda$3(mutableState), GymExerciseProgressiveOverloadHint$lambda$6(mutableState2), modifier4, startRestartGroup, i5 & 896, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj3 = obj5;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    obj3 = obj2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymProgressiveOverloadHintKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            Unit GymExerciseProgressiveOverloadHint$lambda$9;
                            GymExerciseProgressiveOverloadHint$lambda$9 = GymProgressiveOverloadHintKt.GymExerciseProgressiveOverloadHint$lambda$9(exerciseName, repo, modifier3, obj3, i, i2, (Composer) obj6, ((Integer) obj7).intValue());
                            return GymExerciseProgressiveOverloadHint$lambda$9;
                        }
                    });
                    return;
                }
                return;
            }
            obj2 = obj;
            i5 = i3;
            if ((i5 & 1171) == 1170) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(-1028408380);
            int i72 = i5 & 14;
            if (i72 == 4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            MutableState mutableState3 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1028405786);
            if (i72 == 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            MutableState mutableState22 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1028402212);
            changed = (i72 == 4) | startRestartGroup.changed(mutableState3) | startRestartGroup.changedInstance(repo) | startRestartGroup.changed(mutableState22);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1(repo, exerciseName, mutableState3, mutableState22, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(exerciseName, obj4, (Function2) rememberedValue3, startRestartGroup, ((i5 >> 6) & SdkConfig.SDK_VERSION) | i72);
            Object obj52 = obj4;
            GymProgressiveOverloadHint(GymExerciseProgressiveOverloadHint$lambda$3(mutableState3), GymExerciseProgressiveOverloadHint$lambda$6(mutableState22), modifier4, startRestartGroup, i5 & 896, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            obj3 = obj52;
            modifier3 = modifier4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        obj2 = obj;
        i5 = i3;
        if ((i5 & 1171) == 1170) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(-1028408380);
        int i722 = i5 & 14;
        if (i722 == 4) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        MutableState mutableState32 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1028405786);
        if (i722 == 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        MutableState mutableState222 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1028402212);
        changed = (i722 == 4) | startRestartGroup.changed(mutableState32) | startRestartGroup.changedInstance(repo) | startRestartGroup.changed(mutableState222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new GymProgressiveOverloadHintKt$GymExerciseProgressiveOverloadHint$1$1(repo, exerciseName, mutableState32, mutableState222, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(exerciseName, obj4, (Function2) rememberedValue3, startRestartGroup, ((i5 >> 6) & SdkConfig.SDK_VERSION) | i722);
        Object obj522 = obj4;
        GymProgressiveOverloadHint(GymExerciseProgressiveOverloadHint$lambda$3(mutableState32), GymExerciseProgressiveOverloadHint$lambda$6(mutableState222), modifier4, startRestartGroup, i5 & 896, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        obj3 = obj522;
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final ExercisePr GymExerciseProgressiveOverloadHint$lambda$3(MutableState<ExercisePr> mutableState) {
        return mutableState.getValue();
    }

    private static final GymSetEntity GymExerciseProgressiveOverloadHint$lambda$6(MutableState<GymSetEntity> mutableState) {
        return mutableState.getValue();
    }
}
