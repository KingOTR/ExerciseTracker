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

/* compiled from: Binoculars.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Binoculars", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBinoculars", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_binoculars", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BinocularsKt {
    private static ImageVector _binoculars;

    public static final ImageVector getBinoculars(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _binoculars;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Binoculars", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(231.22f, 148.09f);
        pathBuilder.lineTo(189.6f, 53.41f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, false, -0.83f, -1.22f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 148.0f, 55.0f);
        pathBuilder.lineTo(148.0f, 84.0f);
        pathBuilder.lineTo(108.0f, 84.0f);
        pathBuilder.lineTo(108.0f, 55.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, false, -0.83f, 1.22f);
        pathBuilder.lineTo(24.78f, 148.09f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, true, false, 108.0f, 168.0f);
        pathBuilder.lineTo(108.0f, 92.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, 83.22f, -19.91f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 204.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 64.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 124.0f);
        pathBuilder.arcToRelative(43.78f, 43.78f, 0.0f, false, false, -22.66f, 6.3f);
        pathBuilder.lineTo(73.4f, 57.35f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 26.6f, -0.59f);
        pathBuilder.verticalLineToRelative(86.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 64.0f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 56.77f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 26.6f, 0.59f);
        pathBuilder.lineToRelative(32.06f, 72.94f);
        pathBuilder.arcTo(43.92f, 43.92f, 0.0f, false, false, 156.0f, 142.74f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 204.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 192.0f, 204.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _binoculars = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
