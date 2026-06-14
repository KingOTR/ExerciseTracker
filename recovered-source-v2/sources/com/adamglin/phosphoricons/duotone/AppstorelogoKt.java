package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Appstorelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AppStoreLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getAppStoreLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_appStoreLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppstorelogoKt {
    private static ImageVector _appStoreLogo;

    public static final ImageVector getAppStoreLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _appStoreLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AppStoreLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(179.64f, 160.0f);
        pathBuilder.horizontalLineTo(76.36f);
        pathBuilder.lineTo(128.0f, 72.62f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(64.34f, 196.07f);
        pathBuilder2.lineToRelative(-9.45f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.78f, -8.14f);
        pathBuilder2.lineToRelative(9.46f, -16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.77f, 8.14f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 152.0f);
        pathBuilder2.lineTo(184.2f, 152.0f);
        pathBuilder2.lineToRelative(-30.73f, -52.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.77f, 8.14f);
        pathBuilder2.lineToRelative(61.41f, 103.93f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.78f, -8.14f);
        pathBuilder2.lineTo(193.66f, 168.0f);
        pathBuilder2.lineTo(232.0f, 168.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(142.47f, 152.0f);
        pathBuilder2.lineTo(90.38f, 152.0f);
        pathBuilder2.lineTo(158.89f, 36.07f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.78f, -8.14f);
        pathBuilder2.lineTo(128.0f, 56.89f);
        pathBuilder2.lineToRelative(-17.11f, -29.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.78f, 8.14f);
        pathBuilder2.lineToRelative(21.6f, 36.55f);
        pathBuilder2.lineTo(71.8f, 152.0f);
        pathBuilder2.lineTo(24.0f, 152.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(142.47f, 168.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _appStoreLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
