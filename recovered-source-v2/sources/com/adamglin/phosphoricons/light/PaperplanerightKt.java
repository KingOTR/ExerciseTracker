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

/* compiled from: Paperplaneright.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaperPlaneRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPaperPlaneRight", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperPlaneRight", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperplanerightKt {
    private static ImageVector _paperPlaneRight;

    public static final ImageVector getPaperPlaneRight(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _paperPlaneRight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaperPlaneRight", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.88f, 115.69f);
        pathBuilder.lineToRelative(-168.0f, -95.88f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -20.0f, 16.87f);
        pathBuilder.lineTo(73.66f, 128.0f);
        pathBuilder.lineTo(42.81f, 219.33f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 56.0f, 238.0f);
        pathBuilder.arcToRelative(14.15f, 14.15f, 0.0f, false, false, 6.93f, -1.83f);
        pathBuilder.lineTo(230.84f, 140.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -24.41f);
        pathBuilder.close();
        pathBuilder.moveTo(224.93f, 129.69f);
        pathBuilder.lineTo(57.0f, 225.73f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.86f, -2.42f);
        pathBuilder.arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.0f, -0.1f);
        pathBuilder.lineTo(84.3f, 134.0f);
        pathBuilder.lineTo(144.0f, 134.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(84.3f, 122.0f);
        pathBuilder.lineTo(54.17f, 32.8f);
        pathBuilder.arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.0f, -0.1f);
        pathBuilder.arcToRelative(1.87f, 1.87f, 0.0f, false, true, 0.6f, -2.2f);
        pathBuilder.arcTo(1.85f, 1.85f, 0.0f, false, true, 57.0f, 30.25f);
        pathBuilder.lineToRelative(168.0f, 95.89f);
        pathBuilder.arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.0f, 1.74f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 224.93f, 129.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperPlaneRight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
