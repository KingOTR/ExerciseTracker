package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chatcircleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatCircleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getChatCircleSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatCircleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatcircleslashKt {
    private static ImageVector _chatCircleSlash;

    public static final ImageVector getChatCircleSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(56.88f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f);
        pathBuilder.lineToRelative(7.81f, 8.59f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, false, false, 31.85f, 177.23f);
        pathBuilder.lineTo(21.0f, 209.66f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 46.34f, 235.0f);
        pathBuilder.lineToRelative(32.43f, -10.81f);
        pathBuilder.arcToRelative(108.08f, 108.08f, 0.0f, false, false, 112.55f, -8.66f);
        pathBuilder.lineToRelative(7.8f, 8.58f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(83.91f, 83.91f, 0.0f, false, true, -42.0f, -11.27f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.82f, -1.0f);
        pathBuilder.lineToRelative(-29.79f, 9.93f);
        pathBuilder.lineToRelative(9.93f, -29.79f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, -9.82f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, true, 7.94f, -95.49f);
        pathBuilder.lineToRelative(111.84f, 123.0f);
        pathBuilder.arcTo(83.83f, 83.83f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 128.0f);
        pathBuilder.arcToRelative(107.22f, 107.22f, 0.0f, false, true, -8.65f, 42.4f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 205.28f, 161.0f);
        pathBuilder.arcToRelative(84.07f, 84.07f, 0.0f, false, false, -102.77f, -113.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.27f, -22.87f);
        pathBuilder.arcTo(108.08f, 108.08f, 0.0f, false, true, 236.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatCircleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
