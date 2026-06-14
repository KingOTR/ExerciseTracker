package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Racquet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Racquet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getRacquet", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_racquet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RacquetKt {
    private static ImageVector _racquet;

    public static final ImageVector getRacquet(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _racquet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Racquet", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.0f, 26.05f);
        pathBuilder.curveTo(202.0f, -1.88f, 151.53f, 3.16f, 117.4f, 37.3f);
        pathBuilder.curveToRelative(-31.79f, 31.79f, -38.33f, 77.77f, -16.51f, 106.49f);
        pathBuilder.lineTo(71.33f, 173.35f);
        pathBuilder.lineToRelative(-0.68f, -0.68f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.64f, 0.0f);
        pathBuilder.lineTo(20.69f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.64f);
        pathBuilder.lineToRelative(12.69f, 12.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(83.34f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f);
        pathBuilder.lineToRelative(-0.69f, -0.69f);
        pathBuilder.lineToRelative(29.56f, -29.56f);
        pathBuilder.curveToRelative(11.29f, 8.58f, 25.24f, 12.79f, 40.0f, 12.79f);
        pathBuilder.curveToRelative(22.72f, 0.0f, 47.25f, -10.0f, 66.54f, -29.3f);
        pathBuilder.curveTo(252.83f, 104.47f, 257.88f, 54.0f, 230.0f, 26.05f);
        pathBuilder.close();
        pathBuilder.moveTo(44.7f, 224.0f);
        pathBuilder.lineTo(32.0f, 211.31f);
        pathBuilder.lineTo(59.33f, 184.0f);
        pathBuilder.lineToRelative(6.33f, 6.34f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(72.0f, 196.67f);
        pathBuilder.close();
        pathBuilder.moveTo(224.23f, 104.0f);
        pathBuilder.lineTo(200.06f, 104.0f);
        pathBuilder.verticalLineToRelative(-32.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcTo(72.45f, 72.45f, 0.0f, false, true, 224.23f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 149.61f);
        pathBuilder.arcTo(44.15f, 44.15f, 0.0f, false, true, 106.39f, 120.0f);
        pathBuilder.lineTo(136.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 104.0f);
        pathBuilder.arcToRelative(72.24f, 72.24f, 0.0f, false, true, 7.86f, -32.0f);
        pathBuilder.lineTo(136.0f, 72.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.horizontalLineToRelative(-32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(229.67f, 56.0f);
        pathBuilder.lineTo(200.06f, 56.0f);
        pathBuilder.lineTo(200.06f, 26.28f);
        pathBuilder.arcToRelative(44.23f, 44.23f, 0.0f, false, true, 29.66f, 29.66f);
        pathBuilder.close();
        pathBuilder.moveTo(183.85f, 24.0f);
        pathBuilder.horizontalLineToRelative(0.16f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.horizontalLineToRelative(-32.0f);
        pathBuilder.lineTo(152.01f, 31.76f);
        pathBuilder.arcTo(72.47f, 72.47f, 0.0f, false, true, 183.9f, 23.9f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 42.06f);
        pathBuilder.lineTo(136.0f, 55.94f);
        pathBuilder.lineTo(122.16f, 55.94f);
        pathBuilder.arcToRelative(89.72f, 89.72f, 0.0f, false, true, 6.56f, -7.32f);
        pathBuilder.arcTo(93.17f, 93.17f, 0.0f, false, true, 136.0f, 42.06f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 151.98f);
        pathBuilder.lineTo(152.0f, 120.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.verticalLineToRelative(24.16f);
        pathBuilder.arcTo(72.24f, 72.24f, 0.0f, false, true, 152.05f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 133.84f);
        pathBuilder.lineTo(200.0f, 120.0f);
        pathBuilder.lineTo(214.0f, 120.0f);
        pathBuilder.arcToRelative(91.62f, 91.62f, 0.0f, false, true, -6.56f, 7.32f);
        pathBuilder.arcTo(89.64f, 89.64f, 0.0f, false, true, 200.06f, 133.84f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _racquet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
