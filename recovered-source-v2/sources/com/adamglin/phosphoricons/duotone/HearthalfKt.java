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

/* compiled from: Hearthalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHeartHalf", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HearthalfKt {
    private static ImageVector _heartHalf;

    public static final ImageVector getHeartHalf(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _heartHalf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeartHalf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 80.0f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.reflectiveCurveTo(24.0f, 168.0f, 24.0f, 102.0f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, true, 78.0f, 48.0f);
        pathBuilder.curveTo(100.59f, 48.0f, 119.94f, 60.31f, 128.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(178.0f, 40.0f);
        pathBuilder2.curveToRelative(-20.65f, 0.0f, -38.73f, 8.88f, -50.0f, 23.89f);
        pathBuilder2.curveTo(116.73f, 48.88f, 98.65f, 40.0f, 78.0f, 40.0f);
        pathBuilder2.arcToRelative(62.07f, 62.07f, 0.0f, false, false, -62.0f, 62.0f);
        pathBuilder2.curveToRelative(0.0f, 70.0f, 103.79f, 126.67f, 108.21f, 129.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.58f, 0.0f);
        pathBuilder2.curveTo(136.21f, 228.67f, 240.0f, 172.0f, 240.0f, 102.0f);
        pathBuilder2.arcTo(62.07f, 62.07f, 0.0f, false, false, 178.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 102.0f);
        pathBuilder2.arcTo(46.06f, 46.06f, 0.0f, false, true, 78.0f, 56.0f);
        pathBuilder2.curveToRelative(18.91f, 0.0f, 34.86f, 9.79f, 42.0f, 25.65f);
        pathBuilder2.verticalLineTo(210.0f);
        pathBuilder2.curveTo(93.59f, 193.44f, 32.0f, 149.78f, 32.0f, 102.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(136.0f, 210.0f);
        pathBuilder2.verticalLineTo(81.65f);
        pathBuilder2.curveTo(143.14f, 65.79f, 159.09f, 56.0f, 178.0f, 56.0f);
        pathBuilder2.arcToRelative(46.06f, 46.06f, 0.0f, false, true, 46.0f, 46.0f);
        pathBuilder2.curveTo(224.0f, 149.71f, 162.42f, 193.41f, 136.0f, 210.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
