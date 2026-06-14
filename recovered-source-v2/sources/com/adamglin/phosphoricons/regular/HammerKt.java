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

/* compiled from: Hammer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hammer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHammer", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hammer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HammerKt {
    private static ImageVector _hammer;

    public static final ImageVector getHammer(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _hammer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hammer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(251.34f, 112.0f);
        pathBuilder.lineTo(183.88f, 44.08f);
        pathBuilder.arcToRelative(96.1f, 96.1f, 0.0f, false, false, -135.77f, 0.0f);
        pathBuilder.lineToRelative(-0.09f, 0.09f);
        pathBuilder.lineTo(34.25f, 58.4f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 45.74f, 69.53f);
        pathBuilder.lineTo(59.47f, 55.35f);
        pathBuilder.arcToRelative(79.92f, 79.92f, 0.0f, false, true, 18.71f, -13.9f);
        pathBuilder.lineTo(124.68f, 88.0f);
        pathBuilder.lineToRelative(-96.0f, 96.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f);
        pathBuilder.lineToRelative(20.69f, 20.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f);
        pathBuilder.lineToRelative(96.0f, -96.0f);
        pathBuilder.lineToRelative(14.34f, 14.34f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(200.0f, 163.3f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f);
        pathBuilder.lineToRelative(28.69f, -28.69f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 251.34f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.68f, 216.0f);
        pathBuilder.lineTo(40.0f, 195.31f);
        pathBuilder.lineToRelative(68.0f, -68.0f);
        pathBuilder.lineTo(128.68f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.34f, 114.32f);
        pathBuilder.lineTo(140.0f, 136.67f);
        pathBuilder.lineTo(119.31f, 116.0f);
        pathBuilder.lineToRelative(22.35f, -22.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f);
        pathBuilder.lineTo(94.32f, 35.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, true, 78.23f, 20.41f);
        pathBuilder.lineToRelative(44.22f, 44.51f);
        pathBuilder.lineTo(188.0f, 128.66f);
        pathBuilder.lineToRelative(-14.34f, -14.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 162.34f, 114.32f);
        pathBuilder.close();
        pathBuilder.moveTo(211.34f, 151.98f);
        pathBuilder.lineTo(199.34f, 139.98f);
        pathBuilder.lineTo(228.0f, 111.25f);
        pathBuilder.lineToRelative(12.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hammer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
