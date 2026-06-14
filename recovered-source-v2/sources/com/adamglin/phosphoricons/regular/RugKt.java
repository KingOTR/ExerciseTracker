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

/* compiled from: Rug.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Rug", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getRug", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rug", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RugKt {
    private static ImageVector _rug;

    public static final ImageVector getRug(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _rug;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Rug", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.lineTo(192.0f, 40.0f);
        pathBuilder.lineTo(160.0f, 40.0f);
        pathBuilder.lineTo(160.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(144.0f, 40.0f);
        pathBuilder.lineTo(112.0f, 40.0f);
        pathBuilder.lineTo(112.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(96.0f, 40.0f);
        pathBuilder.lineTo(64.0f, 40.0f);
        pathBuilder.lineTo(64.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(48.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(64.0f, 216.0f);
        pathBuilder.lineTo(96.0f, 216.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(112.0f, 216.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(160.0f, 216.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(208.0f, 24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 56.0f);
        pathBuilder.lineTo(192.0f, 56.0f);
        pathBuilder.lineTo(192.0f, 200.0f);
        pathBuilder.lineTo(64.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.86f, -3.88f);
        pathBuilder.lineToRelative(24.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -8.24f);
        pathBuilder.lineToRelative(-24.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.72f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.24f);
        pathBuilder.lineToRelative(24.0f, 40.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 103.55f);
        pathBuilder.lineTo(142.67f, 128.0f);
        pathBuilder.lineTo(128.0f, 152.45f);
        pathBuilder.lineTo(113.33f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rug = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
