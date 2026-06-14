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

/* compiled from: Lightninga.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LightningA", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLightningA", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightningA", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningaKt {
    private static ImageVector _lightningA;

    public static final ImageVector getLightningA(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _lightningA;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LightningA", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(173.88f, 111.94f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.42f, -4.27f);
        pathBuilder.lineTo(119.0f, 84.56f);
        pathBuilder.lineTo(133.0f, 25.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.24f, -5.47f);
        pathBuilder.lineTo(27.6f, 122.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.94f, 9.55f);
        pathBuilder.lineTo(81.0f, 155.44f);
        pathBuilder.lineTo(67.0f, 214.61f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, 6.68f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.22f, -1.22f);
        pathBuilder.lineToRelative(95.2f, -102.85f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 173.88f, 111.94f);
        pathBuilder.close();
        pathBuilder.moveTo(83.88f, 195.15f);
        pathBuilder.lineTo(93.8f, 153.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.38f, -6.86f);
        pathBuilder.lineTo(42.08f, 124.8f);
        pathBuilder.lineToRelative(74.0f, -80.0f);
        pathBuilder.lineToRelative(-9.92f, 41.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.38f, 6.86f);
        pathBuilder.lineToRelative(48.38f, 21.73f);
        pathBuilder.close();
        pathBuilder.moveTo(237.32f, 213.31f);
        pathBuilder.lineTo(201.32f, 141.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.74f, 0.0f);
        pathBuilder.lineToRelative(-36.0f, 72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.74f, 5.37f);
        pathBuilder.lineTo(175.71f, 198.0f);
        pathBuilder.horizontalLineToRelative(40.58f);
        pathBuilder.lineToRelative(10.34f, 20.68f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 222.0f);
        pathBuilder.arcToRelative(5.87f, 5.87f, 0.0f, false, false, 2.68f, -0.64f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 237.36f, 213.31f);
        pathBuilder.close();
        pathBuilder.moveTo(181.71f, 186.0f);
        pathBuilder.lineTo(196.0f, 157.42f);
        pathBuilder.lineTo(210.29f, 186.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightningA = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
