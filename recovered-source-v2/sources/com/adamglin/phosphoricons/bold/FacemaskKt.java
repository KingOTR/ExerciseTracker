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

/* compiled from: Facemask.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FaceMask", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFaceMask", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_faceMask", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FacemaskKt {
    private static ImageVector _faceMask;

    public static final ImageVector getFaceMask(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(92.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.lineTo(92.0f, 112.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 128.0f);
        pathBuilder.lineTo(92.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(256.0f, 104.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(-6.15f);
        pathBuilder.curveToRelative(-7.22f, 15.48f, -20.72f, 28.87f, -40.07f, 39.52f);
        pathBuilder.arcToRelative(169.11f, 169.11f, 0.0f, false, true, -43.43f, 16.25f);
        pathBuilder.arcToRelative(12.12f, 12.12f, 0.0f, false, true, -4.7f, 0.0f);
        pathBuilder.arcToRelative(169.11f, 169.11f, 0.0f, false, true, -43.43f, -16.25f);
        pathBuilder.curveToRelative(-19.35f, -10.65f, -32.85f, -24.0f, -40.07f, -39.52f);
        pathBuilder.lineTo(36.0f, 164.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 0.0f, 128.0f);
        pathBuilder.lineTo(0.0f, 104.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 36.0f, 68.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.arcToRelative(19.93f, 19.93f, 0.0f, false, true, 10.55f, -9.77f);
        pathBuilder.lineToRelative(72.0f, -28.8f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, true, 14.86f, 0.0f);
        pathBuilder.lineToRelative(72.0f, 28.8f);
        pathBuilder.arcTo(19.93f, 19.93f, 0.0f, false, true, 218.0f, 68.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 256.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.13f, 140.0f);
        pathBuilder.curveToRelative(-0.08f, -1.32f, -0.13f, -2.65f, -0.13f, -4.0f);
        pathBuilder.lineTo(36.0f, 92.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 79.51f);
        pathBuilder.lineToRelative(-68.0f, -27.2f);
        pathBuilder.lineTo(60.0f, 79.51f);
        pathBuilder.lineTo(60.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 40.63f, 55.72f, 56.65f, 68.0f, 59.69f);
        pathBuilder.curveToRelative(12.25f, -3.0f, 68.0f, -19.05f, 68.0f, -59.69f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 104.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.curveToRelative(0.0f, 1.35f, -0.05f, 2.68f, -0.13f, 4.0f);
        pathBuilder.lineTo(220.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _faceMask = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
