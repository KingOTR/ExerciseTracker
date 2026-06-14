package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bowlsteam.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BowlSteam", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBowlSteam", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bowlSteam", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BowlsteamKt {
    private static ImageVector _bowlSteam;

    public static final ImageVector getBowlSteam(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bowlSteam;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BowlSteam", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 120.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, true, -56.0f, 87.3f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineToRelative(-8.7f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 32.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(81.77f, 55.0f);
        pathBuilder2.curveToRelative(5.35f, -6.66f, 6.67f, -11.16f, 6.12f, -13.14f);
        pathBuilder2.curveToRelative(-0.42f, -1.49f, -2.41f, -2.26f, -2.43f, -2.26f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 24.0f);
        pathBuilder2.arcToRelative(8.11f, 8.11f, 0.0f, false, true, 2.38f, 0.36f);
        pathBuilder2.curveToRelative(1.0f, 0.31f, 9.91f, 3.33f, 12.79f, 12.76f);
        pathBuilder2.curveToRelative(2.46f, 8.07f, -0.55f, 17.45f, -8.94f, 27.89f);
        pathBuilder2.curveToRelative(-5.35f, 6.66f, -6.67f, 11.16f, -6.12f, 13.14f);
        pathBuilder2.curveToRelative(0.42f, 1.49f, 2.37f, 2.24f, 2.39f, 2.25f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 96.0f);
        pathBuilder2.arcToRelative(8.11f, 8.11f, 0.0f, false, true, -2.38f, -0.36f);
        pathBuilder2.curveToRelative(-1.0f, -0.31f, -9.91f, -3.33f, -12.79f, -12.76f);
        pathBuilder2.curveTo(70.37f, 74.81f, 73.38f, 65.43f, 81.77f, 55.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(112.83f, 82.89f);
        pathBuilder2.curveToRelative(2.88f, 9.43f, 11.79f, 12.45f, 12.79f, 12.76f);
        pathBuilder2.arcTo(8.11f, 8.11f, 0.0f, false, false, 128.0f, 96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.5f, -15.6f);
        pathBuilder2.reflectiveCurveToRelative(-2.0f, -0.76f, -2.39f, -2.25f);
        pathBuilder2.curveToRelative(-0.55f, -2.0f, 0.77f, -6.48f, 6.12f, -13.14f);
        pathBuilder2.curveToRelative(8.39f, -10.44f, 11.4f, -19.82f, 8.94f, -27.89f);
        pathBuilder2.curveToRelative(-2.88f, -9.43f, -11.78f, -12.45f, -12.79f, -12.76f);
        pathBuilder2.arcTo(8.11f, 8.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.54f, 15.59f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, 0.77f, 2.43f, 2.26f);
        pathBuilder2.curveToRelative(0.55f, 2.0f, -0.77f, 6.48f, -6.12f, 13.14f);
        pathBuilder2.curveTo(113.38f, 65.43f, 110.37f, 74.81f, 112.83f, 82.88f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.83f, 82.89f);
        pathBuilder2.curveToRelative(2.88f, 9.43f, 11.79f, 12.45f, 12.79f, 12.76f);
        pathBuilder2.arcTo(8.11f, 8.11f, 0.0f, false, false, 168.0f, 96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.5f, -15.6f);
        pathBuilder2.reflectiveCurveToRelative(-2.0f, -0.76f, -2.39f, -2.25f);
        pathBuilder2.curveToRelative(-0.55f, -2.0f, 0.77f, -6.48f, 6.12f, -13.14f);
        pathBuilder2.curveToRelative(8.39f, -10.44f, 11.4f, -19.82f, 8.94f, -27.89f);
        pathBuilder2.curveToRelative(-2.88f, -9.43f, -11.78f, -12.45f, -12.79f, -12.76f);
        pathBuilder2.arcTo(8.11f, 8.11f, 0.0f, false, false, 168.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.54f, 15.59f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, 0.77f, 2.43f, 2.26f);
        pathBuilder2.curveToRelative(0.55f, 2.0f, -0.77f, 6.48f, -6.12f, 13.14f);
        pathBuilder2.curveTo(153.38f, 65.43f, 150.37f, 74.81f, 152.83f, 82.88f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 120.0f);
        pathBuilder2.arcToRelative(104.35f, 104.35f, 0.0f, false, true, -56.0f, 92.28f);
        pathBuilder2.lineTo(176.0f, 216.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder2.lineTo(96.0f, 232.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder2.verticalLineToRelative(-3.72f);
        pathBuilder2.arcTo(104.35f, 104.35f, 0.0f, false, true, 24.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.lineTo(224.0f, 112.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(215.63f, 128.0f);
        pathBuilder2.lineTo(40.37f, 128.0f);
        pathBuilder2.arcToRelative(88.29f, 88.29f, 0.0f, false, false, 51.0f, 72.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 207.29f);
        pathBuilder2.lineTo(96.0f, 216.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.verticalLineToRelative(-8.71f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.66f, -7.27f);
        pathBuilder2.arcTo(88.29f, 88.29f, 0.0f, false, false, 215.63f, 128.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bowlSteam = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
