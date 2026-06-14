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

/* compiled from: Cursor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cursor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCursor", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cursor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CursorKt {
    private static ImageVector _cursor;

    public static final ImageVector getCursor(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(165.17f, 135.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -6.46f);
        pathBuilder.lineToRelative(46.31f, -17.79f);
        pathBuilder.lineToRelative(0.16f, -0.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.05f, -22.33f);
        pathBuilder.lineTo(51.67f, 36.6f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.6f, 51.67f);
        pathBuilder.lineTo(88.87f, 211.76f);
        pathBuilder.arcTo(11.86f, 11.86f, 0.0f, false, false, 99.67f, 220.0f);
        pathBuilder.horizontalLineToRelative(0.58f);
        pathBuilder.arcToRelative(11.86f, 11.86f, 0.0f, false, false, 11.0f, -7.19f);
        pathBuilder.lineToRelative(0.06f, -0.16f);
        pathBuilder.lineToRelative(17.79f, -46.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.47f, -1.17f);
        pathBuilder.lineToRelative(51.31f, 51.32f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f);
        pathBuilder.lineToRelative(12.69f, -12.69f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.83f, 198.14f);
        pathBuilder.lineTo(198.14f, 210.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.lineToRelative(-51.31f, -51.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, -3.52f);
        pathBuilder.arcToRelative(12.13f, 12.13f, 0.0f, false, false, -2.24f, 0.21f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.77f, 7.0f);
        pathBuilder.lineToRelative(-0.06f, 0.16f);
        pathBuilder.lineToRelative(-17.79f, 46.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.36f, -0.42f);
        pathBuilder.lineTo(44.2f, 49.19f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, -5.0f);
        pathBuilder.lineTo(209.27f, 96.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.42f, 7.36f);
        pathBuilder.lineToRelative(-46.31f, 17.78f);
        pathBuilder.lineToRelative(-0.16f, 0.07f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.71f, 19.49f);
        pathBuilder.lineToRelative(51.32f, 51.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 210.83f, 198.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cursor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
