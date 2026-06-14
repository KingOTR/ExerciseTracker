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

/* compiled from: Cursorclick.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CursorClick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCursorClick", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cursorClick", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorclickKt {
    private static ImageVector _cursorClick;

    public static final ImageVector getCursorClick(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(90.0f, 24.0f);
        pathBuilder.lineTo(90.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 102.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(16.0f, 90.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(125.32f, 37.37f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.05f, -2.69f);
        pathBuilder.lineToRelative(8.0f, -16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.74f, -5.37f);
        pathBuilder.lineToRelative(-8.0f, 16.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 125.32f, 37.37f);
        pathBuilder.close();
        pathBuilder.moveTo(29.32f, 122.63f);
        pathBuilder.lineTo(13.32f, 130.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 10.74f);
        pathBuilder.lineToRelative(16.0f, -8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.36f, -10.74f);
        pathBuilder.close();
        pathBuilder.moveTo(217.9f, 185.41f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 19.8f);
        pathBuilder.lineTo(205.21f, 217.9f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -19.8f, 0.0f);
        pathBuilder.lineTo(134.1f, 166.59f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.21f, 0.54f);
        pathBuilder.lineToRelative(-17.75f, 46.24f);
        pathBuilder.arcToRelative(2.44f, 2.44f, 0.0f, false, false, -0.1f, 0.24f);
        pathBuilder.arcTo(13.85f, 13.85f, 0.0f, false, true, 100.26f, 222.0f);
        pathBuilder.curveToRelative(-0.23f, 0.0f, -0.45f, 0.0f, -0.68f, 0.0f);
        pathBuilder.arcTo(13.85f, 13.85f, 0.0f, false, true, 87.0f, 212.38f);
        pathBuilder.lineTo(34.7f, 52.3f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 52.3f, 34.7f);
        pathBuilder.lineTo(212.38f, 87.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 213.61f, 113.0f);
        pathBuilder.lineToRelative(-0.24f, 0.09f);
        pathBuilder.lineToRelative(-46.25f, 17.76f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.53f, 3.21f);
        pathBuilder.close();
        pathBuilder.moveTo(209.41f, 193.9f);
        pathBuilder.lineTo(158.1f, 142.59f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 4.32f, -22.74f);
        pathBuilder.lineToRelative(0.24f, -0.1f);
        pathBuilder.lineTo(208.91f, 102.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.26f, -3.61f);
        pathBuilder.lineTo(48.58f, 46.11f);
        pathBuilder.arcToRelative(2.33f, 2.33f, 0.0f, false, false, -0.65f, -0.11f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.82f, 2.58f);
        pathBuilder.lineTo(98.38f, 208.65f);
        pathBuilder.arcToRelative(1.84f, 1.84f, 0.0f, false, false, 1.77f, 1.35f);
        pathBuilder.arcToRelative(1.81f, 1.81f, 0.0f, false, false, 1.84f, -1.09f);
        pathBuilder.lineToRelative(17.76f, -46.25f);
        pathBuilder.lineToRelative(0.1f, -0.24f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 22.74f, -4.32f);
        pathBuilder.lineToRelative(51.31f, 51.31f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.83f, 0.0f);
        pathBuilder.lineToRelative(12.68f, -12.68f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 209.41f, 193.9f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cursorClick = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
