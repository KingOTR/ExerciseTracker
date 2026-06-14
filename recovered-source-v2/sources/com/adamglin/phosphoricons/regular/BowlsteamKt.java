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

/* compiled from: Bowlsteam.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BowlSteam", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBowlSteam", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bowlSteam", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BowlsteamKt {
    private static ImageVector _bowlSteam;

    public static final ImageVector getBowlSteam(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 112.0f);
        pathBuilder.lineTo(32.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.arcToRelative(104.35f, 104.35f, 0.0f, false, false, 56.0f, 92.28f);
        pathBuilder.lineTo(80.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineToRelative(-3.72f);
        pathBuilder.arcTo(104.35f, 104.35f, 0.0f, false, false, 232.0f, 120.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.66f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.66f, 7.27f);
        pathBuilder.lineTo(160.0f, 216.0f);
        pathBuilder.lineTo(96.0f, 216.0f);
        pathBuilder.verticalLineToRelative(-8.71f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 91.34f, 200.0f);
        pathBuilder.arcToRelative(88.29f, 88.29f, 0.0f, false, true, -51.0f, -72.0f);
        pathBuilder.lineTo(215.63f, 128.0f);
        pathBuilder.arcTo(88.29f, 88.29f, 0.0f, false, true, 164.66f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(81.77f, 55.0f);
        pathBuilder.curveToRelative(5.35f, -6.66f, 6.67f, -11.16f, 6.12f, -13.14f);
        pathBuilder.curveToRelative(-0.42f, -1.49f, -2.41f, -2.26f, -2.43f, -2.26f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 24.0f);
        pathBuilder.arcToRelative(8.11f, 8.11f, 0.0f, false, true, 2.38f, 0.36f);
        pathBuilder.curveToRelative(1.0f, 0.31f, 9.91f, 3.33f, 12.79f, 12.76f);
        pathBuilder.curveToRelative(2.46f, 8.07f, -0.55f, 17.45f, -8.94f, 27.89f);
        pathBuilder.curveToRelative(-5.35f, 6.66f, -6.67f, 11.16f, -6.12f, 13.14f);
        pathBuilder.curveToRelative(0.42f, 1.49f, 2.37f, 2.24f, 2.39f, 2.25f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 96.0f);
        pathBuilder.arcToRelative(8.11f, 8.11f, 0.0f, false, true, -2.38f, -0.36f);
        pathBuilder.curveToRelative(-1.0f, -0.31f, -9.91f, -3.33f, -12.79f, -12.76f);
        pathBuilder.curveTo(70.37f, 74.81f, 73.38f, 65.43f, 81.77f, 55.0f);
        pathBuilder.close();
        pathBuilder.moveTo(121.77f, 55.0f);
        pathBuilder.curveToRelative(5.35f, -6.66f, 6.67f, -11.16f, 6.12f, -13.14f);
        pathBuilder.curveToRelative(-0.42f, -1.49f, -2.41f, -2.26f, -2.43f, -2.26f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 24.0f);
        pathBuilder.arcToRelative(8.11f, 8.11f, 0.0f, false, true, 2.38f, 0.36f);
        pathBuilder.curveToRelative(1.0f, 0.31f, 9.91f, 3.33f, 12.79f, 12.76f);
        pathBuilder.curveToRelative(2.46f, 8.07f, -0.55f, 17.45f, -8.94f, 27.89f);
        pathBuilder.curveToRelative(-5.35f, 6.66f, -6.67f, 11.16f, -6.12f, 13.14f);
        pathBuilder.curveToRelative(0.42f, 1.49f, 2.37f, 2.24f, 2.39f, 2.25f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 96.0f);
        pathBuilder.arcToRelative(8.11f, 8.11f, 0.0f, false, true, -2.38f, -0.36f);
        pathBuilder.curveToRelative(-1.0f, -0.31f, -9.91f, -3.33f, -12.79f, -12.76f);
        pathBuilder.curveTo(110.37f, 74.81f, 113.38f, 65.43f, 121.77f, 55.0f);
        pathBuilder.close();
        pathBuilder.moveTo(161.77f, 55.0f);
        pathBuilder.curveToRelative(5.35f, -6.66f, 6.67f, -11.16f, 6.12f, -13.14f);
        pathBuilder.curveToRelative(-0.42f, -1.49f, -2.41f, -2.26f, -2.43f, -2.26f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 24.0f);
        pathBuilder.arcToRelative(8.11f, 8.11f, 0.0f, false, true, 2.38f, 0.36f);
        pathBuilder.curveToRelative(1.0f, 0.31f, 9.91f, 3.33f, 12.79f, 12.76f);
        pathBuilder.curveToRelative(2.46f, 8.07f, -0.55f, 17.45f, -8.94f, 27.89f);
        pathBuilder.curveToRelative(-5.35f, 6.66f, -6.67f, 11.16f, -6.12f, 13.14f);
        pathBuilder.curveToRelative(0.42f, 1.49f, 2.37f, 2.24f, 2.39f, 2.25f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 96.0f);
        pathBuilder.arcToRelative(8.11f, 8.11f, 0.0f, false, true, -2.38f, -0.36f);
        pathBuilder.curveToRelative(-1.0f, -0.31f, -9.91f, -3.33f, -12.79f, -12.76f);
        pathBuilder.curveTo(150.37f, 74.81f, 153.38f, 65.43f, 161.77f, 55.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bowlSteam = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
