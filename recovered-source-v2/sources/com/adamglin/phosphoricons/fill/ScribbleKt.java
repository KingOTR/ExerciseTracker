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

/* compiled from: Scribble.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scribble", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getScribble", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scribble", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScribbleKt {
    private static ImageVector _scribble;

    public static final ImageVector getScribble(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _scribble;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scribble", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 32.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(193.66f, 169.66f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 12.68f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.arcToRelative(25.0f, 25.0f, 0.0f, false, true, 0.0f, -35.32f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -12.68f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, -12.68f, 0.0f);
        pathBuilder.lineToRelative(-48.0f, 48.0f);
        pathBuilder.arcToRelative(25.0f, 25.0f, 0.0f, false, true, -35.32f, -35.32f);
        pathBuilder.lineToRelative(72.0f, -72.0f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -12.68f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, -12.68f, 0.0f);
        pathBuilder.lineToRelative(-48.0f, 48.0f);
        pathBuilder.arcTo(25.0f, 25.0f, 0.0f, false, true, 62.34f, 86.34f);
        pathBuilder.lineToRelative(28.0f, -28.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.lineToRelative(-28.0f, 28.0f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 12.68f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, 12.68f, 0.0f);
        pathBuilder.lineToRelative(48.0f, -48.0f);
        pathBuilder.arcToRelative(25.0f, 25.0f, 0.0f, false, true, 35.32f, 35.32f);
        pathBuilder.lineToRelative(-72.0f, 72.0f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 12.68f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, 12.68f, 0.0f);
        pathBuilder.lineToRelative(48.0f, -48.0f);
        pathBuilder.arcToRelative(25.0f, 25.0f, 0.0f, false, true, 35.32f, 35.32f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scribble = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
