package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Phonelist.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneList", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPhoneList", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneList", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhonelistKt {
    private static ImageVector _phoneList;

    public static final ImageVector getPhoneList(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _phoneList;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PhoneList", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(212.78f, 170.13f);
        pathBuilder.lineTo(165.56f, 149.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 154.18f, 150.0f);
        pathBuilder.arcToRelative(3.37f, 3.37f, 0.0f, false, false, -0.38f, 0.28f);
        pathBuilder.lineTo(129.0f, 171.42f);
        pathBuilder.arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.7f, 0.21f);
        pathBuilder.curveToRelative(-16.24f, -7.84f, -33.0f, -24.52f, -40.89f, -40.57f);
        pathBuilder.arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.18f, -3.69f);
        pathBuilder.lineToRelative(21.2f, -25.21f);
        pathBuilder.curveToRelative(0.1f, -0.12f, 0.19f, -0.25f, 0.28f, -0.38f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.0f, -11.36f);
        pathBuilder.lineTo(85.9f, 43.28f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.48f, -7.19f);
        pathBuilder.arcTo(52.25f, 52.25f, 0.0f, false, false, 28.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, 77.2f, 62.8f, 140.0f, 140.0f, 140.0f);
        pathBuilder.arcToRelative(52.25f, 52.25f, 0.0f, false, false, 51.91f, -45.42f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 212.78f, 170.13f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 181.57f);
        pathBuilder.arcTo(44.23f, 44.23f, 0.0f, false, true, 168.0f, 220.0f);
        pathBuilder.curveTo(95.22f, 220.0f, 36.0f, 160.78f, 36.0f, 88.0f);
        pathBuilder.arcTo(44.23f, 44.23f, 0.0f, false, true, 74.42f, 44.0f);
        pathBuilder.arcToRelative(3.87f, 3.87f, 0.0f, false, true, 0.48f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.67f, 2.49f);
        pathBuilder.lineTo(99.68f, 93.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.23f, 3.6f);
        pathBuilder.lineToRelative(-21.19f, 25.2f);
        pathBuilder.curveToRelative(-0.1f, 0.13f, -0.2f, 0.25f, -0.29f, 0.39f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.78f, 11.75f);
        pathBuilder.curveToRelative(8.69f, 17.79f, 26.61f, 35.58f, 44.6f, 44.27f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.79f, -0.87f);
        pathBuilder.lineToRelative(0.37f, -0.28f);
        pathBuilder.lineToRelative(24.83f, -21.12f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, true, 3.57f, -0.27f);
        pathBuilder.lineToRelative(47.21f, 21.16f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 181.57f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(144.0f, 68.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 104.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(144.0f, 108.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneList = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
