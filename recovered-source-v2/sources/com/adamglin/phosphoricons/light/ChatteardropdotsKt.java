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

/* compiled from: Chatteardropdots.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatTeardropDots", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getChatTeardropDots", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatTeardropDots", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatteardropdotsKt {
    private static ImageVector _chatTeardropDots;

    public static final ImageVector getChatTeardropDots(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _chatTeardropDots;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChatTeardropDots", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(142.0f, 128.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 142.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 118.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 88.0f, 118.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 118.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 176.0f, 118.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 124.0f);
        pathBuilder.arcToRelative(98.11f, 98.11f, 0.0f, false, true, -98.0f, 98.0f);
        pathBuilder.lineTo(48.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f);
        pathBuilder.lineTo(34.0f, 124.0f);
        pathBuilder.arcToRelative(98.0f, 98.0f, 0.0f, false, true, 196.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 124.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, false, -172.0f, 0.0f);
        pathBuilder.verticalLineToRelative(84.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(84.0f);
        pathBuilder.arcTo(86.1f, 86.1f, 0.0f, false, false, 218.0f, 124.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatTeardropDots = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
