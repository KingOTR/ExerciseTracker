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

/* compiled from: Liststar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ListStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getListStar", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_listStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListstarKt {
    private static ImageVector _listStar;

    public static final ImageVector getListStar(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _listStar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ListStar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(205.6f, 159.41f);
        pathBuilder.lineTo(213.67f, 192.0f);
        pathBuilder.lineTo(184.0f, 174.54f);
        pathBuilder.lineTo(154.33f, 192.0f);
        pathBuilder.lineToRelative(8.07f, -32.59f);
        pathBuilder.lineTo(136.0f, 137.61f);
        pathBuilder.lineToRelative(34.65f, -2.67f);
        pathBuilder.lineTo(184.0f, 104.0f);
        pathBuilder.lineToRelative(13.35f, 30.94f);
        pathBuilder.lineTo(232.0f, 137.61f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(32.0f, 64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.lineTo(216.0f, 56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.lineTo(40.0f, 72.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 64.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 136.0f);
        pathBuilder2.lineTo(96.0f, 136.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.lineTo(40.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(112.0f, 184.0f);
        pathBuilder2.lineTo(40.0f, 184.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(237.09f, 143.78f);
        pathBuilder2.lineTo(214.57f, 162.37f);
        pathBuilder2.lineTo(221.43f, 190.08f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.82f, 8.81f);
        pathBuilder2.lineTo(184.0f, 183.82f);
        pathBuilder2.lineToRelative(-25.61f, 15.07f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.82f, -8.81f);
        pathBuilder2.lineToRelative(6.85f, -27.71f);
        pathBuilder2.lineToRelative(-22.51f, -18.59f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.47f, -14.14f);
        pathBuilder2.lineToRelative(29.84f, -2.31f);
        pathBuilder2.lineToRelative(11.43f, -26.5f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.7f, 0.0f);
        pathBuilder2.lineToRelative(11.43f, 26.5f);
        pathBuilder2.lineToRelative(29.84f, 2.31f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.47f, 14.14f);
        pathBuilder2.close();
        pathBuilder2.moveTo(211.62f, 144.06f);
        pathBuilder2.lineTo(196.73f, 142.91f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.73f, -4.8f);
        pathBuilder2.lineToRelative(-6.0f, -13.92f);
        pathBuilder2.lineToRelative(-6.0f, 13.92f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.73f, 4.8f);
        pathBuilder2.lineToRelative(-14.89f, 1.15f);
        pathBuilder2.lineToRelative(11.11f, 9.18f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.68f, 8.09f);
        pathBuilder2.lineToRelative(-3.5f, 14.12f);
        pathBuilder2.lineToRelative(13.27f, -7.81f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.12f, 0.0f);
        pathBuilder2.lineToRelative(13.27f, 7.81f);
        pathBuilder2.lineToRelative(-3.5f, -14.12f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.68f, -8.09f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _listStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
