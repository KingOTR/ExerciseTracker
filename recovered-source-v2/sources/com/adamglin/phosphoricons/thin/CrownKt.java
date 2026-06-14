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

/* compiled from: Crown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Crown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCrown", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crown", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrownKt {
    private static ImageVector _crown;

    public static final ImageVector getCrown(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(244.0f, 80.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, -42.0f, 15.83f);
        pathBuilder.lineTo(169.0f, 136.37f);
        pathBuilder.lineTo(141.1f, 72.09f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, -26.2f, 0.0f);
        pathBuilder.lineTo(87.0f, 136.37f);
        pathBuilder.lineTo(54.0f, 95.83f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 35.94f, 104.0f);
        pathBuilder.lineToRelative(15.0f, 90.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.84f, 10.0f);
        pathBuilder.horizontalLineTo(193.22f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.84f, -10.0f);
        pathBuilder.lineToRelative(15.0f, -90.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 244.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 80.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, true, 36.0f, 96.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 20.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(197.17f, 192.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.95f, 3.34f);
        pathBuilder.horizontalLineTo(62.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.34f);
        pathBuilder.lineToRelative(-15.0f, -90.0f);
        pathBuilder.arcToRelative(23.41f, 23.41f, 0.0f, false, false, 4.0f, -1.8f);
        pathBuilder.lineTo(84.9f, 146.52f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 88.0f, 148.0f);
        pathBuilder.arcToRelative(3.27f, 3.27f, 0.0f, false, false, 0.54f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.13f, -2.37f);
        pathBuilder.lineToRelative(30.56f, -70.3f);
        pathBuilder.arcToRelative(23.8f, 23.8f, 0.0f, false, false, 11.54f, 0.0f);
        pathBuilder.lineToRelative(30.56f, 70.3f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.13f, 2.37f);
        pathBuilder.arcToRelative(3.27f, 3.27f, 0.0f, false, false, 0.54f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.1f, -1.48f);
        pathBuilder.lineToRelative(37.09f, -45.64f);
        pathBuilder.arcToRelative(23.41f, 23.41f, 0.0f, false, false, 4.0f, 1.8f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 96.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 220.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
