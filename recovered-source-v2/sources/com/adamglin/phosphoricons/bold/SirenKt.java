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

/* compiled from: Siren.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Siren", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSiren", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_siren", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SirenKt {
    private static ImageVector _siren;

    public static final ImageVector getSiren(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _siren;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Siren", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(116.0f, 20.0f);
        pathBuilder.lineTo(116.0f, 12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(47.51f, 52.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.lineToRelative(-8.0f, -8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 176.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(40.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(20.0f, 176.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 16.0f, -19.6f);
        pathBuilder.lineTo(36.0f, 140.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 92.0f, -92.0f);
        pathBuilder.horizontalLineToRelative(0.71f);
        pathBuilder.curveTo(179.0f, 48.38f, 220.0f, 90.1f, 220.0f, 141.0f);
        pathBuilder.verticalLineToRelative(15.4f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 140.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(196.0f, 156.0f);
        pathBuilder.lineTo(196.0f, 141.0f);
        pathBuilder.curveToRelative(0.0f, -37.77f, -30.27f, -68.72f, -67.48f, -69.0f);
        pathBuilder.lineTo(128.0f, 72.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -68.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 180.0f);
        pathBuilder.lineTo(44.0f, 180.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(212.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.4f, 113.28f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 18.32f, 18.32f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.9f, -7.2f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, -34.0f, -34.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.2f, 22.9f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _siren = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
