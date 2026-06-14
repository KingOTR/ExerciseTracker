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

/* compiled from: Ghost.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ghost", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGhost", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ghost", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GhostKt {
    private static ImageVector _ghost;

    public static final ImageVector getGhost(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _ghost;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ghost", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(108.0f, 116.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 108.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 120.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.53f, 3.1f);
        pathBuilder.lineToRelative(-26.8f, -21.93f);
        pathBuilder.lineToRelative(-26.8f, 21.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.07f, 0.0f);
        pathBuilder.lineTo(128.0f, 197.17f);
        pathBuilder.lineTo(101.2f, 219.1f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.07f, 0.0f);
        pathBuilder.lineToRelative(-26.8f, -21.93f);
        pathBuilder.lineTo(42.53f, 219.1f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 216.0f);
        pathBuilder.lineTo(36.0f, 120.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 184.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 120.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f);
        pathBuilder.verticalLineToRelative(87.56f);
        pathBuilder.lineTo(66.8f, 188.9f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.07f, 0.0f);
        pathBuilder.lineToRelative(26.8f, 21.93f);
        pathBuilder.lineToRelative(26.8f, -21.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.06f, 0.0f);
        pathBuilder.lineToRelative(26.8f, 21.93f);
        pathBuilder.lineToRelative(26.8f, -21.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.07f, 0.0f);
        pathBuilder.lineTo(212.0f, 207.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ghost = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
