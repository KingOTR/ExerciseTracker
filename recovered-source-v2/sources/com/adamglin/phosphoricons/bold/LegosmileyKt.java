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

/* compiled from: Legosmiley.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LegoSmiley", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLegoSmiley", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_legoSmiley", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegosmileyKt {
    private static ImageVector _legoSmiley;

    public static final ImageVector getLegoSmiley(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _legoSmiley;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LegoSmiley", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(84.0f, 112.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 84.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 96.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 156.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(149.6f, 141.85f);
        pathBuilder.arcToRelative(41.0f, 41.0f, 0.0f, false, true, -43.2f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.8f, 20.3f);
        pathBuilder.arcToRelative(65.0f, 65.0f, 0.0f, false, false, 68.8f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.8f, -20.3f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 84.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(36.07f, 36.07f, 0.0f, false, true, -24.0f, 33.94f);
        pathBuilder.lineTo(196.0f, 224.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(80.0f, 244.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(60.0f, 205.94f);
        pathBuilder.arcTo(36.07f, 36.07f, 0.0f, false, true, 36.0f, 172.0f);
        pathBuilder.lineTo(36.0f, 84.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 72.0f, 48.0f);
        pathBuilder.lineTo(84.0f, 48.0f);
        pathBuilder.lineTo(84.0f, 32.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f);
        pathBuilder.lineTo(172.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 220.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.lineTo(148.0f, 36.0f);
        pathBuilder.lineTo(108.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 220.0f);
        pathBuilder.lineTo(172.0f, 208.0f);
        pathBuilder.lineTo(84.0f, 208.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(72.0f, 72.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 84.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(184.0f, 184.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _legoSmiley = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
