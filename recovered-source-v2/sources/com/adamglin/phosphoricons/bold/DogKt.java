package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dog", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getDog", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dog", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DogKt {
    private static ImageVector _dog;

    public static final ImageVector getDog(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(108.0f, 136.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 120.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 164.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.24f, 146.18f);
        pathBuilder.arcToRelative(20.42f, 20.42f, 0.0f, false, true, -8.41f, 1.85f);
        pathBuilder.arcToRelative(19.59f, 19.59f, 0.0f, false, true, -3.83f, -0.39f);
        pathBuilder.lineTo(220.0f, 184.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f);
        pathBuilder.lineTo(80.0f, 228.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f);
        pathBuilder.lineTo(36.0f, 147.63f);
        pathBuilder.arcToRelative(19.0f, 19.0f, 0.0f, false, true, -3.85f, 0.39f);
        pathBuilder.arcToRelative(20.31f, 20.31f, 0.0f, false, true, -8.39f, -1.84f);
        pathBuilder.arcToRelative(19.71f, 19.71f, 0.0f, false, true, -11.4f, -21.9f);
        pathBuilder.lineToRelative(16.42f, -88.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 53.29f, 20.59f);
        pathBuilder.lineToRelative(0.47f, 0.13f);
        pathBuilder.lineToRelative(52.0f, 15.27f);
        pathBuilder.horizontalLineToRelative(44.54f);
        pathBuilder.lineToRelative(52.0f, -15.27f);
        pathBuilder.lineToRelative(0.47f, -0.13f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 24.51f, 15.72f);
        pathBuilder.lineToRelative(16.42f, 88.0f);
        pathBuilder.arcTo(19.71f, 19.71f, 0.0f, false, true, 232.24f, 146.18f);
        pathBuilder.close();
        pathBuilder.moveTo(172.24f, 54.55f);
        pathBuilder.lineTo(217.0f, 112.42f);
        pathBuilder.lineTo(204.44f, 45.09f);
        pathBuilder.close();
        pathBuilder.moveTo(39.0f, 112.42f);
        pathBuilder.lineTo(83.76f, 54.55f);
        pathBuilder.lineToRelative(-32.2f, -9.46f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 184.0f);
        pathBuilder.lineTo(196.0f, 124.48f);
        pathBuilder.lineTo(146.11f, 60.0f);
        pathBuilder.lineTo(109.89f, 60.0f);
        pathBuilder.lineTo(60.0f, 124.48f);
        pathBuilder.lineTo(60.0f, 184.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.lineToRelative(-12.48f, -12.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f);
        pathBuilder.lineTo(128.0f, 175.0f);
        pathBuilder.lineToRelative(7.51f, -7.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f);
        pathBuilder.lineTo(140.0f, 197.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 196.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dog = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
