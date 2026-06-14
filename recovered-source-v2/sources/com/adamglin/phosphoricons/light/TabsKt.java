package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tabs.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tabs", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTabs", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tabs", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TabsKt {
    private static ImageVector _tabs;

    public static final ImageVector getTabs(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(253.75f, 166.28f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(231.46f, 92.0f);
        pathBuilder.arcToRelative(13.91f, 13.91f, 0.0f, false, false, -13.41f, -10.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(10.05f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 220.0f, 95.42f);
        pathBuilder.lineToRelative(20.0f, 66.58f);
        pathBuilder.horizontalLineTo(204.46f);
        pathBuilder.lineToRelative(-21.0f, -70.0f);
        pathBuilder.arcToRelative(13.91f, 13.91f, 0.0f, false, false, -13.41f, -10.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(10.05f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 172.0f, 95.42f);
        pathBuilder.lineToRelative(20.0f, 66.58f);
        pathBuilder.horizontalLineTo(156.46f);
        pathBuilder.lineToRelative(-21.0f, -70.0f);
        pathBuilder.arcToRelative(13.91f, 13.91f, 0.0f, false, false, -13.41f, -10.0f);
        pathBuilder.horizontalLineTo(38.0f);
        pathBuilder.arcTo(13.91f, 13.91f, 0.0f, false, false, 24.54f, 92.0f);
        pathBuilder.lineTo(2.28f, 166.2f);
        pathBuilder.lineToRelative(0.0f, 0.05f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.0f, 0.15f);
        pathBuilder.arcToRelative(2.79f, 2.79f, 0.0f, false, false, -0.1f, 0.39f);
        pathBuilder.arcToRelative(0.11f, 0.11f, 0.0f, false, false, 0.0f, 0.05f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 174.0f);
        pathBuilder.horizontalLineTo(248.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.75f, -7.72f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 95.42f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 94.0f);
        pathBuilder.horizontalLineToRelative(84.1f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 124.0f, 95.43f);
        pathBuilder.lineToRelative(20.0f, 66.57f);
        pathBuilder.horizontalLineTo(16.06f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tabs = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
