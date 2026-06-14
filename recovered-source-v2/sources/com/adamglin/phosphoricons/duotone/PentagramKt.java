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

/* compiled from: Pentagram.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pentagram", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPentagram", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pentagram", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PentagramKt {
    private static ImageVector _pentagram;

    public static final ImageVector getPentagram(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _pentagram;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pentagram", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.69f, 102.47f);
        pathBuilder.lineToRelative(-54.21f, 39.0f);
        pathBuilder.lineToRelative(20.77f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.31f, 8.95f);
        pathBuilder.lineTo(128.0f, 174.91f);
        pathBuilder.lineTo(73.06f, 214.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.31f, -8.95f);
        pathBuilder.lineToRelative(20.77f, -64.0f);
        pathBuilder.lineToRelative(-54.21f, -39.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 88.0f);
        pathBuilder.horizontalLineTo(98.87f);
        pathBuilder.lineToRelative(21.52f, -66.32f);
        pathBuilder.arcToRelative(7.94f, 7.94f, 0.0f, false, true, 15.22f, 0.0f);
        pathBuilder.lineTo(157.13f, 88.0f);
        pathBuilder.horizontalLineTo(224.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 228.69f, 102.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(239.2f, 91.06f);
        pathBuilder2.arcTo(15.76f, 15.76f, 0.0f, false, false, 224.0f, 80.0f);
        pathBuilder2.horizontalLineToRelative(-61.0f);
        pathBuilder2.lineToRelative(-19.7f, -60.74f);
        pathBuilder2.arcToRelative(15.94f, 15.94f, 0.0f, false, false, -30.46f, -0.05f);
        pathBuilder2.lineTo(93.06f, 80.0f);
        pathBuilder2.lineTo(32.0f, 80.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.38f, 29.0f);
        pathBuilder2.lineToRelative(49.47f, 35.59f);
        pathBuilder2.lineTo(53.14f, 203.0f);
        pathBuilder2.arcTo(15.77f, 15.77f, 0.0f, false, false, 59.0f, 220.91f);
        pathBuilder2.arcToRelative(15.77f, 15.77f, 0.0f, false, false, 18.78f, 0.0f);
        pathBuilder2.lineTo(128.0f, 184.77f);
        pathBuilder2.lineToRelative(50.24f, 36.14f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 202.86f, 203.0f);
        pathBuilder2.lineToRelative(-19.0f, -58.46f);
        pathBuilder2.lineToRelative(49.5f, -35.62f);
        pathBuilder2.arcTo(15.76f, 15.76f, 0.0f, false, false, 239.2f, 91.06f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 24.15f);
        pathBuilder2.lineTo(146.12f, 80.0f);
        pathBuilder2.lineTo(109.88f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 96.0f);
        pathBuilder2.lineTo(87.87f, 96.0f);
        pathBuilder2.lineTo(77.3f, 128.58f);
        pathBuilder2.close();
        pathBuilder2.moveTo(68.36f, 208.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineToRelative(17.39f, -53.59f);
        pathBuilder2.lineToRelative(28.55f, 20.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(90.93f, 138.43f);
        pathBuilder2.lineTo(104.69f, 96.0f);
        pathBuilder2.horizontalLineToRelative(46.62f);
        pathBuilder2.lineToRelative(13.76f, 42.39f);
        pathBuilder2.lineTo(128.0f, 165.06f);
        pathBuilder2.close();
        pathBuilder2.moveTo(187.64f, 208.0f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.lineToRelative(-45.91f, -33.0f);
        pathBuilder2.lineToRelative(28.55f, -20.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(178.7f, 128.62f);
        pathBuilder2.lineTo(168.13f, 96.0f);
        pathBuilder2.lineTo(224.0f, 96.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pentagram = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
