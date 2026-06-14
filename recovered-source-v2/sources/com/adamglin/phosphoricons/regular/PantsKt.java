package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pants.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pants", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPants", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pants", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PantsKt {
    private static ImageVector _pants;

    public static final ImageVector getPants(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _pants;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pants", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(223.88f, 214.0f);
        pathBuilder.lineToRelative(-22.0f, -176.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 186.0f, 24.0f);
        pathBuilder.lineTo(70.0f, 24.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 54.12f, 38.0f);
        pathBuilder.lineToRelative(-22.0f, 176.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 232.0f);
        pathBuilder.lineTo(88.69f, 232.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.51f, -12.06f);
        pathBuilder.lineToRelative(23.8f, -92.0f);
        pathBuilder.lineToRelative(23.79f, 91.94f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 167.31f, 232.0f);
        pathBuilder.lineTo(208.0f, 232.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.88f, -18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.9f, 95.2f);
        pathBuilder.arcTo(32.13f, 32.13f, 0.0f, false, true, 169.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 40.0f);
        pathBuilder.lineToRelative(2.0f, 16.0f);
        pathBuilder.lineTo(68.0f, 56.0f);
        pathBuilder.lineToRelative(2.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(66.0f, 72.0f);
        pathBuilder.lineTo(87.0f, 72.0f);
        pathBuilder.arcTo(32.13f, 32.13f, 0.0f, false, true, 63.1f, 95.2f);
        pathBuilder.close();
        pathBuilder.moveTo(88.69f, 216.0f);
        pathBuilder.lineTo(48.0f, 216.0f);
        pathBuilder.lineTo(61.0f, 111.73f);
        pathBuilder.arcTo(48.08f, 48.08f, 0.0f, false, false, 103.32f, 72.0f);
        pathBuilder.lineTo(120.0f, 72.0f);
        pathBuilder.lineTo(120.0f, 95.0f);
        pathBuilder.close();
        pathBuilder.moveTo(167.29f, 215.94f);
        pathBuilder.lineTo(136.0f, 95.0f);
        pathBuilder.lineTo(136.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(16.68f);
        pathBuilder.arcTo(48.08f, 48.08f, 0.0f, false, false, 195.0f, 111.73f);
        pathBuilder.lineTo(208.0f, 216.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pants = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
