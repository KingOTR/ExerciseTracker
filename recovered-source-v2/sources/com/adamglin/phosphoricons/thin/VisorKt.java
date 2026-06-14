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

/* compiled from: Visor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Visor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getVisor", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_visor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VisorKt {
    private static ImageVector _visor;

    public static final ImageVector getVisor(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(183.05f, 60.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 4.07f, 131.21f);
        pathBuilder.curveToRelative(1.6f, 34.66f, 30.0f, 63.08f, 64.65f, 64.71f);
        pathBuilder.curveToRelative(14.77f, 0.72f, 30.0f, -5.64f, 46.63f, -19.38f);
        pathBuilder.arcToRelative(19.9f, 19.9f, 0.0f, false, true, 25.35f, 0.0f);
        pathBuilder.curveTo(150.79f, 184.92f, 166.25f, 196.0f, 184.0f, 196.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, 68.0f, -68.9f);
        pathBuilder.curveTo(251.51f, 90.1f, 220.58f, 60.0f, 183.05f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.7f, 170.15f);
        pathBuilder.arcTo(59.57f, 59.57f, 0.0f, false, true, 184.0f, 188.0f);
        pathBuilder.curveToRelative(-15.17f, 0.0f, -29.07f, -10.0f, -38.2f, -17.58f);
        pathBuilder.arcToRelative(27.88f, 27.88f, 0.0f, false, false, -35.55f, 0.0f);
        pathBuilder.curveToRelative(-15.0f, 12.41f, -28.45f, 18.14f, -41.15f, 17.55f);
        pathBuilder.arcToRelative(60.37f, 60.37f, 0.0f, false, true, -57.0f, -57.09f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, true, 72.0f, 68.0f);
        pathBuilder.horizontalLineTo(183.05f);
        pathBuilder.curveToRelative(33.18f, 0.0f, 60.52f, 26.56f, 60.94f, 59.2f);
        pathBuilder.arcTo(59.59f, 59.59f, 0.0f, false, true, 226.7f, 170.15f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _visor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
