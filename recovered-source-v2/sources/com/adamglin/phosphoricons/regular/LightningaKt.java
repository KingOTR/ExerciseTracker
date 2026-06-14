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

/* compiled from: Lightninga.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LightningA", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getLightningA", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightningA", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningaKt {
    private static ImageVector _lightningA;

    public static final ImageVector getLightningA(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(175.84f, 111.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.56f, -5.7f);
        pathBuilder.lineToRelative(-50.0f, -22.43f);
        pathBuilder.lineTo(135.0f, 25.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.65f, -7.28f);
        pathBuilder.lineTo(26.13f, 121.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.59f, 12.73f);
        pathBuilder.lineToRelative(50.0f, 22.44f);
        pathBuilder.lineTo(65.0f, 214.15f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.65f, 7.28f);
        pathBuilder.lineToRelative(95.2f, -102.85f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 175.84f, 111.54f);
        pathBuilder.close();
        pathBuilder.moveTo(87.62f, 188.21f);
        pathBuilder.lineToRelative(8.16f, -34.36f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.5f, -9.15f);
        pathBuilder.lineTo(45.43f, 124.12f);
        pathBuilder.lineToRelative(66.95f, -72.33f);
        pathBuilder.lineToRelative(-8.16f, 34.36f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.5f, 9.15f);
        pathBuilder.lineToRelative(45.84f, 20.58f);
        pathBuilder.close();
        pathBuilder.moveTo(239.15f, 212.42f);
        pathBuilder.lineTo(203.15f, 140.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.31f, 0.0f);
        pathBuilder.lineToRelative(-36.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.31f, 7.16f);
        pathBuilder.lineTo(176.94f, 200.0f);
        pathBuilder.horizontalLineToRelative(38.11f);
        pathBuilder.lineToRelative(9.79f, 19.58f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.15f, -11.58f);
        pathBuilder.close();
        pathBuilder.moveTo(184.94f, 184.0f);
        pathBuilder.lineTo(196.0f, 161.89f);
        pathBuilder.lineTo(207.05f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightningA = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
