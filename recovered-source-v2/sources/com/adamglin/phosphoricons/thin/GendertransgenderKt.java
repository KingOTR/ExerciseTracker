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

/* compiled from: Gendertransgender.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GenderTransgender", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGenderTransgender", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_genderTransgender", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GendertransgenderKt {
    private static ImageVector _genderTransgender;

    public static final ImageVector getGenderTransgender(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _genderTransgender;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GenderTransgender", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 36.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(38.34f);
        pathBuilder.lineTo(168.0f, 82.35f);
        pathBuilder.lineTo(146.83f, 61.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, 5.65f);
        pathBuilder.lineTo(162.34f, 88.0f);
        pathBuilder.lineToRelative(-21.17f, 21.18f);
        pathBuilder.arcToRelative(68.16f, 68.16f, 0.0f, true, false, 5.65f, 5.66f);
        pathBuilder.lineTo(168.0f, 93.67f);
        pathBuilder.lineToRelative(21.17f, 21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f);
        pathBuilder.lineTo(173.66f, 88.0f);
        pathBuilder.lineTo(212.0f, 49.66f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.43f, 202.45f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, true, true, 156.0f, 160.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, true, 138.43f, 202.45f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _genderTransgender = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
