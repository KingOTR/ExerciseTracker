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

/* compiled from: Alien.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Alien", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getAlien", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_alien", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AlienKt {
    private static ImageVector _alien;

    public static final ImageVector getAlien(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _alien;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Alien", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, -88.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, 48.6f, 56.0f, 120.0f, 88.0f, 120.0f);
        pathBuilder.reflectiveCurveToRelative(88.0f, -71.4f, 88.0f, -120.0f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 144.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 152.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 16.0f);
        pathBuilder2.arcToRelative(96.11f, 96.11f, 0.0f, false, false, -96.0f, 96.0f);
        pathBuilder2.curveToRelative(0.0f, 24.0f, 12.56f, 55.06f, 33.61f, 83.0f);
        pathBuilder2.curveToRelative(21.18f, 28.15f, 44.5f, 45.0f, 62.39f, 45.0f);
        pathBuilder2.reflectiveCurveToRelative(41.21f, -16.81f, 62.39f, -45.0f);
        pathBuilder2.curveToRelative(21.05f, -28.0f, 33.61f, -59.0f, 33.61f, -83.0f);
        pathBuilder2.arcTo(96.11f, 96.11f, 0.0f, false, false, 128.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(177.61f, 185.42f);
        pathBuilder2.curveTo(160.24f, 208.49f, 140.31f, 224.0f, 128.0f, 224.0f);
        pathBuilder2.reflectiveCurveToRelative(-32.24f, -15.51f, -49.61f, -38.58f);
        pathBuilder2.curveTo(59.65f, 160.5f, 48.0f, 132.37f, 48.0f, 112.0f);
        pathBuilder2.arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f);
        pathBuilder2.curveTo(208.0f, 132.37f, 196.35f, 160.5f, 177.61f, 185.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 136.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, false, 80.0f, 96.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 120.0f, 136.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 112.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 80.0f, 112.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(176.0f, 96.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, -40.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 96.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.0f, 136.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 136.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.0f, 184.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(112.0f, 192.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 184.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _alien = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
