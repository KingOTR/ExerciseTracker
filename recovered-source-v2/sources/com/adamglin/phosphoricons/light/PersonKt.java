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

/* compiled from: Person.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Person", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPerson", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_person", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonKt {
    private static ImageVector _person;

    public static final ImageVector getPerson(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _person;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Person", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 70.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, true, false, 98.0f, 40.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 70.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 22.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.88f, 135.42f);
        pathBuilder.lineTo(171.67f, 84.16f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 149.17f, 74.0f);
        pathBuilder.lineTo(106.83f, 74.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -22.5f, 10.15f);
        pathBuilder.lineTo(39.12f, 135.42f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, false, 64.46f, 161.0f);
        pathBuilder.lineToRelative(21.11f, -16.93f);
        pathBuilder.lineTo(67.44f, 212.92f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 32.75f, 14.94f);
        pathBuilder.lineTo(128.0f, 180.0f);
        pathBuilder.lineToRelative(27.81f, 47.91f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 32.75f, -14.94f);
        pathBuilder.lineToRelative(-18.13f, -68.87f);
        pathBuilder.lineTo(191.54f, 161.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 25.34f, -25.56f);
        pathBuilder.close();
        pathBuilder.moveTo(208.25f, 152.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, 0.0f);
        pathBuilder.arcToRelative(4.15f, 4.15f, 0.0f, false, false, -0.49f, -0.44f);
        pathBuilder.lineToRelative(-35.51f, -28.48f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.56f, 6.2f);
        pathBuilder.lineToRelative(22.87f, 86.93f);
        pathBuilder.arcToRelative(7.66f, 7.66f, 0.0f, false, false, 0.37f, 1.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.88f, 5.07f);
        pathBuilder.arcToRelative(4.37f, 4.37f, 0.0f, false, false, -0.25f, -0.48f);
        pathBuilder.lineTo(133.19f, 165.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.38f, 0.0f);
        pathBuilder.lineTo(89.69f, 222.05f);
        pathBuilder.arcToRelative(4.37f, 4.37f, 0.0f, false, false, -0.25f, 0.48f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.88f, -5.07f);
        pathBuilder.arcToRelative(7.66f, 7.66f, 0.0f, false, false, 0.37f, -1.0f);
        pathBuilder.lineToRelative(22.87f, -86.93f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 99.27f, 123.0f);
        pathBuilder.arcTo(6.07f, 6.07f, 0.0f, false, false, 96.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.76f, 1.32f);
        pathBuilder.lineTo(56.73f, 151.8f);
        pathBuilder.arcToRelative(4.15f, 4.15f, 0.0f, false, false, -0.49f, 0.44f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.49f);
        pathBuilder.lineToRelative(0.26f, -0.27f);
        pathBuilder.lineTo(93.33f, 92.09f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 106.83f, 86.0f);
        pathBuilder.horizontalLineToRelative(42.34f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 13.5f, 6.09f);
        pathBuilder.lineTo(208.0f, 143.48f);
        pathBuilder.lineToRelative(0.26f, 0.27f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 208.25f, 152.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _person = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
