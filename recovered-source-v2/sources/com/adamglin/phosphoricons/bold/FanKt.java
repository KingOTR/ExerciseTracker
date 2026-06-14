package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fan.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fan", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFan", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fan", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FanKt {
    private static ImageVector _fan;

    public static final ImageVector getFan(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _fan;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Fan", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.85f, 134.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, -87.43f, -42.11f);
        pathBuilder.lineToRelative(14.22f, -56.77f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.17f, -13.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, false, 86.0f, 127.52f);
        pathBuilder.lineTo(29.72f, 143.59f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.69f, 11.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, 127.56f, 10.0f);
        pathBuilder.lineToRelative(42.0f, 40.7f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.86f, 2.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, false, 236.85f, 134.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 36.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 14.0f, 2.53f);
        pathBuilder.lineTo(124.6f, 92.17f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -25.85f, 14.88f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 124.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(105.0f, 192.1f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 45.5f, 164.0f);
        pathBuilder.lineToRelative(53.18f, -15.19f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 25.8f, 15.0f);
        pathBuilder.arcTo(39.84f, 39.84f, 0.0f, false, true, 105.0f, 192.1f);
        pathBuilder.close();
        pathBuilder.moveTo(209.7f, 170.54f);
        pathBuilder.arcToRelative(39.92f, 39.92f, 0.0f, false, true, -9.21f, 10.89f);
        pathBuilder.lineTo(160.73f, 143.0f);
        pathBuilder.arcToRelative(35.9f, 35.9f, 0.0f, false, false, 0.05f, -29.83f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 48.89f, 57.4f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fan = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
