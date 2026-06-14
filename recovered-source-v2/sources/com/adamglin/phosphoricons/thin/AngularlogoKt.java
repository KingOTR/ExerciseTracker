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

/* compiled from: Angularlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AngularLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getAngularLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_angularLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AngularlogoKt {
    private static ImageVector _angularLogo;

    public static final ImageVector getAngularLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _angularLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AngularLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.54f, 68.31f);
        pathBuilder.lineToRelative(-96.0f, -40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.08f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, 40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 72.53f);
        pathBuilder.lineToRelative(16.0f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.17f, 3.05f);
        pathBuilder.lineToRelative(80.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f);
        pathBuilder.lineToRelative(80.0f, -40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.17f, -3.05f);
        pathBuilder.lineToRelative(16.0f, -120.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 225.54f, 68.31f);
        pathBuilder.close();
        pathBuilder.moveTo(204.32f, 189.37f);
        pathBuilder.lineTo(128.0f, 227.53f);
        pathBuilder.lineTo(51.68f, 189.37f);
        pathBuilder.lineTo(36.37f, 74.51f);
        pathBuilder.lineTo(128.0f, 36.33f);
        pathBuilder.lineToRelative(91.63f, 38.18f);
        pathBuilder.close();
        pathBuilder.moveTo(124.5f, 86.06f);
        pathBuilder.lineToRelative(-40.0f, 72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.0f, 3.88f);
        pathBuilder.lineTo(103.69f, 140.0f);
        pathBuilder.horizontalLineToRelative(48.62f);
        pathBuilder.lineToRelative(12.19f, 21.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.0f, -3.88f);
        pathBuilder.lineToRelative(-40.0f, -72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(147.87f, 132.0f);
        pathBuilder.horizontalLineTo(108.13f);
        pathBuilder.lineTo(128.0f, 96.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _angularLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
