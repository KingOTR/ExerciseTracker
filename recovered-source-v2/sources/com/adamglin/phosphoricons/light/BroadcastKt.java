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

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Broadcast", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBroadcast", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_broadcast", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroadcastKt {
    private static ImageVector _broadcast;

    public static final ImageVector getBroadcast(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 90.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 128.0f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 154.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.0f, 128.0f);
        pathBuilder.arcToRelative(77.74f, 77.74f, 0.0f, false, true, -19.86f, 52.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.94f, -8.0f);
        pathBuilder.arcToRelative(65.93f, 65.93f, 0.0f, false, false, 0.0f, -88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.94f, -8.0f);
        pathBuilder.arcTo(77.74f, 77.74f, 0.0f, false, true, 206.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(67.18f, 102.31f);
        pathBuilder.arcTo(65.93f, 65.93f, 0.0f, false, false, 78.8f, 172.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.47f, 8.47f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.47f, -0.47f);
        pathBuilder.arcToRelative(77.93f, 77.93f, 0.0f, false, true, 0.0f, -104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.94f, 8.0f);
        pathBuilder.arcTo(66.21f, 66.21f, 0.0f, false, false, 67.18f, 102.31f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 128.0f);
        pathBuilder.arcToRelative(117.71f, 117.71f, 0.0f, false, true, -33.71f, 82.58f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.58f, -8.4f);
        pathBuilder.arcToRelative(105.88f, 105.88f, 0.0f, false, false, 0.0f, -148.36f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.58f, -8.4f);
        pathBuilder.arcTo(117.71f, 117.71f, 0.0f, false, true, 246.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.29f, 202.18f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.58f, 8.4f);
        pathBuilder.arcToRelative(117.92f, 117.92f, 0.0f, false, true, 0.0f, -165.16f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.58f, 8.4f);
        pathBuilder.arcToRelative(105.88f, 105.88f, 0.0f, false, false, 0.0f, 148.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _broadcast = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
