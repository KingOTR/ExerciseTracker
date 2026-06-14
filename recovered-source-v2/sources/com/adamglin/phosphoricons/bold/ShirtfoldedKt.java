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

/* compiled from: Shirtfolded.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShirtFolded", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getShirtFolded", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shirtFolded", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShirtfoldedKt {
    private static ImageVector _shirtFolded;

    public static final ImageVector getShirtFolded(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _shirtFolded;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShirtFolded", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 36.0f);
        pathBuilder.horizontalLineTo(177.0f);
        pathBuilder.lineTo(164.49f, 23.51f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 20.0f);
        pathBuilder.horizontalLineTo(100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.51f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(79.0f, 36.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 56.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 53.0f);
        pathBuilder.lineToRelative(7.33f, -7.33f);
        pathBuilder.lineTo(118.82f, 72.2f);
        pathBuilder.lineTo(96.0f, 94.48f);
        pathBuilder.close();
        pathBuilder.moveTo(137.18f, 72.2f);
        pathBuilder.lineToRelative(15.49f, -26.56f);
        pathBuilder.lineTo(160.0f, 53.0f);
        pathBuilder.verticalLineTo(94.48f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 60.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.08f, 14.21f);
        pathBuilder.lineTo(116.0f, 108.5f);
        pathBuilder.verticalLineTo(204.0f);
        pathBuilder.horizontalLineTo(60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 204.0f);
        pathBuilder.horizontalLineTo(140.0f);
        pathBuilder.verticalLineTo(108.5f);
        pathBuilder.lineToRelative(9.92f, 9.69f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 184.0f, 104.0f);
        pathBuilder.verticalLineTo(60.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shirtFolded = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
