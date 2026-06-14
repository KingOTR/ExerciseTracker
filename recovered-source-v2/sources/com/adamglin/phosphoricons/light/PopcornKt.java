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

/* compiled from: Popcorn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Popcorn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPopcorn", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_popcorn", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PopcornKt {
    private static ImageVector _popcorn;

    public static final ImageVector getPopcorn(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _popcorn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Popcorn", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.14f, 75.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.79f, -1.43f);
        pathBuilder.lineToRelative(-1.41f, 0.4f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, -54.07f, -30.52f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, -77.74f, 0.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, false, 35.06f, 74.63f);
        pathBuilder.lineToRelative(-1.41f, -0.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.49f, 7.14f);
        pathBuilder.lineTo(56.71f, 211.21f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 70.34f, 222.0f);
        pathBuilder.lineTo(185.66f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.63f, -10.79f);
        pathBuilder.lineTo(229.84f, 81.37f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 228.14f, 75.66f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 54.0f);
        pathBuilder.arcToRelative(29.54f, 29.54f, 0.0f, false, true, 14.0f, 3.49f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.68f, -4.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 58.56f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.67f, 4.0f);
        pathBuilder.arcTo(29.6f, 29.6f, 0.0f, false, true, 180.0f, 54.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 29.39f, 23.94f);
        pathBuilder.lineTo(168.32f, 89.67f);
        pathBuilder.lineToRelative(-35.12f, -14.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -10.4f, 0.0f);
        pathBuilder.lineToRelative(-35.12f, 14.0f);
        pathBuilder.lineTo(46.61f, 77.94f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 76.0f, 54.0f);
        pathBuilder.close();
        pathBuilder.moveTo(161.44f, 99.84f);
        pathBuilder.lineTo(146.75f, 210.0f);
        pathBuilder.horizontalLineToRelative(-37.5f);
        pathBuilder.lineTo(94.56f, 99.84f);
        pathBuilder.lineToRelative(32.7f, -13.08f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.48f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.44f, 208.46f);
        pathBuilder.lineTo(40.18f, 88.58f);
        pathBuilder.lineToRelative(42.39f, 12.11f);
        pathBuilder.lineTo(97.15f, 210.0f);
        pathBuilder.lineTo(70.34f, 210.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 68.39f, 208.46f);
        pathBuilder.close();
        pathBuilder.moveTo(187.66f, 208.46f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.54f);
        pathBuilder.lineTo(158.85f, 210.0f);
        pathBuilder.lineToRelative(14.58f, -109.31f);
        pathBuilder.lineToRelative(42.39f, -12.11f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _popcorn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
