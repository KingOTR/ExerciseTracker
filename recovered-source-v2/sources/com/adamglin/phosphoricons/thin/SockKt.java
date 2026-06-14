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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sock.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sock", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSock", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sock", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SockKt {
    private static ImageVector _sock;

    public static final ImageVector getSock(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(192.0f, 20.0f);
        pathBuilder.lineTo(104.0f, 20.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 32.0f);
        pathBuilder.verticalLineToRelative(78.34f);
        pathBuilder.lineTo(52.08f, 150.26f);
        pathBuilder.arcToRelative(54.91f, 54.91f, 0.0f, false, false, 77.66f, 77.66f);
        pathBuilder.lineToRelative(68.4f, -68.41f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 204.0f, 145.37f);
        pathBuilder.lineTo(204.0f, 32.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.lineTo(196.0f, 52.0f);
        pathBuilder.lineTo(100.0f, 52.0f);
        pathBuilder.lineTo(100.0f, 32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 104.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.08f, 222.26f);
        pathBuilder.arcToRelative(46.91f, 46.91f, 0.0f, true, true, -66.34f, -66.34f);
        pathBuilder.lineToRelative(41.09f, -41.09f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 100.0f, 112.0f);
        pathBuilder.lineTo(100.0f, 60.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.verticalLineToRelative(48.17f);
        pathBuilder.arcTo(52.05f, 52.05f, 0.0f, false, false, 148.0f, 160.0f);
        pathBuilder.arcToRelative(51.44f, 51.44f, 0.0f, false, false, 9.0f, 29.3f);
        pathBuilder.close();
        pathBuilder.moveTo(192.48f, 153.86f);
        pathBuilder.lineTo(162.82f, 183.53f);
        pathBuilder.arcTo(43.5f, 43.5f, 0.0f, false, true, 156.0f, 160.0f);
        pathBuilder.arcToRelative(44.06f, 44.06f, 0.0f, false, true, 40.0f, -43.81f);
        pathBuilder.verticalLineToRelative(29.18f);
        pathBuilder.arcTo(11.92f, 11.92f, 0.0f, false, true, 192.48f, 153.86f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sock = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
