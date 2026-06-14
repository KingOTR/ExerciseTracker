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

/* compiled from: Usercirclegear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCircleGear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getUserCircleGear", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCircleGear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercirclegearKt {
    private static ImageVector _userCircleGear;

    public static final ImageVector getUserCircleGear(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _userCircleGear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserCircleGear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.25f, 63.07f);
        pathBuilder.lineToRelative(-4.66f, -2.69f);
        pathBuilder.arcToRelative(23.6f, 23.6f, 0.0f, false, false, 0.0f, -8.76f);
        pathBuilder.lineToRelative(4.66f, -2.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -13.86f);
        pathBuilder.lineToRelative(-4.67f, 2.7f);
        pathBuilder.arcTo(23.92f, 23.92f, 0.0f, false, false, 208.0f, 33.38f);
        pathBuilder.lineTo(208.0f, 28.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(5.38f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, false, -7.58f, 4.39f);
        pathBuilder.lineToRelative(-4.67f, -2.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 13.86f);
        pathBuilder.lineToRelative(4.66f, 2.69f);
        pathBuilder.arcToRelative(23.6f, 23.6f, 0.0f, false, false, 0.0f, 8.76f);
        pathBuilder.lineToRelative(-4.66f, 2.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 14.93f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.0f, -1.07f);
        pathBuilder.lineToRelative(4.67f, -2.7f);
        pathBuilder.arcTo(23.92f, 23.92f, 0.0f, false, false, 192.0f, 78.62f);
        pathBuilder.lineTo(192.0f, 84.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(208.0f, 78.62f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, false, 7.58f, -4.39f);
        pathBuilder.lineToRelative(4.67f, 2.7f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.0f, 1.07f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -14.93f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 76.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, -44.0f, 44.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 128.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.56f, 110.68f);
        pathBuilder.arcToRelative(103.92f, 103.92f, 0.0f, true, true, -85.24f, -85.24f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.64f, 15.78f);
        pathBuilder.arcTo(88.07f, 88.07f, 0.0f, false, false, 40.0f, 128.0f);
        pathBuilder.arcToRelative(87.62f, 87.62f, 0.0f, false, false, 22.24f, 58.41f);
        pathBuilder.arcTo(79.71f, 79.71f, 0.0f, false, true, 84.0f, 165.1f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.83f, 0.32f);
        pathBuilder.arcToRelative(59.81f, 59.81f, 0.0f, false, false, 78.27f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.84f, -0.32f);
        pathBuilder.arcToRelative(79.86f, 79.86f, 0.0f, false, true, 21.79f, 21.31f);
        pathBuilder.arcTo(87.62f, 87.62f, 0.0f, false, false, 216.0f, 128.0f);
        pathBuilder.arcToRelative(88.85f, 88.85f, 0.0f, false, false, -1.22f, -14.68f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.78f, -2.64f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCircleGear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
