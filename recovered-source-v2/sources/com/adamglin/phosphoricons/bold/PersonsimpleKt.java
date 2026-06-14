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

/* compiled from: Personsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPersonSimple", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleKt {
    private static ImageVector _personSimple;

    public static final ImageVector getPersonSimple(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _personSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 84.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, true, false, 92.0f, 48.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.29f, 138.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.47f, 4.12f);
        pathBuilder.curveToRelative(-0.32f, -0.19f, -32.37f, -18.92f, -77.82f, -21.88f);
        pathBuilder.verticalLineToRelative(27.0f);
        pathBuilder.lineTo(201.0f, 216.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 183.0f, 232.0f);
        pathBuilder.lineToRelative(-55.0f, -61.91f);
        pathBuilder.lineTo(73.0f, 232.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 55.0f, 216.0f);
        pathBuilder.lineToRelative(61.0f, -68.59f);
        pathBuilder.verticalLineToRelative(-27.0f);
        pathBuilder.curveToRelative(-45.72f, 2.95f, -77.48f, 21.68f, -77.82f, 21.89f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.35f, -20.58f);
        pathBuilder.curveTo(27.58f, 120.66f, 69.35f, 96.0f, 128.0f, 96.0f);
        pathBuilder.reflectiveCurveToRelative(100.42f, 24.66f, 102.17f, 25.71f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 234.29f, 138.17f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
