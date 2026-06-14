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

/* compiled from: Maptrifold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapTrifold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMapTrifold", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapTrifold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaptrifoldKt {
    private static ImageVector _mapTrifold;

    public static final ImageVector getMapTrifold(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _mapTrifold;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapTrifold", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 72.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.lineTo(96.0f, 184.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(228.92f, 49.69f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.86f, -1.45f);
        pathBuilder2.lineTo(160.93f, 63.52f);
        pathBuilder2.lineTo(99.58f, 32.84f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.52f, -0.6f);
        pathBuilder2.lineToRelative(-64.0f, 16.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 56.0f);
        pathBuilder2.lineTo(24.0f, 200.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.94f, 7.76f);
        pathBuilder2.lineToRelative(61.13f, -15.28f);
        pathBuilder2.lineToRelative(61.35f, 30.68f);
        pathBuilder2.arcTo(8.15f, 8.15f, 0.0f, false, false, 160.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.94f, -0.24f);
        pathBuilder2.lineToRelative(64.0f, -16.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 200.0f);
        pathBuilder2.lineTo(232.0f, 56.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 228.92f, 49.69f);
        pathBuilder2.close();
        pathBuilder2.moveTo(104.0f, 52.94f);
        pathBuilder2.lineToRelative(48.0f, 24.0f);
        pathBuilder2.lineTo(152.0f, 203.06f);
        pathBuilder2.lineToRelative(-48.0f, -24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 62.25f);
        pathBuilder2.lineToRelative(48.0f, -12.0f);
        pathBuilder2.verticalLineToRelative(127.5f);
        pathBuilder2.lineToRelative(-48.0f, 12.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 193.75f);
        pathBuilder2.lineTo(168.0f, 205.75f);
        pathBuilder2.lineTo(168.0f, 78.25f);
        pathBuilder2.lineToRelative(48.0f, -12.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapTrifold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
