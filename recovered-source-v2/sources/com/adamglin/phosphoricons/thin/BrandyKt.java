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

/* compiled from: Brandy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Brandy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBrandy", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_brandy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrandyKt {
    private static ImageVector _brandy;

    public static final ImageVector getBrandy(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _brandy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Brandy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(91.67f, 91.67f, 0.0f, false, false, -14.88f, -50.18f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 201.77f, 36.0f);
        pathBuilder.horizontalLineTo(54.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.35f, 1.82f);
        pathBuilder.arcTo(91.67f, 91.67f, 0.0f, false, false, 36.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(92.11f, 92.11f, 0.0f, false, false, 88.0f, 91.91f);
        pathBuilder.verticalLineTo(220.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.horizontalLineTo(132.0f);
        pathBuilder.verticalLineTo(179.91f);
        pathBuilder.arcTo(92.11f, 92.11f, 0.0f, false, false, 220.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.43f, 44.0f);
        pathBuilder.horizontalLineTo(199.57f);
        pathBuilder.arcToRelative(83.5f, 83.5f, 0.0f, false, true, 12.32f, 40.0f);
        pathBuilder.horizontalLineTo(44.11f);
        pathBuilder.arcTo(83.5f, 83.5f, 0.0f, false, true, 56.43f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 172.0f);
        pathBuilder.arcTo(84.1f, 84.1f, 0.0f, false, true, 44.1f, 92.0f);
        pathBuilder.horizontalLineTo(211.9f);
        pathBuilder.arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _brandy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
