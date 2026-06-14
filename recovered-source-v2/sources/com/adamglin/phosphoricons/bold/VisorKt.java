package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Visor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Visor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getVisor", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_visor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VisorKt {
    private static ImageVector _visor;

    public static final ImageVector getVisor(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _visor;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Visor", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(188.0f, 104.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(80.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(255.91f, 131.63f);
        pathBuilder.arcTo(76.29f, 76.29f, 0.0f, false, true, 182.43f, 204.0f);
        pathBuilder.curveToRelative(-0.56f, 0.0f, -1.13f, 0.0f, -1.69f, 0.0f);
        pathBuilder.curveToRelative(-14.44f, 0.0f, -29.37f, -5.78f, -45.58f, -17.64f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, -14.32f, 0.0f);
        pathBuilder.curveTo(104.0f, 198.68f, 88.56f, 204.44f, 73.57f, 204.0f);
        pathBuilder.arcTo(76.29f, 76.29f, 0.0f, false, true, 0.09f, 131.63f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 76.0f, 52.0f);
        pathBuilder.lineTo(180.0f, 52.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, true, 75.91f, 79.63f);
        pathBuilder.close();
        pathBuilder.moveTo(217.62f, 92.1f);
        pathBuilder.arcTo(51.56f, 51.56f, 0.0f, false, false, 180.0f, 76.0f);
        pathBuilder.lineTo(76.0f, 76.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, -51.94f, 54.51f);
        pathBuilder.arcTo(52.19f, 52.19f, 0.0f, false, false, 74.32f, 180.0f);
        pathBuilder.curveToRelative(9.42f, 0.29f, 20.0f, -4.0f, 32.35f, -13.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 42.66f, 0.0f);
        pathBuilder.curveToRelative(12.36f, 9.0f, 22.91f, 13.29f, 32.35f, 13.0f);
        pathBuilder.arcToRelative(52.19f, 52.19f, 0.0f, false, false, 50.26f, -49.48f);
        pathBuilder.arcTo(51.63f, 51.63f, 0.0f, false, false, 217.62f, 92.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _visor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
