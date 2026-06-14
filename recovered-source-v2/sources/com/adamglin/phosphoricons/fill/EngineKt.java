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

/* compiled from: Engine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Engine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getEngine", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_engine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EngineKt {
    private static ImageVector _engine;

    public static final ImageVector getEngine(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(256.0f, 120.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(227.31f);
        pathBuilder.lineTo(192.0f, 219.31f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, true, 180.69f, 224.0f);
        pathBuilder.horizontalLineTo(103.31f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, true, 92.0f, 219.31f);
        pathBuilder.lineTo(52.69f, 180.0f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, true, 48.0f, 168.69f);
        pathBuilder.verticalLineTo(148.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 64.0f);
        pathBuilder.horizontalLineToRelative(60.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.horizontalLineTo(100.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(140.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.horizontalLineToRelative(40.69f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, true, 192.0f, 68.69f);
        pathBuilder.lineTo(227.31f, 104.0f);
        pathBuilder.horizontalLineTo(240.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 256.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _engine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
