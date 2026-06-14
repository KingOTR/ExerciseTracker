package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Gendertransgender.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GenderTransgender", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGenderTransgender", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_genderTransgender", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GendertransgenderKt {
    private static ImageVector _genderTransgender;

    public static final ImageVector getGenderTransgender(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(127.92f, 150.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -22.0f, -22.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 127.92f, 150.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 40.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder.horizontalLineTo(156.27f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 148.0f, 71.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(8.69f);
        pathBuilder.lineTo(148.0f, 96.69f);
        pathBuilder.lineTo(137.66f, 86.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.49f, 0.18f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, false, 0.41f, 11.37f);
        pathBuilder.lineTo(136.69f, 108.0f);
        pathBuilder.lineTo(126.0f, 118.64f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, true, false, 137.36f, 130.0f);
        pathBuilder.lineTo(148.0f, 119.31f);
        pathBuilder.lineToRelative(10.34f, 10.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, -0.43f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, false, -0.6f, -11.1f);
        pathBuilder.lineTo(159.31f, 108.0f);
        pathBuilder.lineTo(176.0f, 91.31f);
        pathBuilder.verticalLineToRelative(8.42f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, false, 7.47f, 8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _genderTransgender = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
