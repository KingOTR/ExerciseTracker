package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Lightbulbfilament.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LightbulbFilament", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLightbulbFilament", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightbulbFilament", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightbulbfilamentKt {
    private static ImageVector _lightbulbFilament;

    public static final ImageVector getLightbulbFilament(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(180.0f, 232.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(88.0f, 244.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 232.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 104.0f);
        pathBuilder.arcToRelative(92.47f, 92.47f, 0.0f, false, true, -37.0f, 73.73f);
        pathBuilder.arcToRelative(7.81f, 7.81f, 0.0f, false, false, -3.0f, 6.27f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(96.0f, 204.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.verticalLineToRelative(-0.23f);
        pathBuilder.arcToRelative(7.76f, 7.76f, 0.0f, false, false, -3.25f, -6.2f);
        pathBuilder.arcToRelative(91.36f, 91.36f, 0.0f, false, true, -36.75f, -73.0f);
        pathBuilder.curveTo(35.73f, 54.69f, 76.0f, 13.2f, 125.79f, 12.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 220.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 104.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -69.65f, -68.0f);
        pathBuilder.curveTo(89.56f, 36.89f, 59.8f, 67.56f, 60.0f, 104.39f);
        pathBuilder.arcToRelative(67.52f, 67.52f, 0.0f, false, false, 27.18f, 54.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(32.14f, 32.14f, 0.0f, false, true, 99.77f, 180.0f);
        pathBuilder.lineTo(116.0f, 180.0f);
        pathBuilder.lineTo(116.0f, 149.0f);
        pathBuilder.lineTo(87.51f, 120.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f);
        pathBuilder.lineTo(128.0f, 127.0f);
        pathBuilder.lineToRelative(23.51f, -23.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f);
        pathBuilder.lineTo(140.0f, 149.0f);
        pathBuilder.verticalLineToRelative(31.0f);
        pathBuilder.horizontalLineToRelative(16.25f);
        pathBuilder.arcToRelative(31.89f, 31.89f, 0.0f, false, true, 12.41f, -21.49f);
        pathBuilder.arcTo(67.45f, 67.45f, 0.0f, false, false, 196.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightbulbFilament = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
