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

/* compiled from: Bookuser.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BookUser", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBookUser", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bookUser", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookuserKt {
    private static ImageVector _bookUser;

    public static final ImageVector getBookUser(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _bookUser;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BookUser", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 80.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 23.94f);
        pathBuilder.arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.12f, 7.55f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 232.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f);
        pathBuilder.verticalLineToRelative(63.73f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, 8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f);
        pathBuilder.verticalLineTo(104.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.81f, 56.0f);
        pathBuilder.horizontalLineTo(89.0f);
        pathBuilder.arcToRelative(47.92f, 47.92f, 0.0f, false, true, 36.0f, 17.4f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.08f, 0.0f);
        pathBuilder.arcTo(47.92f, 47.92f, 0.0f, false, true, 167.0f, 56.0f);
        pathBuilder.horizontalLineToRelative(0.19f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.54f, -5.84f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -85.46f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 88.81f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bookUser = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
