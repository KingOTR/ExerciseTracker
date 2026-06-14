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

/* compiled from: Dress.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dress", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDress", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dress", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DressKt {
    private static ImageVector _dress;

    public static final ImageVector getDress(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(212.86f, 210.49f);
        pathBuilder.arcToRelative(1.08f, 1.08f, 0.0f, false, false, -0.08f, -0.19f);
        pathBuilder.lineToRelative(-45.94f, -97.86f);
        pathBuilder.lineToRelative(21.08f, -33.1f);
        pathBuilder.lineToRelative(0.09f, -0.14f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -14.4f);
        pathBuilder.curveToRelative(-0.07f, -0.12f, -0.15f, -0.24f, -0.23f, -0.36f);
        pathBuilder.lineTo(166.0f, 33.33f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineTo(33.12f);
        pathBuilder.lineToRelative(-5.7f, 7.12f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -40.6f, 0.0f);
        pathBuilder.lineTo(102.0f, 33.12f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 90.0f, 8.0f);
        pathBuilder.verticalLineTo(33.33f);
        pathBuilder.lineTo(68.22f, 64.44f);
        pathBuilder.curveToRelative(-0.08f, 0.12f, -0.16f, 0.24f, -0.23f, 0.36f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 14.4f);
        pathBuilder.lineToRelative(0.09f, 0.14f);
        pathBuilder.lineToRelative(21.08f, 33.1f);
        pathBuilder.lineTo(43.22f, 210.3f);
        pathBuilder.arcToRelative(1.08f, 1.08f, 0.0f, false, false, -0.08f, 0.19f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 56.0f, 230.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.87f, -19.51f);
        pathBuilder.close();
        pathBuilder.moveTo(78.26f, 73.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.05f, -1.89f);
        pathBuilder.lineTo(96.32f, 45.23f);
        pathBuilder.lineToRelative(2.0f, 2.51f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 59.34f, 0.0f);
        pathBuilder.lineToRelative(2.0f, -2.51f);
        pathBuilder.lineToRelative(18.11f, 25.86f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 1.89f);
        pathBuilder.lineToRelative(-21.0f, 33.0f);
        pathBuilder.horizontalLineTo(99.29f);
        pathBuilder.close();
        pathBuilder.moveTo(201.66f, 217.1f);
        pathBuilder.arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.67f, 0.9f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.87f, -2.72f);
        pathBuilder.lineTo(99.81f, 118.0f);
        pathBuilder.horizontalLineToRelative(56.38f);
        pathBuilder.lineToRelative(45.67f, 97.28f);
        pathBuilder.arcTo(1.92f, 1.92f, 0.0f, false, true, 201.66f, 217.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dress = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
