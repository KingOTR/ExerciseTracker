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

/* compiled from: Mappinplus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMapPinPlus", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinPlus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinplusKt {
    private static ImageVector _mapPinPlus;

    public static final ImageVector getMapPinPlus(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _mapPinPlus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapPinPlus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 72.0f, -80.0f, 128.0f, -80.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(48.0f, 176.0f, 48.0f, 104.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, true, 160.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 16.0f);
        pathBuilder2.arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, 88.0f);
        pathBuilder2.curveToRelative(0.0f, 31.4f, 14.51f, 64.68f, 42.0f, 96.25f);
        pathBuilder2.arcToRelative(254.19f, 254.19f, 0.0f, false, false, 41.45f, 38.3f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.18f, 0.0f);
        pathBuilder2.arcTo(254.19f, 254.19f, 0.0f, false, false, 174.0f, 200.25f);
        pathBuilder2.curveToRelative(27.45f, -31.57f, 42.0f, -64.85f, 42.0f, -96.25f);
        pathBuilder2.arcTo(88.1f, 88.1f, 0.0f, false, false, 128.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 222.0f);
        pathBuilder2.curveToRelative(-16.53f, -13.0f, -72.0f, -60.75f, -72.0f, -118.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f);
        pathBuilder2.curveTo(200.0f, 161.23f, 144.53f, 209.0f, 128.0f, 222.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(168.0f, 104.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(136.0f, 112.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(120.0f, 112.0f);
        pathBuilder2.lineTo(96.0f, 112.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(24.0f);
        pathBuilder2.lineTo(120.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.lineTo(136.0f, 96.0f);
        pathBuilder2.horizontalLineToRelative(24.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 104.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinPlus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
