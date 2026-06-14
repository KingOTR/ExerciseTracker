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

/* compiled from: Warningoctagon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WarningOctagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getWarningOctagon", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_warningOctagon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WarningoctagonKt {
    private static ImageVector _warningOctagon;

    public static final ImageVector getWarningOctagon(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _warningOctagon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WarningOctagon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 91.55f);
        pathBuilder.verticalLineToRelative(72.9f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.34f, 5.66f);
        pathBuilder.lineToRelative(-51.55f, 51.55f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, 2.34f);
        pathBuilder.horizontalLineTo(91.55f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -2.34f);
        pathBuilder.lineTo(34.34f, 170.11f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 32.0f, 164.45f);
        pathBuilder.verticalLineTo(91.55f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.34f, -5.66f);
        pathBuilder.lineTo(85.89f, 34.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 91.55f, 32.0f);
        pathBuilder.horizontalLineToRelative(72.9f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f);
        pathBuilder.lineToRelative(51.55f, 51.55f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 91.55f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(120.0f, 136.0f);
        pathBuilder2.lineTo(120.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 91.55f);
        pathBuilder2.verticalLineToRelative(72.9f);
        pathBuilder2.arcToRelative(15.86f, 15.86f, 0.0f, false, true, -4.69f, 11.31f);
        pathBuilder2.lineToRelative(-51.55f, 51.55f);
        pathBuilder2.arcTo(15.86f, 15.86f, 0.0f, false, true, 164.45f, 232.0f);
        pathBuilder2.lineTo(91.55f, 232.0f);
        pathBuilder2.arcToRelative(15.86f, 15.86f, 0.0f, false, true, -11.31f, -4.69f);
        pathBuilder2.lineTo(28.69f, 175.76f);
        pathBuilder2.arcTo(15.86f, 15.86f, 0.0f, false, true, 24.0f, 164.45f);
        pathBuilder2.lineTo(24.0f, 91.55f);
        pathBuilder2.arcToRelative(15.86f, 15.86f, 0.0f, false, true, 4.69f, -11.31f);
        pathBuilder2.lineTo(80.24f, 28.69f);
        pathBuilder2.arcTo(15.86f, 15.86f, 0.0f, false, true, 91.55f, 24.0f);
        pathBuilder2.horizontalLineToRelative(72.9f);
        pathBuilder2.arcToRelative(15.86f, 15.86f, 0.0f, false, true, 11.31f, 4.69f);
        pathBuilder2.lineToRelative(51.55f, 51.55f);
        pathBuilder2.arcTo(15.86f, 15.86f, 0.0f, false, true, 232.0f, 91.55f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 91.55f);
        pathBuilder2.lineTo(164.45f, 40.0f);
        pathBuilder2.lineTo(91.55f, 40.0f);
        pathBuilder2.lineTo(40.0f, 91.55f);
        pathBuilder2.verticalLineToRelative(72.9f);
        pathBuilder2.lineTo(91.55f, 216.0f);
        pathBuilder2.horizontalLineToRelative(72.9f);
        pathBuilder2.lineTo(216.0f, 164.45f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 160.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 160.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _warningOctagon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
