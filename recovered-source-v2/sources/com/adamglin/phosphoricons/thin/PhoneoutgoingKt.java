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

/* compiled from: Phoneoutgoing.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneOutgoing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPhoneOutgoing", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneOutgoing", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneoutgoingKt {
    private static ImageVector _phoneOutgoing;

    public static final ImageVector getPhoneOutgoing(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _phoneOutgoing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PhoneOutgoing", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(149.17f, 106.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f);
        pathBuilder.lineTo(190.34f, 60.0f);
        pathBuilder.lineTo(160.0f, 60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.lineTo(204.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(196.0f, 65.66f);
        pathBuilder.lineToRelative(-41.17f, 41.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.91f, 182.58f);
        pathBuilder.arcTo(52.25f, 52.25f, 0.0f, false, true, 168.0f, 228.0f);
        pathBuilder.curveTo(90.8f, 228.0f, 28.0f, 165.2f, 28.0f, 88.0f);
        pathBuilder.arcTo(52.25f, 52.25f, 0.0f, false, true, 73.42f, 36.09f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 85.9f, 43.28f);
        pathBuilder.lineTo(107.0f, 90.42f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.0f, 11.36f);
        pathBuilder.curveToRelative(-0.09f, 0.13f, -0.18f, 0.26f, -0.28f, 0.38f);
        pathBuilder.lineToRelative(-21.2f, 25.21f);
        pathBuilder.arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.18f, 3.69f);
        pathBuilder.curveToRelative(7.84f, 16.05f, 24.65f, 32.73f, 40.89f, 40.57f);
        pathBuilder.arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.7f, -0.21f);
        pathBuilder.lineTo(153.8f, 150.3f);
        pathBuilder.arcToRelative(3.37f, 3.37f, 0.0f, false, true, 0.38f, -0.28f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 165.56f, 149.0f);
        pathBuilder.lineToRelative(47.22f, 21.16f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 219.91f, 182.58f);
        pathBuilder.close();
        pathBuilder.moveTo(209.56f, 177.46f);
        pathBuilder.lineTo(162.35f, 156.3f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, false, -3.57f, 0.27f);
        pathBuilder.lineTo(134.0f, 177.69f);
        pathBuilder.lineToRelative(-0.37f, 0.28f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.79f, 0.87f);
        pathBuilder.curveToRelative(-18.0f, -8.69f, -35.91f, -26.48f, -44.6f, -44.27f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 78.0f, 122.82f);
        pathBuilder.curveToRelative(0.09f, -0.14f, 0.19f, -0.26f, 0.29f, -0.39f);
        pathBuilder.lineToRelative(21.19f, -25.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.23f, -3.6f);
        pathBuilder.lineTo(78.57f, 46.49f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 74.9f, 44.0f);
        pathBuilder.arcToRelative(3.87f, 3.87f, 0.0f, false, false, -0.48f, 0.0f);
        pathBuilder.arcTo(44.23f, 44.23f, 0.0f, false, false, 36.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, 72.78f, 59.22f, 132.0f, 132.0f, 132.0f);
        pathBuilder.arcToRelative(44.23f, 44.23f, 0.0f, false, false, 44.0f, -38.42f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 209.56f, 177.46f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneOutgoing = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
