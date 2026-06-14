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

/* compiled from: Pencilcircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PencilCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPencilCircle", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencilCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilcircleKt {
    private static ImageVector _pencilCircle;

    public static final ImageVector getPencilCircle(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _pencilCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PencilCircle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 211.16f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 211.16f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, true, false, 80.0f, 211.16f);
        pathBuilder.lineTo(80.0f, 176.0f);
        pathBuilder.lineTo(128.0f, 72.0f);
        pathBuilder.lineToRelative(48.0f, 104.0f);
        pathBuilder.verticalLineToRelative(35.16f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, false, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(201.54f, 54.46f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(23.59f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -32.0f, -9.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(136.0f, 192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(14.37f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -32.0f, 9.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(107.27f, 136.0f);
        pathBuilder2.horizontalLineToRelative(41.46f);
        pathBuilder2.lineToRelative(11.58f, 25.1f);
        pathBuilder2.arcTo(31.93f, 31.93f, 0.0f, false, false, 128.0f, 170.87f);
        pathBuilder2.arcToRelative(31.93f, 31.93f, 0.0f, false, false, -32.31f, -9.77f);
        pathBuilder2.close();
        pathBuilder2.moveTo(114.66f, 120.0f);
        pathBuilder2.lineTo(128.0f, 91.09f);
        pathBuilder2.lineTo(141.34f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(190.22f, 190.23f);
        pathBuilder2.curveToRelative(-2.0f, 2.0f, -4.08f, 3.87f, -6.22f, 5.64f);
        pathBuilder2.lineTo(184.0f, 176.0f);
        pathBuilder2.arcToRelative(7.91f, 7.91f, 0.0f, false, false, -0.74f, -3.35f);
        pathBuilder2.lineToRelative(-48.0f, -104.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.52f, 0.0f);
        pathBuilder2.lineToRelative(-48.0f, 104.0f);
        pathBuilder2.arcTo(7.91f, 7.91f, 0.0f, false, false, 72.0f, 176.0f);
        pathBuilder2.verticalLineToRelative(19.87f);
        pathBuilder2.curveToRelative(-2.14f, -1.77f, -4.22f, -3.64f, -6.22f, -5.64f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, true, true, 124.44f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencilCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
