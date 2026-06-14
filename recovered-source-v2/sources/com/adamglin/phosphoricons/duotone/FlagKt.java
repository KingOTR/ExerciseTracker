package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flag.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flag", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFlag", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flag", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagKt {
    private static ImageVector _flag;

    public static final ImageVector getFlag(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 56.0f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.curveToRelative(-64.0f, 55.43f, -112.0f, -55.43f, -176.0f, 0.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.curveTo(112.0f, 0.57f, 160.0f, 111.43f, 224.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(42.76f, 50.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 56.0f);
        pathBuilder2.verticalLineTo(224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.verticalLineTo(179.77f);
        pathBuilder2.curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.41f);
        pathBuilder2.curveToRelative(16.4f, 8.11f, 34.06f, 16.85f, 53.0f, 16.85f);
        pathBuilder2.curveToRelative(13.93f, 0.0f, 28.54f, -4.75f, 43.82f, -18.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.76f, -6.0f);
        pathBuilder2.verticalLineTo(56.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 218.76f, 50.0f);
        pathBuilder2.curveToRelative(-28.0f, 24.23f, -51.72f, 12.49f, -79.21f, -1.12f);
        pathBuilder2.curveTo(111.07f, 34.76f, 78.78f, 18.79f, 42.76f, 50.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 172.25f);
        pathBuilder2.curveToRelative(-26.79f, 21.16f, -49.87f, 9.74f, -76.45f, -3.41f);
        pathBuilder2.curveToRelative(-25.0f, -12.35f, -52.81f, -26.13f, -83.55f, -8.4f);
        pathBuilder2.verticalLineTo(59.79f);
        pathBuilder2.curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.4f);
        pathBuilder2.curveToRelative(25.0f, 12.35f, 52.82f, 26.13f, 83.55f, 8.4f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flag = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
