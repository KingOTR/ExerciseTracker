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

/* compiled from: Cursor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cursor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCursor", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cursor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorKt {
    private static ImageVector _cursor;

    public static final ImageVector getCursor(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(224.15f, 179.17f);
        pathBuilder.lineToRelative(-46.83f, -46.82f);
        pathBuilder.lineToRelative(37.93f, -13.51f);
        pathBuilder.lineToRelative(0.76f, -0.3f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -1.76f, -37.27f);
        pathBuilder.lineTo(54.16f, 29.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 29.0f, 54.16f);
        pathBuilder.lineTo(81.27f, 214.24f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 118.54f, 216.0f);
        pathBuilder.curveToRelative(0.11f, -0.25f, 0.21f, -0.5f, 0.3f, -0.76f);
        pathBuilder.lineToRelative(13.51f, -37.92f);
        pathBuilder.lineToRelative(46.83f, 46.82f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.28f, 0.0f);
        pathBuilder.lineToRelative(16.69f, -16.68f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 224.15f, 179.17f);
        pathBuilder.close();
        pathBuilder.moveTo(193.32f, 204.34f);
        pathBuilder.lineTo(144.84f, 155.86f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 130.7f, 150.0f);
        pathBuilder.arcToRelative(20.66f, 20.66f, 0.0f, false, false, -3.74f, 0.35f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 112.35f, 162.0f);
        pathBuilder.curveToRelative(-0.11f, 0.25f, -0.21f, 0.5f, -0.3f, 0.76f);
        pathBuilder.lineTo(100.4f, 195.5f);
        pathBuilder.lineTo(54.29f, 54.29f);
        pathBuilder.lineToRelative(141.21f, 46.1f);
        pathBuilder.lineToRelative(-32.71f, 11.66f);
        pathBuilder.curveToRelative(-0.26f, 0.09f, -0.51f, 0.19f, -0.76f, 0.3f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.17f, 32.48f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(48.49f, 48.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cursor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
