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

/* compiled from: Calendarstar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CalendarStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCalendarStar", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_calendarStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CalendarstarKt {
    private static ImageVector _calendarStar;

    public static final ImageVector getCalendarStar(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 34.0f);
        pathBuilder.lineTo(182.0f, 34.0f);
        pathBuilder.lineTo(182.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(170.0f, 34.0f);
        pathBuilder.lineTo(86.0f, 34.0f);
        pathBuilder.lineTo(86.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(74.0f, 34.0f);
        pathBuilder.lineTo(48.0f, 34.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f);
        pathBuilder.lineTo(34.0f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(208.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(222.0f, 48.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(48.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(46.0f, 48.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(74.0f, 46.0f);
        pathBuilder.lineTo(74.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(86.0f, 46.0f);
        pathBuilder.horizontalLineToRelative(84.0f);
        pathBuilder.lineTo(170.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(182.0f, 46.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.46f, 115.63f);
        pathBuilder.lineTo(145.46f, 113.23f);
        pathBuilder.lineTo(133.51f, 85.62f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.0f, 0.0f);
        pathBuilder.lineToRelative(-11.91f, 27.61f);
        pathBuilder.lineToRelative(-31.0f, 2.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.36f, 10.61f);
        pathBuilder.lineToRelative(23.49f, 19.39f);
        pathBuilder.lineToRelative(-7.16f, 28.93f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.87f, 6.61f);
        pathBuilder.lineTo(128.0f, 165.5f);
        pathBuilder.lineToRelative(26.62f, 15.67f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.87f, -6.61f);
        pathBuilder.lineToRelative(-7.16f, -28.93f);
        pathBuilder.lineToRelative(23.49f, -19.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.36f, -10.61f);
        pathBuilder.close();
        pathBuilder.moveTo(145.78f, 138.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, 6.07f);
        pathBuilder.lineToRelative(4.63f, 18.74f);
        pathBuilder.lineTo(131.0f, 153.37f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.08f, 0.0f);
        pathBuilder.lineToRelative(-17.37f, 10.22f);
        pathBuilder.lineToRelative(4.63f, -18.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, -6.07f);
        pathBuilder.lineTo(95.28f, 126.45f);
        pathBuilder.lineToRelative(19.83f, -1.53f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, -3.61f);
        pathBuilder.lineTo(128.0f, 103.14f);
        pathBuilder.lineToRelative(7.84f, 18.17f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.0f, 3.61f);
        pathBuilder.lineToRelative(19.83f, 1.53f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _calendarStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
