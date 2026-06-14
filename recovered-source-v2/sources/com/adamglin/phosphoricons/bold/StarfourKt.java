package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Starfour.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarFour", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getStarFour", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starFour", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarfourKt {
    private static ImageVector _starFour;

    public static final ImageVector getStarFour(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _starFour;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StarFour", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.86f, 109.25f);
        pathBuilder.lineTo(169.18f, 86.82f);
        pathBuilder.lineTo(146.75f, 25.14f);
        pathBuilder.arcToRelative(19.95f, 19.95f, 0.0f, false, false, -37.5f, 0.0f);
        pathBuilder.lineTo(86.82f, 86.82f);
        pathBuilder.lineTo(25.14f, 109.25f);
        pathBuilder.arcToRelative(19.95f, 19.95f, 0.0f, false, false, 0.0f, 37.5f);
        pathBuilder.lineToRelative(61.68f, 22.43f);
        pathBuilder.lineToRelative(22.43f, 61.68f);
        pathBuilder.arcToRelative(19.95f, 19.95f, 0.0f, false, false, 37.5f, 0.0f);
        pathBuilder.lineToRelative(22.43f, -61.68f);
        pathBuilder.lineToRelative(61.68f, -22.43f);
        pathBuilder.arcToRelative(19.95f, 19.95f, 0.0f, false, false, 0.0f, -37.5f);
        pathBuilder.close();
        pathBuilder.moveTo(155.72f, 148.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.18f, 7.18f);
        pathBuilder.lineTo(128.0f, 212.21f);
        pathBuilder.lineToRelative(-20.54f, -56.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.18f, -7.18f);
        pathBuilder.lineTo(43.79f, 128.0f);
        pathBuilder.lineToRelative(56.49f, -20.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.18f, -7.18f);
        pathBuilder.lineTo(128.0f, 43.79f);
        pathBuilder.lineToRelative(20.54f, 56.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.18f, 7.18f);
        pathBuilder.lineTo(212.21f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starFour = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
