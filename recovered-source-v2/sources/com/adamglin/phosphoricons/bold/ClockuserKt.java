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

/* compiled from: Clockuser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ClockUser", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getClockUser", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_clockUser", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClockuserKt {
    private static ImageVector _clockUser;

    public static final ImageVector getClockUser(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(181.36f, 114.73f);
        pathBuilder.lineToRelative(-48.0f, 24.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f);
        pathBuilder.lineTo(116.0f, 72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(36.58f);
        pathBuilder.lineToRelative(30.63f, -15.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 10.73f, 21.46f);
        pathBuilder.close();
        pathBuilder.moveTo(227.08f, 235.59f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.68f, -8.51f);
        pathBuilder.curveTo(210.0f, 218.2f, 201.65f, 212.0f, 192.0f, 212.0f);
        pathBuilder.reflectiveCurveToRelative(-18.0f, 6.2f, -20.4f, 15.08f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 236.0f);
        pathBuilder.arcToRelative(11.77f, 11.77f, 0.0f, false, true, -3.09f, -0.41f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.52f, -14.68f);
        pathBuilder.arcToRelative(43.76f, 43.76f, 0.0f, false, true, 15.08f, -23.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 57.0f, 0.0f);
        pathBuilder.arcToRelative(43.7f, 43.7f, 0.0f, false, true, 15.08f, 23.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 227.08f, 235.59f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 176.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 180.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(117.48f, 211.35f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, true, 93.87f, -93.87f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.81f, -3.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 114.51f, 235.16f);
        pathBuilder.arcToRelative(11.0f, 11.0f, 0.0f, false, false, 1.5f, 0.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.47f, -23.91f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _clockUser = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
