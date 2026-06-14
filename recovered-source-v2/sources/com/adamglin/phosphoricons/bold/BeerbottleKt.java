package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Beerbottle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BeerBottle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBeerBottle", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_beerBottle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeerbottleKt {
    private static ImageVector _beerBottle;

    public static final ImageVector getBeerBottle(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(248.49f, 39.51f);
        pathBuilder.lineToRelative(-32.0f, -32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.55f, 15.0f);
        pathBuilder.lineTo(147.0f, 60.77f);
        pathBuilder.lineToRelative(-37.33f, 7.46f);
        pathBuilder.arcToRelative(12.09f, 12.09f, 0.0f, false, false, -6.14f, 3.28f);
        pathBuilder.lineTo(20.2f, 154.83f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f);
        pathBuilder.lineTo(61.57f, 235.8f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f);
        pathBuilder.lineToRelative(83.32f, -83.31f);
        pathBuilder.arcToRelative(12.09f, 12.09f, 0.0f, false, false, 3.28f, -6.14f);
        pathBuilder.lineTo(195.23f, 109.0f);
        pathBuilder.lineToRelative(38.23f, -51.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.0f, -18.55f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 191.0f);
        pathBuilder.lineTo(65.0f, 144.0f);
        pathBuilder.lineToRelative(31.0f, -31.0f);
        pathBuilder.lineToRelative(47.0f, 47.0f);
        pathBuilder.close();
        pathBuilder.moveTo(81.37f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, -1.17f);
        pathBuilder.lineTo(37.17f, 177.46f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f);
        pathBuilder.lineTo(48.0f, 161.0f);
        pathBuilder.lineToRelative(47.0f, 47.0f);
        pathBuilder.lineTo(84.2f, 218.83f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 81.37f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(174.37f, 96.8f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.17f, 4.85f);
        pathBuilder.lineTo(165.0f, 138.08f);
        pathBuilder.lineTo(160.0f, 143.0f);
        pathBuilder.lineTo(113.0f, 96.0f);
        pathBuilder.lineToRelative(5.0f, -5.0f);
        pathBuilder.lineToRelative(36.43f, -7.28f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.85f, -2.17f);
        pathBuilder.lineToRelative(55.67f, -41.76f);
        pathBuilder.lineToRelative(1.29f, 1.29f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _beerBottle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
