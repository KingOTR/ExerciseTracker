package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Detective.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Detective", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDetective", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_detective", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DetectiveKt {
    private static ImageVector _detective;

    public static final ImageVector getDetective(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _detective;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Detective", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 114.0f);
        pathBuilder.lineTo(219.06f, 114.0f);
        pathBuilder.lineTo(171.0f, 47.77f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -22.16f, -0.61f);
        pathBuilder.lineTo(135.93f, 62.08f);
        pathBuilder.arcToRelative(1.15f, 1.15f, 0.0f, false, false, -0.14f, 0.17f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -15.58f, 0.0f);
        pathBuilder.arcToRelative(1.15f, 1.15f, 0.0f, false, false, -0.14f, -0.17f);
        pathBuilder.lineTo(107.2f, 47.16f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 85.0f, 47.77f);
        pathBuilder.lineTo(36.94f, 114.0f);
        pathBuilder.lineTo(8.0f, 114.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(248.0f, 126.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.75f, 54.82f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.15f, -0.07f);
        pathBuilder.lineToRelative(0.15f, 0.17f);
        pathBuilder.lineToRelative(12.86f, 14.92f);
        pathBuilder.arcTo(21.88f, 21.88f, 0.0f, false, false, 128.0f, 78.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(21.88f, 21.88f, 0.0f, false, false, 17.09f, -8.16f);
        pathBuilder.lineTo(158.0f, 54.92f);
        pathBuilder.lineToRelative(0.15f, -0.17f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.15f, 0.07f);
        pathBuilder.lineToRelative(43.0f, 59.18f);
        pathBuilder.lineTo(51.77f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 146.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, -33.94f, 32.0f);
        pathBuilder.lineTo(109.94f, 178.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, false, -1.44f, 12.0f);
        pathBuilder.horizontalLineToRelative(39.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, true, false, 180.0f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 202.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 76.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 202.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 180.0f, 202.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _detective = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
