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

/* compiled from: Cursor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cursor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCursor", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cursor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorKt {
    private static ImageVector _cursor;

    public static final ImageVector getCursor(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(166.59f, 134.1f);
        pathBuilder.arcToRelative(1.91f, 1.91f, 0.0f, false, true, -0.55f, -1.79f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.08f, -1.42f);
        pathBuilder.lineToRelative(46.25f, -17.76f);
        pathBuilder.lineToRelative(0.24f, -0.1f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 212.38f, 87.0f);
        pathBuilder.lineTo(52.29f, 34.7f);
        pathBuilder.arcTo(13.95f, 13.95f, 0.0f, false, false, 34.7f, 52.29f);
        pathBuilder.lineTo(87.0f, 212.38f);
        pathBuilder.arcToRelative(13.82f, 13.82f, 0.0f, false, false, 12.6f, 9.6f);
        pathBuilder.curveToRelative(0.23f, 0.0f, 0.46f, 0.0f, 0.69f, 0.0f);
        pathBuilder.arcTo(13.84f, 13.84f, 0.0f, false, false, 113.0f, 213.61f);
        pathBuilder.arcToRelative(2.44f, 2.44f, 0.0f, false, false, 0.1f, -0.24f);
        pathBuilder.lineToRelative(17.76f, -46.25f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.21f, -0.53f);
        pathBuilder.lineToRelative(51.31f, 51.31f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f);
        pathBuilder.lineToRelative(12.69f, -12.69f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.8f);
        pathBuilder.close();
        pathBuilder.moveTo(209.41f, 196.73f);
        pathBuilder.lineTo(196.73f, 209.41f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f);
        pathBuilder.lineTo(142.59f, 158.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -22.74f, 4.32f);
        pathBuilder.arcToRelative(2.44f, 2.44f, 0.0f, false, false, -0.1f, 0.24f);
        pathBuilder.lineTo(102.0f, 208.91f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.61f, -0.26f);
        pathBuilder.lineTo(46.11f, 48.57f);
        pathBuilder.arcToRelative(1.87f, 1.87f, 0.0f, false, true, 0.47f, -2.0f);
        pathBuilder.arcTo(1.92f, 1.92f, 0.0f, false, true, 47.93f, 46.0f);
        pathBuilder.arcToRelative(2.22f, 2.22f, 0.0f, false, true, 0.64f, 0.1f);
        pathBuilder.lineTo(208.65f, 98.38f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.26f, 3.61f);
        pathBuilder.lineToRelative(-46.25f, 17.76f);
        pathBuilder.lineToRelative(-0.24f, 0.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -4.32f, 22.74f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(51.31f, 51.31f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 209.41f, 196.73f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cursor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
