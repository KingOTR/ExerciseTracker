package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Crownsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CrownSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCrownSimple", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crownSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrownsimpleKt {
    private static ImageVector _crownSimple;

    public static final ImageVector getCrownSimple(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _crownSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CrownSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.0f, 75.4f);
        pathBuilder.arcToRelative(13.87f, 13.87f, 0.0f, false, false, -16.52f, 3.34f);
        pathBuilder.lineToRelative(-35.74f, 38.52f);
        pathBuilder.lineTo(140.71f, 34.13f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -25.45f, 0.07f);
        pathBuilder.lineToRelative(-37.0f, 83.06f);
        pathBuilder.lineTo(42.48f, 78.74f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 18.22f, 90.46f);
        pathBuilder.curveToRelative(0.0f, 0.08f, 0.0f, 0.16f, 0.05f, 0.24f);
        pathBuilder.lineTo(41.0f, 194.57f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 54.71f, 206.0f);
        pathBuilder.horizontalLineTo(201.29f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.76f, -11.43f);
        pathBuilder.lineTo(237.73f, 90.7f);
        pathBuilder.curveToRelative(0.0f, -0.08f, 0.0f, -0.16f, 0.05f, -0.24f);
        pathBuilder.arcTo(13.89f, 13.89f, 0.0f, false, false, 230.0f, 75.4f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 88.29f);
        pathBuilder.lineTo(203.31f, 192.11f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.05f, 0.24f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.65f);
        pathBuilder.horizontalLineTo(54.71f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.65f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.05f, -0.24f);
        pathBuilder.lineTo(30.0f, 88.29f);
        pathBuilder.arcToRelative(1.82f, 1.82f, 0.0f, false, true, 1.12f, -2.06f);
        pathBuilder.arcToRelative(1.84f, 1.84f, 0.0f, false, true, 2.36f, 0.48f);
        pathBuilder.lineToRelative(0.12f, 0.13f);
        pathBuilder.lineToRelative(42.0f, 45.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.88f, -1.64f);
        pathBuilder.lineToRelative(40.7f, -91.28f);
        pathBuilder.arcTo(1.92f, 1.92f, 0.0f, false, true, 128.0f, 38.0f);
        pathBuilder.arcToRelative(1.87f, 1.87f, 0.0f, false, true, 1.78f, 1.09f);
        pathBuilder.lineToRelative(40.74f, 91.35f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.88f, 1.64f);
        pathBuilder.lineToRelative(42.0f, -45.24f);
        pathBuilder.lineToRelative(0.12f, -0.13f);
        pathBuilder.arcToRelative(1.84f, 1.84f, 0.0f, false, true, 2.36f, -0.48f);
        pathBuilder.arcTo(1.82f, 1.82f, 0.0f, false, true, 226.0f, 88.29f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crownSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
