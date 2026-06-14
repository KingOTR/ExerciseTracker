package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chatcircletext.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatCircleText", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getChatCircleText", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatCircleText", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatcircletextKt {
    private static ImageVector _chatCircleText;

    public static final ImageVector getChatCircleText(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _chatCircleText;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChatCircleText", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.0f, 112.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(96.0f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 140.0f);
        pathBuilder.lineTo(96.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 128.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, true, 79.5f, 215.47f);
        pathBuilder.lineToRelative(-35.69f, 11.9f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.18f, -15.18f);
        pathBuilder.lineToRelative(11.9f, -35.69f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, true, 228.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 128.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, true, false, 48.35f, 174.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.33f, 3.27f);
        pathBuilder.lineTo(36.22f, 214.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.06f, 5.06f);
        pathBuilder.lineToRelative(37.38f, -12.46f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, true, 1.27f, -0.21f);
        pathBuilder.arcToRelative(4.05f, 4.05f, 0.0f, false, true, 2.0f, 0.54f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, false, 220.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatCircleText = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
