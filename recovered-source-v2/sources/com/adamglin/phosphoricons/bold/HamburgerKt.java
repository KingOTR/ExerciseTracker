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

/* compiled from: Hamburger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hamburger", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHamburger", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hamburger", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HamburgerKt {
    private static ImageVector _hamburger;

    public static final ImageVector getHamburger(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _hamburger;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hamburger", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.9f, 152.72f);
        pathBuilder.lineToRelative(-39.7f, 14.44f);
        pathBuilder.lineToRelative(-35.74f, -14.3f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.92f, 0.0f);
        pathBuilder.lineTo(108.0f, 167.08f);
        pathBuilder.lineTo(72.46f, 152.86f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.56f, -0.14f);
        pathBuilder.lineToRelative(-44.0f, 16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.2f, 22.56f);
        pathBuilder.lineToRelative(8.12f, -2.95f);
        pathBuilder.arcTo(44.06f, 44.06f, 0.0f, false, false, 80.0f, 228.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f);
        pathBuilder.verticalLineToRelative(-2.87f);
        pathBuilder.lineToRelative(16.1f, -5.85f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.2f, -22.56f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 204.0f);
        pathBuilder.lineTo(80.0f, 204.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.verticalLineToRelative(-4.32f);
        pathBuilder.lineToRelative(7.8f, -2.84f);
        pathBuilder.lineToRelative(35.74f, 14.3f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.92f, 0.0f);
        pathBuilder.lineTo(148.0f, 176.92f);
        pathBuilder.lineToRelative(35.54f, 14.22f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.56f, 0.14f);
        pathBuilder.lineToRelative(2.89f, -1.06f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.lineTo(232.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.lineTo(24.0f, 140.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.2f, 104.0f);
        pathBuilder.lineTo(207.8f, 104.0f);
        pathBuilder.arcToRelative(20.36f, 20.36f, 0.0f, false, false, 16.38f, -8.29f);
        pathBuilder.arcToRelative(19.59f, 19.59f, 0.0f, false, false, 2.88f, -17.65f);
        pathBuilder.curveTo(216.12f, 43.88f, 175.39f, 20.0f, 128.0f, 20.0f);
        pathBuilder.reflectiveCurveTo(39.89f, 43.87f, 28.94f, 78.05f);
        pathBuilder.arcTo(19.56f, 19.56f, 0.0f, false, false, 31.82f, 95.7f);
        pathBuilder.arcTo(20.32f, 20.32f, 0.0f, false, false, 48.2f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 44.0f);
        pathBuilder.curveToRelative(33.7f, 0.0f, 63.61f, 14.85f, 74.0f, 36.0f);
        pathBuilder.lineTo(54.0f, 80.0f);
        pathBuilder.curveTo(64.4f, 58.85f, 94.31f, 44.0f, 128.0f, 44.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hamburger = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
