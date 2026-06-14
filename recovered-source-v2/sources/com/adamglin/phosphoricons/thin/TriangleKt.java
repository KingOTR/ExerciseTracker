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

/* compiled from: Triangle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Triangle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTriangle", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_triangle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriangleKt {
    private static ImageVector _triangle;

    public static final ImageVector getTriangle(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _triangle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Triangle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(233.34f, 190.09f);
        pathBuilder.lineTo(145.88f, 38.22f);
        pathBuilder.arcToRelative(20.75f, 20.75f, 0.0f, false, false, -35.76f, 0.0f);
        pathBuilder.lineTo(22.66f, 190.09f);
        pathBuilder.arcToRelative(19.52f, 19.52f, 0.0f, false, false, 0.0f, 19.71f);
        pathBuilder.arcTo(20.36f, 20.36f, 0.0f, false, false, 40.54f, 220.0f);
        pathBuilder.horizontalLineTo(215.46f);
        pathBuilder.arcToRelative(20.36f, 20.36f, 0.0f, false, false, 17.86f, -10.2f);
        pathBuilder.arcTo(19.52f, 19.52f, 0.0f, false, false, 233.34f, 190.09f);
        pathBuilder.close();
        pathBuilder.moveTo(226.4f, 205.8f);
        pathBuilder.arcToRelative(12.47f, 12.47f, 0.0f, false, true, -10.94f, 6.2f);
        pathBuilder.horizontalLineTo(40.54f);
        pathBuilder.arcToRelative(12.47f, 12.47f, 0.0f, false, true, -10.94f, -6.2f);
        pathBuilder.arcToRelative(11.45f, 11.45f, 0.0f, false, true, 0.0f, -11.72f);
        pathBuilder.lineTo(117.05f, 42.21f);
        pathBuilder.arcToRelative(12.76f, 12.76f, 0.0f, false, true, 21.9f, 0.0f);
        pathBuilder.lineTo(226.4f, 194.08f);
        pathBuilder.arcTo(11.45f, 11.45f, 0.0f, false, true, 226.4f, 205.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _triangle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
