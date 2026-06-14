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

/* compiled from: Dog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dog", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getDog", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dog", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DogKt {
    private static ImageVector _dog;

    public static final ImageVector getDog(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(100.0f, 140.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 148.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.94f, 138.89f);
        pathBuilder.arcToRelative(12.12f, 12.12f, 0.0f, false, true, -5.0f, 1.11f);
        pathBuilder.arcToRelative(11.83f, 11.83f, 0.0f, false, true, -9.35f, -4.62f);
        pathBuilder.lineTo(212.0f, 132.09f);
        pathBuilder.lineTo(212.0f, 184.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f);
        pathBuilder.lineTo(80.0f, 220.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f);
        pathBuilder.lineTo(44.0f, 132.09f);
        pathBuilder.lineToRelative(-2.53f, 3.27f);
        pathBuilder.arcTo(11.88f, 11.88f, 0.0f, false, true, 32.1f, 140.0f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, true, -5.0f, -1.11f);
        pathBuilder.arcToRelative(11.82f, 11.82f, 0.0f, false, true, -6.84f, -13.14f);
        pathBuilder.lineToRelative(16.42f, -88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.7f, -9.43f);
        pathBuilder.lineToRelative(0.16f, 0.0f);
        pathBuilder.lineTo(104.58f, 44.0f);
        pathBuilder.horizontalLineToRelative(46.84f);
        pathBuilder.lineTo(204.5f, 28.4f);
        pathBuilder.lineToRelative(0.16f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.7f, 9.43f);
        pathBuilder.lineToRelative(16.42f, 88.0f);
        pathBuilder.arcTo(11.81f, 11.81f, 0.0f, false, true, 228.94f, 138.89f);
        pathBuilder.close();
        pathBuilder.moveTo(97.25f, 50.18f);
        pathBuilder.lineTo(49.34f, 36.1f);
        pathBuilder.arcToRelative(4.18f, 4.18f, 0.0f, false, false, -0.92f, -0.1f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.92f, 3.26f);
        pathBuilder.lineToRelative(-16.42f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.08f, 3.22f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 121.75f);
        pathBuilder.lineTo(150.0f, 52.0f);
        pathBuilder.lineTo(106.0f, 52.0f);
        pathBuilder.lineTo(52.0f, 121.75f);
        pathBuilder.lineTo(52.0f, 184.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.lineTo(124.0f, 193.66f);
        pathBuilder.lineToRelative(-14.83f, -14.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.lineTo(128.0f, 186.34f);
        pathBuilder.lineToRelative(13.17f, -13.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 5.66f);
        pathBuilder.lineTo(132.0f, 193.66f);
        pathBuilder.lineTo(132.0f, 212.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.92f, 127.23f);
        pathBuilder.lineTo(211.5f, 39.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.84f, -3.16f);
        pathBuilder.lineTo(158.75f, 50.18f);
        pathBuilder.lineToRelative(62.11f, 80.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.06f, -3.23f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dog = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
