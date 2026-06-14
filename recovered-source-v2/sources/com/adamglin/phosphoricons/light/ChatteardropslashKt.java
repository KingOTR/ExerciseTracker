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

/* compiled from: Chatteardropslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatTeardropSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getChatTeardropSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatTeardropSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatteardropslashKt {
    private static ImageVector _chatTeardropSlash;

    public static final ImageVector getChatTeardropSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _chatTeardropSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChatTeardropSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineToRelative(14.37f, 15.8f);
        pathBuilder.arcTo(97.42f, 97.42f, 0.0f, false, false, 34.0f, 124.0f);
        pathBuilder.verticalLineToRelative(84.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(84.0f);
        pathBuilder.arcToRelative(98.24f, 98.24f, 0.0f, false, false, 56.82f, -18.18f);
        pathBuilder.lineTo(203.56f, 220.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 210.0f);
        pathBuilder.lineTo(48.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(46.0f, 124.0f);
        pathBuilder.arcTo(85.46f, 85.46f, 0.0f, false, true, 66.08f, 68.8f);
        pathBuilder.lineTo(180.7f, 194.88f);
        pathBuilder.arcTo(84.91f, 84.91f, 0.0f, false, true, 132.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 124.0f);
        pathBuilder.arcToRelative(97.86f, 97.86f, 0.0f, false, true, -14.06f, 50.61f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.15f, 2.9f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.12f, -9.1f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, false, -110.88f, -122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.2f, -10.81f);
        pathBuilder.arcTo(97.09f, 97.09f, 0.0f, false, true, 132.0f, 26.0f);
        pathBuilder.arcTo(98.11f, 98.11f, 0.0f, false, true, 230.0f, 124.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatTeardropSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
