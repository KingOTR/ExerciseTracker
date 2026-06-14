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

/* compiled from: Beerbottle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BeerBottle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBeerBottle", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_beerBottle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeerbottleKt {
    private static ImageVector _beerBottle;

    public static final ImageVector getBeerBottle(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(244.24f, 43.76f);
        pathBuilder.lineToRelative(-32.0f, -32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f);
        pathBuilder.lineToRelative(3.11f, 3.11f);
        pathBuilder.lineToRelative(-57.38f, 43.0f);
        pathBuilder.lineToRelative(-38.67f, 7.74f);
        pathBuilder.arcToRelative(5.92f, 5.92f, 0.0f, false, false, -3.06f, 1.64f);
        pathBuilder.lineTo(24.44f, 159.07f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 31.11f);
        pathBuilder.lineToRelative(41.38f, 41.38f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 31.11f, 0.0f);
        pathBuilder.lineToRelative(83.31f, -83.32f);
        pathBuilder.arcToRelative(5.92f, 5.92f, 0.0f, false, false, 1.64f, -3.06f);
        pathBuilder.lineToRelative(7.74f, -38.67f);
        pathBuilder.lineToRelative(43.0f, -57.38f);
        pathBuilder.lineToRelative(3.11f, 3.11f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(88.44f, 223.07f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -14.14f, 0.0f);
        pathBuilder.lineTo(32.93f, 181.7f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.14f);
        pathBuilder.lineTo(40.0f, 160.49f);
        pathBuilder.lineTo(95.51f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 207.51f);
        pathBuilder.lineTo(48.49f, 152.0f);
        pathBuilder.lineTo(96.0f, 104.49f);
        pathBuilder.lineTo(151.51f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.2f, 100.4f);
        pathBuilder.arcToRelative(5.88f, 5.88f, 0.0f, false, false, -1.08f, 2.42f);
        pathBuilder.lineTo(170.47f, 141.0f);
        pathBuilder.lineTo(160.0f, 151.51f);
        pathBuilder.lineTo(104.49f, 96.0f);
        pathBuilder.lineTo(115.0f, 85.53f);
        pathBuilder.lineToRelative(38.22f, -7.65f);
        pathBuilder.arcToRelative(5.88f, 5.88f, 0.0f, false, false, 2.42f, -1.08f);
        pathBuilder.lineToRelative(59.84f, -44.88f);
        pathBuilder.lineToRelative(8.64f, 8.64f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _beerBottle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
