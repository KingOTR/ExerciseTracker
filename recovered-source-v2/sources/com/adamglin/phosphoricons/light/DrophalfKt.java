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

/* compiled from: Drophalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDropHalf", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrophalfKt {
    private static ImageVector _dropHalf;

    public static final ImageVector getDropHalf(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _dropHalf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropHalf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.53f, 49.06f);
        pathBuilder.arcToRelative(251.42f, 251.42f, 0.0f, false, false, -41.09f, -38.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.88f, 0.0f);
        pathBuilder.arcToRelative(251.42f, 251.42f, 0.0f, false, false, -41.09f, 38.0f);
        pathBuilder.curveTo(56.34f, 80.26f, 42.0f, 113.09f, 42.0f, 144.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f);
        pathBuilder.curveTo(214.0f, 113.09f, 199.66f, 80.26f, 172.53f, 49.06f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 144.0f);
        pathBuilder.arcToRelative(75.0f, 75.0f, 0.0f, false, true, -0.69f, 10.0f);
        pathBuilder.lineTo(134.0f, 154.0f);
        pathBuilder.lineTo(134.0f, 134.0f);
        pathBuilder.horizontalLineToRelative(67.44f);
        pathBuilder.arcTo(92.09f, 92.09f, 0.0f, false, true, 202.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.8f, 90.0f);
        pathBuilder.lineTo(134.0f, 90.0f);
        pathBuilder.lineTo(134.0f, 70.0f);
        pathBuilder.horizontalLineToRelative(39.89f);
        pathBuilder.arcTo(176.0f, 176.0f, 0.0f, false, true, 186.8f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 198.0f);
        pathBuilder.horizontalLineToRelative(44.52f);
        pathBuilder.arcTo(73.76f, 73.76f, 0.0f, false, true, 134.0f, 217.74f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 186.0f);
        pathBuilder.lineTo(134.0f, 166.0f);
        pathBuilder.horizontalLineToRelative(64.66f);
        pathBuilder.arcToRelative(74.05f, 74.05f, 0.0f, false, true, -9.78f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 122.0f);
        pathBuilder.lineTo(134.0f, 102.0f);
        pathBuilder.horizontalLineToRelative(58.7f);
        pathBuilder.arcToRelative(117.43f, 117.43f, 0.0f, false, true, 6.69f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.29f, 58.0f);
        pathBuilder.lineTo(134.0f, 58.0f);
        pathBuilder.lineTo(134.0f, 28.3f);
        pathBuilder.arcTo(257.09f, 257.09f, 0.0f, false, true, 164.29f, 58.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -53.42f, 47.35f, -98.56f, 68.0f, -115.7f);
        pathBuilder.lineTo(122.0f, 217.74f);
        pathBuilder.arcTo(74.09f, 74.09f, 0.0f, false, true, 54.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
