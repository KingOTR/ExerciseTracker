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

/* compiled from: Cursor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cursor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCursor", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cursor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorKt {
    private static ImageVector _cursor;

    public static final ImageVector getCursor(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _cursor;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cursor", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 132.69f);
        pathBuilder.lineTo(214.08f, 115.0f);
        pathBuilder.lineToRelative(0.33f, -0.13f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 213.0f, 85.07f);
        pathBuilder.lineTo(52.92f, 32.8f);
        pathBuilder.arcTo(15.95f, 15.95f, 0.0f, false, false, 32.8f, 52.92f);
        pathBuilder.lineTo(85.07f, 213.0f);
        pathBuilder.arcToRelative(15.82f, 15.82f, 0.0f, false, false, 14.41f, 11.0f);
        pathBuilder.lineToRelative(0.78f, 0.0f);
        pathBuilder.arcToRelative(15.84f, 15.84f, 0.0f, false, false, 14.61f, -9.59f);
        pathBuilder.lineToRelative(0.13f, -0.33f);
        pathBuilder.lineTo(132.69f, 168.0f);
        pathBuilder.lineTo(184.0f, 219.31f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f);
        pathBuilder.lineToRelative(12.68f, -12.68f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f);
        pathBuilder.close();
        pathBuilder.moveTo(195.31f, 208.0f);
        pathBuilder.lineTo(144.0f, 156.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -26.0f, 4.93f);
        pathBuilder.curveToRelative(0.0f, 0.11f, -0.09f, 0.22f, -0.13f, 0.32f);
        pathBuilder.lineToRelative(-17.65f, 46.0f);
        pathBuilder.lineTo(48.0f, 48.0f);
        pathBuilder.lineToRelative(159.85f, 52.2f);
        pathBuilder.lineToRelative(-45.95f, 17.64f);
        pathBuilder.lineToRelative(-0.32f, 0.13f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -4.93f, 26.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(208.0f, 195.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cursor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
