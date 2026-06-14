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

/* compiled from: User.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"User", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUser", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_user", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserKt {
    private static ImageVector _user;

    public static final ImageVector getUser(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _user;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("User", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.46f, 214.0f);
        pathBuilder.curveToRelative(-16.52f, -28.56f, -43.0f, -48.06f, -73.68f, -55.09f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, false, -51.56f, 0.0f);
        pathBuilder.curveToRelative(-30.64f, 7.0f, -57.16f, 26.53f, -73.68f, 55.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.92f, 4.0f);
        pathBuilder.curveTo(55.0f, 184.19f, 89.62f, 164.0f, 128.0f, 164.0f);
        pathBuilder.reflectiveCurveToRelative(73.0f, 20.19f, 92.54f, 54.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.46f, 2.0f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, false, 2.0f, -0.54f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 227.46f, 214.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 96.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, 60.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, true, 68.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _user = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
