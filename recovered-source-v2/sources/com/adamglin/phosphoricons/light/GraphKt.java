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

/* compiled from: Graph.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Graph", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGraph", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_graph", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraphKt {
    private static ImageVector _graph;

    public static final ImageVector getGraph(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 154.0f);
        pathBuilder.arcToRelative(29.87f, 29.87f, 0.0f, false, false, -19.5f, 7.23f);
        pathBuilder.lineTo(154.88f, 141.3f);
        pathBuilder.arcTo(29.83f, 29.83f, 0.0f, false, false, 158.0f, 128.0f);
        pathBuilder.arcToRelative(30.52f, 30.52f, 0.0f, false, false, -0.22f, -3.6f);
        pathBuilder.lineTo(174.0f, 119.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -4.0f, -15.0f);
        pathBuilder.arcToRelative(30.52f, 30.52f, 0.0f, false, false, 0.22f, 3.6f);
        pathBuilder.lineTo(154.0f, 113.0f);
        pathBuilder.arcToRelative(29.91f, 29.91f, 0.0f, false, false, -32.42f, -14.31f);
        pathBuilder.lineToRelative(-8.14f, -18.3f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, -11.0f, 4.88f);
        pathBuilder.lineToRelative(8.14f, 18.3f);
        pathBuilder.arcTo(29.92f, 29.92f, 0.0f, false, false, 102.06f, 143.0f);
        pathBuilder.lineTo(74.0f, 168.0f);
        pathBuilder.arcToRelative(30.08f, 30.08f, 0.0f, true, false, 8.0f, 9.0f);
        pathBuilder.lineTo(110.0f, 152.0f);
        pathBuilder.arcToRelative(29.91f, 29.91f, 0.0f, false, false, 37.47f, -1.23f);
        pathBuilder.lineToRelative(25.62f, 19.93f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, true, false, 200.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 86.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(78.0f, 56.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, true, true, 96.0f, 74.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 78.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 210.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 56.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 146.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 202.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 200.0f, 202.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _graph = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
