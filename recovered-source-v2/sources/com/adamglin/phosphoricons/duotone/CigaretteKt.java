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

/* compiled from: Cigarette.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cigarette", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCigarette", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cigarette", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CigaretteKt {
    private static ImageVector _cigarette;

    public static final ImageVector getCigarette(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _cigarette;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cigarette", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(88.0f, 136.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(224.0f, 128.0f);
        pathBuilder2.lineTo(32.0f, 128.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(224.0f, 192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(240.0f, 144.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 144.0f);
        pathBuilder2.lineTo(80.0f, 144.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.lineTo(32.0f, 176.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 176.0f);
        pathBuilder2.lineTo(96.0f, 176.0f);
        pathBuilder2.lineTo(96.0f, 144.0f);
        pathBuilder2.lineTo(224.0f, 144.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(201.0f, 60.08f);
        pathBuilder2.curveToRelative(8.0f, -14.23f, 7.42f, -21.71f, 6.36f, -24.91f);
        pathBuilder2.arcToRelative(7.79f, 7.79f, 0.0f, false, false, -2.64f, -3.86f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.5f, -14.62f);
        pathBuilder2.arcToRelative(22.57f, 22.57f, 0.0f, false, true, 11.32f, 13.44f);
        pathBuilder2.curveToRelative(3.36f, 10.14f, 0.81f, 22.85f, -7.6f, 37.79f);
        pathBuilder2.curveToRelative(-8.0f, 14.23f, -7.42f, 21.72f, -6.36f, 24.92f);
        pathBuilder2.arcToRelative(7.79f, 7.79f, 0.0f, false, false, 2.64f, 3.85f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -6.5f, 14.62f);
        pathBuilder2.arcToRelative(22.53f, 22.53f, 0.0f, false, true, -11.32f, -13.44f);
        pathBuilder2.curveTo(190.07f, 87.73f, 192.62f, 75.0f, 201.0f, 60.08f);
        pathBuilder2.close();
        pathBuilder2.moveTo(161.0f, 60.08f);
        pathBuilder2.curveToRelative(8.0f, -14.23f, 7.42f, -21.71f, 6.36f, -24.91f);
        pathBuilder2.arcToRelative(7.79f, 7.79f, 0.0f, false, false, -2.64f, -3.86f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.5f, -14.62f);
        pathBuilder2.arcToRelative(22.57f, 22.57f, 0.0f, false, true, 11.32f, 13.44f);
        pathBuilder2.curveToRelative(3.36f, 10.14f, 0.81f, 22.85f, -7.6f, 37.79f);
        pathBuilder2.curveToRelative(-8.0f, 14.23f, -7.42f, 21.72f, -6.36f, 24.92f);
        pathBuilder2.arcToRelative(7.79f, 7.79f, 0.0f, false, false, 2.64f, 3.85f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -6.5f, 14.62f);
        pathBuilder2.arcToRelative(22.53f, 22.53f, 0.0f, false, true, -11.32f, -13.44f);
        pathBuilder2.curveTo(150.07f, 87.73f, 152.62f, 75.0f, 161.0f, 60.08f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cigarette = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
