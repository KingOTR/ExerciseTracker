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

/* compiled from: Pencilslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PencilSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPencilSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencilSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilslashKt {
    private static ImageVector _pencilSlash;

    public static final ImageVector getPencilSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pencilSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PencilSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f);
        pathBuilder.lineTo(95.81f, 98.54f);
        pathBuilder.lineToRelative(-56.3f, 56.29f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 163.31f);
        pathBuilder.lineTo(36.0f, 208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(92.69f, 220.0f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, 8.48f, -3.51f);
        pathBuilder.lineToRelative(53.36f, -53.36f);
        pathBuilder.lineTo(205.0f, 218.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(122.52f, 127.87f);
        pathBuilder.lineTo(68.0f, 182.34f);
        pathBuilder.lineTo(45.66f, 160.0f);
        pathBuilder.lineToRelative(55.54f, -55.54f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 208.0f);
        pathBuilder.lineTo(44.0f, 169.66f);
        pathBuilder.lineTo(86.34f, 212.0f);
        pathBuilder.lineTo(48.0f, 212.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 210.34f);
        pathBuilder.lineTo(73.66f, 188.0f);
        pathBuilder.lineToRelative(54.2f, -54.21f);
        pathBuilder.lineToRelative(21.28f, 23.41f);
        pathBuilder.close();
        pathBuilder.moveTo(224.49f, 76.2f);
        pathBuilder.lineTo(179.8f, 31.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineTo(121.16f, 73.19f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.65f);
        pathBuilder.lineTo(136.0f, 69.66f);
        pathBuilder.lineTo(158.35f, 92.0f);
        pathBuilder.lineToRelative(-10.52f, 10.52f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.65f, 5.66f);
        pathBuilder.lineTo(164.0f, 97.66f);
        pathBuilder.lineTo(186.35f, 120.0f);
        pathBuilder.lineTo(174.5f, 131.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.65f, 5.66f);
        pathBuilder.lineToRelative(44.34f, -44.34f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 224.49f, 76.2f);
        pathBuilder.close();
        pathBuilder.moveTo(218.83f, 87.51f);
        pathBuilder.lineTo(192.0f, 114.34f);
        pathBuilder.lineTo(141.66f, 64.0f);
        pathBuilder.lineToRelative(26.83f, -26.83f);
        pathBuilder.arcToRelative(4.1f, 4.1f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineToRelative(44.68f, 44.69f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 218.83f, 87.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencilSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
