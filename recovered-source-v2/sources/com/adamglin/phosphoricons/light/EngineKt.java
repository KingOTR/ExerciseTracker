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

/* compiled from: Engine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Engine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getEngine", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_engine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EngineKt {
    private static ImageVector _engine;

    public static final ImageVector getEngine(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _engine;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Engine", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 106.0f);
        pathBuilder.lineTo(226.49f, 106.0f);
        pathBuilder.lineTo(190.58f, 70.1f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, -9.89f, -4.1f);
        pathBuilder.lineTo(138.0f, 66.0f);
        pathBuilder.lineTo(138.0f, 38.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(100.0f, 26.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.lineTo(126.0f, 66.0f);
        pathBuilder.lineTo(64.0f, 66.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 80.0f);
        pathBuilder.verticalLineToRelative(54.0f);
        pathBuilder.lineTo(22.0f, 134.0f);
        pathBuilder.lineTo(22.0f, 108.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(22.0f, 146.0f);
        pathBuilder.lineTo(50.0f, 146.0f);
        pathBuilder.verticalLineToRelative(22.69f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, 4.1f, 9.89f);
        pathBuilder.lineTo(93.42f, 217.9f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.89f, 4.1f);
        pathBuilder.horizontalLineToRelative(77.38f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.89f, -4.1f);
        pathBuilder.lineTo(226.49f, 182.0f);
        pathBuilder.lineTo(240.0f, 182.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(254.0f, 120.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 240.0f, 106.0f);
        pathBuilder.close();
        pathBuilder.moveTo(242.0f, 168.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(224.0f, 170.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.24f, 1.76f);
        pathBuilder.lineTo(182.1f, 209.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.58f);
        pathBuilder.lineTo(103.31f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, -0.58f);
        pathBuilder.lineTo(62.58f, 170.1f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.58f, -1.41f);
        pathBuilder.lineTo(62.0f, 80.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(180.69f, 78.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.58f);
        pathBuilder.lineToRelative(37.66f, 37.66f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 118.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _engine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
