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

/* compiled from: Handpeace.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandPeace", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHandPeace", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handPeace", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandpeaceKt {
    private static ImageVector _handPeace;

    public static final ImageVector getHandPeace(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(208.77f, 32.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -44.0f, 5.79f);
        pathBuilder.lineTo(148.0f, 100.54f);
        pathBuilder.lineTo(131.19f, 37.8f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 84.82f, 50.22f);
        pathBuilder.lineToRelative(11.0f, 41.17f);
        pathBuilder.lineToRelative(-15.0f, -2.9f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -17.49f, 43.87f);
        pathBuilder.lineToRelative(-0.55f, 0.35f);
        pathBuilder.arcToRelative(23.85f, 23.85f, 0.0f, false, false, -10.28f, 15.22f);
        pathBuilder.arcToRelative(24.65f, 24.65f, 0.0f, false, false, -0.49f, 4.89f);
        pathBuilder.lineTo(52.01f, 160.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 76.0f, 76.0f);
        pathBuilder.horizontalLineToRelative(0.59f);
        pathBuilder.curveToRelative(41.58f, -0.31f, 75.42f, -34.81f, 75.42f, -76.9f);
        pathBuilder.verticalLineToRelative(-3.34f);
        pathBuilder.arcToRelative(51.91f, 51.91f, 0.0f, false, false, -12.17f, -33.35f);
        pathBuilder.lineToRelative(19.34f, -72.19f);
        pathBuilder.arcTo(23.82f, 23.82f, 0.0f, false, false, 208.77f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.15f, 36.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 29.31f, 3.86f);
        pathBuilder.lineToRelative(16.19f, 60.42f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 119.07f, 107.0f);
        pathBuilder.arcToRelative(24.35f, 24.35f, 0.0f, false, false, -2.24f, -4.25f);
        pathBuilder.arcToRelative(23.75f, 23.75f, 0.0f, false, false, -12.17f, -9.41f);
        pathBuilder.lineTo(92.55f, 48.15f);
        pathBuilder.arcTo(15.9f, 15.9f, 0.0f, false, true, 94.15f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.33f, 108.8f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 79.25f, 96.34f);
        pathBuilder.lineToRelative(20.76f, 4.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -6.44f, 31.34f);
        pathBuilder.lineToRelative(-20.79f, -4.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.45f, -18.87f);
        pathBuilder.close();
        pathBuilder.moveTo(60.33f, 149.52f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 79.09f, 137.0f);
        pathBuilder.lineToRelative(10.11f, 2.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -6.42f, 31.35f);
        pathBuilder.lineToRelative(-10.0f, -2.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.47f, -18.88f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 159.1f);
        pathBuilder.curveToRelative(0.0f, 37.71f, -30.28f, 68.62f, -67.48f, 68.9f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, true, 61.0f, 171.43f);
        pathBuilder.arcToRelative(23.75f, 23.75f, 0.0f, false, false, 10.24f, 4.81f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(10.0f, 2.0f);
        pathBuilder.arcToRelative(24.19f, 24.19f, 0.0f, false, false, 4.85f, 0.49f);
        pathBuilder.arcTo(23.9f, 23.9f, 0.0f, false, false, 104.0f, 138.88f);
        pathBuilder.arcToRelative(24.07f, 24.07f, 0.0f, false, false, 9.75f, -5.89f);
        pathBuilder.arcToRelative(25.0f, 25.0f, 0.0f, false, false, 2.24f, 4.25f);
        pathBuilder.arcToRelative(23.83f, 23.83f, 0.0f, false, false, 15.24f, 10.28f);
        pathBuilder.lineToRelative(10.5f, 2.11f);
        pathBuilder.arcTo(32.27f, 32.27f, 0.0f, false, false, 140.0f, 160.0f);
        pathBuilder.arcToRelative(31.85f, 31.85f, 0.0f, false, false, 9.14f, 22.4f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.71f, -5.6f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -4.0f, -28.22f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.73f, -5.83f);
        pathBuilder.lineToRelative(-15.35f, -3.07f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 6.42f, -31.35f);
        pathBuilder.lineToRelative(21.4f, 4.28f);
        pathBuilder.arcTo(44.12f, 44.12f, 0.0f, false, true, 196.0f, 155.76f);
        pathBuilder.close();
        pathBuilder.moveTo(203.45f, 48.15f);
        pathBuilder.lineTo(185.3f, 115.88f);
        pathBuilder.arcToRelative(51.6f, 51.6f, 0.0f, false, false, -23.11f, -11.11f);
        pathBuilder.lineToRelative(-6.68f, -1.34f);
        pathBuilder.lineToRelative(17.0f, -63.56f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 30.91f, 8.28f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handPeace = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
