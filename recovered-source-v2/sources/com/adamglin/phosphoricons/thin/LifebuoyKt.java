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

/* compiled from: Lifebuoy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lifebuoy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLifebuoy", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lifebuoy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LifebuoyKt {
    private static ImageVector _lifebuoy;

    public static final ImageVector getLifebuoy(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _lifebuoy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lifebuoy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(195.79f, 190.13f);
        pathBuilder.lineTo(161.79f, 156.13f);
        pathBuilder.arcToRelative(43.92f, 43.92f, 0.0f, false, false, 0.0f, -56.28f);
        pathBuilder.lineToRelative(34.0f, -34.0f);
        pathBuilder.arcToRelative(91.83f, 91.83f, 0.0f, false, true, 0.0f, 124.26f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 128.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(190.13f, 60.21f);
        pathBuilder.lineTo(156.13f, 94.21f);
        pathBuilder.arcToRelative(43.92f, 43.92f, 0.0f, false, false, -56.28f, 0.0f);
        pathBuilder.lineToRelative(-34.0f, -34.0f);
        pathBuilder.arcToRelative(91.83f, 91.83f, 0.0f, false, true, 124.26f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.21f, 65.87f);
        pathBuilder.lineToRelative(34.0f, 34.0f);
        pathBuilder.arcToRelative(43.92f, 43.92f, 0.0f, false, false, 0.0f, 56.28f);
        pathBuilder.lineToRelative(-34.0f, 34.0f);
        pathBuilder.arcToRelative(91.83f, 91.83f, 0.0f, false, true, 0.0f, -124.26f);
        pathBuilder.close();
        pathBuilder.moveTo(65.87f, 195.79f);
        pathBuilder.lineTo(99.87f, 161.79f);
        pathBuilder.arcToRelative(43.92f, 43.92f, 0.0f, false, false, 56.28f, 0.0f);
        pathBuilder.lineToRelative(34.0f, 34.0f);
        pathBuilder.arcToRelative(91.83f, 91.83f, 0.0f, false, true, -124.26f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lifebuoy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
