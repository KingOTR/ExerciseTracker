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

/* compiled from: Chatscircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatsCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getChatsCircle", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatsCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatscircleKt {
    private static ImageVector _chatsCircle;

    public static final ImageVector getChatsCircle(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(232.07f, 186.76f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, -62.5f, -114.17f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, true, false, 23.93f, 138.76f);
        pathBuilder.lineToRelative(-7.27f, 24.71f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.87f, 19.87f);
        pathBuilder.lineToRelative(24.71f, -7.27f);
        pathBuilder.arcToRelative(80.39f, 80.39f, 0.0f, false, false, 25.18f, 7.35f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, 108.34f, 40.65f);
        pathBuilder.lineToRelative(24.71f, 7.27f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.87f, -19.86f);
        pathBuilder.close();
        pathBuilder.moveTo(62.0f, 159.5f);
        pathBuilder.arcToRelative(8.28f, 8.28f, 0.0f, false, false, -2.26f, 0.32f);
        pathBuilder.lineTo(32.0f, 168.0f);
        pathBuilder.lineToRelative(8.17f, -27.76f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.63f, -6.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, true, true, 26.26f, 26.26f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 62.0f, 159.5f);
        pathBuilder.close();
        pathBuilder.moveTo(215.79f, 188.23f);
        pathBuilder.lineTo(224.0f, 216.0f);
        pathBuilder.lineToRelative(-27.76f, -8.17f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, 0.63f);
        pathBuilder.arcToRelative(64.05f, 64.05f, 0.0f, false, true, -85.87f, -24.88f);
        pathBuilder.arcTo(79.93f, 79.93f, 0.0f, false, false, 174.7f, 89.71f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 41.75f, 92.48f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 215.82f, 188.23f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatsCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
