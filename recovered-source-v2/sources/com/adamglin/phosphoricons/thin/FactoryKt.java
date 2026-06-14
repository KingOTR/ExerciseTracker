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

/* compiled from: Factory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Factory", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFactory", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_factory", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FactoryKt {
    private static ImageVector _factory;

    public static final ImageVector getFactory(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _factory;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Factory", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(112.0f, 176.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(80.0f, 180.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 112.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 172.0f);
        pathBuilder.lineTo(148.0f, 172.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(24.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(36.0f, 212.0f);
        pathBuilder.lineTo(36.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.4f, -3.2f);
        pathBuilder.lineTo(100.0f, 128.0f);
        pathBuilder.lineTo(100.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.4f, -3.2f);
        pathBuilder.lineToRelative(44.14f, 33.11f);
        pathBuilder.lineTo(163.06f, 30.3f);
        pathBuilder.arcTo(12.06f, 12.06f, 0.0f, false, true, 174.94f, 20.0f);
        pathBuilder.horizontalLineToRelative(18.12f);
        pathBuilder.arcToRelative(12.06f, 12.06f, 0.0f, false, true, 11.88f, 10.3f);
        pathBuilder.lineToRelative(15.0f, 105.13f);
        pathBuilder.arcToRelative(3.64f, 3.64f, 0.0f, false, true, 0.0f, 0.57f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(157.84f, 123.38f);
        pathBuilder.lineTo(169.33f, 132.0f);
        pathBuilder.horizontalLineToRelative(42.06f);
        pathBuilder.lineTo(197.0f, 31.43f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.43f);
        pathBuilder.lineTo(174.94f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 3.43f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 212.0f);
        pathBuilder.lineTo(212.0f, 212.0f);
        pathBuilder.lineTo(212.0f, 140.0f);
        pathBuilder.lineTo(168.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.4f, -0.8f);
        pathBuilder.lineTo(108.0f, 96.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.4f, 3.2f);
        pathBuilder.lineTo(44.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _factory = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
