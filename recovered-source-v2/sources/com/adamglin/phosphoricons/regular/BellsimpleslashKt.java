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

/* compiled from: Bellsimpleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BellSimpleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBellSimpleSlash", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bellSimpleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellsimpleslashKt {
    private static ImageVector _bellSimpleSlash;

    public static final ImageVector getBellSimpleSlash(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineTo(58.82f, 63.8f);
        pathBuilder.arcTo(79.59f, 79.59f, 0.0f, false, false, 48.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 35.34f, -8.26f, 62.38f, -13.81f, 71.94f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 200.0f);
        pathBuilder.lineTo(182.64f, 200.0f);
        pathBuilder.lineToRelative(19.44f, 21.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 184.0f);
        pathBuilder.curveToRelative(7.7f, -13.24f, 16.0f, -43.92f, 16.0f, -80.0f);
        pathBuilder.arcToRelative(63.65f, 63.65f, 0.0f, false, true, 6.26f, -27.62f);
        pathBuilder.lineTo(168.09f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(96.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.0f, 179.25f);
        pathBuilder.arcToRelative(8.13f, 8.13f, 0.0f, false, true, -2.93f, 0.55f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.44f, -5.08f);
        pathBuilder.curveTo(196.35f, 156.19f, 192.0f, 129.75f, 192.0f, 104.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, false, 96.43f, 48.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.9f, -13.91f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 35.35f, 8.05f, 58.59f, 10.52f, 64.88f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 214.0f, 179.25f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bellSimpleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
