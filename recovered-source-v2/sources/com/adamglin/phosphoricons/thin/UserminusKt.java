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

/* compiled from: Userminus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserMinus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUserMinus", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userMinus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserminusKt {
    private static ImageVector _userMinus;

    public static final ImageVector getUserMinus(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _userMinus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserMinus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(252.0f, 136.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(200.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(195.06f, 197.43f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.12f, 5.14f);
        pathBuilder.curveTo(168.0f, 177.7f, 139.3f, 164.0f, 108.0f, 164.0f);
        pathBuilder.reflectiveCurveToRelative(-60.0f, 13.7f, -80.94f, 38.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.12f, -5.14f);
        pathBuilder.curveToRelative(16.71f, -19.9f, 38.13f, -33.13f, 61.89f, -38.59f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, true, true, 50.34f, 0.0f);
        pathBuilder.curveTo(156.93f, 164.3f, 178.35f, 177.53f, 195.06f, 197.43f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 156.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, true, false, -56.0f, -56.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, false, 108.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userMinus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
