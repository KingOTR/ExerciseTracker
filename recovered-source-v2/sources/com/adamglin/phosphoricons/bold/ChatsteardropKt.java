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

/* compiled from: Chatsteardrop.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatsTeardrop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getChatsTeardrop", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatsTeardrop", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatsteardropKt {
    private static ImageVector _chatsTeardrop;

    public static final ImageVector getChatsTeardrop(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(172.29f, 68.9f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, false, 12.0f, 104.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(84.1f);
        pathBuilder.arcTo(84.18f, 84.18f, 0.0f, false, false, 160.0f, 236.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, false, 172.29f, 68.9f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 104.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, 60.0f);
        pathBuilder.horizontalLineTo(36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 212.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(60.14f, 60.14f, 0.0f, false, true, -49.0f, -25.37f);
        pathBuilder.arcToRelative(83.93f, 83.93f, 0.0f, false, false, 68.55f, -91.37f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, true, 220.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatsTeardrop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
