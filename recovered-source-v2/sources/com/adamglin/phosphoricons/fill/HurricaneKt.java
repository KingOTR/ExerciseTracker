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

/* compiled from: Hurricane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hurricane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHurricane", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hurricane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HurricaneKt {
    private static ImageVector _hurricane;

    public static final ImageVector getHurricane(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _hurricane;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hurricane", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(158.32f, 45.36f);
        pathBuilder.lineToRelative(9.41f, -35.3f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 158.32f, 0.18f);
        pathBuilder.arcTo(195.87f, 195.87f, 0.0f, false, false, 99.67f, 25.27f);
        pathBuilder.curveTo(60.63f, 50.37f, 40.0f, 85.89f, 40.0f, 128.0f);
        pathBuilder.arcToRelative(88.11f, 88.11f, 0.0f, false, false, 57.68f, 82.64f);
        pathBuilder.lineToRelative(-9.41f, 35.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.41f, 9.88f);
        pathBuilder.arcToRelative(195.87f, 195.87f, 0.0f, false, false, 58.65f, -25.09f);
        pathBuilder.curveTo(195.37f, 205.63f, 216.0f, 170.11f, 216.0f, 128.0f);
        pathBuilder.arcTo(88.1f, 88.1f, 0.0f, false, false, 158.32f, 45.36f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 152.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hurricane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
