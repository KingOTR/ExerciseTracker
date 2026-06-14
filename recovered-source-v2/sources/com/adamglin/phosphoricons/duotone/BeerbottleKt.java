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

/* compiled from: Beerbottle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BeerBottle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBeerBottle", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_beerBottle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeerbottleKt {
    private static ImageVector _beerBottle;

    public static final ImageVector getBeerBottle(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _beerBottle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BeerBottle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 160.0f);
        pathBuilder.lineToRelative(-56.0f, 56.0f);
        pathBuilder.lineTo(40.0f, 152.0f);
        pathBuilder.lineTo(96.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(245.66f, 42.34f);
        pathBuilder2.lineToRelative(-32.0f, -32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f);
        pathBuilder2.lineToRelative(1.48f, 1.47f);
        pathBuilder2.lineTo(148.65f, 64.51f);
        pathBuilder2.lineToRelative(-38.22f, 7.65f);
        pathBuilder2.arcToRelative(8.05f, 8.05f, 0.0f, false, false, -4.09f, 2.18f);
        pathBuilder2.lineTo(23.0f, 157.66f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 33.94f);
        pathBuilder2.lineTo(64.4f, 233.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.94f, 0.0f);
        pathBuilder2.lineToRelative(83.32f, -83.31f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.18f, -4.09f);
        pathBuilder2.lineToRelative(7.65f, -38.22f);
        pathBuilder2.lineToRelative(41.38f, -55.17f);
        pathBuilder2.lineToRelative(1.47f, 1.48f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(104.0f, 204.69f);
        pathBuilder2.lineTo(51.31f, 152.0f);
        pathBuilder2.lineTo(96.0f, 107.31f);
        pathBuilder2.lineTo(148.69f, 160.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(81.37f, 224.0f);
        pathBuilder2.arcToRelative(7.94f, 7.94f, 0.0f, false, true, -5.65f, -2.34f);
        pathBuilder2.lineTo(34.34f, 180.28f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f);
        pathBuilder2.lineTo(40.0f, 163.31f);
        pathBuilder2.lineTo(92.69f, 216.0f);
        pathBuilder2.lineTo(87.0f, 221.66f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 81.37f, 224.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(177.6f, 99.2f);
        pathBuilder2.arcToRelative(7.92f, 7.92f, 0.0f, false, false, -1.44f, 3.23f);
        pathBuilder2.lineToRelative(-7.53f, 37.63f);
        pathBuilder2.lineTo(160.0f, 148.69f);
        pathBuilder2.lineTo(107.31f, 96.0f);
        pathBuilder2.lineToRelative(8.63f, -8.63f);
        pathBuilder2.lineToRelative(37.63f, -7.53f);
        pathBuilder2.arcToRelative(7.92f, 7.92f, 0.0f, false, false, 3.23f, -1.44f);
        pathBuilder2.lineToRelative(58.45f, -43.84f);
        pathBuilder2.lineToRelative(6.19f, 6.19f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _beerBottle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
