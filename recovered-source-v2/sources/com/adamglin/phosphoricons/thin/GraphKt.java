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

/* compiled from: Graph.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Graph", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGraph", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_graph", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraphKt {
    private static ImageVector _graph;

    public static final ImageVector getGraph(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _graph;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Graph", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 156.0f);
        pathBuilder.arcToRelative(27.87f, 27.87f, 0.0f, false, false, -19.4f, 7.84f);
        pathBuilder.lineToRelative(-28.28f, -22.0f);
        pathBuilder.arcTo(27.78f, 27.78f, 0.0f, false, false, 156.0f, 128.0f);
        pathBuilder.arcToRelative(28.09f, 28.09f, 0.0f, false, false, -0.45f, -5.0f);
        pathBuilder.lineTo(175.0f, 116.55f);
        pathBuilder.arcToRelative(28.07f, 28.07f, 0.0f, true, false, -2.53f, -7.58f);
        pathBuilder.lineTo(153.0f, 115.45f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 100.0f);
        pathBuilder.arcToRelative(27.68f, 27.68f, 0.0f, false, false, -7.6f, 1.06f);
        pathBuilder.lineToRelative(-9.5f, -21.37f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 96.0f, 84.0f);
        pathBuilder.arcToRelative(27.68f, 27.68f, 0.0f, false, false, 7.6f, -1.06f);
        pathBuilder.lineToRelative(9.5f, 21.37f);
        pathBuilder.arcToRelative(27.95f, 27.95f, 0.0f, false, false, -8.46f, 39.1f);
        pathBuilder.lineTo(74.0f, 170.61f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 5.32f, 6.0f);
        pathBuilder.lineToRelative(30.6f, -27.2f);
        pathBuilder.arcToRelative(27.92f, 27.92f, 0.0f, false, false, 37.44f, -1.23f);
        pathBuilder.lineToRelative(28.28f, 22.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 200.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 84.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 200.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, true, true, 96.0f, 76.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 76.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 212.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 56.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 204.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 200.0f, 204.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _graph = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
