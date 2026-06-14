package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pencilsimpleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PencilSimpleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPencilSimpleSlash", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencilSimpleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilsimpleslashKt {
    private static ImageVector _pencilSimpleSlash;

    public static final ImageVector getPencilSimpleSlash(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _pencilSimpleSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PencilSimpleSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.66f, 90.34f);
        pathBuilder.lineTo(192.0f, 120.0f);
        pathBuilder.lineTo(136.0f, 64.0f);
        pathBuilder.lineToRelative(29.66f, -29.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 0.0f);
        pathBuilder.lineTo(221.66f, 79.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 221.66f, 90.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(53.92f, 34.62f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder2.lineToRelative(48.2f, 53.0f);
        pathBuilder2.lineTo(36.68f, 152.0f);
        pathBuilder2.arcTo(15.89f, 15.89f, 0.0f, false, false, 32.0f, 163.31f);
        pathBuilder2.verticalLineTo(208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.horizontalLineTo(92.69f);
        pathBuilder2.arcTo(15.86f, 15.86f, 0.0f, false, false, 104.0f, 219.31f);
        pathBuilder2.lineToRelative(50.4f, -50.39f);
        pathBuilder2.lineToRelative(47.69f, 52.46f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(92.69f, 208.0f);
        pathBuilder2.horizontalLineTo(48.0f);
        pathBuilder2.verticalLineTo(163.31f);
        pathBuilder2.lineToRelative(53.06f, -53.0f);
        pathBuilder2.lineToRelative(42.56f, 46.81f);
        pathBuilder2.close();
        pathBuilder2.moveTo(227.32f, 73.37f);
        pathBuilder2.lineTo(182.63f, 28.69f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f);
        pathBuilder2.lineTo(118.33f, 70.36f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.31f);
        pathBuilder2.lineTo(136.0f, 75.31f);
        pathBuilder2.lineTo(180.69f, 120.0f);
        pathBuilder2.lineToRelative(-9.0f, 9.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 183.0f, 140.34f);
        pathBuilder2.lineTo(227.32f, 96.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 227.32f, 73.37f);
        pathBuilder2.close();
        pathBuilder2.moveTo(192.0f, 108.69f);
        pathBuilder2.lineTo(147.32f, 64.0f);
        pathBuilder2.lineToRelative(24.0f, -24.0f);
        pathBuilder2.lineTo(216.0f, 84.69f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencilSimpleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
