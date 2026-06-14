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

/* compiled from: Triangledashed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TriangleDashed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTriangleDashed", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_triangleDashed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriangledashedKt {
    private static ImageVector _triangleDashed;

    public static final ImageVector getTriangleDashed(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _triangleDashed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TriangleDashed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.0f, 216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(104.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.26f, 186.1f);
        pathBuilder.lineTo(235.6f, 178.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.79f, 12.0f);
        pathBuilder.lineToRelative(4.65f, 8.08f);
        pathBuilder.arcToRelative(3.56f, 3.56f, 0.0f, false, true, 0.0f, 3.73f);
        pathBuilder.arcToRelative(4.46f, 4.46f, 0.0f, false, true, -4.0f, 2.2f);
        pathBuilder.lineTo(192.0f, 204.01f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(23.46f);
        pathBuilder.arcToRelative(28.31f, 28.31f, 0.0f, false, false, 24.79f, -14.19f);
        pathBuilder.arcTo(27.47f, 27.47f, 0.0f, false, false, 240.26f, 186.1f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 204.0f);
        pathBuilder.lineTo(40.55f, 204.0f);
        pathBuilder.arcToRelative(4.46f, 4.46f, 0.0f, false, true, -4.0f, -2.2f);
        pathBuilder.arcToRelative(3.56f, 3.56f, 0.0f, false, true, 0.0f, -3.73f);
        pathBuilder.lineTo(41.19f, 190.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 20.4f, 178.0f);
        pathBuilder.lineToRelative(-4.66f, 8.09f);
        pathBuilder.arcToRelative(27.47f, 27.47f, 0.0f, false, false, 0.0f, 27.71f);
        pathBuilder.arcTo(28.31f, 28.31f, 0.0f, false, false, 40.55f, 228.0f);
        pathBuilder.lineTo(64.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.17f, 156.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.39f, -18.0f);
        pathBuilder.lineToRelative(-23.0f, -40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.8f, 12.0f);
        pathBuilder.lineToRelative(23.0f, 40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 202.18f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(166.5f, 58.0f);
        pathBuilder.lineTo(152.81f, 34.23f);
        pathBuilder.arcToRelative(28.74f, 28.74f, 0.0f, false, false, -49.62f, 0.0f);
        pathBuilder.lineTo(89.5f, 58.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.79f, 12.0f);
        pathBuilder.lineTo(124.0f, 46.2f);
        pathBuilder.arcToRelative(4.75f, 4.75f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(145.71f, 70.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.41f, 6.0f);
        pathBuilder.arcToRelative(11.87f, 11.87f, 0.0f, false, false, 6.0f, -1.6f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 166.5f, 58.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.85f, 93.6f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 66.46f, 98.0f);
        pathBuilder.lineToRelative(-23.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.8f, 12.0f);
        pathBuilder.lineToRelative(23.0f, -40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 82.85f, 93.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _triangleDashed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
