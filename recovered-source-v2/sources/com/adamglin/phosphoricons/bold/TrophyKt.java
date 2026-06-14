package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Trophy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Trophy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTrophy", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trophy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrophyKt {
    private static ImageVector _trophy;

    public static final ImageVector getTrophy(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _trophy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Trophy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 60.0f);
        pathBuilder.lineTo(212.0f, 60.0f);
        pathBuilder.lineTo(212.0f, 48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(56.0f, 36.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 48.0f);
        pathBuilder.lineTo(44.0f, 60.0f);
        pathBuilder.lineTo(24.0f, 60.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 4.0f, 80.0f);
        pathBuilder.lineTo(4.0f, 96.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(0.77f);
        pathBuilder.arcTo(84.18f, 84.18f, 0.0f, false, false, 116.0f, 195.15f);
        pathBuilder.lineTo(116.0f, 212.0f);
        pathBuilder.lineTo(96.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(140.0f, 212.0f);
        pathBuilder.lineTo(140.0f, 195.11f);
        pathBuilder.curveToRelative(30.94f, -4.51f, 56.53f, -26.2f, 67.0f, -55.11f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f);
        pathBuilder.lineTo(252.0f, 80.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 232.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 96.0f);
        pathBuilder.lineTo(28.0f, 84.0f);
        pathBuilder.lineTo(44.0f, 84.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.curveToRelative(0.0f, 1.21f, 0.0f, 2.41f, 0.09f, 3.61f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 28.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 111.1f);
        pathBuilder.curveToRelative(0.0f, 33.33f, -26.71f, 60.65f, -59.54f, 60.9f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, true, 68.0f, 112.0f);
        pathBuilder.lineTo(68.0f, 60.0f);
        pathBuilder.lineTo(188.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -16.12f, 19.62f);
        pathBuilder.curveToRelative(0.08f, -1.5f, 0.12f, -3.0f, 0.12f, -4.52f);
        pathBuilder.lineTo(212.0f, 84.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trophy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
