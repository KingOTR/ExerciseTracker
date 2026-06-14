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

/* compiled from: Arrowssplit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ArrowsSplit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getArrowsSplit", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowsSplit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrowssplitKt {
    private static ImageVector _arrowsSplit;

    public static final ImageVector getArrowsSplit(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _arrowsSplit;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ArrowsSplit", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.24f, 188.24f);
        pathBuilder.lineToRelative(-32.0f, 32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f);
        pathBuilder.lineToRelative(-32.0f, -32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineTo(186.0f, 201.51f);
        pathBuilder.verticalLineToRelative(-63.0f);
        pathBuilder.lineToRelative(-58.0f, -58.0f);
        pathBuilder.lineToRelative(-58.0f, 58.0f);
        pathBuilder.verticalLineToRelative(63.0f);
        pathBuilder.lineToRelative(21.76f, -21.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.lineToRelative(-32.0f, 32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f);
        pathBuilder.lineToRelative(-32.0f, -32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineTo(58.0f, 201.51f);
        pathBuilder.verticalLineTo(136.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.76f, -4.24f);
        pathBuilder.lineTo(122.0f, 69.51f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(69.51f);
        pathBuilder.lineToRelative(62.24f, 62.25f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 136.0f);
        pathBuilder.verticalLineToRelative(65.51f);
        pathBuilder.lineToRelative(21.76f, -21.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _arrowsSplit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
