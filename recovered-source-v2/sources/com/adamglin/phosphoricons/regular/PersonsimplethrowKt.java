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

/* compiled from: Personsimplethrow.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleThrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPersonSimpleThrow", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleThrow", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplethrowKt {
    private static ImageVector _personSimpleThrow;

    public static final ImageVector getPersonSimpleThrow(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _personSimpleThrow;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleThrow", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 88.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, false, 96.0f, 56.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 96.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.24f, 110.61f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 211.0f, 111.87f);
        pathBuilder.curveToRelative(-1.15f, -0.89f, -23.71f, -17.7f, -59.32f, 0.61f);
        pathBuilder.arcToRelative(214.93f, 214.93f, 0.0f, false, true, -3.0f, 30.35f);
        pathBuilder.lineToRelative(32.43f, 27.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.47f, 8.68f);
        pathBuilder.lineToRelative(-16.0f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.18f, -5.06f);
        pathBuilder.lineToRelative(14.27f, -42.82f);
        pathBuilder.lineToRelative(-22.08f, -18.4f);
        pathBuilder.arcToRelative(141.86f, 141.86f, 0.0f, false, true, -5.1f, 14.33f);
        pathBuilder.curveToRelative(-13.75f, 32.74f, -38.38f, 54.63f, -73.2f, 65.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.6f, -15.32f);
        pathBuilder.curveToRelative(60.68f, -18.21f, 71.14f, -72.22f, 73.42f, -101.65f);
        pathBuilder.curveTo(108.0f, 139.88f, 86.57f, 144.0f, 72.36f, 144.0f);
        pathBuilder.arcToRelative(59.59f, 59.59f, 0.0f, false, true, -19.67f, -3.27f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 125.4f);
        pathBuilder.arcToRelative(7.82f, 7.82f, 0.0f, false, true, 3.31f, 0.73f);
        pathBuilder.reflectiveCurveToRelative(26.76f, 10.68f, 72.19f, -20.2f);
        pathBuilder.curveToRelative(52.29f, -35.54f, 88.0f, -7.77f, 89.51f, -6.57f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 222.24f, 110.61f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleThrow = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
