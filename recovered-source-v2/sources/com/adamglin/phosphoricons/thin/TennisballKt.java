package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tennisball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TennisBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTennisBall", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tennisBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TennisballKt {
    private static ImageVector _tennisBall;

    public static final ImageVector getTennisBall(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _tennisBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TennisBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(198.74f, 57.29f);
        pathBuilder.arcTo(99.39f, 99.39f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(-0.19f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, true, false, 70.93f, 29.29f);
        pathBuilder.close();
        pathBuilder.moveTo(62.92f, 63.0f);
        pathBuilder.arcToRelative(91.38f, 91.38f, 0.0f, false, true, 60.8f, -26.85f);
        pathBuilder.arcTo(91.31f, 91.31f, 0.0f, false, true, 96.87f, 96.89f);
        pathBuilder.arcTo(91.44f, 91.44f, 0.0f, false, true, 36.1f, 123.73f);
        pathBuilder.arcTo(91.61f, 91.61f, 0.0f, false, true, 62.92f, 63.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.09f, 131.74f);
        pathBuilder.arcToRelative(99.36f, 99.36f, 0.0f, false, false, 66.44f, -29.2f);
        pathBuilder.arcToRelative(99.25f, 99.25f, 0.0f, false, false, 29.21f, -66.45f);
        pathBuilder.arcToRelative(91.9f, 91.9f, 0.0f, false, true, 88.17f, 88.17f);
        pathBuilder.arcToRelative(100.0f, 100.0f, 0.0f, false, false, -95.65f, 95.65f);
        pathBuilder.arcToRelative(91.9f, 91.9f, 0.0f, false, true, -88.17f, -88.17f);
        pathBuilder.close();
        pathBuilder.moveTo(193.09f, 193.05f);
        pathBuilder.arcToRelative(91.38f, 91.38f, 0.0f, false, true, -60.8f, 26.85f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 87.62f, -87.63f);
        pathBuilder.arcTo(91.61f, 91.61f, 0.0f, false, true, 193.08f, 193.05f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tennisBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
