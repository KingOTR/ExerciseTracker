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

/* compiled from: Anchor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Anchor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAnchor", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_anchor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnchorKt {
    private static ImageVector _anchor;

    public static final ImageVector getAnchor(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _anchor;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Anchor", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 132.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 21.86f, -11.41f, 25.95f, -35.16f, 32.42f);
        pathBuilder.curveToRelative(-9.12f, 2.49f, -19.61f, 5.36f, -28.84f, 10.69f);
        pathBuilder.verticalLineTo(132.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(140.0f);
        pathBuilder.verticalLineTo(89.94f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -24.0f, 0.0f);
        pathBuilder.verticalLineTo(108.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.verticalLineToRelative(55.11f);
        pathBuilder.curveToRelative(-9.23f, -5.33f, -19.72f, -8.2f, -28.84f, -10.69f);
        pathBuilder.curveTo(63.41f, 170.0f, 52.0f, 165.86f, 52.0f, 144.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 41.17f, 30.54f, 49.5f, 52.84f, 55.58f);
        pathBuilder.curveTo(104.59f, 206.05f, 116.0f, 210.14f, 116.0f, 232.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -21.86f, 11.41f, -25.95f, 35.16f, -32.42f);
        pathBuilder.curveTo(197.46f, 193.5f, 228.0f, 185.17f, 228.0f, 144.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 44.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _anchor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
