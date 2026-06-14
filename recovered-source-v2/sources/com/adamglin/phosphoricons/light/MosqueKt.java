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

/* compiled from: Mosque.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Mosque", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMosque", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mosque", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MosqueKt {
    private static ImageVector _mosque;

    public static final ImageVector getMosque(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _mosque;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Mosque", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 130.0f);
        pathBuilder.arcToRelative(21.84f, 21.84f, 0.0f, false, false, -10.0f, 2.41f);
        pathBuilder.lineTo(214.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -40.71f, -29.31f, -60.22f, -52.87f, -75.9f);
        pathBuilder.curveTo(146.57f, 42.41f, 134.0f, 34.0f, 134.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 10.0f, -12.57f, 18.41f, -27.13f, 28.1f);
        pathBuilder.curveTo(71.31f, 67.78f, 42.0f, 87.29f, 42.0f, 128.0f);
        pathBuilder.verticalLineToRelative(4.41f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 10.0f, 152.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.lineTo(80.0f, 214.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(86.0f, 176.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(150.0f, 176.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(246.0f, 152.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 224.0f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(101.52f, 62.09f);
        pathBuilder.curveToRelative(10.37f, -6.9f, 20.38f, -13.56f, 26.48f, -21.57f);
        pathBuilder.curveToRelative(6.1f, 8.0f, 16.11f, 14.67f, 26.48f, 21.57f);
        pathBuilder.curveTo(175.41f, 76.0f, 199.0f, 91.71f, 201.73f, 122.0f);
        pathBuilder.lineTo(54.27f, 122.0f);
        pathBuilder.curveTo(57.0f, 91.71f, 80.59f, 76.0f, 101.52f, 62.09f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 152.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f);
        pathBuilder.verticalLineToRelative(50.0f);
        pathBuilder.lineTo(22.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 154.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.lineTo(118.0f, 202.0f);
        pathBuilder.lineTo(118.0f, 176.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, -44.0f, 0.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.lineTo(54.0f, 202.0f);
        pathBuilder.lineTo(54.0f, 134.0f);
        pathBuilder.lineTo(202.0f, 134.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.lineTo(182.0f, 202.0f);
        pathBuilder.lineTo(182.0f, 176.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 160.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 202.0f);
        pathBuilder.lineTo(214.0f, 202.0f);
        pathBuilder.lineTo(214.0f, 152.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mosque = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
