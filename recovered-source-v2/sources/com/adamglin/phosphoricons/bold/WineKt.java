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

/* compiled from: Wine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWine", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WineKt {
    private static ImageVector _wine;

    public static final ImageVector getWine(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _wine;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wine", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(209.17f, 102.54f);
        pathBuilder.lineTo(187.39f, 28.61f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 175.89f, 20.0f);
        pathBuilder.horizontalLineTo(80.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.5f, 8.61f);
        pathBuilder.lineTo(46.83f, 102.54f);
        pathBuilder.arcToRelative(67.45f, 67.45f, 0.0f, false, false, 18.53f, 68.72f);
        pathBuilder.arcTo(91.32f, 91.32f, 0.0f, false, false, 116.0f, 195.2f);
        pathBuilder.verticalLineTo(228.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(140.0f);
        pathBuilder.verticalLineTo(195.2f);
        pathBuilder.arcToRelative(91.32f, 91.32f, 0.0f, false, false, 50.65f, -23.94f);
        pathBuilder.arcTo(67.45f, 67.45f, 0.0f, false, false, 209.17f, 102.54f);
        pathBuilder.close();
        pathBuilder.moveTo(89.08f, 44.0f);
        pathBuilder.horizontalLineToRelative(77.84f);
        pathBuilder.lineToRelative(18.38f, 62.41f);
        pathBuilder.curveToRelative(-10.88f, 2.8f, -28.05f, 3.0f, -51.88f, -9.12f);
        pathBuilder.curveTo(110.68f, 85.78f, 91.92f, 83.0f, 77.24f, 84.22f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 172.0f);
        pathBuilder.arcToRelative(67.5f, 67.5f, 0.0f, false, true, -46.26f, -18.27f);
        pathBuilder.arcToRelative(43.55f, 43.55f, 0.0f, false, true, -12.0f, -43.89f);
        pathBuilder.curveToRelative(18.44f, -5.33f, 38.64f, 1.66f, 52.87f, 8.87f);
        pathBuilder.curveToRelative(11.55f, 5.85f, 30.18f, 13.28f, 50.26f, 13.28f);
        pathBuilder.arcToRelative(74.15f, 74.15f, 0.0f, false, false, 14.29f, -1.35f);
        pathBuilder.arcToRelative(43.2f, 43.2f, 0.0f, false, true, -12.87f, 23.09f);
        pathBuilder.arcTo(67.5f, 67.5f, 0.0f, false, true, 128.0f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
