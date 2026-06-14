package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Beerbottle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BeerBottle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBeerBottle", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_beerBottle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeerbottleKt {
    private static ImageVector _beerBottle;

    public static final ImageVector getBeerBottle(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(242.83f, 45.17f);
        pathBuilder.lineToRelative(-32.0f, -32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f);
        pathBuilder.lineToRelative(4.74f, 4.74f);
        pathBuilder.lineTo(150.33f, 68.26f);
        pathBuilder.lineToRelative(-39.11f, 7.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.0f, 1.09f);
        pathBuilder.lineTo(25.86f, 160.49f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f);
        pathBuilder.lineToRelative(41.37f, 41.37f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f);
        pathBuilder.lineToRelative(83.32f, -83.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.09f, -2.05f);
        pathBuilder.lineToRelative(7.82f, -39.11f);
        pathBuilder.lineToRelative(44.69f, -59.58f);
        pathBuilder.lineToRelative(4.74f, 4.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(89.83f, 224.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f);
        pathBuilder.lineTo(31.51f, 183.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f);
        pathBuilder.lineTo(40.0f, 157.66f);
        pathBuilder.lineTo(98.34f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 210.34f);
        pathBuilder.lineTo(45.66f, 152.0f);
        pathBuilder.lineTo(96.0f, 101.66f);
        pathBuilder.lineTo(154.34f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.8f, 101.6f);
        pathBuilder.arcToRelative(3.89f, 3.89f, 0.0f, false, false, -0.72f, 1.62f);
        pathBuilder.lineTo(172.32f, 142.0f);
        pathBuilder.lineTo(160.0f, 154.34f);
        pathBuilder.lineTo(101.66f, 96.0f);
        pathBuilder.lineTo(114.0f, 83.68f);
        pathBuilder.lineToRelative(38.81f, -7.76f);
        pathBuilder.arcToRelative(3.89f, 3.89f, 0.0f, false, false, 1.62f, -0.72f);
        pathBuilder.lineToRelative(61.22f, -45.92f);
        pathBuilder.lineToRelative(11.1f, 11.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _beerBottle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
