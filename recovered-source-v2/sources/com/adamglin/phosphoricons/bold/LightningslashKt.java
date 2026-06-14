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

/* compiled from: Lightningslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LightningSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLightningSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightningSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningslashKt {
    private static ImageVector _lightningSlash;

    public static final ImageVector getLightningSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(56.88f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f);
        pathBuilder.lineTo(75.9f, 88.52f);
        pathBuilder.lineTo(39.23f, 127.81f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.31f, 19.33f);
        pathBuilder.lineToRelative(51.18f, 20.47f);
        pathBuilder.lineTo(84.13f, 238.22f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.64f, 10.0f);
        pathBuilder.lineToRelative(58.9f, -63.11f);
        pathBuilder.lineToRelative(35.45f, 39.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(113.6f, 203.55f);
        pathBuilder.lineToRelative(6.27f, -41.77f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.41f, -12.92f);
        pathBuilder.lineTo(68.74f, 131.37f);
        pathBuilder.lineToRelative(23.35f, -25.0f);
        pathBuilder.lineToRelative(55.38f, 60.92f);
        pathBuilder.close();
        pathBuilder.moveTo(111.41f, 68.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.59f, -17.0f);
        pathBuilder.lineTo(151.23f, 7.81f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.64f, 10.0f);
        pathBuilder.lineTo(161.28f, 88.39f);
        pathBuilder.lineToRelative(51.18f, 20.47f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.31f, 19.33f);
        pathBuilder.lineToRelative(-16.82f, 18.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.55f, -16.38f);
        pathBuilder.lineToRelative(4.86f, -5.21f);
        pathBuilder.lineToRelative(-43.72f, -17.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.41f, -12.92f);
        pathBuilder.lineToRelative(6.27f, -41.77f);
        pathBuilder.lineToRelative(-14.0f, 15.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 111.41f, 68.06f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightningSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
