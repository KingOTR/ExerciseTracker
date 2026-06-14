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

/* compiled from: Calendarstar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CalendarStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCalendarStar", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_calendarStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CalendarstarKt {
    private static ImageVector _calendarStar;

    public static final ImageVector getCalendarStar(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _calendarStar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CalendarStar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 28.0f);
        pathBuilder.lineTo(188.0f, 28.0f);
        pathBuilder.lineTo(188.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineTo(92.0f, 28.0f);
        pathBuilder.lineTo(92.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineTo(48.0f, 28.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f);
        pathBuilder.lineTo(28.0f, 208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(208.0f, 228.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(228.0f, 48.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 204.0f);
        pathBuilder.lineTo(52.0f, 204.0f);
        pathBuilder.lineTo(52.0f, 52.0f);
        pathBuilder.lineTo(68.0f, 52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.92f, 109.65f);
        pathBuilder.lineTo(149.5f, 107.53f);
        pathBuilder.lineTo(139.0f, 83.25f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.0f, 0.0f);
        pathBuilder.lineTo(106.5f, 107.53f);
        pathBuilder.lineToRelative(-27.42f, 2.12f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.72f, 21.22f);
        pathBuilder.lineToRelative(20.58f, 17.0f);
        pathBuilder.lineToRelative(-6.25f, 25.26f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.73f, 13.22f);
        pathBuilder.lineTo(128.0f, 172.46f);
        pathBuilder.lineToRelative(23.58f, 13.88f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.73f, -13.22f);
        pathBuilder.lineToRelative(-6.25f, -25.26f);
        pathBuilder.lineToRelative(20.58f, -17.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.72f, -21.22f);
        pathBuilder.close();
        pathBuilder.moveTo(141.92f, 134.16f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.0f, 12.13f);
        pathBuilder.lineToRelative(1.21f, 4.89f);
        pathBuilder.lineToRelative(-5.07f, -3.0f);
        pathBuilder.arcToRelative(12.06f, 12.06f, 0.0f, false, false, -12.18f, 0.0f);
        pathBuilder.lineToRelative(-5.07f, 3.0f);
        pathBuilder.lineToRelative(1.21f, -4.89f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.0f, -12.13f);
        pathBuilder.lineToRelative(-3.47f, -2.87f);
        pathBuilder.lineToRelative(5.0f, -0.39f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.09f, -7.21f);
        pathBuilder.lineToRelative(2.33f, -5.4f);
        pathBuilder.lineToRelative(2.33f, 5.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.09f, 7.21f);
        pathBuilder.lineToRelative(5.0f, 0.39f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _calendarStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
