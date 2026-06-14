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

/* compiled from: Funnelx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FunnelX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFunnelX", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_funnelX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FunnelxKt {
    private static ImageVector _funnelX;

    public static final ImageVector getFunnelX(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _funnelX;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FunnelX", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.82f, 66.76f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f);
        pathBuilder.lineTo(40.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 28.19f, 66.76f);
        pathBuilder.lineToRelative(0.08f, 0.09f);
        pathBuilder.lineTo(96.0f, 139.17f);
        pathBuilder.lineTo(96.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 24.87f, 13.32f);
        pathBuilder.lineToRelative(32.0f, -21.34f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 160.0f, 194.66f);
        pathBuilder.lineTo(160.0f, 139.17f);
        pathBuilder.lineToRelative(67.73f, -72.32f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 56.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.19f, 130.59f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 136.0f);
        pathBuilder.verticalLineToRelative(58.66f);
        pathBuilder.lineTo(112.0f, 216.0f);
        pathBuilder.lineTo(112.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.16f, -5.46f);
        pathBuilder.lineTo(40.0f, 56.0f);
        pathBuilder.lineTo(216.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(245.68f, 210.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder.lineTo(216.0f, 203.32f);
        pathBuilder.lineToRelative(-18.34f, 18.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f);
        pathBuilder.lineTo(204.69f, 192.0f);
        pathBuilder.lineToRelative(-18.34f, -18.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, -11.31f);
        pathBuilder.lineTo(216.0f, 180.69f);
        pathBuilder.lineToRelative(18.34f, -18.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.31f);
        pathBuilder.lineTo(227.31f, 192.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _funnelX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
