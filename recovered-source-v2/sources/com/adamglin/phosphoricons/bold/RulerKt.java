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

/* compiled from: Ruler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ruler", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getRuler", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ruler", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RulerKt {
    private static ImageVector _ruler;

    public static final ImageVector getRuler(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _ruler;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ruler", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(238.15f, 70.54f);
        pathBuilder.lineTo(185.46f, 17.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.29f, 0.0f);
        pathBuilder.lineTo(17.85f, 157.17f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f);
        pathBuilder.lineToRelative(52.69f, 52.68f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f);
        pathBuilder.lineTo(238.15f, 98.83f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 238.15f, 70.54f);
        pathBuilder.close();
        pathBuilder.moveTo(84.68f, 218.34f);
        pathBuilder.lineToRelative(-47.0f, -47.0f);
        pathBuilder.lineTo(64.0f, 145.0f);
        pathBuilder.lineToRelative(23.52f, 23.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.lineTo(81.0f, 128.0f);
        pathBuilder.lineToRelative(15.0f, -15.0f);
        pathBuilder.lineToRelative(23.51f, 23.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.lineTo(113.0f, 96.0f);
        pathBuilder.lineToRelative(15.0f, -15.0f);
        pathBuilder.lineToRelative(23.52f, 23.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.lineTo(145.0f, 64.0f);
        pathBuilder.lineToRelative(26.35f, -26.34f);
        pathBuilder.lineToRelative(47.0f, 47.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ruler = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
