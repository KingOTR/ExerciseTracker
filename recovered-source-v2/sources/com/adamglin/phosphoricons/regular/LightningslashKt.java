package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Lightningslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LightningSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getLightningSlash", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightningSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningslashKt {
    private static ImageVector _lightningSlash;

    public static final ImageVector getLightningSlash(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _lightningSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LightningSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineTo(81.33f, 88.56f);
        pathBuilder.lineToRelative(-39.18f, 42.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, 13.0f);
        pathBuilder.lineToRelative(57.63f, 21.61f);
        pathBuilder.lineTo(88.16f, 238.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.69f, 7.0f);
        pathBuilder.lineToRelative(61.86f, -66.28f);
        pathBuilder.lineToRelative(38.37f, 42.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        pathBuilder.moveTo(109.37f, 214.0f);
        pathBuilder.lineToRelative(10.47f, -52.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -9.06f);
        pathBuilder.lineTo(62.0f, 132.71f);
        pathBuilder.lineToRelative(30.12f, -32.27f);
        pathBuilder.lineToRelative(60.78f, 66.86f);
        pathBuilder.close();
        pathBuilder.moveTo(108.66f, 71.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.39f, -11.31f);
        pathBuilder.lineToRelative(45.88f, -49.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.69f, 7.0f);
        pathBuilder.lineTo(153.18f, 90.9f);
        pathBuilder.lineToRelative(57.63f, 21.61f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.0f, 12.95f);
        pathBuilder.lineToRelative(-22.3f, 23.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.7f, -10.91f);
        pathBuilder.lineTo(194.0f, 123.29f);
        pathBuilder.lineToRelative(-52.8f, -19.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.0f, -9.06f);
        pathBuilder.lineToRelative(10.47f, -52.38f);
        pathBuilder.lineTo(120.0f, 70.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 108.66f, 71.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightningSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
