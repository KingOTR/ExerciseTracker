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
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cookie.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {HttpHeaders.COOKIE, "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCookie", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cookie", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CookieKt {
    private static ImageVector _cookie;

    public static final ImageVector getCookie(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _cookie;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder(HttpHeaders.COOKIE, Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.49f, 163.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 164.49f, 163.51f);
        pathBuilder.close();
        pathBuilder.moveTo(83.49f, 155.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 83.51f, 155.51f);
        pathBuilder.close();
        pathBuilder.moveTo(92.49f, 116.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 92.49f, 116.49f);
        pathBuilder.close();
        pathBuilder.moveTo(140.49f, 115.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 17.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 140.49f, 115.51f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 128.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.69f, 135.39f);
        pathBuilder.arcTo(56.13f, 56.13f, 0.0f, false, true, 168.5f, 87.5f);
        pathBuilder.arcToRelative(56.13f, 56.13f, 0.0f, false, true, -47.89f, -47.19f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, true, false, 95.08f, 95.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cookie = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
