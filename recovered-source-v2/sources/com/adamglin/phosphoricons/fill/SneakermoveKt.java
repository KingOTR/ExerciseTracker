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

/* compiled from: Sneakermove.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SneakerMove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSneakerMove", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sneakerMove", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SneakermoveKt {
    private static ImageVector _sneakerMove;

    public static final ImageVector getSneakerMove(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _sneakerMove;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SneakerMove", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(70.8f, 184.0f);
        pathBuilder.lineTo(32.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.lineTo(70.8f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(102.8f, 200.0f);
        pathBuilder.lineTo(48.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(54.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(231.16f, 166.63f);
        pathBuilder.lineTo(202.53f, 152.32f);
        pathBuilder.arcTo(47.74f, 47.74f, 0.0f, false, true, 176.0f, 109.39f);
        pathBuilder.lineTo(176.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.93f, -8.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 120.0f, 24.07f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.83f, -6.44f);
        pathBuilder.lineTo(45.11f, 64.68f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.41f, 6.0f);
        pathBuilder.lineToRelative(51.44f, 51.44f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, 0.6f, 11.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.71f, 0.43f);
        pathBuilder.lineToRelative(-53.0f, -53.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.44f, 1.09f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 3.12f, 18.22f);
        pathBuilder.lineTo(142.4f, 213.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, 2.34f);
        pathBuilder.lineTo(224.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(240.0f, 180.94f);
        pathBuilder.arcTo(15.92f, 15.92f, 0.0f, false, false, 231.16f, 166.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sneakerMove = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
