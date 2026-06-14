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

/* compiled from: Lightbulbfilament.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LightbulbFilament", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getLightbulbFilament", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightbulbFilament", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightbulbfilamentKt {
    private static ImageVector _lightbulbFilament;

    public static final ImageVector getLightbulbFilament(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _lightbulbFilament;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LightbulbFilament", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 104.0f);
        pathBuilder.arcToRelative(79.86f, 79.86f, 0.0f, false, true, -30.59f, 62.92f);
        pathBuilder.arcTo(24.29f, 24.29f, 0.0f, false, false, 168.0f, 186.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.arcToRelative(24.11f, 24.11f, 0.0f, false, false, -9.3f, -19.0f);
        pathBuilder.arcTo(79.87f, 79.87f, 0.0f, false, true, 48.0f, 104.45f);
        pathBuilder.curveTo(47.76f, 61.09f, 82.72f, 25.0f, 126.07f, 24.0f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(176.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(88.0f, 240.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(80.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 232.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 104.0f);
        pathBuilder2.arcToRelative(87.55f, 87.55f, 0.0f, false, true, -33.64f, 69.21f);
        pathBuilder2.arcTo(16.24f, 16.24f, 0.0f, false, false, 176.0f, 186.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder2.lineTo(96.0f, 208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.23f, -12.66f);
        pathBuilder2.arcTo(87.59f, 87.59f, 0.0f, false, true, 40.0f, 104.5f);
        pathBuilder2.curveTo(39.74f, 56.83f, 78.26f, 17.15f, 125.88f, 16.0f);
        pathBuilder2.arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 104.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, false, false, -73.74f, -72.0f);
        pathBuilder2.curveToRelative(-39.0f, 0.92f, -70.47f, 33.39f, -70.26f, 72.39f);
        pathBuilder2.arcToRelative(71.64f, 71.64f, 0.0f, false, false, 27.64f, 56.3f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 186.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.horizontalLineToRelative(24.0f);
        pathBuilder2.lineTo(120.0f, 147.31f);
        pathBuilder2.lineTo(90.34f, 117.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder2.lineTo(128.0f, 132.69f);
        pathBuilder2.lineToRelative(26.34f, -26.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder2.lineTo(136.0f, 147.31f);
        pathBuilder2.lineTo(136.0f, 192.0f);
        pathBuilder2.horizontalLineToRelative(24.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.arcToRelative(32.12f, 32.12f, 0.0f, false, true, 12.47f, -25.35f);
        pathBuilder2.arcTo(71.65f, 71.65f, 0.0f, false, false, 200.0f, 104.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightbulbFilament = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
