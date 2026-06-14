package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tidallogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TidalLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTidalLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tidalLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TidallogoKt {
    private static ImageVector _tidalLogo;

    public static final ImageVector getTidalLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _tidalLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TidalLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(253.66f, 90.34f);
        pathBuilder.lineToRelative(-40.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder.lineTo(168.0f, 84.69f);
        pathBuilder.lineTo(133.66f, 50.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder.lineTo(88.0f, 84.69f);
        pathBuilder.lineTo(53.66f, 50.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder.lineToRelative(-40.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f);
        pathBuilder.lineToRelative(40.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f);
        pathBuilder.lineTo(88.0f, 107.31f);
        pathBuilder.lineTo(116.69f, 136.0f);
        pathBuilder.lineTo(82.34f, 170.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f);
        pathBuilder.lineToRelative(40.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f);
        pathBuilder.lineToRelative(40.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f);
        pathBuilder.lineTo(139.31f, 136.0f);
        pathBuilder.lineTo(168.0f, 107.31f);
        pathBuilder.lineToRelative(34.34f, 34.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f);
        pathBuilder.lineToRelative(40.0f, -40.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 253.66f, 90.34f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 124.69f);
        pathBuilder.lineTo(19.31f, 96.0f);
        pathBuilder.lineTo(48.0f, 67.31f);
        pathBuilder.lineTo(76.69f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 204.69f);
        pathBuilder.lineTo(99.31f, 176.0f);
        pathBuilder.lineTo(128.0f, 147.31f);
        pathBuilder.lineTo(156.69f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 124.69f);
        pathBuilder.lineTo(99.31f, 96.0f);
        pathBuilder.lineTo(128.0f, 67.31f);
        pathBuilder.lineTo(156.69f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 124.69f);
        pathBuilder.lineTo(179.31f, 96.0f);
        pathBuilder.lineTo(208.0f, 67.31f);
        pathBuilder.lineTo(236.69f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tidalLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
