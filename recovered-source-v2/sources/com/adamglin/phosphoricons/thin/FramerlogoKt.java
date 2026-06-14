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

/* compiled from: Framerlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FramerLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFramerLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_framerLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FramerlogoKt {
    private static ImageVector _framerLogo;

    public static final ImageVector getFramerLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _framerLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FramerLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(204.0f, 104.0f);
        pathBuilder.lineTo(204.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(56.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.66f, 7.0f);
        pathBuilder.lineToRelative(64.14f, 57.0f);
        pathBuilder.lineTo(56.0f, 100.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, 2.83f);
        pathBuilder.lineToRelative(72.0f, 72.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 132.0f, 240.0f);
        pathBuilder.lineTo(132.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(68.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.66f, -7.0f);
        pathBuilder.lineToRelative(-64.14f, -57.0f);
        pathBuilder.lineTo(200.0f, 108.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 204.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(189.48f, 164.0f);
        pathBuilder.lineTo(128.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(62.34f);
        pathBuilder.lineToRelative(-64.0f, -64.0f);
        pathBuilder.lineTo(60.0f, 108.0f);
        pathBuilder.horizontalLineToRelative(66.48f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 100.0f);
        pathBuilder.lineTo(129.52f, 100.0f);
        pathBuilder.lineToRelative(-63.0f, -56.0f);
        pathBuilder.lineTo(196.0f, 44.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _framerLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
