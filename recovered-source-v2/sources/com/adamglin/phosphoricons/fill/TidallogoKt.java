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

/* compiled from: Tidallogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TidalLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTidalLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tidalLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TidallogoKt {
    private static ImageVector _tidalLogo;

    public static final ImageVector getTidalLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(253.66f, 101.66f);
        pathBuilder.lineToRelative(-36.0f, 36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.lineToRelative(-36.0f, -36.0f);
        pathBuilder.lineToRelative(-0.34f, -0.38f);
        pathBuilder.lineToRelative(-0.34f, 0.38f);
        pathBuilder.lineTo(135.31f, 136.0f);
        pathBuilder.lineToRelative(34.35f, 34.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder.lineToRelative(-36.0f, 36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.lineToRelative(-36.0f, -36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f);
        pathBuilder.lineTo(120.69f, 136.0f);
        pathBuilder.lineTo(86.34f, 101.66f);
        pathBuilder.lineToRelative(-0.34f, -0.38f);
        pathBuilder.lineToRelative(-0.34f, 0.38f);
        pathBuilder.lineToRelative(-36.0f, 36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.lineToRelative(-36.0f, -36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f);
        pathBuilder.lineToRelative(36.0f, -36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.lineToRelative(36.0f, 36.0f);
        pathBuilder.lineToRelative(0.34f, 0.38f);
        pathBuilder.lineToRelative(0.34f, -0.38f);
        pathBuilder.lineToRelative(36.0f, -36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.lineToRelative(36.0f, 36.0f);
        pathBuilder.lineToRelative(0.34f, 0.38f);
        pathBuilder.lineToRelative(0.34f, -0.38f);
        pathBuilder.lineToRelative(36.0f, -36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.lineToRelative(36.0f, 36.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 253.66f, 101.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tidalLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
