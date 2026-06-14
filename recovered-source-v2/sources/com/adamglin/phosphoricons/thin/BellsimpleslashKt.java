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

/* compiled from: Bellsimpleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BellSimpleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBellSimpleSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bellSimpleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellsimpleslashKt {
    private static ImageVector _bellSimpleSlash;

    public static final ImageVector getBellSimpleSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _bellSimpleSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BellSimpleSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(71.75f, 60.18f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f);
        pathBuilder.lineTo(63.8f, 63.32f);
        pathBuilder.arcTo(75.52f, 75.52f, 0.0f, false, false, 52.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 36.13f, -8.58f, 64.0f, -14.36f, 73.95f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 196.0f);
        pathBuilder.lineTo(184.41f, 196.0f);
        pathBuilder.lineTo(205.0f, 218.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 188.0f);
        pathBuilder.arcToRelative(3.89f, 3.89f, 0.0f, false, true, -3.43f, -2.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -4.0f);
        pathBuilder.curveTo(52.0f, 169.17f, 60.0f, 139.32f, 60.0f, 104.0f);
        pathBuilder.arcToRelative(67.58f, 67.58f, 0.0f, false, true, 9.4f, -34.51f);
        pathBuilder.lineTo(177.14f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(96.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.53f, 175.52f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, -1.46f, 0.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.72f, -2.54f);
        pathBuilder.curveTo(200.24f, 155.17f, 196.0f, 129.28f, 196.0f, 104.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 94.46f, 44.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.0f, -6.95f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 204.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 36.05f, 8.26f, 59.89f, 10.79f, 66.34f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 212.53f, 175.52f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bellSimpleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
