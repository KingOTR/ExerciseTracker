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

/* compiled from: Asclepius.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Asclepius", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAsclepius", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_asclepius", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsclepiusKt {
    private static ImageVector _asclepius;

    public static final ImageVector getAsclepius(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _asclepius;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Asclepius", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(91.82f, 60.0f);
        pathBuilder.lineTo(92.0f, 60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(60.0f, 36.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, false, 16.0f, 80.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(48.0f, 100.0f);
        pathBuilder.arcTo(44.06f, 44.06f, 0.0f, false, false, 91.82f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 76.0f);
        pathBuilder.lineTo(40.4f, 76.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 60.0f, 60.0f);
        pathBuilder.horizontalLineToRelative(7.6f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 79.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f);
        pathBuilder.lineTo(140.0f, 124.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.arcToRelative(11.87f, 11.87f, 0.0f, false, false, -4.0f, -8.95f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 16.0f, -17.88f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 148.0f, 220.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 220.0f);
        pathBuilder.lineTo(92.0f, 220.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.lineTo(116.0f, 124.0f);
        pathBuilder.lineTo(100.0f, 124.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.0f, 23.32f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 88.0f, 170.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 100.0f, 100.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(116.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(200.0f, 79.0f);
        pathBuilder.arcToRelative(19.05f, 19.05f, 0.0f, false, false, -19.0f, -19.0f);
        pathBuilder.lineTo(164.0f, 60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(17.0f);
        pathBuilder.arcToRelative(43.05f, 43.05f, 0.0f, false, true, 43.0f, 43.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _asclepius = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
