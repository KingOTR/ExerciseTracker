package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.PropertyReference0Impl;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: TextFieldDefaults.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b)\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$JR\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u009c\u0002\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020\u00180,¢\u0006\u0002\b-2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u0002002\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u0010 \u001a\u00020\u00132\b\b\u0002\u00108\u001a\u0002092\u0013\b\u0002\u0010:\u001a\r\u0012\u0004\u0012\u00020\u00180,¢\u0006\u0002\b-H\u0007¢\u0006\u0002\u0010;J\r\u0010 \u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010<JÂ\u0003\u0010 \u001a\u00020\u00132\b\b\u0002\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020>2\b\b\u0002\u0010A\u001a\u00020>2\b\b\u0002\u0010B\u001a\u00020>2\b\b\u0002\u0010C\u001a\u00020>2\b\b\u0002\u0010D\u001a\u00020>2\b\b\u0002\u0010E\u001a\u00020>2\b\b\u0002\u0010F\u001a\u00020>2\b\b\u0002\u0010G\u001a\u00020>2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010I2\b\b\u0002\u0010J\u001a\u00020>2\b\b\u0002\u0010K\u001a\u00020>2\b\b\u0002\u0010L\u001a\u00020>2\b\b\u0002\u0010M\u001a\u00020>2\b\b\u0002\u0010N\u001a\u00020>2\b\b\u0002\u0010O\u001a\u00020>2\b\b\u0002\u0010P\u001a\u00020>2\b\b\u0002\u0010Q\u001a\u00020>2\b\b\u0002\u0010R\u001a\u00020>2\b\b\u0002\u0010S\u001a\u00020>2\b\b\u0002\u0010T\u001a\u00020>2\b\b\u0002\u0010U\u001a\u00020>2\b\b\u0002\u0010V\u001a\u00020>2\b\b\u0002\u0010W\u001a\u00020>2\b\b\u0002\u0010X\u001a\u00020>2\b\b\u0002\u0010Y\u001a\u00020>2\b\b\u0002\u0010Z\u001a\u00020>2\b\b\u0002\u0010[\u001a\u00020>2\b\b\u0002\u0010\\\u001a\u00020>2\b\b\u0002\u0010]\u001a\u00020>2\b\b\u0002\u0010^\u001a\u00020>2\b\b\u0002\u0010_\u001a\u00020>2\b\b\u0002\u0010`\u001a\u00020>2\b\b\u0002\u0010a\u001a\u00020>2\b\b\u0002\u0010b\u001a\u00020>2\b\b\u0002\u0010c\u001a\u00020>2\b\b\u0002\u0010d\u001a\u00020>2\b\b\u0002\u0010e\u001a\u00020>2\b\b\u0002\u0010f\u001a\u00020>2\b\b\u0002\u0010g\u001a\u00020>2\b\b\u0002\u0010h\u001a\u00020>2\b\b\u0002\u0010i\u001a\u00020>H\u0007ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ8\u00108\u001a\u0002092\b\b\u0002\u0010l\u001a\u00020\u00042\b\b\u0002\u0010m\u001a\u00020\u00042\b\b\u0002\u0010n\u001a\u00020\u00042\b\b\u0002\u0010o\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\bp\u0010qR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultOutlinedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultOutlinedTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", TextFieldImplKt.ContainerId, "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "focusedBorderThickness", "unfocusedBorderThickness", "Container-4EFweAY", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "DecorationBox", Values.VECTOR_MAP_VECTORS_KEY, "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "start", "top", "end", "bottom", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = Dp.m6303constructorimpl(56);
    private static final float MinWidth = Dp.m6303constructorimpl(280);
    private static final float UnfocusedBorderThickness = Dp.m6303constructorimpl(1);
    private static final float FocusedBorderThickness = Dp.m6303constructorimpl(2);

    private OutlinedTextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1066756961, "C729@37132L5:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)");
        }
        Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2029getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2030getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2031getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2028getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f3  */
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2024Container4EFweAY(final boolean z, final boolean z2, final InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        float f5;
        Modifier modifier3;
        TextFieldColors textFieldColors3;
        float f6;
        final Modifier modifier4;
        final Shape shape3;
        final TextFieldColors textFieldColors4;
        final float f7;
        final float f8;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1035477640);
        ComposerKt.sourceInformation(startRestartGroup, "C(Container)P(1,4,3,5!1,6,2:c#ui.unit.Dp,7:c#ui.unit.Dp)772@39024L8,773@39083L5,777@39264L25,779@39335L222,788@39599L198,792@39806L153:TextFieldDefaults.kt#uh7d8r");
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
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
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
                        f3 = FocusedBorderThickness;
                    }
                    if ((i2 & 128) != 0) {
                        i3 &= -29360129;
                        f5 = UnfocusedBorderThickness;
                        modifier3 = modifier2;
                        textFieldColors3 = textFieldColors2;
                        f6 = f3;
                        Shape shape4 = shape2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1035477640, i3, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.Container (TextFieldDefaults.kt:776)");
                        }
                        int i9 = i3 >> 6;
                        boolean booleanValue = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, i9 & 14).getValue().booleanValue();
                        TextFieldColors textFieldColors5 = textFieldColors3;
                        State<BorderStroke> m2665animateBorderStrokeAsStateNuRrP5Q = TextFieldImplKt.m2665animateBorderStrokeAsStateNuRrP5Q(z, z2, booleanValue, textFieldColors3, f6, f5, startRestartGroup, ((i3 >> 3) & 7168) | (i3 & WebSocketProtocol.PAYLOAD_SHORT) | (57344 & i9) | (i9 & 458752));
                        final State<Color> m117animateColorAsStateeuL9pac = SingleValueAnimationKt.m117animateColorAsStateeuL9pac(textFieldColors5.m2293containerColorXeAY9LY$material3_release(z, z2, booleanValue), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
                        BoxKt.Box(TextFieldImplKt.textFieldBackground(BorderKt.border(modifier3, m2665animateBorderStrokeAsStateNuRrP5Q.getValue(), shape4), new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(m117animateColorAsStateeuL9pac) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                            public Object get() {
                                return ((State) this.receiver).getValue();
                            }
                        }), shape4), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        shape3 = shape4;
                        textFieldColors4 = textFieldColors5;
                        f7 = f6;
                        f8 = f5;
                    }
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
                }
                modifier3 = modifier2;
                f6 = f3;
                f5 = f4;
                textFieldColors3 = textFieldColors2;
                Shape shape42 = shape2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i92 = i3 >> 6;
                boolean booleanValue2 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, i92 & 14).getValue().booleanValue();
                TextFieldColors textFieldColors52 = textFieldColors3;
                State<BorderStroke> m2665animateBorderStrokeAsStateNuRrP5Q2 = TextFieldImplKt.m2665animateBorderStrokeAsStateNuRrP5Q(z, z2, booleanValue2, textFieldColors3, f6, f5, startRestartGroup, ((i3 >> 3) & 7168) | (i3 & WebSocketProtocol.PAYLOAD_SHORT) | (57344 & i92) | (i92 & 458752));
                final Object m117animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m117animateColorAsStateeuL9pac(textFieldColors52.m2293containerColorXeAY9LY$material3_release(z, z2, booleanValue2), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
                BoxKt.Box(TextFieldImplKt.textFieldBackground(BorderKt.border(modifier3, m2665animateBorderStrokeAsStateNuRrP5Q2.getValue(), shape42), new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(m117animateColorAsStateeuL9pac2) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                    public Object get() {
                        return ((State) this.receiver).getValue();
                    }
                }), shape42), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                shape3 = shape42;
                textFieldColors4 = textFieldColors52;
                f7 = f6;
                f8 = f5;
            } else {
                startRestartGroup.skipToGroupEnd();
                f8 = f4;
                f7 = f3;
                shape3 = shape2;
                textFieldColors4 = textFieldColors2;
                modifier4 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        OutlinedTextFieldDefaults.this.m2024Container4EFweAY(z, z2, interactionSource, modifier4, textFieldColors4, shape3, f7, f8, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
        if (i8 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        modifier3 = modifier2;
        f6 = f3;
        f5 = f4;
        textFieldColors3 = textFieldColors2;
        Shape shape422 = shape2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i922 = i3 >> 6;
        boolean booleanValue22 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, startRestartGroup, i922 & 14).getValue().booleanValue();
        TextFieldColors textFieldColors522 = textFieldColors3;
        State<BorderStroke> m2665animateBorderStrokeAsStateNuRrP5Q22 = TextFieldImplKt.m2665animateBorderStrokeAsStateNuRrP5Q(z, z2, booleanValue22, textFieldColors3, f6, f5, startRestartGroup, ((i3 >> 3) & 7168) | (i3 & WebSocketProtocol.PAYLOAD_SHORT) | (57344 & i922) | (i922 & 458752));
        final Object m117animateColorAsStateeuL9pac22 = SingleValueAnimationKt.m117animateColorAsStateeuL9pac(textFieldColors522.m2293containerColorXeAY9LY$material3_release(z, z2, booleanValue22), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, startRestartGroup, 48, 12);
        BoxKt.Box(TextFieldImplKt.textFieldBackground(BorderKt.border(modifier3, m2665animateBorderStrokeAsStateNuRrP5Q22.getValue(), shape422), new TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0(new PropertyReference0Impl(m117animateColorAsStateeuL9pac22) { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$Container$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((State) this.receiver).getValue();
            }
        }), shape422), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        shape3 = shape422;
        textFieldColors4 = textFieldColors522;
        f7 = f6;
        f8 = f5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, final int i, final int i2, final int i3) {
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
        final boolean z4;
        final TextFieldColors textFieldColors2;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Function2<? super Composer, ? super Integer, Unit> function211;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Function2<? super Composer, ? super Integer, Unit> function213;
        Function2<? super Composer, ? super Integer, Unit> function214;
        Function2<? super Composer, ? super Integer, Unit> function215;
        Function2<? super Composer, ? super Integer, Unit> function216;
        TextFieldColors textFieldColors3;
        Function2<? super Composer, ? super Integer, Unit> function217;
        PaddingValues paddingValues3;
        Composer composer2;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        final Function2<? super Composer, ? super Integer, Unit> function224;
        final TextFieldColors textFieldColors4;
        final PaddingValues paddingValues4;
        final Function2<? super Composer, ? super Integer, Unit> function225;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-350442135);
        ComposerKt.sourceInformation(startRestartGroup, "C(DecorationBox)P(15,4,3,11,16,5,6,7,9,8,14,10,12,13!1,2)870@44562L8,872@44674L408,885@45099L709:TextFieldDefaults.kt#uh7d8r");
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
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 2048 : 1024;
            int i15 = 8192;
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
                int i16 = i10;
                i12 = i3 & 4096;
                if (i12 != 0) {
                    i16 |= 384;
                } else if ((i2 & 384) == 0) {
                    i16 |= startRestartGroup.changedInstance(function27) ? 256 : 128;
                    i13 = i3 & 8192;
                    if (i13 == 0) {
                        i16 |= 3072;
                    } else if ((i2 & 3072) == 0) {
                        i16 |= startRestartGroup.changedInstance(function28) ? 2048 : 1024;
                        if ((i2 & 24576) == 0) {
                            if ((i3 & 16384) == 0 && startRestartGroup.changed(textFieldColors)) {
                                i15 = 16384;
                            }
                            i16 |= i15;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i16 |= ((i3 & 32768) == 0 && startRestartGroup.changed(paddingValues)) ? 131072 : 65536;
                        }
                        i14 = i3 & 65536;
                        if (i14 != 0) {
                            i16 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i16 |= startRestartGroup.changedInstance(function29) ? 1048576 : 524288;
                        }
                        if ((i3 & 131072) != 0) {
                            i16 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i16 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
                        }
                        if ((i4 & 306783379) == 306783378 || (4793491 & i16) != 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                z4 = i5 != 0 ? false : z3;
                                Function2<? super Composer, ? super Integer, Unit> function226 = i6 != 0 ? null : function22;
                                Function2<? super Composer, ? super Integer, Unit> function227 = i7 != 0 ? null : function23;
                                Function2<? super Composer, ? super Integer, Unit> function228 = i8 != 0 ? null : function24;
                                Function2<? super Composer, ? super Integer, Unit> function229 = i9 != 0 ? null : function25;
                                Function2<? super Composer, ? super Integer, Unit> function230 = i11 != 0 ? null : function26;
                                Function2<? super Composer, ? super Integer, Unit> function231 = i12 != 0 ? null : function27;
                                Function2<? super Composer, ? super Integer, Unit> function232 = i13 == 0 ? function28 : null;
                                if ((i3 & 16384) != 0) {
                                    textFieldColors2 = colors(startRestartGroup, (i16 >> 21) & 14);
                                    i16 &= -57345;
                                } else {
                                    textFieldColors2 = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValues2 = m2023contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i16 &= -458753;
                                } else {
                                    paddingValues2 = paddingValues;
                                }
                                if (i14 != 0) {
                                    function210 = function228;
                                    function211 = function229;
                                    function212 = ComposableLambdaKt.rememberComposableLambda(-1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i17) {
                                            ComposerKt.sourceInformation(composer3, "C879@44918L5,873@44688L384:TextFieldDefaults.kt#uh7d8r");
                                            if ((i17 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i17, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:873)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2024Container4EFweAY(z, z4, interactionSource, Modifier.INSTANCE, textFieldColors2, OutlinedTextFieldDefaults.INSTANCE.getShape(composer3, 6), OutlinedTextFieldDefaults.INSTANCE.m2028getFocusedBorderThicknessD9Ej5fM(), OutlinedTextFieldDefaults.INSTANCE.m2031getUnfocusedBorderThicknessD9Ej5fM(), composer3, 114822144, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, startRestartGroup, 54);
                                    function213 = function230;
                                    function214 = function226;
                                    function215 = function227;
                                    function216 = function231;
                                    textFieldColors3 = textFieldColors2;
                                    function217 = function232;
                                    z4 = z4;
                                } else {
                                    function210 = function228;
                                    function211 = function229;
                                    function212 = function29;
                                    function213 = function230;
                                    function214 = function226;
                                    function215 = function227;
                                    function216 = function231;
                                    textFieldColors3 = textFieldColors2;
                                    function217 = function232;
                                }
                                paddingValues3 = paddingValues2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 16384) != 0) {
                                    i16 &= -57345;
                                }
                                if ((32768 & i3) != 0) {
                                    i16 &= -458753;
                                }
                                z4 = z3;
                                function214 = function22;
                                function215 = function23;
                                function210 = function24;
                                function211 = function25;
                                function213 = function26;
                                function216 = function27;
                                function217 = function28;
                                textFieldColors3 = textFieldColors;
                                paddingValues3 = paddingValues;
                                function212 = function29;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i16, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:884)");
                            }
                            int i17 = i4;
                            int i18 = i17 << 3;
                            int i19 = i17 >> 3;
                            int i20 = i17 >> 9;
                            int i21 = i16 << 21;
                            composer2 = startRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function214, function215, function210, function211, function213, function216, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function212, composer2, (i18 & 896) | (i18 & SdkConfig.SDK_VERSION) | 6 | (i19 & 7168) | (57344 & i20) | (458752 & i20) | (3670016 & i20) | (29360128 & i21) | (234881024 & i21) | (i21 & 1879048192), ((i16 >> 9) & 14) | ((i17 >> 6) & SdkConfig.SDK_VERSION) | (i17 & 896) | (i20 & 7168) | (57344 & i19) | (458752 & i16) | ((i16 << 6) & 3670016) | ((i16 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z4;
                            function218 = function214;
                            function219 = function215;
                            function220 = function210;
                            function221 = function211;
                            function222 = function213;
                            function223 = function216;
                            function224 = function217;
                            textFieldColors4 = textFieldColors3;
                            paddingValues4 = paddingValues3;
                            function225 = function212;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z5 = z3;
                            function218 = function22;
                            function219 = function23;
                            function221 = function25;
                            function222 = function26;
                            function223 = function27;
                            function224 = function28;
                            textFieldColors4 = textFieldColors;
                            paddingValues4 = paddingValues;
                            function225 = function29;
                            composer2 = startRestartGroup;
                            function220 = function24;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i22) {
                                    OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z5, function218, function219, function220, function221, function222, function223, function224, textFieldColors4, paddingValues4, function225, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
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
                    i14 = i3 & 65536;
                    if (i14 != 0) {
                    }
                    if ((i3 & 131072) != 0) {
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
                    if (i14 != 0) {
                    }
                    paddingValues3 = paddingValues2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i172 = i4;
                    int i182 = i172 << 3;
                    int i192 = i172 >> 3;
                    int i202 = i172 >> 9;
                    int i212 = i16 << 21;
                    composer2 = startRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function214, function215, function210, function211, function213, function216, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function212, composer2, (i182 & 896) | (i182 & SdkConfig.SDK_VERSION) | 6 | (i192 & 7168) | (57344 & i202) | (458752 & i202) | (3670016 & i202) | (29360128 & i212) | (234881024 & i212) | (i212 & 1879048192), ((i16 >> 9) & 14) | ((i172 >> 6) & SdkConfig.SDK_VERSION) | (i172 & 896) | (i202 & 7168) | (57344 & i192) | (458752 & i16) | ((i16 << 6) & 3670016) | ((i16 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z4;
                    function218 = function214;
                    function219 = function215;
                    function220 = function210;
                    function221 = function211;
                    function222 = function213;
                    function223 = function216;
                    function224 = function217;
                    textFieldColors4 = textFieldColors3;
                    paddingValues4 = paddingValues3;
                    function225 = function212;
                    endRestartGroup = composer2.endRestartGroup();
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
                i14 = i3 & 65536;
                if (i14 != 0) {
                }
                if ((i3 & 131072) != 0) {
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
                if (i14 != 0) {
                }
                paddingValues3 = paddingValues2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i1722 = i4;
                int i1822 = i1722 << 3;
                int i1922 = i1722 >> 3;
                int i2022 = i1722 >> 9;
                int i2122 = i16 << 21;
                composer2 = startRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function214, function215, function210, function211, function213, function216, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function212, composer2, (i1822 & 896) | (i1822 & SdkConfig.SDK_VERSION) | 6 | (i1922 & 7168) | (57344 & i2022) | (458752 & i2022) | (3670016 & i2022) | (29360128 & i2122) | (234881024 & i2122) | (i2122 & 1879048192), ((i16 >> 9) & 14) | ((i1722 >> 6) & SdkConfig.SDK_VERSION) | (i1722 & 896) | (i2022 & 7168) | (57344 & i1922) | (458752 & i16) | ((i16 << 6) & 3670016) | ((i16 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z4;
                function218 = function214;
                function219 = function215;
                function220 = function210;
                function221 = function211;
                function222 = function213;
                function223 = function216;
                function224 = function217;
                textFieldColors4 = textFieldColors3;
                paddingValues4 = paddingValues3;
                function225 = function212;
                endRestartGroup = composer2.endRestartGroup();
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
            int i162 = i10;
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
            i14 = i3 & 65536;
            if (i14 != 0) {
            }
            if ((i3 & 131072) != 0) {
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
            if (i14 != 0) {
            }
            paddingValues3 = paddingValues2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i17222 = i4;
            int i18222 = i17222 << 3;
            int i19222 = i17222 >> 3;
            int i20222 = i17222 >> 9;
            int i21222 = i162 << 21;
            composer2 = startRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function214, function215, function210, function211, function213, function216, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function212, composer2, (i18222 & 896) | (i18222 & SdkConfig.SDK_VERSION) | 6 | (i19222 & 7168) | (57344 & i20222) | (458752 & i20222) | (3670016 & i20222) | (29360128 & i21222) | (234881024 & i21222) | (i21222 & 1879048192), ((i162 >> 9) & 14) | ((i17222 >> 6) & SdkConfig.SDK_VERSION) | (i17222 & 896) | (i20222 & 7168) | (57344 & i19222) | (458752 & i162) | ((i162 << 6) & 3670016) | ((i162 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z4;
            function218 = function214;
            function219 = function215;
            function220 = function210;
            function221 = function211;
            function222 = function213;
            function223 = function216;
            function224 = function217;
            textFieldColors4 = textFieldColors3;
            paddingValues4 = paddingValues3;
            function225 = function212;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        int i152 = 8192;
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
        int i1622 = i10;
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
        i14 = i3 & 65536;
        if (i14 != 0) {
        }
        if ((i3 & 131072) != 0) {
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
        if (i14 != 0) {
        }
        paddingValues3 = paddingValues2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i172222 = i4;
        int i182222 = i172222 << 3;
        int i192222 = i172222 >> 3;
        int i202222 = i172222 >> 9;
        int i212222 = i1622 << 21;
        composer2 = startRestartGroup;
        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function214, function215, function210, function211, function213, function216, function217, z2, z, z4, interactionSource, paddingValues3, textFieldColors3, function212, composer2, (i182222 & 896) | (i182222 & SdkConfig.SDK_VERSION) | 6 | (i192222 & 7168) | (57344 & i202222) | (458752 & i202222) | (3670016 & i202222) | (29360128 & i212222) | (234881024 & i212222) | (i212222 & 1879048192), ((i1622 >> 9) & 14) | ((i172222 >> 6) & SdkConfig.SDK_VERSION) | (i172222 & 896) | (i202222 & 7168) | (57344 & i192222) | (458752 & i1622) | ((i1622 << 6) & 3670016) | ((i1622 << 3) & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z4;
        function218 = function214;
        function219 = function215;
        function220 = function210;
        function221 = function211;
        function222 = function213;
        function223 = function216;
        function224 = function217;
        textFieldColors4 = textFieldColors3;
        paddingValues4 = paddingValues3;
        function225 = function212;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2023contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
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
        return outlinedTextFieldDefaults.m2027contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2027contentPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m680PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -471651810, "C(colors)921@46417L11,921@46429L30:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)");
        }
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & SdkConfig.SDK_VERSION);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultOutlinedTextFieldColors;
    }

    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2026colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long j43;
        TextSelectionColors textSelectionColors2;
        ComposerKt.sourceInformationMarkerStart(composer, 1767617725, "C(colors)P(30:c#ui.graphics.Color,41:c#ui.graphics.Color,9:c#ui.graphics.Color,20:c#ui.graphics.Color,23:c#ui.graphics.Color,34:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.graphics.Color,0:c#ui.graphics.Color,13:c#ui.graphics.Color,32,22:c#ui.graphics.Color,33:c#ui.graphics.Color,1:c#ui.graphics.Color,11:c#ui.graphics.Color,25:c#ui.graphics.Color,36:c#ui.graphics.Color,4:c#ui.graphics.Color,15:c#ui.graphics.Color,31:c#ui.graphics.Color,42:c#ui.graphics.Color,10:c#ui.graphics.Color,21:c#ui.graphics.Color,24:c#ui.graphics.Color,35:c#ui.graphics.Color,3:c#ui.graphics.Color,14:c#ui.graphics.Color,26:c#ui.graphics.Color,37:c#ui.graphics.Color,5:c#ui.graphics.Color,16:c#ui.graphics.Color,29:c#ui.graphics.Color,40:c#ui.graphics.Color,8:c#ui.graphics.Color,19:c#ui.graphics.Color,27:c#ui.graphics.Color,38:c#ui.graphics.Color,6:c#ui.graphics.Color,17:c#ui.graphics.Color,28:c#ui.graphics.Color,39:c#ui.graphics.Color,7:c#ui.graphics.Color,18:c#ui.graphics.Color)1023@53240L11,1023@53252L30:TextFieldDefaults.kt#uh7d8r");
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
            ComposerKt.traceEventStart(1767617725, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1023)");
        } else {
            j43 = m3879getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
        }
        TextFieldColors m2294copyejIjP34 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 6) & SdkConfig.SDK_VERSION).m2294copyejIjP34(m3879getUnspecified0d7_KjU, m3879getUnspecified0d7_KjU2, m3879getUnspecified0d7_KjU3, m3879getUnspecified0d7_KjU4, m3879getUnspecified0d7_KjU5, m3879getUnspecified0d7_KjU6, m3879getUnspecified0d7_KjU7, m3879getUnspecified0d7_KjU8, m3879getUnspecified0d7_KjU9, m3879getUnspecified0d7_KjU10, textSelectionColors2, m3879getUnspecified0d7_KjU11, m3879getUnspecified0d7_KjU12, m3879getUnspecified0d7_KjU13, m3879getUnspecified0d7_KjU14, m3879getUnspecified0d7_KjU15, m3879getUnspecified0d7_KjU16, m3879getUnspecified0d7_KjU17, m3879getUnspecified0d7_KjU18, m3879getUnspecified0d7_KjU19, m3879getUnspecified0d7_KjU20, m3879getUnspecified0d7_KjU21, m3879getUnspecified0d7_KjU22, m3879getUnspecified0d7_KjU23, m3879getUnspecified0d7_KjU24, m3879getUnspecified0d7_KjU25, m3879getUnspecified0d7_KjU26, m3879getUnspecified0d7_KjU27, m3879getUnspecified0d7_KjU28, m3879getUnspecified0d7_KjU29, m3879getUnspecified0d7_KjU30, m3879getUnspecified0d7_KjU31, m3879getUnspecified0d7_KjU32, m3879getUnspecified0d7_KjU33, m3879getUnspecified0d7_KjU34, m3879getUnspecified0d7_KjU35, m3879getUnspecified0d7_KjU36, m3879getUnspecified0d7_KjU37, m3879getUnspecified0d7_KjU38, m3879getUnspecified0d7_KjU39, m3879getUnspecified0d7_KjU40, m3879getUnspecified0d7_KjU41, j43);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2294copyejIjP34;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme colorScheme, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -292363577, "C:TextFieldDefaults.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached = colorScheme.getDefaultOutlinedTextFieldColorsCached();
        composer.startReplaceGroup(1540400102);
        ComposerKt.sourceInformation(composer, "*1086@57012L7");
        if (defaultOutlinedTextFieldColorsCached == null) {
            long fromToken = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusInputColor());
            long fromToken2 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputColor());
            long m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long fromToken3 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorInputColor());
            long m3878getTransparent0d7_KjU = Color.INSTANCE.m3878getTransparent0d7_KjU();
            long m3878getTransparent0d7_KjU2 = Color.INSTANCE.m3878getTransparent0d7_KjU();
            long m3878getTransparent0d7_KjU3 = Color.INSTANCE.m3878getTransparent0d7_KjU();
            long m3878getTransparent0d7_KjU4 = Color.INSTANCE.m3878getTransparent0d7_KjU();
            long fromToken4 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getCaretColor());
            long fromToken5 = ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor());
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            defaultOutlinedTextFieldColorsCached = new TextFieldColors(fromToken, fromToken2, m3842copywmQWz5c$default, fromToken3, m3878getTransparent0d7_KjU, m3878getTransparent0d7_KjU2, m3878getTransparent0d7_KjU3, m3878getTransparent0d7_KjU4, fromToken4, fromToken5, (TextSelectionColors) consume, ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getOutlineColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLabelColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getSupportingColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3_release(defaultOutlinedTextFieldColorsCached);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultOutlinedTextFieldColorsCached;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0131, code lost:
    
        if ((r32 & 64) != 0) goto L122;
     */
    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to OutlinedTextFieldDefaults.Container", replaceWith = @ReplaceWith(expression = "Container(\n    enabled = enabled,\n    isError = isError,\n    interactionSource = interactionSource,\n    colors = colors,\n    shape = shape,\n    focusedBorderThickness = focusedBorderThickness,\n    unfocusedBorderThickness = unfocusedBorderThickness,\n)", imports = {}))
    /* renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2025ContainerBoxnbWgWpA(final boolean z, final boolean z2, final InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        TextFieldColors textFieldColors2;
        Shape shape2;
        float f3;
        float f4;
        final TextFieldColors textFieldColors3;
        final Shape shape3;
        final float f5;
        final float f6;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1461761386);
        ComposerKt.sourceInformation(startRestartGroup, "C(ContainerBox)P(1,4,3!1,5,2:c#ui.unit.Dp,6:c#ui.unit.Dp)1174@62656L8,1175@62715L5,1179@62864L348:TextFieldDefaults.kt#uh7d8r");
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
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                textFieldColors2 = textFieldColors;
                if (startRestartGroup.changed(textFieldColors2)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                textFieldColors2 = textFieldColors;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            textFieldColors2 = textFieldColors;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i6 = 16384;
                    i3 |= i6;
                }
            } else {
                shape2 = shape;
            }
            i6 = 8192;
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                if (startRestartGroup.changed(f3)) {
                    i5 = 131072;
                    i3 |= i5;
                }
            } else {
                f3 = f;
            }
            i5 = 65536;
            i3 |= i5;
        } else {
            f3 = f;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                if (startRestartGroup.changed(f4)) {
                    i4 = 1048576;
                    i3 |= i4;
                }
            } else {
                f4 = f2;
            }
            i4 = 524288;
            i3 |= i4;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(this) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            shape3 = shape2;
            f5 = f3;
            f6 = f4;
            textFieldColors3 = textFieldColors2;
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    textFieldColors2 = colors(startRestartGroup, (i3 >> 21) & 14);
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    shape2 = INSTANCE.getShape(startRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    f3 = FocusedBorderThickness;
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    f4 = UnfocusedBorderThickness;
                    i3 &= -3670017;
                }
                TextFieldColors textFieldColors4 = textFieldColors2;
                Shape shape4 = shape2;
                float f7 = f3;
                float f8 = f4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461761386, i3, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1179)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                int i8 = (i3 & 14) | 3072 | (i3 & SdkConfig.SDK_VERSION) | (i3 & 896);
                int i9 = i3 << 3;
                m2024Container4EFweAY(z, z2, interactionSource, companion, textFieldColors4, shape4, f7, f8, startRestartGroup, i8 | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (i9 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textFieldColors3 = textFieldColors4;
                shape3 = shape4;
                f5 = f7;
                f6 = f8;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$ContainerBox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    OutlinedTextFieldDefaults.this.m2025ContainerBoxnbWgWpA(z, z2, interactionSource, textFieldColors3, shape3, f5, f6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
