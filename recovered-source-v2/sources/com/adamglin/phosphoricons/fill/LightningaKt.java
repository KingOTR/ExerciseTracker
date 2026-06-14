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

/* compiled from: Lightninga.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LightningA", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getLightningA", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightningA", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningaKt {
    private static ImageVector _lightningA;

    public static final ImageVector getLightningA(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _lightningA;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LightningA", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(173.87f, 118.58f);
        pathBuilder.lineTo(78.67f, 221.43f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 65.0f, 214.15f);
        pathBuilder.lineToRelative(13.67f, -57.56f);
        pathBuilder.lineToRelative(-50.0f, -22.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.59f, -12.73f);
        pathBuilder.lineToRelative(95.2f, -102.85f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 135.0f, 25.85f);
        pathBuilder.lineTo(121.31f, 83.41f);
        pathBuilder.lineToRelative(50.0f, 22.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.59f, 12.74f);
        pathBuilder.close();
        pathBuilder.moveTo(235.58f, 223.15f);
        pathBuilder.arcTo(7.91f, 7.91f, 0.0f, false, true, 232.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, -4.42f);
        pathBuilder.lineTo(215.05f, 200.0f);
        pathBuilder.lineTo(176.94f, 200.0f);
        pathBuilder.lineToRelative(-9.79f, 19.58f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.31f, -7.16f);
        pathBuilder.lineToRelative(36.0f, -72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.31f, 0.0f);
        pathBuilder.lineToRelative(36.0f, 72.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 235.58f, 223.15f);
        pathBuilder.close();
        pathBuilder.moveTo(207.05f, 184.0f);
        pathBuilder.lineTo(196.0f, 161.89f);
        pathBuilder.lineTo(184.94f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightningA = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
