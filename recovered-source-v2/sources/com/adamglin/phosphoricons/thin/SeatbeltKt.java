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

/* compiled from: Seatbelt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Seatbelt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSeatbelt", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_seatbelt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeatbeltKt {
    private static ImageVector _seatbelt;

    public static final ImageVector getSeatbelt(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _seatbelt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Seatbelt", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 108.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, true, false, 88.0f, 68.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, true, 96.0f, 68.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(56.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.65f, -7.0f);
        pathBuilder.lineToRelative(103.0f, -90.84f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -95.44f, 51.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, 3.37f);
        pathBuilder.arcToRelative(4.48f, 4.48f, 0.0f, false, true, -0.64f, -0.05f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 53.0f, 179.89f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 162.8f, 124.43f);
        pathBuilder.lineTo(189.35f, 101.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.3f, 6.0f);
        pathBuilder.lineTo(66.58f, 220.0f);
        pathBuilder.lineTo(200.0f, 220.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(190.44f, 148.67f);
        pathBuilder.arcTo(75.52f, 75.52f, 0.0f, false, true, 204.0f, 192.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.arcToRelative(67.55f, 67.55f, 0.0f, false, false, -12.13f, -38.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.57f, -4.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _seatbelt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
