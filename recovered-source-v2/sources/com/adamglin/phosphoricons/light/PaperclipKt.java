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

/* compiled from: Paperclip.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Paperclip", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPaperclip", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperclip", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperclipKt {
    private static ImageVector _paperclip;

    public static final ImageVector getPaperclip(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _paperclip;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Paperclip", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.25f, 123.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.49f);
        pathBuilder.lineToRelative(-82.06f, 82.0f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, true, -76.36f, -76.39f);
        pathBuilder.lineTo(149.1f, 37.14f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, true, 53.77f, 53.72f);
        pathBuilder.lineTo(103.59f, 191.54f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, true, -31.15f, -31.09f);
        pathBuilder.lineToRelative(83.28f, -84.67f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.56f, 8.42f);
        pathBuilder.lineTo(81.0f, 168.91f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 14.11f, 14.18f);
        pathBuilder.lineTo(194.35f, 82.4f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -36.74f, -36.8f);
        pathBuilder.lineTo(58.33f, 146.28f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, true, false, 59.37f, 59.44f);
        pathBuilder.lineToRelative(82.06f, -82.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 208.25f, 123.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperclip = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
