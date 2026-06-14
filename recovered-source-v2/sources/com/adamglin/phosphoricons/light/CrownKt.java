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

/* compiled from: Crown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Crown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCrown", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crown", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrownKt {
    private static ImageVector _crown;

    public static final ImageVector getCrown(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _crown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Crown", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.0f, 80.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -46.6f, 15.84f);
        pathBuilder.lineToRelative(-29.83f, 36.72f);
        pathBuilder.lineToRelative(-26.0f, -59.76f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -31.16f, 0.0f);
        pathBuilder.lineToRelative(-26.0f, 59.76f);
        pathBuilder.lineTo(56.6f, 95.84f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -22.36f, 10.09f);
        pathBuilder.lineTo(49.0f, 194.3f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 62.78f, 206.0f);
        pathBuilder.horizontalLineTo(193.22f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 207.0f, 194.3f);
        pathBuilder.lineToRelative(14.73f, -88.37f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 246.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 38.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 128.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 80.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, true, true, 36.0f, 94.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 22.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(195.2f, 192.33f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.67f);
        pathBuilder.horizontalLineTo(62.78f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.67f);
        pathBuilder.lineTo(46.08f, 104.0f);
        pathBuilder.lineToRelative(1.22f, -0.55f);
        pathBuilder.lineToRelative(36.0f, 44.36f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 88.0f, 150.0f);
        pathBuilder.arcToRelative(5.52f, 5.52f, 0.0f, false, false, 0.81f, -0.06f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.69f, -3.55f);
        pathBuilder.lineToRelative(29.92f, -68.8f);
        pathBuilder.arcToRelative(25.79f, 25.79f, 0.0f, false, false, 9.16f, 0.0f);
        pathBuilder.lineToRelative(29.92f, 68.8f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.69f, 3.55f);
        pathBuilder.arcToRelative(5.52f, 5.52f, 0.0f, false, false, 0.81f, 0.06f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.66f, -2.22f);
        pathBuilder.lineToRelative(36.0f, -44.36f);
        pathBuilder.lineToRelative(1.22f, 0.55f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 94.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 220.0f, 94.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
