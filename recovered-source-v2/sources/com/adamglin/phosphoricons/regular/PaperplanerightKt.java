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

/* compiled from: Paperplaneright.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaperPlaneRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPaperPlaneRight", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperPlaneRight", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperplanerightKt {
    private static ImageVector _paperPlaneRight;

    public static final ImageVector getPaperPlaneRight(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(231.87f, 114.0f);
        pathBuilder.lineToRelative(-168.0f, -95.89f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.92f, 37.34f);
        pathBuilder.lineTo(71.55f, 128.0f);
        pathBuilder.lineTo(40.92f, 218.67f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 240.0f);
        pathBuilder.arcToRelative(16.15f, 16.15f, 0.0f, false, false, 7.93f, -2.1f);
        pathBuilder.lineToRelative(167.92f, -96.05f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.05f, -27.89f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 224.0f);
        pathBuilder.arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.0f, -0.12f);
        pathBuilder.lineTo(85.74f, 136.0f);
        pathBuilder.horizontalLineTo(144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(85.74f);
        pathBuilder.lineTo(56.06f, 32.16f);
        pathBuilder.arcTo(0.46f, 0.46f, 0.0f, false, false, 56.0f, 32.0f);
        pathBuilder.lineToRelative(168.0f, 95.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperPlaneRight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
