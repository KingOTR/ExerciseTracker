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

/* compiled from: Mountains.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Mountains", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMountains", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mountains", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MountainsKt {
    private static ImageVector _mountains;

    public static final ImageVector getMountains(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _mountains;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Mountains", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.0f, 78.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 164.0f, 78.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 38.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(253.16f, 196.94f);
        pathBuilder.lineTo(198.6f, 104.86f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, -12.0f, -6.86f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(13.88f, 13.88f, 0.0f, false, false, -12.0f, 6.86f);
        pathBuilder.lineToRelative(-27.88f, 47.05f);
        pathBuilder.lineToRelative(-46.56f, -79.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.13f, 0.0f);
        pathBuilder.lineTo(2.83f, 197.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 206.0f);
        pathBuilder.lineTo(248.0f, 206.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.16f, -9.06f);
        pathBuilder.close();
        pathBuilder.moveTo(86.27f, 79.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.46f, 0.0f);
        pathBuilder.lineToRelative(25.34f, 43.0f);
        pathBuilder.lineTo(60.93f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 194.0f);
        pathBuilder.lineToRelative(35.36f, -60.0f);
        pathBuilder.horizontalLineToRelative(68.29f);
        pathBuilder.lineToRelative(19.3f, 32.77f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(16.0f, 27.2f);
        pathBuilder.close();
        pathBuilder.moveTo(171.43f, 194.0f);
        pathBuilder.lineTo(153.58f, 163.71f);
        pathBuilder.lineTo(184.83f, 111.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.72f, -1.0f);
        pathBuilder.arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.72f, 1.0f);
        pathBuilder.lineToRelative(49.2f, 83.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mountains = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
