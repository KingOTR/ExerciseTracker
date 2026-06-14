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

/* compiled from: Mountains.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Mountains", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMountains", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mountains", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MountainsKt {
    private static ImageVector _mountains;

    public static final ImageVector getMountains(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _mountains;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Mountains", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.0f, 76.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 164.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 36.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 164.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(251.44f, 198.0f);
        pathBuilder.lineTo(196.88f, 105.92f);
        pathBuilder.arcTo(11.91f, 11.91f, 0.0f, false, false, 186.55f, 100.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(11.89f, 11.89f, 0.0f, false, false, -10.32f, 5.88f);
        pathBuilder.lineToRelative(-29.61f, 50.0f);
        pathBuilder.lineTo(98.34f, 73.91f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.68f, 0.0f);
        pathBuilder.lineTo(4.55f, 198.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 204.0f);
        pathBuilder.lineTo(248.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.44f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.55f, 78.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.9f, 0.0f);
        pathBuilder.lineToRelative(27.12f, 46.0f);
        pathBuilder.lineTo(57.43f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 196.0f);
        pathBuilder.lineToRelative(37.71f, -64.0f);
        pathBuilder.horizontalLineToRelative(70.58f);
        pathBuilder.lineTo(161.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.29f, 196.0f);
        pathBuilder.lineTo(151.29f, 163.71f);
        pathBuilder.lineTo(183.11f, 110.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.88f, 0.0f);
        pathBuilder.lineToRelative(51.0f, 86.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mountains = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
