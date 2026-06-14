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

/* compiled from: Personsimplehike.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleHike", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPersonSimpleHike", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleHike", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimplehikeKt {
    private static ImageVector _personSimpleHike;

    public static final ImageVector getPersonSimpleHike(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _personSimpleHike;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleHike", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(120.0f, 48.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 120.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 136.0f);
        pathBuilder.curveToRelative(-23.37f, 0.0f, -28.92f, -8.56f, -36.6f, -20.4f);
        pathBuilder.curveToRelative(-3.65f, -5.64f, -7.79f, -12.0f, -14.16f, -17.55f);
        pathBuilder.arcToRelative(40.92f, 40.92f, 0.0f, false, false, -8.0f, -5.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, 3.92f);
        pathBuilder.lineTo(64.66f, 228.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.15f, 10.52f);
        pathBuilder.arcTo(7.84f, 7.84f, 0.0f, false, false, 72.0f, 240.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.34f, -4.81f);
        pathBuilder.lineToRelative(33.59f, -77.27f);
        pathBuilder.lineTo(144.0f, 180.12f);
        pathBuilder.lineTo(144.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(160.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.35f, -6.51f);
        pathBuilder.lineToRelative(-37.2f, -26.57f);
        pathBuilder.lineToRelative(13.4f, -30.81f);
        pathBuilder.curveToRelative(3.57f, 3.62f, 6.28f, 7.8f, 9.13f, 12.19f);
        pathBuilder.curveToRelative(7.67f, 11.84f, 16.27f, 25.11f, 42.0f, 27.36f);
        pathBuilder.lineTo(183.98f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(199.98f, 144.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.36f, -4.85f);
        pathBuilder.lineToRelative(24.0f, -56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.2f, -10.5f);
        pathBuilder.lineToRelative(-28.0f, -12.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.5f, 4.2f);
        pathBuilder.lineToRelative(-24.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 10.5f);
        pathBuilder.lineToRelative(28.0f, 12.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleHike = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
