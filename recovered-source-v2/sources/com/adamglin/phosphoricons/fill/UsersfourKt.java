package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Usersfour.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UsersFour", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getUsersFour", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_usersFour", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsersfourKt {
    private static ImageVector _usersFour;

    public static final ImageVector getUsersFour(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _usersFour;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UsersFour", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.4f, 219.19f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 232.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.4f, -12.8f);
        pathBuilder.arcTo(67.88f, 67.88f, 0.0f, false, true, 53.0f, 197.51f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 53.93f, 0.0f);
        pathBuilder.arcToRelative(67.42f, 67.42f, 0.0f, false, true, 21.0f, 14.29f);
        pathBuilder.arcToRelative(67.42f, 67.42f, 0.0f, false, true, 21.0f, -14.29f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 53.93f, 0.0f);
        pathBuilder.arcTo(67.85f, 67.85f, 0.0f, false, true, 230.4f, 219.19f);
        pathBuilder.close();
        pathBuilder.moveTo(27.2f, 126.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.2f, -1.6f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 83.2f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, 0.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 83.2f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, -9.61f);
        pathBuilder.arcTo(67.85f, 67.85f, 0.0f, false, false, 203.0f, 93.51f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -53.93f, 0.0f);
        pathBuilder.arcToRelative(67.42f, 67.42f, 0.0f, false, false, -21.0f, 14.29f);
        pathBuilder.arcToRelative(67.42f, 67.42f, 0.0f, false, false, -21.0f, -14.29f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -53.93f, 0.0f);
        pathBuilder.arcTo(67.88f, 67.88f, 0.0f, false, false, 25.6f, 115.2f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 27.2f, 126.4f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _usersFour = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
