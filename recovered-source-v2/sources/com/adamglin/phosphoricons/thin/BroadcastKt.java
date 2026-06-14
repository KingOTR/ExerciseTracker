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

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Broadcast", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBroadcast", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_broadcast", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroadcastKt {
    private static ImageVector _broadcast;

    public static final ImageVector getBroadcast(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _broadcast;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Broadcast", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 92.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 156.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 128.0f);
        pathBuilder.arcToRelative(75.74f, 75.74f, 0.0f, false, true, -19.35f, 50.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, -5.34f);
        pathBuilder.arcToRelative(67.92f, 67.92f, 0.0f, false, false, 0.0f, -90.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, -5.34f);
        pathBuilder.arcTo(75.74f, 75.74f, 0.0f, false, true, 204.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(65.34f, 101.53f);
        pathBuilder.arcToRelative(67.92f, 67.92f, 0.0f, false, false, 12.0f, 71.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 5.34f);
        pathBuilder.arcToRelative(75.93f, 75.93f, 0.0f, false, true, 0.0f, -101.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.0f, 5.34f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 65.34f, 101.53f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 128.0f);
        pathBuilder.arcToRelative(115.68f, 115.68f, 0.0f, false, true, -33.14f, 81.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.72f, -5.6f);
        pathBuilder.arcToRelative(107.89f, 107.89f, 0.0f, false, false, 0.0f, -151.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.72f, -5.6f);
        pathBuilder.arcTo(115.68f, 115.68f, 0.0f, false, true, 244.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(50.86f, 203.58f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.72f, 5.6f);
        pathBuilder.arcToRelative(115.91f, 115.91f, 0.0f, false, true, 0.0f, -162.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.72f, 5.6f);
        pathBuilder.arcToRelative(107.89f, 107.89f, 0.0f, false, false, 0.0f, 151.16f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _broadcast = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
