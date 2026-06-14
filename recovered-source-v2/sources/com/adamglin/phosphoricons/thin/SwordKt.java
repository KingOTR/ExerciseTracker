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

/* compiled from: Sword.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sword", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSword", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sword", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwordKt {
    private static ImageVector _sword;

    public static final ImageVector getSword(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _sword;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sword", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 36.0f);
        pathBuilder.lineTo(152.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.17f, 1.56f);
        pathBuilder.lineTo(82.05f, 124.38f);
        pathBuilder.lineTo(69.19f, 111.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineTo(39.52f, 124.21f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f);
        pathBuilder.lineTo(62.34f, 164.0f);
        pathBuilder.lineTo(31.52f, 194.83f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f);
        pathBuilder.lineTo(44.2f, 224.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f);
        pathBuilder.lineTo(92.0f, 193.67f);
        pathBuilder.lineToRelative(22.81f, 22.82f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f);
        pathBuilder.lineToRelative(12.69f, -12.7f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f);
        pathBuilder.lineTo(131.62f, 174.0f);
        pathBuilder.lineToRelative(86.82f, -66.79f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 220.0f, 104.0f);
        pathBuilder.lineTo(220.0f, 40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(55.52f, 218.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.lineTo(37.17f, 206.15f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f);
        pathBuilder.lineTo(68.0f, 169.67f);
        pathBuilder.lineTo(86.34f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.83f, 192.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.67f);
        pathBuilder.lineToRelative(-12.7f, 12.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.lineToRelative(-75.3f, -75.3f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f);
        pathBuilder.lineToRelative(12.7f, -12.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 102.0f);
        pathBuilder.lineToRelative(-86.08f, 66.22f);
        pathBuilder.lineTo(109.66f, 152.0f);
        pathBuilder.lineToRelative(53.17f, -53.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f);
        pathBuilder.lineTo(104.0f, 146.34f);
        pathBuilder.lineTo(87.75f, 130.08f);
        pathBuilder.lineTo(154.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(58.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sword = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
