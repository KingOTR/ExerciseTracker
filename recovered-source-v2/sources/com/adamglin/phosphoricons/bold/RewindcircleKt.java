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

/* compiled from: Rewindcircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RewindCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getRewindCircle", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rewindCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewindcircleKt {
    private static ImageVector _rewindCircle;

    public static final ImageVector getRewindCircle(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _rewindCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("RewindCircle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f);
        pathBuilder.arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.5f, 9.37f);
        pathBuilder.lineTo(124.0f, 140.17f);
        pathBuilder.lineTo(124.0f, 160.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.5f, 9.37f);
        pathBuilder.lineToRelative(-40.0f, -32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -18.74f);
        pathBuilder.lineToRelative(40.0f, -32.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 124.0f, 96.0f);
        pathBuilder.verticalLineToRelative(19.83f);
        pathBuilder.lineToRelative(36.5f, -29.2f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rewindCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
