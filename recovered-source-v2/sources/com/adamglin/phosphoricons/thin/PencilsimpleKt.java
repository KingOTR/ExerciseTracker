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

/* compiled from: Pencilsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PencilSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPencilSimple", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencilSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilsimpleKt {
    private static ImageVector _pencilSimple;

    public static final ImageVector getPencilSimple(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pencilSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PencilSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.49f, 76.2f);
        pathBuilder.lineTo(179.8f, 31.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineTo(133.17f, 61.17f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(39.52f, 154.83f);
        pathBuilder.arcTo(11.9f, 11.9f, 0.0f, false, false, 36.0f, 163.31f);
        pathBuilder.lineTo(36.0f, 208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(92.69f, 220.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, -3.51f);
        pathBuilder.lineTo(224.48f, 93.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(95.49f, 210.83f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 92.69f, 212.0f);
        pathBuilder.lineTo(48.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(44.0f, 163.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -2.83f);
        pathBuilder.lineTo(136.0f, 69.65f);
        pathBuilder.lineTo(186.34f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.83f, 87.51f);
        pathBuilder.lineTo(192.0f, 114.34f);
        pathBuilder.lineTo(141.66f, 64.0f);
        pathBuilder.lineToRelative(26.82f, -26.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineToRelative(44.69f, 44.68f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencilSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
