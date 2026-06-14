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

/* compiled from: Cloud.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cloud", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCloud", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloud", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudKt {
    private static ImageVector _cloud;

    public static final ImageVector getCloud(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _cloud;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cloud", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.06f, 40.0f);
        pathBuilder.arcTo(88.1f, 88.1f, 0.0f, false, false, 81.29f, 88.67f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(87.48f, 87.48f, 0.0f, false, false, 72.0f, 127.73f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 64.57f, 136.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 128.0f);
        pathBuilder.arcToRelative(103.66f, 103.66f, 0.0f, false, true, 5.34f, -32.92f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.75f, -5.18f);
        pathBuilder.arcTo(64.09f, 64.09f, 0.0f, false, false, 8.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 35.19f, 29.75f, 64.0f, 65.0f, 64.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(88.09f, 88.09f, 0.0f, false, false, 87.93f, -91.48f);
        pathBuilder.curveTo(246.11f, 77.54f, 207.07f, 40.0f, 160.06f, 40.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloud = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
