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

/* compiled from: Dropslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getDropSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropslashKt {
    private static ImageVector _dropSlash;

    public static final ImageVector getDropSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _dropSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(56.88f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f);
        pathBuilder.lineTo(59.68f, 70.69f);
        pathBuilder.curveTo(44.0f, 95.22f, 36.0f, 119.84f, 36.0f, 144.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, 153.0f, 68.9f);
        pathBuilder.lineToRelative(10.16f, 11.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f);
        pathBuilder.curveToRelative(0.0f, -17.74f, 5.54f, -36.12f, 16.49f, -54.82f);
        pathBuilder.lineToRelative(96.32f, 106.0f);
        pathBuilder.arcTo(67.84f, 67.84f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.61f, 47.44f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.12f, -17.0f);
        pathBuilder.arcToRelative(243.72f, 243.72f, 0.0f, false, true, 28.39f, -24.3f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.76f, 0.0f);
        pathBuilder.curveTo(138.36f, 8.6f, 220.0f, 66.64f, 220.0f, 144.0f);
        pathBuilder.arcToRelative(92.8f, 92.8f, 0.0f, false, true, -1.0f, 13.34f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.86f, 10.28f);
        pathBuilder.arcToRelative(12.74f, 12.74f, 0.0f, false, true, -1.74f, -0.13f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.15f, -13.6f);
        pathBuilder.arcTo(69.36f, 69.36f, 0.0f, false, false, 196.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -52.93f, -49.49f, -97.91f, -68.0f, -112.88f);
        pathBuilder.curveToRelative(-4.64f, 3.73f, -11.2f, 9.33f, -18.41f, 16.44f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 92.61f, 47.44f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
