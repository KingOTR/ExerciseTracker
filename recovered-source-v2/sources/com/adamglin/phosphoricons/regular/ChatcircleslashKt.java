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

/* compiled from: Chatcircleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatCircleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getChatCircleSlash", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatCircleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatcircleslashKt {
    private static ImageVector _chatCircleSlash;

    public static final ImageVector getChatCircleSlash(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineTo(52.33f, 56.66f);
        pathBuilder.arcTo(104.06f, 104.06f, 0.0f, false, false, 36.18f, 176.88f);
        pathBuilder.lineTo(24.83f, 210.93f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.24f, 20.24f);
        pathBuilder.lineToRelative(34.05f, -11.35f);
        pathBuilder.arcToRelative(104.0f, 104.0f, 0.0f, false, false, 112.7f, -9.73f);
        pathBuilder.lineToRelative(10.26f, 11.29f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 216.0f);
        pathBuilder.arcToRelative(87.87f, 87.87f, 0.0f, false, true, -44.06f, -11.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.54f, -0.66f);
        pathBuilder.lineTo(40.0f, 216.0f);
        pathBuilder.lineTo(52.47f, 178.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.66f, -6.54f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 63.14f, 68.54f);
        pathBuilder.lineTo(181.0f, 198.23f);
        pathBuilder.arcTo(87.77f, 87.77f, 0.0f, false, true, 128.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 128.0f);
        pathBuilder.arcToRelative(104.15f, 104.15f, 0.0f, false, true, -12.38f, 49.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.09f, -7.58f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, false, 93.88f, 46.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.21f, -14.75f);
        pathBuilder.arcTo(104.06f, 104.06f, 0.0f, false, true, 232.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatCircleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
