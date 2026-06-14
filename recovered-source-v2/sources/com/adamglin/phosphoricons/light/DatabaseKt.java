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

/* compiled from: Database.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Database", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDatabase", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_database", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatabaseKt {
    private static ImageVector _database;

    public static final ImageVector getDatabase(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.curveTo(75.29f, 26.0f, 34.0f, 49.72f, 34.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.curveToRelative(0.0f, 30.28f, 41.29f, 54.0f, 94.0f, 54.0f);
        pathBuilder.reflectiveCurveToRelative(94.0f, -23.72f, 94.0f, -54.0f);
        pathBuilder.lineTo(222.0f, 80.0f);
        pathBuilder.curveTo(222.0f, 49.72f, 180.71f, 26.0f, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 38.0f);
        pathBuilder.curveToRelative(44.45f, 0.0f, 82.0f, 19.23f, 82.0f, 42.0f);
        pathBuilder.reflectiveCurveToRelative(-37.55f, 42.0f, -82.0f, 42.0f);
        pathBuilder.reflectiveCurveTo(46.0f, 102.77f, 46.0f, 80.0f);
        pathBuilder.reflectiveCurveTo(83.55f, 38.0f, 128.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, 22.77f, -37.55f, 42.0f, -82.0f, 42.0f);
        pathBuilder.reflectiveCurveToRelative(-82.0f, -19.23f, -82.0f, -42.0f);
        pathBuilder.lineTo(46.0f, 154.79f);
        pathBuilder.curveTo(62.0f, 171.16f, 92.37f, 182.0f, 128.0f, 182.0f);
        pathBuilder.reflectiveCurveToRelative(66.0f, -10.84f, 82.0f, -27.21f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 22.77f, -37.55f, 42.0f, -82.0f, 42.0f);
        pathBuilder.reflectiveCurveToRelative(-82.0f, -19.23f, -82.0f, -42.0f);
        pathBuilder.lineTo(46.0f, 106.79f);
        pathBuilder.curveTo(62.0f, 123.16f, 92.37f, 134.0f, 128.0f, 134.0f);
        pathBuilder.reflectiveCurveToRelative(66.0f, -10.84f, 82.0f, -27.21f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _database = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
