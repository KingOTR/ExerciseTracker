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

/* compiled from: Identificationcard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"IdentificationCard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getIdentificationCard", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_identificationCard", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IdentificationcardKt {
    private static ImageVector _identificationCard;

    public static final ImageVector getIdentificationCard(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(148.0f, 108.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.lineTo(160.0f, 120.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 148.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 136.0f);
        pathBuilder.lineTo(168.0f, 136.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 56.0f);
        pathBuilder.lineTo(236.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(40.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(20.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 36.0f);
        pathBuilder.lineTo(216.0f, 36.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 60.0f);
        pathBuilder.lineTo(44.0f, 60.0f);
        pathBuilder.lineTo(44.0f, 196.0f);
        pathBuilder.lineTo(212.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(58.28f, 159.37f);
        pathBuilder.arcTo(43.82f, 43.82f, 0.0f, false, true, 71.53f, 142.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 56.94f, 0.0f);
        pathBuilder.arcToRelative(43.84f, 43.84f, 0.0f, false, true, 13.26f, 17.37f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.15f, 9.26f);
        pathBuilder.curveTo(116.48f, 161.19f, 108.42f, 156.0f, 100.0f, 156.0f);
        pathBuilder.reflectiveCurveToRelative(-16.47f, 5.2f, -19.59f, 12.63f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.13f, -9.26f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _identificationCard = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
