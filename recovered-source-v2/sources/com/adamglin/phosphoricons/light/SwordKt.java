package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sword.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sword", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSword", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sword", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwordKt {
    private static ImageVector _sword;

    public static final ImageVector getSword(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 34.0f);
        pathBuilder.lineTo(152.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.76f, 2.34f);
        pathBuilder.lineToRelative(-65.39f, 85.0f);
        pathBuilder.lineTo(70.6f, 110.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineTo(38.1f, 122.8f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.81f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(59.51f, 164.0f);
        pathBuilder.lineTo(30.1f, 193.42f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f);
        pathBuilder.lineToRelative(12.69f, 12.69f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f);
        pathBuilder.lineTo(92.0f, 196.5f);
        pathBuilder.lineToRelative(21.4f, 21.4f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f);
        pathBuilder.lineToRelative(12.7f, -12.69f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.81f);
        pathBuilder.lineToRelative(-11.25f, -11.25f);
        pathBuilder.lineToRelative(85.0f, -65.39f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 222.0f, 104.0f);
        pathBuilder.lineTo(222.0f, 40.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 34.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.1f, 217.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f);
        pathBuilder.lineTo(38.59f, 204.73f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.82f);
        pathBuilder.lineTo(68.0f, 172.5f);
        pathBuilder.lineTo(83.51f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(137.41f, 196.72f);
        pathBuilder.lineTo(124.72f, 209.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.84f, 0.0f);
        pathBuilder.lineToRelative(-75.29f, -75.3f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f);
        pathBuilder.lineToRelative(12.69f, -12.7f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.84f, 0.0f);
        pathBuilder.lineToRelative(75.29f, 75.3f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 137.41f, 196.72f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 101.05f);
        pathBuilder.lineTo(126.09f, 165.6f);
        pathBuilder.lineTo(112.49f, 152.0f);
        pathBuilder.lineToRelative(51.75f, -51.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f);
        pathBuilder.lineTo(104.0f, 143.51f);
        pathBuilder.lineToRelative(-13.6f, -13.6f);
        pathBuilder.lineTo(155.0f, 46.0f);
        pathBuilder.lineTo(210.0f, 46.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sword = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
