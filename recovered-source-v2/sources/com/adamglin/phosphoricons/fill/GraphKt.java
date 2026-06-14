package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Graph.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Graph", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGraph", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_graph", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraphKt {
    private static ImageVector _graph;

    public static final ImageVector getGraph(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 152.0f);
        pathBuilder.arcToRelative(31.84f, 31.84f, 0.0f, false, false, -19.53f, 6.68f);
        pathBuilder.lineToRelative(-23.11f, -18.0f);
        pathBuilder.arcTo(31.65f, 31.65f, 0.0f, false, false, 160.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -0.74f, 0.0f, -1.48f, -0.08f, -2.21f);
        pathBuilder.lineToRelative(13.23f, -4.41f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, false, 168.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 0.74f, 0.0f, 1.48f, 0.08f, 2.21f);
        pathBuilder.lineToRelative(-13.23f, 4.41f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 96.0f);
        pathBuilder.arcToRelative(32.59f, 32.59f, 0.0f, false, false, -5.27f, 0.44f);
        pathBuilder.lineTo(115.89f, 81.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, false, 96.0f, 88.0f);
        pathBuilder.arcToRelative(32.59f, 32.59f, 0.0f, false, false, 5.27f, -0.44f);
        pathBuilder.lineToRelative(6.84f, 15.4f);
        pathBuilder.arcToRelative(31.92f, 31.92f, 0.0f, false, false, -8.57f, 39.64f);
        pathBuilder.lineTo(73.83f, 165.44f);
        pathBuilder.arcToRelative(32.06f, 32.06f, 0.0f, true, false, 10.63f, 12.0f);
        pathBuilder.lineToRelative(25.71f, -22.84f);
        pathBuilder.arcToRelative(31.91f, 31.91f, 0.0f, false, false, 37.36f, -1.24f);
        pathBuilder.lineToRelative(23.11f, 18.0f);
        pathBuilder.arcTo(31.65f, 31.65f, 0.0f, false, false, 168.0f, 184.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, -32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 88.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, true, 96.0f, 72.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _graph = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
