package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Ruler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ruler", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getRuler", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ruler", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RulerKt {
    private static ImageVector _ruler;

    public static final ImageVector getRuler(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(233.91f, 74.79f);
        pathBuilder.lineTo(181.22f, 22.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineTo(22.09f, 161.41f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f);
        pathBuilder.lineTo(74.78f, 233.9f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f);
        pathBuilder.lineTo(233.91f, 94.59f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 233.91f, 74.79f);
        pathBuilder.close();
        pathBuilder.moveTo(225.42f, 86.1f);
        pathBuilder.lineTo(86.1f, 225.41f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f);
        pathBuilder.lineTo(30.58f, 172.73f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f);
        pathBuilder.lineTo(64.0f, 136.48f);
        pathBuilder.lineToRelative(27.76f, 27.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, -8.48f);
        pathBuilder.lineTo(72.48f, 128.0f);
        pathBuilder.lineTo(96.0f, 104.48f);
        pathBuilder.lineToRelative(27.76f, 27.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.lineTo(104.48f, 96.0f);
        pathBuilder.lineTo(128.0f, 72.49f);
        pathBuilder.lineToRelative(27.76f, 27.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.lineTo(136.49f, 64.0f);
        pathBuilder.lineTo(169.9f, 30.59f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f);
        pathBuilder.lineToRelative(52.69f, 52.68f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 225.42f, 86.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ruler = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
