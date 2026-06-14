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

/* compiled from: Crown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Crown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCrown", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crown", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrownKt {
    private static ImageVector _crown;

    public static final ImageVector getCrown(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(248.0f, 80.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -51.12f, 15.77f);
        pathBuilder.lineToRelative(-26.79f, 33.0f);
        pathBuilder.lineTo(146.0f, 73.4f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -36.06f, 0.0f);
        pathBuilder.lineTo(85.91f, 128.74f);
        pathBuilder.lineToRelative(-26.79f, -33.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -26.6f, 12.0f);
        pathBuilder.lineTo(47.0f, 194.63f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 62.78f, 208.0f);
        pathBuilder.horizontalLineTo(193.22f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 209.0f, 194.63f);
        pathBuilder.lineToRelative(14.47f, -86.85f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 248.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 36.0f, 92.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(193.22f, 192.0f);
        pathBuilder.horizontalLineTo(62.78f);
        pathBuilder.lineTo(48.86f, 108.52f);
        pathBuilder.lineTo(81.79f, 149.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 152.0f);
        pathBuilder.arcToRelative(7.83f, 7.83f, 0.0f, false, false, 1.08f, -0.07f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.26f, -4.74f);
        pathBuilder.lineToRelative(29.3f, -67.4f);
        pathBuilder.arcToRelative(27.0f, 27.0f, 0.0f, false, false, 6.72f, 0.0f);
        pathBuilder.lineToRelative(29.3f, 67.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.26f, 4.74f);
        pathBuilder.arcTo(7.83f, 7.83f, 0.0f, false, false, 168.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.21f, -3.0f);
        pathBuilder.lineToRelative(32.93f, -40.52f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 92.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 92.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
