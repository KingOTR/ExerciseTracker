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

/* compiled from: Medal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Medal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMedal", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_medal", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MedalKt {
    private static ImageVector _medal;

    public static final ImageVector getMedal(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _medal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Medal", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.0f, 96.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, true, false, 68.0f, 165.69f);
        pathBuilder.lineTo(68.0f, 240.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.37f, 10.73f);
        pathBuilder.lineTo(128.0f, 229.42f);
        pathBuilder.lineToRelative(42.64f, 21.31f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 188.0f, 240.0f);
        pathBuilder.lineTo(188.0f, 165.69f);
        pathBuilder.arcTo(91.86f, 91.86f, 0.0f, false, false, 220.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 96.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, 68.0f);
        pathBuilder.arcTo(68.07f, 68.07f, 0.0f, false, true, 60.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 220.59f);
        pathBuilder.lineToRelative(-30.64f, -15.32f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f);
        pathBuilder.lineTo(92.0f, 220.58f);
        pathBuilder.lineTo(92.0f, 180.66f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, 72.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 148.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, true, false, 76.0f, 96.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, false, 128.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 68.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 68.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _medal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
