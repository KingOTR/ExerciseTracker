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

/* compiled from: Dropslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getDropSlash", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropslashKt {
    private static ImageVector _dropSlash;

    public static final ImageVector getDropSlash(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _dropSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineTo(64.72f, 70.29f);
        pathBuilder.curveTo(48.32f, 95.0f, 40.0f, 119.78f, 40.0f, 144.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 149.21f, 63.22f);
        pathBuilder.lineToRelative(12.87f, 14.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 216.0f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f);
        pathBuilder.curveToRelative(0.0f, -19.93f, 6.68f, -40.57f, 19.86f, -61.46f);
        pathBuilder.lineTo(178.43f, 195.36f);
        pathBuilder.arcTo(71.84f, 71.84f, 0.0f, false, true, 128.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.0f, 50.51f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.27f, -11.31f);
        pathBuilder.arcTo(247.8f, 247.8f, 0.0f, false, true, 123.41f, 9.45f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.18f, 0.0f);
        pathBuilder.curveTo(136.0f, 11.83f, 216.0f, 68.7f, 216.0f, 144.0f);
        pathBuilder.arcToRelative(88.08f, 88.08f, 0.0f, false, true, -3.15f, 23.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.71f, 5.88f);
        pathBuilder.arcTo(7.79f, 7.79f, 0.0f, false, true, 203.0f, 173.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.59f, -9.83f);
        pathBuilder.arcTo(72.55f, 72.55f, 0.0f, false, false, 200.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -57.24f, -55.48f, -105.0f, -72.0f, -118.0f);
        pathBuilder.arcToRelative(252.23f, 252.23f, 0.0f, false, false, -26.66f, 24.23f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 90.0f, 50.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
