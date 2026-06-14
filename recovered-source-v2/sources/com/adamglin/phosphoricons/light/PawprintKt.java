package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pawprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PawPrint", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPawPrint", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pawPrint", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PawprintKt {
    private static ImageVector _pawPrint;

    public static final ImageVector getPawPrint(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(212.0f, 82.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 212.0f, 82.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 122.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 212.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(70.0f, 108.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 70.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 122.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 44.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 86.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, true, false, 66.0f, 60.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 92.0f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 46.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, true, true, 78.0f, 60.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 92.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 86.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 164.0f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 46.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.15f, 150.61f);
        pathBuilder.arcToRelative(37.32f, 37.32f, 0.0f, false, true, -17.82f, -22.33f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, -80.66f, 0.0f);
        pathBuilder.arcTo(37.26f, 37.26f, 0.0f, false, true, 69.9f, 150.58f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 88.0f, 222.0f);
        pathBuilder.arcToRelative(37.58f, 37.58f, 0.0f, false, false, 14.76f, -3.0f);
        pathBuilder.arcToRelative(66.14f, 66.14f, 0.0f, false, true, 50.41f, 0.0f);
        pathBuilder.arcTo(37.66f, 37.66f, 0.0f, false, false, 168.0f, 222.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 18.15f, -71.39f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 210.0f);
        pathBuilder.arcToRelative(25.93f, 25.93f, 0.0f, false, true, -10.21f, -2.08f);
        pathBuilder.arcToRelative(78.15f, 78.15f, 0.0f, false, false, -59.65f, 0.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 75.68f, 161.1f);
        pathBuilder.arcToRelative(49.28f, 49.28f, 0.0f, false, false, 23.51f, -29.48f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 57.62f, 0.0f);
        pathBuilder.arcToRelative(49.27f, 49.27f, 0.0f, false, false, 23.57f, 29.5f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 168.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pawPrint = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
