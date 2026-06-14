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

/* compiled from: Calendarstar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CalendarStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCalendarStar", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_calendarStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CalendarstarKt {
    private static ImageVector _calendarStar;

    public static final ImageVector getCalendarStar(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 32.0f);
        pathBuilder.lineTo(184.0f, 32.0f);
        pathBuilder.lineTo(184.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.lineTo(88.0f, 32.0f);
        pathBuilder.lineTo(88.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.lineTo(48.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder.lineTo(32.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(208.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(224.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 64.0f);
        pathBuilder.lineTo(72.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.55f, 124.7f);
        pathBuilder.lineTo(154.09f, 144.89f);
        pathBuilder.lineTo(161.55f, 175.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, 4.17f);
        pathBuilder.arcToRelative(4.05f, 4.05f, 0.0f, false, true, -2.39f, 0.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -0.55f);
        pathBuilder.lineTo(128.0f, 163.18f);
        pathBuilder.lineToRelative(-27.64f, 16.27f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 94.45f, 175.0f);
        pathBuilder.lineToRelative(7.46f, -30.15f);
        pathBuilder.lineTo(77.45f, 124.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.24f, -7.08f);
        pathBuilder.lineToRelative(32.24f, -2.49f);
        pathBuilder.lineToRelative(12.4f, -28.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.34f, 0.0f);
        pathBuilder.lineToRelative(12.4f, 28.71f);
        pathBuilder.lineToRelative(32.24f, 2.49f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.24f, 7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(168.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _calendarStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
