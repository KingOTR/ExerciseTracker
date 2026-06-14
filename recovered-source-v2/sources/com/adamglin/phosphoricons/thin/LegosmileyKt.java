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

/* compiled from: Legosmiley.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LegoSmiley", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLegoSmiley", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_legoSmiley", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegosmileyKt {
    private static ImageVector _legoSmiley;

    public static final ImageVector getLegoSmiley(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _legoSmiley;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LegoSmiley", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(100.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(153.87f, 148.62f);
        pathBuilder.arcToRelative(49.0f, 49.0f, 0.0f, false, true, -51.74f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.26f, 6.77f);
        pathBuilder.arcToRelative(57.0f, 57.0f, 0.0f, false, false, 60.26f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.26f, -6.76f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -24.0f, 27.71f);
        pathBuilder.lineTo(188.0f, 224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(80.0f, 236.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.lineTo(68.0f, 203.71f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 44.0f, 176.0f);
        pathBuilder.lineTo(44.0f, 80.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 72.0f, 52.0f);
        pathBuilder.lineTo(92.0f, 52.0f);
        pathBuilder.lineTo(92.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f);
        pathBuilder.lineTo(164.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 212.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.lineTo(156.0f, 32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(104.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 224.0f);
        pathBuilder.lineTo(180.0f, 204.0f);
        pathBuilder.lineTo(76.0f, 204.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 180.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 80.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(72.0f, 60.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(184.0f, 196.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _legoSmiley = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
