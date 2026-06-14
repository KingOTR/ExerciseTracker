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

/* compiled from: Sailboat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sailboat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSailboat", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sailboat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SailboatKt {
    private static ImageVector _sailboat;

    public static final ImageVector getSailboat(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _sailboat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sailboat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 140.0f);
        pathBuilder.lineTo(160.0f, 72.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, -2.69f);
        pathBuilder.lineToRelative(55.0f, 60.46f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.43f, 10.26f);
        pathBuilder.arcToRelative(8.24f, 8.24f, 0.0f, false, true, -6.58f, 3.12f);
        pathBuilder.lineTo(164.0f, 144.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 160.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(247.21f, 172.53f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 168.0f);
        pathBuilder.lineTo(144.0f, 168.0f);
        pathBuilder.lineTo(144.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.21f, -5.0f);
        pathBuilder.lineToRelative(-104.0f, 128.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 144.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(16.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.25f, 13.0f);
        pathBuilder.lineToRelative(29.6f, 37.0f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, 12.49f, 6.0f);
        pathBuilder.lineTo(204.16f, 224.0f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, 12.49f, -6.0f);
        pathBuilder.lineToRelative(29.6f, -37.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 247.21f, 172.53f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sailboat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
