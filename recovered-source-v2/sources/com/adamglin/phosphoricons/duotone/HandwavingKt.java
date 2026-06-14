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

/* compiled from: Handwaving.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandWaving", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHandWaving", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handWaving", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandwavingKt {
    private static ImageVector _handWaving;

    public static final ImageVector getHandWaving(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _handWaving;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandWaving", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(184.0f, 213.27f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, true, 74.7f, 184.0f);
        pathBuilder.lineToRelative(-40.0f, -69.32f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 34.64f, -20.0f);
        pathBuilder.lineTo(55.08f, 70.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 89.73f, 50.0f);
        pathBuilder.lineToRelative(6.92f, 12.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 34.64f, -20.0f);
        pathBuilder.lineToRelative(30.0f, 52.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 196.0f, 74.0f);
        pathBuilder.lineToRelative(17.31f, 30.0f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, true, 184.0f, 213.27f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(220.17f, 100.0f);
        pathBuilder2.lineTo(202.86f, 70.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -38.24f, -10.25f);
        pathBuilder2.arcToRelative(27.69f, 27.69f, 0.0f, false, false, -9.0f, 8.34f);
        pathBuilder2.lineTo(138.2f, 38.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -48.48f, 0.0f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 48.15f, 74.0f);
        pathBuilder2.lineToRelative(1.59f, 2.76f);
        pathBuilder2.arcTo(27.67f, 27.67f, 0.0f, false, false, 38.0f, 80.41f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -10.24f, 38.25f);
        pathBuilder2.lineToRelative(40.0f, 69.32f);
        pathBuilder2.arcToRelative(87.47f, 87.47f, 0.0f, false, false, 53.43f, 41.0f);
        pathBuilder2.arcToRelative(88.56f, 88.56f, 0.0f, false, false, 22.92f, 3.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 76.06f, -132.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(213.51f, 162.64f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, false, true, 81.62f, 180.0f);
        pathBuilder2.lineToRelative(-40.0f, -69.32f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.78f, -12.0f);
        pathBuilder2.lineTo(81.63f, 132.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.85f, -8.0f);
        pathBuilder2.lineTo(62.0f, 66.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, true, true, 82.78f, 54.0f);
        pathBuilder2.lineTo(114.0f, 108.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.85f, -8.0f);
        pathBuilder2.lineTo(103.57f, 58.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.78f, -12.0f);
        pathBuilder2.lineToRelative(33.42f, 57.9f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -5.54f, 60.6f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.24f, -9.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 172.78f, 112.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.13f, -10.4f);
        pathBuilder2.lineTo(168.23f, 90.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, true, true, 189.0f, 78.0f);
        pathBuilder2.lineToRelative(17.31f, 30.0f);
        pathBuilder2.arcTo(71.56f, 71.56f, 0.0f, false, true, 213.51f, 162.62f);
        pathBuilder2.close();
        pathBuilder2.moveTo(184.25f, 31.71f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 194.0f, 26.0f);
        pathBuilder2.arcToRelative(59.62f, 59.62f, 0.0f, false, true, 36.53f, 28.0f);
        pathBuilder2.lineToRelative(0.33f, 0.57f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.85f, 8.0f);
        pathBuilder2.lineToRelative(-0.33f, -0.57f);
        pathBuilder2.arcToRelative(43.67f, 43.67f, 0.0f, false, false, -26.8f, -20.5f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 184.25f, 31.71f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.89f, 237.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.23f, 1.33f);
        pathBuilder2.arcTo(119.56f, 119.56f, 0.0f, false, true, 40.06f, 204.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.86f, -8.0f);
        pathBuilder2.arcToRelative(103.67f, 103.67f, 0.0f, false, false, 25.64f, 29.72f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 80.89f, 237.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handWaving = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
