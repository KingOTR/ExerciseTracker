package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tennisball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TennisBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTennisBall", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tennisBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TennisballKt {
    private static ImageVector _tennisBall;

    public static final ImageVector getTennisBall(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(201.57f, 54.46f);
        pathBuilder.arcToRelative(104.0f, 104.0f, 0.0f, true, false, 0.0f, 147.08f);
        pathBuilder.arcTo(103.4f, 103.4f, 0.0f, false, false, 201.57f, 54.46f);
        pathBuilder.close();
        pathBuilder.moveTo(65.75f, 65.77f);
        pathBuilder.arcToRelative(87.63f, 87.63f, 0.0f, false, true, 53.66f, -25.31f);
        pathBuilder.arcTo(87.31f, 87.31f, 0.0f, false, true, 94.0f, 94.06f);
        pathBuilder.arcToRelative(87.42f, 87.42f, 0.0f, false, true, -53.62f, 25.35f);
        pathBuilder.arcTo(87.58f, 87.58f, 0.0f, false, true, 65.75f, 65.77f);
        pathBuilder.close();
        pathBuilder.moveTo(40.33f, 135.48f);
        pathBuilder.arcToRelative(103.29f, 103.29f, 0.0f, false, false, 65.0f, -30.11f);
        pathBuilder.arcToRelative(103.24f, 103.24f, 0.0f, false, false, 30.13f, -65.0f);
        pathBuilder.arcToRelative(87.78f, 87.78f, 0.0f, false, true, 80.18f, 80.14f);
        pathBuilder.arcToRelative(104.0f, 104.0f, 0.0f, false, false, -95.16f, 95.1f);
        pathBuilder.arcToRelative(87.78f, 87.78f, 0.0f, false, true, -80.18f, -80.14f);
        pathBuilder.close();
        pathBuilder.moveTo(190.25f, 190.23f);
        pathBuilder.arcToRelative(87.69f, 87.69f, 0.0f, false, true, -53.66f, 25.31f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 79.0f, -78.95f);
        pathBuilder.arcTo(87.58f, 87.58f, 0.0f, false, true, 190.25f, 190.23f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tennisBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
