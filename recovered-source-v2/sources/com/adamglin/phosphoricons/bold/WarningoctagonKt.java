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

/* compiled from: Warningoctagon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WarningOctagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWarningOctagon", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_warningOctagon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WarningoctagonKt {
    private static ImageVector _warningOctagon;

    public static final ImageVector getWarningOctagon(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(116.0f, 132.0f);
        pathBuilder.lineTo(116.0f, 80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 91.55f);
        pathBuilder.verticalLineToRelative(72.9f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, true, -5.86f, 14.14f);
        pathBuilder.lineToRelative(-51.55f, 51.55f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, true, 164.45f, 236.0f);
        pathBuilder.lineTo(91.55f, 236.0f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, true, -14.14f, -5.86f);
        pathBuilder.lineTo(25.86f, 178.59f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, true, 20.0f, 164.45f);
        pathBuilder.lineTo(20.0f, 91.55f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, true, 5.86f, -14.14f);
        pathBuilder.lineTo(77.41f, 25.86f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, true, 91.55f, 20.0f);
        pathBuilder.horizontalLineToRelative(72.9f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, true, 14.14f, 5.86f);
        pathBuilder.lineToRelative(51.55f, 51.55f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, true, 236.0f, 91.55f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 93.21f);
        pathBuilder.lineTo(162.79f, 44.0f);
        pathBuilder.lineTo(93.21f, 44.0f);
        pathBuilder.lineTo(44.0f, 93.21f);
        pathBuilder.verticalLineToRelative(69.58f);
        pathBuilder.lineTo(93.21f, 212.0f);
        pathBuilder.horizontalLineToRelative(69.58f);
        pathBuilder.lineTo(212.0f, 162.79f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 156.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _warningOctagon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
