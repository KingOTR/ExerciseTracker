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

/* compiled from: Facemask.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FaceMask", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFaceMask", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_faceMask", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FacemaskKt {
    private static ImageVector _faceMask;

    public static final ImageVector getFaceMask(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _faceMask;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FaceMask", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(174.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(88.0f, 110.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 130.0f);
        pathBuilder.lineTo(88.0f, 130.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(254.0f, 104.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f);
        pathBuilder.horizontalLineToRelative(-6.5f);
        pathBuilder.curveToRelative(-6.81f, 15.88f, -21.28f, 29.6f, -42.82f, 40.37f);
        pathBuilder.arcToRelative(189.0f, 189.0f, 0.0f, false, true, -45.61f, 15.53f);
        pathBuilder.arcToRelative(5.77f, 5.77f, 0.0f, false, true, -2.14f, 0.0f);
        pathBuilder.arcToRelative(189.0f, 189.0f, 0.0f, false, true, -45.61f, -15.53f);
        pathBuilder.curveTo(59.78f, 187.6f, 45.31f, 173.88f, 38.5f, 158.0f);
        pathBuilder.lineTo(32.0f, 158.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 2.0f, 128.0f);
        pathBuilder.lineTo(2.0f, 104.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 32.0f, 74.0f);
        pathBuilder.horizontalLineToRelative(2.35f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 8.87f, -10.07f);
        pathBuilder.lineToRelative(80.0f, -29.09f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 9.56f, 0.0f);
        pathBuilder.lineToRelative(80.0f, 29.09f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 221.65f, 74.0f);
        pathBuilder.lineTo(224.0f, 74.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 254.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(34.89f, 146.0f);
        pathBuilder.arcTo(57.0f, 57.0f, 0.0f, false, true, 34.0f, 136.0f);
        pathBuilder.lineTo(34.0f, 86.0f);
        pathBuilder.lineTo(32.0f, 86.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, 18.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 136.0f);
        pathBuilder.lineTo(210.0f, 77.09f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.32f, -1.88f);
        pathBuilder.lineToRelative(-80.0f, -29.09f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.36f, 0.0f);
        pathBuilder.lineToRelative(-80.0f, 29.09f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 46.0f, 77.09f);
        pathBuilder.lineTo(46.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 20.7f, 13.61f, 38.0f, 40.46f, 51.52f);
        pathBuilder.arcTo(180.79f, 180.79f, 0.0f, false, false, 128.0f, 201.88f);
        pathBuilder.arcToRelative(181.0f, 181.0f, 0.0f, false, false, 41.54f, -14.36f);
        pathBuilder.curveTo(196.39f, 174.0f, 210.0f, 156.7f, 210.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(242.0f, 104.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, -18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(50.0f);
        pathBuilder.arcToRelative(57.0f, 57.0f, 0.0f, false, true, -0.89f, 10.0f);
        pathBuilder.lineTo(224.0f, 146.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, -18.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _faceMask = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
