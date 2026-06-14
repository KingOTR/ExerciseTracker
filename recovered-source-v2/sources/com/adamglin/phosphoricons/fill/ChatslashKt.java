package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chatslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChatSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getChatSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chatSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatslashKt {
    private static ImageVector _chatSlash;

    public static final ImageVector getChatSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(213.92f, 210.61f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f);
        pathBuilder.lineTo(189.92f, 208.0f);
        pathBuilder.horizontalLineTo(83.0f);
        pathBuilder.lineToRelative(-32.6f, 28.16f);
        pathBuilder.lineToRelative(-0.08f, 0.07f);
        pathBuilder.arcTo(15.94f, 15.94f, 0.0f, false, true, 40.0f, 240.0f);
        pathBuilder.arcToRelative(16.13f, 16.13f, 0.0f, false, true, -6.8f, -1.52f);
        pathBuilder.arcTo(15.85f, 15.85f, 0.0f, false, true, 24.0f, 224.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(4.46f);
        pathBuilder.lineToRelative(-2.38f, -2.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 48.0f);
        pathBuilder.horizontalLineTo(96.75f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 6.69f);
        pathBuilder.lineTo(225.0f, 199.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, -2.69f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chatSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
