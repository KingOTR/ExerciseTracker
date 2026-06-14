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
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Link.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {HttpHeaders.LINK, "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getLink", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_link", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkKt {
    private static ImageVector _link;

    public static final ImageVector getLink(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _link;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder(HttpHeaders.LINK, Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(218.34f, 119.6f);
        pathBuilder.lineTo(183.6f, 154.34f);
        pathBuilder.arcToRelative(46.58f, 46.58f, 0.0f, false, true, -44.31f, 12.26f);
        pathBuilder.curveToRelative(-0.31f, 0.34f, -0.62f, 0.67f, -0.95f, 1.0f);
        pathBuilder.lineTo(103.6f, 202.34f);
        pathBuilder.arcTo(46.63f, 46.63f, 0.0f, true, true, 37.66f, 136.4f);
        pathBuilder.lineTo(72.4f, 101.66f);
        pathBuilder.arcTo(46.6f, 46.6f, 0.0f, false, true, 116.71f, 89.4f);
        pathBuilder.curveToRelative(0.31f, -0.34f, 0.62f, -0.67f, 1.0f, -1.0f);
        pathBuilder.lineTo(152.4f, 53.66f);
        pathBuilder.arcToRelative(46.63f, 46.63f, 0.0f, false, true, 65.94f, 65.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(240.0f, 88.23f);
        pathBuilder2.arcToRelative(54.43f, 54.43f, 0.0f, false, true, -16.0f, 37.0f);
        pathBuilder2.lineTo(189.25f, 160.0f);
        pathBuilder2.arcToRelative(54.27f, 54.27f, 0.0f, false, true, -38.63f, 16.0f);
        pathBuilder2.horizontalLineToRelative(-0.05f);
        pathBuilder2.arcTo(54.63f, 54.63f, 0.0f, false, true, 96.0f, 119.84f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.45f);
        pathBuilder2.arcTo(38.62f, 38.62f, 0.0f, false, false, 150.58f, 160.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(38.39f, 38.39f, 0.0f, false, false, 27.31f, -11.31f);
        pathBuilder2.lineToRelative(34.75f, -34.75f);
        pathBuilder2.arcToRelative(38.63f, 38.63f, 0.0f, false, false, -54.63f, -54.63f);
        pathBuilder2.lineToRelative(-11.0f, 11.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 135.7f, 59.0f);
        pathBuilder2.lineToRelative(11.0f, -11.0f);
        pathBuilder2.arcTo(54.65f, 54.65f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder2.arcTo(54.86f, 54.86f, 0.0f, false, true, 240.0f, 88.23f);
        pathBuilder2.close();
        pathBuilder2.moveTo(109.0f, 185.66f);
        pathBuilder2.lineToRelative(-11.0f, 11.0f);
        pathBuilder2.arcTo(38.41f, 38.41f, 0.0f, false, true, 70.6f, 208.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(38.63f, 38.63f, 0.0f, false, true, -27.29f, -65.94f);
        pathBuilder2.lineTo(78.0f, 107.31f);
        pathBuilder2.arcTo(38.63f, 38.63f, 0.0f, false, true, 144.0f, 135.71f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.78f, 8.22f);
        pathBuilder2.horizontalLineTo(152.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -7.78f);
        pathBuilder2.arcTo(54.86f, 54.86f, 0.0f, false, false, 144.0f, 96.0f);
        pathBuilder2.arcToRelative(54.65f, 54.65f, 0.0f, false, false, -77.27f, 0.0f);
        pathBuilder2.lineTo(32.0f, 130.75f);
        pathBuilder2.arcTo(54.62f, 54.62f, 0.0f, false, false, 70.56f, 224.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(54.28f, 54.28f, 0.0f, false, false, 38.64f, -16.0f);
        pathBuilder2.lineToRelative(11.0f, -11.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 109.0f, 185.66f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _link = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
