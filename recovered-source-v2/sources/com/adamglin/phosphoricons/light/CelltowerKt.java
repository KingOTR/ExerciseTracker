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

/* compiled from: Celltower.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CellTower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCellTower", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cellTower", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CelltowerKt {
    private static ImageVector _cellTower;

    public static final ImageVector getCellTower(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _cellTower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CellTower", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(133.37f, 85.32f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.74f, 0.0f);
        pathBuilder.lineToRelative(-72.0f, 144.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.74f, 5.37f);
        pathBuilder.lineTo(75.71f, 206.0f);
        pathBuilder.lineTo(180.29f, 206.0f);
        pathBuilder.lineToRelative(14.34f, 28.68f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 238.0f);
        pathBuilder.arcToRelative(5.87f, 5.87f, 0.0f, false, false, 2.68f, -0.64f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.69f, -8.05f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 101.42f);
        pathBuilder.lineTo(158.29f, 162.0f);
        pathBuilder.lineTo(97.71f, 162.0f);
        pathBuilder.close();
        pathBuilder.moveTo(81.71f, 194.0f);
        pathBuilder.lineToRelative(10.0f, -20.0f);
        pathBuilder.horizontalLineToRelative(72.58f);
        pathBuilder.lineToRelative(10.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(161.45f, 94.1f);
        pathBuilder.arcTo(33.59f, 33.59f, 0.0f, false, false, 162.0f, 88.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, -68.0f, 0.0f);
        pathBuilder.arcToRelative(33.59f, 33.59f, 0.0f, false, false, 0.55f, 6.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.81f, 2.13f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, true, 90.52f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.89f, 4.94f);
        pathBuilder.arcToRelative(5.64f, 5.64f, 0.0f, false, true, -1.08f, -0.1f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 161.45f, 94.1f);
        pathBuilder.close();
        pathBuilder.moveTo(65.75f, 135.0f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, true, true, 206.0f, 88.0f);
        pathBuilder.arcToRelative(77.33f, 77.33f, 0.0f, false, true, -15.75f, 47.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.57f, -7.24f);
        pathBuilder.arcTo(65.42f, 65.42f, 0.0f, false, false, 194.0f, 88.0f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, false, 62.0f, 88.0f);
        pathBuilder.arcToRelative(65.42f, 65.42f, 0.0f, false, false, 13.32f, 39.76f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, true, 65.75f, 135.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cellTower = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
