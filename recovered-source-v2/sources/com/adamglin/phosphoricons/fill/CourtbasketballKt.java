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

/* compiled from: Courtbasketball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CourtBasketball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCourtBasketball", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_courtBasketball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CourtbasketballKt {
    private static ImageVector _courtBasketball;

    public static final ImageVector getCourtBasketball(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _courtBasketball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CourtBasketball", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 92.23f);
        pathBuilder.verticalLineToRelative(71.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.41f, 4.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -79.52f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 240.0f, 92.23f);
        pathBuilder.close();
        pathBuilder.moveTo(20.41f, 167.76f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -79.52f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.41f, 4.0f);
        pathBuilder.verticalLineToRelative(71.54f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 20.41f, 167.76f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 48.0f);
        pathBuilder.lineTo(32.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 64.0f);
        pathBuilder.verticalLineToRelative(4.13f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, 4.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 0.0f, 111.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 4.0f);
        pathBuilder.lineTo(16.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(120.0f, 52.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 116.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.lineTo(140.0f, 48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.lineTo(136.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(84.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineToRelative(-4.13f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, -4.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 0.0f, -111.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, -4.0f);
        pathBuilder.lineTo(240.0f, 64.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _courtBasketball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
