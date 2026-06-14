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

/* compiled from: Hairdryer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HairDryer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHairDryer", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hairDryer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HairdryerKt {
    private static ImageVector _hairDryer;

    public static final ImageVector getHairDryer(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _hairDryer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HairDryer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(196.0f, 88.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 196.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 108.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 168.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.85f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.92f, -7.0f);
        pathBuilder.lineToRelative(32.0f, -70.39f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 168.0f, 28.0f);
        pathBuilder.arcToRelative(4.89f, 4.89f, 0.0f, false, false, -0.66f, 0.05f);
        pathBuilder.lineTo(30.0f, 50.94f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 62.78f);
        pathBuilder.verticalLineToRelative(50.44f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, 11.84f);
        pathBuilder.lineToRelative(102.0f, 17.0f);
        pathBuilder.lineTo(132.0f, 200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(184.0f, 244.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 113.22f);
        pathBuilder.lineTo(28.0f, 62.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.34f, -4.0f);
        pathBuilder.lineTo(168.33f, 36.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, 104.0f);
        pathBuilder.lineToRelative(-137.0f, -22.83f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 113.22f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 200.0f);
        pathBuilder.lineTo(140.0f, 143.39f);
        pathBuilder.lineTo(167.34f, 148.0f);
        pathBuilder.arcToRelative(4.89f, 4.89f, 0.0f, false, false, 0.66f, 0.05f);
        pathBuilder.arcToRelative(59.62f, 59.62f, 0.0f, false, false, 25.46f, -5.69f);
        pathBuilder.lineToRelative(-27.0f, 59.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.64f, 2.35f);
        pathBuilder.lineTo(144.0f, 204.05f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hairDryer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
