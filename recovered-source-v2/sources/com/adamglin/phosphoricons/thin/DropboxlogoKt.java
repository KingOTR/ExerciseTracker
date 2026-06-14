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

/* compiled from: Dropboxlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropboxLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getDropboxLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropboxLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropboxlogoKt {
    private static ImageVector _dropboxLogo;

    public static final ImageVector getDropboxLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _dropboxLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropboxLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(234.28f, 152.71f);
        pathBuilder.lineTo(187.0f, 120.0f);
        pathBuilder.lineToRelative(47.25f, -32.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.58f);
        pathBuilder.lineToRelative(-52.0f, -36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.56f, 0.0f);
        pathBuilder.lineTo(128.0f, 79.14f);
        pathBuilder.lineTo(78.28f, 44.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.56f, 0.0f);
        pathBuilder.lineToRelative(-52.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.58f);
        pathBuilder.lineTo(69.0f, 120.0f);
        pathBuilder.lineTo(21.72f, 152.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.58f);
        pathBuilder.lineToRelative(52.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.56f, 0.0f);
        pathBuilder.lineTo(128.0f, 160.86f);
        pathBuilder.lineToRelative(49.72f, 34.43f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.56f, 0.0f);
        pathBuilder.lineToRelative(52.0f, -36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.58f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 151.14f);
        pathBuilder.lineTo(83.0f, 120.0f);
        pathBuilder.lineToRelative(45.0f, -31.14f);
        pathBuilder.lineTo(173.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 52.87f);
        pathBuilder.lineTo(225.0f, 84.0f);
        pathBuilder.lineToRelative(-45.0f, 31.13f);
        pathBuilder.lineTo(135.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 52.87f);
        pathBuilder.lineTo(121.0f, 84.0f);
        pathBuilder.lineTo(76.0f, 115.13f);
        pathBuilder.lineTo(31.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 187.13f);
        pathBuilder.lineTo(31.0f, 156.0f);
        pathBuilder.lineToRelative(45.0f, -31.13f);
        pathBuilder.lineTo(121.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 187.13f);
        pathBuilder.lineTo(135.0f, 156.0f);
        pathBuilder.lineToRelative(45.0f, -31.13f);
        pathBuilder.lineTo(225.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(155.18f, 209.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 5.57f);
        pathBuilder.lineToRelative(-23.89f, 16.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.56f, 0.0f);
        pathBuilder.lineToRelative(-23.89f, -16.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.56f, -6.58f);
        pathBuilder.lineToRelative(21.61f, 15.0f);
        pathBuilder.lineToRelative(21.61f, -15.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 155.18f, 209.18f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropboxLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
