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

/* compiled from: Crownsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CrownSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCrownSimple", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crownSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrownsimpleKt {
    private static ImageVector _crownSimple;

    public static final ImageVector getCrownSimple(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _crownSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CrownSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(239.75f, 90.81f);
        pathBuilder.curveToRelative(0.0f, 0.11f, 0.0f, 0.21f, -0.07f, 0.32f);
        pathBuilder.lineTo(217.0f, 195.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.72f, 13.0f);
        pathBuilder.horizontalLineTo(54.71f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 39.0f, 195.0f);
        pathBuilder.lineTo(16.32f, 91.13f);
        pathBuilder.curveToRelative(0.0f, -0.11f, -0.05f, -0.21f, -0.07f, -0.32f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 44.0f, 77.39f);
        pathBuilder.lineToRelative(33.67f, 36.29f);
        pathBuilder.lineToRelative(35.8f, -80.29f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.1f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 29.06f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 0.1f);
        pathBuilder.lineToRelative(35.8f, 80.29f);
        pathBuilder.lineTo(212.0f, 77.39f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.71f, 13.42f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crownSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
