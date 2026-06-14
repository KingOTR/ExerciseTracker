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

/* compiled from: Bandaids.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bandaids", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBandaids", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bandaids", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BandaidsKt {
    private static ImageVector _bandaids;

    public static final ImageVector getBandaids(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(190.23f, 128.0f);
        pathBuilder.lineToRelative(24.88f, -24.89f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, -62.22f, -62.22f);
        pathBuilder.lineTo(128.0f, 65.77f);
        pathBuilder.lineTo(103.11f, 40.89f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, -62.22f, 62.22f);
        pathBuilder.lineTo(65.77f, 128.0f);
        pathBuilder.lineTo(40.89f, 152.89f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, 62.22f, 62.22f);
        pathBuilder.lineTo(128.0f, 190.23f);
        pathBuilder.lineToRelative(24.89f, 24.88f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, 62.22f, -62.22f);
        pathBuilder.close();
        pathBuilder.moveTo(169.86f, 57.86f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 28.28f, 28.28f);
        pathBuilder.lineTo(173.25f, 111.0f);
        pathBuilder.lineTo(145.0f, 82.75f);
        pathBuilder.close();
        pathBuilder.moveTo(156.28f, 128.0f);
        pathBuilder.lineTo(128.0f, 156.28f);
        pathBuilder.lineTo(99.72f, 128.0f);
        pathBuilder.lineTo(128.0f, 99.72f);
        pathBuilder.close();
        pathBuilder.moveTo(57.86f, 86.14f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, true, true, 86.14f, 57.86f);
        pathBuilder.lineTo(111.0f, 82.75f);
        pathBuilder.lineTo(82.75f, 111.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.14f, 198.14f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -28.28f, -28.28f);
        pathBuilder.lineTo(82.75f, 145.0f);
        pathBuilder.lineTo(111.0f, 173.25f);
        pathBuilder.close();
        pathBuilder.moveTo(198.14f, 198.14f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.28f, 0.0f);
        pathBuilder.lineTo(145.0f, 173.25f);
        pathBuilder.lineTo(173.25f, 145.0f);
        pathBuilder.lineToRelative(24.89f, 24.89f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 28.28f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bandaids = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
