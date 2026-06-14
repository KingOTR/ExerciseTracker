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

/* compiled from: Tabs.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tabs", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTabs", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tabs", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TabsKt {
    private static ImageVector _tabs;

    public static final ImageVector getTabs(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _tabs;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tabs", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(251.81f, 166.86f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-22.29f, -74.3f);
        pathBuilder.arcTo(11.92f, 11.92f, 0.0f, false, false, 218.05f, 84.0f);
        pathBuilder.lineTo(208.0f, 84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(10.05f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.83f, 2.85f);
        pathBuilder.lineTo(242.62f, 164.0f);
        pathBuilder.lineTo(203.0f, 164.0f);
        pathBuilder.lineTo(181.54f, 92.55f);
        pathBuilder.arcTo(11.92f, 11.92f, 0.0f, false, false, 170.05f, 84.0f);
        pathBuilder.lineTo(160.0f, 84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(10.05f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.83f, 2.85f);
        pathBuilder.lineTo(194.62f, 164.0f);
        pathBuilder.lineTo(155.0f, 164.0f);
        pathBuilder.lineTo(133.54f, 92.55f);
        pathBuilder.arcTo(11.92f, 11.92f, 0.0f, false, false, 122.05f, 84.0f);
        pathBuilder.lineTo(38.0f, 84.0f);
        pathBuilder.arcToRelative(11.92f, 11.92f, 0.0f, false, false, -11.49f, 8.55f);
        pathBuilder.lineTo(4.17f, 166.85f);
        pathBuilder.curveToRelative(0.0f, 0.06f, 0.0f, 0.12f, 0.0f, 0.17f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 172.0f);
        pathBuilder.lineTo(248.0f, 172.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.arcTo(3.89f, 3.89f, 0.0f, false, false, 251.81f, 166.86f);
        pathBuilder.close();
        pathBuilder.moveTo(34.12f, 94.86f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 38.0f, 92.0f);
        pathBuilder.horizontalLineToRelative(84.1f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.83f, 2.85f);
        pathBuilder.lineTo(146.62f, 164.0f);
        pathBuilder.lineTo(13.38f, 164.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tabs = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
