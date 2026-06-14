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

/* compiled from: Watch.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Watch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWatch", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_watch", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WatchKt {
    private static ImageVector _watch;

    public static final ImageVector getWatch(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _watch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Watch", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(206.0f, 128.0f);
        pathBuilder.arcToRelative(77.92f, 77.92f, 0.0f, false, false, -32.53f, -63.31f);
        pathBuilder.lineTo(167.1f, 29.5f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 153.32f, 18.0f);
        pathBuilder.lineTo(102.68f, 18.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 88.9f, 29.5f);
        pathBuilder.lineTo(82.53f, 64.69f);
        pathBuilder.arcToRelative(77.87f, 77.87f, 0.0f, false, false, 0.0f, 126.62f);
        pathBuilder.lineTo(88.9f, 226.5f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 102.68f, 238.0f);
        pathBuilder.horizontalLineToRelative(50.64f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.78f, -11.5f);
        pathBuilder.lineToRelative(6.37f, -35.19f);
        pathBuilder.arcTo(77.92f, 77.92f, 0.0f, false, false, 206.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.71f, 31.64f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -1.64f);
        pathBuilder.horizontalLineToRelative(50.64f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 1.64f);
        pathBuilder.lineToRelative(4.56f, 25.19f);
        pathBuilder.arcToRelative(77.68f, 77.68f, 0.0f, false, false, -63.7f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(155.29f, 224.36f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.64f);
        pathBuilder.lineTo(102.68f, 226.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.64f);
        pathBuilder.lineToRelative(-4.56f, -25.19f);
        pathBuilder.arcToRelative(77.68f, 77.68f, 0.0f, false, false, 63.7f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 194.0f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, true, true, 66.0f, -66.0f);
        pathBuilder.arcTo(66.08f, 66.08f, 0.0f, false, true, 128.0f, 194.0f);
        pathBuilder.close();
        pathBuilder.moveTo(174.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(128.0f, 134.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f);
        pathBuilder.lineTo(122.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.horizontalLineToRelative(34.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _watch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
