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

/* compiled from: Globehemispherewest.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeHemisphereWest", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGlobeHemisphereWest", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeHemisphereWest", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobehemispherewestKt {
    private static ImageVector _globeHemisphereWest;

    public static final ImageVector getGlobeHemisphereWest(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _globeHemisphereWest;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeHemisphereWest", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 128.0f);
        pathBuilder.arcToRelative(87.62f, 87.62f, 0.0f, false, true, -6.4f, 32.94f);
        pathBuilder.lineToRelative(-44.7f, -27.49f);
        pathBuilder.arcToRelative(15.92f, 15.92f, 0.0f, false, false, -6.24f, -2.23f);
        pathBuilder.lineToRelative(-22.82f, -3.08f);
        pathBuilder.arcToRelative(16.11f, 16.11f, 0.0f, false, false, -16.0f, 7.86f);
        pathBuilder.horizontalLineToRelative(-8.72f);
        pathBuilder.lineToRelative(-3.8f, -7.86f);
        pathBuilder.arcToRelative(15.91f, 15.91f, 0.0f, false, false, -11.0f, -8.67f);
        pathBuilder.lineToRelative(-8.0f, -1.73f);
        pathBuilder.lineTo(96.14f, 104.0f);
        pathBuilder.horizontalLineToRelative(16.71f);
        pathBuilder.arcToRelative(16.06f, 16.06f, 0.0f, false, false, 7.73f, -2.0f);
        pathBuilder.lineToRelative(12.25f, -6.76f);
        pathBuilder.arcToRelative(16.62f, 16.62f, 0.0f, false, false, 3.0f, -2.14f);
        pathBuilder.lineToRelative(26.91f, -24.34f);
        pathBuilder.arcTo(15.93f, 15.93f, 0.0f, false, false, 166.0f, 49.1f);
        pathBuilder.lineToRelative(-0.36f, -0.65f);
        pathBuilder.arcTo(88.11f, 88.11f, 0.0f, false, true, 216.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 128.0f);
        pathBuilder.arcToRelative(87.53f, 87.53f, 0.0f, false, true, 8.54f, -37.8f);
        pathBuilder.lineToRelative(11.34f, 30.27f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.62f, 10.0f);
        pathBuilder.lineToRelative(21.43f, 4.61f);
        pathBuilder.lineTo(96.74f, 143.0f);
        pathBuilder.arcToRelative(16.09f, 16.09f, 0.0f, false, false, 14.4f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.48f);
        pathBuilder.lineToRelative(-7.23f, 16.23f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 2.86f, 17.37f);
        pathBuilder.lineToRelative(0.14f, 0.14f);
        pathBuilder.lineTo(128.0f, 205.94f);
        pathBuilder.lineToRelative(-1.94f, 10.0f);
        pathBuilder.arcTo(88.11f, 88.11f, 0.0f, false, true, 40.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeHemisphereWest = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
