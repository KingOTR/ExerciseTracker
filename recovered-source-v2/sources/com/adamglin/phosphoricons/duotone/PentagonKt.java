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

/* compiled from: Pentagon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pentagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPentagon", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pentagon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PentagonKt {
    private static ImageVector _pentagon;

    public static final ImageVector getPentagon(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _pentagon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pentagon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(223.61f, 102.83f);
        pathBuilder.lineToRelative(-32.0f, 107.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 216.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.62f, -5.55f);
        pathBuilder.lineToRelative(-32.0f, -107.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.88f, -8.9f);
        pathBuilder.lineToRelative(88.0f, -68.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.46f, 0.0f);
        pathBuilder.lineToRelative(88.0f, 68.38f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 223.61f, 102.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(225.56f, 87.56f);
        pathBuilder2.lineTo(137.64f, 19.25f);
        pathBuilder2.lineToRelative(-0.18f, -0.14f);
        pathBuilder2.arcToRelative(15.93f, 15.93f, 0.0f, false, false, -18.92f, 0.0f);
        pathBuilder2.lineToRelative(-0.18f, 0.14f);
        pathBuilder2.lineTo(30.44f, 87.56f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.7f, 17.63f);
        pathBuilder2.lineToRelative(32.0f, 107.54f);
        pathBuilder2.lineToRelative(0.06f, 0.17f);
        pathBuilder2.arcTo(15.94f, 15.94f, 0.0f, false, false, 72.0f, 224.0f);
        pathBuilder2.lineTo(184.0f, 224.0f);
        pathBuilder2.arcToRelative(15.94f, 15.94f, 0.0f, false, false, 15.23f, -11.1f);
        pathBuilder2.lineToRelative(0.06f, -0.17f);
        pathBuilder2.lineToRelative(32.0f, -107.54f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 225.56f, 87.56f);
        pathBuilder2.close();
        pathBuilder2.moveTo(215.94f, 100.56f);
        pathBuilder2.lineTo(184.0f, 208.0f);
        pathBuilder2.lineTo(72.0f, 208.0f);
        pathBuilder2.lineToRelative(-32.0f, -107.44f);
        pathBuilder2.lineToRelative(-0.06f, -0.17f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineToRelative(0.18f, -0.14f);
        pathBuilder2.lineTo(128.0f, 32.0f);
        pathBuilder2.lineToRelative(87.82f, 68.23f);
        pathBuilder2.lineToRelative(0.18f, 0.14f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pentagon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
