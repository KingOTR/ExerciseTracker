package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bandaids.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bandaids", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBandaids", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bandaids", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BandaidsKt {
    private static ImageVector _bandaids;

    public static final ImageVector getBandaids(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(178.91f, 128.0f);
        pathBuilder.lineToRelative(30.55f, -30.54f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.92f, -50.92f);
        pathBuilder.lineTo(128.0f, 77.09f);
        pathBuilder.lineTo(97.46f, 46.54f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 46.54f, 97.46f);
        pathBuilder.lineTo(77.09f, 128.0f);
        pathBuilder.lineTo(46.54f, 158.54f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 50.92f, 50.92f);
        pathBuilder.lineTo(128.0f, 178.91f);
        pathBuilder.lineToRelative(30.54f, 30.55f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 50.92f, -50.92f);
        pathBuilder.close();
        pathBuilder.moveTo(164.2f, 52.2f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 39.6f, 39.6f);
        pathBuilder.lineToRelative(-30.55f, 30.54f);
        pathBuilder.lineTo(133.66f, 82.75f);
        pathBuilder.close();
        pathBuilder.moveTo(167.6f, 128.0f);
        pathBuilder.lineTo(128.0f, 167.6f);
        pathBuilder.lineTo(88.4f, 128.0f);
        pathBuilder.lineTo(128.0f, 88.4f);
        pathBuilder.close();
        pathBuilder.moveTo(52.2f, 91.8f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 91.8f, 52.2f);
        pathBuilder.lineToRelative(30.54f, 30.55f);
        pathBuilder.lineTo(82.75f, 122.34f);
        pathBuilder.close();
        pathBuilder.moveTo(91.8f, 203.8f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.6f, -39.6f);
        pathBuilder.lineToRelative(30.55f, -30.54f);
        pathBuilder.lineToRelative(39.59f, 39.59f);
        pathBuilder.close();
        pathBuilder.moveTo(203.8f, 203.8f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.6f, 0.0f);
        pathBuilder.lineToRelative(-30.54f, -30.55f);
        pathBuilder.lineToRelative(39.59f, -39.59f);
        pathBuilder.lineTo(203.8f, 164.2f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 39.6f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bandaids = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
