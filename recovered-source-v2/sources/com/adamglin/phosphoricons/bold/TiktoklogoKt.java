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

/* compiled from: Tiktoklogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TiktokLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTiktokLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tiktokLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TiktoklogoKt {
    private static ImageVector _tiktokLogo;

    public static final ImageVector getTiktokLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _tiktokLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TiktokLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 68.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(128.0f, 12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.lineTo(116.0f, 156.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.85f, -14.47f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 130.69f);
        pathBuilder.lineTo(100.0f, 88.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 85.9f, 76.19f);
        pathBuilder.arcToRelative(79.35f, 79.35f, 0.0f, false, false, -47.08f, 27.74f);
        pathBuilder.arcTo(81.84f, 81.84f, 0.0f, false, false, 20.0f, 156.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, 160.0f, 0.0f);
        pathBuilder.lineTo(180.0f, 122.67f);
        pathBuilder.arcTo(107.47f, 107.47f, 0.0f, false, false, 224.0f, 132.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(236.0f, 80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 107.15f);
        pathBuilder.arcToRelative(83.05f, 83.05f, 0.0f, false, true, -37.0f, -14.91f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 102.0f);
        pathBuilder.verticalLineToRelative(54.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, -112.0f, 0.0f);
        pathBuilder.arcToRelative(57.86f, 57.86f, 0.0f, false, true, 32.0f, -51.56f);
        pathBuilder.lineTo(76.0f, 124.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 64.0f, 32.0f);
        pathBuilder.lineTo(140.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(17.06f);
        pathBuilder.arcTo(68.21f, 68.21f, 0.0f, false, false, 212.0f, 90.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tiktokLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
