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

/* compiled from: Hairdryer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HairDryer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHairDryer", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hairDryer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HairdryerKt {
    private static ImageVector _hairDryer;

    public static final ImageVector getHairDryer(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 88.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 200.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(181.06f, 208.28f);
        pathBuilder.lineTo(212.31f, 139.52f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 168.0f, 20.0f);
        pathBuilder.arcToRelative(11.81f, 11.81f, 0.0f, false, false, -2.0f, 0.16f);
        pathBuilder.lineTo(28.71f, 43.05f);
        pathBuilder.arcTo(19.94f, 19.94f, 0.0f, false, false, 12.0f, 62.78f);
        pathBuilder.verticalLineToRelative(50.44f);
        pathBuilder.arcTo(19.94f, 19.94f, 0.0f, false, false, 28.71f, 133.0f);
        pathBuilder.lineTo(124.0f, 148.83f);
        pathBuilder.lineTo(124.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.69f, 19.7f);
        pathBuilder.arcTo(44.06f, 44.06f, 0.0f, false, false, 184.0f, 256.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(184.0f, 232.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -18.41f, -12.19f);
        pathBuilder.arcTo(20.09f, 20.09f, 0.0f, false, false, 181.06f, 208.28f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 66.17f);
        pathBuilder.lineTo(168.93f, 44.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, 88.0f);
        pathBuilder.lineTo(36.0f, 109.83f);
        pathBuilder.close();
        pathBuilder.moveTo(166.0f, 155.84f);
        pathBuilder.arcToRelative(11.81f, 11.81f, 0.0f, false, false, 2.0f, 0.16f);
        pathBuilder.arcToRelative(68.08f, 68.08f, 0.0f, false, false, 10.85f, -0.88f);
        pathBuilder.lineTo(160.27f, 196.0f);
        pathBuilder.lineTo(148.0f, 196.0f);
        pathBuilder.lineTo(148.0f, 152.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hairDryer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
