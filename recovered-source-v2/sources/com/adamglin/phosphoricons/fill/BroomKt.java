package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Broom.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Broom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBroom", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_broom", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroomKt {
    private static ImageVector _broom;

    public static final ImageVector getBroom(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _broom;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Broom", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.29f, 216.7f);
        pathBuilder.curveTo(212.86f, 205.69f, 200.0f, 182.12f, 200.0f, 152.0f);
        pathBuilder.verticalLineTo(134.69f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, -10.09f, -14.87f);
        pathBuilder.lineToRelative(-28.65f, -11.46f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 156.79f, 98.0f);
        pathBuilder.lineToRelative(22.32f, -56.67f);
        pathBuilder.curveTo(184.0f, 28.79f, 178.0f, 14.21f, 165.34f, 9.51f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -30.7f, 13.71f);
        pathBuilder.lineTo(112.25f, 80.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.41f, 4.5f);
        pathBuilder.lineTo(73.11f, 73.08f);
        pathBuilder.arcToRelative(15.91f, 15.91f, 0.0f, false, false, -17.38f, 3.66f);
        pathBuilder.curveTo(34.68f, 98.4f, 24.0f, 123.71f, 24.0f, 152.0f);
        pathBuilder.arcToRelative(111.53f, 111.53f, 0.0f, false, false, 31.15f, 77.53f);
        pathBuilder.arcTo(8.06f, 8.06f, 0.0f, false, false, 61.0f, 232.0f);
        pathBuilder.horizontalLineTo(232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -7.51f);
        pathBuilder.arcTo(8.21f, 8.21f, 0.0f, false, false, 235.29f, 216.7f);
        pathBuilder.close();
        pathBuilder.moveTo(115.11f, 216.0f);
        pathBuilder.arcToRelative(87.52f, 87.52f, 0.0f, false, true, -24.26f, -41.71f);
        pathBuilder.arcToRelative(8.21f, 8.21f, 0.0f, false, false, -9.25f, -6.18f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 75.28f, 178.0f);
        pathBuilder.arcToRelative(105.33f, 105.33f, 0.0f, false, false, 18.36f, 38.0f);
        pathBuilder.horizontalLineTo(64.44f);
        pathBuilder.arcTo(95.62f, 95.62f, 0.0f, false, true, 40.0f, 152.0f);
        pathBuilder.arcToRelative(85.92f, 85.92f, 0.0f, false, true, 7.73f, -36.3f);
        pathBuilder.lineToRelative(137.8f, 55.13f);
        pathBuilder.curveToRelative(3.0f, 18.06f, 10.55f, 33.5f, 21.89f, 45.19f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _broom = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
