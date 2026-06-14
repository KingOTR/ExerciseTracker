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

/* compiled from: Clockuser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ClockUser", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getClockUser", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_clockUser", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClockuserKt {
    private static ImageVector _clockUser;

    public static final ImageVector getClockUser(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(136.0f, 72.0f);
        pathBuilder.verticalLineToRelative(43.05f);
        pathBuilder.lineToRelative(36.42f, -18.21f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.16f, 14.31f);
        pathBuilder.lineToRelative(-48.0f, 24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f);
        pathBuilder.lineTo(120.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 216.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 128.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(231.73f, 221.94f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.46f, 4.11f);
        pathBuilder.curveTo(213.44f, 215.42f, 203.46f, 208.0f, 192.0f, 208.0f);
        pathBuilder.reflectiveCurveToRelative(-21.44f, 7.42f, -24.27f, 18.05f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 232.0f);
        pathBuilder.arcToRelative(8.15f, 8.15f, 0.0f, false, true, -2.06f, -0.27f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.67f, -9.79f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 17.11f, -23.32f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 45.23f, 0.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 231.73f, 221.94f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 176.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _clockUser = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
