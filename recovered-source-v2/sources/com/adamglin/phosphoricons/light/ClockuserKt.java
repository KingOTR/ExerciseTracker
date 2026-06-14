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

/* compiled from: Clockuser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ClockUser", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getClockUser", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_clockUser", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClockuserKt {
    private static ImageVector _clockUser;

    public static final ImageVector getClockUser(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _clockUser;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ClockUser", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(134.0f, 72.0f);
        pathBuilder.verticalLineToRelative(46.29f);
        pathBuilder.lineToRelative(39.32f, -19.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.36f, 10.74f);
        pathBuilder.lineToRelative(-48.0f, 24.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 122.0f, 128.0f);
        pathBuilder.lineTo(122.0f, 72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 230.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(229.8f, 222.46f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.6f, 3.08f);
        pathBuilder.curveTo(215.14f, 214.0f, 204.37f, 206.0f, 192.0f, 206.0f);
        pathBuilder.reflectiveCurveToRelative(-23.14f, 8.0f, -26.2f, 19.54f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 160.0f, 230.0f);
        pathBuilder.arcToRelative(6.26f, 6.26f, 0.0f, false, true, -1.54f, -0.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.26f, -7.34f);
        pathBuilder.arcTo(38.09f, 38.09f, 0.0f, false, true, 172.72f, 199.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, true, 38.56f, 0.0f);
        pathBuilder.arcTo(38.09f, 38.09f, 0.0f, false, true, 229.8f, 222.46f);
        pathBuilder.close();
        pathBuilder.moveTo(174.0f, 176.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, false, 18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, false, 174.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _clockUser = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
