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

/* compiled from: Cloudmoon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudMoon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCloudMoon", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudMoon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudmoonKt {
    private static ImageVector _cloudMoon;

    public static final ImageVector getCloudMoon(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _cloudMoon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CloudMoon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.0f, 68.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.31f, 0.06f, -4.95f, 0.16f);
        pathBuilder.arcToRelative(75.93f, 75.93f, 0.0f, false, false, -58.0f, -62.23f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 94.68f, 20.31f);
        pathBuilder.arcTo(52.05f, 52.05f, 0.0f, false, true, 32.3f, 82.68f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 17.93f, 97.07f);
        pathBuilder.arcToRelative(76.61f, 76.61f, 0.0f, false, false, 27.91f, 43.27f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 92.0f, 228.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(119.89f, 36.0f);
        pathBuilder.arcToRelative(51.64f, 51.64f, 0.0f, false, true, 23.68f, 37.17f);
        pathBuilder.arcToRelative(80.39f, 80.39f, 0.0f, false, false, -45.18f, 43.15f);
        pathBuilder.arcTo(56.5f, 56.5f, 0.0f, false, false, 92.0f, 116.0f);
        pathBuilder.arcToRelative(55.69f, 55.69f, 0.0f, false, false, -28.23f, 7.66f);
        pathBuilder.arcToRelative(52.69f, 52.69f, 0.0f, false, true, -15.63f, -15.77f);
        pathBuilder.arcTo(76.11f, 76.11f, 0.0f, false, false, 119.89f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 204.0f);
        pathBuilder.horizontalLineTo(92.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f);
        pathBuilder.horizontalLineToRelative(0.28f);
        pathBuilder.curveToRelative(-0.11f, 1.1f, -0.2f, 2.2f, -0.26f, 3.3f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 1.4f);
        pathBuilder.arcToRelative(55.78f, 55.78f, 0.0f, false, true, 1.74f, -11.0f);
        pathBuilder.lineToRelative(0.15f, -0.55f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, true, true, 172.0f, 204.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudMoon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
