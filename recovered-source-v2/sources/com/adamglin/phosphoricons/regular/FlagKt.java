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

/* compiled from: Flag.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flag", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFlag", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flag", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagKt {
    private static ImageVector _flag;

    public static final ImageVector getFlag(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _flag;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flag", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(42.76f, 50.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 56.0f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(179.77f);
        pathBuilder.curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.41f);
        pathBuilder.curveToRelative(16.4f, 8.11f, 34.06f, 16.85f, 53.0f, 16.85f);
        pathBuilder.curveToRelative(13.93f, 0.0f, 28.54f, -4.75f, 43.82f, -18.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.76f, -6.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 218.76f, 50.0f);
        pathBuilder.curveToRelative(-28.0f, 24.23f, -51.72f, 12.49f, -79.21f, -1.12f);
        pathBuilder.curveTo(111.07f, 34.76f, 78.78f, 18.79f, 42.76f, 50.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 172.25f);
        pathBuilder.curveToRelative(-26.79f, 21.16f, -49.87f, 9.74f, -76.45f, -3.41f);
        pathBuilder.curveToRelative(-25.0f, -12.35f, -52.81f, -26.13f, -83.55f, -8.4f);
        pathBuilder.verticalLineTo(59.79f);
        pathBuilder.curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.4f);
        pathBuilder.curveToRelative(25.0f, 12.35f, 52.82f, 26.13f, 83.55f, 8.4f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flag = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
