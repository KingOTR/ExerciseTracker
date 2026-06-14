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

/* compiled from: Dropboxlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropboxLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getDropboxLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropboxLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropboxlogoKt {
    private static ImageVector _dropboxLogo;

    public static final ImageVector getDropboxLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(188.0f, 120.0f);
        pathBuilder.lineTo(128.0f, 80.0f);
        pathBuilder.lineToRelative(55.56f, -37.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.88f, 0.0f);
        pathBuilder.lineTo(238.0f, 73.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 13.32f);
        pathBuilder.close();
        pathBuilder.moveTo(72.44f, 43.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.88f, 0.0f);
        pathBuilder.lineTo(18.0f, 73.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.32f);
        pathBuilder.lineTo(68.0f, 120.0f);
        pathBuilder.lineToRelative(60.0f, -40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(238.0f, 153.34f);
        pathBuilder.lineTo(188.0f, 120.0f);
        pathBuilder.lineToRelative(-60.0f, 40.0f);
        pathBuilder.lineToRelative(55.56f, 37.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.88f, 0.0f);
        pathBuilder.lineTo(238.0f, 166.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 238.0f, 153.34f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 153.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 13.32f);
        pathBuilder.lineTo(63.56f, 197.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.88f, 0.0f);
        pathBuilder.lineTo(128.0f, 160.0f);
        pathBuilder.lineTo(68.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.61f, 206.29f);
        pathBuilder.lineTo(130.24f, 180.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.44f, 0.0f);
        pathBuilder.lineTo(87.41f, 206.29f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.65f);
        pathBuilder.lineTo(123.56f, 237.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.88f, 0.0f);
        pathBuilder.lineToRelative(36.15f, -24.1f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 168.59f, 206.29f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropboxLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
