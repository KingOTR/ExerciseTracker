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

/* compiled from: Chatscircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatsCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getChatsCircle", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatsCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatscircleKt {
    private static ImageVector _chatsCircle;

    public static final ImageVector getChatsCircle(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(229.93f, 186.58f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, false, false, 168.16f, 74.42f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, true, false, 26.07f, 138.58f);
        pathBuilder.lineTo(18.58f, 164.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 36.0f, 181.42f);
        pathBuilder.lineToRelative(25.46f, -7.49f);
        pathBuilder.arcToRelative(78.0f, 78.0f, 0.0f, false, false, 26.39f, 7.63f);
        pathBuilder.arcToRelative(78.0f, 78.0f, 0.0f, false, false, 106.77f, 40.37f);
        pathBuilder.lineTo(220.0f, 229.42f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 237.42f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(62.0f, 161.5f);
        pathBuilder.arcToRelative(6.05f, 6.05f, 0.0f, false, false, -1.69f, 0.24f);
        pathBuilder.lineToRelative(-27.77f, 8.17f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.48f, -2.48f);
        pathBuilder.lineToRelative(8.17f, -27.77f);
        pathBuilder.arcToRelative(6.05f, 6.05f, 0.0f, false, false, -0.47f, -4.53f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, true, true, 27.08f, 27.08f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 62.0f, 161.5f);
        pathBuilder.close();
        pathBuilder.moveTo(217.71f, 187.66f);
        pathBuilder.lineTo(225.88f, 215.43f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.48f, 2.48f);
        pathBuilder.lineToRelative(-27.77f, -8.17f);
        pathBuilder.arcToRelative(6.06f, 6.06f, 0.0f, false, false, -4.53f, 0.47f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, false, true, -90.0f, -28.4f);
        pathBuilder.arcToRelative(77.92f, 77.92f, 0.0f, false, false, 71.0f, -94.68f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, false, true, 46.07f, 96.0f);
        pathBuilder.arcTo(6.05f, 6.05f, 0.0f, false, false, 217.74f, 187.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatsCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
