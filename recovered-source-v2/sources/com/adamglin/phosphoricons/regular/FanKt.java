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

/* compiled from: Fan.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fan", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFan", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fan", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FanKt {
    private static ImageVector _fan;

    public static final ImageVector getFan(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _fan;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Fan", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(233.0f, 135.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, -89.62f, -35.45f);
        pathBuilder.lineToRelative(16.39f, -65.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.45f, -8.68f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, true, false, 95.69f, 128.91f);
        pathBuilder.lineTo(30.82f, 147.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.8f, 7.32f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 44.42f, 60.66f);
        pathBuilder.arcToRelative(60.52f, 60.52f, 0.0f, false, false, 15.62f, 2.07f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, false, 59.88f, -62.0f);
        pathBuilder.lineToRelative(48.48f, 46.92f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.25f, 1.35f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 233.0f, 135.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 128.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 76.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 62.75f, -39.82f);
        pathBuilder.lineTo(127.77f, 96.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 99.85f, 112.8f);
        pathBuilder.arcTo(43.85f, 43.85f, 0.0f, false, true, 80.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(107.0f, 195.57f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -65.86f, -34.43f);
        pathBuilder.lineToRelative(59.31f, -16.94f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 160.0f);
        pathBuilder.lineToRelative(0.91f, 0.0f);
        pathBuilder.arcTo(43.82f, 43.82f, 0.0f, false, true, 107.0f, 195.57f);
        pathBuilder.close();
        pathBuilder.moveTo(213.17f, 172.57f);
        pathBuilder.arcToRelative(43.92f, 43.92f, 0.0f, false, true, -13.0f, 14.14f);
        pathBuilder.lineToRelative(-44.32f, -42.89f);
        pathBuilder.arcToRelative(31.91f, 31.91f, 0.0f, false, false, -0.59f, -32.57f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 57.91f, 61.32f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fan = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
