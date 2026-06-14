package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Football.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Football", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFootball", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_football", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootballKt {
    private static ImageVector _football;

    public static final ImageVector getFootball(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _football;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Football", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.06f, 53.89f);
        pathBuilder.arcToRelative(32.92f, 32.92f, 0.0f, false, false, -26.95f, -26.95f);
        pathBuilder.curveToRelative(-32.38f, -5.49f, -93.39f, -8.0f, -138.27f, 36.9f);
        pathBuilder.reflectiveCurveToRelative(-42.39f, 105.9f, -36.9f, 138.27f);
        pathBuilder.arcToRelative(32.92f, 32.92f, 0.0f, false, false, 27.0f, 26.95f);
        pathBuilder.arcTo(206.58f, 206.58f, 0.0f, false, false, 88.27f, 232.0f);
        pathBuilder.curveToRelative(32.09f, 0.0f, 72.05f, -8.0f, 103.89f, -39.84f);
        pathBuilder.curveTo(237.05f, 147.28f, 234.55f, 86.26f, 229.06f, 53.89f);
        pathBuilder.close();
        pathBuilder.moveTo(56.56f, 213.3f);
        pathBuilder.arcTo(16.94f, 16.94f, 0.0f, false, true, 42.7f, 199.44f);
        pathBuilder.arcToRelative(180.27f, 180.27f, 0.0f, false, true, -2.11f, -46.9f);
        pathBuilder.lineToRelative(62.87f, 62.87f);
        pathBuilder.arcTo(180.27f, 180.27f, 0.0f, false, true, 56.56f, 213.3f);
        pathBuilder.close();
        pathBuilder.moveTo(165.64f, 101.67f);
        pathBuilder.lineTo(151.3f, 116.0f);
        pathBuilder.lineToRelative(6.34f, 6.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, 11.3f);
        pathBuilder.lineTo(140.0f, 127.31f);
        pathBuilder.lineTo(127.31f, 140.0f);
        pathBuilder.lineToRelative(6.34f, 6.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.3f, 11.31f);
        pathBuilder.lineTo(116.0f, 151.3f);
        pathBuilder.lineToRelative(-14.34f, 14.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.31f);
        pathBuilder.lineTo(104.7f, 140.0f);
        pathBuilder.lineToRelative(-6.34f, -6.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, -11.3f);
        pathBuilder.lineToRelative(6.34f, 6.34f);
        pathBuilder.lineTo(128.69f, 116.0f);
        pathBuilder.lineToRelative(-6.34f, -6.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.31f);
        pathBuilder.lineTo(140.0f, 104.7f);
        pathBuilder.lineToRelative(14.34f, -14.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.31f, 11.31f);
        pathBuilder.close();
        pathBuilder.moveTo(215.41f, 103.46f);
        pathBuilder.lineTo(152.54f, 40.59f);
        pathBuilder.curveToRelative(4.76f, -0.44f, 9.72f, -0.69f, 14.91f, -0.69f);
        pathBuilder.arcToRelative(192.0f, 192.0f, 0.0f, false, true, 32.0f, 2.8f);
        pathBuilder.arcTo(16.94f, 16.94f, 0.0f, false, true, 213.3f, 56.56f);
        pathBuilder.arcTo(180.27f, 180.27f, 0.0f, false, true, 215.41f, 103.46f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _football = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
