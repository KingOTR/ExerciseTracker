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

/* compiled from: Bellsimpleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BellSimpleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBellSimpleSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bellSimpleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellsimpleslashKt {
    private static ImageVector _bellSimpleSlash;

    public static final ImageVector getBellSimpleSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bellSimpleSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BellSimpleSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineTo(61.31f, 63.56f);
        pathBuilder.arcTo(77.45f, 77.45f, 0.0f, false, false, 50.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 35.74f, -8.42f, 63.2f, -14.08f, 72.94f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 198.0f);
        pathBuilder.lineTo(183.53f, 198.0f);
        pathBuilder.lineToRelative(20.0f, 22.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 186.0f);
        pathBuilder.arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.7f, -1.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.0f);
        pathBuilder.curveTo(53.86f, 170.0f, 62.0f, 139.69f, 62.0f, 104.0f);
        pathBuilder.arcToRelative(65.63f, 65.63f, 0.0f, false, true, 7.78f, -31.12f);
        pathBuilder.lineTo(172.62f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(166.0f, 224.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(96.0f, 230.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(213.27f, 177.38f);
        pathBuilder.arcToRelative(5.88f, 5.88f, 0.0f, false, true, -2.2f, 0.42f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.58f, -3.81f);
        pathBuilder.curveToRelative(-7.2f, -18.31f, -11.49f, -44.48f, -11.49f, -70.0f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, false, 95.45f, 46.57f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.93f, -10.43f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, false, true, 206.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 35.7f, 8.16f, 59.24f, 10.66f, 65.61f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 213.27f, 177.38f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bellSimpleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
