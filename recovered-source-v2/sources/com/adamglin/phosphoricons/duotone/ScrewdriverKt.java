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

/* compiled from: Screwdriver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Screwdriver", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getScrewdriver", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_screwdriver", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrewdriverKt {
    private static ImageVector _screwdriver;

    public static final ImageVector getScrewdriver(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(227.57f, 88.43f);
        pathBuilder.lineToRelative(-53.23f, 53.23f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.65f, 2.34f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(16.83f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.62f, 4.83f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.lineTo(74.34f, 132.94f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 87.17f, 112.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.verticalLineTo(87.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.34f, -5.65f);
        pathBuilder.lineToRelative(53.23f, -53.23f);
        pathBuilder.arcToRelative(42.42f, 42.42f, 0.0f, false, true, 60.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(42.42f, 42.42f, 0.0f, false, true, 227.57f, 88.43f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(205.66f, 50.32f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder2.lineToRelative(-56.0f, 56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.31f);
        pathBuilder2.lineToRelative(56.0f, -56.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 205.66f, 50.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(248.0f, 58.41f);
        pathBuilder2.arcToRelative(50.13f, 50.13f, 0.0f, false, true, -14.77f, 35.66f);
        pathBuilder2.lineTo(180.0f, 147.3f);
        pathBuilder2.arcTo(15.86f, 15.86f, 0.0f, false, true, 168.69f, 152.0f);
        pathBuilder2.lineTo(152.0f, 152.0f);
        pathBuilder2.verticalLineToRelative(16.83f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -3.25f, 9.66f);
        pathBuilder2.arcToRelative(8.08f, 8.08f, 0.0f, false, true, -0.72f, 0.83f);
        pathBuilder2.lineToRelative(-8.0f, 8.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, 0.0f);
        pathBuilder2.lineTo(98.7f, 168.6f);
        pathBuilder2.lineToRelative(-77.0f, 77.06f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder2.lineToRelative(77.05f, -77.05f);
        pathBuilder2.lineToRelative(-18.7f, -18.71f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.63f);
        pathBuilder2.lineToRelative(8.0f, -8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.82f, -0.72f);
        pathBuilder2.arcTo(16.14f, 16.14f, 0.0f, false, true, 87.17f, 104.0f);
        pathBuilder2.lineTo(104.0f, 104.0f);
        pathBuilder2.lineTo(104.0f, 87.3f);
        pathBuilder2.arcTo(15.92f, 15.92f, 0.0f, false, true, 108.68f, 76.0f);
        pathBuilder2.lineToRelative(53.24f, -53.23f);
        pathBuilder2.arcTo(50.43f, 50.43f, 0.0f, false, true, 248.0f, 58.41f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 58.41f);
        pathBuilder2.arcToRelative(34.43f, 34.43f, 0.0f, false, false, -58.77f, -24.35f);
        pathBuilder2.lineTo(120.0f, 87.3f);
        pathBuilder2.lineTo(120.0f, 104.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder2.lineTo(87.28f, 120.0f);
        pathBuilder2.lineTo(80.0f, 127.27f);
        pathBuilder2.lineTo(128.72f, 176.0f);
        pathBuilder2.lineToRelative(7.28f, -7.28f);
        pathBuilder2.lineTo(136.0f, 152.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(16.69f);
        pathBuilder2.lineToRelative(53.23f, -53.24f);
        pathBuilder2.arcTo(34.21f, 34.21f, 0.0f, false, false, 232.0f, 58.41f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _screwdriver = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
