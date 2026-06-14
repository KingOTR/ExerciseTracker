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

/* compiled from: Gavel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Gavel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGavel", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gavel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GavelKt {
    private static ImageVector _gavel;

    public static final ImageVector getGavel(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _gavel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Gavel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.14f, 113.86f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -23.06f, -3.75f);
        pathBuilder.lineToRelative(-45.2f, -45.2f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -3.74f, -23.06f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f);
        pathBuilder.lineToRelative(-64.0f, 64.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f);
        pathBuilder.lineToRelative(16.0f, 16.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 23.0f, 3.79f);
        pathBuilder.lineTo(29.36f, 181.38f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.26f, 45.26f);
        pathBuilder.lineTo(134.0f, 167.21f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 3.81f, 22.94f);
        pathBuilder.lineToRelative(16.0f, 16.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f);
        pathBuilder.lineToRelative(64.0f, -64.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.29f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 98.34f);
        pathBuilder.lineTo(69.64f, 88.0f);
        pathBuilder.lineTo(128.0f, 29.65f);
        pathBuilder.lineTo(138.34f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(57.64f, 209.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f);
        pathBuilder.lineToRelative(59.52f, -59.52f);
        pathBuilder.lineToRelative(11.31f, 11.32f);
        pathBuilder.close();
        pathBuilder.moveTo(150.34f, 149.38f);
        pathBuilder.lineTo(106.62f, 105.66f);
        pathBuilder.lineTo(145.62f, 66.66f);
        pathBuilder.lineTo(189.34f, 110.38f);
        pathBuilder.close();
        pathBuilder.moveTo(167.99f, 186.38f);
        pathBuilder.lineTo(157.65f, 176.0f);
        pathBuilder.lineTo(216.0f, 117.66f);
        pathBuilder.lineTo(226.34f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gavel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
