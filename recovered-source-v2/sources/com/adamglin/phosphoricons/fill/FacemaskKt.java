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

/* compiled from: Facemask.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FaceMask", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFaceMask", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_faceMask", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FacemaskKt {
    private static ImageVector _faceMask;

    public static final ImageVector getFaceMask(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(-0.85f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.68f, -10.0f);
        pathBuilder.lineTo(133.47f, 33.0f);
        pathBuilder.arcToRelative(16.06f, 16.06f, 0.0f, false, false, -10.94f, 0.0f);
        pathBuilder.lineToRelative(-80.0f, 29.09f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -9.68f, 10.0f);
        pathBuilder.lineTo(32.0f, 72.09f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 0.0f, 104.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(5.19f);
        pathBuilder.curveToRelative(7.19f, 15.8f, 21.79f, 29.43f, 43.23f, 40.16f);
        pathBuilder.arcToRelative(191.16f, 191.16f, 0.0f, false, false, 46.15f, 15.71f);
        pathBuilder.arcToRelative(7.93f, 7.93f, 0.0f, false, false, 2.86f, 0.0f);
        pathBuilder.arcToRelative(191.16f, 191.16f, 0.0f, false, false, 46.15f, -15.71f);
        pathBuilder.curveToRelative(21.44f, -10.73f, 36.0f, -24.36f, 43.23f, -40.16f);
        pathBuilder.lineTo(224.0f, 160.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f);
        pathBuilder.lineTo(256.0f, 104.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 224.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 144.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(16.0f, 104.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 88.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(58.74f, 58.74f, 0.0f, false, false, 0.55f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 144.0f);
        pathBuilder.lineTo(88.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 112.0f);
        pathBuilder.lineTo(88.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 128.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(-0.55f);
        pathBuilder.arcToRelative(58.74f, 58.74f, 0.0f, false, false, 0.55f, -8.0f);
        pathBuilder.lineTo(224.0f, 88.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _faceMask = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
