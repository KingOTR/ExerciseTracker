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

/* compiled from: Chatscircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatsCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getChatsCircle", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatsCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatscircleKt {
    private static ImageVector _chatsCircle;

    public static final ImageVector getChatsCircle(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _chatsCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChatsCircle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.79f, 186.39f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, -61.0f, -110.07f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, true, false, 28.21f, 138.39f);
        pathBuilder.lineTo(20.5f, 164.6f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.9f, 14.9f);
        pathBuilder.lineToRelative(26.21f, -7.71f);
        pathBuilder.arcToRelative(75.93f, 75.93f, 0.0f, false, false, 27.6f, 7.9f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 105.18f, 40.1f);
        pathBuilder.lineToRelative(26.21f, 7.71f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.9f, -14.9f);
        pathBuilder.close();
        pathBuilder.moveTo(60.9f, 163.66f);
        pathBuilder.lineToRelative(-27.76f, 8.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, -5.0f);
        pathBuilder.lineToRelative(8.17f, -27.76f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, false, -0.31f, -3.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, true, true, 63.92f, 164.0f);
        pathBuilder.arcTo(4.06f, 4.06f, 0.0f, false, false, 60.9f, 163.66f);
        pathBuilder.close();
        pathBuilder.moveTo(226.82f, 218.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 1.0f);
        pathBuilder.lineToRelative(-27.76f, -8.17f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, false, -3.0f, 0.31f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, true, 98.0f, 180.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 71.5f, -95.28f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, true, 220.0f, 184.08f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, false, -0.31f, 3.0f);
        pathBuilder.lineToRelative(8.17f, 27.76f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 226.82f, 218.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatsCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
