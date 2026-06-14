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

/* compiled from: Dropslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getDropSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropslashKt {
    private static ImageVector _dropSlash;

    public static final ImageVector getDropSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _dropSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.92f, 210.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f);
        pathBuilder.lineToRelative(-12.9f, -14.19f);
        pathBuilder.arcTo(87.71f, 87.71f, 0.0f, false, true, 128.0f, 232.0f);
        pathBuilder.curveToRelative(-48.0f, 0.0f, -87.49f, -38.93f, -88.0f, -86.88f);
        pathBuilder.curveToRelative(-0.27f, -24.34f, 8.22f, -49.84f, 24.73f, -74.81f);
        pathBuilder.lineTo(42.3f, 45.63f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, true, 0.14f, -11.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.48f, 0.37f);
        pathBuilder.close();
        pathBuilder.moveTo(203.85f, 175.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.7f, -1.27f);
        pathBuilder.arcTo(87.66f, 87.66f, 0.0f, false, false, 216.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -31.4f, -14.51f, -64.68f, -42.0f, -96.25f);
        pathBuilder.arcToRelative(254.19f, 254.19f, 0.0f, false, false, -41.45f, -38.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f);
        pathBuilder.arcTo(251.26f, 251.26f, 0.0f, false, false, 87.17f, 42.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.41f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
