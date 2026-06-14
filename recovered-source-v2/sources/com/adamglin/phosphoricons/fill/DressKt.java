package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dress.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dress", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getDress", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dress", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DressKt {
    private static ImageVector _dress;

    public static final ImageVector getDress(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _dress;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Dress", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(66.26f, 80.23f);
        pathBuilder.arcToRelative(15.26f, 15.26f, 0.0f, false, true, -1.65f, -12.17f);
        pathBuilder.arcToRelative(15.54f, 15.54f, 0.0f, false, true, 2.0f, -4.76f);
        pathBuilder.lineTo(88.0f, 32.7f);
        pathBuilder.lineTo(88.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, -8.0f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, true, 104.0f, 8.27f);
        pathBuilder.lineTo(104.0f, 32.42f);
        pathBuilder.lineTo(109.25f, 39.0f);
        pathBuilder.arcToRelative(23.91f, 23.91f, 0.0f, false, false, 19.13f, 9.0f);
        pathBuilder.arcToRelative(24.67f, 24.67f, 0.0f, false, false, 18.71f, -9.43f);
        pathBuilder.lineTo(152.0f, 32.42f);
        pathBuilder.lineTo(152.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, -8.0f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, true, 168.0f, 8.27f);
        pathBuilder.lineTo(168.0f, 32.7f);
        pathBuilder.lineToRelative(21.42f, 30.6f);
        pathBuilder.arcToRelative(15.54f, 15.54f, 0.0f, false, true, 2.0f, 4.76f);
        pathBuilder.arcToRelative(15.26f, 15.26f, 0.0f, false, true, -1.65f, 12.17f);
        pathBuilder.arcToRelative(1.74f, 1.74f, 0.0f, false, false, -0.11f, 0.18f);
        pathBuilder.lineToRelative(-13.86f, 21.74f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 172.4f, 104.0f);
        pathBuilder.lineTo(83.6f, 104.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.37f, -1.85f);
        pathBuilder.lineTo(66.37f, 80.41f);
        pathBuilder.arcTo(1.74f, 1.74f, 0.0f, false, false, 66.26f, 80.23f);
        pathBuilder.close();
        pathBuilder.moveTo(214.76f, 209.79f);
        pathBuilder.arcToRelative(2.52f, 2.52f, 0.0f, false, false, -0.15f, -0.34f);
        pathBuilder.lineTo(173.69f, 122.3f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.63f, -2.3f);
        pathBuilder.lineTo(85.94f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.63f, 2.3f);
        pathBuilder.lineTo(41.39f, 209.45f);
        pathBuilder.arcToRelative(2.52f, 2.52f, 0.0f, false, false, -0.15f, 0.34f);
        pathBuilder.arcTo(16.19f, 16.19f, 0.0f, false, false, 41.6f, 223.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 232.0f);
        pathBuilder.lineTo(200.0f, 232.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.39f, -9.0f);
        pathBuilder.arcTo(16.19f, 16.19f, 0.0f, false, false, 214.76f, 209.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dress = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
