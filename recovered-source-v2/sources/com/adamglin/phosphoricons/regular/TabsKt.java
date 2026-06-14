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

/* compiled from: Tabs.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tabs", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTabs", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tabs", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TabsKt {
    private static ImageVector _tabs;

    public static final ImageVector getTabs(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(255.66f, 165.7f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.arcToRelative(0.24f, 0.24f, 0.0f, false, false, 0.0f, -0.08f);
        pathBuilder.lineTo(233.37f, 91.4f);
        pathBuilder.arcTo(15.89f, 15.89f, 0.0f, false, false, 218.05f, 80.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(10.05f);
        pathBuilder.lineToRelative(19.2f, 64.0f);
        pathBuilder.horizontalLineTo(206.0f);
        pathBuilder.lineTo(185.37f, 91.4f);
        pathBuilder.arcTo(15.89f, 15.89f, 0.0f, false, false, 170.05f, 80.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(10.05f);
        pathBuilder.lineToRelative(19.2f, 64.0f);
        pathBuilder.horizontalLineTo(158.0f);
        pathBuilder.lineTo(137.37f, 91.4f);
        pathBuilder.arcTo(15.89f, 15.89f, 0.0f, false, false, 122.05f, 80.0f);
        pathBuilder.horizontalLineTo(38.0f);
        pathBuilder.arcTo(15.89f, 15.89f, 0.0f, false, false, 22.63f, 91.4f);
        pathBuilder.lineTo(0.37f, 165.6f);
        pathBuilder.lineToRelative(0.0f, 0.05f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.05f, 0.0f, 0.08f);
        pathBuilder.arcTo(8.1f, 8.1f, 0.0f, false, false, 0.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.horizontalLineTo(248.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.66f, -10.3f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 96.0f);
        pathBuilder.horizontalLineToRelative(84.1f);
        pathBuilder.lineToRelative(19.2f, 64.0f);
        pathBuilder.horizontalLineTo(18.75f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tabs = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
