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

/* compiled from: Nytimeslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NyTimesLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getNyTimesLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_nyTimesLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NytimeslogoKt {
    private static ImageVector _nyTimesLogo;

    public static final ImageVector getNyTimesLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _nyTimesLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NyTimesLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(192.0f, 148.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 108.0f);
        pathBuilder.arcToRelative(11.84f, 11.84f, 0.0f, false, true, -5.07f, -1.13f);
        pathBuilder.lineTo(118.25f, 76.69f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -57.83f, 59.89f);
        pathBuilder.lineToRelative(65.93f, -35.17f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 112.0f);
        pathBuilder.verticalLineToRelative(98.11f);
        pathBuilder.arcToRelative(67.71f, 67.71f, 0.0f, false, false, 44.75f, -35.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 21.42f, 10.82f);
        pathBuilder.arcToRelative(91.54f, 91.54f, 0.0f, false, true, -76.0f, 50.38f);
        pathBuilder.arcTo(12.13f, 12.13f, 0.0f, false, true, 132.0f, 236.0f);
        pathBuilder.curveToRelative(-0.35f, 0.0f, -0.68f, 0.0f, -1.0f, -0.05f);
        pathBuilder.curveToRelative(-1.0f, 0.0f, -2.0f, 0.05f, -3.0f, 0.05f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 46.36f, 101.61f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 68.0f, 28.0f);
        pathBuilder.arcToRelative(11.84f, 11.84f, 0.0f, false, true, 5.07f, 1.13f);
        pathBuilder.lineToRelative(117.24f, 54.7f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 188.0f, 52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 192.12f);
        pathBuilder.lineTo(80.0f, 153.33f);
        pathBuilder.lineToRelative(-17.39f, 9.28f);
        pathBuilder.arcTo(68.13f, 68.13f, 0.0f, false, false, 80.0f, 192.12f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 132.0f);
        pathBuilder.lineToRelative(-16.0f, 8.53f);
        pathBuilder.verticalLineToRelative(67.08f);
        pathBuilder.arcToRelative(67.1f, 67.1f, 0.0f, false, false, 16.0f, 3.9f);
        pathBuilder.close();
        pathBuilder.moveTo(86.5f, 61.88f);
        pathBuilder.lineTo(65.69f, 52.17f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.58f, 29.74f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 86.5f, 61.88f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _nyTimesLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
