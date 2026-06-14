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

/* compiled from: Student.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Student", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getStudent", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_student", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StudentKt {
    private static ImageVector _student;

    public static final ImageVector getStudent(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(225.27f, 60.21f);
        pathBuilder.lineToRelative(-96.0f, -32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.54f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, 32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 64.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(69.55f);
        pathBuilder.lineTo(79.88f, 84.18f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 24.54f, 91.0f);
        pathBuilder.curveToRelative(-20.86f, 5.74f, -39.0f, 19.13f, -51.77f, 38.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.7f, 4.36f);
        pathBuilder.curveTo(75.17f, 193.92f, 100.2f, 180.0f, 128.0f, 180.0f);
        pathBuilder.reflectiveCurveToRelative(52.83f, 13.92f, 68.65f, 38.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.7f, -4.36f);
        pathBuilder.curveToRelative(-12.72f, -19.52f, -30.91f, -32.91f, -51.77f, -38.65f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 24.54f, -91.0f);
        pathBuilder.lineToRelative(49.15f, -16.39f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.58f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 120.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, true, true, 87.93f, 86.86f);
        pathBuilder.lineToRelative(38.8f, 12.93f);
        pathBuilder.arcToRelative(3.95f, 3.95f, 0.0f, false, false, 2.54f, 0.0f);
        pathBuilder.lineToRelative(38.8f, -12.93f);
        pathBuilder.arcTo(51.85f, 51.85f, 0.0f, false, true, 180.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 91.78f);
        pathBuilder.lineTo(44.65f, 64.0f);
        pathBuilder.lineTo(128.0f, 36.22f);
        pathBuilder.lineTo(211.35f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _student = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
