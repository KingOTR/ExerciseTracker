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

/* compiled from: Sock.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sock", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSock", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sock", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SockKt {
    private static ImageVector _sock;

    public static final ImageVector getSock(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _sock;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sock", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(192.0f, 16.0f);
        pathBuilder.lineTo(104.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 88.0f, 32.0f);
        pathBuilder.verticalLineToRelative(76.69f);
        pathBuilder.lineTo(49.25f, 147.43f);
        pathBuilder.arcToRelative(58.92f, 58.92f, 0.0f, false, false, 83.32f, 83.32f);
        pathBuilder.lineTo(201.0f, 162.34f);
        pathBuilder.arcToRelative(23.85f, 23.85f, 0.0f, false, false, 7.0f, -17.0f);
        pathBuilder.lineTo(208.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(192.0f, 48.0f);
        pathBuilder.lineTo(104.0f, 48.0f);
        pathBuilder.lineTo(104.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(121.25f, 219.43f);
        pathBuilder.arcToRelative(42.91f, 42.91f, 0.0f, true, true, -60.68f, -60.68f);
        pathBuilder.lineToRelative(41.09f, -41.09f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 112.0f);
        pathBuilder.lineTo(104.0f, 64.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.verticalLineToRelative(40.58f);
        pathBuilder.arcTo(56.09f, 56.09f, 0.0f, false, false, 144.0f, 160.0f);
        pathBuilder.arcToRelative(55.4f, 55.4f, 0.0f, false, false, 7.93f, 28.76f);
        pathBuilder.close();
        pathBuilder.moveTo(189.66f, 151.0f);
        pathBuilder.lineToRelative(-25.91f, 25.91f);
        pathBuilder.arcTo(39.6f, 39.6f, 0.0f, false, true, 160.0f, 160.0f);
        pathBuilder.arcToRelative(40.05f, 40.05f, 0.0f, false, true, 32.0f, -39.19f);
        pathBuilder.verticalLineToRelative(24.56f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 189.66f, 151.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sock = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
