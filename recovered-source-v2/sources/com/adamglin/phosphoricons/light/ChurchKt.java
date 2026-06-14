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

/* compiled from: Church.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Church", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getChurch", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_church", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChurchKt {
    private static ImageVector _church;

    public static final ImageVector getChurch(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _church;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Church", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.09f, 146.86f);
        pathBuilder.lineTo(190.0f, 124.6f);
        pathBuilder.lineTo(190.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.0f, -5.21f);
        pathBuilder.lineTo(134.0f, 68.52f);
        pathBuilder.lineTo(134.0f, 46.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(134.0f, 34.0f);
        pathBuilder.lineTo(134.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 34.0f);
        pathBuilder.lineTo(104.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(122.0f, 68.52f);
        pathBuilder.lineTo(69.0f, 98.79f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 66.0f, 104.0f);
        pathBuilder.verticalLineToRelative(20.6f);
        pathBuilder.lineTo(28.91f, 146.86f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 152.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(118.0f, 168.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(230.0f, 152.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 227.09f, 146.86f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 155.4f);
        pathBuilder.lineToRelative(28.0f, -16.8f);
        pathBuilder.lineTo(66.0f, 210.0f);
        pathBuilder.lineTo(38.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 146.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f);
        pathBuilder.verticalLineToRelative(42.0f);
        pathBuilder.lineTo(78.0f, 210.0f);
        pathBuilder.lineTo(78.0f, 107.48f);
        pathBuilder.lineToRelative(50.0f, -28.57f);
        pathBuilder.lineToRelative(50.0f, 28.57f);
        pathBuilder.lineTo(178.0f, 210.0f);
        pathBuilder.lineTo(150.0f, 210.0f);
        pathBuilder.lineTo(150.0f, 168.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 128.0f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 210.0f);
        pathBuilder.lineTo(190.0f, 210.0f);
        pathBuilder.lineTo(190.0f, 138.6f);
        pathBuilder.lineToRelative(28.0f, 16.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _church = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
