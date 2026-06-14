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

/* compiled from: Appstorelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AppStoreLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAppStoreLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_appStoreLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppstorelogoKt {
    private static ImageVector _appStoreLogo;

    public static final ImageVector getAppStoreLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(244.0f, 160.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.horizontalLineTo(200.67f);
        pathBuilder.lineToRelative(17.66f, 29.89f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -20.66f, 12.21f);
        pathBuilder.lineTo(140.9f, 118.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.66f, -12.2f);
        pathBuilder.lineTo(186.48f, 148.0f);
        pathBuilder.horizontalLineTo(232.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(133.15f, 148.0f);
        pathBuilder.horizontalLineTo(97.39f);
        pathBuilder.lineTo(162.33f, 38.11f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 141.67f, 25.9f);
        pathBuilder.lineTo(128.0f, 49.0f);
        pathBuilder.lineTo(114.33f, 25.9f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 93.67f, 38.11f);
        pathBuilder.lineToRelative(20.39f, 34.51f);
        pathBuilder.lineTo(69.52f, 148.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineTo(133.15f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(58.83f, 189.67f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.43f, 4.22f);
        pathBuilder.lineToRelative(-4.73f, 8.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 58.33f, 214.1f);
        pathBuilder.lineToRelative(4.73f, -8.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 58.83f, 189.67f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _appStoreLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
