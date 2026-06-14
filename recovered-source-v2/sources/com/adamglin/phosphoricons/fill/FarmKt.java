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

/* compiled from: Farm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Farm", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFarm", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_farm", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FarmKt {
    private static ImageVector _farm;

    public static final ImageVector getFarm(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _farm;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Farm", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(136.83f, 220.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.09f, 2.23f);
        pathBuilder.arcTo(183.15f, 183.15f, 0.0f, false, false, 24.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.arcToRelative(199.11f, 199.11f, 0.0f, false, true, 110.6f, 33.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 136.83f, 220.43f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.arcToRelative(214.81f, 214.81f, 0.0f, false, true, 151.17f, 61.71f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.2f, -11.42f);
        pathBuilder.arcTo(230.69f, 230.69f, 0.0f, false, false, 24.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 160.0f);
        pathBuilder.arcToRelative(216.51f, 216.51f, 0.0f, false, false, -48.59f, 5.49f);
        pathBuilder.quadToRelative(8.24f, 6.25f, 16.0f, 13.16f);
        pathBuilder.arcTo(201.53f, 201.53f, 0.0f, false, true, 232.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.curveToRelative(-6.0f, 0.0f, -11.93f, 0.29f, -17.85f, 0.86f);
        pathBuilder.quadToRelative(8.32f, 8.67f, 15.94f, 18.14f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.48f, 10.0f);
        pathBuilder.arcTo(247.0f, 247.0f, 0.0f, false, false, 24.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.arcToRelative(265.43f, 265.43f, 0.0f, false, true, 48.0f, 4.38f);
        pathBuilder.lineTo(72.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.2f, -6.4f);
        pathBuilder.lineToRelative(64.0f, -48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, 0.0f);
        pathBuilder.lineToRelative(64.0f, 48.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 80.0f);
        pathBuilder.verticalLineToRelative(32.5f);
        pathBuilder.curveToRelative(5.31f, -0.32f, 10.64f, -0.5f, 16.0f, -0.5f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.arcToRelative(246.3f, 246.3f, 0.0f, false, false, -84.26f, 14.69f);
        pathBuilder.quadToRelative(9.44f, 5.0f, 18.46f, 10.78f);
        pathBuilder.arcTo(232.2f, 232.2f, 0.0f, false, true, 232.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.07f, 133.27f);
        pathBuilder.arcTo(261.51f, 261.51f, 0.0f, false, true, 168.0f, 119.81f);
        pathBuilder.lineTo(168.0f, 96.0f);
        pathBuilder.lineTo(120.0f, 96.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.curveTo(122.71f, 131.0f, 125.4f, 132.13f, 128.07f, 133.27f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _farm = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
