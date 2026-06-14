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

/* compiled from: Octagon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Octagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getOctagon", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_octagon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OctagonKt {
    private static ImageVector _octagon;

    public static final ImageVector getOctagon(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _octagon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Octagon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.49f, 83.06f);
        pathBuilder.lineTo(172.94f, 31.51f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 164.45f, 28.0f);
        pathBuilder.horizontalLineTo(91.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.51f);
        pathBuilder.lineTo(31.51f, 83.06f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 91.55f);
        pathBuilder.verticalLineToRelative(72.9f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.51f, 8.49f);
        pathBuilder.lineToRelative(51.55f, 51.55f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 91.55f, 228.0f);
        pathBuilder.horizontalLineToRelative(72.9f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f);
        pathBuilder.lineToRelative(51.55f, -51.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.51f, -8.49f);
        pathBuilder.verticalLineTo(91.55f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 224.49f, 83.06f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 164.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.17f, 2.83f);
        pathBuilder.lineToRelative(-51.55f, 51.55f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, 1.17f);
        pathBuilder.horizontalLineTo(91.55f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.83f, -1.17f);
        pathBuilder.lineTo(37.17f, 167.28f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 164.45f);
        pathBuilder.verticalLineTo(91.55f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -2.83f);
        pathBuilder.lineTo(88.72f, 37.17f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 91.55f, 36.0f);
        pathBuilder.horizontalLineToRelative(72.9f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 1.17f);
        pathBuilder.lineToRelative(51.55f, 51.55f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 91.55f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _octagon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
