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

/* compiled from: Cursorclick.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CursorClick", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCursorClick", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cursorClick", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorclickKt {
    private static ImageVector _cursorClick;

    public static final ImageVector getCursorClick(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(92.0f, 24.0f);
        pathBuilder.lineTo(92.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 100.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(16.0f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(126.21f, 35.58f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.37f, -1.79f);
        pathBuilder.lineToRelative(8.0f, -16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.16f, -3.58f);
        pathBuilder.lineToRelative(-8.0f, 16.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 126.21f, 35.58f);
        pathBuilder.close();
        pathBuilder.moveTo(30.21f, 124.42f);
        pathBuilder.lineTo(14.21f, 132.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 7.16f);
        pathBuilder.lineToRelative(16.0f, -8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.58f, -7.16f);
        pathBuilder.close();
        pathBuilder.moveTo(216.49f, 186.83f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f);
        pathBuilder.lineTo(203.8f, 216.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f);
        pathBuilder.lineToRelative(-51.31f, -51.31f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, false, -3.58f, -1.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.89f, 2.27f);
        pathBuilder.lineToRelative(-17.78f, 46.31f);
        pathBuilder.arcToRelative(0.77f, 0.77f, 0.0f, false, true, -0.07f, 0.16f);
        pathBuilder.arcTo(11.85f, 11.85f, 0.0f, false, true, 100.26f, 220.0f);
        pathBuilder.horizontalLineToRelative(-0.59f);
        pathBuilder.arcToRelative(11.88f, 11.88f, 0.0f, false, true, -10.8f, -8.23f);
        pathBuilder.lineTo(36.6f, 51.68f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 51.68f, 36.6f);
        pathBuilder.lineTo(211.76f, 88.87f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.05f, 22.33f);
        pathBuilder.lineToRelative(-0.16f, 0.07f);
        pathBuilder.lineToRelative(-46.31f, 17.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, 6.47f);
        pathBuilder.close();
        pathBuilder.moveTo(210.83f, 192.49f);
        pathBuilder.lineTo(159.52f, 141.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.7f, -19.49f);
        pathBuilder.lineToRelative(0.16f, -0.06f);
        pathBuilder.lineToRelative(46.31f, -17.79f);
        pathBuilder.arcToRelative(3.95f, 3.95f, 0.0f, false, false, -0.42f, -7.35f);
        pathBuilder.lineTo(49.2f, 44.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, 5.0f);
        pathBuilder.lineTo(96.48f, 209.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.36f, 0.42f);
        pathBuilder.lineToRelative(17.78f, -46.31f);
        pathBuilder.arcToRelative(1.11f, 1.11f, 0.0f, false, true, 0.07f, -0.16f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.76f, -7.0f);
        pathBuilder.arcToRelative(12.21f, 12.21f, 0.0f, false, true, 2.24f, -0.21f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.49f, 3.52f);
        pathBuilder.lineToRelative(51.31f, 51.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 0.0f);
        pathBuilder.lineToRelative(12.69f, -12.69f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 210.83f, 192.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cursorClick = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
