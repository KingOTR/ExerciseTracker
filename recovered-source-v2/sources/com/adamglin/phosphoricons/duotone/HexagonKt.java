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

/* compiled from: Hexagon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hexagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHexagon", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hexagon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HexagonKt {
    private static ImageVector _hexagon;

    public static final ImageVector getHexagon(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _hexagon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hexagon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 80.18f);
        pathBuilder.verticalLineToRelative(95.64f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.16f, 7.0f);
        pathBuilder.lineToRelative(-88.0f, 48.18f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.68f, 0.0f);
        pathBuilder.lineToRelative(-88.0f, -48.18f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.16f, -7.0f);
        pathBuilder.verticalLineTo(80.18f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.16f, -7.0f);
        pathBuilder.lineToRelative(88.0f, -48.18f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.68f, 0.0f);
        pathBuilder.lineToRelative(88.0f, 48.18f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 80.18f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(223.68f, 66.15f);
        pathBuilder2.lineTo(135.68f, 18.0f);
        pathBuilder2.arcToRelative(15.88f, 15.88f, 0.0f, false, false, -15.36f, 0.0f);
        pathBuilder2.lineToRelative(-88.0f, 48.17f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.32f, 14.0f);
        pathBuilder2.verticalLineToRelative(95.64f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, 14.0f);
        pathBuilder2.lineToRelative(88.0f, 48.17f);
        pathBuilder2.arcToRelative(15.88f, 15.88f, 0.0f, false, false, 15.36f, 0.0f);
        pathBuilder2.lineToRelative(88.0f, -48.17f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, -14.0f);
        pathBuilder2.verticalLineTo(80.18f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 223.68f, 66.15f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 175.82f);
        pathBuilder2.lineTo(128.0f, 224.0f);
        pathBuilder2.lineTo(40.0f, 175.82f);
        pathBuilder2.verticalLineTo(80.18f);
        pathBuilder2.lineTo(128.0f, 32.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineToRelative(88.0f, 48.17f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hexagon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
