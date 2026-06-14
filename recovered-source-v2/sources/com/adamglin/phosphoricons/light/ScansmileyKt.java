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

/* compiled from: Scansmiley.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ScanSmiley", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getScanSmiley", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scanSmiley", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScansmileyKt {
    private static ImageVector _scanSmiley;

    public static final ImageVector getScanSmiley(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _scanSmiley;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ScanSmiley", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.0f, 40.0f);
        pathBuilder.lineTo(222.0f, 76.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(210.0f, 46.0f);
        pathBuilder.lineTo(180.0f, 46.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 174.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(30.0f);
        pathBuilder.lineTo(180.0f, 210.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(222.0f, 180.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 174.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 210.0f);
        pathBuilder.lineTo(46.0f, 210.0f);
        pathBuilder.lineTo(46.0f, 180.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.lineTo(76.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 82.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(46.0f, 46.0f);
        pathBuilder.lineTo(76.0f, 46.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(40.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.lineTo(34.0f, 76.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 82.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 198.0f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, true, true, 70.0f, -70.0f);
        pathBuilder.arcTo(70.08f, 70.08f, 0.0f, false, true, 128.0f, 198.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 128.0f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, true, false, -58.0f, 58.0f);
        pathBuilder.arcTo(58.07f, 58.07f, 0.0f, false, false, 186.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(114.0f, 116.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 114.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 106.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 152.0f, 106.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 147.5f);
        pathBuilder.curveToRelative(-4.2f, 3.71f, -12.81f, 6.5f, -20.0f, 6.5f);
        pathBuilder.reflectiveCurveToRelative(-15.83f, -2.79f, -20.0f, -6.5f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.94f, 9.0f);
        pathBuilder.curveToRelative(7.44f, 6.56f, 19.41f, 9.5f, 28.0f, 9.5f);
        pathBuilder.reflectiveCurveToRelative(20.53f, -2.94f, 28.0f, -9.5f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.94f, -9.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scanSmiley = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
