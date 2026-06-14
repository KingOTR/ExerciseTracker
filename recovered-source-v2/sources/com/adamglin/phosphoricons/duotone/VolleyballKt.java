package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Volleyball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Volleyball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getVolleyball", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_volleyball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VolleyballKt {
    private static ImageVector _volleyball;

    public static final ImageVector getVolleyball(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _volleyball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Volleyball", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.25f, 165.8f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 80.0f, 211.15f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(95.75f, 95.75f, 0.0f, false, true, -28.86f, -25.58f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 105.47f, 89.0f);
        pathBuilder.lineTo(80.0f, 44.86f);
        pathBuilder.arcToRelative(95.55f, 95.55f, 0.0f, false, true, 36.58f, -12.2f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 173.06f, 128.0f);
        pathBuilder.horizontalLineTo(128.0f);
        pathBuilder.lineToRelative(-22.53f, 39.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, false, 110.78f, -1.22f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder2.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(209.74f, 160.58f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -93.49f, 3.78f);
        pathBuilder2.lineTo(132.62f, 136.0f);
        pathBuilder2.horizontalLineToRelative(83.0f);
        pathBuilder2.arcTo(87.16f, 87.16f, 0.0f, false, true, 209.74f, 160.58f);
        pathBuilder2.close();
        pathBuilder2.moveTo(91.12f, 48.11f);
        pathBuilder2.arcToRelative(87.57f, 87.57f, 0.0f, false, true, 24.22f, -7.2f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 50.0f, 79.09f);
        pathBuilder2.lineTo(132.62f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(215.63f, 120.0f);
        pathBuilder2.lineTo(181.37f, 120.0f);
        pathBuilder2.arcToRelative(104.18f, 104.18f, 0.0f, false, false, -35.78f, -78.23f);
        pathBuilder2.arcTo(88.18f, 88.18f, 0.0f, false, true, 215.63f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(77.27f, 56.13f);
        pathBuilder2.lineTo(94.39f, 85.78f);
        pathBuilder2.arcToRelative(104.14f, 104.14f, 0.0f, false, false, -49.86f, 70.09f);
        pathBuilder2.arcTo(87.95f, 87.95f, 0.0f, false, true, 77.27f, 56.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(58.9f, 182.43f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 43.49f, -82.79f);
        pathBuilder2.lineTo(118.76f, 128.0f);
        pathBuilder2.lineTo(77.27f, 199.87f);
        pathBuilder2.arcTo(88.62f, 88.62f, 0.0f, false, true, 58.9f, 182.43f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 216.0f);
        pathBuilder2.arcToRelative(87.5f, 87.5f, 0.0f, false, true, -36.88f, -8.11f);
        pathBuilder2.lineToRelative(17.13f, -29.67f);
        pathBuilder2.arcToRelative(104.23f, 104.23f, 0.0f, false, false, 85.53f, 8.17f);
        pathBuilder2.arcTo(87.81f, 87.81f, 0.0f, false, true, 128.0f, 216.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _volleyball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
