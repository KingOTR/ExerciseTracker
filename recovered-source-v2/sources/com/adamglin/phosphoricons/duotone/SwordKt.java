package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sword.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sword", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSword", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sword", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwordKt {
    private static ImageVector _sword;

    public static final ImageVector getSword(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(141.66f, 201.0f);
        pathBuilder.lineTo(129.0f, 213.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.lineTo(92.0f, 188.0f);
        pathBuilder.lineTo(58.35f, 221.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.lineTo(34.34f, 209.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f);
        pathBuilder.lineTo(68.0f, 164.0f);
        pathBuilder.lineTo(42.34f, 138.36f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f);
        pathBuilder.lineTo(55.0f, 114.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.lineToRelative(75.3f, 75.3f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 141.66f, 201.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(216.0f, 32.0f);
        pathBuilder2.lineTo(152.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.34f, 3.12f);
        pathBuilder2.lineToRelative(-64.0f, 83.21f);
        pathBuilder2.lineTo(72.0f, 108.69f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.64f, 0.0f);
        pathBuilder2.lineToRelative(-12.69f, 12.7f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f);
        pathBuilder2.lineToRelative(20.0f, 20.0f);
        pathBuilder2.lineToRelative(-28.0f, 28.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f);
        pathBuilder2.lineToRelative(12.69f, 12.68f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f);
        pathBuilder2.lineToRelative(28.0f, -28.0f);
        pathBuilder2.lineToRelative(20.0f, 20.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.64f, 0.0f);
        pathBuilder2.lineToRelative(12.69f, -12.7f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f);
        pathBuilder2.lineToRelative(-9.64f, -9.64f);
        pathBuilder2.lineToRelative(83.21f, -64.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 104.0f);
        pathBuilder2.lineTo(224.0f, 40.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 32.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(52.69f, 216.0f);
        pathBuilder2.lineTo(40.0f, 203.32f);
        pathBuilder2.lineToRelative(28.0f, -28.0f);
        pathBuilder2.lineTo(80.68f, 188.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(123.3f, 208.0f);
        pathBuilder2.lineTo(48.0f, 132.71f);
        pathBuilder2.lineTo(60.7f, 120.0f);
        pathBuilder2.lineTo(136.0f, 195.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 100.06f);
        pathBuilder2.lineToRelative(-81.74f, 62.88f);
        pathBuilder2.lineTo(115.32f, 152.0f);
        pathBuilder2.lineToRelative(50.34f, -50.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.31f);
        pathBuilder2.lineTo(104.0f, 140.68f);
        pathBuilder2.lineTo(93.07f, 129.74f);
        pathBuilder2.lineTo(155.94f, 48.0f);
        pathBuilder2.lineTo(208.0f, 48.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sword = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
