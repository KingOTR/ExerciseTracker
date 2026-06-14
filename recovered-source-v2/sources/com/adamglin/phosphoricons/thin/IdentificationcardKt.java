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

/* compiled from: Identificationcard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"IdentificationCard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getIdentificationCard", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_identificationCard", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdentificationcardKt {
    private static ImageVector _identificationCard;

    public static final ImageVector getIdentificationCard(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _identificationCard;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("IdentificationCard", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(196.0f, 112.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(152.0f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 140.0f);
        pathBuilder.lineTo(152.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 56.0f);
        pathBuilder.lineTo(228.0f, 200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(40.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.lineTo(28.0f, 56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 44.0f);
        pathBuilder.lineTo(216.0f, 44.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(40.0f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.lineTo(36.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(216.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(131.87f, 167.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.74f, 2.0f);
        pathBuilder.curveTo(121.06f, 157.0f, 109.0f, 148.0f, 96.0f, 148.0f);
        pathBuilder.reflectiveCurveToRelative(-25.0f, 9.0f, -28.13f, 21.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 172.0f);
        pathBuilder.arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.0f, -0.13f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 60.13f, 167.0f);
        pathBuilder.arcToRelative(36.28f, 36.28f, 0.0f, false, true, 20.43f, -23.66f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 30.88f, 0.0f);
        pathBuilder.arcTo(36.2f, 36.2f, 0.0f, false, true, 131.87f, 167.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 140.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 96.0f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _identificationCard = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
