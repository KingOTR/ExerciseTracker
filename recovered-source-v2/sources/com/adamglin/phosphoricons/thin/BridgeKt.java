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

/* compiled from: Bridge.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bridge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBridge", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bridge", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BridgeKt {
    private static ImageVector _bridge;

    public static final ImageVector getBridge(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _bridge;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bridge", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 164.0f);
        pathBuilder.lineTo(196.0f, 164.0f);
        pathBuilder.lineTo(196.0f, 88.09f);
        pathBuilder.arcToRelative(67.81f, 67.81f, 0.0f, false, false, 34.5f, 31.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 3.0f, -7.42f);
        pathBuilder.arcTo(59.77f, 59.77f, 0.0f, false, true, 196.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, true, 68.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.arcToRelative(59.77f, 59.77f, 0.0f, false, true, -37.5f, 55.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 7.42f);
        pathBuilder.arcToRelative(67.81f, 67.81f, 0.0f, false, false, 34.5f, -31.0f);
        pathBuilder.lineTo(60.0f, 164.0f);
        pathBuilder.lineTo(24.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(60.0f, 172.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(68.0f, 172.0f);
        pathBuilder.lineTo(188.0f, 172.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(196.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 121.0f);
        pathBuilder.verticalLineToRelative(43.0f);
        pathBuilder.lineTo(108.0f, 164.0f);
        pathBuilder.lineTo(108.0f, 121.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, 40.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 88.0f);
        pathBuilder.arcToRelative(68.43f, 68.43f, 0.0f, false, false, 32.0f, 30.0f);
        pathBuilder.verticalLineToRelative(46.0f);
        pathBuilder.lineTo(68.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 164.0f);
        pathBuilder.lineTo(156.0f, 118.0f);
        pathBuilder.arcToRelative(68.43f, 68.43f, 0.0f, false, false, 32.0f, -30.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bridge = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
