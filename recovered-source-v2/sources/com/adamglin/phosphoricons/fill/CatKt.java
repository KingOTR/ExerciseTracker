package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCat", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatKt {
    private static ImageVector _cat;

    public static final ImageVector getCat(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _cat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.83f, 33.54f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -18.14f, 3.15f);
        pathBuilder.curveToRelative(-0.14f, 0.14f, -0.26f, 0.27f, -0.38f, 0.41f);
        pathBuilder.lineTo(187.05f, 57.0f);
        pathBuilder.arcTo(111.28f, 111.28f, 0.0f, false, false, 69.0f, 57.0f);
        pathBuilder.lineTo(51.69f, 37.1f);
        pathBuilder.curveToRelative(-0.12f, -0.14f, -0.24f, -0.27f, -0.38f, -0.41f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -18.14f, -3.15f);
        pathBuilder.arcTo(16.4f, 16.4f, 0.0f, false, false, 24.0f, 48.46f);
        pathBuilder.lineTo(24.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 49.0f, 40.06f, 89.63f, 91.56f, 95.32f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.44f, -4.0f);
        pathBuilder.verticalLineToRelative(-32.0f);
        pathBuilder.lineToRelative(-13.42f, -13.43f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, true, -0.41f, -11.37f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.49f, -0.18f);
        pathBuilder.lineTo(128.0f, 180.68f);
        pathBuilder.lineToRelative(10.34f, -10.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.49f, 0.18f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, true, -0.41f, 11.37f);
        pathBuilder.lineTo(136.0f, 195.31f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.44f, 4.0f);
        pathBuilder.curveTo(191.94f, 225.62f, 232.0f, 185.0f, 232.0f, 136.0f);
        pathBuilder.lineTo(232.0f, 48.46f);
        pathBuilder.arcTo(16.4f, 16.4f, 0.0f, false, false, 222.83f, 33.54f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder.lineTo(88.0f, 69.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 88.0f);
        pathBuilder.lineTo(152.0f, 69.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.lineTo(168.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
