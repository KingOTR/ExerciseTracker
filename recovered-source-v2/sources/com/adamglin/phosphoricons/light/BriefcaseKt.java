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

/* compiled from: Briefcase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Briefcase", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBriefcase", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_briefcase", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BriefcaseKt {
    private static ImageVector _briefcase;

    public static final ImageVector getBriefcase(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _briefcase;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Briefcase", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(106.0f, 112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 106.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 72.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 58.0f);
        pathBuilder.horizontalLineTo(82.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, 22.0f, -22.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, 22.0f, 22.0f);
        pathBuilder.verticalLineTo(58.0f);
        pathBuilder.horizontalLineToRelative(42.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 58.0f);
        pathBuilder.horizontalLineToRelative(68.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 94.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 72.0f);
        pathBuilder.verticalLineToRelative(42.79f);
        pathBuilder.arcTo(186.0f, 186.0f, 0.0f, false, false, 128.0f, 138.0f);
        pathBuilder.arcToRelative(185.91f, 185.91f, 0.0f, false, false, 90.0f, -23.22f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 38.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 200.0f);
        pathBuilder.verticalLineTo(128.37f);
        pathBuilder.arcTo(198.12f, 198.12f, 0.0f, false, true, 128.0f, 150.0f);
        pathBuilder.arcToRelative(198.05f, 198.05f, 0.0f, false, true, -90.0f, -21.62f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 218.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _briefcase = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
