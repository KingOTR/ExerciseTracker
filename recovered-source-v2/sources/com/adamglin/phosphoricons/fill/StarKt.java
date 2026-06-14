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

/* compiled from: Star.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Star", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getStar", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_star", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarKt {
    private static ImageVector _star;

    public static final ImageVector getStar(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _star;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Star", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(234.29f, 114.85f);
        pathBuilder.lineToRelative(-45.0f, 38.83f);
        pathBuilder.lineTo(203.0f, 211.75f);
        pathBuilder.arcToRelative(16.4f, 16.4f, 0.0f, false, true, -24.5f, 17.82f);
        pathBuilder.lineTo(128.0f, 198.49f);
        pathBuilder.lineTo(77.47f, 229.57f);
        pathBuilder.arcTo(16.4f, 16.4f, 0.0f, false, true, 53.0f, 211.75f);
        pathBuilder.lineToRelative(13.76f, -58.07f);
        pathBuilder.lineToRelative(-45.0f, -38.83f);
        pathBuilder.arcTo(16.46f, 16.46f, 0.0f, false, true, 31.08f, 86.0f);
        pathBuilder.lineToRelative(59.0f, -4.76f);
        pathBuilder.lineToRelative(22.76f, -55.08f);
        pathBuilder.arcToRelative(16.36f, 16.36f, 0.0f, false, true, 30.27f, 0.0f);
        pathBuilder.lineToRelative(22.75f, 55.08f);
        pathBuilder.lineToRelative(59.0f, 4.76f);
        pathBuilder.arcToRelative(16.46f, 16.46f, 0.0f, false, true, 9.37f, 28.86f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _star = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
