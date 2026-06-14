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

/* compiled from: Tractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tractor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTractor", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tractor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TractorKt {
    private static ImageVector _tractor;

    public static final ImageVector getTractor(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _tractor;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tractor", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(80.0f, 172.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 172.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, true, -52.0f, -52.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 120.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 172.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 96.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 188.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -71.77f, 4.0f);
        pathBuilder.lineTo(144.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.lineTo(136.0f, 172.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, false, -68.0f, -68.0f);
        pathBuilder.lineTo(40.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineTo(48.0f, 56.0f);
        pathBuilder.lineTo(40.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.lineTo(160.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.lineTo(152.0f, 97.88f);
        pathBuilder.lineToRelative(24.0f, 6.5f);
        pathBuilder.lineTo(176.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(36.71f);
        pathBuilder.lineToRelative(36.39f, 9.86f);
        pathBuilder.lineToRelative(0.21f, 0.06f);
        pathBuilder.arcTo(15.89f, 15.89f, 0.0f, false, true, 240.0f, 134.0f);
        pathBuilder.verticalLineToRelative(31.46f);
        pathBuilder.arcTo(35.8f, 35.8f, 0.0f, false, true, 248.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 188.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 228.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tractor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
