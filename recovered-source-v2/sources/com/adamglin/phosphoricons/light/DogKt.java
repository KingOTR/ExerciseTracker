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

/* compiled from: Dog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dog", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDog", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dog", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DogKt {
    private static ImageVector _dog;

    public static final ImageVector getDog(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _dog;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Dog", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(102.0f, 140.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 102.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 130.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 164.0f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(229.77f, 140.72f);
        pathBuilder.arcToRelative(14.24f, 14.24f, 0.0f, false, true, -5.89f, 1.29f);
        pathBuilder.arcToRelative(13.72f, 13.72f, 0.0f, false, true, -9.88f, -4.23f);
        pathBuilder.lineTo(214.0f, 184.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, 38.0f);
        pathBuilder.lineTo(80.0f, 222.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, -38.0f);
        pathBuilder.lineTo(42.0f, 137.78f);
        pathBuilder.arcTo(13.76f, 13.76f, 0.0f, false, true, 32.11f, 142.0f);
        pathBuilder.arcToRelative(14.23f, 14.23f, 0.0f, false, true, -5.88f, -1.29f);
        pathBuilder.arcToRelative(13.82f, 13.82f, 0.0f, false, true, -8.0f, -15.34f);
        pathBuilder.lineToRelative(16.42f, -88.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 17.16f, -11.0f);
        pathBuilder.lineToRelative(0.24f, 0.07f);
        pathBuilder.lineTo(104.86f, 42.0f);
        pathBuilder.horizontalLineToRelative(46.28f);
        pathBuilder.lineToRelative(52.79f, -15.51f);
        pathBuilder.lineToRelative(0.24f, -0.07f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 17.16f, 11.0f);
        pathBuilder.lineToRelative(16.42f, 88.0f);
        pathBuilder.arcTo(13.81f, 13.81f, 0.0f, false, true, 229.77f, 140.72f);
        pathBuilder.close();
        pathBuilder.moveTo(93.88f, 51.27f);
        pathBuilder.lineTo(48.84f, 38.0f);
        pathBuilder.arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.49f, 0.27f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.88f, 1.32f);
        pathBuilder.lineToRelative(-16.42f, 88.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.54f, 1.61f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 184.0f);
        pathBuilder.lineTo(202.0f, 122.43f);
        pathBuilder.lineTo(149.06f, 54.0f);
        pathBuilder.lineTo(106.94f, 54.0f);
        pathBuilder.lineTo(54.0f, 122.43f);
        pathBuilder.lineTo(54.0f, 184.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, 26.0f, 26.0f);
        pathBuilder.horizontalLineToRelative(42.0f);
        pathBuilder.lineTo(122.0f, 194.48f);
        pathBuilder.lineToRelative(-14.24f, -14.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineTo(128.0f, 183.51f);
        pathBuilder.lineToRelative(11.76f, -11.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.lineTo(134.0f, 194.48f);
        pathBuilder.lineTo(134.0f, 210.0f);
        pathBuilder.horizontalLineToRelative(42.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 202.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 127.6f);
        pathBuilder.lineToRelative(-16.42f, -88.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.88f, -1.31f);
        pathBuilder.arcToRelative(2.07f, 2.07f, 0.0f, false, false, -1.49f, -0.27f);
        pathBuilder.lineToRelative(-45.0f, 13.23f);
        pathBuilder.lineToRelative(60.32f, 78.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 226.0f, 127.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dog = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
