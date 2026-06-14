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

/* compiled from: Pencilruler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PencilRuler", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPencilRuler", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencilRuler", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilrulerKt {
    private static ImageVector _pencilRuler;

    public static final ImageVector getPencilRuler(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _pencilRuler;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PencilRuler", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.lineTo(224.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(160.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(144.0f, 180.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, false, -8.25f, -7.47f);
        pathBuilder.lineTo(148.0f, 160.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(144.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, false, -8.25f, -7.47f);
        pathBuilder.lineTo(148.0f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(144.0f, 100.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, false, 183.73f, 80.0f);
        pathBuilder.lineTo(148.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(144.0f, 48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(109.66f, 58.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 64.0f);
        pathBuilder.lineTo(112.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(48.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(32.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.34f, -5.66f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 80.0f);
        pathBuilder.lineTo(48.0f, 184.0f);
        pathBuilder.lineTo(64.0f, 184.0f);
        pathBuilder.lineTo(64.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 80.0f);
        pathBuilder.lineTo(80.0f, 184.0f);
        pathBuilder.lineTo(96.0f, 184.0f);
        pathBuilder.lineTo(96.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(51.31f, 64.0f);
        pathBuilder.lineTo(92.69f, 64.0f);
        pathBuilder.lineTo(72.0f, 43.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencilRuler = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
