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

/* compiled from: Paperclip.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Paperclip", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPaperclip", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperclip", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperclipKt {
    private static ImageVector _paperclip;

    public static final ImageVector getPaperclip(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(209.66f, 122.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder.lineToRelative(-82.05f, 82.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, -79.2f, -79.21f);
        pathBuilder.lineTo(147.67f, 35.73f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 56.61f, 56.55f);
        pathBuilder.lineTo(105.0f, 193.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, true, 71.0f, 159.0f);
        pathBuilder.lineTo(154.3f, 74.38f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 165.7f, 85.6f);
        pathBuilder.lineTo(82.39f, 170.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.27f, 11.36f);
        pathBuilder.lineTo(192.93f, 81.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 159.0f, 47.0f);
        pathBuilder.lineTo(59.76f, 147.68f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 56.53f, 56.62f);
        pathBuilder.lineToRelative(82.06f, -82.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 209.66f, 122.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperclip = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
