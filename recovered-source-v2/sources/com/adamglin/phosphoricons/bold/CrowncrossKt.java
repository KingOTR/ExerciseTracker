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

/* compiled from: Crowncross.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CrownCross", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCrownCross", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crownCross", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrowncrossKt {
    private static ImageVector _crownCross;

    public static final ImageVector getCrownCross(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _crownCross;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CrownCross", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(180.0f, 56.0f);
        pathBuilder.curveToRelative(-15.4f, 0.0f, -29.19f, 4.61f, -40.0f, 12.5f);
        pathBuilder.lineTo(140.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(140.0f, 20.0f);
        pathBuilder.lineTo(140.0f, 12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.lineTo(104.0f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineTo(116.0f, 68.5f);
        pathBuilder.curveTo(105.19f, 60.61f, 91.4f, 56.0f, 76.0f, 56.0f);
        pathBuilder.arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, 64.0f);
        pathBuilder.curveToRelative(0.0f, 31.66f, 15.53f, 50.6f, 28.55f, 60.91f);
        pathBuilder.arcTo(85.75f, 85.75f, 0.0f, false, false, 60.0f, 192.45f);
        pathBuilder.lineTo(60.0f, 208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(196.0f, 192.45f);
        pathBuilder.arcToRelative(85.75f, 85.75f, 0.0f, false, false, 19.45f, -11.54f);
        pathBuilder.curveTo(228.47f, 170.6f, 244.0f, 151.66f, 244.0f, 120.0f);
        pathBuilder.arcTo(64.07f, 64.07f, 0.0f, false, false, 180.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(181.09f, 172.36f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 184.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.lineTo(84.0f, 204.0f);
        pathBuilder.lineTo(84.0f, 184.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.09f, -11.64f);
        pathBuilder.arcToRelative(59.4f, 59.4f, 0.0f, false, true, -19.46f, -10.27f);
        pathBuilder.curveTo(42.54f, 151.87f, 36.0f, 137.71f, 36.0f, 120.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 76.0f, 80.0f);
        pathBuilder.curveToRelative(23.18f, 0.0f, 40.0f, 15.14f, 40.0f, 36.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 116.0f);
        pathBuilder.curveToRelative(0.0f, -20.86f, 16.82f, -36.0f, 40.0f, -36.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder.curveTo(220.0f, 161.68f, 182.62f, 172.0f, 181.09f, 172.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crownCross = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
