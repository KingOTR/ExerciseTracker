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

/* compiled from: Hockey.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hockey", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHockey", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hockey", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HockeyKt {
    private static ImageVector _hockey;

    public static final ImageVector getHockey(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _hockey;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hockey", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 154.0f);
        pathBuilder.lineTo(130.0f, 154.0f);
        pathBuilder.lineTo(36.57f, 44.12f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.14f, 7.77f);
        pathBuilder.lineTo(161.0f, 209.07f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 171.7f, 214.0f);
        pathBuilder.lineTo(224.0f, 214.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(238.0f, 168.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.18f, 201.3f);
        pathBuilder.lineTo(140.18f, 166.0f);
        pathBuilder.lineTo(194.0f, 166.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.lineTo(171.7f, 202.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 170.18f, 201.3f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(206.0f, 202.0f);
        pathBuilder.lineTo(206.0f, 166.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(110.89f, 181.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.46f, 0.68f);
        pathBuilder.lineTo(85.82f, 201.3f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.52f, 0.7f);
        pathBuilder.lineTo(62.0f, 202.0f);
        pathBuilder.lineTo(62.0f, 166.0f);
        pathBuilder.lineTo(85.2f, 166.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(32.0f, 154.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(84.3f, 214.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 95.0f, 209.07f);
        pathBuilder.lineToRelative(16.6f, -19.54f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 110.89f, 181.08f);
        pathBuilder.close();
        pathBuilder.moveTo(30.0f, 200.0f);
        pathBuilder.lineTo(30.0f, 168.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(50.0f, 166.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.lineTo(32.0f, 202.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(151.43f, 124.12f);
        pathBuilder.lineTo(219.43f, 44.12f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 9.14f, 7.77f);
        pathBuilder.lineToRelative(-68.0f, 80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.14f, -7.77f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hockey = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
