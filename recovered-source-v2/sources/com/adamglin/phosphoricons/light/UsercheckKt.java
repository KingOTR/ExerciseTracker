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

/* compiled from: Usercheck.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getUserCheck", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCheck", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercheckKt {
    private static ImageVector _userCheck;

    public static final ImageVector getUserCheck(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _userCheck;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserCheck", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(139.0f, 158.25f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, true, false, -62.0f, 0.0f);
        pathBuilder.curveToRelative(-22.0f, 6.23f, -41.88f, 19.16f, -57.61f, 37.89f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.18f, 7.72f);
        pathBuilder.curveTo(49.11f, 179.44f, 77.31f, 166.0f, 108.0f, 166.0f);
        pathBuilder.reflectiveCurveToRelative(58.9f, 13.44f, 79.41f, 37.86f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.18f, -7.72f);
        pathBuilder.curveTo(180.86f, 177.41f, 161.0f, 164.48f, 139.0f, 158.25f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 100.0f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, true, true, 54.0f, 54.0f);
        pathBuilder.arcTo(54.06f, 54.06f, 0.0f, false, true, 54.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(252.24f, 132.24f);
        pathBuilder.lineTo(220.24f, 164.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineTo(216.0f, 151.51f);
        pathBuilder.lineToRelative(27.76f, -27.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, 8.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCheck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
