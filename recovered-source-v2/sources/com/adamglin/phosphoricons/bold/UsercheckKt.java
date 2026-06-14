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

/* compiled from: Usercheck.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getUserCheck", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCheck", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercheckKt {
    private static ImageVector _userCheck;

    public static final ImageVector getUserCheck(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(152.5f, 156.54f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, true, false, -89.0f, 0.0f);
        pathBuilder.arcToRelative(124.0f, 124.0f, 0.0f, false, false, -48.69f, 35.74f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.38f, 15.44f);
        pathBuilder.curveTo(46.88f, 191.42f, 71.0f, 172.0f, 108.0f, 172.0f);
        pathBuilder.reflectiveCurveToRelative(61.12f, 19.42f, 74.81f, 35.72f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 18.38f, -15.44f);
        pathBuilder.arcTo(123.89f, 123.89f, 0.0f, false, false, 152.5f, 156.54f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 100.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 60.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(252.49f, 136.49f);
        pathBuilder.lineTo(220.49f, 168.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f);
        pathBuilder.lineTo(212.0f, 143.0f);
        pathBuilder.lineToRelative(23.51f, -23.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCheck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
