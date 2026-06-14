package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pingpong.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PingPong", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPingPong", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pingPong", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PingpongKt {
    private static ImageVector _pingPong;

    public static final ImageVector getPingPong(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(206.6f, 81.4f);
        pathBuilder.lineTo(81.4f, 206.6f);
        pathBuilder.arcTo(93.92f, 93.92f, 0.0f, false, true, 32.0f, 122.69f);
        pathBuilder.curveToRelative(0.69f, -49.55f, 41.13f, -90.0f, 90.68f, -90.68f);
        pathBuilder.arcTo(93.92f, 93.92f, 0.0f, false, true, 206.6f, 81.4f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(240.0f, 196.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.65f, -11.7f);
        pathBuilder2.lineToRelative(-38.0f, -27.15f);
        pathBuilder2.lineToRelative(17.0f, -16.95f);
        pathBuilder2.arcToRelative(39.67f, 39.67f, 0.0f, false, false, 11.0f, -35.79f);
        pathBuilder2.arcToRelative(99.52f, 99.52f, 0.0f, false, false, -35.4f, -57.89f);
        pathBuilder2.arcTo(101.93f, 101.93f, 0.0f, false, false, 122.58f, 24.0f);
        pathBuilder2.arcTo(100.29f, 100.29f, 0.0f, false, false, 24.0f, 122.58f);
        pathBuilder2.arcToRelative(102.12f, 102.12f, 0.0f, false, false, 22.55f, 65.28f);
        pathBuilder2.arcToRelative(99.52f, 99.52f, 0.0f, false, false, 57.89f, 35.4f);
        pathBuilder2.arcToRelative(39.68f, 39.68f, 0.0f, false, false, 35.79f, -11.0f);
        pathBuilder2.lineToRelative(16.95f, -17.0f);
        pathBuilder2.lineToRelative(27.15f, 38.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 196.0f, 240.0f);
        pathBuilder2.curveToRelative(0.44f, 0.0f, 0.88f, 0.05f, 1.32f, 0.05f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.31f, -4.69f);
        pathBuilder2.lineToRelative(26.64f, -26.64f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 240.0f, 196.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(59.0f, 177.83f);
        pathBuilder2.arcToRelative(86.09f, 86.09f, 0.0f, false, true, -19.0f, -55.0f);
        pathBuilder2.arcTo(84.27f, 84.27f, 0.0f, false, true, 122.8f, 40.0f);
        pathBuilder2.arcToRelative(86.28f, 86.28f, 0.0f, false, true, 55.0f, 19.0f);
        pathBuilder2.arcTo(85.08f, 85.08f, 0.0f, false, true, 196.58f, 80.1f);
        pathBuilder2.lineTo(80.1f, 196.58f);
        pathBuilder2.arcTo(85.08f, 85.08f, 0.0f, false, true, 59.0f, 177.83f);
        pathBuilder2.close();
        pathBuilder2.moveTo(197.35f, 224.0f);
        pathBuilder2.lineToRelative(-32.63f, -45.69f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.85f, -3.32f);
        pathBuilder2.quadToRelative(-0.33f, 0.0f, -0.66f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f);
        pathBuilder2.lineToRelative(-23.63f, 23.63f);
        pathBuilder2.arcToRelative(23.68f, 23.68f, 0.0f, false, true, -21.36f, 6.63f);
        pathBuilder2.arcToRelative(80.3f, 80.3f, 0.0f, false, true, -12.3f, -3.5f);
        pathBuilder2.lineToRelative(108.8f, -108.8f);
        pathBuilder2.arcToRelative(80.63f, 80.63f, 0.0f, false, true, 3.5f, 12.3f);
        pathBuilder2.arcToRelative(23.67f, 23.67f, 0.0f, false, true, -6.63f, 21.36f);
        pathBuilder2.lineTo(177.3f, 152.55f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.0f, 12.17f);
        pathBuilder2.lineTo(224.0f, 197.35f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pingPong = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
