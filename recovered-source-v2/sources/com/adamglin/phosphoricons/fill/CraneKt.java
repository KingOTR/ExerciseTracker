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

/* compiled from: Crane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Crane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCrane", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CraneKt {
    private static ImageVector _crane;

    public static final ImageVector getCrane(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _crane;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Crane", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.12f, 17.14f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.88f, -0.2f);
        pathBuilder.lineTo(102.0f, 80.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(168.0f);
        pathBuilder.arcToRelative(7.31f, 7.31f, 0.0f, false, false, -0.08f, -1.05f);
        pathBuilder.lineToRelative(0.0f, -0.24f);
        pathBuilder.arcToRelative(9.6f, 9.6f, 0.0f, false, false, -0.22f, -1.0f);
        pathBuilder.arcToRelative(0.09f, 0.09f, 0.0f, false, false, 0.0f, -0.05f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.arcToRelative(0.64f, 0.64f, 0.0f, false, true, 0.0f, -0.07f);
        pathBuilder.lineTo(113.54f, 92.0f);
        pathBuilder.lineTo(216.0f, 37.33f);
        pathBuilder.verticalLineTo(160.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 228.12f, 17.14f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 200.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
