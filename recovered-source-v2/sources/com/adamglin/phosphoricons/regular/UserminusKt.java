package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Userminus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserMinus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getUserMinus", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userMinus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserminusKt {
    private static ImageVector _userMinus;

    public static final ImageVector getUserMinus(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(256.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(200.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.13f, 194.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.26f, 10.3f);
        pathBuilder.curveTo(165.75f, 181.19f, 138.09f, 168.0f, 108.0f, 168.0f);
        pathBuilder.reflectiveCurveToRelative(-57.75f, 13.19f, -77.87f, 37.15f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.25f, -10.3f);
        pathBuilder.curveToRelative(14.94f, -17.78f, 33.52f, -30.41f, 54.17f, -37.17f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, true, 71.9f, 0.0f);
        pathBuilder.curveTo(164.6f, 164.44f, 183.18f, 177.07f, 198.13f, 194.85f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 152.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, false, -52.0f, -52.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, false, 108.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userMinus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
