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

/* compiled from: Broadcast.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Broadcast", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBroadcast", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_broadcast", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroadcastKt {
    private static ImageVector _broadcast;

    public static final ImageVector getBroadcast(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(168.0f, 128.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 168.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 128.0f);
        pathBuilder.arcToRelative(79.74f, 79.74f, 0.0f, false, false, -20.37f, -53.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.92f, 10.67f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 0.0f, 85.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.92f, 10.67f);
        pathBuilder.arcTo(79.79f, 79.79f, 0.0f, false, false, 208.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.29f, 85.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 68.37f, 74.67f);
        pathBuilder.arcToRelative(79.94f, 79.94f, 0.0f, false, false, 0.0f, 106.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.92f, -10.67f);
        pathBuilder.arcToRelative(63.95f, 63.95f, 0.0f, false, true, 0.0f, -85.33f);
        pathBuilder.close();
        pathBuilder.moveTo(238.57f, 81.34f);
        pathBuilder.arcTo(119.48f, 119.48f, 0.0f, false, false, 213.71f, 44.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.42f, 11.2f);
        pathBuilder.arcToRelative(103.9f, 103.9f, 0.0f, false, true, 0.0f, 145.56f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 213.71f, 212.0f);
        pathBuilder.arcTo(120.12f, 120.12f, 0.0f, false, false, 238.57f, 81.29f);
        pathBuilder.close();
        pathBuilder.moveTo(32.17f, 168.48f);
        pathBuilder.arcTo(103.9f, 103.9f, 0.0f, false, true, 53.71f, 55.22f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.29f, 44.0f);
        pathBuilder.arcToRelative(119.87f, 119.87f, 0.0f, false, false, 0.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.42f, -11.2f);
        pathBuilder.arcTo(103.61f, 103.61f, 0.0f, false, true, 32.17f, 168.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _broadcast = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
