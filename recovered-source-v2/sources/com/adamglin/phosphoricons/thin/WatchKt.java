package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Watch.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Watch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getWatch", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_watch", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WatchKt {
    private static ImageVector _watch;

    public static final ImageVector getWatch(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(204.0f, 128.0f);
        pathBuilder.arcToRelative(75.94f, 75.94f, 0.0f, false, false, -32.35f, -62.16f);
        pathBuilder.lineToRelative(-6.52f, -36.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 153.32f, 20.0f);
        pathBuilder.lineTo(102.68f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.81f, 9.86f);
        pathBuilder.lineToRelative(-6.52f, 36.0f);
        pathBuilder.arcToRelative(75.89f, 75.89f, 0.0f, false, false, 0.0f, 124.32f);
        pathBuilder.lineToRelative(6.52f, 36.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 102.68f, 236.0f);
        pathBuilder.horizontalLineToRelative(50.64f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.81f, -9.86f);
        pathBuilder.lineToRelative(6.52f, -36.0f);
        pathBuilder.arcTo(75.94f, 75.94f, 0.0f, false, false, 204.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(98.74f, 31.29f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 102.68f, 28.0f);
        pathBuilder.horizontalLineToRelative(50.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.94f, 3.29f);
        pathBuilder.lineToRelative(5.26f, 29.0f);
        pathBuilder.arcToRelative(75.69f, 75.69f, 0.0f, false, false, -69.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(157.26f, 224.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, 3.29f);
        pathBuilder.lineTo(102.68f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, -3.29f);
        pathBuilder.lineToRelative(-5.26f, -29.0f);
        pathBuilder.arcToRelative(75.69f, 75.69f, 0.0f, false, false, 69.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 196.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, -68.0f);
        pathBuilder.arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(128.0f, 132.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(124.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _watch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
