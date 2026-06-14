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

/* compiled from: Perspective.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Perspective", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPerspective", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_perspective", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PerspectiveKt {
    private static ImageVector _perspective;

    public static final ImageVector getPerspective(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _perspective;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Perspective", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 124.0f);
        pathBuilder.horizontalLineTo(220.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.15f, -11.81f);
        pathBuilder.lineToRelative(-160.0f, 29.1f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 77.09f);
        pathBuilder.verticalLineTo(124.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineTo(36.0f);
        pathBuilder.verticalLineToRelative(46.91f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.85f, 11.8f);
        pathBuilder.lineToRelative(160.0f, 29.09f);
        pathBuilder.arcToRelative(11.28f, 11.28f, 0.0f, false, false, 2.16f, 0.2f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.verticalLineTo(132.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 77.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.28f, -3.93f);
        pathBuilder.lineToRelative(160.0f, -29.09f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 48.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.horizontalLineTo(44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.72f, 3.93f);
        pathBuilder.lineToRelative(-160.0f, -29.09f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 178.91f);
        pathBuilder.verticalLineTo(132.0f);
        pathBuilder.horizontalLineTo(212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _perspective = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
