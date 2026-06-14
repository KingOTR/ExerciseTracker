package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Student.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Student", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStudent", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_student", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StudentKt {
    private static ImageVector _student;

    public static final ImageVector getStudent(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _student;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Student", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.9f, 58.31f);
        pathBuilder.lineToRelative(-96.0f, -32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.8f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, 32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 64.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(72.32f);
        pathBuilder.lineToRelative(38.68f, 12.9f);
        pathBuilder.arcTo(62.0f, 62.0f, 0.0f, false, false, 99.0f, 174.75f);
        pathBuilder.curveToRelative(-19.25f, 6.53f, -36.0f, 19.59f, -48.0f, 38.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 61.0f, 219.28f);
        pathBuilder.curveTo(76.47f, 195.59f, 100.88f, 182.0f, 128.0f, 182.0f);
        pathBuilder.reflectiveCurveToRelative(51.53f, 13.59f, 67.0f, 37.28f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 205.0f, 212.72f);
        pathBuilder.curveToRelative(-12.0f, -18.38f, -28.73f, -31.44f, -48.0f, -38.0f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, false, false, 22.27f, -89.53f);
        pathBuilder.lineTo(225.9f, 69.69f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -11.38f);
        pathBuilder.close();
        pathBuilder.moveTo(178.0f, 120.0f);
        pathBuilder.arcTo(50.0f, 50.0f, 0.0f, true, true, 88.63f, 89.2f);
        pathBuilder.lineToRelative(37.47f, 12.49f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.8f, 0.0f);
        pathBuilder.lineTo(167.37f, 89.2f);
        pathBuilder.arcTo(49.78f, 49.78f, 0.0f, false, true, 178.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 89.68f);
        pathBuilder.lineTo(51.0f, 64.0f);
        pathBuilder.lineToRelative(77.0f, -25.68f);
        pathBuilder.lineTo(205.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _student = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
