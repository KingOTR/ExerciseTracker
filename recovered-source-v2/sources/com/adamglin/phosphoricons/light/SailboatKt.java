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

/* compiled from: Sailboat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sailboat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSailboat", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sailboat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SailboatKt {
    private static ImageVector _sailboat;

    public static final ImageVector getSailboat(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _sailboat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sailboat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.41f, 173.4f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 170.0f);
        pathBuilder.lineTo(142.0f, 170.0f);
        pathBuilder.lineTo(142.0f, 142.0f);
        pathBuilder.horizontalLineToRelative(74.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.44f, -10.0f);
        pathBuilder.lineTo(142.0f, 45.68f);
        pathBuilder.lineTo(142.0f, 8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.66f, -3.78f);
        pathBuilder.lineToRelative(-104.0f, 128.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 142.0f);
        pathBuilder.horizontalLineToRelative(98.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.lineTo(16.0f, 170.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.69f, 9.75f);
        pathBuilder.lineToRelative(29.6f, 37.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 51.84f, 222.0f);
        pathBuilder.lineTo(204.16f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.93f, -5.25f);
        pathBuilder.lineToRelative(29.6f, -37.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 245.41f, 173.4f);
        pathBuilder.close();
        pathBuilder.moveTo(202.41f, 130.0f);
        pathBuilder.lineTo(142.0f, 130.0f);
        pathBuilder.lineTo(142.0f, 63.52f);
        pathBuilder.close();
        pathBuilder.moveTo(44.61f, 130.0f);
        pathBuilder.lineTo(130.0f, 24.9f);
        pathBuilder.lineTo(130.0f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(205.72f, 209.25f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.56f, 0.75f);
        pathBuilder.lineTo(51.84f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.56f, -0.75f);
        pathBuilder.lineTo(28.48f, 182.0f);
        pathBuilder.horizontalLineToRelative(199.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sailboat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
