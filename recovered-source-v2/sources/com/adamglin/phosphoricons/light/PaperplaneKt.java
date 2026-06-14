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

/* compiled from: Paperplane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaperPlane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPaperPlane", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperPlane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperplaneKt {
    private static ImageVector _paperPlane;

    public static final ImageVector getPaperPlane(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _paperPlane;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaperPlane", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.17f, 201.09f);
        pathBuilder.lineTo(140.1f, 33.16f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.41f, 0.0f);
        pathBuilder.lineToRelative(-95.88f, 168.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 16.87f, 20.05f);
        pathBuilder.lineTo(128.0f, 190.34f);
        pathBuilder.lineToRelative(91.33f, 30.85f);
        pathBuilder.arcTo(14.31f, 14.31f, 0.0f, false, false, 224.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.13f, -20.91f);
        pathBuilder.close();
        pathBuilder.moveTo(225.51f, 209.27f);
        pathBuilder.arcToRelative(1.87f, 1.87f, 0.0f, false, true, -2.2f, 0.6f);
        pathBuilder.lineToRelative(-0.1f, 0.0f);
        pathBuilder.lineTo(134.0f, 179.7f);
        pathBuilder.lineTo(134.0f, 120.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(59.7f);
        pathBuilder.lineTo(32.8f, 209.83f);
        pathBuilder.lineToRelative(-0.1f, 0.0f);
        pathBuilder.arcToRelative(1.87f, 1.87f, 0.0f, false, true, -2.2f, -0.6f);
        pathBuilder.arcToRelative(1.84f, 1.84f, 0.0f, false, true, -0.24f, -2.22f);
        pathBuilder.lineTo(126.14f, 39.0f);
        pathBuilder.arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.74f, -1.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.78f, 1.07f);
        pathBuilder.lineTo(225.73f, 207.0f);
        pathBuilder.arcTo(1.86f, 1.86f, 0.0f, false, true, 225.51f, 209.27f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperPlane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
