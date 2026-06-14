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

/* compiled from: Boxingglove.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BoxingGlove", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBoxingGlove", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boxingGlove", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoxinggloveKt {
    private static ImageVector _boxingGlove;

    public static final ImageVector getBoxingGlove(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _boxingGlove;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BoxingGlove", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 18.0f);
        pathBuilder.lineTo(120.0f, 18.0f);
        pathBuilder.arcTo(54.06f, 54.06f, 0.0f, false, false, 66.0f, 72.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(56.0f, 74.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -30.0f, 30.0f);
        pathBuilder.verticalLineToRelative(29.19f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 3.07f, 8.75f);
        pathBuilder.arcToRelative(5.66f, 5.66f, 0.0f, false, false, 0.47f, 0.52f);
        pathBuilder.lineToRelative(36.46f, 36.0f);
        pathBuilder.lineTo(66.0f, 216.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(192.0f, 230.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(206.0f, 176.84f);
        pathBuilder.lineToRelative(15.46f, -54.11f);
        pathBuilder.arcToRelative(13.93f, 13.93f, 0.0f, false, false, 0.54f, -3.85f);
        pathBuilder.lineTo(222.0f, 72.0f);
        pathBuilder.arcTo(54.06f, 54.06f, 0.0f, false, false, 168.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 118.88f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.08f, 0.55f);
        pathBuilder.lineToRelative(-15.69f, 54.92f);
        pathBuilder.arcTo(6.14f, 6.14f, 0.0f, false, false, 194.0f, 176.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(80.0f, 218.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(78.0f, 176.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.78f, -4.27f);
        pathBuilder.lineTo(38.3f, 134.25f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.3f, -1.06f);
        pathBuilder.lineTo(38.0f, 104.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 56.0f, 86.0f);
        pathBuilder.lineTo(66.0f, 86.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(78.0f, 72.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, -42.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.68f, 165.37f);
        pathBuilder.lineTo(149.42f, 176.0f);
        pathBuilder.lineToRelative(21.26f, 10.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, 10.74f);
        pathBuilder.lineTo(136.0f, 182.71f);
        pathBuilder.lineToRelative(-29.32f, 14.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, -10.74f);
        pathBuilder.lineTo(122.58f, 176.0f);
        pathBuilder.lineToRelative(-21.26f, -10.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.36f, -10.74f);
        pathBuilder.lineTo(136.0f, 169.29f);
        pathBuilder.lineToRelative(29.32f, -14.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 5.36f, 10.74f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boxingGlove = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
