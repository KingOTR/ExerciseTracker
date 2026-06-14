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

/* compiled from: Crown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Crown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCrown", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crown", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrownKt {
    private static ImageVector _crown;

    public static final ImageVector getCrown(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _crown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Crown", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.71f, 99.73f);
        pathBuilder.lineToRelative(-15.6f, 93.59f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.89f, 6.68f);
        pathBuilder.horizontalLineTo(62.78f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.89f, -6.68f);
        pathBuilder.lineTo(39.29f, 99.73f);
        pathBuilder.lineToRelative(0.08f, 0.0f);
        pathBuilder.arcToRelative(19.82f, 19.82f, 0.0f, false, false, 9.22f, -4.16f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(88.0f, 144.0f);
        pathBuilder.lineToRelative(32.0f, -73.65f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 15.92f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(168.0f, 144.0f);
        pathBuilder.lineToRelative(39.39f, -48.48f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(19.82f, 19.82f, 0.0f, false, false, 9.22f, 4.16f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(248.0f, 80.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -51.12f, 15.77f);
        pathBuilder2.lineToRelative(-26.79f, 33.0f);
        pathBuilder2.lineTo(146.0f, 73.4f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -36.06f, 0.0f);
        pathBuilder2.lineTo(85.91f, 128.74f);
        pathBuilder2.lineToRelative(-26.79f, -33.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -26.6f, 12.0f);
        pathBuilder2.lineTo(47.0f, 194.63f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 62.78f, 208.0f);
        pathBuilder2.horizontalLineTo(193.22f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 209.0f, 194.63f);
        pathBuilder2.lineToRelative(14.47f, -86.85f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 248.0f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 40.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(24.0f, 80.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, true, true, 36.0f, 92.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(193.22f, 192.0f);
        pathBuilder2.horizontalLineTo(62.78f);
        pathBuilder2.lineTo(48.86f, 108.52f);
        pathBuilder2.lineTo(81.79f, 149.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 152.0f);
        pathBuilder2.arcToRelative(7.83f, 7.83f, 0.0f, false, false, 1.08f, -0.07f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.26f, -4.74f);
        pathBuilder2.lineToRelative(29.3f, -67.4f);
        pathBuilder2.arcToRelative(27.0f, 27.0f, 0.0f, false, false, 6.72f, 0.0f);
        pathBuilder2.lineToRelative(29.3f, 67.4f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.26f, 4.74f);
        pathBuilder2.arcTo(7.83f, 7.83f, 0.0f, false, false, 168.0f, 152.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.21f, -3.0f);
        pathBuilder2.lineToRelative(32.93f, -40.52f);
        pathBuilder2.close();
        pathBuilder2.moveTo(220.0f, 92.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 92.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
