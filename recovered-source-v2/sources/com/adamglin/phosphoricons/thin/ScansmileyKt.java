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

/* compiled from: Scansmiley.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ScanSmiley", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getScanSmiley", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scanSmiley", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScansmileyKt {
    private static ImageVector _scanSmiley;

    public static final ImageVector getScanSmiley(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _scanSmiley;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ScanSmiley", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.0f, 40.0f);
        pathBuilder.lineTo(220.0f, 76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(212.0f, 44.0f);
        pathBuilder.lineTo(180.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 176.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.lineTo(180.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(220.0f, 180.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 212.0f);
        pathBuilder.lineTo(44.0f, 212.0f);
        pathBuilder.lineTo(44.0f, 180.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(76.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(44.0f, 44.0f);
        pathBuilder.lineTo(76.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(40.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.lineTo(36.0f, 76.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 196.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, -68.0f);
        pathBuilder.arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 128.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, false, -60.0f, 60.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 188.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 116.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(149.35f, 149.0f);
        pathBuilder.curveToRelative(-4.52f, 4.0f, -13.7f, 7.0f, -21.35f, 7.0f);
        pathBuilder.reflectiveCurveToRelative(-16.83f, -3.0f, -21.35f, -7.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.3f, 6.0f);
        pathBuilder.curveToRelative(6.0f, 5.3f, 17.0f, 9.0f, 26.65f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(20.64f, -3.7f, 26.65f, -9.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.3f, -6.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scanSmiley = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
