package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Recycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Recycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getRecycle", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_recycle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecycleKt {
    private static ImageVector _recycle;

    public static final ImageVector getRecycle(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _recycle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Recycle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(94.0f, 208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(40.0f, 214.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -19.0f, -33.0f);
        pathBuilder.lineToRelative(36.71f, -63.44f);
        pathBuilder.lineToRelative(-18.76f, 5.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.1f, -11.6f);
        pathBuilder.lineToRelative(32.77f, -8.77f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 76.0f, 106.45f);
        pathBuilder.lineToRelative(8.8f, 32.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, 7.35f);
        pathBuilder.arcToRelative(6.09f, 6.09f, 0.0f, false, true, -1.56f, 0.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.79f, -4.45f);
        pathBuilder.lineToRelative(-5.0f, -18.8f);
        pathBuilder.lineTo(31.38f, 187.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 40.0f, 202.0f);
        pathBuilder.lineTo(88.0f, 202.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 94.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(235.0f, 181.0f);
        pathBuilder.lineTo(211.86f, 141.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.38f, 6.0f);
        pathBuilder.lineToRelative(23.14f, 40.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 216.0f, 202.0f);
        pathBuilder.lineTo(142.48f, 202.0f);
        pathBuilder.lineToRelative(13.76f, -13.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.lineTo(142.48f, 214.0f);
        pathBuilder.lineTo(216.0f, 214.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 19.0f, -33.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.65f, 35.0f);
        pathBuilder.lineToRelative(36.72f, 63.44f);
        pathBuilder.lineToRelative(-18.76f, -5.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 151.5f, 105.0f);
        pathBuilder.lineToRelative(32.78f, 8.79f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.34f, -4.25f);
        pathBuilder.lineToRelative(8.79f, -32.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.58f, -3.11f);
        pathBuilder.lineToRelative(-5.05f, 18.82f);
        pathBuilder.lineTo(147.0f, 29.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 109.0f, 29.0f);
        pathBuilder.lineTo(85.8f, 69.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.39f, 6.0f);
        pathBuilder.lineToRelative(23.16f, -40.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 17.3f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _recycle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
