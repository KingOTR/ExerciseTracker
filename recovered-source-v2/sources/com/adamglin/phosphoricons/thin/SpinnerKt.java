package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Spinner.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Spinner", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSpinner", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spinner", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpinnerKt {
    private static ImageVector _spinner;

    public static final ImageVector getSpinner(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _spinner;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Spinner", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(132.0f, 32.0f);
        pathBuilder.lineTo(132.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(124.0f, 32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(173.25f, 86.75f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.18f);
        pathBuilder.lineTo(198.71f, 63.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f);
        pathBuilder.lineTo(170.43f, 79.92f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.82f, 6.83f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 124.0f);
        pathBuilder.lineTo(192.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.08f, 170.43f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.65f, 5.65f);
        pathBuilder.lineToRelative(22.62f, 22.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 188.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 192.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(79.92f, 170.43f);
        pathBuilder.lineTo(57.29f, 193.05f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 63.0f, 198.71f);
        pathBuilder.lineToRelative(22.62f, -22.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.65f, -5.65f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(32.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(64.0f, 132.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 68.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(63.0f, 57.29f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 57.29f, 63.0f);
        pathBuilder.lineTo(79.92f, 85.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.65f, -5.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spinner = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
