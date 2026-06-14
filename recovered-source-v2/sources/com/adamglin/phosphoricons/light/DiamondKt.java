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

/* compiled from: Diamond.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Diamond", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDiamond", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_diamond", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiamondKt {
    private static ImageVector _diamond;

    public static final ImageVector getDiamond(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _diamond;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Diamond", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(233.92f, 118.14f);
        pathBuilder.lineTo(137.86f, 22.08f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.72f, 0.0f);
        pathBuilder.lineTo(22.08f, 118.14f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.72f);
        pathBuilder.lineToRelative(96.06f, 96.06f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.72f, 0.0f);
        pathBuilder.lineToRelative(96.0f, -96.06f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, 0.0f, -19.72f);
        pathBuilder.close();
        pathBuilder.moveTo(225.43f, 129.38f);
        pathBuilder.lineTo(129.38f, 225.44f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.76f, 0.0f);
        pathBuilder.lineTo(30.57f, 129.38f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.76f);
        pathBuilder.lineToRelative(96.05f, -96.06f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.76f, 0.0f);
        pathBuilder.lineToRelative(96.05f, 96.06f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _diamond = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
