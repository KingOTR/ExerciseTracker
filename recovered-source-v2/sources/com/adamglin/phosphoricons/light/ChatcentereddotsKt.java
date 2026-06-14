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

/* compiled from: Chatcentereddots.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatCenteredDots", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getChatCenteredDots", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatCenteredDots", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatcentereddotsKt {
    private static ImageVector _chatCenteredDots;

    public static final ImageVector getChatCenteredDots(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _chatCenteredDots;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChatCenteredDots", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(138.0f, 120.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 110.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 84.0f, 110.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 110.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 172.0f, 110.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 56.0f);
        pathBuilder.lineTo(230.0f, 184.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f);
        pathBuilder.lineTo(154.41f, 198.0f);
        pathBuilder.lineTo(140.16f, 223.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -24.32f, 0.0f);
        pathBuilder.lineTo(101.59f, 198.0f);
        pathBuilder.lineTo(40.0f, 198.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f);
        pathBuilder.lineTo(26.0f, 56.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f);
        pathBuilder.lineTo(216.0f, 42.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.lineTo(40.0f, 54.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f);
        pathBuilder.lineTo(38.0f, 184.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(65.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.21f, 3.0f);
        pathBuilder.lineToRelative(16.0f, 28.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.48f, 0.0f);
        pathBuilder.lineToRelative(16.0f, -28.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.21f, -3.0f);
        pathBuilder.lineTo(216.0f, 186.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatCenteredDots = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
