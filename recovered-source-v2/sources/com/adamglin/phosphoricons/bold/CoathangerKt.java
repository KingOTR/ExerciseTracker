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

/* compiled from: Coathanger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CoatHanger", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCoatHanger", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coatHanger", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoathangerKt {
    private static ImageVector _coatHanger;

    public static final ImageVector getCoatHanger(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _coatHanger;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CoatHanger", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(244.0f, 168.0f);
        pathBuilder.lineTo(148.0f, 96.0f);
        pathBuilder.lineToRelative(19.2f, -14.4f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 72.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -87.66f, -5.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.82f, 3.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 39.09f, -2.92f);
        pathBuilder.lineTo(121.0f, 86.24f);
        pathBuilder.curveToRelative(-0.15f, 0.1f, -0.29f, 0.21f, -0.43f, 0.32f);
        pathBuilder.lineTo(12.0f, 168.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.0f, 36.0f);
        pathBuilder.horizontalLineTo(232.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.0f, -36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 180.0f);
        pathBuilder.lineToRelative(92.0f, -69.0f);
        pathBuilder.lineToRelative(92.0f, 69.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coatHanger = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
