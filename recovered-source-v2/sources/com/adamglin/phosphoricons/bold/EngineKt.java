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

/* compiled from: Engine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Engine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getEngine", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_engine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EngineKt {
    private static ImageVector _engine;

    public static final ImageVector getEngine(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(236.0f, 100.0f);
        pathBuilder.lineTo(225.0f, 100.0f);
        pathBuilder.lineTo(190.83f, 65.86f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, false, 176.69f, 60.0f);
        pathBuilder.lineTo(144.0f, 60.0f);
        pathBuilder.lineTo(144.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(100.0f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(120.0f, 60.0f);
        pathBuilder.lineTo(64.0f, 60.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 80.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.lineTo(28.0f, 128.0f);
        pathBuilder.lineTo(28.0f, 108.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(28.0f, 152.0f);
        pathBuilder.lineTo(44.0f, 152.0f);
        pathBuilder.verticalLineToRelative(16.69f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, false, 5.86f, 14.14f);
        pathBuilder.lineToRelative(39.31f, 39.31f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, false, 103.31f, 228.0f);
        pathBuilder.horizontalLineToRelative(73.38f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f);
        pathBuilder.lineTo(225.0f, 188.0f);
        pathBuilder.horizontalLineToRelative(11.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(256.0f, 120.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 164.0f);
        pathBuilder.lineTo(220.0f, 164.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.51f);
        pathBuilder.lineTo(175.0f, 204.0f);
        pathBuilder.lineTo(105.0f, 204.0f);
        pathBuilder.lineTo(68.0f, 167.0f);
        pathBuilder.lineTo(68.0f, 84.0f);
        pathBuilder.lineTo(175.0f, 84.0f);
        pathBuilder.lineToRelative(36.48f, 36.49f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 220.0f, 124.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _engine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
