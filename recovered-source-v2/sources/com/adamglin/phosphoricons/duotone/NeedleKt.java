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

/* compiled from: Needle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Needle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getNeedle", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_needle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NeedleKt {
    private static ImageVector _needle;

    public static final ImageVector getNeedle(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _needle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Needle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(206.63f, 94.63f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.curveTo(128.0f, 128.0f, 40.0f, 216.0f, 40.0f, 216.0f);
        pathBuilder.reflectiveCurveToRelative(88.0f, -88.0f, 97.37f, -142.63f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 45.26f, 45.26f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(189.66f, 66.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder2.lineToRelative(-16.0f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder2.lineToRelative(16.0f, -16.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 189.66f, 66.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 72.0f);
        pathBuilder2.arcToRelative(39.71f, 39.71f, 0.0f, false, true, -11.72f, 28.28f);
        pathBuilder2.lineToRelative(-24.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.3f, 2.23f);
        pathBuilder2.curveToRelative(-51.49f, 8.84f, -137.46f, 94.28f, -138.32f, 95.15f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveTo(36.0f, 208.73f, 120.69f, 123.28f, 129.49f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.23f, -4.3f);
        pathBuilder2.lineToRelative(24.0f, -24.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, true, 224.0f, 72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 72.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -41.0f, -17.0f);
        pathBuilder2.lineTo(144.77f, 77.29f);
        pathBuilder2.curveToRelative(-4.41f, 21.15f, -18.9f, 46.19f, -35.49f, 69.43f);
        pathBuilder2.curveToRelative(23.24f, -16.59f, 48.28f, -31.08f, 69.43f, -35.49f);
        pathBuilder2.lineTo(201.0f, 89.0f);
        pathBuilder2.arcTo(23.85f, 23.85f, 0.0f, false, false, 208.0f, 72.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _needle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
