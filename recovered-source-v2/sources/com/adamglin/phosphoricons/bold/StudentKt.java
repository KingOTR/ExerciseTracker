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

/* compiled from: Student.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Student", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getStudent", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_student", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StudentKt {
    private static ImageVector _student;

    public static final ImageVector getStudent(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(227.79f, 52.62f);
        pathBuilder.lineToRelative(-96.0f, -32.0f);
        pathBuilder.arcToRelative(11.85f, 11.85f, 0.0f, false, false, -7.58f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, 32.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 63.37f);
        pathBuilder.arcTo(6.05f, 6.05f, 0.0f, false, false, 20.0f, 64.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(44.0f, 80.65f);
        pathBuilder.lineToRelative(23.71f, 7.9f);
        pathBuilder.arcToRelative(67.92f, 67.92f, 0.0f, false, false, 18.42f, 85.0f);
        pathBuilder.arcTo(100.36f, 100.36f, 0.0f, false, false, 46.0f, 209.44f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.1f, 13.11f);
        pathBuilder.curveTo(80.37f, 200.59f, 103.0f, 188.0f, 128.0f, 188.0f);
        pathBuilder.reflectiveCurveToRelative(47.63f, 12.59f, 61.95f, 34.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.1f, -13.11f);
        pathBuilder.arcToRelative(100.36f, 100.36f, 0.0f, false, false, -40.18f, -35.92f);
        pathBuilder.arcToRelative(67.92f, 67.92f, 0.0f, false, false, 18.42f, -85.0f);
        pathBuilder.lineToRelative(39.5f, -13.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -22.76f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 44.62f);
        pathBuilder.lineTo(186.05f, 64.0f);
        pathBuilder.lineTo(128.0f, 83.35f);
        pathBuilder.lineTo(70.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 120.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, true, true, 90.94f, 96.29f);
        pathBuilder.lineToRelative(33.27f, 11.09f);
        pathBuilder.arcToRelative(11.89f, 11.89f, 0.0f, false, false, 7.58f, 0.0f);
        pathBuilder.lineToRelative(33.27f, -11.09f);
        pathBuilder.arcTo(43.85f, 43.85f, 0.0f, false, true, 172.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _student = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
