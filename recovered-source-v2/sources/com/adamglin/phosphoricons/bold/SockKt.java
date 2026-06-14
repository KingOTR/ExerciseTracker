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

/* compiled from: Sock.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sock", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSock", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sock", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SockKt {
    private static ImageVector _sock;

    public static final ImageVector getSock(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(192.0f, 12.0f);
        pathBuilder.lineTo(104.0f, 12.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 84.0f, 32.0f);
        pathBuilder.verticalLineToRelative(75.0f);
        pathBuilder.lineTo(46.43f, 144.6f);
        pathBuilder.arcToRelative(62.91f, 62.91f, 0.0f, true, false, 89.0f, 89.0f);
        pathBuilder.lineToRelative(68.4f, -68.4f);
        pathBuilder.arcToRelative(27.81f, 27.81f, 0.0f, false, false, 8.2f, -19.8f);
        pathBuilder.lineTo(212.03f, 32.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 192.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 36.0f);
        pathBuilder.lineTo(188.0f, 52.0f);
        pathBuilder.lineTo(108.0f, 52.0f);
        pathBuilder.lineTo(108.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(118.43f, 216.6f);
        pathBuilder.arcToRelative(38.91f, 38.91f, 0.0f, true, true, -55.0f, -55.0f);
        pathBuilder.lineToRelative(41.09f, -41.08f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 108.0f, 112.0f);
        pathBuilder.lineTo(108.0f, 76.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.verticalLineToRelative(25.21f);
        pathBuilder.arcTo(60.09f, 60.09f, 0.0f, false, false, 140.0f, 160.0f);
        pathBuilder.arcToRelative(59.37f, 59.37f, 0.0f, false, false, 7.0f, 28.07f);
        pathBuilder.close();
        pathBuilder.moveTo(186.83f, 148.2f);
        pathBuilder.lineTo(165.32f, 169.71f);
        pathBuilder.arcTo(36.06f, 36.06f, 0.0f, false, true, 188.0f, 126.06f);
        pathBuilder.verticalLineToRelative(19.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 186.83f, 148.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sock = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
