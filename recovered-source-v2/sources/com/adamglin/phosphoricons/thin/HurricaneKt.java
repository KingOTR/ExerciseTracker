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

/* compiled from: Hurricane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hurricane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHurricane", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hurricane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HurricaneKt {
    private static ImageVector _hurricane;

    public static final ImageVector getHurricane(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _hurricane;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hurricane", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 100.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(153.49f, 47.94f);
        pathBuilder.lineTo(163.87f, 9.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.71f, -4.94f);
        pathBuilder.arcToRelative(191.41f, 191.41f, 0.0f, false, false, -57.32f, 24.54f);
        pathBuilder.curveTo(64.0f, 53.0f, 44.0f, 87.32f, 44.0f, 128.0f);
        pathBuilder.arcToRelative(84.08f, 84.08f, 0.0f, false, false, 58.51f, 80.06f);
        pathBuilder.lineTo(92.13f, 247.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.71f, 4.94f);
        pathBuilder.arcToRelative(191.28f, 191.28f, 0.0f, false, false, 57.32f, -24.55f);
        pathBuilder.curveTo(192.0f, 203.0f, 212.0f, 168.68f, 212.0f, 128.0f);
        pathBuilder.arcTo(84.08f, 84.08f, 0.0f, false, false, 153.49f, 47.94f);
        pathBuilder.close();
        pathBuilder.moveTo(150.0f, 220.51f);
        pathBuilder.arcToRelative(190.13f, 190.13f, 0.0f, false, true, -48.39f, 21.87f);
        pathBuilder.lineToRelative(9.61f, -36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.84f, -4.9f);
        pathBuilder.arcTo(76.06f, 76.06f, 0.0f, false, true, 52.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -38.29f, 18.16f, -69.41f, 54.0f, -92.51f);
        pathBuilder.arcToRelative(190.13f, 190.13f, 0.0f, false, true, 48.39f, -21.87f);
        pathBuilder.lineToRelative(-9.61f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.84f, 4.9f);
        pathBuilder.arcTo(76.06f, 76.06f, 0.0f, false, true, 204.0f, 128.0f);
        pathBuilder.curveTo(204.0f, 166.29f, 185.84f, 197.41f, 150.0f, 220.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hurricane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
