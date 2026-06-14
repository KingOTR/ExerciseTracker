package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Handpeace.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandPeace", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHandPeace", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handPeace", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandpeaceKt {
    private static ImageVector _handPeace;

    public static final ImageVector getHandPeace(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(212.24f, 30.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 161.0f, 36.77f);
        pathBuilder.lineTo(148.0f, 85.09f);
        pathBuilder.lineTo(135.05f, 36.77f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 81.0f, 51.26f);
        pathBuilder.lineToRelative(9.38f, 35.0f);
        pathBuilder.lineToRelative(-8.73f, -1.68f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 56.8f, 132.38f);
        pathBuilder.arcTo(27.86f, 27.86f, 0.0f, false, false, 48.0f, 152.87f);
        pathBuilder.lineTo(48.0f, 160.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, 80.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(0.61f);
        pathBuilder.curveToRelative(43.78f, -0.33f, 79.39f, -36.62f, 79.39f, -80.9f);
        pathBuilder.verticalLineToRelative(-3.34f);
        pathBuilder.arcToRelative(55.88f, 55.88f, 0.0f, false, false, -11.77f, -34.27f);
        pathBuilder.lineTo(215.0f, 51.26f);
        pathBuilder.arcTo(27.8f, 27.8f, 0.0f, false, false, 212.24f, 30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(97.61f, 38.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.0f, 2.9f);
        pathBuilder.lineToRelative(14.77f, 55.15f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -14.0f, 4.77f);
        pathBuilder.arcToRelative(2.26f, 2.26f, 0.0f, false, false, -0.16f, -0.26f);
        pathBuilder.arcTo(27.65f, 27.65f, 0.0f, false, false, 108.0f, 90.35f);
        pathBuilder.lineTo(96.42f, 47.12f);
        pathBuilder.arcTo(11.94f, 11.94f, 0.0f, false, true, 97.61f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.25f, 109.6f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.25f, -9.34f);
        pathBuilder.lineToRelative(20.71f, 4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.36f, 14.16f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.25f, 9.34f);
        pathBuilder.lineToRelative(-20.75f, -4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.32f, -14.15f);
        pathBuilder.close();
        pathBuilder.moveTo(64.25f, 150.32f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.0f, -9.37f);
        pathBuilder.lineToRelative(10.11f, 2.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.36f, 14.15f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.2f, 9.35f);
        pathBuilder.lineToRelative(-10.0f, -2.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.34f, -14.16f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 159.1f);
        pathBuilder.curveToRelative(0.0f, 35.53f, -28.49f, 64.64f, -63.5f, 64.9f);
        pathBuilder.arcToRelative(64.08f, 64.08f, 0.0f, false, true, -61.56f, -44.78f);
        pathBuilder.arcToRelative(30.74f, 30.74f, 0.0f, false, false, 3.48f, 0.95f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(10.0f, 2.0f);
        pathBuilder.arcToRelative(28.33f, 28.33f, 0.0f, false, false, 5.61f, 0.57f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 24.16f, -42.14f);
        pathBuilder.curveToRelative(0.79f, -0.43f, 1.57f, -0.89f, 2.32f, -1.4f);
        pathBuilder.lineToRelative(0.16f, 0.26f);
        pathBuilder.arcToRelative(27.82f, 27.82f, 0.0f, false, false, 17.78f, 12.0f);
        pathBuilder.lineToRelative(6.32f, 1.26f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 9.53f, 32.49f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 157.71f, 174.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -3.31f, -23.51f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.46f, -11.66f);
        pathBuilder.lineToRelative(-15.34f, -3.07f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.35f, -14.15f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.18f, -9.35f);
        pathBuilder.lineToRelative(21.41f, 4.28f);
        pathBuilder.arcTo(40.1f, 40.1f, 0.0f, false, true, 192.0f, 155.76f);
        pathBuilder.close();
        pathBuilder.moveTo(199.59f, 47.1f);
        pathBuilder.lineTo(182.97f, 109.1f);
        pathBuilder.arcToRelative(55.55f, 55.55f, 0.0f, false, false, -20.0f, -8.28f);
        pathBuilder.lineToRelative(-2.5f, -0.5f);
        pathBuilder.lineTo(176.4f, 40.91f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.18f, 6.21f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handPeace = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
