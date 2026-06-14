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

/* compiled from: Cookingpot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CookingPot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCookingPot", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cookingPot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CookingpotKt {
    private static ImageVector _cookingPot;

    public static final ImageVector getCookingPot(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _cookingPot;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CookingPot", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(88.0f, 48.0f);
        pathBuilder.lineTo(88.0f, 16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.lineTo(104.0f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(136.0f, 16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 48.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(168.0f, 16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(152.0f, 48.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(254.4f, 91.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.2f, -1.6f);
        pathBuilder.lineTo(224.0f, 104.0f);
        pathBuilder.lineTo(224.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder.lineTo(40.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(12.8f, 89.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.6f, 12.8f);
        pathBuilder.lineTo(32.0f, 124.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f);
        pathBuilder.lineTo(192.0f, 216.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f);
        pathBuilder.lineTo(224.0f, 124.0f);
        pathBuilder.lineToRelative(28.8f, -21.6f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 254.4f, 91.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cookingPot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
