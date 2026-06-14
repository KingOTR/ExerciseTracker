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

/* compiled from: Syringe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Syringe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSyringe", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_syringe", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SyringeKt {
    private static ImageVector _syringe;

    public static final ImageVector getSyringe(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _syringe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Syringe", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.24f, 67.76f);
        pathBuilder.lineToRelative(-48.0f, -48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f);
        pathBuilder.lineTo(199.51f, 48.0f);
        pathBuilder.lineTo(168.0f, 79.51f);
        pathBuilder.lineTo(132.24f, 43.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.48f);
        pathBuilder.lineTo(131.51f, 60.0f);
        pathBuilder.lineTo(46.1f, 145.41f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, 9.9f);
        pathBuilder.verticalLineToRelative(50.2f);
        pathBuilder.lineTo(19.76f, 227.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineTo(50.49f, 214.0f);
        pathBuilder.horizontalLineToRelative(50.2f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f);
        pathBuilder.lineTo(196.0f, 124.49f);
        pathBuilder.lineToRelative(7.76f, 7.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.lineTo(176.49f, 88.0f);
        pathBuilder.lineTo(208.0f, 56.49f);
        pathBuilder.lineToRelative(19.76f, 19.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(102.1f, 201.41f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.59f);
        pathBuilder.horizontalLineTo(54.0f);
        pathBuilder.verticalLineTo(155.31f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, -1.41f);
        pathBuilder.lineTo(74.0f, 134.49f);
        pathBuilder.lineToRelative(21.76f, 21.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, -8.48f);
        pathBuilder.lineTo(82.49f, 126.0f);
        pathBuilder.lineTo(98.0f, 110.49f);
        pathBuilder.lineToRelative(21.76f, 21.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.lineTo(106.49f, 102.0f);
        pathBuilder.lineTo(140.0f, 68.49f);
        pathBuilder.lineTo(187.51f, 116.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _syringe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
