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

/* compiled from: Cursorclick.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CursorClick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCursorClick", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cursorClick", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorclickKt {
    private static ImageVector _cursorClick;

    public static final ImageVector getCursorClick(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _cursorClick;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CursorClick", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(88.0f, 24.0f);
        pathBuilder.lineTo(88.0f, 16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 104.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(16.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.42f, 39.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.74f, -3.58f);
        pathBuilder.lineToRelative(8.0f, -16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.31f, -7.16f);
        pathBuilder.lineToRelative(-8.0f, 16.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 124.42f, 39.16f);
        pathBuilder.close();
        pathBuilder.moveTo(28.42f, 120.85f);
        pathBuilder.lineTo(12.42f, 128.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 14.31f);
        pathBuilder.lineToRelative(16.0f, -8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, -14.31f);
        pathBuilder.close();
        pathBuilder.moveTo(219.31f, 184.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 22.63f);
        pathBuilder.lineToRelative(-12.68f, 12.68f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, 0.0f);
        pathBuilder.lineTo(132.7f, 168.0f);
        pathBuilder.lineTo(115.0f, 214.09f);
        pathBuilder.curveToRelative(0.0f, 0.1f, -0.08f, 0.21f, -0.13f, 0.32f);
        pathBuilder.arcToRelative(15.83f, 15.83f, 0.0f, false, true, -14.6f, 9.59f);
        pathBuilder.lineToRelative(-0.79f, 0.0f);
        pathBuilder.arcToRelative(15.83f, 15.83f, 0.0f, false, true, -14.41f, -11.0f);
        pathBuilder.lineTo(32.8f, 52.92f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 52.92f, 32.8f);
        pathBuilder.lineTo(213.0f, 85.07f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 1.41f, 29.8f);
        pathBuilder.lineToRelative(-0.32f, 0.13f);
        pathBuilder.lineTo(168.0f, 132.69f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 195.31f);
        pathBuilder.lineTo(156.69f, 144.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 4.93f, -26.0f);
        pathBuilder.lineToRelative(0.32f, -0.14f);
        pathBuilder.lineToRelative(45.95f, -17.64f);
        pathBuilder.lineTo(48.0f, 48.0f);
        pathBuilder.lineToRelative(52.2f, 159.86f);
        pathBuilder.lineToRelative(17.65f, -46.0f);
        pathBuilder.curveToRelative(0.0f, -0.11f, 0.08f, -0.22f, 0.13f, -0.33f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 11.69f, -9.34f);
        pathBuilder.arcToRelative(16.72f, 16.72f, 0.0f, false, true, 3.0f, -0.28f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 11.3f, 4.69f);
        pathBuilder.lineTo(195.31f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cursorClick = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
