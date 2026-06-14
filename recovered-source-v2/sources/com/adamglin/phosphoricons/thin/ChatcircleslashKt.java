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

/* compiled from: Chatcircleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatCircleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getChatCircleSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatCircleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatcircleslashKt {
    private static ImageVector _chatCircleSlash;

    public static final ImageVector getChatCircleSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _chatCircleSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChatCircleSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f);
        pathBuilder.lineTo(57.83f, 56.76f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, false, 40.53f, 176.5f);
        pathBuilder.lineToRelative(-11.9f, 35.69f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.18f, 15.18f);
        pathBuilder.lineToRelative(35.69f, -11.9f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, false, false, 112.75f, -10.85f);
        pathBuilder.lineTo(205.0f, 218.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, -46.07f, -12.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.27f, -0.33f);
        pathBuilder.lineTo(41.28f, 219.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.06f, -5.06f);
        pathBuilder.lineToRelative(12.46f, -37.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.33f, -3.27f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 63.22f, 62.69f);
        pathBuilder.lineToRelative(123.64f, 136.0f);
        pathBuilder.arcTo(91.75f, 91.75f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 128.0f);
        pathBuilder.arcToRelative(100.28f, 100.28f, 0.0f, false, true, -11.9f, 47.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.53f, 2.1f);
        pathBuilder.arcToRelative(3.91f, 3.91f, 0.0f, false, true, -1.89f, -0.48f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.63f, -5.42f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, false, 92.33f, 43.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.11f, -7.37f);
        pathBuilder.arcTo(100.05f, 100.05f, 0.0f, false, true, 228.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatCircleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
