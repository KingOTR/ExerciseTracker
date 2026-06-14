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

/* compiled from: Chatsteardrop.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatsTeardrop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getChatsTeardrop", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatsTeardrop", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatsteardropKt {
    private static ImageVector _chatsTeardrop;

    public static final ImageVector getChatsTeardrop(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _chatsTeardrop;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChatsTeardrop", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.16f, 74.42f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, false, false, 18.0f, 104.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(88.0f, 182.0f);
        pathBuilder.arcToRelative(78.15f, 78.15f, 0.0f, false, false, 72.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(238.0f, 152.0f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, false, false, 168.16f, 74.42f);
        pathBuilder.close();
        pathBuilder.moveTo(30.0f, 168.0f);
        pathBuilder.lineTo(30.0f, 104.0f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, true, true, 66.0f, 66.0f);
        pathBuilder.lineTo(32.0f, 170.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 216.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(160.0f, 218.0f);
        pathBuilder.arcToRelative(66.13f, 66.13f, 0.0f, false, true, -58.89f, -36.19f);
        pathBuilder.arcToRelative(77.92f, 77.92f, 0.0f, false, false, 71.0f, -94.68f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, true, 226.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatsTeardrop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
