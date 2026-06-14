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

/* compiled from: Popcorn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Popcorn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPopcorn", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_popcorn", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PopcornKt {
    private static ImageVector _popcorn;

    public static final ImageVector getPopcorn(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _popcorn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Popcorn", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.28f, 71.32f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.0f, -3.25f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -55.19f, -31.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -84.24f, 0.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -55.19f, 31.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 20.32f, 82.75f);
        pathBuilder.lineTo(50.87f, 212.58f);
        pathBuilder.arcTo(19.92f, 19.92f, 0.0f, false, false, 70.34f, 228.0f);
        pathBuilder.lineTo(185.66f, 228.0f);
        pathBuilder.arcToRelative(19.92f, 19.92f, 0.0f, false, false, 19.47f, -15.42f);
        pathBuilder.lineTo(235.68f, 82.75f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 232.28f, 71.32f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 60.0f);
        pathBuilder.arcToRelative(23.68f, 23.68f, 0.0f, false, true, 11.23f, 2.79f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.35f, -8.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 46.84f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.35f, 8.0f);
        pathBuilder.arcTo(23.68f, 23.68f, 0.0f, false, true, 180.0f, 60.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 21.78f, 13.87f);
        pathBuilder.lineToRelative(-33.13f, 9.46f);
        pathBuilder.lineTo(135.43f, 70.05f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, false, -14.86f, 0.0f);
        pathBuilder.lineTo(87.35f, 83.33f);
        pathBuilder.lineTo(54.22f, 73.87f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 76.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(101.13f, 103.67f);
        pathBuilder.lineTo(128.0f, 92.92f);
        pathBuilder.lineToRelative(26.87f, 10.75f);
        pathBuilder.lineTo(141.49f, 204.0f);
        pathBuilder.horizontalLineToRelative(-27.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.36f, 97.16f);
        pathBuilder.lineToRelative(28.78f, 8.22f);
        pathBuilder.lineTo(90.29f, 204.0f);
        pathBuilder.lineTo(73.5f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.5f, 204.0f);
        pathBuilder.lineTo(165.71f, 204.0f);
        pathBuilder.lineToRelative(13.15f, -98.62f);
        pathBuilder.lineToRelative(28.78f, -8.22f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _popcorn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
