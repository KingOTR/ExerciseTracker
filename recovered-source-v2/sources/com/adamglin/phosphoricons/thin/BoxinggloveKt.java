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

/* compiled from: Boxingglove.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BoxingGlove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBoxingGlove", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boxingGlove", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoxinggloveKt {
    private static ImageVector _boxingGlove;

    public static final ImageVector getBoxingGlove(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _boxingGlove;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BoxingGlove", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 20.0f);
        pathBuilder.lineTo(120.0f, 20.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, false, 68.0f, 72.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineTo(56.0f, 76.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f);
        pathBuilder.verticalLineToRelative(29.19f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.63f, 7.5f);
        pathBuilder.curveToRelative(0.1f, 0.12f, 0.2f, 0.24f, 0.31f, 0.35f);
        pathBuilder.lineTo(68.0f, 177.67f);
        pathBuilder.lineTo(68.0f, 216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(192.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(204.0f, 176.56f);
        pathBuilder.lineToRelative(15.54f, -54.38f);
        pathBuilder.arcToRelative(12.34f, 12.34f, 0.0f, false, false, 0.46f, -3.3f);
        pathBuilder.lineTo(220.0f, 72.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, false, 168.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 118.88f);
        pathBuilder.arcToRelative(4.11f, 4.11f, 0.0f, false, true, -0.15f, 1.1f);
        pathBuilder.lineToRelative(-15.7f, 54.92f);
        pathBuilder.arcTo(4.11f, 4.11f, 0.0f, false, false, 196.0f, 176.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(80.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(76.0f, 176.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.19f, -2.84f);
        pathBuilder.lineTo(36.76f, 135.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.76f, -2.35f);
        pathBuilder.lineTo(36.0f, 104.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 56.0f, 84.0f);
        pathBuilder.lineTo(68.0f, 84.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(76.0f, 72.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, -44.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(169.79f, 163.58f);
        pathBuilder.lineTo(145.0f, 176.0f);
        pathBuilder.lineToRelative(24.84f, 12.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, 7.16f);
        pathBuilder.lineTo(136.0f, 180.47f);
        pathBuilder.lineToRelative(-30.21f, 15.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.58f, -7.16f);
        pathBuilder.lineTo(127.05f, 176.0f);
        pathBuilder.lineToRelative(-24.84f, -12.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.58f, -7.16f);
        pathBuilder.lineTo(136.0f, 171.53f);
        pathBuilder.lineToRelative(30.21f, -15.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.58f, 7.16f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boxingGlove = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
