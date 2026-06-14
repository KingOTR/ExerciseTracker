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
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cookie.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {HttpHeaders.COOKIE, "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCookie", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cookie", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CookieKt {
    private static ImageVector _cookie;

    public static final ImageVector getCookie(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(167.31f, 160.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.62f, 0.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 167.31f, 160.69f);
        pathBuilder.close();
        pathBuilder.moveTo(80.69f, 152.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 22.62f, 0.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 80.69f, 152.69f);
        pathBuilder.close();
        pathBuilder.moveTo(95.31f, 119.31f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, -22.62f, 0.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 95.31f, 119.31f);
        pathBuilder.close();
        pathBuilder.moveTo(143.31f, 112.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 22.62f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 143.31f, 112.69f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 128.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.33f, 138.65f);
        pathBuilder.arcTo(60.17f, 60.17f, 0.0f, false, true, 165.0f, 91.0f);
        pathBuilder.arcToRelative(60.17f, 60.17f, 0.0f, false, true, -47.66f, -46.32f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, false, 94.0f, 94.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cookie = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
