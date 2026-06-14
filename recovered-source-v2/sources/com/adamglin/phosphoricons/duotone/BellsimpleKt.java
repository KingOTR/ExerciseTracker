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

/* compiled from: Bellsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BellSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBellSimple", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bellSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellsimpleKt {
    private static ImageVector _bellSimple;

    public static final ImageVector getBellSimple(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bellSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BellSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 192.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.88f, -12.0f);
        pathBuilder.curveTo(47.71f, 168.6f, 56.0f, 139.81f, 56.0f, 104.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 35.82f, 8.3f, 64.6f, 14.9f, 76.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 192.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(168.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(96.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(221.85f, 192.0f);
        pathBuilder2.arcTo(15.8f, 15.8f, 0.0f, false, true, 208.0f, 200.0f);
        pathBuilder2.lineTo(48.0f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.8f, -24.06f);
        pathBuilder2.curveTo(39.75f, 166.38f, 48.0f, 139.34f, 48.0f, 104.0f);
        pathBuilder2.arcToRelative(80.0f, 80.0f, 0.0f, true, true, 160.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, 35.33f, 8.26f, 62.38f, 13.81f, 71.94f);
        pathBuilder2.arcTo(15.89f, 15.89f, 0.0f, false, true, 221.84f, 192.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 184.0f);
        pathBuilder2.curveToRelative(-7.73f, -13.27f, -16.0f, -43.95f, -16.0f, -80.0f);
        pathBuilder2.arcToRelative(64.0f, 64.0f, 0.0f, true, false, -128.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, 36.06f, -8.28f, 66.74f, -16.0f, 80.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bellSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
