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

/* compiled from: Bracketscurly.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BracketsCurly", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBracketsCurly", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bracketsCurly", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BracketscurlyKt {
    private static ImageVector _bracketsCurly;

    public static final ImageVector getBracketsCurly(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bracketsCurly;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BracketsCurly", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(39.91f, 128.0f);
        pathBuilder.arcToRelative(27.68f, 27.68f, 0.0f, false, true, 9.49f, 11.13f);
        pathBuilder.curveTo(54.0f, 148.62f, 54.0f, 160.51f, 54.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, 24.27f, 1.21f, 38.0f, 26.0f, 38.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.curveToRelative(-16.88f, 0.0f, -27.81f, -5.6f, -33.4f, -17.13f);
        pathBuilder.curveTo(42.0f, 195.38f, 42.0f, 183.49f, 42.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, -24.27f, -1.21f, -38.0f, -26.0f, -38.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.curveToRelative(24.79f, 0.0f, 26.0f, -13.73f, 26.0f, -38.0f);
        pathBuilder.curveToRelative(0.0f, -11.49f, 0.0f, -23.38f, 4.6f, -32.87f);
        pathBuilder.curveTo(52.19f, 39.6f, 63.12f, 34.0f, 80.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.curveTo(55.21f, 46.0f, 54.0f, 59.73f, 54.0f, 84.0f);
        pathBuilder.curveToRelative(0.0f, 11.49f, 0.0f, 23.38f, -4.6f, 32.87f);
        pathBuilder.arcTo(27.68f, 27.68f, 0.0f, false, true, 39.91f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 122.0f);
        pathBuilder.curveToRelative(-24.79f, 0.0f, -26.0f, -13.73f, -26.0f, -38.0f);
        pathBuilder.curveToRelative(0.0f, -11.49f, 0.0f, -23.38f, -4.6f, -32.87f);
        pathBuilder.curveTo(203.81f, 39.6f, 192.88f, 34.0f, 176.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.curveToRelative(24.79f, 0.0f, 26.0f, 13.73f, 26.0f, 38.0f);
        pathBuilder.curveToRelative(0.0f, 11.49f, 0.0f, 23.38f, 4.6f, 32.87f);
        pathBuilder.arcTo(27.68f, 27.68f, 0.0f, false, false, 216.09f, 128.0f);
        pathBuilder.arcToRelative(27.68f, 27.68f, 0.0f, false, false, -9.49f, 11.13f);
        pathBuilder.curveTo(202.0f, 148.62f, 202.0f, 160.51f, 202.0f, 172.0f);
        pathBuilder.curveToRelative(0.0f, 24.27f, -1.21f, 38.0f, -26.0f, 38.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.curveToRelative(16.88f, 0.0f, 27.81f, -5.6f, 33.4f, -17.13f);
        pathBuilder.curveToRelative(4.6f, -9.49f, 4.6f, -21.38f, 4.6f, -32.87f);
        pathBuilder.curveToRelative(0.0f, -24.27f, 1.21f, -38.0f, 26.0f, -38.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bracketsCurly = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
