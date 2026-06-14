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

/* compiled from: Pingpong.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PingPong", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPingPong", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pingPong", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PingpongKt {
    private static ImageVector _pingPong;

    public static final ImageVector getPingPong(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _pingPong;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PingPong", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 196.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.65f, -11.7f);
        pathBuilder.lineToRelative(-38.0f, -27.15f);
        pathBuilder.lineToRelative(17.0f, -16.95f);
        pathBuilder.arcToRelative(39.67f, 39.67f, 0.0f, false, false, 11.0f, -35.79f);
        pathBuilder.arcToRelative(99.52f, 99.52f, 0.0f, false, false, -35.4f, -57.89f);
        pathBuilder.arcTo(101.93f, 101.93f, 0.0f, false, false, 122.58f, 24.0f);
        pathBuilder.arcTo(100.29f, 100.29f, 0.0f, false, false, 24.0f, 122.58f);
        pathBuilder.arcToRelative(102.12f, 102.12f, 0.0f, false, false, 22.55f, 65.28f);
        pathBuilder.arcToRelative(99.52f, 99.52f, 0.0f, false, false, 57.89f, 35.4f);
        pathBuilder.arcToRelative(39.68f, 39.68f, 0.0f, false, false, 35.79f, -11.0f);
        pathBuilder.lineToRelative(16.95f, -17.0f);
        pathBuilder.lineToRelative(27.15f, 38.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 196.0f, 240.0f);
        pathBuilder.curveToRelative(0.44f, 0.0f, 0.88f, 0.05f, 1.32f, 0.05f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.31f, -4.69f);
        pathBuilder.lineToRelative(26.64f, -26.64f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 240.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(197.4f, 224.0f);
        pathBuilder.lineTo(164.77f, 178.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.85f, -3.32f);
        pathBuilder.quadToRelative(-0.33f, 0.0f, -0.66f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f);
        pathBuilder.lineToRelative(-23.63f, 23.63f);
        pathBuilder.arcToRelative(23.68f, 23.68f, 0.0f, false, true, -21.36f, 6.63f);
        pathBuilder.arcToRelative(80.3f, 80.3f, 0.0f, false, true, -12.3f, -3.5f);
        pathBuilder.lineToRelative(108.8f, -108.8f);
        pathBuilder.arcToRelative(80.63f, 80.63f, 0.0f, false, true, 3.5f, 12.3f);
        pathBuilder.arcToRelative(23.67f, 23.67f, 0.0f, false, true, -6.63f, 21.36f);
        pathBuilder.lineTo(177.3f, 152.55f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.0f, 12.17f);
        pathBuilder.lineTo(224.0f, 197.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pingPong = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
