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

/* compiled from: Gendertransgender.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GenderTransgender", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGenderTransgender", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_genderTransgender", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GendertransgenderKt {
    private static ImageVector _genderTransgender;

    public static final ImageVector getGenderTransgender(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 32.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(28.69f);
        pathBuilder.lineTo(168.0f, 76.69f);
        pathBuilder.lineTo(149.66f, 58.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.32f, 11.31f);
        pathBuilder.lineTo(156.69f, 88.0f);
        pathBuilder.lineToRelative(-15.76f, 15.76f);
        pathBuilder.arcToRelative(71.94f, 71.94f, 0.0f, true, false, 11.32f, 11.31f);
        pathBuilder.lineTo(168.0f, 99.33f);
        pathBuilder.lineToRelative(18.34f, 18.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.31f);
        pathBuilder.lineTo(179.31f, 88.0f);
        pathBuilder.lineTo(208.0f, 59.32f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(135.6f, 199.63f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, true, true, 152.0f, 160.0f);
        pathBuilder.arcTo(56.08f, 56.08f, 0.0f, false, true, 135.6f, 199.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _genderTransgender = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
