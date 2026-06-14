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

/* compiled from: Identificationbadge.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"IdentificationBadge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getIdentificationBadge", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_identificationBadge", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdentificationbadgeKt {
    private static ImageVector _identificationBadge;

    public static final ImageVector getIdentificationBadge(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _identificationBadge;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("IdentificationBadge", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 24.0f);
        pathBuilder.lineTo(56.0f, 24.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.lineTo(40.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(200.0f, 232.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(216.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(96.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.81f, 198.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.21f, -1.6f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, -83.2f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, -9.6f);
        pathBuilder.arcTo(67.88f, 67.88f, 0.0f, false, true, 101.0f, 165.51f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 53.94f, 0.0f);
        pathBuilder.arcTo(67.88f, 67.88f, 0.0f, false, true, 182.4f, 187.2f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 180.81f, 198.4f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 136.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _identificationBadge = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
