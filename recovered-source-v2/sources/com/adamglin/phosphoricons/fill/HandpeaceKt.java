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

/* compiled from: Handpeace.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandPeace", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHandPeace", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handPeace", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandpeaceKt {
    private static ImageVector _handPeace;

    public static final ImageVector getHandPeace(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _handPeace;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandPeace", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(96.55f, 36.14f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 11.0f, -19.52f);
        pathBuilder.curveToRelative(8.61f, -2.46f, 17.65f, 3.0f, 20.0f, 11.65f);
        pathBuilder.lineToRelative(16.0f, 59.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.18f, 5.0f);
        pathBuilder.arcTo(31.79f, 31.79f, 0.0f, false, false, 128.0f, 98.0f);
        pathBuilder.curveToRelative(-0.56f, 0.37f, -1.1f, 0.76f, -1.64f, 1.17f);
        pathBuilder.curveToRelative(-0.33f, -0.58f, -0.67f, -1.16f, -1.0f, -1.72f);
        pathBuilder.arcToRelative(31.74f, 31.74f, 0.0f, false, false, -14.0f, -11.72f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, -2.25f, -2.62f);
        pathBuilder.close();
        pathBuilder.moveTo(80.4f, 176.65f);
        pathBuilder.arcToRelative(16.17f, 16.17f, 0.0f, false, false, 3.23f, 0.33f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 86.8f, 145.3f);
        pathBuilder.lineToRelative(-19.59f, -4.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.41f, 31.35f);
        pathBuilder.close();
        pathBuilder.moveTo(60.8f, 123.65f);
        pathBuilder.lineTo(95.44f, 130.72f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 6.4f, -31.35f);
        pathBuilder.lineTo(67.21f, 92.33f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.33f, 104.8f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 60.8f, 123.68f);
        pathBuilder.close();
        pathBuilder.moveTo(162.8f, 95.49f);
        pathBuilder.lineTo(186.35f, 100.3f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 191.0f, 97.44f);
        pathBuilder.lineToRelative(16.42f, -61.3f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -30.91f, -8.28f);
        pathBuilder.lineToRelative(-16.8f, 62.7f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 162.81f, 95.52f);
        pathBuilder.close();
        pathBuilder.moveTo(200.14f, 127.23f);
        pathBuilder.arcToRelative(23.89f, 23.89f, 0.0f, false, false, -15.67f, -11.0f);
        pathBuilder.lineTo(148.87f, 109.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.12f, 5.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -2.43f, 3.57f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.72f, 17.0f);
        pathBuilder.arcToRelative(16.5f, 16.5f, 0.0f, false, false, 9.8f, 5.93f);
        pathBuilder.lineToRelative(15.24f, 3.11f);
        pathBuilder.arcToRelative(8.06f, 8.06f, 0.0f, false, true, 6.32f, 9.36f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 2.77f, 19.0f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, -1.93f, 10.41f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.94f, -2.43f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -5.48f, -22.09f);
        pathBuilder.lineTo(139.27f, 156.0f);
        pathBuilder.arcTo(31.78f, 31.78f, 0.0f, false, true, 119.0f, 142.32f);
        pathBuilder.curveToRelative(-0.38f, -0.57f, -0.73f, -1.15f, -1.06f, -1.74f);
        pathBuilder.arcToRelative(32.12f, 32.12f, 0.0f, false, true, -6.87f, 4.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 83.63f, 193.0f);
        pathBuilder.arcToRelative(32.32f, 32.32f, 0.0f, false, true, -6.43f, -0.65f);
        pathBuilder.lineToRelative(-19.59f, -4.0f);
        pathBuilder.horizontalLineToRelative(-0.06f);
        pathBuilder.arcToRelative(2.61f, 2.61f, 0.0f, false, false, -3.0f, 3.57f);
        pathBuilder.arcTo(80.19f, 80.19f, 0.0f, false, false, 128.0f, 240.0f);
        pathBuilder.horizontalLineToRelative(0.61f);
        pathBuilder.curveToRelative(43.77f, -0.33f, 79.39f, -36.62f, 79.39f, -80.9f);
        pathBuilder.verticalLineToRelative(-3.34f);
        pathBuilder.arcTo(55.72f, 55.72f, 0.0f, false, false, 200.15f, 127.26f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handPeace = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
