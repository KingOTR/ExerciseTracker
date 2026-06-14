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

/* compiled from: Bandaids.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bandaids", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBandaids", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bandaids", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BandaidsKt {
    private static ImageVector _bandaids;

    public static final ImageVector getBandaids(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bandaids;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bandaids", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(206.63f, 94.63f);
        pathBuilder.lineTo(173.25f, 128.0f);
        pathBuilder.lineTo(128.0f, 82.75f);
        pathBuilder.lineToRelative(33.37f, -33.38f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 45.26f, 45.26f);
        pathBuilder.close();
        pathBuilder.moveTo(49.37f, 161.37f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.26f, 45.26f);
        pathBuilder.lineTo(128.0f, 173.25f);
        pathBuilder.lineTo(82.75f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.75f, 128.0f);
        pathBuilder.lineTo(128.0f, 82.75f);
        pathBuilder.lineTo(94.63f, 49.37f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 49.37f, 94.63f);
        pathBuilder.close();
        pathBuilder.moveTo(173.25f, 128.0f);
        pathBuilder.lineTo(128.0f, 173.25f);
        pathBuilder.lineToRelative(33.37f, 33.38f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.26f, -45.26f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(184.57f, 128.0f);
        pathBuilder2.lineToRelative(27.71f, -27.72f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -56.56f, -56.56f);
        pathBuilder2.lineTo(128.0f, 71.43f);
        pathBuilder2.lineTo(100.28f, 43.72f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -56.56f, 56.56f);
        pathBuilder2.lineTo(71.43f, 128.0f);
        pathBuilder2.lineTo(43.72f, 155.72f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 56.56f, 56.56f);
        pathBuilder2.lineTo(128.0f, 184.57f);
        pathBuilder2.lineToRelative(27.72f, 27.71f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 56.56f, -56.56f);
        pathBuilder2.close();
        pathBuilder2.moveTo(167.0f, 55.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, true, true, 201.0f, 89.0f);
        pathBuilder2.lineToRelative(-27.72f, 27.72f);
        pathBuilder2.lineTo(139.31f, 82.75f);
        pathBuilder2.close();
        pathBuilder2.moveTo(161.91f, 128.0f);
        pathBuilder2.lineTo(128.0f, 161.94f);
        pathBuilder2.lineTo(94.06f, 128.0f);
        pathBuilder2.lineTo(128.0f, 94.06f);
        pathBuilder2.close();
        pathBuilder2.moveTo(55.0f, 89.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, true, true, 89.0f, 55.0f);
        pathBuilder2.lineToRelative(27.72f, 27.72f);
        pathBuilder2.lineTo(82.75f, 116.69f);
        pathBuilder2.close();
        pathBuilder2.moveTo(89.0f, 201.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, true, true, 55.0f, 167.0f);
        pathBuilder2.lineToRelative(27.72f, -27.72f);
        pathBuilder2.lineToRelative(33.94f, 33.94f);
        pathBuilder2.close();
        pathBuilder2.moveTo(201.0f, 201.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 167.0f, 201.0f);
        pathBuilder2.lineToRelative(-27.72f, -27.72f);
        pathBuilder2.lineToRelative(33.94f, -33.94f);
        pathBuilder2.lineTo(201.0f, 167.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 201.0f, 201.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(116.0f, 128.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bandaids = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
