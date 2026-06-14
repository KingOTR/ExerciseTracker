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

/* compiled from: Megaphonesimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MegaphoneSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMegaphoneSimple", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_megaphoneSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MegaphonesimpleKt {
    private static ImageVector _megaphoneSimple;

    public static final ImageVector getMegaphoneSimple(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _megaphoneSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MegaphoneSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 88.59f);
        pathBuilder.lineToRelative(-176.08f, -54.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f);
        pathBuilder.lineTo(34.0f, 192.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.arcToRelative(14.59f, 14.59f, 0.0f, false, false, 4.0f, -0.59f);
        pathBuilder.lineTo(138.0f, 179.0f);
        pathBuilder.verticalLineToRelative(13.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(198.0f, 160.62f);
        pathBuilder.lineToRelative(30.0f, -9.19f);
        pathBuilder.arcTo(14.07f, 14.07f, 0.0f, false, false, 238.0f, 138.0f);
        pathBuilder.lineTo(238.0f, 102.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 228.0f, 88.59f);
        pathBuilder.close();
        pathBuilder.moveTo(48.56f, 193.92f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.76f, -0.32f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 192.0f);
        pathBuilder.lineTo(46.0f, 48.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.8f, -1.6f);
        pathBuilder.arcTo(2.05f, 2.05f, 0.0f, false, true, 48.0f, 46.0f);
        pathBuilder.arcToRelative(1.79f, 1.79f, 0.0f, false, true, 0.49f, 0.08f);
        pathBuilder.lineTo(138.0f, 73.53f);
        pathBuilder.verticalLineToRelative(92.95f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 192.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(152.0f, 194.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(150.0f, 175.35f);
        pathBuilder.lineToRelative(36.0f, -11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 138.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.44f, 1.92f);
        pathBuilder.lineToRelative(-0.08f, 0.0f);
        pathBuilder.lineTo(150.0f, 162.8f);
        pathBuilder.lineTo(150.0f, 77.21f);
        pathBuilder.lineToRelative(74.56f, 22.87f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 226.0f, 102.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _megaphoneSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
