package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Database.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Database", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getDatabase", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_database", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseKt {
    private static ImageVector _database;

    public static final ImageVector getDatabase(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _database;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Database", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 26.51f, -39.4f, 48.0f, -88.0f, 48.0f);
        pathBuilder.reflectiveCurveTo(40.0f, 106.51f, 40.0f, 80.0f);
        pathBuilder.reflectiveCurveToRelative(39.4f, -48.0f, 88.0f, -48.0f);
        pathBuilder.reflectiveCurveTo(216.0f, 53.49f, 216.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.curveTo(74.17f, 24.0f, 32.0f, 48.6f, 32.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(96.0f);
        pathBuilder2.curveToRelative(0.0f, 31.4f, 42.17f, 56.0f, 96.0f, 56.0f);
        pathBuilder2.reflectiveCurveToRelative(96.0f, -24.6f, 96.0f, -56.0f);
        pathBuilder2.lineTo(224.0f, 80.0f);
        pathBuilder2.curveTo(224.0f, 48.6f, 181.83f, 24.0f, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 128.0f);
        pathBuilder2.curveToRelative(0.0f, 9.62f, -7.88f, 19.43f, -21.61f, 26.92f);
        pathBuilder2.curveTo(170.93f, 163.35f, 150.19f, 168.0f, 128.0f, 168.0f);
        pathBuilder2.reflectiveCurveToRelative(-42.93f, -4.65f, -58.39f, -13.08f);
        pathBuilder2.curveTo(55.88f, 147.43f, 48.0f, 137.62f, 48.0f, 128.0f);
        pathBuilder2.lineTo(48.0f, 111.36f);
        pathBuilder2.curveToRelative(17.06f, 15.0f, 46.23f, 24.64f, 80.0f, 24.64f);
        pathBuilder2.reflectiveCurveToRelative(62.94f, -9.68f, 80.0f, -24.64f);
        pathBuilder2.close();
        pathBuilder2.moveTo(69.61f, 53.08f);
        pathBuilder2.curveTo(85.07f, 44.65f, 105.81f, 40.0f, 128.0f, 40.0f);
        pathBuilder2.reflectiveCurveToRelative(42.93f, 4.65f, 58.39f, 13.08f);
        pathBuilder2.curveTo(200.12f, 60.57f, 208.0f, 70.38f, 208.0f, 80.0f);
        pathBuilder2.reflectiveCurveToRelative(-7.88f, 19.43f, -21.61f, 26.92f);
        pathBuilder2.curveTo(170.93f, 115.35f, 150.19f, 120.0f, 128.0f, 120.0f);
        pathBuilder2.reflectiveCurveToRelative(-42.93f, -4.65f, -58.39f, -13.08f);
        pathBuilder2.curveTo(55.88f, 99.43f, 48.0f, 89.62f, 48.0f, 80.0f);
        pathBuilder2.reflectiveCurveTo(55.88f, 60.57f, 69.61f, 53.08f);
        pathBuilder2.close();
        pathBuilder2.moveTo(186.39f, 202.92f);
        pathBuilder2.curveTo(170.93f, 211.35f, 150.19f, 216.0f, 128.0f, 216.0f);
        pathBuilder2.reflectiveCurveToRelative(-42.93f, -4.65f, -58.39f, -13.08f);
        pathBuilder2.curveTo(55.88f, 195.43f, 48.0f, 185.62f, 48.0f, 176.0f);
        pathBuilder2.lineTo(48.0f, 159.36f);
        pathBuilder2.curveToRelative(17.06f, 15.0f, 46.23f, 24.64f, 80.0f, 24.64f);
        pathBuilder2.reflectiveCurveToRelative(62.94f, -9.68f, 80.0f, -24.64f);
        pathBuilder2.lineTo(208.0f, 176.0f);
        pathBuilder2.curveTo(208.0f, 185.62f, 200.12f, 195.43f, 186.39f, 202.92f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _database = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
