package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.google.common.primitives.Ints;
import com.google.firebase.firestore.model.Values;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b7\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100J7\u00101\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u0015H\u0007¢\u0006\u0002\u00102J¦\u0002\u00103\u001a\u00020$2\u0006\u00104\u001a\u0002052\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020$07¢\u0006\u0002\b82\u0006\u0010%\u001a\u00020&2\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020;2\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010'\u001a\u00020&2\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010?\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010@\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010A\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\u0015\b\u0002\u0010B\u001a\u000f\u0012\u0004\u0012\u00020$\u0018\u000107¢\u0006\u0002\b82\b\b\u0002\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010C\u001a\u00020D2\u0013\b\u0002\u0010E\u001a\r\u0012\u0004\u0012\u00020$07¢\u0006\u0002\b8H\u0007¢\u0006\u0002\u0010FJ\r\u0010,\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010GJÂ\u0003\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010H\u001a\u00020I2\b\b\u0002\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020I2\b\b\u0002\u0010L\u001a\u00020I2\b\b\u0002\u0010M\u001a\u00020I2\b\b\u0002\u0010N\u001a\u00020I2\b\b\u0002\u0010O\u001a\u00020I2\b\b\u0002\u0010P\u001a\u00020I2\b\b\u0002\u0010Q\u001a\u00020I2\b\b\u0002\u0010R\u001a\u00020I2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\b\b\u0002\u0010U\u001a\u00020I2\b\b\u0002\u0010V\u001a\u00020I2\b\b\u0002\u0010W\u001a\u00020I2\b\b\u0002\u0010X\u001a\u00020I2\b\b\u0002\u0010Y\u001a\u00020I2\b\b\u0002\u0010Z\u001a\u00020I2\b\b\u0002\u0010[\u001a\u00020I2\b\b\u0002\u0010\\\u001a\u00020I2\b\b\u0002\u0010]\u001a\u00020I2\b\b\u0002\u0010^\u001a\u00020I2\b\b\u0002\u0010_\u001a\u00020I2\b\b\u0002\u0010`\u001a\u00020I2\b\b\u0002\u0010a\u001a\u00020I2\b\b\u0002\u0010b\u001a\u00020I2\b\b\u0002\u0010c\u001a\u00020I2\b\b\u0002\u0010d\u001a\u00020I2\b\b\u0002\u0010e\u001a\u00020I2\b\b\u0002\u0010f\u001a\u00020I2\b\b\u0002\u0010g\u001a\u00020I2\b\b\u0002\u0010h\u001a\u00020I2\b\b\u0002\u0010i\u001a\u00020I2\b\b\u0002\u0010j\u001a\u00020I2\b\b\u0002\u0010k\u001a\u00020I2\b\b\u0002\u0010l\u001a\u00020I2\b\b\u0002\u0010m\u001a\u00020I2\b\b\u0002\u0010n\u001a\u00020I2\b\b\u0002\u0010o\u001a\u00020I2\b\b\u0002\u0010p\u001a\u00020I2\b\b\u0002\u0010q\u001a\u00020I2\b\b\u0002\u0010r\u001a\u00020I2\b\b\u0002\u0010s\u001a\u00020I2\b\b\u0002\u0010t\u001a\u00020IH\u0007ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ8\u0010w\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b|\u0010}J8\u0010~\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010}J<\u0010\u0080\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0081\u0001\u0010}J<\u0010\u0082\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010}J<\u0010\u0084\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0085\u0001\u0010}J<\u0010\u0086\u0001\u001a\u00020D2\b\b\u0002\u0010x\u001a\u00020\u00042\b\b\u0002\u0010z\u001a\u00020\u00042\b\b\u0002\u0010y\u001a\u00020\u00042\b\b\u0002\u0010{\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0005\b\u0087\u0001\u0010}JM\u0010\u0088\u0001\u001a\u00020+*\u00020+2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001f2\b\b\u0002\u0010-\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\u001e\u001a\u00020\u001f*\u00020 8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008b\u0001"}, d2 = {"Landroidx/compose/material3/TextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM$annotations", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "FocusedIndicatorThickness", "getFocusedIndicatorThickness-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM$annotations", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedIndicatorThickness", "getUnfocusedIndicatorThickness-D9Ej5fM", "filledShape", "Landroidx/compose/ui/graphics/Shape;", "getFilledShape$annotations", "getFilledShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "outlinedShape", "getOutlinedShape$annotations", "getOutlinedShape", "shape", "getShape", "defaultTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", TextFieldImplKt.ContainerId, "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "DecorationBox", Values.VECTOR_MAP_VECTORS_KEY, "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "contentPaddingWithLabel", "start", "end", "top", "bottom", "contentPaddingWithLabel-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPaddingWithoutLabel", "contentPaddingWithoutLabel-a9UjIt4", "outlinedTextFieldPadding", "outlinedTextFieldPadding-a9UjIt4", "supportingTextPadding", "supportingTextPadding-a9UjIt4$material3_release", "textFieldWithLabelPadding", "textFieldWithLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "indicatorLine", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = Dp.m6303constructorimpl(56);
    private static final float MinWidth = Dp.m6303constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.shape", imports = {}))
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.FocusedIndicatorThickness` and `OutlinedTextFieldDefaults.FocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.FocusedIndicatorThickness", imports = {}))
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2349getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.shape`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.shape", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Split into `TextFieldDefaults.UnfocusedIndicatorThickness` and `OutlinedTextFieldDefaults.UnfocusedBorderThickness`. Please update as appropriate.", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.UnfocusedIndicatorThickness", imports = {}))
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2350getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    private TextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1941327459, "C60@2756L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)");
        }
        Shape value = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2362getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2363getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m2365getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m2361getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0197  */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2356Container4EFweAY(final boolean z, final boolean z2, final InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        float f5;
        float f6;
        Modifier modifier3;
        Composer composer2;
        final Shape shape3;
        final TextFieldColors textFieldColors3;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-818661242);
        ComposerKt.sourceInformation(startRestartGroup, "C(Container)P(1,4,3,5!1,6,2:c#ui.unit.Dp,7:c#ui.unit.Dp)105@4681L8,106@4732L5,110@4933L25,112@5006L198,116@5213L496:TextFieldDefaults.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    textFieldColors2 = textFieldColors;
                    if (startRestartGroup.changed(textFieldColors2)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    textFieldColors2 = textFieldColors;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                textFieldColors2 = textFieldColors;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i6 = 131072;
                        i3 |= i6;
                    }
                } else {
                    shape2 = shape;
                }
                i6 = 65536;
                i3 |= i6;
            } else {
                shape2 = shape;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    f3 = f;
                    if (startRestartGroup.changed(f3)) {
                        i5 = 1048576;
                        i3 |= i5;
                    }
                } else {
                    f3 = f;
                }
                i5 = 524288;
                i3 |= i5;
            } else {
                f3 = f;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    f4 = f2;
                    if (startRestartGroup.changed(f4)) {
                        i4 = 8388608;
                        i3 |= i4;
                    }
                } else {
                    f4 = f2;
                }
                i4 = 4194304;
                i3 |= i4;
            } else {
                f4 = f2;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        TextFieldColors colors = colors(startRestartGroup, (i3 >> 24) & 14);
                        i3 &= -57345;
                        textFieldColors2 = colors;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        shape2 = INSTANCE.getShape(startRestartGroup, 6);
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        f3 = FocusedIndicatorThickness;
                    }
                    if ((i2 & 128) == 0) {
                        i3 &= -29360129;
                        f6 = UnfocusedIndicatorThickness;
                        f5 = f3;
                    } else {
                        f5 = f3;
                        f6 = f4;
                    }
                    modifier3 = companion;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                    }
                    f5 = f3;
                    f6 = f4;
                    modifier3 = modifier2;
                }
                Shape shape4 = shape2;
                TextFieldColors textFieldColors4 = textFieldColors2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-818661242, i3, -1, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:109)");
                }
                final State<Color> m117animateColorAsStateeuL9pac = SingleValueAnimationKt.m117animateColorAsStateeuL9pac(textFieldColors4.m2293containerColorXeAY9LY$material3_release(z, z2, FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i3 >> 6) & 14).getValue().booleanValue()), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
                Modifier modifier5 = modifier3;
                composer2 = startRestartGroup;
                BoxKt.Box(m2366indicatorLinegv0btCI(TextFieldImplKt.textFieldBackground(modifier3, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(m117animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((State) this.receiver).getValue();
                    }
                }), shape4), z, z2, interactionSource, textFieldColors4, f5, f6), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape4;
                textFieldColors3 = textFieldColors4;
                modifier4 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                f5 = f3;
                composer2 = startRestartGroup;
                f6 = f4;
                textFieldColors3 = textFieldColors2;
                shape3 = shape2;
                modifier4 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final float f7 = f5;
                final float f8 = f6;
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$Container$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        TextFieldDefaults.this.m2356Container4EFweAY(z, z2, interactionSource, modifier4, textFieldColors3, shape3, f7, f8, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        modifier3 = companion;
        Shape shape42 = shape2;
        TextFieldColors textFieldColors42 = textFieldColors2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final Object m117animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m117animateColorAsStateeuL9pac(textFieldColors42.m2293containerColorXeAY9LY$material3_release(z, z2, FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, (i3 >> 6) & 14).getValue().booleanValue()), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
        Modifier modifier52 = modifier3;
        composer2 = startRestartGroup;
        BoxKt.Box(m2366indicatorLinegv0btCI(TextFieldImplKt.textFieldBackground(modifier3, new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(m117animateColorAsStateeuL9pac2) { // from class: androidx.compose.material3.TextFieldDefaults$Container$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((State) this.receiver).getValue();
            }
        }), shape42), z, z2, interactionSource, textFieldColors42, f5, f6), composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape3 = shape42;
        textFieldColors3 = textFieldColors42;
        modifier4 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Shape shape2;
        TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        Shape shape3;
        Function2<? super Composer, ? super Integer, Unit> function217;
        int i15;
        PaddingValues paddingValues3;
        final Shape shape4;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final PaddingValues paddingValues4;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final TextFieldColors textFieldColors3;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        final Function2<? super Composer, ? super Integer, Unit> function224;
        final Function2<? super Composer, ? super Integer, Unit> function225;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(289640444);
        ComposerKt.sourceInformation(startRestartGroup, "C(DecorationBox)P(16,4,3,12,17,5,6,7,9,8,15,10,13,14,11!1,2)256@13034L5,257@13075L8,264@13325L428,277@13770L707:TextFieldDefaults.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(z) ? 256 : 128;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    int i16 = 8192;
                    if ((i3 & 16) == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                        if ((i3 & 32) != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(interactionSource) ? 131072 : 65536;
                        }
                        i5 = i3 & 64;
                        if (i5 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                        }
                        i6 = i3 & 128;
                        if (i6 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i7 = i3 & 256;
                        if (i7 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i8 = i3 & 512;
                        if (i8 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(function24) ? 536870912 : 268435456;
                        }
                        i9 = i3 & 1024;
                        if (i9 != 0) {
                            i10 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i10 = i2 | (startRestartGroup.changedInstance(function25) ? 4 : 2);
                        } else {
                            i10 = i2;
                        }
                        i11 = i3 & 2048;
                        if (i11 != 0) {
                            i10 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i10 |= startRestartGroup.changedInstance(function26) ? 32 : 16;
                        }
                        int i17 = i10;
                        i12 = i3 & 4096;
                        if (i12 != 0) {
                            i17 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i17 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                            i13 = i3 & 8192;
                            if (i13 == 0) {
                                i17 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i17 |= startRestartGroup.changedInstance(function28) ? 2048 : 1024;
                                if ((i2 & 24576) == 0) {
                                    if ((i3 & 16384) == 0 && startRestartGroup.changed(shape)) {
                                        i16 = 16384;
                                    }
                                    i17 |= i16;
                                }
                                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i17 |= ((i3 & 32768) == 0 && startRestartGroup.changed(textFieldColors)) ? 131072 : 65536;
                                }
                                if ((i2 & 1572864) == 0) {
                                    i17 |= ((i3 & 65536) == 0 && startRestartGroup.changed(paddingValues)) ? 1048576 : 524288;
                                }
                                i14 = i3 & 131072;
                                if (i14 != 0) {
                                    i17 |= 12582912;
                                } else if ((i2 & 12582912) == 0) {
                                    i17 |= startRestartGroup.changedInstance(function29) ? 8388608 : 4194304;
                                }
                                if ((i3 & 262144) != 0) {
                                    i17 |= 100663296;
                                } else if ((i2 & 100663296) == 0) {
                                    i17 |= startRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                if ((i4 & 306783379) == 306783378 || (38347923 & i17) != 38347922 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        z4 = i5 != 0 ? false : z3;
                                        function210 = i6 != 0 ? null : function22;
                                        function211 = i7 != 0 ? null : function23;
                                        Function2<? super Composer, ? super Integer, Unit> function226 = i8 != 0 ? null : function24;
                                        Function2<? super Composer, ? super Integer, Unit> function227 = i9 != 0 ? null : function25;
                                        Function2<? super Composer, ? super Integer, Unit> function228 = i11 != 0 ? null : function26;
                                        function212 = i12 != 0 ? null : function27;
                                        Function2<? super Composer, ? super Integer, Unit> function229 = i13 == 0 ? function28 : null;
                                        if ((i3 & 16384) != 0) {
                                            shape2 = INSTANCE.getShape(startRestartGroup, 6);
                                            i17 &= -57345;
                                        } else {
                                            shape2 = shape;
                                        }
                                        if ((i3 & 32768) != 0) {
                                            textFieldColors2 = colors(startRestartGroup, (i17 >> 24) & 14);
                                            i17 &= -458753;
                                        } else {
                                            textFieldColors2 = textFieldColors;
                                        }
                                        if ((i3 & 65536) != 0) {
                                            if (function210 == null) {
                                                paddingValues2 = m2348contentPaddingWithoutLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            } else {
                                                paddingValues2 = m2347contentPaddingWithLabela9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                            }
                                            i17 &= -3670017;
                                        } else {
                                            paddingValues2 = paddingValues;
                                        }
                                        if (i14 != 0) {
                                            final boolean z6 = z4;
                                            final TextFieldColors textFieldColors4 = textFieldColors2;
                                            final Shape shape5 = shape2;
                                            Function2<? super Composer, ? super Integer, Unit> function230 = function226;
                                            function214 = function227;
                                            function215 = function228;
                                            function216 = ComposableLambdaKt.rememberComposableLambda(-435523791, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$DecorationBox$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                    invoke(composer2, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer2, int i18) {
                                                    ComposerKt.sourceInformation(composer2, "C265@13339L404:TextFieldDefaults.kt#uh7d8r");
                                                    if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-435523791, i18, -1, "androidx.compose.material3.TextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:265)");
                                                        }
                                                        TextFieldDefaults.INSTANCE.m2356Container4EFweAY(z, z6, interactionSource, Modifier.INSTANCE, textFieldColors4, shape5, TextFieldDefaults.INSTANCE.m2361getFocusedIndicatorThicknessD9Ej5fM(), TextFieldDefaults.INSTANCE.m2365getUnfocusedIndicatorThicknessD9Ej5fM(), composer2, 114822144, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer2.skipToGroupEnd();
                                                }
                                            }, startRestartGroup, 54);
                                            function217 = function229;
                                            function213 = function230;
                                            shape3 = shape2;
                                        } else {
                                            function213 = function226;
                                            function214 = function227;
                                            function215 = function228;
                                            function216 = function29;
                                            shape3 = shape2;
                                            function217 = function229;
                                        }
                                        i15 = i17;
                                        paddingValues3 = paddingValues2;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 16384) != 0) {
                                            i17 &= -57345;
                                        }
                                        if ((32768 & i3) != 0) {
                                            i17 &= -458753;
                                        }
                                        if ((i3 & 65536) != 0) {
                                            i17 &= -3670017;
                                        }
                                        z4 = z3;
                                        function210 = function22;
                                        function211 = function23;
                                        function213 = function24;
                                        function214 = function25;
                                        function215 = function26;
                                        function212 = function27;
                                        function217 = function28;
                                        shape3 = shape;
                                        textFieldColors2 = textFieldColors;
                                        function216 = function29;
                                        i15 = i17;
                                        paddingValues3 = paddingValues;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(289640444, i4, i15, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:276)");
                                    }
                                    int i18 = i4 << 3;
                                    int i19 = i4 >> 3;
                                    int i20 = i4 >> 9;
                                    int i21 = i15 << 21;
                                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation, function210, function211, function213, function214, function215, function212, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors2, function216, startRestartGroup, (i18 & 896) | (i18 & SdkConfig.SDK_VERSION) | 6 | (i19 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & SdkConfig.SDK_VERSION) | (i20 & 7168) | (57344 & i19) | ((i15 >> 3) & 458752) | (3670016 & (i15 << 3)) | (i15 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    shape4 = shape3;
                                    function218 = function215;
                                    function219 = function217;
                                    paddingValues4 = paddingValues3;
                                    function220 = function212;
                                    function221 = function210;
                                    z5 = z4;
                                    function222 = function211;
                                    textFieldColors3 = textFieldColors2;
                                    function223 = function216;
                                    function224 = function213;
                                    function225 = function214;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    z5 = z3;
                                    function221 = function22;
                                    function222 = function23;
                                    function224 = function24;
                                    function225 = function25;
                                    function218 = function26;
                                    function220 = function27;
                                    function219 = function28;
                                    shape4 = shape;
                                    textFieldColors3 = textFieldColors;
                                    paddingValues4 = paddingValues;
                                    function223 = function29;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$DecorationBox$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i22) {
                                            TextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z5, function221, function222, function224, function225, function218, function220, function219, shape4, textFieldColors3, paddingValues4, function223, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i2 & 24576) == 0) {
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if ((i2 & 1572864) == 0) {
                            }
                            i14 = i3 & 131072;
                            if (i14 != 0) {
                            }
                            if ((i3 & 262144) != 0) {
                            }
                            if ((i4 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            if (i13 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                            }
                            if ((i3 & 32768) != 0) {
                            }
                            if ((i3 & 65536) != 0) {
                            }
                            if (i14 != 0) {
                            }
                            i15 = i17;
                            paddingValues3 = paddingValues2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i182 = i4 << 3;
                            int i192 = i4 >> 3;
                            int i202 = i4 >> 9;
                            int i212 = i15 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation, function210, function211, function213, function214, function215, function212, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors2, function216, startRestartGroup, (i182 & 896) | (i182 & SdkConfig.SDK_VERSION) | 6 | (i192 & 7168) | (i202 & 57344) | (i202 & 458752) | (i202 & 3670016) | (i212 & 29360128) | (i212 & 234881024) | (i212 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & SdkConfig.SDK_VERSION) | (i202 & 7168) | (57344 & i192) | ((i15 >> 3) & 458752) | (3670016 & (i15 << 3)) | (i15 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            shape4 = shape3;
                            function218 = function215;
                            function219 = function217;
                            paddingValues4 = paddingValues3;
                            function220 = function212;
                            function221 = function210;
                            z5 = z4;
                            function222 = function211;
                            textFieldColors3 = textFieldColors2;
                            function223 = function216;
                            function224 = function213;
                            function225 = function214;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i13 = i3 & 8192;
                        if (i13 == 0) {
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if ((i2 & 1572864) == 0) {
                        }
                        i14 = i3 & 131072;
                        if (i14 != 0) {
                        }
                        if ((i3 & 262144) != 0) {
                        }
                        if ((i4 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i13 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                        }
                        if ((i3 & 32768) != 0) {
                        }
                        if ((i3 & 65536) != 0) {
                        }
                        if (i14 != 0) {
                        }
                        i15 = i17;
                        paddingValues3 = paddingValues2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i1822 = i4 << 3;
                        int i1922 = i4 >> 3;
                        int i2022 = i4 >> 9;
                        int i2122 = i15 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation, function210, function211, function213, function214, function215, function212, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors2, function216, startRestartGroup, (i1822 & 896) | (i1822 & SdkConfig.SDK_VERSION) | 6 | (i1922 & 7168) | (i2022 & 57344) | (i2022 & 458752) | (i2022 & 3670016) | (i2122 & 29360128) | (i2122 & 234881024) | (i2122 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & SdkConfig.SDK_VERSION) | (i2022 & 7168) | (57344 & i1922) | ((i15 >> 3) & 458752) | (3670016 & (i15 << 3)) | (i15 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        shape4 = shape3;
                        function218 = function215;
                        function219 = function217;
                        paddingValues4 = paddingValues3;
                        function220 = function212;
                        function221 = function210;
                        z5 = z4;
                        function222 = function211;
                        textFieldColors3 = textFieldColors2;
                        function223 = function216;
                        function224 = function213;
                        function225 = function214;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i3 & 32) != 0) {
                    }
                    i5 = i3 & 64;
                    if (i5 != 0) {
                    }
                    i6 = i3 & 128;
                    if (i6 != 0) {
                    }
                    i7 = i3 & 256;
                    if (i7 != 0) {
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 1024;
                    if (i9 != 0) {
                    }
                    i11 = i3 & 2048;
                    if (i11 != 0) {
                    }
                    int i172 = i10;
                    i12 = i3 & 4096;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 8192;
                    if (i13 == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    i14 = i3 & 131072;
                    if (i14 != 0) {
                    }
                    if ((i3 & 262144) != 0) {
                    }
                    if ((i4 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i13 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    if ((i3 & 32768) != 0) {
                    }
                    if ((i3 & 65536) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    i15 = i172;
                    paddingValues3 = paddingValues2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i18222 = i4 << 3;
                    int i19222 = i4 >> 3;
                    int i20222 = i4 >> 9;
                    int i21222 = i15 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation, function210, function211, function213, function214, function215, function212, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors2, function216, startRestartGroup, (i18222 & 896) | (i18222 & SdkConfig.SDK_VERSION) | 6 | (i19222 & 7168) | (i20222 & 57344) | (i20222 & 458752) | (i20222 & 3670016) | (i21222 & 29360128) | (i21222 & 234881024) | (i21222 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & SdkConfig.SDK_VERSION) | (i20222 & 7168) | (57344 & i19222) | ((i15 >> 3) & 458752) | (3670016 & (i15 << 3)) | (i15 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    shape4 = shape3;
                    function218 = function215;
                    function219 = function217;
                    paddingValues4 = paddingValues3;
                    function220 = function212;
                    function221 = function210;
                    z5 = z4;
                    function222 = function211;
                    textFieldColors3 = textFieldColors2;
                    function223 = function216;
                    function224 = function213;
                    function225 = function214;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                int i162 = 8192;
                if ((i3 & 16) == 0) {
                }
                if ((i3 & 32) != 0) {
                }
                i5 = i3 & 64;
                if (i5 != 0) {
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                }
                int i1722 = i10;
                i12 = i3 & 4096;
                if (i12 != 0) {
                }
                i13 = i3 & 8192;
                if (i13 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i14 = i3 & 131072;
                if (i14 != 0) {
                }
                if ((i3 & 262144) != 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 == 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if ((i3 & 32768) != 0) {
                }
                if ((i3 & 65536) != 0) {
                }
                if (i14 != 0) {
                }
                i15 = i1722;
                paddingValues3 = paddingValues2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i182222 = i4 << 3;
                int i192222 = i4 >> 3;
                int i202222 = i4 >> 9;
                int i212222 = i15 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation, function210, function211, function213, function214, function215, function212, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors2, function216, startRestartGroup, (i182222 & 896) | (i182222 & SdkConfig.SDK_VERSION) | 6 | (i192222 & 7168) | (i202222 & 57344) | (i202222 & 458752) | (i202222 & 3670016) | (i212222 & 29360128) | (i212222 & 234881024) | (i212222 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & SdkConfig.SDK_VERSION) | (i202222 & 7168) | (57344 & i192222) | ((i15 >> 3) & 458752) | (3670016 & (i15 << 3)) | (i15 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape4 = shape3;
                function218 = function215;
                function219 = function217;
                paddingValues4 = paddingValues3;
                function220 = function212;
                function221 = function210;
                z5 = z4;
                function222 = function211;
                textFieldColors3 = textFieldColors2;
                function223 = function216;
                function224 = function213;
                function225 = function214;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            int i1622 = 8192;
            if ((i3 & 16) == 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i5 = i3 & 64;
            if (i5 != 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
            }
            int i17222 = i10;
            i12 = i3 & 4096;
            if (i12 != 0) {
            }
            i13 = i3 & 8192;
            if (i13 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i14 = i3 & 131072;
            if (i14 != 0) {
            }
            if ((i3 & 262144) != 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i13 == 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if ((i3 & 32768) != 0) {
            }
            if ((i3 & 65536) != 0) {
            }
            if (i14 != 0) {
            }
            i15 = i17222;
            paddingValues3 = paddingValues2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i1822222 = i4 << 3;
            int i1922222 = i4 >> 3;
            int i2022222 = i4 >> 9;
            int i2122222 = i15 << 21;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation, function210, function211, function213, function214, function215, function212, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors2, function216, startRestartGroup, (i1822222 & 896) | (i1822222 & SdkConfig.SDK_VERSION) | 6 | (i1922222 & 7168) | (i2022222 & 57344) | (i2022222 & 458752) | (i2022222 & 3670016) | (i2122222 & 29360128) | (i2122222 & 234881024) | (i2122222 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & SdkConfig.SDK_VERSION) | (i2022222 & 7168) | (57344 & i1922222) | ((i15 >> 3) & 458752) | (3670016 & (i15 << 3)) | (i15 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape4 = shape3;
            function218 = function215;
            function219 = function217;
            paddingValues4 = paddingValues3;
            function220 = function212;
            function221 = function210;
            z5 = z4;
            function222 = function211;
            textFieldColors3 = textFieldColors2;
            function223 = function216;
            function224 = function213;
            function225 = function214;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        int i16222 = 8192;
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i5 = i3 & 64;
        if (i5 != 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        i11 = i3 & 2048;
        if (i11 != 0) {
        }
        int i172222 = i10;
        i12 = i3 & 4096;
        if (i12 != 0) {
        }
        i13 = i3 & 8192;
        if (i13 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i14 = i3 & 131072;
        if (i14 != 0) {
        }
        if ((i3 & 262144) != 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 == 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((i3 & 32768) != 0) {
        }
        if ((i3 & 65536) != 0) {
        }
        if (i14 != 0) {
        }
        i15 = i172222;
        paddingValues3 = paddingValues2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i18222222 = i4 << 3;
        int i19222222 = i4 >> 3;
        int i20222222 = i4 >> 9;
        int i21222222 = i15 << 21;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, str, function2, visualTransformation, function210, function211, function213, function214, function215, function212, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors2, function216, startRestartGroup, (i18222222 & 896) | (i18222222 & SdkConfig.SDK_VERSION) | 6 | (i19222222 & 7168) | (i20222222 & 57344) | (i20222222 & 458752) | (i20222222 & 3670016) | (i21222222 & 29360128) | (i21222222 & 234881024) | (i21222222 & 1879048192), (i4 & 896) | ((i15 >> 9) & 14) | ((i4 >> 6) & SdkConfig.SDK_VERSION) | (i20222222 & 7168) | (57344 & i19222222) | ((i15 >> 3) & 458752) | (3670016 & (i15 << 3)) | (i15 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape4 = shape3;
        function218 = function215;
        function219 = function217;
        paddingValues4 = paddingValues3;
        function220 = function212;
        function221 = function210;
        z5 = z4;
        function222 = function211;
        textFieldColors3 = textFieldColors2;
        function223 = function216;
        function224 = function213;
        function225 = function214;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2347contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2358contentPaddingWithLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2358contentPaddingWithLabela9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m680PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2348contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2359contentPaddingWithoutLabela9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2359contentPaddingWithoutLabela9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m680PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2353supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = Dp.m6303constructorimpl(0);
        }
        return textFieldDefaults.m2368supportingTextPaddinga9UjIt4$material3_release(f, f2, f3, f4);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m2368supportingTextPaddinga9UjIt4$material3_release(float start, float top, float end, float bottom) {
        return PaddingKt.m680PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 831731228, "C(colors)336@16080L11,336@16092L22:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)");
        }
        TextFieldColors defaultTextFieldColors = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & SdkConfig.SDK_VERSION);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColors;
    }

    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2357colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long j43;
        TextSelectionColors textSelectionColors2;
        ComposerKt.sourceInformationMarkerStart(composer, 1513344955, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,0:c#ui.graphics.Color,12:c#ui.graphics.Color,32,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,13:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)438@22922L11,438@22934L22:TextFieldDefaults.kt#uh7d8r");
        long m3879getUnspecified0d7_KjU = (i6 & 1) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j;
        long m3879getUnspecified0d7_KjU2 = (i6 & 2) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j2;
        long m3879getUnspecified0d7_KjU3 = (i6 & 4) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j3;
        long m3879getUnspecified0d7_KjU4 = (i6 & 8) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j4;
        long m3879getUnspecified0d7_KjU5 = (i6 & 16) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j5;
        long m3879getUnspecified0d7_KjU6 = (i6 & 32) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j6;
        long m3879getUnspecified0d7_KjU7 = (i6 & 64) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j7;
        long m3879getUnspecified0d7_KjU8 = (i6 & 128) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j8;
        long m3879getUnspecified0d7_KjU9 = (i6 & 256) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j9;
        long m3879getUnspecified0d7_KjU10 = (i6 & 512) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j10;
        TextSelectionColors textSelectionColors3 = (i6 & 1024) != 0 ? null : textSelectionColors;
        long m3879getUnspecified0d7_KjU11 = (i6 & 2048) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j11;
        long m3879getUnspecified0d7_KjU12 = (i6 & 4096) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j12;
        long m3879getUnspecified0d7_KjU13 = (i6 & 8192) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j13;
        long m3879getUnspecified0d7_KjU14 = (i6 & 16384) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j14;
        long m3879getUnspecified0d7_KjU15 = (32768 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j15;
        long m3879getUnspecified0d7_KjU16 = (65536 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j16;
        long m3879getUnspecified0d7_KjU17 = (131072 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j17;
        long m3879getUnspecified0d7_KjU18 = (262144 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j18;
        long m3879getUnspecified0d7_KjU19 = (524288 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j19;
        long m3879getUnspecified0d7_KjU20 = (1048576 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j20;
        long m3879getUnspecified0d7_KjU21 = (2097152 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j21;
        long m3879getUnspecified0d7_KjU22 = (4194304 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j22;
        long m3879getUnspecified0d7_KjU23 = (8388608 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j23;
        long m3879getUnspecified0d7_KjU24 = (16777216 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j24;
        long m3879getUnspecified0d7_KjU25 = (33554432 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j25;
        long m3879getUnspecified0d7_KjU26 = (67108864 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j26;
        long m3879getUnspecified0d7_KjU27 = (134217728 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j27;
        long m3879getUnspecified0d7_KjU28 = (268435456 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j28;
        long m3879getUnspecified0d7_KjU29 = (536870912 & i6) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j29;
        long m3879getUnspecified0d7_KjU30 = (i6 & Ints.MAX_POWER_OF_TWO) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j30;
        long m3879getUnspecified0d7_KjU31 = (i7 & 1) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j31;
        long m3879getUnspecified0d7_KjU32 = (i7 & 2) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j32;
        long m3879getUnspecified0d7_KjU33 = (i7 & 4) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j33;
        long m3879getUnspecified0d7_KjU34 = (i7 & 8) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j34;
        long m3879getUnspecified0d7_KjU35 = (i7 & 16) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j35;
        long m3879getUnspecified0d7_KjU36 = (i7 & 32) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j36;
        long m3879getUnspecified0d7_KjU37 = (i7 & 64) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j37;
        long m3879getUnspecified0d7_KjU38 = (i7 & 128) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j38;
        long m3879getUnspecified0d7_KjU39 = (i7 & 256) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j39;
        long m3879getUnspecified0d7_KjU40 = (i7 & 512) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j40;
        long m3879getUnspecified0d7_KjU41 = (i7 & 1024) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j41;
        long m3879getUnspecified0d7_KjU42 = (i7 & 2048) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j42;
        if (ComposerKt.isTraceInProgress()) {
            j43 = m3879getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
            ComposerKt.traceEventStart(1513344955, i, i2, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:438)");
        } else {
            j43 = m3879getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
        }
        TextFieldColors m2294copyejIjP34 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 6) & SdkConfig.SDK_VERSION).m2294copyejIjP34(m3879getUnspecified0d7_KjU, m3879getUnspecified0d7_KjU2, m3879getUnspecified0d7_KjU3, m3879getUnspecified0d7_KjU4, m3879getUnspecified0d7_KjU5, m3879getUnspecified0d7_KjU6, m3879getUnspecified0d7_KjU7, m3879getUnspecified0d7_KjU8, m3879getUnspecified0d7_KjU9, m3879getUnspecified0d7_KjU10, textSelectionColors2, m3879getUnspecified0d7_KjU11, m3879getUnspecified0d7_KjU12, m3879getUnspecified0d7_KjU13, m3879getUnspecified0d7_KjU14, m3879getUnspecified0d7_KjU15, m3879getUnspecified0d7_KjU16, m3879getUnspecified0d7_KjU17, m3879getUnspecified0d7_KjU18, m3879getUnspecified0d7_KjU19, m3879getUnspecified0d7_KjU20, m3879getUnspecified0d7_KjU21, m3879getUnspecified0d7_KjU22, m3879getUnspecified0d7_KjU23, m3879getUnspecified0d7_KjU24, m3879getUnspecified0d7_KjU25, m3879getUnspecified0d7_KjU26, m3879getUnspecified0d7_KjU27, m3879getUnspecified0d7_KjU28, m3879getUnspecified0d7_KjU29, m3879getUnspecified0d7_KjU30, m3879getUnspecified0d7_KjU31, m3879getUnspecified0d7_KjU32, m3879getUnspecified0d7_KjU33, m3879getUnspecified0d7_KjU34, m3879getUnspecified0d7_KjU35, m3879getUnspecified0d7_KjU36, m3879getUnspecified0d7_KjU37, m3879getUnspecified0d7_KjU38, m3879getUnspecified0d7_KjU39, m3879getUnspecified0d7_KjU40, m3879getUnspecified0d7_KjU41, j43);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2294copyejIjP34;
    }

    public final TextFieldColors getDefaultTextFieldColors(ColorScheme colorScheme, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1341970309, "C:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1341970309, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)");
        }
        TextFieldColors defaultTextFieldColorsCached = colorScheme.getDefaultTextFieldColorsCached();
        composer.startReplaceGroup(27085453);
        ComposerKt.sourceInformation(composer, "*501@26788L7");
        if (defaultTextFieldColorsCached == null) {
            long fromToken = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusInputColor());
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputColor());
            long m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            long fromToken3 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorInputColor());
            long fromToken4 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long fromToken5 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long fromToken6 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long fromToken7 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getContainerColor());
            long fromToken8 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getCaretColor());
            long fromToken9 = ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorFocusCaretColor());
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            defaultTextFieldColorsCached = new TextFieldColors(fromToken, fromToken2, m3842copywmQWz5c$default, fromToken3, fromToken4, fromToken5, fromToken6, fromToken7, fromToken8, fromToken9, (TextSelectionColors) consume, ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getActiveIndicatorColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorColor()), FilledTextFieldTokens.INSTANCE.getDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getLabelColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledLabelColor()), FilledTextFieldTokens.INSTANCE.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledInputColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getSupportingColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getDisabledSupportingColor()), FilledTextFieldTokens.INSTANCE.getDisabledSupportingOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme.setDefaultTextFieldColorsCached$material3_release(defaultTextFieldColorsCached);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultTextFieldColorsCached;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if ((r29 & 16) != 0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0051  */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to TextFieldDefaults.Container", replaceWith = @ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ContainerBox(final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, Shape shape, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(918564008);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContainerBox)P(1,3,2)590@32311L5,592@32334L368:TextFieldDefaults.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(interactionSource) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(textFieldColors) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i4 = 16384;
                                i3 |= i4;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i4 = 8192;
                        i3 |= i4;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(this) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if ((i2 & 16) != 0) {
                                shape2 = INSTANCE.getShape(startRestartGroup, 6);
                                i3 &= -57345;
                            }
                            Shape shape3 = shape2;
                            int i5 = i3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(918564008, i5, -1, "androidx.compose.material3.TextFieldDefaults.ContainerBox (TextFieldDefaults.kt:592)");
                            }
                            int i6 = i5 << 3;
                            m2356Container4EFweAY(z, z2, interactionSource, Modifier.INSTANCE, textFieldColors, shape3, FocusedIndicatorThickness, UnfocusedIndicatorThickness, startRestartGroup, (i5 & 14) | 3072 | (i5 & SdkConfig.SDK_VERSION) | (i5 & 896) | (57344 & i6) | (i6 & 458752) | ((i5 << 9) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape2 = shape3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Shape shape4 = shape2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$ContainerBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                TextFieldDefaults.this.ContainerBox(z, z2, interactionSource, textFieldColors, shape4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i & 24576) != 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                Shape shape32 = shape2;
                int i52 = i3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i62 = i52 << 3;
                m2356Container4EFweAY(z, z2, interactionSource, Modifier.INSTANCE, textFieldColors, shape32, FocusedIndicatorThickness, UnfocusedIndicatorThickness, startRestartGroup, (i52 & 14) | 3072 | (i52 & SdkConfig.SDK_VERSION) | (i52 & 896) | (57344 & i62) | (i62 & 458752) | ((i52 << 9) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                shape2 = shape32;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i & 24576) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            Shape shape322 = shape2;
            int i522 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i622 = i522 << 3;
            m2356Container4EFweAY(z, z2, interactionSource, Modifier.INSTANCE, textFieldColors, shape322, FocusedIndicatorThickness, UnfocusedIndicatorThickness, startRestartGroup, (i522 & 14) | 3072 | (i522 & SdkConfig.SDK_VERSION) | (i522 & 896) | (57344 & i622) | (i622 & 458752) | ((i522 << 9) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            shape2 = shape322;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        Shape shape3222 = shape2;
        int i5222 = i3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i6222 = i5222 << 3;
        m2356Container4EFweAY(z, z2, interactionSource, Modifier.INSTANCE, textFieldColors, shape3222, FocusedIndicatorThickness, UnfocusedIndicatorThickness, startRestartGroup, (i5222 & 14) | 3072 | (i5222 & SdkConfig.SDK_VERSION) | (i5222 & 896) | (57344 & i6222) | (i6222 & 458752) | ((i5222 << 9) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        shape2 = shape3222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public final Shape getOutlinedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -584749279, "C613@33100L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:613)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return shape;
    }

    public final Shape getFilledShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 611926497, "C621@33346L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:621)");
        }
        Shape shape = getShape(composer, i & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return shape;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2364getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2360getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2354textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m2369textFieldWithLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2369textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return m2358contentPaddingWithLabela9UjIt4(start, end, top, bottom);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2355textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2370textFieldWithoutLabelPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `TextFieldDefaults.contentPaddingWithoutLabel`", replaceWith = @ReplaceWith(expression = "TextFieldDefaults.contentPaddingWithoutLabel(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {}))
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2370textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return m2359contentPaddingWithoutLabela9UjIt4(start, top, end, bottom);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2352outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m2367outlinedTextFieldPaddinga9UjIt4(f, f2, f3, f4);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to `OutlinedTextFieldDefaults.contentPadding`", replaceWith = @ReplaceWith(expression = "OutlinedTextFieldDefaults.contentPadding(\n        start = start,\n        top = top,\n        end = end,\n        bottom = bottom,\n    )", imports = {"androidx.compose.material.OutlinedTextFieldDefaults"}))
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2367outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return OutlinedTextFieldDefaults.INSTANCE.m2027contentPaddinga9UjIt4(start, top, end, bottom);
    }

    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m2366indicatorLinegv0btCI(Modifier modifier, final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f, final float f2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", Dp.m6301boximpl(f));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", Dp.m6301boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceGroup(-891038934);
                ComposerKt.sourceInformation(composer, "C169@7666L25,171@7739L263:TextFieldDefaults.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891038934, i, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:169)");
                }
                Modifier drawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, TextFieldImplKt.m2665animateBorderStrokeAsStateNuRrP5Q(z, z2, FocusInteractionKt.collectIsFocusedAsState(InteractionSource.this, composer, 0).getValue().booleanValue(), textFieldColors, f, f2, composer, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return drawIndicatorLine;
            }
        });
    }

    static {
        float m6303constructorimpl = Dp.m6303constructorimpl(1);
        UnfocusedIndicatorThickness = m6303constructorimpl;
        float m6303constructorimpl2 = Dp.m6303constructorimpl(2);
        FocusedIndicatorThickness = m6303constructorimpl2;
        UnfocusedBorderThickness = m6303constructorimpl;
        FocusedBorderThickness = m6303constructorimpl2;
    }
}
