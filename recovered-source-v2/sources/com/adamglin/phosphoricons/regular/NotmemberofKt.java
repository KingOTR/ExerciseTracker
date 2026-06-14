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

/* compiled from: Notmemberof.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NotMemberOf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getNotMemberOf", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_notMemberOf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotmemberofKt {
    private static ImageVector _notMemberOf;

    public static final ImageVector getNotMemberOf(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _notMemberOf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NotMemberOf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.38f, 34.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.54f);
        pathBuilder.lineTo(197.19f, 40.0f);
        pathBuilder.horizontalLineTo(128.0f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, false, 63.16f, 187.43f);
        pathBuilder.lineTo(42.08f, 210.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, 10.76f);
        pathBuilder.lineTo(75.0f, 198.2f);
        pathBuilder.arcTo(87.5f, 87.5f, 0.0f, false, false, 128.0f, 216.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(128.0f);
        pathBuilder.arcToRelative(71.63f, 71.63f, 0.0f, false, true, -42.18f, -13.7f);
        pathBuilder.lineTo(131.54f, 136.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(146.08f);
        pathBuilder.lineToRelative(67.84f, -74.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 213.38f, 34.08f);
        pathBuilder.close();
        pathBuilder.moveTo(74.0f, 175.53f);
        pathBuilder.arcTo(71.69f, 71.69f, 0.0f, false, true, 56.46f, 136.0f);
        pathBuilder.horizontalLineToRelative(53.46f);
        pathBuilder.close();
        pathBuilder.moveTo(56.46f, 120.0f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 56.0f);
        pathBuilder.horizontalLineToRelative(54.64f);
        pathBuilder.lineToRelative(-58.18f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _notMemberOf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
