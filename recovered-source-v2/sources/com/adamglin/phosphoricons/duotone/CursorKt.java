package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cursor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cursor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCursor", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cursor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorKt {
    private static ImageVector _cursor;

    public static final ImageVector getCursor(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(213.66f, 201.0f);
        pathBuilder.lineTo(201.0f, 213.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f);
        pathBuilder.lineToRelative(-51.31f, -51.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.0f, 2.46f);
        pathBuilder.lineToRelative(-17.82f, 46.41f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.85f, -0.71f);
        pathBuilder.lineTo(40.41f, 50.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, -10.0f);
        pathBuilder.lineTo(210.51f, 92.68f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.71f, 14.85f);
        pathBuilder.lineToRelative(-46.41f, 17.82f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.46f, 13.0f);
        pathBuilder.lineToRelative(51.31f, 51.31f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 213.66f, 201.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(168.0f, 132.69f);
        pathBuilder2.lineTo(214.08f, 115.0f);
        pathBuilder2.lineToRelative(0.33f, -0.13f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 213.0f, 85.07f);
        pathBuilder2.lineTo(52.92f, 32.8f);
        pathBuilder2.arcTo(15.95f, 15.95f, 0.0f, false, false, 32.8f, 52.92f);
        pathBuilder2.lineTo(85.07f, 213.0f);
        pathBuilder2.arcToRelative(15.82f, 15.82f, 0.0f, false, false, 14.41f, 11.0f);
        pathBuilder2.lineToRelative(0.78f, 0.0f);
        pathBuilder2.arcToRelative(15.84f, 15.84f, 0.0f, false, false, 14.61f, -9.59f);
        pathBuilder2.lineToRelative(0.13f, -0.33f);
        pathBuilder2.lineTo(132.69f, 168.0f);
        pathBuilder2.lineTo(184.0f, 219.31f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f);
        pathBuilder2.lineToRelative(12.68f, -12.68f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f);
        pathBuilder2.close();
        pathBuilder2.moveTo(195.31f, 208.0f);
        pathBuilder2.lineTo(144.0f, 156.69f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -26.0f, 4.93f);
        pathBuilder2.curveToRelative(0.0f, 0.11f, -0.09f, 0.22f, -0.13f, 0.32f);
        pathBuilder2.lineToRelative(-17.65f, 46.0f);
        pathBuilder2.lineTo(48.0f, 48.0f);
        pathBuilder2.lineToRelative(159.85f, 52.2f);
        pathBuilder2.lineToRelative(-45.95f, 17.64f);
        pathBuilder2.lineToRelative(-0.32f, 0.13f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -4.93f, 26.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineTo(208.0f, 195.31f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cursor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
