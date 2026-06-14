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

/* compiled from: Pawprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PawPrint", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPawPrint", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pawPrint", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PawprintKt {
    private static ImageVector _pawPrint;

    public static final ImageVector getPawPrint(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _pawPrint;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PawPrint", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(212.0f, 80.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 212.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 108.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 72.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 44.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 88.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 64.0f, 60.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 92.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 48.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 80.0f, 60.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 88.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 164.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(187.12f, 148.86f);
        pathBuilder.arcToRelative(35.3f, 35.3f, 0.0f, false, true, -16.87f, -21.14f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -84.5f, 0.0f);
        pathBuilder.arcTo(35.25f, 35.25f, 0.0f, false, true, 69.0f, 148.82f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 88.0f, 224.0f);
        pathBuilder.arcToRelative(39.48f, 39.48f, 0.0f, false, false, 15.52f, -3.13f);
        pathBuilder.arcToRelative(64.09f, 64.09f, 0.0f, false, true, 48.87f, 0.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 34.73f, -72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 208.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -9.45f, -1.93f);
        pathBuilder.arcToRelative(80.14f, 80.14f, 0.0f, false, false, -61.19f, 0.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -20.71f, -43.26f);
        pathBuilder.arcToRelative(51.22f, 51.22f, 0.0f, false, false, 24.46f, -30.67f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 53.78f, 0.0f);
        pathBuilder.arcToRelative(51.27f, 51.27f, 0.0f, false, false, 24.53f, 30.71f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pawPrint = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
