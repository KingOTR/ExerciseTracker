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

/* compiled from: Lightning.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lightning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLightning", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightning", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningKt {
    private static ImageVector _lightning;

    public static final ImageVector getLightning(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _lightning;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lightning", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(219.71f, 117.38f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.25f, -8.52f);
        pathBuilder.lineTo(161.28f, 88.39f);
        pathBuilder.lineToRelative(10.59f, -70.61f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.64f, -10.0f);
        pathBuilder.lineToRelative(-112.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.31f, 19.33f);
        pathBuilder.lineToRelative(51.18f, 20.47f);
        pathBuilder.lineTo(84.13f, 238.22f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.64f, 10.0f);
        pathBuilder.lineToRelative(112.0f, -120.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 219.71f, 117.38f);
        pathBuilder.close();
        pathBuilder.moveTo(113.6f, 203.55f);
        pathBuilder.lineToRelative(6.27f, -41.77f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.41f, -12.92f);
        pathBuilder.lineTo(68.74f, 131.37f);
        pathBuilder.lineTo(142.4f, 52.45f);
        pathBuilder.lineToRelative(-6.27f, 41.77f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.41f, 12.92f);
        pathBuilder.lineToRelative(43.72f, 17.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
