package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Lightningslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LightningSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getLightningSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightningSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningslashKt {
    private static ImageVector _lightningSlash;

    public static final ImageVector getLightningSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(105.72f, 67.81f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.42f);
        pathBuilder.lineToRelative(48.39f, -51.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.7f, 7.0f);
        pathBuilder.lineTo(153.18f, 90.9f);
        pathBuilder.lineToRelative(57.43f, 21.53f);
        pathBuilder.arcToRelative(8.24f, 8.24f, 0.0f, false, true, 4.22f, 3.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.0f, 9.63f);
        pathBuilder.lineToRelative(-25.27f, 27.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.88f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(133.48f, 122.13f);
        pathBuilder.lineTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineTo(81.34f, 88.56f);
        pathBuilder.lineToRelative(-39.0f, 41.83f);
        pathBuilder.arcTo(8.15f, 8.15f, 0.0f, false, false, 40.0f, 135.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.16f, 8.18f);
        pathBuilder.lineToRelative(57.63f, 21.61f);
        pathBuilder.lineTo(88.16f, 238.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.69f, 7.0f);
        pathBuilder.lineToRelative(61.86f, -66.28f);
        pathBuilder.lineToRelative(38.37f, 42.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightningSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
