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

/* compiled from: Onigiri.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Onigiri", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getOnigiri", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_onigiri", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnigiriKt {
    private static ImageVector _onigiri;

    public static final ImageVector getOnigiri(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _onigiri;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Onigiri", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.11f, 148.63f);
        pathBuilder.lineToRelative(-55.88f, -96.0f);
        pathBuilder.lineToRelative(-0.06f, -0.09f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, -88.34f, 0.0f);
        pathBuilder.lineToRelative(-0.06f, 0.09f);
        pathBuilder.lineToRelative(-55.88f, 96.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 72.09f, 228.0f);
        pathBuilder.lineTo(183.91f, 228.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 44.2f, -79.37f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 220.0f);
        pathBuilder.lineTo(92.0f, 220.0f);
        pathBuilder.lineTo(92.0f, 168.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.36f, 197.39f);
        pathBuilder.arcTo(43.43f, 43.43f, 0.0f, false, true, 183.91f, 220.0f);
        pathBuilder.lineTo(172.0f, 220.0f);
        pathBuilder.lineTo(172.0f, 168.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(96.0f, 156.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.lineTo(72.09f, 220.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -37.37f, -67.2f);
        pathBuilder.arcToRelative(0.31f, 0.31f, 0.0f, false, true, 0.05f, -0.1f);
        pathBuilder.lineTo(90.65f, 56.75f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 74.7f, 0.0f);
        pathBuilder.lineToRelative(55.88f, 95.95f);
        pathBuilder.arcToRelative(0.31f, 0.31f, 0.0f, false, true, 0.05f, 0.1f);
        pathBuilder.arcTo(43.43f, 43.43f, 0.0f, false, true, 222.35f, 197.39f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _onigiri = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
