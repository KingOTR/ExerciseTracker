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

/* compiled from: Chatcircleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatCircleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getChatCircleSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatCircleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatcircleslashKt {
    private static ImageVector _chatCircleSlash;

    public static final ImageVector getChatCircleSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineTo(55.07f, 56.7f);
        pathBuilder.arcToRelative(102.0f, 102.0f, 0.0f, false, false, -16.72f, 120.0f);
        pathBuilder.lineTo(26.73f, 211.56f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.71f, 17.71f);
        pathBuilder.lineToRelative(34.87f, -11.62f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, false, false, 192.0f, 207.37f);
        pathBuilder.lineTo(203.56f, 220.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, -45.06f, -12.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.91f, -0.5f);
        pathBuilder.lineTo(40.65f, 217.88f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.53f, -2.53f);
        pathBuilder.lineTo(50.58f, 178.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.5f, -4.91f);
        pathBuilder.arcTo(90.0f, 90.0f, 0.0f, false, true, 63.16f, 65.6f);
        pathBuilder.lineTo(184.0f, 198.47f);
        pathBuilder.arcTo(89.74f, 89.74f, 0.0f, false, true, 128.0f, 218.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 128.0f);
        pathBuilder.arcToRelative(102.25f, 102.25f, 0.0f, false, true, -12.14f, 48.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.29f, 3.15f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.28f, -8.84f);
        pathBuilder.arcTo(90.05f, 90.05f, 0.0f, false, false, 93.1f, 45.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 88.45f, 34.0f);
        pathBuilder.arcTo(102.06f, 102.06f, 0.0f, false, true, 230.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatCircleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
