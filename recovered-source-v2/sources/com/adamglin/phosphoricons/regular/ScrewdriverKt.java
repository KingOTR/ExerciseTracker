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

/* compiled from: Screwdriver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Screwdriver", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getScrewdriver", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_screwdriver", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrewdriverKt {
    private static ImageVector _screwdriver;

    public static final ImageVector getScrewdriver(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _screwdriver;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Screwdriver", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(205.66f, 50.32f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder.lineToRelative(-56.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.31f);
        pathBuilder.lineToRelative(56.0f, -56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 205.66f, 50.32f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 58.41f);
        pathBuilder.arcToRelative(50.13f, 50.13f, 0.0f, false, true, -14.77f, 35.66f);
        pathBuilder.lineTo(180.0f, 147.3f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, true, 168.69f, 152.0f);
        pathBuilder.lineTo(152.0f, 152.0f);
        pathBuilder.verticalLineToRelative(16.83f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -3.25f, 9.66f);
        pathBuilder.arcToRelative(8.08f, 8.08f, 0.0f, false, true, -0.72f, 0.83f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f);
        pathBuilder.lineTo(98.7f, 168.6f);
        pathBuilder.lineToRelative(-77.0f, 77.06f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder.lineToRelative(77.05f, -77.05f);
        pathBuilder.lineToRelative(-18.7f, -18.71f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.63f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.82f, -0.72f);
        pathBuilder.arcTo(16.14f, 16.14f, 0.0f, false, true, 87.17f, 104.0f);
        pathBuilder.lineTo(104.0f, 104.0f);
        pathBuilder.lineTo(104.0f, 87.3f);
        pathBuilder.arcTo(15.92f, 15.92f, 0.0f, false, true, 108.68f, 76.0f);
        pathBuilder.lineToRelative(53.24f, -53.23f);
        pathBuilder.arcTo(50.43f, 50.43f, 0.0f, false, true, 248.0f, 58.41f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 58.41f);
        pathBuilder.arcToRelative(34.43f, 34.43f, 0.0f, false, false, -58.77f, -24.35f);
        pathBuilder.lineTo(120.0f, 87.3f);
        pathBuilder.lineTo(120.0f, 104.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(87.28f, 120.0f);
        pathBuilder.lineTo(80.0f, 127.27f);
        pathBuilder.lineTo(128.72f, 176.0f);
        pathBuilder.lineToRelative(7.28f, -7.28f);
        pathBuilder.lineTo(136.0f, 152.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(16.69f);
        pathBuilder.lineToRelative(53.23f, -53.24f);
        pathBuilder.arcTo(34.21f, 34.21f, 0.0f, false, false, 232.0f, 58.41f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _screwdriver = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
