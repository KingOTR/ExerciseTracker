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

/* compiled from: Filec.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileC", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFileC", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileC", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilecKt {
    private static ImageVector _fileC;

    public static final ImageVector getFileC(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _fileC;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileC", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(48.0f, 180.0f);
        pathBuilder.curveToRelative(0.0f, 11.0f, 7.18f, 20.0f, 16.0f, 20.0f);
        pathBuilder.arcToRelative(14.07f, 14.07f, 0.0f, false, false, 10.07f, -4.51f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, 10.88f, -0.9f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.83f, 11.81f);
        pathBuilder.arcTo(30.06f, 30.06f, 0.0f, false, true, 64.0f, 216.0f);
        pathBuilder.curveToRelative(-17.65f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f);
        pathBuilder.reflectiveCurveToRelative(14.35f, -36.0f, 32.0f, -36.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 21.39f, 9.19f);
        pathBuilder.arcToRelative(8.26f, 8.26f, 0.0f, false, true, 0.73f, 11.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.9f, 0.38f);
        pathBuilder.arcTo(14.24f, 14.24f, 0.0f, false, false, 64.0f, 160.0f);
        pathBuilder.curveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 88.0f);
        pathBuilder.lineTo(216.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(116.0f, 232.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(112.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(44.0f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(40.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f);
        pathBuilder.lineToRelative(56.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 88.0f);
        pathBuilder.lineTo(152.0f, 44.0f);
        pathBuilder.lineTo(152.0f, 88.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileC = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
