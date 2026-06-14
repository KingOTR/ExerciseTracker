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

/* compiled from: Nuclearplant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NuclearPlant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getNuclearPlant", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_nuclearPlant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NuclearplantKt {
    private static ImageVector _nuclearPlant;

    public static final ImageVector getNuclearPlant(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _nuclearPlant;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NuclearPlant", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, false, 96.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(32.74f);
        pathBuilder.curveToRelative(13.77f, -27.83f, 29.48f, -68.69f, 31.12f, -112.66f);
        pathBuilder.arcTo(15.91f, 15.91f, 0.0f, false, true, 79.85f, 80.0f);
        pathBuilder.horizontalLineToRelative(88.33f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 15.28f);
        pathBuilder.curveToRelative(2.1f, 47.84f, 23.84f, 92.37f, 35.29f, 112.72f);
        pathBuilder.horizontalLineTo(240.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.18f, 96.0f);
        pathBuilder.horizontalLineToRelative(-16.0f);
        pathBuilder.curveToRelative(1.77f, 43.72f, 17.39f, 84.32f, 31.09f, 112.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.curveTo(188.68f, 184.08f, 170.18f, 141.64f, 168.18f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _nuclearPlant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
