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

/* compiled from: Chatteardropslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatTeardropSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getChatTeardropSlash", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatTeardropSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatteardropslashKt {
    private static ImageVector _chatTeardropSlash;

    public static final ImageVector getChatTeardropSlash(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineToRelative(13.18f, 14.5f);
        pathBuilder.arcTo(99.39f, 99.39f, 0.0f, false, false, 32.0f, 124.0f);
        pathBuilder.verticalLineToRelative(84.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(84.0f);
        pathBuilder.arcToRelative(100.33f, 100.33f, 0.0f, false, false, 56.53f, -17.53f);
        pathBuilder.lineToRelative(13.55f, 14.91f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 208.0f);
        pathBuilder.lineTo(48.0f, 208.0f);
        pathBuilder.lineTo(48.0f, 124.0f);
        pathBuilder.arcTo(83.46f, 83.46f, 0.0f, false, true, 66.15f, 71.85f);
        pathBuilder.lineTo(177.66f, 194.51f);
        pathBuilder.arcTo(83.0f, 83.0f, 0.0f, false, true, 132.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 124.0f);
        pathBuilder.arcToRelative(99.87f, 99.87f, 0.0f, false, true, -14.35f, 51.65f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.7f, -8.28f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, false, 95.66f, 48.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.94f, -14.42f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, true, 232.0f, 124.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatTeardropSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
