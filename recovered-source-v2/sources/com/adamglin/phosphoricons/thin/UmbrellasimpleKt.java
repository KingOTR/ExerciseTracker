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

/* compiled from: Umbrellasimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UmbrellaSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUmbrellaSimple", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_umbrellaSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UmbrellasimpleKt {
    private static ImageVector _umbrellaSimple;

    public static final ImageVector getUmbrellaSimple(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _umbrellaSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UmbrellaSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.0f, 127.0f);
        pathBuilder.arcTo(108.44f, 108.44f, 0.0f, false, false, 54.46f, 56.69f);
        pathBuilder.arcTo(107.53f, 107.53f, 0.0f, false, false, 20.0f, 127.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 140.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.0f, 130.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 1.3f);
        pathBuilder.lineTo(32.0f, 132.04f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.38f);
        pathBuilder.arcToRelative(100.43f, 100.43f, 0.0f, false, true, 168.1f, -65.0f);
        pathBuilder.arcToRelative(99.53f, 99.53f, 0.0f, false, true, 31.88f, 65.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 226.93f, 130.7f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _umbrellaSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
