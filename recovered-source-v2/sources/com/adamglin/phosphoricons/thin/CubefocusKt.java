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

/* compiled from: Cubefocus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CubeFocus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCubeFocus", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cubeFocus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CubefocusKt {
    private static ImageVector _cubeFocus;

    public static final ImageVector getCubeFocus(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _cubeFocus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CubeFocus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 48.0f);
        pathBuilder.lineTo(228.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(220.0f, 52.0f);
        pathBuilder.lineTo(184.0f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 204.0f);
        pathBuilder.lineTo(36.0f, 204.0f);
        pathBuilder.lineTo(36.0f, 168.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(72.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.lineTo(184.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(228.0f, 168.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(36.0f, 52.0f);
        pathBuilder.lineTo(72.0f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(32.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.lineTo(28.0f, 88.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 163.47f);
        pathBuilder.lineTo(130.0f, 195.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 0.0f);
        pathBuilder.lineToRelative(-56.0f, -32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 68.0f, 160.0f);
        pathBuilder.lineTo(68.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.0f, -3.47f);
        pathBuilder.lineToRelative(56.0f, -32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 0.0f);
        pathBuilder.lineToRelative(56.0f, 32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 188.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 186.0f, 163.47f);
        pathBuilder.close();
        pathBuilder.moveTo(80.06f, 96.0f);
        pathBuilder.lineTo(128.0f, 123.39f);
        pathBuilder.lineTo(175.94f, 96.0f);
        pathBuilder.lineTo(128.0f, 68.61f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 157.68f);
        pathBuilder.lineToRelative(48.0f, 27.43f);
        pathBuilder.lineTo(124.0f, 130.32f);
        pathBuilder.lineTo(76.0f, 102.89f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 157.68f);
        pathBuilder.lineTo(180.0f, 102.89f);
        pathBuilder.lineToRelative(-48.0f, 27.43f);
        pathBuilder.verticalLineToRelative(54.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cubeFocus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
