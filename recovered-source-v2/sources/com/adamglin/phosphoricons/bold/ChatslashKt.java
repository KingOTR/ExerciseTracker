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

/* compiled from: Chatslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getChatSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatslashKt {
    private static ImageVector _chatSlash;

    public static final ImageVector getChatSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _chatSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChatSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(56.88f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.8f, 44.28f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 64.0f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcTo(19.82f, 19.82f, 0.0f, false, false, 31.56f, 242.1f);
        pathBuilder.arcToRelative(20.14f, 20.14f, 0.0f, false, false, 8.49f, 1.9f);
        pathBuilder.arcToRelative(19.91f, 19.91f, 0.0f, false, false, 12.82f, -4.72f);
        pathBuilder.lineToRelative(0.12f, -0.11f);
        pathBuilder.lineTo(84.47f, 212.0f);
        pathBuilder.horizontalLineTo(188.15f);
        pathBuilder.lineToRelative(11.0f, 12.07f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.15f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 188.0f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, -7.84f, 2.92f);
        pathBuilder.lineTo(44.0f, 215.23f);
        pathBuilder.verticalLineTo(68.0f);
        pathBuilder.horizontalLineTo(57.24f);
        pathBuilder.lineTo(166.33f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 64.0f);
        pathBuilder.verticalLineTo(174.12f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.verticalLineTo(68.0f);
        pathBuilder.horizontalLineTo(116.6f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
