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

/* compiled from: Peace.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Peace", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPeace", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_peace", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PeaceKt {
    private static ImageVector _peace;

    public static final ImageVector getPeace(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _peace;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Peace", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 128.0f);
        pathBuilder.arcToRelative(89.44f, 89.44f, 0.0f, false, true, -13.0f, 46.58f);
        pathBuilder.lineToRelative(-71.0f, -49.7f);
        pathBuilder.lineTo(134.0f, 38.2f);
        pathBuilder.arcTo(90.12f, 90.12f, 0.0f, false, true, 218.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 38.2f);
        pathBuilder.verticalLineToRelative(86.68f);
        pathBuilder.lineToRelative(-71.0f, 49.7f);
        pathBuilder.arcTo(90.0f, 90.0f, 0.0f, false, true, 122.0f, 38.2f);
        pathBuilder.close();
        pathBuilder.moveTo(57.92f, 184.4f);
        pathBuilder.lineTo(122.0f, 139.53f);
        pathBuilder.lineTo(122.0f, 217.8f);
        pathBuilder.arcTo(89.93f, 89.93f, 0.0f, false, true, 57.92f, 184.4f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 217.8f);
        pathBuilder.lineTo(134.0f, 139.53f);
        pathBuilder.lineToRelative(64.08f, 44.87f);
        pathBuilder.arcTo(89.93f, 89.93f, 0.0f, false, true, 134.0f, 217.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _peace = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
