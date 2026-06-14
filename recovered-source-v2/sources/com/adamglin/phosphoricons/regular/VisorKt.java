package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Visor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Visor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getVisor", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_visor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VisorKt {
    private static ImageVector _visor;

    public static final ImageVector getVisor(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(183.05f, 56.0f);
        pathBuilder.lineTo(72.0f, 56.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 0.08f, 131.4f);
        pathBuilder.curveToRelative(1.69f, 36.69f, 31.76f, 66.79f, 68.45f, 68.52f);
        pathBuilder.curveToRelative(15.85f, 0.74f, 32.0f, -5.9f, 49.38f, -20.3f);
        pathBuilder.arcToRelative(15.88f, 15.88f, 0.0f, false, true, 20.24f, 0.0f);
        pathBuilder.curveTo(148.72f, 188.39f, 165.0f, 200.0f, 184.0f, 200.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, false, 72.0f, -72.95f);
        pathBuilder.curveTo(255.49f, 87.87f, 222.76f, 56.0f, 183.05f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(223.86f, 167.34f);
        pathBuilder.arcTo(55.63f, 55.63f, 0.0f, false, true, 184.0f, 184.0f);
        pathBuilder.curveToRelative(-13.88f, 0.0f, -27.0f, -9.51f, -35.65f, -16.67f);
        pathBuilder.arcToRelative(31.91f, 31.91f, 0.0f, false, false, -40.65f, 0.0f);
        pathBuilder.curveTo(93.52f, 179.0f, 80.94f, 184.49f, 69.28f, 183.94f);
        pathBuilder.arcToRelative(56.36f, 56.36f, 0.0f, false, true, -53.22f, -53.28f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, true, 72.0f, 72.0f);
        pathBuilder.lineTo(183.05f, 72.0f);
        pathBuilder.curveToRelative(31.0f, 0.0f, 56.55f, 24.79f, 56.95f, 55.25f);
        pathBuilder.arcTo(55.66f, 55.66f, 0.0f, false, true, 223.86f, 167.34f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(80.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _visor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
