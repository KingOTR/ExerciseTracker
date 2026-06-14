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

/* compiled from: Cubetransparent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CubeTransparent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCubeTransparent", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cubeTransparent", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CubetransparentKt {
    private static ImageVector _cubeTransparent;

    public static final ImageVector getCubeTransparent(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _cubeTransparent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CubeTransparent", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.24f, 91.75f);
        pathBuilder.lineTo(164.0f, 35.56f);
        pathBuilder.arcTo(5.93f, 5.93f, 0.0f, false, false, 160.0f, 34.0f);
        pathBuilder.lineTo(40.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.lineTo(34.0f, 160.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.76f, 4.25f);
        pathBuilder.lineToRelative(56.0f, 56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 222.0f);
        pathBuilder.lineTo(216.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(222.0f, 96.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 220.24f, 91.75f);
        pathBuilder.close();
        pathBuilder.moveTo(166.0f, 54.48f);
        pathBuilder.lineTo(201.52f, 90.0f);
        pathBuilder.lineTo(166.0f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.0f, 201.48f);
        pathBuilder.lineTo(54.48f, 166.0f);
        pathBuilder.lineTo(90.0f, 166.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.0f, 154.0f);
        pathBuilder.lineTo(46.0f, 154.0f);
        pathBuilder.lineTo(46.0f, 54.48f);
        pathBuilder.lineToRelative(44.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.48f, 46.0f);
        pathBuilder.lineTo(154.0f, 46.0f);
        pathBuilder.lineTo(154.0f, 90.0f);
        pathBuilder.lineTo(98.48f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.0f, 102.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.lineTo(102.0f, 154.0f);
        pathBuilder.lineTo(102.0f, 102.0f);
        pathBuilder.close();
        pathBuilder.moveTo(102.0f, 210.0f);
        pathBuilder.lineTo(102.0f, 166.0f);
        pathBuilder.horizontalLineToRelative(55.52f);
        pathBuilder.lineToRelative(44.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 201.52f);
        pathBuilder.lineTo(166.0f, 157.52f);
        pathBuilder.lineTo(166.0f, 102.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cubeTransparent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
