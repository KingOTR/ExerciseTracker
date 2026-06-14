package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cookie.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {HttpHeaders.COOKIE, "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCookie", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cookie", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CookieKt {
    private static ImageVector _cookie;

    public static final ImageVector getCookie(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(161.66f, 166.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.32f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 161.66f, 166.34f);
        pathBuilder.close();
        pathBuilder.moveTo(86.34f, 158.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.32f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 86.34f, 158.34f);
        pathBuilder.close();
        pathBuilder.moveTo(89.66f, 102.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 11.32f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 89.66f, 102.34f);
        pathBuilder.close();
        pathBuilder.moveTo(126.34f, 118.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.32f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 126.34f, 118.34f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 128.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.92f, 131.84f);
        pathBuilder.arcToRelative(52.08f, 52.08f, 0.0f, false, true, -47.78f, -48.0f);
        pathBuilder.arcToRelative(52.08f, 52.08f, 0.0f, false, true, -48.0f, -47.78f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, false, 95.76f, 95.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cookie = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
