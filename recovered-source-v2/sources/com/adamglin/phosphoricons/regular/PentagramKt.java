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

/* compiled from: Pentagram.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pentagram", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPentagram", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pentagram", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PentagramKt {
    private static ImageVector _pentagram;

    public static final ImageVector getPentagram(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(239.18f, 91.05f);
        pathBuilder.arcTo(15.75f, 15.75f, 0.0f, false, false, 224.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(-61.0f);
        pathBuilder.lineTo(143.23f, 19.26f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, -30.45f, -0.05f);
        pathBuilder.lineTo(93.06f, 80.0f);
        pathBuilder.lineTo(32.0f, 80.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.37f, 29.0f);
        pathBuilder.lineToRelative(49.46f, 35.58f);
        pathBuilder.lineTo(53.15f, 203.0f);
        pathBuilder.arcTo(15.75f, 15.75f, 0.0f, false, false, 59.0f, 220.88f);
        pathBuilder.arcToRelative(15.74f, 15.74f, 0.0f, false, false, 18.77f, 0.0f);
        pathBuilder.lineTo(128.0f, 184.75f);
        pathBuilder.lineToRelative(50.23f, 36.13f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 202.85f, 203.0f);
        pathBuilder.lineToRelative(-19.0f, -58.46f);
        pathBuilder.lineToRelative(49.49f, -35.61f);
        pathBuilder.arcTo(15.74f, 15.74f, 0.0f, false, false, 239.18f, 91.05f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 24.15f);
        pathBuilder.lineTo(146.12f, 80.0f);
        pathBuilder.lineTo(109.88f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 96.0f);
        pathBuilder.lineTo(87.87f, 96.0f);
        pathBuilder.lineTo(77.3f, 128.56f);
        pathBuilder.close();
        pathBuilder.moveTo(68.34f, 208.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(17.39f, -53.59f);
        pathBuilder.lineToRelative(28.54f, 20.54f);
        pathBuilder.close();
        pathBuilder.moveTo(90.91f, 138.43f);
        pathBuilder.lineTo(104.69f, 96.0f);
        pathBuilder.horizontalLineToRelative(46.62f);
        pathBuilder.lineToRelative(13.75f, 42.38f);
        pathBuilder.lineTo(128.0f, 165.0f);
        pathBuilder.close();
        pathBuilder.moveTo(187.6f, 208.0f);
        pathBuilder.lineTo(187.6f, 208.0f);
        pathBuilder.lineTo(141.7f, 175.0f);
        pathBuilder.lineTo(170.24f, 154.46f);
        pathBuilder.close();
        pathBuilder.moveTo(178.67f, 128.62f);
        pathBuilder.lineTo(168.13f, 96.0f);
        pathBuilder.lineTo(224.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pentagram = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
