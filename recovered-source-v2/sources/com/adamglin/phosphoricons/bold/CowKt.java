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

/* compiled from: Cow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCow", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CowKt {
    private static ImageVector _cow;

    public static final ImageVector getCow(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _cow;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cow", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(120.0f, 128.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 120.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 112.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 152.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(247.48f, 124.66f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 232.0f, 132.0f);
        pathBuilder.lineTo(204.0f, 132.0f);
        pathBuilder.verticalLineToRelative(35.05f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, true, 182.0f, 236.0f);
        pathBuilder.lineTo(74.0f, 236.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, -22.0f, -68.95f);
        pathBuilder.lineTo(52.0f, 132.0f);
        pathBuilder.lineTo(24.0f, 132.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 4.39f, 108.17f);
        pathBuilder.arcToRelative(60.15f, 60.15f, 0.0f, false, true, 52.0f, -47.76f);
        pathBuilder.arcTo(59.7f, 59.7f, 0.0f, false, true, 44.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.arcToRelative(59.7f, 59.7f, 0.0f, false, true, -12.35f, 36.41f);
        pathBuilder.arcToRelative(60.15f, 60.15f, 0.0f, false, true, 52.0f, 47.76f);
        pathBuilder.arcTo(19.78f, 19.78f, 0.0f, false, true, 247.48f, 124.66f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 160.0f);
        pathBuilder.lineTo(180.0f, 160.0f);
        pathBuilder.lineTo(180.0f, 104.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(96.0f, 84.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.5f, 84.64f);
        pathBuilder.arcTo(36.15f, 36.15f, 0.0f, false, false, 29.26f, 108.0f);
        pathBuilder.lineTo(52.0f, 108.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.arcTo(43.71f, 43.71f, 0.0f, false, true, 56.5f, 84.64f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 198.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.lineTo(74.0f, 184.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 28.0f);
        pathBuilder.lineTo(182.0f, 212.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 196.0f, 198.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.74f, 108.0f);
        pathBuilder.arcTo(36.15f, 36.15f, 0.0f, false, false, 199.5f, 84.64f);
        pathBuilder.arcTo(43.71f, 43.71f, 0.0f, false, true, 204.0f, 104.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
